package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.GroupAnnouncementContent */
public final class GroupAnnouncementContent extends BaseContent {
    @C6593c(mo15949a = "notice_content")
    private String announcement = "";
    @C6593c(mo15949a = "notice_title")
    private String title = "";

    public final String getAnnouncement() {
        return this.announcement;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getMsgHint() {
        String str = this.announcement;
        if (str == null) {
            return "";
        }
        return str;
    }

    public final void setAnnouncement(String str) {
        this.announcement = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }
}
