package com.p280ss.android.ugc.aweme.music.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.music.model.MusicOwnerInfo */
public final class MusicOwnerInfo implements Serializable {
    @C6593c(mo15949a = "avatar")
    private UrlModel avatar;
    @C6593c(mo15949a = "enter_type")
    private int enterType;
    @C6593c(mo15949a = "handle")
    private String handle;
    @C6593c(mo15949a = "nick_name")
    private String nickName;
    @C6593c(mo15949a = "sec_uid")
    private String secUid;
    @C6593c(mo15949a = "uid")
    private String uid;
    @C6593c(mo15949a = "is_verified")
    private boolean verified;

    public final UrlModel getAvatar() {
        return this.avatar;
    }

    public final int getEnterType() {
        return this.enterType;
    }

    public final String getHandle() {
        return this.handle;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final String getUid() {
        return this.uid;
    }

    public final boolean getVerified() {
        return this.verified;
    }

    public final void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public final void setEnterType(int i) {
        this.enterType = i;
    }

    public final void setHandle(String str) {
        this.handle = str;
    }

    public final void setNickName(String str) {
        this.nickName = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUid(String str) {
        this.uid = str;
    }

    public final void setVerified(boolean z) {
        this.verified = z;
    }
}
