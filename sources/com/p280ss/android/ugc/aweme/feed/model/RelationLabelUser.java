package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.RelationLabelUser */
public final class RelationLabelUser implements Serializable {
    @C6593c(mo15949a = "avatar")
    public UrlModel avatarLarger;
    @C6593c(mo15949a = "avatar_thumb")
    public UrlModel avatarThumb;
    @C6593c(mo15949a = "follow_status")
    public int followStatus;
    @C6593c(mo15949a = "nickname")
    public String nickName = "";
    @C6593c(mo15949a = "remark_name")
    public String remarkName = "";
    @C6593c(mo15949a = "sec_uid")
    public String secUid = "";
    @C6593c(mo15949a = "uid")
    public long uid;

    public final UrlModel getAvatarLarger() {
        return this.avatarLarger;
    }

    public final UrlModel getAvatarThumb() {
        return this.avatarThumb;
    }

    public final int getFollowStatus() {
        return this.followStatus;
    }

    public final String getNickName() {
        return this.nickName;
    }

    public final String getRemarkName() {
        return this.remarkName;
    }

    public final String getSecUid() {
        return this.secUid;
    }

    public final long getUid() {
        return this.uid;
    }

    public final void setAvatarLarger(UrlModel urlModel) {
        this.avatarLarger = urlModel;
    }

    public final void setAvatarThumb(UrlModel urlModel) {
        this.avatarThumb = urlModel;
    }

    public final void setFollowStatus(int i) {
        this.followStatus = i;
    }

    public final void setNickName(String str) {
        this.nickName = str;
    }

    public final void setRemarkName(String str) {
        this.remarkName = str;
    }

    public final void setSecUid(String str) {
        this.secUid = str;
    }

    public final void setUid(long j) {
        this.uid = j;
    }
}
