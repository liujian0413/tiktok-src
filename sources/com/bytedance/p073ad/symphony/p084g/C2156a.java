package com.bytedance.p073ad.symphony.p084g;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import com.bytedance.p073ad.symphony.C2140e;
import com.bytedance.p073ad.symphony.p084g.C2157b.C2158a;
import com.bytedance.p073ad.symphony.p085h.C2159a;
import com.bytedance.p073ad.symphony.provider.AbsNativeAdProvider;
import com.bytedance.p073ad.symphony.provider.C2195b;
import com.bytedance.p073ad.symphony.provider.C2195b.C2196a;
import com.bytedance.p073ad.symphony.util.C2205h;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.bytedance.ad.symphony.g.a */
public class C2156a implements C2157b, C2158a {

    /* renamed from: b */
    private static final String f7315b = "a";

    /* renamed from: c */
    private String f7316c;

    /* renamed from: d */
    private List<C2157b> f7317d = new LinkedList();

    /* renamed from: e */
    private C2196a f7318e;

    /* renamed from: f */
    private C2195b f7319f;

    /* renamed from: g */
    private int f7320g;

    /* renamed from: h */
    private long f7321h;

    /* renamed from: i */
    private AtomicInteger f7322i = new AtomicInteger(0);

    /* renamed from: j */
    private boolean f7323j;

    /* renamed from: k */
    private C2159a f7324k;

    /* renamed from: d */
    public final int mo7844d() {
        return this.f7320g;
    }

    /* renamed from: e */
    public final List<C2157b> mo7846e() {
        return this.f7317d;
    }

    /* renamed from: a */
    public final void mo7837a() {
        this.f7322i.getAndAdd(1);
    }

    /* renamed from: b */
    public final int mo7841b() {
        return this.f7322i.decrementAndGet();
    }

    /* renamed from: c */
    public final void mo7842c() {
        if (this.f7319f != null) {
            this.f7319f.tryPreloadAd(this.f7316c, this.f7324k, this);
        }
    }

    /* renamed from: f */
    private double m9397f() {
        double elapsedRealtime = (double) (SystemClock.elapsedRealtime() - this.f7321h);
        Double.isNaN(elapsedRealtime);
        return elapsedRealtime / 1000.0d;
    }

    /* renamed from: a */
    public static boolean m9395a(String str) {
        return C2157b.f7325a.contains(str);
    }

    /* renamed from: b */
    public static boolean m9396b(String str) {
        return "Request Timeout".equals(str);
    }

    /* renamed from: d */
    public final void mo7845d(String str) {
        C2205h.m9518a();
        if (this.f7318e != null) {
            this.f7318e.mo7796a(str);
        }
    }

    /* renamed from: a */
    public final void mo7838a(C2157b bVar) {
        this.f7317d.add(bVar);
    }

    /* renamed from: c */
    public final void mo7843c(String str) {
        C2205h.m9518a();
        if (this.f7318e != null) {
            this.f7318e.mo7797a(this.f7316c, str, this.f7320g, m9397f());
            this.f7318e.mo7796a(this.f7316c);
        }
    }

    /* renamed from: a */
    public final boolean mo7840a(Context context) {
        if (!AbsNativeAdProvider.isAdMobNativeAdProvider(this.f7320g) || VERSION.SDK_INT < 21) {
            return true;
        }
        try {
            if (context.getPackageManager().getPackageInfo("com.google.android.webview", 1) != null) {
                return true;
            }
            return false;
        } catch (Exception e) {
            C2140e.m9360a(e);
            return false;
        }
    }

    /* renamed from: a */
    public final void mo7839a(String str, String str2) {
        C2205h.m9518a();
        if (this.f7318e != null) {
            this.f7318e.mo7798a(this.f7316c, str, this.f7320g, str2, m9397f());
            if (this.f7317d.isEmpty() && !this.f7323j) {
                this.f7318e.mo7796a(this.f7316c);
            }
        }
        if (!this.f7323j) {
            if (!this.f7317d.isEmpty()) {
                for (C2157b bVar : this.f7317d) {
                    if (bVar.mo7841b() == 0) {
                        bVar.mo7842c();
                    }
                }
                this.f7317d.clear();
            }
            if ("Request Timeout".equals(str2)) {
                this.f7323j = true;
            }
        }
    }

    public C2156a(String str, C2195b bVar, C2159a aVar, C2196a aVar2) {
        this.f7316c = str;
        this.f7318e = aVar2;
        this.f7319f = bVar;
        this.f7320g = this.f7319f.getProviderId();
        this.f7321h = SystemClock.elapsedRealtime();
        this.f7324k = aVar;
    }
}
