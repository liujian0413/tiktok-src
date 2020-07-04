package com.google.android.gms.ads.internal;

import android.content.Context;
import android.support.p022v4.util.C0904k;
import android.text.TextUtils;
import com.google.android.gms.ads.formats.PublisherAdViewOptions;
import com.google.android.gms.internal.ads.C15589c;
import com.google.android.gms.internal.ads.C15686fo;
import com.google.android.gms.internal.ads.C15690fs;
import com.google.android.gms.internal.ads.C15693fv;
import com.google.android.gms.internal.ads.C15696fy;
import com.google.android.gms.internal.ads.C15700gb;
import com.google.android.gms.internal.ads.C15703ge;
import com.google.android.gms.internal.ads.C15791jl;
import com.google.android.gms.internal.ads.C15931oq;
import com.google.android.gms.internal.ads.C16076u;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.bys;
import com.google.android.gms.internal.ads.byv;
import com.google.android.gms.internal.ads.zzafl;
import com.google.android.gms.internal.ads.zzaks;
import com.google.android.gms.internal.ads.zzbgz;
import com.google.android.gms.internal.ads.zzyz;

@C6505uv
/* renamed from: com.google.android.gms.ads.internal.m */
public final class C14831m extends C15589c {

    /* renamed from: a */
    private bys f38378a;

    /* renamed from: b */
    private C15686fo f38379b;

    /* renamed from: c */
    private C15703ge f38380c;

    /* renamed from: d */
    private C15690fs f38381d;

    /* renamed from: e */
    private C0904k<String, C15693fv> f38382e = new C0904k<>();

    /* renamed from: f */
    private C0904k<String, C15696fy> f38383f = new C0904k<>();

    /* renamed from: g */
    private C15700gb f38384g;

    /* renamed from: h */
    private zzyz f38385h;

    /* renamed from: i */
    private PublisherAdViewOptions f38386i;

    /* renamed from: j */
    private zzafl f38387j;

    /* renamed from: k */
    private zzaks f38388k;

    /* renamed from: l */
    private C15791jl f38389l;

    /* renamed from: m */
    private C16076u f38390m;

    /* renamed from: n */
    private final Context f38391n;

    /* renamed from: o */
    private final C15931oq f38392o;

    /* renamed from: p */
    private final String f38393p;

    /* renamed from: q */
    private final zzbgz f38394q;

    /* renamed from: r */
    private final C14816bu f38395r;

    public C14831m(Context context, String str, C15931oq oqVar, zzbgz zzbgz, C14816bu buVar) {
        this.f38391n = context;
        this.f38393p = str;
        this.f38392o = oqVar;
        this.f38394q = zzbgz;
        this.f38395r = buVar;
    }

    /* renamed from: a */
    public final byv mo37787a() {
        C14828j jVar = new C14828j(this.f38391n, this.f38393p, this.f38392o, this.f38394q, this.f38378a, this.f38379b, this.f38380c, this.f38389l, this.f38381d, this.f38383f, this.f38382e, this.f38387j, this.f38388k, this.f38390m, this.f38395r, this.f38384g, this.f38385h, this.f38386i);
        return jVar;
    }

    /* renamed from: a */
    public final void mo37789a(bys bys) {
        this.f38378a = bys;
    }

    /* renamed from: a */
    public final void mo37796a(zzafl zzafl) {
        this.f38387j = zzafl;
    }

    /* renamed from: a */
    public final void mo37788a(PublisherAdViewOptions publisherAdViewOptions) {
        this.f38386i = publisherAdViewOptions;
    }

    /* renamed from: a */
    public final void mo37795a(C16076u uVar) {
        this.f38390m = uVar;
    }

    /* renamed from: a */
    public final void mo37797a(zzaks zzaks) {
        this.f38388k = zzaks;
    }

    /* renamed from: a */
    public final void mo37791a(C15690fs fsVar) {
        this.f38381d = fsVar;
    }

    /* renamed from: a */
    public final void mo37790a(C15686fo foVar) {
        this.f38379b = foVar;
    }

    /* renamed from: a */
    public final void mo37793a(C15703ge geVar) {
        this.f38380c = geVar;
    }

    /* renamed from: a */
    public final void mo37794a(C15791jl jlVar) {
        this.f38389l = jlVar;
    }

    /* renamed from: a */
    public final void mo37798a(String str, C15696fy fyVar, C15693fv fvVar) {
        if (!TextUtils.isEmpty(str)) {
            this.f38383f.put(str, fyVar);
            this.f38382e.put(str, fvVar);
            return;
        }
        throw new IllegalArgumentException("Custom template ID for native custom template ad is empty. Please provide a valid template id.");
    }

    /* renamed from: a */
    public final void mo37792a(C15700gb gbVar, zzyz zzyz) {
        this.f38384g = gbVar;
        this.f38385h = zzyz;
    }
}
