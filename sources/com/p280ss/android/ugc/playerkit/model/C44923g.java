package com.p280ss.android.ugc.playerkit.model;

import android.content.Context;
import com.p280ss.android.ugc.playerkit.p1750a.C44910d;
import com.p280ss.ttvideoengine.p1812e.C46083h;

/* renamed from: com.ss.android.ugc.playerkit.model.g */
public final class C44923g {

    /* renamed from: a */
    public final C44910d<C44924h> f115534a;

    /* renamed from: b */
    public final C44910d<Boolean> f115535b;

    /* renamed from: c */
    public Context f115536c;

    /* renamed from: d */
    public final String f115537d;

    /* renamed from: e */
    public final boolean f115538e;

    /* renamed from: f */
    public final C44918b f115539f;

    /* renamed from: g */
    public final boolean f115540g;

    /* renamed from: h */
    public boolean f115541h;

    /* renamed from: i */
    public int f115542i;

    /* renamed from: j */
    public int f115543j;

    /* renamed from: k */
    public int f115544k;

    /* renamed from: l */
    public int f115545l = 1;

    /* renamed from: m */
    public C44910d<Integer> f115546m;

    /* renamed from: n */
    public final String f115547n;

    /* renamed from: o */
    public String f115548o;

    /* renamed from: p */
    public String f115549p;

    /* renamed from: q */
    public boolean f115550q;

    /* renamed from: r */
    public boolean f115551r;

    /* renamed from: s */
    public C44924h f115552s;

    /* renamed from: t */
    public boolean f115553t;

    /* renamed from: u */
    public int f115554u;

    /* renamed from: v */
    public boolean f115555v;

    /* renamed from: w */
    public C46083h f115556w;

    /* renamed from: x */
    public boolean f115557x;

    /* renamed from: y */
    public boolean f115558y;

    /* renamed from: b */
    public final boolean mo107398b() {
        if (this.f115535b == null) {
            return false;
        }
        return ((Boolean) this.f115535b.mo104814a()).booleanValue();
    }

    /* renamed from: a */
    public final C44924h mo107397a() {
        if (this.f115552s == null) {
            this.f115552s = (C44924h) this.f115534a.mo104814a();
        }
        if (C44917a.m141692r().mo105108k() && this.f115552s != null) {
            this.f115541h = this.f115552s.f115561c;
        }
        if (this.f115552s != null) {
            this.f115548o = this.f115552s.f115563e;
            this.f115549p = this.f115552s.f115564f;
        }
        return this.f115552s;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PrepareData{id='");
        sb.append(this.f115537d);
        sb.append('\'');
        sb.append(", isRenderReady=");
        sb.append(this.f115538e);
        sb.append(", config=");
        sb.append(this.f115539f);
        sb.append(", vr=");
        sb.append(this.f115540g);
        sb.append(", h265=");
        sb.append(this.f115541h);
        sb.append(", isCurPlayer=");
        sb.append(this.f115550q);
        sb.append(", isPrepareCallback=");
        sb.append(this.f115551r);
        sb.append(", processUrlData=");
        sb.append(this.f115552s);
        sb.append(", isAsyncInit=");
        sb.append(this.f115553t);
        sb.append(", framesWait=");
        sb.append(this.f115545l);
        sb.append(", cacheKey=");
        sb.append(this.f115548o);
        sb.append(", enableAlog=");
        sb.append(this.f115544k);
        sb.append('}');
        return sb.toString();
    }

    public C44923g(C44910d<C44924h> dVar, C44910d<Boolean> dVar2, Context context, String str, boolean z, C44918b bVar, boolean z2, boolean z3, int i, C44910d<Integer> dVar3, String str2, boolean z4, boolean z5, boolean z6, int i2) {
        this.f115534a = dVar;
        this.f115535b = dVar2;
        this.f115536c = context;
        this.f115537d = str;
        this.f115538e = z;
        this.f115539f = bVar;
        this.f115540g = z2;
        this.f115541h = z3;
        this.f115542i = i;
        this.f115546m = dVar3;
        this.f115547n = str2;
        this.f115550q = z4;
        this.f115551r = z5;
        this.f115553t = z6;
        this.f115543j = i2;
    }
}
