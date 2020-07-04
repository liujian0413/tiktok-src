package com.p280ss.android.socialbase.downloader.downloader;

import android.os.SystemClock;
import com.p280ss.android.socialbase.downloader.impls.C20302d;
import com.p280ss.android.socialbase.downloader.impls.C20314k;
import com.p280ss.android.socialbase.downloader.impls.C20315l;
import com.p280ss.android.socialbase.downloader.model.C20340b;
import com.p280ss.android.socialbase.downloader.model.DownloadChunk;
import com.p280ss.android.socialbase.downloader.model.DownloadInfo;
import com.p280ss.android.socialbase.downloader.network.C20346e;
import com.p280ss.android.socialbase.downloader.p903a.C20177c;
import com.p280ss.android.socialbase.downloader.p906d.C20203e;
import com.p280ss.android.socialbase.downloader.utils.C20356b;
import com.p280ss.android.socialbase.downloader.utils.C20359e;
import java.io.IOException;
import java.util.concurrent.ExecutorService;

/* renamed from: com.ss.android.socialbase.downloader.downloader.d */
public class C20273d {

    /* renamed from: d */
    private static String f54776d = "d";

    /* renamed from: a */
    public final C20346e f54777a;

    /* renamed from: b */
    public long f54778b;

    /* renamed from: c */
    public volatile long f54779c;

    /* renamed from: e */
    private final DownloadInfo f54780e;

    /* renamed from: f */
    private final DownloadChunk f54781f;

    /* renamed from: g */
    private C20285j f54782g = C20269b.m66754m();

    /* renamed from: h */
    private C20314k f54783h;

    /* renamed from: i */
    private C20177c f54784i;

    /* renamed from: j */
    private C20340b f54785j;

    /* renamed from: k */
    private volatile boolean f54786k;

    /* renamed from: l */
    private volatile boolean f54787l;

    /* renamed from: m */
    private final C20203e f54788m;

    /* renamed from: n */
    private int f54789n;

    /* renamed from: o */
    private long f54790o;

    /* renamed from: p */
    private volatile long f54791p;

    /* renamed from: q */
    private volatile long f54792q;

    /* renamed from: r */
    private final boolean f54793r;

    /* renamed from: s */
    private volatile long f54794s;

