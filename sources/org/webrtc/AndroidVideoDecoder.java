package org.webrtc;

import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.os.SystemClock;
import android.view.Surface;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase.Context;
import org.webrtc.EncodedImage.FrameType;
import org.webrtc.ThreadUtils.ThreadChecker;
import org.webrtc.VideoDecoder.Callback;
import org.webrtc.VideoDecoder.DecodeInfo;
import org.webrtc.VideoDecoder.Settings;
import org.webrtc.VideoFrame.Buffer;
import org.webrtc.VideoFrame.I420Buffer;

class AndroidVideoDecoder implements VideoDecoder, VideoSink {
    private Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecType codecType;
    private int colorFormat;
    private ThreadChecker decoderThreadChecker;
    private final Object dimensionLock = new Object();
    private final BlockingDeque<FrameInfo> frameInfos;
    private boolean hasDecodedFirstFrame;
    private int height;
    private boolean keyFrameRequired;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private Thread outputThread;
    public ThreadChecker outputThreadChecker;
    private DecodedTextureMetadata renderedTextureMetadata;
    private final Object renderedTextureMetadataLock = new Object();
    public volatile boolean running;
    private final Context sharedContext;
    private volatile Exception shutdownException;
    private int sliceHeight;
    private int stride;
    private Surface surface;
    private SurfaceTextureHelper surfaceTextureHelper;
    private int width;

    static class DecodedTextureMetadata {
        final Integer decodeTimeMs;
        final long presentationTimestampUs;

        DecodedTextureMetadata(long j, Integer num) {
            this.presentationTimestampUs = j;
            this.decodeTimeMs = num;
        }
    }

    static class FrameInfo {
        final long decodeStartTimeMs;
        final int rotation;

        FrameInfo(long j, int i) {
            this.decodeStartTimeMs = j;
            this.rotation = i;
        }
    }

    public long createNativeVideoDecoder() {
        return VideoDecoder$$CC.createNativeVideoDecoder(this);
    }

    public String getImplementationName() {
        return this.codecName;
    }

    public boolean getPrefersLateDecoding() {
        return true;
    }

