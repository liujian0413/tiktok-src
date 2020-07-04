package com.bytedance.jedi.arch.ext.list;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.bytedance.jedi.arch.ext.list.i */
final /* synthetic */ class C11576i extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f31250a = new C11576i();

    C11576i() {
    }

    public final String getName() {
        return "loadMore";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(ListState.class);
    }

    public final String getSignature() {
        return "getLoadMore()Lcom/bytedance/jedi/arch/Async;";
    }

    public final Object get(Object obj) {
        return ((ListState) obj).getLoadMore();
    }
}
