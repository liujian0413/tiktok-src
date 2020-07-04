package com.p280ss.android.ugc.aweme.following.p1265ui;

import com.bytedance.jedi.arch.ext.list.C11579l;
import com.p280ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.q */
final /* synthetic */ class C29772q extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f78307a = new C29772q();

    C29772q() {
    }

    public final String getName() {
        return "list";
    }

    public final C7585d getOwner() {
        return C7575l.m23596a(C11579l.class, "main_musicallyI18nRelease");
    }

    public final String getSignature() {
        return "getList(Lcom/bytedance/jedi/arch/ext/list/IListState;)Ljava/util/List;";
    }

    public final Object get(Object obj) {
        return C11579l.m34041a((RecommendUserListState) obj);
    }
}
