package com.p280ss.android.ugc.aweme.commercialize.loft.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.model.LoftVideoMore */
public final class LoftVideoMore implements Serializable {
    @C6593c(mo15949a = "desc")
    private String desc;
    @C6593c(mo15949a = "icon")
    private UrlModel imageUrl;
    @C6593c(mo15949a = "schema")
    private String schema;
    @C6593c(mo15949a = "has_auto_mask")
    private boolean withAutoMask;

    public final String getDesc() {
        return this.desc;
    }

    public final UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final boolean getWithAutoMask() {
        return this.withAutoMask;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setImageUrl(UrlModel urlModel) {
        this.imageUrl = urlModel;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setWithAutoMask(boolean z) {
        this.withAutoMask = z;
    }
}
