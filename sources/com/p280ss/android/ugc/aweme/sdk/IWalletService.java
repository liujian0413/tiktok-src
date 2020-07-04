package com.p280ss.android.ugc.aweme.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import bolts.C1592h;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.p280ss.android.ugc.aweme.sdk.bean.C37323c;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sdk.IWalletService */
public interface IWalletService {

    /* renamed from: com.ss.android.ugc.aweme.sdk.IWalletService$a */
    public interface C37304a {
        void onFail(Exception exc);

        void onSuccess(JSONObject jSONObject);
    }

    void auth(Context context, String str, String str2, C37304a aVar);

    Map<String, C11093e> buildJavaMethods(WeakReference<Context> weakReference, C11087a aVar);

    void cashOut(Context context, String str);

    void clearWallet();

    long getAvailableCurrency();

    void init(WeakReference<Context> weakReference, C11087a aVar);

    void onWxIntent(Context context, Intent intent);

    void openWallet(Activity activity);

    void openWallet(Activity activity, String str);

    boolean pay(String str, JSONObject jSONObject, C37304a aVar);

    void setSetting(C37323c cVar);

    C1592h<Long> syncWallet();

    void syncWallet(long j);
}
