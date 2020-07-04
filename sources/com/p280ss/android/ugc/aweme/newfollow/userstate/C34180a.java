package com.p280ss.android.ugc.aweme.newfollow.userstate;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26098c;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26112p;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.follow.p1261d.C29448a;
import com.p280ss.android.ugc.aweme.follow.presenter.C29452a;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeed;
import com.p280ss.android.ugc.aweme.follow.presenter.FollowFeedList;
import com.p280ss.android.ugc.aweme.forward.api.ForwardApi;
import com.p280ss.android.ugc.aweme.forward.model.DynamicStruct;
import com.p280ss.android.ugc.aweme.forward.model.UserDynamicList;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.net.C34089j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.newfollow.userstate.a */
public final class C34180a extends C26098c<FollowFeed, FollowFeedList> implements C26112p, Cloneable {
    /* renamed from: a */
    static final /* synthetic */ UserDynamicList m110342a(UserDynamicList userDynamicList) throws Exception {
        return userDynamicList;
    }

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List<FollowFeed> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FollowFeedList) this.mData).getItems();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public C34180a clone() {
        try {
            C34180a aVar = (C34180a) super.clone();
            aVar.mData = ((FollowFeedList) this.mData).clone();
            return aVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((FollowFeedList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final List<Aweme> mo57985a() {
        return C29452a.m96923a(getItems());
    }

    public final void refreshList(Object... objArr) {
        if (objArr.length >= 3) {
            m110344a((String) objArr[1], (String) objArr[2], 0, 0, 20);
            return;
        }
        m110344a((String) objArr[1], (String) null, 0, 0, 20);
    }

    /* renamed from: b */
    private FollowFeedList m110345b(UserDynamicList userDynamicList) {
        if (userDynamicList == null || userDynamicList.getDynamicList() == null) {
            return new FollowFeedList();
        }
        FollowFeedList followFeedList = new FollowFeedList();
        ArrayList arrayList = new ArrayList();
        for (DynamicStruct a : userDynamicList.getDynamicList()) {
            arrayList.add(m110341a(a));
        }
        followFeedList.setItems(arrayList);
        followFeedList.setHasMore(userDynamicList.getHasMore());
        followFeedList.setMaxCursor(userDynamicList.getMaxCursor());
        followFeedList.setMinCursor(userDynamicList.getMinCursor());
        return followFeedList;
    }

    public final void loadMoreList(Object... objArr) {
        long j = 0;
        if (objArr.length >= 3) {
            String str = (String) objArr[1];
            String str2 = (String) objArr[2];
            if (!C6307b.m19566a((Collection<T>) getItems())) {
                j = ((FollowFeedList) this.mData).getMaxCursor();
            }
            m110344a(str, str2, j, -1, 10);
            return;
        }
        String str3 = (String) objArr[1];
        if (!C6307b.m19566a((Collection<T>) getItems())) {
            j = ((FollowFeedList) this.mData).getMaxCursor();
        }
        m110344a(str3, (String) null, j, -1, 10);
    }

    /* renamed from: a */
    private static FollowFeed m110341a(DynamicStruct dynamicStruct) {
        FollowFeed followFeed = new FollowFeed();
        if (dynamicStruct == null) {
            return followFeed;
        }
        if (dynamicStruct.getItemType() != 1) {
            followFeed.setAweme(dynamicStruct.getAweme());
            followFeed.setCommentList(dynamicStruct.getComments());
            followFeed.setFeedType(65280);
        } else {
            followFeed.setLikeCount(dynamicStruct.getLikeCount());
            followFeed.setFavorites(dynamicStruct.getFavorites());
            followFeed.setBlockFavoriteTime(dynamicStruct.getBlockFavoriteTime());
            followFeed.setFeedType(65286);
            followFeed.setFavoriteIds(dynamicStruct.getFavoriteIds());
        }
        return followFeed;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ FollowFeedList mo86913a(C1592h hVar) throws Exception {
        return m110345b((UserDynamicList) hVar.mo6890e());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(FollowFeedList followFeedList) {
        boolean z;
        if (followFeedList == null || C6307b.m19566a((Collection<T>) followFeedList.getItems())) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (this.mListQueryType == 2 && !isDataEmpty()) {
                ((FollowFeedList) this.mData).getItems().clear();
            }
            int size = followFeedList.getItems().size();
            for (int i = 0; i < size; i++) {
                FollowFeed followFeed = (FollowFeed) followFeedList.getItems().get(i);
                if (followFeed != null && followFeed.getFeedType() == 65280) {
                    Aweme aweme = followFeed.getAweme();
                    if (C29448a.m96898a(aweme)) {
                        Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(aweme);
                        IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                        StringBuilder sb = new StringBuilder();
                        sb.append(updateAweme.getAid());
                        sb.append(1);
                        iRequestIdService.setRequestIdAndIndex(sb.toString(), followFeedList.getRequestId(), i);
                        followFeed.setAweme(updateAweme);
                        followFeedList.getItems().set(i, followFeed);
                        if (updateAweme.getAwemeType() == 13) {
                            Aweme forwardItem = updateAweme.getForwardItem();
                            if (forwardItem != null) {
                                forwardItem.setRepostFromGroupId(updateAweme.getAid());
                                forwardItem.setRepostFromUserId(updateAweme.getAuthorUid());
                                Aweme updateAweme2 = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(forwardItem);
                                IRequestIdService iRequestIdService2 = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(updateAweme2.getAid());
                                sb2.append(1);
                                iRequestIdService2.setRequestIdAndIndex(sb2.toString(), followFeedList.getRequestId(), i);
                            }
                        }
                    }
                }
            }
            if (this.mListQueryType != 1) {
                Iterator it = followFeedList.getItems().iterator();
                while (it.hasNext()) {
                    FollowFeed followFeed2 = (FollowFeed) it.next();
                    if (!isDataEmpty() && ((FollowFeedList) this.mData).getItems().indexOf(followFeed2) >= 0) {
                        it.remove();
                    }
                }
            }
            int i2 = this.mListQueryType;
            if (i2 != 4) {
                switch (i2) {
                    case 1:
                        this.mData = followFeedList;
                        break;
                    case 2:
                        followFeedList.getItems().addAll(getItems());
                        ((FollowFeedList) this.mData).setItems(followFeedList.getItems());
                        break;
                }
            } else {
                ((FollowFeedList) this.mData).getItems().addAll(followFeedList.getItems());
                ((FollowFeedList) this.mData).setHasMore(((FollowFeedList) this.mData).getHasMore() & followFeedList.getHasMore());
            }
            C28199ae.m92689a().mo71792a(((FollowFeedList) this.mData).getRequestId(), ((FollowFeedList) this.mData).getLogPb());
            if (((FollowFeedList) this.mData).getMaxCursor() != 0) {
                ((FollowFeedList) this.mData).setMaxCursor(Math.min(((FollowFeedList) this.mData).getMaxCursor(), followFeedList.getMaxCursor()));
            }
            if (((FollowFeedList) this.mData).getMinCursor() != 0) {
                ((FollowFeedList) this.mData).setMinCursor(Math.max(((FollowFeedList) this.mData).getMinCursor(), followFeedList.getMinCursor()));
            }
            for (int i3 = 0; i3 < ((FollowFeedList) this.mData).getItems().size(); i3++) {
                if (((FollowFeed) ((FollowFeedList) this.mData).getItems().get(i3)).getFeedType() == 65280 && ((FollowFeed) ((FollowFeedList) this.mData).getItems().get(i3)).getAweme() != null) {
                    ((FollowFeed) ((FollowFeedList) this.mData).getItems().get(i3)).getAweme().setAwemePosition(i3);
                }
            }
            return;
        }
        if (this.mListQueryType == 1) {
            this.mData = null;
        }
        if (!(this.mData == null || this.mListQueryType == 2)) {
            ((FollowFeedList) this.mData).setHasMore(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C1592h mo86912a(String str, String str2, int i, C1592h hVar) throws Exception {
        return m110340a(str, str2, hVar, i, 20);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ C1592h mo86911a(String str, String str2, int i, int i2, C1592h hVar) throws Exception {
        return m110340a(str, str2, hVar, i, i2 - 1);
    }

    /* renamed from: a */
    private void m110344a(String str, String str2, long j, long j2, int i) {
        ForwardApi.m97743a(str, str2, j, j2, i).mo6888d(new C34183d(this, str, str2, i)).mo6885c((C1591g<TResult, TContinuationResult>) new C34184e<TResult,TContinuationResult>(this)).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
    }

    /* renamed from: a */
    private C1592h<UserDynamicList> m110340a(String str, String str2, C1592h<UserDynamicList> hVar, int i, int i2) {
        UserDynamicList userDynamicList = (UserDynamicList) hVar.mo6890e();
        if (i2 <= 0 || userDynamicList == null || userDynamicList.getHasMore() != 1 || !C6307b.m19566a((Collection<T>) userDynamicList.getDynamicList())) {
            return C1592h.m7859b((Callable<TResult>) new C34182c<TResult>(userDynamicList));
        }
        C1592h a = ForwardApi.m97743a(str, str2, userDynamicList.getMaxCursor(), -1, i);
        C34181b bVar = new C34181b(this, str, str2, i, i2);
        return a.mo6888d(bVar);
    }
}
