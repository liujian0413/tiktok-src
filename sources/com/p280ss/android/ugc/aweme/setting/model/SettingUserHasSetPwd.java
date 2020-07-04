package com.p280ss.android.ugc.aweme.setting.model;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.setting.model.SettingUserHasSetPwd */
public class SettingUserHasSetPwd {
    @C6593c(mo15949a = "data")
    public Data data;
    @C6593c(mo15949a = "message")
    public String message;

    /* renamed from: com.ss.android.ugc.aweme.setting.model.SettingUserHasSetPwd$Data */
    public static class Data {
        @C6593c(mo15949a = "captcha")
        public String captcha;
        @C6593c(mo15949a = "description")
        public String description;
        @C6593c(mo15949a = "error_code")
        public int errorCode;
        @C6593c(mo15949a = "has_set")
        public boolean hasSet;
    }
}
