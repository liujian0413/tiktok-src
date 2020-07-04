package com.p280ss.android.ugc.aweme.user;

import java.util.function.Predicate;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;

/* renamed from: com.ss.android.ugc.aweme.user.e */
final class C42833e implements Predicate {

    /* renamed from: a */
    private final /* synthetic */ C7562b f111310a;

    C42833e(C7562b bVar) {
        this.f111310a = bVar;
    }

    public final /* synthetic */ boolean test(Object obj) {
        Object invoke = this.f111310a.invoke(obj);
        C7573i.m23582a(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
