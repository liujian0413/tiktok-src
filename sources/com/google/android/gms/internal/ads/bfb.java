package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import java.lang.reflect.InvocationTargetException;

public final class bfb extends bfw {

    /* renamed from: d */
    private static volatile Long f41829d;

    /* renamed from: e */
    private static final Object f41830e = new Object();

    public bfb(beh beh, String str, String str2, C16247a aVar, int i, int i2) {
        super(beh, str, str2, aVar, i, 44);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40578a() throws IllegalAccessException, InvocationTargetException {
        if (f41829d == null) {
            synchronized (f41830e) {
                if (f41829d == null) {
                    f41829d = (Long) this.f41860c.invoke(null, new Object[0]);
                }
            }
        }
        synchronized (this.f41859b) {
            this.f41859b.mo42247w(f41829d.longValue());
        }
    }
}
