package com.zego.p1851ve;

import android.graphics.SurfaceTexture;
import android.media.Image.Plane;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build.VERSION;
import android.view.Surface;
import com.p280ss.android.medialib.camera.ImageFrame;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* renamed from: com.zego.ve.MediaCodecVideoDecoder */
public class MediaCodecVideoDecoder {
    private static final String[] HW_BLACKLISTS = {"omx.google.", "omx.ffmpeg.", "omx.pv", "omx.k3.ffmpeg.", "omx.avcodec.", "omx.ittiam.", "omx.sec.avc.sw.", "omx.marvell.video.h264decoder"};
    private static final String[] HW_SURFACE_BLACKLISTS = {"OMX.MS.", "OMX.MTK"};
    private static int codecErrors;
    private static boolean enableWhitelist = true;
    private static MediaCodecVideoDecoderErrorCallback errorCallback;
    private static Set<String> hwDecoderDisabledTypes = new HashSet();
    private static MediaCodecVideoDecoder runningInstance;
    private static final int[] supportedColorList = {19, 2135033992, 21, 2141391872, 2141391876, 2141391875, 2130706688, 2130708361};
    private static final String[] supportedH264HwCodecPrefixes = {"OMX.qcom.", "OMX.Exynos.", "OMX.MTK.", "OMX.hisi.", "OMX.IMG.", "OMX.k3.", "OMX.TI.", "OMX.rk.", "OMX.amlogic.", "OMX.Intel.", "OMX.Nvidia.", "OMX.allwinner.", "OMX.MS.", "OMX.realtek.", "OMX.Freescale.", "OMX.sprd."};
    private static final String[] supportedHEVCHwCodecPrefixes = {"OMX.qcom.", "OMX.hisi.", "OMX.IMG.", "OMX.Intel.", "OMX.MTK"};
    private static final int[] supportedSurfaceColorList = {2130708361, 2135033992};
    private static final String[] supportedVp8HwCodecPrefixes = {"OMX.qcom.", "OMX.hisi.", "OMX.Nvidia.", "OMX.Exynos.", "OMX.Intel."};
    private static final String[] supportedVp9HwCodecPrefixes = {"OMX.qcom.", "OMX.Exynos."};
    private String codecName;
    private int colorFormat;
    private int cropLeft;
    private int cropTop;
    private boolean hasDecodedFirstFrame;
    private int height;
    private ByteBuffer[] inputBuffers;
    public MediaCodec mediaCodec;
    private Thread mediaCodecThread;
    private ByteBuffer[] outputBuffers;
    private int sliceHeight;
    private int stride;
    public Surface surface;
    private int width;

    /* renamed from: com.zego.ve.MediaCodecVideoDecoder$DecodedOutputBuffer */
    static class DecodedOutputBuffer {
        private ByteBuffer buffer;
        public final boolean formatChanged;
        private final int index;
        private boolean isI420;
        private final long presentationTimeStampUs;
        private ByteBuffer uBuffer;
        private int uStride;
        private ByteBuffer vBuffer;
        private int vStride;
        private ByteBuffer yBuffer;
        private int yStride;

        public DecodedOutputBuffer(int i, ByteBuffer byteBuffer, long j, boolean z) {
            this.index = i;
            this.buffer = byteBuffer;
            this.presentationTimeStampUs = j;
            this.formatChanged = z;
        }

        public DecodedOutputBuffer(int i, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, int i2, int i3, int i4, boolean z, long j, boolean z2) {
            this.index = i;
            this.yBuffer = byteBuffer;
            this.uBuffer = byteBuffer2;
            this.vBuffer = byteBuffer3;
            this.yStride = i2;
            this.uStride = i3;
            this.vStride = i4;
            this.presentationTimeStampUs = j;
            this.formatChanged = z2;
        }
    }

    /* renamed from: com.zego.ve.MediaCodecVideoDecoder$DecoderProperties */
    static class DecoderProperties {
        public final String codecName;
        public final int colorFormat;

        public DecoderProperties(String str, int i) {
            this.codecName = str;
            this.colorFormat = i;
        }
    }

    /* renamed from: com.zego.ve.MediaCodecVideoDecoder$MediaCodecVideoDecoderErrorCallback */
    public interface MediaCodecVideoDecoderErrorCallback {
        void onMediaCodecVideoDecoderCriticalError(int i);
    }

    /* renamed from: com.zego.ve.MediaCodecVideoDecoder$VideoCodecType */
    public enum VideoCodecType {
        VIDEO_CODEC_VP8,
        VIDEO_CODEC_VP9,
        VIDEO_CODEC_H264,
        VIDEO_CODEC_HEVC
    }

