package com.p280ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.discover.model.VideoTag;
import java.io.Serializable;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.Video */
public class Video implements Serializable {
    @C6593c(mo15949a = "animated_cover")
    public UrlModel animatedCover;
    @C6593c(mo15949a = "bit_rate")
    public List<BitRate> bitRate;
    @C6593c(mo15949a = "caption_download_addr")
    public UrlModel captionDownloadAddr;
    @C6593c(mo15949a = "cover")
    public UrlModel cover;
    @C6593c(mo15949a = "video_model")
    public String dVideoModel;
    @C6593c(mo15949a = "download_addr")
    public UrlModel downloadAddr;
    @C6593c(mo15949a = "dynamic_cover")
    public UrlModel dynamicCover;
    @C6593c(mo15949a = "play_addr_h264")
    public VideoUrlModel h264PlayAddr;
    @C6593c(mo15949a = "has_download_suffix_logo_addr")
    public boolean hasSuffixWaterMark;
    @C6593c(mo15949a = "has_watermark")
    public boolean hasWaterMark;
    @C6593c(mo15949a = "height")
    public int height;
    @C6593c(mo15949a = "need_set_token")
    public boolean needSetCookie;
    @C6593c(mo15949a = "new_download_addr")
    public UrlModel newDownloadAddr;
    @C6593c(mo15949a = "origin_cover")
    public UrlModel originCover;
    @C6593c(mo15949a = "play_addr")
    public VideoUrlModel playAddr;
    @C6593c(mo15949a = "play_addr_265")
    public VideoUrlModel playAddrH265;
    @C6593c(mo15949a = "ratio")
    public String ratio;
    @C6593c(mo15949a = "download_suffix_logo_addr")
    public UrlModel suffixLogoAddr;
    @C6593c(mo15949a = "ui_alike_download_addr")
    public UrlModel uiAlikeAddr;
    @C6593c(mo15949a = "duration")
    public int videoLength;
    @C6593c(mo15949a = "tag")
    public VideoTag videoTag;
    @C6593c(mo15949a = "width")
    public int width;

    public UrlModel getAnimatedCover() {
        return this.animatedCover;
    }

    public List<BitRate> getBitRate() {
        return this.bitRate;
    }

