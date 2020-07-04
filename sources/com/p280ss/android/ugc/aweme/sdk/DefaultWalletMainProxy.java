package com.p280ss.android.ugc.aweme.sdk;

import android.content.Context;

/* renamed from: com.ss.android.ugc.aweme.sdk.DefaultWalletMainProxy */
public class DefaultWalletMainProxy implements IWalletMainProxy {
    public boolean enableShoppingTotal() {
        return false;
    }

    public int getDiamondType() {
        return 0;
    }

    public String getHost() {
        return "aweme.snssdk.com";
    }

    public String getIapKey() {
        return "";
    }

    public String getSchema(String str) {
        return "";
    }

    public void openSchema(Context context, String str) {
    }
}
