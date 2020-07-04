package com.p280ss.android.ugc.aweme.feed.p1233i;

import android.content.Context;
import android.os.Bundle;
import android.os.Message;
import android.provider.Settings.Secure;
import android.text.TextUtils;
import android.util.Log;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.ugc.aweme.C6903bc;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.app.C22689a.C22704b;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C6869c;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.base.api.exceptions.server.ApiServerException;
import com.p280ss.android.ugc.aweme.commercialize.C24671f;
import com.p280ss.android.ugc.aweme.commercialize.feed.C24718al;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25264bc;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25300bx;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25329c;
import com.p280ss.android.ugc.aweme.common.C25678f;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.familiar.p966b.C21719b;
import com.p280ss.android.ugc.aweme.feed.C28434i;
import com.p280ss.android.ugc.aweme.feed.C28695t;
import com.p280ss.android.ugc.aweme.feed.api.C28216d;
import com.p280ss.android.ugc.aweme.feed.cache.C28274b;
import com.p280ss.android.ugc.aweme.feed.cache.C28275c;
import com.p280ss.android.ugc.aweme.feed.cache.IFeedApi;
import com.p280ss.android.ugc.aweme.feed.experiment.C28344a;
import com.p280ss.android.ugc.aweme.feed.experiment.FeedLoadCacheV3DelayExperiment;
import com.p280ss.android.ugc.aweme.feed.experiment.FeedRecommendLiveDisplayTypeExperiment;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.feed.p1231g.C28355a;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.feed.preload.C28666j;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.main.story.C33091h;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.poi.model.PoiOpCardStruct;
import com.p280ss.android.ugc.aweme.poi.model.PoiRankCardStruct;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p280ss.android.ugc.aweme.thread.C7258h;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.Lock;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.feed.i.b */
public class C28447b extends C25673a<Aweme, FeedItemList> {

    /* renamed from: m */
    private static boolean f74997m;

    /* renamed from: a */
    public boolean f74998a;

    /* renamed from: b */
    public FeedItemList f74999b;

    /* renamed from: c */
    public int f75000c;

    /* renamed from: d */
    public long f75001d;

    /* renamed from: e */
    public C28695t f75002e = this;

    /* renamed from: f */
    public boolean f75003f;

    /* renamed from: g */
    private int f75004g;

    /* renamed from: h */
    private int f75005h;

    /* renamed from: i */
    private String f75006i;

    /* renamed from: j */
    private List<PoiRankCardStruct> f75007j;

    /* renamed from: k */
    private List<PoiOpCardStruct> f75008k;

    /* renamed from: l */
    private boolean f75009l;

