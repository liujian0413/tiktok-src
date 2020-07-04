package com.p280ss.android.ugc.aweme.profile.util;

import android.content.Context;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.profile.util.u */
public final class C36763u {
    /* renamed from: a */
    public static void m118499a(Context context, String str, String str2, String str3) {
        if (context != null) {
            StringBuilder sb = new StringBuilder("https://aweme.snssdk.com/falcon/douyin_falcon/certification/personalApplyEnter/index.html?enter_from=");
            sb.append(str);
            SmartRouter.buildRoute(context, "//webview").withParam("url", sb.toString()).withParam("hide_nav_bar", true).open();
            C6907h.onEvent(MobClick.obtain().setEventName("enter_certification").setLabelName("official_certification").setJsonObject(new C6869c().mo16887a("enter_from", str).mo16888b()));
            C6907h.m21524a("enter_office_certification", (Map) C22984d.m75611a().mo59973a("previous_page", str).mo59973a("enter_method", str2).mo59973a("to_user_id", str3).f60753a);
        }
    }
}
