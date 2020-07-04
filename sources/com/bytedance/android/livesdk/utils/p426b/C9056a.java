package com.bytedance.android.livesdk.utils.p426b;

import java.util.concurrent.TimeUnit;
import org.p361a.C7704b;
import p346io.reactivex.C7329e;
import p346io.reactivex.C7499z;
import p346io.reactivex.internal.operators.flowable.C47714o;
import p346io.reactivex.internal.operators.flowable.C47738z;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p350f.C7332a;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.utils.b.a */
public final class C9056a<T> {

    /* renamed from: a */
    private C7329e<T> f24718a;

    private C9056a(C7329e<T> eVar) {
        this.f24718a = eVar;
    }

    /* renamed from: a */
    public static <T> C9056a<T> m27043a(C7329e<T> eVar) {
        return new C9056a<>(eVar);
    }

    /* renamed from: a */
    public final C7329e<T> mo22247a(C7327h<? super C7329e<Throwable>, ? extends C7704b<?>> hVar) {
        C7364b.m23081a(hVar, "handler is null");
        return C7332a.m23015a((C7329e<T>) new C47738z<T>(this.f24718a, hVar));
    }

    /* renamed from: a */
    public static C7329e<Long> m27045a(long j, TimeUnit timeUnit) {
        return m27044a(1, 1, timeUnit, C7333a.m23042a());
    }

    /* renamed from: a */
    private static C7329e<Long> m27044a(long j, long j2, TimeUnit timeUnit, C7499z zVar) {
        C7364b.m23081a(timeUnit, "unit is null");
        C7364b.m23081a(zVar, "scheduler is null");
        C47714o oVar = new C47714o(Math.max(0, j), Math.max(0, j2), timeUnit, zVar);
        return C7332a.m23015a((C7329e<T>) oVar);
    }
}