    /* renamed from: a */
    public boolean mo72182a() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo72180a(int i, int i2, String str, long j, long j2, int i3, Integer num, String str2, String str3, String str4) {
        boolean z;
        int i4;
        C6309f fVar = this.mHandler;
        final int i5 = i;
        final int i6 = i2;
        final String str5 = str;
        final long j3 = j;
        final long j4 = j2;
        final int i7 = i3;
        final Integer num2 = num;
        final String str6 = str2;
        final String str7 = str3;
        C284481 r14 = r0;
        final String str8 = str4;
        C284481 r0 = new Callable() {
            /* renamed from: a */
            static final /* synthetic */ Object m93531a() throws Exception {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("openudid", Secure.getString(C6399b.m19921a().getContentResolver(), "android_id"));
                    if (!TextUtils.isEmpty(C28216d.f74332b)) {
                        jSONObject.put("did", C28216d.f74332b);
                    }
                    jSONObject.put("event", "feed_banned");
                    jSONObject.put("scene", C22704b.f60414c);
                } catch (JSONException unused) {
                }
                AppLog.recordMiscLog(C6399b.m19921a(), "app_perf", jSONObject);
                return null;
            }

            public final Object call() throws Exception {
                C28666j.m94313a(true);
                StringBuilder sb = new StringBuilder("start commit to fetchList,type:");
                sb.append(i5);
                sb.append(",pullType:");
                sb.append(i6);
                sb.append(",aids:");
                sb.append(str5);
                C6921a.m21552a(4, "FeedFetchModel", sb.toString());
                FeedItemList fetchFeedList = ((IFeedApi) ServiceManager.get().getService(IFeedApi.class)).fetchFeedList(i5, j3, j4, i7, num2, str6, i6, C28447b.this.f75000c, str7, str5, str8, C28447b.this.f75001d, null);
                if (!C6319n.m19593a(str6) && fetchFeedList != null) {
                    fetchFeedList.setLocalExtra("aweme_id", str6);
                }
                if (i5 == 0 && fetchFeedList != null && C28275c.f74526b.mo71959j()) {
                    fetchFeedList.appendCache = C28275c.m92989a();
                }
                if (fetchFeedList == null || fetchFeedList.getItems() == null || fetchFeedList.getItems().size() <= 0) {
                    C1592h.m7853a(C28453g.f75037a);
                } else {
                    String str = "FeedFetchModel";
                    try {
                        StringBuilder sb2 = new StringBuilder("end commit to fetchList,type:");
                        sb2.append(i5);
                        sb2.append(",pullType:");
                        sb2.append(i6);
                        sb2.append(",aids:");
                        sb2.append(str5);
                        sb2.append(",listSize:");
                        sb2.append(fetchFeedList.getItems().size());
                        C6921a.m21552a(4, str, sb2.toString());
                    } catch (Throwable th) {
                        if (!C7163a.m22363a()) {
                            C6921a.m21552a(6, "FeedFetchModel", "end commit to fetchList log error,should never happen!");
                        } else {
                            throw th;
                        }
                    }
                    BusinessComponentServiceUtils.getLiveStateManager().mo83746a(fetchFeedList.getItems());
                }
                if (!(fetchFeedList == null || fetchFeedList.getItems() == null)) {
                    for (int i = 0; i < fetchFeedList.getItems().size(); i++) {
                        C21719b.m72643a().put(((Aweme) fetchFeedList.getItems().get(i)).getAid(), Integer.valueOf(i));
                    }
                }
                return fetchFeedList;
            }
        };
        if (!TextUtils.isEmpty(str2) || !TextUtils.isEmpty(str4) || !TextUtils.isEmpty(str)) {
            i4 = i;
            z = false;
        } else {
            i4 = i;
            z = true;
        }
        C28434i.m93456a(i4, fVar, r14, 0, z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo72179a(int i, Lock lock) throws Exception {
        FeedItemList f = C28275c.m93001f();
        if (f == null || C6307b.m19566a((Collection<T>) f.getItems())) {
            return null;
        }
        C28434i.m93458a(f, i);
        Message obtainMessage = this.mHandler.obtainMessage(0);
        obtainMessage.obj = f;
        Bundle bundle = new Bundle();
        bundle.putBoolean("is_from_feed_cache", true);
        obtainMessage.setData(bundle);
        m93523e();
        C28274b.m92984b(lock);
        this.mHandler.sendMessageAtFrontOfQueue(obtainMessage);
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void handleData(FeedItemList feedItemList) {
        this.mIsNewDataEmpty = feedItemList == null || C6307b.m19566a((Collection<T>) feedItemList.getItems());
        m93517c(feedItemList);
        this.mListQueryType = m93495a((FeedItemList) this.mData, feedItemList, this.f75004g, this.mListQueryType);
        if (!this.mIsNewDataEmpty) {
            if (this.f74998a && this.mListQueryType == 2 && feedItemList.isRefreshClear() && !isDataEmpty()) {
                ((FeedItemList) this.mData).getItems().clear();
            }
            C6903bc.m21461B();
            String str = "";
            try {
                str = C30199h.m98861a().getAddictionSettings().getAwemeId();
            } catch (NullValueException unused) {
            }
            C28355a.m93172a(str);
            if (this.mListQueryType != 1) {
                m93503a(feedItemList, str);
            }
            if (!(feedItemList.extra == null || feedItemList.extra.fatalItemIds == null || feedItemList.extra.fatalItemIds.isEmpty())) {
                for (String a : feedItemList.extra.fatalItemIds) {
                    m93504a(a);
                }
            }
            if (C28355a.m93175b() && this.f75004g == 0) {
                List<Aweme> a2 = C28355a.f74704a.mo72024a(feedItemList);
                if (this.mListQueryType != 1 || !a2.isEmpty()) {
                    feedItemList.items = a2;
                }
                m93506a(C28355a.m93170a(), feedItemList.getRequestId());
            }
            m93512b(feedItemList);
            int i = this.mListQueryType;
            if (i != 4) {
                switch (i) {
                    case 1:
                        this.mData = feedItemList;
                        this.f75007j = new ArrayList();
                        if (!C6307b.m19566a((Collection<T>) feedItemList.poiRankCardStructs)) {
                            for (PoiRankCardStruct add : feedItemList.poiRankCardStructs) {
                                this.f75007j.add(add);
                            }
                        }
                        this.f75008k = feedItemList.poiOpCardStructs;
                        m93525f();
                        break;
                    case 2:
                        feedItemList.getItems().addAll(getItems());
                        ((FeedItemList) this.mData).items = feedItemList.getItems();
                        break;
                }
            } else {
                if (this.mData != null) {
                    ((FeedItemList) this.mData).getItems().addAll(feedItemList.getItems());
                    ((FeedItemList) this.mData).hasMore &= feedItemList.hasMore;
                } else if (!C7163a.m22363a()) {
                    StringBuilder sb = new StringBuilder("data error:");
                    sb.append(Log.getStackTraceString(new Throwable()));
                    C6921a.m21552a(6, "FeedFetchModel", sb.toString());
                    this.mData = feedItemList;
                } else {
                    throw new NullPointerException("data is null so there shouldn't be load more");
                }
                m93525f();
            }
            ((FeedItemList) this.mData).cursor = feedItemList.cursor;
            if (((FeedItemList) this.mData).maxCursor != 0) {
                ((FeedItemList) this.mData).maxCursor = Math.min(((FeedItemList) this.mData).maxCursor, feedItemList.maxCursor);
            }
            if (((FeedItemList) this.mData).minCursor != 0) {
                ((FeedItemList) this.mData).minCursor = Math.max(((FeedItemList) this.mData).minCursor, feedItemList.minCursor);
            }
            for (int i2 = 0; i2 < ((FeedItemList) this.mData).getItems().size(); i2++) {
                ((Aweme) ((FeedItemList) this.mData).getItems().get(i2)).setAwemePosition(i2);
            }
            m93505a(feedItemList.getItems());
        } else {
            if (this.mListQueryType == 1) {
                this.mData = null;
            }
            if (!(this.mData == null || this.mListQueryType == 2)) {
                ((FeedItemList) this.mData).hasMore = 0;
            }
        }
        m93524e(feedItemList);
    }

    /* renamed from: a */
    private static void m93505a(List<Aweme> list) {
        int i;
        try {
            i = C30199h.m98861a().getStatisticsBackupPct().intValue();
        } catch (NullValueException e) {
            C6921a.m21559a((Throwable) e);
            i = 0;
        }
        StringBuilder sb = new StringBuilder("FeedFetchModel start to check statisticsInfo, delay:");
        sb.append(i);
        C6921a.m21552a(4, "FeedBackupHelper", sb.toString());
        C1592h.m7848a((long) i).mo6876a((C1591g<TResult, TContinuationResult>) new C28452f<TResult,TContinuationResult>(list), (Executor) C1592h.f5957a);
    }

    /* renamed from: a */
    private static boolean m93508a(boolean z, Message message) {
        return z && m93520d(message);
    }

    /* renamed from: a */
    private void m93504a(String str) {
        if (this.mData != null && ((FeedItemList) this.mData).getItems() != null && !((FeedItemList) this.mData).getItems().isEmpty()) {
            Iterator it = ((FeedItemList) this.mData).getItems().iterator();
            while (it.hasNext()) {
                Aweme aweme = (Aweme) it.next();
                if (!TextUtils.isEmpty(aweme.getAid()) && aweme.getAid().equals(str)) {
                    it.remove();
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private void m93506a(List<String> list, String str) {
        if (!C6307b.m19566a((Collection<T>) list)) {
            C6877n.m21407a("service_monitor", "aweme_delete_duplicated_items", C6869c.m21381a().mo16887a("request_id", str).mo16887a("user_id", C6861a.m21337f().getCurUserId()).mo16885a("list_count", Integer.valueOf(list.size())).mo16887a("item_ids_str", m93509b(list, ",")).mo16887a("page_type", "homepage_hot").mo16888b());
        }
    }

    /* renamed from: a */
    private static boolean m93507a(Aweme aweme) {
        if (!aweme.isAd()) {
            return true;
        }
        return aweme.getAwemeRawAd().isEnableFilterSameVideo();
    }

    public C28447b() {
        this.f75003f = true;
    }

    /* renamed from: c */
    private void m93515c() {
        C23397p.m76735a().mo60807a(this.mHandler, new C28449c(this), 0);
    }

    /* renamed from: d */
    private static void m93519d() {
        C42961az.m136380a(new C33091h());
    }

    public List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FeedItemList) this.mData).getItems();
    }

    /* renamed from: f */
    private void m93525f() {
        if (C6399b.m19945u() && this.f75004g == 0) {
            BusinessComponentServiceUtils.getFeedRecommendUserManager().mo93611a((FeedItemList) this.mData);
        }
    }

    public boolean isHasMore() {
        if (this.mData == null || !((FeedItemList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    private static void m93523e() {
        int a = C6384b.m19835a().mo15287a(FeedLoadCacheV3DelayExperiment.class, true, "feed_load_cache_delay", C6384b.m19835a().mo15295d().feed_load_cache_delay, 0);
        if (a > 0) {
            try {
                Thread.sleep((long) (a * 1000));
            } catch (InterruptedException unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ Object mo72183b() throws Exception {
        if (getItems() != null && this.f75002e.f75575a + 1 < getItems().size()) {
            getItems().subList(0, this.f75002e.f75575a + 1).clear();
            this.f75002e.f75575a = 0;
        }
        Thread.sleep(C28344a.m93115f());
        return this.mData;
    }

    public C28447b(int i) {
        this(i, 0);
    }

    /* renamed from: a */
    private void m93498a(int i) {
        if (i == 0) {
            this.f75003f = false;
        }
    }

    /* renamed from: b */
    private void m93511b(Message message) {
        if (!m93520d(message)) {
            this.f75003f = true;
        }
    }

    public void setItems(List<Aweme> list) {
        if (this.mData != null) {
            ((FeedItemList) this.mData).items = list;
        }
    }

    /* renamed from: a */
    private static Integer m93496a(Object[] objArr) {
        if (objArr.length < 4 || !(objArr[3] instanceof Integer)) {
            return null;
        }
        return objArr[3];
    }

    /* renamed from: b */
    private static String m93510b(Object[] objArr) {
        if (objArr.length < 4 || !(objArr[3] instanceof String)) {
            return null;
        }
        return objArr[3];
    }

    /* renamed from: c */
    private static String m93514c(Object[] objArr) {
        if (objArr.length < 6 || !(objArr[4] instanceof String)) {
            return null;
        }
        return objArr[4];
    }

    /* renamed from: d */
    private static String m93518d(Object[] objArr) {
        if (objArr.length < 6 || !(objArr[5] instanceof String)) {
            return null;
        }
        return objArr[5];
    }

    /* renamed from: e */
    private static Lock m93522e(Object[] objArr) {
        if (objArr.length < 7 || !(objArr[6] instanceof Lock)) {
            return null;
        }
        return objArr[6];
    }

    public boolean checkParams(Object... objArr) {
        if (objArr == null || (objArr.length != 3 && objArr.length != 4 && objArr.length != 5 && objArr.length != 6 && objArr.length != 7)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static void m93516c(Message message) {
        if (m93520d(message)) {
            C6857a.m21312e().mo16829c();
        }
    }

    /* renamed from: d */
    private static boolean m93520d(Message message) {
        if (message == null || message.getData() == null || !message.getData().getBoolean("is_from_feed_cache")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public boolean deleteItem(Aweme aweme) {
        return C28482e.m93607a(getItems(), aweme, this.mNotifyListeners);
    }

    /* renamed from: c */
    private void m93517c(FeedItemList feedItemList) {
        if (m93521d(this.f74999b) || m93521d(feedItemList) || !feedItemList.isForceAppend()) {
            this.f74999b = feedItemList;
        } else {
            this.f74999b.setNetworkInfoKey(feedItemList.getNetworkInfoKey());
        }
    }

    /* renamed from: d */
    private static boolean m93521d(FeedItemList feedItemList) {
        if (feedItemList == null || feedItemList.getItems() == null) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m93524e(FeedItemList feedItemList) {
        boolean z;
        if (feedItemList != null) {
            List items = feedItemList.getItems();
            if (items != null && !items.isEmpty()) {
                ListIterator listIterator = items.listIterator();
                try {
                    z = C30199h.m98861a().getDiscardRefreshTopDsp().booleanValue();
                } catch (NullValueException unused) {
                    z = true;
                }
                C25264bc l = C24671f.m80862l();
                int i = 0;
                while (listIterator.hasNext()) {
                    Aweme aweme = (Aweme) listIterator.next();
                    if (aweme == null) {
                        listIterator.remove();
                    } else {
                        if (l.mo65866a(aweme) || l.mo65867b(aweme)) {
                            if (this.mListQueryType != 1 || i >= 3 || !C25300bx.m83125a(aweme, 3)) {
                                l.mo65865a(aweme, C1592h.f5957a, null, false);
                            } else if (z) {
                                listIterator.remove();
                            } else {
                                l.mo65865a(aweme, null, null, true);
                                if (C25300bx.m83127a(aweme, false)) {
                                    listIterator.remove();
                                }
                            }
                        }
                        i++;
                    }
                }
            }
        }
    }

    public void handleMsg(Message message) {
        if (!m93508a(this.f75009l, message)) {
            if (this.f75004g == 0 && (message.obj instanceof FeedItemList) && ((FeedItemList) message.obj).status_code == 13315) {
                resetLoadingStatus(message);
                if (this.mNotifyListeners != null) {
                    for (C25678f a : this.mNotifyListeners) {
                        a.mo57296a(new ApiServerException(13315));
                    }
                }
            } else {
                m93501a(message);
                m93511b(message);
                m93516c(message);
                super.handleMsg(message);
            }
        }
    }

    public void loadLatestList(Object... objArr) {
        long j;
        Object[] objArr2 = objArr;
        this.f75004g = ((Integer) objArr2[1]).intValue();
        this.f75005h = ((Integer) objArr2[2]).intValue();
        if (objArr2.length < 5 || !(objArr2[4] instanceof String)) {
            this.f75006i = "";
        } else {
            this.f75006i = (String) objArr2[4];
        }
        int i = this.f75004g;
        if (C6307b.m19566a((Collection<T>) getItems())) {
            j = 0;
        } else {
            j = -1;
        }
        m93499a(i, j, ((FeedItemList) this.mData).minCursor, this.mCount, m93496a(objArr), null, this.f75005h, this.f75006i, null, null, null);
        m93519d();
    }

    /* renamed from: b */
    private static void m93512b(FeedItemList feedItemList) {
        if (feedItemList != null && !C6307b.m19566a((Collection<T>) feedItemList.getItems())) {
            Iterator it = feedItemList.getItems().iterator();
            while (it.hasNext()) {
                Aweme aweme = (Aweme) it.next();
                if (aweme != null && aweme.isLive()) {
                    if (C6384b.m19835a().mo15287a(FeedRecommendLiveDisplayTypeExperiment.class, true, "full_recommend_live_display_type", C6384b.m19835a().mo15295d().full_recommend_live_display_type, 0) == 0) {
                        it.remove();
                    } else if (aweme.getRoomFeedCellStruct() == null || aweme.getRoomFeedCellStruct().room == null || aweme.getRoomFeedCellStruct().room.owner == null || TextUtils.isEmpty(aweme.getRoomFeedCellStruct().room.owner.getUid()) || TextUtils.isEmpty(aweme.getRoomFeedCellStruct().room.owner.getSecUid())) {
                        it.remove();
                    } else {
                        User user = aweme.getRoomFeedCellStruct().room.owner;
                        User user2 = new User();
                        user2.setUid(user.getUid());
                        user2.setSecUid(user.getSecUid());
                        user2.setNickname(user.getNickname());
                        user2.setShortId(user.getShortId());
                        user2.setUniqueId(user.getUniqueId());
                        user2.setSignature(user.getSignature());
                        user2.setAvatarThumb(user.getAvatarThumb());
                        user2.setAvatarLarger(user.getAvatarLarger());
                        user2.setAvatarMedium(user.getAvatarMedium());
                        aweme.setAuthor(user2);
                    }
                }
            }
        }
    }

    public void loadMoreList(Object... objArr) {
        long j;
        Object[] objArr2 = objArr;
        if (this.mData != null) {
            this.f75001d = ((FeedItemList) this.mData).cursor;
        }
        this.f75004g = ((Integer) objArr2[1]).intValue();
        this.f75005h = ((Integer) objArr2[2]).intValue();
        if (objArr2.length < 5 || !(objArr2[4] instanceof String)) {
            this.f75006i = "";
        } else {
            this.f75006i = (String) objArr2[4];
        }
        StringBuilder sb = new StringBuilder("loadMoreList call,type:");
        sb.append(this.f75004g);
        sb.append(",pullType:");
        sb.append(this.f75005h);
        sb.append(",countryCode:");
        sb.append(this.f75006i);
        C6921a.m21552a(4, "FeedFetchModel", sb.toString());
        int i = this.f75004g;
        if (C6307b.m19566a((Collection<T>) getItems())) {
            j = 0;
        } else {
            j = ((FeedItemList) this.mData).maxCursor;
        }
        m93499a(i, j, -1, this.mCount, m93496a(objArr), null, this.f75005h, this.f75006i, null, null, null);
    }

    public void refreshList(Object... objArr) {
        String str;
        Object[] objArr2 = objArr;
        this.f75001d = 0;
        this.f75004g = ((Integer) objArr2[1]).intValue();
        this.f75005h = ((Integer) objArr2[2]).intValue();
        m93498a(this.f75004g);
        if (objArr2.length < 5 || !(objArr2[4] instanceof String)) {
            this.f75006i = "";
        } else {
            this.f75006i = (String) objArr2[4];
        }
        Boolean valueOf = Boolean.valueOf(false);
        if (objArr2.length >= 4 && (objArr2[3] instanceof Boolean)) {
            valueOf = (Boolean) objArr2[3];
        }
        if (valueOf.booleanValue()) {
            m93515c();
        } else {
            String c = m93514c(objArr);
            if (TextUtils.isEmpty(c)) {
                str = m93518d(objArr);
            } else {
                str = null;
            }
            String str2 = str;
            m93499a(this.f75004g, 0, 0, this.mCount, m93496a(objArr), m93510b(objArr), this.f75005h, this.f75006i, c, str2, m93522e(objArr));
        }
        if (this.f75004g != 11) {
            m93519d();
        }
    }

    /* renamed from: a */
    private void m93501a(Message message) {
        if (message != null && message.what == 0) {
            this.f75009l = true;
        }
    }

    public C28447b(int i, int i2) {
        this.f75003f = true;
        this.mCount = i;
        this.f75000c = 0;
    }

    /* renamed from: b */
    private static String m93509b(List<String> list, String str) {
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
    private void m93502a(Aweme aweme, Aweme aweme2) {
        int i;
        if (aweme2 != null && TextUtils.equals(aweme.getAid(), aweme2.getAid())) {
            int i2 = 2;
            if (aweme.isAd()) {
                C24718al a = C24671f.m80851a();
                Context a2 = C6399b.m19921a();
                if (aweme2.isAd()) {
                    i = 1;
                } else {
                    i = 2;
                }
                a.mo64657a(a2, aweme, i);
            }
            if (m93507a(aweme)) {
                if (C25329c.m83200B(aweme)) {
                    C24671f.m80851a().mo64660a(C6399b.m19921a(), aweme, C24671f.m80857g().mo65549a("8", (String) null));
                }
                String str = "vv_failed";
                C22984d a3 = C22984d.m75611a();
                String str2 = "failed_reason";
                if (aweme2.isAd()) {
                    i2 = 1;
                }
                C6907h.m21524a(str, (Map) a3.mo59970a(str2, i2).mo59973a("group_id", aweme2.getAid()).f60753a);
            }
        }
    }

    /* renamed from: a */
    private void m93503a(FeedItemList feedItemList, String str) {
        Iterator it = feedItemList.getItems().iterator();
        ArrayList arrayList = new ArrayList();
        while (it.hasNext()) {
            Aweme aweme = (Aweme) it.next();
            if (!TextUtils.equals(aweme.getAid(), str) && !isDataEmpty() && C28482e.m93604a(((FeedItemList) this.mData).getItems(), aweme) >= 0) {
                m93502a(aweme, (Aweme) ((FeedItemList) this.mData).getItems().get(C28482e.m93608b(((FeedItemList) this.mData).getItems(), aweme)));
                if (m93507a(aweme)) {
                    it.remove();
                    arrayList.add(aweme.getAid());
                }
            }
        }
        if (arrayList.size() > 0) {
            int i = this.f75004g;
            if (i == 0) {
                C6907h.onEvent(MobClick.obtain().setEventName("client_impr_dup").setLabelName("homepage_hot").setValue(String.valueOf(arrayList.size())));
                m93506a((List<String>) arrayList, feedItemList.getRequestId());
            } else if (i == 2) {
                C6907h.onEvent(MobClick.obtain().setEventName("client_impr_dup").setLabelName("homepage_fresh").setValue(String.valueOf(arrayList.size())));
            }
        }
    }

    /* renamed from: a */
    private static int m93495a(FeedItemList feedItemList, FeedItemList feedItemList2, int i, int i2) {
        if (i != 0) {
            return i2;
        }
        boolean z = false;
        if (feedItemList2 != null && feedItemList2.isForceAppend()) {
            z = true;
            feedItemList2.resetForceAppend();
        }
        if (m93521d(feedItemList) || m93521d(feedItemList2) || !z) {
            return i2;
        }
        return 4;
    }

    /* renamed from: a */
    private void m93500a(int i, String str, int i2, String str2, Lock lock) {
        if (i == 0 && i2 == 0 && C28275c.f74526b.mo71959j() && TextUtils.isEmpty(str) && TextUtils.isEmpty(str2) && !f74997m) {
            f74997m = true;
            C28274b.m92983a(lock);
            C1592h.m7855a((Callable<TResult>) new C28451e<TResult>(this, i, lock), (Executor) C7258h.m22730c());
        }
    }

    /* renamed from: a */
    private void m93499a(int i, long j, long j2, int i2, Integer num, String str, int i3, String str2, String str3, String str4, Lock lock) {
        StringBuilder sb = new StringBuilder("start to fetchList,type:");
        sb.append(i);
        sb.append(",pullType:");
        sb.append(i3);
        sb.append(",aids:");
        sb.append(str3);
        C6921a.m21552a(4, "FeedFetchModel", sb.toString());
        int i4 = i3;
        String str5 = str3;
        m93500a(i, str, i4, str5, lock);
        C28450d dVar = new C28450d(this, i, i4, str5, j, j2, i2, num, str, str2, str4);
        dVar.run();
    }
}
