package com.p280ss.android.ugc.aweme.homepage.p1289a;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.router.C7195s;
import kotlin.jvm.internal.C7573i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.homepage.a.a */
public final class C30238a {
    /* renamed from: a */
    public static final void m98901a(Activity activity) {
        C7573i.m23587b(activity, "activity");
        String string = C7285c.m22838a(C6399b.m19921a(), "applog_stats", 0).getString("app_track", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                C7195s.m22438a().mo18679a(activity, new JSONObject(string).optString("openurl"));
            } catch (JSONException unused) {
            }
        }
    }
}
