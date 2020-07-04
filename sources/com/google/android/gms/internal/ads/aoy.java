package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Looper;
import com.google.android.gms.internal.ads.zzbqc.zza;
import com.google.android.gms.internal.ads.zzbqh.zzb;

public final class aoy {

    /* renamed from: a */
    private final Context f40885a;

    /* renamed from: b */
    private final Looper f40886b;

    public aoy(Context context, Looper looper) {
        this.f40885a = context;
        this.f40886b = looper;
    }

    /* renamed from: a */
    public final void mo39914a(String str) {
        new aoz(this.f40885a, this.f40886b, (zzbqh) ((axu) zzbqh.m52967a().mo42279a(this.f40885a.getPackageName()).mo42278a(zzb.BLOCKED_IMPRESSION).mo42277a(zzbqc.m52958a().mo42276a(str).mo42275a(zza.BLOCKED_REASON_BACKGROUND)).mo40293e())).mo39915a();
    }
}
