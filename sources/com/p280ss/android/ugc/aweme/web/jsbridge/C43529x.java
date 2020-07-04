package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReadableMap;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.bridge.C29953a;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27868c;
import com.p280ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.x */
public final class C43529x implements C11093e, C29953a {

    /* renamed from: a */
    protected WeakReference<Context> f112696a;

    public C43529x(WeakReference<Context> weakReference) {
        this.f112696a = weakReference;
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        if (this.f112696a != null && this.f112696a.get() != null) {
            C6907h.m21524a("qr_code_scan_enter", (Map) C22984d.m75611a().mo59973a("enter_from", "h5").f60753a);
            JSONObject jSONObject2 = null;
            if (iVar.f30171d.has("args")) {
                jSONObject2 = iVar.f30171d.getJSONObject("args");
            }
            int i = -1;
            if (jSONObject2 != null && jSONObject2.has("feature") && TextUtils.equals("company_coupon", jSONObject2.optString("feature"))) {
                i = 3;
            }
            QRCodePermissionActivity.m119023a((Context) this.f112696a.get(), false, i);
            if (jSONObject2 != null && jSONObject2.has("should_close_self") && jSONObject2.getBoolean("should_close_self")) {
                Context context = (Context) this.f112696a.get();
                if (context instanceof Activity) {
                    ((Activity) context).finish();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo67335a(String str, ReadableMap readableMap, Callback callback) {
        if (this.f112696a != null && this.f112696a.get() != null) {
            C6907h.m21524a("qr_code_scan_enter", (Map) C22984d.m75611a().mo59973a("enter_from", "h5").f60753a);
            JSONObject jSONObject = null;
            try {
                JSONObject a = C27868c.m91296a(readableMap);
                if (a.has("args")) {
                    jSONObject = a.getJSONObject("args");
                }
                int i = -1;
                if (jSONObject != null && jSONObject.has("feature") && TextUtils.equals("company_coupon", jSONObject.optString("feature"))) {
                    i = 3;
                }
                QRCodePermissionActivity.m119023a((Context) this.f112696a.get(), false, i);
                if (jSONObject != null && jSONObject.has("should_close_self") && jSONObject.getBoolean("should_close_self")) {
                    Context context = (Context) this.f112696a.get();
                    if (context instanceof Activity) {
                        ((Activity) context).finish();
                    }
                }
            } catch (JSONException unused) {
                QRCodePermissionActivity.m119022a((Context) this.f112696a.get(), false);
            }
        }
    }
}
