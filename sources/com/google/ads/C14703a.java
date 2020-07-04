package com.google.ads;

import com.google.android.gms.ads.C14745e;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;

/* renamed from: com.google.ads.a */
public final class C14703a {

    /* renamed from: a */
    public static final C14703a f38033a = new C14703a(-1, -2, "mb");

    /* renamed from: b */
    public static final C14703a f38034b = new C14703a(320, 50, "mb");

    /* renamed from: c */
    public static final C14703a f38035c = new C14703a(C34943c.f91128x, 250, "as");

    /* renamed from: d */
    public static final C14703a f38036d = new C14703a(468, 60, "as");

    /* renamed from: e */
    public static final C14703a f38037e = new C14703a(728, 90, "as");

    /* renamed from: f */
    public static final C14703a f38038f = new C14703a(160, 600, "as");

    /* renamed from: g */
    private final C14745e f38039g;

    public C14703a(C14745e eVar) {
        this.f38039g = eVar;
    }

    private C14703a(int i, int i2, String str) {
        this(new C14745e(i, i2));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C14703a)) {
            return false;
        }
        return this.f38039g.equals(((C14703a) obj).f38039g);
    }

    public final int hashCode() {
        return this.f38039g.hashCode();
    }

    /* renamed from: a */
    public final int mo37304a() {
        return this.f38039g.f38106k;
    }

    /* renamed from: b */
    public final int mo37305b() {
        return this.f38039g.f38107l;
    }

    public final String toString() {
        return this.f38039g.toString();
    }
}
