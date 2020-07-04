package com.p280ss.android.ugc.aweme.favorites.model;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.d */
final /* synthetic */ class C27766d extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f73210a = new C27766d();

    C27766d() {
    }

    public final String getName() {
        return "listState";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(PoiCollectListState.class);
    }

    public final String getSignature() {
        return "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;";
    }

    public final Object get(Object obj) {
        return ((PoiCollectListState) obj).getListState();
    }
}
