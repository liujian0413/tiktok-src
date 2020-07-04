package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.dynamic.C15349d;

/* renamed from: com.google.android.gms.internal.ads.yv */
final class C16205yv implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ C15935ou f45450a;

    /* renamed from: b */
    private final /* synthetic */ zzyv f45451b;

    /* renamed from: c */
    private final /* synthetic */ C16212zb f45452c;

    /* renamed from: d */
    private final /* synthetic */ C16203yt f45453d;

    C16205yv(C16203yt ytVar, C15935ou ouVar, zzyv zzyv, C16212zb zbVar) {
        this.f45453d = ytVar;
        this.f45450a = ouVar;
        this.f45451b = zzyv;
        this.f45452c = zbVar;
    }

    public final void run() {
        try {
            this.f45450a.mo41820a(C15349d.m44668a(this.f45453d.f45437e), this.f45451b, (String) null, (C16219zi) this.f45452c, this.f45453d.f45441i);
        } catch (RemoteException e) {
            String str = "Fail to initialize adapter ";
            String valueOf = String.valueOf(this.f45453d.f45433a);
            acd.m45780c(valueOf.length() != 0 ? str.concat(valueOf) : new String(str), e);
            this.f45453d.mo42117a(this.f45453d.f45433a, 0);
        }
    }
}
