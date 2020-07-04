package com.facebook.net;

import android.net.Uri;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.NetworkUtils.NetworkType;
import com.bytedance.ttnet.p670a.C12938d;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.facebook.net.e */
public final class C14135e {

    /* renamed from: a */
    private static volatile C14135e f37349a;

    /* renamed from: b */
    private static final Object f37350b = new Object();

    /* renamed from: c */
    private final ConcurrentHashMap<String, Long> f37351c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private final ConcurrentHashMap<String, C14136a> f37352d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private final ConcurrentHashMap<String, C14137b> f37353e = new ConcurrentHashMap<>();

    /* renamed from: com.facebook.net.e$a */
    class C14136a {

        /* renamed from: a */
        int f37354a;

        /* renamed from: b */
        int f37355b = 1;

        /* renamed from: c */
        boolean f37356c = false;

        /* renamed from: d */
        long f37357d = 0;

        /* renamed from: e */
        int f37358e;

        public C14136a(int i, int i2, boolean z, long j, int i3) {
            this.f37354a = i;
            this.f37358e = i3;
        }
    }

    /* renamed from: com.facebook.net.e$b */
    class C14137b {

        /* renamed from: a */
        int f37360a;

        /* renamed from: b */
        int f37361b;

        /* renamed from: c */
        long f37362c;

        /* renamed from: d */
        long f37363d = System.currentTimeMillis();

        public C14137b(int i, int i2, long j) {
            this.f37360a = i;
            this.f37361b = i2;
            this.f37362c = j;
        }
    }

    private C14135e() {
    }

    /* renamed from: a */
    public static C14135e m41735a() {
        if (f37349a == null) {
            synchronized (f37350b) {
                if (f37349a == null) {
                    f37349a = new C14135e();
                }
            }
        }
        return f37349a;
    }

    /* renamed from: c */
    private static boolean m41738c() {
        if (C12938d.m37686a() == null || C12938d.m37686a().mo31434b() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static int m41739d() {
        if (C12938d.m37686a() == null || C12938d.m37686a().mo31435c() <= 0) {
            return 5;
        }
        return C12938d.m37686a().mo31435c();
    }

    /* renamed from: e */
    private static int m41740e() {
        if (C12938d.m37686a() == null || C12938d.m37686a().mo31436d() <= 0) {
            return 50;
        }
        return C12938d.m37686a().mo31436d();
    }

    /* renamed from: b */
    private static boolean m41737b() {
        int i;
        if (C12938d.m37686a() != null) {
            i = C12938d.m37686a().mo31437e().getValue();
        } else {
            i = 0;
        }
        if (i == NetworkType.WIFI.getValue() || i == NetworkType.MOBILE_4G.getValue() || i == NetworkType.MOBILE_3G.getValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m41736b(String str, boolean z, long j, boolean z2) {
        long j2;
        try {
            if ((C12938d.m37686a() != null && C12938d.m37686a().mo31434b() == 2) || !z2) {
                return;
            }
            if (this.f37353e.containsKey("p.pstap.com")) {
                C14137b bVar = (C14137b) this.f37353e.get("p.pstap.com");
                if (!z || j <= 0) {
                    bVar.f37361b++;
                } else {
                    bVar.f37360a++;
                    bVar.f37362c += j;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - bVar.f37363d > 300000) {
                    if (bVar.f37360a > 0) {
                        j2 = bVar.f37362c / ((long) bVar.f37360a);
                    } else {
                        j2 = 0;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error", bVar.f37361b);
                    jSONObject.put("success", bVar.f37360a);
                    jSONObject.put("average_duration", j2);
                    if (m41738c()) {
                        jSONObject.put("has_opt", 1);
                    }
                    bVar.f37361b = 0;
                    bVar.f37360a = 0;
                    bVar.f37362c = 0;
                    bVar.f37363d = currentTimeMillis;
                }
                return;
            }
            boolean z3 = z;
            long j3 = j;
            C14137b bVar2 = new C14137b(z3 ? 1 : 0, z ^ true ? 1 : 0, j3);
            this.f37353e.put("p.pstap.com", bVar2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo33893a(String str, boolean z, long j, boolean z2) {
        if (!C6319n.m19593a(str) && m41737b()) {
            m41736b(str, z, j, z2);
            if (m41738c()) {
                try {
                    String host = Uri.parse(str).getHost();
                    if (this.f37352d.containsKey(host)) {
                        C14136a aVar = (C14136a) this.f37352d.get(host);
                        if (aVar != null && !aVar.f37356c) {
                            if (!z) {
                                aVar.f37354a++;
                            }
                            aVar.f37355b++;
                            if (aVar.f37354a < m41739d() || (aVar.f37354a * 100) / aVar.f37355b < 10) {
                                if (aVar.f37355b > aVar.f37358e) {
                                    aVar.f37355b = 0;
                                    aVar.f37354a = 0;
                                    aVar.f37356c = false;
                                }
                                return;
                            }
                            aVar.f37356c = true;
                            aVar.f37355b = 0;
                            aVar.f37354a = 0;
                            this.f37351c.put(host, Long.valueOf(System.currentTimeMillis()));
                            return;
                        }
                        return;
                    }
                    boolean z3 = !z;
                    C14136a aVar2 = new C14136a(z3 ? 1 : 0, 1, false, 0, m41740e());
                    this.f37352d.put(host, aVar2);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
