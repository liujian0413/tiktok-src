package com.google.android.gms.internal.ads;

import org.json.JSONObject;

@C6505uv
public final class abk {

    /* renamed from: a */
    public final zzaxe f39887a;

    /* renamed from: b */
    public final zzaxi f39888b;

    /* renamed from: c */
    public final C15916ob f39889c;

    /* renamed from: d */
    public final zzyz f39890d;

    /* renamed from: e */
    public final int f39891e;

    /* renamed from: f */
    public final long f39892f;

    /* renamed from: g */
    public final long f39893g;

    /* renamed from: h */
    public final JSONObject f39894h;

    /* renamed from: i */
    public final bwl f39895i;

    /* renamed from: j */
    public final boolean f39896j;

    public abk(zzaxe zzaxe, zzaxi zzaxi, C15916ob obVar, zzyz zzyz, int i, long j, long j2, JSONObject jSONObject, bwp bwp) {
        this.f39887a = zzaxe;
        this.f39888b = zzaxi;
        this.f39891e = i;
        this.f39892f = j;
        this.f39893g = j2;
        this.f39895i = new bwl(bwp);
        this.f39896j = false;
    }

    public abk(zzaxe zzaxe, zzaxi zzaxi, C15916ob obVar, zzyz zzyz, int i, long j, long j2, JSONObject jSONObject, bwl bwl, Boolean bool) {
        this.f39887a = zzaxe;
        this.f39888b = zzaxi;
        this.f39889c = obVar;
        this.f39890d = zzyz;
        this.f39891e = i;
        this.f39892f = j;
        this.f39893g = j2;
        this.f39894h = jSONObject;
        this.f39895i = bwl;
        if (bool != null) {
            this.f39896j = bool.booleanValue();
        } else {
            this.f39896j = aeu.m45704a(zzaxe.f45573c.f45789m);
        }
    }
}
