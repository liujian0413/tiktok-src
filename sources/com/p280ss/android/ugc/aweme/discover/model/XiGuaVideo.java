package com.p280ss.android.ugc.aweme.discover.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.XiGuaVideo */
public final class XiGuaVideo implements Serializable {
    @C6593c(mo15949a = "cover")
    private UrlModel cover;
    @C6593c(mo15949a = "create_time")
    private long createTime;
    @C6593c(mo15949a = "desc")
    private String desc;
    @C6593c(mo15949a = "duration")
    private long duration;
    @C6593c(mo15949a = "play_count")
    private long playCount;
    @C6593c(mo15949a = "group_id")
    private String videoId;

    public final UrlModel getCover() {
        return this.cover;
    }

    public final long getCreateTime() {
        return this.createTime;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final long getPlayCount() {
        return this.playCount;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public final void setCreateTime(long j) {
        this.createTime = j;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setDuration(long j) {
        this.duration = j;
    }

    public final void setPlayCount(long j) {
        this.playCount = j;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }
}
