package com.p280ss.android.ugc.aweme.festival.christmas.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.festival.christmas.model.ShareCopyWritingInfo */
public class ShareCopyWritingInfo implements Serializable {
    @C6593c(mo15949a = "feedback")
    private ContentInfo feedback;
    @C6593c(mo15949a = "image")
    private UrlModel imageUrl;
    @C6593c(mo15949a = "title")
    private ContentInfo title;
    @C6593c(mo15949a = "warning")
    private String warning;

    public ContentInfo getFeedback() {
        return this.feedback;
    }

    public UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public ContentInfo getTitle() {
        return this.title;
    }

    public String getWarning() {
        return this.warning;
    }

    public void setFeedback(ContentInfo contentInfo) {
        this.feedback = contentInfo;
    }

    public void setImageUrl(UrlModel urlModel) {
        this.imageUrl = urlModel;
    }

    public void setTitle(ContentInfo contentInfo) {
        this.title = contentInfo;
    }

    public void setWarning(String str) {
        this.warning = str;
    }
}
