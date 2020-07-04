package com.p280ss.android.ugc.aweme.account.loginsetting;

import com.google.common.util.concurrent.C18253l;
import retrofit2.p363b.C7730f;

/* renamed from: com.ss.android.ugc.aweme.account.loginsetting.LoginSettingApi */
public final class LoginSettingApi {

    /* renamed from: com.ss.android.ugc.aweme.account.loginsetting.LoginSettingApi$Api */
    public interface Api {
        @C7730f(mo20420a = "aweme/v1/bind/settings")
        C18253l<String> getBindSetting();

        @C7730f(mo20420a = "aweme/v1/login/settings")
        C18253l<String> getLoginSetting();
    }
}
