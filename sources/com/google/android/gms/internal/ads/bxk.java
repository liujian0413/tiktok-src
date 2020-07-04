package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzxp.zza;
import java.io.IOException;

public final class bxk extends bbg<bxk> {

    /* renamed from: c */
    public String f44089c;

    /* renamed from: d */
    private zza[] f44090d;

    /* renamed from: e */
    private zzxt f44091e;

    /* renamed from: f */
    private zzxt f44092f;

    /* renamed from: g */
    private zzxt f44093g;

    public bxk() {
        this.f44089c = null;
        this.f44090d = new zza[0];
        this.f44091e = null;
        this.f44092f = null;
        this.f44093g = null;
        this.f41361a = null;
        this.f41373b = -1;
    }

    /* renamed from: a */
    public final void mo40474a(bbf bbf) throws IOException {
        if (this.f44089c != null) {
            bbf.mo40468a(1, this.f44089c);
        }
        if (this.f44090d != null && this.f44090d.length > 0) {
            for (zza zza : this.f44090d) {
                if (zza != null) {
                    bbf.mo40466a(2, (aza) zza);
                }
            }
        }
        super.mo40474a(bbf);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final int mo40473a() {
        int a = super.mo40473a();
        if (this.f44089c != null) {
            a += bbf.m48357b(1, this.f44089c);
        }
        if (this.f44090d != null && this.f44090d.length > 0) {
            for (zza zza : this.f44090d) {
                if (zza != null) {
                    a += zzccv.m53010c(2, (aza) zza);
                }
            }
        }
        return a;
    }
}
