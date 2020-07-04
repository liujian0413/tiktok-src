package com.p280ss.android.ugc.aweme.services;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.app.AwemeAppData;
import com.p280ss.android.ugc.aweme.app.api.Api;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.experiment.NotificationTabStyleExperiment;
import com.p280ss.android.ugc.aweme.experiment.RelationLabelClickEnterExperiment;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.music.C33774c;
import com.p280ss.android.ugc.aweme.p313im.C30553b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.music.IMusicService;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.update.UpdateHelper;
import com.p280ss.android.ugc.aweme.video.local.C43261d;

/* renamed from: com.ss.android.ugc.aweme.services.MainServiceImpl */
public class MainServiceImpl implements IMainService {
    private IBusinessGoodsService businessGoodsService;
    private IMusicService chooseMusicService;
    private ILocalVideoCacheService localVideoCacheService;

    public String getApiUrlPrefix() {
        return Api.f60502b;
    }

    public boolean isTiktokWhite() {
        return C7212bb.m22493a();
    }

    public int getAppVersionCode() {
        return UpdateHelper.m135755b().mo104394e();
    }

    public IBusinessGoodsService getBusinessGoodsService() {
        if (this.businessGoodsService == null) {
            this.businessGoodsService = new BusinessGoodsServiceImpl();
        }
        return this.businessGoodsService;
    }

    public ILocalVideoCacheService getLocalVideoCacheService() {
        if (this.localVideoCacheService == null) {
            this.localVideoCacheService = new C43261d();
        }
        return this.localVideoCacheService;
    }

    public boolean isContainsKeyWithLruEntries() {
        return C7213d.m22500a().mo18784aw();
    }

    public boolean isReplaceAwemeCache() {
        return C7213d.m22500a().mo18783av();
    }

    public boolean isUseJediAwemelistFragment() {
        return C7213d.m22500a().mo18789ba();
    }

    public IMusicService musicService() {
        if (this.chooseMusicService == null) {
            this.chooseMusicService = new C33774c();
        }
        return this.chooseMusicService;
    }

    public boolean isNotificationTabMStyle() {
        if (C6384b.m19835a().mo15287a(NotificationTabStyleExperiment.class, true, "i18n_message_page_style", C6384b.m19835a().mo15295d().i18n_message_page_style, 2) == 2) {
            return true;
        }
        return false;
    }

    public boolean isRelationLabelClickEnter() {
        return C6384b.m19835a().mo15292a(RelationLabelClickEnterExperiment.class, true, "relation_label_click_enter", C6384b.m19835a().mo15295d().relation_label_click_enter, false);
    }

    public boolean isMainPage(Context context) {
        return context instanceof MainActivity;
    }

    public void setI18nStatusBarColor(Activity activity) {
        C7212bb.m22498b(activity);
    }

    public void setStartWithoutSplash(boolean z) {
        AwemeAppData.m65765a().f60329i = z;
    }

    public void updateIMUserFollowStatus(User user) {
        C30553b.m99810g().updateIMUserFollowStatus(C30553b.m99780a(user));
    }

    public String getStoryEnterFromForMain(Activity activity) {
        if (!(activity instanceof MainActivity)) {
            return "";
        }
        if (((MainActivity) activity).isUnderMainTab()) {
            return "homepage_hot";
        }
        return "homepage_friends";
    }

    public void trackAppsFlyerEvent(String str, String str2) {
        ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).trackAppsFlyerEvent(str, str2);
    }
}
