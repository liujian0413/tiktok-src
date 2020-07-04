package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.internal.ads.zzbo.zza.C16247a;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.atomic.AtomicReference;

public final class bex extends bfw {

    /* renamed from: d */
    private static bfx<String> f41822d = new bfx<>();

    /* renamed from: e */
    private final Context f41823e;

    public bex(beh beh, String str, String str2, C16247a aVar, int i, int i2, Context context) {
        super(beh, str, str2, aVar, i, 29);
        this.f41823e = context;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo40578a() throws IllegalAccessException, InvocationTargetException {
        this.f41859b.mo42223d("E");
        AtomicReference a = f41822d.mo40586a(this.f41823e.getPackageName());
        if (a.get() == null) {
            synchronized (a) {
                if (a.get() == null) {
                    a.set((String) this.f41860c.invoke(null, new Object[]{this.f41823e}));
                }
            }
        }
        String str = (String) a.get();
        synchronized (this.f41859b) {
            this.f41859b.mo42223d(azd.m47844a(str.getBytes(), true));
        }
    }
}
