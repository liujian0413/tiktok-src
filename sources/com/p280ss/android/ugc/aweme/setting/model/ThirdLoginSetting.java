package com.p280ss.android.ugc.aweme.setting.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.login.LoginType;

/* renamed from: com.ss.android.ugc.aweme.setting.model.ThirdLoginSetting */
public class ThirdLoginSetting {
    public static final String SAVE_KEY = "i18n_third_login_strategy";
    @C6593c(mo15949a = "show_num")
    public int directShowNumber;
    @C6593c(mo15949a = "order")
    private String order;

    public LoginType[] getOrder() {
        if (TextUtils.isEmpty(this.order)) {
            return null;
        }
        String[] split = this.order.split(",");
        LoginType[] loginTypeArr = new LoginType[split.length];
        for (int i = 0; i < split.length; i++) {
            loginTypeArr[i] = LoginType.valueOf(split[i].toUpperCase());
        }
        return loginTypeArr;
    }
}
