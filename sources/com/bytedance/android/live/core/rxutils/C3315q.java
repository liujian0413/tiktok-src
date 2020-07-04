package com.bytedance.android.live.core.rxutils;

import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C47557ad;
import p346io.reactivex.C7319aa;
import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.p350f.C7332a;

/* renamed from: com.bytedance.android.live.core.rxutils.q */
public final class C3315q {

    /* renamed from: a */
    public static final C3315q f10048a = new C3315q();

    /* renamed from: b */
    private static final C7319aa<Object> f10049b = new C3316a();

    /* renamed from: com.bytedance.android.live.core.rxutils.q$a */
    static final class C3316a extends C7319aa<Object> {
        /* renamed from: a */
        public final void mo10199a(C47557ad<? super Object> adVar) {
            C7573i.m23587b(adVar, "observer");
            adVar.onSubscribe(EmptyDisposable.NEVER);
        }
    }

    private C3315q() {
    }

    /* renamed from: a */
    public static <T> C7319aa<T> m12390a() {
        C7319aa<Object> aaVar = f10049b;
        if (aaVar != null) {
            C7319aa<T> a = C7332a.m23011a(aaVar);
            C7573i.m23582a((Object) a, "RxJavaPlugins.onAssembly…ER_INSTANCE as Single<T>)");
            return a;
        }
        throw new TypeCastException("null cannot be cast to non-null type io.reactivex.Single<T>");
    }
}