    private Thread createOutputThread() {
        return new Thread("AndroidVideoDecoder.outputThread") {
            public void run() {
                AndroidVideoDecoder.this.outputThreadChecker = new ThreadChecker();
                while (AndroidVideoDecoder.this.running) {
                    AndroidVideoDecoder.this.deliverDecodedFrame();
                }
                AndroidVideoDecoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    /* access modifiers changed from: protected */
    public void releaseSurface() {
        this.surface.release();
    }

    /* access modifiers changed from: protected */
    public SurfaceTextureHelper createSurfaceTextureHelper() {
        return SurfaceTextureHelper.create("decoder-texture-thread", this.sharedContext);
    }

    public VideoCodecStatus release() {
        Logging.m150047d("AndroidVideoDecoder", "release");
        VideoCodecStatus releaseInternal = releaseInternal();
        if (this.surface != null) {
            releaseSurface();
            this.surface = null;
            this.surfaceTextureHelper.stopListening();
            this.surfaceTextureHelper.dispose();
            this.surfaceTextureHelper = null;
        }
        synchronized (this.renderedTextureMetadataLock) {
            this.renderedTextureMetadata = null;
        }
        this.callback = null;
        this.frameInfos.clear();
        return releaseInternal;
    }

    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.m150047d("AndroidVideoDecoder", "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e) {
            Logging.m150049e("AndroidVideoDecoder", "Media decoder stop failed", e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            Logging.m150049e("AndroidVideoDecoder", "Media decoder release failed", e2);
            this.shutdownException = e2;
        }
        Logging.m150047d("AndroidVideoDecoder", "Release on output thread done");
    }

    private VideoCodecStatus releaseInternal() {
        if (!this.running) {
            Logging.m150047d("AndroidVideoDecoder", "release: Decoder is not running.");
            return VideoCodecStatus.OK;
        }
        try {
            this.running = false;
            if (!ThreadUtils.joinUninterruptibly(this.outputThread, DouPlusShareGuideExperiment.MIN_VALID_DURATION)) {
                Logging.m150049e("AndroidVideoDecoder", "Media decoder release timeout", new RuntimeException());
                return VideoCodecStatus.TIMEOUT;
            } else if (this.shutdownException != null) {
                Logging.m150049e("AndroidVideoDecoder", "Media decoder release error", new RuntimeException(this.shutdownException));
                this.shutdownException = null;
                VideoCodecStatus videoCodecStatus = VideoCodecStatus.ERROR;
                this.codec = null;
                this.outputThread = null;
                return videoCodecStatus;
            } else {
                this.codec = null;
                this.outputThread = null;
                return VideoCodecStatus.OK;
            }
        } finally {
            this.codec = null;
            this.outputThread = null;
        }
    }

    /* access modifiers changed from: protected */
    public void deliverDecodedFrame() {
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            BufferInfo bufferInfo = new BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000);
            if (dequeueOutputBuffer == -2) {
                reformat(this.codec.getOutputFormat());
            } else if (dequeueOutputBuffer < 0) {
                StringBuilder sb = new StringBuilder("dequeueOutputBuffer returned ");
                sb.append(dequeueOutputBuffer);
                Logging.m150050v("AndroidVideoDecoder", sb.toString());
            } else {
                FrameInfo frameInfo = (FrameInfo) this.frameInfos.poll();
                Integer num = null;
                int i = 0;
                if (frameInfo != null) {
                    num = Integer.valueOf((int) (SystemClock.elapsedRealtime() - frameInfo.decodeStartTimeMs));
                    i = frameInfo.rotation;
                }
                this.hasDecodedFirstFrame = true;
                if (this.surfaceTextureHelper != null) {
                    deliverTextureFrame(dequeueOutputBuffer, bufferInfo, i, num);
                } else {
                    deliverByteFrame(dequeueOutputBuffer, bufferInfo, i, num);
                }
            }
        } catch (IllegalStateException e) {
            Logging.m150049e("AndroidVideoDecoder", "deliverDecodedFrame failed", e);
        }
    }

    private void stopOnOutputThread(Exception exc) {
        this.outputThreadChecker.checkIsOnValidThread();
        this.running = false;
        this.shutdownException = exc;
    }

    private boolean isSupportedColorFormat(int i) {
        for (int i2 : MediaCodecUtils.DECODER_COLOR_FORMATS) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public void onFrame(VideoFrame videoFrame) {
        long j;
        int intValue;
        synchronized (this.renderedTextureMetadataLock) {
            if (this.renderedTextureMetadata != null) {
                j = this.renderedTextureMetadata.presentationTimestampUs * 1000;
                intValue = this.renderedTextureMetadata.decodeTimeMs.intValue();
                this.renderedTextureMetadata = null;
            } else {
                throw new IllegalStateException("Rendered texture metadata was null in onTextureFrameAvailable.");
            }
        }
        this.callback.onDecodedFrame(new VideoFrame(videoFrame.getBuffer(), videoFrame.getRotation(), j), Integer.valueOf(intValue), null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b1, code lost:
        if (r5.surfaceTextureHelper != null) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00b9, code lost:
        if (r6.containsKey("color-format") == false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00bb, code lost:
        r5.colorFormat = r6.getInteger("color-format");
        r1 = new java.lang.StringBuilder("Color: 0x");
        r1.append(java.lang.Integer.toHexString(r5.colorFormat));
        org.webrtc.Logging.m150047d("AndroidVideoDecoder", r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00e2, code lost:
        if (isSupportedColorFormat(r5.colorFormat) != false) goto L_0x00fd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e4, code lost:
        r0 = new java.lang.StringBuilder("Unsupported color format: ");
        r0.append(r5.colorFormat);
        stopOnOutputThread(new java.lang.IllegalStateException(r0.toString()));
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fc, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00fd, code lost:
        r0 = r5.dimensionLock;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ff, code lost:
        monitor-enter(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x0106, code lost:
        if (r6.containsKey("stride") == false) goto L_0x0110;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0108, code lost:
        r5.stride = r6.getInteger("stride");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0116, code lost:
        if (r6.containsKey("slice-height") == false) goto L_0x0120;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x0118, code lost:
        r5.sliceHeight = r6.getInteger("slice-height");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x0120, code lost:
        r1 = new java.lang.StringBuilder("Frame stride and slice height: ");
        r1.append(r5.stride);
        r1.append(" x ");
        r1.append(r5.sliceHeight);
        org.webrtc.Logging.m150047d("AndroidVideoDecoder", r1.toString());
        r5.stride = java.lang.Math.max(r5.width, r5.stride);
        r5.sliceHeight = java.lang.Math.max(r5.height, r5.sliceHeight);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0153, code lost:
        monitor-exit(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x0154, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void reformat(android.media.MediaFormat r6) {
        /*
            r5 = this;
            org.webrtc.ThreadUtils$ThreadChecker r0 = r5.outputThreadChecker
            r0.checkIsOnValidThread()
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Decoder format changed: "
            r1.<init>(r2)
            java.lang.String r2 = r6.toString()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.webrtc.Logging.m150047d(r0, r1)
            java.lang.String r0 = "crop-left"
            boolean r0 = r6.containsKey(r0)
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = "crop-right"
            boolean r0 = r6.containsKey(r0)
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = "crop-bottom"
            boolean r0 = r6.containsKey(r0)
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = "crop-top"
            boolean r0 = r6.containsKey(r0)
            if (r0 == 0) goto L_0x005b
            java.lang.String r0 = "crop-right"
            int r0 = r6.getInteger(r0)
            int r0 = r0 + 1
            java.lang.String r1 = "crop-left"
            int r1 = r6.getInteger(r1)
            int r0 = r0 - r1
            java.lang.String r1 = "crop-bottom"
            int r1 = r6.getInteger(r1)
            int r1 = r1 + 1
            java.lang.String r2 = "crop-top"
            int r2 = r6.getInteger(r2)
            int r1 = r1 - r2
            goto L_0x0067
        L_0x005b:
            java.lang.String r0 = "width"
            int r0 = r6.getInteger(r0)
            java.lang.String r1 = "height"
            int r1 = r6.getInteger(r1)
        L_0x0067:
            java.lang.Object r2 = r5.dimensionLock
            monitor-enter(r2)
            boolean r3 = r5.hasDecodedFirstFrame     // Catch:{ all -> 0x0158 }
            if (r3 == 0) goto L_0x00aa
            int r3 = r5.width     // Catch:{ all -> 0x0158 }
            if (r3 != r0) goto L_0x0076
            int r3 = r5.height     // Catch:{ all -> 0x0158 }
            if (r3 == r1) goto L_0x00aa
        L_0x0076:
            java.lang.RuntimeException r6 = new java.lang.RuntimeException     // Catch:{ all -> 0x0158 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0158 }
            java.lang.String r4 = "Unexpected size change. Configured "
            r3.<init>(r4)     // Catch:{ all -> 0x0158 }
            int r4 = r5.width     // Catch:{ all -> 0x0158 }
            r3.append(r4)     // Catch:{ all -> 0x0158 }
            java.lang.String r4 = "*"
            r3.append(r4)     // Catch:{ all -> 0x0158 }
            int r4 = r5.height     // Catch:{ all -> 0x0158 }
            r3.append(r4)     // Catch:{ all -> 0x0158 }
            java.lang.String r4 = ". New "
            r3.append(r4)     // Catch:{ all -> 0x0158 }
            r3.append(r0)     // Catch:{ all -> 0x0158 }
            java.lang.String r0 = "*"
            r3.append(r0)     // Catch:{ all -> 0x0158 }
            r3.append(r1)     // Catch:{ all -> 0x0158 }
            java.lang.String r0 = r3.toString()     // Catch:{ all -> 0x0158 }
            r6.<init>(r0)     // Catch:{ all -> 0x0158 }
            r5.stopOnOutputThread(r6)     // Catch:{ all -> 0x0158 }
            monitor-exit(r2)     // Catch:{ all -> 0x0158 }
            return
        L_0x00aa:
            r5.width = r0     // Catch:{ all -> 0x0158 }
            r5.height = r1     // Catch:{ all -> 0x0158 }
            monitor-exit(r2)     // Catch:{ all -> 0x0158 }
            org.webrtc.SurfaceTextureHelper r0 = r5.surfaceTextureHelper
            if (r0 != 0) goto L_0x00fd
            java.lang.String r0 = "color-format"
            boolean r0 = r6.containsKey(r0)
            if (r0 == 0) goto L_0x00fd
            java.lang.String r0 = "color-format"
            int r0 = r6.getInteger(r0)
            r5.colorFormat = r0
            java.lang.String r0 = "AndroidVideoDecoder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Color: 0x"
            r1.<init>(r2)
            int r2 = r5.colorFormat
            java.lang.String r2 = java.lang.Integer.toHexString(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.webrtc.Logging.m150047d(r0, r1)
            int r0 = r5.colorFormat
            boolean r0 = r5.isSupportedColorFormat(r0)
            if (r0 != 0) goto L_0x00fd
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unsupported color format: "
            r0.<init>(r1)
            int r1 = r5.colorFormat
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r6.<init>(r0)
            r5.stopOnOutputThread(r6)
            return
        L_0x00fd:
            java.lang.Object r0 = r5.dimensionLock
            monitor-enter(r0)
            java.lang.String r1 = "stride"
            boolean r1 = r6.containsKey(r1)     // Catch:{ all -> 0x0155 }
            if (r1 == 0) goto L_0x0110
            java.lang.String r1 = "stride"
            int r1 = r6.getInteger(r1)     // Catch:{ all -> 0x0155 }
            r5.stride = r1     // Catch:{ all -> 0x0155 }
        L_0x0110:
            java.lang.String r1 = "slice-height"
            boolean r1 = r6.containsKey(r1)     // Catch:{ all -> 0x0155 }
            if (r1 == 0) goto L_0x0120
            java.lang.String r1 = "slice-height"
            int r6 = r6.getInteger(r1)     // Catch:{ all -> 0x0155 }
            r5.sliceHeight = r6     // Catch:{ all -> 0x0155 }
        L_0x0120:
            java.lang.String r6 = "AndroidVideoDecoder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ all -> 0x0155 }
            java.lang.String r2 = "Frame stride and slice height: "
            r1.<init>(r2)     // Catch:{ all -> 0x0155 }
            int r2 = r5.stride     // Catch:{ all -> 0x0155 }
            r1.append(r2)     // Catch:{ all -> 0x0155 }
            java.lang.String r2 = " x "
            r1.append(r2)     // Catch:{ all -> 0x0155 }
            int r2 = r5.sliceHeight     // Catch:{ all -> 0x0155 }
            r1.append(r2)     // Catch:{ all -> 0x0155 }
            java.lang.String r1 = r1.toString()     // Catch:{ all -> 0x0155 }
            org.webrtc.Logging.m150047d(r6, r1)     // Catch:{ all -> 0x0155 }
            int r6 = r5.width     // Catch:{ all -> 0x0155 }
            int r1 = r5.stride     // Catch:{ all -> 0x0155 }
            int r6 = java.lang.Math.max(r6, r1)     // Catch:{ all -> 0x0155 }
            r5.stride = r6     // Catch:{ all -> 0x0155 }
            int r6 = r5.height     // Catch:{ all -> 0x0155 }
            int r1 = r5.sliceHeight     // Catch:{ all -> 0x0155 }
            int r6 = java.lang.Math.max(r6, r1)     // Catch:{ all -> 0x0155 }
            r5.sliceHeight = r6     // Catch:{ all -> 0x0155 }
            monitor-exit(r0)     // Catch:{ all -> 0x0155 }
            return
        L_0x0155:
            r6 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0155 }
            throw r6
        L_0x0158:
            r6 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0158 }
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.AndroidVideoDecoder.reformat(android.media.MediaFormat):void");
    }

    /* access modifiers changed from: protected */
    public I420Buffer allocateI420Buffer(int i, int i2) {
        return JavaI420Buffer.allocate(i, i2);
    }

    private VideoCodecStatus reinitDecode(int i, int i2) {
        this.decoderThreadChecker.checkIsOnValidThread();
        VideoCodecStatus releaseInternal = releaseInternal();
        if (releaseInternal != VideoCodecStatus.OK) {
            return releaseInternal;
        }
        return initDecodeInternal(i, i2);
    }

    public VideoCodecStatus initDecode(Settings settings, Callback callback2) {
        this.decoderThreadChecker = new ThreadChecker();
        this.callback = callback2;
        if (this.sharedContext != null) {
            this.surfaceTextureHelper = createSurfaceTextureHelper();
            this.surface = new Surface(this.surfaceTextureHelper.getSurfaceTexture());
            this.surfaceTextureHelper.startListening(this);
        }
        return initDecodeInternal(settings.width, settings.height);
    }

    private VideoCodecStatus initDecodeInternal(int i, int i2) {
        this.decoderThreadChecker.checkIsOnValidThread();
        StringBuilder sb = new StringBuilder("initDecodeInternal name: ");
        sb.append(this.codecName);
        sb.append(" type: ");
        sb.append(this.codecType);
        sb.append(" width: ");
        sb.append(i);
        sb.append(" height: ");
        sb.append(i2);
        Logging.m150047d("AndroidVideoDecoder", sb.toString());
        if (this.outputThread != null) {
            Logging.m150048e("AndroidVideoDecoder", "initDecodeInternal called while the codec is already running");
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
        this.width = i;
        this.height = i2;
        this.stride = i;
        this.sliceHeight = i2;
        this.hasDecodedFirstFrame = false;
        this.keyFrameRequired = true;
        try {
            this.codec = this.mediaCodecWrapperFactory.createByCodecName(this.codecName);
            try {
                MediaFormat createVideoFormat = MediaFormat.createVideoFormat(this.codecType.mimeType(), i, i2);
                if (this.sharedContext == null) {
                    createVideoFormat.setInteger("color-format", this.colorFormat);
                }
                this.codec.configure(createVideoFormat, this.surface, null, 0);
                this.codec.start();
                this.running = true;
                this.outputThread = createOutputThread();
                this.outputThread.start();
                Logging.m150047d("AndroidVideoDecoder", "initDecodeInternal done");
                return VideoCodecStatus.OK;
            } catch (IllegalStateException e) {
                Logging.m150049e("AndroidVideoDecoder", "initDecode failed", e);
                release();
                return VideoCodecStatus.FALLBACK_SOFTWARE;
            }
        } catch (IOException | IllegalArgumentException unused) {
            StringBuilder sb2 = new StringBuilder("Cannot create media decoder ");
            sb2.append(this.codecName);
            Logging.m150048e("AndroidVideoDecoder", sb2.toString());
            return VideoCodecStatus.FALLBACK_SOFTWARE;
        }
    }

    public VideoCodecStatus decode(EncodedImage encodedImage, DecodeInfo decodeInfo) {
        int i;
        int i2;
        this.decoderThreadChecker.checkIsOnValidThread();
        boolean z = false;
        if (this.codec == null || this.callback == null) {
            String str = "AndroidVideoDecoder";
            StringBuilder sb = new StringBuilder("decode uninitalized, codec: ");
            if (this.codec != null) {
                z = true;
            }
            sb.append(z);
            sb.append(", callback: ");
            sb.append(this.callback);
            Logging.m150047d(str, sb.toString());
            return VideoCodecStatus.UNINITIALIZED;
        } else if (encodedImage.buffer == null) {
            Logging.m150048e("AndroidVideoDecoder", "decode() - no input data");
            return VideoCodecStatus.ERR_PARAMETER;
        } else {
            int remaining = encodedImage.buffer.remaining();
            if (remaining == 0) {
                Logging.m150048e("AndroidVideoDecoder", "decode() - input buffer empty");
                return VideoCodecStatus.ERR_PARAMETER;
            }
            synchronized (this.dimensionLock) {
                i = this.width;
                i2 = this.height;
            }
            if (encodedImage.encodedWidth * encodedImage.encodedHeight > 0 && !(encodedImage.encodedWidth == i && encodedImage.encodedHeight == i2)) {
                VideoCodecStatus reinitDecode = reinitDecode(encodedImage.encodedWidth, encodedImage.encodedHeight);
                if (reinitDecode != VideoCodecStatus.OK) {
                    return reinitDecode;
                }
            }
            if (this.keyFrameRequired) {
                if (encodedImage.frameType != FrameType.VideoFrameKey) {
                    Logging.m150048e("AndroidVideoDecoder", "decode() - key frame required first");
                    return VideoCodecStatus.NO_OUTPUT;
                } else if (!encodedImage.completeFrame) {
                    Logging.m150048e("AndroidVideoDecoder", "decode() - complete frame required first");
                    return VideoCodecStatus.NO_OUTPUT;
                }
            }
            try {
                int dequeueInputBuffer = this.codec.dequeueInputBuffer(500000);
                if (dequeueInputBuffer < 0) {
                    Logging.m150048e("AndroidVideoDecoder", "decode() - no HW buffers available; decoder falling behind");
                    return VideoCodecStatus.ERROR;
                }
                try {
                    ByteBuffer byteBuffer = this.codec.getInputBuffers()[dequeueInputBuffer];
                    if (byteBuffer.capacity() < remaining) {
                        Logging.m150048e("AndroidVideoDecoder", "decode() - HW buffer too small");
                        return VideoCodecStatus.ERROR;
                    }
                    byteBuffer.put(encodedImage.buffer);
                    this.frameInfos.offer(new FrameInfo(SystemClock.elapsedRealtime(), encodedImage.rotation));
                    try {
                        this.codec.queueInputBuffer(dequeueInputBuffer, 0, remaining, TimeUnit.NANOSECONDS.toMicros(encodedImage.captureTimeNs), 0);
                        if (this.keyFrameRequired) {
                            this.keyFrameRequired = false;
                        }
                        return VideoCodecStatus.OK;
                    } catch (IllegalStateException e) {
                        Logging.m150049e("AndroidVideoDecoder", "queueInputBuffer failed", e);
                        this.frameInfos.pollLast();
                        return VideoCodecStatus.ERROR;
                    }
                } catch (IllegalStateException e2) {
                    Logging.m150049e("AndroidVideoDecoder", "getInputBuffers failed", e2);
                    return VideoCodecStatus.ERROR;
                }
            } catch (IllegalStateException e3) {
                Logging.m150049e("AndroidVideoDecoder", "dequeueInputBuffer failed", e3);
                return VideoCodecStatus.ERROR;
            }
        }
    }

    private void deliverTextureFrame(int i, BufferInfo bufferInfo, int i2, Integer num) {
        int i3;
        int i4;
        synchronized (this.dimensionLock) {
            i3 = this.width;
            i4 = this.height;
        }
        synchronized (this.renderedTextureMetadataLock) {
            if (this.renderedTextureMetadata != null) {
                this.codec.releaseOutputBuffer(i, false);
                return;
            }
            this.surfaceTextureHelper.setTextureSize(i3, i4);
            this.surfaceTextureHelper.setFrameRotation(i2);
            this.renderedTextureMetadata = new DecodedTextureMetadata(bufferInfo.presentationTimeUs, num);
            this.codec.releaseOutputBuffer(i, true);
        }
    }

    private void deliverByteFrame(int i, BufferInfo bufferInfo, int i2, Integer num) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        Buffer buffer;
        synchronized (this.dimensionLock) {
            i3 = this.width;
            i4 = this.height;
            i5 = this.stride;
            i6 = this.sliceHeight;
        }
        if (bufferInfo.size < ((i3 * i4) * 3) / 2) {
            StringBuilder sb = new StringBuilder("Insufficient output buffer size: ");
            sb.append(bufferInfo.size);
            Logging.m150048e("AndroidVideoDecoder", sb.toString());
            return;
        }
        if (bufferInfo.size >= ((i5 * i4) * 3) / 2 || i6 != i4 || i5 <= i3) {
            i7 = i5;
        } else {
            i7 = (bufferInfo.size * 2) / (i4 * 3);
        }
        ByteBuffer byteBuffer = this.codec.getOutputBuffers()[i];
        byteBuffer.position(bufferInfo.offset);
        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
        ByteBuffer slice = byteBuffer.slice();
        if (this.colorFormat == 19) {
            buffer = copyI420Buffer(slice, i7, i6, i3, i4);
        } else {
            buffer = copyNV12ToI420Buffer(slice, i7, i6, i3, i4);
        }
        this.codec.releaseOutputBuffer(i, false);
        VideoFrame videoFrame = new VideoFrame(buffer, i2, bufferInfo.presentationTimeUs * 1000);
        this.callback.onDecodedFrame(videoFrame, num, null);
        videoFrame.release();
    }

    private Buffer copyNV12ToI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        NV12Buffer nV12Buffer = new NV12Buffer(i3, i4, i, i2, byteBuffer, null);
        return nV12Buffer.toI420();
    }

    AndroidVideoDecoder(MediaCodecWrapperFactory mediaCodecWrapperFactory2, String str, VideoCodecType videoCodecType, int i, Context context) {
        if (isSupportedColorFormat(i)) {
            StringBuilder sb = new StringBuilder("ctor name: ");
            sb.append(str);
            sb.append(" type: ");
            sb.append(videoCodecType);
            sb.append(" color format: ");
            sb.append(i);
            sb.append(" context: ");
            sb.append(context);
            Logging.m150047d("AndroidVideoDecoder", sb.toString());
            this.mediaCodecWrapperFactory = mediaCodecWrapperFactory2;
            this.codecName = str;
            this.codecType = videoCodecType;
            this.colorFormat = i;
            this.sharedContext = context;
            this.frameInfos = new LinkedBlockingDeque();
            return;
        }
        StringBuilder sb2 = new StringBuilder("Unsupported color format: ");
        sb2.append(i);
        throw new IllegalArgumentException(sb2.toString());
    }

    private Buffer copyI420Buffer(ByteBuffer byteBuffer, int i, int i2, int i3, int i4) {
        int i5;
        ByteBuffer byteBuffer2 = byteBuffer;
        int i6 = i;
        int i7 = i3;
        int i8 = i4;
        if (i6 % 2 == 0) {
            int i9 = (i7 + 1) / 2;
            int i10 = i2 % 2;
            if (i10 == 0) {
                i5 = (i8 + 1) / 2;
            } else {
                i5 = i8 / 2;
            }
            int i11 = i5;
            int i12 = i6 / 2;
            int i13 = (i6 * i8) + 0;
            int i14 = (i6 * i2) + 0;
            int i15 = i12 * i11;
            int i16 = i14 + i15;
            int i17 = i14 + ((i12 * i2) / 2);
            int i18 = i17 + i15;
            I420Buffer allocateI420Buffer = allocateI420Buffer(i7, i8);
            byteBuffer2.limit(i13);
            byteBuffer2.position(0);
            copyPlane(byteBuffer.slice(), i, allocateI420Buffer.getDataY(), allocateI420Buffer.getStrideY(), i3, i4);
            byteBuffer2.limit(i16);
            byteBuffer2.position(i14);
            int i19 = i18;
            copyPlane(byteBuffer.slice(), i12, allocateI420Buffer.getDataU(), allocateI420Buffer.getStrideU(), i9, i11);
            if (i10 == 1) {
                byteBuffer2.position(i14 + ((i11 - 1) * i12));
                ByteBuffer dataU = allocateI420Buffer.getDataU();
                dataU.position(allocateI420Buffer.getStrideU() * i11);
                dataU.put(byteBuffer2);
            }
            byteBuffer2.limit(i19);
            byteBuffer2.position(i17);
            copyPlane(byteBuffer.slice(), i12, allocateI420Buffer.getDataV(), allocateI420Buffer.getStrideV(), i9, i11);
            if (i10 == 1) {
                byteBuffer2.position(i17 + (i12 * (i11 - 1)));
                ByteBuffer dataV = allocateI420Buffer.getDataV();
                dataV.position(allocateI420Buffer.getStrideV() * i11);
                dataV.put(byteBuffer2);
            }
            return allocateI420Buffer;
        }
        StringBuilder sb = new StringBuilder("Stride is not divisible by two: ");
        sb.append(i6);
        throw new AssertionError(sb.toString());
    }

    /* access modifiers changed from: protected */
    public void copyPlane(ByteBuffer byteBuffer, int i, ByteBuffer byteBuffer2, int i2, int i3, int i4) {
        YuvHelper.copyPlane(byteBuffer, i, byteBuffer2, i2, i3, i4);
    }
}
