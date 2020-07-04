package com.p280ss.android.ugc.aweme.sdk.wallet.module.withdraw;

/* renamed from: com.ss.android.ugc.aweme.sdk.wallet.module.withdraw.AuthFactory */
public class AuthFactory {
    public static IAuth createIAuth(String str) {
        if ("alipay".equals(str)) {
            return new AliPayAuth();
        }
        return null;
    }
}
