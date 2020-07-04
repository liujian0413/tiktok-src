package com.p280ss.android.ugc.aweme.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import bolts.C1592h;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.sdk.IWalletService.C37304a;
import com.p280ss.android.ugc.aweme.sdk.bean.C37323c;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sdk.Wallet */
public final class Wallet {

    /* renamed from: com.ss.android.ugc.aweme.sdk.Wallet$DEFAULT */
    static final class DEFAULT implements IWalletService {
        private DEFAULT() {
        }

        public final void auth(Context context, String str, String str2, C37304a aVar) {
        }

        public final Map<String, C11093e> buildJavaMethods(WeakReference<Context> weakReference, C11087a aVar) {
            return null;
        }

        public final void cashOut(Context context, String str) {
        }

        public final void clearWallet() {
        }

        public final long getAvailableCurrency() {
            return 0;
        }

        public final void init(WeakReference<Context> weakReference, C11087a aVar) {
        }

        public final void onWxIntent(Context context, Intent intent) {
        }

        public final void openWallet(Activity activity) {
        }

        public final void openWallet(Activity activity, String str) {
        }

        public final boolean pay(String str, JSONObject jSONObject, C37304a aVar) {
            return false;
        }

        public final void setSetting(C37323c cVar) {
        }

        public final C1592h<Long> syncWallet() {
            return null;
        }

        public final void syncWallet(long j) {
        }
    }

    /* renamed from: a */
    public static IWalletService m119796a() {
        IWalletService iWalletService = (IWalletService) ServiceManager.get().getService(IWalletService.class);
        if (iWalletService == null) {
            return new DEFAULT();
        }
        return iWalletService;
    }
}
