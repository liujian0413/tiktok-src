package com.bytedance.jedi.arch.ext.list;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.bytedance.jedi.arch.ext.list.j */
final /* synthetic */ class C11577j extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f31251a = new C11577j();

    C11577j() {
    }

    public final String getName() {
        return "list";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(ListState.class);
    }

    public final String getSignature() {
        return "getList()Ljava/util/List;";
    }

    public final Object get(Object obj) {
        return ((ListState) obj).getList();
    }
}
