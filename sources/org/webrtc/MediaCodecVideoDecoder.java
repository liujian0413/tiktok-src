package org.webrtc;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.view.Surface;
import com.p280ss.android.medialib.camera.ImageFrame;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.nio.ByteBuffer;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase.Context;
import org.webrtc.VideoFrame.Buffer;

public class MediaCodecVideoDecoder {
    private static int codecErrors;
    private static EglBase eglBase;
    private static MediaCodecVideoDecoderErrorCallback errorCallback;
    private static Set<String> hwDecoderDisabledTypes = new HashSet();
    private static MediaCodecVideoDecoder runningInstance;
    private static final List<Integer> supportedColorList = Arrays.asList(new Integer[]{Integer.valueOf(19), Integer.valueOf(21), Integer.valueOf(2141391872), Integer.valueOf(2141391873), Integer.valueOf(2141391874), Integer.valueOf(2141391875), Integer.valueOf(2141391876)});
    private static final String[] supportedVp9HwCodecPrefixes = {"OMX.qcom.", "OMX.Exynos."};
    private int colorFormat;
    private final Queue<TimeStamps> decodeStartTimeMs = new ArrayDeque();
    private final Queue<DecodedOutputBuffer> dequeuedSurfaceOutputBuffers = new ArrayDeque();
    private int droppedFrames;
    private boolean hasDecodedFirstFrame;
    private int height;
    private ByteBuffer[] inputBuffers;
    public MediaCodec mediaCodec;
    private Thread mediaCodecThread;
    private ByteBuffer[] outputBuffers;
    private int sliceHeight;
    private int stride;
    private Surface surface;
    private TextureListener textureListener;
    private int width;

    static class DecodedOutputBuffer {
        public final long decodeTimeMs;
        public final long endDecodeTimeMs;
        public final int index;
        public final long ntpTimeStampMs;
        private final int offset;
        public final long presentationTimeStampMs;
        private final int size;
        public final long timeStampMs;

        /* access modifiers changed from: 0000 */
        public long getDecodeTimeMs() {
            return this.decodeTimeMs;
        }

        /* access modifiers changed from: 0000 */
        public int getIndex() {
            return this.index;
        }

        /* access modifiers changed from: 0000 */
        public long getNtpTimestampMs() {
            return this.ntpTimeStampMs;
        }

        /* access modifiers changed from: 0000 */
        public int getOffset() {
            return this.offset;
        }

        /* access modifiers changed from: 0000 */
        public long getPresentationTimestampMs() {
            return this.presentationTimeStampMs;
        }

        /* access modifiers changed from: 0000 */
        public int getSize() {
            return this.size;
        }

        /* access modifiers changed from: 0000 */
        public long getTimestampMs() {
            return this.timeStampMs;
        }

        public DecodedOutputBuffer(int i, int i2, int i3, long j, long j2, long j3, long j4, long j5) {
            this.index = i;
            this.offset = i2;
            this.size = i3;
            this.presentationTimeStampMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j3;
            this.decodeTimeMs = j4;
            this.endDecodeTimeMs = j5;
        }
    }

    static class DecodedTextureBuffer {
        private final long decodeTimeMs;
        private final long frameDelayMs;
        private final long ntpTimeStampMs;
        private final long presentationTimeStampMs;
        private final long timeStampMs;
        private final Buffer videoFrameBuffer;

        /* access modifiers changed from: 0000 */
        public long getDecodeTimeMs() {
            return this.decodeTimeMs;
        }

        /* access modifiers changed from: 0000 */
        public long getFrameDelayMs() {
            return this.frameDelayMs;
        }

        /* access modifiers changed from: 0000 */
        public long getNtpTimestampMs() {
            return this.ntpTimeStampMs;
        }

        /* access modifiers changed from: 0000 */
        public long getPresentationTimestampMs() {
            return this.presentationTimeStampMs;
        }

        /* access modifiers changed from: 0000 */
        public long getTimeStampMs() {
            return this.timeStampMs;
        }

        /* access modifiers changed from: 0000 */
        public Buffer getVideoFrameBuffer() {
            return this.videoFrameBuffer;
        }

        public DecodedTextureBuffer(Buffer buffer, long j, long j2, long j3, long j4, long j5) {
            this.videoFrameBuffer = buffer;
            this.presentationTimeStampMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j3;
            this.decodeTimeMs = j4;
            this.frameDelayMs = j5;
        }
    }

    static class DecoderProperties {
        public final String codecName;
        public final int colorFormat;

        public DecoderProperties(String str, int i) {
            this.codecName = str;
            this.colorFormat = i;
        }
    }

    static class HwDecoderFactory implements VideoDecoderFactory {
        private final VideoCodecInfo[] supportedHardwareCodecs = getSupportedHardwareCodecs();

