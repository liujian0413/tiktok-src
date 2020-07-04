package com.p280ss.android.ugc.aweme.p313im.sdk.detail.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.detail.model.GroupPasswordDetail */
public final class GroupPasswordDetail implements Serializable {
    @C6593c(mo15949a = "description")
    private String description;
    @C6593c(mo15949a = "share_channel")
    private int shareChannel;
    @C6593c(mo15949a = "token")
    private String token;

    public final String getDescription() {
        return this.description;
    }

    public final int getShareChannel() {
        return this.shareChannel;
    }

    public final String getToken() {
        return this.token;
    }

    public final void setDescription(String str) {
        this.description = str;
    }

    public final void setShareChannel(int i) {
        this.shareChannel = i;
    }

    public final void setToken(String str) {
        this.token = str;
    }
}
