package com.p280ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p276a.C6593c;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.UrgeNotice */
public class UrgeNotice {
    @C6593c(mo15949a = "blcok_urge_setting")
    private int blcokUrgeSetting;
    @C6593c(mo15949a = "content")
    private String content;
    @C6593c(mo15949a = "urge_unread_count")
    private long urgeUnreadCount;

    public int getBlcokUrgeSetting() {
        return this.blcokUrgeSetting;
    }

    public String getContent() {
        return this.content;
    }

    public long getUrgeUnreadCount() {
        return this.urgeUnreadCount;
    }

    public void setBlcokUrgeSetting(int i) {
        this.blcokUrgeSetting = i;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setUrgeUnreadCount(long j) {
        this.urgeUnreadCount = j;
    }
}
