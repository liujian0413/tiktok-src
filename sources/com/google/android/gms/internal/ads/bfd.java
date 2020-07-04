package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.p742b.C14733a;
import com.google.android.gms.ads.p742b.C14733a.C14734a;
import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import com.google.android.gms.internal.ads.zzbo.zza.zzc;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;

public final class bfd extends bfw {
    public bfd(beh beh, String str, String str2, C16247a aVar, int i, int i2) {
        super(beh, str, str2, aVar, i, 24);
    }

    /* renamed from: b */
    public final Void mo40579b() throws Exception {
        if (this.f41858a.f41770k) {
            return super.call();
        }
        if (this.f41858a.f41768i) {
            m48581c();
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40578a() throws IllegalAccessException, InvocationTargetException {
        if (this.f41858a.f41768i) {
            m48581c();
            return;
        }
        synchronized (this.f41859b) {
            this.f41859b.mo42233i((String) this.f41860c.invoke(null, new Object[]{this.f41858a.f41760a}));
        }
    }

    /* renamed from: c */
    private final void m48581c() {
        C14733a a = this.f41858a.mo40551a();
        if (a != null) {
            try {
                C14734a b = a.mo37414b();
                String a2 = beq.m48553a(b.f38079a);
                if (a2 != null) {
                    synchronized (this.f41859b) {
                        this.f41859b.mo42233i(a2);
                        this.f41859b.mo42213a(b.f38080b);
                        this.f41859b.mo42210a(zzc.DEVICE_IDENTIFIER_ANDROID_AD_ID);
                    }
                }
            } catch (IOException unused) {
            }
        }
    }

    public final /* synthetic */ Object call() throws Exception {
        return call();
    }
}
