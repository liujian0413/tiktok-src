package com.bytedance.frameworks.baselib.network.http;

import android.util.Pair;
import android.webkit.CookieManager;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.connectionclass.C10087c;
import com.bytedance.frameworks.baselib.network.connectionclass.ConnectionQuality;
import com.bytedance.frameworks.baselib.network.http.impl.C10156a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import java.net.InetAddress;
import java.net.URI;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.frameworks.baselib.network.http.f */
public class C10142f {

    /* renamed from: a */
    private static C10151i f27644a;

    /* renamed from: b */
    private static List<C10152j> f27645b = new LinkedList();

    /* renamed from: c */
    private static C10149g f27646c;

    /* renamed from: d */
    private static C10147e f27647d;

    /* renamed from: e */
    private static boolean f27648e = true;

    /* renamed from: f */
    private static String f27649f = null;

    /* renamed from: g */
    private static C10148f f27650g;

    /* renamed from: h */
    private static C10144b f27651h;

    /* renamed from: i */
    private static C10153k f27652i;

    /* renamed from: j */
    private static volatile AtomicBoolean f27653j = new AtomicBoolean(false);

    /* renamed from: k */
    private static final Object f27654k = new Object();

    /* renamed from: l */
    private static CountDownLatch f27655l = new CountDownLatch(1);

    /* renamed from: m */
    private static volatile int f27656m = -1;

    /* renamed from: n */
    private static C10145c f27657n;

    /* renamed from: o */
    private static C10150h f27658o;

    /* renamed from: p */
    private static C10146d f27659p;

    /* renamed from: q */
    private static C10143a f27660q;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.f$a */
    public interface C10143a {
        /* renamed from: a */
        Map<String, String> mo24803a(String str, Map<String, List<String>> map);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.f$b */
    public interface C10144b<T extends C10104a> {
        /* renamed from: a */
        String mo24804a(String str, boolean z);

        /* renamed from: a */
        String mo24805a(String str, boolean z, Object... objArr);

        /* renamed from: a */
        void mo24806a();
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.f$c */
    public interface C10145c<T extends C10122c> {
        /* renamed from: a */
        String mo24807a(String str, T t);

        /* renamed from: a */
        List<InetAddress> mo24808a(String str);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.f$d */
    public interface C10146d {
        /* renamed from: a */
        Map<String, List<String>> mo24809a(URI uri, Map<String, List<String>> map);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.f$e */
    public interface C10147e {
        /* renamed from: b */
        boolean mo24810b(String str);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.f$f */
    public interface C10148f {
        /* renamed from: a */
        String mo24811a();
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.f$g */
    public interface C10149g {
        /* renamed from: c */
        boolean mo24812c(String str);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.f$h */
    public interface C10150h {
        /* renamed from: a */
        List<String> mo24813a(CookieManager cookieManager, C10156a aVar, URI uri);

        /* renamed from: d */
        List<String> mo24814d(String str);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.f$i */
    public interface C10151i {
        /* renamed from: a */
        Pair<Boolean, String> mo24815a(String str);

        /* renamed from: a */
        Pair<Boolean, byte[]> mo24816a(byte[] bArr);

        /* renamed from: a */
        Map<String, ?> mo24817a();

        /* renamed from: a */
        boolean mo24818a(URI uri);

        /* renamed from: b */
        Pair<Boolean, byte[]> mo24819b(byte[] bArr);

        /* renamed from: b */
        void mo24820b();
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.f$j */
    public interface C10152j {
        /* renamed from: a */
        void mo24788a(Map<String, ?> map);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.f$k */
    public interface C10153k<T extends C10104a> {
        /* renamed from: a */
        void mo24821a(long j, long j2, String str, String str2, T t);

        /* renamed from: a */
        void mo24822a(long j, long j2, String str, String str2, T t, Throwable th);
    }

    /* renamed from: a */
    public static C10151i m30094a() {
        return f27644a;
    }

    /* renamed from: a */
    public static Map m30099a(String str, Map map) {
        return C10154g.m30153a(str, map);
    }

