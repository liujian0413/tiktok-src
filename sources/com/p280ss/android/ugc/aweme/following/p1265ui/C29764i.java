package com.p280ss.android.ugc.aweme.following.p1265ui;

import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowerRelationState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.i */
final /* synthetic */ class C29764i extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f78300a = new C29764i();

    C29764i() {
    }

    public final String getName() {
        return "listState";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(FollowerRelationState.class);
    }

    public final String getSignature() {
        return "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;";
    }

    public final Object get(Object obj) {
        return ((FollowerRelationState) obj).getListState();
    }
}
