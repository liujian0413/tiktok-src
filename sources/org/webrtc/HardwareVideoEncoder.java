package org.webrtc;

import android.media.MediaCodec.BufferInfo;
import android.opengl.GLES20;
import android.os.Bundle;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.concurrent.BlockingDeque;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;
import org.webrtc.EglBase14.Context;
import org.webrtc.EncodedImage.Builder;
import org.webrtc.EncodedImage.FrameType;
import org.webrtc.ThreadUtils.ThreadChecker;
import org.webrtc.VideoEncoder.BitrateAllocation;
import org.webrtc.VideoEncoder.Callback;
import org.webrtc.VideoEncoder.CodecSpecificInfo;
import org.webrtc.VideoEncoder.EncodeInfo;
import org.webrtc.VideoEncoder.ScaleMode;
import org.webrtc.VideoEncoder.ScalingSettings;
import org.webrtc.VideoEncoder.Settings;
import org.webrtc.VideoFrame.Buffer;
import org.webrtc.VideoFrame.I420Buffer;
import org.webrtc.VideoFrame.TextureBuffer;

class HardwareVideoEncoder implements VideoEncoder {
    private int adjustedBitrate;
    private boolean automaticResizeOn;
    private final BitrateAdjuster bitrateAdjuster;
    private Callback callback;
    private MediaCodecWrapper codec;
    private final String codecName;
    private final VideoCodecType codecType;
    private ByteBuffer configBuffer;
    private final ThreadChecker encodeThreadChecker = new ThreadChecker();
    private final long forcedKeyFrameNs;
    private int height;
    private final int keyFrameIntervalSec;
    private long lastKeyFrameNs;
    private final MediaCodecWrapperFactory mediaCodecWrapperFactory;
    private final BlockingDeque<Builder> outputBuilders = new LinkedBlockingDeque();
    private Thread outputThread;
    private final ThreadChecker outputThreadChecker = new ThreadChecker();
    private final Map<String, String> params;
    public volatile boolean running;
    private ScaleMode scaleMode;
    private final Context sharedContext;
    private volatile Exception shutdownException;
    private final Integer surfaceColorFormat;
    private final GlRectDrawer textureDrawer = new GlRectDrawer();
    private EglBase14 textureEglBase;
    private Surface textureInputSurface;
    private boolean useSurfaceMode;
    private final VideoFrameDrawer videoFrameDrawer = new VideoFrameDrawer();
    private int width;
    private final Integer yuvColorFormat;
    private final YuvFormat yuvFormat;

