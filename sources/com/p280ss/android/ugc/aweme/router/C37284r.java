package com.p280ss.android.ugc.aweme.router;

import com.bytedance.dataplatform.p507a.C10034a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.C22610a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.p1015ui.C22611b;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.ChallengeDetailActivity;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.CreateChallengeActivity;
import com.p280ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.feedback.FeedbackActivity;
import com.p280ss.android.ugc.aweme.forward.view.ForwardDetailActivity;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.p1285ui.IAddFriendsActivity;
import com.p280ss.android.ugc.aweme.friends.p1285ui.InviteUserListActivity;
import com.p280ss.android.ugc.aweme.music.p1410ui.MusicDetailActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.ProfileEditActivity;
import com.p280ss.android.ugc.aweme.profile.p1487ui.UserProfileActivity;
import com.p280ss.android.ugc.aweme.router.C7195s.C7201a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity;
import com.p280ss.android.ugc.aweme.setting.p337ui.AboutActivity;
import com.p280ss.android.ugc.aweme.setting.p337ui.DigitalWellbeingActivity;
import com.p280ss.android.ugc.aweme.setting.p337ui.TestSettingActivity;
import com.p280ss.android.ugc.aweme.setting.personalization.PersonalizationActivity;
import com.p280ss.android.ugc.aweme.splash.SplashActivity;
import com.p280ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity;
import com.p280ss.android.ugc.trill.setting.PushSettingActivity;

/* renamed from: com.ss.android.ugc.aweme.router.r */
public final class C37284r implements C7201a {
    /* renamed from: a */
    public final void mo18691a() {
        m119750b();
    }

    /* renamed from: b */
    private static void m119750b() {
        C7195s.m22445a(C10034a.m29823f(false).booleanValue());
        C7195s.m22443a("aweme://main", SplashActivity.class);
        C7195s.m22443a("aweme://setting", ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getSettingActivityClass());
        C7195s.m22443a("aweme://privacy/setting/personalization", PersonalizationActivity.class);
        C7195s.m22443a("aweme://teenage/setting", DigitalWellbeingActivity.class);
        C7195s.m22443a("aweme://privacy/setting", ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getPrivacySettingActivity());
        C7195s.m22443a("aweme://push-setting", PushSettingActivity.class);
        C7195s.m22443a("aweme://account/setting", ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getManagerMyAccountActivity());
        C7195s.m22443a("aweme://test_setting", TestSettingActivity.class);
        C7195s.m22443a("aweme://profile_edit", ProfileEditActivity.class);
        C7195s.m22443a("aweme://draft_box", ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().draftBoxActivity());
        C7195s.m22443a("aweme://about_activity", AboutActivity.class);
        C7195s.m22443a("aweme://challenge/create", CreateChallengeActivity.class);
        C7195s.m22443a("aweme://challenge/detail/:id", ChallengeDetailActivity.class);
        C7195s.m22443a("aweme://music/detail/:id", MusicDetailActivity.class);
        C7195s.m22443a("aweme://user/profile/:uid", UserProfileActivity.class);
        C7195s.m22443a("aweme://filtercomments", CommentFilterActivity.class);
        C7195s.m22443a("aweme://user/profile/:uid/:room_id/:room_owner_id/:request_id/:user_type", UserProfileActivity.class);
        C7195s.m22443a("aweme://aweme/detail/:id", DetailActivity.class);
        C7195s.m22443a("aweme://aweme/detaillist/:ids", DetailActivity.class);
        C7195s.m22443a("aweme://webview/", CrossPlatformActivity.class);
        C7195s.m22443a("aweme://reactnative/", CrossPlatformActivity.class);
        C7195s.m22443a("aweme://user/invite", IAddFriendsActivity.class);
        C7195s.m22443a("aweme://webview/", CrossPlatformActivity.class);
        C7195s.m22443a("aweme://friend/find", InviteUserListActivity.class);
        C7195s.m22438a();
        C7195s.m22442a("aweme://aweme/challenge/detail/", C37263e.m119724a());
        C7195s.m22438a();
        C7195s.m22442a("aweme://teen_protection", (C37273j) new C22611b());
        C7195s.m22438a();
        C7195s.m22442a("aweme://privacy/setting/modify/", (C37273j) new C22610a());
        C7195s.m22443a("aweme://aweme/forward/:forward_id", ForwardDetailActivity.class);
        C7195s.m22443a("aweme://studio/create", ((IAVService) ServiceManager.get().getService(IAVService.class)).getRecordPermissionActivity());
        C7195s.m22443a("aweme://feedback_record", FeedbackActivity.class);
        C7195s.m22443a("aweme://stickers/detail/:id", StickerPropDetailActicity.class);
    }
}
