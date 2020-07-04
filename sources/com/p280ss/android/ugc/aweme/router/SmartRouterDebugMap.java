package com.p280ss.android.ugc.aweme.router;

import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.IMappingInitializer;
import java.util.List;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.router.SmartRouterDebugMap */
public class SmartRouterDebugMap implements IMappingInitializer {
    public int getMapSize() {
        return 0;
    }

    public void initPermissionMap(Map<String, Map<String, String>> map) {
    }

    public void init(Map<String, String> map) {
        map.put("//challenge/detail", "com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity");
        map.put("//filtercomments", "com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity");
        map.put("//user/invite", "com.ss.android.ugc.aweme.friends.ui.IAddFriendsActivity");
        map.put("//poi", "com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity");
        map.put("//notification", "com.ss.android.ugc.aweme.notification.NotificationDetailActivity");
        map.put("//aweme/detaillist", "com.ss.android.ugc.aweme.detail.ui.DetailActivity");
        map.put("//coupon/detail", "com.ss.android.ugc.aweme.commercialize.coupon.views.CouponDetailActivity");
        map.put("//feedback_record", "com.ss.android.ugc.aweme.feedback.FeedbackActivity");
        map.put("//webview/", "com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity");
        map.put("//feedback_input", "com.ss.android.ugc.aweme.feedback.SubmitFeedbackActivity");
        map.put("//user/profile", "com.ss.android.ugc.aweme.profile.ui.UserProfileActivity");
        map.put("//hotlive/feed", "com.ss.android.ugc.aweme.live.LiveFeedActivity");
        map.put("//account/setting", "com.ss.android.ugc.aweme.setting.ui.MusSettingManageMyAccountActivity");
        map.put("//favorite", "com.ss.android.ugc.aweme.favorites.ui.UserFavoritesActivity");
        map.put("//challenge/create", "com.ss.android.ugc.aweme.challenge.ui.CreateChallengeActivity");
        map.put("//teenage/setting", "com.ss.android.ugc.aweme.setting.ui.DigitalWellbeingActivity");
        map.put("//showcaseh5", "com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity");
        map.put("//friend/find", "com.ss.android.ugc.aweme.friends.ui.InviteUserListActivity");
        map.put("//aweme/challenge/detail", "com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity");
        map.put("//login", "com.ss.android.ugc.aweme.app.PushLoginActivity");
        map.put("//coupon", "com.ss.android.ugc.aweme.commercialize.coupon.views.CouponListActivity");
        map.put("//music/detail", "com.ss.android.ugc.aweme.music.ui.MusicDetailActivity");
        map.put("//discover/loft", "com.ss.android.ugc.aweme.commercialize.loft.LoftActivity");
        map.put("//search", "com.ss.android.ugc.aweme.search.activity.SearchResultActivity");
        map.put("//privacy/setting", "com.ss.android.ugc.aweme.i18n.settings.privacy.MusPrivacyActivity");
        map.put("//tuwen/detail", "com.ss.android.ugc.aweme.detail.ui.DetailActivity");
        map.put("//ame/webview/", "com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity");
        map.put("//reactnative", "com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity");
        map.put("//assmusic/category", "com.ss.android.ugc.aweme.choosemusic.activity.MusicDetailListActivity");
        map.put("//main", "com.ss.android.ugc.aweme.main.MainActivity");
        map.put("//mine", "com.ss.android.ugc.aweme.main.MainActivity");
        map.put("//user/homepage", "com.ss.android.ugc.aweme.main.MainActivity");
        map.put("//aweme/scan", "com.ss.android.ugc.aweme.qrcode.QRCodePermissionActivity");
        map.put("//poi/detail", "com.ss.android.ugc.aweme.poi.ui.PoiDetailActivity");
        map.put("//aweme/create", "com.ss.android.ugc.aweme.app.PushCameraBlurActivity");
        map.put("//about_activity", "com.ss.android.ugc.aweme.setting.ui.AboutActivity");
        map.put("//ame/webview", "com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity");
        map.put("//aweme/forward", "com.ss.android.ugc.aweme.forward.view.ForwardDetailActivity");
        map.put("//test_setting", "com.ss.android.ugc.aweme.setting.ui.TestSettingActivity");
        map.put("//helper_center", "com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity");
        map.put("//collection", "com.ss.android.ugc.aweme.music.ui.MusicListActivity");
        map.put("//profile_edit", "com.ss.android.ugc.aweme.profile.ui.ProfileEditActivity");
        if (C6399b.m19947w()) {
            map.put("//setting", "com.ss.android.ugc.aweme.setting.ui.TiktokSettingNewVersionActivity");
        } else {
            map.put("//setting", "com.ss.android.ugc.aweme.setting.ui.MusSettingNewVersionActivity");
        }
        map.put("//detail", "com.ss.android.ugc.aweme.detail.ui.DetailActivity");
        map.put("//privacy/setting/personalization", "com.ss.android.ugc.aweme.setting.personalization.PersonalizationActivity");
        map.put("//webview", "com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity");
        map.put("//music/category", "com.ss.android.ugc.aweme.music.ui.MusicListActivity");
        map.put("//push-setting", "com.ss.android.ugc.trill.setting.PushSettingActivity");
        map.put("//aweme/detail", "com.ss.android.ugc.aweme.detail.ui.DetailActivity");
        map.put("//user/video", "com.ss.android.ugc.aweme.detail.ui.DetailActivity");
        map.put("//follow_request", "com.ss.android.ugc.aweme.followrequest.FollowRequestActivity");
        map.put("//push_setting_manager", "com.ss.android.ugc.aweme.setting.serverpush.ui.PushSettingManagerActivity");
        map.put("//wiki", "com.ss.android.ugc.aweme.wiki.AddWikiActivity");
        map.put("//stickers/detail", "com.ss.android.ugc.aweme.sticker.prop.activity.StickerPropDetailActicity");
        map.put("//movie/detail", "com.ss.android.ugc.aweme.movie.view.MovieDetailActivity");
        map.put("//choosemusic/home", "com.ss.android.ugc.aweme.choosemusic.activity.ChooseMusicActivity");
        map.put("//onlinemusic/home", "com.ss.android.ugc.aweme.choosemusic.activity.OnlineMusicFragmentActivity");
        map.put("//music/similar", "com.ss.android.ugc.aweme.music.ui.SimilarMusicActivity");
    }

