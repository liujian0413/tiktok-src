package com.p280ss.android.ugc.aweme.friends.model;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.friends.api.C30029a;
import com.p280ss.android.ugc.aweme.friends.api.FriendApi;
import com.p280ss.android.ugc.aweme.net.C34089j;
import com.p280ss.android.ugc.aweme.p1192e.C27325a;
import com.p280ss.android.ugc.aweme.player.p1456a.C34943c;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.InviteMoreUnregisteredFriendsModel */
public class InviteMoreUnregisteredFriendsModel extends C25673a<UnRegisteredUser, FriendList<User>> {
    private final FriendApi mFriendApi = C30029a.m98491a();

    public List<UnRegisteredUser> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FriendList) this.mData).unregisteredUser;
    }

    public boolean isHasMore() {
        if (this.mData == null || !((FriendList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    static final /* synthetic */ FriendList lambda$fetchList$0$InviteMoreUnregisteredFriendsModel(C1592h hVar) throws Exception {
        return (FriendList) hVar.mo6890e();
    }

    public void refreshList(Object... objArr) {
        fetchList(0, C34943c.f91127w);
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public void loadMoreList(Object... objArr) {
        fetchList(((FriendList) this.mData).cursor, C34943c.f91127w);
    }

    /* access modifiers changed from: protected */
    public void handleData(FriendList<User> friendList) {
        boolean z;
        FriendList friendList2;
        boolean z2 = false;
        if (friendList == null || C6307b.m19566a((Collection<T>) friendList.unregisteredUser)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (this.mIsNewDataEmpty) {
            if (this.mData != null) {
                friendList2 = (FriendList) this.mData;
            }
        }
        int i = this.mListQueryType;
        if (i != 1) {
            if (i == 4) {
                C27325a.m89575a(((FriendList) this.mData).unregisteredUser, friendList.unregisteredUser);
                ((FriendList) this.mData).cursor = friendList.cursor;
                ((FriendList) this.mData).type = friendList.type;
                friendList2 = (FriendList) this.mData;
                if (((FriendList) this.mData).hasMore && friendList.hasMore) {
                    z2 = true;
                }
            }
        }
        this.mData = friendList;
        return;
        friendList2.hasMore = z2;
    }

    private void fetchList(int i, int i2) {
        this.mFriendApi.queryMoreUnregisteredFriends(i, i2).mo6885c(InviteMoreUnregisteredFriendsModel$$Lambda$0.$instance).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
    }
}
