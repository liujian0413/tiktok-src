package com.p280ss.android.ugc.aweme.sdk.wallet.jsbridge;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.sdk.webview.p901b.C20133e;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.sdk.IWalletService;
import com.p280ss.android.ugc.aweme.sdk.IWalletService.C37304a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sdk.wallet.jsbridge.AuthJavaMethod */
public class AuthJavaMethod extends C20133e {
    public C11087a jsBridge;

    public AuthJavaMethod(WeakReference<Context> weakReference, C11087a aVar) {
        super(weakReference);
        this.jsBridge = aVar;
    }

    public void call(final C11097i iVar, final JSONObject jSONObject) throws Exception {
        JSONObject jSONObject2;
        if (iVar.f30171d.has("args")) {
            jSONObject2 = iVar.f30171d.getJSONObject("args");
        } else {
            jSONObject2 = null;
        }
        if (jSONObject2 != null) {
            iVar.f30173f = false;
            String string = iVar.f30171d.getString("type");
            if (!TextUtils.isEmpty(string)) {
                IWalletService iWalletService = (IWalletService) ServiceManager.get().getService(IWalletService.class);
                if (this.mContextRef.get() != null) {
                    iWalletService.auth((Context) this.mContextRef.get(), string, jSONObject2.optString("info_str"), new C37304a() {
                        public void onFail(Exception exc) {
                        }

                        public void onSuccess(JSONObject jSONObject) {
                            AuthJavaMethod.this.jsBridge.mo27030a(iVar.f30169b, jSONObject);
                        }
                    });
                }
            }
        }
    }
}
