package com.bytedance.jedi.model.p604f;

import kotlin.jvm.internal.C7573i;
import p346io.reactivex.internal.util.C47840h;

/* renamed from: com.bytedance.jedi.model.f.a */
public final class C11819a implements C11821c {

    /* renamed from: a */
    private final C47840h<C11821c> f31614a = new C47840h<>(32);

    /* renamed from: a */
    public final void mo29370a() {
        T[] tArr = this.f31614a.f122627e;
        C7573i.m23582a((Object) tArr, "hashSet.keys()");
        for (T t : tArr) {
            if (t instanceof C11821c) {
                ((C11821c) t).mo29370a();
                this.f31614a.mo119917b(t);
            }
        }
    }

    /* renamed from: a */
    public final void mo29371a(C11821c cVar) {
        C7573i.m23587b(cVar, "receipt");
        this.f31614a.mo119916a(cVar);
    }
}
