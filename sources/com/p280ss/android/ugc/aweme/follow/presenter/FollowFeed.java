package com.p280ss.android.ugc.aweme.follow.presenter;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.comment.model.Comment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.follow.C29436a;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.FollowFeed */
public class FollowFeed extends C34145b {
    @C6593c(mo15949a = "aweme")
    private Aweme aweme;
    private long blockFavoriteTime;
    @C6593c(mo15949a = "comment_list")
    private List<Comment> commentList;
    private List<String> favoriteIds;
    @C6593c(mo15949a = "favorite_list")
    private List<Aweme> favorites;
    @C6593c(mo15949a = "feed_type")
    private int feedType;
    private C29436a lastViewData;
    @C6593c(mo15949a = "count")
    private int likeCount;
    @C6593c(mo15949a = "like_list")
    private List<User> likeList;
    private boolean mIsMomentStyle;
    private User mRecommendUser;
    @C6593c(mo15949a = "cell_room")
    private C29463i roomStruct;
    @C6593c(mo15949a = "user")
    private List<User> user;

    public FollowFeed() {
    }

    public Aweme getAweme() {
        return this.aweme;
    }

    public long getBlockFavoriteTime() {
        return this.blockFavoriteTime;
    }

    public List<String> getFavoriteIds() {
        return this.favoriteIds;
    }

    public List<Aweme> getFavorites() {
        return this.favorites;
    }

    public C29436a getLastViewData() {
        return this.lastViewData;
    }

    public int getLikeCount() {
        return this.likeCount;
    }

    public List<User> getLikeList() {
        return this.likeList;
    }

    public User getRecommendUser() {
        return this.mRecommendUser;
    }

    public C29463i getRoomStruct() {
        return this.roomStruct;
    }

    public List<User> getUser() {
        return this.user;
    }

    public boolean isMomentStyle() {
        return this.mIsMomentStyle;
    }

    public boolean needUpdateComment() {
        return true;
    }

    public List<Comment> getCommentList() {
        if (this.commentList == null || this.aweme == null || !this.aweme.getAwemeControl().canShowComment()) {
            this.commentList = new ArrayList();
        }
        return this.commentList;
    }

    public int getFeedType() {
        int i = this.feedType;
        if (i == -1) {
            return 65288;
        }
        switch (i) {
            case 1:
                return 65280;
            case 2:
                return TextExtraStruct.TYPE_CUSTOM;
            case 3:
                return 65298;
            default:
                return this.feedType;
        }
    }

    public void setAweme(Aweme aweme2) {
        this.aweme = aweme2;
    }

    public void setBlockFavoriteTime(long j) {
        this.blockFavoriteTime = j;
    }

    public void setFavoriteIds(List<String> list) {
        this.favoriteIds = list;
    }

    public void setFavorites(List<Aweme> list) {
        this.favorites = list;
    }

    public void setFeedType(int i) {
        this.feedType = i;
    }

    public void setIsMomentStyle(boolean z) {
        this.mIsMomentStyle = z;
    }

    public void setLastViewData(C29436a aVar) {
        this.lastViewData = aVar;
    }

    public void setLikeCount(int i) {
        this.likeCount = i;
    }

    public void setLikeList(List<User> list) {
        this.likeList = list;
    }

    public void setRecommendUser(User user2) {
        this.mRecommendUser = user2;
    }

    public void setRoomStruct(C29463i iVar) {
        this.roomStruct = iVar;
    }

    public void setUser(List<User> list) {
        this.user = list;
    }

    public static FollowFeed createLastWatchHistoryItem(C29436a aVar) {
        FollowFeed followFeed = new FollowFeed();
        followFeed.setFeedType(65297);
        followFeed.setLastViewData(aVar);
        return followFeed;
    }

    public void setCommentList(List<Comment> list) {
        if (list == null) {
            list = new ArrayList<>();
        }
        this.commentList = list;
    }

    public void setRequestId(String str) {
        super.setRequestId(str);
        if (this.aweme != null) {
            this.aweme.setRequestId(str);
        }
    }

    public FollowFeed(Aweme aweme2) {
        this.feedType = 65280;
        this.aweme = aweme2;
        this.commentList = new ArrayList();
    }
}
