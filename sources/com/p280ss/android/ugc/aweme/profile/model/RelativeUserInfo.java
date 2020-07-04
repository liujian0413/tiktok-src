package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.RelativeUserInfo */
public class RelativeUserInfo implements Serializable {
    @C6593c(mo15949a = "avatar")
    public UrlModel avatar;
    @C6593c(mo15949a = "uid")
    public String uid;

    public UrlModel getAvatar() {
        return this.avatar;
    }

    public String getUid() {
        return this.uid;
    }

    public void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public void setUid(String str) {
        this.uid = str;
    }
}
