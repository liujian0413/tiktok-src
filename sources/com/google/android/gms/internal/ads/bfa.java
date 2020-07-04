package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import java.lang.reflect.InvocationTargetException;

public final class bfa extends bfw {
    public bfa(beh beh, String str, String str2, C16247a aVar, int i, int i2) {
        super(beh, str, str2, aVar, i, 5);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40578a() throws IllegalAccessException, InvocationTargetException {
        this.f41859b.mo42214b(-1);
        this.f41859b.mo42218c(-1);
        int[] iArr = (int[]) this.f41860c.invoke(null, new Object[]{this.f41858a.f41760a});
        synchronized (this.f41859b) {
            this.f41859b.mo42214b((long) iArr[0]);
            this.f41859b.mo42218c((long) iArr[1]);
            if (iArr[2] != Integer.MIN_VALUE) {
                this.f41859b.mo42199B((long) iArr[2]);
            }
        }
    }
}
