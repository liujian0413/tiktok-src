package com.p280ss.android.ugc.aweme.feed.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.utils.C23480h;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeStatistics */
public class AwemeStatistics implements Serializable, Cloneable {
    @C6593c(mo15949a = "aid")
    public String aid;
    @C6593c(mo15949a = "comment_count")
    public int commentCount;
    @C6593c(mo15949a = "digg_count")
    public int diggCount;
    @C6593c(mo15949a = "download_count")
    public int downloadCount;
    @C6593c(mo15949a = "forward_count")
    public int forwardCount;
    @C6593c(mo15949a = "lose_comment_count")
    public int loseCommentCount;
    @C6593c(mo15949a = "lose_count")
    public int loseCount;
    @C6593c(mo15949a = "play_count")
    public int playCount;
    @C6593c(mo15949a = "share_count")
    public int shareCount;

    public String getAid() {
        return this.aid;
    }

    public int getCommentCount() {
        return this.commentCount;
    }

    public int getDiggCount() {
        return this.diggCount;
    }

    public int getDownloadCount() {
        return this.downloadCount;
    }

    public int getForwardCount() {
        return this.forwardCount;
    }

    public int getLoseCommentCount() {
        return this.loseCommentCount;
    }

    public int getLoseCount() {
        return this.loseCount;
    }

    public int getPlayCount() {
        return this.playCount;
    }

    public int getShareCount() {
        return this.shareCount;
    }

    public AwemeStatistics clone() {
        AwemeStatistics awemeStatistics = new AwemeStatistics();
        awemeStatistics.aid = this.aid;
        awemeStatistics.commentCount = this.commentCount;
        awemeStatistics.diggCount = this.diggCount;
        awemeStatistics.playCount = this.playCount;
        awemeStatistics.shareCount = this.shareCount;
        awemeStatistics.forwardCount = this.forwardCount;
        awemeStatistics.downloadCount = this.downloadCount;
        return awemeStatistics;
    }

    public int hashCode() {
        return C23480h.m77086a(this.aid, Integer.valueOf(this.commentCount), Integer.valueOf(this.diggCount), Integer.valueOf(this.playCount), Integer.valueOf(this.shareCount), Integer.valueOf(this.forwardCount), Integer.valueOf(this.downloadCount));
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("AwemeStatistics{aid='");
        sb.append(this.aid);
        sb.append('\'');
        sb.append(", commentCount=");
        sb.append(this.commentCount);
        sb.append(", diggCount=");
        sb.append(this.diggCount);
        sb.append(", playCount=");
        sb.append(this.playCount);
        sb.append(", shareCount=");
        sb.append(this.shareCount);
        sb.append(", forwardCount=");
        sb.append(this.forwardCount);
        sb.append(", downloadCount=");
        sb.append(this.downloadCount);
        sb.append('}');
        return sb.toString();
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setCommentCount(int i) {
        this.commentCount = i;
    }

    public void setDiggCount(int i) {
        this.diggCount = i;
    }

    public void setDownloadCount(int i) {
        this.downloadCount = i;
    }

    public void setForwardCount(int i) {
        this.forwardCount = i;
    }

    public void setLoseCommentCount(int i) {
        this.loseCommentCount = i;
    }

    public void setLoseCount(int i) {
        this.loseCount = i;
    }

    public void setPlayCount(int i) {
        this.playCount = i;
    }

    public void setShareCount(int i) {
        this.shareCount = i;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AwemeStatistics)) {
            return false;
        }
        AwemeStatistics awemeStatistics = (AwemeStatistics) obj;
        if (this.commentCount == awemeStatistics.commentCount && this.diggCount == awemeStatistics.diggCount && this.playCount == awemeStatistics.playCount && this.shareCount == awemeStatistics.shareCount && this.forwardCount == awemeStatistics.forwardCount && this.downloadCount == awemeStatistics.downloadCount && C23480h.m77087a(this.aid, awemeStatistics.aid)) {
            return true;
        }
        return false;
    }
}
