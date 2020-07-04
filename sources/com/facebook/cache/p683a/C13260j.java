package com.facebook.cache.p683a;

import com.facebook.cache.common.C13265a;
import com.facebook.cache.common.CacheEventListener.EvictionReason;
import java.io.IOException;

/* renamed from: com.facebook.cache.a.j */
public final class C13260j {

    /* renamed from: a */
    private static final Object f35141a = new Object();

    /* renamed from: b */
    private static C13260j f35142b;

    /* renamed from: c */
    private static int f35143c;

    /* renamed from: d */
    private C13265a f35144d;

    /* renamed from: e */
    private String f35145e;

    /* renamed from: f */
    private long f35146f;

    /* renamed from: g */
    private long f35147g;

    /* renamed from: h */
    private long f35148h;

    /* renamed from: i */
    private IOException f35149i;

    /* renamed from: j */
    private EvictionReason f35150j;

    /* renamed from: k */
    private C13260j f35151k;

    private C13260j() {
    }

    /* renamed from: c */
    private void m38783c() {
        this.f35144d = null;
        this.f35145e = null;
        this.f35146f = 0;
        this.f35147g = 0;
        this.f35148h = 0;
        this.f35149i = null;
        this.f35150j = null;
    }

    /* renamed from: b */
    public final void mo32481b() {
        synchronized (f35141a) {
            if (f35143c < 5) {
                m38783c();
                f35143c++;
                if (f35142b != null) {
                    this.f35151k = f35142b;
                }
                f35142b = this;
            }
        }
    }

    /* renamed from: a */
    public static C13260j m38782a() {
        synchronized (f35141a) {
            if (f35142b == null) {
                return new C13260j();
            }
            C13260j jVar = f35142b;
            f35142b = jVar.f35151k;
            jVar.f35151k = null;
            f35143c--;
            return jVar;
        }
    }

    /* renamed from: a */
    public final C13260j mo32475a(long j) {
        this.f35146f = j;
        return this;
    }

    /* renamed from: b */
    public final C13260j mo32480b(long j) {
        this.f35148h = j;
        return this;
    }

    /* renamed from: c */
    public final C13260j mo32482c(long j) {
        this.f35147g = j;
        return this;
    }

    /* renamed from: a */
    public final C13260j mo32476a(EvictionReason evictionReason) {
        this.f35150j = evictionReason;
        return this;
    }

    /* renamed from: a */
    public final C13260j mo32477a(C13265a aVar) {
        this.f35144d = aVar;
        return this;
    }

    /* renamed from: a */
    public final C13260j mo32478a(IOException iOException) {
        this.f35149i = iOException;
        return this;
    }

    /* renamed from: a */
    public final C13260j mo32479a(String str) {
        this.f35145e = str;
        return this;
    }
}