        public VideoDecoder createDecoder(String str) {
            return VideoDecoderFactory$$CC.createDecoder((VideoDecoderFactory) this, str);
        }

        public VideoCodecInfo[] getSupportedCodecs() {
            return this.supportedHardwareCodecs;
        }

        HwDecoderFactory() {
        }

        private static VideoCodecInfo[] getSupportedHardwareCodecs() {
            ArrayList arrayList = new ArrayList();
            if (MediaCodecVideoDecoder.isVp8HwSupported()) {
                Logging.m150047d("MediaCodecVideoDecoder", "VP8 HW Decoder supported.");
                arrayList.add(new VideoCodecInfo("VP8", new HashMap()));
            }
            if (MediaCodecVideoDecoder.isVp9HwSupported()) {
                Logging.m150047d("MediaCodecVideoDecoder", "VP9 HW Decoder supported.");
                arrayList.add(new VideoCodecInfo("VP9", new HashMap()));
            }
            if (MediaCodecVideoDecoder.isH264HighProfileHwSupported()) {
                Logging.m150047d("MediaCodecVideoDecoder", "H.264 High Profile HW Decoder supported.");
                arrayList.add(H264Utils.DEFAULT_H264_HIGH_PROFILE_CODEC);
            }
            if (MediaCodecVideoDecoder.isH264HwSupported()) {
                Logging.m150047d("MediaCodecVideoDecoder", "H.264 HW Decoder supported.");
                arrayList.add(H264Utils.DEFAULT_H264_BASELINE_PROFILE_CODEC);
            }
            return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
        }

        public VideoDecoder createDecoder(final VideoCodecInfo videoCodecInfo) {
            if (!isCodecSupported(this.supportedHardwareCodecs, videoCodecInfo)) {
                StringBuilder sb = new StringBuilder("No HW video decoder for codec ");
                sb.append(videoCodecInfo.name);
                Logging.m150047d("MediaCodecVideoDecoder", sb.toString());
                return null;
            }
            StringBuilder sb2 = new StringBuilder("Create HW video decoder for ");
            sb2.append(videoCodecInfo.name);
            Logging.m150047d("MediaCodecVideoDecoder", sb2.toString());
            return new WrappedNativeVideoDecoder() {
                public long createNativeVideoDecoder() {
                    return MediaCodecVideoDecoder.nativeCreateDecoder(videoCodecInfo.name, MediaCodecVideoDecoder.useSurface());
                }
            };
        }

        private static boolean isCodecSupported(VideoCodecInfo[] videoCodecInfoArr, VideoCodecInfo videoCodecInfo) {
            for (VideoCodecInfo isSameCodec : videoCodecInfoArr) {
                if (isSameCodec(isSameCodec, videoCodecInfo)) {
                    return true;
                }
            }
            return false;
        }

        private static boolean isSameCodec(VideoCodecInfo videoCodecInfo, VideoCodecInfo videoCodecInfo2) {
            if (!videoCodecInfo.name.equalsIgnoreCase(videoCodecInfo2.name)) {
                return false;
            }
            if (videoCodecInfo.name.equalsIgnoreCase("H264")) {
                return H264Utils.isSameH264Profile(videoCodecInfo.params, videoCodecInfo2.params);
            }
            return true;
        }
    }

    public interface MediaCodecVideoDecoderErrorCallback {
        void onMediaCodecVideoDecoderCriticalError(int i);
    }

    class TextureListener implements VideoSink {
        private DecodedOutputBuffer bufferToRender;
        private final Object newFrameLock = new Object();
        private DecodedTextureBuffer renderedBuffer;
        private final SurfaceTextureHelper surfaceTextureHelper;

        public boolean isWaitingForTexture() {
            boolean z;
            synchronized (this.newFrameLock) {
                if (this.bufferToRender != null) {
                    z = true;
                } else {
                    z = false;
                }
            }
            return z;
        }

        public void release() {
            this.surfaceTextureHelper.stopListening();
            synchronized (this.newFrameLock) {
                if (this.renderedBuffer != null) {
                    this.renderedBuffer.getVideoFrameBuffer().release();
                    this.renderedBuffer = null;
                }
            }
            this.surfaceTextureHelper.dispose();
        }

