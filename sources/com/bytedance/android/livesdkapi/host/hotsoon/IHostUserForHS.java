package com.bytedance.android.livesdkapi.host.hotsoon;

import android.app.Activity;
import android.support.p022v4.app.FragmentActivity;
import com.bytedance.android.live.base.C2324b;
import com.bytedance.android.live.base.model.user.IUser;
import com.bytedance.android.livesdkapi.depend.p443f.C9314a;
import com.bytedance.android.livesdkapi.depend.p443f.C9315b;
import com.bytedance.android.livesdkapi.host.p453a.C9450k;
import com.bytedance.android.livesdkapi.host.p455c.C9460a;
import com.bytedance.android.livesdkapi.host.p455c.C9461b;

public interface IHostUserForHS extends C2324b, C9450k {
    IUser getCurUser();

    long getCurUserId();

    boolean interceptOperation(String str);

    boolean isLogin();

    void login(FragmentActivity fragmentActivity, C9460a aVar, String str, String str2, int i, String str3, String str4, String str5);

    void markAsOutOfDate(boolean z);

    void onFollowStatusChanged(int i, long j);

    void registerCurrentUserUpdateListener(C9315b bVar);

    void registerFollowStatusListener(C9314a aVar);

    void setRoomAttrsAdminFlag(int i);

    void unFollowWithConfirm(Activity activity, int i, long j, C9461b bVar);

    void unRegisterCurrentUserUpdateListener(C9315b bVar);

    void unRegisterFollowStatusListener(C9314a aVar);
}
