package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeStarAtlas */
public class AwemeStarAtlas implements Serializable {
    @C6593c(mo15949a = "review_status")
    public int reviewStatus;
    @C6593c(mo15949a = "link_info")
    public StarAtlasLink starAtlasLink;

    public int getReviewStatus() {
        return this.reviewStatus;
    }

    public StarAtlasLink getStarAtlasLink() {
        return this.starAtlasLink;
    }

    public void setReviewStatus(int i) {
        this.reviewStatus = i;
    }

    public void setStarAtlasLink(StarAtlasLink starAtlasLink2) {
        this.starAtlasLink = starAtlasLink2;
    }
}
