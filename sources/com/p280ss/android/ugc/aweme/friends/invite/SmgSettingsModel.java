package com.p280ss.android.ugc.aweme.friends.invite;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.friends.invite.SmgSettingsModel */
public class SmgSettingsModel implements Serializable {
    @C6593c(mo15949a = "footer_invite_all")
    private boolean floatInviteAll;
    @C6593c(mo15949a = "limit_invite_all")
    private int mLimitInviteAllCount;
    @C6593c(mo15949a = "show_invite_all")
    private boolean showInviteAll;
    @C6593c(mo15949a = "text")
    private String text;
    @C6593c(mo15949a = "url")
    private String url;

    public int getLimitInviteAllCount() {
        return this.mLimitInviteAllCount;
    }

    public String getText() {
        return this.text;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean isFloatInviteAll() {
        return this.floatInviteAll;
    }

    public boolean isShowInviteAll() {
        return this.showInviteAll;
    }

    public void setFloatInviteAll(boolean z) {
        this.floatInviteAll = z;
    }

    public void setShowInviteAll(boolean z) {
        this.showInviteAll = z;
    }

    public void setText(String str) {
        this.text = str;
    }

    public void setUrl(String str) {
        this.url = str;
    }
}
