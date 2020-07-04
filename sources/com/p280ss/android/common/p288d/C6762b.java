package com.p280ss.android.common.p288d;

import android.text.TextUtils;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.ugc.aweme.feed.p310h.C6918d;
import com.p280ss.android.ugc.aweme.p332ml.C7174p;
import org.json.JSONObject;

/* renamed from: com.ss.android.common.d.b */
final class C6762b {
    /* renamed from: a */
    static void m20912a(String str, JSONObject jSONObject) {
        C6759a.m20911b(str, jSONObject);
        if (C7174p.m22398a().mo18649b()) {
            try {
                if (TextUtils.equals(str, "click_comment_button")) {
                    if (jSONObject.opt("group_id") != null) {
                        C6918d.f19600a.mo16978c(jSONObject.opt("group_id").toString());
                    }
                } else if (TextUtils.equals(str, "video_play_finish")) {
                    if (jSONObject.opt("group_id") != null) {
                        C6918d.f19600a.mo16980e(jSONObject.opt("group_id").toString());
                    }
                } else if (TextUtils.equals(str, "like")) {
                    if (jSONObject.opt("group_id") != null) {
                        C6918d.f19600a.mo16977b(jSONObject.opt("group_id").toString());
                    }
                } else if (TextUtils.equals(str, "enter_personal_detail") && jSONObject.opt("group_id") != null) {
                    C6918d.f19600a.mo16979d(jSONObject.opt("group_id").toString());
                }
            } catch (Throwable th) {
                C2077a.m9160a(th);
            }
        }
    }
}
