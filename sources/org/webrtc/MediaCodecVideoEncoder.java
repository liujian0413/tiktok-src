package org.webrtc;

import android.graphics.Matrix;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import android.opengl.GLES20;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Surface;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase.Context;
import org.webrtc.VideoFrame.Buffer;
import org.webrtc.VideoFrame.I420Buffer;
import org.webrtc.VideoFrame.TextureBuffer;

public class MediaCodecVideoEncoder {
    private static final String[] H264_HW_EXCEPTION_MODELS = {"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4"};
    private static int codecErrors;
    private static MediaCodecVideoEncoderErrorCallback errorCallback;
    private static final MediaCodecProperties exynosH264HighProfileHwProperties = new MediaCodecProperties("OMX.Exynos.", 23, BitrateAdjustmentType.FRAMERATE_ADJUSTMENT);
    private static final MediaCodecProperties exynosH264HwProperties = new MediaCodecProperties("OMX.Exynos.", 21, BitrateAdjustmentType.FRAMERATE_ADJUSTMENT);
    private static final MediaCodecProperties exynosVp8HwProperties = new MediaCodecProperties("OMX.Exynos.", 23, BitrateAdjustmentType.DYNAMIC_ADJUSTMENT);
    private static final MediaCodecProperties exynosVp9HwProperties = new MediaCodecProperties("OMX.Exynos.", 24, BitrateAdjustmentType.FRAMERATE_ADJUSTMENT);
    private static final MediaCodecProperties[] h264HighProfileHwList = {exynosH264HighProfileHwProperties};
    private static Set<String> hwEncoderDisabledTypes = new HashSet();
    private static final MediaCodecProperties intelVp8HwProperties = new MediaCodecProperties("OMX.Intel.", 21, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties mediatekH264HwProperties = new MediaCodecProperties("OMX.MTK.", 27, BitrateAdjustmentType.FRAMERATE_ADJUSTMENT);
    private static final MediaCodecProperties qcomH264HwProperties = new MediaCodecProperties("OMX.qcom.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties qcomVp8HwProperties = new MediaCodecProperties("OMX.qcom.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties qcomVp9HwProperties = new MediaCodecProperties("OMX.qcom.", 24, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static MediaCodecVideoEncoder runningInstance;
    public static EglBase staticEglBase;
    private static final int[] supportedColorList = {19, 21, 2141391872, 2141391876};
    private static final int[] supportedSurfaceColorList = {2130708361};
    private static final MediaCodecProperties[] vp9HwList = {qcomVp9HwProperties, exynosVp9HwProperties};
    private double bitrateAccumulator;
    private double bitrateAccumulatorMax;
    private int bitrateAdjustmentScaleExp;
    private BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
    private double bitrateObservationTimeMs;
    private int colorFormat;
    private ByteBuffer configData;
    private GlRectDrawer drawer;
    private EglBase14 eglBase;
    private long forcedKeyFrameMs;
    private int height;
    private Surface inputSurface;
    private long lastKeyFrameMs;
    public MediaCodec mediaCodec;
    private Thread mediaCodecThread;
    private ByteBuffer[] outputBuffers;
    private int profile;
    private int targetBitrateBps;
    private int targetFps;
    private VideoCodecType type;
    private int width;

    public enum BitrateAdjustmentType {
        NO_ADJUSTMENT,
        FRAMERATE_ADJUSTMENT,
        DYNAMIC_ADJUSTMENT
    }

    public static class EncoderProperties {
        public final BitrateAdjustmentType bitrateAdjustmentType;
        public final String codecName;
        public final int colorFormat;

        public EncoderProperties(String str, int i, BitrateAdjustmentType bitrateAdjustmentType2) {
            this.codecName = str;
            this.colorFormat = i;
            this.bitrateAdjustmentType = bitrateAdjustmentType2;
        }
    }

    public enum H264Profile {
        CONSTRAINED_BASELINE(0),
        BASELINE(1),
        MAIN(2),
        CONSTRAINED_HIGH(3),
        HIGH(4);
        
        private final int value;

        public final int getValue() {
            return this.value;
        }

        private H264Profile(int i) {
            this.value = i;
        }
    }

    static class HwEncoderFactory implements VideoEncoderFactory {
        private final VideoCodecInfo[] supportedHardwareCodecs = getSupportedHardwareCodecs();

        public VideoCodecInfo[] getSupportedCodecs() {
            return this.supportedHardwareCodecs;
        }

        HwEncoderFactory() {
        }

        private static VideoCodecInfo[] getSupportedHardwareCodecs() {
            ArrayList arrayList = new ArrayList();
            if (MediaCodecVideoEncoder.isVp8HwSupported()) {
                Logging.m150047d("MediaCodecVideoEncoder", "VP8 HW Encoder supported.");
                arrayList.add(new VideoCodecInfo("VP8", new HashMap()));
            }
            if (MediaCodecVideoEncoder.isVp9HwSupported()) {
                Logging.m150047d("MediaCodecVideoEncoder", "VP9 HW Encoder supported.");
                arrayList.add(new VideoCodecInfo("VP9", new HashMap()));
            }
            if (MediaCodecVideoDecoder.isH264HighProfileHwSupported()) {
                Logging.m150047d("MediaCodecVideoEncoder", "H.264 High Profile HW Encoder supported.");
                arrayList.add(H264Utils.DEFAULT_H264_HIGH_PROFILE_CODEC);
            }
            if (MediaCodecVideoEncoder.isH264HwSupported()) {
                Logging.m150047d("MediaCodecVideoEncoder", "H.264 HW Encoder supported.");
                arrayList.add(H264Utils.DEFAULT_H264_BASELINE_PROFILE_CODEC);
            }
            return (VideoCodecInfo[]) arrayList.toArray(new VideoCodecInfo[arrayList.size()]);
        }

        public VideoEncoder createEncoder(final VideoCodecInfo videoCodecInfo) {
            if (!isCodecSupported(this.supportedHardwareCodecs, videoCodecInfo)) {
                StringBuilder sb = new StringBuilder("No HW video encoder for codec ");
                sb.append(videoCodecInfo.name);
                Logging.m150047d("MediaCodecVideoEncoder", sb.toString());
                return null;
            }
            StringBuilder sb2 = new StringBuilder("Create HW video encoder for ");
            sb2.append(videoCodecInfo.name);
            Logging.m150047d("MediaCodecVideoEncoder", sb2.toString());
            return new WrappedNativeVideoEncoder() {
                public boolean isHardwareEncoder() {
                    return true;
                }

                public long createNativeVideoEncoder() {
                    return MediaCodecVideoEncoder.nativeCreateEncoder(videoCodecInfo, MediaCodecVideoEncoder.staticEglBase instanceof EglBase14);
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

    static class MediaCodecProperties {
        public final BitrateAdjustmentType bitrateAdjustmentType;
        public final String codecPrefix;
        public final int minSdk;

        MediaCodecProperties(String str, int i, BitrateAdjustmentType bitrateAdjustmentType2) {
            this.codecPrefix = str;
            this.minSdk = i;
            this.bitrateAdjustmentType = bitrateAdjustmentType2;
        }
    }

    public interface MediaCodecVideoEncoderErrorCallback {
        void onMediaCodecVideoEncoderCriticalError(int i);
    }

    static class OutputBufferInfo {
        public final ByteBuffer buffer;
        public final int index;
        public final boolean isKeyFrame;
        public final long presentationTimestampUs;

        /* access modifiers changed from: 0000 */
        public ByteBuffer getBuffer() {
            return this.buffer;
        }

        /* access modifiers changed from: 0000 */
        public int getIndex() {
            return this.index;
        }

        /* access modifiers changed from: 0000 */
        public long getPresentationTimestampUs() {
            return this.presentationTimestampUs;
        }

        /* access modifiers changed from: 0000 */
        public boolean isKeyFrame() {
            return this.isKeyFrame;
        }

        public OutputBufferInfo(int i, ByteBuffer byteBuffer, boolean z, long j) {
            this.index = i;
            this.buffer = byteBuffer;
            this.isKeyFrame = z;
            this.presentationTimestampUs = j;
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

    public static native long nativeCreateEncoder(VideoCodecInfo videoCodecInfo, boolean z);

    private static native void nativeFillInputBuffer(long j, int i, ByteBuffer byteBuffer, int i2, ByteBuffer byteBuffer2, int i3, ByteBuffer byteBuffer3, int i4);

    /* access modifiers changed from: 0000 */
    public int getColorFormat() {
        return this.colorFormat;
    }

    MediaCodecVideoEncoder() {
    }

    public static void disableH264HwCodec() {
        Logging.m150051w("MediaCodecVideoEncoder", "H.264 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/avc");
    }

    public static void disableVp8HwCodec() {
        Logging.m150051w("MediaCodecVideoEncoder", "VP8 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp8");
    }

    public static void disableVp9HwCodec() {
        Logging.m150051w("MediaCodecVideoEncoder", "VP9 encoding is disabled by application.");
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp9");
    }

    public static void disposeEglContext() {
        if (staticEglBase != null) {
            staticEglBase.release();
            staticEglBase = null;
        }
    }

    static Context getEglContext() {
        if (staticEglBase == null) {
            return null;
        }
        return staticEglBase.getEglBaseContext();
    }

    public static boolean isH264HighProfileHwSupported() {
        if (hwEncoderDisabledTypes.contains("video/avc") || findHwEncoder("video/avc", h264HighProfileHwList, supportedColorList) == null) {
            return false;
        }
        return true;
    }

    public static boolean isH264HwSupported() {
        if (hwEncoderDisabledTypes.contains("video/avc") || findHwEncoder("video/avc", h264HwList(), supportedColorList) == null) {
            return false;
        }
        return true;
    }

    public static boolean isH264HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/avc") || findHwEncoder("video/avc", h264HwList(), supportedSurfaceColorList) == null) {
            return false;
        }
        return true;
    }

    public static boolean isVp8HwSupported() {
        if (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp8") || findHwEncoder("video/x-vnd.on2.vp8", vp8HwList(), supportedColorList) == null) {
            return false;
        }
        return true;
    }

    public static boolean isVp8HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp8") || findHwEncoder("video/x-vnd.on2.vp8", vp8HwList(), supportedSurfaceColorList) == null) {
            return false;
        }
        return true;
    }

    public static boolean isVp9HwSupported() {
        if (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp9") || findHwEncoder("video/x-vnd.on2.vp9", vp9HwList, supportedColorList) == null) {
            return false;
        }
        return true;
    }

    public static boolean isVp9HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp9") || findHwEncoder("video/x-vnd.on2.vp9", vp9HwList, supportedSurfaceColorList) == null) {
            return false;
        }
        return true;
    }

    public static EncoderProperties vp8HwEncoderProperties() {
        if (hwEncoderDisabledTypes.contains("video/x-vnd.on2.vp8")) {
            return null;
        }
        return findHwEncoder("video/x-vnd.on2.vp8", vp8HwList(), supportedColorList);
    }

    /* access modifiers changed from: 0000 */
    public int dequeueInputBuffer() {
        checkOnMediaCodecThread();
        try {
            return this.mediaCodec.dequeueInputBuffer(0);
        } catch (IllegalStateException e) {
            Logging.m150049e("MediaCodecVideoEncoder", "dequeueIntputBuffer failed", e);
            return -2;
        }
    }

    /* access modifiers changed from: 0000 */
    public ByteBuffer[] getInputBuffers() {
        ByteBuffer[] inputBuffers = this.mediaCodec.getInputBuffers();
        StringBuilder sb = new StringBuilder("Input buffers: ");
        sb.append(inputBuffers.length);
        Logging.m150047d("MediaCodecVideoEncoder", sb.toString());
        return inputBuffers;
    }

    private void checkOnMediaCodecThread() {
        if (this.mediaCodecThread.getId() != Thread.currentThread().getId()) {
            StringBuilder sb = new StringBuilder("MediaCodecVideoEncoder previously operated on ");
            sb.append(this.mediaCodecThread);
            sb.append(" but is now called on ");
            sb.append(Thread.currentThread());
            throw new RuntimeException(sb.toString());
        }
    }

    private static final MediaCodecProperties[] h264HwList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(qcomH264HwProperties);
        arrayList.add(exynosH264HwProperties);
        if (PeerConnectionFactory.fieldTrialsFindFullName("WebRTC-MediaTekH264").equals("Enabled")) {
            arrayList.add(mediatekH264HwProperties);
        }
        return (MediaCodecProperties[]) arrayList.toArray(new MediaCodecProperties[arrayList.size()]);
    }

    public static void printStackTrace() {
        if (runningInstance != null && runningInstance.mediaCodecThread != null) {
            StackTraceElement[] stackTrace = runningInstance.mediaCodecThread.getStackTrace();
            if (stackTrace.length > 0) {
                Logging.m150047d("MediaCodecVideoEncoder", "MediaCodecVideoEncoder stacks trace:");
                for (StackTraceElement stackTraceElement : stackTrace) {
                    Logging.m150047d("MediaCodecVideoEncoder", stackTraceElement.toString());
                }
            }
        }
    }

    private static MediaCodecProperties[] vp8HwList() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(qcomVp8HwProperties);
        arrayList.add(exynosVp8HwProperties);
        if (PeerConnectionFactory.fieldTrialsFindFullName("WebRTC-IntelVP8").equals("Enabled")) {
            arrayList.add(intelVp8HwProperties);
        }
        return (MediaCodecProperties[]) arrayList.toArray(new MediaCodecProperties[arrayList.size()]);
    }

    /* access modifiers changed from: 0000 */
    public void release() {
        Logging.m150047d("MediaCodecVideoEncoder", "Java releaseEncoder");
        checkOnMediaCodecThread();
        final AnonymousClass1CaughtException r0 = new Object() {

            /* renamed from: e */
            Exception f123508e;
        };
        boolean z = false;
        if (this.mediaCodec != null) {
            final CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new Runnable() {
                public void run() {
                    Logging.m150047d("MediaCodecVideoEncoder", "Java releaseEncoder on release thread");
                    try {
                        MediaCodecVideoEncoder.this.mediaCodec.stop();
                    } catch (Exception e) {
                        Logging.m150049e("MediaCodecVideoEncoder", "Media encoder stop failed", e);
                    }
                    try {
                        MediaCodecVideoEncoder.this.mediaCodec.release();
                    } catch (Exception e2) {
                        Logging.m150049e("MediaCodecVideoEncoder", "Media encoder release failed", e2);
                        r0.f123508e = e2;
                    }
                    Logging.m150047d("MediaCodecVideoEncoder", "Java releaseEncoder on release thread done");
                    countDownLatch.countDown();
                }
            }).start();
            if (!ThreadUtils.awaitUninterruptibly(countDownLatch, DouPlusShareGuideExperiment.MIN_VALID_DURATION)) {
                Logging.m150048e("MediaCodecVideoEncoder", "Media encoder release timeout");
                z = true;
            }
            this.mediaCodec = null;
        }
        this.mediaCodecThread = null;
        if (this.drawer != null) {
            this.drawer.release();
            this.drawer = null;
        }
        if (this.eglBase != null) {
            this.eglBase.release();
            this.eglBase = null;
        }
        if (this.inputSurface != null) {
            this.inputSurface.release();
            this.inputSurface = null;
        }
        runningInstance = null;
        if (z) {
            codecErrors++;
            if (errorCallback != null) {
                StringBuilder sb = new StringBuilder("Invoke codec error callback. Errors: ");
                sb.append(codecErrors);
                Logging.m150048e("MediaCodecVideoEncoder", sb.toString());
                errorCallback.onMediaCodecVideoEncoderCriticalError(codecErrors);
            }
            throw new RuntimeException("Media encoder release timeout.");
        } else if (r0.f123508e == null) {
            Logging.m150047d("MediaCodecVideoEncoder", "Java releaseEncoder done");
        } else {
            RuntimeException runtimeException = new RuntimeException(r0.f123508e);
            runtimeException.setStackTrace(ThreadUtils.concatStackTraces(r0.f123508e.getStackTrace(), runtimeException.getStackTrace()));
            throw runtimeException;
        }
    }

