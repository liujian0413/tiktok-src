package com.p280ss.android.ugc.aweme.sdk;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import bolts.C1592h;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.sdk.IWalletService.C37304a;
import com.p280ss.android.ugc.aweme.sdk.bean.C37321a;
import com.p280ss.android.ugc.aweme.sdk.bean.C37323c;
import com.p280ss.android.ugc.aweme.sdk.p1507a.C37309b;
import com.p280ss.android.ugc.aweme.sdk.p1507a.C37311c;
import com.p280ss.android.ugc.aweme.sdk.p1507a.C37313d;
import com.p280ss.android.ugc.aweme.sdk.p1507a.C37314e;
import java.lang.ref.WeakReference;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.sdk.WalletService */
public class WalletService implements IWalletService {
    public void auth(Context context, String str, String str2, C37304a aVar) {
    }

    public void onWxIntent(Context context, Intent intent) {
    }

    public boolean pay(String str, JSONObject jSONObject, C37304a aVar) {
        return false;
    }

    public void setSetting(C37323c cVar) {
    }

    public void clearWallet() {
        C37325d.m119824a().mo93938d();
    }

    public long getAvailableCurrency() {
        return C37325d.m119824a().mo93937c();
    }

    public C1592h<Long> syncWallet() {
        return C37325d.m119824a().mo93936b();
    }

    public void openWallet(Activity activity) {
        IIapWalletProxy iIapWalletProxy = (IIapWalletProxy) ServiceManager.get().getService(IIapWalletProxy.class);
        if (iIapWalletProxy != null) {
            iIapWalletProxy.openWallet(activity);
        }
    }

    public void syncWallet(long j) {
        C37321a aVar = C37325d.m119824a().f97471a;
        if (aVar != null) {
            aVar.f97463b = j;
        }
    }

    public void cashOut(Context context, String str) {
        IIapWalletProxy iIapWalletProxy = (IIapWalletProxy) ServiceManager.get().getService(IIapWalletProxy.class);
        if (iIapWalletProxy != null) {
            iIapWalletProxy.cashOut(context, str);
        }
    }

    public Map<String, C11093e> buildJavaMethods(WeakReference<Context> weakReference, C11087a aVar) {
        Context context = (Context) weakReference.get();
        C37313d dVar = new C37313d();
        C37306a a = C37306a.m119797a().mo93925a(aVar).mo93926a("charge", new C37309b(context, aVar, dVar)).mo93926a("getPurchaseItemList", new C37311c(context, aVar, dVar)).mo93927a();
        C37314e.m119810a();
        return C37314e.m119812b(a);
    }

    public void init(WeakReference<Context> weakReference, C11087a aVar) {
        Context context = (Context) weakReference.get();
        C37313d dVar = new C37313d();
        C37306a a = C37306a.m119797a().mo93925a(aVar).mo93926a("charge", new C37309b(context, aVar, dVar)).mo93926a("getPurchaseItemList", new C37311c(context, aVar, dVar)).mo93927a();
        C37314e.m119810a();
        C37314e.m119811a(a);
    }

    public void openWallet(Activity activity, String str) {
        IIapWalletProxy iIapWalletProxy = (IIapWalletProxy) ServiceManager.get().getService(IIapWalletProxy.class);
        if (iIapWalletProxy != null) {
            iIapWalletProxy.openWallet(activity, str);
        }
    }
}
