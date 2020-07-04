package com.p280ss.android.ugc.aweme.account.loginsetting;

import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.account.loginsetting.ThirdBindSettingsResponse */
public class ThirdBindSettingsResponse {
    public List<BindSetting> data;
    public int status_code;
    public String status_msg;

    /* renamed from: com.ss.android.ugc.aweme.account.loginsetting.ThirdBindSettingsResponse$BindSetting */
    public static class BindSetting {
        public int bind_platform;
        public int bind_switch;
        public String bind_toast;
    }
}
