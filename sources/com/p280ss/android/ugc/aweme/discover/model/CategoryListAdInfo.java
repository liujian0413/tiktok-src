package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.CategoryListAdInfo */
public class CategoryListAdInfo implements Serializable {
    @C6593c(mo15949a = "ad_id")
    Long adId;
    @C6593c(mo15949a = "ad_position")
    private int adPosition = -1;
    @C6593c(mo15949a = "click_track_url_list")
    UrlModel clickTrackUrlList;
    @C6593c(mo15949a = "creative_id")
    Long creativeId;
    @C6593c(mo15949a = "description")
    String description;
    @C6593c(mo15949a = "image_list")
    List<UrlModel> imageList;
    @C6593c(mo15949a = "is_preview")
    boolean isPreview;
    @C6593c(mo15949a = "label")
    private AwemeTextLabelModel label;
    @C6593c(mo15949a = "log_extra")
    String logExtra;
    @C6593c(mo15949a = "mp_url")
    String mpUrl;
    @C6593c(mo15949a = "open_url")
    String openUrl;
    @C6593c(mo15949a = "source")
    String source;
    @C6593c(mo15949a = "title")
    String title;
    @C6593c(mo15949a = "track_url_list")
    UrlModel trackUrlList;
    @C6593c(mo15949a = "type")
    String type;
    @C6593c(mo15949a = "web_title")
    String webTitle;
    @C6593c(mo15949a = "web_url")
    String webUrl;

    public Long getAdId() {
        return this.adId;
    }

    public int getAdPosition() {
        return this.adPosition;
    }

    public UrlModel getClickTrackUrlList() {
        return this.clickTrackUrlList;
    }

    public Long getCreativeId() {
        return this.creativeId;
    }

    public String getDescription() {
        return this.description;
    }

    public List<UrlModel> getImageList() {
        return this.imageList;
    }

    public AwemeTextLabelModel getLabel() {
        return this.label;
    }

    public String getLogExtra() {
        return this.logExtra;
    }

    public String getMpUrl() {
        return this.mpUrl;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getSource() {
        return this.source;
    }

    public String getTitle() {
        return this.title;
    }

    public UrlModel getTrackUrlList() {
        return this.trackUrlList;
    }

    public String getType() {
        return this.type;
    }

    public String getWebTitle() {
        return this.webTitle;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public boolean isPreview() {
        return this.isPreview;
    }

    public void setAdId(Long l) {
        this.adId = l;
    }

    public void setAdPosition(int i) {
        this.adPosition = i;
    }

    public void setClickTrackUrlList(UrlModel urlModel) {
        this.clickTrackUrlList = urlModel;
    }

    public void setCreativeId(Long l) {
        this.creativeId = l;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setImageList(List<UrlModel> list) {
        this.imageList = list;
    }

    public void setLabel(AwemeTextLabelModel awemeTextLabelModel) {
        this.label = awemeTextLabelModel;
    }

    public void setLogExtra(String str) {
        this.logExtra = str;
    }

    public void setMpUrl(String str) {
        this.mpUrl = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setPreview(boolean z) {
        this.isPreview = z;
    }

    public void setSource(String str) {
        this.source = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTrackUrlList(UrlModel urlModel) {
        this.trackUrlList = urlModel;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setWebTitle(String str) {
        this.webTitle = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
