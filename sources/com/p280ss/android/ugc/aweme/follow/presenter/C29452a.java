package com.p280ss.android.ugc.aweme.follow.presenter;

import android.os.Message;
import android.text.TextUtils;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.SharePrefCache;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26098c;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26112p;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.ImageInfo;
import com.p280ss.android.ugc.aweme.feed.model.StreamUrlModel;
import com.p280ss.android.ugc.aweme.flowfeed.p1254h.C29367b;
import com.p280ss.android.ugc.aweme.follow.C29442b;
import com.p280ss.android.ugc.aweme.follow.api.C29438a;
import com.p280ss.android.ugc.aweme.follow.api.C29440b.C29441a;
import com.p280ss.android.ugc.aweme.follow.experiment.EnableLiveInFollowFeedFullScreenExperiment;
import com.p280ss.android.ugc.aweme.follow.experiment.FullFeedFollowShowLiveExperiment;
import com.p280ss.android.ugc.aweme.follow.experiment.SmartFeedExperiment;
import com.p280ss.android.ugc.aweme.follow.p1258a.C29437a;
import com.p280ss.android.ugc.aweme.follow.p1261d.C29448a;
import com.p280ss.android.ugc.aweme.follow.p1261d.C29450c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.C32904bi;
import com.p280ss.android.ugc.aweme.main.experiment.C33004c;
import com.p280ss.android.ugc.aweme.newfollow.experiment.FollowFeedEnterFullScreenAB;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.utils.permission.C43161e;
import com.p280ss.android.ugc.aweme.video.C43238k;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.follow.presenter.a */
public final class C29452a extends C26098c<FollowFeed, FollowFeedList> implements C26112p, Cloneable {

    /* renamed from: l */
    private static HashMap<Long, Aweme> f77660l = new HashMap<>();

    /* renamed from: b */
    public String f77661b = "homepage_follow";

    /* renamed from: c */
    public String f77662c = "extra_follow_type_follow";

    /* renamed from: d */
    public boolean f77663d;

    /* renamed from: e */
    public long f77664e;

    /* renamed from: f */
    public int f77665f = -1;

    /* renamed from: g */
    public List<FollowFeed> f77666g = new CopyOnWriteArrayList();

    /* renamed from: h */
    public boolean f77667h;

    /* renamed from: i */
    public int f77668i = -1;

    /* renamed from: j */
    public int f77669j = -1;

    /* renamed from: k */
    private int f77670k;

    /* renamed from: c */
    public final void mo75449c() {
        this.f77670k = 0;
    }

    /* renamed from: a */
    public final void mo75447a(FollowFeed followFeed) {
        if (this.mData == null) {
            this.mData = new FollowFeedList();
        }
        if (C6307b.m19566a((Collection<T>) ((FollowFeedList) this.mData).getItems())) {
            ArrayList arrayList = new ArrayList();
            arrayList.add(followFeed);
            ((FollowFeedList) this.mData).setItems(arrayList);
        }
    }

    /* renamed from: a */
    public final List<Aweme> mo57985a() {
        return m96923a(getItems());
    }