    enum YuvFormat {
        I420 {
            /* access modifiers changed from: 0000 */
            public final void fillBuffer(ByteBuffer byteBuffer, Buffer buffer) {
                I420Buffer i420 = buffer.toI420();
                YuvHelper.I420Copy(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        },
        NV12 {
            /* access modifiers changed from: 0000 */
            public final void fillBuffer(ByteBuffer byteBuffer, Buffer buffer) {
                I420Buffer i420 = buffer.toI420();
                YuvHelper.I420ToNV12(i420.getDataY(), i420.getStrideY(), i420.getDataU(), i420.getStrideU(), i420.getDataV(), i420.getStrideV(), byteBuffer, i420.getWidth(), i420.getHeight());
                i420.release();
            }
        };

        /* access modifiers changed from: 0000 */
        public abstract void fillBuffer(ByteBuffer byteBuffer, Buffer buffer);

        static YuvFormat valueOf(int i) {
            if (i == 19) {
                return I420;
            }
            if (i == 21 || i == 2141391872 || i == 2141391876) {
                return NV12;
            }
            StringBuilder sb = new StringBuilder("Unsupported colorFormat: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
    }

    public long createNativeVideoEncoder() {
        return VideoEncoder$$CC.createNativeVideoEncoder(this);
    }

    public String getImplementationName() {
        return "HWEncoder";
    }

    public boolean isHardwareEncoder() {
        return VideoEncoder$$CC.isHardwareEncoder(this);
    }

    private Thread createOutputThread() {
        return new Thread() {
            public void run() {
                while (HardwareVideoEncoder.this.running) {
                    HardwareVideoEncoder.this.deliverEncodedImage();
                }
                HardwareVideoEncoder.this.releaseCodecOnOutputThread();
            }
        };
    }

    private boolean canUseSurface() {
        if (this.sharedContext == null || this.surfaceColorFormat == null) {
            return false;
        }
        return true;
    }

    private VideoCodecStatus updateBitrate() {
        this.outputThreadChecker.checkIsOnValidThread();
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", this.adjustedBitrate);
            this.codec.setParameters(bundle);
            return VideoCodecStatus.OK;
        } catch (IllegalStateException e) {
            Logging.m150049e("HardwareVideoEncoder", "updateBitrate failed", e);
            return VideoCodecStatus.ERROR;
        }
    }

    public ScalingSettings getScalingSettings() {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.automaticResizeOn) {
            if (this.codecType == VideoCodecType.VP8) {
                return new ScalingSettings(29, 95);
            }
            if (this.codecType == VideoCodecType.H264) {
                return new ScalingSettings(24, 37);
            }
        }
        return ScalingSettings.OFF;
    }

    public void releaseCodecOnOutputThread() {
        this.outputThreadChecker.checkIsOnValidThread();
        Logging.m150047d("HardwareVideoEncoder", "Releasing MediaCodec on output thread");
        try {
            this.codec.stop();
        } catch (Exception e) {
            Logging.m150049e("HardwareVideoEncoder", "Media encoder stop failed", e);
        }
        try {
            this.codec.release();
        } catch (Exception e2) {
            Logging.m150049e("HardwareVideoEncoder", "Media encoder release failed", e2);
            this.shutdownException = e2;
        }
        this.configBuffer = null;
        Logging.m150047d("HardwareVideoEncoder", "Release on output thread done");
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0041  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x004c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.webrtc.VideoCodecStatus release() {
        /*
            r3 = this;
            org.webrtc.ThreadUtils$ThreadChecker r0 = r3.encodeThreadChecker
            r0.checkIsOnValidThread()
            java.lang.Thread r0 = r3.outputThread
            if (r0 == 0) goto L_0x0030
            r0 = 0
            r3.running = r0
            java.lang.Thread r0 = r3.outputThread
            r1 = 5000(0x1388, double:2.4703E-320)
            boolean r0 = org.webrtc.ThreadUtils.joinUninterruptibly(r0, r1)
            if (r0 != 0) goto L_0x0020
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "Media encoder release timeout"
            org.webrtc.Logging.m150048e(r0, r1)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.TIMEOUT
            goto L_0x0032
        L_0x0020:
            java.lang.Exception r0 = r3.shutdownException
            if (r0 == 0) goto L_0x0030
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r1 = "Media encoder release exception"
            java.lang.Exception r2 = r3.shutdownException
            org.webrtc.Logging.m150049e(r0, r1, r2)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.ERROR
            goto L_0x0032
        L_0x0030:
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.OK
        L_0x0032:
            org.webrtc.GlRectDrawer r1 = r3.textureDrawer
            r1.release()
            org.webrtc.VideoFrameDrawer r1 = r3.videoFrameDrawer
            r1.release()
            org.webrtc.EglBase14 r1 = r3.textureEglBase
            r2 = 0
            if (r1 == 0) goto L_0x0048
            org.webrtc.EglBase14 r1 = r3.textureEglBase
            r1.release()
            r3.textureEglBase = r2
        L_0x0048:
            android.view.Surface r1 = r3.textureInputSurface
            if (r1 == 0) goto L_0x0053
            android.view.Surface r1 = r3.textureInputSurface
            r1.release()
            r3.textureInputSurface = r2
        L_0x0053:
            java.util.concurrent.BlockingDeque<org.webrtc.EncodedImage$Builder> r1 = r3.outputBuilders
            r1.clear()
            r3.codec = r2
            r3.outputThread = r2
            org.webrtc.ThreadUtils$ThreadChecker r1 = r3.encodeThreadChecker
            r1.detachThread()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.release():org.webrtc.VideoCodecStatus");
    }

    /* JADX WARNING: Removed duplicated region for block: B:28:0x0091 A[Catch:{ IllegalStateException -> 0x0130 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0094 A[Catch:{ IllegalStateException -> 0x0130 }] */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00a6 A[Catch:{ IllegalStateException -> 0x0130 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private org.webrtc.VideoCodecStatus initEncodeInternal() {
        /*
            r7 = this;
            org.webrtc.ThreadUtils$ThreadChecker r0 = r7.encodeThreadChecker
            r0.checkIsOnValidThread()
            r0 = -1
            r7.lastKeyFrameNs = r0
            org.webrtc.MediaCodecWrapperFactory r0 = r7.mediaCodecWrapperFactory     // Catch:{ IOException | IllegalArgumentException -> 0x013e }
            java.lang.String r1 = r7.codecName     // Catch:{ IOException | IllegalArgumentException -> 0x013e }
            org.webrtc.MediaCodecWrapper r0 = r0.createByCodecName(r1)     // Catch:{ IOException | IllegalArgumentException -> 0x013e }
            r7.codec = r0     // Catch:{ IOException | IllegalArgumentException -> 0x013e }
            boolean r0 = r7.useSurfaceMode
            if (r0 == 0) goto L_0x001a
            java.lang.Integer r0 = r7.surfaceColorFormat
            goto L_0x001c
        L_0x001a:
            java.lang.Integer r0 = r7.yuvColorFormat
        L_0x001c:
            int r0 = r0.intValue()
            org.webrtc.VideoCodecType r1 = r7.codecType     // Catch:{ IllegalStateException -> 0x0130 }
            java.lang.String r1 = r1.mimeType()     // Catch:{ IllegalStateException -> 0x0130 }
            int r2 = r7.width     // Catch:{ IllegalStateException -> 0x0130 }
            int r3 = r7.height     // Catch:{ IllegalStateException -> 0x0130 }
            android.media.MediaFormat r1 = android.media.MediaFormat.createVideoFormat(r1, r2, r3)     // Catch:{ IllegalStateException -> 0x0130 }
            java.lang.String r2 = "bitrate"
            int r3 = r7.adjustedBitrate     // Catch:{ IllegalStateException -> 0x0130 }
            r1.setInteger(r2, r3)     // Catch:{ IllegalStateException -> 0x0130 }
            java.lang.String r2 = "bitrate-mode"
            r3 = 1
            r1.setInteger(r2, r3)     // Catch:{ IllegalStateException -> 0x0130 }
            java.lang.String r2 = "color-format"
            r1.setInteger(r2, r0)     // Catch:{ IllegalStateException -> 0x0130 }
            java.lang.String r0 = "frame-rate"
            r2 = 30
            r1.setInteger(r0, r2)     // Catch:{ IllegalStateException -> 0x0130 }
            java.lang.String r0 = "i-frame-interval"
            int r2 = r7.keyFrameIntervalSec     // Catch:{ IllegalStateException -> 0x0130 }
            r1.setInteger(r0, r2)     // Catch:{ IllegalStateException -> 0x0130 }
            java.lang.String r0 = "max-bframes"
            r2 = 0
            r1.setInteger(r0, r2)     // Catch:{ IllegalStateException -> 0x0130 }
            org.webrtc.VideoCodecType r0 = r7.codecType     // Catch:{ IllegalStateException -> 0x0130 }
            org.webrtc.VideoCodecType r4 = org.webrtc.VideoCodecType.H264     // Catch:{ IllegalStateException -> 0x0130 }
            if (r0 != r4) goto L_0x00da
            java.util.Map<java.lang.String, java.lang.String> r0 = r7.params     // Catch:{ IllegalStateException -> 0x0130 }
            java.lang.String r4 = "profile-level-id"
            java.lang.Object r0 = r0.get(r4)     // Catch:{ IllegalStateException -> 0x0130 }
            java.lang.String r0 = (java.lang.String) r0     // Catch:{ IllegalStateException -> 0x0130 }
            if (r0 != 0) goto L_0x0068
            java.lang.String r0 = "42e01f"
        L_0x0068:
            r4 = -1
            int r5 = r0.hashCode()     // Catch:{ IllegalStateException -> 0x0130 }
            r6 = 1537948542(0x5bab3b7e, float:9.6395267E16)
            if (r5 == r6) goto L_0x0081
            r6 = 1595523974(0x5f19c386, float:1.1079847E19)
            if (r5 == r6) goto L_0x0078
            goto L_0x008b
        L_0x0078:
            java.lang.String r5 = "640c1f"
            boolean r5 = r0.equals(r5)     // Catch:{ IllegalStateException -> 0x0130 }
            if (r5 == 0) goto L_0x008b
            goto L_0x008c
        L_0x0081:
            java.lang.String r2 = "42e01f"
            boolean r2 = r0.equals(r2)     // Catch:{ IllegalStateException -> 0x0130 }
            if (r2 == 0) goto L_0x008b
            r2 = 1
            goto L_0x008c
        L_0x008b:
            r2 = -1
        L_0x008c:
            r4 = 256(0x100, float:3.59E-43)
            switch(r2) {
                case 0: goto L_0x00a6;
                case 1: goto L_0x0094;
                default: goto L_0x0091;
            }     // Catch:{ IllegalStateException -> 0x0130 }
        L_0x0091:
            java.lang.String r2 = "HardwareVideoEncoder"
            goto L_0x00ba
        L_0x0094:
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r2 = "setting baseline profile "
            org.webrtc.Logging.m150047d(r0, r2)     // Catch:{ IllegalStateException -> 0x0130 }
            java.lang.String r0 = "profile"
            r1.setInteger(r0, r3)     // Catch:{ IllegalStateException -> 0x0130 }
            java.lang.String r0 = "level"
            r1.setInteger(r0, r4)     // Catch:{ IllegalStateException -> 0x0130 }
            goto L_0x00da
        L_0x00a6:
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.String r2 = "setting high profile "
            org.webrtc.Logging.m150047d(r0, r2)     // Catch:{ IllegalStateException -> 0x0130 }
            java.lang.String r0 = "profile"
            r2 = 8
            r1.setInteger(r0, r2)     // Catch:{ IllegalStateException -> 0x0130 }
            java.lang.String r0 = "level"
            r1.setInteger(r0, r4)     // Catch:{ IllegalStateException -> 0x0130 }
            goto L_0x00da
        L_0x00ba:
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0130 }
            java.lang.String r6 = "Unknown profile level id: "
            r5.<init>(r6)     // Catch:{ IllegalStateException -> 0x0130 }
            r5.append(r0)     // Catch:{ IllegalStateException -> 0x0130 }
            java.lang.String r0 = "default to baseline profile"
            r5.append(r0)     // Catch:{ IllegalStateException -> 0x0130 }
            java.lang.String r0 = r5.toString()     // Catch:{ IllegalStateException -> 0x0130 }
            org.webrtc.Logging.m150051w(r2, r0)     // Catch:{ IllegalStateException -> 0x0130 }
            java.lang.String r0 = "profile"
            r1.setInteger(r0, r3)     // Catch:{ IllegalStateException -> 0x0130 }
            java.lang.String r0 = "level"
            r1.setInteger(r0, r4)     // Catch:{ IllegalStateException -> 0x0130 }
        L_0x00da:
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IllegalStateException -> 0x0130 }
            java.lang.String r4 = "Format: "
            r2.<init>(r4)     // Catch:{ IllegalStateException -> 0x0130 }
            r2.append(r1)     // Catch:{ IllegalStateException -> 0x0130 }
            java.lang.String r2 = r2.toString()     // Catch:{ IllegalStateException -> 0x0130 }
            org.webrtc.Logging.m150047d(r0, r2)     // Catch:{ IllegalStateException -> 0x0130 }
            org.webrtc.MediaCodecWrapper r0 = r7.codec     // Catch:{ IllegalStateException -> 0x0130 }
            r2 = 0
            r0.configure(r1, r2, r2, r3)     // Catch:{ IllegalStateException -> 0x0130 }
            boolean r0 = r7.useSurfaceMode     // Catch:{ IllegalStateException -> 0x0130 }
            if (r0 == 0) goto L_0x0116
            org.webrtc.EglBase14 r0 = new org.webrtc.EglBase14     // Catch:{ IllegalStateException -> 0x0130 }
            org.webrtc.EglBase14$Context r1 = r7.sharedContext     // Catch:{ IllegalStateException -> 0x0130 }
            int[] r2 = org.webrtc.EglBase.CONFIG_RECORDABLE     // Catch:{ IllegalStateException -> 0x0130 }
            r0.<init>(r1, r2)     // Catch:{ IllegalStateException -> 0x0130 }
            r7.textureEglBase = r0     // Catch:{ IllegalStateException -> 0x0130 }
            org.webrtc.MediaCodecWrapper r0 = r7.codec     // Catch:{ IllegalStateException -> 0x0130 }
            android.view.Surface r0 = r0.createInputSurface()     // Catch:{ IllegalStateException -> 0x0130 }
            r7.textureInputSurface = r0     // Catch:{ IllegalStateException -> 0x0130 }
            org.webrtc.EglBase14 r0 = r7.textureEglBase     // Catch:{ IllegalStateException -> 0x0130 }
            android.view.Surface r1 = r7.textureInputSurface     // Catch:{ IllegalStateException -> 0x0130 }
            r0.createSurface(r1)     // Catch:{ IllegalStateException -> 0x0130 }
            org.webrtc.EglBase14 r0 = r7.textureEglBase     // Catch:{ IllegalStateException -> 0x0130 }
            r0.makeCurrent()     // Catch:{ IllegalStateException -> 0x0130 }
        L_0x0116:
            org.webrtc.MediaCodecWrapper r0 = r7.codec     // Catch:{ IllegalStateException -> 0x0130 }
            r0.start()     // Catch:{ IllegalStateException -> 0x0130 }
            r7.running = r3
            org.webrtc.ThreadUtils$ThreadChecker r0 = r7.outputThreadChecker
            r0.detachThread()
            java.lang.Thread r0 = r7.createOutputThread()
            r7.outputThread = r0
            java.lang.Thread r0 = r7.outputThread
            r0.start()
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.OK
            return r0
        L_0x0130:
            r0 = move-exception
            java.lang.String r1 = "HardwareVideoEncoder"
            java.lang.String r2 = "initEncodeInternal failed"
            org.webrtc.Logging.m150049e(r1, r2, r0)
            r7.release()
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.FALLBACK_SOFTWARE
            return r0
        L_0x013e:
            java.lang.String r0 = "HardwareVideoEncoder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Cannot create media encoder "
            r1.<init>(r2)
            java.lang.String r2 = r7.codecName
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            org.webrtc.Logging.m150048e(r0, r1)
            org.webrtc.VideoCodecStatus r0 = org.webrtc.VideoCodecStatus.FALLBACK_SOFTWARE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: org.webrtc.HardwareVideoEncoder.initEncodeInternal():org.webrtc.VideoCodecStatus");
    }

    /* access modifiers changed from: protected */
    public void deliverEncodedImage() {
        ByteBuffer byteBuffer;
        FrameType frameType;
        this.outputThreadChecker.checkIsOnValidThread();
        try {
            BufferInfo bufferInfo = new BufferInfo();
            int dequeueOutputBuffer = this.codec.dequeueOutputBuffer(bufferInfo, 100000);
            if (dequeueOutputBuffer >= 0) {
                ByteBuffer byteBuffer2 = this.codec.getOutputBuffers()[dequeueOutputBuffer];
                byteBuffer2.position(bufferInfo.offset);
                byteBuffer2.limit(bufferInfo.offset + bufferInfo.size);
                if ((bufferInfo.flags & 2) != 0) {
                    StringBuilder sb = new StringBuilder("Config frame generated. Offset: ");
                    sb.append(bufferInfo.offset);
                    sb.append(". Size: ");
                    sb.append(bufferInfo.size);
                    Logging.m150047d("HardwareVideoEncoder", sb.toString());
                    this.configBuffer = ByteBuffer.allocateDirect(bufferInfo.size);
                    this.configBuffer.put(byteBuffer2);
                } else {
                    this.bitrateAdjuster.reportEncodedFrame(bufferInfo.size);
                    if (this.adjustedBitrate != this.bitrateAdjuster.getAdjustedBitrateBps()) {
                        updateBitrate();
                    }
                    boolean z = true;
                    if ((bufferInfo.flags & 1) == 0) {
                        z = false;
                    }
                    if (z) {
                        Logging.m150047d("HardwareVideoEncoder", "Sync frame generated");
                    }
                    if (!z || this.codecType != VideoCodecType.H264) {
                        byteBuffer = byteBuffer2.slice();
                    } else {
                        StringBuilder sb2 = new StringBuilder("Prepending config frame of size ");
                        sb2.append(this.configBuffer.capacity());
                        sb2.append(" to output buffer with offset ");
                        sb2.append(bufferInfo.offset);
                        sb2.append(", size ");
                        sb2.append(bufferInfo.size);
                        Logging.m150047d("HardwareVideoEncoder", sb2.toString());
                        byteBuffer = ByteBuffer.allocateDirect(bufferInfo.size + this.configBuffer.capacity());
                        this.configBuffer.rewind();
                        byteBuffer.put(this.configBuffer);
                        byteBuffer.put(byteBuffer2);
                        byteBuffer.rewind();
                    }
                    if (z) {
                        frameType = FrameType.VideoFrameKey;
                    } else {
                        frameType = FrameType.VideoFrameDelta;
                    }
                    Builder builder = (Builder) this.outputBuilders.poll();
                    builder.setBuffer(byteBuffer).setFrameType(frameType);
                    this.callback.onEncodedFrame(builder.createEncodedImage(), new CodecSpecificInfo());
                }
                this.codec.releaseOutputBuffer(dequeueOutputBuffer, false);
            }
        } catch (IllegalStateException e) {
            Logging.m150049e("HardwareVideoEncoder", "deliverOutput failed", e);
        }
    }

    private boolean shouldForceKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.forcedKeyFrameNs <= 0 || j <= this.lastKeyFrameNs + this.forcedKeyFrameNs) {
            return false;
        }
        return true;
    }

    private VideoCodecStatus encodeTextureBuffer(VideoFrame videoFrame) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            GLES20.glClear(16384);
            this.videoFrameDrawer.drawFrame(new VideoFrame(videoFrame.getBuffer(), 0, videoFrame.getTimestampNs()), this.textureDrawer, null);
            this.textureEglBase.swapBuffers(videoFrame.getTimestampNs());
            return VideoCodecStatus.OK;
        } catch (RuntimeException e) {
            Logging.m150049e("HardwareVideoEncoder", "encodeTexture failed", e);
            return VideoCodecStatus.ERROR;
        }
    }

    private void requestKeyFrame(long j) {
        this.encodeThreadChecker.checkIsOnValidThread();
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.codec.setParameters(bundle);
            this.lastKeyFrameNs = j;
        } catch (IllegalStateException e) {
            Logging.m150049e("HardwareVideoEncoder", "requestKeyFrame failed", e);
        }
    }

    /* access modifiers changed from: protected */
    public void fillInputBuffer(ByteBuffer byteBuffer, Buffer buffer) {
        this.yuvFormat.fillBuffer(byteBuffer, buffer);
    }

    public VideoCodecStatus setRateAllocation(BitrateAllocation bitrateAllocation, int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        if (i > 30) {
            i = 30;
        }
        this.bitrateAdjuster.setTargets(bitrateAllocation.getSum(), i);
        return VideoCodecStatus.OK;
    }

    public VideoCodecStatus initEncode(Settings settings, Callback callback2) {
        this.encodeThreadChecker.checkIsOnValidThread();
        this.callback = callback2;
        this.automaticResizeOn = settings.automaticResizeOn;
        this.width = settings.width;
        this.height = settings.height;
        this.scaleMode = settings.scaleMode;
        this.useSurfaceMode = canUseSurface();
        if (!(settings.startBitrate == 0 || settings.maxFramerate == 0)) {
            this.bitrateAdjuster.setTargets(settings.startBitrate * 1000, settings.maxFramerate);
        }
        this.adjustedBitrate = this.bitrateAdjuster.getAdjustedBitrateBps();
        StringBuilder sb = new StringBuilder("initEncode: ");
        sb.append(this.width);
        sb.append(" x ");
        sb.append(this.height);
        sb.append(". @ ");
        sb.append(settings.startBitrate);
        sb.append("kbps. Fps: ");
        sb.append(settings.maxFramerate);
        sb.append(" Use surface mode: ");
        sb.append(this.useSurfaceMode);
        Logging.m150047d("HardwareVideoEncoder", sb.toString());
        return initEncodeInternal();
    }

    public VideoCodecStatus encode(VideoFrame videoFrame, EncodeInfo encodeInfo) {
        boolean z;
        Buffer buffer;
        Buffer buffer2;
        VideoCodecStatus videoCodecStatus;
        this.encodeThreadChecker.checkIsOnValidThread();
        if (this.codec == null) {
            return VideoCodecStatus.UNINITIALIZED;
        }
        Buffer buffer3 = videoFrame.getBuffer();
        boolean z2 = buffer3 instanceof TextureBuffer;
        int width2 = videoFrame.getBuffer().getWidth();
        int height2 = videoFrame.getBuffer().getHeight();
        if (!canUseSurface() || !z2) {
            z = false;
        } else {
            z = true;
        }
        if (z != this.useSurfaceMode) {
            VideoCodecStatus resetCodec = resetCodec(width2, height2, z);
            if (resetCodec != VideoCodecStatus.OK) {
                return resetCodec;
            }
        }
        if (!z2 || (width2 == this.width && height2 == this.height)) {
            buffer = buffer3;
            buffer2 = null;
        } else {
            int i = this.width;
            int i2 = this.height;
            if (this.scaleMode == ScaleMode.AUTO || this.scaleMode == ScaleMode.FIT_WITH_CROPPING) {
                int min = Math.min(width2, (this.width * height2) / this.height);
                int min2 = Math.min(height2, (this.height * width2) / this.width);
                buffer2 = buffer3.cropAndScale((width2 - min) / 2, (height2 - min2) / 2, min, min2, i, i2);
            } else if (this.scaleMode == ScaleMode.FIT_WITH_FILLING) {
                buffer2 = buffer3.scaleAndFill(i, i2, (i - Math.min(i, (width2 * i2) / height2)) / 2, (i2 - Math.min(i2, (height2 * i) / width2)) / 2);
            } else {
                buffer2 = null;
            }
            buffer = buffer2;
        }
        if (this.outputBuilders.size() > 2) {
            Logging.m150048e("HardwareVideoEncoder", "Dropped frame, encoder queue full");
            if (buffer2 != null) {
                buffer2.release();
            }
            return VideoCodecStatus.NO_OUTPUT;
        }
        boolean z3 = false;
        for (FrameType frameType : encodeInfo.frameTypes) {
            if (frameType == FrameType.VideoFrameKey) {
                z3 = true;
            }
        }
        if (z3) {
            Logging.m150047d("HardwareVideoEncoder", "***** Request key frame ****");
        }
        if (z3 || shouldForceKeyFrame(videoFrame.getTimestampNs())) {
            requestKeyFrame(videoFrame.getTimestampNs());
        }
        int height3 = ((buffer.getHeight() * buffer.getWidth()) * 3) / 2;
        this.outputBuilders.offer(EncodedImage.builder().setCaptureTimeNs(videoFrame.getTimestampNs()).setCompleteFrame(true).setEncodedWidth(videoFrame.getBuffer().getWidth()).setEncodedHeight(videoFrame.getBuffer().getHeight()).setRotation(videoFrame.getRotation()));
        if (this.useSurfaceMode) {
            this.textureEglBase.makeCurrent();
            videoCodecStatus = encodeTextureBuffer(videoFrame);
        } else {
            videoCodecStatus = encodeByteBuffer(videoFrame, buffer, height3);
        }
        if (videoCodecStatus != VideoCodecStatus.OK) {
            this.outputBuilders.pollLast();
        }
        if (buffer2 != null) {
            buffer2.release();
        }
        return videoCodecStatus;
    }

    private VideoCodecStatus resetCodec(int i, int i2, boolean z) {
        this.encodeThreadChecker.checkIsOnValidThread();
        VideoCodecStatus release = release();
        if (release != VideoCodecStatus.OK) {
            return release;
        }
        this.width = i;
        this.height = i2;
        this.useSurfaceMode = z;
        return initEncodeInternal();
    }

    private VideoCodecStatus encodeByteBuffer(VideoFrame videoFrame, Buffer buffer, int i) {
        this.encodeThreadChecker.checkIsOnValidThread();
        long timestampNs = (videoFrame.getTimestampNs() + 500) / 1000;
        try {
            int dequeueInputBuffer = this.codec.dequeueInputBuffer(0);
            if (dequeueInputBuffer == -1) {
                Logging.m150047d("HardwareVideoEncoder", "Dropped frame, no input buffers available");
                return VideoCodecStatus.NO_OUTPUT;
            }
            try {
                fillInputBuffer(this.codec.getInputBuffers()[dequeueInputBuffer], buffer);
                try {
                    this.codec.queueInputBuffer(dequeueInputBuffer, 0, i, timestampNs, 0);
                    return VideoCodecStatus.OK;
                } catch (IllegalStateException e) {
                    Logging.m150049e("HardwareVideoEncoder", "queueInputBuffer failed", e);
                    return VideoCodecStatus.ERROR;
                }
            } catch (IllegalStateException e2) {
                Logging.m150049e("HardwareVideoEncoder", "getInputBuffers failed", e2);
                return VideoCodecStatus.ERROR;
            }
        } catch (IllegalStateException e3) {
            Logging.m150049e("HardwareVideoEncoder", "dequeueInputBuffer failed", e3);
            return VideoCodecStatus.ERROR;
        }
    }

    public HardwareVideoEncoder(MediaCodecWrapperFactory mediaCodecWrapperFactory2, String str, VideoCodecType videoCodecType, Integer num, Integer num2, Map<String, String> map, int i, int i2, BitrateAdjuster bitrateAdjuster2, Context context) {
        this.mediaCodecWrapperFactory = mediaCodecWrapperFactory2;
        this.codecName = str;
        this.codecType = videoCodecType;
        this.surfaceColorFormat = num;
        this.yuvColorFormat = num2;
        this.yuvFormat = YuvFormat.valueOf(num2.intValue());
        this.params = map;
        this.keyFrameIntervalSec = i;
        this.forcedKeyFrameNs = TimeUnit.MILLISECONDS.toNanos((long) i2);
        this.bitrateAdjuster = bitrateAdjuster2;
        this.sharedContext = context;
        this.encodeThreadChecker.detachThread();
    }
}
