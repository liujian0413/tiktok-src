package com.bytedance.jedi.arch.ext.list;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.bytedance.jedi.arch.ext.list.e */
final /* synthetic */ class C11572e extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f31246a = new C11572e();

    C11572e() {
    }

    public final String getName() {
        return "payload";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(ListState.class);
    }

    public final String getSignature() {
        return "getPayload()Lcom/bytedance/jedi/arch/ext/list/Payload;";
    }

    public final Object get(Object obj) {
        return ((ListState) obj).getPayload();
    }
}
