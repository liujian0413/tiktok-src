package com.google.android.gms.internal.ads;

import android.provider.Settings.SettingNotFoundException;
import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import java.lang.reflect.InvocationTargetException;

public final class bew extends bfw {
    public bew(beh beh, String str, String str2, C16247a aVar, int i, int i2) {
        super(beh, str, str2, aVar, i, 49);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40578a() throws IllegalAccessException, InvocationTargetException {
        this.f41859b.mo42216b(zzby.ENUM_FAILURE);
        try {
            this.f41859b.mo42216b(((Boolean) this.f41860c.invoke(null, new Object[]{this.f41858a.f41760a})).booleanValue() ? zzby.ENUM_TRUE : zzby.ENUM_FALSE);
        } catch (InvocationTargetException e) {
            if (!(e.getTargetException() instanceof SettingNotFoundException)) {
                throw e;
            }
        }
    }
}
