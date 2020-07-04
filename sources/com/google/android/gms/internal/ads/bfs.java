package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import java.lang.reflect.InvocationTargetException;

public final class bfs extends bfw {
    public bfs(beh beh, String str, String str2, C16247a aVar, int i, int i2) {
        super(beh, str, str2, aVar, i, 48);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40578a() throws IllegalAccessException, InvocationTargetException {
        this.f41859b.mo42211a(zzby.ENUM_FAILURE);
        boolean booleanValue = ((Boolean) this.f41860c.invoke(null, new Object[]{this.f41858a.f41760a})).booleanValue();
        synchronized (this.f41859b) {
            if (booleanValue) {
                try {
                    this.f41859b.mo42211a(zzby.ENUM_TRUE);
                } catch (Throwable th) {
                    throw th;
                }
            } else {
                this.f41859b.mo42211a(zzby.ENUM_FALSE);
            }
        }
    }
}
