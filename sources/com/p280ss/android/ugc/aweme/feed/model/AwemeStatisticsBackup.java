package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeStatisticsBackup */
public final class AwemeStatisticsBackup implements Serializable {
    @C6593c(mo15949a = "aweme_id")
    private String aid = "";
    @C6593c(mo15949a = "comment_count")
    private Integer commentCount = Integer.valueOf(0);
    @C6593c(mo15949a = "digg_count")
    private Integer diggCount = Integer.valueOf(0);
    @C6593c(mo15949a = "download_count")
    private Integer downloadCount = Integer.valueOf(0);
    @C6593c(mo15949a = "forward_count")
    private Integer forwardCount = Integer.valueOf(0);
    @C6593c(mo15949a = "play_count")
    private Integer playCount = Integer.valueOf(0);
    @C6593c(mo15949a = "share_count")
    private Integer shareCount = Integer.valueOf(0);

    public final String getAid() {
        return this.aid;
    }

    public final Integer getCommentCount() {
        return this.commentCount;
    }

    public final Integer getDiggCount() {
        return this.diggCount;
    }

    public final Integer getDownloadCount() {
        return this.downloadCount;
    }

    public final Integer getForwardCount() {
        return this.forwardCount;
    }

    public final Integer getPlayCount() {
        return this.playCount;
    }

    public final Integer getShareCount() {
        return this.shareCount;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwemeStatistics{aid='");
        sb.append(this.aid);
        sb.append("', comemntCount=");
        sb.append(this.commentCount);
        sb.append(", diggCount=");
        sb.append(this.diggCount);
        sb.append(", playCount=");
        sb.append(this.playCount);
        sb.append(", shareCount=");
        sb.append(this.shareCount);
        sb.append(", forwardCount=");
        sb.append(this.forwardCount);
        sb.append("}");
        return sb.toString();
    }

    public final void setAid(String str) {
        this.aid = str;
    }

    public final void setCommentCount(Integer num) {
        this.commentCount = num;
    }

    public final void setDiggCount(Integer num) {
        this.diggCount = num;
    }

    public final void setDownloadCount$feed_api_musicallyI18nRelease(Integer num) {
        this.downloadCount = num;
    }

    public final void setForwardCount(Integer num) {
        this.forwardCount = num;
    }

    public final void setPlayCount(Integer num) {
        this.playCount = num;
    }

    public final void setShareCount(Integer num) {
        this.shareCount = num;
    }
}
