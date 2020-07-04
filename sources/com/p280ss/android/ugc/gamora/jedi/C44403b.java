package com.p280ss.android.ugc.gamora.jedi;

import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.gamora.jedi.b */
public class C44403b<T> {

    /* renamed from: a */
    public boolean f114665a;

    /* renamed from: b */
    public final T f114666b;

    public C44403b(T t) {
        this.f114666b = t;
    }

    /* renamed from: a */
    public final void mo106827a(C7562b<? super T, C7581n> bVar) {
        C7573i.m23587b(bVar, "block");
        if (!this.f114665a) {
            this.f114665a = true;
            bVar.invoke(this.f114666b);
        }
    }
}
