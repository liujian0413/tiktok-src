package com.p280ss.android.p817ad.splash.core;

import android.content.Context;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.p280ss.android.p817ad.splash.C18948b;
import com.p280ss.android.p817ad.splash.C18957c;
import com.p280ss.android.p817ad.splash.C19119f;
import com.p280ss.android.p817ad.splash.C19150l;
import com.p280ss.android.p817ad.splash.C19153o;
import com.p280ss.android.p817ad.splash.C19154p;
import com.p280ss.android.p817ad.splash.C19158s;
import com.p280ss.android.p817ad.splash.core.p828c.C19001b;
import com.p280ss.android.p817ad.splash.core.p831f.C19030a;
import com.p280ss.android.p817ad.splash.core.p831f.C19032c;
import com.p280ss.android.p817ad.splash.core.p831f.C19038f;
import com.p280ss.android.p817ad.splash.p823a.C18946a;
import com.p280ss.android.p817ad.splash.p823a.C18946a.C18947a;
import com.p280ss.android.p817ad.splash.p825c.C18960c;
import com.p280ss.android.p817ad.splash.p833d.C19114d;
import com.p280ss.android.p817ad.splash.p836g.C19132j;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.f */
public class C19025f {

    /* renamed from: A */
    private static int f51370A = 0;

    /* renamed from: B */
    private static int f51371B = 0;

    /* renamed from: C */
    private static boolean f51372C = true;

    /* renamed from: D */
    private static volatile boolean f51373D = false;

    /* renamed from: E */
    private static volatile boolean f51374E = false;

    /* renamed from: F */
    private static volatile String f51375F = null;

    /* renamed from: G */
    private static volatile long f51376G = 864000000;

    /* renamed from: H */
    private static volatile boolean f51377H = true;

    /* renamed from: I */
    private static C19150l f51378I = null;

    /* renamed from: J */
    private static int f51379J = 0;

    /* renamed from: K */
    private static int f51380K = 0;

    /* renamed from: L */
    private static int f51381L = 0;

    /* renamed from: M */
    private static boolean f51382M = false;

    /* renamed from: N */
    private static boolean f51383N = false;

    /* renamed from: O */
    private static volatile C19114d f51384O = null;

    /* renamed from: P */
    private static int f51385P = 0;

    /* renamed from: Q */
    private static boolean f51386Q = true;

    /* renamed from: R */
    private static boolean f51387R = false;

    /* renamed from: S */
    private static C18960c f51388S = null;

    /* renamed from: T */
    private static boolean f51389T = false;

    /* renamed from: U */
    private static volatile Future f51390U = null;

    /* renamed from: V */
    private static int f51391V = -1;

    /* renamed from: W */
    private static boolean f51392W = true;

    /* renamed from: X */
    private static boolean f51393X = false;

    /* renamed from: Y */
    private static boolean f51394Y = false;

    /* renamed from: Z */
    private static long f51395Z = 2000;

    /* renamed from: a */
    public static C19119f f51396a = null;

    /* renamed from: aa */
    private static long f51397aa = 2000;

    /* renamed from: ab */
    private static boolean f51398ab = false;

    /* renamed from: ac */
    private static boolean f51399ac = true;

    /* renamed from: ad */
    private static boolean f51400ad = false;

    /* renamed from: ae */
    private static boolean f51401ae = false;

    /* renamed from: af */
    private static C18957c f51402af = null;

    /* renamed from: b */
    private static final String f51403b = "19165";

    /* renamed from: c */
    private static volatile C19158s f51404c;

    /* renamed from: d */
    private static C19153o f51405d;

    /* renamed from: e */
    private static C19154p f51406e;

    /* renamed from: f */
    private static ExecutorService f51407f;

    /* renamed from: g */
    private static ExecutorService f51408g;

    /* renamed from: h */
    private static ExecutorService f51409h;

    /* renamed from: i */
    private static ExecutorService f51410i;

    /* renamed from: j */
    private static long f51411j;

