package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactContext;
import com.p280ss.android.ugc.aweme.account.p941d.C21166a;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27866a;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.BindPhoneMethod */
public class BindPhoneMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    private WeakReference<Context> f73452a;

    /* renamed from: c */
    private void m91339c() {
        C42961az.m136383d(this);
    }

    @C7709l
    public void onEvent(C21166a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject.put("type", "bindPhone");
                jSONObject2.put("code", TextUtils.isEmpty(aVar.f56897a) ^ true ? 1 : 0);
                if (!TextUtils.isEmpty(aVar.f56898b)) {
                    jSONObject2.put("_raw", aVar.f56898b);
                }
                jSONObject.put("args", jSONObject2);
            } catch (JSONException unused) {
            }
            mo71359a("H5_nativeEvent", jSONObject, 3);
        } catch (Exception unused2) {
        }
        m91339c();
    }

    public BindPhoneMethod(WeakReference<Context> weakReference, ReactContext reactContext) {
        super(reactContext);
        this.f73452a = weakReference;
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) {
        C42961az.m136382c(this);
        C27866a.m91289a((Context) this.f73452a.get(), jSONObject);
    }
}
