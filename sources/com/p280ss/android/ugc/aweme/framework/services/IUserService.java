package com.p280ss.android.ugc.aweme.framework.services;

import android.content.Context;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.framework.services.IUserService */
public interface IUserService {
    void clearUser();

    void enterDouyinHelper(Context context, int i);

    boolean getAuthGoods();

    User getCurrentUser();

    String getCurrentUserID();

    int getVerifyStatus();

    boolean isLogin();

    boolean isOldUser();

    boolean isUserEmpty(User user);

    void logout();

    void logout(String str, String str2);

    void refreshUser();

    void setBroadcasterRoomId(long j);

    void setIsOldUser(boolean z);
}
