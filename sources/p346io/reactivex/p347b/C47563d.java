package p346io.reactivex.p347b;

import p346io.reactivex.internal.disposables.EmptyDisposable;
import p346io.reactivex.internal.p352a.C7342a;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p348d.C7323a;

/* renamed from: io.reactivex.b.d */
public final class C47563d {
    /* renamed from: b */
    public static C7321c m148351b() {
        return EmptyDisposable.INSTANCE;
    }

    /* renamed from: a */
    public static C7321c m148348a() {
        return m148350a(C7342a.f20428b);
    }

    /* renamed from: a */
    public static C7321c m148349a(C7323a aVar) {
        C7364b.m23081a(aVar, "run is null");
        return new C47561a(aVar);
    }

    /* renamed from: a */
    public static C7321c m148350a(Runnable runnable) {
        C7364b.m23081a(runnable, "run is null");
        return new C47565f(runnable);
    }
}
