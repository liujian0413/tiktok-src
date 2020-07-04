package com.p280ss.android.medialib;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import android.os.Build.VERSION;
import android.util.Pair;
import android.view.Surface;
import com.p280ss.android.vesdk.C45372t;
import java.io.BufferedOutputStream;
import java.nio.ByteBuffer;
import java.util.LinkedList;
import java.util.Queue;

/* renamed from: com.ss.android.medialib.c */
public class C19625c {

    /* renamed from: a */
    static C19713d f53120a = null;

    /* renamed from: p */
    private static final String f53121p = "c";

    /* renamed from: q */
    private static int f53122q = 2000;

    /* renamed from: A */
    private int f53123A = 0;

    /* renamed from: B */
    private int f53124B = 0;

    /* renamed from: b */
    BufferInfo f53125b;

    /* renamed from: c */
    ByteBuffer[] f53126c;

    /* renamed from: d */
    ByteBuffer[] f53127d;

    /* renamed from: e */
    int f53128e = 0;

    /* renamed from: f */
    public int f53129f = 30;

    /* renamed from: g */
    float f53130g = 1.0f;

    /* renamed from: h */
    int f53131h = 1;

    /* renamed from: i */
    float f53132i = 1.0f;

    /* renamed from: j */
    float f53133j = 1.0f;

    /* renamed from: k */
    float f53134k = 1.0f;

    /* renamed from: l */
    float f53135l = 1.0f;

    /* renamed from: m */
    float f53136m = 1.0f;

    /* renamed from: n */
    float f53137n = 1.0f;

    /* renamed from: o */
    BufferedOutputStream f53138o = null;

    /* renamed from: r */
    private MediaCodec f53139r;

    /* renamed from: s */
    private String f53140s = "video/avc";

    /* renamed from: t */
    private MediaCodecInfo f53141t;

    /* renamed from: u */
    private Surface f53142u;

    /* renamed from: v */
    private C19748j f53143v;

    /* renamed from: w */
    private int f53144w;

    /* renamed from: x */
    private int f53145x;

    /* renamed from: y */
    private boolean f53146y;

    /* renamed from: z */
    private Queue<Pair<Integer, Integer>> f53147z = new LinkedList();

    static {
        new Thread(new Runnable() {
            public final void run() {
                MediaCodecList.getCodecCount();
            }
        }).start();
    }

    /* renamed from: g */
    private void m64625g() {
        if (this.f53143v != null) {
            this.f53143v.mo52516a();
            this.f53143v = null;
        }
    }

    /* renamed from: e */
    private int m64623e() {
        int[] d = m64622d();
        if (d == null) {
            return -1;
        }
        for (int i = 0; i < d.length; i++) {
            if (d[i] == 2130708361) {
                return d[i];
            }
        }
        return -1;
    }

