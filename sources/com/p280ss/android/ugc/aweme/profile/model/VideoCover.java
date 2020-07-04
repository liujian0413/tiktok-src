package com.p280ss.android.ugc.aweme.profile.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.Video;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.VideoCover */
public final class VideoCover implements Serializable {
    @C6593c(mo15949a = "offset")
    private Integer offset;
    @C6593c(mo15949a = "video")
    private Video video;
    @C6593c(mo15949a = "video_id")
    private String videoId;

    public final Integer getOffset() {
        return this.offset;
    }

    public final Video getVideo() {
        return this.video;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final void setOffset(Integer num) {
        this.offset = num;
    }

    public final void setVideo(Video video2) {
        this.video = video2;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }
}
