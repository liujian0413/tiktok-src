package com.p280ss.android.sdk.webview.p901b;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.sdk.webview.p900a.C20126b;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.sdk.webview.b.e */
public class C20133e implements C11093e {
    protected WeakReference<Context> mContextRef;

    public C20133e(WeakReference<Context> weakReference) {
        this.mContextRef = weakReference;
    }

    protected static Activity contextToActivity(Context context) {
        while (context != null) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    public void open(JSONObject jSONObject) {
        Context context;
        try {
            Activity activity = null;
            if (this.mContextRef != null) {
                context = (Context) this.mContextRef.get();
            } else {
                context = null;
            }
            if (context instanceof Activity) {
                activity = (Activity) context;
            }
            if (activity == null) {
                activity = contextToActivity(context);
            }
            if (activity != null && ((AbsActivity) activity).isActive()) {
                String optString = jSONObject.optString("type");
                if (!C6319n.m19593a(optString) && optString.indexOf(58) < 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(C20126b.m66361a().getSSLocalScheme());
                    sb.append("://");
                    sb.append(optString);
                    C19290j jVar = new C19290j(sb.toString());
                    generateUrl(jSONObject.optJSONObject("args"), jVar);
                    C20126b.m66361a().startAdsAppActivity(activity, jVar.mo51184a());
                }
            }
        } catch (Exception unused) {
        }
    }

    public void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        open(iVar.f30171d);
        jSONObject.put("code", 1);
    }

    private void generateUrl(JSONObject jSONObject, C19290j jVar) throws JSONException {
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
                } else if (obj instanceof Boolean) {
                    jVar.mo51188a(str, obj.toString());
                } else if (obj instanceof JSONObject) {
                    generateUrl((JSONObject) obj, jVar);
                }
            }
        }
    }
}
