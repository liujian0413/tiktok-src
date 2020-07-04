package com.p280ss.android.ttve.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaCodecInfo.EncoderCapabilities;
import android.media.MediaFormat;
import android.os.Build.VERSION;
import android.support.p022v4.p023a.C0534a;
import android.view.Surface;
import com.C1642a;
import com.p280ss.android.ttve.common.C20446d;
import com.p280ss.android.ttve.common.C20451h;
import com.p280ss.android.ttve.common.C20453j;
import com.p280ss.android.vesdk.C45372t;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

/* renamed from: com.ss.android.ttve.mediacodec.TEAvcEncoder */
public class TEAvcEncoder {
    private static boolean DEBUG = false;
    public static boolean FORCE_FAILED = false;
    private static final int MASK_BIT_RATE = 1;
    private static final int MASK_FORCE_RESTART = 4;
    private static final int MASK_FRAME_RATE = 2;
    private static int MAX_FRAME_RATE = 2000;
    private static int MIN_FRAME_RATE = 7;
    private static final String TAG = "TEAvcEncoder";
    private static final int TIMEOUT_USEC = 0;
    private static final int TIMEOUT_USEC_EOS = 10000;
    private static final String VIDEO_MIME_TYPE = "video/avc";
    private static int avcqueuesize = 25;
    public ArrayBlockingQueue<C20457a> AVCQueue = new ArrayBlockingQueue<>(avcqueuesize);
    public byte[] configByte = null;
    private int mBufferIndex = -1;
    private boolean mEndOfStream = false;
    private boolean mFirstFrame = true;
    private Queue<Long> m_PTSQueue = new LinkedList();
    private boolean m_bNeedSingalEnd = false;
    private boolean m_bSignalEndOfStream = false;
    private boolean m_bSuccessInit = false;
    private int m_bitRate = 0;
    private MediaFormat m_codecFormat = null;
    private int m_colorFormat = 0;
    private int m_configStatus = 0;
    private double m_dHpBitrateRatio = 0.75d;
    private C20446d m_eglStateSaver;
    private long m_encodeStartTime = -1;
    private int m_frameRate = 0;
    private long m_getnerateIndex = 0;
    private int m_height = 0;
    private int m_iFrameInternal = 0;
    private boolean m_isNeedReconfigure = false;
    private C20457a m_lastCodecData = null;
    private int m_level = 0;
    private int m_maxBitRate = 0;
    private MediaCodec m_mediaCodec = null;
    private int m_profile = 0;
    private C20451h m_sharedContext;
    private Surface m_surface = null;
    private C20453j m_textureDrawer;
    private boolean m_useInputSurface = true;
    private int m_width = 0;
    private byte[] pps;
    private byte[] sps;

    /* renamed from: com.ss.android.ttve.mediacodec.TEAvcEncoder$a */
    public static class C20457a {

        /* renamed from: a */
        public byte[] f55251a;

        /* renamed from: b */
        public long f55252b;

        /* renamed from: c */
        public long f55253c;

        /* renamed from: d */
        public int f55254d;
    }

    public Surface getInputSurface() {
        return this.m_surface;
    }

    public static TEAvcEncoder createEncoderObject() {
        return new TEAvcEncoder();
    }

    public byte[] getExtraData() {
        if (this.configByte != null) {
            return this.configByte;
        }
        return new byte[0];
    }

    public void releaseTextureDrawer() {
        if (this.m_textureDrawer != null) {
            this.m_textureDrawer.mo55059b();
            this.m_textureDrawer = null;
        }
    }

    public int restartEncoder() {
        C45372t.m143403a(TAG, "restartEncoder...");
        this.m_bNeedSingalEnd = false;
        stopEncoder();
        int configEncode = configEncode();
        if (configEncode < 0) {
            return configEncode;
        }
        return startEncoder();
    }

    public void setSharedEGLContext() {
        if (this.m_eglStateSaver == null) {
            this.m_eglStateSaver = new C20446d();
            this.m_eglStateSaver.mo55040a();
        }
    }

    public void stopEncoder() {
        try {
            if (this.m_sharedContext != null) {
                this.m_sharedContext.mo55051b();
            }
            if (this.m_textureDrawer != null) {
                this.m_textureDrawer.mo55059b();
                this.m_textureDrawer = null;
            }
            if (this.m_mediaCodec != null) {
                this.m_mediaCodec.stop();
            }
        } catch (Exception unused) {
        }
    }