    /* renamed from: k */
    private static boolean f51412k;

    /* renamed from: l */
    private static ConcurrentHashMap<Long, Integer> f51413l;

    /* renamed from: m */
    private static volatile boolean f51414m;

    /* renamed from: n */
    private static long f51415n;

    /* renamed from: o */
    private static C18948b f51416o;

    /* renamed from: p */
    private static HashMap<String, String> f51417p;

    /* renamed from: q */
    private static Context f51418q;

    /* renamed from: r */
    private static boolean f51419r;

    /* renamed from: s */
    private static C19030a f51420s;

    /* renamed from: t */
    private static Handler f51421t = new Handler(Looper.getMainLooper());

    /* renamed from: u */
    private static int f51422u;

    /* renamed from: v */
    private static int f51423v;

    /* renamed from: w */
    private static int f51424w;

    /* renamed from: x */
    private static int f51425x;

    /* renamed from: y */
    private static int f51426y;

    /* renamed from: z */
    private static int f51427z;

    /* renamed from: A */
    public static long m62087A() {
        return f51411j;
    }

    /* renamed from: B */
    public static boolean m62088B() {
        return f51412k;
    }

    /* renamed from: C */
    public static ExecutorService m62089C() {
        return f51409h;
    }

    /* renamed from: D */
    public static ExecutorService m62090D() {
        return f51410i;
    }

    /* renamed from: F */
    public static long m62092F() {
        return f51376G;
    }

    /* renamed from: H */
    public static C18960c m62094H() {
        return f51388S;
    }

    /* renamed from: I */
    public static HashMap<String, String> m62095I() {
        return f51417p;
    }

    /* renamed from: J */
    public static Context m62096J() {
        return f51418q;
    }

    /* renamed from: K */
    public static C19150l m62097K() {
        return f51378I;
    }

    /* renamed from: L */
    public static int m62098L() {
        return f51379J;
    }

    /* renamed from: M */
    public static boolean m62099M() {
        return f51382M;
    }

    /* renamed from: N */
    public static C19114d m62100N() {
        return f51384O;
    }

    /* renamed from: O */
    public static String m62101O() {
        return "1385";
    }

    /* renamed from: P */
    public static String m62102P() {
        return f51403b;
    }

    /* renamed from: Q */
    public static String m62103Q() {
        return "1.9.16.5-bugfix";
    }

    /* renamed from: R */
    public static int m62104R() {
        return f51380K;
    }

    /* renamed from: S */
    public static int m62105S() {
        return f51381L;
    }

    /* renamed from: U */
    public static int m62107U() {
        return f51385P;
    }

    /* renamed from: V */
    public static boolean m62108V() {
        return f51386Q;
    }

    /* renamed from: W */
    public static int m62109W() {
        return f51391V;
    }

    /* renamed from: X */
    public static boolean m62110X() {
        return f51392W;
    }

    /* renamed from: Y */
    public static boolean m62111Y() {
        return f51393X;
    }

    /* renamed from: Z */
    public static boolean m62112Z() {
        return f51394Y;
    }

    /* renamed from: aa */
    public static boolean m62132aa() {
        return f51389T;
    }

    /* renamed from: ab */
    public static long m62133ab() {
        return f51395Z;
    }

    /* renamed from: ac */
    public static long m62134ac() {
        return f51397aa;
    }

    /* renamed from: ad */
    public static boolean m62135ad() {
        return f51398ab;
    }

    /* renamed from: ae */
    public static boolean m62136ae() {
        return f51399ac;
    }

    /* renamed from: af */
    public static boolean m62137af() {
        return f51400ad;
    }

    /* renamed from: ag */
    public static boolean m62138ag() {
        return f51401ae;
    }

    /* renamed from: ah */
    public static C18957c m62139ah() {
        return f51402af;
    }

    /* renamed from: d */
    public static long m62150d() {
        return f51415n;
    }

    /* renamed from: h */
    public static int m62167h() {
        return f51370A;
    }

