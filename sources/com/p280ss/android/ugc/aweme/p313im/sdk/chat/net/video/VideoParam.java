package com.p280ss.android.ugc.aweme.p313im.sdk.chat.net.video;

import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.net.video.VideoParam */
public final class VideoParam implements Serializable {
    private String checkPic;
    private List<String> checkTexts;
    private int fromGallery;
    private int height;
    private String srcVideoMD5;
    private String thumbnailPath;
    private String videoPath;
    private int width;

    public final String getCheckPic() {
        return this.checkPic;
    }

    public final List<String> getCheckTexts() {
        return this.checkTexts;
    }

    public final int getFromGallery() {
        return this.fromGallery;
    }

    public final int getHeight() {
        return this.height;
    }

    public final String getSrcVideoMD5() {
        return this.srcVideoMD5;
    }

    public final String getThumbnailPath() {
        return this.thumbnailPath;
    }

    public final String getVideoPath() {
        return this.videoPath;
    }

    public final int getWidth() {
        return this.width;
    }

    public final void setCheckPic(String str) {
        this.checkPic = str;
    }

    public final void setCheckTexts(List<String> list) {
        this.checkTexts = list;
    }

    public final void setFromGallery(int i) {
        this.fromGallery = i;
    }

    public final void setHeight(int i) {
        this.height = i;
    }

    public final void setSrcVideoMD5(String str) {
        this.srcVideoMD5 = str;
    }

    public final void setThumbnailPath(String str) {
        this.thumbnailPath = str;
    }

    public final void setVideoPath(String str) {
        this.videoPath = str;
    }

    public final void setWidth(int i) {
        this.width = i;
    }
}
