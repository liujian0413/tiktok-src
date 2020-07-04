package com.p280ss.android.ugc.aweme.poi.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.PoiComment */
public class PoiComment extends C34145b implements Serializable {
    @C6593c(mo15949a = "avatar")
    public UrlModel avatar;
    private String commentId;
    @C6593c(mo15949a = "content")
    public String content;
    @C6593c(mo15949a = "cost")
    public double cost;
    @C6593c(mo15949a = "date")
    public String date;
    public boolean expand;
    private boolean hasDivider;
    @C6593c(mo15949a = "images")
    public List<UrlModel> imageList;
    @C6593c(mo15949a = "nickname")
    public String nickname;
    private String poiId;
    @C6593c(mo15949a = "rating")
    public double rating;
    @C6593c(mo15949a = "src")
    public String src;
    @C6593c(mo15949a = "url")
    public String url;

    public String getCommentId() {
        return this.commentId;
    }

    public int getFeedType() {
        return 65442;
    }

    public List<UrlModel> getImages() {
        return this.imageList;
    }

    public String getPoiId() {
        return this.poiId;
    }

    public boolean hasDivider() {
        return this.hasDivider;
    }

    public void setFeedType(int i) {
    }

    public void setCommentId(String str) {
        this.commentId = str;
    }

    public void setHasDivider(boolean z) {
        this.hasDivider = z;
    }

    public void setPoiId(String str) {
        this.poiId = str;
    }
}
