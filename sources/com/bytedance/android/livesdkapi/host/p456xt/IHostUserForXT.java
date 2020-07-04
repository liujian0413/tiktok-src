package com.bytedance.android.livesdkapi.host.p456xt;

import android.app.Activity;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.livesdkapi.depend.p443f.C9314a;
import com.bytedance.android.livesdkapi.depend.p443f.C9315b;
import com.bytedance.android.livesdkapi.host.p453a.C9450k;
import com.bytedance.android.livesdkapi.host.p455c.C9460a;
import com.bytedance.android.livesdkapi.host.p455c.C9461b;

/* renamed from: com.bytedance.android.livesdkapi.host.xt.IHostUserForXT */
public interface IHostUserForXT extends C2324b, C9450k {
    public static final int FROM_FOLLOW = 1;
    public static final int FROM_LIVE_COMMENT_PROMOTION = 18;
    public static final int FROM_REDPACKET = 5;
    public static final int MESSAGE_NICKNAME_DUPLICATE = 20014;
    public static final int MESSAGE_NICKNAME_DUPLICATE_2 = 20041;

    IUser getCurUser();

    long getCurUserId();

    boolean isLogin();

    void login(FragmentActivity fragmentActivity, C9460a aVar, String str, String str2, int i, String str3, String str4, String str5);

    void registerCurrentUserUpdateListener(C9315b bVar);

    void registerFollowStatusListener(C9314a aVar);

    void unFollowWithConfirm(Activity activity, int i, long j, C9461b bVar);

    void unRegisterCurrentUserUpdateListener(C9315b bVar);

    void unRegisterFollowStatusListener(C9314a aVar);

    void updateUser(IUser iUser);
}
