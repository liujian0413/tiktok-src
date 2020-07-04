package com.p280ss.android.ugc.aweme.services;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.framework.services.IUserService;
import com.p280ss.android.ugc.aweme.profile.model.User;

/* renamed from: com.ss.android.ugc.aweme.services.BaseUserService */
public class BaseUserService implements IUserService {
    public void clearUser() {
    }

    public void refreshUser() {
    }

    public boolean getAuthGoods() {
        return C21115b.m71197a().getAuthGoods();
    }

    public User getCurrentUser() {
        return C21115b.m71197a().getCurUser();
    }

    public String getCurrentUserID() {
        return C21115b.m71197a().getCurUserId();
    }

    public int getVerifyStatus() {
        return C21115b.m71197a().getVerifyStatus();
    }

    public boolean isLogin() {
        return C21115b.m71197a().isLogin();
    }

    public void logout() {
        C6861a.m21333b().logout("expired_logout", "sdk_expired_logout");
    }

    public boolean isOldUser() {
        return ((Boolean) SharePrefCache.inst().getIsOldUser().mo59877d()).booleanValue();
    }

    public boolean isUserEmpty(User user) {
        return C21115b.m71197a().isUserEmpty(user);
    }

    public void setBroadcasterRoomId(long j) {
        C21115b.m71197a().getCurUser().setBroadcasterRoomId(j);
    }

    public void setIsOldUser(boolean z) {
        SharePrefCache.inst().getIsOldUser().mo59871a(Boolean.valueOf(z));
    }

    public void logout(String str, String str2) {
        C6861a.m21333b().logout(str, str2);
    }

    public void enterDouyinHelper(Context context, int i) {
        SmartRouter.buildRoute(context, "//notification").withParam("from_where", 4).withParam("unRead_message_count", i).open();
    }
}
