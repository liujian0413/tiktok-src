package com.p280ss.android.ugc.aweme.wallet;

import android.app.Activity;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p280ss.android.ugc.aweme.sdk.IWalletService;

/* renamed from: com.ss.android.ugc.aweme.wallet.a */
public final class C43395a {

    /* renamed from: a */
    private static C43396b f112397a;

    /* renamed from: a */
    public static IWalletService m137714a() {
        return (IWalletService) ServiceManager.get().getService(IWalletService.class);
    }

    /* renamed from: b */
    public static boolean m137718b() {
        if (ServiceManager.get().getService(IWalletService.class) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m137717a(C43396b bVar) {
        if (bVar != null) {
            f112397a = bVar;
            Editor edit = SharePrefCache.inst().getSharePref().edit();
            edit.putString(IWalletMainProxy.KEY_PAGE_CHARGE, bVar.f112398a);
            edit.putString(IWalletMainProxy.KEY_PAGE_INDEX, bVar.f112399b);
        }
    }

    /* renamed from: a */
    public static String m137715a(String str) {
        if (f112397a == null) {
            return SharePrefCache.inst().getSharePref().getString(str, "");
        }
        if (TextUtils.equals(str, IWalletMainProxy.KEY_PAGE_CHARGE) && !TextUtils.isEmpty(f112397a.mo105303a())) {
            return f112397a.mo105303a();
        }
        if (!TextUtils.equals(str, IWalletMainProxy.KEY_PAGE_INDEX) || TextUtils.isEmpty(f112397a.mo105304b())) {
            return "";
        }
        return f112397a.mo105304b();
    }

    /* renamed from: a */
    public static void m137716a(Activity activity, String str) {
        IWalletService iWalletService = (IWalletService) ServiceManager.get().getService(IWalletService.class);
        if (iWalletService != null && !TextUtils.equals("amazon", C6399b.m19941q())) {
            iWalletService.openWallet(activity, str);
        }
    }
}
