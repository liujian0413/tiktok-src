package com.bytedance.android.live.base.model.media;

import com.google.gson.p276a.C6593c;

public class MediaItemStats {
    @C6593c(mo15949a = "comment_count")
    private int commentCount;
    @C6593c(mo15949a = "digg_count")
    private int diggCount;
    @C6593c(mo15949a = "id")

    /* renamed from: id */
    private long f7728id;
    @C6593c(mo15949a = "play_count")
    private int playCount;
    @C6593c(mo15949a = "share_count")
    private int shareCount;

    public int getCommentCount() {
        return this.commentCount;
    }

    public int getDiggCount() {
        return this.diggCount;
    }

    public long getId() {
        return this.f7728id;
    }

    public int getPlayCount() {
        return this.playCount;
    }

    public int getShareCount() {
        return this.shareCount;
    }

    public void setCommentCount(int i) {
        this.commentCount = i;
    }

    public void setDiggCount(int i) {
        this.diggCount = i;
    }

    public void setId(long j) {
        this.f7728id = j;
    }

    public void setPlayCount(int i) {
        this.playCount = i;
    }

    public void setShareCount(int i) {
        this.shareCount = i;
    }
}
