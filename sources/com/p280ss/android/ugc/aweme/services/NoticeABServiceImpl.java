package com.p280ss.android.ugc.aweme.services;

import com.bytedance.ies.abmock.C6384b;
import com.p280ss.android.ugc.aweme.experiment.EnablePushGuideExperiment;
import com.p280ss.android.ugc.aweme.experiment.NotificationTabStyleExperiment;
import com.p280ss.android.ugc.aweme.experiment.ShowRedDotTypeExperiment;
import com.p280ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB;
import com.p280ss.android.ugc.aweme.notice.api.p1426ab.NoticeABService;
import com.p280ss.android.ugc.aweme.p994af.C22471a;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p280ss.android.ugc.aweme.video.C43268o;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.services.NoticeABServiceImpl */
public final class NoticeABServiceImpl implements NoticeABService {
    public final int getUserRecommendCardButtonStyle() {
        return 0;
    }

    public final boolean getEnableFriendRecommendEnhance() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        return a.mo18818r();
    }

    public final String getPlayerTypeName() {
        return C43268o.m137252J().name();
    }

    public final int getRecommendContactPosition() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        return a.mo18757aT();
    }

    public final int getShowRemarkIconStyle() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        return a.mo18785ax();
    }

    public final boolean isChallengeToHashTag() {
        C7573i.m23582a((Object) C7213d.m22500a(), "AbTestManager.getInstance()");
        return true;
    }

    public final boolean isDefaultFollowTab() {
        C22471a a = C22471a.m74350a();
        C7573i.m23582a((Object) a, "StoryAbManager.getInstance()");
        return a.mo59053b();
    }

    public final boolean isEnableGroupChat() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        return a.mo18754aQ();
    }

    public final boolean isEnableMultiAccountLogin() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        return a.mo18722O();
    }

    public final boolean isFanFollowingListRecommand() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        return a.mo18786ay();
    }

    public final boolean isFtcBindEnable() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        return a.mo18724R();
    }

    public final boolean isLikeListDetailEnabled() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        return a.mo18714G();
    }

    public final boolean isPrivacyReminder() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        return a.mo18742aE();
    }

    public final boolean shouldUseNewFansVsStyle() {
        return C7213d.m22500a().mo18772aj();
    }

    public final boolean showNoticeGuideBanner() {
        return C7213d.m22500a().mo18770ah();
    }

    public final int getEnablePushGuide() {
        return C6384b.m19835a().mo15287a(EnablePushGuideExperiment.class, true, "push_guide_type", C6384b.m19835a().mo15295d().push_guide_type, 0);
    }

    public final int getMTNotificationTabStyle() {
        return C6384b.m19835a().mo15287a(NotificationTabStyleExperiment.class, true, "i18n_message_page_style", C6384b.m19835a().mo15295d().i18n_message_page_style, 2);
    }

    public final Integer getOppoRedPointAppearAgainTimeInterval() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        return a.mo18793be();
    }

    public final Integer getOppoRedPointAppearMode() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        return a.mo18792bd();
    }

    public final int getShowRedDotType() {
        return C6384b.m19835a().mo15287a(ShowRedDotTypeExperiment.class, true, "feeds_show_red_dot_type", C6384b.m19835a().mo15295d().feeds_show_red_dot_type, 0);
    }

    public final boolean isFollowFeedEnterFullScreenDetail() {
        return C6384b.m19835a().mo15292a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", C6384b.m19835a().mo15295d().follow_detail_full_screen, false);
    }

    public final boolean isNotificationTabNewStyle() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        AbTestModel d = a.mo18803bo();
        C7573i.m23582a((Object) d, "AbTestManager.getInstance().abTestSettingModel");
        return d.isNotificationTabNewStyle();
    }

    public final boolean isRecommendItemShowMoreInfo() {
        C7213d a = C7213d.m22500a();
        C7573i.m23582a((Object) a, "AbTestManager.getInstance()");
        AbTestModel d = a.mo18803bo();
        C7573i.m23582a((Object) d, "AbTestManager.getInstance().abTestSettingModel");
        return d.isRecommendItemShowMoreInfo;
    }
}
