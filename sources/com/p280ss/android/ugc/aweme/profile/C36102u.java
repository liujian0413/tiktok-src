package com.p280ss.android.ugc.aweme.profile;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.detail.operators.C26134am;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.AwemeListFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.C36675j;
import com.p280ss.android.ugc.aweme.profile.presenter.UserResponse;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.C7319aa;

/* renamed from: com.ss.android.ugc.aweme.profile.u */
public final class C36102u implements IProfileService {

    /* renamed from: a */
    public static final C36102u f94392a = new C36102u();

    /* renamed from: b */
    private final /* synthetic */ IProfileService f94393b;

    public final boolean needShowCompleteProfileGuide() {
        return this.f94393b.needShowCompleteProfileGuide();
    }

    public final boolean needShowCompleteProfileGuideBar() {
        return this.f94393b.needShowCompleteProfileGuideBar();
    }

    public final boolean needShowCompleteProfileGuideBarForFansDetail() {
        return this.f94393b.needShowCompleteProfileGuideBarForFansDetail();
    }

    public final AwemeListFragment newAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, Bundle bundle) {
        String str3 = str;
        C7573i.m23587b(str, "uid");
        Bundle bundle2 = bundle;
        C7573i.m23587b(bundle2, "args");
        return this.f94393b.newAwemeListFragment(i, i2, str3, str2, z, z2, bundle2);
    }

    public final AwemeListFragment newBasicAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2) {
        C7573i.m23587b(str, "uid");
        return this.f94393b.newBasicAwemeListFragment(i, i2, str, str2, z, z2);
    }

    public final C26134am newDetailPageOperator(C25673a<?, ?> aVar, boolean z, String str) {
        return this.f94393b.newDetailPageOperator(aVar, z, str);
    }

    public final AwemeListFragment newMTAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2) {
        C7573i.m23587b(str, "uid");
        return this.f94393b.newMTAwemeListFragment(i, i2, str, str2, z, z2);
    }

    public final void onFansDetailCompleteProfileGuideBarShow() {
        this.f94393b.onFansDetailCompleteProfileGuideBarShow();
    }

    public final void preloadProfile(FragmentActivity fragmentActivity, String str) {
        C7573i.m23587b(fragmentActivity, "activity");
        C7573i.m23587b(str, "pageName");
        this.f94393b.preloadProfile(fragmentActivity, str);
    }

    public final void showRemarkEditDialog(Context context, User user, String str, int i, Bundle bundle, C36675j jVar) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(user, "user");
        C7573i.m23587b(str, "defaultInput");
        this.f94393b.showRemarkEditDialog(context, user, str, i, bundle, jVar);
    }

    public final boolean showRemindUserCompleteProfileDialog(Context context, String str, String str2, OnDismissListener onDismissListener) {
        C7573i.m23587b(context, "context");
        return this.f94393b.showRemindUserCompleteProfileDialog(context, str, str2, onDismissListener);
    }

    public final boolean showRemindUserCompleteProfileDialogAfterFollow(Context context, String str, String str2, User user, int i) {
        C7573i.m23587b(context, "context");
        C7573i.m23587b(user, "user");
        return this.f94393b.showRemindUserCompleteProfileDialogAfterFollow(context, str, str2, user, i);
    }

    public final C7319aa<UserResponse> user(String str, String str2, String str3) {
        return this.f94393b.user(str, str2, str3);
    }

    private C36102u() {
        Object service = ServiceManager.get().getService(IProfileService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…ofileService::class.java)");
        this.f94393b = (IProfileService) service;
    }
}
