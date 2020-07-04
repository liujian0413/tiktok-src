package com.p280ss.android.ugc.aweme.notification.utils;

import android.app.Activity;
import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.C34367o;
import com.p280ss.android.ugc.aweme.notification.p1436e.C34439a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;

/* renamed from: com.ss.android.ugc.aweme.notification.utils.e */
public final class C34636e {
    /* renamed from: a */
    public static void m111893a(Context context) {
        SmartRouter.buildRoute(context, "aweme://check_profile").open();
    }

    /* renamed from: a */
    public static void m111892a(Activity activity, C34367o oVar) {
        C7195s a = C7195s.m22438a();
        StringBuilder sb = new StringBuilder("aweme://user/profile/");
        sb.append(oVar.f89573f.getUserId());
        a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("sec_user_id", ((User) oVar.f89568a.get(0)).getSecUid()).mo18694a("enter_from", "like_banner").mo18695a());
    }

    /* renamed from: a */
    public static void m111894a(Context context, String str, String str2, String str3) {
        C7195s a = C7195s.m22438a();
        Activity activity = (Activity) context;
        StringBuilder sb = new StringBuilder("aweme://challenge/detail/");
        sb.append(str);
        a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18694a("enter_from", str2).mo18693a("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 0).mo18694a("process_id", str3).mo18695a());
    }

    /* renamed from: a */
    public static void m111895a(Context context, String str, String str2, String str3, int i) {
        if (C34439a.f89873b.isFollowFeedEnterFullScreenDetail()) {
            C7195s a = C7195s.m22438a();
            Activity activity = (Activity) context;
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(str);
            a.mo18679a(activity, C7203u.m22460a(sb.toString()).mo18693a("profile_enterprise_type", i).mo18694a("cid", str3).mo18694a("refer", str2).mo18694a("video_from", "from_launch_forward").mo18695a());
            return;
        }
        C7195s a2 = C7195s.m22438a();
        Activity activity2 = (Activity) context;
        StringBuilder sb2 = new StringBuilder("aweme://aweme/detail/");
        sb2.append(str);
        a2.mo18679a(activity2, C7203u.m22460a(sb2.toString()).mo18694a("refer", str2).mo18694a("cid", str3).mo18695a());
    }
}
