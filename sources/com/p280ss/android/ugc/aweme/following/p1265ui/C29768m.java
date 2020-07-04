package com.p280ss.android.ugc.aweme.following.p1265ui;

import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowingRelationState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.m */
final /* synthetic */ class C29768m extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f78303a = new C29768m();

    C29768m() {
    }

    public final String getName() {
        return "recommendList";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(FollowingRelationState.class);
    }

    public final String getSignature() {
        return "getRecommendList()Ljava/util/List;";
    }

    public final Object get(Object obj) {
        return ((FollowingRelationState) obj).getRecommendList();
    }
}
