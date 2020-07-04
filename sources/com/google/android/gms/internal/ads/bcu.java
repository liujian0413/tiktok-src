package com.google.android.gms.internal.ads;

import android.content.ComponentName;
import android.support.customtabs.C0212b;
import android.support.customtabs.C0221d;
import java.lang.ref.WeakReference;

public final class bcu extends C0221d {

    /* renamed from: a */
    private WeakReference<bcv> f41482a;

    public bcu(bcv bcv) {
        this.f41482a = new WeakReference<>(bcv);
    }

    /* renamed from: a */
    public final void mo649a(ComponentName componentName, C0212b bVar) {
        bcv bcv = (bcv) this.f41482a.get();
        if (bcv != null) {
            bcv.mo40513a(bVar);
        }
    }

    public final void onServiceDisconnected(ComponentName componentName) {
        bcv bcv = (bcv) this.f41482a.get();
        if (bcv != null) {
            bcv.mo40512a();
        }
    }
}
