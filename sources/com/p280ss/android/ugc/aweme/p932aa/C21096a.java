package com.p280ss.android.ugc.aweme.p932aa;

import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.playerkit.p1751b.C44912a;
import com.p280ss.android.ugc.playerkit.session.C44925a;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.aa.a */
public final class C21096a implements C44912a {

    /* renamed from: a */
    public static boolean f56665a;

    /* renamed from: b */
    public static final boolean f56666b = C7163a.m22363a();

    /* renamed from: a */
    public final void mo56935a(String str, String str2, String str3) {
        if (f56665a) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("dmt_video_uid", C6861a.m21337f().getCurUserId());
                jSONObject.put("dmt_video_log_tag", str);
                jSONObject.put("dmt_video_log_type", "Debug");
                jSONObject.put("dmt_video_log_msg", str2);
                String str4 = "dmt_video_log_vid";
                if (str3 == null) {
                    str3 = C44925a.m141730a().mo107407b().uri;
                }
                jSONObject.put(str4, str3);
                C6877n.m21447a("dmt_video_log", jSONObject);
            } catch (JSONException unused) {
            }
        }
    }
}