    /* renamed from: j */
    public static void m62173j() {
        f51374E = true;
    }

    /* renamed from: k */
    public static int m62175k() {
        return f51426y;
    }

    /* renamed from: l */
    public static int m62177l() {
        return f51423v;
    }

    /* renamed from: m */
    public static int m62179m() {
        return f51424w;
    }

    /* renamed from: n */
    public static int m62181n() {
        return f51425x;
    }

    /* renamed from: o */
    public static int m62183o() {
        return f51371B;
    }

    /* renamed from: p */
    public static int m62185p() {
        return f51422u;
    }

    /* renamed from: q */
    public static int m62186q() {
        return f51427z;
    }

    /* renamed from: r */
    public static boolean m62187r() {
        return f51373D;
    }

    /* renamed from: s */
    public static void m62188s() {
        f51373D = true;
    }

    /* renamed from: t */
    public static ExecutorService m62189t() {
        return f51407f;
    }

    /* renamed from: u */
    public static ExecutorService m62190u() {
        return f51408g;
    }

    /* renamed from: v */
    public static ConcurrentHashMap<Long, Integer> m62191v() {
        return f51413l;
    }

    /* renamed from: w */
    public static C19158s m62192w() {
        return f51404c;
    }

    /* renamed from: x */
    public static C19153o m62193x() {
        return f51405d;
    }

    /* renamed from: y */
    public static C19154p m62194y() {
        return f51406e;
    }

    /* renamed from: z */
    public static C19119f m62195z() {
        return f51396a;
    }

    /* renamed from: a */
    public static void m62130a(boolean z) {
        f51377H = z;
    }

    /* renamed from: a */
    public static boolean m62131a() {
        return f51377H;
    }

    /* renamed from: a */
    public static void m62123a(C19154p pVar) {
        f51406e = pVar;
    }

    /* renamed from: a */
    public static void m62128a(ExecutorService executorService) {
        f51407f = executorService;
    }

    /* renamed from: a */
    public static void m62127a(ConcurrentHashMap<Long, Integer> concurrentHashMap) {
        f51413l = concurrentHashMap;
    }

    /* renamed from: a */
    public static void m62124a(C19158s sVar) {
        f51404c = sVar;
    }

    /* renamed from: a */
    public static void m62125a(String str) {
        f51375F = str;
    }

    /* renamed from: a */
    public static void m62126a(HashMap<String, String> hashMap) {
        f51417p = hashMap;
    }

    /* renamed from: a */
    public static void m62129a(Future future) {
        f51390U = null;
    }

    /* renamed from: f */
    public static C18948b m62159f() {
        if (f51416o == null) {
            f51416o = new C18948b();
        }
        return f51416o;
    }

    /* renamed from: i */
    public static boolean m62172i() {
        return f51374E;
    }

    /* renamed from: T */
    public static String m62106T() {
        String str = "";
        if (f51416o != null) {
            str = f51416o.mo50358c();
        }
        if (TextUtils.isEmpty(str)) {
            return C19062u.m62368a().mo50634o();
        }
        return str;
    }

    /* renamed from: c */
    public static boolean m62148c() {
        return f51372C;
    }

    /* renamed from: e */
    public static boolean m62158e() {
        return f51419r;
    }

    /* renamed from: g */
    public static void m62163g() {
        String str = "";
        if (f51416o != null) {
            str = m62159f().mo50358c();
        }
        if (!C19132j.m62736a(str)) {
            C19062u.m62368a().mo50616d(str).mo50628j();
        }
    }

    /* renamed from: E */
    public static String m62091E() {
        try {
            if (C19132j.m62736a(f51375F)) {
                StringBuilder sb = new StringBuilder();
                sb.append(Environment.getExternalStorageDirectory().getPath());
                sb.append("/Android/data/");
                sb.append(m62096J().getPackageName());
                sb.append("/splashCache/");
                return sb.toString();
            }
        } catch (Exception unused) {
        }
        return f51375F;
    }

