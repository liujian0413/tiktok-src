package com.p280ss.android.ugc.aweme.profile.widgets;

import com.p280ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.f */
final /* synthetic */ class C36905f extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f96717a = new C36905f();

    C36905f() {
    }

    public final String getName() {
        return "from";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(ProfileState.class);
    }

    public final String getSignature() {
        return "getFrom()Ljava/lang/String;";
    }

    public final Object get(Object obj) {
        return ((ProfileState) obj).getFrom();
    }
}