    public boolean initTextureDrawer() {
        if (this.m_textureDrawer != null) {
            this.m_textureDrawer.mo55059b();
            this.m_textureDrawer = null;
        }
        this.m_textureDrawer = C20453j.m67857a();
        if (this.m_textureDrawer == null) {
            return false;
        }
        this.m_textureDrawer.mo55056a(0.0f);
        this.m_textureDrawer.mo55057a(1.0f, -1.0f);
        return true;
    }

    public void releaseEncoder() {
        stopEncoder();
        C45372t.m143405b(TAG, "releaseEncoder");
        if (this.m_surface != null) {
            C45372t.m143405b(TAG, "release surface");
            this.m_surface.release();
            this.m_surface = null;
        }
        if (this.m_mediaCodec != null) {
            C45372t.m143405b(TAG, "release mediaCodec");
            this.m_mediaCodec.release();
            this.m_mediaCodec = null;
        }
        if (this.m_sharedContext != null) {
            this.m_sharedContext.mo55048a();
            this.m_sharedContext = null;
        }
    }

    private int configEncode() {
        try {
            if (this.m_surface != null) {
                this.m_surface.release();
                this.m_surface = null;
            }
            if (this.m_mediaCodec != null) {
                this.m_mediaCodec.release();
            }
            this.m_mediaCodec = MediaCodec.createEncoderByType(VIDEO_MIME_TYPE);
            MediaCodecInfo codecInfo = this.m_mediaCodec.getCodecInfo();
            if (codecInfo.getName().startsWith("OMX.google.")) {
                return -2;
            }
            if (reconfigureMediaFormat(codecInfo) != 0) {
                return -3;
            }
            this.m_mediaCodec.configure(this.m_codecFormat, null, null, 1);
            if (this.m_useInputSurface) {
                C45372t.m143405b(TAG, "m_mediaCodec.createInputSurface()");
                this.m_surface = this.m_mediaCodec.createInputSurface();
            }
            return 0;
        } catch (Exception unused) {
            return -4;
        }
    }

    public int startEncoder() {
        C45372t.m143405b(TAG, "startEncoder...");
        try {
            if (VERSION.SDK_INT >= 18 && this.m_useInputSurface) {
                if (this.m_sharedContext == null) {
                    this.m_sharedContext = C20451h.m67849a(this.m_eglStateSaver.f55207a, 64, 64, 12610, this.m_surface);
                    if (this.m_sharedContext == null) {
                        return -2;
                    }
                } else if (!this.m_sharedContext.mo55050a(0, 0, 12610, this.m_surface)) {
                    return -2;
                }
                if (!initTextureDrawer()) {
                    return -3;
                }
            }
            this.m_mediaCodec.start();
            this.m_encodeStartTime = System.nanoTime();
            this.m_isNeedReconfigure = false;
            this.mEndOfStream = false;
            return 0;
        } catch (Exception unused) {
            return -1;
        }
    }

    public byte[] getCodecData(int i) {
        if (this.m_lastCodecData != null) {
            return this.m_lastCodecData.f55251a;
        }
        return null;
    }

    private ByteBuffer getOutputBufferByIdx(int i) {
        if (VERSION.SDK_INT >= 21) {
            return this.m_mediaCodec.getOutputBuffer(i);
        }
        return this.m_mediaCodec.getOutputBuffers()[i];
    }

    private int reconfigureMediaFormat(MediaCodecInfo mediaCodecInfo) {
        String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
        C45372t.m143405b(TAG, "CodecNames:");
        for (String str : supportedTypes) {
            String str2 = TAG;
            StringBuilder sb = new StringBuilder("Codec: ");
            sb.append(str);
            C45372t.m143405b(str2, sb.toString());
        }
        this.m_codecFormat = MediaFormat.createVideoFormat(VIDEO_MIME_TYPE, this.m_width, this.m_height);
        this.m_codecFormat.setInteger("color-format", this.m_colorFormat);
        this.m_codecFormat.setInteger("bitrate", this.m_bitRate);
        this.m_codecFormat.setInteger("frame-rate", this.m_frameRate);
        this.m_codecFormat.setInteger("i-frame-interval", this.m_iFrameInternal);
        setProfile(mediaCodecInfo.getCapabilitiesForType(VIDEO_MIME_TYPE));
        return 0;
    }

