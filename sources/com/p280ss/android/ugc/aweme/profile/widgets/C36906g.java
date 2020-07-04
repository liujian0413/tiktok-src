package com.p280ss.android.ugc.aweme.profile.widgets;

import com.p280ss.android.ugc.aweme.profile.viewmodel.ProfileState;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.reflect.C7585d;
import kotlin.reflect.C7599l;

/* renamed from: com.ss.android.ugc.aweme.profile.widgets.g */
final /* synthetic */ class C36906g extends PropertyReference1 {

    /* renamed from: a */
    public static final C7599l f96718a = new C36906g();

    C36906g() {
    }

    public final String getName() {
        return "currentDownloadSetting";
    }

    public final C7585d getOwner() {
        return C7575l.m23595a(ProfileState.class);
    }

    public final String getSignature() {
        return "getCurrentDownloadSetting()Ljava/lang/Integer;";
    }

    public final Object get(Object obj) {
        return ((ProfileState) obj).getCurrentDownloadSetting();
    }
}
