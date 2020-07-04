package com.p280ss.android.ugc.aweme.wallet;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25833b;
import com.p280ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p280ss.android.ugc.aweme.sdk.bean.C37323c;

/* renamed from: com.ss.android.ugc.aweme.wallet.WalletMainProxy */
public class WalletMainProxy implements IWalletMainProxy {
    private C37323c walletSetting;

    public int getDiamondType() {
        return 1;
    }

    public String getHost() {
        return "api2.musical.ly";
    }

    public String getIapKey() {
        return "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAi15r9zfdlMuE3zfC3ZZEA4U0ursaCpeXTw024ezGLKOVz7E+hBgbAhsONpfZ9tTqzEm+nc48hSs0gvhbWxFd8wSelqqJQhpSaVFLwC8VKA/oPDL7MAwbGfnlaAADwer4EOZ29KJFRiWWxolOvw9Vpzfrca6JvxSe87Y2buZp+z9kFxlGfUpyPpTkqh/8IuvZnQRTVnlOtZ1aV0urNjHgwj760LlCGO6Mwta82YTIrHIFO7JKhT5aXcrnrb7WnlojKtM3mNZ6q157D2fGiv+Gsule/ullOmXLvSkW0bJXCoQRnE9HxzmRKNss4ekmX3Vr+jmEcw1esSJ6V6LtY4JAeQIDAQAB";
    }

    public boolean enableShoppingTotal() {
        return ((Boolean) C23060u.m75742a().mo60042L().mo59877d()).booleanValue();
    }

    public String getSchema(String str) {
        String a = C43395a.m137715a(str);
        if (!TextUtils.isEmpty(a)) {
            return a;
        }
        if (TextUtils.equals(str, IWalletMainProxy.KEY_PAGE_INDEX)) {
            return "aweme://webview/?url=https%3A%2F%2Fm.tiktok.com%2Ffalcon%2Fwallet%2Fhome%3Fhide_nav_bar%3D1";
        }
        if (TextUtils.equals(str, IWalletMainProxy.KEY_PAGE_CHARGE)) {
            return "aweme://webview/?url=https%3A%2F%2Fm.tiktok.com%2Ffalcon%2Fwallet%2Fhome%3Fhide_nav_bar%3D1";
        }
        return "aweme://webview/?url=https%3A%2F%2Fm.tiktok.com%2Ffalcon%2Fwallet%2Fhome%3Fhide_nav_bar%3D1";
    }

    public void openSchema(Context context, String str) {
        if (!TextUtils.equals("amazon", C6399b.m19941q())) {
            context.startActivity(C25833b.m84945a(context, Uri.parse(str)));
        }
    }
}
