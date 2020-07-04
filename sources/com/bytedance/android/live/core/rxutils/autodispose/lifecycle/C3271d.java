package com.bytedance.android.live.core.rxutils.autodispose.lifecycle;

import java.util.Comparator;
import p346io.reactivex.p348d.C7328l;

/* renamed from: com.bytedance.android.live.core.rxutils.autodispose.lifecycle.d */
final /* synthetic */ class C3271d implements C7328l {

    /* renamed from: a */
    private final Comparator f9986a;

    /* renamed from: b */
    private final Object f9987b;

    C3271d(Comparator comparator, Object obj) {
        this.f9986a = comparator;
        this.f9987b = obj;
    }

    /* renamed from: a */
    public final boolean mo9283a(Object obj) {
        return C3270c.m12333a(this.f9986a, this.f9987b, obj);
    }
}
