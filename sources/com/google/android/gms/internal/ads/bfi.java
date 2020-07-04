package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import java.lang.reflect.InvocationTargetException;

public final class bfi extends bfw {

    /* renamed from: d */
    private static volatile String f41837d;

    /* renamed from: e */
    private static final Object f41838e = new Object();

    public bfi(beh beh, String str, String str2, C16247a aVar, int i, int i2) {
        super(beh, str, str2, aVar, i, 1);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40578a() throws IllegalAccessException, InvocationTargetException {
        this.f41859b.mo42212a("E");
        if (f41837d == null) {
            synchronized (f41838e) {
                if (f41837d == null) {
                    f41837d = (String) this.f41860c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f41859b) {
            this.f41859b.mo42212a(f41837d);
        }
    }
}
