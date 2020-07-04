package com.p280ss.android.ugc.aweme.profile.widgets;

import com.p280ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.d */
final /* synthetic */ class C36903d extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f96715a = new C36903d();

    C36903d() {
    }

    public final String getName() {
        return "isPostAwemeEmpty";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(ProfileState.class);
    }

    public final String getSignature() {
        return "isPostAwemeEmpty()Ljava/lang/Boolean;";
    }

    public final Object get(Object obj) {
        return ((ProfileState) obj).isPostAwemeEmpty();
    }
}
