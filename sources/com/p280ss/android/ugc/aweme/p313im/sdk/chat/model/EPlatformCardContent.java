package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import com.google.gson.p276a.C6593c;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.EPlatformCardContent */
public class EPlatformCardContent extends BaseContent {
    @C6593c(mo15949a = "actions")
    public Map<String, LinkItem> actions;
    @C6593c(mo15949a = "content")
    public String content;
    @C6593c(mo15949a = "push_detail")
    public String pushDetail;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.EPlatformCardContent$ExtraParams */
    public static class ExtraParams {
        @C6593c(mo15949a = "show_more_button")
        public String showMoreButton;
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.EPlatformCardContent$LinkItem */
    public static class LinkItem {
        @C6593c(mo15949a = "action_type")
        public int actionType;
        @C6593c(mo15949a = "ext_params")
        public ExtraParams extraParams;
        @C6593c(mo15949a = "name")
        public String name;
        @C6593c(mo15949a = "phone_encrypt_key")
        public String phoneEncryptKey;
        @C6593c(mo15949a = "phone_instance_id")
        public String phoneInstanceId;
        @C6593c(mo15949a = "phone_number")
        public String phoneNumber;
        @C6593c(mo15949a = "value")
        public String value;
    }

    public String getMsgHint() {
        return this.pushDetail;
    }
}
