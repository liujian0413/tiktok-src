package com.p280ss.android.ugc.aweme.follow.recommend.follow.view;

import com.p280ss.android.ugc.aweme.user.repository.UserState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.follow.recommend.follow.view.d */
final /* synthetic */ class C29514d extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f77816a = new C29514d();

    C29514d() {
    }

    public final String getName() {
        return "user";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(UserState.class);
    }

    public final String getSignature() {
        return "getUser()Lcom/ss/android/ugc/aweme/profile/model/User;";
    }

    public final Object get(Object obj) {
        return ((UserState) obj).getUser();
    }
}
