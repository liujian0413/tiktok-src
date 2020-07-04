package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.ImageInfo */
public class ImageInfo implements Serializable {
    @C6593c(mo15949a = "height")
    public int height;
    @C6593c(mo15949a = "label_large")
    public UrlModel labelLarge;
    @C6593c(mo15949a = "label_thumb")
    public UrlModel labelThumb;
    @C6593c(mo15949a = "width")
    public int width;

    public int getHeight() {
        return this.height;
    }

    public UrlModel getLabelLarge() {
        return this.labelLarge;
    }

    public UrlModel getLabelThumb() {
        return this.labelThumb;
    }

    public int getWidth() {
        return this.width;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLabelLarge(UrlModel urlModel) {
        this.labelLarge = urlModel;
    }

    public void setLabelThumb(UrlModel urlModel) {
        this.labelThumb = urlModel;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