    /* access modifiers changed from: 0000 */
    public OutputBufferInfo dequeueOutputBuffer() {
        boolean z;
        checkOnMediaCodecThread();
        try {
            BufferInfo bufferInfo = new BufferInfo();
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
            boolean z2 = true;
            if (dequeueOutputBuffer >= 0) {
                if ((bufferInfo.flags & 2) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    StringBuilder sb = new StringBuilder("Config frame generated. Offset: ");
                    sb.append(bufferInfo.offset);
                    sb.append(". Size: ");
                    sb.append(bufferInfo.size);
                    Logging.m150047d("MediaCodecVideoEncoder", sb.toString());
                    this.configData = ByteBuffer.allocateDirect(bufferInfo.size);
                    this.outputBuffers[dequeueOutputBuffer].position(bufferInfo.offset);
                    this.outputBuffers[dequeueOutputBuffer].limit(bufferInfo.offset + bufferInfo.size);
                    this.configData.put(this.outputBuffers[dequeueOutputBuffer]);
                    String str = "";
                    int i = 0;
                    while (true) {
                        int i2 = 8;
                        if (bufferInfo.size < 8) {
                            i2 = bufferInfo.size;
                        }
                        if (i >= i2) {
                            break;
                        }
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(str);
                        sb2.append(Integer.toHexString(this.configData.get(i) & 255));
                        sb2.append(" ");
                        str = sb2.toString();
                        i++;
                    }
                    Logging.m150047d("MediaCodecVideoEncoder", str);
                    this.mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                    dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
                }
            }
            int i3 = dequeueOutputBuffer;
            if (i3 >= 0) {
                ByteBuffer duplicate = this.outputBuffers[i3].duplicate();
                duplicate.position(bufferInfo.offset);
                duplicate.limit(bufferInfo.offset + bufferInfo.size);
                reportEncodedFrame(bufferInfo.size);
                if ((bufferInfo.flags & 1) == 0) {
                    z2 = false;
                }
                if (z2) {
                    Logging.m150047d("MediaCodecVideoEncoder", "Sync frame generated");
                }
                if (!z2 || this.type != VideoCodecType.VIDEO_CODEC_H264) {
                    OutputBufferInfo outputBufferInfo = new OutputBufferInfo(i3, duplicate.slice(), z2, bufferInfo.presentationTimeUs);
                    return outputBufferInfo;
                }
                StringBuilder sb3 = new StringBuilder("Appending config frame of size ");
                sb3.append(this.configData.capacity());
                sb3.append(" to output buffer with offset ");
                sb3.append(bufferInfo.offset);
                sb3.append(", size ");
                sb3.append(bufferInfo.size);
                Logging.m150047d("MediaCodecVideoEncoder", sb3.toString());
                ByteBuffer allocateDirect = ByteBuffer.allocateDirect(this.configData.capacity() + bufferInfo.size);
                this.configData.rewind();
                allocateDirect.put(this.configData);
                allocateDirect.put(duplicate);
                allocateDirect.position(0);
                OutputBufferInfo outputBufferInfo2 = new OutputBufferInfo(i3, allocateDirect, true, bufferInfo.presentationTimeUs);
                return outputBufferInfo2;
            } else if (i3 == -3) {
                this.outputBuffers = this.mediaCodec.getOutputBuffers();
                return dequeueOutputBuffer();
            } else if (i3 == -2) {
                return dequeueOutputBuffer();
            } else {
                if (i3 == -1) {
                    return null;
                }
                StringBuilder sb4 = new StringBuilder("dequeueOutputBuffer: ");
                sb4.append(i3);
                throw new RuntimeException(sb4.toString());
            }
        } catch (IllegalStateException e) {
            Logging.m150049e("MediaCodecVideoEncoder", "dequeueOutputBuffer failed", e);
            OutputBufferInfo outputBufferInfo3 = new OutputBufferInfo(-1, null, false, -1);
            return outputBufferInfo3;
        }
    }

