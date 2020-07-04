package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15349d;
import java.util.HashMap;

/* renamed from: com.google.android.gms.internal.measurement.cs */
final class C16456cs extends C16454b {

    /* renamed from: c */
    private final /* synthetic */ Context f46034c;

    /* renamed from: d */
    private final /* synthetic */ String f46035d;

    /* renamed from: e */
    private final /* synthetic */ String f46036e;

    /* renamed from: f */
    private final /* synthetic */ Bundle f46037f;

    /* renamed from: g */
    private final /* synthetic */ C16452cr f46038g;

    C16456cs(C16452cr crVar, Context context, String str, String str2, Bundle bundle) {
        this.f46038g = crVar;
        this.f46034c = context;
        this.f46035d = str;
        this.f46036e = str2;
        this.f46037f = bundle;
        super(crVar);
    }

    /* renamed from: b */
    public final void mo42641b() {
        String str;
        String str2;
        String str3;
        try {
            this.f46038g.f46022g = new HashMap();
            this.f46038g.f46025j = this.f46038g.mo42620a(this.f46034c);
            if (this.f46038g.f46025j != null) {
                if (C16452cr.m53663b(this.f46035d, this.f46036e)) {
                    String str4 = this.f46036e;
                    str2 = this.f46035d;
                    str = str4;
                    str3 = this.f46038g.f46020e;
                } else {
                    str3 = null;
                    str2 = null;
                    str = null;
                }
                int b = C16452cr.m53668f(this.f46034c);
                int c = C16452cr.m53667e(this.f46034c);
                zzdy zzdy = new zzdy(13001, (long) Math.max(b, c), c < b, str3, str2, str, this.f46037f);
                this.f46038g.f46025j.mo42584a(C15349d.m44668a(this.f46034c), zzdy, this.f46029a);
            }
        } catch (RemoteException e) {
            this.f46038g.m53657a((Exception) e, true, false);
        }
    }
}
