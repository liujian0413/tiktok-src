package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.SystemContent */
public class SystemContent extends BaseContent {
    @C6593c(mo15949a = "group_tips")
    String groupNoticeTips;
    @C6593c(mo15949a = "template")
    Key[] template;
    @C6593c(mo15949a = "tips")
    String tips;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.SystemContent$Key */
    public static class Key {
        @C6593c(mo15949a = "action")
        int action;
        @C6593c(mo15949a = "extra")
        Map<String, String> extra;
        @C6593c(mo15949a = "key")
        String key;
        @C6593c(mo15949a = "link")
        String link;
        @C6593c(mo15949a = "name")
        String name;

        public int getAction() {
            return this.action;
        }

        public Map<String, String> getExtra() {
            return this.extra;
        }

        public String getKey() {
            return this.key;
        }

        public String getLink() {
            return this.link;
        }

        public String getName() {
            return this.name;
        }

        public void setAction(int i) {
            this.action = i;
        }

        public void setExtra(Map<String, String> map) {
            this.extra = map;
        }

        public void setKey(String str) {
            this.key = str;
        }

        public void setLink(String str) {
            this.link = str;
        }

        public void setName(String str) {
            this.name = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.SystemContent$LinkTypeExtra */
    public static class LinkTypeExtra {
        public static boolean isSafeWarningLink(Key key) {
            if (key != null) {
                try {
                    if (key.getExtra() != null) {
                        return TextUtils.equals((String) key.extra.get("link_type"), "safe_warning");
                    }
                } catch (Exception unused) {
                    return false;
                }
            }
            return false;
        }
    }

    public String getGroupNoticeTips() {
        return this.groupNoticeTips;
    }

    public Key[] getTemplate() {
        return this.template;
    }

    public String getTips() {
        return this.tips;
    }

    public String getMsgHint() {
        return getTips();
    }

    public void setGroupNoticeTips(String str) {
        this.groupNoticeTips = str;
    }

    public void setTemplate(Key[] keyArr) {
        this.template = keyArr;
    }

    public void setTips(String str) {
        this.tips = str;
    }
}