    static boolean isTextureBuffer(Buffer buffer) {
        return buffer instanceof TextureBuffer;
    }

    static MediaCodec createByCodecName(String str) {
        try {
            return MediaCodec.createByCodecName(str);
        } catch (Exception unused) {
            return null;
        }
    }

    private double getBitrateScale(int i) {
        double d = (double) i;
        Double.isNaN(d);
        return Math.pow(4.0d, d / 20.0d);
    }

    public static void setErrorCallback(MediaCodecVideoEncoderErrorCallback mediaCodecVideoEncoderErrorCallback) {
        Logging.m150047d("MediaCodecVideoEncoder", "Set error callback");
        errorCallback = mediaCodecVideoEncoderErrorCallback;
    }

    public static void setEglContext(Context context) {
        if (staticEglBase != null) {
            Logging.m150051w("MediaCodecVideoEncoder", "Egl context already set.");
            staticEglBase.release();
        }
        staticEglBase = EglBase$$CC.create$$STATIC$$(context);
    }

    /* access modifiers changed from: 0000 */
    public boolean releaseOutputBuffer(int i) {
        checkOnMediaCodecThread();
        try {
            this.mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } catch (IllegalStateException e) {
            Logging.m150049e("MediaCodecVideoEncoder", "releaseOutputBuffer failed", e);
            return false;
        }
    }

