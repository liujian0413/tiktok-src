package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import java.lang.reflect.InvocationTargetException;

public final class bfn extends bfw {

    /* renamed from: d */
    private final boolean f41842d;

    public bfn(beh beh, String str, String str2, C16247a aVar, int i, int i2) {
        super(beh, str, str2, aVar, i, 61);
        this.f41842d = beh.f41771l;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40578a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f41860c.invoke(null, new Object[]{this.f41858a.f41760a, Boolean.valueOf(this.f41842d)})).longValue();
        synchronized (this.f41859b) {
            this.f41859b.mo42201D(longValue);
        }
    }
}
