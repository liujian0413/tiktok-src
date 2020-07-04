package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.xj */
public final class C16166xj {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public WeakHashMap<Context, C16168xl> f45397a = new WeakHashMap<>();

    /* renamed from: a */
    public final Future<C16164xh> mo42064a(Context context) {
        return acj.m45509a((Callable<T>) new C16167xk<T>(this, context));
    }
}
