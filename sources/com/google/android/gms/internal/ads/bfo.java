package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import java.lang.reflect.InvocationTargetException;

public final class bfo extends bfw {

    /* renamed from: d */
    private final StackTraceElement[] f41843d;

    public bfo(beh beh, String str, String str2, C16247a aVar, int i, int i2, StackTraceElement[] stackTraceElementArr) {
        super(beh, str, str2, aVar, i, 45);
        this.f41843d = stackTraceElementArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40578a() throws IllegalAccessException, InvocationTargetException {
        zzby zzby;
        if (this.f41843d != null) {
            C15564bef bef = new C15564bef((String) this.f41860c.invoke(null, new Object[]{this.f41843d}));
            synchronized (this.f41859b) {
                this.f41859b.mo42248x(bef.f41754a.longValue());
                if (bef.f41755b.booleanValue()) {
                    C16247a aVar = this.f41859b;
                    if (bef.f41756c.booleanValue()) {
                        zzby = zzby.ENUM_FALSE;
                    } else {
                        zzby = zzby.ENUM_TRUE;
                    }
                    aVar.mo42219c(zzby);
                } else {
                    this.f41859b.mo42219c(zzby.ENUM_FAILURE);
                }
            }
        }
    }
}
