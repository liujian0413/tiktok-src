package com.p280ss.android.ugc.aweme.profile;

import android.content.Context;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.detail.operators.C26134am;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.profile.p1487ui.AwemeListFragment;
import com.p280ss.android.ugc.aweme.profile.p1487ui.widget.C36675j;
import com.p280ss.android.ugc.aweme.profile.presenter.UserResponse;
import p346io.reactivex.C7319aa;

/* renamed from: com.ss.android.ugc.aweme.profile.IProfileService */
public interface IProfileService {
    boolean needShowCompleteProfileGuide();

    boolean needShowCompleteProfileGuideBar();

    boolean needShowCompleteProfileGuideBarForFansDetail();

    AwemeListFragment newAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2, Bundle bundle);

    AwemeListFragment newBasicAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2);

    C26134am newDetailPageOperator(C25673a<?, ?> aVar, boolean z, String str);

    AwemeListFragment newMTAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2);

    void onFansDetailCompleteProfileGuideBarShow();

    void preloadProfile(FragmentActivity fragmentActivity, String str);

    void showRemarkEditDialog(Context context, User user, String str, int i, Bundle bundle, C36675j jVar);

    boolean showRemindUserCompleteProfileDialog(Context context, String str, String str2, OnDismissListener onDismissListener);

    boolean showRemindUserCompleteProfileDialogAfterFollow(Context context, String str, String str2, User user, int i);

    C7319aa<UserResponse> user(String str, String str2, String str3);
}
