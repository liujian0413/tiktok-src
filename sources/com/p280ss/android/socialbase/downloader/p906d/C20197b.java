package com.p280ss.android.socialbase.downloader.p906d;

import android.os.Process;
import com.p280ss.android.socialbase.downloader.downloader.C20269b;
import com.p280ss.android.socialbase.downloader.downloader.C20273d;
import com.p280ss.android.socialbase.downloader.downloader.C20285j;
import com.p280ss.android.socialbase.downloader.model.DownloadChunk;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.model.DownloadTask;
import com.p280ss.android.socialbase.downloader.network.C20346e;

/* renamed from: com.ss.android.socialbase.downloader.d.b */
public class C20197b implements Runnable {

    /* renamed from: a */
    private static final String f54642a = "b";

    /* renamed from: b */
    private DownloadChunk f54643b;

    /* renamed from: c */
    private DownloadChunk f54644c;

    /* renamed from: d */
    private C20273d f54645d;

    /* renamed from: e */
    private final DownloadTask f54646e;

    /* renamed from: f */
    private DownloadInfo f54647f;

    /* renamed from: g */
    private final C20203e f54648g;

    /* renamed from: h */
    private C20346e f54649h;

    /* renamed from: i */
    private C20285j f54650i;

    /* renamed from: j */
    private volatile boolean f54651j;

    /* renamed from: k */
    private volatile boolean f54652k;

    /* renamed from: l */
    private boolean f54653l;

    /* renamed from: c */
    private String m66514c() {
        return this.f54647f.getConnectionUrl();
    }

    /* renamed from: d */
    private void m66515d() {
        if (this.f54649h != null) {
            this.f54649h.mo20820d();
            this.f54649h = null;
        }
    }

