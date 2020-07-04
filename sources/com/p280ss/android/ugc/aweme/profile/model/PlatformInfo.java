package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.PlatformInfo */
public class PlatformInfo implements Serializable {
    @C6593c(mo15949a = "full_synced")
    public boolean fullSynced;
    @C6593c(mo15949a = "nickname")
    public String nickName;
    @C6593c(mo15949a = "platform_name")
    public String patformName;

    public String getNickName() {
        return this.nickName;
    }

    public String getPatformName() {
        return this.patformName;
    }

    public boolean isFullSynced() {
        return this.fullSynced;
    }

    public void setFullSynced(boolean z) {
        this.fullSynced = z;
    }

    public void setNickName(String str) {
        this.nickName = str;
    }

    public void setPatformName(String str) {
        this.patformName = str;
    }
}