    private void setBitRateMode(CodecCapabilities codecCapabilities) {
        if (VERSION.SDK_INT >= 21) {
            String[] strArr = {"BITRATE_MODE_CQ", "BITRATE_MODE_VBR", "BITRATE_MODE_CBR"};
            EncoderCapabilities encoderCapabilities = codecCapabilities.getEncoderCapabilities();
            for (int i = 0; i < 3; i++) {
                String str = TAG;
                StringBuilder sb = new StringBuilder();
                sb.append(strArr[i]);
                sb.append(": ");
                sb.append(encoderCapabilities.isBitrateModeSupported(i));
                C45372t.m143405b(str, sb.toString());
            }
            this.m_codecFormat.setInteger("bitrate-mode", 1);
        }
    }

    private void setProfile(CodecCapabilities codecCapabilities) {
        if (VERSION.SDK_INT >= 24) {
            CodecProfileLevel a = C20459a.m67886a(codecCapabilities, this.m_profile);
            if (a != null) {
                String str = TAG;
                StringBuilder sb = new StringBuilder("Set Profile: ");
                sb.append(a.profile);
                sb.append(", Level = ");
                sb.append(a.level);
                C45372t.m143405b(str, sb.toString());
                this.m_codecFormat.setInteger("profile", a.profile);
                this.m_codecFormat.setInteger("level", a.level);
                int i = a.profile;
                if (i == 2) {
                    C45372t.m143405b(TAG, "Set Main Profile");
                    double d = (double) this.m_maxBitRate;
                    double d2 = this.m_dHpBitrateRatio;
                    Double.isNaN(d);
                    this.m_bitRate = (int) (d * d2);
                } else if (i == 8) {
                    C45372t.m143405b(TAG, "Set High Profile");
                    double d3 = (double) this.m_maxBitRate;
                    double d4 = this.m_dHpBitrateRatio;
                    Double.isNaN(d3);
                    this.m_bitRate = (int) (d3 * d4);
                }
                this.m_codecFormat.setInteger("bitrate", this.m_bitRate);
            }
        }
    }

    private int drainOutputBuffer(long j) {
        byte[] bArr;
        BufferInfo bufferInfo = new BufferInfo();
        this.mBufferIndex = -1;
        try {
            this.mBufferIndex = this.m_mediaCodec.dequeueOutputBuffer(bufferInfo, j);
            while (true) {
                if (this.mBufferIndex < 0) {
                    break;
                }
                ByteBuffer outputBufferByIdx = getOutputBufferByIdx(this.mBufferIndex);
                byte[] bArr2 = new byte[bufferInfo.size];
                outputBufferByIdx.position(bufferInfo.offset);
                outputBufferByIdx.limit(bufferInfo.offset + bufferInfo.size);
                outputBufferByIdx.get(bArr2);
                if (bufferInfo.flags == 2) {
                    this.configByte = bArr2;
                } else if (bufferInfo.flags == 1) {
                    if (this.configByte != null && bArr2[4] == this.configByte[4] && (bArr2[this.configByte.length + 4] & 31) == 5) {
                        bArr = new byte[(bArr2.length - this.configByte.length)];
                        System.arraycopy(bArr2, this.configByte.length, bArr, 0, bArr.length);
                    } else {
                        bArr = bArr2;
                    }
                    addOutputData(bArr, bufferInfo);
                } else if (bufferInfo.flags == 4) {
                    this.mEndOfStream = true;
                    break;
                } else {
                    addOutputData(bArr2, bufferInfo);
                }
                try {
                    this.m_mediaCodec.releaseOutputBuffer(this.mBufferIndex, false);
                    this.mBufferIndex = this.m_mediaCodec.dequeueOutputBuffer(bufferInfo, j);
                } catch (Exception unused) {
                    return -214;
                }
            }
            if (this.mBufferIndex == -2) {
                MediaFormat outputFormat = this.m_mediaCodec.getOutputFormat();
                ByteBuffer byteBuffer = outputFormat.getByteBuffer("csd-0");
                ByteBuffer byteBuffer2 = outputFormat.getByteBuffer("csd-1");
                if (!(byteBuffer == null || byteBuffer2 == null)) {
                    this.sps = (byte[]) byteBuffer.array().clone();
                    this.pps = (byte[]) byteBuffer2.array().clone();
                    this.configByte = new byte[(this.sps.length + this.pps.length)];
                    System.arraycopy(this.sps, 0, this.configByte, 0, this.sps.length);
                    System.arraycopy(this.pps, 0, this.configByte, this.sps.length, this.pps.length);
                }
            }
            return 0;
        } catch (Exception unused2) {
            return -214;
        }
    }