    /* renamed from: d */
    private boolean m66815d() {
        if (this.f54786k || this.f54787l) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo54319a() {
        if (!this.f54786k) {
            this.f54786k = true;
            m66816e();
        }
    }

    /* renamed from: e */
    private void m66816e() {
        if (this.f54777a != null) {
            ExecutorService h = C20269b.m66749h();
            if (h != null) {
                h.execute(new Runnable() {
                    public final void run() {
                        try {
                            C20273d.this.f54777a.mo20820d();
                        } catch (Throwable unused) {
                        }
                    }
                });
            }
        }
    }

    /* renamed from: b */
    public final void mo54322b() {
        if (!this.f54787l) {
            synchronized (this.f54788m) {
                this.f54787l = true;
            }
            m66816e();
        }
    }

    /* renamed from: f */
    private void m66817f() {
        boolean z;
        boolean z2 = false;
        try {
            this.f54785j.mo54894a();
            z = true;
        } catch (IOException unused) {
            z = false;
        }
        if (z) {
            if (this.f54780e.getChunkCount() > 1) {
                z2 = true;
            }
            C20288m a = C20315l.m67199a(C20359e.m67577b());
            if (z2) {
                m66813a((C20285j) this.f54784i);
                if (a != null) {
                    a.mo54433c(this.f54780e);
                } else {
                    this.f54784i.mo54040a(this.f54780e.getId(), this.f54780e.getCurBytes());
                }
            } else if (a != null) {
                a.mo54433c(this.f54780e);
            } else {
                this.f54784i.mo54040a(this.f54781f.f54919a, this.f54778b);
            }
            this.f54779c = this.f54778b;
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(7:380|(2:128|129)|130|131|(3:133|152|142)(2:147|(1:149))|150|(3:152|153|154)(1:156)) */
    /* JADX WARNING: Code restructure failed: missing block: B:157:0x017f, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:159:0x0182, code lost:
        if (r1.f54785j != null) goto L_0x0184;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:161:?, code lost:
        r1.f54785j.mo54897b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:162:0x0189, code lost:
        throw r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:183:0x01c1, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:184:0x01c2, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:185:0x01c5, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:226:0x0213, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:227:0x0214, code lost:
        r15 = r11;
        r9 = r8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:228:0x0217, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:229:0x0218, code lost:
        r15 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:230:0x021b, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:231:0x021c, code lost:
        r15 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:232:0x021e, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:233:0x021f, code lost:
        r15 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:238:0x0231, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:239:0x0234, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:241:0x0237, code lost:
        r0 = e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:242:0x0238, code lost:
        r8 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:343:?, code lost:
        r15.close();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:348:0x035c, code lost:
        monitor-enter(r1.f54788m);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:351:0x035f, code lost:
        if (r1.f54787l == false) goto L_0x0361;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:352:0x0361, code lost:
        m66813a((com.p280ss.android.socialbase.downloader.downloader.C20285j) r1.f54783h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:353:0x0368, code lost:
        if (r1.f54785j != null) goto L_0x036a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:354:0x036a, code lost:
        m66817f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:361:0x0372, code lost:
        m66813a((com.p280ss.android.socialbase.downloader.downloader.C20285j) r1.f54783h);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:362:0x0379, code lost:
        if (r1.f54785j != null) goto L_0x037b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:363:0x037b, code lost:
        m66817f();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:367:?, code lost:
        r1.f54785j.mo54897b();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [B:104:0x00f5, B:235:0x0222] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:130:0x014c */
    /* JADX WARNING: Missing exception handler attribute for start block: B:193:0x01d2 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0056 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:256:0x0254 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:295:0x02a8 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:344:0x0356 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:60:0x009f */
    /* JADX WARNING: Removed duplicated region for block: B:133:0x0150 A[Catch:{ all -> 0x017f }] */
    /* JADX WARNING: Removed duplicated region for block: B:147:0x0168 A[Catch:{ all -> 0x017f }] */
    /* JADX WARNING: Removed duplicated region for block: B:152:0x0178 A[SYNTHETIC, Splitter:B:152:0x0178] */
    /* JADX WARNING: Removed duplicated region for block: B:156:0x017e A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:196:0x01d6 A[Catch:{ all -> 0x0208 }] */
    /* JADX WARNING: Removed duplicated region for block: B:210:0x01ee A[Catch:{ all -> 0x0208 }] */
    /* JADX WARNING: Removed duplicated region for block: B:215:0x01fe A[SYNTHETIC, Splitter:B:215:0x01fe] */
    /* JADX WARNING: Removed duplicated region for block: B:228:0x0217 A[ExcHandler: all (th java.lang.Throwable), PHI: r11 
      PHI: (r11v6 java.io.InputStream) = (r11v3 java.io.InputStream), (r11v7 java.io.InputStream), (r11v7 java.io.InputStream), (r11v7 java.io.InputStream), (r11v7 java.io.InputStream) binds: [B:14:0x0042, B:54:0x0094, B:95:0x00df, B:96:?, B:99:0x00e8] A[DONT_GENERATE, DONT_INLINE], Splitter:B:14:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:232:0x021e A[ExcHandler: BaseException (e com.ss.android.socialbase.downloader.exception.BaseException), PHI: r11 
      PHI: (r11v4 java.io.InputStream) = (r11v3 java.io.InputStream), (r11v7 java.io.InputStream), (r11v7 java.io.InputStream), (r11v7 java.io.InputStream), (r11v7 java.io.InputStream) binds: [B:14:0x0042, B:54:0x0094, B:95:0x00df, B:96:?, B:99:0x00e8] A[DONT_GENERATE, DONT_INLINE], Splitter:B:14:0x0042] */
    /* JADX WARNING: Removed duplicated region for block: B:238:0x0231 A[ExcHandler: all (th java.lang.Throwable), PHI: r15 
      PHI: (r15v5 java.io.InputStream) = (r15v6 java.io.InputStream), (r15v15 java.io.InputStream), (r15v15 java.io.InputStream), (r15v15 java.io.InputStream), (r15v15 java.io.InputStream), (r15v15 java.io.InputStream), (r15v15 java.io.InputStream), (r15v15 java.io.InputStream), (r15v17 java.io.InputStream) binds: [B:235:0x0222, B:112:0x0119, B:113:?, B:114:0x0121, B:179:0x01bc, B:180:?, B:124:0x0141, B:164:0x018a, B:104:0x00f5] A[DONT_GENERATE, DONT_INLINE], Splitter:B:104:0x00f5] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x005a A[Catch:{ all -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:241:0x0237 A[ExcHandler: BaseException (e com.ss.android.socialbase.downloader.exception.BaseException), PHI: r15 
      PHI: (r15v3 java.io.InputStream) = (r15v6 java.io.InputStream), (r15v15 java.io.InputStream), (r15v15 java.io.InputStream), (r15v15 java.io.InputStream), (r15v15 java.io.InputStream), (r15v15 java.io.InputStream), (r15v15 java.io.InputStream), (r15v15 java.io.InputStream), (r15v17 java.io.InputStream) binds: [B:235:0x0222, B:112:0x0119, B:113:?, B:114:0x0121, B:179:0x01bc, B:180:?, B:124:0x0141, B:164:0x018a, B:104:0x00f5] A[DONT_GENERATE, DONT_INLINE], Splitter:B:104:0x00f5] */
    /* JADX WARNING: Removed duplicated region for block: B:253:0x024f  */
    /* JADX WARNING: Removed duplicated region for block: B:259:0x0258 A[Catch:{ all -> 0x0287 }] */
    /* JADX WARNING: Removed duplicated region for block: B:273:0x0270 A[Catch:{ all -> 0x0287 }] */
    /* JADX WARNING: Removed duplicated region for block: B:278:0x0280 A[SYNTHETIC, Splitter:B:278:0x0280] */
    /* JADX WARNING: Removed duplicated region for block: B:282:0x0286 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:290:0x0292 A[SYNTHETIC, Splitter:B:290:0x0292] */
    /* JADX WARNING: Removed duplicated region for block: B:298:0x02ac A[Catch:{ all -> 0x0344 }] */
    /* JADX WARNING: Removed duplicated region for block: B:312:0x02c4 A[Catch:{ all -> 0x0344 }] */
    /* JADX WARNING: Removed duplicated region for block: B:317:0x02d4 A[SYNTHETIC, Splitter:B:317:0x02d4] */
    /* JADX WARNING: Removed duplicated region for block: B:321:0x02e0 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:322:0x02e1  */
    /* JADX WARNING: Removed duplicated region for block: B:342:0x0353 A[SYNTHETIC, Splitter:B:342:0x0353] */
    /* JADX WARNING: Removed duplicated region for block: B:347:0x035a A[Catch:{ all -> 0x0388 }] */
    /* JADX WARNING: Removed duplicated region for block: B:361:0x0372 A[Catch:{ all -> 0x0388 }] */
    /* JADX WARNING: Removed duplicated region for block: B:366:0x0382 A[SYNTHETIC, Splitter:B:366:0x0382] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0072 A[Catch:{ all -> 0x0089 }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0082 A[SYNTHETIC, Splitter:B:42:0x0082] */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0088 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00a3 A[Catch:{ all -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x00bb A[Catch:{ all -> 0x00d2 }] */
    /* JADX WARNING: Removed duplicated region for block: B:82:0x00cb A[SYNTHETIC, Splitter:B:82:0x00cb] */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x00d1 A[RETURN] */
    /* JADX WARNING: Unknown top exception splitter block from list: {B:339:0x0350=Splitter:B:339:0x0350, B:250:0x0249=Splitter:B:250:0x0249} */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo54323c() throws com.p280ss.android.socialbase.downloader.exception.BaseException {
        /*
            r16 = this;
            r1 = r16
            boolean r0 = r16.m66815d()
            if (r0 != 0) goto L_0x039d
            com.ss.android.socialbase.downloader.model.DownloadChunk r0 = r1.f54781f
            if (r0 != 0) goto L_0x000e
            goto L_0x039d
        L_0x000e:
            com.ss.android.socialbase.downloader.network.e r0 = r1.f54777a
            long r2 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67538a(r0)
            r4 = 0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 == 0) goto L_0x0393
            com.ss.android.socialbase.downloader.model.DownloadChunk r0 = r1.f54781f
            long r6 = r0.f54920b
            r8 = 0
            java.lang.String r9 = ""
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f54780e     // Catch:{ BaseException -> 0x034f, Throwable -> 0x0248 }
            java.lang.String r0 = r0.getTempPath()     // Catch:{ BaseException -> 0x034f, Throwable -> 0x0248 }
            com.ss.android.socialbase.downloader.model.DownloadInfo r11 = r1.f54780e     // Catch:{ BaseException -> 0x034f, Throwable -> 0x0248 }
            java.lang.String r11 = r11.getTempName()     // Catch:{ BaseException -> 0x034f, Throwable -> 0x0248 }
            com.ss.android.socialbase.downloader.model.b r0 = com.p280ss.android.socialbase.downloader.utils.C20359e.m67541a(r0, r11)     // Catch:{ BaseException -> 0x034f, Throwable -> 0x0248 }
            r1.f54785j = r0     // Catch:{ BaseException -> 0x034f, Throwable -> 0x0248 }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j     // Catch:{ IOException -> 0x023b }
            long r11 = r1.f54778b     // Catch:{ IOException -> 0x023b }
            r0.mo54895a(r11)     // Catch:{ IOException -> 0x023b }
            com.ss.android.socialbase.downloader.network.e r0 = r1.f54777a     // Catch:{ BaseException -> 0x034f, Throwable -> 0x0248 }
            java.io.InputStream r11 = r0.mo20816a()     // Catch:{ BaseException -> 0x034f, Throwable -> 0x0248 }
            if (r11 == 0) goto L_0x0221
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f54780e     // Catch:{ BaseException -> 0x021e, Throwable -> 0x021b, all -> 0x0217 }
            r0.updateRealStartDownloadTime()     // Catch:{ BaseException -> 0x021e, Throwable -> 0x021b, all -> 0x0217 }
            int r0 = r1.f54789n     // Catch:{ BaseException -> 0x021e, Throwable -> 0x021b, all -> 0x0217 }
            byte[] r0 = new byte[r0]     // Catch:{ BaseException -> 0x021e, Throwable -> 0x021b, all -> 0x0217 }
            boolean r8 = r16.m66815d()     // Catch:{ BaseException -> 0x021e, Throwable -> 0x021b, all -> 0x0217 }
            if (r8 == 0) goto L_0x0094
            if (r11 == 0) goto L_0x0056
            r11.close()     // Catch:{ IOException -> 0x0056 }
        L_0x0056:
            boolean r0 = r1.f54793r     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x0072
            com.ss.android.socialbase.downloader.d.e r2 = r1.f54788m     // Catch:{ all -> 0x0089 }
            monitor-enter(r2)     // Catch:{ all -> 0x0089 }
            boolean r0 = r1.f54787l     // Catch:{ all -> 0x006f }
            if (r0 != 0) goto L_0x006d
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54783h     // Catch:{ all -> 0x006f }
            r1.m66813a(r0)     // Catch:{ all -> 0x006f }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j     // Catch:{ all -> 0x006f }
            if (r0 == 0) goto L_0x006d
            r16.m66817f()     // Catch:{ all -> 0x006f }
        L_0x006d:
            monitor-exit(r2)     // Catch:{ all -> 0x006f }
            goto L_0x007e
        L_0x006f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x006f }
            throw r0     // Catch:{ all -> 0x0089 }
        L_0x0072:
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54783h     // Catch:{ all -> 0x0089 }
            r1.m66813a(r0)     // Catch:{ all -> 0x0089 }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j     // Catch:{ all -> 0x0089 }
            if (r0 == 0) goto L_0x007e
            r16.m66817f()     // Catch:{ all -> 0x0089 }
        L_0x007e:
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j
            if (r0 == 0) goto L_0x0088
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j     // Catch:{ IOException -> 0x0087 }
            r0.mo54897b()     // Catch:{ IOException -> 0x0087 }
        L_0x0087:
            return
        L_0x0088:
            return
        L_0x0089:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54785j
            if (r2 == 0) goto L_0x0093
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54785j     // Catch:{ IOException -> 0x0093 }
            r2.mo54897b()     // Catch:{ IOException -> 0x0093 }
        L_0x0093:
            throw r0
        L_0x0094:
            boolean r8 = r16.m66815d()     // Catch:{ BaseException -> 0x021e, Throwable -> 0x021b, all -> 0x0217 }
            if (r8 == 0) goto L_0x00dd
            if (r11 == 0) goto L_0x009f
            r11.close()     // Catch:{ IOException -> 0x009f }
        L_0x009f:
            boolean r0 = r1.f54793r     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x00bb
            com.ss.android.socialbase.downloader.d.e r2 = r1.f54788m     // Catch:{ all -> 0x00d2 }
            monitor-enter(r2)     // Catch:{ all -> 0x00d2 }
            boolean r0 = r1.f54787l     // Catch:{ all -> 0x00b8 }
            if (r0 != 0) goto L_0x00b6
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54783h     // Catch:{ all -> 0x00b8 }
            r1.m66813a(r0)     // Catch:{ all -> 0x00b8 }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j     // Catch:{ all -> 0x00b8 }
            if (r0 == 0) goto L_0x00b6
            r16.m66817f()     // Catch:{ all -> 0x00b8 }
        L_0x00b6:
            monitor-exit(r2)     // Catch:{ all -> 0x00b8 }
            goto L_0x00c7
        L_0x00b8:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00b8 }
            throw r0     // Catch:{ all -> 0x00d2 }
        L_0x00bb:
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54783h     // Catch:{ all -> 0x00d2 }
            r1.m66813a(r0)     // Catch:{ all -> 0x00d2 }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j     // Catch:{ all -> 0x00d2 }
            if (r0 == 0) goto L_0x00c7
            r16.m66817f()     // Catch:{ all -> 0x00d2 }
        L_0x00c7:
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j
            if (r0 == 0) goto L_0x00d1
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j     // Catch:{ IOException -> 0x00d0 }
            r0.mo54897b()     // Catch:{ IOException -> 0x00d0 }
        L_0x00d0:
            return
        L_0x00d1:
            return
        L_0x00d2:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54785j
            if (r2 == 0) goto L_0x00dc
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54785j     // Catch:{ IOException -> 0x00dc }
            r2.mo54897b()     // Catch:{ IOException -> 0x00dc }
        L_0x00dc:
            throw r0
        L_0x00dd:
            java.lang.String r8 = "read"
            int r9 = r11.read(r0)     // Catch:{ BaseException -> 0x021e, Throwable -> 0x0213, all -> 0x0217 }
            java.lang.String r12 = ""
            r8 = -1
            if (r9 == r8) goto L_0x01cc
            com.ss.android.socialbase.downloader.model.DownloadInfo r8 = r1.f54780e     // Catch:{ BaseException -> 0x021e, Throwable -> 0x01c7, all -> 0x0217 }
            boolean r8 = r8.isIgnoreDataVerify()     // Catch:{ BaseException -> 0x021e, Throwable -> 0x01c7, all -> 0x0217 }
            if (r8 != 0) goto L_0x0116
            long r13 = r1.f54792q     // Catch:{ BaseException -> 0x021e, Throwable -> 0x01c7, all -> 0x0217 }
            long r4 = r1.f54778b     // Catch:{ BaseException -> 0x021e, Throwable -> 0x01c7, all -> 0x0217 }
            r15 = r11
            long r10 = r1.f54790o     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01c5, all -> 0x0231 }
            r8 = 0
            long r4 = r4 - r10
            int r8 = (r13 > r4 ? 1 : (r13 == r4 ? 0 : -1))
            if (r8 <= 0) goto L_0x0117
            long r4 = r1.f54792q     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01c5, all -> 0x0231 }
            long r10 = r1.f54778b     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01c5, all -> 0x0231 }
            long r13 = r1.f54790o     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01c5, all -> 0x0231 }
            r8 = 0
            long r10 = r10 - r13
            long r13 = (long) r9     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01c5, all -> 0x0231 }
            long r10 = r10 + r13
            int r8 = (r4 > r10 ? 1 : (r4 == r10 ? 0 : -1))
            if (r8 >= 0) goto L_0x0117
            long r4 = r1.f54792q     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01c5, all -> 0x0231 }
            long r8 = r1.f54778b     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01c5, all -> 0x0231 }
            long r10 = r1.f54790o     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01c5, all -> 0x0231 }
            r13 = 0
            long r8 = r8 - r10
            long r4 = r4 - r8
            int r9 = (int) r4     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01c5, all -> 0x0231 }
            goto L_0x0117
        L_0x0116:
            r15 = r11
        L_0x0117:
            java.lang.String r4 = "write"
            com.ss.android.socialbase.downloader.model.b r5 = r1.f54785j     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01c1, all -> 0x0231 }
            r8 = 0
            r5.mo54896a(r0, r8, r9)     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01c1, all -> 0x0231 }
            java.lang.String r5 = ""
            long r10 = r1.f54778b     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01bd, all -> 0x0231 }
            long r8 = (long) r9     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01bd, all -> 0x0231 }
            long r10 = r10 + r8
            r1.f54778b = r10     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01bd, all -> 0x0231 }
            com.ss.android.socialbase.downloader.d.e r4 = r1.f54788m     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01bd, all -> 0x0231 }
            monitor-enter(r4)     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01bd, all -> 0x0231 }
            boolean r10 = r1.f54793r     // Catch:{ all -> 0x01ba }
            if (r10 == 0) goto L_0x0132
            boolean r10 = r1.f54787l     // Catch:{ all -> 0x01ba }
            if (r10 != 0) goto L_0x0140
        L_0x0132:
            com.ss.android.socialbase.downloader.d.e r10 = r1.f54788m     // Catch:{ all -> 0x01ba }
            boolean r8 = r10.mo54100a(r8)     // Catch:{ all -> 0x01ba }
            com.ss.android.socialbase.downloader.impls.k r9 = r1.f54783h     // Catch:{ all -> 0x01ba }
            r1.m66813a(r9)     // Catch:{ all -> 0x01ba }
            r1.m66814a(r8)     // Catch:{ all -> 0x01ba }
        L_0x0140:
            monitor-exit(r4)     // Catch:{ all -> 0x01ba }
            boolean r4 = r16.m66815d()     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01bd, all -> 0x0231 }
            if (r4 == 0) goto L_0x018a
            if (r15 == 0) goto L_0x014c
            r15.close()     // Catch:{ IOException -> 0x014c }
        L_0x014c:
            boolean r0 = r1.f54793r     // Catch:{ all -> 0x017f }
            if (r0 == 0) goto L_0x0168
            com.ss.android.socialbase.downloader.d.e r2 = r1.f54788m     // Catch:{ all -> 0x017f }
            monitor-enter(r2)     // Catch:{ all -> 0x017f }
            boolean r0 = r1.f54787l     // Catch:{ all -> 0x0165 }
            if (r0 != 0) goto L_0x0163
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54783h     // Catch:{ all -> 0x0165 }
            r1.m66813a(r0)     // Catch:{ all -> 0x0165 }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j     // Catch:{ all -> 0x0165 }
            if (r0 == 0) goto L_0x0163
            r16.m66817f()     // Catch:{ all -> 0x0165 }
        L_0x0163:
            monitor-exit(r2)     // Catch:{ all -> 0x0165 }
            goto L_0x0174
        L_0x0165:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x0165 }
            throw r0     // Catch:{ all -> 0x017f }
        L_0x0168:
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54783h     // Catch:{ all -> 0x017f }
            r1.m66813a(r0)     // Catch:{ all -> 0x017f }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j     // Catch:{ all -> 0x017f }
            if (r0 == 0) goto L_0x0174
            r16.m66817f()     // Catch:{ all -> 0x017f }
        L_0x0174:
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j
            if (r0 == 0) goto L_0x017e
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j     // Catch:{ IOException -> 0x017d }
            r0.mo54897b()     // Catch:{ IOException -> 0x017d }
        L_0x017d:
            return
        L_0x017e:
            return
        L_0x017f:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54785j
            if (r2 == 0) goto L_0x0189
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54785j     // Catch:{ IOException -> 0x0189 }
            r2.mo54897b()     // Catch:{ IOException -> 0x0189 }
        L_0x0189:
            throw r0
        L_0x018a:
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f54780e     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01bd, all -> 0x0231 }
            boolean r4 = r4.isDownloadWithWifiValid()     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01bd, all -> 0x0231 }
            if (r4 == 0) goto L_0x01b4
            com.ss.android.socialbase.downloader.model.DownloadInfo r4 = r1.f54780e     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01bd, all -> 0x0231 }
            boolean r4 = r4.isIgnoreDataVerify()     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01bd, all -> 0x0231 }
            if (r4 != 0) goto L_0x01ae
            long r8 = r1.f54792q     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01bd, all -> 0x0231 }
            r10 = 0
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 < 0) goto L_0x01ae
            long r8 = r1.f54792q     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01bd, all -> 0x0231 }
            long r10 = r1.f54778b     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01bd, all -> 0x0231 }
            long r12 = r1.f54790o     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01bd, all -> 0x0231 }
            r4 = 0
            long r10 = r10 - r12
            int r4 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r4 <= 0) goto L_0x01cd
        L_0x01ae:
            r9 = r5
            r11 = r15
            r4 = 0
            goto L_0x0094
        L_0x01b4:
            com.ss.android.socialbase.downloader.exception.DownloadOnlyWifiException r0 = new com.ss.android.socialbase.downloader.exception.DownloadOnlyWifiException     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01bd, all -> 0x0231 }
            r0.<init>()     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01bd, all -> 0x0231 }
            throw r0     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01bd, all -> 0x0231 }
        L_0x01ba:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01ba }
            throw r0     // Catch:{ BaseException -> 0x0237, Throwable -> 0x01bd, all -> 0x0231 }
        L_0x01bd:
            r0 = move-exception
            r9 = r5
            goto L_0x0235
        L_0x01c1:
            r0 = move-exception
            r9 = r4
            goto L_0x0235
        L_0x01c5:
            r0 = move-exception
            goto L_0x01c9
        L_0x01c7:
            r0 = move-exception
            r15 = r11
        L_0x01c9:
            r9 = r12
            goto L_0x0235
        L_0x01cc:
            r15 = r11
        L_0x01cd:
            if (r15 == 0) goto L_0x01d2
            r15.close()     // Catch:{ IOException -> 0x01d2 }
        L_0x01d2:
            boolean r0 = r1.f54793r     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x01ee
            com.ss.android.socialbase.downloader.d.e r4 = r1.f54788m     // Catch:{ all -> 0x0208 }
            monitor-enter(r4)     // Catch:{ all -> 0x0208 }
            boolean r0 = r1.f54787l     // Catch:{ all -> 0x01eb }
            if (r0 != 0) goto L_0x01e9
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54783h     // Catch:{ all -> 0x01eb }
            r1.m66813a(r0)     // Catch:{ all -> 0x01eb }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j     // Catch:{ all -> 0x01eb }
            if (r0 == 0) goto L_0x01e9
            r16.m66817f()     // Catch:{ all -> 0x01eb }
        L_0x01e9:
            monitor-exit(r4)     // Catch:{ all -> 0x01eb }
            goto L_0x01fa
        L_0x01eb:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x01eb }
            throw r0     // Catch:{ all -> 0x0208 }
        L_0x01ee:
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54783h     // Catch:{ all -> 0x0208 }
            r1.m66813a(r0)     // Catch:{ all -> 0x0208 }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j     // Catch:{ all -> 0x0208 }
            if (r0 == 0) goto L_0x01fa
            r16.m66817f()     // Catch:{ all -> 0x0208 }
        L_0x01fa:
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j
            if (r0 == 0) goto L_0x02d8
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j     // Catch:{ IOException -> 0x0205 }
        L_0x0200:
            r0.mo54897b()     // Catch:{ IOException -> 0x0205 }
            goto L_0x02d8
        L_0x0205:
            goto L_0x02d8
        L_0x0208:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54785j
            if (r2 == 0) goto L_0x0212
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54785j     // Catch:{ IOException -> 0x0212 }
            r2.mo54897b()     // Catch:{ IOException -> 0x0212 }
        L_0x0212:
            throw r0
        L_0x0213:
            r0 = move-exception
            r15 = r11
            r9 = r8
            goto L_0x0235
        L_0x0217:
            r0 = move-exception
            r15 = r11
            goto L_0x0351
        L_0x021b:
            r0 = move-exception
            r15 = r11
            goto L_0x0235
        L_0x021e:
            r0 = move-exception
            r15 = r11
            goto L_0x0238
        L_0x0221:
            r15 = r11
            com.ss.android.socialbase.downloader.exception.BaseException r0 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x0237, Throwable -> 0x0234, all -> 0x0231 }
            r4 = 1042(0x412, float:1.46E-42)
            java.io.IOException r5 = new java.io.IOException     // Catch:{ BaseException -> 0x0237, Throwable -> 0x0234, all -> 0x0231 }
            java.lang.String r8 = "inputStream is null"
            r5.<init>(r8)     // Catch:{ BaseException -> 0x0237, Throwable -> 0x0234, all -> 0x0231 }
            r0.<init>(r4, r5)     // Catch:{ BaseException -> 0x0237, Throwable -> 0x0234, all -> 0x0231 }
            throw r0     // Catch:{ BaseException -> 0x0237, Throwable -> 0x0234, all -> 0x0231 }
        L_0x0231:
            r0 = move-exception
            goto L_0x0351
        L_0x0234:
            r0 = move-exception
        L_0x0235:
            r8 = r15
            goto L_0x0249
        L_0x0237:
            r0 = move-exception
        L_0x0238:
            r8 = r15
            goto L_0x0350
        L_0x023b:
            r0 = move-exception
            com.ss.android.socialbase.downloader.exception.BaseException r4 = new com.ss.android.socialbase.downloader.exception.BaseException     // Catch:{ BaseException -> 0x034f, Throwable -> 0x0248 }
            r5 = 1054(0x41e, float:1.477E-42)
            r4.<init>(r5, r0)     // Catch:{ BaseException -> 0x034f, Throwable -> 0x0248 }
            throw r4     // Catch:{ BaseException -> 0x034f, Throwable -> 0x0248 }
        L_0x0244:
            r0 = move-exception
            r15 = r8
            goto L_0x0351
        L_0x0248:
            r0 = move-exception
        L_0x0249:
            boolean r4 = r16.m66815d()     // Catch:{ all -> 0x0244 }
            if (r4 == 0) goto L_0x0292
            if (r8 == 0) goto L_0x0254
            r8.close()     // Catch:{ IOException -> 0x0254 }
        L_0x0254:
            boolean r0 = r1.f54793r     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x0270
            com.ss.android.socialbase.downloader.d.e r2 = r1.f54788m     // Catch:{ all -> 0x0287 }
            monitor-enter(r2)     // Catch:{ all -> 0x0287 }
            boolean r0 = r1.f54787l     // Catch:{ all -> 0x026d }
            if (r0 != 0) goto L_0x026b
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54783h     // Catch:{ all -> 0x026d }
            r1.m66813a(r0)     // Catch:{ all -> 0x026d }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j     // Catch:{ all -> 0x026d }
            if (r0 == 0) goto L_0x026b
            r16.m66817f()     // Catch:{ all -> 0x026d }
        L_0x026b:
            monitor-exit(r2)     // Catch:{ all -> 0x026d }
            goto L_0x027c
        L_0x026d:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x026d }
            throw r0     // Catch:{ all -> 0x0287 }
        L_0x0270:
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54783h     // Catch:{ all -> 0x0287 }
            r1.m66813a(r0)     // Catch:{ all -> 0x0287 }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j     // Catch:{ all -> 0x0287 }
            if (r0 == 0) goto L_0x027c
            r16.m66817f()     // Catch:{ all -> 0x0287 }
        L_0x027c:
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j
            if (r0 == 0) goto L_0x0286
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j     // Catch:{ IOException -> 0x0285 }
            r0.mo54897b()     // Catch:{ IOException -> 0x0285 }
        L_0x0285:
            return
        L_0x0286:
            return
        L_0x0287:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54785j
            if (r2 == 0) goto L_0x0291
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54785j     // Catch:{ IOException -> 0x0291 }
            r2.mo54897b()     // Catch:{ IOException -> 0x0291 }
        L_0x0291:
            throw r0
        L_0x0292:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x0244 }
            java.lang.String r5 = "DownloadResponseHandler "
            r4.<init>(r5)     // Catch:{ all -> 0x0244 }
            r4.append(r9)     // Catch:{ all -> 0x0244 }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x0244 }
            com.p280ss.android.socialbase.downloader.utils.C20359e.m67555a(r0, r4)     // Catch:{ all -> 0x0244 }
            if (r8 == 0) goto L_0x02a8
            r8.close()     // Catch:{ IOException -> 0x02a8 }
        L_0x02a8:
            boolean r0 = r1.f54793r     // Catch:{ all -> 0x0344 }
            if (r0 == 0) goto L_0x02c4
            com.ss.android.socialbase.downloader.d.e r4 = r1.f54788m     // Catch:{ all -> 0x0344 }
            monitor-enter(r4)     // Catch:{ all -> 0x0344 }
            boolean r0 = r1.f54787l     // Catch:{ all -> 0x02c1 }
            if (r0 != 0) goto L_0x02bf
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54783h     // Catch:{ all -> 0x02c1 }
            r1.m66813a(r0)     // Catch:{ all -> 0x02c1 }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j     // Catch:{ all -> 0x02c1 }
            if (r0 == 0) goto L_0x02bf
            r16.m66817f()     // Catch:{ all -> 0x02c1 }
        L_0x02bf:
            monitor-exit(r4)     // Catch:{ all -> 0x02c1 }
            goto L_0x02d0
        L_0x02c1:
            r0 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x02c1 }
            throw r0     // Catch:{ all -> 0x0344 }
        L_0x02c4:
            com.ss.android.socialbase.downloader.impls.k r0 = r1.f54783h     // Catch:{ all -> 0x0344 }
            r1.m66813a(r0)     // Catch:{ all -> 0x0344 }
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j     // Catch:{ all -> 0x0344 }
            if (r0 == 0) goto L_0x02d0
            r16.m66817f()     // Catch:{ all -> 0x0344 }
        L_0x02d0:
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j
            if (r0 == 0) goto L_0x02d8
            com.ss.android.socialbase.downloader.model.b r0 = r1.f54785j     // Catch:{ IOException -> 0x0205 }
            goto L_0x0200
        L_0x02d8:
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r1.f54780e
            boolean r0 = r0.isIgnoreDataVerify()
            if (r0 == 0) goto L_0x02e1
            return
        L_0x02e1:
            long r4 = r1.f54778b
            long r8 = r1.f54790o
            long r4 = r4 - r8
            r8 = 0
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0343
            long r10 = r1.f54792q
            int r0 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r0 < 0) goto L_0x0343
            long r8 = r1.f54792q
            int r0 = (r8 > r4 ? 1 : (r8 == r4 ? 0 : -1))
            if (r0 != 0) goto L_0x02f9
            goto L_0x0343
        L_0x02f9:
            com.ss.android.socialbase.downloader.exception.BaseException r0 = new com.ss.android.socialbase.downloader.exception.BaseException
            r8 = 1051(0x41b, float:1.473E-42)
            r9 = 7
            java.lang.Object[] r9 = new java.lang.Object[r9]
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r5 = 0
            r9[r5] = r4
            r4 = 1
            java.lang.Long r2 = java.lang.Long.valueOf(r2)
            r9[r4] = r2
            r2 = 2
            long r3 = r1.f54792q
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r9[r2] = r3
            r2 = 3
            java.lang.Long r3 = java.lang.Long.valueOf(r6)
            r9[r2] = r3
            r2 = 4
            long r3 = r1.f54791p
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r9[r2] = r3
            r2 = 5
            long r3 = r1.f54778b
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r9[r2] = r3
            r2 = 6
            long r3 = r1.f54790o
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r9[r2] = r3
            java.lang.String r2 = "handle data length[%d] != content length[%d] downloadChunkContentLen[%d], range[%d, %d) , current offset[%d] , handle start from %d"
            java.lang.String r2 = com.C1642a.m8034a(r2, r9)
            r0.<init>(r8, r2)
            throw r0
        L_0x0343:
            return
        L_0x0344:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54785j
            if (r2 == 0) goto L_0x034e
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54785j     // Catch:{ IOException -> 0x034e }
            r2.mo54897b()     // Catch:{ IOException -> 0x034e }
        L_0x034e:
            throw r0
        L_0x034f:
            r0 = move-exception
        L_0x0350:
            throw r0     // Catch:{ all -> 0x0244 }
        L_0x0351:
            if (r15 == 0) goto L_0x0356
            r15.close()     // Catch:{ IOException -> 0x0356 }
        L_0x0356:
            boolean r2 = r1.f54793r     // Catch:{ all -> 0x0388 }
            if (r2 == 0) goto L_0x0372
            com.ss.android.socialbase.downloader.d.e r2 = r1.f54788m     // Catch:{ all -> 0x0388 }
            monitor-enter(r2)     // Catch:{ all -> 0x0388 }
            boolean r3 = r1.f54787l     // Catch:{ all -> 0x036f }
            if (r3 != 0) goto L_0x036d
            com.ss.android.socialbase.downloader.impls.k r3 = r1.f54783h     // Catch:{ all -> 0x036f }
            r1.m66813a(r3)     // Catch:{ all -> 0x036f }
            com.ss.android.socialbase.downloader.model.b r3 = r1.f54785j     // Catch:{ all -> 0x036f }
            if (r3 == 0) goto L_0x036d
            r16.m66817f()     // Catch:{ all -> 0x036f }
        L_0x036d:
            monitor-exit(r2)     // Catch:{ all -> 0x036f }
            goto L_0x037e
        L_0x036f:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x036f }
            throw r0     // Catch:{ all -> 0x0388 }
        L_0x0372:
            com.ss.android.socialbase.downloader.impls.k r2 = r1.f54783h     // Catch:{ all -> 0x0388 }
            r1.m66813a(r2)     // Catch:{ all -> 0x0388 }
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54785j     // Catch:{ all -> 0x0388 }
            if (r2 == 0) goto L_0x037e
            r16.m66817f()     // Catch:{ all -> 0x0388 }
        L_0x037e:
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54785j
            if (r2 == 0) goto L_0x0387
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54785j     // Catch:{ IOException -> 0x0387 }
            r2.mo54897b()     // Catch:{ IOException -> 0x0387 }
        L_0x0387:
            throw r0
        L_0x0388:
            r0 = move-exception
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54785j
            if (r2 == 0) goto L_0x0392
            com.ss.android.socialbase.downloader.model.b r2 = r1.f54785j     // Catch:{ IOException -> 0x0392 }
            r2.mo54897b()     // Catch:{ IOException -> 0x0392 }
        L_0x0392:
            throw r0
        L_0x0393:
            com.ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException r0 = new com.ss.android.socialbase.downloader.exception.DownloadRetryNeedlessException
            r2 = 1004(0x3ec, float:1.407E-42)
            java.lang.String r3 = "the content-length is 0"
            r0.<init>(r2, r3)
            throw r0
        L_0x039d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.socialbase.downloader.downloader.C20273d.mo54323c():void");
    }

    /* renamed from: a */
    private void m66814a(boolean z) {
        long uptimeMillis = SystemClock.uptimeMillis();
        long j = this.f54778b - this.f54779c;
        long j2 = uptimeMillis - this.f54794s;
        if (z || C20359e.m67561a(j, j2)) {
            m66817f();
            this.f54794s = uptimeMillis;
        }
    }

    /* renamed from: a */
    private void m66813a(C20285j jVar) {
        DownloadChunk downloadChunk;
        DownloadChunk downloadChunk2;
        C20285j jVar2 = jVar;
        if (jVar2 != null) {
            C20288m mVar = null;
            boolean z = jVar2 instanceof C20177c;
            if (z) {
                mVar = C20315l.m67199a(C20359e.m67577b());
                if (mVar == null) {
                    return;
                }
            }
            C20288m mVar2 = mVar;
            if (this.f54781f.mo54545d()) {
                downloadChunk = this.f54781f.mo54547e();
            } else {
                downloadChunk = this.f54781f;
            }
            DownloadChunk downloadChunk3 = downloadChunk;
            if (downloadChunk3 != null) {
                downloadChunk3.mo54537a(this.f54778b);
                if (!z || mVar2 == null) {
                    downloadChunk2 = downloadChunk3;
                    jVar.mo54045a(downloadChunk3.f54919a, downloadChunk3.f54923e, downloadChunk3.mo54542b(), this.f54778b);
                } else {
                    mVar2.mo54409a(downloadChunk3.f54919a, downloadChunk3.f54923e, downloadChunk3.mo54542b(), this.f54778b);
                    downloadChunk2 = downloadChunk3;
                }
                if (downloadChunk2.mo54549g()) {
                    boolean z2 = false;
                    if (downloadChunk2.mo54550h()) {
                        long i = downloadChunk2.mo54551i();
                        if (i > this.f54778b) {
                            if (!z || mVar2 == null) {
                                jVar2.mo54046a(downloadChunk2.f54919a, downloadChunk2.mo54542b(), i);
                            } else {
                                mVar2.mo54410a(downloadChunk2.f54919a, downloadChunk2.mo54542b(), i);
                            }
                            z2 = true;
                        }
                    }
                    if (!z2) {
                        if (!z || mVar2 == null) {
                            jVar2.mo54046a(downloadChunk2.f54919a, downloadChunk2.mo54542b(), this.f54778b);
                        } else {
                            mVar2.mo54410a(downloadChunk2.f54919a, downloadChunk2.mo54542b(), this.f54778b);
                        }
                    }
                }
            } else if (this.f54781f.mo54545d()) {
                if (!z || mVar2 == null) {
                    jVar2.mo54046a(this.f54781f.f54919a, this.f54781f.f54923e, this.f54778b);
                } else {
                    mVar2.mo54410a(this.f54781f.f54919a, this.f54781f.f54923e, this.f54778b);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo54320a(long j, long j2) {
        this.f54791p = j;
        this.f54792q = j2;
    }

    /* renamed from: a */
    public final void mo54321a(long j, long j2, long j3) {
        this.f54778b = j;
        this.f54790o = j;
        this.f54791p = j2;
        this.f54792q = j3;
    }

    public C20273d(DownloadInfo downloadInfo, C20346e eVar, DownloadChunk downloadChunk, C20203e eVar2) {
        boolean z;
        this.f54780e = downloadInfo;
        if (this.f54782g instanceof C20302d) {
            C20302d dVar = (C20302d) this.f54782g;
            this.f54783h = dVar.f54859a;
            this.f54784i = dVar.f54860b;
        }
        this.f54777a = eVar;
        this.f54781f = downloadChunk;
        this.f54788m = eVar2;
        this.f54789n = C20269b.m66760s();
        this.f54778b = downloadChunk.mo54553k();
        this.f54790o = this.f54778b;
        StringBuilder sb = new StringBuilder("DownloadResponseHandler isHostChunk():");
        sb.append(downloadChunk.mo54545d());
        sb.append(" downloadChunk!=null:");
        if (downloadChunk.f54926h != null) {
            z = true;
        } else {
            z = false;
        }
        sb.append(z);
        if (downloadChunk.mo54545d()) {
            this.f54792q = downloadChunk.f54922d;
        } else {
            this.f54792q = downloadChunk.mo54543b(false);
        }
        this.f54791p = downloadChunk.f54921c;
        this.f54793r = C20356b.m67535a(65536);
    }
}
