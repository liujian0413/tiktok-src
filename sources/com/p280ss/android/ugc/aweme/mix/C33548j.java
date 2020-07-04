package com.p280ss.android.ugc.aweme.mix;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.mix.j */
final /* synthetic */ class C33548j extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f87611a = new C33548j();

    C33548j() {
    }

    public final String getName() {
        return "mixInfo";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(MixDetailState.class);
    }

    public final String getSignature() {
        return "getMixInfo()Lcom/bytedance/jedi/arch/Async;";
    }

    public final Object get(Object obj) {
        return ((MixDetailState) obj).getMixInfo();
    }
}
