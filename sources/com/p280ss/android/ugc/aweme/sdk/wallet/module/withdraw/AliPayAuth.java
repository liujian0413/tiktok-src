package com.p280ss.android.ugc.aweme.sdk.wallet.module.withdraw;

import android.app.Activity;
import android.content.Context;
import bolts.C1591g;
import bolts.C1592h;
import com.alipay.sdk.app.AuthTask;
import com.p280ss.android.ugc.aweme.sdk.IWalletService.C37304a;
import java.util.concurrent.Callable;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sdk.wallet.module.withdraw.AliPayAuth */
public class AliPayAuth implements IAuth {
    private int checkAuthResult(String str) throws Exception {
        return AliPayApiImpl.checkBindResult(1, 0, str).status_code;
    }

    static final /* synthetic */ Void lambda$auth$1$AliPayAuth(C37304a aVar, C1592h hVar) throws Exception {
        if (hVar.mo6882b()) {
            aVar.onSuccess((JSONObject) hVar.mo6890e());
        } else {
            aVar.onFail(hVar.mo6891f());
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ JSONObject lambda$auth$0$AliPayAuth(Activity activity, String str) throws Exception {
        int checkAuthResult = checkAuthResult(new AuthTask(activity).auth(str, true));
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("auth_result", checkAuthResult);
        return jSONObject;
    }

    public void auth(Context context, String str, C37304a aVar) {
        Activity activity;
        if (context instanceof Activity) {
            activity = (Activity) context;
        } else {
            activity = null;
        }
        if (activity == null) {
            aVar.onFail(new Exception("context is null"));
        } else {
            C1592h.m7853a((Callable<TResult>) new AliPayAuth$$Lambda$0<TResult>(this, activity, str)).mo6875a((C1591g<TResult, TContinuationResult>) new AliPayAuth$$Lambda$1<TResult,TContinuationResult>(aVar));
        }
    }
}
