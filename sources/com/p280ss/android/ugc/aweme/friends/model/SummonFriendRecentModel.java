package com.p280ss.android.ugc.aweme.friends.model;

import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.friends.api.SummonFriendApi;
import com.p280ss.android.ugc.aweme.i18n.C30538p;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.SummonFriendRecentModel */
public class SummonFriendRecentModel extends C25640a<List<SummonFriendItem>> {
    FollowUserListModel followUserListModel;
    private long maxTime;
    RecentFriendModel recentFriendModel;

    public boolean checkParams(Object... objArr) {
        return true;
    }

    public boolean isHasMore() {
        if (this.followUserListModel != null) {
            return this.followUserListModel.hasMore;
        }
        return false;
    }

    public List<SummonFriendItem> loadMore() {
        try {
            if (C30538p.m99745a() && !C21115b.m71197a().isLogin()) {
                return null;
            }
            this.followUserListModel = SummonFriendApi.m98482a(10, this.maxTime, 0, C21115b.m71197a().getCurUserId(), C43161e.m136882a(), C43161e.m136884b());
            if (this.followUserListModel != null) {
                addItem(this.followUserListModel.users, AwemeApplication.m21341a().getResources().getString(R.string.e3p), false, 3);
                setCursor(this.followUserListModel);
                return (List) this.mData;
            }
            return null;
        } catch (Exception unused) {
        }
    }

    public List<SummonFriendItem> refreshData() {
        try {
            if (this.mData == null) {
                this.mData = new ArrayList();
            }
            ((List) this.mData).clear();
            this.recentFriendModel = SummonFriendApi.m98483a();
            if (!(this.recentFriendModel == null || this.recentFriendModel.users == null)) {
                addItem(this.recentFriendModel.users, AwemeApplication.m21341a().getResources().getString(R.string.e3q), true, 4);
            }
            if (C21115b.m71197a().isLogin()) {
                this.followUserListModel = SummonFriendApi.m98482a(10, System.currentTimeMillis() / 1000, 0, C21115b.m71197a().getCurUserId(), C43161e.m136882a(), C43161e.m136884b());
                if (this.followUserListModel != null) {
                    setCursor(this.followUserListModel);
                    addItem(this.followUserListModel.users, AwemeApplication.m21341a().getResources().getString(R.string.e3p), true, 3);
                }
            }
            return (List) this.mData;
        } catch (Exception unused) {
            return null;
        }
    }

    private void setCursor(FollowUserListModel followUserListModel2) {
        this.maxTime = followUserListModel2.maxTime;
    }

    private void addSummonItem(List<User> list, int i) {
        if (this.mData != null) {
            for (User user : list) {
                SummonFriendItem summonFriendItem = new SummonFriendItem();
                summonFriendItem.mUser = user;
                summonFriendItem.type = i;
                ((List) this.mData).add(summonFriendItem);
            }
        }
    }

    private void addItem(List<User> list, String str, boolean z, int i) {
        if (list != null) {
            if (list.size() > 0 && z) {
                SummonFriendItem summonFriendItem = new SummonFriendItem();
                summonFriendItem.type = 2;
                summonFriendItem.label = str;
                ((List) this.mData).add(summonFriendItem);
            }
            addSummonItem(list, i);
        }
    }
}
