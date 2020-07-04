package com.bytedance.android.live.base.model.media;

import android.text.TextUtils;
import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p276a.C6593c;
import java.util.List;

public class VideoModel {
    private static final CoverType DEFAULT_COVER_TYPE = CoverType.LARGE;
    public static final int GIF_TYPE = 0;
    public static final int WEBP_TYPE = 1;
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
    @C6593c(mo15949a = "cover_animated", mo15950b = {"dynamic_cover"})
    private ImageModel dynamicCoverModel;
    @C6593c(mo15949a = "first_frame")
    private ImageModel firstFrame;
    @C6593c(mo15949a = "gif_type")
    private int gifType;
    @C6593c(mo15949a = "gif_url_list")
    private List<String> gifUrlList;
    @C6593c(mo15949a = "h265_uri")
    private String h265Uri;
    @C6593c(mo15949a = "h265_url")
    private List<String> h265UrlList;
    @C6593c(mo15949a = "height")
    private int height;
    @C6593c(mo15949a = "long_duration")
    private float longDuration;
    @C6593c(mo15949a = "long_uri")
    private String longUri;
    @C6593c(mo15949a = "long_url")
    private List<String> longUrls;
    private CoverType mCoverType = DEFAULT_COVER_TYPE;
    @C6593c(mo15949a = "preload_size")
    private int preloadSize = 512000;
    @C6593c(mo15949a = "quality_info")
    private List<Object> qualityInfo;
    @C6593c(mo15949a = "uri")
    private String uri;
    @C6593c(mo15949a = "url_list")
    private List<String> urlList;
    @C6593c(mo15949a = "videoLocalPath")
    private String videoLocalPath;
    @C6593c(mo15949a = "watermark")
    private boolean waterMark;
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

    public ImageModel getFirstFrame() {
        return this.firstFrame;
    }

    public int getGifType() {
        return this.gifType;
    }

    public List<String> getGifUrlList() {
        return this.gifUrlList;
    }

    public String getH265Uri() {
        return this.h265Uri;
    }

    public List<String> getH265UrlList() {
        return this.h265UrlList;
    }

    public int getHeight() {
        return this.height;
    }

    public float getLongDuration() {
        return this.longDuration;
    }

    public String getLongUri() {
        return this.longUri;
    }

    public List<String> getLongUrls() {
        return this.longUrls;
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

    public String getVideoLocalPath() {
        return this.videoLocalPath;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean isAllowCache() {
        return this.allowCache;
    }

    public boolean isWaterMark() {
        return this.waterMark;
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

    public void setFirstFrame(ImageModel imageModel) {
        this.firstFrame = imageModel;
    }

    public void setGifType(int i) {
        this.gifType = i;
    }

    public void setGifUrlList(List<String> list) {
        this.gifUrlList = list;
    }

    public void setH265Uri(String str) {
        this.h265Uri = str;
    }

    public void setH265UrlList(List<String> list) {
        this.h265UrlList = list;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setLongDuration(float f) {
        this.longDuration = f;
    }

    public void setLongUri(String str) {
        this.longUri = str;
    }

    public void setLongUrls(List<String> list) {
        this.longUrls = list;
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

    public void setVideoLocalPath(String str) {
        this.videoLocalPath = str;
    }

    public void setWaterMark(boolean z) {
        this.waterMark = z;
    }

    public void setWidth(int i) {
        this.width = i;
    }
}
