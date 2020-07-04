package com.p280ss.android.ugc.aweme.friends.model;

import com.bytedance.common.utility.collection.C6307b;
import com.google.gson.p276a.C6593c;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.feed.model.LogPbBean;
import com.p280ss.android.ugc.aweme.follow.recommend.follow.repo.C29480e;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.RecommendList */
public class RecommendList extends BaseResponse implements Serializable {
    @C6593c(mo15949a = "cursor")
    int cursor;
    @C6593c(mo15949a = "has_more")
    boolean hasMore;
    @C6593c(mo15949a = "log_pb")
    LogPbBean logPb;
    @C6593c(mo15949a = "new_user_count")
    int newUserCount;
    @C6593c(mo15949a = "user_extra_list")
    List<C29480e> recommendFollowList;
    @C6593c(mo15949a = "rid")
    private String rid;
    @C6593c(mo15949a = "user_list")
    List<User> userList;

    public int getCursor() {
        return this.cursor;
    }

    public LogPbBean getLogPb() {
        return this.logPb;
    }

    public int getNewUserCount() {
        return this.newUserCount;
    }

    public List<C29480e> getRecommendFollowList() {
        return this.recommendFollowList;
    }

    public String getRid() {
        return this.rid;
    }

    public boolean hasMore() {
        return this.hasMore;
    }

    public List<User> getUserList() {
        if (this.userList == null) {
            this.userList = new ArrayList(0);
        }
        return this.userList;
    }

    public RecommendList clone() {
        RecommendList recommendList = new RecommendList();
        ArrayList arrayList = new ArrayList();
        if (!C6307b.m19566a((Collection<T>) this.userList)) {
            for (User user : this.userList) {
                if (user != null) {
                    arrayList.add(user.clone());
                }
            }
        }
        recommendList.userList = arrayList;
        ArrayList arrayList2 = new ArrayList();
        if (!C6307b.m19566a((Collection<T>) this.recommendFollowList)) {
            for (C29480e eVar : this.recommendFollowList) {
                if (eVar != null) {
                    arrayList2.add(eVar.clone());
                }
            }
        }
        recommendList.recommendFollowList = arrayList2;
        recommendList.rid = this.rid;
        recommendList.cursor = this.cursor;
        recommendList.hasMore = this.hasMore;
        recommendList.newUserCount = this.newUserCount;
        recommendList.extra = this.extra;
        recommendList.status_code = this.status_code;
        recommendList.status_msg = this.status_msg;
        recommendList.error_code = this.error_code;
        recommendList.logPb = this.logPb;
        return recommendList;
    }

    public void setCursor(int i) {
        this.cursor = i;
    }

    public void setHasMore(boolean z) {
        this.hasMore = z;
    }

    public void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public void setRecommendFollowList(List<C29480e> list) {
        this.recommendFollowList = list;
    }

    public void setRid(String str) {
        this.rid = str;
    }

    public void setUserList(List<User> list) {
        this.userList = list;
    }
}
