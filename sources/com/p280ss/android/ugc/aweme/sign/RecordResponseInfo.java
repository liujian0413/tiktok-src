package com.p280ss.android.ugc.aweme.sign;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: com.ss.android.ugc.aweme.sign.RecordResponseInfo */
public class RecordResponseInfo extends BaseResponse {
    @C6593c(mo15949a = "cover")
    UrlModel cover;
    @C6593c(mo15949a = "video")
    UrlModel video;
    private String videoId;

    public UrlModel getCover() {
        return this.cover;
    }

    public UrlModel getVideo() {
        return this.video;
    }

    public String getVideoId() {
        return this.videoId;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setVideo(UrlModel urlModel) {
        this.video = urlModel;
    }

    public void setVideoId(String str) {
        this.videoId = str;
    }
}
