package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeLabelModel */
public class AwemeLabelModel implements Serializable {
    @C6593c(mo15949a = "label_type")
    public int labelType;
    @C6593c(mo15949a = "label_url")
    public UrlModel urlModels;

    public AwemeLabelModel() {
    }

    public int getLabelType() {
        return this.labelType;
    }

    public UrlModel getUrlModels() {
        return this.urlModels;
    }

    public void setLabelType(int i) {
        this.labelType = i;
    }

    public void setUrlModels(UrlModel urlModel) {
        this.urlModels = urlModel;
    }

    public AwemeLabelModel(UrlModel urlModel, int i) {
        this.urlModels = urlModel;
        this.labelType = i;
    }
}
