package com.p280ss.android.ugc.aweme.profile.widgets;

import com.p280ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.h */
final /* synthetic */ class C36907h extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f96719a = new C36907h();

    C36907h() {
    }

    public final String getName() {
        return "onHiddenChanged";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(ProfileState.class);
    }

    public final String getSignature() {
        return "getOnHiddenChanged()Z";
    }

    public final Object get(Object obj) {
        return Boolean.valueOf(((ProfileState) obj).getOnHiddenChanged());
    }
}
