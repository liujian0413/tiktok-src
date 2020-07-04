package com.p280ss.android.ugc.aweme.forward.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.forward.model.DynamicStruct */
public class DynamicStruct implements Serializable {
    @C6593c(mo15949a = "aweme")
    Aweme aweme;
    @C6593c(mo15949a = "time")
    long blockFavoriteTime;
    @C6593c(mo15949a = "comment_list")
    List<Comment> comments;
    @C6593c(mo15949a = "favorite_ids")
    List<String> favoriteIds;
    @C6593c(mo15949a = "favorite_list")
    List<Aweme> favorites;
    @C6593c(mo15949a = "type")
    int itemType;
    @C6593c(mo15949a = "count")
    int likeCount;
    String requestId;

    public Aweme getAweme() {
        return this.aweme;
    }

    public long getBlockFavoriteTime() {
        return this.blockFavoriteTime;
    }

    public List<Comment> getComments() {
        return this.comments;
    }

    public List<String> getFavoriteIds() {
        return this.favoriteIds;
    }

    public List<Aweme> getFavorites() {
        return this.favorites;
    }

    public int getItemType() {
        return this.itemType;
    }

    public int getLikeCount() {
        return this.likeCount;
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setBlockFavoriteTime(long j) {
        this.blockFavoriteTime = j;
    }

    public void setComments(List<Comment> list) {
        this.comments = list;
    }

    public void setFavoriteIds(List<String> list) {
        this.favoriteIds = list;
    }

    public void setFavorites(List<Aweme> list) {
        this.favorites = list;
    }

    public void setItemType(int i) {
        this.itemType = i;
    }

    public void setLikeCount(int i) {
        this.likeCount = i;
    }

    public void setRequestId(String str) {
        this.requestId = str;
        if (this.aweme != null) {
            this.aweme.setRequestId(str);
        }
    }
}