    public UrlModel getCaptionDownloadAddr() {
        return this.captionDownloadAddr;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public UrlModel getDownloadAddr() {
        return this.downloadAddr;
    }

    public int getDuration() {
        return this.videoLength;
    }

    public UrlModel getDynamicCover() {
        return this.dynamicCover;
    }

    public VideoUrlModel getH264PlayAddr() {
        return this.h264PlayAddr;
    }

    public int getHeight() {
        return this.height;
    }

    public UrlModel getNewDownloadAddr() {
        return this.newDownloadAddr;
    }

    public String getRatio() {
        return this.ratio;
    }

    public UrlModel getSuffixLogoDownloadAddr() {
        return this.suffixLogoAddr;
    }

    public UrlModel getUIAlikeDownloadAddr() {
        return this.uiAlikeAddr;
    }

    public int getVideoLength() {
        return this.videoLength;
    }

    public String getVideoModelStr() {
        return this.dVideoModel;
    }

    public VideoTag getVideoTag() {
        return this.videoTag;
    }

    public int getWidth() {
        return this.width;
    }

    public boolean hasEndWaterMark() {
        return this.hasSuffixWaterMark;
    }

    public boolean isHasWaterMark() {
        return this.hasWaterMark;
    }

    public boolean isLowBr() {
        return false;
    }

    public boolean isNeedSetCookie() {
        return this.needSetCookie;
    }

    public VideoUrlModel getProperPlayAddr() {
        return getPlayAddr();
    }

    public boolean isCoverValid() {
        return isUrlModelValid(this.cover);
    }

    public boolean isOriginCoverValid() {
        return isUrlModelValid(this.originCover);
    }

    public UrlModel getOriginCover() {
        if (isOriginCoverValid() || !isCoverValid()) {
            return this.originCover;
        }
        return this.cover;
    }

    public VideoUrlModel getPlayAddrH264() {
        checkBitRateAndDurationCopy();
        if (this.playAddr != null) {
            this.playAddr.setH265(false);
            this.playAddr.setRatio(this.ratio);
        }
        return this.playAddr;
    }

    public VideoUrlModel getPlayAddrH265() {
        checkBitRateAndDurationCopy();
        if (this.playAddrH265 != null) {
            this.playAddrH265.setH265(true);
            this.playAddrH265.setRatio(this.ratio);
        }
        return this.playAddrH265;
    }

    public VideoUrlModel getPlayAddr() {
        checkBitRateAndDurationCopy();
        if (this.playAddrH265 != null) {
            this.playAddrH265.setH265(true);
            this.playAddrH265.setRatio(this.ratio);
        }
        if (this.playAddr != null) {
            this.playAddr.setH265(false);
            this.playAddr.setRatio(this.ratio);
        }
        if (checkVideo(this.playAddrH265)) {
            return this.playAddrH265;
        }
        return this.playAddr;
    }

    private void checkBitRateAndDurationCopy() {
        if (!(this.playAddrH265 == null || this.playAddrH265.getBitRate() == this.bitRate)) {
            this.playAddrH265.setBitRate(this.bitRate);
            this.playAddrH265.setDuration((double) this.videoLength);
            this.playAddrH265.setH265(true);
        }
        if (this.playAddr != null && this.playAddr.getBitRate() != this.bitRate) {
            this.playAddr.setBitRate(this.bitRate);
            this.playAddr.setDuration((double) this.videoLength);
            this.playAddr.setH265(false);
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Video{playAddr=");
        sb.append(this.playAddr);
        sb.append(", playAddrH265=");
        sb.append(this.playAddrH265);
        sb.append(", cover=");
        sb.append(this.cover);
        sb.append(", dynamicCover=");
        sb.append(this.dynamicCover);
        sb.append(", originCover=");
        sb.append(this.originCover);
        sb.append(", height=");
        sb.append(this.height);
        sb.append(", width=");
        sb.append(this.width);
        sb.append(", ratio='");
        sb.append(this.ratio);
        sb.append('\'');
        sb.append(", downloadAddr=");
        sb.append(this.downloadAddr);
        sb.append(", hasWaterMark=");
        sb.append(this.hasWaterMark);
        sb.append(", videoLength=");
        sb.append(this.videoLength);
        sb.append(", bitRate=");
        sb.append(this.bitRate);
        sb.append(", newDownloadAddr=");
        sb.append(this.newDownloadAddr);
        sb.append(", suffixLogoAddr=");
        sb.append(this.suffixLogoAddr);
        sb.append(", hasSuffixWaterMark=");
        sb.append(this.hasSuffixWaterMark);
        sb.append(", needSetCookie=");
        sb.append(this.needSetCookie);
        sb.append('}');
        return sb.toString();
    }

    public void setAnimatedCover(UrlModel urlModel) {
        this.animatedCover = urlModel;
    }

    public void setBitRate(List<BitRate> list) {
        this.bitRate = list;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setDownloadAddr(UrlModel urlModel) {
        this.downloadAddr = urlModel;
    }

    public void setDuration(double d) {
        this.videoLength = (int) d;
    }

    public void setDynamicCover(UrlModel urlModel) {
        this.dynamicCover = urlModel;
    }

    public void setHasWaterMark(boolean z) {
        this.hasWaterMark = z;
    }

    public void setHeight(int i) {
        this.height = i;
    }

    public void setNeedSetCookie(boolean z) {
        this.needSetCookie = z;
    }

    public void setNewDownloadAddr(UrlModel urlModel) {
        this.newDownloadAddr = urlModel;
    }

    public void setOriginCover(UrlModel urlModel) {
        this.originCover = urlModel;
    }

    public void setPlayAddr(VideoUrlModel videoUrlModel) {
        this.playAddr = videoUrlModel;
    }

    public void setPlayAddrH265(VideoUrlModel videoUrlModel) {
        this.playAddrH265 = videoUrlModel;
    }

    public void setRatio(String str) {
        this.ratio = str;
    }

    public void setSourceId(String str) {
        setRationAndSourceId(str);
    }

    public void setVideoLength(int i) {
        this.videoLength = i;
    }

    public void setVideoModelStr(String str) {
        this.dVideoModel = str;
    }

    public void setVideoTag(VideoTag videoTag2) {
        this.videoTag = videoTag2;
    }

    public void setWidth(int i) {
        this.width = i;
    }

    private static boolean isUrlModelValid(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return false;
        }
        return true;
    }

    public boolean checkVideo(UrlModel urlModel) {
        if (urlModel == null) {
            return false;
        }
        List urlList = urlModel.getUrlList();
        if (urlList == null || urlList.isEmpty()) {
            return false;
        }
        Iterator it = urlList.iterator();
        while (it.hasNext()) {
            if (TextUtils.isEmpty((String) it.next())) {
                it.remove();
            }
        }
        if (urlList.isEmpty() || TextUtils.isEmpty(urlModel.getUri())) {
            return false;
        }
        return true;
    }

    public void setRationAndSourceId(String str) {
        if (this.playAddrH265 != null) {
            this.playAddrH265.setRatio(this.ratio).setSourceId(str);
            this.playAddrH265.setH265(true);
        }
        if (this.playAddr != null) {
            this.playAddr.setRatio(this.ratio).setSourceId(str);
            this.playAddr.setH265(false);
        }
    }
}
