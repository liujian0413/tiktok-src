package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import java.lang.reflect.InvocationTargetException;

public final class bfq extends bfw {

    /* renamed from: d */
    private final bes f41844d;

    /* renamed from: e */
    private long f41845e;

    public bfq(beh beh, String str, String str2, C16247a aVar, int i, int i2, bes bes) {
        super(beh, str, str2, aVar, i, 53);
        this.f41844d = bes;
        if (bes != null) {
            this.f41845e = bes.mo40563a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40578a() throws IllegalAccessException, InvocationTargetException {
        if (this.f41844d != null) {
            this.f41859b.mo42198A(((Long) this.f41860c.invoke(null, new Object[]{Long.valueOf(this.f41845e)})).longValue());
        }
    }
}
