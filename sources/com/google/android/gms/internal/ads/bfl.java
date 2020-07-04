package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

public final class bfl extends bfw {

    /* renamed from: d */
    private List<Long> f41839d;

    public bfl(beh beh, String str, String str2, C16247a aVar, int i, int i2) {
        super(beh, str, str2, aVar, i, 31);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40578a() throws IllegalAccessException, InvocationTargetException {
        this.f41859b.mo42237m(-1);
        this.f41859b.mo42238n(-1);
        if (this.f41839d == null) {
            this.f41839d = (List) this.f41860c.invoke(null, new Object[]{this.f41858a.f41760a});
        }
        if (this.f41839d != null && this.f41839d.size() == 2) {
            synchronized (this.f41859b) {
                this.f41859b.mo42237m(((Long) this.f41839d.get(0)).longValue());
                this.f41859b.mo42238n(((Long) this.f41839d.get(1)).longValue());
            }
        }
    }
}
