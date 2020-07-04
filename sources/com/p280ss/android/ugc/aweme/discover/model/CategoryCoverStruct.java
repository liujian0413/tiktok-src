package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.CategoryCoverStruct */
public class CategoryCoverStruct implements Serializable {
    private static final long serialVersionUID = 1;
    @C6593c(mo15949a = "aweme_id")
    public String awemeId;
    @C6593c(mo15949a = "cover")
    public UrlModel cover;
    @C6593c(mo15949a = "dynamic_cover")
    public UrlModel dynamicCover;

    public String getAwemeId() {
        return this.awemeId;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public UrlModel getDynamicCover() {
        return this.dynamicCover;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setDynamicCover(UrlModel urlModel) {
        this.dynamicCover = urlModel;
    }
}
