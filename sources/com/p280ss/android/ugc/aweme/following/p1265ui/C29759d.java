package com.p280ss.android.ugc.aweme.following.p1265ui;

import com.bytedance.jedi.arch.ext.list.C11579l;
import com.p280ss.android.ugc.aweme.recommend.viewmodel.RecommendUserListState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.d */
final /* synthetic */ class C29759d extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f78295a = new C29759d();

    C29759d() {
    }

    public final String getName() {
        return "refresh";
    }

    public final C7585d getOwner() {
        return C7575l.m23596a(C11579l.class, "main_musicallyI18nRelease");
    }

    public final String getSignature() {
        return "getRefresh(Lcom/bytedance/jedi/arch/ext/list/IListState;)Lcom/bytedance/jedi/arch/Async;";
    }

    public final Object get(Object obj) {
        return C11579l.m34042b((RecommendUserListState) obj);
    }
}
