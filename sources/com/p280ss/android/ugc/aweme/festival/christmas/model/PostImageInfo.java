package com.p280ss.android.ugc.aweme.festival.christmas.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.festival.christmas.model.PostImageInfo */
public class PostImageInfo implements Serializable {
    @C6593c(mo15949a = "avatar")
    private UrlModel userAvatarUrl;
    @C6593c(mo15949a = "cover")
    private UrlModel videoCoverUrl;

    public UrlModel getUserAvatarUrl() {
        return this.userAvatarUrl;
    }

    public UrlModel getVideoCoverUrl() {
        return this.videoCoverUrl;
    }

    public void setUserAvatarUrl(UrlModel urlModel) {
        this.userAvatarUrl = urlModel;
    }

    public void setVideoCoverUrl(UrlModel urlModel) {
        this.videoCoverUrl = urlModel;
    }
}
