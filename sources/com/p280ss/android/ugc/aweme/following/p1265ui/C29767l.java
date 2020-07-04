package com.p280ss.android.ugc.aweme.following.p1265ui;

import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowingRelationState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.l */
final /* synthetic */ class C29767l extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f78302a = new C29767l();

    C29767l() {
    }

    public final String getName() {
        return "listState";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(FollowingRelationState.class);
    }

    public final String getSignature() {
        return "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;";
    }

    public final Object get(Object obj) {
        return ((FollowingRelationState) obj).getListState();
    }
}
