package com.bytedance.android.live.core.rxutils.rxlifecycle;

import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import com.bytedance.android.live.core.rxutils.rxlifecycle.p156a.C3320c;
import p346io.reactivex.C7492s;
import p346io.reactivex.C7497x;

/* renamed from: com.bytedance.android.live.core.rxutils.rxlifecycle.a */
public final class C3317a<V> {

    /* renamed from: a */
    private final C7492s<V> f10051a;

    private C3317a(C7492s<V> sVar) {
        this.f10051a = sVar;
    }

    /* renamed from: a */
    public static <T> C3317a<T> m12393a(C7492s<T> sVar) {
        return new C3317a<>(sVar);
    }

    /* renamed from: a */
    public final <T> C7497x<T, T> mo10216a(V v) {
        m12394a(v, "event == null");
        return new C3320c(this.f10051a, v);
    }

    /* renamed from: a */
    public static C3317a<LifecycleEvent> m12392a(C0608j jVar) {
        BindingFragment bindingFragment = (BindingFragment) jVar.mo2644a("_LIFECYCLE_BINDING_FRAGMENT_");
        if (bindingFragment == null) {
            bindingFragment = new BindingFragment();
            C0633q a = jVar.mo2645a();
            a.mo2588a((Fragment) bindingFragment, "_LIFECYCLE_BINDING_FRAGMENT_");
            a.mo2606d();
        } else if (bindingFragment.mDetached) {
            C0633q a2 = jVar.mo2645a();
            a2.mo2608e(bindingFragment);
            a2.mo2606d();
        }
        return m12393a((C7492s<T>) bindingFragment.f10050a);
    }

    /* renamed from: a */
    private static <T> T m12394a(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(str);
    }
}
