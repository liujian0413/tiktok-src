package com.p280ss.android.ugc.aweme.mix;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.mix.m */
final /* synthetic */ class C33559m extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f87657a = new C33559m();

    C33559m() {
    }

    public final String getName() {
        return "listState";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(MixDetailState.class);
    }

    public final String getSignature() {
        return "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;";
    }

    public final Object get(Object obj) {
        return ((MixDetailState) obj).getListState();
    }
}
