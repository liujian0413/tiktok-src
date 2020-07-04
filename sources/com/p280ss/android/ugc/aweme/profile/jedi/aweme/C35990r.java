package com.p280ss.android.ugc.aweme.profile.jedi.aweme;

import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.aweme.r */
final /* synthetic */ class C35990r extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f94171a = new C35990r();

    C35990r() {
    }

    public final String getName() {
        return "awemeDraft";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(AwemeDraftState.class);
    }

    public final String getSignature() {
        return "getAwemeDraft()Lcom/ss/android/ugc/aweme/draft/model/AwemeDraft;";
    }

    public final Object get(Object obj) {
        return ((AwemeDraftState) obj).getAwemeDraft();
    }
}
