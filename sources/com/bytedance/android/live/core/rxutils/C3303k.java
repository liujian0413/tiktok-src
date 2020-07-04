package com.bytedance.android.live.core.rxutils;

import android.support.p022v4.app.Fragment;
import com.bytedance.android.live.core.rxutils.rxlifecycle.C3317a;
import com.bytedance.android.live.core.rxutils.rxlifecycle.LifecycleEvent;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;
import p346io.reactivex.internal.util.C47836e;
import p346io.reactivex.p348d.C47571i;
import p346io.reactivex.p348d.C47572j;
import p346io.reactivex.p348d.C7324c;
import p346io.reactivex.p348d.C7326g;
import p346io.reactivex.p348d.C7327h;

/* renamed from: com.bytedance.android.live.core.rxutils.k */
public final class C3303k {

    /* renamed from: a */
    public static final Object f10035a = new Object();

    /* renamed from: b */
    private static C7326g<Throwable> f10036b = C3304l.f10038a;

    /* renamed from: c */
    private static C7326g<Object> f10037c = C3305m.f10039a;

    /* renamed from: b */
    public static C7326g<Throwable> m12377b() {
        return f10036b;
    }

    /* renamed from: c */
    public static C7326g<Object> m12378c() {
        return f10037c;
    }

    /* renamed from: a */
    public static <T1, T2, T3, T4, R> R m12375a(C47572j<T1, T2, T3, T4, R> jVar, T1 t1, T2 t2, T3 t3, T4 t4) {
        try {
            return jVar.mo9996a(t1, t2, t3, t4);
        } catch (Throwable th) {
            throw C47836e.m148716a(th);
        }
    }

    /* renamed from: a */
    public static <T> void m12376a(C7326g<T> gVar, T t) {
        try {
            gVar.accept(t);
        } catch (Throwable th) {
            throw C47836e.m148716a(th);
        }
    }

    /* renamed from: a */
    public static <T> C3297f<T> m12366a() {
        return new C3297f<>();
    }

    /* renamed from: a */
    public static C3299h m12367a(int i) {
        return m12368a(3, 500);
    }

    /* renamed from: a */
    public static <T> C7497x<T, T> m12369a(Fragment fragment) {
        return m12370a(fragment, LifecycleEvent.DESTROY);
    }

    /* renamed from: a */
    public static <T> C7497x<T, T> m12371a(RxViewModel rxViewModel) {
        return C3317a.m12393a((C7492s<T>) rxViewModel.f9946i).mo10216a(LifecycleEvent.DESTROY);
    }

    /* renamed from: a */
    private static C3299h m12368a(int i, long j) {
        return new C3299h(i, 500);
    }

    /* renamed from: a */
    private static <T> C7497x<T, T> m12370a(Fragment fragment, LifecycleEvent lifecycleEvent) {
        return C3317a.m12392a(fragment.getChildFragmentManager()).mo10216a(lifecycleEvent);
    }

    /* renamed from: a */
    public static <T, R> R m12373a(C7327h<T, R> hVar, T t) {
        try {
            return hVar.apply(t);
        } catch (Throwable th) {
            throw C47836e.m148716a(th);
        }
    }

    /* renamed from: a */
    public static <T, U, R> R m12372a(C7324c<T, U, R> cVar, T t, U u) {
        try {
            return cVar.apply(t, u);
        } catch (Throwable th) {
            throw C47836e.m148716a(th);
        }
    }

    /* renamed from: a */
    public static <T1, T2, T3, R> R m12374a(C47571i<T1, T2, T3, R> iVar, T1 t1, T2 t2, T3 t3) {
        try {
            return iVar.mo9995a(t1, t2, t3);
        } catch (Throwable th) {
            throw C47836e.m148716a(th);
        }
    }
}
