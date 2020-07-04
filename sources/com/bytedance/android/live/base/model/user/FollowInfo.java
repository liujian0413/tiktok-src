package com.bytedance.android.live.base.model.user;

import com.google.gson.p276a.C6593c;

public class FollowInfo {
    @C6593c(mo15949a = "follow_status")
    long followStatus;
    @C6593c(mo15949a = "follower_count")
    long followerCount;
    @C6593c(mo15949a = "following_count")
    long followingCount;
    @C6593c(mo15949a = "push_status")
    long pushStatus;

    public long getFollowStatus() {
        return this.followStatus;
    }

    public long getFollowerCount() {
        return this.followerCount;
    }

    public long getFollowingCount() {
        return this.followingCount;
    }

    public long getPushStatus() {
        return this.pushStatus;
    }

    public int hashCode() {
        return (((((int) (this.followingCount ^ (this.followingCount >>> 32))) * 31) + ((int) (this.followerCount ^ (this.followerCount >>> 32)))) * 31) + ((int) (this.followStatus ^ (this.followStatus >>> 32)));
    }

    public void setFollowStatus(long j) {
        this.followStatus = j;
    }

    public void setFollowerCount(long j) {
        this.followerCount = j;
    }

    public void setFollowingCount(long j) {
        this.followingCount = j;
    }

    public void setPushStatus(long j) {
        this.pushStatus = j;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FollowInfo followInfo = (FollowInfo) obj;
        if (this.followingCount == followInfo.followingCount && this.followerCount == followInfo.followerCount && this.followStatus == followInfo.followStatus) {
            return true;
        }
        return false;
    }
}