    /* renamed from: b */
    public static List<C10152j> m30116b() {
        return f27645b;
    }

    /* renamed from: b */
    public static void m30118b(boolean z) {
        C10154g.m30154a(z);
    }

    /* renamed from: c */
    public static C10149g m30119c() {
        return f27646c;
    }

    /* renamed from: d */
    public static C10147e m30121d() {
        return f27647d;
    }

    /* renamed from: g */
    public static String m30124g() {
        return f27649f;
    }

    /* renamed from: h */
    public static C10148f m30125h() {
        return f27650g;
    }

    /* renamed from: k */
    public static C10145c m30128k() {
        return f27657n;
    }

    /* renamed from: l */
    public static C10150h m30129l() {
        return f27658o;
    }

    /* renamed from: m */
    public static C10146d m30130m() {
        return f27659p;
    }

    /* renamed from: a */
    public static void m30110a(C10151i iVar) {
        f27644a = iVar;
    }

    /* renamed from: a */
    public static void m30111a(C10152j jVar) {
        f27645b.add(jVar);
    }

    /* renamed from: a */
    public static void m30108a(C10149g gVar) {
        f27646c = gVar;
    }

    /* renamed from: a */
    public static void m30106a(C10147e eVar) {
        f27647d = eVar;
    }

    /* renamed from: a */
    public static void m30115a(boolean z) {
        f27648e = z;
    }

    /* renamed from: a */
    public static void m30107a(C10148f fVar) {
        f27650g = fVar;
    }

    /* renamed from: a */
    public static void m30104a(C10144b bVar) {
        f27651h = bVar;
    }

    /* renamed from: a */
    public static void m30112a(C10153k kVar) {
        f27652i = kVar;
    }

    /* renamed from: a */
    public static void m30114a(String str, Throwable th, long j, C10104a aVar) {
        if (!C6319n.m19593a(str) && th != null) {
        }
    }

    /* renamed from: a */
    public static void m30113a(String str, long j, C10104a aVar) {
        C6319n.m19593a(str);
    }

    /* renamed from: a */
    public static void m30105a(C10145c cVar) {
        f27657n = cVar;
    }

    /* renamed from: a */
    public static void m30109a(C10150h hVar) {
        f27658o = hVar;
    }

