package com.p280ss.android.ugc.aweme.friends.model;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.friends.api.C30029a;
import com.p280ss.android.ugc.aweme.friends.api.FriendApi;
import com.p280ss.android.ugc.aweme.friends.p1283c.C30039a;
import com.p280ss.android.ugc.aweme.net.C34089j;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.ContactFriendModel */
public class ContactFriendModel extends C30039a<User> {
    protected boolean mCountOnly;
    protected FriendApi mFriendApi;

    public void buildFriendItems(FriendList<User> friendList) {
    }

    public ContactFriendModel() {
        this.mFriendApi = C30029a.m98491a();
    }

    public ContactFriendModel(boolean z) {
        this();
        this.mCountOnly = z;
    }

    static final /* synthetic */ FriendList lambda$fetchList$0$ContactFriendModel(C1592h hVar) throws Exception {
        return (FriendList) hVar.mo6890e();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ FriendList lambda$fetchList$1$ContactFriendModel(C1592h hVar) throws Exception {
        FriendList friendList = (FriendList) hVar.mo6890e();
        if (friendList != null && !C6307b.m19566a((Collection<T>) friendList.friends) && !this.mHasFollowedFriends) {
            partitionByIsFollowedStatus(friendList.friends);
        }
        return (FriendList) hVar.mo6890e();
    }

    /* access modifiers changed from: protected */
    public void partitionByIsFollowedStatus(List<User> list) {
        int size = list.size();
        boolean z = false;
        for (int i = 0; i < size; i++) {
            if (((User) list.get(i)).getFollowStatus() != 0) {
                while (i < size && ((User) list.get(size - 1)).getFollowStatus() != 0) {
                    size--;
                }
                User user = (User) list.get(i);
                list.set(i, list.get(size));
                list.set(size, user);
                z = true;
            }
        }
        this.mHasFollowedFriends = z;
    }

    public void fetchList(int i, int i2, int i3) {
        if (this.mCountOnly) {
            this.mFriendApi.queryContactsFriendsCountOnly(i, i2, i3, 1).mo6885c(ContactFriendModel$$Lambda$0.$instance).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
        } else {
            this.mFriendApi.queryContactsFriends(i, i2, i3).mo6885c((C1591g<TResult, TContinuationResult>) new ContactFriendModel$$Lambda$1<TResult,TContinuationResult>(this)).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
        }
    }
}
