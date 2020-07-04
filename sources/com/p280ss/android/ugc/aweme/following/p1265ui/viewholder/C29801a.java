package com.p280ss.android.ugc.aweme.following.p1265ui.viewholder;

import com.p280ss.android.ugc.aweme.user.repository.UserState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.viewholder.a */
final /* synthetic */ class C29801a extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f78358a = new C29801a();

    C29801a() {
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
