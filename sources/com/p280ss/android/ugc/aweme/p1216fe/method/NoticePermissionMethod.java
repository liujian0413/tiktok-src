package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.ies.web.p582a.C11087a;
import com.facebook.react.bridge.ReactContext;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.utils.C43033cw;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.NoticePermissionMethod */
public class NoticePermissionMethod extends BaseCommonJavaMethod {
    public NoticePermissionMethod(C11087a aVar) {
        super(aVar);
    }

    public NoticePermissionMethod(ReactContext reactContext) {
        super(reactContext);
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) throws JSONException {
        Context context;
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
                Boolean valueOf = Boolean.valueOf(jSONObject.optBoolean("toOpen"));
                boolean a = C43033cw.m136550a(context);
                if (!a && valueOf.booleanValue()) {
                    try {
                        C43033cw.m136552b(context);
                    } catch (Exception unused) {
                        context.startActivity(new Intent("android.settings.SETTINGS"));
                    }
                }
                if (a) {
                    aVar.mo71363a((Object) "");
                } else {
                    aVar.mo71362a(0, "");
                }
            }
        }
    }
}
