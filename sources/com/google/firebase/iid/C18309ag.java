package com.google.firebase.iid;

import android.content.Intent;

/* renamed from: com.google.firebase.iid.ag */
final class C18309ag implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ Intent f49767a;

    /* renamed from: b */
    private final /* synthetic */ Intent f49768b;

    /* renamed from: c */
    private final /* synthetic */ zzb f49769c;

    C18309ag(zzb zzb, Intent intent, Intent intent2) {
        this.f49769c = zzb;
        this.f49767a = intent;
        this.f49768b = intent2;
    }

    public final void run() {
        this.f49769c.zzd(this.f49767a);
        this.f49769c.zza(this.f49768b);
    }
}
