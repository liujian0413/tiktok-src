package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import java.lang.reflect.InvocationTargetException;

public final class bfc extends bfw {

    /* renamed from: d */
    private long f41831d;

    public bfc(beh beh, String str, String str2, C16247a aVar, long j, int i, int i2) {
        super(beh, str, str2, aVar, i, 25);
        this.f41831d = j;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40578a() throws IllegalAccessException, InvocationTargetException {
        long longValue = ((Long) this.f41860c.invoke(null, new Object[0])).longValue();
        synchronized (this.f41859b) {
            this.f41859b.mo42204G(longValue);
            if (this.f41831d != 0) {
                this.f41859b.mo42232i(longValue - this.f41831d);
                this.f41859b.mo42236l(this.f41831d);
            }
        }
    }
}
