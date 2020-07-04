package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import java.lang.reflect.InvocationTargetException;

public final class bff extends bfw {

    /* renamed from: d */
    private static volatile Long f41834d;

    /* renamed from: e */
    private static final Object f41835e = new Object();

    public bff(beh beh, String str, String str2, C16247a aVar, int i, int i2) {
        super(beh, str, str2, aVar, i, 22);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40578a() throws IllegalAccessException, InvocationTargetException {
        if (f41834d == null) {
            synchronized (f41835e) {
                if (f41834d == null) {
                    f41834d = (Long) this.f41860c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f41859b) {
            this.f41859b.mo42235k(f41834d.longValue());
        }
    }
}
