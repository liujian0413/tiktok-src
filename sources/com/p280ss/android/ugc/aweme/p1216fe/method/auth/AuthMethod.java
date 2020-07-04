package com.p280ss.android.ugc.aweme.p1216fe.method.auth;

import android.content.Context;
import android.text.TextUtils;
import com.facebook.react.bridge.ReactContext;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.sdk.IWalletService;
import com.p280ss.android.ugc.aweme.sdk.IWalletService.C37304a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.auth.AuthMethod */
public class AuthMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    private WeakReference<Context> f73641a;

    public AuthMethod(WeakReference<Context> weakReference, ReactContext reactContext) {
        super(reactContext);
        this.f73641a = weakReference;
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, final C27876a aVar) {
        JSONObject optJSONObject = jSONObject.optJSONObject("args");
        if (optJSONObject != null) {
            String optString = jSONObject.optString("type");
            String optString2 = optJSONObject.optString("info_str");
            if (!TextUtils.isEmpty(optString) && this.f73641a.get() != null) {
                ((IWalletService) ServiceManager.get().getService(IWalletService.class)).auth((Context) this.f73641a.get(), optString, optString2, new C37304a() {
                    public final void onSuccess(JSONObject jSONObject) {
                        aVar.mo71363a((Object) jSONObject);
                    }

                    public final void onFail(Exception exc) {
                        aVar.mo71362a(-1, exc.getMessage());
                    }
                });
            }
        }
    }
}
