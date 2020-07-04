package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.UserRateRemindInfo */
public class UserRateRemindInfo implements Serializable {
    @C6593c(mo15949a = "detail_link")
    String detailLink;
    @C6593c(mo15949a = "remind_text")
    String remindText;
    @C6593c(mo15949a = "show_day_limit")
    int showDayLimit;

    public String getDetailLink() {
        return this.detailLink;
    }

    public String getRemindText() {
        return this.remindText;
    }

    public int getShowDayLimit() {
        return this.showDayLimit;
    }

    public void setDetailLink(String str) {
        this.detailLink = str;
    }

    public void setRemindText(String str) {
        this.remindText = str;
    }

    public void setShowDayLimit(int i) {
        this.showDayLimit = i;
    }
}
