package com.p280ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.music.IMusicService;

/* renamed from: com.ss.android.ugc.aweme.services.IMainService */
public interface IMainService {
    String getApiUrlPrefix();

    int getAppVersionCode();

    IBusinessGoodsService getBusinessGoodsService();

    ILocalVideoCacheService getLocalVideoCacheService();

    String getStoryEnterFromForMain(Activity activity);

    boolean isContainsKeyWithLruEntries();

    boolean isMainPage(Context context);

    boolean isNotificationTabMStyle();

    boolean isRelationLabelClickEnter();

    boolean isReplaceAwemeCache();

    boolean isTiktokWhite();

    boolean isUseJediAwemelistFragment();

    IMusicService musicService();

    void setI18nStatusBarColor(Activity activity);

    void setStartWithoutSplash(boolean z);

    void trackAppsFlyerEvent(String str, String str2);

    void updateIMUserFollowStatus(User user);
}
