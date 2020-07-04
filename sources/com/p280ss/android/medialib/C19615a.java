package com.p280ss.android.medialib;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import android.os.Build.VERSION;
import android.util.Pair;
import android.view.Surface;
import com.p280ss.android.medialib.common.C19709e;
import com.p280ss.android.vesdk.C45372t;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.ss.android.medialib.a */
public class C19615a {

    /* renamed from: a */
    static C19620b f53086a;

    /* renamed from: j */
    private static final String[] f53087j = {"BITRATE_MODE_CQ", "BITRATE_MODE_VBR", "BITRATE_MODE_CBR"};

    /* renamed from: k */
    private static int f53088k = 5000;

    /* renamed from: b */
    BufferInfo f53089b;

    /* renamed from: c */
    ByteBuffer[] f53090c;

    /* renamed from: d */
    ByteBuffer[] f53091d;

    /* renamed from: e */
    int f53092e = 0;

    /* renamed from: f */
    public int f53093f = 30;

    /* renamed from: g */
    public int f53094g = 1;

    /* renamed from: h */
    public boolean f53095h = false;

    /* renamed from: i */
    BufferedOutputStream f53096i = null;

    /* renamed from: l */
    private MediaCodec f53097l;

    /* renamed from: m */
    private String f53098m = "video/avc";

    /* renamed from: n */
    private MediaCodecInfo f53099n;

    /* renamed from: o */
    private Surface f53100o;

    /* renamed from: p */
    private C19709e f53101p;

    /* renamed from: q */
    private int f53102q;

    /* renamed from: r */
    private int f53103r;

    /* renamed from: s */
    private boolean f53104s;

    /* renamed from: t */
    private Queue<Pair<Integer, Integer>> f53105t = new LinkedList();

    /* renamed from: u */
    private int f53106u;

    /* renamed from: v */
    private int f53107v = 0;

    /* renamed from: w */
    private int f53108w = 0;

    /* renamed from: a */
    public final synchronized void mo52187a() {
        String[] supportedTypes;
        if (this.f53092e == 0) {
            this.f53106u = m64595g();
            if (this.f53106u >= 0) {
                try {
                    this.f53097l = MediaCodec.createEncoderByType(this.f53098m);
                    MediaCodecInfo codecInfo = this.f53097l.getCodecInfo();
                    if (!codecInfo.getName().startsWith("OMX.google.")) {
                        for (String str : codecInfo.getSupportedTypes()) {
                            StringBuilder sb = new StringBuilder("CodecNames: ");
                            sb.append(str);
                            C45372t.m143403a("AVCEncoder", sb.toString());
                        }
                        this.f53092e = 1;
                    }
                } catch (IOException e) {
                    String str2 = "AVCEncoder";
                    StringBuilder sb2 = new StringBuilder("createEncoderByTyp: ");
                    sb2.append(e.getMessage());
                    C45372t.m143409d(str2, sb2.toString());
                }
            }
        }
    }

    /* renamed from: i */
    private void m64597i() {
        if (this.f53101p != null) {
            this.f53101p.mo52414b();
            this.f53101p = null;
        }
    }

    static {
        new Thread(new Runnable() {
            public final void run() {
                synchronized (C19615a.class) {
                    MediaCodecList.getCodecCount();
                }
            }
        }).start();
    }

    /* renamed from: g */
    private int m64595g() {
        int[] f = m64594f();
        if (f == null) {
            return -1;
        }
        for (int i = 0; i < f.length; i++) {
            if (f[i] == 2130708361) {
                C45372t.m143403a("AVCEncoder", "====== mColorFormat support COLOR_FormatSurface ======");
                return f[i];
            }
        }
        return -1;
    }

    /* renamed from: h */
    private boolean m64596h() {
        if (this.f53100o == null) {
            C45372t.m143409d("AVCEncoder", "initEGLCtx: MediaCodec should initialized ahead.");
            return false;
        }
        this.f53101p = C19709e.m64982a();
        this.f53101p.mo52411a(0.0f);
        this.f53101p.mo52412a(1.0f, -1.0f);
        return true;
    }

    /* renamed from: b */
    public final void mo52188b() {
        C45372t.m143403a("AVCEncoder", "uninitAVCEncoder == enter");
        synchronized (this) {
            if (this.f53092e != 0) {
                if (this.f53097l != null) {
                    if (this.f53092e == 2) {
                        try {
                            this.f53097l.stop();
                        } catch (Exception unused) {
                            C45372t.m143409d("AVCEncoder", "MediaCodec Exception");
                        }
                    }
                    this.f53092e = 3;
                    if (this.f53100o != null) {
                        this.f53100o.release();
                    }
                    mo52189c();
                    C45372t.m143403a("AVCEncoder", "uninitAVCEncoder == exit");
                }
            }
        }
    }

    /* renamed from: c */
    public final synchronized void mo52189c() {
        long currentTimeMillis = System.currentTimeMillis();
        try {
            this.f53097l.release();
        } catch (Exception unused) {
        }
        this.f53097l = null;
        this.f53092e = 0;
        StringBuilder sb = new StringBuilder("time cost: ");
        sb.append(System.currentTimeMillis() - currentTimeMillis);
        C45372t.m143403a("AVCEncoder", sb.toString());
    }

