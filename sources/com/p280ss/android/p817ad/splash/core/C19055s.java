package com.p280ss.android.p817ad.splash.core;

import android.net.Uri;
import android.os.Looper;
import android.text.TextUtils;
import com.p280ss.android.p817ad.splash.C19109d;
import com.p280ss.android.p817ad.splash.C19155q;
import com.p280ss.android.p817ad.splash.core.p827b.C18985b;
import com.p280ss.android.p817ad.splash.core.p828c.C19001b;
import com.p280ss.android.p817ad.splash.core.p828c.C19008g;
import com.p280ss.android.p817ad.splash.core.p828c.C19010i;
import com.p280ss.android.p817ad.splash.core.p828c.C19012k;
import com.p280ss.android.p817ad.splash.p824b.C18949a;
import com.p280ss.android.p817ad.splash.p824b.C18956b;
import com.p280ss.android.p817ad.splash.p835f.C19120a;
import com.p280ss.android.p817ad.splash.p836g.C19124c;
import com.p280ss.android.p817ad.splash.p836g.C19126e;
import com.p280ss.android.p817ad.splash.p836g.C19127f;
import com.p280ss.android.p817ad.splash.p836g.C19128g;
import com.p280ss.android.p817ad.splash.p836g.C19129h;
import com.p280ss.android.p817ad.splash.p836g.C19132j;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.s */
final class C19055s {

    /* renamed from: d */
    private static volatile C19055s f51491d;

    /* renamed from: a */
    public volatile long f51492a;

    /* renamed from: b */
    public long f51493b = 20000;

    /* renamed from: c */
    public C19120a f51494c = new C19060a();

    /* renamed from: com.ss.android.ad.splash.core.s$a */
    class C19060a implements C19120a {
        C19060a() {
        }
    }

