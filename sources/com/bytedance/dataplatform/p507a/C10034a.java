package com.bytedance.dataplatform.p507a;

import com.bytedance.dataplatform.C6324d;
import com.bytedance.dataplatform.p508b.C10038a;
import com.bytedance.dataplatform.p508b.C10039b;
import com.p280ss.android.ugc.aweme.setting.p1517e.C37621a;
import com.p280ss.android.ugc.aweme.setting.p1517e.C37622b;
import com.p280ss.android.ugc.aweme.setting.p1517e.C37623c;
import com.p280ss.android.ugc.aweme.setting.p1517e.C37624d;
import com.p280ss.android.ugc.aweme.setting.p1517e.C37625e;
import com.p280ss.android.ugc.aweme.setting.p1517e.C37626f;
import com.p280ss.android.ugc.aweme.setting.p1517e.C37627g;

/* renamed from: com.bytedance.dataplatform.a.a */
public final class C10034a {
    /* renamed from: a */
    public static Integer m29818a(boolean z) {
        return (Integer) C6324d.m19633a("new_user_journey", Integer.class, C37626f.m120430a(), false, true, m29817a(new C37626f()));
    }

    /* renamed from: b */
    public static Integer m29819b(boolean z) {
        return (Integer) C6324d.m19633a("new_user_strategy", Integer.class, C37622b.m120426a(), false, true, m29814a(new C37622b()));
    }

    /* renamed from: c */
    public static Integer m29820c(boolean z) {
        return (Integer) C6324d.m19633a("douyin_new_swipe_up_guide", Integer.class, C37624d.m120428a(), false, true, m29816a(new C37624d()));
    }

    /* renamed from: d */
    public static Integer m29821d(boolean z) {
        return (Integer) C6324d.m19633a("swipe_up_type", Integer.class, C37623c.m120427a(), false, true, m29815a(new C37623c()));
    }

    /* renamed from: e */
    public static Boolean m29822e(boolean z) {
        return (Boolean) C6324d.m19632a("gcsuppression_experiment", Boolean.class, new C37625e().mo24676a(), false, true);
    }

    /* renamed from: f */
    public static Boolean m29823f(boolean z) {
        return (Boolean) C6324d.m19632a("smart_router_enable", Boolean.class, new C37627g().mo24676a(), false, false);
    }

    /* renamed from: g */
    public static Boolean m29824g(boolean z) {
        return (Boolean) C6324d.m19632a("adhalf_webpage_show_experiment", Boolean.class, new C37621a().mo24676a(), false, true);
    }

    /* renamed from: a */
    private static C10038a m29814a(C37622b bVar) {
        C10038a aVar = new C10038a("com.ss.android.ugc.aweme.setting.experiment.ClientNewUserStrategyExperiment", 0.0d, "abtest", new String[]{"app_skin_white", "back_refresh_strategy", "client_boolean_empty_experiment", "client_empty_experiment", "client_enum_forcelogin_experiment", "client_string_empty_experiment", "douyin_new_swipe_up_guide", "douyin_privacy_show", "new_user_journey", "new_user_strategy", "support_facebook_deeplink", "swipe_up_type", "video_sound_guide_new_user"}, new C10039b("976609", 0.2d, Integer.valueOf(0)), new C10039b("976610", 0.2d, Integer.valueOf(1)), new C10039b("976611", 0.2d, Integer.valueOf(2)), new C10039b("976612", 0.2d, Integer.valueOf(3)), new C10039b("976613", 0.2d, Integer.valueOf(4)));
        return aVar;
    }

    /* renamed from: a */
    private static C10038a m29815a(C37623c cVar) {
        C10038a aVar = new C10038a("com.ss.android.ugc.aweme.setting.experiment.ClientSwipeUpGuideExperiment", 0.0d, "abtest", new String[]{"app_skin_white", "back_refresh_strategy", "client_boolean_empty_experiment", "client_empty_experiment", "client_enum_forcelogin_experiment", "client_string_empty_experiment", "douyin_new_swipe_up_guide", "douyin_privacy_show", "new_user_journey", "new_user_strategy", "support_facebook_deeplink", "swipe_up_type", "video_sound_guide_new_user"}, new C10039b("1137472", 0.34d, Integer.valueOf(0)), new C10039b("1137473", 0.33d, Integer.valueOf(1)), new C10039b("1137474", 0.33d, Integer.valueOf(2)));
        return aVar;
    }

    /* renamed from: a */
    private static C10038a m29816a(C37624d dVar) {
        C10038a aVar = new C10038a("com.ss.android.ugc.aweme.setting.experiment.DouyinSwipeUpGuideExperiment", 0.0d, "abtest", new String[]{"app_skin_white", "back_refresh_strategy", "client_boolean_empty_experiment", "client_empty_experiment", "client_enum_forcelogin_experiment", "client_string_empty_experiment", "douyin_new_swipe_up_guide", "douyin_privacy_show", "new_user_journey", "new_user_strategy", "support_facebook_deeplink", "swipe_up_type", "video_sound_guide_new_user"}, new C10039b("1395394", 0.2d, Integer.valueOf(0)), new C10039b("1395395", 0.2d, Integer.valueOf(1)), new C10039b("1395396", 0.2d, Integer.valueOf(2)), new C10039b("1395397", 0.2d, Integer.valueOf(3)), new C10039b("1395398", 0.2d, Integer.valueOf(4)));
        return aVar;
    }

    /* renamed from: a */
    private static C10038a m29817a(C37626f fVar) {
        C10038a aVar = new C10038a("com.ss.android.ugc.aweme.setting.experiment.MTNewUserJourneyExperiment", 0.0d, "abtest", new String[]{"app_skin_white", "back_refresh_strategy", "client_boolean_empty_experiment", "client_empty_experiment", "client_enum_forcelogin_experiment", "client_string_empty_experiment", "douyin_new_swipe_up_guide", "douyin_privacy_show", "new_user_journey", "new_user_strategy", "support_facebook_deeplink", "swipe_up_type", "video_sound_guide_new_user"}, new C10039b("1320911", 0.25d, Integer.valueOf(0)), new C10039b("1320912", 0.25d, Integer.valueOf(1)), new C10039b("1320913", 0.25d, Integer.valueOf(2)), new C10039b("1320914", 0.25d, Integer.valueOf(3)));
        return aVar;
    }
}