    public int getInfoByFlag(int[] iArr, int i) {
        if (i != 1) {
            return -1;
        }
        iArr[0] = (int) (this.m_lastCodecData.f55252b & -1);
        iArr[1] = (int) ((this.m_lastCodecData.f55252b >> 32) & -1);
        iArr[2] = (int) (this.m_lastCodecData.f55253c & -1);
        iArr[3] = (int) ((this.m_lastCodecData.f55253c >> 32) & -1);
        return 4;
    }

    private void addOutputData(byte[] bArr, BufferInfo bufferInfo) {
        long j;
        String str = TAG;
        StringBuilder sb = new StringBuilder("encode: pts queue size = ");
        sb.append(this.m_PTSQueue.size());
        C45372t.m143405b(str, sb.toString());
        if (this.m_PTSQueue.size() <= 0 && this.m_profile >= 8) {
            String str2 = TAG;
            StringBuilder sb2 = new StringBuilder("encode: no available pts!!! profile ");
            sb2.append(this.m_profile);
            C45372t.m143407c(str2, sb2.toString());
        } else if (this.m_PTSQueue.size() <= 0) {
            C45372t.m143407c(TAG, "encode: no available pts!!!");
        } else {
            long longValue = ((Long) this.m_PTSQueue.poll()).longValue();
            long j2 = 0;
            if (bufferInfo.presentationTimeUs > 0) {
                j2 = bufferInfo.presentationTimeUs;
            }
            if (this.m_profile >= 8) {
                j = longValue - 200000;
            } else {
                j = j2;
            }
            String str3 = TAG;
            StringBuilder sb3 = new StringBuilder("dts = ");
            sb3.append(j);
            sb3.append(", pts = ");
            sb3.append(j2);
            C45372t.m143405b(str3, sb3.toString());
            C20457a aVar = new C20457a();
            aVar.f55251a = bArr;
            aVar.f55252b = j2;
            aVar.f55253c = j;
            aVar.f55254d = bufferInfo.flags;
            try {
                this.AVCQueue.add(aVar);
            } catch (Exception unused) {
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:82:0x0188 A[SYNTHETIC, Splitter:B:82:0x0188] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x018e A[SYNTHETIC, Splitter:B:88:0x018e] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public int encodeVideoFromTexture(int r19, long r20, boolean r22) {
        /*
            r18 = this;
            r1 = r18
            r2 = r20
            boolean r0 = r1.m_bSuccessInit
            r4 = 0
            if (r0 != 0) goto L_0x000a
            return r4
        L_0x000a:
            java.lang.String r0 = TAG
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "encodeVideoFromTexture:: pts = "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r5 = r5.toString()
            com.p280ss.android.vesdk.C45372t.m143405b(r0, r5)
            java.util.Queue<java.lang.Long> r0 = r1.m_PTSQueue
            java.lang.Long r5 = java.lang.Long.valueOf(r20)
            r0.offer(r5)
            com.ss.android.ttve.common.d r0 = r1.m_eglStateSaver
            if (r0 != 0) goto L_0x0036
            com.ss.android.ttve.common.d r0 = new com.ss.android.ttve.common.d
            r0.<init>()
            r1.m_eglStateSaver = r0
            com.ss.android.ttve.common.d r0 = r1.m_eglStateSaver
            r0.mo55040a()
        L_0x0036:
            boolean r0 = r1.m_isNeedReconfigure
            r5 = 1
            if (r0 != 0) goto L_0x0041
            int r0 = r1.m_configStatus
            r0 = r0 & 4
            if (r0 == 0) goto L_0x0068
        L_0x0041:
            android.media.MediaCodec r0 = r1.m_mediaCodec
            if (r0 == 0) goto L_0x0063
            int r0 = r1.m_configStatus
            if (r0 != r5) goto L_0x0063
            int r0 = android.os.Build.VERSION.SDK_INT
            r6 = 19
            if (r0 < r6) goto L_0x0063
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.String r6 = "video-bitrate"
            int r7 = r1.m_bitRate
            r0.putInt(r6, r7)
            android.media.MediaCodec r6 = r1.m_mediaCodec
            r6.setParameters(r0)
            r1.m_configStatus = r4
            goto L_0x0066
        L_0x0063:
            r18.restartEncoder()
        L_0x0066:
            r1.m_isNeedReconfigure = r4
        L_0x0068:
            long r6 = r1.m_encodeStartTime
            r8 = -1
            int r0 = (r6 > r8 ? 1 : (r6 == r8 ? 0 : -1))
            if (r0 != 0) goto L_0x0076
            long r6 = java.lang.System.nanoTime()
            r1.m_encodeStartTime = r6
        L_0x0076:
            r6 = 0
            int r0 = r1.drainOutputBuffer(r6)
            if (r0 == 0) goto L_0x007f
            return r0
        L_0x007f:
            r0 = r19 & -1
            r8 = 30
            if (r0 == 0) goto L_0x0194
            r9 = 0
            com.ss.android.ttve.common.j r10 = r1.m_textureDrawer     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            if (r10 == 0) goto L_0x0178
            boolean r10 = com.p280ss.android.vesdk.C45251ab.m142755a()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            if (r10 == 0) goto L_0x009e
            android.opengl.EGLContext r10 = android.opengl.EGL14.eglGetCurrentContext()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.ss.android.ttve.common.h r11 = r1.m_sharedContext     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            android.opengl.EGLContext r11 = r11.f55232a     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            boolean r10 = r10.equals(r11)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            if (r10 != 0) goto L_0x00a3
        L_0x009e:
            com.ss.android.ttve.common.h r10 = r1.m_sharedContext     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r10.mo55051b()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
        L_0x00a3:
            int r10 = r1.m_width     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            int r11 = r1.m_height     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            android.opengl.GLES20.glViewport(r4, r4, r10, r11)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.ss.android.ttve.common.j r10 = r1.m_textureDrawer     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r10.mo55058a(r0)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            boolean r10 = r1.mFirstFrame     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            if (r10 == 0) goto L_0x00f0
            boolean r10 = DEBUG     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            if (r10 == 0) goto L_0x00ee
            r10 = 3686400(0x384000, float:5.165747E-39)
            java.nio.ByteBuffer r10 = java.nio.ByteBuffer.allocateDirect(r10)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            java.nio.ByteOrder r11 = java.nio.ByteOrder.nativeOrder()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r10.order(r11)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r10.position(r4)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r11 = 0
            r12 = 0
            r13 = 1280(0x500, float:1.794E-42)
            r14 = 720(0x2d0, float:1.009E-42)
            r15 = 6408(0x1908, float:8.98E-42)
            r16 = 5121(0x1401, float:7.176E-42)
            r17 = r10
            android.opengl.GLES20.glReadPixels(r11, r12, r13, r14, r15, r16, r17)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            java.io.FileOutputStream r11 = new java.io.FileOutputStream     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            java.lang.String r12 = "/mnt/sdcard/ttt.rgba"
            r11.<init>(r12)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            byte[] r9 = r10.array()     // Catch:{ Exception -> 0x00eb, all -> 0x00e7 }
            r11.write(r9)     // Catch:{ Exception -> 0x00eb, all -> 0x00e7 }
            r9 = r11
            goto L_0x00ee
        L_0x00e7:
            r0 = move-exception
            r9 = r11
            goto L_0x0186
        L_0x00eb:
            r9 = r11
            goto L_0x018c
        L_0x00ee:
            r1.mFirstFrame = r4     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
        L_0x00f0:
            com.ss.android.ttve.common.h r10 = r1.m_sharedContext     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r11 = 1000(0x3e8, double:4.94E-321)
            long r2 = r2 * r11
            r10.mo55049a(r2)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.ss.android.ttve.common.h r10 = r1.m_sharedContext     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r10.mo55052c()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r1.m_bNeedSingalEnd = r5     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            int r5 = r1.drainOutputBuffer(r6)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            if (r5 == 0) goto L_0x010c
            if (r9 == 0) goto L_0x010b
            r9.close()     // Catch:{ IOException -> 0x010b }
        L_0x010b:
            return r5
        L_0x010c:
            byte[] r5 = r1.configByte     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            if (r5 != 0) goto L_0x0178
            r5 = 0
        L_0x0111:
            java.lang.String r10 = TAG     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            java.lang.String r12 = "Encoder first frame, count = "
            r11.<init>(r12)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r11.append(r5)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.p280ss.android.vesdk.C45372t.m143405b(r10, r11)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            int r10 = r1.m_width     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            int r11 = r1.m_height     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            android.opengl.GLES20.glViewport(r4, r4, r10, r11)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.ss.android.ttve.common.j r10 = r1.m_textureDrawer     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r10.mo55058a(r0)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.ss.android.ttve.common.h r10 = r1.m_sharedContext     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r10.mo55049a(r2)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.ss.android.ttve.common.h r10 = r1.m_sharedContext     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r10.mo55052c()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            int r10 = r1.drainOutputBuffer(r6)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            if (r10 == 0) goto L_0x0146
            if (r9 == 0) goto L_0x0145
            r9.close()     // Catch:{ IOException -> 0x0145 }
        L_0x0145:
            return r10
        L_0x0146:
            int r5 = r5 + 1
            if (r5 > r8) goto L_0x0153
            r10 = 10
            java.lang.Thread.sleep(r10, r4)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            byte[] r10 = r1.configByte     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            if (r10 == 0) goto L_0x0111
        L_0x0153:
            java.util.concurrent.ArrayBlockingQueue<com.ss.android.ttve.mediacodec.TEAvcEncoder$a> r5 = r1.AVCQueue     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r5.clear()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r18.restartEncoder()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r1.m_getnerateIndex = r6     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.ss.android.ttve.common.h r5 = r1.m_sharedContext     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r5.mo55051b()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            int r5 = r1.m_width     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            int r10 = r1.m_height     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            android.opengl.GLES20.glViewport(r4, r4, r5, r10)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.ss.android.ttve.common.j r5 = r1.m_textureDrawer     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r5.mo55058a(r0)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.ss.android.ttve.common.h r0 = r1.m_sharedContext     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r0.mo55049a(r2)     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            com.ss.android.ttve.common.h r0 = r1.m_sharedContext     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
            r0.mo55052c()     // Catch:{ Exception -> 0x018c, all -> 0x0185 }
        L_0x0178:
            if (r9 == 0) goto L_0x017d
            r9.close()     // Catch:{ IOException -> 0x017d }
        L_0x017d:
            long r2 = r1.m_getnerateIndex
            r9 = 1
            long r2 = r2 + r9
            r1.m_getnerateIndex = r2
            goto L_0x01ad
        L_0x0185:
            r0 = move-exception
        L_0x0186:
            if (r9 == 0) goto L_0x018b
            r9.close()     // Catch:{ IOException -> 0x018b }
        L_0x018b:
            throw r0
        L_0x018c:
            if (r9 == 0) goto L_0x0191
            r9.close()     // Catch:{ IOException -> 0x0191 }
        L_0x0191:
            r0 = -211(0xffffffffffffff2d, float:NaN)
            return r0
        L_0x0194:
            android.media.MediaCodec r0 = r1.m_mediaCodec
            if (r0 == 0) goto L_0x01ad
            boolean r0 = r1.m_bSignalEndOfStream
            if (r0 != 0) goto L_0x01ad
            boolean r0 = r1.m_bNeedSingalEnd
            if (r0 == 0) goto L_0x01ad
            r1.m_bSignalEndOfStream = r5     // Catch:{ Exception -> 0x01aa }
            r1.mEndOfStream = r4     // Catch:{ Exception -> 0x01aa }
            android.media.MediaCodec r0 = r1.m_mediaCodec     // Catch:{ Exception -> 0x01aa }
            r0.signalEndOfInputStream()     // Catch:{ Exception -> 0x01aa }
            goto L_0x01ad
        L_0x01aa:
            r0 = -213(0xffffffffffffff2b, float:NaN)
            return r0
        L_0x01ad:
            boolean r0 = com.p280ss.android.vesdk.C45251ab.m142755a()
            if (r0 != 0) goto L_0x01b8
            com.ss.android.ttve.common.d r0 = r1.m_eglStateSaver
            r0.mo55041b()
        L_0x01b8:
            boolean r0 = r1.m_bSignalEndOfStream
            if (r0 == 0) goto L_0x01d2
        L_0x01bc:
            boolean r0 = r1.mEndOfStream
            if (r0 != 0) goto L_0x01d9
            r2 = 10000(0x2710, double:4.9407E-320)
            int r0 = r1.drainOutputBuffer(r2)
            if (r0 == 0) goto L_0x01c9
            return r0
        L_0x01c9:
            int r0 = r1.mBufferIndex
            if (r0 >= 0) goto L_0x01d9
            int r8 = r8 + -1
            if (r8 > 0) goto L_0x01bc
            goto L_0x01d9
        L_0x01d2:
            int r0 = r1.drainOutputBuffer(r6)
            if (r0 == 0) goto L_0x01d9
            return r0
        L_0x01d9:
            java.util.concurrent.ArrayBlockingQueue<com.ss.android.ttve.mediacodec.TEAvcEncoder$a> r0 = r1.AVCQueue
            java.lang.Object r0 = r0.poll()
            com.ss.android.ttve.mediacodec.TEAvcEncoder$a r0 = (com.p280ss.android.ttve.mediacodec.TEAvcEncoder.C20457a) r0
            r1.m_lastCodecData = r0
            com.ss.android.ttve.mediacodec.TEAvcEncoder$a r0 = r1.m_lastCodecData
            if (r0 == 0) goto L_0x01ec
            com.ss.android.ttve.mediacodec.TEAvcEncoder$a r0 = r1.m_lastCodecData
            byte[] r0 = r0.f55251a
            int r4 = r0.length
        L_0x01ec:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ttve.mediacodec.TEAvcEncoder.encodeVideoFromTexture(int, long, boolean):int");
    }

    private void setEncoder(int i, int i2, int i3, int i4, int i5, int i6, int i7, double d) {
        this.m_configStatus = 0;
        if (i > 0) {
            this.m_width = i;
        }
        if (i2 > 0) {
            this.m_height = i2;
        }
        if (i3 > 0) {
            if (i3 < MIN_FRAME_RATE) {
                C45372t.m143407c(TAG, C1642a.m8035a(Locale.getDefault(), "_frameRate:[%d] is too small, change to %d", new Object[]{Integer.valueOf(i3), Integer.valueOf(MIN_FRAME_RATE)}));
                i3 = MIN_FRAME_RATE;
            } else if (i3 > MAX_FRAME_RATE) {
                C45372t.m143407c(TAG, C1642a.m8035a(Locale.getDefault(), "_frameRate:[%d] is too large, change to %d", new Object[]{Integer.valueOf(i3), Integer.valueOf(MAX_FRAME_RATE)}));
                i3 = MAX_FRAME_RATE;
            }
            if (this.m_frameRate != i3) {
                this.m_frameRate = i3;
                if (i3 < this.m_iFrameInternal) {
                    this.m_iFrameInternal = i3;
                }
                this.m_isNeedReconfigure = true;
                this.m_configStatus |= 2;
            }
        }
        if (i4 > 0) {
            this.m_maxBitRate = i4;
            if (this.m_bitRate != i4) {
                this.m_bitRate = i4;
                this.m_isNeedReconfigure = true;
                this.m_configStatus |= 1;
            }
        }
        if (i5 >= 0) {
            this.m_iFrameInternal = i5;
        }
        if (i6 > 0) {
            this.m_colorFormat = i6;
        }
        this.m_profile = C0534a.m2233a(i7, 1, 64);
        this.m_dHpBitrateRatio = d;
    }

    public int initEncoder(int i, int i2, int i3, int i4, int i5, int i6, int i7, double d, boolean z) {
        boolean z2 = z;
        if (z2 && VERSION.SDK_INT < 18) {
            return -1;
        }
        this.m_useInputSurface = z2;
        if (this.m_useInputSurface) {
            this.m_colorFormat = 2130708361;
        } else {
            this.m_colorFormat = i4;
        }
        setEncoder(i, i2, i3, i6, i5, this.m_colorFormat, i7, d);
        this.m_isNeedReconfigure = true;
        this.m_bSuccessInit = true;
        this.m_bSignalEndOfStream = false;
        return configEncode();
    }
}
