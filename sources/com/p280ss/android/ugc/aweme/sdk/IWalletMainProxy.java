package com.p280ss.android.ugc.aweme.sdk;

import android.content.Context;

/* renamed from: com.ss.android.ugc.aweme.sdk.IWalletMainProxy */
public interface IWalletMainProxy {
    public static final String KEY_PAGE_CHARGE = "page_charge";
    public static final String KEY_PAGE_INDEX = "page_index";

    boolean enableShoppingTotal();

    int getDiamondType();

    String getHost();

    String getIapKey();

    String getSchema(String str);

    void openSchema(Context context, String str);
}
