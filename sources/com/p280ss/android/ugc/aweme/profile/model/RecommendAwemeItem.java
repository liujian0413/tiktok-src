package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.RecommendAwemeItem */
public class RecommendAwemeItem implements Serializable {
    @C6593c(mo15949a = "aweme_id")
    public String aid;
    @C6593c(mo15949a = "cover")
    public UrlModel cover;
    @C6593c(mo15949a = "dynamic_cover")
    public UrlModel dynamicCover;
    @C6593c(mo15949a = "media_type")
    public String mediaType;

    public String getAid() {
        return this.aid;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public UrlModel getDynamicCover() {
        return this.dynamicCover;
    }

    public String getMediaType() {
        return this.mediaType;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setDynamicCover(UrlModel urlModel) {
        this.dynamicCover = urlModel;
    }

    public void setMediaType(String str) {
        this.mediaType = str;
    }
}