    /* renamed from: b */
    private MediaCodecInfo m64620b() {
        int codecCount = MediaCodecList.getCodecCount();
        for (int i = 0; i < codecCount; i++) {
            MediaCodecInfo codecInfoAt = MediaCodecList.getCodecInfoAt(i);
            if (codecInfoAt.isEncoder()) {
                String[] supportedTypes = codecInfoAt.getSupportedTypes();
                for (String equalsIgnoreCase : supportedTypes) {
                    if (equalsIgnoreCase.equalsIgnoreCase(this.f53140s)) {
                        return codecInfoAt;
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: c */
    private MediaCodecInfo m64621c() {
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        if (codecInfos == null || codecInfos.length == 0) {
            return null;
        }
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (mediaCodecInfo != null && mediaCodecInfo.isEncoder()) {
                String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                for (String equalsIgnoreCase : supportedTypes) {
                    if (equalsIgnoreCase.equalsIgnoreCase(this.f53140s)) {
                        return mediaCodecInfo;
                    }
                }
                continue;
            }
        }
        return null;
    }

    /* renamed from: f */
    private boolean m64624f() {
        if (this.f53142u == null) {
            C45372t.m143409d(f53121p, "initEGLCtx: MediaCodec should initialized ahead.");
            return false;
        }
        this.f53143v = C19748j.m65110a(this.f53136m, this.f53137n);
        this.f53143v.mo52517a(0.0f);
        this.f53143v.mo52521b(1.0f, -1.0f);
        this.f53143v.mo52520b(this.f53130g);
        this.f53143v.mo52518a(this.f53132i, this.f53133j, this.f53134k, this.f53135l);
        return true;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(4:10|11|12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x002e, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0030, code lost:
        return;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0015 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo52209a() {
        /*
            r2 = this;
            monitor-enter(r2)
            int r0 = r2.f53128e     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002f
            android.media.MediaCodec r0 = r2.f53139r     // Catch:{ all -> 0x0031 }
            if (r0 != 0) goto L_0x000a
            goto L_0x002f
        L_0x000a:
            int r0 = r2.f53128e     // Catch:{ all -> 0x0031 }
            r1 = 2
            if (r0 != r1) goto L_0x001c
            android.media.MediaCodec r0 = r2.f53139r     // Catch:{ Exception -> 0x0015 }
            r0.stop()     // Catch:{ Exception -> 0x0015 }
            goto L_0x001c
        L_0x0015:
            java.lang.String r0 = f53121p     // Catch:{ all -> 0x0031 }
            java.lang.String r1 = "MediaCodec Exception"
            com.p280ss.android.vesdk.C45372t.m143409d(r0, r1)     // Catch:{ all -> 0x0031 }
        L_0x001c:
            android.media.MediaCodec r0 = r2.f53139r     // Catch:{ Exception -> 0x0021 }
            r0.release()     // Catch:{ Exception -> 0x0021 }
        L_0x0021:
            r0 = 0
            r2.f53139r = r0     // Catch:{ all -> 0x0031 }
            android.view.Surface r0 = r2.f53142u     // Catch:{ all -> 0x0031 }
            if (r0 == 0) goto L_0x002d
            android.view.Surface r0 = r2.f53142u     // Catch:{ all -> 0x0031 }
            r0.release()     // Catch:{ all -> 0x0031 }
        L_0x002d:
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            return
        L_0x002f:
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            return
        L_0x0031:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0031 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.C19625c.mo52209a():void");
    }

    /* renamed from: d */
    private int[] m64622d() {
        MediaCodecInfo mediaCodecInfo;
        if (VERSION.SDK_INT >= 21) {
            mediaCodecInfo = m64621c();
        } else {
            mediaCodecInfo = m64620b();
        }
        this.f53141t = mediaCodecInfo;
        if (this.f53141t == null) {
            return null;
        }
        String name = this.f53141t.getName();
        if (name.startsWith("OMX.google.") || name.startsWith("OMX.Nvidia.") || name.equals("OMX.TI.DUCATI1.VIDEO.H264E")) {
            return null;
        }
        CodecCapabilities capabilitiesForType = this.f53141t.getCapabilitiesForType(this.f53140s);
        int length = capabilitiesForType.colorFormats.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = capabilitiesForType.colorFormats[i];
        }
        return iArr;
    }

    /* renamed from: a */
    public static void m64619a(C19713d dVar) {
        f53120a = dVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(3:34|35|36) */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00a9, code lost:
        return null;
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:34:0x00a8 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.view.Surface mo52208a(int r3, int r4, int r5, int r6, boolean r7) {
        /*
            r2 = this;
            r6 = 0
            if (r7 != 0) goto L_0x0004
            return r6
        L_0x0004:
            int r7 = android.os.Build.VERSION.SDK_INT
            r0 = 18
            if (r7 >= r0) goto L_0x000b
            return r6
        L_0x000b:
            r7 = 0
            r2.f53123A = r7
            r2.f53124B = r7
            if (r3 <= 0) goto L_0x00ac
            if (r4 > 0) goto L_0x0016
            goto L_0x00ac
        L_0x0016:
            r2.f53144w = r3
            r2.f53145x = r4
            monitor-enter(r2)
            int r7 = r2.m64623e()     // Catch:{ Exception -> 0x00a8 }
            if (r7 >= 0) goto L_0x0023
            monitor-exit(r2)     // Catch:{ all -> 0x00a6 }
            return r6
        L_0x0023:
            com.ss.android.medialib.d r0 = f53120a     // Catch:{ Exception -> 0x00a8 }
            if (r0 == 0) goto L_0x002c
            com.ss.android.medialib.d r0 = f53120a     // Catch:{ Exception -> 0x00a8 }
            r0.setColorFormatMark(r7)     // Catch:{ Exception -> 0x00a8 }
        L_0x002c:
            java.lang.String r0 = r2.f53140s     // Catch:{ Exception -> 0x00a8 }
            android.media.MediaCodec r0 = android.media.MediaCodec.createEncoderByType(r0)     // Catch:{ Exception -> 0x00a8 }
            r2.f53139r = r0     // Catch:{ Exception -> 0x00a8 }
            r0 = 1
            r2.f53128e = r0     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r1 = r2.f53140s     // Catch:{ Exception -> 0x00a8 }
            android.media.MediaFormat r3 = android.media.MediaFormat.createVideoFormat(r1, r3, r4)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r4 = "color-format"
            r3.setInteger(r4, r7)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r4 = "bitrate"
            int r5 = r5 * 1024
            int r5 = r5 * 1024
            r3.setInteger(r4, r5)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r4 = "frame-rate"
            int r5 = r2.f53129f     // Catch:{ Exception -> 0x00a8 }
            r3.setInteger(r4, r5)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r4 = "i-frame-interval"
            r3.setInteger(r4, r0)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r4 = f53121p     // Catch:{ Exception -> 0x00a8 }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r7 = "initAVCEncoder: format = "
            r5.<init>(r7)     // Catch:{ Exception -> 0x00a8 }
            r5.append(r3)     // Catch:{ Exception -> 0x00a8 }
            java.lang.String r5 = r5.toString()     // Catch:{ Exception -> 0x00a8 }
            com.p280ss.android.vesdk.C45372t.m143403a(r4, r5)     // Catch:{ Exception -> 0x00a8 }
            android.media.MediaCodec r4 = r2.f53139r     // Catch:{ Exception -> 0x00a8 }
            r4.configure(r3, r6, r6, r0)     // Catch:{ Exception -> 0x00a8 }
            android.media.MediaCodec r3 = r2.f53139r     // Catch:{ Exception -> 0x00a8 }
            android.view.Surface r3 = r3.createInputSurface()     // Catch:{ Exception -> 0x00a8 }
            r2.f53142u = r3     // Catch:{ Exception -> 0x00a8 }
            android.media.MediaCodec r3 = r2.f53139r     // Catch:{ Exception -> 0x00a8 }
            r3.start()     // Catch:{ Exception -> 0x00a8 }
            r3 = 2
            r2.f53128e = r3     // Catch:{ Exception -> 0x00a8 }
            int r3 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00a8 }
            r4 = 21
            if (r3 >= r4) goto L_0x0095
            android.media.MediaCodec r3 = r2.f53139r     // Catch:{ Exception -> 0x00a8 }
            java.nio.ByteBuffer[] r3 = r3.getInputBuffers()     // Catch:{ Exception -> 0x00a8 }
            r2.f53126c = r3     // Catch:{ Exception -> 0x00a8 }
            android.media.MediaCodec r3 = r2.f53139r     // Catch:{ Exception -> 0x00a8 }
            java.nio.ByteBuffer[] r3 = r3.getOutputBuffers()     // Catch:{ Exception -> 0x00a8 }
            r2.f53127d = r3     // Catch:{ Exception -> 0x00a8 }
        L_0x0095:
            android.media.MediaCodec$BufferInfo r3 = new android.media.MediaCodec$BufferInfo     // Catch:{ Exception -> 0x00a8 }
            r3.<init>()     // Catch:{ Exception -> 0x00a8 }
            r2.f53125b = r3     // Catch:{ Exception -> 0x00a8 }
            android.view.Surface r3 = r2.f53142u     // Catch:{ all -> 0x00a6 }
            if (r3 != 0) goto L_0x00a2
            monitor-exit(r2)     // Catch:{ all -> 0x00a6 }
            return r6
        L_0x00a2:
            monitor-exit(r2)     // Catch:{ all -> 0x00a6 }
            android.view.Surface r3 = r2.f53142u
            return r3
        L_0x00a6:
            r3 = move-exception
            goto L_0x00aa
        L_0x00a8:
            monitor-exit(r2)     // Catch:{ all -> 0x00a6 }
            return r6
        L_0x00aa:
            monitor-exit(r2)     // Catch:{ all -> 0x00a6 }
            throw r3
        L_0x00ac:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.C19625c.mo52208a(int, int, int, int, boolean):android.view.Surface");
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:21|22|23|24|25) */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00c6, code lost:
        if (r11 >= 0) goto L_0x00d6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00c8, code lost:
        com.p280ss.android.vesdk.C45372t.m143407c(f53121p, "encode: error.");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:52:0x00d5, code lost:
        return 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x00d8, code lost:
        if (android.os.Build.VERSION.SDK_INT < 21) goto L_0x00e1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00da, code lost:
        r10 = r7.f53139r.getOutputBuffer(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00e1, code lost:
        r10 = r7.f53127d[r11];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00e5, code lost:
        r3 = r7.f53125b.size - r7.f53125b.offset;
        r10.position(r7.f53125b.offset);
        r4 = new byte[r3];
        r10.get(r4, 0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00ff, code lost:
        if ((r7.f53125b.flags & 2) == 0) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x0103, code lost:
        if (f53120a == null) goto L_0x010a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0105, code lost:
        f53120a.onMarkSetCodecConfig(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x010a, code lost:
        r7.f53125b.size = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0114, code lost:
        if ((r7.f53125b.flags & 1) == 0) goto L_0x0118;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x0116, code lost:
        r10 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0118, code lost:
        r10 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x011b, code lost:
        if (f53120a == null) goto L_0x0169;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x011d, code lost:
        r3 = f53121p;
        r5 = new java.lang.StringBuilder("encode: pts queue size = ");
        r5.append(r7.f53147z.size());
        com.p280ss.android.vesdk.C45372t.m143405b(r3, r5.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x013c, code lost:
        if (r7.f53147z.size() <= 0) goto L_0x0161;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:71:0x013e, code lost:
        r7.f53124B++;
        r3 = (android.util.Pair) r7.f53147z.poll();
        f53120a.onMarkWriteFile(r4, ((java.lang.Integer) r3.first).intValue(), ((java.lang.Integer) r3.second).intValue(), r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0161, code lost:
        com.p280ss.android.vesdk.C45372t.m143405b(f53121p, "encode: no available pts!!!");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0169, code lost:
        com.p280ss.android.vesdk.C45372t.m143405b(f53121p, "encode: no output.");
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x005a */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo52211b(int r8, int r9, int r10, int r11, boolean r12) {
        /*
            r7 = this;
            monitor-enter(r7)
            int r0 = r7.f53128e     // Catch:{ all -> 0x019f }
            r1 = 2
            r2 = -1
            if (r0 != r1) goto L_0x0196
            android.media.MediaCodec r0 = r7.f53139r     // Catch:{ all -> 0x019f }
            if (r0 != 0) goto L_0x000d
            goto L_0x0196
        L_0x000d:
            if (r8 <= 0) goto L_0x0179
            if (r10 >= 0) goto L_0x0013
            goto L_0x0179
        L_0x0013:
            com.ss.android.medialib.j r0 = r7.f53143v     // Catch:{ all -> 0x019f }
            if (r0 != 0) goto L_0x001f
            boolean r0 = r7.m64624f()     // Catch:{ all -> 0x019f }
            if (r0 != 0) goto L_0x001f
            monitor-exit(r7)     // Catch:{ all -> 0x019f }
            return r2
        L_0x001f:
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r0 = r7.f53147z     // Catch:{ all -> 0x019f }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch:{ all -> 0x019f }
            java.lang.Integer r11 = java.lang.Integer.valueOf(r11)     // Catch:{ all -> 0x019f }
            android.util.Pair r10 = android.util.Pair.create(r10, r11)     // Catch:{ all -> 0x019f }
            r0.offer(r10)     // Catch:{ all -> 0x019f }
            int r10 = r7.f53144w     // Catch:{ all -> 0x019f }
            int r11 = r7.f53145x     // Catch:{ all -> 0x019f }
            r0 = 0
            android.opengl.GLES20.glViewport(r0, r0, r10, r11)     // Catch:{ all -> 0x019f }
            com.ss.android.medialib.j r10 = r7.f53143v     // Catch:{ all -> 0x019f }
            r10.mo52519a(r8, r9)     // Catch:{ all -> 0x019f }
            android.opengl.GLES20.glFinish()     // Catch:{ all -> 0x019f }
            int r8 = r7.f53123A     // Catch:{ all -> 0x019f }
            r9 = 1
            int r8 = r8 + r9
            r7.f53123A = r8     // Catch:{ all -> 0x019f }
            com.ss.android.medialib.d r8 = f53120a     // Catch:{ all -> 0x019f }
            r8.onMarkSwapGlBuffers()     // Catch:{ all -> 0x019f }
            boolean r8 = r7.f53146y     // Catch:{ all -> 0x019f }
            if (r8 == 0) goto L_0x0051
            r7.f53146y = r0     // Catch:{ all -> 0x019f }
        L_0x0051:
            r8 = -2
            if (r12 == 0) goto L_0x005c
            android.media.MediaCodec r10 = r7.f53139r     // Catch:{ Throwable -> 0x005a }
            r10.signalEndOfInputStream()     // Catch:{ Throwable -> 0x005a }
            goto L_0x005c
        L_0x005a:
            monitor-exit(r7)     // Catch:{ all -> 0x019f }
            return r8
        L_0x005c:
            r10 = 0
        L_0x005d:
            int r10 = r10 + r9
            int r11 = android.os.Build.VERSION.SDK_INT     // Catch:{ Throwable -> 0x0177 }
            r3 = 21
            if (r11 >= r3) goto L_0x006c
            android.media.MediaCodec r11 = r7.f53139r     // Catch:{ Throwable -> 0x0177 }
            java.nio.ByteBuffer[] r11 = r11.getOutputBuffers()     // Catch:{ Throwable -> 0x0177 }
            r7.f53127d = r11     // Catch:{ Throwable -> 0x0177 }
        L_0x006c:
            android.media.MediaCodec r11 = r7.f53139r     // Catch:{ Throwable -> 0x0177 }
            android.media.MediaCodec$BufferInfo r4 = r7.f53125b     // Catch:{ Throwable -> 0x0177 }
            int r5 = f53122q     // Catch:{ Throwable -> 0x0177 }
            long r5 = (long) r5     // Catch:{ Throwable -> 0x0177 }
            int r11 = r11.dequeueOutputBuffer(r4, r5)     // Catch:{ Throwable -> 0x0177 }
            java.lang.String r4 = f53121p     // Catch:{ all -> 0x019f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x019f }
            java.lang.String r6 = "outputBufferIndex = "
            r5.<init>(r6)     // Catch:{ all -> 0x019f }
            r5.append(r11)     // Catch:{ all -> 0x019f }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x019f }
            com.p280ss.android.vesdk.C45372t.m143405b(r4, r5)     // Catch:{ all -> 0x019f }
            java.lang.String r4 = f53121p     // Catch:{ all -> 0x019f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x019f }
            java.lang.String r6 = "mBufferInfo.flags = "
            r5.<init>(r6)     // Catch:{ all -> 0x019f }
            android.media.MediaCodec$BufferInfo r6 = r7.f53125b     // Catch:{ all -> 0x019f }
            int r6 = r6.flags     // Catch:{ all -> 0x019f }
            r5.append(r6)     // Catch:{ all -> 0x019f }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x019f }
            com.p280ss.android.vesdk.C45372t.m143405b(r4, r5)     // Catch:{ all -> 0x019f }
            if (r11 != r2) goto L_0x00b0
            if (r12 == 0) goto L_0x00cf
            int r11 = r7.f53123A     // Catch:{ all -> 0x019f }
            int r3 = r7.f53124B     // Catch:{ all -> 0x019f }
            if (r11 == r3) goto L_0x00cf
            r11 = 10
            if (r10 >= r11) goto L_0x00cf
            goto L_0x005d
        L_0x00b0:
            r4 = -3
            if (r11 != r4) goto L_0x00bc
            android.media.MediaCodec r11 = r7.f53139r     // Catch:{ all -> 0x019f }
            java.nio.ByteBuffer[] r11 = r11.getOutputBuffers()     // Catch:{ all -> 0x019f }
            r7.f53127d = r11     // Catch:{ all -> 0x019f }
            goto L_0x005d
        L_0x00bc:
            if (r11 != r8) goto L_0x00c6
            java.lang.String r11 = f53121p     // Catch:{ all -> 0x019f }
            java.lang.String r3 = "encode: output format change!"
            com.p280ss.android.vesdk.C45372t.m143407c(r11, r3)     // Catch:{ all -> 0x019f }
            goto L_0x005d
        L_0x00c6:
            if (r11 >= 0) goto L_0x00d6
            java.lang.String r8 = f53121p     // Catch:{ all -> 0x019f }
            java.lang.String r9 = "encode: error."
            com.p280ss.android.vesdk.C45372t.m143407c(r8, r9)     // Catch:{ all -> 0x019f }
        L_0x00cf:
            if (r12 == 0) goto L_0x00d4
            r7.m64625g()     // Catch:{ all -> 0x019f }
        L_0x00d4:
            monitor-exit(r7)     // Catch:{ all -> 0x019f }
            return r0
        L_0x00d6:
            int r10 = android.os.Build.VERSION.SDK_INT     // Catch:{ all -> 0x019f }
            if (r10 < r3) goto L_0x00e1
            android.media.MediaCodec r10 = r7.f53139r     // Catch:{ all -> 0x019f }
            java.nio.ByteBuffer r10 = r10.getOutputBuffer(r11)     // Catch:{ all -> 0x019f }
            goto L_0x00e5
        L_0x00e1:
            java.nio.ByteBuffer[] r10 = r7.f53127d     // Catch:{ all -> 0x019f }
            r10 = r10[r11]     // Catch:{ all -> 0x019f }
        L_0x00e5:
            android.media.MediaCodec$BufferInfo r3 = r7.f53125b     // Catch:{ all -> 0x019f }
            int r3 = r3.size     // Catch:{ all -> 0x019f }
            android.media.MediaCodec$BufferInfo r4 = r7.f53125b     // Catch:{ all -> 0x019f }
            int r4 = r4.offset     // Catch:{ all -> 0x019f }
            int r3 = r3 - r4
            android.media.MediaCodec$BufferInfo r4 = r7.f53125b     // Catch:{ all -> 0x019f }
            int r4 = r4.offset     // Catch:{ all -> 0x019f }
            r10.position(r4)     // Catch:{ all -> 0x019f }
            byte[] r4 = new byte[r3]     // Catch:{ all -> 0x019f }
            r10.get(r4, r0, r3)     // Catch:{ all -> 0x019f }
            android.media.MediaCodec$BufferInfo r10 = r7.f53125b     // Catch:{ all -> 0x019f }
            int r10 = r10.flags     // Catch:{ all -> 0x019f }
            r10 = r10 & r1
            if (r10 == 0) goto L_0x010f
            com.ss.android.medialib.d r10 = f53120a     // Catch:{ all -> 0x019f }
            if (r10 == 0) goto L_0x010a
            com.ss.android.medialib.d r10 = f53120a     // Catch:{ all -> 0x019f }
            r10.onMarkSetCodecConfig(r4)     // Catch:{ all -> 0x019f }
        L_0x010a:
            android.media.MediaCodec$BufferInfo r10 = r7.f53125b     // Catch:{ all -> 0x019f }
            r10.size = r0     // Catch:{ all -> 0x019f }
            goto L_0x0170
        L_0x010f:
            android.media.MediaCodec$BufferInfo r10 = r7.f53125b     // Catch:{ all -> 0x019f }
            int r10 = r10.flags     // Catch:{ all -> 0x019f }
            r10 = r10 & r9
            if (r10 == 0) goto L_0x0118
            r10 = 1
            goto L_0x0119
        L_0x0118:
            r10 = 0
        L_0x0119:
            com.ss.android.medialib.d r3 = f53120a     // Catch:{ all -> 0x019f }
            if (r3 == 0) goto L_0x0169
            java.lang.String r3 = f53121p     // Catch:{ all -> 0x019f }
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x019f }
            java.lang.String r6 = "encode: pts queue size = "
            r5.<init>(r6)     // Catch:{ all -> 0x019f }
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r6 = r7.f53147z     // Catch:{ all -> 0x019f }
            int r6 = r6.size()     // Catch:{ all -> 0x019f }
            r5.append(r6)     // Catch:{ all -> 0x019f }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x019f }
            com.p280ss.android.vesdk.C45372t.m143405b(r3, r5)     // Catch:{ all -> 0x019f }
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r3 = r7.f53147z     // Catch:{ all -> 0x019f }
            int r3 = r3.size()     // Catch:{ all -> 0x019f }
            if (r3 <= 0) goto L_0x0161
            int r3 = r7.f53124B     // Catch:{ all -> 0x019f }
            int r3 = r3 + r9
            r7.f53124B = r3     // Catch:{ all -> 0x019f }
            java.util.Queue<android.util.Pair<java.lang.Integer, java.lang.Integer>> r3 = r7.f53147z     // Catch:{ all -> 0x019f }
            java.lang.Object r3 = r3.poll()     // Catch:{ all -> 0x019f }
            android.util.Pair r3 = (android.util.Pair) r3     // Catch:{ all -> 0x019f }
            com.ss.android.medialib.d r5 = f53120a     // Catch:{ all -> 0x019f }
            java.lang.Object r6 = r3.first     // Catch:{ all -> 0x019f }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ all -> 0x019f }
            int r6 = r6.intValue()     // Catch:{ all -> 0x019f }
            java.lang.Object r3 = r3.second     // Catch:{ all -> 0x019f }
            java.lang.Integer r3 = (java.lang.Integer) r3     // Catch:{ all -> 0x019f }
            int r3 = r3.intValue()     // Catch:{ all -> 0x019f }
            r5.onMarkWriteFile(r4, r6, r3, r10)     // Catch:{ all -> 0x019f }
            goto L_0x0170
        L_0x0161:
            java.lang.String r10 = f53121p     // Catch:{ all -> 0x019f }
            java.lang.String r3 = "encode: no available pts!!!"
            com.p280ss.android.vesdk.C45372t.m143405b(r10, r3)     // Catch:{ all -> 0x019f }
            goto L_0x0170
        L_0x0169:
            java.lang.String r10 = f53121p     // Catch:{ all -> 0x019f }
            java.lang.String r3 = "encode: no output."
            com.p280ss.android.vesdk.C45372t.m143405b(r10, r3)     // Catch:{ all -> 0x019f }
        L_0x0170:
            android.media.MediaCodec r10 = r7.f53139r     // Catch:{ all -> 0x019f }
            r10.releaseOutputBuffer(r11, r0)     // Catch:{ all -> 0x019f }
            goto L_0x005c
        L_0x0177:
            monitor-exit(r7)     // Catch:{ all -> 0x019f }
            return r8
        L_0x0179:
            java.lang.String r9 = f53121p     // Catch:{ all -> 0x019f }
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch:{ all -> 0x019f }
            java.lang.String r12 = "encode: invalidate params: texID = "
            r11.<init>(r12)     // Catch:{ all -> 0x019f }
            r11.append(r8)     // Catch:{ all -> 0x019f }
            java.lang.String r8 = ", pts = "
            r11.append(r8)     // Catch:{ all -> 0x019f }
            r11.append(r10)     // Catch:{ all -> 0x019f }
            java.lang.String r8 = r11.toString()     // Catch:{ all -> 0x019f }
            com.p280ss.android.vesdk.C45372t.m143409d(r9, r8)     // Catch:{ all -> 0x019f }
            monitor-exit(r7)     // Catch:{ all -> 0x019f }
            return r2
        L_0x0196:
            java.lang.String r8 = f53121p     // Catch:{ all -> 0x019f }
            java.lang.String r9 = "encode: codec is not reayd."
            com.p280ss.android.vesdk.C45372t.m143407c(r8, r9)     // Catch:{ all -> 0x019f }
            monitor-exit(r7)     // Catch:{ all -> 0x019f }
            return r2
        L_0x019f:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x019f }
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.medialib.C19625c.mo52211b(int, int, int, int, boolean):int");
    }

    /* renamed from: a */
    public final void mo52210a(float f, int i, float f2, float f3, float f4, float f5, float f6, float f7) {
        this.f53130g = f;
        this.f53131h = i;
        this.f53132i = f2;
        this.f53133j = f3;
        this.f53134k = f4;
        this.f53135l = f5;
        this.f53136m = f6;
        this.f53137n = f7;
        if (this.f53143v != null) {
            this.f53143v.mo52520b(this.f53130g);
            this.f53143v.mo52518a(this.f53132i, this.f53133j, this.f53134k, this.f53135l);
        }
    }
}
