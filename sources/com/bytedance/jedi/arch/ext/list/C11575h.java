package com.bytedance.jedi.arch.ext.list;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.bytedance.jedi.arch.ext.list.h */
final /* synthetic */ class C11575h extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f31249a = new C11575h();

    C11575h() {
    }

    public final String getName() {
        return "refresh";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(ListState.class);
    }

    public final String getSignature() {
        return "getRefresh()Lcom/bytedance/jedi/arch/Async;";
    }

    public final Object get(Object obj) {
        return ((ListState) obj).getRefresh();
    }
}