        public void addBufferToRender(DecodedOutputBuffer decodedOutputBuffer) {
            if (this.bufferToRender == null) {
                this.bufferToRender = decodedOutputBuffer;
            } else {
                Logging.m150048e("MediaCodecVideoDecoder", "Unexpected addBufferToRender() called while waiting for a texture.");
                throw new IllegalStateException("Waiting for a texture.");
            }
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(4:8|9|10|11) */
        /* JADX WARNING: Missing exception handler attribute for start block: B:10:0x0016 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public org.webrtc.MediaCodecVideoDecoder.DecodedTextureBuffer dequeueTextureBuffer(int r5) {
            /*
                r4 = this;
                java.lang.Object r0 = r4.newFrameLock
                monitor-enter(r0)
                org.webrtc.MediaCodecVideoDecoder$DecodedTextureBuffer r1 = r4.renderedBuffer     // Catch:{ all -> 0x0024 }
                if (r1 != 0) goto L_0x001d
                if (r5 <= 0) goto L_0x001d
                boolean r1 = r4.isWaitingForTexture()     // Catch:{ all -> 0x0024 }
                if (r1 == 0) goto L_0x001d
                java.lang.Object r1 = r4.newFrameLock     // Catch:{ InterruptedException -> 0x0016 }
                long r2 = (long) r5     // Catch:{ InterruptedException -> 0x0016 }
                r1.wait(r2)     // Catch:{ InterruptedException -> 0x0016 }
                goto L_0x001d
            L_0x0016:
                java.lang.Thread r5 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x0024 }
                r5.interrupt()     // Catch:{ all -> 0x0024 }
            L_0x001d:
                org.webrtc.MediaCodecVideoDecoder$DecodedTextureBuffer r5 = r4.renderedBuffer     // Catch:{ all -> 0x0024 }
                r1 = 0
                r4.renderedBuffer = r1     // Catch:{ all -> 0x0024 }
                monitor-exit(r0)     // Catch:{ all -> 0x0024 }
                return r5
            L_0x0024:
                r5 = move-exception
                monitor-exit(r0)     // Catch:{ all -> 0x0024 }
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: org.webrtc.MediaCodecVideoDecoder.TextureListener.dequeueTextureBuffer(int):org.webrtc.MediaCodecVideoDecoder$DecodedTextureBuffer");
        }

        public void onFrame(VideoFrame videoFrame) {
            Object obj;
            Object obj2 = this.newFrameLock;
            synchronized (obj2) {
                try {
                    if (this.renderedBuffer == null) {
                        Buffer buffer = videoFrame.getBuffer();
                        buffer.retain();
                        obj = obj2;
                        try {
                            DecodedTextureBuffer decodedTextureBuffer = new DecodedTextureBuffer(buffer, this.bufferToRender.presentationTimeStampMs, this.bufferToRender.timeStampMs, this.bufferToRender.ntpTimeStampMs, this.bufferToRender.decodeTimeMs, SystemClock.elapsedRealtime() - this.bufferToRender.endDecodeTimeMs);
                            this.renderedBuffer = decodedTextureBuffer;
                            this.bufferToRender = null;
                            this.newFrameLock.notifyAll();
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    } else {
                        Object obj3 = obj2;
                        Logging.m150048e("MediaCodecVideoDecoder", "Unexpected onFrame() called while already holding a texture.");
                        throw new IllegalStateException("Already holding a texture.");
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj = obj2;
                    throw th;
                }
            }
        }

        public void setSize(int i, int i2) {
            this.surfaceTextureHelper.setTextureSize(i, i2);
        }

        public TextureListener(SurfaceTextureHelper surfaceTextureHelper2) {
            this.surfaceTextureHelper = surfaceTextureHelper2;
            surfaceTextureHelper2.startListening(this);
        }
    }

    static class TimeStamps {
        public final long decodeStartTimeMs;
        public final long ntpTimeStampMs;
        public final long timeStampMs;

        public TimeStamps(long j, long j2, long j3) {
            this.decodeStartTimeMs = j;
            this.timeStampMs = j2;
            this.ntpTimeStampMs = j3;
        }
    }

    public enum VideoCodecType {
        VIDEO_CODEC_UNKNOWN,
        VIDEO_CODEC_VP8,
        VIDEO_CODEC_VP9,
        VIDEO_CODEC_H264;

        static VideoCodecType fromNativeIndex(int i) {
            return values()[i];
        }
    }

    public static native long nativeCreateDecoder(String str, boolean z);

    /* access modifiers changed from: 0000 */
    public int getColorFormat() {
        return this.colorFormat;
    }

    /* access modifiers changed from: 0000 */
    public int getHeight() {
        return this.height;
    }

    /* access modifiers changed from: 0000 */
    public ByteBuffer[] getInputBuffers() {
        return this.inputBuffers;
    }

    /* access modifiers changed from: 0000 */
    public ByteBuffer[] getOutputBuffers() {
        return this.outputBuffers;
    }

    /* access modifiers changed from: 0000 */
    public int getSliceHeight() {
        return this.sliceHeight;
    }

    /* access modifiers changed from: 0000 */
    public int getStride() {
        return this.stride;
    }

    /* access modifiers changed from: 0000 */
    public int getWidth() {
        return this.width;
    }

    static boolean useSurface() {
        if (eglBase != null) {
            return true;
        }
        return false;
    }

    public static void disableH264HwCodec() {
        Logging.m150051w("MediaCodecVideoDecoder", "H.264 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/avc");
    }

    public static void disableVp8HwCodec() {
        Logging.m150051w("MediaCodecVideoDecoder", "VP8 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/x-vnd.on2.vp8");
    }

    public static void disableVp9HwCodec() {
        Logging.m150051w("MediaCodecVideoDecoder", "VP9 decoding is disabled by application.");
        hwDecoderDisabledTypes.add("video/x-vnd.on2.vp9");
    }

    public static void disposeEglContext() {
        if (eglBase != null) {
            eglBase.release();
            eglBase = null;
        }
    }

    MediaCodecVideoDecoder() {
    }

    private int dequeueInputBuffer() {
        checkOnMediaCodecThread();
        try {
            return this.mediaCodec.dequeueInputBuffer(500000);
        } catch (IllegalStateException e) {
            Logging.m150049e("MediaCodecVideoDecoder", "dequeueIntputBuffer failed", e);
            return -2;
        }
    }

    public static boolean isH264HwSupported() {
        if (hwDecoderDisabledTypes.contains("video/avc") || findDecoder("video/avc", supportedH264HwCodecPrefixes()) == null) {
            return false;
        }
        return true;
    }

    public static boolean isVp8HwSupported() {
        if (hwDecoderDisabledTypes.contains("video/x-vnd.on2.vp8") || findDecoder("video/x-vnd.on2.vp8", supportedVp8HwCodecPrefixes()) == null) {
            return false;
        }
        return true;
    }

    public static boolean isVp9HwSupported() {
        if (hwDecoderDisabledTypes.contains("video/x-vnd.on2.vp9") || findDecoder("video/x-vnd.on2.vp9", supportedVp9HwCodecPrefixes) == null) {
            return false;
        }
        return true;
    }

    private void MaybeRenderDecodedTextureBuffer() {
        if (!this.dequeuedSurfaceOutputBuffers.isEmpty() && !this.textureListener.isWaitingForTexture()) {
            DecodedOutputBuffer decodedOutputBuffer = (DecodedOutputBuffer) this.dequeuedSurfaceOutputBuffers.remove();
            this.textureListener.addBufferToRender(decodedOutputBuffer);
            this.mediaCodec.releaseOutputBuffer(decodedOutputBuffer.index, true);
        }
    }

    private void checkOnMediaCodecThread() throws IllegalStateException {
        if (this.mediaCodecThread.getId() != Thread.currentThread().getId()) {
            StringBuilder sb = new StringBuilder("MediaCodecVideoDecoder previously operated on ");
            sb.append(this.mediaCodecThread);
            sb.append(" but is now called on ");
            sb.append(Thread.currentThread());
            throw new IllegalStateException(sb.toString());
        }
    }

    public static void printStackTrace() {
        if (runningInstance != null && runningInstance.mediaCodecThread != null) {
            StackTraceElement[] stackTrace = runningInstance.mediaCodecThread.getStackTrace();
            if (stackTrace.length > 0) {
                Logging.m150047d("MediaCodecVideoDecoder", "MediaCodecVideoDecoder stacks trace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    Logging.m150047d("MediaCodecVideoDecoder", stackTraceElement.toString());
                }
            }
        }
    }

    private static final String[] supportedH264HwCodecPrefixes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("OMX.qcom.");
        arrayList.add("OMX.Intel.");
        arrayList.add("OMX.Exynos.");
        if (PeerConnectionFactory.fieldTrialsFindFullName("WebRTC-MediaTekH264").equals("Enabled") && VERSION.SDK_INT >= 27) {
            arrayList.add("OMX.MTK.");
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    private static final String[] supportedVp8HwCodecPrefixes() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("OMX.qcom.");
        arrayList.add("OMX.Nvidia.");
        arrayList.add("OMX.Exynos.");
        arrayList.add("OMX.Intel.");
        if (PeerConnectionFactory.fieldTrialsFindFullName("WebRTC-MediaTekVP8").equals("Enabled") && VERSION.SDK_INT >= 24) {
            arrayList.add("OMX.MTK.");
        }
        return (String[]) arrayList.toArray(new String[arrayList.size()]);
    }

    public static boolean isH264HighProfileHwSupported() {
        if (hwDecoderDisabledTypes.contains("video/avc")) {
            return false;
        }
        if (VERSION.SDK_INT >= 21) {
            if (findDecoder("video/avc", new String[]{"OMX.qcom."}) != null) {
                return true;
            }
        }
        if (VERSION.SDK_INT >= 23) {
            if (findDecoder("video/avc", new String[]{"OMX.Exynos."}) != null) {
                return true;
            }
        }
        if (PeerConnectionFactory.fieldTrialsFindFullName("WebRTC-MediaTekH264").equals("Enabled") && VERSION.SDK_INT >= 27) {
            if (findDecoder("video/avc", new String[]{"OMX.MTK."}) != null) {
                return true;
            }
        }
        return false;
    }

    private void release() {
        StringBuilder sb = new StringBuilder("Java releaseDecoder. Total number of dropped frames: ");
        sb.append(this.droppedFrames);
        Logging.m150047d("MediaCodecVideoDecoder", sb.toString());
        checkOnMediaCodecThread();
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        new Thread(new Runnable() {
            public void run() {
                try {
                    Logging.m150047d("MediaCodecVideoDecoder", "Java releaseDecoder on release thread");
                    MediaCodecVideoDecoder.this.mediaCodec.stop();
                    MediaCodecVideoDecoder.this.mediaCodec.release();
                    Logging.m150047d("MediaCodecVideoDecoder", "Java releaseDecoder on release thread done");
                } catch (Exception e) {
                    Logging.m150049e("MediaCodecVideoDecoder", "Media decoder release failed", e);
                }
                countDownLatch.countDown();
            }
        }).start();
        if (!ThreadUtils.awaitUninterruptibly(countDownLatch, DouPlusShareGuideExperiment.MIN_VALID_DURATION)) {
            Logging.m150048e("MediaCodecVideoDecoder", "Media decoder release timeout");
            codecErrors++;
            if (errorCallback != null) {
                StringBuilder sb2 = new StringBuilder("Invoke codec error callback. Errors: ");
                sb2.append(codecErrors);
                Logging.m150048e("MediaCodecVideoDecoder", sb2.toString());
                errorCallback.onMediaCodecVideoDecoderCriticalError(codecErrors);
            }
        }
        this.mediaCodec = null;
        this.mediaCodecThread = null;
        runningInstance = null;
        if (useSurface()) {
            this.surface.release();
            this.surface = null;
            this.textureListener.release();
        }
        Logging.m150047d("MediaCodecVideoDecoder", "Java releaseDecoder done");
    }

    public static void setErrorCallback(MediaCodecVideoDecoderErrorCallback mediaCodecVideoDecoderErrorCallback) {
        Logging.m150047d("MediaCodecVideoDecoder", "Set error callback");
        errorCallback = mediaCodecVideoDecoderErrorCallback;
    }

    private void returnDecodedOutputBuffer(int i) throws IllegalStateException, CodecException {
        checkOnMediaCodecThread();
        if (!useSurface()) {
            this.mediaCodec.releaseOutputBuffer(i, false);
            return;
        }
        throw new IllegalStateException("returnDecodedOutputBuffer() called for surface decoding.");
    }

    public static void setEglContext(Context context) {
        if (eglBase != null) {
            Logging.m150051w("MediaCodecVideoDecoder", "Egl context already set.");
            eglBase.release();
        }
        eglBase = EglBase$$CC.create$$STATIC$$(context);
    }

    private DecodedTextureBuffer dequeueTextureBuffer(int i) {
        int i2 = i;
        checkOnMediaCodecThread();
        if (useSurface()) {
            DecodedOutputBuffer dequeueOutputBuffer = dequeueOutputBuffer(i);
            if (dequeueOutputBuffer != null) {
                this.dequeuedSurfaceOutputBuffers.add(dequeueOutputBuffer);
            }
            MaybeRenderDecodedTextureBuffer();
            DecodedTextureBuffer dequeueTextureBuffer = this.textureListener.dequeueTextureBuffer(i2);
            if (dequeueTextureBuffer != null) {
                MaybeRenderDecodedTextureBuffer();
                return dequeueTextureBuffer;
            } else if (this.dequeuedSurfaceOutputBuffers.size() < Math.min(3, this.outputBuffers.length) && (i2 <= 0 || this.dequeuedSurfaceOutputBuffers.isEmpty())) {
                return null;
            } else {
                this.droppedFrames++;
                DecodedOutputBuffer decodedOutputBuffer = (DecodedOutputBuffer) this.dequeuedSurfaceOutputBuffers.remove();
                if (i2 > 0) {
                    StringBuilder sb = new StringBuilder("Draining decoder. Dropping frame with TS: ");
                    sb.append(decodedOutputBuffer.presentationTimeStampMs);
                    sb.append(". Total number of dropped frames: ");
                    sb.append(this.droppedFrames);
                    Logging.m150051w("MediaCodecVideoDecoder", sb.toString());
                } else {
                    StringBuilder sb2 = new StringBuilder("Too many output buffers ");
                    sb2.append(this.dequeuedSurfaceOutputBuffers.size());
                    sb2.append(". Dropping frame with TS: ");
                    sb2.append(decodedOutputBuffer.presentationTimeStampMs);
                    sb2.append(". Total number of dropped frames: ");
                    sb2.append(this.droppedFrames);
                    Logging.m150051w("MediaCodecVideoDecoder", sb2.toString());
                }
                this.mediaCodec.releaseOutputBuffer(decodedOutputBuffer.index, false);
                DecodedTextureBuffer decodedTextureBuffer = new DecodedTextureBuffer(null, decodedOutputBuffer.presentationTimeStampMs, decodedOutputBuffer.timeStampMs, decodedOutputBuffer.ntpTimeStampMs, decodedOutputBuffer.decodeTimeMs, SystemClock.elapsedRealtime() - decodedOutputBuffer.endDecodeTimeMs);
                return decodedTextureBuffer;
            }
        } else {
            throw new IllegalStateException("dequeueTexture() called for byte buffer decoding.");
        }
    }

    private DecodedOutputBuffer dequeueOutputBuffer(int i) {
        long j;
        int i2;
        int i3;
        checkOnMediaCodecThread();
        if (this.decodeStartTimeMs.isEmpty()) {
            return null;
        }
        BufferInfo bufferInfo = new BufferInfo();
        while (true) {
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, TimeUnit.MILLISECONDS.toMicros((long) i));
            switch (dequeueOutputBuffer) {
                case ImageFrame.NV21 /*-3*/:
                    this.outputBuffers = this.mediaCodec.getOutputBuffers();
                    StringBuilder sb = new StringBuilder("Decoder output buffers changed: ");
                    sb.append(this.outputBuffers.length);
                    Logging.m150047d("MediaCodecVideoDecoder", sb.toString());
                    if (!this.hasDecodedFirstFrame) {
                        break;
                    } else {
                        throw new RuntimeException("Unexpected output buffer change event.");
                    }
                case -2:
                    MediaFormat outputFormat = this.mediaCodec.getOutputFormat();
                    StringBuilder sb2 = new StringBuilder("Decoder format changed: ");
                    sb2.append(outputFormat.toString());
                    Logging.m150047d("MediaCodecVideoDecoder", sb2.toString());
                    if (!outputFormat.containsKey("crop-left") || !outputFormat.containsKey("crop-right") || !outputFormat.containsKey("crop-bottom") || !outputFormat.containsKey("crop-top")) {
                        i3 = outputFormat.getInteger("width");
                        i2 = outputFormat.getInteger("height");
                    } else {
                        i3 = (outputFormat.getInteger("crop-right") + 1) - outputFormat.getInteger("crop-left");
                        i2 = (outputFormat.getInteger("crop-bottom") + 1) - outputFormat.getInteger("crop-top");
                    }
                    if (!this.hasDecodedFirstFrame || (i3 == this.width && i2 == this.height)) {
                        this.width = i3;
                        this.height = i2;
                        if (this.textureListener != null) {
                            this.textureListener.setSize(this.width, this.height);
                        }
                        if (!useSurface() && outputFormat.containsKey("color-format")) {
                            this.colorFormat = outputFormat.getInteger("color-format");
                            StringBuilder sb3 = new StringBuilder("Color: 0x");
                            sb3.append(Integer.toHexString(this.colorFormat));
                            Logging.m150047d("MediaCodecVideoDecoder", sb3.toString());
                            if (!supportedColorList.contains(Integer.valueOf(this.colorFormat))) {
                                StringBuilder sb4 = new StringBuilder("Non supported color format: ");
                                sb4.append(this.colorFormat);
                                throw new IllegalStateException(sb4.toString());
                            }
                        }
                        if (outputFormat.containsKey("stride")) {
                            this.stride = outputFormat.getInteger("stride");
                        }
                        if (outputFormat.containsKey("slice-height")) {
                            this.sliceHeight = outputFormat.getInteger("slice-height");
                        }
                        StringBuilder sb5 = new StringBuilder("Frame stride and slice height: ");
                        sb5.append(this.stride);
                        sb5.append(" x ");
                        sb5.append(this.sliceHeight);
                        Logging.m150047d("MediaCodecVideoDecoder", sb5.toString());
                        this.stride = Math.max(this.width, this.stride);
                        this.sliceHeight = Math.max(this.height, this.sliceHeight);
                        break;
                    }
                    break;
                case -1:
                    return null;
                default:
                    this.hasDecodedFirstFrame = true;
                    TimeStamps timeStamps = (TimeStamps) this.decodeStartTimeMs.remove();
                    long elapsedRealtime = SystemClock.elapsedRealtime() - timeStamps.decodeStartTimeMs;
                    if (elapsedRealtime > 200) {
                        StringBuilder sb6 = new StringBuilder("Very high decode time: ");
                        sb6.append(elapsedRealtime);
                        sb6.append("ms. Q size: ");
                        sb6.append(this.decodeStartTimeMs.size());
                        sb6.append(". Might be caused by resuming H264 decoding after a pause.");
                        Logging.m150048e("MediaCodecVideoDecoder", sb6.toString());
                        j = 200;
                    } else {
                        j = elapsedRealtime;
                    }
                    DecodedOutputBuffer decodedOutputBuffer = new DecodedOutputBuffer(dequeueOutputBuffer, bufferInfo.offset, bufferInfo.size, TimeUnit.MICROSECONDS.toMillis(bufferInfo.presentationTimeUs), timeStamps.timeStampMs, timeStamps.ntpTimeStampMs, j, SystemClock.elapsedRealtime());
                    return decodedOutputBuffer;
            }
        }
        StringBuilder sb7 = new StringBuilder("Unexpected size change. Configured ");
        sb7.append(this.width);
        sb7.append("*");
        sb7.append(this.height);
        sb7.append(". New ");
        sb7.append(i3);
        sb7.append("*");
        sb7.append(i2);
        throw new RuntimeException(sb7.toString());
    }

