package com.google.android.gms.internal.ads;

import android.location.Location;
import com.google.android.gms.ads.mediation.C14882a;
import java.util.Date;
import java.util.Set;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.pn */
public final class C15955pn implements C14882a {

    /* renamed from: a */
    private final Date f44835a;

    /* renamed from: b */
    private final int f44836b;

    /* renamed from: c */
    private final Set<String> f44837c;

    /* renamed from: d */
    private final boolean f44838d;

    /* renamed from: e */
    private final Location f44839e;

    /* renamed from: f */
    private final int f44840f;

    /* renamed from: g */
    private final boolean f44841g;

    /* renamed from: h */
    private final int f44842h;

    /* renamed from: i */
    private final String f44843i;

    public C15955pn(Date date, int i, Set<String> set, Location location, boolean z, int i2, boolean z2, int i3, String str) {
        this.f44835a = date;
        this.f44836b = i;
        this.f44837c = set;
        this.f44839e = location;
        this.f44838d = z;
        this.f44840f = i2;
        this.f44841g = z2;
        this.f44842h = i3;
        this.f44843i = str;
    }

    /* renamed from: a */
    public final Date mo37899a() {
        return this.f44835a;
    }

    /* renamed from: b */
    public final int mo37900b() {
        return this.f44836b;
    }

    /* renamed from: c */
    public final Set<String> mo37901c() {
        return this.f44837c;
    }

    /* renamed from: d */
    public final Location mo37902d() {
        return this.f44839e;
    }

    /* renamed from: f */
    public final boolean mo37904f() {
        return this.f44838d;
    }

    /* renamed from: e */
    public final int mo37903e() {
        return this.f44840f;
    }

    /* renamed from: g */
    public final boolean mo37905g() {
        return this.f44841g;
    }
}
