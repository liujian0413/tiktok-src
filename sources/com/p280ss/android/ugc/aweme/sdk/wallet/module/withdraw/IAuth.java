package com.p280ss.android.ugc.aweme.sdk.wallet.module.withdraw;

import android.content.Context;
import com.p280ss.android.ugc.aweme.sdk.IWalletService.C37304a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sdk.wallet.module.withdraw.IAuth */
public interface IAuth {

    /* renamed from: com.ss.android.ugc.aweme.sdk.wallet.module.withdraw.IAuth$Params */
    public static class Params {
        private String mCallbackId;
        private JSONObject out;
        private JSONObject res;

        public String getCallbackId() {
            return this.mCallbackId;
        }

        public JSONObject getOut() {
            return this.out;
        }

        public JSONObject getRes() {
            return this.res;
        }

        public Params(JSONObject jSONObject, JSONObject jSONObject2, String str) {
            this.out = jSONObject2;
            this.res = jSONObject;
            this.mCallbackId = str;
        }
    }

    void auth(Context context, String str, C37304a aVar);
}
