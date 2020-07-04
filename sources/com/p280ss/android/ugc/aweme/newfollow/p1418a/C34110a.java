package com.p280ss.android.ugc.aweme.newfollow.p1418a;

import android.app.Activity;
import android.content.Context;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.ChallengeDetailActivity;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25242ao;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.flowfeed.p968a.C21740a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.friends.p1285ui.ContactsActivity;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.music.service.IMusicService;
import com.p280ss.android.ugc.aweme.newfollow.p1422e.C34138b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.story.live.C41990e;
import com.p280ss.android.ugc.aweme.story.live.C41990e.C41991a;
import com.p280ss.android.ugc.aweme.utils.C42925am;
import com.p280ss.android.ugc.aweme.utils.C42925am.C42929a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.newfollow.a.a */
public final class C34110a {

    /* renamed from: com.ss.android.ugc.aweme.newfollow.a.a$a */
    public interface C34113a {
        /* renamed from: a */
        void mo86760a();
    }

    /* renamed from: a */
    public static boolean m109797a(User user, Activity activity, String str, String str2) {
        C41991a aVar = new C41991a(activity, user);
        aVar.mo103122b(str);
        aVar.mo103123c("live_cell");
        aVar.mo103121a("live_cell_position", "video_head".equals(str2) ? "card_head" : "card_content");
        aVar.mo103124d(user.getRequestId());
        C41990e.m133503a(aVar);
        return true;
    }

    /* renamed from: a */
    public static boolean m109796a(User user, Activity activity, String str) {
        String str2;
        if (user == null || TextUtils.isEmpty(user.getUid())) {
            return false;
        }
        StringBuilder sb = new StringBuilder("aweme://user/profile/");
        sb.append(user.getUid());
        C7203u a = C7203u.m22460a(sb.toString());
        a.mo18694a("enter_from", str);
        a.mo18694a("sec_user_id", user.getSecUid());
        if (m109798a(user, str)) {
            a.mo18694a("extra_previous_page_position", "content_card_button");
        } else {
            a.mo18694a("extra_previous_page_position", "main_head");
        }
        String str3 = "enter_from_request_id";
        if (TextUtils.isEmpty(user.getRequestId())) {
            str2 = "";
        } else {
            str2 = user.getRequestId();
        }
        a.mo18694a(str3, str2);
        C7195s.m22438a().mo18679a(activity, a.mo18695a());
        return true;
    }

    /* renamed from: a */
    private static boolean m109798a(User user, String str) {
        return user != null && user.getFollowStatus() == 0 && "homepage_follow".equals(str);
    }

