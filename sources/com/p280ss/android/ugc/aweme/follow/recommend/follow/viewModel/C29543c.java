package com.p280ss.android.ugc.aweme.follow.recommend.follow.viewModel;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.viewModel.c */
final /* synthetic */ class C29543c extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f77852a = new C29543c();

    C29543c() {
    }

    public final String getName() {
        return "listState";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(RecommendFollowState.class);
    }

    public final String getSignature() {
        return "getListState()Lcom/bytedance/jedi/arch/ext/list/ListState;";
    }

    public final Object get(Object obj) {
        return ((RecommendFollowState) obj).getListState();
    }
}