    /* renamed from: G */
    public static C19030a m62093G() {
        if (f51420s == null) {
            synchronized (C19025f.class) {
                if (f51420s == null) {
                    f51420s = new C19032c(f51418q, new C19038f(f51418q));
                }
            }
        }
        return f51420s;
    }

    /* renamed from: b */
    public static boolean m62144b() {
        return f51414m;
    }

    /* renamed from: a */
    public static void m62113a(int i) {
        f51426y = i;
    }

    /* renamed from: b */
    public static void m62140b(int i) {
        f51423v = i;
    }

    /* renamed from: c */
    public static void m62145c(int i) {
        f51425x = i;
    }

    /* renamed from: e */
    public static void m62155e(int i) {
        f51422u = i;
    }

    /* renamed from: f */
    public static void m62160f(int i) {
        f51427z = i;
    }

    /* renamed from: g */
    public static void m62164g(int i) {
        f51380K = i;
    }

    /* renamed from: i */
    public static void m62170i(int i) {
        f51391V = -1;
    }

    /* renamed from: a */
    public static void m62114a(long j) {
        f51411j = j;
        f51414m = false;
    }

    /* renamed from: b */
    public static void m62141b(long j) {
        f51415n = j;
        f51414m = true;
    }

    /* renamed from: c */
    public static void m62146c(ExecutorService executorService) {
        f51409h = executorService;
    }

    /* renamed from: d */
    public static void m62151d(int i) {
        f51371B = i;
    }

    /* renamed from: e */
    public static void m62156e(long j) {
        f51376G = j;
    }

    /* renamed from: f */
    public static void m62161f(long j) {
        f51395Z = j;
    }

    /* renamed from: g */
    public static void m62165g(long j) {
        f51397aa = j;
    }

    /* renamed from: h */
    public static void m62168h(int i) {
        f51381L = i;
    }

    /* renamed from: i */
    public static void m62171i(boolean z) {
        f51393X = z;
    }

    /* renamed from: j */
    public static void m62174j(boolean z) {
        f51394Y = z;
    }

    /* renamed from: k */
    public static void m62176k(boolean z) {
        f51389T = z;
    }

    /* renamed from: l */
    public static void m62178l(boolean z) {
        f51398ab = z;
    }

    /* renamed from: m */
    public static void m62180m(boolean z) {
        f51399ac = z;
    }

    /* renamed from: n */
    public static void m62182n(boolean z) {
        f51400ad = z;
    }

    /* renamed from: o */
    public static void m62184o(boolean z) {
        f51401ae = z;
    }

    /* renamed from: a */
    public static void m62116a(Context context) {
        f51418q = context.getApplicationContext();
    }

    /* renamed from: b */
    public static void m62142b(ExecutorService executorService) {
        f51408g = executorService;
    }

    /* renamed from: c */
    public static void m62147c(boolean z) {
        f51372C = z;
    }

    /* renamed from: d */
    public static void m62152d(long j) {
        f51413l.remove(Long.valueOf(j));
    }

    /* renamed from: e */
    public static void m62157e(boolean z) {
        f51382M = z;
    }

    /* renamed from: g */
    public static void m62166g(boolean z) {
        new StringBuilder("UDPClient. setIsFirstTimeRequestAd: ").append(false);
        f51386Q = false;
    }

    /* renamed from: h */
    public static void m62169h(boolean z) {
        f51392W = z;
    }

    /* renamed from: a */
    public static void m62117a(C18960c cVar) {
        f51388S = cVar;
    }

    /* renamed from: b */
    public static void m62143b(boolean z) {
        f51412k = z;
    }

    /* renamed from: d */
    public static void m62153d(ExecutorService executorService) {
        f51410i = executorService;
    }

    /* renamed from: f */
    public static void m62162f(boolean z) {
        f51383N = z;
    }