    /* renamed from: a */
    public final boolean mo50592a(C19001b bVar) {
        boolean z = false;
        if (!C19126e.m62680a(bVar.f51300l)) {
            for (C19001b bVar2 : bVar.f51300l) {
                if (bVar2 != null && bVar2.mo50476a() && mo50596c(bVar2)) {
                    C19062u.m62368a().mo50606a(bVar2.f51287a);
                    z = true;
                }
            }
        }
        return z;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo50593b() {
        this.f51492a = 0;
    }

    private C19055s() {
    }

    /* renamed from: a */
    public static C19055s m62339a() {
        if (f51491d == null) {
            synchronized (C19055s.class) {
                if (f51491d == null) {
                    f51491d = new C19055s();
                }
            }
        }
        return f51491d;
    }

    /* renamed from: e */
    private boolean m62353e() {
        if (System.currentTimeMillis() - this.f51492a > this.f51493b) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static void m62354f() {
        if (C19025f.m62190u() == null) {
            C19025f.m62142b(C19061t.m62364a(C19044j.m62231a().f51468i));
        }
        if (C19025f.m62191v() == null) {
            C19025f.m62127a(new ConcurrentHashMap<>());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo50595c() {
        int i;
        JSONObject jSONObject;
        int i2;
        long j;
        long j2;
        boolean z;
        C19001b bVar;
        C19001b bVar2;
        if (!C19063v.m62414a().f51516h && C19128g.m62689b(C19025f.m62096J()) && m62353e()) {
            long currentTimeMillis = System.currentTimeMillis();
            this.f51492a = currentTimeMillis;
            Future submit = C19025f.m62189t().submit(new Callable<C19155q>() {
                public final /* synthetic */ Object call() throws Exception {
                    return m62362a();
                }

                /* renamed from: a */
                private static C19155q m62362a() throws Exception {
                    if (C19025f.m62192w() == null) {
                        return null;
                    }
                    String c = C19129h.m62720c();
                    String d = C19129h.m62722d();
                    if (C19132j.m62736a(c)) {
                        return null;
                    }
                    C18985b.m61973a();
                    C18985b.m61981d();
                    return C19025f.m62192w().mo50860a(c, d);
                }
            });
            try {
                JSONObject jSONObject2 = new JSONObject();
                C19155q qVar = (C19155q) submit.get(30, TimeUnit.SECONDS);
                if (qVar == null || !qVar.f51783b || qVar.f51782a == null) {
                    jSONObject = jSONObject2;
                    C18985b.m61973a();
                    i = 0;
                    C18985b.m61980c(false);
                } else {
                    C18985b.m61973a();
                    C18985b.m61980c(true);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    JSONObject optJSONObject = qVar.f51782a.optJSONObject("data");
                    if (optJSONObject != null) {
                        long optLong = optJSONObject.optLong("leave_interval", 300) * 1000;
                        long optLong2 = optJSONObject.optLong("splash_interval", 1800) * 1000;
                        JSONObject jSONObject3 = jSONObject2;
                        this.f51493b = optJSONObject.optLong("splash_load_interval", 20) * 1000;
                        String optString = optJSONObject.optString("log_extra", "{}");
                        boolean optBoolean = optJSONObject.optBoolean("is_need_ack", false);
                        int min = Math.min(optJSONObject.optInt("concurrent_downloads", 0), Runtime.getRuntime().availableProcessors());
                        new StringBuilder("concurrent_downloads : ").append(min);
                        JSONArray optJSONArray = optJSONObject.optJSONArray("penalty_period");
                        if (optJSONArray == null || optJSONArray.length() != 2) {
                            j = currentTimeMillis;
                            i2 = min;
                        } else {
                            j = currentTimeMillis;
                            i2 = min;
                            long j3 = optJSONArray.getLong(1) * 1000;
                            C19044j.m62231a().mo50539a(optJSONArray.getLong(0) * 1000);
                            C19044j.m62231a().mo50540b(j3);
                        }
                        if (optJSONArray == null) {
                            optJSONArray = new JSONArray();
                        }
                        int optInt = optJSONObject.optInt("show_limit", 0);
                        long currentTimeMillis3 = System.currentTimeMillis();
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("splash");
                        if (optJSONArray2 == null) {
                            optJSONArray2 = new JSONArray();
                        }
                        C19044j a = C19044j.m62231a();
                        List<C19001b> a2 = C19129h.m62703a(optJSONArray2, currentTimeMillis3, false);
                        C18985b.m61973a();
                        C18985b.m61978b(a2.isEmpty());
                        List<C19001b> list = a.f51460a;
                        if (C19025f.m62135ad()) {
                            List<C19001b> a3 = C19129h.m62699a(a.f51461b, a2);
                            JSONArray b = C19129h.m62718b(a3);
                            a.f51461b = a3;
                            j2 = currentTimeMillis2;
                            C19062u.m62368a().mo50618e(b.toString()).mo50628j();
                            if (!C19062u.m62368a().mo50614c()) {
                                m62355f(list);
                                m62351e((C19001b) null);
                            }
                        } else {
                            j2 = currentTimeMillis2;
                        }
                        if (!C19126e.m62680a(a2)) {
                            bVar = (C19001b) a2.get(0);
                            z = false;
                        } else {
                            bVar = null;
                            z = true;
                        }
                        if (!C19126e.m62680a(list)) {
                            bVar2 = (C19001b) list.get(0);
                        } else {
                            bVar2 = null;
                        }
                        m62343a(bVar, bVar2);
                        a.f51460a = a2;
                        a.f51464e = optLong;
                        a.f51463d = optLong2;
                        a.f51469j = optString;
                        a.f51467h = optBoolean;
                        a.f51468i = i2;
                        C19025f.m62188s();
                        C19062u.m62368a().mo50603a(optLong).mo50602a(optInt).mo50608b(optLong2).mo50604a(optJSONArray2.toString()).mo50627j(optJSONArray.toString()).mo50605a(z).mo50629k(optString).mo50613c(optBoolean).mo50628j();
                        C19025f.m62173j();
                        m62347b(a2);
                        jSONObject = jSONObject3;
                        jSONObject.put("durarion_ad_request_total_times", j2 - j);
                        m62350d(a2);
                        m62352e(a2);
                        i = 0;
                    } else {
                        return;
                    }
                }
                C18949a.m61865a().mo50365b("service_ad_request_status", i, jSONObject, null);
            } catch (Exception e) {
                C18985b.m61973a();
                C18985b.m61980c(false);
                C18949a.m61865a().mo50361a(e, "key_exception_request");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo50597d() {
        JSONObject jSONObject;
        long j;
        JSONArray jSONArray;
        JSONArray jSONArray2;
        List list;
        if (C19063v.m62414a().f51516h || !C19128g.m62689b(C19025f.m62096J())) {
            return;
        }
        if (m62353e()) {
            long currentTimeMillis = System.currentTimeMillis();
            C18956b.m61883a().mo50371c();
            Future submit = C19025f.m62189t().submit(new Callable<C19155q>() {
                public final /* synthetic */ Object call() throws Exception {
                    return m62363a();
                }

                /* renamed from: a */
                private static C19155q m62363a() throws Exception {
                    if (C19025f.m62192w() == null) {
                        return null;
                    }
                    String c = C19129h.m62720c();
                    String d = C19129h.m62722d();
                    if (!C19132j.m62736a(c)) {
                        return C19025f.m62192w().mo50860a(c, d);
                    }
                    return null;
                }
            });
            try {
                JSONObject jSONObject2 = new JSONObject();
                C19155q qVar = (C19155q) submit.get(30, TimeUnit.SECONDS);
                this.f51492a = System.currentTimeMillis();
                if (qVar == null || !qVar.f51783b || qVar.f51782a == null) {
                    jSONObject = jSONObject2;
                } else {
                    long currentTimeMillis2 = System.currentTimeMillis();
                    JSONObject optJSONObject = qVar.f51782a.optJSONObject("data");
                    if (optJSONObject != null) {
                        long optLong = optJSONObject.optLong("leave_interval", 300) * 1000;
                        long optLong2 = optJSONObject.optLong("splash_interval", 1800) * 1000;
                        long j2 = currentTimeMillis2;
                        this.f51493b = optJSONObject.optLong("splash_load_interval", 20) * 1000;
                        String optString = optJSONObject.optString("log_extra", "{}");
                        boolean optBoolean = optJSONObject.optBoolean("is_need_ack", false);
                        int min = Math.min(optJSONObject.optInt("concurrent_downloads", 0), Runtime.getRuntime().availableProcessors());
                        new StringBuilder("concurrent_downloads : ").append(min);
                        JSONArray optJSONArray = optJSONObject.optJSONArray("penalty_period");
                        if (optJSONArray == null || optJSONArray.length() != 2) {
                            j = currentTimeMillis;
                        } else {
                            j = currentTimeMillis;
                            long j3 = 1000 * optJSONArray.getLong(1);
                            C19044j.m62231a().mo50539a(optJSONArray.getLong(0) * 1000);
                            C19044j.m62231a().mo50540b(j3);
                        }
                        if (optJSONArray == null) {
                            optJSONArray = new JSONArray();
                        }
                        int optInt = optJSONObject.optInt("show_limit", 0);
                        long currentTimeMillis3 = System.currentTimeMillis();
                        JSONArray optJSONArray2 = optJSONObject.optJSONArray("splash");
                        JSONArray optJSONArray3 = optJSONObject.optJSONArray("show_queue");
                        if (optJSONArray2 == null) {
                            optJSONArray2 = new JSONArray();
                        }
                        C19044j a = C19044j.m62231a();
                        JSONObject jSONObject3 = jSONObject2;
                        String k = C19062u.m62368a().mo50630k();
                        if (TextUtils.isEmpty(k)) {
                            jSONArray = new JSONArray();
                        } else {
                            try {
                                jSONArray = new JSONArray(k);
                            } catch (Exception e) {
                                e = e;
                                C18949a.m61865a().mo50361a(e, "key_exception_request");
                            }
                        }
                        C19008g a2 = C19129h.m62694a(jSONArray, optJSONArray2, currentTimeMillis3);
                        List b = C19129h.m62717b(optJSONArray3);
                        List<C19001b> a3 = C19129h.m62700a(a2.f51337c, b);
                        a2.f51336b = a3;
                        List<C19001b> list2 = a2.f51335a;
                        JSONArray b2 = C19129h.m62718b(list2);
                        JSONArray b3 = C19129h.m62718b(a3);
                        if (C19025f.m62094H() != null) {
                            list = b;
                            jSONArray2 = optJSONArray;
                            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                                Thread.sleep(2500);
                            }
                        } else {
                            list = b;
                            jSONArray2 = optJSONArray;
                        }
                        a.f51464e = optLong;
                        a.f51463d = optLong2;
                        a.f51462c = a2;
                        a.f51469j = optString;
                        a.f51467h = optBoolean;
                        a.f51468i = min;
                        if (!C19126e.m62680a(a3)) {
                            a2.f51339e = C19008g.m62068a(a3);
                        } else {
                            a2.f51339e = C19008g.m62068a(list2);
                        }
                        C19025f.m62188s();
                        C19062u.m62368a().mo50603a(optLong).mo50602a(optInt).mo50608b(optLong2).mo50609b(b2.toString()).mo50612c(b3.toString()).mo50605a(C19126e.m62680a(list2)).mo50627j(jSONArray2.toString()).mo50629k(optString).mo50613c(optBoolean).mo50628j();
                        C19025f.m62173j();
                        try {
                            m62347b(a2.f51338d);
                            jSONObject = jSONObject3;
                            jSONObject.put("durarion_ad_request_total_times", j2 - j);
                            m62350d(a2.f51338d);
                            m62352e(a2.f51338d);
                            m62345a(list);
                            C19046l.m62236a();
                            C19046l.m62237d();
                        } catch (Exception e2) {
                            e = e2;
                            C18949a.m61865a().mo50361a(e, "key_exception_request");
                        }
                    } else {
                        return;
                    }
                }
                C18949a.m61865a().mo50365b("service_ad_request_status", 0, jSONObject, null);
            } catch (Exception e3) {
                e = e3;
                C18949a.m61865a().mo50361a(e, "key_exception_request");
            }
        }
    }

    /* renamed from: d */
    private void m62349d(C19001b bVar) {
        if (!C19126e.m62680a(bVar.f51300l)) {
            for (C19001b bVar2 : bVar.f51300l) {
                if (bVar2 != null && bVar2.mo50476a()) {
                    m62342a(bVar2, 1);
                }
            }
        }
    }

    /* renamed from: c */
    private void m62348c(List<C19001b> list) {
        boolean z;
        m62354f();
        int d = C19128g.m62691d(C19025f.m62096J());
        if (d != 0) {
            for (final C19001b bVar : list) {
                if (bVar != null && bVar.mo50476a()) {
                    if ((bVar.f51312x & d) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z && C19025f.m62149c(bVar.mo50375n())) {
                        switch (bVar.mo50377r()) {
                            case 0:
                            case 1:
                            case 4:
                                C19025f.m62190u().execute(new Runnable() {
                                    public final void run() {
                                        Thread currentThread = Thread.currentThread();
                                        StringBuilder sb = new StringBuilder("SplashSDKDownloadThread_");
                                        sb.append(bVar.mo50375n());
                                        currentThread.setName(sb.toString());
                                        if (C19055s.this.mo50596c(bVar)) {
                                            C19062u.m62368a().mo50606a(bVar.f51287a);
                                        }
                                        C19055s.this.mo50592a(bVar);
                                        C19025f.m62152d(bVar.mo50375n());
                                    }
                                });
                                break;
                            case 2:
                            case 3:
                                C19025f.m62190u().execute(new Runnable() {
                                    public final void run() {
                                        Thread currentThread = Thread.currentThread();
                                        StringBuilder sb = new StringBuilder("SplashSDKDownloadThread_");
                                        sb.append(bVar.mo50375n());
                                        currentThread.setName(sb.toString());
                                        if (C19055s.this.mo50594b(bVar)) {
                                            C19062u.m62368a().mo50607a(bVar.f51302n);
                                        }
                                        if (bVar.mo50377r() == 3 && C19055s.this.mo50596c(bVar)) {
                                            C19062u.m62368a().mo50606a(bVar.f51287a);
                                        }
                                        C19025f.m62152d(bVar.mo50375n());
                                    }
                                });
                                break;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: d */
    private void m62350d(List<C19001b> list) {
        if (C19128g.m62689b(C19025f.m62096J()) && !C19126e.m62680a(list) && C19025f.m62192w() != null) {
            try {
                if (C19128g.m62691d(C19025f.m62096J()) != 0) {
                    for (C19001b bVar : list) {
                        if (bVar != null && bVar.mo50476a()) {
                            switch (bVar.mo50377r()) {
                                case 0:
                                case 1:
                                case 4:
                                    m62342a(bVar, 1);
                                    m62349d(bVar);
                                    break;
                                case 2:
                                case 3:
                                    m62342a(bVar, 2);
                                    break;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: e */
    private static void m62351e(C19001b bVar) {
        long j;
        String str = C19044j.m62231a().f51469j;
        long currentTimeMillis = System.currentTimeMillis();
        if (bVar != null) {
            long n = bVar.mo50375n();
            long j2 = n;
            str = bVar.mo50376p();
            currentTimeMillis = bVar.mo50374f();
            j = j2;
        } else {
            j = 84378473382L;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("log_extra", str);
            jSONObject.put("is_ad_event", 1);
            jSONObject.putOpt("ad_fetch_time", Long.valueOf(currentTimeMillis));
            C19025f.m62115a(j, "splash_ad", "launch_covered", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: f */
    private void m62355f(List<C19001b> list) {
        if (!C19126e.m62680a(list)) {
            for (C19001b bVar : list) {
                if (bVar.f51304p == 1 && bVar.mo50497y()) {
                    m62351e(bVar);
                    return;
                }
            }
        }
    }

    /* renamed from: e */
    private static void m62352e(List<C19001b> list) {
        if (C19128g.m62689b(C19025f.m62096J()) && !C19126e.m62680a(list) && C19025f.m62192w() != null && C19025f.m62193x() != null && C19025f.m62193x().mo50854a()) {
            for (C19001b bVar : list) {
                if (bVar != null && bVar.mo50476a() && bVar.f51313y != 0 && C19129h.m62693a(bVar.f51292d) == 5 && C19128g.m62689b(C19025f.m62096J())) {
                    if (bVar.f51313y == 1 || (bVar.f51313y == 2 && C19128g.m62690c(C19025f.m62096J()))) {
                        C19025f.m62192w().mo50862a(bVar.f51292d, "microgame".equals(Uri.parse(bVar.f51292d).getHost()));
                        new StringBuilder("preload micro app success:").append(false);
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:34:0x0091  */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00a7  */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo50596c(com.p280ss.android.p817ad.splash.core.p828c.C19001b r12) {
        /*
            r11 = this;
            boolean r0 = r12.mo50489l()
            r1 = 3
            if (r0 != 0) goto L_0x0015
            int r0 = r12.mo50377r()
            if (r0 == r1) goto L_0x0015
            com.p280ss.android.p817ad.splash.core.p827b.C18985b.m61973a()
            java.lang.String r0 = "splash_start_download"
            com.p280ss.android.p817ad.splash.core.p827b.C18985b.m61976a(r12, r0)
        L_0x0015:
            com.ss.android.ad.splash.core.c.e r0 = r12.f51287a
            r2 = 0
            if (r0 != 0) goto L_0x001b
            return r2
        L_0x001b:
            java.lang.String r3 = com.p280ss.android.p817ad.splash.p836g.C19129h.m62695a(r0)
            java.lang.String r4 = com.p280ss.android.p817ad.splash.p836g.C19129h.m62715b(r0)
            boolean r5 = com.p280ss.android.p817ad.splash.p836g.C19132j.m62736a(r3)
            if (r5 != 0) goto L_0x00ab
            boolean r5 = com.p280ss.android.p817ad.splash.p836g.C19132j.m62736a(r4)
            if (r5 == 0) goto L_0x0031
            goto L_0x00ab
        L_0x0031:
            com.ss.android.ad.splash.core.u r5 = com.p280ss.android.p817ad.splash.core.C19062u.m62368a()
            boolean r0 = com.p280ss.android.p817ad.splash.p836g.C19129h.m62710a(r0, r5)
            if (r0 == 0) goto L_0x0050
            boolean r0 = r12.mo50489l()
            if (r0 != 0) goto L_0x004f
            int r0 = r12.mo50377r()
            if (r0 == r1) goto L_0x004f
            com.p280ss.android.p817ad.splash.core.p827b.C18985b.m61973a()
            java.lang.String r0 = "splash_no_download"
            com.p280ss.android.p817ad.splash.core.p827b.C18985b.m61976a(r12, r0)
        L_0x004f:
            return r2
        L_0x0050:
            boolean r0 = r12.mo50489l()
            if (r0 == 0) goto L_0x0064
            int r0 = r12.mo50377r()
            if (r0 == r1) goto L_0x0064
            com.p280ss.android.p817ad.splash.core.p827b.C18985b.m61973a()
            java.lang.String r0 = "topview_start_download"
            com.p280ss.android.p817ad.splash.core.p827b.C18985b.m61976a(r12, r0)
        L_0x0064:
            com.ss.android.ad.splash.d r0 = new com.ss.android.ad.splash.d
            long r6 = r12.mo50375n()
            java.lang.String r8 = r12.mo50376p()
            r9 = 1
            com.ss.android.ad.splash.core.c.l r10 = r12.f51306r
            r5 = r0
            r5.<init>(r6, r8, r9, r10)
            long r5 = java.lang.System.currentTimeMillis()
            com.ss.android.ad.splash.s r1 = com.p280ss.android.p817ad.splash.core.C19025f.m62192w()
            if (r1 == 0) goto L_0x008d
            com.ss.android.ad.splash.s r1 = com.p280ss.android.p817ad.splash.core.C19025f.m62192w()     // Catch:{ Exception -> 0x0088 }
            boolean r0 = r1.mo50861a(r3, r4, r0)     // Catch:{ Exception -> 0x0088 }
            goto L_0x008e
        L_0x0088:
            java.lang.String r0 = "下载线程出错"
            com.p280ss.android.p817ad.splash.p836g.C19127f.m62684a(r0)
        L_0x008d:
            r0 = 0
        L_0x008e:
            r1 = 1
            if (r0 == 0) goto L_0x00a7
            long r7 = r12.mo50481e()
            m62344a(r4, r7)
            m62346b(r12, r2)
            m62341a(r2, r4)
            long r2 = java.lang.System.currentTimeMillis()
            long r2 = r2 - r5
            m62340a(r1, r2)
            goto L_0x00aa
        L_0x00a7:
            m62346b(r12, r1)
        L_0x00aa:
            return r0
        L_0x00ab:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.p817ad.splash.core.C19055s.mo50596c(com.ss.android.ad.splash.core.c.b):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:101:0x007a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0080 A[Catch:{ Throwable -> 0x00fe }] */
    /* JADX WARNING: Removed duplicated region for block: B:80:0x00f9  */
    /* JADX WARNING: Removed duplicated region for block: B:92:0x00ce A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x00fc A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:99:0x007a A[SYNTHETIC] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m62347b(java.util.List<com.p280ss.android.p817ad.splash.core.p828c.C19001b> r9) {
        /*
            r8 = this;
            android.content.Context r0 = com.p280ss.android.p817ad.splash.core.C19025f.m62096J()
            boolean r0 = com.p280ss.android.p817ad.splash.p836g.C19128g.m62689b(r0)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            boolean r0 = com.p280ss.android.p817ad.splash.p836g.C19126e.m62680a(r9)
            if (r0 == 0) goto L_0x0012
            return
        L_0x0012:
            com.ss.android.ad.splash.c.c r0 = com.p280ss.android.p817ad.splash.core.C19025f.m62094H()
            if (r0 == 0) goto L_0x004c
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r9.iterator()
        L_0x0021:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x0045
            java.lang.Object r2 = r1.next()
            com.ss.android.ad.splash.core.c.b r2 = (com.p280ss.android.p817ad.splash.core.p828c.C19001b) r2
            boolean r3 = r2.mo50489l()
            if (r3 == 0) goto L_0x0021
            java.lang.String r3 = r2.mo50380x()
            boolean r3 = com.p280ss.android.p817ad.splash.p836g.C19132j.m62736a(r3)
            if (r3 != 0) goto L_0x0021
            java.lang.String r2 = r2.mo50380x()
            r0.add(r2)
            goto L_0x0021
        L_0x0045:
            com.ss.android.ad.splash.c.c r1 = com.p280ss.android.p817ad.splash.core.C19025f.m62094H()
            r1.mo50382a(r0)
        L_0x004c:
            com.ss.android.ad.splash.core.j r0 = com.p280ss.android.p817ad.splash.core.C19044j.m62231a()
            int r0 = r0.f51468i
            if (r0 <= 0) goto L_0x0058
            r8.m62348c(r9)
            return
        L_0x0058:
            android.content.Context r0 = com.p280ss.android.p817ad.splash.core.C19025f.m62096J()     // Catch:{ Throwable -> 0x00fe }
            int r0 = com.p280ss.android.p817ad.splash.p836g.C19128g.m62691d(r0)     // Catch:{ Throwable -> 0x00fe }
            if (r0 != 0) goto L_0x0063
            return
        L_0x0063:
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0069
            r3 = 1
            goto L_0x006a
        L_0x0069:
            r3 = 0
        L_0x006a:
            if (r3 != 0) goto L_0x0075
            boolean r3 = com.p280ss.android.p817ad.splash.p836g.C19129h.m62725g()     // Catch:{ Throwable -> 0x00fe }
            if (r3 == 0) goto L_0x0073
            goto L_0x0075
        L_0x0073:
            r3 = 0
            goto L_0x0076
        L_0x0075:
            r3 = 1
        L_0x0076:
            java.util.Iterator r9 = r9.iterator()     // Catch:{ Throwable -> 0x00fe }
        L_0x007a:
            boolean r4 = r9.hasNext()     // Catch:{ Throwable -> 0x00fe }
            if (r4 == 0) goto L_0x00fd
            java.lang.Object r4 = r9.next()     // Catch:{ Throwable -> 0x00fe }
            com.ss.android.ad.splash.core.c.b r4 = (com.p280ss.android.p817ad.splash.core.p828c.C19001b) r4     // Catch:{ Throwable -> 0x00fe }
            if (r4 == 0) goto L_0x007a
            boolean r5 = r4.mo50476a()     // Catch:{ Throwable -> 0x00fe }
            if (r5 == 0) goto L_0x007a
            int r5 = r4.mo50377r()     // Catch:{ Throwable -> 0x00fe }
            switch(r5) {
                case 0: goto L_0x00cf;
                case 1: goto L_0x00cf;
                case 2: goto L_0x0096;
                case 3: goto L_0x0096;
                case 4: goto L_0x00cf;
                default: goto L_0x0095;
            }     // Catch:{ Throwable -> 0x00fe }
        L_0x0095:
            goto L_0x007a
        L_0x0096:
            int r5 = r4.f51312x     // Catch:{ Throwable -> 0x00fe }
            r5 = r5 & r0
            if (r5 == 0) goto L_0x009d
            r5 = 1
            goto L_0x009e
        L_0x009d:
            r5 = 0
        L_0x009e:
            if (r3 != 0) goto L_0x00a2
            if (r5 == 0) goto L_0x007a
        L_0x00a2:
            boolean r5 = r8.mo50594b(r4)     // Catch:{ Throwable -> 0x00fe }
            if (r5 == 0) goto L_0x00b5
            com.ss.android.ad.splash.core.u r5 = com.p280ss.android.p817ad.splash.core.C19062u.m62368a()     // Catch:{ Throwable -> 0x00fe }
            com.ss.android.ad.splash.core.c.k r6 = r4.f51302n     // Catch:{ Throwable -> 0x00fe }
            r5.mo50607a(r6)     // Catch:{ Throwable -> 0x00fe }
            if (r3 != 0) goto L_0x00b5
            r5 = 1
            goto L_0x00b6
        L_0x00b5:
            r5 = 0
        L_0x00b6:
            int r6 = r4.mo50377r()     // Catch:{ Throwable -> 0x00fe }
            r7 = 3
            if (r6 != r7) goto L_0x00cc
            boolean r6 = r8.mo50596c(r4)     // Catch:{ Throwable -> 0x00fe }
            if (r6 == 0) goto L_0x00cc
            com.ss.android.ad.splash.core.u r6 = com.p280ss.android.p817ad.splash.core.C19062u.m62368a()     // Catch:{ Throwable -> 0x00fe }
            com.ss.android.ad.splash.core.c.e r4 = r4.f51287a     // Catch:{ Throwable -> 0x00fe }
            r6.mo50606a(r4)     // Catch:{ Throwable -> 0x00fe }
        L_0x00cc:
            if (r5 == 0) goto L_0x007a
            return
        L_0x00cf:
            int r5 = r4.f51312x     // Catch:{ Throwable -> 0x00fe }
            r5 = r5 & r0
            if (r5 == 0) goto L_0x00d6
            r5 = 1
            goto L_0x00d7
        L_0x00d6:
            r5 = 0
        L_0x00d7:
            int r6 = r4.f51297i     // Catch:{ Throwable -> 0x00fe }
            if (r6 != r2) goto L_0x00df
            if (r3 != 0) goto L_0x00df
            if (r5 == 0) goto L_0x007a
        L_0x00df:
            boolean r5 = r8.mo50596c(r4)     // Catch:{ Throwable -> 0x00fe }
            if (r5 == 0) goto L_0x00f2
            com.ss.android.ad.splash.core.u r5 = com.p280ss.android.p817ad.splash.core.C19062u.m62368a()     // Catch:{ Throwable -> 0x00fe }
            com.ss.android.ad.splash.core.c.e r6 = r4.f51287a     // Catch:{ Throwable -> 0x00fe }
            r5.mo50606a(r6)     // Catch:{ Throwable -> 0x00fe }
            if (r3 != 0) goto L_0x00f2
            r5 = 1
            goto L_0x00f3
        L_0x00f2:
            r5 = 0
        L_0x00f3:
            boolean r4 = r8.mo50592a(r4)     // Catch:{ Throwable -> 0x00fe }
            if (r3 != 0) goto L_0x00fa
            r5 = r5 | r4
        L_0x00fa:
            if (r5 == 0) goto L_0x007a
            return
        L_0x00fd:
            return
        L_0x00fe:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.p817ad.splash.core.C19055s.m62347b(java.util.List):void");
    }

    /* renamed from: b */
    public final boolean mo50594b(C19001b bVar) {
        if (!bVar.mo50489l()) {
            C18985b.m61973a();
            C18985b.m61976a(bVar, "splash_start_download");
        }
        C19012k kVar = bVar.f51302n;
        boolean z = false;
        if (kVar == null || !bVar.mo50476a()) {
            return false;
        }
        String a = C19129h.m62696a(kVar);
        String b = C19129h.m62716b(kVar);
        if (C19132j.m62736a(a) || C19132j.m62736a(b)) {
            return false;
        }
        if (C19129h.m62711a(kVar, C19062u.m62368a())) {
            if (!bVar.mo50489l()) {
                C18985b.m61973a();
                C18985b.m61976a(bVar, "splash_no_download");
            }
            return false;
        }
        if (bVar.mo50489l()) {
            C18985b.m61973a();
            C18985b.m61976a(bVar, "topview_start_download");
        }
        C19109d dVar = new C19109d(bVar.mo50375n(), bVar.mo50376p(), 2, bVar.f51306r);
        long currentTimeMillis = System.currentTimeMillis();
        if (C19025f.m62192w() != null) {
            try {
                z = C19025f.m62192w().mo50861a(a, b, dVar);
            } catch (Exception unused) {
                C19127f.m62684a("下载线程出错");
            }
        }
        if (z) {
            m62344a(b, bVar.mo50481e());
            m62346b(bVar, 16);
            m62341a(1, b);
            m62340a(2, System.currentTimeMillis() - currentTimeMillis);
        } else {
            m62346b(bVar, 17);
        }
        return z;
    }

    /* renamed from: a */
    private static void m62345a(List<C19010i> list) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            if (!C19126e.m62680a(list)) {
                for (C19010i B : list) {
                    String B2 = B.mo50470B();
                    if (!C19132j.m62736a(B2)) {
                        jSONArray.put(B2);
                    }
                }
            }
            jSONObject2.put("splash_receive_key", jSONArray);
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("log_extra", C19044j.m62231a().f51469j);
            C19025f.m62115a(84378473382L, "splash_ad", "splash_receive", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m62340a(int i, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("duration", Long.valueOf(j));
            jSONObject.putOpt("res_type", Integer.valueOf(i));
            C18949a.m61865a().mo50365b("service_ad_res_download_time", 0, jSONObject, null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m62341a(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("key_ad_file_size", Long.valueOf(C19124c.m62674a(str)));
            C18949a.m61865a().mo50365b("sevice_ad_file_size", i, jSONObject, null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m62342a(C19001b bVar, int i) {
        new C19109d(bVar.mo50375n(), bVar.mo50376p(), i, bVar.f51306r);
    }

    /* renamed from: b */
    private static void m62346b(C19001b bVar, int i) {
        JSONObject jSONObject = new JSONObject();
        String str = "";
        String str2 = "";
        try {
            JSONObject jSONObject2 = new JSONObject();
            switch (i) {
                case 0:
                    str = C19129h.m62695a(bVar.f51287a);
                    str2 = "download_image_succeed";
                    jSONObject2.putOpt("image_mode", Integer.valueOf(bVar.f51297i));
                    break;
                case 1:
                    str = C19129h.m62695a(bVar.f51287a);
                    str2 = "download_image_failed";
                    jSONObject2.putOpt("image_mode", Integer.valueOf(bVar.f51297i));
                    break;
                case 16:
                    str = C19129h.m62696a(bVar.f51302n);
                    str2 = "download_video_succeed";
                    break;
                case 17:
                    str = C19129h.m62696a(bVar.f51302n);
                    str2 = "download_video_failed";
                    break;
            }
            jSONObject.putOpt("log_extra", bVar.mo50376p());
            jSONObject.putOpt("is_ad_event", "1");
            jSONObject.putOpt("ad_fetch_time", Long.valueOf(bVar.mo50374f()));
            jSONObject2.putOpt("url", str);
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            C19025f.m62115a(bVar.mo50375n(), "splash_ad", str2, jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m62343a(C19001b bVar, C19001b bVar2) {
        if (bVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("log_extra", bVar.mo50376p()).putOpt("is_ad_event", "1");
                jSONObject.putOpt("ad_fetch_time", Long.valueOf(bVar.mo50374f()));
                if (bVar2 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("boarding_to", Long.valueOf(bVar2.mo50375n()));
                    jSONObject.putOpt("ad_extra_data", jSONObject2);
                }
                C19025f.m62115a(bVar.mo50375n(), "splash_ad", "boarding", jSONObject);
            } catch (Exception unused) {
                return;
            }
        }
        if (bVar2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putOpt("log_extra", bVar2.mo50376p()).putOpt("is_ad_event", "1");
            jSONObject3.putOpt("ad_fetch_time", Long.valueOf(bVar2.mo50374f()));
            if (bVar != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.putOpt("covered_by", Long.valueOf(bVar.mo50375n()));
                jSONObject3.putOpt("ad_extra_data", jSONObject4);
            }
            C19025f.m62115a(bVar2.mo50375n(), "splash_ad", "covered", jSONObject3);
        }
    }

    /* renamed from: a */
    private static void m62344a(String str, long j) {
        JSONArray jSONArray;
        try {
            if (!C19132j.m62736a(str)) {
                if (j > 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putOpt("local_url", str).putOpt("local_data_expire_time", Long.valueOf(j));
                    String i = C19062u.m62368a().mo50626i();
                    if (C19132j.m62736a(i)) {
                        jSONArray = new JSONArray();
                    } else {
                        jSONArray = new JSONArray(i);
                    }
                    jSONArray.put(jSONObject);
                    C19062u.m62368a().mo50625i(jSONArray.toString()).mo50628j();
                }
            }
        } catch (Exception unused) {
        }
    }
}
