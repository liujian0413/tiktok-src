package com.p280ss.android.ugc.aweme.effect.p1197c.p1199b;

import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.effect.c.b.c */
public abstract class C27417c<Param, Target> {

    /* renamed from: a */
    private final C27415a f72336a;

    public C27417c() {
        this(null, 1, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract C27416b<Param, Target> mo70530a(Param param, String str);

    private C27417c(C27415a aVar) {
        C7573i.m23587b(aVar, "idGenerator");
        this.f72336a = aVar;
    }

    /* renamed from: a */
    public final C27416b<Param, Target> mo70529a(Param param) {
        return mo70530a(param, this.f72336a.mo70522a());
    }

    public /* synthetic */ C27417c(C27415a aVar, int i, C7571f fVar) {
        this(new C27420f());
    }
}