    /* renamed from: e */
    private boolean m66516e() {
        if (this.f54651j || this.f54652k) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo54088a() {
        this.f54651j = true;
        if (this.f54645d != null) {
            this.f54645d.mo54319a();
        }
    }

    /* renamed from: b */
    public final void mo54090b() {
        this.f54652k = true;
        if (this.f54645d != null) {
            this.f54645d.mo54322b();
        }
    }

    /* JADX INFO: finally extract failed */
    public void run() {
        Process.setThreadPriority(10);
        this.f54643b = this.f54644c;
        while (true) {
            try {
                this.f54643b.mo54539a(this);
                if (m66513a(this.f54643b)) {
                    this.f54643b.mo54541a(false);
                    if (m66516e()) {
                        break;
                    }
                    this.f54643b = this.f54648g.mo54094a(this.f54643b.f54923e);
                    if (m66516e() || this.f54643b == null) {
                        break;
                    }
                    try {
                        Thread.sleep(50);
                    } catch (Throwable unused) {
                    }
                } else {
                    this.f54643b.mo54541a(false);
                    break;
                }
            } catch (Throwable th) {
                if (this.f54643b != null) {
                    this.f54643b.mo54541a(false);
                }
                m66515d();
                this.f54648g.mo54096a(this);
                throw th;
            }
        }
        if (this.f54643b != null) {
            this.f54643b.mo54541a(false);
        }
        m66515d();
        this.f54648g.mo54096a(this);
    }

    /* JADX INFO: used method not loaded: com.ss.android.socialbase.downloader.d.e.a(com.ss.android.socialbase.downloader.exception.BaseException, boolean):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.ss.android.socialbase.downloader.d.e.a(com.ss.android.socialbase.downloader.exception.BaseException):null, types can be incorrect */
    /* JADX INFO: used method not loaded: com.ss.android.socialbase.downloader.d.e.a(com.ss.android.socialbase.downloader.exception.BaseException, long):null, types can be incorrect */
    /* JADX WARNING: Code restructure failed: missing block: B:132:0x019e, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:133:0x01a0, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:135:0x01a5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:136:0x01a6, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:139:0x01ab, code lost:
        if (m66516e() == false) goto L_0x01b2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:140:0x01ad, code lost:
        m66515d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:141:0x01b1, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:144:?, code lost:
        com.p280ss.android.socialbase.downloader.utils.C20359e.m67555a(r0, "downloadChunkInner");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:150:0x01c2, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:151:0x01c3, code lost:
        r12 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:152:0x01c4, code lost:
        r20 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:156:0x01cc, code lost:
        m66515d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x01d0, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:160:0x01d5, code lost:
        if (com.p280ss.android.socialbase.downloader.utils.C20359e.m67580b(r0) != false) goto L_0x01d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:0x01d7, code lost:
        r1.f54648g.mo54097a(r0, r12);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x01dc, code lost:
        m66515d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:163:0x01df, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:166:0x01e6, code lost:
        if (r1.f54648g.mo54101a(r0) != false) goto L_0x01e8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:168:0x01ec, code lost:
        if (com.p280ss.android.socialbase.downloader.utils.C20359e.m67564a(r0) != false) goto L_0x01ee;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:169:0x01ee, code lost:
        r1.f54648g.mo54097a(r0, true);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:170:0x01f4, code lost:
        m66515d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:171:0x01f7, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:172:0x01f8, code lost:
        if (r20 != false) goto L_0x01fa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:175:0x01fc, code lost:
        if (r1.f54645d != null) goto L_0x01fe;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:177:0x0204, code lost:
        if (com.p280ss.android.socialbase.downloader.utils.C20356b.m67535a(32) != false) goto L_0x0206;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:178:0x0206, code lost:
        r3 = r1.f54645d.f54778b - r1.f54645d.f54779c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:179:0x0212, code lost:
        if (r3 > 0) goto L_0x0214;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:180:0x0214, code lost:
        m66512a(r2, r1.f54645d.f54779c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:182:0x021e, code lost:
        if (r3 < 0) goto L_0x0220;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x0221, code lost:
        r17 = r1.f54645d.f54778b - r9;
        m66512a(r2, r9);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x022c, code lost:
        r1.f54648g.mo54103b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:186:0x0231, code lost:
        m66515d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:187:0x0234, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:188:0x0235, code lost:
        r3 = r17;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:192:0x023d, code lost:
        if (com.p280ss.android.socialbase.downloader.utils.C20356b.m67535a(16) == false) goto L_0x0246;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:193:0x023f, code lost:
        r0 = r1.f54648g.mo54093a(r2, r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:194:0x0246, code lost:
        r0 = r1.f54648g.mo54092a(r0, r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:196:0x024e, code lost:
        if (r0 != com.p280ss.android.socialbase.downloader.exception.RetryCheckStatus.RETURN) goto L_0x0254;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:197:0x0250, code lost:
        m66515d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:198:0x0253, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:200:?, code lost:
        r2.f54928j = r12;
        m66515d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:204:0x0264, code lost:
        if (r1.f54647f.isNeedChunkDowngradeRetry() == false) goto L_0x0288;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:211:0x027f, code lost:
        r1.f54648g.mo54104c(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:212:0x0284, code lost:
        m66515d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:213:0x0287, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:215:?, code lost:
        r1.f54648g.mo54103b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:216:0x028d, code lost:
        m66515d();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:217:0x0290, code lost:
        return r12;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x001b, code lost:
        if (r3.f54923e == r2.f54923e) goto L_0x001f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x0122, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:?, code lost:
        com.p280ss.android.socialbase.downloader.utils.C20359e.m67555a(r0, "ChunkRunnableGetResponseCode");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x0129, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x012a, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:130:0x019d */
    /* JADX WARNING: Missing exception handler attribute for start block: B:73:0x00ea */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x019e A[ExcHandler: Throwable (th java.lang.Throwable), PHI: r12 
      PHI: (r12v6 boolean) = (r12v7 boolean), (r12v7 boolean), (r12v7 boolean), (r12v10 boolean), (r12v10 boolean), (r12v10 boolean), (r12v10 boolean), (r12v10 boolean), (r12v10 boolean) binds: [B:120:0x0184, B:130:0x019d, B:131:?, B:79:0x00f6, B:110:0x016a, B:104:0x015c, B:105:?, B:84:0x00fe, B:92:0x0125] A[DONT_GENERATE, DONT_INLINE], Splitter:B:120:0x0184] */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x01a0 A[ExcHandler: BaseException (e com.ss.android.socialbase.downloader.exception.BaseException), PHI: r12 
      PHI: (r12v5 boolean) = (r12v7 boolean), (r12v7 boolean), (r12v7 boolean), (r12v7 boolean), (r12v10 boolean), (r12v10 boolean), (r12v10 boolean), (r12v10 boolean) binds: [B:120:0x0184, B:130:0x019d, B:131:?, B:125:0x018c, B:79:0x00f6, B:110:0x016a, B:84:0x00fe, B:92:0x0125] A[DONT_GENERATE, DONT_INLINE], Splitter:B:79:0x00f6] */
    /* JADX WARNING: Removed duplicated region for block: B:140:0x01ad  */
    /* JADX WARNING: Removed duplicated region for block: B:142:0x01b2  */
    /* JADX WARNING: Removed duplicated region for block: B:150:0x01c2 A[ExcHandler: BaseException (e com.ss.android.socialbase.downloader.exception.BaseException), Splitter:B:19:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:158:0x01d1 A[SYNTHETIC, Splitter:B:158:0x01d1] */
    /* JADX WARNING: Removed duplicated region for block: B:193:0x023f A[Catch:{ BaseException -> 0x01b8, all -> 0x01a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:194:0x0246 A[Catch:{ BaseException -> 0x01b8, all -> 0x01a2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:199:0x0254 A[SYNTHETIC, Splitter:B:199:0x0254] */
    /* JADX WARNING: Removed duplicated region for block: B:224:0x0250 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:225:0x01cc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x00f0 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:78:0x00f5  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m66513a(com.p280ss.android.socialbase.downloader.model.DownloadChunk r27) {
        /*
            r26 = this;
            r1 = r26
            r2 = r27
        L_0x0004:
            r0 = 0
            boolean r3 = r27.mo54545d()
            if (r3 == 0) goto L_0x001e
            boolean r3 = r27.mo54548f()
            if (r3 == 0) goto L_0x001e
            com.ss.android.socialbase.downloader.model.DownloadChunk r3 = r27.mo54547e()
            if (r3 == 0) goto L_0x001e
            int r4 = r3.f54923e
            int r5 = r2.f54923e
            if (r4 != r5) goto L_0x001e
            goto L_0x001f
        L_0x001e:
            r3 = r0
        L_0x001f:
            r4 = 1
            if (r3 == 0) goto L_0x0029
            boolean r0 = r3.mo54550h()
            if (r0 == 0) goto L_0x0029
            return r4
        L_0x0029:
            long r5 = r27.mo54553k()
            long r7 = r2.f54921c
            long r9 = r27.mo54553k()
            if (r3 == 0) goto L_0x003f
            long r9 = r3.mo54553k()
            long r5 = r3.mo54553k()
            long r7 = r3.f54921c
        L_0x003f:
            r17 = 0
            r15 = 0
            boolean r0 = r26.m66516e()     // Catch:{ BaseException -> 0x01c2, Throwable -> 0x01a5 }
            if (r0 == 0) goto L_0x004c
            r26.m66515d()
            return r15
        L_0x004c:
            java.lang.String r0 = r26.m66514c()     // Catch:{ BaseException -> 0x01c2, Throwable -> 0x01a5 }
            com.ss.android.socialbase.downloader.network.e r11 = r1.f54649h     // Catch:{ BaseException -> 0x01c2, Throwable -> 0x01a5 }
            if (r11 == 0) goto L_0x0056
            r11 = 1
            goto L_0x0057
        L_0x0056:
            r11 = 0
        L_0x0057:
            r1.f54653l = r11     // Catch:{ BaseException -> 0x01c2, Throwable -> 0x01a5 }
            boolean r11 = r1.f54653l     // Catch:{ BaseException -> 0x01c2, Throwable -> 0x01a5 }
            r2.f54928j = r11     // Catch:{ BaseException -> 0x01c2, Throwable -> 0x01a5 }
            r13 = 300(0x12c, float:4.2E-43)
            r14 = 200(0xc8, float:2.8E-43)
            boolean r11 = r1.f54653l     // Catch:{ BaseException -> 0x017c, Throwable -> 0x00c9, all -> 0x00c1 }
            if (r11 != 0) goto L_0x00a3
            com.ss.android.socialbase.downloader.model.DownloadInfo r11 = r1.f54647f     // Catch:{ BaseException -> 0x017c, Throwable -> 0x00c9, all -> 0x00c1 }
            java.util.List r11 = r11.getExtraHeaders()     // Catch:{ BaseException -> 0x017c, Throwable -> 0x00c9, all -> 0x00c1 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r12 = r1.f54647f     // Catch:{ BaseException -> 0x017c, Throwable -> 0x00c9, all -> 0x00c1 }
            java.lang.String r12 = r12.geteTag()     // Catch:{ BaseException -> 0x017c, Throwable -> 0x00c9, all -> 0x00c1 }
            r4 = 200(0xc8, float:2.8E-43)
            r13 = r5
            r15 = r7
            java.util.List r11 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67547a(r11, r12, r13, r15)     // Catch:{ BaseException -> 0x00a0, Throwable -> 0x009e, all -> 0x009c }
            com.ss.android.socialbase.downloader.model.HttpHeader r12 = new com.ss.android.socialbase.downloader.model.HttpHeader     // Catch:{ BaseException -> 0x00a0, Throwable -> 0x009e, all -> 0x009c }
            java.lang.String r13 = "Chunk-Index"
            int r14 = r2.f54923e     // Catch:{ BaseException -> 0x00a0, Throwable -> 0x009e, all -> 0x009c }
            java.lang.String r14 = java.lang.String.valueOf(r14)     // Catch:{ BaseException -> 0x00a0, Throwable -> 0x009e, all -> 0x009c }
            r12.<init>(r13, r14)     // Catch:{ BaseException -> 0x00a0, Throwable -> 0x009e, all -> 0x009c }
            r11.add(r12)     // Catch:{ BaseException -> 0x00a0, Throwable -> 0x009e, all -> 0x009c }
            com.ss.android.socialbase.downloader.model.DownloadInfo r12 = r1.f54647f     // Catch:{ BaseException -> 0x00a0, Throwable -> 0x009e, all -> 0x009c }
            boolean r12 = r12.isNeedDefaultHttpServiceBackUp()     // Catch:{ BaseException -> 0x00a0, Throwable -> 0x009e, all -> 0x009c }
            com.ss.android.socialbase.downloader.model.DownloadInfo r13 = r1.f54647f     // Catch:{ BaseException -> 0x00a0, Throwable -> 0x009e, all -> 0x009c }
            int r13 = r13.getMaxBytes()     // Catch:{ BaseException -> 0x00a0, Throwable -> 0x009e, all -> 0x009c }
            com.ss.android.socialbase.downloader.network.e r0 = com.p280ss.android.socialbase.downloader.downloader.C20269b.m66722a(r12, r13, r0, r11)     // Catch:{ BaseException -> 0x00a0, Throwable -> 0x009e, all -> 0x009c }
            r1.f54649h = r0     // Catch:{ BaseException -> 0x00a0, Throwable -> 0x009e, all -> 0x009c }
            goto L_0x00a5
        L_0x009c:
            r0 = move-exception
            goto L_0x00c4
        L_0x009e:
            r0 = move-exception
            goto L_0x00cc
        L_0x00a0:
            r0 = move-exception
            goto L_0x017f
        L_0x00a3:
            r4 = 200(0xc8, float:2.8E-43)
        L_0x00a5:
            com.ss.android.socialbase.downloader.network.e r0 = r1.f54649h     // Catch:{ BaseException -> 0x01c2, Throwable -> 0x01a5 }
            if (r0 == 0) goto L_0x00ea
            com.ss.android.socialbase.downloader.d.e r0 = r1.f54648g     // Catch:{ BaseException -> 0x01c2, Throwable -> 0x01a5 }
            if (r0 == 0) goto L_0x00ea
            com.ss.android.socialbase.downloader.network.e r0 = r1.f54649h     // Catch:{ Throwable -> 0x00ea, BaseException -> 0x01c2 }
            int r0 = r0.mo20818b()     // Catch:{ Throwable -> 0x00ea, BaseException -> 0x01c2 }
            if (r0 < r4) goto L_0x00b9
            r11 = 300(0x12c, float:4.2E-43)
            if (r0 < r11) goto L_0x00ea
        L_0x00b9:
            com.ss.android.socialbase.downloader.d.e r0 = r1.f54648g     // Catch:{ Throwable -> 0x00ea, BaseException -> 0x01c2 }
            com.ss.android.socialbase.downloader.network.e r4 = r1.f54649h     // Catch:{ Throwable -> 0x00ea, BaseException -> 0x01c2 }
        L_0x00bd:
            r0.mo54098a(r4)     // Catch:{ Throwable -> 0x00ea, BaseException -> 0x01c2 }
            goto L_0x00ea
        L_0x00c1:
            r0 = move-exception
            r4 = 200(0xc8, float:2.8E-43)
        L_0x00c4:
            r11 = 300(0x12c, float:4.2E-43)
        L_0x00c6:
            r12 = 0
            goto L_0x0184
        L_0x00c9:
            r0 = move-exception
            r4 = 200(0xc8, float:2.8E-43)
        L_0x00cc:
            r11 = 300(0x12c, float:4.2E-43)
            java.lang.String r12 = "ChunkRunnableConnection"
            com.p280ss.android.socialbase.downloader.utils.C20359e.m67555a(r0, r12)     // Catch:{ all -> 0x0179 }
            com.ss.android.socialbase.downloader.network.e r0 = r1.f54649h     // Catch:{ BaseException -> 0x01c2, Throwable -> 0x01a5 }
            if (r0 == 0) goto L_0x00ea
            com.ss.android.socialbase.downloader.d.e r0 = r1.f54648g     // Catch:{ BaseException -> 0x01c2, Throwable -> 0x01a5 }
            if (r0 == 0) goto L_0x00ea
            com.ss.android.socialbase.downloader.network.e r0 = r1.f54649h     // Catch:{ Throwable -> 0x00ea, BaseException -> 0x01c2 }
            int r0 = r0.mo20818b()     // Catch:{ Throwable -> 0x00ea, BaseException -> 0x01c2 }
            if (r0 < r4) goto L_0x00e5
            if (r0 < r11) goto L_0x00ea
        L_0x00e5:
            com.ss.android.socialbase.downloader.d.e r0 = r1.f54648g     // Catch:{ Throwable -> 0x00ea, BaseException -> 0x01c2 }
            com.ss.android.socialbase.downloader.network.e r4 = r1.f54649h     // Catch:{ Throwable -> 0x00ea, BaseException -> 0x01c2 }
            goto L_0x00bd
        L_0x00ea:
            boolean r0 = r26.m66516e()     // Catch:{ BaseException -> 0x01c2, Throwable -> 0x01a5 }
            if (r0 == 0) goto L_0x00f5
            r26.m66515d()
            r12 = 0
            return r12
        L_0x00f5:
            r12 = 0
            com.ss.android.socialbase.downloader.network.e r0 = r1.f54649h     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
            if (r0 == 0) goto L_0x016a
            boolean r0 = r1.f54653l     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
            if (r0 != 0) goto L_0x012b
            com.ss.android.socialbase.downloader.network.e r0 = r1.f54649h     // Catch:{ BaseException -> 0x0129, Throwable -> 0x0122 }
            int r0 = r0.mo20818b()     // Catch:{ BaseException -> 0x0129, Throwable -> 0x0122 }
            boolean r4 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67578b(r0)     // Catch:{ BaseException -> 0x0129, Throwable -> 0x0122 }
            if (r4 == 0) goto L_0x010b
            goto L_0x012b
        L_0x010b:
            com.ss.android.socialbase.downloader.exception.BaseException r4 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x0129, Throwable -> 0x0122 }
            r11 = 1002(0x3ea, float:1.404E-42)
            java.lang.String r13 = "Http response error , code is : %s "
            r14 = 1
            java.lang.Object[] r15 = new java.lang.Object[r14]     // Catch:{ BaseException -> 0x0129, Throwable -> 0x0122 }
            java.lang.String r0 = java.lang.String.valueOf(r0)     // Catch:{ BaseException -> 0x0129, Throwable -> 0x0122 }
            r15[r12] = r0     // Catch:{ BaseException -> 0x0129, Throwable -> 0x0122 }
            java.lang.String r0 = com.C1642a.m8034a(r13, r15)     // Catch:{ BaseException -> 0x0129, Throwable -> 0x0122 }
            r4.<init>(r11, r0)     // Catch:{ BaseException -> 0x0129, Throwable -> 0x0122 }
            throw r4     // Catch:{ BaseException -> 0x0129, Throwable -> 0x0122 }
        L_0x0122:
            r0 = move-exception
            java.lang.String r4 = "ChunkRunnableGetResponseCode"
            com.p280ss.android.socialbase.downloader.utils.C20359e.m67555a(r0, r4)     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
            goto L_0x012b
        L_0x0129:
            r0 = move-exception
            throw r0     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
        L_0x012b:
            com.ss.android.socialbase.downloader.downloader.d r0 = new com.ss.android.socialbase.downloader.downloader.d     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f54647f     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
            com.ss.android.socialbase.downloader.network.e r11 = r1.f54649h     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
            com.ss.android.socialbase.downloader.d.e r13 = r1.f54648g     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
            r0.<init>(r4, r11, r2, r13)     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
            r1.f54645d = r0     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
            if (r3 == 0) goto L_0x015c
            long r13 = r3.mo54543b(r12)     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
            int r0 = (r7 > r17 ? 1 : (r7 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x014b
            int r0 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r0 < 0) goto L_0x014b
            long r7 = r7 - r5
            r4 = 1
            long r13 = r7 + r4
        L_0x014b:
            r24 = r13
            com.ss.android.socialbase.downloader.downloader.d r0 = r1.f54645d     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
            long r20 = r3.mo54553k()     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
            long r3 = r3.f54921c     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
            r19 = r0
            r22 = r3
            r19.mo54321a(r20, r22, r24)     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
        L_0x015c:
            com.ss.android.socialbase.downloader.downloader.d r0 = r1.f54645d     // Catch:{ BaseException -> 0x0166, Throwable -> 0x019e }
            r0.mo54323c()     // Catch:{ BaseException -> 0x0166, Throwable -> 0x019e }
            r26.m66515d()
            r2 = 1
            return r2
        L_0x0166:
            r0 = move-exception
            r20 = 1
            goto L_0x01c6
        L_0x016a:
            com.ss.android.socialbase.downloader.exception.BaseException r0 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
            r3 = 1022(0x3fe, float:1.432E-42)
            java.io.IOException r4 = new java.io.IOException     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
            java.lang.String r5 = "download can't continue, chunk connection is null"
            r4.<init>(r5)     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
            r0.<init>(r3, r4)     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
            throw r0     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
        L_0x0179:
            r0 = move-exception
            goto L_0x00c6
        L_0x017c:
            r0 = move-exception
            r4 = 200(0xc8, float:2.8E-43)
        L_0x017f:
            r11 = 300(0x12c, float:4.2E-43)
            r12 = 0
            throw r0     // Catch:{ all -> 0x0183 }
        L_0x0183:
            r0 = move-exception
        L_0x0184:
            com.ss.android.socialbase.downloader.network.e r3 = r1.f54649h     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
            if (r3 == 0) goto L_0x019d
            com.ss.android.socialbase.downloader.d.e r3 = r1.f54648g     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
            if (r3 == 0) goto L_0x019d
            com.ss.android.socialbase.downloader.network.e r3 = r1.f54649h     // Catch:{ Throwable -> 0x019d, BaseException -> 0x01a0 }
            int r3 = r3.mo20818b()     // Catch:{ Throwable -> 0x019d, BaseException -> 0x01a0 }
            if (r3 < r4) goto L_0x0196
            if (r3 < r11) goto L_0x019d
        L_0x0196:
            com.ss.android.socialbase.downloader.d.e r3 = r1.f54648g     // Catch:{ Throwable -> 0x019d, BaseException -> 0x01a0 }
            com.ss.android.socialbase.downloader.network.e r4 = r1.f54649h     // Catch:{ Throwable -> 0x019d, BaseException -> 0x01a0 }
            r3.mo54098a(r4)     // Catch:{ Throwable -> 0x019d, BaseException -> 0x01a0 }
        L_0x019d:
            throw r0     // Catch:{ BaseException -> 0x01a0, Throwable -> 0x019e }
        L_0x019e:
            r0 = move-exception
            goto L_0x01a7
        L_0x01a0:
            r0 = move-exception
            goto L_0x01c4
        L_0x01a2:
            r0 = move-exception
            goto L_0x0291
        L_0x01a5:
            r0 = move-exception
            r12 = 0
        L_0x01a7:
            boolean r2 = r26.m66516e()     // Catch:{ all -> 0x01a2 }
            if (r2 == 0) goto L_0x01b2
            r26.m66515d()
            r2 = 1
            return r2
        L_0x01b2:
            java.lang.String r2 = "downloadChunkInner"
            com.p280ss.android.socialbase.downloader.utils.C20359e.m67555a(r0, r2)     // Catch:{ BaseException -> 0x01b8 }
            goto L_0x01be
        L_0x01b8:
            r0 = move-exception
            com.ss.android.socialbase.downloader.d.e r2 = r1.f54648g     // Catch:{ all -> 0x01a2 }
            r2.mo54103b(r0)     // Catch:{ all -> 0x01a2 }
        L_0x01be:
            r26.m66515d()
            return r12
        L_0x01c2:
            r0 = move-exception
            r12 = 0
        L_0x01c4:
            r20 = 0
        L_0x01c6:
            boolean r3 = r26.m66516e()     // Catch:{ all -> 0x01a2 }
            if (r3 == 0) goto L_0x01d1
            r26.m66515d()
            r2 = 1
            return r2
        L_0x01d1:
            boolean r3 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67580b(r0)     // Catch:{ all -> 0x01a2 }
            if (r3 == 0) goto L_0x01e0
            com.ss.android.socialbase.downloader.d.e r2 = r1.f54648g     // Catch:{ all -> 0x01a2 }
            r2.mo54097a(r0, r12)     // Catch:{ all -> 0x01a2 }
            r26.m66515d()
            return r12
        L_0x01e0:
            com.ss.android.socialbase.downloader.d.e r3 = r1.f54648g     // Catch:{ all -> 0x01a2 }
            boolean r3 = r3.mo54101a(r0)     // Catch:{ all -> 0x01a2 }
            if (r3 == 0) goto L_0x025e
            boolean r3 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67564a(r0)     // Catch:{ all -> 0x01a2 }
            if (r3 == 0) goto L_0x01f8
            com.ss.android.socialbase.downloader.d.e r2 = r1.f54648g     // Catch:{ all -> 0x01a2 }
            r3 = 1
            r2.mo54097a(r0, r3)     // Catch:{ all -> 0x01a2 }
            r26.m66515d()
            return r12
        L_0x01f8:
            if (r20 == 0) goto L_0x0235
            com.ss.android.socialbase.downloader.downloader.d r3 = r1.f54645d     // Catch:{ all -> 0x01a2 }
            if (r3 == 0) goto L_0x022c
            r3 = 32
            boolean r3 = com.p280ss.android.socialbase.downloader.utils.C20356b.m67535a(r3)     // Catch:{ all -> 0x01a2 }
            if (r3 == 0) goto L_0x0221
            com.ss.android.socialbase.downloader.downloader.d r3 = r1.f54645d     // Catch:{ all -> 0x01a2 }
            long r3 = r3.f54778b     // Catch:{ all -> 0x01a2 }
            com.ss.android.socialbase.downloader.downloader.d r5 = r1.f54645d     // Catch:{ all -> 0x01a2 }
            long r5 = r5.f54779c     // Catch:{ all -> 0x01a2 }
            r7 = 0
            long r3 = r3 - r5
            int r5 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r5 <= 0) goto L_0x021c
            com.ss.android.socialbase.downloader.downloader.d r5 = r1.f54645d     // Catch:{ all -> 0x01a2 }
            long r5 = r5.f54779c     // Catch:{ all -> 0x01a2 }
            r1.m66512a(r2, r5)     // Catch:{ all -> 0x01a2 }
            goto L_0x0237
        L_0x021c:
            int r5 = (r3 > r17 ? 1 : (r3 == r17 ? 0 : -1))
            if (r5 >= 0) goto L_0x0237
            goto L_0x0235
        L_0x0221:
            com.ss.android.socialbase.downloader.downloader.d r3 = r1.f54645d     // Catch:{ all -> 0x01a2 }
            long r3 = r3.f54778b     // Catch:{ all -> 0x01a2 }
            r5 = 0
            long r17 = r3 - r9
            r1.m66512a(r2, r9)     // Catch:{ all -> 0x01a2 }
            goto L_0x0235
        L_0x022c:
            com.ss.android.socialbase.downloader.d.e r2 = r1.f54648g     // Catch:{ all -> 0x01a2 }
            r2.mo54103b(r0)     // Catch:{ all -> 0x01a2 }
            r26.m66515d()
            return r12
        L_0x0235:
            r3 = r17
        L_0x0237:
            r5 = 16
            boolean r5 = com.p280ss.android.socialbase.downloader.utils.C20356b.m67535a(r5)     // Catch:{ all -> 0x01a2 }
            if (r5 == 0) goto L_0x0246
            com.ss.android.socialbase.downloader.d.e r5 = r1.f54648g     // Catch:{ all -> 0x01a2 }
            com.ss.android.socialbase.downloader.exception.RetryCheckStatus r0 = r5.mo54093a(r2, r0, r3)     // Catch:{ all -> 0x01a2 }
            goto L_0x024c
        L_0x0246:
            com.ss.android.socialbase.downloader.d.e r5 = r1.f54648g     // Catch:{ all -> 0x01a2 }
            com.ss.android.socialbase.downloader.exception.RetryCheckStatus r0 = r5.mo54092a(r0, r3)     // Catch:{ all -> 0x01a2 }
        L_0x024c:
            com.ss.android.socialbase.downloader.exception.RetryCheckStatus r3 = com.p280ss.android.socialbase.downloader.exception.RetryCheckStatus.RETURN     // Catch:{ all -> 0x01a2 }
            if (r0 != r3) goto L_0x0254
            r26.m66515d()
            return r12
        L_0x0254:
            r2.f54928j = r12     // Catch:{ all -> 0x01a2 }
            r26.m66515d()     // Catch:{ all -> 0x01a2 }
            r26.m66515d()
            goto L_0x0004
        L_0x025e:
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f54647f     // Catch:{ all -> 0x01a2 }
            boolean r2 = r2.isNeedChunkDowngradeRetry()     // Catch:{ all -> 0x01a2 }
            if (r2 == 0) goto L_0x0288
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f54647f     // Catch:{ all -> 0x01a2 }
            boolean r2 = r2.isChunkDowngradeRetryUsed()     // Catch:{ all -> 0x01a2 }
            if (r2 != 0) goto L_0x0288
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f54647f     // Catch:{ all -> 0x01a2 }
            int r2 = r2.getChunkCount()     // Catch:{ all -> 0x01a2 }
            r3 = 1
            if (r2 <= r3) goto L_0x0288
            com.ss.android.socialbase.downloader.model.DownloadInfo r2 = r1.f54647f     // Catch:{ all -> 0x01a2 }
            boolean r2 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67565a(r0, r2)     // Catch:{ all -> 0x01a2 }
            if (r2 == 0) goto L_0x0288
            com.ss.android.socialbase.downloader.d.e r2 = r1.f54648g     // Catch:{ all -> 0x01a2 }
            r2.mo54104c(r0)     // Catch:{ all -> 0x01a2 }
            r26.m66515d()
            return r12
        L_0x0288:
            com.ss.android.socialbase.downloader.d.e r2 = r1.f54648g     // Catch:{ all -> 0x01a2 }
            r2.mo54103b(r0)     // Catch:{ all -> 0x01a2 }
            r26.m66515d()
            return r12
        L_0x0291:
            r26.m66515d()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.p906d.C20197b.m66513a(com.ss.android.socialbase.downloader.model.DownloadChunk):boolean");
    }

    /* renamed from: a */
    public final void mo54089a(long j, long j2) {
        if (this.f54645d != null) {
            this.f54645d.mo54320a(j, j2);
        }
    }

    /* renamed from: a */
    private void m66512a(DownloadChunk downloadChunk, long j) {
        DownloadChunk downloadChunk2;
        if (downloadChunk.mo54545d()) {
            downloadChunk2 = downloadChunk.mo54547e();
        } else {
            downloadChunk2 = downloadChunk;
        }
        if (downloadChunk2 != null) {
            if (downloadChunk2.mo54549g()) {
                this.f54650i.mo54046a(downloadChunk2.f54919a, downloadChunk2.mo54542b(), j);
            }
            downloadChunk2.mo54537a(j);
            this.f54650i.mo54045a(downloadChunk2.f54919a, downloadChunk2.f54923e, downloadChunk2.mo54542b(), j);
            return;
        }
        if (downloadChunk.mo54545d()) {
            this.f54650i.mo54046a(downloadChunk.f54919a, downloadChunk.f54923e, j);
        }
    }

    public C20197b(DownloadChunk downloadChunk, DownloadTask downloadTask, C20203e eVar) {
        this.f54644c = downloadChunk;
        this.f54646e = downloadTask;
        if (downloadTask != null) {
            this.f54647f = downloadTask.getDownloadInfo();
        }
        this.f54648g = eVar;
        this.f54650i = C20269b.m66754m();
        this.f54644c.mo54539a(this);
    }

    public C20197b(DownloadChunk downloadChunk, DownloadTask downloadTask, C20346e eVar, C20203e eVar2) {
        this(downloadChunk, downloadTask, eVar2);
        this.f54649h = eVar;
    }
}