    /* renamed from: a */
    private static boolean m109795a(Aweme aweme, String str) {
        if (aweme.getAuthor() == null || aweme.getAuthor().getFollowStatus() != 0 || !"homepage_follow".equals(str)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static void m109789a(final Activity activity, final C34113a aVar) {
        C34138b.m110014e();
        if (activity != null) {
            if (C42925am.m136275c(activity)) {
                activity.startActivityForResult(ContactsActivity.m98571a(activity, null, false), 1);
                aVar.mo86760a();
                return;
            }
            C10761a.m31409e((Context) activity, (int) R.string.i2).mo25750a();
            C42925am.m136271a(activity, (C42929a) new C42929a() {
                /* renamed from: b */
                public final void mo71409b() {
                }

                /* renamed from: a */
                public final void mo71408a() {
                    activity.startActivityForResult(ContactsActivity.m98571a(activity, null, true), 1);
                    if (aVar != null) {
                        aVar.mo86760a();
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public static void m109790a(final Fragment fragment, C34113a aVar) {
        C34138b.m110014e();
        if (fragment != null) {
            final FragmentActivity activity = fragment.getActivity();
            if (activity != null) {
                if (C42925am.m136275c(activity)) {
                    fragment.startActivityForResult(ContactsActivity.m98571a(activity, null, false), 1);
                    return;
                }
                C10761a.m31409e((Context) activity, (int) R.string.i2).mo25750a();
                C42925am.m136271a((Activity) activity, (C42929a) new C42929a(null) {
                    /* renamed from: b */
                    public final void mo71409b() {
                    }

                    /* renamed from: a */
                    public final void mo71408a() {
                        fragment.startActivityForResult(ContactsActivity.m98571a(activity, null, true), 1);
                        if (null != null) {
                            null.mo86760a();
                        }
                    }
                });
            }
        }
    }

    /* renamed from: b */
    public static boolean m109799b(View view, View view2, Aweme aweme) {
        if (C6399b.m19944t()) {
            return m109792a(view, view2, aweme);
        }
        if (aweme == null) {
            return false;
        }
        if (aweme.getAwemeType() == 13) {
            aweme = aweme.getForwardItem();
        }
        Context context = view.getContext();
        if (context == null || aweme == null || aweme.getMusic() == null || !aweme.getMusic().isOriginMusic()) {
            return false;
        }
        SmartRouter.buildRoute(context, "aweme://music/category/").open();
        return true;
    }

    /* renamed from: a */
    public static boolean m109792a(View view, View view2, Aweme aweme) {
        String str;
        if (aweme == null) {
            return false;
        }
        if (aweme.getAwemeType() == 13) {
            aweme = aweme.getForwardItem();
        }
        if (aweme == null || aweme.getMusic() == null) {
            return false;
        }
        if (!((IMusicService) ServiceManager.get().getService(IMusicService.class)).checkValidMusic(aweme.getMusic().convertToMusicModel(), view.getContext(), true)) {
            C6907h.m21524a("enter_music_detail_failed", (Map) new C22984d().mo59973a("group_id", "").mo59973a("author_id", "").mo59973a("music_id", aweme.getMusic().getMid()).mo59973a("enter_from", "video_at").f60753a);
            return false;
        }
        Context context = view.getContext();
        C7195s a = C7195s.m22438a();
        Activity activity = (Activity) context;
        StringBuilder sb = new StringBuilder("aweme://music/detail/");
        sb.append(aweme.getMusic().getMid());
        C7203u a2 = C7203u.m22460a(sb.toString());
        String str2 = "aweme_id";
        if (!TextUtils.isEmpty(aweme.getAid())) {
            str = aweme.getAid();
        } else {
            str = "";
        }
        a.mo18679a(activity, a2.mo18694a(str2, str).mo18695a());
        return true;
    }

    /* renamed from: b */
    public static boolean m109800b(Aweme aweme, User user, Activity activity, String str) {
        if (user == null || TextUtils.isEmpty(user.getUid())) {
            return false;
        }
        StringBuilder sb = new StringBuilder("aweme://user/profile/");
        sb.append(user.getUid());
        C7203u a = C7203u.m22460a(sb.toString());
        a.mo18694a("enter_from", str);
        a.mo18694a("sec_user_id", user.getSecUid());
        if (m109795a(aweme, str)) {
            a.mo18694a("extra_previous_page_position", "content_card_button");
        } else {
            a.mo18694a("extra_previous_page_position", "main_head");
        }
        String str2 = "";
        if (aweme != null && !TextUtils.isEmpty(aweme.getRequestId())) {
            str2 = aweme.getRequestId();
        } else if (!TextUtils.isEmpty(user.getRequestId())) {
            str2 = user.getRequestId();
        }
        a.mo18694a("enter_from_request_id", str2);
        if (C25329c.m83221d(aweme) && TextUtils.equals(str, "general_search")) {
            a.mo18694a("source_aid", aweme.getAid());
        }
        C7195s.m22438a().mo18679a(activity, a.mo18695a());
        return true;
    }

    /* renamed from: a */
    public static boolean m109794a(Aweme aweme, User user, Activity activity, String str) {
        String str2;
        if (aweme == null) {
            return false;
        }
        if (C21740a.m72684a(user)) {
            if (TextUtils.equals(str, "challenge")) {
                str2 = "challenge";
            } else if (TextUtils.equals(str, "general_search")) {
                str2 = "general_search";
            } else {
                str2 = "homepage_follow";
            }
            C41991a aVar = new C41991a(activity, user);
            aVar.mo103122b(str2);
            aVar.mo103123c("video_head");
            C41990e.m133503a(aVar);
            return true;
        } else if (user == null || TextUtils.isEmpty(user.getUid())) {
            return false;
        } else {
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(user.getUid());
            C7203u a = C7203u.m22460a(sb.toString());
            a.mo18694a("enter_from", str);
            a.mo18694a("sec_user_id", user.getSecUid());
            a.mo18694a("enter_from_request_id", aweme.getRequestId());
            if (m109795a(aweme, str)) {
                a.mo18694a("extra_previous_page_position", "content_card_button");
            } else {
                a.mo18694a("extra_previous_page_position", "main_head");
            }
            if (C25329c.m83221d(aweme) && TextUtils.equals(str, "general_search")) {
                a.mo18694a("source_aid", aweme.getAid());
            }
            C7195s.m22438a().mo18679a(activity, a.mo18695a());
            return true;
        }
    }

    /* renamed from: a */
    public static boolean m109793a(View view, TextExtraStruct textExtraStruct, View view2, Aweme aweme, String str) {
        if (view == null || view2 == null || textExtraStruct == null) {
            return false;
        }
        if (textExtraStruct.getType() == 1) {
            C25242ao.m82973a(textExtraStruct);
            ChallengeDetailActivity.m77715a(view.getContext(), aweme.getAid(), textExtraStruct.getHashTagName(), str, 0, true);
        } else {
            C7195s a = C7195s.m22438a();
            Activity activity = (Activity) view2.getContext();
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(textExtraStruct.getUserId());
            a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("sec_user_id", textExtraStruct.getSecUid()).mo18694a("profile_from", "video_at").mo18694a("video_id", aweme.getAid()).mo18693a("profile_enterprise_type", aweme.getEnterpriseType()).mo18695a());
        }
        return true;
    }

    /* renamed from: a */
    public static void m109791a(Aweme aweme, String str, String str2, Activity activity, String str3, String str4) {
        if (!TextUtils.isEmpty(str)) {
            C7195s a = C7195s.m22438a();
            StringBuilder sb = new StringBuilder("aweme://user/profile/");
            sb.append(str);
            a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("enter_from", str3).mo18694a("sec_user_id", str2).mo18695a());
            C34138b.m109976a(aweme, str, "head", str3, str4);
            C34138b.m110010d(aweme, str3);
        }
    }
}
