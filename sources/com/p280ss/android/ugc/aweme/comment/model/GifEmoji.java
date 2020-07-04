package com.p280ss.android.ugc.aweme.comment.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.comment.model.GifEmoji */
public final class GifEmoji implements Serializable {
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private final String f63857id = "";
    @C6593c(mo15949a = "image_id")
    private final long imageId;
    private LogPbBean logPb;
    @C6593c(mo15949a = "origin")
    private final UrlModel origin;
    @C6593c(mo15949a = "stcker_type")
    private final int stickerType;
    @C6593c(mo15949a = "thumbnail")
    private final UrlModel thumbnail;

    public final String getId() {
        return this.f63857id;
    }

    public final long getImageId() {
        return this.imageId;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final UrlModel getOrigin() {
        return this.origin;
    }

    public final int getStickerType() {
        return this.stickerType;
    }

    public final UrlModel getThumbnail() {
        return this.thumbnail;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }
}
