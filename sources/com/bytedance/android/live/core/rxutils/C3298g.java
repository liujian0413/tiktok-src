package com.bytedance.android.live.core.rxutils;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7499z;
import p346io.reactivex.internal.operators.observable.C7385ae;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p350f.C7332a;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.live.core.rxutils.g */
public final class C3298g {

    /* renamed from: a */
    public static final C3298g f10030a = new C3298g();

    private C3298g() {
    }

    /* renamed from: a */
    public final C7492s<Long> mo10214a(long j, long j2, TimeUnit timeUnit) {
        C7573i.m23587b(timeUnit, "unit");
        C7499z a = C7333a.m23042a();
        C7573i.m23582a((Object) a, "Schedulers.computation()");
        return m12359a(0, 1, timeUnit, a);
    }

    /* renamed from: a */
    private static C7492s<Long> m12359a(long j, long j2, TimeUnit timeUnit, C7499z zVar) {
        C7573i.m23587b(timeUnit, "unit");
        C7573i.m23587b(zVar, "scheduler");
        C7364b.m23081a(timeUnit, "unit is null");
        C7364b.m23081a(zVar, "scheduler is null");
        C7385ae aeVar = new C7385ae(Math.max(0, j), Math.max(0, j2), timeUnit, zVar);
        C7492s<Long> a = C7332a.m23018a((C7492s<T>) aeVar);
        C7573i.m23582a((Object) a, "RxJavaPlugins.onAssembly…eriod), unit, scheduler))");
        return a;
    }
}