    public void initTestUrlList(List<String> list) {
        list.add("aweme://chatting/message?uid=73236241402");
        list.add("//privacy/setting/personalization");
        list.add("//teenage/setting");
        list.add("//filtercomments");
        list.add("//challenge/detail/1622711827927047");
        list.add("aweme://aweme/challenge/detail?cid=1622711827927047");
        list.add("aweme://goods/seeding/?promotion_id=3329016137748071961&product_id=3329016137865419287&target_uid=103777015723&source_page=test&enter_method=test");
        list.add("aweme://goods/ordershare/?promotion_id=3329016137748071961&product_id=3329016137865419287&target_uid=103777015723&source_page=test&enter_method=test");
        list.add("aweme://goods/shop/?uid=58138487807&entrance_location=test&enter_from=test&enter_method=test");
        list.add("aweme://aweme/challenge/detail?cid=1622711827927047");
        list.add("//draft_box");
        list.add("aweme://studio/task/create");
        list.add("aweme://studio/create");
        list.add("//account/setting");
        list.add("//setting");
        list.add("//privacy/setting");
        list.add("//push-setting");
        list.add("//feedback_record");
        list.add("//user/invite");
        list.add("//friend/find");
        list.add("//about_activity");
        list.add("//main");
        list.add("aweme://discover/loft?activity_id=123&start_color=#434321&end_color=#aaaaaa");
        list.add("//coupon/detail?coupon_id=28889&code_id=811187454562");
        list.add("//coupon");
        list.add("//music/detail/308368280178606080");
        list.add("snssdk1128://collection?group=0&id=860&collection_name=Nothing");
        list.add("//music/category/860");
        list.add("aweme://teen_protection?type=time_lock&user_id=xxx&time_lock=0|40|60|90|120");
        list.add("aweme://teen_protection?type=teen_mode&user_id=xxx&teen_mode=0|1");
        list.add("aweme://privacy/setting/modify?type=chat_privacy&user_id=xxx&chat_privacy=1|2|3");
        list.add("//search?keyword=love&display_keyword=5&enter_from=push");
        list.add("//showcaseh5?url=https%3a%2f%2fwww.douyin.com");
        list.add("//ame/webview?url=https%3a%2f%2fwww.douyin.com");
        list.add("//webview?url=https%3a%2f%2fwww.douyin.com");
        list.add("//favorite");
        list.add("//aweme/scan");
        list.add("//notification?from_where=0");
        list.add("//notification?from_where=1");
        list.add("//notification?from_where=2");
        list.add("//notification?from_where=3");
        list.add("//notification?from_where=4");
        list.add("//notification?from_where=5");
        list.add("aweme://assmusic/category/6603132980774832902?name=Trending");
        list.add("aweme://assmusic/category/6616178774952119044?name=Trending");
        list.add("//poi?id=B0FFGY7THS");
        list.add("//poi/detail?id=B0FFGY7THS");
        list.add("aweme://aweme/detail?id=6567316736750652679");
        list.add("aweme://aweme/detail/6567316736750652679");
        list.add("aweme://detail?id=6661391124541771022");
        list.add("//user/video?id=6661391124541771022");
        list.add("aweme://aweme/detaillist/6581037782020394247,6591352472483138830,6578275952940289284,6590505144616488196");
        list.add("aweme://user/profile?uid=109909644458");
        list.add("aweme://user/profile/109909644458");
        list.add("//profile_edit");
        list.add("//test_setting");
        list.add("//challenge/create");
        list.add("//aweme/forward/110593921001");
        list.add("//follow_request");
        list.add("//push_setting_manager");
        list.add("//wiki?url=http%3a%2f%2f10.93.235.104%3a4000%2fpages%2fwiki%2f&title=wikipedia&lang=en&addButton=false&noRedirect=true&back=false&close=true");
        list.add("aweme://movie/detail?mv_id=325306");
        list.add("aweme://stickers/detail?id=324057");
        list.add("//music/similar");
    }
}
