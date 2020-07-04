package com.p280ss.android.ugc.aweme.bullet.bridge.common;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.bullet.core.model.p542a.C10403b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.sdk.webview.p900a.C20125a;
import com.p280ss.android.sdk.webview.p900a.C20126b;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge;
import com.p280ss.android.ugc.aweme.bullet.bridge.BaseBridge.C23565a;
import com.p280ss.android.ugc.aweme.utils.C43106er;
import java.util.Iterator;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenMethod */
public class OpenMethod extends BaseBridge {

    /* renamed from: f */
    public static final C23578a f62201f = new C23578a(null);

    /* renamed from: c */
    private String f62202c = "open";

    /* renamed from: com.ss.android.ugc.aweme.bullet.bridge.common.OpenMethod$a */
    public static final class C23578a {
        private C23578a() {
        }

        public /* synthetic */ C23578a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: c */
    public String mo25127c() {
        return this.f62202c;
    }

    public OpenMethod(C10403b bVar) {
        C7573i.m23587b(bVar, "contextProviderFactory");
        super(bVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Activity mo61500a(Context context) {
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

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo61501a(JSONObject jSONObject) {
        Activity activity;
        C7573i.m23587b(jSONObject, "params");
        try {
            Context context = this.f28552b;
            if (context instanceof Activity) {
                activity = (Activity) context;
            } else {
                activity = null;
            }
            if (activity == null) {
                activity = mo61500a(context);
            }
            if (activity != null && ((AbsActivity) activity).isActive()) {
                String optString = jSONObject.optString("type");
                if (!C6319n.m19593a(optString)) {
                    C7573i.m23582a((Object) optString, "p");
                    if (C7634n.m23726a((CharSequence) optString, ':', 0, false, 6, (Object) null) < 0) {
                        StringBuilder sb = new StringBuilder();
                        C20125a a = C20126b.m66361a();
                        C7573i.m23582a((Object) a, "MainServiceHolderForJsb.getService()");
                        sb.append(a.getSSLocalScheme());
                        sb.append("://");
                        sb.append(optString);
                        C19290j jVar = new C19290j(sb.toString());
                        m77412a(jSONObject.optJSONObject("args"), jVar);
                        C20126b.m66361a().startAdsAppActivity(activity, jVar.mo51184a());
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public void mo61491a(JSONObject jSONObject, C23565a aVar) {
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "iReturn");
        String string = jSONObject.getString("packageName");
        if (C43106er.m136726a(C6399b.m19921a(), string)) {
            aVar.mo61494a((Object) new JSONObject());
        } else {
            aVar.mo61493a(-1, string);
        }
    }

    /* renamed from: a */
    private final void m77412a(JSONObject jSONObject, C19290j jVar) throws JSONException {
        if (jSONObject != null && jSONObject.length() > 0) {
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str = (String) keys.next();
                Object obj = jSONObject.get(str);
                if (obj instanceof Integer) {
                    jVar.mo51186a(str, ((Number) obj).intValue());
                } else if (obj instanceof Long) {
                    jVar.mo51187a(str, ((Number) obj).longValue());
                } else if (obj instanceof Double) {
                    jVar.mo51185a(str, ((Number) obj).doubleValue());
                } else if (obj instanceof String) {
                    jVar.mo51188a(str, (String) obj);
                } else if (obj instanceof Boolean) {
                    jVar.mo51188a(str, obj.toString());
                } else if (obj instanceof JSONObject) {
                    m77412a((JSONObject) obj, jVar);
                }
            }
        }
    }
}
