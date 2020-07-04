package com.bytedance.jedi.arch.ext.list;

import java.util.List;
import kotlin.Pair;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import p346io.reactivex.C7319aa;
import p346io.reactivex.C7492s;

public final class SimpleListMiddlewareKt$SingleListMiddleware$1 extends Lambda implements C7562b<S, C7492s<Pair<? extends List<? extends T>, ? extends C11583n>>> {
    final /* synthetic */ C7562b $actualRefresh;

    public SimpleListMiddlewareKt$SingleListMiddleware$1(C7562b bVar) {
        this.$actualRefresh = bVar;
        super(1);
    }

    public final C7492s<Pair<List<T>, C11583n>> invoke(S s) {
        C7573i.m23587b(s, "it");
        C7492s<Pair<List<T>, C11583n>> b = ((C7319aa) this.$actualRefresh.invoke(s)).mo19136b();
        C7573i.m23582a((Object) b, "actualRefresh(it).toObservable()");
        return b;
    }
}
