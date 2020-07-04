package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.h */
final /* synthetic */ class C35970h extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f94144a = new C35970h();

    C35970h() {
    }

    public final String getName() {
        return "aweme";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(AwemeState.class);
    }

    public final String getSignature() {
        return "getAweme()Lcom/ss/android/ugc/aweme/feed/model/Aweme;";
    }

    public final Object get(Object obj) {
        return ((AwemeState) obj).getAweme();
    }
}
