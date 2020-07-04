package com.p280ss.android.ugc.aweme.story.model;

import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.story.model.Story */
public class Story implements Cloneable {
    public static final int FOLLOWING = 2;
    public static final int LIVE = 1;
    public static final int OPERATION = 6;
    static final int READ = 1;
    public static final int SERVER = 5;
    public static final int STORY = 0;
    List<Aweme> awemes;
    @C6593c(mo15949a = "skylight_display_tag")
    public String skyLightDisplayTag;
    @C6593c(mo15949a = "status")
    int status;
    @C6593c(mo15949a = "type")
    public int type;
    @C6593c(mo15949a = "update_time")
    long updateTime;
    @C6593c(mo15949a = "user_info")
    User userInfo;

    public List<Aweme> getAwemes() {
        return this.awemes;
    }

    public int getStatus() {
        return this.status;
    }

    public long getUpdateTime() {
        return this.updateTime;
    }

    public User getUserInfo() {
        return this.userInfo;
    }

    public void setRead() {
        this.status = 1;
    }

    public boolean isRead() {
        if (this.status == 1) {
            return true;
        }
        return false;
    }

    public boolean isStory() {
        if (this.type == 0) {
            return true;
        }
        return false;
    }

    public Story clone() {
        try {
            return (Story) super.clone();
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public String getLiveUid() {
        if (this.userInfo == null) {
            return "";
        }
        return this.userInfo.getLiveUid();
    }

    public boolean isFollowing() {
        if (this.type == 2) {
            return true;
        }
        return false;
    }

    public boolean isNewLiveType() {
        if (this.type == 5 || this.type == 6) {
            return true;
        }
        return false;
    }

    public String getUid() {
        if (getUserInfo() == null) {
            return null;
        }
        return getUserInfo().getUid();
    }

    public boolean isLive() {
        if (this.type == 1 || this.type == 5 || this.type == 6) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Story{status=");
        sb.append(this.status);
        sb.append(", userInfo=");
        sb.append(this.userInfo);
        sb.append('}');
        return sb.toString();
    }

    public void setAwemes(List<Aweme> list) {
        this.awemes = list;
    }

    public void setStatus(int i) {
        this.status = i;
    }

    public void setUpdateTime(long j) {
        this.updateTime = j;
    }

    public void setUserInfo(User user) {
        this.userInfo = user;
    }
}
