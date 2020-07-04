package com.bytedance.android.live.core.rxutils;

import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7498y;
import p346io.reactivex.p347b.C7321c;

/* renamed from: com.bytedance.android.live.core.rxutils.p */
public class C3314p<T> implements C7498y<T> {
    public void onComplete() {
    }

    public void onError(Throwable th) {
        C7573i.m23587b(th, "e");
    }

    public void onNext(T t) {
    }

    public void onSubscribe(C7321c cVar) {
        C7573i.m23587b(cVar, "d");
    }
}
