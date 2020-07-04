package com.p280ss.android.ugc.aweme.p1216fe.base;

import android.app.Activity;
import android.content.Context;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.facebook.react.bridge.ReactContext;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.sdk.webview.p900a.C20126b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.base.BaseOpenMethod */
public abstract class BaseOpenMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    protected WeakReference<Context> f73450a;

    /* renamed from: a */
    public final void mo71366a(JSONObject jSONObject) {
        Context context;
        try {
            Activity activity = null;
            if (this.f73450a != null) {
                context = (Context) this.f73450a.get();
            } else {
                context = null;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
            }
            if (activity != null) {
                if (!(activity instanceof AbsActivity) || ((AbsActivity) activity).isActive()) {
                    String optString = jSONObject.optString("type");
                    if (!C6319n.m19593a(optString) && !optString.contains(":")) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(C20126b.m66361a().getSSLocalScheme());
                        sb.append("://");
                        sb.append(optString);
                        C19290j jVar = new C19290j(sb.toString());
                        m91333a(jSONObject.optJSONObject("args"), jVar);
                        C20126b.m66361a().startAdsAppActivity(activity, jVar.mo51184a());
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    public BaseOpenMethod(WeakReference<Context> weakReference, ReactContext reactContext) {
        super(reactContext);
        this.f73450a = weakReference;
    }

    /* renamed from: a */
    private void m91333a(JSONObject jSONObject, C19290j jVar) throws JSONException {
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                Object obj = jSONObject.get(str);
                if (obj instanceof Integer) {
                    jVar.mo51186a(str, ((Integer) obj).intValue());
                } else if (obj instanceof Long) {
                    jVar.mo51187a(str, ((Long) obj).longValue());
                } else if (obj instanceof Double) {
                    jVar.mo51185a(str, ((Double) obj).doubleValue());
                } else if (obj instanceof String) {
                    jVar.mo51188a(str, (String) obj);
                } else if (obj instanceof JSONObject) {
                    m91333a((JSONObject) obj, jVar);
                }
            }
        }
    }
}
