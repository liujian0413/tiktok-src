package com.p280ss.android.ugc.aweme.profile.presenter;

import com.p280ss.android.ugc.aweme.common.C25672e;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;

/* renamed from: com.ss.android.ugc.aweme.profile.presenter.n */
public interface C36040n extends C25672e {
    void onFollowFail(Exception exc);

    void onFollowSuccess(FollowStatus followStatus);
}