    private void reset(int i, int i2) {
        if (this.mediaCodecThread == null || this.mediaCodec == null) {
            throw new RuntimeException("Incorrect reset call for non-initialized decoder.");
        }
        StringBuilder sb = new StringBuilder("Java reset: ");
        sb.append(i);
        sb.append(" x ");
        sb.append(i2);
        Logging.m150047d("MediaCodecVideoDecoder", sb.toString());
        this.mediaCodec.flush();
        this.width = i;
        this.height = i2;
        if (this.textureListener != null) {
            this.textureListener.setSize(i, i2);
        }
        this.decodeStartTimeMs.clear();
        this.dequeuedSurfaceOutputBuffers.clear();
        this.hasDecodedFirstFrame = false;
        this.droppedFrames = 0;
    }

    private static DecoderProperties findDecoder(String str, String[] strArr) {
        MediaCodecInfo mediaCodecInfo;
        String str2;
        boolean z;
        int[] iArr;
        if (VERSION.SDK_INT < 19) {
            return null;
        }
        StringBuilder sb = new StringBuilder("Trying to find HW decoder for mime ");
        sb.append(str);
        Logging.m150047d("MediaCodecVideoDecoder", sb.toString());
        for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
            try {
                mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
            } catch (IllegalArgumentException e) {
                Logging.m150049e("MediaCodecVideoDecoder", "Cannot retrieve decoder codec info", e);
                mediaCodecInfo = null;
            }
            if (mediaCodecInfo != null && !mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                int length = supportedTypes.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        str2 = null;
                        break;
                    } else if (supportedTypes[i2].equals(str)) {
                        str2 = mediaCodecInfo.getName();
                        break;
                    } else {
                        i2++;
                    }
                }
                if (str2 != null) {
                    StringBuilder sb2 = new StringBuilder("Found candidate decoder ");
                    sb2.append(str2);
                    Logging.m150047d("MediaCodecVideoDecoder", sb2.toString());
                    int length2 = strArr.length;
                    int i3 = 0;
                    while (true) {
                        if (i3 >= length2) {
                            z = false;
                            break;
                        } else if (str2.startsWith(strArr[i3])) {
                            z = true;
                            break;
                        } else {
                            i3++;
                        }
                    }
                    if (z) {
                        try {
                            CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                            for (int i4 : capabilitiesForType.colorFormats) {
                                StringBuilder sb3 = new StringBuilder("   Color: 0x");
                                sb3.append(Integer.toHexString(i4));
                                Logging.m150050v("MediaCodecVideoDecoder", sb3.toString());
                            }
                            for (Integer intValue : supportedColorList) {
                                int intValue2 = intValue.intValue();
                                int[] iArr2 = capabilitiesForType.colorFormats;
                                int length3 = iArr2.length;
                                int i5 = 0;
                                while (true) {
                                    if (i5 < length3) {
                                        int i6 = iArr2[i5];
                                        if (i6 == intValue2) {
                                            StringBuilder sb4 = new StringBuilder("Found target decoder ");
                                            sb4.append(str2);
                                            sb4.append(". Color: 0x");
                                            sb4.append(Integer.toHexString(i6));
                                            Logging.m150047d("MediaCodecVideoDecoder", sb4.toString());
                                            return new DecoderProperties(str2, i6);
                                        }
                                        i5++;
                                    }
                                }
                            }
                            continue;
                        } catch (IllegalArgumentException e2) {
                            Logging.m150049e("MediaCodecVideoDecoder", "Cannot retrieve decoder capabilities", e2);
                        }
                    } else {
                        continue;
                    }
                } else {
                    continue;
                }
            }
        }
        StringBuilder sb5 = new StringBuilder("No HW decoder found for mime ");
        sb5.append(str);
        Logging.m150047d("MediaCodecVideoDecoder", sb5.toString());
        return null;
    }

    private boolean initDecode(VideoCodecType videoCodecType, int i, int i2) {
        String[] strArr;
        String str;
        if (this.mediaCodecThread == null) {
            if (videoCodecType == VideoCodecType.VIDEO_CODEC_VP8) {
                str = "video/x-vnd.on2.vp8";
                strArr = supportedVp8HwCodecPrefixes();
            } else if (videoCodecType == VideoCodecType.VIDEO_CODEC_VP9) {
                str = "video/x-vnd.on2.vp9";
                strArr = supportedVp9HwCodecPrefixes;
            } else if (videoCodecType == VideoCodecType.VIDEO_CODEC_H264) {
                str = "video/avc";
                strArr = supportedH264HwCodecPrefixes();
            } else {
                StringBuilder sb = new StringBuilder("initDecode: Non-supported codec ");
                sb.append(videoCodecType);
                throw new RuntimeException(sb.toString());
            }
            DecoderProperties findDecoder = findDecoder(str, strArr);
            if (findDecoder != null) {
                StringBuilder sb2 = new StringBuilder("Java initDecode: ");
                sb2.append(videoCodecType);
                sb2.append(" : ");
                sb2.append(i);
                sb2.append(" x ");
                sb2.append(i2);
                sb2.append(". Color: 0x");
                sb2.append(Integer.toHexString(findDecoder.colorFormat));
                sb2.append(". Use Surface: ");
                sb2.append(useSurface());
                Logging.m150047d("MediaCodecVideoDecoder", sb2.toString());
                runningInstance = this;
                this.mediaCodecThread = Thread.currentThread();
                try {
                    this.width = i;
                    this.height = i2;
                    this.stride = i;
                    this.sliceHeight = i2;
                    if (useSurface()) {
                        SurfaceTextureHelper create = SurfaceTextureHelper.create("Decoder SurfaceTextureHelper", eglBase.getEglBaseContext());
                        if (create != null) {
                            this.textureListener = new TextureListener(create);
                            this.textureListener.setSize(i, i2);
                            this.surface = new Surface(create.getSurfaceTexture());
                        }
                    }
                    MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, i, i2);
                    if (!useSurface()) {
                        createVideoFormat.setInteger("color-format", findDecoder.colorFormat);
                    }
                    StringBuilder sb3 = new StringBuilder("  Format: ");
                    sb3.append(createVideoFormat);
                    Logging.m150047d("MediaCodecVideoDecoder", sb3.toString());
                    this.mediaCodec = MediaCodecVideoEncoder.createByCodecName(findDecoder.codecName);
                    if (this.mediaCodec == null) {
                        Logging.m150048e("MediaCodecVideoDecoder", "Can not create media decoder");
                        return false;
                    }
                    this.mediaCodec.configure(createVideoFormat, this.surface, null, 0);
                    this.mediaCodec.start();
                    this.colorFormat = findDecoder.colorFormat;
                    this.outputBuffers = this.mediaCodec.getOutputBuffers();
                    this.inputBuffers = this.mediaCodec.getInputBuffers();
                    this.decodeStartTimeMs.clear();
                    this.hasDecodedFirstFrame = false;
                    this.dequeuedSurfaceOutputBuffers.clear();
                    this.droppedFrames = 0;
                    StringBuilder sb4 = new StringBuilder("Input buffers: ");
                    sb4.append(this.inputBuffers.length);
                    sb4.append(". Output buffers: ");
                    sb4.append(this.outputBuffers.length);
                    Logging.m150047d("MediaCodecVideoDecoder", sb4.toString());
                    return true;
                } catch (IllegalStateException e) {
                    Logging.m150049e("MediaCodecVideoDecoder", "initDecode failed", e);
                    return false;
                }
            } else {
                StringBuilder sb5 = new StringBuilder("Cannot find HW decoder for ");
                sb5.append(videoCodecType);
                throw new RuntimeException(sb5.toString());
            }
        } else {
            throw new RuntimeException("initDecode: Forgot to release()?");
        }
    }

    private boolean queueInputBuffer(int i, int i2, long j, long j2, long j3) {
        checkOnMediaCodecThread();
        try {
            this.inputBuffers[i].position(0);
            this.inputBuffers[i].limit(i2);
            Queue<TimeStamps> queue = this.decodeStartTimeMs;
            TimeStamps timeStamps = new TimeStamps(SystemClock.elapsedRealtime(), j2, j3);
            queue.add(timeStamps);
            this.mediaCodec.queueInputBuffer(i, 0, i2, j, 0);
            return true;
        } catch (IllegalStateException e) {
            Logging.m150049e("MediaCodecVideoDecoder", "decode failed", e);
            return false;
        }
    }
}
