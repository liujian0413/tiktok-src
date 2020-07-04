package com.p280ss.android.ugc.aweme.friends.model;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.net.C34089j;
import com.p280ss.android.ugc.aweme.profile.model.User;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.friends.model.ContactFriendWithUnregisteredUserModel */
public class ContactFriendWithUnregisteredUserModel extends ContactFriendModel {
    private List<User> mUsers = new ArrayList();

    public List<User> getItems() {
        return this.mUsers;
    }

    static final /* synthetic */ FriendList lambda$fetchList$0$ContactFriendWithUnregisteredUserModel(C1592h hVar) throws Exception {
        return (FriendList) hVar.mo6890e();
    }

    /* access modifiers changed from: 0000 */
    public final /* synthetic */ FriendList lambda$fetchList$1$ContactFriendWithUnregisteredUserModel(C1592h hVar) throws Exception {
        FriendList friendList = (FriendList) hVar.mo6890e();
        if (friendList != null && !C6307b.m19566a((Collection<T>) friendList.friends) && !this.mHasFollowedFriends) {
            partitionByIsFollowedStatus(friendList.friends);
        }
        return (FriendList) hVar.mo6890e();
    }

    public void handleData(FriendList<User> friendList) {
        boolean z;
        FriendList friendList2;
        buildFriendItems(friendList);
        boolean z2 = false;
        if (friendList == null || (C6307b.m19566a((Collection<T>) friendList.friends) && C6307b.m19566a((Collection<T>) friendList.unregisteredUser))) {
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
                ((FriendList) this.mData).friends.addAll(friendList.friends);
                addAll(friendList.friends, friendList.unregisteredUser);
                ((FriendList) this.mData).cursor = friendList.cursor;
                ((FriendList) this.mData).type = friendList.type;
                friendList2 = (FriendList) this.mData;
                if (((FriendList) this.mData).hasMore && friendList.hasMore) {
                    z2 = true;
                }
            }
        }
        this.mData = friendList;
        this.mUsers.clear();
        addAll(friendList.friends, friendList.unregisteredUser);
        return;
        friendList2.hasMore = z2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0054  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private synchronized void addAll(java.util.List<com.p280ss.android.ugc.aweme.profile.model.User> r8, java.util.List<com.p280ss.android.ugc.aweme.friends.model.UnRegisteredUser> r9) {
        /*
            r7 = this;
            monitor-enter(r7)
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r0 = r7.mUsers     // Catch:{ all -> 0x0087 }
            int r0 = r0.size()     // Catch:{ all -> 0x0087 }
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0087 }
            r1.<init>()     // Catch:{ all -> 0x0087 }
            java.util.Iterator r9 = r9.iterator()     // Catch:{ all -> 0x0087 }
        L_0x0010:
            boolean r2 = r9.hasNext()     // Catch:{ all -> 0x0087 }
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L_0x003a
            java.lang.Object r2 = r9.next()     // Catch:{ all -> 0x0087 }
            com.ss.android.ugc.aweme.friends.model.UnRegisteredUser r2 = (com.p280ss.android.ugc.aweme.friends.model.UnRegisteredUser) r2     // Catch:{ all -> 0x0087 }
            com.ss.android.ugc.aweme.friends.model.Friend r5 = new com.ss.android.ugc.aweme.friends.model.Friend     // Catch:{ all -> 0x0087 }
            java.lang.String r6 = r2.mobileId     // Catch:{ all -> 0x0087 }
            java.lang.String r6 = java.lang.String.valueOf(r6)     // Catch:{ all -> 0x0087 }
            r5.<init>(r6)     // Catch:{ all -> 0x0087 }
            java.lang.String r6 = r2.remarkName     // Catch:{ all -> 0x0087 }
            r5.setNickname(r6)     // Catch:{ all -> 0x0087 }
            int r2 = r2.inviteStatus     // Catch:{ all -> 0x0087 }
            if (r2 <= 0) goto L_0x0033
            r3 = 1
        L_0x0033:
            r5.setInvited(r3)     // Catch:{ all -> 0x0087 }
            r1.add(r5)     // Catch:{ all -> 0x0087 }
            goto L_0x0010
        L_0x003a:
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r9 = r7.mUsers     // Catch:{ all -> 0x0087 }
            boolean r9 = r9.isEmpty()     // Catch:{ all -> 0x0087 }
            if (r9 != 0) goto L_0x0051
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r9 = r7.mUsers     // Catch:{ all -> 0x0087 }
            int r2 = r0 + -1
            java.lang.Object r9 = r9.get(r2)     // Catch:{ all -> 0x0087 }
            boolean r9 = r9 instanceof com.p280ss.android.ugc.aweme.friends.model.Friend     // Catch:{ all -> 0x0087 }
            if (r9 != 0) goto L_0x004f
            goto L_0x0051
        L_0x004f:
            r9 = 0
            goto L_0x0052
        L_0x0051:
            r9 = 1
        L_0x0052:
            if (r8 == 0) goto L_0x006f
            int r2 = r0 + -1
        L_0x0056:
            if (r2 < 0) goto L_0x006a
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r5 = r7.mUsers     // Catch:{ all -> 0x0087 }
            java.lang.Object r5 = r5.get(r2)     // Catch:{ all -> 0x0087 }
            com.ss.android.ugc.aweme.profile.model.User r5 = (com.p280ss.android.ugc.aweme.profile.model.User) r5     // Catch:{ all -> 0x0087 }
            boolean r5 = r5 instanceof com.p280ss.android.ugc.aweme.friends.model.Friend     // Catch:{ all -> 0x0087 }
            if (r5 != 0) goto L_0x0067
            int r0 = r2 + 1
            goto L_0x006a
        L_0x0067:
            int r2 = r2 + -1
            goto L_0x0056
        L_0x006a:
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r2 = r7.mUsers     // Catch:{ all -> 0x0087 }
            r2.addAll(r0, r8)     // Catch:{ all -> 0x0087 }
        L_0x006f:
            boolean r8 = com.bytedance.common.utility.collection.C6307b.m19566a(r1)     // Catch:{ all -> 0x0087 }
            if (r8 != 0) goto L_0x0085
            java.util.List<com.ss.android.ugc.aweme.profile.model.User> r8 = r7.mUsers     // Catch:{ all -> 0x0087 }
            r8.addAll(r1)     // Catch:{ all -> 0x0087 }
            if (r9 == 0) goto L_0x0085
            java.lang.Object r8 = r1.get(r3)     // Catch:{ all -> 0x0087 }
            com.ss.android.ugc.aweme.friends.model.Friend r8 = (com.p280ss.android.ugc.aweme.friends.model.Friend) r8     // Catch:{ all -> 0x0087 }
            r8.setFirstOne(r4)     // Catch:{ all -> 0x0087 }
        L_0x0085:
            monitor-exit(r7)
            return
        L_0x0087:
            r8 = move-exception
            monitor-exit(r7)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.friends.model.ContactFriendWithUnregisteredUserModel.addAll(java.util.List, java.util.List):void");
    }

    public void fetchList(int i, int i2, int i3) {
        if (this.mCountOnly) {
            this.mFriendApi.queryContactsFriendsCountOnly(i, i2, i3, 1).mo6885c(ContactFriendWithUnregisteredUserModel$$Lambda$0.$instance).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
        } else {
            this.mFriendApi.queryContactsFriends(i, i2, i3).mo6885c((C1591g<TResult, TContinuationResult>) new ContactFriendWithUnregisteredUserModel$$Lambda$1<TResult,TContinuationResult>(this)).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
        }
    }
}
