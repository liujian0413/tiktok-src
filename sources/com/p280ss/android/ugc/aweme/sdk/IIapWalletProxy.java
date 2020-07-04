package com.p280ss.android.ugc.aweme.sdk;

import android.content.Context;

/* renamed from: com.ss.android.ugc.aweme.sdk.IIapWalletProxy */
public interface IIapWalletProxy {
    void cashOut(Context context, String str);

    void openWallet(Context context);

    void openWallet(Context context, String str);
}
