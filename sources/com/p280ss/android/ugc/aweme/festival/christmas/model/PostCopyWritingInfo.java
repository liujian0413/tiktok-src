package com.p280ss.android.ugc.aweme.festival.christmas.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.festival.christmas.model.PostCopyWritingInfo */
public class PostCopyWritingInfo implements Serializable {
    @C6593c(mo15949a = "after")
    private ContentInfo afterActionContent;
    @C6593c(mo15949a = "feedback")
    private ContentInfo feedback;
    @C6593c(mo15949a = "image")
    public PostImageInfo image;
    @C6593c(mo15949a = "link")
    private ContentInfo link;
    @C6593c(mo15949a = "title")
    private ContentInfo title;

    public ContentInfo getAfterActionContent() {
        return this.afterActionContent;
    }

    public ContentInfo getFeedback() {
        return this.feedback;
    }

    public PostImageInfo getImage() {
        return this.image;
    }

    public ContentInfo getLink() {
        return this.link;
    }

    public ContentInfo getTitle() {
        return this.title;
    }

    public void setAfterActionContent(ContentInfo contentInfo) {
        this.afterActionContent = contentInfo;
    }

    public void setFeedback(ContentInfo contentInfo) {
        this.feedback = contentInfo;
    }

    public void setImage(PostImageInfo postImageInfo) {
        this.image = postImageInfo;
    }

    public void setLink(ContentInfo contentInfo) {
        this.link = contentInfo;
    }

    public void setTitle(ContentInfo contentInfo) {
        this.title = contentInfo;
    }
}