    /* renamed from: j */
    public static boolean m30127j() {
        if (f27656m != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    private static void m30131n() {
        if (f27655l != null && f27655l.getCount() > 0) {
            f27655l.countDown();
        }
    }

    /* renamed from: e */
    public static int m30122e() {
        if (!f27648e) {
            return IAVService.MUSIC_LENGTH_FOR_COPYRIGHT;
        }
        try {
            ConnectionQuality c = C10087c.m29957b().mo24735c();
            if (ConnectionQuality.POOR == c) {
                return 45000;
            }
            if (ConnectionQuality.MODERATE == c) {
                return VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
            }
            return (ConnectionQuality.GOOD == c || ConnectionQuality.EXCELLENT == c || ConnectionQuality.UNKNOWN == c) ? IAVService.MUSIC_LENGTH_FOR_COPYRIGHT : IAVService.MUSIC_LENGTH_FOR_COPYRIGHT;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: f */
    public static int m30123f() {
        if (!f27648e) {
            return IAVService.MUSIC_LENGTH_FOR_COPYRIGHT;
        }
        try {
            ConnectionQuality c = C10087c.m29957b().mo24735c();
            if (ConnectionQuality.POOR == c) {
                return 45000;
            }
            if (ConnectionQuality.MODERATE == c) {
                return VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
            }
            return (ConnectionQuality.GOOD == c || ConnectionQuality.EXCELLENT == c || ConnectionQuality.UNKNOWN == c) ? IAVService.MUSIC_LENGTH_FOR_COPYRIGHT : IAVService.MUSIC_LENGTH_FOR_COPYRIGHT;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|(2:9|(1:11))|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002a */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.webkit.CookieManager m30126i() {
        /*
            java.lang.Object r0 = f27654k
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = f27653j     // Catch:{ all -> 0x0048 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x0048 }
            r2 = 1
            if (r1 != 0) goto L_0x002f
            java.util.concurrent.CountDownLatch r1 = f27655l     // Catch:{ Exception -> 0x002a }
            if (r1 == 0) goto L_0x002a
            java.util.concurrent.CountDownLatch r1 = f27655l     // Catch:{ Exception -> 0x002a }
            r3 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x002a }
            r1.await(r3, r5)     // Catch:{ Exception -> 0x002a }
            java.util.concurrent.CountDownLatch r1 = f27655l     // Catch:{ Exception -> 0x002a }
            long r3 = r1.getCount()     // Catch:{ Exception -> 0x002a }
            r5 = 1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x002a
            java.util.concurrent.CountDownLatch r1 = f27655l     // Catch:{ Exception -> 0x002a }
            r1.countDown()     // Catch:{ Exception -> 0x002a }
        L_0x002a:
            java.util.concurrent.atomic.AtomicBoolean r1 = f27653j     // Catch:{ all -> 0x0048 }
            r1.getAndSet(r2)     // Catch:{ all -> 0x0048 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            com.bytedance.frameworks.baselib.network.http.f$b r0 = f27651h
            if (r0 == 0) goto L_0x0037
            r0.mo24806a()
        L_0x0037:
            r0 = 0
            android.webkit.CookieManager r1 = android.webkit.CookieManager.getInstance()     // Catch:{ Throwable -> 0x0046 }
            boolean r0 = r1.acceptCookie()     // Catch:{ Throwable -> 0x0047 }
            if (r0 != 0) goto L_0x0047
            r1.setAcceptCookie(r2)     // Catch:{ Throwable -> 0x0047 }
            goto L_0x0047
        L_0x0046:
            r1 = r0
        L_0x0047:
            return r1
        L_0x0048:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.C10142f.m30126i():android.webkit.CookieManager");
    }

    /* renamed from: a */
    public static String m30095a(String str) {
        return m30096a(str, (C10122c) null);
    }

    /* renamed from: c */
    public static void m30120c(boolean z) {
        if (f27653j.get() != z) {
            f27653j.getAndSet(z);
            m30131n();
            if (!z) {
                f27655l = new CountDownLatch(1);
            }
        }
    }

    /* renamed from: a */
    public static void m30100a(int i) {
        f27656m = i;
    }

    /* renamed from: a */
    public static void m30103a(C10143a aVar) {
        f27660q = aVar;
    }

    /* renamed from: a */
    public static String m30096a(String str, C10122c cVar) {
        if (C6319n.m19593a(str)) {
            return str;
        }
        C10145c cVar2 = f27657n;
        if (cVar2 != null) {
            str = cVar2.mo24807a(str, cVar);
        }
        return str;
    }

    /* renamed from: b */
    public static Map<String, String> m30117b(String str, Map<String, List<String>> map) {
        C10143a aVar = f27660q;
        if (aVar != null) {
            return aVar.mo24803a(str, map);
        }
        return null;
    }

    /* renamed from: a */
    public static String m30097a(String str, boolean z) {
        C10144b bVar = f27651h;
        if (bVar != null) {
            return bVar.mo24804a(str, true);
        }
        return str;
    }

    /* renamed from: a */
    public static String m30098a(String str, boolean z, Object... objArr) {
        C10144b bVar = f27651h;
        if (bVar != null) {
            return bVar.mo24805a(str, z, objArr);
        }
        return str;
    }

    /* renamed from: a */
    public static void m30101a(long j, long j2, String str, String str2, C10104a aVar) {
        C10153k kVar = f27652i;
        if (!C6319n.m19593a(str) && j > 0 && kVar != null) {
            kVar.mo24821a(j, j2, str, str2, aVar);
        }
    }

    /* renamed from: a */
    public static void m30102a(long j, long j2, String str, String str2, C10104a aVar, Throwable th) {
        if (!C6319n.m19593a(str) && th != null) {
            C10153k kVar = f27652i;
            if (kVar != null) {
                kVar.mo24822a(j, j2, str, str2, aVar, th);
            }
        }
    }
}
