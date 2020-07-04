package com.p280ss.android.ugc.aweme.following.p1265ui.viewholder;

import com.p280ss.android.ugc.aweme.user.repository.UserState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.b */
final /* synthetic */ class C29802b extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f78359a = new C29802b();

    C29802b() {
    }

    public final String getName() {
        return "followStatus";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(UserState.class);
    }

    public final String getSignature() {
        return "getFollowStatus()Lcom/bytedance/jedi/arch/Async;";
    }

    public final Object get(Object obj) {
        return ((UserState) obj).getFollowStatus();
    }
}
