package com.p280ss.android.ugc.aweme.sdk;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.C1642a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.sdk.IapWalletProxy */
public class IapWalletProxy implements IIapWalletProxy {
    private static final String CASH_OUT_URL = "https://www.musical.ly/wallet/withdraw/";
    private static final String TAG = "CashOutService";

    public void openWallet(Context context) {
        IWalletMainProxy iWalletMainProxy = (IWalletMainProxy) ServiceManager.get().getService(IWalletMainProxy.class);
        String str = "";
        if (iWalletMainProxy != null) {
            str = iWalletMainProxy.getSchema(IWalletMainProxy.KEY_PAGE_INDEX);
        }
        openWallet(context, str);
    }

    public void cashOut(Context context, String str) {
        try {
            context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(C1642a.m8035a(Locale.US, "%s?token=%s&diamond_type=%d", new Object[]{CASH_OUT_URL, str, Integer.valueOf(((IWalletMainProxy) ServiceManager.get().getService(IWalletMainProxy.class)).getDiamondType())}))));
        } catch (Exception unused) {
        }
    }

    public void openWallet(Context context, String str) {
        IWalletMainProxy iWalletMainProxy = (IWalletMainProxy) ServiceManager.get().getService(IWalletMainProxy.class);
        iWalletMainProxy.openSchema(context, iWalletMainProxy.getSchema(str));
    }
}
