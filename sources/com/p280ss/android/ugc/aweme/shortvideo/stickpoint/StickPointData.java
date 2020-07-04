package com.p280ss.android.ugc.aweme.shortvideo.stickpoint;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.stickpoint.StickPointData */
public final class StickPointData implements Serializable {
    @C6593c(mo15949a = "ai_cut_id")
    private String aiCutId;
    @C6593c(mo15949a = "video_count")
    private Integer videoCount = Integer.valueOf(0);
    @C6593c(mo15949a = "video_cut_len_list")
    private String videoCutLenListStr;
    @C6593c(mo15949a = "video_cut_start_time")
    private String videoCutStartTimeListStr;
    @C6593c(mo15949a = "video_id")
    private String videoId;
    @C6593c(mo15949a = "video_src_len_list")
    private String videoSrcLenListStr;

    public final String getAiCutId() {
        return this.aiCutId;
    }

    public final Integer getVideoCount() {
        return this.videoCount;
    }

    public final String getVideoCutLenListStr() {
        return this.videoCutLenListStr;
    }

    public final String getVideoCutStartTimeListStr() {
        return this.videoCutStartTimeListStr;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final String getVideoSrcLenListStr() {
        return this.videoSrcLenListStr;
    }

    public final void setAiCutId(String str) {
        this.aiCutId = str;
    }

    public final void setVideoCount(Integer num) {
        this.videoCount = num;
    }

    public final void setVideoCutLenListStr(String str) {
        this.videoCutLenListStr = str;
    }

    public final void setVideoCutStartTimeListStr(String str) {
        this.videoCutStartTimeListStr = str;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }

    public final void setVideoSrcLenListStr(String str) {
        this.videoSrcLenListStr = str;
    }
}
