package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import android.content.Context;
import android.graphics.Color;
import com.facebook.react.bridge.ReactContext;
import com.google.gson.C18373n;
import com.google.gson.C6709k;
import com.google.gson.C6711m;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.commerce.p1105b.C24426a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import java.lang.ref.WeakReference;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.OpenHalfDialogBridge */
public final class OpenHalfDialogBridge extends BaseCommonJavaMethod {

    /* renamed from: a */
    private WeakReference<Context> f73517a;

    public OpenHalfDialogBridge(WeakReference<Context> weakReference, ReactContext reactContext) {
        C7573i.m23587b(weakReference, "contextRef");
        C7573i.m23587b(reactContext, "reactContext");
        super(reactContext);
        this.f73517a = weakReference;
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        Context context;
        float f;
        int i;
        C7573i.m23587b(jSONObject, "params");
        C7573i.m23587b(aVar, "iReturn");
        WeakReference<Context> weakReference = this.f73517a;
        if (weakReference != null) {
            context = (Context) weakReference.get();
        } else {
            context = null;
        }
        if (context != null) {
            Activity activity = (Activity) context;
            C6709k a = new C18373n().mo47346a(jSONObject.toString());
            C7573i.m23582a((Object) a, "JsonParser().parse(params.toString())");
            C6711m m = a.mo16136m();
            Context context2 = activity;
            C6709k b = m.mo16149b("height");
            C7573i.m23582a((Object) b, "jsonObject.get(\"height\")");
            int a2 = C23486n.m77123a(context2, b.mo16003g());
            C6709k b2 = m.mo16149b("schema");
            C7573i.m23582a((Object) b2, "jsonObject.get(\"schema\")");
            String c = b2.mo15998c();
            C7573i.m23582a((Object) c, "jsonObject.get(\"schema\").asString");
            C6709k b3 = m.mo16149b("borderRadius");
            if (b3 == null || b3.mo16135l()) {
                f = (float) C23486n.m77122a(8.0d);
            } else {
                f = (float) C23486n.m77123a(context2, b3.mo16003g());
            }
            float f2 = f;
            C6709k b4 = m.mo16149b("bgColor");
            if (b4 == null || b4.mo16135l()) {
                i = -1;
            } else {
                i = Color.parseColor(b4.mo15998c());
            }
            C24426a aVar2 = new C24426a(activity, a2, c, f2, true, i);
            aVar2.show();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.app.Activity");
    }
}
