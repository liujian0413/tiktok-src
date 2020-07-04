package com.bytedance.jedi.arch.ext.list;

import java.util.List;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;

public final class ListMiddlewareLegeciesKt$SimpleListMiddleware$1 extends Lambda implements C7562b<List<? extends T>, List<? extends T>> {
    public static final ListMiddlewareLegeciesKt$SimpleListMiddleware$1 INSTANCE = new ListMiddlewareLegeciesKt$SimpleListMiddleware$1();

    public ListMiddlewareLegeciesKt$SimpleListMiddleware$1() {
        super(1);
    }

    public final List<T> invoke(List<? extends T> list) {
        C7573i.m23587b(list, "it");
        return list;
    }
}
