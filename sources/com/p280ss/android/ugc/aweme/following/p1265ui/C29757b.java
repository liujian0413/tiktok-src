package com.p280ss.android.ugc.aweme.following.p1265ui;

import com.p280ss.android.ugc.aweme.following.p1265ui.viewmodel.FollowRelationState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.following.ui.b */
final /* synthetic */ class C29757b extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f78293a = new C29757b();

    C29757b() {
    }

    public final String getName() {
        return "fanCount";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(FollowRelationState.class);
    }

    public final String getSignature() {
        return "getFanCount()I";
    }

    public final Object get(Object obj) {
        return Integer.valueOf(((FollowRelationState) obj).getFanCount());
    }
}
