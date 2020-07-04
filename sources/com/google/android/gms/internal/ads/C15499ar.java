package com.google.android.gms.internal.ads;

import android.content.Context;
import android.location.Location;
import android.os.Bundle;
import com.google.android.gms.ads.p743c.C14741a;
import java.util.Collections;
import java.util.Date;
import java.util.Map;
import java.util.Set;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.ar */
public final class C15499ar {

    /* renamed from: a */
    public final Date f40930a;

    /* renamed from: b */
    public final String f40931b;

    /* renamed from: c */
    public final int f40932c;

    /* renamed from: d */
    public final Set<String> f40933d;

    /* renamed from: e */
    public final Location f40934e;

    /* renamed from: f */
    public final boolean f40935f;

    /* renamed from: g */
    public final Bundle f40936g;

    /* renamed from: h */
    public final Map<Class<? extends Object>, Object> f40937h;

    /* renamed from: i */
    public final String f40938i;

    /* renamed from: j */
    public final String f40939j;

    /* renamed from: k */
    public final C14741a f40940k;

    /* renamed from: l */
    public final int f40941l;

    /* renamed from: m */
    public final Bundle f40942m;

    /* renamed from: n */
    public final Set<String> f40943n;

    /* renamed from: o */
    public final boolean f40944o;

    /* renamed from: p */
    public final int f40945p;

    /* renamed from: q */
    public final String f40946q;

    /* renamed from: r */
    private final Set<String> f40947r;

    /* renamed from: s */
    private final aou f40948s;

    public C15499ar(C15509as asVar) {
        this(asVar, null);
    }

    private C15499ar(C15509as asVar, C14741a aVar) {
        this.f40930a = asVar.f40974a;
        this.f40931b = asVar.f40975b;
        this.f40932c = asVar.f40976c;
        this.f40933d = Collections.unmodifiableSet(asVar.f40982i);
        this.f40934e = asVar.f40977d;
        this.f40935f = asVar.f40978e;
        this.f40936g = asVar.f40983j;
        this.f40937h = Collections.unmodifiableMap(asVar.f40984k);
        this.f40938i = asVar.f40979f;
        this.f40939j = asVar.f40980g;
        this.f40940k = null;
        this.f40941l = asVar.f40988o;
        this.f40947r = Collections.unmodifiableSet(asVar.f40985l);
        this.f40942m = asVar.f40986m;
        this.f40943n = Collections.unmodifiableSet(asVar.f40987n);
        this.f40944o = asVar.f40981h;
        this.f40948s = null;
        this.f40945p = asVar.f40989p;
        this.f40946q = asVar.f40990q;
    }

    /* renamed from: a */
    public final Bundle mo39952a(Class<? extends Object> cls) {
        return this.f40936g.getBundle(cls.getName());
    }

    /* renamed from: a */
    public final boolean mo39953a(Context context) {
        return this.f40947r.contains(afb.m45723a(context));
    }
}
