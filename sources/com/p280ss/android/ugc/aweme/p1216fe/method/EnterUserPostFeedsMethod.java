package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.ies.web.p582a.C11087a;
import com.facebook.react.bridge.ReactContext;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.EnterUserPostFeedsMethod */
public class EnterUserPostFeedsMethod extends BaseCommonJavaMethod {
    public EnterUserPostFeedsMethod(C11087a aVar) {
        super(aVar);
    }

    public EnterUserPostFeedsMethod(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) throws JSONException {
        Context context;
        String str;
        Activity activity = null;
        if (this.f73443f != null) {
            context = (Context) this.f73443f.get();
        } else {
            context = null;
        }
        if (context instanceof Activity) {
            activity = (Activity) context;
        }
        if (activity != null) {
            if (!(activity instanceof AbsActivity) || ((AbsActivity) activity).isActive()) {
                String optString = jSONObject.optString("user_id");
                int optInt = jSONObject.optInt("task");
                C7195s a = C7195s.m22438a();
                C7203u a2 = C7203u.m22460a("aweme://aweme/detail/0");
                String str2 = "video_from";
                if (TextUtils.equals(C21115b.m71197a().getCurUserId(), optString)) {
                    str = "from_profile_self";
                } else {
                    str = "from_profile_other";
                }
                a.mo18679a(activity, a2.mo18694a(str2, str).mo18693a("video_type", 0).mo18694a("userid", optString).mo18693a("task_type", optInt).mo18695a());
            }
        }
    }
}