    public static void disableH264HwCodec() {
        hwDecoderDisabledTypes.add("video/avc");
    }

    public static void disableHEVCHwCodec() {
        hwDecoderDisabledTypes.add("video/hevc");
    }

    public static void disableVp8HwCodec() {
        hwDecoderDisabledTypes.add("video/x-vnd.on2.vp8");
    }

    public static void disableVp9HwCodec() {
        hwDecoderDisabledTypes.add("video/x-vnd.on2.vp9");
    }

    private int dequeueInputBuffer() {
        checkOnMediaCodecThread();
        try {
            return this.mediaCodec.dequeueInputBuffer(500000);
        } catch (IllegalStateException unused) {
            return -2;
        }
    }

    public static String getCodecName() {
        return findDecoder("video/avc", supportedH264HwCodecPrefixes, supportedColorList).codecName;
    }

    public static void printStackTrace() {
        if (runningInstance != null && runningInstance.mediaCodecThread != null) {
            runningInstance.mediaCodecThread.getStackTrace();
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

    public static boolean isH264HwSupportedUsingTextures() {
        boolean z;
        DecoderProperties findDecoder = findDecoder("video/avc", supportedH264HwCodecPrefixes, supportedSurfaceColorList);
        if (findDecoder != null) {
            String[] strArr = HW_SURFACE_BLACKLISTS;
            int length = strArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    z = true;
                    break;
                }
                if (findDecoder.codecName.startsWith(strArr[i])) {
                    break;
                }
                i++;
            }
        }
        z = false;
        if (hwDecoderDisabledTypes.contains("video/avc") || findDecoder == null || !z) {
            return false;
        }
        return true;
    }

    private void release() {
        if (this.mediaCodecThread != null && this.mediaCodec != null) {
            checkOnMediaCodecThread();
            if (this.mediaCodec != null) {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                new Thread(new Runnable() {
                    public void run() {
                        try {
                            MediaCodecVideoDecoder.this.mediaCodec.stop();
                            MediaCodecVideoDecoder.this.mediaCodec.release();
                            MediaCodecVideoDecoder.this.mediaCodec = null;
                            if (MediaCodecVideoDecoder.this.surface != null) {
                                MediaCodecVideoDecoder.this.surface.release();
                                MediaCodecVideoDecoder.this.surface = null;
                            }
                        } catch (Exception unused) {
                        }
                        countDownLatch.countDown();
                    }
                }).start();
                if (!ThreadUtils.awaitUninterruptibly(countDownLatch, DouPlusShareGuideExperiment.MIN_VALID_DURATION)) {
                    codecErrors++;
                    if (errorCallback != null) {
                        errorCallback.onMediaCodecVideoDecoderCriticalError(codecErrors);
                    }
                }
            }
            this.mediaCodecThread = null;
            runningInstance = null;
        }
    }

    public static void setErrorCallback(MediaCodecVideoDecoderErrorCallback mediaCodecVideoDecoderErrorCallback) {
        errorCallback = mediaCodecVideoDecoderErrorCallback;
    }

    public static boolean isH264HwSupported(boolean z) {
        enableWhitelist = z;
        if (hwDecoderDisabledTypes.contains("video/avc") || findDecoder("video/avc", supportedH264HwCodecPrefixes, supportedColorList) == null) {
            return false;
        }
        return true;
    }

    public static boolean isHEVCHwSupported(boolean z) {
        enableWhitelist = z;
        if (hwDecoderDisabledTypes.contains("video/hevc") || findDecoder("video/hevc", supportedHEVCHwCodecPrefixes, supportedColorList) == null) {
            return false;
        }
        return true;
    }

    public static boolean isVp8HwSupported(boolean z) {
        if (hwDecoderDisabledTypes.contains("video/x-vnd.on2.vp8") || findDecoder("video/x-vnd.on2.vp8", supportedVp8HwCodecPrefixes, supportedColorList) == null) {
            return false;
        }
        return true;
    }

    public static boolean isVp9HwSupported(boolean z) {
        if (hwDecoderDisabledTypes.contains("video/x-vnd.on2.vp9") || findDecoder("video/x-vnd.on2.vp9", supportedVp9HwCodecPrefixes, supportedColorList) == null) {
            return false;
        }
        return true;
    }

