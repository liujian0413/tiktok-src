package com.bytedance.android.live.core.rxutils;

import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.internal.operators.observable.C47778ao;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p350f.C7332a;

/* renamed from: com.bytedance.android.live.core.rxutils.j */
public final class C3302j {
    /* renamed from: a */
    public static final <T> C7492s<T> m12365a(C7492s<T> sVar, C7327h<? super C7492s<Throwable>, ? extends C7496w<?>> hVar) {
        C7573i.m23587b(sVar, "$this$retryWhenCompat");
        C7573i.m23587b(hVar, "handler");
        C7364b.m23081a(hVar, "handler is null");
        C7492s<T> a = C7332a.m23018a((C7492s<T>) new C47778ao<T>(sVar, hVar));
        C7573i.m23582a((Object) a, "RxJavaPlugins.onAssembly…ryWhen<T>(this, handler))");
        return a;
    }
}
