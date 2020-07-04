package com.p280ss.android.ugc.aweme.feed.model.poi;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.poi.NearbyCardStruct */
public class NearbyCardStruct implements Serializable {
    @C6593c(mo15949a = "content_text")
    private String cardContentText;
    @C6593c(mo15949a = "head_text")
    private String cardHeadText;
    @C6593c(mo15949a = "card_type")
    private int cardType;
    @C6593c(mo15949a = "cover_avatar_url")
    private List<UrlModel> coverAvatarUrl;
    @C6593c(mo15949a = "cover_aweme_id")
    private Long coverAwemeId;
    @C6593c(mo15949a = "cover_height")
    private int coverHeight;
    @C6593c(mo15949a = "cover_label_text")
    private String coverLabelText;
    @C6593c(mo15949a = "cover_label_url")
    private UrlModel coverLabelUrl;
    @C6593c(mo15949a = "cover_url")
    private UrlModel coverUrl;
    @C6593c(mo15949a = "cover_width")
    private int coverWidth;
    @C6593c(mo15949a = "latitude")
    private double latitude;
    @C6593c(mo15949a = "longitude")
    private double longitude;
    @C6593c(mo15949a = "object_id")
    private String objectID;
    @C6593c(mo15949a = "object_name")
    private String objectName;
    @C6593c(mo15949a = "video_height")
    private int videoHeight;
    @C6593c(mo15949a = "video_height_width_ratio")
    private double videoRatio;
    @C6593c(mo15949a = "video_width")
    private int videoWidth;

    public String getCardContentText() {
        return this.cardContentText;
    }

    public String getCardHeadText() {
        return this.cardHeadText;
    }

    public int getCardType() {
        return this.cardType;
    }

    public List<UrlModel> getCoverAvatarUrl() {
        return this.coverAvatarUrl;
    }

    public Long getCoverAwemeId() {
        return this.coverAwemeId;
    }

    public int getCoverHeight() {
        return this.coverHeight;
    }

    public String getCoverLabelText() {
        return this.coverLabelText;
    }

    public UrlModel getCoverLabelUrl() {
        return this.coverLabelUrl;
    }

    public UrlModel getCoverUrl() {
        return this.coverUrl;
    }

    public int getCoverWidth() {
        return this.coverWidth;
    }

    public double getLatitude() {
        return this.latitude;
    }

    public double getLongitude() {
        return this.longitude;
    }

    public String getObjectID() {
        return this.objectID;
    }

    public String getObjectName() {
        return this.objectName;
    }

    public int getVideoHeight() {
        return this.videoHeight;
    }

    public double getVideoRatio() {
        return this.videoRatio;
    }

    public int getVideoWidth() {
        return this.videoWidth;
    }

    public void setCardContentText(String str) {
        this.cardContentText = str;
    }

    public void setCardHeadText(String str) {
        this.cardHeadText = str;
    }

    public void setCardType(int i) {
        this.cardType = i;
    }

    public void setCoverAvatarUrl(List<UrlModel> list) {
        this.coverAvatarUrl = list;
    }

    public void setCoverAwemeId(Long l) {
        this.coverAwemeId = l;
    }

    public void setCoverHeight(int i) {
        this.coverHeight = i;
    }

    public void setCoverLabelText(String str) {
        this.coverLabelText = str;
    }

    public void setCoverLabelUrl(UrlModel urlModel) {
        this.coverLabelUrl = urlModel;
    }

    public void setCoverUrl(UrlModel urlModel) {
        this.coverUrl = urlModel;
    }

    public void setCoverWidth(int i) {
        this.coverWidth = i;
    }

    public void setLatitude(double d) {
        this.latitude = d;
    }

    public void setLongitude(double d) {
        this.longitude = d;
    }

    public void setObjectID(String str) {
        this.objectID = str;
    }

    public void setObjectName(String str) {
        this.objectName = str;
    }

    public void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public void setVideoRatio(double d) {
        this.videoRatio = d;
    }

    public void setVideoWidth(int i) {
        this.videoWidth = i;
    }
}
