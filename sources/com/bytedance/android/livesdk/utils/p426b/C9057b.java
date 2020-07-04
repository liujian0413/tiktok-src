package com.bytedance.android.livesdk.utils.p426b;

import com.bytedance.android.livesdkapi.p458j.C9488a;
import java.util.Collection;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7496w;
import p346io.reactivex.C7499z;
import p346io.reactivex.internal.operators.observable.C47773af;
import p346io.reactivex.internal.operators.observable.C47778ao;
import p346io.reactivex.internal.operators.observable.C47783i;
import p346io.reactivex.internal.operators.observable.C7385ae;
import p346io.reactivex.internal.operators.observable.C7400an;
import p346io.reactivex.internal.p352a.C7342a;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p348d.C7328l;
import p346io.reactivex.p350f.C7332a;
import p346io.reactivex.p351i.C7333a;

/* renamed from: com.bytedance.android.livesdk.utils.b.b */
public final class C9057b<T> {

    /* renamed from: a */
    private C7492s<T> f24719a;

    /* renamed from: a */
    public final C7492s<T> mo22249a(long j) {
        return m27052a(j, C7342a.m23063c());
    }

    /* renamed from: a */
    public final C7492s<T> mo22250a(C7327h<C7492s<Throwable>, C7496w<?>> hVar) {
        return C7332a.m23018a((C7492s<T>) new C47778ao<T>(this.f24719a, hVar));
    }

    /* renamed from: a */
    public final C7492s<T> mo22248a() {
        return (C7492s) C9488a.m28006a(C9488a.m28007a("io.reactivex.internal.operators.observable.ObservablePublish", "create", this.f24719a), "refCount", new Object[0]);
    }

    private C9057b(C7492s<T> sVar) {
        this.f24719a = sVar;
    }

    /* renamed from: a */
    public static <T> C9057b<T> m27047a(C7492s<T> sVar) {
        return new C9057b<>(sVar);
    }

    /* renamed from: b */
    public final <K> C7492s<T> mo22251b(C7327h<? super T, K> hVar) {
        return m27054a(hVar, C7342a.m23064d());
    }

    /* renamed from: a */
    private C7492s<T> m27052a(long j, C7328l<? super Throwable> lVar) {
        if (j >= 0) {
            C7364b.m23081a(lVar, "predicate is null");
            return C7332a.m23018a((C7492s<T>) new C7400an<T>(this.f24719a, j, lVar));
        }
        StringBuilder sb = new StringBuilder("times >= 0 required but it was ");
        sb.append(j);
        throw new IllegalArgumentException(sb.toString());
    }

    /* renamed from: a */
    public static C7492s<Long> m27053a(long j, TimeUnit timeUnit) {
        return m27051a(j, j, timeUnit, C7333a.m23042a());
    }

    /* renamed from: a */
    private <K> C7492s<T> m27054a(C7327h<? super T, K> hVar, Callable<? extends Collection<? super K>> callable) {
        C7364b.m23081a(hVar, "keySelector is null");
        C7364b.m23081a(callable, "collectionSupplier is null");
        return C7332a.m23018a((C7492s<T>) new C47783i<T>(this.f24719a, hVar, callable));
    }

    /* renamed from: a */
    public static C7492s<Long> m27050a(long j, long j2, TimeUnit timeUnit) {
        return m27051a(0, j2, timeUnit, C7333a.m23042a());
    }

    /* renamed from: a */
    private static C7492s<Long> m27051a(long j, long j2, TimeUnit timeUnit, C7499z zVar) {
        C7364b.m23081a(timeUnit, "unit is null");
        C7364b.m23081a(zVar, "scheduler is null");
        C7385ae aeVar = new C7385ae(Math.max(0, j), Math.max(0, j2), timeUnit, zVar);
        return C7332a.m23018a((C7492s<T>) aeVar);
    }

    /* renamed from: a */
    public static C7492s<Long> m27048a(long j, long j2, long j3, long j4, TimeUnit timeUnit) {
        return m27049a(0, 10, 1000, 1000, timeUnit, C7333a.m23042a());
    }

    /* renamed from: a */
    private static C7492s<Long> m27049a(long j, long j2, long j3, long j4, TimeUnit timeUnit, C7499z zVar) {
        long j5 = j2;
        long j6 = j3;
        TimeUnit timeUnit2 = timeUnit;
        C7499z zVar2 = zVar;
        if (j5 < 0) {
            StringBuilder sb = new StringBuilder("count >= 0 required but it was ");
            sb.append(j5);
            throw new IllegalArgumentException(sb.toString());
        } else if (j5 == 0) {
            return C7492s.m23303c().mo19285a(j6, timeUnit2, zVar2);
        } else {
            long j7 = (j5 - 1) + j;
            if (j <= 0 || j7 >= 0) {
                C7364b.m23081a(timeUnit2, "unit is null");
                C7364b.m23081a(zVar2, "scheduler is null");
                C47773af afVar = new C47773af(j, j7, Math.max(0, j6), Math.max(0, j4), timeUnit, zVar);
                return C7332a.m23018a((C7492s<T>) afVar);
            }
            throw new IllegalArgumentException("Overflow! start + count is bigger than Long.MAX_VALUE");
        }
    }
}