    public boolean returnDecodedOutputBuffer(int i) {
        boolean z;
        checkOnMediaCodecThread();
        try {
            MediaCodec mediaCodec2 = this.mediaCodec;
            if (this.surface != null) {
                z = true;
            } else {
                z = false;
            }
            mediaCodec2.releaseOutputBuffer(i, z);
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private DecodedOutputBuffer dequeueOutputBuffer(int i) {
        boolean z;
        int i2;
        int i3;
        checkOnMediaCodecThread();
        BufferInfo bufferInfo = new BufferInfo();
        while (true) {
            int dequeueOutputBuffer = this.mediaCodec.dequeueOutputBuffer(bufferInfo, TimeUnit.MILLISECONDS.toMicros((long) i));
            switch (dequeueOutputBuffer) {
                case ImageFrame.NV21 /*-3*/:
                    if (VERSION.SDK_INT < 21) {
                        this.outputBuffers = this.mediaCodec.getOutputBuffers();
                        if (!this.hasDecodedFirstFrame) {
                            break;
                        } else {
                            throw new RuntimeException("Unexpected output buffer change event.");
                        }
                    } else {
                        continue;
                    }
                case -2:
                    MediaFormat outputFormat = this.mediaCodec.getOutputFormat();
                    if (!outputFormat.containsKey("crop-left") || !outputFormat.containsKey("crop-right") || !outputFormat.containsKey("crop-bottom") || !outputFormat.containsKey("crop-top")) {
                        this.cropTop = 0;
                        this.cropLeft = 0;
                    } else {
                        this.cropTop = outputFormat.getInteger("crop-top");
                        this.cropLeft = outputFormat.getInteger("crop-left");
                    }
                    if (!outputFormat.containsKey("width") || !outputFormat.containsKey("height")) {
                        i3 = 0;
                        i2 = 0;
                    } else {
                        i3 = outputFormat.getInteger("width");
                        i2 = outputFormat.getInteger("height");
                    }
                    if (!this.hasDecodedFirstFrame || (i3 == this.width && i2 == this.height)) {
                        if (i2 != 0) {
                            this.sliceHeight = i2;
                        }
                        if (this.codecName.startsWith("OMX.rk") && this.colorFormat == 21) {
                            this.colorFormat = 21;
                        } else if (outputFormat.containsKey("color-format")) {
                            this.colorFormat = outputFormat.getInteger("color-format");
                        }
                        if (outputFormat.containsKey("stride")) {
                            this.stride = outputFormat.getInteger("stride");
                        } else {
                            this.stride = i3;
                        }
                        if (outputFormat.containsKey("slice-height")) {
                            this.sliceHeight = outputFormat.getInteger("slice-height");
                        }
                        this.stride = Math.max(this.width, this.stride);
                        if ((19 == this.colorFormat || 21 == this.colorFormat) && i2 != this.sliceHeight) {
                            this.sliceHeight = this.height;
                        } else {
                            this.sliceHeight = Math.max(this.height, this.sliceHeight);
                        }
                        this.hasDecodedFirstFrame = false;
                        break;
                    }
                    break;
                case -1:
                    return null;
                default:
                    boolean z2 = !this.hasDecodedFirstFrame;
                    this.hasDecodedFirstFrame = true;
                    if (this.colorFormat != 2135033992) {
                        ByteBuffer byteBuffer = getByteBuffer(false, dequeueOutputBuffer);
                        byteBuffer.position(bufferInfo.offset);
                        byteBuffer.limit(bufferInfo.offset + bufferInfo.size);
                        DecodedOutputBuffer decodedOutputBuffer = new DecodedOutputBuffer(dequeueOutputBuffer, byteBuffer, bufferInfo.presentationTimeUs, z2);
                        return decodedOutputBuffer;
                    } else if (VERSION.SDK_INT < 21) {
                        return null;
                    } else {
                        Plane[] planes = this.mediaCodec.getOutputImage(dequeueOutputBuffer).getPlanes();
                        if (planes[1].getPixelStride() == 1 && planes[2].getPixelStride() == 1) {
                            z = true;
                        } else {
                            z = false;
                        }
                        DecodedOutputBuffer decodedOutputBuffer2 = new DecodedOutputBuffer(dequeueOutputBuffer, planes[0].getBuffer(), planes[1].getBuffer(), planes[2].getBuffer(), planes[0].getRowStride(), planes[1].getRowStride(), planes[2].getRowStride(), z, bufferInfo.presentationTimeUs, z2);
                        return decodedOutputBuffer2;
                    }
            }
        }
        StringBuilder sb = new StringBuilder("Unexpected size change. Configured ");
        sb.append(this.width);
        sb.append("*");
        sb.append(this.height);
        sb.append(". New ");
        sb.append(i3);
        sb.append("*");
        sb.append(i2);
        throw new RuntimeException(sb.toString());
    }

    private boolean queueConfig(int i, int i2) {
        checkOnMediaCodecThread();
        try {
            ByteBuffer byteBuffer = getByteBuffer(true, i);
            byteBuffer.position(0);
            byteBuffer.limit(i2);
            this.mediaCodec.queueInputBuffer(i, 0, i2, 0, 2);
            return true;
        } catch (IllegalStateException unused) {
            return false;
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

    private boolean queueInputBuffer(int i, int i2, long j) {
        checkOnMediaCodecThread();
        try {
            ByteBuffer byteBuffer = getByteBuffer(true, i);
            byteBuffer.position(0);
            byteBuffer.limit(i2);
            this.mediaCodec.queueInputBuffer(i, 0, i2, j, 0);
            return true;
        } catch (IllegalStateException unused) {
            return false;
        }
    }

    private static DecoderProperties findDecoder(String str, String[] strArr, int[] iArr) {
        String str2;
        boolean z;
        int[] iArr2;
        boolean z2;
        if (VERSION.SDK_INT < 16) {
            return null;
        }
        for (int i = 0; i < MediaCodecList.getCodecCount(); i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (!codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                int length = supportedTypes.length;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        str2 = null;
                        break;
                    } else if (supportedTypes[i2].equals(str)) {
                        str2 = codecInfoAt.getName();
                        break;
                    } else {
                        i2++;
                    }
                }
                if (str2 == null) {
                    continue;
                } else {
                    if (enableWhitelist) {
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
                    } else {
                        String lowerCase = str2.toLowerCase();
                        String[] strArr2 = HW_BLACKLISTS;
                        int length3 = strArr2.length;
                        int i4 = 0;
                        while (true) {
                            if (i4 >= length3) {
                                z2 = false;
                                break;
                            } else if (lowerCase.startsWith(strArr2[i4])) {
                                z2 = true;
                                break;
                            } else {
                                i4++;
                            }
                        }
                        z = !z2;
                    }
                    if (z) {
                        CodecCapabilities capabilitiesForType = codecInfoAt.getCapabilitiesForType(str);
                        int[] iArr3 = capabilitiesForType.colorFormats;
                        for (int i5 : iArr) {
                            for (int i6 : capabilitiesForType.colorFormats) {
                                if (i6 == i5) {
                                    return new DecoderProperties(str2, i6);
                                }
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
            }
        }
        return null;
    }

    private boolean initDecode(int i, int i2, int i3, ByteBuffer byteBuffer, SurfaceTexture surfaceTexture) {
        String str;
        DecoderProperties decoderProperties;
        if (this.mediaCodecThread == null) {
            String str2 = "h264";
            if (i == 8204) {
                str = "video/avc";
                decoderProperties = findDecoder(str, supportedH264HwCodecPrefixes, supportedColorList);
            } else if (i == 8208) {
                str2 = "hevc";
                str = "video/hevc";
                decoderProperties = findDecoder(str, supportedHEVCHwCodecPrefixes, supportedColorList);
            } else if (i != 8210) {
                str = null;
                decoderProperties = null;
            } else {
                str2 = "vp8";
                str = "video/x-vnd.on2.vp8";
                decoderProperties = findDecoder(str, supportedVp8HwCodecPrefixes, supportedColorList);
            }
            if (decoderProperties != null) {
                runningInstance = this;
                this.mediaCodecThread = Thread.currentThread();
                try {
                    MediaFormat createVideoFormat = MediaFormat.createVideoFormat(str, i2, i3);
                    if (surfaceTexture == null) {
                        createVideoFormat.setInteger("color-format", decoderProperties.colorFormat);
                    } else {
                        surfaceTexture.setDefaultBufferSize(i2, i3);
                        this.surface = new Surface(surfaceTexture);
                    }
                    if (byteBuffer != null) {
                        createVideoFormat.setByteBuffer("csd-0", byteBuffer);
                    }
                    this.mediaCodec = MediaCodecVideoEncoder.createByCodecName(decoderProperties.codecName);
                    if (this.mediaCodec == null) {
                        return false;
                    }
                    this.mediaCodec.configure(createVideoFormat, this.surface, null, 0);
                    this.mediaCodec.start();
                    this.codecName = decoderProperties.codecName;
                    this.colorFormat = decoderProperties.colorFormat;
                    this.hasDecodedFirstFrame = false;
                    if (VERSION.SDK_INT < 21) {
                        this.outputBuffers = this.mediaCodec.getOutputBuffers();
                        this.inputBuffers = this.mediaCodec.getInputBuffers();
                    }
                    this.width = i2;
                    this.height = i3;
                    return true;
                } catch (IllegalStateException unused) {
                    return false;
                }
            } else {
                StringBuilder sb = new StringBuilder("Cannot find HW decoder for ");
                sb.append(str2);
                throw new RuntimeException(sb.toString());
            }
        } else {
            throw new RuntimeException("initDecode: Forgot to release()?");
        }
    }
}
