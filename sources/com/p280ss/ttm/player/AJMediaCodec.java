package com.p280ss.ttm.player;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.CodecException;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.text.TextUtils;
import android.view.Surface;
import com.C1642a;
import com.p280ss.ttm.utils.Util;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.ss.ttm.player.AJMediaCodec */
class AJMediaCodec {
    private static Object mCodecListLock = new Object();
    private static boolean mDeviceNeedsSetOutputSurfaceWorkaround = false;
    private static boolean mEvaluatedDeviceNeedsSetOutputSurfaceWorkaround = false;
    private static boolean mIsHevcBlacklist = false;
    private static boolean mIsInitDetected = false;
    private static boolean mNeedHevcWorkAround = false;
    private static ArrayList<MediaCodecInfo> mVideoHWDecoderCodecs = new ArrayList<>();
    private BufferInfo mBufferInfo;
    private Surface mDummySurface;
    private String mExceptionInfo;
    private ByteBuffer[] mInputBuffers;
    private boolean mInputBuffersValid;
    private MediaCodec mMediaCodec;
    private ByteBuffer[] mOutputBuffers;
    private MediaFormat mOutputMediaFormat;

    public boolean MTKHevcNeedWorkAround() {
        return mNeedHevcWorkAround;
    }

    public String getErrorInfo() {
        return this.mExceptionInfo;
    }

    public int getOSVerion() {
        return Util.SDK_INT;
    }

    private void createDummySurface() {
        this.mDummySurface = DummySurface.newInstanceV17(false);
    }

    private boolean supportSetSurface() {
        if (!mDeviceNeedsSetOutputSurfaceWorkaround) {
            return true;
        }
        return false;
    }

    public void flush() {
        try {
            this.mMediaCodec.flush();
        } catch (Exception unused) {
        }
    }

    public int getChannelCount() {
        if (this.mOutputMediaFormat == null) {
            return 0;
        }
        try {
            return this.mOutputMediaFormat.getInteger("channel-count");
        } catch (Exception unused) {
            return 0;
        }
    }

    public ByteBuffer[] getInputBuffers() {
        if (this.mInputBuffersValid) {
            return this.mInputBuffers;
        }
        return null;
    }

