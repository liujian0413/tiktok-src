package com.p280ss.android.ugc.aweme.story.api.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.api.model.UserStory */
public class UserStory extends C41977b implements Serializable {
    @C6593c(mo15949a = "all_story_list")
    List<IdWithScoreStruct> allStoryList;
    @C6593c(mo15949a = "story_list")
    List<AwemeWithComment> awemeList;
    @C6593c(mo15949a = "cur_pos")
    long curPos;
    @C6593c(mo15949a = "friend_type")
    int friendType;
    @C6593c(mo15949a = "has_more")
    int hasMore;
    private boolean isAllStoriesLoaded;
    @C6593c(mo15949a = "label_large")
    UrlModel labelLarge;
    long lastPos;
    @C6593c(mo15949a = "log_pb")
    LogPbBean logPb;
    @C6593c(mo15949a = "max_cursor")
    long maxCursor;
    @C6593c(mo15949a = "min_cursor")
    long minCursor;
    @C6593c(mo15949a = "read_flag")
    int readFlag;
    @C6593c(mo15949a = "total_count")
    long totalCount;
    @C6593c(mo15949a = "user")
    User user;

    public List<IdWithScoreStruct> getAllStoryList() {
        return this.allStoryList;
    }

    public List<AwemeWithComment> getAwemeList() {
        return this.awemeList;
    }

    public long getCurPos() {
        return this.curPos;
    }

    public int getFriendType() {
        return this.friendType;
    }

    public int getHasMore() {
        return this.hasMore;
    }

    public UrlModel getLabelLarge() {
        return this.labelLarge;
    }

    public UrlModel getLabelThumb() {
        return this.labelThumb;
    }

    public long getLastPos() {
        return this.lastPos;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public long getMaxCursor() {
        return this.maxCursor;
    }

    public long getMinCursor() {
        return this.minCursor;
    }

    public int getReadFlag() {
        return this.readFlag;
    }

    public long getTotalCount() {
        return this.totalCount;
    }

    public int getType() {
        return 0;
    }

    public User getUser() {
        return this.user;
    }

    public boolean isAllStoriesLoaded() {
        return this.isAllStoriesLoaded;
    }

    public void setAllStoriesLoaded(boolean z) {
        this.isAllStoriesLoaded = z;
    }

    public void setAllStoryList(List<IdWithScoreStruct> list) {
        this.allStoryList = list;
    }

    public void setAwemeList(List<AwemeWithComment> list) {
        this.awemeList = list;
    }

    public void setCurPos(long j) {
        this.curPos = j;
    }

    public void setFriendType(int i) {
        this.friendType = i;
    }

    public void setHasMore(int i) {
        this.hasMore = i;
    }

    public void setLabelLarge(UrlModel urlModel) {
        this.labelLarge = urlModel;
    }

    public void setLabelThumb(UrlModel urlModel) {
        this.labelThumb = urlModel;
    }

    public void setLastPos(long j) {
        this.lastPos = j;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setMaxCursor(long j) {
        this.maxCursor = j;
    }

    public void setMinCursor(long j) {
        this.minCursor = j;
    }

    public void setReadFlag(int i) {
        this.readFlag = i;
    }

    public void setTotalCount(long j) {
        this.totalCount = j;
    }

    public void setUser(User user2) {
        this.user = user2;
    }
}
