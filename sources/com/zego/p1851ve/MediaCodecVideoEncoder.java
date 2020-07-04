package com.zego.p1851ve;

import android.media.Image.Plane;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaFormat;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.Surface;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.zego.ve.MediaCodecVideoEncoder */
public class MediaCodecVideoEncoder {
    private static final String[] H264_HW_EXCEPTION_MODELS = {"SAMSUNG-SGH-I337", "Nexus 7", "Nexus 4", "EML-AL00", "XT1079", "PACM00", "SM-G9250"};
    private static final String[] HW_BLACKLISTS = {"omx.google.", "omx.ffmpeg.", "omx.pv", "omx.k3.ffmpeg.", "omx.avcodec.", "omx.ittiam.", "omx.sec.avc.sw.", "omx.marvell.video.h264encoder"};
    private static int codecErrors;
    private static boolean enableWhitelist = true;
    private static MediaCodecVideoEncoderErrorCallback errorCallback;
    private static final MediaCodecProperties exynosH264HwProperties = new MediaCodecProperties("OMX.Exynos.", 21, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties exynosVp8HwProperties = new MediaCodecProperties("OMX.Exynos.", 23, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties freescaleH264HwProperties = new MediaCodecProperties("OMX.Freescale.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties[] h264HwList = {qcomH264HwProperties, exynosH264HwProperties, mtkH264HwProperties, kirinH264HwProperties, kirin960H264HwProperties, tiH264HwProperties, intelH264HwProperties, nvidiaH264HwProperties, rkH264HwProperties, winnerH264HwProperties, mstarH264HwProperties, freescaleH264HwProperties, sprdH264HwProperties};
    private static final MediaCodecProperties[] hevcHwList = {qcomHEVCHwProperties, kirin960HEVCHwProperties, kirinHEVCHwProperties, mtkHEVCHwProperties};
    private static Set<String> hwEncoderDisabledTypes = new HashSet();
    private static final MediaCodecProperties intelH264HwProperties = new MediaCodecProperties("OMX.Intel.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties intelVp8HwProperties = new MediaCodecProperties("OMX.Intel.", 21, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties kirin960H264HwProperties = new MediaCodecProperties("OMX.hisi.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties kirin960HEVCHwProperties = new MediaCodecProperties("OMX.hisi.", 21, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties kirinH264HwProperties = new MediaCodecProperties("OMX.IMG.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties kirinHEVCHwProperties = new MediaCodecProperties("OMX.IMG.", 21, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties mstarH264HwProperties = new MediaCodecProperties("OMX.MS.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties mtkH264HwProperties = new MediaCodecProperties("OMX.MTK.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties mtkHEVCHwProperties = new MediaCodecProperties("OMX.MTK.", 21, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties nvidiaH264HwProperties = new MediaCodecProperties("OMX.Nvidia.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties qcomH264HwProperties = new MediaCodecProperties("OMX.qcom.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties qcomHEVCHwProperties = new MediaCodecProperties("OMX.qcom.", 21, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties qcomVp8HwProperties = new MediaCodecProperties("OMX.qcom.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties rkH264HwProperties = new MediaCodecProperties("OMX.rk.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static MediaCodecVideoEncoder runningInstance;
    private static final MediaCodecProperties sprdH264HwProperties = new MediaCodecProperties("OMX.sprd.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final int[] supportedColorList = {21, 2135033992, 2141391872, 2141391876, 19, 20, 2130706688, 2130708361};
    private static final int[] supportedSurfaceColorList = {2130708361};
    private static final MediaCodecProperties tiH264HwProperties = new MediaCodecProperties("OMX.TI.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private static final MediaCodecProperties[] vp8HwList = {qcomVp8HwProperties, exynosVp8HwProperties, intelVp8HwProperties};
    private static final MediaCodecProperties winnerH264HwProperties = new MediaCodecProperties("OMX.allwinner.", 19, BitrateAdjustmentType.NO_ADJUSTMENT);
    private double bitrateAccumulator;
    private double bitrateAccumulatorMax;
    private int bitrateAdjustmentScaleExp;
    private BitrateAdjustmentType bitrateAdjustmentType = BitrateAdjustmentType.NO_ADJUSTMENT;
    private double bitrateObservationTimeMs;
    private VImage cacheImage = new VImage();
    private int colorFormat;
    private ByteBuffer configData;
    private long forcedKeyFrameMs;
    private int height;
    private ByteBuffer[] inputBuffers;
    private Surface inputSurface;
    private long lastKeyFrameMs;
    public MediaCodec mediaCodec;
    private Thread mediaCodecThread;
    private int originFps;
    private ByteBuffer[] outputBuffers;
    private int sliceHeight;
    private int stride;
    private int targetBitrateBps;
    private int targetFps;
    private VideoCodecType type;
    private int width;

    /* renamed from: com.zego.ve.MediaCodecVideoEncoder$BitrateAdjustmentType */
    public enum BitrateAdjustmentType {
        NO_ADJUSTMENT,
        FRAMERATE_ADJUSTMENT,
        DYNAMIC_ADJUSTMENT
    }

    /* renamed from: com.zego.ve.MediaCodecVideoEncoder$EncoderProperties */
    static class EncoderProperties {
        public final BitrateAdjustmentType bitrateAdjustmentType;
        public final String codecName;
        public final int colorFormat;
        public final boolean supportedCBR;

        public EncoderProperties(String str, int i, BitrateAdjustmentType bitrateAdjustmentType2, boolean z) {
            this.codecName = str;
            this.colorFormat = i;
            this.bitrateAdjustmentType = bitrateAdjustmentType2;
            this.supportedCBR = z;
        }
    }

    /* renamed from: com.zego.ve.MediaCodecVideoEncoder$MediaCodecProperties */
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

    /* renamed from: com.zego.ve.MediaCodecVideoEncoder$MediaCodecVideoEncoderErrorCallback */
    public interface MediaCodecVideoEncoderErrorCallback {
        void onMediaCodecVideoEncoderCriticalError(int i);
    }

    /* renamed from: com.zego.ve.MediaCodecVideoEncoder$OutputBufferInfo */
    static class OutputBufferInfo {
        public final ByteBuffer buffer;
        public final int index;
        public final boolean isKeyFrame;
        public final long presentationTimestampUs;
        public final int size;

        public OutputBufferInfo(int i, ByteBuffer byteBuffer, int i2, boolean z, long j) {
            this.index = i;
            this.buffer = byteBuffer;
            this.size = i2;
            this.isKeyFrame = z;
            this.presentationTimestampUs = j;
        }
    }

    /* renamed from: com.zego.ve.MediaCodecVideoEncoder$VImage */
    static class VImage {
        public boolean isI420;
        public ByteBuffer uBuffer;
        public int uStride;
        public ByteBuffer vBuffer;
        public int vStride;
        public ByteBuffer yBuffer;
        public int yStride;

        private VImage() {
        }
    }

    /* renamed from: com.zego.ve.MediaCodecVideoEncoder$VideoCodecType */
    public enum VideoCodecType {
        VIDEO_CODEC_H264_AVC,
        VIDEO_CODEC_H264_AVC_MULTILAYER,
        VIDEO_CODEC_H265,
        VIDEO_CODEC_VP8
    }

    public static boolean isVp8HwSupported(boolean z) {
        return false;
    }

    public static void disableH264HwCodec() {
        hwEncoderDisabledTypes.add("video/avc");
    }

    public static void disableHEVCHwCodec() {
        hwEncoderDisabledTypes.add("video/hevc");
    }

    public static void disableVp8HwCodec() {
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp8");
    }

    public static void disableVp9HwCodec() {
        hwEncoderDisabledTypes.add("video/x-vnd.on2.vp9");
    }

    public static String getCodecName() {
        return findHwEncoder("video/avc", h264HwList, supportedColorList).codecName;
    }

    /* access modifiers changed from: 0000 */
    public int dequeueInputBuffer() {
        checkOnMediaCodecThread();
        try {
            return this.mediaCodec.dequeueInputBuffer(0);
        } catch (IllegalStateException unused) {
            return -2;
        }
    }

    public static boolean isH264HwSupportedUsingTextures() {
        if (hwEncoderDisabledTypes.contains("video/avc") || findHwEncoder("video/avc", h264HwList, supportedSurfaceColorList) == null) {
            return false;
        }
        return true;
    }

    public static void printStackTrace() {
        if (runningInstance != null && runningInstance.mediaCodecThread != null) {
            runningInstance.mediaCodecThread.getStackTrace();
        }
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

    /* access modifiers changed from: 0000 */
    public void release() {
        if (this.mediaCodecThread != null) {
            checkOnMediaCodecThread();
            if (this.mediaCodec != null) {
                if (this.inputSurface != null) {
                    this.mediaCodec.signalEndOfInputStream();
                    this.inputSurface.release();
                    this.inputSurface = null;
                } else {
                    this.mediaCodec.flush();
                }
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            MediaCodecVideoEncoder.this.mediaCodec.stop();
                            MediaCodecVideoEncoder.this.mediaCodec.release();
                            MediaCodecVideoEncoder.this.mediaCodec = null;
                        } catch (Exception unused) {
                        }
                        countDownLatch.countDown();
                    }
                }).start();
                if (!ThreadUtils.awaitUninterruptibly(countDownLatch, DouPlusShareGuideExperiment.MIN_VALID_DURATION)) {
                    codecErrors++;
                    if (errorCallback != null) {
                        errorCallback.onMediaCodecVideoEncoderCriticalError(codecErrors);
                    }
                }
            }
            this.mediaCodecThread = null;
            runningInstance = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public OutputBufferInfo dequeueOutputBuffer() {
        boolean z;
        boolean z2;
        checkOnMediaCodecThread();
        try {
            BufferInfo bufferInfo = new BufferInfo();
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
            if (dequeueOutputBuffer >= 0) {
                if ((bufferInfo.flags & 2) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.configData = ByteBuffer.allocateDirect(bufferInfo.size);
                    ByteBuffer byteBuffer = getByteBuffer(false, dequeueOutputBuffer);
                    byteBuffer.position(bufferInfo.offset);
                    byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                    this.configData.put(byteBuffer);
                    this.mediaCodec.releaseOutputBuffer(dequeueOutputBuffer, false);
                    dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, 0);
                }
            }
            int i = dequeueOutputBuffer;
            if (i >= 0) {
                ByteBuffer duplicate = getByteBuffer(false, i).duplicate();
                duplicate.position(bufferInfo.offset);
                duplicate.limit(bufferInfo.offset + bufferInfo.size);
                reportEncodedFrame(bufferInfo.size);
                if ((bufferInfo.flags & 1) != 0) {
                    z = true;
                } else {
                    z = false;
                }
                OutputBufferInfo outputBufferInfo = new OutputBufferInfo(i, duplicate.slice(), bufferInfo.size, z, bufferInfo.presentationTimeUs);
                return outputBufferInfo;
            } else if (i == -3) {
                if (VERSION.SDK_INT < 21) {
                    this.outputBuffers = this.mediaCodec.getOutputBuffers();
                }
                return dequeueOutputBuffer();
            } else if (i == -2) {
                return dequeueOutputBuffer();
            } else {
                if (i == -1) {
                    return null;
                }
                StringBuilder sb = new StringBuilder("dequeueOutputBuffer: ");
                sb.append(i);
                throw new RuntimeException(sb.toString());
            }
        } catch (IllegalStateException unused) {
            OutputBufferInfo outputBufferInfo2 = new OutputBufferInfo(-1, null, -1, false, -1);
            return outputBufferInfo2;
        }
    }

    public static void setErrorCallback(MediaCodecVideoEncoderErrorCallback mediaCodecVideoEncoderErrorCallback) {
        errorCallback = mediaCodecVideoEncoderErrorCallback;
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
        return Math.pow(2.0d, d / 10.0d);
    }

    /* access modifiers changed from: 0000 */
    public boolean releaseOutputBuffer(int i) {
        checkOnMediaCodecThread();
        try {
            this.mediaCodec.releaseOutputBuffer(i, false);
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    public static boolean isH264HwSupported(boolean z) {
        enableWhitelist = z;
        if (hwEncoderDisabledTypes.contains("video/avc") || findHwEncoder("video/avc", h264HwList, supportedColorList) == null) {
            return false;
        }
        return true;
    }

    public static boolean isHEVCHwSupported(boolean z) {
        enableWhitelist = z;
        if (hwEncoderDisabledTypes.contains("video/hevc") || findHwEncoder("video/hevc", hevcHwList, supportedColorList) == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    public VImage getImage(int i) {
        Plane[] planes = this.mediaCodec.getInputImage(i).getPlanes();
        this.cacheImage.yBuffer = planes[0].getBuffer();
        this.cacheImage.yStride = planes[0].getRowStride();
        this.cacheImage.uBuffer = planes[1].getBuffer();
        this.cacheImage.uStride = planes[1].getRowStride();
        this.cacheImage.vBuffer = planes[2].getBuffer();
        this.cacheImage.vStride = planes[2].getRowStride();
        if (planes[1].getPixelStride() == 1 && planes[2].getPixelStride() == 1) {
            this.cacheImage.isI420 = true;
        } else {
            this.cacheImage.isI420 = false;
        }
        return this.cacheImage;
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
                    this.bitrateAdjustmentScaleExp = Math.min(this.bitrateAdjustmentScaleExp, 10);
                    this.bitrateAdjustmentScaleExp = Math.max(this.bitrateAdjustmentScaleExp, -10);
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
            Bundle bundle = new Bundle();
            bundle.putInt("request-sync", 0);
            this.mediaCodec.setParameters(bundle);
            this.lastKeyFrameMs = j2;
        }
    }

    /* access modifiers changed from: 0000 */
    public ByteBuffer getByteBuffer(boolean z, int i) {
        if (VERSION.SDK_INT >= 21) {
            if (z) {
                return this.mediaCodec.getInputBuffer(i);
            }
            return this.mediaCodec.getOutputBuffer(i);
        } else if (z) {
            return this.inputBuffers[i];
        } else {
            return this.outputBuffers[i];
        }
    }

    private boolean setRates(int i, int i2) {
        checkOnMediaCodecThread();
        if (this.bitrateAdjustmentType == BitrateAdjustmentType.DYNAMIC_ADJUSTMENT) {
            double d = (double) i;
            Double.isNaN(d);
            this.bitrateAccumulatorMax = d / 8.0d;
            if (this.targetBitrateBps > 0 && i < this.targetBitrateBps) {
                double d2 = this.bitrateAccumulator;
                Double.isNaN(d);
                double d3 = d2 * d;
                double d4 = (double) this.targetBitrateBps;
                Double.isNaN(d4);
                this.bitrateAccumulator = d3 / d4;
            }
        }
        this.targetBitrateBps = i;
        this.targetFps = i2;
        if (this.bitrateAdjustmentType == BitrateAdjustmentType.FRAMERATE_ADJUSTMENT && this.targetFps > 0) {
            i = (this.originFps * this.targetBitrateBps) / this.targetFps;
        } else if (this.bitrateAdjustmentType == BitrateAdjustmentType.DYNAMIC_ADJUSTMENT && this.bitrateAdjustmentScaleExp != 0) {
            double d5 = (double) i;
            double bitrateScale = getBitrateScale(this.bitrateAdjustmentScaleExp);
            Double.isNaN(d5);
            i = (int) (d5 * bitrateScale);
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putInt("video-bitrate", i);
            this.mediaCodec.setParameters(bundle);
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00c1, code lost:
        if (r0.isBitrateModeSupported(2) != false) goto L_0x00c5;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.zego.p1851ve.MediaCodecVideoEncoder.EncoderProperties findHwEncoder(java.lang.String r16, com.zego.p1851ve.MediaCodecVideoEncoder.MediaCodecProperties[] r17, int[] r18) {
        /*
            r0 = r16
            r1 = r17
            r2 = r18
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r5 = 19
            if (r3 >= r5) goto L_0x000e
            return r4
        L_0x000e:
            java.lang.String r3 = "video/avc"
            boolean r3 = r0.equals(r3)
            if (r3 == 0) goto L_0x0025
            java.lang.String[] r3 = H264_HW_EXCEPTION_MODELS
            java.util.List r3 = java.util.Arrays.asList(r3)
            java.lang.String r5 = android.os.Build.MODEL
            boolean r3 = r3.contains(r5)
            if (r3 == 0) goto L_0x0025
            return r4
        L_0x0025:
            r5 = 0
        L_0x0026:
            int r6 = android.media.MediaCodecList.getCodecCount()
            if (r5 >= r6) goto L_0x00d5
            android.media.MediaCodecInfo r6 = android.media.MediaCodecList.getCodecInfoAt(r5)     // Catch:{ IllegalArgumentException -> 0x0031 }
            goto L_0x0032
        L_0x0031:
            r6 = r4
        L_0x0032:
            if (r6 == 0) goto L_0x00d1
            boolean r7 = r6.isEncoder()
            if (r7 == 0) goto L_0x00d1
            java.lang.String[] r7 = r6.getSupportedTypes()
            int r8 = r7.length
            r9 = 0
        L_0x0040:
            if (r9 >= r8) goto L_0x0052
            r10 = r7[r9]
            boolean r10 = r10.equals(r0)
            if (r10 == 0) goto L_0x004f
            java.lang.String r7 = r6.getName()
            goto L_0x0053
        L_0x004f:
            int r9 = r9 + 1
            goto L_0x0040
        L_0x0052:
            r7 = r4
        L_0x0053:
            if (r7 == 0) goto L_0x00d1
            com.zego.ve.MediaCodecVideoEncoder$BitrateAdjustmentType r8 = com.zego.p1851ve.MediaCodecVideoEncoder.BitrateAdjustmentType.NO_ADJUSTMENT
            boolean r9 = enableWhitelist
            r10 = 1
            if (r9 == 0) goto L_0x007f
            int r9 = r1.length
            r11 = 0
        L_0x005e:
            if (r11 >= r9) goto L_0x007d
            r12 = r1[r11]
            java.lang.String r13 = r12.codecPrefix
            boolean r13 = r7.startsWith(r13)
            if (r13 == 0) goto L_0x007a
            int r13 = android.os.Build.VERSION.SDK_INT
            int r14 = r12.minSdk
            if (r13 < r14) goto L_0x007a
            com.zego.ve.MediaCodecVideoEncoder$BitrateAdjustmentType r9 = r12.bitrateAdjustmentType
            com.zego.ve.MediaCodecVideoEncoder$BitrateAdjustmentType r11 = com.zego.p1851ve.MediaCodecVideoEncoder.BitrateAdjustmentType.NO_ADJUSTMENT
            if (r9 == r11) goto L_0x0078
            com.zego.ve.MediaCodecVideoEncoder$BitrateAdjustmentType r8 = r12.bitrateAdjustmentType
        L_0x0078:
            r9 = 1
            goto L_0x0098
        L_0x007a:
            int r11 = r11 + 1
            goto L_0x005e
        L_0x007d:
            r9 = 0
            goto L_0x0098
        L_0x007f:
            java.lang.String r9 = r7.toLowerCase()
            java.lang.String[] r11 = HW_BLACKLISTS
            int r12 = r11.length
            r13 = 0
        L_0x0087:
            if (r13 >= r12) goto L_0x0096
            r14 = r11[r13]
            boolean r14 = r9.startsWith(r14)
            if (r14 == 0) goto L_0x0093
            r9 = 1
            goto L_0x0097
        L_0x0093:
            int r13 = r13 + 1
            goto L_0x0087
        L_0x0096:
            r9 = 0
        L_0x0097:
            r9 = r9 ^ r10
        L_0x0098:
            if (r9 == 0) goto L_0x00d1
            android.media.MediaCodecInfo$CodecCapabilities r6 = r6.getCapabilitiesForType(r0)     // Catch:{ IllegalArgumentException -> 0x00d1 }
            int[] r9 = r6.colorFormats
            int r9 = r2.length
            r11 = 0
        L_0x00a2:
            if (r11 >= r9) goto L_0x00d1
            r12 = r2[r11]
            int[] r13 = r6.colorFormats
            int r14 = r13.length
            r15 = 0
        L_0x00aa:
            if (r15 >= r14) goto L_0x00ce
            r3 = r13[r15]
            if (r3 != r12) goto L_0x00cb
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 21
            if (r0 < r1) goto L_0x00c4
            android.media.MediaCodecInfo$EncoderCapabilities r0 = r6.getEncoderCapabilities()
            if (r0 == 0) goto L_0x00c4
            r1 = 2
            boolean r0 = r0.isBitrateModeSupported(r1)
            if (r0 == 0) goto L_0x00c4
            goto L_0x00c5
        L_0x00c4:
            r10 = 0
        L_0x00c5:
            com.zego.ve.MediaCodecVideoEncoder$EncoderProperties r0 = new com.zego.ve.MediaCodecVideoEncoder$EncoderProperties
            r0.<init>(r7, r3, r8, r10)
            return r0
        L_0x00cb:
            int r15 = r15 + 1
            goto L_0x00aa
        L_0x00ce:
            int r11 = r11 + 1
            goto L_0x00a2
        L_0x00d1:
            int r5 = r5 + 1
            goto L_0x0026
        L_0x00d5:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.zego.p1851ve.MediaCodecVideoEncoder.findHwEncoder(java.lang.String, com.zego.ve.MediaCodecVideoEncoder$MediaCodecProperties[], int[]):com.zego.ve.MediaCodecVideoEncoder$EncoderProperties");
    }

    /* access modifiers changed from: 0000 */
    public boolean encodeTexture(boolean z, int i, float[] fArr, long j) {
        checkOnMediaCodecThread();
        try {
            checkKeyFrameRequired(z, j);
            return true;
        } catch (RuntimeException unused) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean encodeBuffer(boolean z, int i, int i2, long j) {
        checkOnMediaCodecThread();
        try {
            checkKeyFrameRequired(z, j);
            this.mediaCodec.queueInputBuffer(i, 0, i2, j, 0);
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    /* access modifiers changed from: 0000 */
    public boolean initEncode(int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        String str;
        EncoderProperties encoderProperties;
        int[] iArr;
        int[] iArr2;
        int[] iArr3;
        this.width = i2;
        this.height = i3;
        this.forcedKeyFrameMs = 0;
        this.lastKeyFrameMs = -1;
        if (this.mediaCodecThread == null) {
            VideoCodecType videoCodecType = VideoCodecType.values()[i];
            if (videoCodecType == VideoCodecType.VIDEO_CODEC_H264_AVC) {
                str = "video/avc";
                String str2 = "video/avc";
                MediaCodecProperties[] mediaCodecPropertiesArr = h264HwList;
                if (z) {
                    iArr3 = supportedSurfaceColorList;
                } else {
                    iArr3 = supportedColorList;
                }
                encoderProperties = findHwEncoder(str2, mediaCodecPropertiesArr, iArr3);
            } else if (videoCodecType == VideoCodecType.VIDEO_CODEC_H265) {
                str = "video/hevc";
                String str3 = "video/hevc";
                MediaCodecProperties[] mediaCodecPropertiesArr2 = hevcHwList;
                if (z) {
                    iArr2 = supportedSurfaceColorList;
                } else {
                    iArr2 = supportedColorList;
                }
                encoderProperties = findHwEncoder(str3, mediaCodecPropertiesArr2, iArr2);
            } else if (videoCodecType != VideoCodecType.VIDEO_CODEC_VP8) {
                return false;
            } else {
                str = "video/x-vnd.on2.vp8";
                String str4 = "video/x-vnd.on2.vp8";
                MediaCodecProperties[] mediaCodecPropertiesArr3 = vp8HwList;
                if (z) {
                    iArr = supportedSurfaceColorList;
                } else {
                    iArr = supportedColorList;
                }
                encoderProperties = findHwEncoder(str4, mediaCodecPropertiesArr3, iArr);
                if (this.type == VideoCodecType.VIDEO_CODEC_VP8 && encoderProperties.codecName.startsWith(qcomVp8HwProperties.codecPrefix)) {
                    if (VERSION.SDK_INT == 21 || VERSION.SDK_INT == 22) {
                        this.forcedKeyFrameMs = (long) (i6 * 1000);
                    } else if (VERSION.SDK_INT == 23) {
                        this.forcedKeyFrameMs = (long) (i6 * 1000);
                    } else if (VERSION.SDK_INT > 23) {
                        this.forcedKeyFrameMs = (long) (i6 * 1000);
                    }
                }
            }
            if (encoderProperties != null) {
                runningInstance = this;
                this.colorFormat = encoderProperties.colorFormat;
                this.bitrateAdjustmentType = encoderProperties.bitrateAdjustmentType;
                int min = Math.min(i5, 30);
                if (this.bitrateAdjustmentType == BitrateAdjustmentType.FRAMERATE_ADJUSTMENT) {
                    this.originFps = min;
                }
                this.targetBitrateBps = i4;
                this.targetFps = min;
                double d = (double) this.targetBitrateBps;
                Double.isNaN(d);
                this.bitrateAccumulatorMax = d / 8.0d;
                this.bitrateAccumulator = 0.0d;
                this.bitrateObservationTimeMs = 0.0d;
                this.bitrateAdjustmentScaleExp = 0;
                this.mediaCodecThread = Thread.currentThread();
                try {
                    MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, i2, i3);
                    createVideoFormat.setInteger("bitrate", this.targetBitrateBps);
                    if (encoderProperties.supportedCBR) {
                        createVideoFormat.setInteger("bitrate-mode", 2);
                    }
                    createVideoFormat.setInteger("color-format", encoderProperties.colorFormat);
                    createVideoFormat.setInteger("frame-rate", this.targetFps);
                    createVideoFormat.setInteger("i-frame-interval", i6);
                    this.mediaCodec = createByCodecName(encoderProperties.codecName);
                    this.type = this.type;
                    if (this.mediaCodec == null) {
                        return false;
                    }
                    this.mediaCodec.configure(createVideoFormat, null, null, 1);
                    if (z) {
                        this.inputSurface = this.mediaCodec.createInputSurface();
                    }
                    this.mediaCodec.start();
                    if (VERSION.SDK_INT < 21) {
                        this.outputBuffers = this.mediaCodec.getOutputBuffers();
                    }
                    if (!z) {
                        this.stride = 0;
                        this.sliceHeight = 0;
                        if (VERSION.SDK_INT < 21) {
                            this.inputBuffers = this.mediaCodec.getInputBuffers();
                        } else {
                            MediaFormat inputFormat = this.mediaCodec.getInputFormat();
                            if (inputFormat.containsKey("stride")) {
                                this.stride = inputFormat.getInteger("stride");
                            }
                            if (inputFormat.containsKey("slice-height")) {
                                this.sliceHeight = inputFormat.getInteger("slice-height");
                            }
                        }
                        this.stride = Math.max(i2, this.stride);
                        this.sliceHeight = Math.max(i3, this.sliceHeight);
                    }
                    return true;
                } catch (IllegalStateException unused) {
                    printStackTrace();
                    return false;
                } catch (Exception unused2) {
                    printStackTrace();
                    return false;
                }
            } else {
                throw new RuntimeException("Can not find HW encoder for h264");
            }
        } else {
            throw new RuntimeException("Forgot to release()?");
        }
    }
}
