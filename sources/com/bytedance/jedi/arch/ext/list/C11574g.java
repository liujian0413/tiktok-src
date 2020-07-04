package com.bytedance.jedi.arch.ext.list;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.bytedance.jedi.arch.ext.list.g */
final /* synthetic */ class C11574g extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f31248a = new C11574g();

    C11574g() {
    }

    public final String getName() {
        return "isEmpty";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(ListState.class);
    }

    public final String getSignature() {
        return "isEmpty()Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;";
    }

    public final Object get(Object obj) {
        return ((ListState) obj).isEmpty();
    }
}
