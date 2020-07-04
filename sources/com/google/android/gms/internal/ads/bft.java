package com.google.android.gms.internal.ads;

import android.util.DisplayMetrics;
import android.view.View;
import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import com.google.android.gms.internal.ads.zzbo.zza.C16250c;
import com.google.android.gms.internal.ads.zzbo.zza.C16250c.C16251a;
import java.lang.reflect.InvocationTargetException;

public final class bft extends bfw {

    /* renamed from: d */
    private final View f41848d;

    public bft(beh beh, String str, String str2, C16247a aVar, int i, int i2, View view) {
        super(beh, str, str2, aVar, i, 57);
        this.f41848d = view;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40578a() throws IllegalAccessException, InvocationTargetException {
        if (this.f41848d != null) {
            Boolean bool = (Boolean) bym.m50299d().mo41272a(C15585bw.f43813bG);
            DisplayMetrics displayMetrics = this.f41858a.f41760a.getResources().getDisplayMetrics();
            ber ber = new ber((String) this.f41860c.invoke(null, new Object[]{this.f41848d, displayMetrics, bool}));
            C16251a a = C16250c.m52943a();
            a.mo42270a(ber.f41801a.longValue()).mo42271b(ber.f41802b.longValue()).mo42272c(ber.f41803c.longValue());
            if (bool.booleanValue()) {
                a.mo42273d(ber.f41804d.longValue());
            }
            this.f41859b.mo42209a((C16250c) ((axu) a.mo40293e()));
        }
    }
}
