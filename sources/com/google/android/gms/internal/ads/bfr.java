package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import java.lang.reflect.InvocationTargetException;

public final class bfr extends bfw {

    /* renamed from: d */
    private static volatile Long f41846d;

    /* renamed from: e */
    private static final Object f41847e = new Object();

    public bfr(beh beh, String str, String str2, C16247a aVar, int i, int i2) {
        super(beh, str, str2, aVar, i, 33);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40578a() throws IllegalAccessException, InvocationTargetException {
        if (f41846d == null) {
            synchronized (f41847e) {
                if (f41846d == null) {
                    f41846d = (Long) this.f41860c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f41859b) {
            this.f41859b.mo42239o(f41846d.longValue());
        }
    }
}
