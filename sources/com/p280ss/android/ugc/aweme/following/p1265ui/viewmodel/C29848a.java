package com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewmodel.a */
final /* synthetic */ class C29848a extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f78420a = new C29848a();

    C29848a() {
    }

    public final String getName() {
        return "listState";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(ConnectedRelationState.class);
    }

    public final String getSignature() {
        return "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;";
    }

    public final Object get(Object obj) {
        return ((ConnectedRelationState) obj).getListState();
    }
}
