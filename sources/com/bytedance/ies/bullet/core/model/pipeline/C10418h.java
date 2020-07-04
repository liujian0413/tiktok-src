package com.bytedance.ies.bullet.core.model.pipeline;

import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import kotlin.jvm.p357a.C7563m;

/* renamed from: com.bytedance.ies.bullet.core.model.pipeline.h */
public final class C10418h<T> implements C10409c<T> {
    /* renamed from: a */
    public final void mo25206a(boolean z, C10410d<T> dVar, T t, C7563m<? super ResolvePolicy, ? super T, C7581n> mVar, C7562b<? super Throwable, C7581n> bVar) {
        C7573i.m23587b(dVar, "processor");
        C7573i.m23587b(mVar, "resolve");
        C7573i.m23587b(bVar, "reject");
        mVar.invoke(ResolvePolicy.CONTINUE, t);
    }

    /* renamed from: a */
    public final void mo25205a(boolean z, C10410d<T> dVar, T t, Throwable th, C7563m<? super ResolvePolicy, ? super T, C7581n> mVar, C7562b<? super Throwable, C7581n> bVar) {
        C7573i.m23587b(dVar, "processor");
        C7573i.m23587b(th, "t");
        C7573i.m23587b(mVar, "resolve");
        C7573i.m23587b(bVar, "reject");
        bVar.invoke(th);
    }
}
