package com.p280ss.android.ugc.aweme.following.p1265ui;

import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowRelationState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.k */
final /* synthetic */ class C29766k extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f78301a = new C29766k();

    C29766k() {
    }

    public final String getName() {
        return "isSearching";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(FollowRelationState.class);
    }

    public final String getSignature() {
        return "isSearching()Z";
    }

    public final Object get(Object obj) {
        return Boolean.valueOf(((FollowRelationState) obj).isSearching());
    }
}
