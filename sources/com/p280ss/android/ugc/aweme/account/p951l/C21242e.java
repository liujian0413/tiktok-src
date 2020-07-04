package com.p280ss.android.ugc.aweme.account.p951l;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.NullValueException;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.main.p1385g.C33038x;
import com.p280ss.android.ugc.aweme.router.C7195s;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.l.e */
public final class C21242e {
    /* renamed from: a */
    public static void m71499a(Context context, String str, String str2) {
        if (context != null) {
            if (TextUtils.isEmpty(str)) {
                str = "";
            }
            if (TextUtils.isEmpty(str2)) {
                str2 = "";
            }
            C6907h.m21524a("click_feedback_entrance", (Map) new C21102b().mo56946a("enter_method", str2).mo56946a("enter_from", str).f56672a);
            try {
                C7195s.m22438a().mo18682a(C30199h.m98861a().getFeedbackConf().getNotLoggedIn());
            } catch (NullValueException unused) {
                C19290j jVar = new C19290j("https://m.tiktok.com/falcon/tiktok_rn_web/feedback/?id=5678&hide_nav_bar=1");
                jVar.mo51188a("enter_from", str);
                ((C33038x) C21671bd.m72521a(C33038x.class)).mo60007a(context, jVar.toString(), true);
            }
        }
    }
}