    /* renamed from: d */
    private MediaCodecInfo m64592d() {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String name = codecInfoAt.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    String[] supportedTypes = codecInfoAt.getSupportedTypes();
                    for (String equalsIgnoreCase : supportedTypes) {
                        if (equalsIgnoreCase.equalsIgnoreCase(this.f53098m)) {
                            return codecInfoAt;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: e */
    private MediaCodecInfo m64593e() {
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        if (codecInfos == null || codecInfos.length == 0) {
            return null;
        }
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder()) {
                String name = mediaCodecInfo.getName();
                if (!name.startsWith("OMX.google.") && !name.startsWith("OMX.Nvidia.") && !name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
                    String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                    for (String equalsIgnoreCase : supportedTypes) {
                        if (equalsIgnoreCase.equalsIgnoreCase(this.f53098m)) {
                            return mediaCodecInfo;
                        }
                    }
                    continue;
                }
            }
        }
        return null;
    }

    /* renamed from: f */
    private int[] m64594f() {
        MediaCodecInfo mediaCodecInfo;
        C45372t.m143403a("AVCEncoder", "start == ");
        if (VERSION.SDK_INT >= 21) {
            mediaCodecInfo = m64593e();
        } else {
            mediaCodecInfo = m64592d();
        }
        this.f53099n = mediaCodecInfo;
        C45372t.m143403a("AVCEncoder", "end == ");
        if (this.f53099n == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder("mMediaCodecInfo name = ");
        sb.append(this.f53099n.getName());
        C45372t.m143403a("AVCEncoder", sb.toString());
        CodecCapabilities capabilitiesForType = this.f53099n.getCapabilitiesForType(this.f53098m);
        int length = capabilitiesForType.colorFormats.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = capabilitiesForType.colorFormats[i];
        }
        return iArr;
    }

    /* renamed from: a */
    public static void m64588a(int i) {
        f53088k = i;
    }

    /* renamed from: a */
    public static void m64590a(C19620b bVar) {
        f53086a = bVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0054 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m64591a(boolean r10) {
        /*
            r9 = this;
            int r0 = r9.f53102q
            int r1 = r9.f53103r
            int r0 = r0 * r1
            int r0 = r0 * 4
            java.nio.ByteBuffer r0 = java.nio.ByteBuffer.allocateDirect(r0)
            java.nio.ByteOrder r1 = java.nio.ByteOrder.nativeOrder()
            java.nio.ByteBuffer r0 = r0.order(r1)
            int r4 = r9.f53102q
            int r5 = r9.f53103r
            r2 = 0
            r3 = 0
            r6 = 6408(0x1908, float:8.98E-42)
            r7 = 5121(0x1401, float:7.176E-42)
            r8 = r0
            android.opengl.GLES20.glReadPixels(r2, r3, r4, r5, r6, r7, r8)
            java.io.BufferedOutputStream r1 = r9.f53096i     // Catch:{ IOException -> 0x0054, all -> 0x0049 }
            if (r1 != 0) goto L_0x0034
            java.io.BufferedOutputStream r1 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0054, all -> 0x0049 }
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x0054, all -> 0x0049 }
            java.lang.String r3 = "/storage/emulated/0/xzw/rgbaBig.rgba"
            r2.<init>(r3)     // Catch:{ IOException -> 0x0054, all -> 0x0049 }
            r1.<init>(r2)     // Catch:{ IOException -> 0x0054, all -> 0x0049 }
            r9.f53096i = r1     // Catch:{ IOException -> 0x0054, all -> 0x0049 }
        L_0x0034:
            java.io.BufferedOutputStream r1 = r9.f53096i     // Catch:{ IOException -> 0x0054, all -> 0x0049 }
            byte[] r2 = r0.array()     // Catch:{ IOException -> 0x0054, all -> 0x0049 }
            r1.write(r2)     // Catch:{ IOException -> 0x0054, all -> 0x0049 }
            java.io.BufferedOutputStream r1 = r9.f53096i     // Catch:{ IOException -> 0x0047 }
            if (r1 == 0) goto L_0x005b
            java.io.BufferedOutputStream r1 = r9.f53096i     // Catch:{ IOException -> 0x0047 }
        L_0x0043:
            r1.close()     // Catch:{ IOException -> 0x0047 }
            goto L_0x005b
        L_0x0047:
            goto L_0x005b
        L_0x0049:
            r10 = move-exception
            java.io.BufferedOutputStream r0 = r9.f53096i     // Catch:{ IOException -> 0x0053 }
            if (r0 == 0) goto L_0x0053
            java.io.BufferedOutputStream r0 = r9.f53096i     // Catch:{ IOException -> 0x0053 }
            r0.close()     // Catch:{ IOException -> 0x0053 }
        L_0x0053:
            throw r10
        L_0x0054:
            java.io.BufferedOutputStream r1 = r9.f53096i     // Catch:{ IOException -> 0x0047 }
            if (r1 == 0) goto L_0x005b
            java.io.BufferedOutputStream r1 = r9.f53096i     // Catch:{ IOException -> 0x0047 }
            goto L_0x0043
        L_0x005b:
            int r1 = r9.f53102q
            int r2 = r9.f53103r
            android.graphics.Bitmap$Config r3 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r1 = android.graphics.Bitmap.createBitmap(r1, r2, r3)
            r1.copyPixelsFromBuffer(r0)
            if (r10 == 0) goto L_0x0070
            java.lang.String r10 = "/sdcard/aweme/picture/record_e.jpeg"
            m64589a(r1, r10)
            goto L_0x0075
        L_0x0070:
            java.lang.String r10 = "/sdcard/aweme/picture/record_s.jpeg"
            m64589a(r1, r10)
        L_0x0075:
            r1.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.C19615a.m64591a(boolean):void");
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x002b */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0059 A[SYNTHETIC, Splitter:B:27:0x0059] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x005e A[SYNTHETIC, Splitter:B:31:0x005e] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0067 A[SYNTHETIC, Splitter:B:38:0x0067] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x006c A[SYNTHETIC, Splitter:B:42:0x006c] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void m64589a(android.graphics.Bitmap r4, java.lang.String r5) {
        /*
            java.lang.String r0 = "AVCEncoder"
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "saving Bitmap : "
            r1.<init>(r2)
            r1.append(r5)
            java.lang.String r1 = r1.toString()
            com.p280ss.android.vesdk.C45372t.m143403a(r0, r1)
            r0 = 0
            java.io.FileOutputStream r1 = new java.io.FileOutputStream     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            r1.<init>(r5)     // Catch:{ IOException -> 0x004f, all -> 0x004c }
            java.io.BufferedOutputStream r2 = new java.io.BufferedOutputStream     // Catch:{ IOException -> 0x0050 }
            r2.<init>(r1)     // Catch:{ IOException -> 0x0050 }
            android.graphics.Bitmap$CompressFormat r0 = android.graphics.Bitmap.CompressFormat.JPEG     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            r3 = 100
            r4.compress(r0, r3, r2)     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            r2.flush()     // Catch:{ IOException -> 0x004a, all -> 0x0047 }
            r2.close()     // Catch:{ IOException -> 0x002b }
        L_0x002b:
            r1.close()     // Catch:{ IOException -> 0x002e }
        L_0x002e:
            java.lang.String r4 = "AVCEncoder"
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Bitmap "
            r0.<init>(r1)
            r0.append(r5)
            java.lang.String r5 = " saved!"
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            com.p280ss.android.vesdk.C45372t.m143403a(r4, r5)
            return
        L_0x0047:
            r4 = move-exception
            r0 = r2
            goto L_0x0065
        L_0x004a:
            r0 = r2
            goto L_0x0050
        L_0x004c:
            r4 = move-exception
            r1 = r0
            goto L_0x0065
        L_0x004f:
            r1 = r0
        L_0x0050:
            java.lang.String r4 = "AVCEncoder"
            java.lang.String r5 = "Err when saving bitmap..."
            com.p280ss.android.vesdk.C45372t.m143409d(r4, r5)     // Catch:{ all -> 0x0064 }
            if (r0 == 0) goto L_0x005c
            r0.close()     // Catch:{ IOException -> 0x005c }
        L_0x005c:
            if (r1 == 0) goto L_0x0063
            r1.close()     // Catch:{ IOException -> 0x0062 }
            goto L_0x0063
        L_0x0062:
            return
        L_0x0063:
            return
        L_0x0064:
            r4 = move-exception
        L_0x0065:
            if (r0 == 0) goto L_0x006a
            r0.close()     // Catch:{ IOException -> 0x006a }
        L_0x006a:
            if (r1 == 0) goto L_0x006f
            r1.close()     // Catch:{ IOException -> 0x006f }
        L_0x006f:
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.C19615a.m64589a(android.graphics.Bitmap, java.lang.String):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:63:0x01a2, code lost:
        return 0;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo52184a(byte[] r22, int r23, boolean r24) {
        /*
            r21 = this;
            r1 = r21
            r0 = r22
            r2 = r23
            r3 = r24
            monitor-enter(r21)
            int r4 = r1.f53092e     // Catch:{ all -> 0x01a6 }
            r5 = 2
            if (r4 != r5) goto L_0x01a3
            android.media.MediaCodec r4 = r1.f53097l     // Catch:{ all -> 0x01a6 }
            if (r4 != 0) goto L_0x0014
            goto L_0x01a3
        L_0x0014:
            java.lang.String r4 = "AVCEncoder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            java.lang.String r7 = "encodeBuffer pts: "
            r6.<init>(r7)     // Catch:{ all -> 0x01a6 }
            r6.append(r2)     // Catch:{ all -> 0x01a6 }
            java.lang.String r7 = "  isEndStream = "
            r6.append(r7)     // Catch:{ all -> 0x01a6 }
            r6.append(r3)     // Catch:{ all -> 0x01a6 }
            java.lang.String r6 = r6.toString()     // Catch:{ all -> 0x01a6 }
            com.p280ss.android.vesdk.C45372t.m143405b(r4, r6)     // Catch:{ all -> 0x01a6 }
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x01a6 }
            r6 = 21
            r7 = 0
            r9 = 4
            r10 = -1
            r12 = 1
            r13 = 0
            if (r4 < r6) goto L_0x00fe
            android.media.MediaCodec r4 = r1.f53097l     // Catch:{ all -> 0x01a6 }
            int r15 = r4.dequeueInputBuffer(r10)     // Catch:{ all -> 0x01a6 }
            if (r15 < 0) goto L_0x0065
            android.media.MediaCodec r4 = r1.f53097l     // Catch:{ all -> 0x01a6 }
            java.nio.ByteBuffer r4 = r4.getInputBuffer(r15)     // Catch:{ all -> 0x01a6 }
            r4.clear()     // Catch:{ all -> 0x01a6 }
            int r6 = r0.length     // Catch:{ all -> 0x01a6 }
            r4.put(r0, r13, r6)     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec r14 = r1.f53097l     // Catch:{ all -> 0x01a6 }
            r16 = 0
            int r0 = r0.length     // Catch:{ all -> 0x01a6 }
            long r10 = (long) r2     // Catch:{ all -> 0x01a6 }
            if (r3 != r12) goto L_0x005c
            r20 = 4
            goto L_0x005e
        L_0x005c:
            r20 = 0
        L_0x005e:
            r17 = r0
            r18 = r10
            r14.queueInputBuffer(r15, r16, r17, r18, r20)     // Catch:{ all -> 0x01a6 }
        L_0x0065:
            android.media.MediaCodec r0 = r1.f53097l     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r2 = r1.f53089b     // Catch:{ all -> 0x01a6 }
            int r3 = f53088k     // Catch:{ all -> 0x01a6 }
            long r3 = (long) r3     // Catch:{ all -> 0x01a6 }
            int r0 = r0.dequeueOutputBuffer(r2, r3)     // Catch:{ all -> 0x01a6 }
            java.lang.String r2 = "AVCEncoder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            java.lang.String r4 = "outputBufferIndex = "
            r3.<init>(r4)     // Catch:{ all -> 0x01a6 }
            r3.append(r0)     // Catch:{ all -> 0x01a6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01a6 }
            com.p280ss.android.vesdk.C45372t.m143405b(r2, r3)     // Catch:{ all -> 0x01a6 }
            java.lang.String r2 = "AVCEncoder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x01a6 }
            java.lang.String r4 = "mBufferInfo.flags = "
            r3.<init>(r4)     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r4 = r1.f53089b     // Catch:{ all -> 0x01a6 }
            int r4 = r4.flags     // Catch:{ all -> 0x01a6 }
            r3.append(r4)     // Catch:{ all -> 0x01a6 }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x01a6 }
            com.p280ss.android.vesdk.C45372t.m143405b(r2, r3)     // Catch:{ all -> 0x01a6 }
        L_0x009a:
            if (r0 < 0) goto L_0x01a1
            android.media.MediaCodec r2 = r1.f53097l     // Catch:{ all -> 0x01a6 }
            java.nio.ByteBuffer r2 = r2.getOutputBuffer(r0)     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r3 = r1.f53089b     // Catch:{ all -> 0x01a6 }
            int r3 = r3.offset     // Catch:{ all -> 0x01a6 }
            r2.position(r3)     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r3 = r1.f53089b     // Catch:{ all -> 0x01a6 }
            int r3 = r3.offset     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r4 = r1.f53089b     // Catch:{ all -> 0x01a6 }
            int r4 = r4.size     // Catch:{ all -> 0x01a6 }
            int r3 = r3 + r4
            r2.limit(r3)     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r3 = r1.f53089b     // Catch:{ all -> 0x01a6 }
            int r3 = r3.flags     // Catch:{ all -> 0x01a6 }
            r3 = r3 & r5
            if (r3 == 0) goto L_0x00d1
            java.lang.String r3 = "AVCEncoder"
            java.lang.String r4 = "mEncoderCaller.onSetCodecConfig"
            com.p280ss.android.vesdk.C45372t.m143405b(r3, r4)     // Catch:{ all -> 0x01a6 }
            com.ss.android.medialib.b r3 = f53086a     // Catch:{ all -> 0x01a6 }
            if (r3 == 0) goto L_0x00cc
            com.ss.android.medialib.b r3 = f53086a     // Catch:{ all -> 0x01a6 }
            r3.onSetCodecConfig(r2)     // Catch:{ all -> 0x01a6 }
        L_0x00cc:
            android.media.MediaCodec$BufferInfo r2 = r1.f53089b     // Catch:{ all -> 0x01a6 }
            r2.size = r13     // Catch:{ all -> 0x01a6 }
            goto L_0x00f0
        L_0x00d1:
            android.media.MediaCodec$BufferInfo r3 = r1.f53089b     // Catch:{ all -> 0x01a6 }
            long r3 = r3.presentationTimeUs     // Catch:{ all -> 0x01a6 }
            int r3 = (int) r3     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r4 = r1.f53089b     // Catch:{ all -> 0x01a6 }
            int r4 = r4.flags     // Catch:{ all -> 0x01a6 }
            r4 = r4 & r12
            if (r4 == 0) goto L_0x00df
            r4 = 1
            goto L_0x00e0
        L_0x00df:
            r4 = 0
        L_0x00e0:
            java.lang.String r6 = "AVCEncoder"
            java.lang.String r9 = "mEncoderCaller.onWriteFile"
            com.p280ss.android.vesdk.C45372t.m143405b(r6, r9)     // Catch:{ all -> 0x01a6 }
            com.ss.android.medialib.b r6 = f53086a     // Catch:{ all -> 0x01a6 }
            if (r6 == 0) goto L_0x00f0
            com.ss.android.medialib.b r6 = f53086a     // Catch:{ all -> 0x01a6 }
            r6.onWriteFile(r2, r3, r13, r4)     // Catch:{ all -> 0x01a6 }
        L_0x00f0:
            android.media.MediaCodec r2 = r1.f53097l     // Catch:{ all -> 0x01a6 }
            r2.releaseOutputBuffer(r0, r13)     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec r0 = r1.f53097l     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r2 = r1.f53089b     // Catch:{ all -> 0x01a6 }
            int r0 = r0.dequeueOutputBuffer(r2, r7)     // Catch:{ all -> 0x01a6 }
            goto L_0x009a
        L_0x00fe:
            android.media.MediaCodec r4 = r1.f53097l     // Catch:{ all -> 0x01a6 }
            int r15 = r4.dequeueInputBuffer(r10)     // Catch:{ all -> 0x01a6 }
            if (r15 < 0) goto L_0x0125
            java.nio.ByteBuffer[] r4 = r1.f53090c     // Catch:{ all -> 0x01a6 }
            r4 = r4[r15]     // Catch:{ all -> 0x01a6 }
            r4.clear()     // Catch:{ all -> 0x01a6 }
            int r6 = r0.length     // Catch:{ all -> 0x01a6 }
            r4.put(r0, r13, r6)     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec r14 = r1.f53097l     // Catch:{ all -> 0x01a6 }
            r16 = 0
            int r0 = r0.length     // Catch:{ all -> 0x01a6 }
            long r10 = (long) r2     // Catch:{ all -> 0x01a6 }
            if (r3 != r12) goto L_0x011c
            r20 = 4
            goto L_0x011e
        L_0x011c:
            r20 = 0
        L_0x011e:
            r17 = r0
            r18 = r10
            r14.queueInputBuffer(r15, r16, r17, r18, r20)     // Catch:{ all -> 0x01a6 }
        L_0x0125:
            android.media.MediaCodec r0 = r1.f53097l     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r2 = r1.f53089b     // Catch:{ all -> 0x01a6 }
            int r3 = f53088k     // Catch:{ all -> 0x01a6 }
            long r3 = (long) r3     // Catch:{ all -> 0x01a6 }
            int r0 = r0.dequeueOutputBuffer(r2, r3)     // Catch:{ all -> 0x01a6 }
        L_0x0130:
            if (r0 < 0) goto L_0x01a1
            r2 = -3
            if (r0 != r2) goto L_0x013e
            android.media.MediaCodec r0 = r1.f53097l     // Catch:{ all -> 0x01a6 }
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()     // Catch:{ all -> 0x01a6 }
            r1.f53091d = r0     // Catch:{ all -> 0x01a6 }
            goto L_0x0198
        L_0x013e:
            r2 = -2
            if (r0 == r2) goto L_0x0198
            java.nio.ByteBuffer[] r2 = r1.f53091d     // Catch:{ all -> 0x01a6 }
            r2 = r2[r0]     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r3 = r1.f53089b     // Catch:{ all -> 0x01a6 }
            int r3 = r3.offset     // Catch:{ all -> 0x01a6 }
            r2.position(r3)     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r3 = r1.f53089b     // Catch:{ all -> 0x01a6 }
            int r3 = r3.offset     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r4 = r1.f53089b     // Catch:{ all -> 0x01a6 }
            int r4 = r4.size     // Catch:{ all -> 0x01a6 }
            int r3 = r3 + r4
            r2.limit(r3)     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r3 = r1.f53089b     // Catch:{ all -> 0x01a6 }
            int r3 = r3.flags     // Catch:{ all -> 0x01a6 }
            r3 = r3 & r5
            if (r3 == 0) goto L_0x0174
            java.lang.String r3 = "AVCEncoder"
            java.lang.String r4 = "mEncoderCaller.onSetCodecConfig"
            com.p280ss.android.vesdk.C45372t.m143405b(r3, r4)     // Catch:{ all -> 0x01a6 }
            com.ss.android.medialib.b r3 = f53086a     // Catch:{ all -> 0x01a6 }
            if (r3 == 0) goto L_0x016f
            com.ss.android.medialib.b r3 = f53086a     // Catch:{ all -> 0x01a6 }
            r3.onSetCodecConfig(r2)     // Catch:{ all -> 0x01a6 }
        L_0x016f:
            android.media.MediaCodec$BufferInfo r2 = r1.f53089b     // Catch:{ all -> 0x01a6 }
            r2.size = r13     // Catch:{ all -> 0x01a6 }
            goto L_0x0193
        L_0x0174:
            android.media.MediaCodec$BufferInfo r3 = r1.f53089b     // Catch:{ all -> 0x01a6 }
            long r3 = r3.presentationTimeUs     // Catch:{ all -> 0x01a6 }
            int r3 = (int) r3     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r4 = r1.f53089b     // Catch:{ all -> 0x01a6 }
            int r4 = r4.flags     // Catch:{ all -> 0x01a6 }
            r4 = r4 & r12
            if (r4 == 0) goto L_0x0182
            r4 = 1
            goto L_0x0183
        L_0x0182:
            r4 = 0
        L_0x0183:
            java.lang.String r6 = "AVCEncoder"
            java.lang.String r9 = "mEncoderCaller.onWriteFile"
            com.p280ss.android.vesdk.C45372t.m143405b(r6, r9)     // Catch:{ all -> 0x01a6 }
            com.ss.android.medialib.b r6 = f53086a     // Catch:{ all -> 0x01a6 }
            if (r6 == 0) goto L_0x0193
            com.ss.android.medialib.b r6 = f53086a     // Catch:{ all -> 0x01a6 }
            r6.onWriteFile(r2, r3, r13, r4)     // Catch:{ all -> 0x01a6 }
        L_0x0193:
            android.media.MediaCodec r2 = r1.f53097l     // Catch:{ all -> 0x01a6 }
            r2.releaseOutputBuffer(r0, r13)     // Catch:{ all -> 0x01a6 }
        L_0x0198:
            android.media.MediaCodec r0 = r1.f53097l     // Catch:{ all -> 0x01a6 }
            android.media.MediaCodec$BufferInfo r2 = r1.f53089b     // Catch:{ all -> 0x01a6 }
            int r0 = r0.dequeueOutputBuffer(r2, r7)     // Catch:{ all -> 0x01a6 }
            goto L_0x0130
        L_0x01a1:
            monitor-exit(r21)     // Catch:{ all -> 0x01a6 }
            return r13
        L_0x01a3:
            r0 = -1
            monitor-exit(r21)     // Catch:{ all -> 0x01a6 }
            return r0
        L_0x01a6:
            r0 = move-exception
            monitor-exit(r21)     // Catch:{ all -> 0x01a6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.C19615a.mo52184a(byte[], int, boolean):int");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(6:22|23|24|25|26|27) */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x012b, code lost:
        if (r9 >= 0) goto L_0x013b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x012d, code lost:
        com.p280ss.android.vesdk.C45372t.m143405b("AVCEncoder", "encode: error.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x013a, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x013d, code lost:
        if (android.os.Build.VERSION.SDK_INT < 21) goto L_0x0147;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x013f, code lost:
        r4 = r1.f53097l.getOutputBuffer(r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0145, code lost:
        r11 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0147, code lost:
        r4 = r1.f53091d[r9];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x014c, code lost:
        r11.position(r1.f53089b.offset);
        r11.limit(r1.f53089b.offset + r1.f53089b.size);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0164, code lost:
        if ((r1.f53089b.flags & 2) == 0) goto L_0x017c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0166, code lost:
        com.p280ss.android.vesdk.C45372t.m143405b("AVCEncoder", "mEncoderCaller.onSetCodecConfig");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x016f, code lost:
        if (f53086a == null) goto L_0x0176;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0171, code lost:
        f53086a.onSetCodecConfig(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0176, code lost:
        r1.f53089b.size = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x0181, code lost:
        if ((r1.f53089b.flags & 1) == 0) goto L_0x0186;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0183, code lost:
        r17 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0186, code lost:
        r17 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:74:0x0188, code lost:
        com.p280ss.android.vesdk.C45372t.m143405b("AVCEncoder", "mEncoderCaller.onWriteFile");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:75:0x0191, code lost:
        if (f53086a == null) goto L_0x01f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x0193, code lost:
        r8 = new java.lang.StringBuilder("encode: pts queue size = ");
        r8.append(r1.f53105t.size());
        com.p280ss.android.vesdk.C45372t.m143405b("AVCEncoder", r8.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x01b2, code lost:
        if (r1.f53105t.size() <= 0) goto L_0x01ea;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:78:0x01b4, code lost:
        r1.f53108w++;
        r4 = (android.util.Pair) r1.f53105t.poll();
        r14 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x01c9, code lost:
        if (r1.f53089b.presentationTimeUs <= 0) goto L_0x01cf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x01cb, code lost:
        r14 = r1.f53089b.presentationTimeUs;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x01cf, code lost:
        f53086a.onWriteFile(r11, r14 / 1000, (long) ((java.lang.Integer) r4.first).intValue(), ((java.lang.Integer) r4.second).intValue(), r17);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x01ea, code lost:
        com.p280ss.android.vesdk.C45372t.m143407c("AVCEncoder", "encode: no available pts!!!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x01f2, code lost:
        com.p280ss.android.vesdk.C45372t.m143405b("AVCEncoder", "encode: no output.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x00b1 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo52183a(int r19, int r20, int r21, boolean r22) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            r2 = r20
            r3 = r22
            java.lang.String r4 = "AVCEncoder"
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "encodeTexture::texID: "
            r5.<init>(r6)
            r5.append(r0)
            java.lang.String r6 = " pts: "
            r5.append(r6)
            r5.append(r2)
            java.lang.String r6 = " duration:"
            r5.append(r6)
            r6 = r21
            r5.append(r6)
            java.lang.String r7 = "  isEndStream = "
            r5.append(r7)
            r5.append(r3)
            java.lang.String r5 = r5.toString()
            com.p280ss.android.vesdk.C45372t.m143405b(r4, r5)
            monitor-enter(r18)
            int r4 = r1.f53092e     // Catch:{ all -> 0x0246 }
            r5 = 2
            r7 = -1
            if (r4 != r5) goto L_0x023d
            android.media.MediaCodec r4 = r1.f53097l     // Catch:{ all -> 0x0246 }
            if (r4 != 0) goto L_0x0042
            goto L_0x023d
        L_0x0042:
            if (r0 <= 0) goto L_0x0220
            if (r2 >= 0) goto L_0x0048
            goto L_0x0220
        L_0x0048:
            com.ss.android.medialib.common.e r4 = r1.f53101p     // Catch:{ all -> 0x0246 }
            if (r4 != 0) goto L_0x0054
            boolean r4 = r18.m64596h()     // Catch:{ all -> 0x0246 }
            if (r4 != 0) goto L_0x0054
            monitor-exit(r18)     // Catch:{ all -> 0x0246 }
            return r7
        L_0x0054:
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r4 = r1.f53105t     // Catch:{ all -> 0x0246 }
            java.lang.Integer r2 = java.lang.Integer.valueOf(r20)     // Catch:{ all -> 0x0246 }
            java.lang.Integer r6 = java.lang.Integer.valueOf(r21)     // Catch:{ all -> 0x0246 }
            android.util.Pair r2 = android.util.Pair.create(r2, r6)     // Catch:{ all -> 0x0246 }
            r4.offer(r2)     // Catch:{ all -> 0x0246 }
            int r2 = r1.f53102q     // Catch:{ all -> 0x0246 }
            int r4 = r1.f53103r     // Catch:{ all -> 0x0246 }
            r6 = 0
            android.opengl.GLES20.glViewport(r6, r6, r2, r4)     // Catch:{ all -> 0x0246 }
            java.lang.String r2 = "AVCEncoder"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0246 }
            java.lang.String r8 = "encode: width = "
            r4.<init>(r8)     // Catch:{ all -> 0x0246 }
            int r8 = r1.f53102q     // Catch:{ all -> 0x0246 }
            r4.append(r8)     // Catch:{ all -> 0x0246 }
            java.lang.String r8 = " height = "
            r4.append(r8)     // Catch:{ all -> 0x0246 }
            int r8 = r1.f53103r     // Catch:{ all -> 0x0246 }
            r4.append(r8)     // Catch:{ all -> 0x0246 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0246 }
            com.p280ss.android.vesdk.C45372t.m143405b(r2, r4)     // Catch:{ all -> 0x0246 }
            com.ss.android.medialib.common.e r2 = r1.f53101p     // Catch:{ all -> 0x0246 }
            r2.mo52413a(r0)     // Catch:{ all -> 0x0246 }
            android.opengl.GLES20.glFinish()     // Catch:{ all -> 0x0246 }
            int r0 = r1.f53107v     // Catch:{ all -> 0x0246 }
            r2 = 1
            int r0 = r0 + r2
            r1.f53107v = r0     // Catch:{ all -> 0x0246 }
            com.ss.android.medialib.b r0 = f53086a     // Catch:{ all -> 0x0246 }
            r0.onSwapGlBuffers()     // Catch:{ all -> 0x0246 }
            boolean r0 = r1.f53104s     // Catch:{ all -> 0x0246 }
            if (r0 == 0) goto L_0x00a8
            r1.m64591a(r3)     // Catch:{ all -> 0x0246 }
            r1.f53104s = r6     // Catch:{ all -> 0x0246 }
        L_0x00a8:
            r0 = -2
            if (r3 == 0) goto L_0x00b5
            android.media.MediaCodec r4 = r1.f53097l     // Catch:{ Throwable -> 0x00b1 }
            r4.signalEndOfInputStream()     // Catch:{ Throwable -> 0x00b1 }
            goto L_0x00b5
        L_0x00b1:
            r1.f53095h = r2     // Catch:{ all -> 0x0246 }
            monitor-exit(r18)     // Catch:{ all -> 0x0246 }
            return r0
        L_0x00b5:
            r4 = 0
        L_0x00b6:
            int r4 = r4 + r2
            r8 = -3
            int r9 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0200 }
            r10 = 21
            if (r9 >= r10) goto L_0x00c6
            android.media.MediaCodec r9 = r1.f53097l     // Catch:{ Throwable -> 0x0200 }
            java.nio.ByteBuffer[] r9 = r9.getOutputBuffers()     // Catch:{ Throwable -> 0x0200 }
            r1.f53091d = r9     // Catch:{ Throwable -> 0x0200 }
        L_0x00c6:
            android.media.MediaCodec r9 = r1.f53097l     // Catch:{ Throwable -> 0x0200 }
            android.media.MediaCodec$BufferInfo r11 = r1.f53089b     // Catch:{ Throwable -> 0x0200 }
            int r12 = f53088k     // Catch:{ Throwable -> 0x0200 }
            long r12 = (long) r12     // Catch:{ Throwable -> 0x0200 }
            int r9 = r9.dequeueOutputBuffer(r11, r12)     // Catch:{ Throwable -> 0x0200 }
            java.lang.String r11 = "AVCEncoder"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0246 }
            java.lang.String r13 = "outputBufferIndex = "
            r12.<init>(r13)     // Catch:{ all -> 0x0246 }
            r12.append(r9)     // Catch:{ all -> 0x0246 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0246 }
            com.p280ss.android.vesdk.C45372t.m143405b(r11, r12)     // Catch:{ all -> 0x0246 }
            java.lang.String r11 = "AVCEncoder"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch:{ all -> 0x0246 }
            java.lang.String r13 = "mBufferInfo.flags = "
            r12.<init>(r13)     // Catch:{ all -> 0x0246 }
            android.media.MediaCodec$BufferInfo r13 = r1.f53089b     // Catch:{ all -> 0x0246 }
            int r13 = r13.flags     // Catch:{ all -> 0x0246 }
            r12.append(r13)     // Catch:{ all -> 0x0246 }
            java.lang.String r12 = r12.toString()     // Catch:{ all -> 0x0246 }
            com.p280ss.android.vesdk.C45372t.m143405b(r11, r12)     // Catch:{ all -> 0x0246 }
            if (r9 != r7) goto L_0x0116
            if (r3 == 0) goto L_0x0109
            int r8 = f53088k     // Catch:{ all -> 0x0246 }
            r9 = 5000(0x1388, float:7.006E-42)
            if (r8 >= r9) goto L_0x0109
            r8 = 10000(0x2710, float:1.4013E-41)
            f53088k = r8     // Catch:{ all -> 0x0246 }
        L_0x0109:
            if (r3 == 0) goto L_0x0134
            int r8 = r1.f53107v     // Catch:{ all -> 0x0246 }
            int r9 = r1.f53108w     // Catch:{ all -> 0x0246 }
            if (r8 == r9) goto L_0x0134
            r8 = 10
            if (r4 >= r8) goto L_0x0134
            goto L_0x00b6
        L_0x0116:
            if (r9 != r8) goto L_0x0121
            android.media.MediaCodec r8 = r1.f53097l     // Catch:{ all -> 0x0246 }
            java.nio.ByteBuffer[] r8 = r8.getOutputBuffers()     // Catch:{ all -> 0x0246 }
            r1.f53091d = r8     // Catch:{ all -> 0x0246 }
            goto L_0x00b6
        L_0x0121:
            if (r9 != r0) goto L_0x012b
            java.lang.String r8 = "AVCEncoder"
            java.lang.String r9 = "encode: output format change!"
            com.p280ss.android.vesdk.C45372t.m143405b(r8, r9)     // Catch:{ all -> 0x0246 }
            goto L_0x00b6
        L_0x012b:
            if (r9 >= 0) goto L_0x013b
            java.lang.String r0 = "AVCEncoder"
            java.lang.String r2 = "encode: error."
            com.p280ss.android.vesdk.C45372t.m143405b(r0, r2)     // Catch:{ all -> 0x0246 }
        L_0x0134:
            if (r3 == 0) goto L_0x0139
            r18.m64597i()     // Catch:{ all -> 0x0246 }
        L_0x0139:
            monitor-exit(r18)     // Catch:{ all -> 0x0246 }
            return r6
        L_0x013b:
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x0246 }
            if (r4 < r10) goto L_0x0147
            android.media.MediaCodec r4 = r1.f53097l     // Catch:{ all -> 0x0246 }
            java.nio.ByteBuffer r4 = r4.getOutputBuffer(r9)     // Catch:{ all -> 0x0246 }
        L_0x0145:
            r11 = r4
            goto L_0x014c
        L_0x0147:
            java.nio.ByteBuffer[] r4 = r1.f53091d     // Catch:{ all -> 0x0246 }
            r4 = r4[r9]     // Catch:{ all -> 0x0246 }
            goto L_0x0145
        L_0x014c:
            android.media.MediaCodec$BufferInfo r4 = r1.f53089b     // Catch:{ all -> 0x0246 }
            int r4 = r4.offset     // Catch:{ all -> 0x0246 }
            r11.position(r4)     // Catch:{ all -> 0x0246 }
            android.media.MediaCodec$BufferInfo r4 = r1.f53089b     // Catch:{ all -> 0x0246 }
            int r4 = r4.offset     // Catch:{ all -> 0x0246 }
            android.media.MediaCodec$BufferInfo r8 = r1.f53089b     // Catch:{ all -> 0x0246 }
            int r8 = r8.size     // Catch:{ all -> 0x0246 }
            int r4 = r4 + r8
            r11.limit(r4)     // Catch:{ all -> 0x0246 }
            android.media.MediaCodec$BufferInfo r4 = r1.f53089b     // Catch:{ all -> 0x0246 }
            int r4 = r4.flags     // Catch:{ all -> 0x0246 }
            r4 = r4 & r5
            if (r4 == 0) goto L_0x017c
            java.lang.String r4 = "AVCEncoder"
            java.lang.String r8 = "mEncoderCaller.onSetCodecConfig"
            com.p280ss.android.vesdk.C45372t.m143405b(r4, r8)     // Catch:{ all -> 0x0246 }
            com.ss.android.medialib.b r4 = f53086a     // Catch:{ all -> 0x0246 }
            if (r4 == 0) goto L_0x0176
            com.ss.android.medialib.b r4 = f53086a     // Catch:{ all -> 0x0246 }
            r4.onSetCodecConfig(r11)     // Catch:{ all -> 0x0246 }
        L_0x0176:
            android.media.MediaCodec$BufferInfo r4 = r1.f53089b     // Catch:{ all -> 0x0246 }
            r4.size = r6     // Catch:{ all -> 0x0246 }
            goto L_0x01f9
        L_0x017c:
            android.media.MediaCodec$BufferInfo r4 = r1.f53089b     // Catch:{ all -> 0x0246 }
            int r4 = r4.flags     // Catch:{ all -> 0x0246 }
            r4 = r4 & r2
            if (r4 == 0) goto L_0x0186
            r17 = 1
            goto L_0x0188
        L_0x0186:
            r17 = 0
        L_0x0188:
            java.lang.String r4 = "AVCEncoder"
            java.lang.String r8 = "mEncoderCaller.onWriteFile"
            com.p280ss.android.vesdk.C45372t.m143405b(r4, r8)     // Catch:{ all -> 0x0246 }
            com.ss.android.medialib.b r4 = f53086a     // Catch:{ all -> 0x0246 }
            if (r4 == 0) goto L_0x01f2
            java.lang.String r4 = "AVCEncoder"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ all -> 0x0246 }
            java.lang.String r10 = "encode: pts queue size = "
            r8.<init>(r10)     // Catch:{ all -> 0x0246 }
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r10 = r1.f53105t     // Catch:{ all -> 0x0246 }
            int r10 = r10.size()     // Catch:{ all -> 0x0246 }
            r8.append(r10)     // Catch:{ all -> 0x0246 }
            java.lang.String r8 = r8.toString()     // Catch:{ all -> 0x0246 }
            com.p280ss.android.vesdk.C45372t.m143405b(r4, r8)     // Catch:{ all -> 0x0246 }
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r4 = r1.f53105t     // Catch:{ all -> 0x0246 }
            int r4 = r4.size()     // Catch:{ all -> 0x0246 }
            if (r4 <= 0) goto L_0x01ea
            int r4 = r1.f53108w     // Catch:{ all -> 0x0246 }
            int r4 = r4 + r2
            r1.f53108w = r4     // Catch:{ all -> 0x0246 }
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r4 = r1.f53105t     // Catch:{ all -> 0x0246 }
            java.lang.Object r4 = r4.poll()     // Catch:{ all -> 0x0246 }
            android.util.Pair r4 = (android.util.Pair) r4     // Catch:{ all -> 0x0246 }
            android.media.MediaCodec$BufferInfo r8 = r1.f53089b     // Catch:{ all -> 0x0246 }
            long r12 = r8.presentationTimeUs     // Catch:{ all -> 0x0246 }
            r14 = 0
            int r8 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r8 <= 0) goto L_0x01cf
            android.media.MediaCodec$BufferInfo r8 = r1.f53089b     // Catch:{ all -> 0x0246 }
            long r14 = r8.presentationTimeUs     // Catch:{ all -> 0x0246 }
        L_0x01cf:
            com.ss.android.medialib.b r10 = f53086a     // Catch:{ all -> 0x0246 }
            r12 = 1000(0x3e8, double:4.94E-321)
            long r12 = r14 / r12
            java.lang.Object r8 = r4.first     // Catch:{ all -> 0x0246 }
            java.lang.Integer r8 = (java.lang.Integer) r8     // Catch:{ all -> 0x0246 }
            int r8 = r8.intValue()     // Catch:{ all -> 0x0246 }
            long r14 = (long) r8     // Catch:{ all -> 0x0246 }
            java.lang.Object r4 = r4.second     // Catch:{ all -> 0x0246 }
            java.lang.Integer r4 = (java.lang.Integer) r4     // Catch:{ all -> 0x0246 }
            int r16 = r4.intValue()     // Catch:{ all -> 0x0246 }
            r10.onWriteFile(r11, r12, r14, r16, r17)     // Catch:{ all -> 0x0246 }
            goto L_0x01f9
        L_0x01ea:
            java.lang.String r4 = "AVCEncoder"
            java.lang.String r8 = "encode: no available pts!!!"
            com.p280ss.android.vesdk.C45372t.m143407c(r4, r8)     // Catch:{ all -> 0x0246 }
            goto L_0x01f9
        L_0x01f2:
            java.lang.String r4 = "AVCEncoder"
            java.lang.String r8 = "encode: no output."
            com.p280ss.android.vesdk.C45372t.m143405b(r4, r8)     // Catch:{ all -> 0x0246 }
        L_0x01f9:
            android.media.MediaCodec r4 = r1.f53097l     // Catch:{ all -> 0x0246 }
            r4.releaseOutputBuffer(r9, r6)     // Catch:{ all -> 0x0246 }
            goto L_0x00b5
        L_0x0200:
            r0 = move-exception
            boolean r3 = r1.f53095h     // Catch:{ all -> 0x0246 }
            if (r3 != 0) goto L_0x021c
            java.lang.String r3 = "AVCEncoder"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0246 }
            java.lang.String r5 = "dequeueOutputBuffer failed with: "
            r4.<init>(r5)     // Catch:{ all -> 0x0246 }
            java.lang.String r0 = r0.getMessage()     // Catch:{ all -> 0x0246 }
            r4.append(r0)     // Catch:{ all -> 0x0246 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0246 }
            com.p280ss.android.vesdk.C45372t.m143409d(r3, r0)     // Catch:{ all -> 0x0246 }
        L_0x021c:
            r1.f53095h = r2     // Catch:{ all -> 0x0246 }
            monitor-exit(r18)     // Catch:{ all -> 0x0246 }
            return r8
        L_0x0220:
            java.lang.String r3 = "AVCEncoder"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0246 }
            java.lang.String r5 = "encode: invalidate params: texID = "
            r4.<init>(r5)     // Catch:{ all -> 0x0246 }
            r4.append(r0)     // Catch:{ all -> 0x0246 }
            java.lang.String r0 = ", pts = "
            r4.append(r0)     // Catch:{ all -> 0x0246 }
            r4.append(r2)     // Catch:{ all -> 0x0246 }
            java.lang.String r0 = r4.toString()     // Catch:{ all -> 0x0246 }
            com.p280ss.android.vesdk.C45372t.m143409d(r3, r0)     // Catch:{ all -> 0x0246 }
            monitor-exit(r18)     // Catch:{ all -> 0x0246 }
            return r7
        L_0x023d:
            java.lang.String r0 = "AVCEncoder"
            java.lang.String r2 = "encode: codec is not ready."
            com.p280ss.android.vesdk.C45372t.m143407c(r0, r2)     // Catch:{ all -> 0x0246 }
            monitor-exit(r18)     // Catch:{ all -> 0x0246 }
            return r7
        L_0x0246:
            r0 = move-exception
            monitor-exit(r18)     // Catch:{ all -> 0x0246 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.C19615a.mo52183a(int, int, int, boolean):int");
    }

    /* renamed from: a */
    public final Surface mo52186a(int i, int i2, int i3, int i4, boolean z) {
        return mo52185a(i, i2, i3, 1, 1, i4, z);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:81|82|83|84) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x010c, code lost:
        if (r13.profile < 8) goto L_0x010e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:0x0309, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:81:0x0307 */
    /* JADX WARNING: Removed duplicated region for block: B:40:0x0113 A[Catch:{ Exception -> 0x0307 }, LOOP:0: B:24:0x00be->B:40:0x0113, LOOP_END] */
    /* JADX WARNING: Removed duplicated region for block: B:89:0x0118 A[EDGE_INSN: B:89:0x0118->B:41:0x0118 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.Surface mo52185a(int r17, int r18, int r19, int r20, int r21, int r22, boolean r23) {
        /*
            r16 = this;
            r1 = r16
            r0 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r21
            r6 = r23
            r7 = 0
            if (r6 != 0) goto L_0x0012
            return r7
        L_0x0012:
            int r8 = android.os.Build.VERSION.SDK_INT
            r9 = 18
            if (r8 >= r9) goto L_0x0019
            return r7
        L_0x0019:
            r8 = 0
            r1.f53107v = r8
            r1.f53108w = r8
            java.lang.String r9 = "AVCEncoder"
            java.lang.String r10 = "initAVCEncoder == enter"
            com.p280ss.android.vesdk.C45372t.m143403a(r9, r10)
            r9 = 2
            r10 = 1
            if (r4 < 0) goto L_0x002b
            if (r4 <= r9) goto L_0x0044
        L_0x002b:
            java.lang.String r11 = "AVCEncoder"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Do not support bitrate mode "
            r12.<init>(r13)
            r12.append(r4)
            java.lang.String r4 = ", set VBR mode"
            r12.append(r4)
            java.lang.String r4 = r12.toString()
            com.p280ss.android.vesdk.C45372t.m143403a(r11, r4)
            r4 = 1
        L_0x0044:
            if (r5 <= 0) goto L_0x004a
            r11 = 64
            if (r5 <= r11) goto L_0x0063
        L_0x004a:
            java.lang.String r11 = "AVCEncoder"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "Do not support profile "
            r12.<init>(r13)
            r12.append(r5)
            java.lang.String r5 = ", use baseline"
            r12.append(r5)
            java.lang.String r5 = r12.toString()
            com.p280ss.android.vesdk.C45372t.m143403a(r11, r5)
            r5 = 1
        L_0x0063:
            java.lang.String r11 = "AVCEncoder"
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            java.lang.String r13 = "width + "
            r12.<init>(r13)
            r12.append(r0)
            java.lang.String r13 = "\theight = "
            r12.append(r13)
            r12.append(r2)
            java.lang.String r13 = "\tbitrate = "
            r12.append(r13)
            r12.append(r3)
            java.lang.String r13 = "\tuseTextureInput = "
            r12.append(r13)
            r12.append(r6)
            java.lang.String r6 = r12.toString()
            com.p280ss.android.vesdk.C45372t.m143403a(r11, r6)
            if (r0 <= 0) goto L_0x030c
            if (r2 > 0) goto L_0x0094
            goto L_0x030c
        L_0x0094:
            r1.f53102q = r0
            r1.f53103r = r2
            monitor-enter(r16)
            r16.mo52187a()     // Catch:{ Exception -> 0x0307 }
            com.ss.android.medialib.b r6 = f53086a     // Catch:{ Exception -> 0x0307 }
            if (r6 == 0) goto L_0x00a7
            com.ss.android.medialib.b r6 = f53086a     // Catch:{ Exception -> 0x0307 }
            int r11 = r1.f53106u     // Catch:{ Exception -> 0x0307 }
            r6.setColorFormat(r11)     // Catch:{ Exception -> 0x0307 }
        L_0x00a7:
            java.lang.String r6 = r1.f53098m     // Catch:{ Exception -> 0x0307 }
            android.media.MediaFormat r0 = android.media.MediaFormat.createVideoFormat(r6, r0, r2)     // Catch:{ Exception -> 0x0307 }
            android.media.MediaCodec r2 = r1.f53097l     // Catch:{ Exception -> 0x0307 }
            android.media.MediaCodecInfo r2 = r2.getCodecInfo()     // Catch:{ Exception -> 0x0307 }
            java.lang.String r6 = r1.f53098m     // Catch:{ Exception -> 0x0307 }
            android.media.MediaCodecInfo$CodecCapabilities r2 = r2.getCapabilitiesForType(r6)     // Catch:{ Exception -> 0x0307 }
            android.media.MediaCodecInfo$CodecProfileLevel[] r6 = r2.profileLevels     // Catch:{ Exception -> 0x0307 }
            int r11 = r6.length     // Catch:{ Exception -> 0x0307 }
            r13 = r7
            r12 = 0
        L_0x00be:
            if (r12 >= r11) goto L_0x0118
            r15 = r6[r12]     // Catch:{ Exception -> 0x0307 }
            java.lang.String r7 = "AVCEncoder"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0307 }
            java.lang.String r14 = "Profile = "
            r8.<init>(r14)     // Catch:{ Exception -> 0x0307 }
            int r14 = r15.profile     // Catch:{ Exception -> 0x0307 }
            r8.append(r14)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r14 = ", Level = "
            r8.append(r14)     // Catch:{ Exception -> 0x0307 }
            int r14 = r15.level     // Catch:{ Exception -> 0x0307 }
            r8.append(r14)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r8 = r8.toString()     // Catch:{ Exception -> 0x0307 }
            com.p280ss.android.vesdk.C45372t.m143403a(r7, r8)     // Catch:{ Exception -> 0x0307 }
            int r7 = r15.profile     // Catch:{ Exception -> 0x0307 }
            if (r7 != r10) goto L_0x00ed
            java.lang.String r7 = "AVCEncoder"
            java.lang.String r8 = "Support Baseline Profile!"
            com.p280ss.android.vesdk.C45372t.m143403a(r7, r8)     // Catch:{ Exception -> 0x0307 }
            goto L_0x010e
        L_0x00ed:
            int r7 = r15.profile     // Catch:{ Exception -> 0x0307 }
            if (r7 != r9) goto L_0x00fd
            java.lang.String r7 = "AVCEncoder"
            java.lang.String r8 = "Support Main Profile!"
            com.p280ss.android.vesdk.C45372t.m143403a(r7, r8)     // Catch:{ Exception -> 0x0307 }
            int r7 = r13.profile     // Catch:{ Exception -> 0x0307 }
            if (r7 >= r9) goto L_0x010f
            goto L_0x010e
        L_0x00fd:
            int r7 = r15.profile     // Catch:{ Exception -> 0x0307 }
            r8 = 8
            if (r7 != r8) goto L_0x010f
            java.lang.String r7 = "AVCEncoder"
            java.lang.String r14 = "Support High Profile!"
            com.p280ss.android.vesdk.C45372t.m143403a(r7, r14)     // Catch:{ Exception -> 0x0307 }
            int r7 = r13.profile     // Catch:{ Exception -> 0x0307 }
            if (r7 >= r8) goto L_0x010f
        L_0x010e:
            r13 = r15
        L_0x010f:
            int r7 = r15.profile     // Catch:{ Exception -> 0x0307 }
            if (r7 == r5) goto L_0x0118
            int r12 = r12 + 1
            r7 = 0
            r8 = 0
            goto L_0x00be
        L_0x0118:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0307 }
            r7 = 3
            r8 = 21
            if (r6 < r8) goto L_0x014a
            android.media.MediaCodecInfo$EncoderCapabilities r6 = r2.getEncoderCapabilities()     // Catch:{ Exception -> 0x0307 }
            r11 = 0
        L_0x0124:
            if (r11 >= r7) goto L_0x014a
            java.lang.String r12 = "AVCEncoder"
            java.lang.StringBuilder r14 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0307 }
            r14.<init>()     // Catch:{ Exception -> 0x0307 }
            java.lang.String[] r15 = f53087j     // Catch:{ Exception -> 0x0307 }
            r15 = r15[r11]     // Catch:{ Exception -> 0x0307 }
            r14.append(r15)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r15 = ": "
            r14.append(r15)     // Catch:{ Exception -> 0x0307 }
            boolean r15 = r6.isBitrateModeSupported(r11)     // Catch:{ Exception -> 0x0307 }
            r14.append(r15)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r14 = r14.toString()     // Catch:{ Exception -> 0x0307 }
            com.p280ss.android.vesdk.C45372t.m143405b(r12, r14)     // Catch:{ Exception -> 0x0307 }
            int r11 = r11 + 1
            goto L_0x0124
        L_0x014a:
            int r6 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0307 }
            r11 = 24
            if (r6 < r11) goto L_0x01bb
            if (r13 == 0) goto L_0x01bb
            java.lang.String r5 = "AVCEncoder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0307 }
            java.lang.String r11 = "Set Profile: "
            r6.<init>(r11)     // Catch:{ Exception -> 0x0307 }
            int r11 = r13.profile     // Catch:{ Exception -> 0x0307 }
            r6.append(r11)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r11 = ", Level = "
            r6.append(r11)     // Catch:{ Exception -> 0x0307 }
            int r11 = r13.level     // Catch:{ Exception -> 0x0307 }
            r6.append(r11)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0307 }
            com.p280ss.android.vesdk.C45372t.m143403a(r5, r6)     // Catch:{ Exception -> 0x0307 }
            int r5 = r13.profile     // Catch:{ Exception -> 0x0307 }
            r1.f53094g = r5     // Catch:{ Exception -> 0x0307 }
            java.lang.String r5 = "profile"
            int r6 = r13.profile     // Catch:{ Exception -> 0x0307 }
            r0.setInteger(r5, r6)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r5 = "level"
            int r6 = r13.level     // Catch:{ Exception -> 0x0307 }
            r0.setInteger(r5, r6)     // Catch:{ Exception -> 0x0307 }
            int r5 = r13.profile     // Catch:{ Exception -> 0x0307 }
            if (r5 == r9) goto L_0x019b
            r6 = 8
            if (r5 == r6) goto L_0x018d
            r5 = r3
            goto L_0x01a9
        L_0x018d:
            java.lang.String r5 = "AVCEncoder"
            java.lang.String r6 = "Set High Profile"
            com.p280ss.android.vesdk.C45372t.m143403a(r5, r6)     // Catch:{ Exception -> 0x0307 }
            float r5 = (float) r3     // Catch:{ Exception -> 0x0307 }
            r6 = 1061158912(0x3f400000, float:0.75)
            float r5 = r5 * r6
            int r5 = (int) r5     // Catch:{ Exception -> 0x0307 }
            goto L_0x01a9
        L_0x019b:
            java.lang.String r5 = "AVCEncoder"
            java.lang.String r6 = "Set Main Profile"
            com.p280ss.android.vesdk.C45372t.m143403a(r5, r6)     // Catch:{ Exception -> 0x0307 }
            float r5 = (float) r3     // Catch:{ Exception -> 0x0307 }
            r6 = 1062836634(0x3f59999a, float:0.85)
            float r5 = r5 * r6
            int r5 = (int) r5     // Catch:{ Exception -> 0x0307 }
        L_0x01a9:
            java.lang.String r6 = "te_mediacodec_profile"
            int r11 = r13.profile     // Catch:{ Exception -> 0x0307 }
            long r11 = (long) r11     // Catch:{ Exception -> 0x0307 }
            r14 = 0
            com.p280ss.android.ttve.monitor.C20479f.m67948a(r14, r6, r11)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r6 = "iesve_record_mediacodec_profile"
            int r11 = r13.profile     // Catch:{ Exception -> 0x0307 }
            long r11 = (long) r11     // Catch:{ Exception -> 0x0307 }
            com.p280ss.android.ttve.monitor.C20479f.m67954a(r6, r11)     // Catch:{ Exception -> 0x0307 }
            goto L_0x01e1
        L_0x01bb:
            java.lang.String r6 = "AVCEncoder"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0307 }
            java.lang.String r12 = "Do not support profile "
            r11.<init>(r12)     // Catch:{ Exception -> 0x0307 }
            r11.append(r5)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r5 = ", use baseline"
            r11.append(r5)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r5 = r11.toString()     // Catch:{ Exception -> 0x0307 }
            com.p280ss.android.vesdk.C45372t.m143407c(r6, r5)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r5 = "te_mediacodec_profile"
            r11 = 1
            r6 = 0
            com.p280ss.android.ttve.monitor.C20479f.m67948a(r6, r5, r11)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r5 = "iesve_record_mediacodec_profile"
            com.p280ss.android.ttve.monitor.C20479f.m67954a(r5, r11)     // Catch:{ Exception -> 0x0307 }
            r5 = r3
        L_0x01e1:
            r6 = 12000000(0xb71b00, float:1.6815582E-38)
            if (r5 <= r6) goto L_0x01e9
            r5 = 12000000(0xb71b00, float:1.6815582E-38)
        L_0x01e9:
            java.lang.String r6 = "AVCEncoder"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0307 }
            java.lang.String r12 = "bitrate = "
            r11.<init>(r12)     // Catch:{ Exception -> 0x0307 }
            float r12 = (float) r5     // Catch:{ Exception -> 0x0307 }
            r13 = 1065353216(0x3f800000, float:1.0)
            float r12 = r12 * r13
            r13 = 1232348160(0x49742400, float:1000000.0)
            float r12 = r12 / r13
            r11.append(r12)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r12 = "Mb/s"
            r11.append(r12)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0307 }
            com.p280ss.android.vesdk.C45372t.m143403a(r6, r11)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r6 = "AVCEncoder"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0307 }
            java.lang.String r12 = "speed = "
            r11.<init>(r12)     // Catch:{ Exception -> 0x0307 }
            r12 = r22
            r11.append(r12)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0307 }
            com.p280ss.android.vesdk.C45372t.m143403a(r6, r11)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r6 = "bitrate"
            r0.setInteger(r6, r5)     // Catch:{ Exception -> 0x0307 }
            int r5 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0307 }
            if (r5 < r8) goto L_0x0292
            android.media.MediaCodecInfo$EncoderCapabilities r2 = r2.getEncoderCapabilities()     // Catch:{ Exception -> 0x0307 }
            r5 = 0
        L_0x022d:
            if (r5 >= r7) goto L_0x0253
            java.lang.String r6 = "AVCEncoder"
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0307 }
            r11.<init>()     // Catch:{ Exception -> 0x0307 }
            java.lang.String[] r12 = f53087j     // Catch:{ Exception -> 0x0307 }
            r12 = r12[r5]     // Catch:{ Exception -> 0x0307 }
            r11.append(r12)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r12 = ": "
            r11.append(r12)     // Catch:{ Exception -> 0x0307 }
            boolean r12 = r2.isBitrateModeSupported(r5)     // Catch:{ Exception -> 0x0307 }
            r11.append(r12)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r11 = r11.toString()     // Catch:{ Exception -> 0x0307 }
            com.p280ss.android.vesdk.C45372t.m143403a(r6, r11)     // Catch:{ Exception -> 0x0307 }
            int r5 = r5 + 1
            goto L_0x022d
        L_0x0253:
            java.lang.String r5 = "bitrate-mode"
            r0.setInteger(r5, r4)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r5 = "AVCEncoder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0307 }
            java.lang.String r7 = "Bitrate mode = "
            r6.<init>(r7)     // Catch:{ Exception -> 0x0307 }
            r6.append(r4)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r6 = r6.toString()     // Catch:{ Exception -> 0x0307 }
            com.p280ss.android.vesdk.C45372t.m143403a(r5, r6)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r5 = "te_record_mediacodec_rate_control"
            long r6 = (long) r4     // Catch:{ Exception -> 0x0307 }
            r4 = 0
            com.p280ss.android.ttve.monitor.C20479f.m67948a(r4, r5, r6)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r4 = "max-bitrate"
            r0.setInteger(r4, r3)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r3 = "AVCEncoder"
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0307 }
            java.lang.String r5 = "Encoder ComplexityRange: "
            r4.<init>(r5)     // Catch:{ Exception -> 0x0307 }
            android.util.Range r2 = r2.getComplexityRange()     // Catch:{ Exception -> 0x0307 }
            java.lang.String r2 = r2.toString()     // Catch:{ Exception -> 0x0307 }
            r4.append(r2)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r2 = r4.toString()     // Catch:{ Exception -> 0x0307 }
            com.p280ss.android.vesdk.C45372t.m143403a(r3, r2)     // Catch:{ Exception -> 0x0307 }
        L_0x0292:
            java.lang.String r2 = "color-format"
            int r3 = r1.f53106u     // Catch:{ Exception -> 0x0307 }
            r0.setInteger(r2, r3)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r2 = "frame-rate"
            int r3 = r1.f53093f     // Catch:{ Exception -> 0x0307 }
            r0.setInteger(r2, r3)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r2 = "i-frame-interval"
            r0.setInteger(r2, r10)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r2 = "te_record_video_encode_gop"
            int r3 = r1.f53093f     // Catch:{ Exception -> 0x0307 }
            int r3 = r3 * 1
            long r3 = (long) r3     // Catch:{ Exception -> 0x0307 }
            r5 = 0
            com.p280ss.android.ttve.monitor.C20479f.m67948a(r5, r2, r3)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r2 = "AVCEncoder"
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x0307 }
            java.lang.String r4 = "initAVCEncoder: format = "
            r3.<init>(r4)     // Catch:{ Exception -> 0x0307 }
            r3.append(r0)     // Catch:{ Exception -> 0x0307 }
            java.lang.String r3 = r3.toString()     // Catch:{ Exception -> 0x0307 }
            com.p280ss.android.vesdk.C45372t.m143403a(r2, r3)     // Catch:{ Exception -> 0x0307 }
            android.media.MediaCodec r2 = r1.f53097l     // Catch:{ Exception -> 0x0307 }
            r3 = 0
            r2.configure(r0, r3, r3, r10)     // Catch:{ Exception -> 0x0307 }
            android.media.MediaCodec r0 = r1.f53097l     // Catch:{ Exception -> 0x0307 }
            android.view.Surface r0 = r0.createInputSurface()     // Catch:{ Exception -> 0x0307 }
            r1.f53100o = r0     // Catch:{ Exception -> 0x0307 }
            android.media.MediaCodec r0 = r1.f53097l     // Catch:{ Exception -> 0x0307 }
            r0.start()     // Catch:{ Exception -> 0x0307 }
            r1.f53092e = r9     // Catch:{ Exception -> 0x0307 }
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x0307 }
            if (r0 >= r8) goto L_0x02ec
            android.media.MediaCodec r0 = r1.f53097l     // Catch:{ Exception -> 0x0307 }
            java.nio.ByteBuffer[] r0 = r0.getInputBuffers()     // Catch:{ Exception -> 0x0307 }
            r1.f53090c = r0     // Catch:{ Exception -> 0x0307 }
            android.media.MediaCodec r0 = r1.f53097l     // Catch:{ Exception -> 0x0307 }
            java.nio.ByteBuffer[] r0 = r0.getOutputBuffers()     // Catch:{ Exception -> 0x0307 }
            r1.f53091d = r0     // Catch:{ Exception -> 0x0307 }
        L_0x02ec:
            android.media.MediaCodec$BufferInfo r0 = new android.media.MediaCodec$BufferInfo     // Catch:{ Exception -> 0x0307 }
            r0.<init>()     // Catch:{ Exception -> 0x0307 }
            r1.f53089b = r0     // Catch:{ Exception -> 0x0307 }
            android.view.Surface r0 = r1.f53100o     // Catch:{ all -> 0x0305 }
            if (r0 != 0) goto L_0x02fa
            monitor-exit(r16)     // Catch:{ all -> 0x0305 }
            r0 = 0
            return r0
        L_0x02fa:
            monitor-exit(r16)     // Catch:{ all -> 0x0305 }
            java.lang.String r0 = "AVCEncoder"
            java.lang.String r2 = "initAVCEncoder == exit"
            com.p280ss.android.vesdk.C45372t.m143403a(r0, r2)
            android.view.Surface r0 = r1.f53100o
            return r0
        L_0x0305:
            r0 = move-exception
            goto L_0x030a
        L_0x0307:
            monitor-exit(r16)     // Catch:{ all -> 0x0305 }
            r0 = 0
            return r0
        L_0x030a:
            monitor-exit(r16)     // Catch:{ all -> 0x0305 }
            throw r0
        L_0x030c:
            r0 = r7
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.C19615a.mo52185a(int, int, int, int, int, int, boolean):android.view.Surface");
    }
}