    /* renamed from: a */
    private void m96927a(List<String> list, String str) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            C6877n.m21407a("service_monitor", "aweme_delete_duplicated_items", C6869c.m21381a().mo16887a("request_id", str).mo16887a("user_id", C6861a.m21337f().getCurUserId()).mo16885a("list_count", Integer.valueOf(list.size())).mo16887a("item_ids_str", m96928b(list, ",")).mo16887a("page_type", "homepage_follow").mo16888b());
        }
    }

    public final List<FollowFeed> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FollowFeedList) this.mData).getItems();
    }

    /* access modifiers changed from: private */
    /* renamed from: g */
    public C29452a clone() {
        try {
            C29452a aVar = (C29452a) super.clone();
            aVar.mData = ((FollowFeedList) this.mData).clone();
            return aVar;
        } catch (CloneNotSupportedException unused) {
            return null;
        }
    }

    /* renamed from: f */
    public final boolean mo75453f() {
        if (this.mData == null || ((FollowFeedList) this.mData).getIsRecommend() != 1) {
            return false;
        }
        return true;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((FollowFeedList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo75451d() {
        if (this.mData == null || ((FollowFeedList) this.mData).getUpPhoneNotice() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public final boolean mo75448b() {
        if (this.mData == null || C6307b.m19566a((Collection<T>) ((FollowFeedList) this.mData).getItems())) {
            return true;
        }
        for (FollowFeed followFeed : ((FollowFeedList) this.mData).getItems()) {
            if (followFeed.getFeedType() != 65280) {
                if (followFeed.getFeedType() == 65298) {
                }
            }
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final List<Aweme> mo75452e() {
        if (this.mData == null) {
            return null;
        }
        this.f77665f = -1;
        ArrayList arrayList = new ArrayList();
        for (FollowFeed followFeed : ((FollowFeedList) this.mData).getItems()) {
            if (followFeed.getFeedType() == 65280) {
                arrayList.add(followFeed.getAweme());
            } else if (followFeed.getFeedType() == 65297) {
                this.f77665f = arrayList.size();
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo75445a(Message message) throws Exception {
        handleData((FollowFeedList) message.obj);
        return null;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 2) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static C29456d m96922a(Object... objArr) {
        if (objArr.length < 2 || !(objArr[1] instanceof C29456d)) {
            return null;
        }
        return objArr[1];
    }

    /* renamed from: b */
    private void m96929b(FollowFeedList followFeedList) {
        if (TextUtils.equals(this.f77662c, "extra_follow_type_follow") && this.mListQueryType == 1 && followFeedList != null && followFeedList.needCache()) {
            C29437a.f77634a.mo75348a(followFeedList);
        }
    }

    /* renamed from: d */
    private static void m96933d(FollowFeedList followFeedList) {
        if (followFeedList != null && followFeedList.needDeleteCache()) {
            C29437a.m96858b();
            C6907h.m21524a("followfeed_snapshot_delete", (Map) new HashMap());
        }
    }

    public final void setItems(List<FollowFeed> list) {
        if (this.mData == null) {
            this.mData = new FollowFeedList();
        }
        ((FollowFeedList) this.mData).setItems(list);
    }

    /* renamed from: f */
    private static FollowFeedList m96936f(FollowFeedList followFeedList) {
        if (followFeedList == null || C6307b.m19566a((Collection<T>) followFeedList.getItems()) || !C29442b.m96871a(followFeedList.getLastViewData(), followFeedList.getItems().size())) {
            return followFeedList;
        }
        followFeedList.getItems().add(followFeedList.getLastViewData().f77632a, FollowFeed.createLastWatchHistoryItem(followFeedList.getLastViewData()));
        return followFeedList;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo75446a(C1592h hVar) throws Exception {
        if (this.mNotifyListeners != null) {
            for (C25678f b : this.mNotifyListeners) {
                b.mo56977b();
            }
        }
        return null;
    }

    public final void refreshList(Object... objArr) {
        String str;
        C29456d a = m96922a(objArr);
        if (a != null) {
            String str2 = a.f77695e;
            if (TextUtils.isEmpty(str2)) {
                str = a.f77699i;
            } else {
                str = str2;
            }
            int i = this.f77670k + 1;
            int i2 = i;
            this.f77670k = i;
            String str3 = a.f77697g;
            int intValue = a.f77696f.intValue();
            m96924a(i2, 0, 1, 0, 0, a.f77692b, a.f77693c, a.f77694d, "", str3, str2, str, 0, intValue);
        }
    }

    /* renamed from: b */
    private static boolean m96930b(FollowFeed followFeed) {
        if (followFeed.getFeedType() != 65280) {
            return false;
        }
        Aweme aweme = followFeed.getAweme();
        if (aweme.getAwemeType() == 13) {
            Aweme forwardItem = aweme.getForwardItem();
            if (!(forwardItem == null || forwardItem.getAwemeType() == 2 || C29367b.m96458a(forwardItem))) {
                return true;
            }
        } else if (!(aweme.getAwemeType() == 2 || aweme.getAwemeType() == 101 || C29367b.m96458a(aweme))) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    private void m96931c(FollowFeedList followFeedList) {
        int i;
        if (followFeedList == null || !followFeedList.needUseCache()) {
            this.mData = null;
        } else if (this.mData == null || C6307b.m19566a((Collection<T>) ((FollowFeedList) this.mData).getItems())) {
            FollowFeedList a = C29437a.f77634a.mo75347a();
            if (a != null) {
                this.mData = a;
                if (a.getItems() != null) {
                    i = a.getItems().size();
                } else {
                    i = 0;
                }
                C6907h.m21524a("followfeed_snapshot", (Map) C22984d.m75611a().mo59970a("item_cnt", i).f60753a);
            }
        }
    }

    /* renamed from: e */
    private FollowFeedList m96935e(FollowFeedList followFeedList) {
        if (C29442b.m96871a(followFeedList.getLastViewData(), followFeedList.getItems().size()) && !C29442b.m96871a(((FollowFeedList) this.mData).getLastViewData(), ((FollowFeedList) this.mData).getItems().size())) {
            followFeedList.getItems().add(followFeedList.getLastViewData().f77632a, FollowFeed.createLastWatchHistoryItem(followFeedList.getLastViewData()));
        }
        return followFeedList;
    }

    public final void handleMsg(Message message) {
        this.mIsLoading = false;
        if (message.obj instanceof Exception) {
            if (this.mNotifyListeners != null) {
                for (C25678f a : this.mNotifyListeners) {
                    a.mo57296a((Exception) message.obj);
                }
            }
            m96925a(this.f77668i, "", ((Exception) message.obj).getMessage(), 0);
            return;
        }
        C1592h.m7855a((Callable<TResult>) new C29454b<TResult>(this, Message.obtain(message)), (Executor) C7258h.m22730c()).mo6876a((C1591g<TResult, TContinuationResult>) new C29455c<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    public final void loadMoreList(Object... objArr) {
        long j;
        int i;
        long j2;
        C29456d a = m96922a(objArr);
        if (a != null) {
            int i2 = this.f77670k;
            if (this.mData != null) {
                j = ((FollowFeedList) this.mData).getCursor();
            } else {
                j = 0;
            }
            if (this.mData != null) {
                i = ((FollowFeedList) this.mData).getLevel();
            } else {
                i = 1;
            }
            if (C6307b.m19566a((Collection<T>) getItems())) {
                j2 = 0;
            } else {
                j2 = ((FollowFeedList) this.mData).getMaxCursor();
            }
            m96924a(i2, j, i, j2, -1, a.f77692b, a.f77693c, a.f77694d, a.f77695e, null, null, null, ((FollowFeedList) this.mData).getIsRecommend(), a.f77696f.intValue());
        }
    }

    /* renamed from: c */
    private static boolean m96932c(FollowFeed followFeed) {
        Aweme aweme;
        if (followFeed.getFeedType() != 65280) {
            return false;
        }
        if (followFeed.getAweme().isForwardAweme()) {
            aweme = followFeed.getAweme().getForwardItem();
        } else {
            aweme = followFeed.getAweme();
        }
        if (aweme == null) {
            return false;
        }
        if (!C29367b.m96458a(aweme)) {
            if (aweme.getAwemeType() == 2) {
                List imageInfos = aweme.getImageInfos();
                if (!C6307b.m19566a((Collection<T>) imageInfos)) {
                    ImageInfo imageInfo = (ImageInfo) imageInfos.get(0);
                    if (imageInfo == null || imageInfo.getWidth() == 0 || imageInfo.getHeight() == 0) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } else if (aweme.getVideo() == null || aweme.getVideo().getWidth() == 0 || aweme.getVideo().getHeight() == 0) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: d */
    private boolean m96934d(FollowFeed followFeed) {
        if (followFeed == null) {
            return false;
        }
        if ((followFeed.getFeedType() != 65280 && followFeed.getFeedType() != 65298) || this.mData == null || ((FollowFeedList) this.mData).getItems().size() == 0) {
            return false;
        }
        for (FollowFeed followFeed2 : ((FollowFeedList) this.mData).getItems()) {
            if (followFeed.getFeedType() == 65280 && followFeed2.getFeedType() == 65280) {
                Aweme aweme = followFeed.getAweme();
                Aweme aweme2 = followFeed2.getAweme();
                if (!(aweme == null || aweme2 == null || !TextUtils.equals(aweme.getAid(), aweme2.getAid()))) {
                    return true;
                }
            } else if (followFeed.getFeedType() == 65298 && followFeed2.getFeedType() == 65298) {
                C29463i roomStruct = followFeed.getRoomStruct();
                C29463i roomStruct2 = followFeed2.getRoomStruct();
                if (!(roomStruct == null || roomStruct2 == null || roomStruct.f77715a.f75166id != roomStruct2.f77715a.f75166id)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: g */
    private void m96938g(FollowFeedList followFeedList) {
        this.f77667h = false;
        if (followFeedList != null && !C6307b.m19566a((Collection<T>) followFeedList.getItems()) && followFeedList.getIsRecommend() != 1) {
            if (this.mData == null || C6307b.m19566a((Collection<T>) ((FollowFeedList) this.mData).getItems())) {
                this.f77667h = true;
            } else if (((FollowFeedList) this.mData).getItems().size() != followFeedList.getItems().size()) {
                this.f77667h = true;
            } else {
                for (int i = 0; i < ((FollowFeedList) this.mData).getItems().size(); i++) {
                    FollowFeed followFeed = (FollowFeed) ((FollowFeedList) this.mData).getItems().get(i);
                    FollowFeed followFeed2 = (FollowFeed) followFeedList.getItems().get(i);
                    if (followFeed.getAweme() != null && followFeed.getFeedType() == 65280 && followFeed2.getAweme() != null && !followFeed.getAweme().getAid().equals(followFeed2.getAweme().getAid())) {
                        this.f77667h = true;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static List<Aweme> m96923a(List<FollowFeed> list) {
        boolean z;
        if (list == null) {
            return null;
        }
        if (!C6384b.m19835a().mo15292a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", C6384b.m19835a().mo15295d().follow_detail_full_screen, false) || !C6384b.m19835a().mo15292a(EnableLiveInFollowFeedFullScreenExperiment.class, true, "enable_live_in_follow_feed_full_screen", C6384b.m19835a().mo15295d().enable_live_in_follow_feed_full_screen, false)) {
            z = false;
        } else {
            z = true;
        }
        ArrayList arrayList = new ArrayList();
        for (FollowFeed followFeed : list) {
            if (followFeed.getFeedType() == 65280) {
                Aweme aweme = followFeed.getAweme();
                if (aweme != null && (!aweme.isForwardAweme() || aweme.getForwardItem() != null)) {
                    arrayList.add(aweme);
                }
            } else if (followFeed.getFeedType() == 65298 && z) {
                Aweme a = m96921a(followFeed, followFeed.getRequestId());
                if (a != null) {
                    arrayList.add(a);
                }
            }
        }
        return arrayList;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(FollowFeedList followFeedList) {
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        m96938g(followFeedList);
        m96933d(followFeedList);
        if (followFeedList == null || C6307b.m19566a((Collection<T>) followFeedList.getItems())) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (this.f77663d && this.mListQueryType == 2 && !isDataEmpty()) {
                ((FollowFeedList) this.mData).getItems().clear();
            }
            this.f77666g.clear();
            if (!C32904bi.m106498c() || !C6384b.m19835a().mo15292a(FullFeedFollowShowLiveExperiment.class, true, "enable_full_feed_follow_show_live", C6384b.m19835a().mo15295d().enable_full_feed_follow_show_live, true)) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (!C6384b.m19835a().mo15292a(FollowFeedEnterFullScreenAB.class, true, "follow_detail_full_screen", C6384b.m19835a().mo15295d().follow_detail_full_screen, false) || !C6384b.m19835a().mo15292a(EnableLiveInFollowFeedFullScreenExperiment.class, true, "enable_live_in_follow_feed_full_screen", C6384b.m19835a().mo15295d().enable_live_in_follow_feed_full_screen, false)) {
                z3 = false;
            } else {
                z3 = true;
            }
            for (int i = 0; i < followFeedList.getItems().size(); i++) {
                FollowFeed followFeed = (FollowFeed) followFeedList.getItems().get(i);
                followFeed.setRequestId(followFeedList.getRequestId());
                if (followFeed.getFeedType() == 65280) {
                    this.f77666g.add(followFeed);
                } else if (followFeed.getFeedType() == 65298) {
                    if (z2) {
                        Aweme a = m96921a(followFeed, followFeedList.requestId);
                        if (a != null) {
                            FollowFeed followFeed2 = new FollowFeed();
                            followFeed2.setFeedType(65280);
                            followFeed2.setAweme(a);
                            followFeedList.getItems().set(i, followFeed2);
                            this.f77666g.add(followFeed2);
                        }
                    } else if (z3) {
                        followFeed.setAweme(m96921a(followFeed, followFeedList.requestId));
                    }
                }
            }
            int size = followFeedList.getItems().size();
            for (int i2 = 0; i2 < size; i2++) {
                FollowFeed followFeed3 = (FollowFeed) followFeedList.getItems().get(i2);
                if (followFeed3 != null && followFeed3.getFeedType() == 65280) {
                    Aweme aweme = followFeed3.getAweme();
                    if (C29448a.m96898a(aweme)) {
                        Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(aweme);
                        updateAweme.setRequestId(followFeedList.getRequestId());
                        IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                        StringBuilder sb = new StringBuilder();
                        sb.append(updateAweme.getAid());
                        sb.append(1);
                        iRequestIdService.setRequestIdAndIndex(sb.toString(), followFeedList.getRequestId(), i2);
                        followFeed3.setAweme(updateAweme);
                        followFeedList.getItems().set(i2, followFeed3);
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
                                iRequestIdService2.setRequestIdAndIndex(sb2.toString(), followFeedList.getRequestId(), i2);
                            }
                        }
                    }
                }
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = followFeedList.getItems().iterator();
            while (it.hasNext()) {
                FollowFeed followFeed4 = (FollowFeed) it.next();
                if (followFeed4 == null) {
                    it.remove();
                } else if (m96932c(followFeed4)) {
                    it.remove();
                } else if (m96930b(followFeed4)) {
                    it.remove();
                } else if (this.mListQueryType != 1 && !isDataEmpty() && m96934d(followFeed4)) {
                    it.remove();
                    if (followFeed4.getAweme() != null) {
                        arrayList.add(followFeed4.getAweme().getAid());
                    } else if (!(followFeed4.getRoomStruct() == null || followFeed4.getRoomStruct().f77715a == null)) {
                        arrayList.add(String.valueOf(followFeed4.getRoomStruct().f77715a.f75166id));
                    }
                }
            }
            m96927a((List<String>) arrayList, followFeedList.requestId);
            C28199ae.m92689a().mo71792a(followFeedList.getRequestId(), followFeedList.getLogPb());
            int i3 = this.mListQueryType;
            if (i3 != 4) {
                switch (i3) {
                    case 1:
                        this.mData = m96936f(followFeedList);
                        break;
                    case 2:
                        followFeedList.getItems().addAll(getItems());
                        ((FollowFeedList) this.mData).setItems(followFeedList.getItems());
                        ((FollowFeedList) this.mData).setLastViewData(followFeedList.getLastViewData());
                        break;
                }
            } else {
                followFeedList = m96935e(followFeedList);
                ((FollowFeedList) this.mData).setLastViewData(followFeedList.getLastViewData());
                ((FollowFeedList) this.mData).getItems().addAll(followFeedList.getItems());
                ((FollowFeedList) this.mData).setHasMore(((FollowFeedList) this.mData).getHasMore() & followFeedList.getHasMore());
            }
            ((FollowFeedList) this.mData).setCursor(followFeedList.getCursor());
            ((FollowFeedList) this.mData).setLevel(followFeedList.getLevel());
            if (((FollowFeedList) this.mData).getMaxCursor() != 0) {
                ((FollowFeedList) this.mData).setMaxCursor(Math.min(((FollowFeedList) this.mData).getMaxCursor(), followFeedList.getMaxCursor()));
            }
            if (((FollowFeedList) this.mData).getMinCursor() != 0) {
                ((FollowFeedList) this.mData).setMinCursor(Math.max(((FollowFeedList) this.mData).getMinCursor(), followFeedList.getMinCursor()));
            }
            ((FollowFeedList) this.mData).setIsRecommend(followFeedList.getIsRecommend());
            ((FollowFeedList) this.mData).setUpPhoneNotice(followFeedList.getUpPhoneNotice());
            for (int i4 = 0; i4 < ((FollowFeedList) this.mData).getItems().size(); i4++) {
                if (((FollowFeed) ((FollowFeedList) this.mData).getItems().get(i4)).getFeedType() == 65280) {
                    ((FollowFeed) ((FollowFeedList) this.mData).getItems().get(i4)).getAweme().setAwemePosition(i4);
                }
            }
        } else {
            if (this.mListQueryType == 1) {
                m96931c(followFeedList);
            }
            if (!(this.mData == null || this.mListQueryType == 2 || TextUtils.equals(this.f77662c, "extra_follow_type_friend"))) {
                ((FollowFeedList) this.mData).setHasMore(0);
            }
        }
        m96929b(followFeedList);
        C29450c.m96902a(followFeedList, this.mListQueryType);
        if (followFeedList == null) {
            str = "";
        } else {
            str = followFeedList.requestId;
        }
        if (followFeedList == null || C6307b.m19566a((Collection<T>) followFeedList.getItems())) {
            m96925a(this.f77668i, str, "empty feed", 0);
        } else {
            m96925a(followFeedList.getFeedType(), str, "", followFeedList.getItems().size());
        }
    }

    /* renamed from: b */
    private static String m96928b(List<String> list, String str) {
        if (C6307b.m19566a((Collection<T>) list)) {
            return "";
        }
        StringBuilder sb = null;
        for (String str2 : list) {
            if (sb == null) {
                sb = new StringBuilder();
            } else {
                sb.append(str);
            }
            sb.append(str2);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static Aweme m96921a(FollowFeed followFeed, String str) {
        if (followFeed == null || followFeed.getRoomStruct() == null || followFeed.getRoomStruct().f77715a == null || followFeed.getRoomStruct().f77715a.stream_url == null) {
            return null;
        }
        long j = followFeed.getRoomStruct().f77715a.f75166id;
        Aweme aweme = (Aweme) f77660l.get(Long.valueOf(j));
        if (aweme == null) {
            aweme = new Aweme();
            aweme.setAid(String.valueOf(j));
            aweme.setAwemeType(BaseNotice.HASHTAG);
            aweme.setAuthor(followFeed.getRoomStruct().f77715a.owner);
        }
        aweme.setRequestId(str);
        StreamUrlModel streamUrlModel = new StreamUrlModel();
        streamUrlModel.setId(String.valueOf(j));
        streamUrlModel.setRtmpPullUrl(followFeed.getRoomStruct().f77715a.stream_url.rtmp_pull_url);
        aweme.setStreamUrlModel(streamUrlModel);
        f77660l.put(Long.valueOf(followFeed.getRoomStruct().f77715a.f75166id), aweme);
        C43238k.m137170a().f111932a.put(streamUrlModel.f75165id, followFeed.getRoomStruct().f77715a);
        return aweme;
    }

    /* renamed from: a */
    private void m96925a(int i, String str, String str2, int i2) {
        C6869c a = C6869c.m21381a();
        a.mo16885a("feed_r_type", Integer.valueOf(i)).mo16885a("feed_r_pull_type", Integer.valueOf(this.f77669j)).mo16885a("origin_count", Integer.valueOf(i2));
        if (!TextUtils.isEmpty(str)) {
            a.mo16887a("request_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            a.mo16887a("error_desc", str2);
        }
        C6877n.m21407a("aweme_feed_fetch_abnormal_log", "", a.mo16888b());
    }

    /* renamed from: a */
    private void m96924a(int i, long j, int i2, long j2, long j3, int i3, int i4, String str, String str2, String str3, String str4, String str5, int i5, int i6) {
        boolean booleanValue = ((Boolean) SharePrefCache.inst().getIsContactsUploaded().mo59877d()).booleanValue();
        final int b = C33004c.m106653b();
        final long j4 = j2;
        final long j5 = j3;
        final int i7 = i3;
        final int i8 = i4;
        final String str6 = str;
        final String str7 = str5;
        final int i9 = i5;
        C23397p a = C23397p.m76735a();
        final String str8 = str2;
        C294531 r23 = r1;
        C6309f fVar = this.mHandler;
        final int i10 = i;
        final long j6 = j;
        final int i11 = i2;
        final String str9 = str3;
        final String str10 = str4;
        final int i12 = i6;
        final int i13 = booleanValue ? 1 : 0;
        C294531 r1 = new Callable(this) {

            /* renamed from: q */
            final /* synthetic */ C29452a f77687q;

            public final Object call() throws Exception {
                FollowFeedList followFeedList;
                int i;
                int i2;
                int i3;
                if (TextUtils.equals(this.f77687q.f77662c, "extra_follow_type_friend")) {
                    long j = j4;
                    long j2 = j5;
                    int i4 = i7;
                    int i5 = i8;
                    long j3 = this.f77687q.f77664e;
                    if (this.f77687q.mData != null) {
                        i3 = ((FollowFeedList) this.f77687q.mData).getFetchRecommend();
                    } else {
                        i3 = 1;
                    }
                    followFeedList = C29438a.m96865a(j, j2, 20, i4, i5, j3, i3, str6, str7, i13, i9, C43161e.m136882a(), C43161e.m136884b());
                    this.f77687q.f77668i = 2;
                } else if (TextUtils.equals(this.f77687q.f77661b, "rec_follow")) {
                    followFeedList = C29438a.m96864a(20, i7, i8, this.f77687q.f77664e, str6, str8);
                } else if (C6399b.m19945u() || SmartFeedExperiment.isEnabled()) {
                    int i6 = i10;
                    long j4 = j6;
                    int i7 = i11;
                    int i8 = i7;
                    int i9 = i8;
                    long j5 = this.f77687q.f77664e;
                    if (this.f77687q.mData != null) {
                        i = ((FollowFeedList) this.f77687q.mData).getFetchRecommend();
                    } else {
                        i = 1;
                    }
                    followFeedList = C29441a.m96870a(i6, j4, i7, 20, i8, i9, j5, i, str6, str8, str9, str10, str7, i13, i9, C43161e.m136882a(), C43161e.m136884b(), b, i12);
                    this.f77687q.f77668i = 1;
                } else {
                    long j6 = j4;
                    long j7 = j5;
                    int i10 = i7;
                    int i11 = i8;
                    long j8 = this.f77687q.f77664e;
                    if (this.f77687q.mData != null) {
                        i2 = ((FollowFeedList) this.f77687q.mData).getFetchRecommend();
                    } else {
                        i2 = 1;
                    }
                    followFeedList = C29438a.m96866a(j6, j7, 20, i10, i11, j8, i2, str6, str8, str9, str10, str7, i13, i9, C43161e.m136882a(), C43161e.m136884b(), b, i12);
                    this.f77687q.f77668i = 0;
                }
                this.f77687q.f77669j = i7;
                if (followFeedList != null) {
                    BusinessComponentServiceUtils.getLiveStateManager().mo83747b(followFeedList.getItems());
                }
                return followFeedList;
            }

            {
                this.f77687q = r4;
            }
        };
        a.mo60807a(fVar, r23, 0);
    }
}
