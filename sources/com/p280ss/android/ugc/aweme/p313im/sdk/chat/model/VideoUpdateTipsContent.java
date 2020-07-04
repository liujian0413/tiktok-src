package com.p280ss.android.ugc.aweme.p313im.sdk.chat.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.model.VideoUpdateTipsContent */
public class VideoUpdateTipsContent extends BaseContent {
    @C6593c(mo15949a = "tip_aid")
    String aid;
    @C6593c(mo15949a = "tip_content")
    String content;
    @C6593c(mo15949a = "tip_cover")
    UrlModel cover;
    @C6593c(mo15949a = "is_photo")
    boolean isPhoto;
    @C6593c(mo15949a = "tip_title")
    String title;
    @C6593c(mo15949a = "tip_uid")
    String uid;

    public String getAid() {
        return this.aid;
    }

    public String getContent() {
        return this.content;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public String getTitle() {
        return this.title;
    }

    public String getUid() {
        return this.uid;
    }

    public boolean isPhoto() {
        return this.isPhoto;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setPhoto(boolean z) {
        this.isPhoto = z;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setUid(String str) {
        this.uid = str;
    }
}
