package com.bytedance.android.livesdk.feed.viewmodel;

import android.arch.lifecycle.C0052o;
import com.bytedance.android.live.base.model.feed.C2344a;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.rxutils.RxViewModel;
import com.bytedance.android.livesdk.feed.IFeedRepository;
import com.bytedance.android.livesdk.feed.feed.C5986c;
import com.bytedance.android.livesdk.feed.feed.C5988e;
import com.bytedance.android.livesdk.feed.feed.C5989f;
import com.bytedance.android.livesdk.feed.setting.LiveFeedSettings;
import com.bytedance.common.utility.C6311g;
import com.p280ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class LiveFeedViewModel extends RxViewModel {

    /* renamed from: a */
    public final C0052o<Integer> f21089a = new C0052o<>();

    /* renamed from: b */
    private final IFeedRepository f21090b;

    /* renamed from: c */
    private final List<C5989f> f21091c;

    /* renamed from: d */
    private C5988e f21092d;

    /* renamed from: e */
    private boolean f21093e = false;

    /* renamed from: a */
    public final void mo20504a() {
        if (this.f21092d == null) {
            this.f21092d = new C7828w(this);
            this.f21090b.mo14502e().mo14613a(this.f21092d);
        }
    }

    public void onCleared() {
        this.f21090b.mo14502e().mo14616b(this.f21092d);
        this.f21092d = null;
        super.onCleared();
    }

    public LiveFeedViewModel(IFeedRepository iFeedRepository, List<C5989f> list) {
        this.f21090b = iFeedRepository;
        this.f21091c = list;
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public void mo20505a(String str, List<FeedItem> list, C2344a aVar, boolean z) {
        int i;
        if (!C6311g.m19573a(list) && aVar != null && z) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                FeedItem feedItem = (FeedItem) it.next();
                if (feedItem.type == 1001 || feedItem.type == 1002 || feedItem.type == 1003) {
                    it.remove();
                }
            }
            int size = list.size();
            if (((Integer) LiveFeedSettings.FEED_LIVE_BANNER_POSITION.mo10240a()).intValue() == 0 && aVar.f7701h != null && C6311g.m19574b(aVar.f7701h.f7676a)) {
                FeedItem feedItem2 = new FeedItem();
                feedItem2.type = 1001;
                feedItem2.banners = aVar.f7701h.f7676a;
                if (list.size() <= 0 || ((FeedItem) list.get(0)).type != 1004) {
                    i = 0;
                } else {
                    i = 1;
                }
                list.add(i, feedItem2);
            }
            ArrayList arrayList = new ArrayList();
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                FeedItem feedItem3 = (FeedItem) it2.next();
                if (feedItem3.type == 2) {
                    arrayList.add(feedItem3);
                    it2.remove();
                }
            }
            if (!C6311g.m19573a(arrayList) && !this.f21093e) {
                C5986c cVar = new C5986c(arrayList);
                cVar.type = LiveRoomStruct.ROOM_LONGTIME_NO_NET;
                cVar.resId = "";
                cVar.item = null;
                list.add(0, cVar);
            }
            if (((Integer) LiveFeedSettings.FEED_LIVE_BANNER_POSITION.mo10240a()).intValue() == 1 && aVar.f7701h != null && aVar.f7701h.f7676a != null && aVar.f7701h.f7676a.size() > 0) {
                FeedItem feedItem4 = new FeedItem();
                feedItem4.type = 1001;
                feedItem4.banners = aVar.f7701h.f7676a;
                if (size % 2 == 0) {
                    list.add(feedItem4);
                    return;
                }
                list.add(list.size() - 1, feedItem4);
            }
        }
    }
}
