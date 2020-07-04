package com.bytedance.android.livesdkapi.depend.model.feed;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p276a.C6593c;
import java.util.List;

public class VideoModel {
    private static final CoverType DEFAULT_COVER_TYPE = CoverType.LARGE;
    @C6593c(mo15949a = "allow_cache")
    private boolean allowCache;
    @C6593c(mo15949a = "avg_color")
    private int avgColor;
    @C6593c(mo15949a = "cover_medium")
    private ImageModel coverMediumModel;
    @C6593c(mo15949a = "cover")
    private ImageModel coverModel;
    @C6593c(mo15949a = "cover_thumb")
    private ImageModel coverThumbModel;
    @C6593c(mo15949a = "download_url")
    private List<String> downloadList;
    @C6593c(mo15949a = "duration")
    private double duration;
    @C6593c(mo15949a = "dynamic_cover")
    private ImageModel dynamicCoverModel;
    @C6593c(mo15949a = "height")
    private int height;
    private CoverType mCoverType = DEFAULT_COVER_TYPE;
    @C6593c(mo15949a = "preload_size")
    private int preloadSize = 512000;
    @C6593c(mo15949a = "quality_info")
    private List<Object> qualityInfo;
    @C6593c(mo15949a = "uri")
    private String uri;
    @C6593c(mo15949a = "url_list")
    private List<String> urlList;
    @C6593c(mo15949a = "width")
    private int width;

    public enum CoverType {
        LARGE,
        MEDIUM,
        THUMB
    }

    public List<Object> getBitRate() {
        return this.qualityInfo;
    }

    public ImageModel getCoverMediumModel() {
        return this.coverMediumModel;
    }

    public ImageModel getCoverModel() {
        return this.coverModel;
    }

    public ImageModel getCoverThumbModel() {
        return this.coverThumbModel;
    }

    public CoverType getCoverType() {
        return this.mCoverType;
    }

    public List<String> getDownloadList() {
        return this.downloadList;
    }

    public double getDuration() {
        return this.duration;
    }

    public ImageModel getDynamicCoverModel() {
        return this.dynamicCoverModel;
    }

    public int getHeight() {
        return this.height;
    }

    public int getPreloadSize() {
        return this.preloadSize;
    }

    public List<Object> getQualityInfo() {
        return this.qualityInfo;
    }

    public String getUri() {
        return this.uri;
    }

    public List<String> getUrlList() {
        return this.urlList;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isAllowCache() {
        return this.allowCache;
    }

    public String getUnbitratedUri() {
        if (TextUtils.isEmpty(getUri())) {
            return "";
        }
        return getUri();
    }

    public void setAllowCache(boolean z) {
        this.allowCache = z;
    }

    public void setCoverMediumModel(ImageModel imageModel) {
        this.coverMediumModel = imageModel;
    }

    public void setCoverModel(ImageModel imageModel) {
        this.coverModel = imageModel;
    }

    public void setCoverThumbModel(ImageModel imageModel) {
        this.coverThumbModel = imageModel;
    }

    public void setCoverType(CoverType coverType) {
        this.mCoverType = coverType;
    }

    public void setDownloadList(List<String> list) {
        this.downloadList = list;
    }

    public void setDuration(double d) {
        this.duration = d;
    }

    public void setDynamicCoverModel(ImageModel imageModel) {
        this.dynamicCoverModel = imageModel;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setPreloadSize(int i) {
        this.preloadSize = i;
    }

    public void setQualityInfo(List<Object> list) {
        this.qualityInfo = list;
    }

    public void setUri(String str) {
        this.uri = str;
    }

    public void setUrlList(List<String> list) {
        this.urlList = list;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