    public int getSampleRate() {
        if (this.mOutputMediaFormat == null) {
            return 0;
        }
        try {
            return this.mOutputMediaFormat.getInteger("sample-rate");
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getSliceHeight() {
        if (this.mOutputMediaFormat == null) {
            return 0;
        }
        try {
            return this.mOutputMediaFormat.getInteger("slice-height");
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getStride() {
        if (this.mOutputMediaFormat == null) {
            return 0;
        }
        try {
            return this.mOutputMediaFormat.getInteger("stride");
        } catch (Exception unused) {
            return 0;
        }
    }

    public int stop() {
        if (this.mInputBuffersValid) {
            try {
                this.mInputBuffersValid = false;
                this.mMediaCodec.stop();
            } catch (Exception unused) {
                return -1;
            }
        }
        return 0;
    }

    public void close() {
        if (this.mMediaCodec != null) {
            this.mInputBuffers = null;
            this.mOutputBuffers = null;
            releaseCodec(this.mMediaCodec);
            this.mMediaCodec = null;
        }
    }

    public int getColorFormat() {
        if (this.mOutputMediaFormat == null) {
            return 0;
        }
        try {
            int integer = this.mOutputMediaFormat.getInteger("color-format");
            if (integer == 21 || integer == 2130706688 || integer == 2141391872) {
                return 3;
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public int vendorOppoHWEnable() {
        if (Util.BARND.equals("OPPO")) {
            try {
                return Integer.valueOf(getProperty("persist.sys.aweme.hdsupport", "1")).intValue();
            } catch (NumberFormatException unused) {
            }
        }
        return 1;
    }

    public AJMediaCodec() {
        boolean z;
        if (!mIsInitDetected) {
            if (!Util.HARDWARE.toLowerCase().startsWith("mt") || Util.SDK_INT >= 26) {
                z = false;
            } else {
                z = true;
            }
            mNeedHevcWorkAround = z;
            if (isHisiHevcBlackList() || isMtkHevcBlackList()) {
                mIsHevcBlacklist = true;
            }
        }
        codecNeedsSetOutputSurfaceWorkaround();
        mIsInitDetected = true;
    }

    private boolean isHisiHevcBlackList() {
        String property = getProperty("ro.board.platform", null);
        if (Util.SDK_INT == 26 && property != null && (property.startsWith("kirin960") || property.startsWith("hi3660"))) {
            double d = 0.0d;
            try {
                d = Double.valueOf(getProperty("ro.config.hw_codec_support", "0.0")).doubleValue();
            } catch (NumberFormatException unused) {
            }
            if (d < 0.18041d) {
                return true;
            }
        }
        return false;
    }

    private boolean isMtkHevcBlackList() {
        String lowerCase = Util.HARDWARE.toLowerCase();
        if (lowerCase.startsWith("mt6763") || lowerCase.startsWith("mt6757") || lowerCase.startsWith("mt6739") || lowerCase.startsWith("mt6750")) {
            return true;
        }
        return false;
    }

    public int start() {
        try {
            this.mMediaCodec.start();
            this.mInputBuffers = this.mMediaCodec.getInputBuffers();
            if (Util.SDK_INT >= 21) {
                this.mOutputBuffers = this.mMediaCodec.getOutputBuffers();
            }
            this.mInputBuffersValid = true;
            this.mBufferInfo = new BufferInfo();
            return 0;
        } catch (Exception e) {
            handleCodecException(e);
            return -1;
        }
    }

    public int getFormatHeight() {
        boolean z;
        int i;
        if (this.mOutputMediaFormat == null) {
            return 0;
        }
        try {
            if (!this.mOutputMediaFormat.containsKey("crop-right") || !this.mOutputMediaFormat.containsKey("crop-left") || !this.mOutputMediaFormat.containsKey("crop-bottom") || !this.mOutputMediaFormat.containsKey("crop-top")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i = (this.mOutputMediaFormat.getInteger("crop-bottom") - this.mOutputMediaFormat.getInteger("crop-top")) + 1;
            } else {
                i = this.mOutputMediaFormat.getInteger("height");
            }
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }

    public int getFormatWidth() {
        boolean z;
        int i;
        if (this.mOutputMediaFormat == null) {
            return 0;
        }
        try {
            if (!this.mOutputMediaFormat.containsKey("crop-right") || !this.mOutputMediaFormat.containsKey("crop-left") || !this.mOutputMediaFormat.containsKey("crop-bottom") || !this.mOutputMediaFormat.containsKey("crop-top")) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i = (this.mOutputMediaFormat.getInteger("crop-right") - this.mOutputMediaFormat.getInteger("crop-left")) + 1;
            } else {
                i = this.mOutputMediaFormat.getInteger("width");
            }
            return i;
        } catch (Exception unused) {
            return 0;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:29:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:33:0x0064  */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0081  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean codecNeedsSetOutputSurfaceWorkaround() {
        /*
            java.lang.Class<com.ss.ttm.player.AJMediaCodec> r0 = com.p280ss.ttm.player.AJMediaCodec.class
            monitor-enter(r0)
            boolean r1 = mEvaluatedDeviceNeedsSetOutputSurfaceWorkaround     // Catch:{ all -> 0x008a }
            if (r1 != 0) goto L_0x0086
            int r1 = com.p280ss.ttm.utils.Util.SDK_INT     // Catch:{ all -> 0x008a }
            r2 = 27
            r3 = 1
            if (r1 > r2) goto L_0x0018
            java.lang.String r1 = "dangal"
            java.lang.String r4 = com.p280ss.ttm.utils.Util.DEVICE     // Catch:{ all -> 0x008a }
            boolean r1 = r1.equals(r4)     // Catch:{ all -> 0x008a }
            if (r1 != 0) goto L_0x0082
        L_0x0018:
            int r1 = com.p280ss.ttm.utils.Util.SDK_INT     // Catch:{ all -> 0x008a }
            if (r1 >= r2) goto L_0x0084
            java.lang.String r1 = com.p280ss.ttm.utils.Util.DEVICE     // Catch:{ all -> 0x008a }
            int r2 = r1.hashCode()     // Catch:{ all -> 0x008a }
            r4 = 99329(0x18401, float:1.3919E-40)
            r5 = 0
            r6 = -1
            if (r2 == r4) goto L_0x0048
            r4 = 3351335(0x332327, float:4.69622E-39)
            if (r2 == r4) goto L_0x003e
            r4 = 1865889110(0x6f373556, float:5.6700236E28)
            if (r2 == r4) goto L_0x0034
            goto L_0x0052
        L_0x0034:
            java.lang.String r2 = "santoni"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x0052
            r1 = 2
            goto L_0x0053
        L_0x003e:
            java.lang.String r2 = "mido"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x0052
            r1 = 1
            goto L_0x0053
        L_0x0048:
            java.lang.String r2 = "deb"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x0052
            r1 = 0
            goto L_0x0053
        L_0x0052:
            r1 = -1
        L_0x0053:
            switch(r1) {
                case 0: goto L_0x0057;
                case 1: goto L_0x0057;
                case 2: goto L_0x0057;
                default: goto L_0x0056;
            }     // Catch:{ all -> 0x008a }
        L_0x0056:
            goto L_0x0059
        L_0x0057:
            mDeviceNeedsSetOutputSurfaceWorkaround = r3     // Catch:{ all -> 0x008a }
        L_0x0059:
            java.lang.String r1 = com.p280ss.ttm.utils.Util.MODEL     // Catch:{ all -> 0x008a }
            int r2 = r1.hashCode()     // Catch:{ all -> 0x008a }
            r4 = 2006354(0x1e9d52, float:2.811501E-39)
            if (r2 == r4) goto L_0x0074
            r4 = 2006367(0x1e9d5f, float:2.811519E-39)
            if (r2 == r4) goto L_0x006a
            goto L_0x007d
        L_0x006a:
            java.lang.String r2 = "AFTN"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x007d
            r5 = 1
            goto L_0x007e
        L_0x0074:
            java.lang.String r2 = "AFTA"
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x008a }
            if (r1 == 0) goto L_0x007d
            goto L_0x007e
        L_0x007d:
            r5 = -1
        L_0x007e:
            switch(r5) {
                case 0: goto L_0x0082;
                case 1: goto L_0x0082;
                default: goto L_0x0081;
            }     // Catch:{ all -> 0x008a }
        L_0x0081:
            goto L_0x0084
        L_0x0082:
            mDeviceNeedsSetOutputSurfaceWorkaround = r3     // Catch:{ all -> 0x008a }
        L_0x0084:
            mEvaluatedDeviceNeedsSetOutputSurfaceWorkaround = r3     // Catch:{ all -> 0x008a }
        L_0x0086:
            monitor-exit(r0)     // Catch:{ all -> 0x008a }
            boolean r0 = mDeviceNeedsSetOutputSurfaceWorkaround
            return r0
        L_0x008a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x008a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.ttm.player.AJMediaCodec.codecNeedsSetOutputSurfaceWorkaround():boolean");
    }

    private int renderOutputBufferV21(int i) {
        try {
            this.mMediaCodec.releaseOutputBuffer(i, System.nanoTime());
            return 0;
        } catch (Exception unused) {
            return -10000;
        }
    }

    public int createByCodecName(String str) {
        try {
            this.mMediaCodec = MediaCodec.createByCodecName(str);
            return 0;
        } catch (Exception e) {
            handleCodecException(e);
            return -1;
        }
    }

    public int dequeueInputBuffer(long j) {
        try {
            return this.mMediaCodec.dequeueInputBuffer(j);
        } catch (Exception e) {
            return handleCodecException(e);
        }
    }

    public int handleCodecException(Exception exc) {
        this.mExceptionInfo = exc.toString();
        if (Util.SDK_INT >= 21) {
            return handleCodecExceptionV21(exc);
        }
        return -10000;
    }

    public int setOutputSurface(Surface surface) {
        if (mDeviceNeedsSetOutputSurfaceWorkaround || !this.mInputBuffersValid) {
            return -1;
        }
        if (surface == null) {
            if (this.mDummySurface == null) {
                createDummySurface();
            }
            surface = this.mDummySurface;
        }
        return setOutputSurfaceV23(this.mMediaCodec, surface);
    }

    private static boolean codecNeedsFlushWorkaround(String str) {
        if (Util.SDK_INT < 18 || ((Util.SDK_INT == 18 && ("OMX.SEC.avc.dec".equals(str) || "OMX.SEC.avc.dec.secure".equals(str))) || (Util.SDK_INT == 19 && Util.MODEL.startsWith("SM-G800") && ("OMX.Exynos.avc.dec".equals(str) || "OMX.Exynos.avc.dec.secure".equals(str))))) {
            return true;
        }
        return false;
    }

    private void releaseCodec(MediaCodec mediaCodec) {
        if (mediaCodec != null) {
            try {
                mediaCodec.release();
                if (this.mDummySurface != null) {
                    this.mDummySurface.release();
                    this.mDummySurface = null;
                }
            } catch (Exception unused) {
                if (this.mDummySurface != null) {
                    this.mDummySurface.release();
                    this.mDummySurface = null;
                }
            } catch (Throwable th) {
                if (this.mDummySurface != null) {
                    this.mDummySurface.release();
                    this.mDummySurface = null;
                }
                throw th;
            }
        }
    }

    public int handleCodecExceptionV21(Exception exc) {
        if (exc instanceof CodecException) {
            CodecException codecException = (CodecException) exc;
            if (Util.SDK_INT >= 23) {
                if (!(codecException.isRecoverable() || codecException.getErrorCode() == 1100 || codecException.getErrorCode() == 1101)) {
                    return -10001;
                }
            } else if (!codecException.isRecoverable()) {
                return -10001;
            }
        }
        return -10000;
    }

    public int write(AJMediaCodecFrame aJMediaCodecFrame) {
        if (aJMediaCodecFrame == null || aJMediaCodecFrame.data == null) {
            return -1;
        }
        try {
            int dequeueInputBuffer = this.mMediaCodec.dequeueInputBuffer(30000);
            if (dequeueInputBuffer >= 0) {
                this.mInputBuffers[dequeueInputBuffer].put(aJMediaCodecFrame.data);
                this.mMediaCodec.queueInputBuffer(dequeueInputBuffer, 0, aJMediaCodecFrame.size, aJMediaCodecFrame.pts, 0);
                return 0;
            } else if (dequeueInputBuffer == -1) {
                return 4;
            } else {
                return -1;
            }
        } catch (Exception unused) {
            return -1;
        }
    }

    public String getBestCodecName(String str) {
        int i;
        MediaCodecInfo mediaCodecInfo;
        String str2 = str;
        if (Util.SDK_INT < 16 || TextUtils.isEmpty(str)) {
            return null;
        }
        if (str2.equals("video/hevc") && mIsHevcBlacklist) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        synchronized (mCodecListLock) {
            boolean z = !mVideoHWDecoderCodecs.isEmpty();
            if (z) {
                try {
                    i = mVideoHWDecoderCodecs.size();
                } catch (Exception unused) {
                    return null;
                }
            } else {
                i = MediaCodecList.getCodecCount();
            }
            for (int i2 = 0; i2 < i; i2++) {
                if (z) {
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                if (z) {
                    mediaCodecInfo = (MediaCodecInfo) mVideoHWDecoderCodecs.get(i2);
                } else {
                    mediaCodecInfo = MediaCodecList.getCodecInfoAt(i2);
                }
                String name = mediaCodecInfo.getName();
                if (!mediaCodecInfo.isEncoder() && !name.startsWith("OMX.google") && !name.startsWith("c2.android")) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    if (supportedTypes != null) {
                        for (String str3 : supportedTypes) {
                            if (!TextUtils.isEmpty(str3)) {
                                if (!z && str3.startsWith("video/")) {
                                    mVideoHWDecoderCodecs.add(mediaCodecInfo);
                                }
                                if (str3.equalsIgnoreCase(str2) && name.startsWith("OMX.") && !name.startsWith("OMX.pv") && !name.startsWith("OMX.ittiam") && !name.contains("ffmpeg") && !name.contains("avcodec") && !name.contains("secure") && ((!name.startsWith("OMX.MTK.") || Util.SDK_INT >= 18) && !codecNeedsFlushWorkaround(name))) {
                                    AJMediaCodecRank aJMediaCodecRank = AJMediaCodecRank.setupRank(mediaCodecInfo, str2);
                                    if (aJMediaCodecRank != null && ((aJMediaCodecRank.mRank != 40 || Util.SDK_INT >= 21) && aJMediaCodecRank.mRank != 20)) {
                                        arrayList.add(aJMediaCodecRank);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return null;
            }
            AJMediaCodecRank aJMediaCodecRank2 = (AJMediaCodecRank) arrayList.get(0);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                AJMediaCodecRank aJMediaCodecRank3 = (AJMediaCodecRank) it.next();
                if (aJMediaCodecRank3.mRank > aJMediaCodecRank2.mRank) {
                    aJMediaCodecRank2 = aJMediaCodecRank3;
                }
            }
            String name2 = aJMediaCodecRank2.mMediaCodecInfo.getName();
            return name2;
        }
    }

    public static int ceilDivide(int i, int i2) {
        return ((i + i2) - 1) / i2;
    }

    private int setOutputSurfaceV23(MediaCodec mediaCodec, Surface surface) {
        try {
            mediaCodec.setOutputSurface(surface);
            return 0;
        } catch (Exception e) {
            handleCodecException(e);
            return -1;
        }
    }

    public int releaseBuffer(int i, boolean z) {
        if (Util.SDK_INT >= 21 && z) {
            return renderOutputBufferV21(i);
        }
        try {
            this.mMediaCodec.releaseOutputBuffer(i, z);
            return 0;
        } catch (Exception e) {
            return handleCodecException(e);
        }
    }

    public static String getProperty(String str, String str2) {
        try {
            Class cls = Class.forName("android.os.SystemProperties");
            return (String) cls.getMethod("get", new Class[]{String.class, String.class}).invoke(cls, new Object[]{str, str2});
        } catch (Exception unused) {
            return str2;
        }
    }

    public int read(AJMediaCodecFrame aJMediaCodecFrame, long j) {
        while (true) {
            try {
                int dequeueOutputBuffer = this.mMediaCodec.dequeueOutputBuffer(this.mBufferInfo, j);
                if (dequeueOutputBuffer >= 0) {
                    aJMediaCodecFrame.data = this.mOutputBuffers[dequeueOutputBuffer];
                    aJMediaCodecFrame.pts = this.mBufferInfo.presentationTimeUs;
                    aJMediaCodecFrame.index = dequeueOutputBuffer;
                    aJMediaCodecFrame.size = this.mBufferInfo.size;
                    aJMediaCodecFrame.flags = this.mBufferInfo.flags;
                    return 0;
                } else if (dequeueOutputBuffer == -3) {
                    try {
                        this.mOutputBuffers = this.mMediaCodec.getOutputBuffers();
                    } catch (Exception e) {
                        return handleCodecException(e);
                    }
                } else if (dequeueOutputBuffer != -2) {
                    return -1;
                } else {
                    try {
                        this.mOutputMediaFormat = this.mMediaCodec.getOutputFormat();
                        if (this.mOutputBuffers == null) {
                            try {
                                this.mOutputBuffers = this.mMediaCodec.getOutputBuffers();
                            } catch (Exception e2) {
                                return handleCodecException(e2);
                            }
                        }
                        return dequeueOutputBuffer;
                    } catch (Exception e3) {
                        return handleCodecException(e3);
                    }
                }
            } catch (Exception e4) {
                return handleCodecException(e4);
            }
        }
    }

    private static void maybeSetInteger(MediaFormat mediaFormat, String str, int i) {
        if (i != -1) {
            mediaFormat.setInteger(str, i);
        }
    }

    private static void maybeSetCsdBuffers(MediaFormat mediaFormat, ByteBuffer byteBuffer, int i) {
        if (byteBuffer != null) {
            StringBuilder sb = new StringBuilder("csd-");
            sb.append(i);
            mediaFormat.setByteBuffer(sb.toString(), byteBuffer);
        }
    }

    private static int getMaxInputSize(String str, int i, int i2) {
        int i3;
        int i4;
        if (i == -1 || i2 == -1) {
            return -1;
        }
        if (str.equals("video/3gpp") || str.equals("video/mp4v-es")) {
            i3 = i * i2;
        } else if (str.equals("video/avc")) {
            if ("BRAVIA 4K 2015".equals(Util.MODEL)) {
                return -1;
            }
            i3 = ceilDivide(i, 16) * ceilDivide(i2, 16) * 16 * 16;
        } else if (str.equals("video/x-vnd.on2.vp8")) {
            i3 = i * i2;
        } else if (!str.equals("video/hevc") && !str.equals("video/x-vnd.on2.vp9")) {
            return -1;
        } else {
            i3 = i * i2;
            i4 = 4;
            return (i3 * 3) / (i4 * 2);
        }
        i4 = 2;
        return (i3 * 3) / (i4 * 2);
    }

    public int queueInputBuffer(int i, int i2, int i3, long j, int i4) {
        try {
            this.mMediaCodec.queueInputBuffer(i, i2, i3, j, i4);
            return 0;
        } catch (Exception e) {
            return handleCodecException(e);
        }
    }

    public int open(int i, int i2, int i3, String str, String str2, ByteBuffer byteBuffer, Surface surface) {
        try {
            this.mMediaCodec = MediaCodec.createByCodecName(str);
            MediaFormat mediaFormat = new MediaFormat();
            mediaFormat.setString("mime", str2);
            maybeSetInteger(mediaFormat, "width", i);
            maybeSetInteger(mediaFormat, "height", i2);
            if (byteBuffer != null) {
                mediaFormat.setByteBuffer("csd-0", byteBuffer);
            }
            if (surface != null && Util.SDK_INT >= 21) {
                maybeSetInteger(mediaFormat, "rotation-degrees", i3);
            }
            try {
                this.mMediaCodec.configure(mediaFormat, surface, null, 0);
                try {
                    this.mMediaCodec.start();
                    this.mInputBuffers = this.mMediaCodec.getInputBuffers();
                    this.mInputBuffersValid = true;
                    C1642a.m8034a("open() input params. width:%d,height:%d", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)});
                    return 0;
                } catch (Exception unused) {
                    return -1;
                }
            } catch (Exception unused2) {
                return -1;
            }
        } catch (Exception unused3) {
            return -1;
        }
    }

    public int configure(int i, int i2, int i3, int i4, int i5, String str, ByteBuffer byteBuffer, ByteBuffer byteBuffer2, ByteBuffer byteBuffer3, Surface surface, boolean z, boolean z2, boolean z3, int i6, boolean z4, boolean z5) {
        Surface surface2;
        int i7 = i;
        int i8 = i2;
        String str2 = str;
        MediaFormat mediaFormat = new MediaFormat();
        mediaFormat.setString("mime", str);
        maybeSetInteger(mediaFormat, "width", i);
        maybeSetInteger(mediaFormat, "height", i2);
        maybeSetInteger(mediaFormat, "max-width", 1920);
        maybeSetInteger(mediaFormat, "max-height", 1080);
        int i9 = i4;
        maybeSetInteger(mediaFormat, "sample-rate", i4);
        int i10 = i5;
        maybeSetInteger(mediaFormat, "channel-count", i5);
        maybeSetInteger(mediaFormat, "max-input-size", getMaxInputSize(str, i, i2));
        ByteBuffer byteBuffer4 = byteBuffer;
        maybeSetCsdBuffers(mediaFormat, byteBuffer, 0);
        ByteBuffer byteBuffer5 = byteBuffer2;
        maybeSetCsdBuffers(mediaFormat, byteBuffer2, 1);
        maybeSetCsdBuffers(mediaFormat, byteBuffer3, 2);
        if (z) {
            if (Util.SDK_INT >= 21) {
                int i11 = i3;
                maybeSetInteger(mediaFormat, "rotation-degrees", i3);
            }
            if ((surface == null || !surface.isValid()) && this.mDummySurface == null && Util.SDK_INT >= 23 && !mDeviceNeedsSetOutputSurfaceWorkaround) {
                createDummySurface();
                surface2 = this.mDummySurface;
            } else {
                surface2 = surface;
            }
            if (surface2 == null) {
                this.mExceptionInfo = "Error: configure with null surface";
                return -1;
            }
        } else {
            surface2 = surface;
        }
        if (Util.SDK_INT >= 23 && z2) {
            mediaFormat.setInteger("priority", 0);
        }
        if (z3) {
            VendorQTI.setupVpp(mediaFormat, i6);
        }
        if (z4) {
            VendorQTI.debugEffect(mediaFormat);
        }
        if (z5) {
            VendorQTI.enableLowLatency(mediaFormat);
        }
        try {
            this.mMediaCodec.configure(mediaFormat, surface2, null, 0);
            return 0;
        } catch (Exception e) {
            handleCodecException(e);
            return -1;
        }
    }
}