    private void reportEncodedFrame(int i) {
        if (this.targetFps != 0 && this.bitrateAdjustmentType == BitrateAdjustmentType.DYNAMIC_ADJUSTMENT) {
            double d = (double) this.targetBitrateBps;
            double d2 = (double) this.targetFps;
            Double.isNaN(d2);
            double d3 = d2 * 8.0d;
            Double.isNaN(d);
            double d4 = d / d3;
            double d5 = this.bitrateAccumulator;
            double d6 = (double) i;
            Double.isNaN(d6);
            this.bitrateAccumulator = d5 + (d6 - d4);
            double d7 = this.bitrateObservationTimeMs;
            double d8 = (double) this.targetFps;
            Double.isNaN(d8);
            this.bitrateObservationTimeMs = d7 + (1000.0d / d8);
            double d9 = this.bitrateAccumulatorMax * 3.0d;
            this.bitrateAccumulator = Math.min(this.bitrateAccumulator, d9);
            this.bitrateAccumulator = Math.max(this.bitrateAccumulator, -d9);
            if (this.bitrateObservationTimeMs > 3000.0d) {
                StringBuilder sb = new StringBuilder("Acc: ");
                sb.append((int) this.bitrateAccumulator);
                sb.append(". Max: ");
                sb.append((int) this.bitrateAccumulatorMax);
                sb.append(". ExpScale: ");
                sb.append(this.bitrateAdjustmentScaleExp);
                Logging.m150047d("MediaCodecVideoEncoder", sb.toString());
                boolean z = true;
                if (this.bitrateAccumulator > this.bitrateAccumulatorMax) {
                    this.bitrateAdjustmentScaleExp -= (int) ((this.bitrateAccumulator / this.bitrateAccumulatorMax) + 0.5d);
                    this.bitrateAccumulator = this.bitrateAccumulatorMax;
                } else if (this.bitrateAccumulator < (-this.bitrateAccumulatorMax)) {
                    this.bitrateAdjustmentScaleExp += (int) (((-this.bitrateAccumulator) / this.bitrateAccumulatorMax) + 0.5d);
                    this.bitrateAccumulator = -this.bitrateAccumulatorMax;
                } else {
                    z = false;
                }
                if (z) {
                    this.bitrateAdjustmentScaleExp = Math.min(this.bitrateAdjustmentScaleExp, 20);
                    this.bitrateAdjustmentScaleExp = Math.max(this.bitrateAdjustmentScaleExp, -20);
                    StringBuilder sb2 = new StringBuilder("Adjusting bitrate scale to ");
                    sb2.append(this.bitrateAdjustmentScaleExp);
                    sb2.append(". Value: ");
                    sb2.append(getBitrateScale(this.bitrateAdjustmentScaleExp));
                    Logging.m150047d("MediaCodecVideoEncoder", sb2.toString());
                    setRates(this.targetBitrateBps / 1000, this.targetFps);
                }
                this.bitrateObservationTimeMs = 0.0d;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    public void checkKeyFrameRequired(boolean z, long j) {
        boolean z2;
        long j2 = (j + 500) / 1000;
        if (this.lastKeyFrameMs < 0) {
            this.lastKeyFrameMs = j2;
        }
        if (z || this.forcedKeyFrameMs <= 0 || j2 <= this.lastKeyFrameMs + this.forcedKeyFrameMs) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (z || z2) {
            if (z) {
                Logging.m150047d("MediaCodecVideoEncoder", "Sync frame request");
            } else {
                Logging.m150047d("MediaCodecVideoEncoder", "Sync frame forced");
            }
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.mediaCodec.setParameters(bundle);
            this.lastKeyFrameMs = j2;
        }
    }

    private boolean setRates(int i, int i2) {
        checkOnMediaCodecThread();
        int i3 = i * 1000;
        if (this.bitrateAdjustmentType == BitrateAdjustmentType.DYNAMIC_ADJUSTMENT) {
            double d = (double) i3;
            Double.isNaN(d);
            this.bitrateAccumulatorMax = d / 8.0d;
            if (this.targetBitrateBps > 0 && i3 < this.targetBitrateBps) {
                double d2 = this.bitrateAccumulator;
                Double.isNaN(d);
                double d3 = d2 * d;
                double d4 = (double) this.targetBitrateBps;
                Double.isNaN(d4);
                this.bitrateAccumulator = d3 / d4;
            }
        }
        this.targetBitrateBps = i3;
        this.targetFps = i2;
        if (this.bitrateAdjustmentType == BitrateAdjustmentType.FRAMERATE_ADJUSTMENT && this.targetFps > 0) {
            i3 = (this.targetBitrateBps * 30) / this.targetFps;
            StringBuilder sb = new StringBuilder("setRates: ");
            sb.append(i);
            sb.append(" -> ");
            sb.append(i3 / 1000);
            sb.append(" kbps. Fps: ");
            sb.append(this.targetFps);
            Logging.m150050v("MediaCodecVideoEncoder", sb.toString());
        } else if (this.bitrateAdjustmentType == BitrateAdjustmentType.DYNAMIC_ADJUSTMENT) {
            StringBuilder sb2 = new StringBuilder("setRates: ");
            sb2.append(i);
            sb2.append(" kbps. Fps: ");
            sb2.append(this.targetFps);
            sb2.append(". ExpScale: ");
            sb2.append(this.bitrateAdjustmentScaleExp);
            Logging.m150050v("MediaCodecVideoEncoder", sb2.toString());
            if (this.bitrateAdjustmentScaleExp != 0) {
                double d5 = (double) i3;
                double bitrateScale = getBitrateScale(this.bitrateAdjustmentScaleExp);
                Double.isNaN(d5);
                i3 = (int) (d5 * bitrateScale);
            }
        } else {
            StringBuilder sb3 = new StringBuilder("setRates: ");
            sb3.append(i);
            sb3.append(" kbps. Fps: ");
            sb3.append(this.targetFps);
            Logging.m150050v("MediaCodecVideoEncoder", sb3.toString());
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i3);
            this.mediaCodec.setParameters(bundle);
            return true;
        } catch (IllegalStateException e) {
            Logging.m150049e("MediaCodecVideoEncoder", "setRates failed", e);
            return false;
        }
    }

    private static EncoderProperties findHwEncoder(String str, MediaCodecProperties[] mediaCodecPropertiesArr, int[] iArr) {
        MediaCodecInfo mediaCodecInfo;
        String str2;
        boolean z;
        int[] iArr2;
        int[] iArr3;
        if (VERSION.SDK_INT < 19) {
            return null;
        }
        if (!str.equals("video/avc") || !Arrays.asList(H264_HW_EXCEPTION_MODELS).contains(Build.MODEL)) {
            for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
                try {
                    mediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
                } catch (IllegalArgumentException e) {
                    Logging.m150049e("MediaCodecVideoEncoder", "Cannot retrieve encoder codec info", e);
                    mediaCodecInfo = null;
                }
                if (mediaCodecInfo != null && mediaCodecInfo.isEncoder()) {
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
                        StringBuilder sb = new StringBuilder("Found candidate encoder ");
                        sb.append(str2);
                        Logging.m150050v("MediaCodecVideoEncoder", sb.toString());
                        BitrateAdjustmentType bitrateAdjustmentType2 = BitrateAdjustmentType.NO_ADJUSTMENT;
                        int length2 = mediaCodecPropertiesArr.length;
                        int i3 = 0;
                        while (true) {
                            if (i3 >= length2) {
                                z = false;
                                break;
                            }
                            MediaCodecProperties mediaCodecProperties = mediaCodecPropertiesArr[i3];
                            if (str2.startsWith(mediaCodecProperties.codecPrefix)) {
                                if (VERSION.SDK_INT < mediaCodecProperties.minSdk) {
                                    StringBuilder sb2 = new StringBuilder("Codec ");
                                    sb2.append(str2);
                                    sb2.append(" is disabled due to SDK version ");
                                    sb2.append(VERSION.SDK_INT);
                                    Logging.m150051w("MediaCodecVideoEncoder", sb2.toString());
                                } else {
                                    if (mediaCodecProperties.bitrateAdjustmentType != BitrateAdjustmentType.NO_ADJUSTMENT) {
                                        bitrateAdjustmentType2 = mediaCodecProperties.bitrateAdjustmentType;
                                        StringBuilder sb3 = new StringBuilder("Codec ");
                                        sb3.append(str2);
                                        sb3.append(" requires bitrate adjustment: ");
                                        sb3.append(bitrateAdjustmentType2);
                                        Logging.m150051w("MediaCodecVideoEncoder", sb3.toString());
                                    }
                                    z = true;
                                }
                            }
                            i3++;
                        }
                        if (z) {
                            try {
                                CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(str);
                                for (int i4 : capabilitiesForType.colorFormats) {
                                    StringBuilder sb4 = new StringBuilder("   Color: 0x");
                                    sb4.append(Integer.toHexString(i4));
                                    Logging.m150050v("MediaCodecVideoEncoder", sb4.toString());
                                }
                                for (int i5 : iArr) {
                                    for (int i6 : capabilitiesForType.colorFormats) {
                                        if (i6 == i5) {
                                            StringBuilder sb5 = new StringBuilder("Found target encoder for mime ");
                                            sb5.append(str);
                                            sb5.append(" : ");
                                            sb5.append(str2);
                                            sb5.append(". Color: 0x");
                                            sb5.append(Integer.toHexString(i6));
                                            sb5.append(". Bitrate adjustment: ");
                                            sb5.append(bitrateAdjustmentType2);
                                            Logging.m150047d("MediaCodecVideoEncoder", sb5.toString());
                                            return new EncoderProperties(str2, i6, bitrateAdjustmentType2);
                                        }
                                    }
                                }
                                continue;
                            } catch (IllegalArgumentException e2) {
                                Logging.m150049e("MediaCodecVideoEncoder", "Cannot retrieve encoder capabilities", e2);
                            }
                        } else {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
            }
            return null;
        }
        StringBuilder sb6 = new StringBuilder("Model: ");
        sb6.append(Build.MODEL);
        sb6.append(" has black listed H.264 encoder.");
        Logging.m150051w("MediaCodecVideoEncoder", sb6.toString());
        return null;
    }

    /* access modifiers changed from: 0000 */
    public boolean encodeBuffer(boolean z, int i, int i2, long j) {
        checkOnMediaCodecThread();
        try {
            checkKeyFrameRequired(z, j);
            this.mediaCodec.queueInputBuffer(i, 0, i2, j, 0);
            return true;
        } catch (IllegalStateException e) {
            Logging.m150049e("MediaCodecVideoEncoder", "encodeBuffer failed", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean encodeFrame(long j, boolean z, VideoFrame videoFrame, int i, long j2) {
        long j3 = j2;
        checkOnMediaCodecThread();
        try {
            checkKeyFrameRequired(z, j3);
            Buffer buffer = videoFrame.getBuffer();
            if (buffer instanceof TextureBuffer) {
                TextureBuffer textureBuffer = (TextureBuffer) buffer;
                this.eglBase.makeCurrent();
                GLES20.glClear(16384);
                VideoFrameDrawer.drawTexture(this.drawer, textureBuffer, new Matrix(), this.width, this.height, 0, 0, this.width, this.height);
                this.eglBase.swapBuffers(TimeUnit.MICROSECONDS.toNanos(j3));
            } else {
                I420Buffer i420 = buffer.toI420();
                int i2 = (this.height + 1) / 2;
                ByteBuffer dataY = i420.getDataY();
                ByteBuffer dataU = i420.getDataU();
                ByteBuffer dataV = i420.getDataV();
                int strideY = i420.getStrideY();
                int strideU = i420.getStrideU();
                int strideV = i420.getStrideV();
                if (dataY.capacity() < this.height * strideY) {
                    throw new RuntimeException("Y-plane buffer size too small.");
                } else if (dataU.capacity() < strideU * i2) {
                    throw new RuntimeException("U-plane buffer size too small.");
                } else if (dataV.capacity() >= i2 * strideV) {
                    nativeFillInputBuffer(j, i, dataY, strideY, dataU, strideU, dataV, strideV);
                    i420.release();
                    this.mediaCodec.queueInputBuffer(i, 0, ((this.width * this.height) * 3) / 2, j2, 0);
                } else {
                    throw new RuntimeException("V-plane buffer size too small.");
                }
            }
            return true;
        } catch (RuntimeException e) {
            Logging.m150049e("MediaCodecVideoEncoder", "encodeFrame failed", e);
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00d8  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x023c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean initEncode(org.webrtc.MediaCodecVideoEncoder.VideoCodecType r17, int r18, int r19, int r20, int r21, int r22, boolean r23) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r22
            r7 = r23
            java.lang.String r8 = "MediaCodecVideoEncoder"
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "Java initEncode: "
            r9.<init>(r10)
            r9.append(r0)
            java.lang.String r10 = ". Profile: "
            r9.append(r10)
            r9.append(r2)
            java.lang.String r10 = " : "
            r9.append(r10)
            r9.append(r3)
            java.lang.String r10 = " x "
            r9.append(r10)
            r9.append(r4)
            java.lang.String r10 = ". @ "
            r9.append(r10)
            r9.append(r5)
            java.lang.String r10 = " kbps. Fps: "
            r9.append(r10)
            r9.append(r6)
            java.lang.String r10 = ". Encode from texture : "
            r9.append(r10)
            r9.append(r7)
            java.lang.String r9 = r9.toString()
            org.webrtc.Logging.m150047d(r8, r9)
            r1.profile = r2
            r1.width = r3
            r1.height = r4
            java.lang.Thread r8 = r1.mediaCodecThread
            if (r8 != 0) goto L_0x0264
            org.webrtc.MediaCodecVideoEncoder$VideoCodecType r8 = org.webrtc.MediaCodecVideoEncoder.VideoCodecType.VIDEO_CODEC_VP8
            r9 = 100
            if (r0 != r8) goto L_0x0078
            java.lang.String r2 = "video/x-vnd.on2.vp8"
            java.lang.String r8 = "video/x-vnd.on2.vp8"
            org.webrtc.MediaCodecVideoEncoder$MediaCodecProperties[] r12 = vp8HwList()
            if (r7 == 0) goto L_0x0070
            int[] r13 = supportedSurfaceColorList
            goto L_0x0072
        L_0x0070:
            int[] r13 = supportedColorList
        L_0x0072:
            org.webrtc.MediaCodecVideoEncoder$EncoderProperties r8 = findHwEncoder(r8, r12, r13)
        L_0x0076:
            r12 = 0
            goto L_0x00d6
        L_0x0078:
            org.webrtc.MediaCodecVideoEncoder$VideoCodecType r8 = org.webrtc.MediaCodecVideoEncoder.VideoCodecType.VIDEO_CODEC_VP9
            if (r0 != r8) goto L_0x008e
            java.lang.String r2 = "video/x-vnd.on2.vp9"
            java.lang.String r8 = "video/x-vnd.on2.vp9"
            org.webrtc.MediaCodecVideoEncoder$MediaCodecProperties[] r12 = vp9HwList
            if (r7 == 0) goto L_0x0087
            int[] r13 = supportedSurfaceColorList
            goto L_0x0089
        L_0x0087:
            int[] r13 = supportedColorList
        L_0x0089:
            org.webrtc.MediaCodecVideoEncoder$EncoderProperties r8 = findHwEncoder(r8, r12, r13)
            goto L_0x0076
        L_0x008e:
            org.webrtc.MediaCodecVideoEncoder$VideoCodecType r8 = org.webrtc.MediaCodecVideoEncoder.VideoCodecType.VIDEO_CODEC_H264
            if (r0 != r8) goto L_0x0250
            java.lang.String r8 = "video/avc"
            java.lang.String r9 = "video/avc"
            org.webrtc.MediaCodecVideoEncoder$MediaCodecProperties[] r12 = h264HwList()
            if (r7 == 0) goto L_0x009f
            int[] r13 = supportedSurfaceColorList
            goto L_0x00a1
        L_0x009f:
            int[] r13 = supportedColorList
        L_0x00a1:
            org.webrtc.MediaCodecVideoEncoder$EncoderProperties r9 = findHwEncoder(r9, r12, r13)
            org.webrtc.MediaCodecVideoEncoder$H264Profile r12 = org.webrtc.MediaCodecVideoEncoder.H264Profile.CONSTRAINED_HIGH
            int r12 = r12.getValue()
            if (r2 != r12) goto L_0x00ce
            java.lang.String r2 = "video/avc"
            org.webrtc.MediaCodecVideoEncoder$MediaCodecProperties[] r12 = h264HighProfileHwList
            if (r7 == 0) goto L_0x00b6
            int[] r13 = supportedSurfaceColorList
            goto L_0x00b8
        L_0x00b6:
            int[] r13 = supportedColorList
        L_0x00b8:
            org.webrtc.MediaCodecVideoEncoder$EncoderProperties r2 = findHwEncoder(r2, r12, r13)
            if (r2 == 0) goto L_0x00c7
            java.lang.String r2 = "MediaCodecVideoEncoder"
            java.lang.String r12 = "High profile H.264 encoder supported."
            org.webrtc.Logging.m150047d(r2, r12)
            r2 = 1
            goto L_0x00cf
        L_0x00c7:
            java.lang.String r2 = "MediaCodecVideoEncoder"
            java.lang.String r12 = "High profile H.264 encoder requested, but not supported. Use baseline."
            org.webrtc.Logging.m150047d(r2, r12)
        L_0x00ce:
            r2 = 0
        L_0x00cf:
            r12 = 20
            r12 = r2
            r2 = r8
            r8 = r9
            r9 = 20
        L_0x00d6:
            if (r8 == 0) goto L_0x023c
            runningInstance = r1
            int r13 = r8.colorFormat
            r1.colorFormat = r13
            org.webrtc.MediaCodecVideoEncoder$BitrateAdjustmentType r13 = r8.bitrateAdjustmentType
            r1.bitrateAdjustmentType = r13
            org.webrtc.MediaCodecVideoEncoder$BitrateAdjustmentType r13 = r1.bitrateAdjustmentType
            org.webrtc.MediaCodecVideoEncoder$BitrateAdjustmentType r14 = org.webrtc.MediaCodecVideoEncoder.BitrateAdjustmentType.FRAMERATE_ADJUSTMENT
            r15 = 30
            if (r13 != r14) goto L_0x00eb
            goto L_0x00ef
        L_0x00eb:
            int r15 = java.lang.Math.min(r6, r15)
        L_0x00ef:
            r13 = 0
            r1.forcedKeyFrameMs = r13
            r13 = -1
            r1.lastKeyFrameMs = r13
            org.webrtc.MediaCodecVideoEncoder$VideoCodecType r6 = org.webrtc.MediaCodecVideoEncoder.VideoCodecType.VIDEO_CODEC_VP8
            if (r0 != r6) goto L_0x012a
            java.lang.String r6 = r8.codecName
            org.webrtc.MediaCodecVideoEncoder$MediaCodecProperties r13 = qcomVp8HwProperties
            java.lang.String r13 = r13.codecPrefix
            boolean r6 = r6.startsWith(r13)
            if (r6 == 0) goto L_0x012a
            int r6 = android.os.Build.VERSION.SDK_INT
            r13 = 21
            r10 = 15000(0x3a98, double:7.411E-320)
            if (r6 == r13) goto L_0x0128
            int r6 = android.os.Build.VERSION.SDK_INT
            r13 = 22
            if (r6 != r13) goto L_0x0116
            goto L_0x0128
        L_0x0116:
            int r6 = android.os.Build.VERSION.SDK_INT
            r13 = 23
            if (r6 != r13) goto L_0x0121
            r10 = 20000(0x4e20, double:9.8813E-320)
            r1.forcedKeyFrameMs = r10
            goto L_0x012a
        L_0x0121:
            int r6 = android.os.Build.VERSION.SDK_INT
            if (r6 <= r13) goto L_0x012a
            r1.forcedKeyFrameMs = r10
            goto L_0x012a
        L_0x0128:
            r1.forcedKeyFrameMs = r10
        L_0x012a:
            java.lang.String r6 = "MediaCodecVideoEncoder"
            java.lang.StringBuilder r10 = new java.lang.StringBuilder
            java.lang.String r11 = "Color format: "
            r10.<init>(r11)
            int r11 = r1.colorFormat
            r10.append(r11)
            java.lang.String r11 = ". Bitrate adjustment: "
            r10.append(r11)
            org.webrtc.MediaCodecVideoEncoder$BitrateAdjustmentType r11 = r1.bitrateAdjustmentType
            r10.append(r11)
            java.lang.String r11 = ". Key frame interval: "
            r10.append(r11)
            long r13 = r1.forcedKeyFrameMs
            r10.append(r13)
            java.lang.String r11 = " . Initial fps: "
            r10.append(r11)
            r10.append(r15)
            java.lang.String r10 = r10.toString()
            org.webrtc.Logging.m150047d(r6, r10)
            int r5 = r5 * 1000
            r1.targetBitrateBps = r5
            r1.targetFps = r15
            int r5 = r1.targetBitrateBps
            double r5 = (double) r5
            r10 = 4620693217682128896(0x4020000000000000, double:8.0)
            java.lang.Double.isNaN(r5)
            double r5 = r5 / r10
            r1.bitrateAccumulatorMax = r5
            r5 = 0
            r1.bitrateAccumulator = r5
            r1.bitrateObservationTimeMs = r5
            r5 = 0
            r1.bitrateAdjustmentScaleExp = r5
            java.lang.Thread r5 = java.lang.Thread.currentThread()
            r1.mediaCodecThread = r5
            android.media.MediaFormat r2 = android.media.MediaFormat.createVideoFormat(r2, r3, r4)     // Catch:{ IllegalStateException -> 0x022f }
            java.lang.String r3 = "bitrate"
            int r4 = r1.targetBitrateBps     // Catch:{ IllegalStateException -> 0x022f }
            r2.setInteger(r3, r4)     // Catch:{ IllegalStateException -> 0x022f }
            java.lang.String r3 = "bitrate-mode"
            r4 = 2
            r2.setInteger(r3, r4)     // Catch:{ IllegalStateException -> 0x022f }
            java.lang.String r3 = "color-format"
            int r4 = r8.colorFormat     // Catch:{ IllegalStateException -> 0x022f }
            r2.setInteger(r3, r4)     // Catch:{ IllegalStateException -> 0x022f }
            java.lang.String r3 = "frame-rate"
            int r4 = r1.targetFps     // Catch:{ IllegalStateException -> 0x022f }
            r2.setInteger(r3, r4)     // Catch:{ IllegalStateException -> 0x022f }
            java.lang.String r3 = "i-frame-interval"
            r2.setInteger(r3, r9)     // Catch:{ IllegalStateException -> 0x022f }
            if (r12 == 0) goto L_0x01af
            java.lang.String r3 = "profile"
            r4 = 8
            r2.setInteger(r3, r4)     // Catch:{ IllegalStateException -> 0x022f }
            java.lang.String r3 = "level"
            r4 = 256(0x100, float:3.59E-43)
            r2.setInteger(r3, r4)     // Catch:{ IllegalStateException -> 0x022f }
        L_0x01af:
            java.lang.String r3 = "MediaCodecVideoEncoder"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x022f }
            java.lang.String r5 = "  Format: "
            r4.<init>(r5)     // Catch:{ IllegalStateException -> 0x022f }
            r4.append(r2)     // Catch:{ IllegalStateException -> 0x022f }
            java.lang.String r4 = r4.toString()     // Catch:{ IllegalStateException -> 0x022f }
            org.webrtc.Logging.m150047d(r3, r4)     // Catch:{ IllegalStateException -> 0x022f }
            java.lang.String r3 = r8.codecName     // Catch:{ IllegalStateException -> 0x022f }
            android.media.MediaCodec r3 = createByCodecName(r3)     // Catch:{ IllegalStateException -> 0x022f }
            r1.mediaCodec = r3     // Catch:{ IllegalStateException -> 0x022f }
            r1.type = r0     // Catch:{ IllegalStateException -> 0x022f }
            android.media.MediaCodec r0 = r1.mediaCodec     // Catch:{ IllegalStateException -> 0x022f }
            if (r0 != 0) goto L_0x01dc
            java.lang.String r0 = "MediaCodecVideoEncoder"
            java.lang.String r2 = "Can not create media encoder"
            org.webrtc.Logging.m150048e(r0, r2)     // Catch:{ IllegalStateException -> 0x022f }
            r16.release()     // Catch:{ IllegalStateException -> 0x022f }
            r2 = 0
            return r2
        L_0x01dc:
            android.media.MediaCodec r0 = r1.mediaCodec     // Catch:{ IllegalStateException -> 0x022f }
            r3 = 0
            r4 = 1
            r0.configure(r2, r3, r3, r4)     // Catch:{ IllegalStateException -> 0x022f }
            if (r7 == 0) goto L_0x020a
            org.webrtc.EglBase14 r0 = new org.webrtc.EglBase14     // Catch:{ IllegalStateException -> 0x022f }
            org.webrtc.EglBase$Context r2 = getEglContext()     // Catch:{ IllegalStateException -> 0x022f }
            org.webrtc.EglBase14$Context r2 = (org.webrtc.EglBase14.Context) r2     // Catch:{ IllegalStateException -> 0x022f }
            int[] r3 = org.webrtc.EglBase.CONFIG_RECORDABLE     // Catch:{ IllegalStateException -> 0x022f }
            r0.<init>(r2, r3)     // Catch:{ IllegalStateException -> 0x022f }
            r1.eglBase = r0     // Catch:{ IllegalStateException -> 0x022f }
            android.media.MediaCodec r0 = r1.mediaCodec     // Catch:{ IllegalStateException -> 0x022f }
            android.view.Surface r0 = r0.createInputSurface()     // Catch:{ IllegalStateException -> 0x022f }
            r1.inputSurface = r0     // Catch:{ IllegalStateException -> 0x022f }
            org.webrtc.EglBase14 r0 = r1.eglBase     // Catch:{ IllegalStateException -> 0x022f }
            android.view.Surface r2 = r1.inputSurface     // Catch:{ IllegalStateException -> 0x022f }
            r0.createSurface(r2)     // Catch:{ IllegalStateException -> 0x022f }
            org.webrtc.GlRectDrawer r0 = new org.webrtc.GlRectDrawer     // Catch:{ IllegalStateException -> 0x022f }
            r0.<init>()     // Catch:{ IllegalStateException -> 0x022f }
            r1.drawer = r0     // Catch:{ IllegalStateException -> 0x022f }
        L_0x020a:
            android.media.MediaCodec r0 = r1.mediaCodec     // Catch:{ IllegalStateException -> 0x022f }
            r0.start()     // Catch:{ IllegalStateException -> 0x022f }
            android.media.MediaCodec r0 = r1.mediaCodec     // Catch:{ IllegalStateException -> 0x022f }
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()     // Catch:{ IllegalStateException -> 0x022f }
            r1.outputBuffers = r0     // Catch:{ IllegalStateException -> 0x022f }
            java.lang.String r0 = "MediaCodecVideoEncoder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x022f }
            java.lang.String r3 = "Output buffers: "
            r2.<init>(r3)     // Catch:{ IllegalStateException -> 0x022f }
            java.nio.ByteBuffer[] r3 = r1.outputBuffers     // Catch:{ IllegalStateException -> 0x022f }
            int r3 = r3.length     // Catch:{ IllegalStateException -> 0x022f }
            r2.append(r3)     // Catch:{ IllegalStateException -> 0x022f }
            java.lang.String r2 = r2.toString()     // Catch:{ IllegalStateException -> 0x022f }
            org.webrtc.Logging.m150047d(r0, r2)     // Catch:{ IllegalStateException -> 0x022f }
            r0 = 1
            return r0
        L_0x022f:
            r0 = move-exception
            java.lang.String r2 = "MediaCodecVideoEncoder"
            java.lang.String r3 = "initEncode failed"
            org.webrtc.Logging.m150049e(r2, r3, r0)
            r16.release()
            r2 = 0
            return r2
        L_0x023c:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "Can not find HW encoder for "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x0250:
            java.lang.RuntimeException r2 = new java.lang.RuntimeException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "initEncode: Non-supported codec "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            throw r2
        L_0x0264:
            java.lang.RuntimeException r0 = new java.lang.RuntimeException
            java.lang.String r2 = "Forgot to release()?"
            r0.<init>(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.MediaCodecVideoEncoder.initEncode(org.webrtc.MediaCodecVideoEncoder$VideoCodecType, int, int, int, int, int, boolean):boolean");
    }
}
