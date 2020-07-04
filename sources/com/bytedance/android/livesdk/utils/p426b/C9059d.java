package com.bytedance.android.livesdk.utils.p426b;

import org.p361a.C7704b;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7329e;
import p346io.reactivex.internal.operators.flowable.C47675ae;
import p346io.reactivex.internal.operators.p1872b.C47654r;
import p346io.reactivex.p348d.C7327h;
import p346io.reactivex.p350f.C7332a;

/* renamed from: com.bytedance.android.livesdk.utils.b.d */
public final class C9059d<T> {

    /* renamed from: a */
    private C7319aa<T> f24720a;

    /* renamed from: a */
    private C7329e<T> m27063a() {
        return C7332a.m23015a((C7329e<T>) new C47654r<T>(this.f24720a));
    }

    private C9059d(C7319aa<T> aaVar) {
        this.f24720a = aaVar;
    }

    /* renamed from: a */
    public static <T> C9059d<T> m27062a(C7319aa<T> aaVar) {
        return new C9059d<>(aaVar);
    }

    /* renamed from: a */
    public final C7319aa<T> mo22252a(C7327h<? super C7329e<Throwable>, ? extends C7704b<?>> hVar) {
        return C7332a.m23011a((C7319aa<T>) new C47675ae<T>(C9056a.m27043a(m27063a()).mo22247a(hVar), null));
    }
}