    /* renamed from: c */
    public static boolean m62149c(long j) {
        if (f51413l.containsKey(Long.valueOf(j))) {
            return false;
        }
        f51413l.put(Long.valueOf(j), Integer.valueOf(0));
        return true;
    }

    /* renamed from: d */
    public static void m62154d(boolean z) {
        f51419r = z;
    }

    /* renamed from: a */
    public static void m62118a(C18957c cVar) {
        if (f51416o == null) {
            f51416o = new C18948b();
        }
        f51402af = cVar;
    }

    /* renamed from: a */
    public static void m62120a(C19114d dVar) {
        f51384O = dVar;
    }

    /* renamed from: a */
    public static void m62121a(C19119f fVar) {
        f51396a = fVar;
    }

    /* renamed from: a */
    public static void m62122a(C19153o oVar) {
        f51405d = oVar;
    }

    /* renamed from: a */
    public static void m62115a(long j, String str, String str2, JSONObject jSONObject) {
        if (f51387R) {
            final C18946a a = new C18947a().mo50351a(jSONObject).mo50349a(j).mo50354c(str2).mo50353b(str).mo50350a("umeng").mo50352a();
            f51421t.post(new Runnable() {
                public final void run() {
                    if (C19025f.f51396a != null) {
                        C19025f.f51396a.mo50827a(a);
                    }
                }
            });
            return;
        }
        Handler handler = f51421t;
        final String str3 = str;
        final String str4 = str2;
        final long j2 = j;
        final JSONObject jSONObject2 = jSONObject;
        C190294 r1 = new Runnable() {
            public final void run() {
                if (C19025f.f51396a != null) {
                    C19025f.f51396a.mo50828a(str3, str4, j2, 0, jSONObject2);
                }
            }
        };
        handler.post(r1);
    }

    /* renamed from: a */
    public static void m62119a(C19001b bVar, String str, String str2, Map<String, Object> map) {
        if (bVar != null) {
            final long n = bVar.mo50375n();
            String p = bVar.mo50376p();
            long f = bVar.mo50374f();
            if (f51387R) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.putOpt("is_ad_event", "1");
                    jSONObject.putOpt("ad_fetch_time", Long.valueOf(f));
                    if (!map.isEmpty()) {
                        JSONObject jSONObject2 = new JSONObject();
                        for (Entry entry : map.entrySet()) {
                            if (entry != null) {
                                jSONObject2.putOpt((String) entry.getKey(), entry.getValue());
                            }
                        }
                        jSONObject.putOpt("ad_extra_data", jSONObject2);
                    }
                } catch (Exception unused) {
                }
                final C18946a a = new C18947a().mo50353b(str).mo50350a("umeng").mo50355d(p).mo50354c(str2).mo50349a(n).mo50351a(jSONObject).mo50352a();
                f51421t.post(new Runnable() {
                    public final void run() {
                        if (C19025f.f51396a != null) {
                            C19025f.f51396a.mo50827a(a);
                        }
                    }
                });
                return;
            }
            final JSONObject jSONObject3 = new JSONObject();
            try {
                jSONObject3.putOpt("log_extra", p);
                jSONObject3.putOpt("is_ad_event", "1");
                jSONObject3.putOpt("ad_fetch_time", Long.valueOf(f));
                if (!map.isEmpty()) {
                    JSONObject jSONObject4 = new JSONObject();
                    for (Entry entry2 : map.entrySet()) {
                        if (entry2 != null) {
                            jSONObject4.putOpt((String) entry2.getKey(), entry2.getValue());
                        }
                    }
                    jSONObject3.putOpt("ad_extra_data", jSONObject4);
                }
            } catch (Exception unused2) {
            }
            Handler handler = f51421t;
            final String str3 = str;
            final String str4 = str2;
            C190272 r0 = new Runnable() {
                public final void run() {
                    if (C19025f.f51396a != null) {
                        C19025f.f51396a.mo50828a(str3, str4, n, 0, jSONObject3);
                    }
                }
            };
            handler.post(r0);
        }
    }
}
