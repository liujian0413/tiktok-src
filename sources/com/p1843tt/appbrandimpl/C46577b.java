package com.p1843tt.appbrandimpl;

import android.text.TextUtils;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.commercialize.api.GameStationApi;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.tt.appbrandimpl.b */
public final class C46577b extends C25673a<Aweme, FeedItemList> {

    /* renamed from: a */
    private int f120055a;

    /* renamed from: b */
    private int f120056b;

    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((FeedItemList) this.mData).getItems();
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((FeedItemList) this.mData).isHasMore()) {
            return false;
        }
        return true;
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 5) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        m146378a((String) objArr[1], (String) objArr[2], 10, ((FeedItemList) this.mData).cursor);
    }

    public final void refreshList(Object... objArr) {
        m146378a((String) objArr[1], (String) objArr[2], 10, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(FeedItemList feedItemList) {
        boolean z;
        boolean z2;
        int i;
        Aweme aweme;
        if (feedItemList == null || feedItemList.fetchType != 0) {
            z = false;
        } else {
            z = true;
        }
        if (feedItemList == null || C6307b.m19566a((Collection<T>) feedItemList.getItems())) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            int size = feedItemList.getItems().size();
            for (int i2 = 0; i2 < size; i2++) {
                Aweme aweme2 = (Aweme) feedItemList.getItems().get(i2);
                if (aweme2 == null) {
                    i = -1;
                } else {
                    i = aweme2.getIsTop();
                }
                if (aweme2 == null || (!aweme2.isSelfSee() && !aweme2.isProhibited())) {
                    aweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme(aweme2);
                } else {
                    aweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateProfileSelfSeeAweme(aweme2, this.f120055a);
                }
                if (z && i >= 0) {
                    aweme.setIsTop(i);
                }
                IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                StringBuilder sb = new StringBuilder();
                sb.append(aweme.getAid());
                sb.append(this.f120056b + this.f120055a);
                iRequestIdService.setRequestIdAndIndex(sb.toString(), feedItemList.getRequestId(), i2);
                feedItemList.getItems().set(i2, aweme);
            }
            int i3 = this.mListQueryType;
            if (i3 == 1) {
                this.mData = feedItemList;
                return;
            } else if (i3 == 4) {
                if (this.mData != null) {
                    if (C6307b.m19566a((Collection<T>) ((FeedItemList) this.mData).getItems())) {
                        ((FeedItemList) this.mData).items = feedItemList.getItems();
                    } else {
                        ((FeedItemList) this.mData).getItems().addAll(m146376a(feedItemList.getItems(), ((FeedItemList) this.mData).getItems()));
                    }
                    ((FeedItemList) this.mData).maxCursor = feedItemList.maxCursor;
                    ((FeedItemList) this.mData).hasMore = feedItemList.hasMore & ((FeedItemList) this.mData).hasMore;
                    ((FeedItemList) this.mData).cursor = feedItemList.cursor;
                    return;
                }
            } else {
                return;
            }
        } else if (this.mData != null) {
            if (feedItemList != null) {
                ((FeedItemList) this.mData).hasMore = feedItemList.hasMore;
                ((FeedItemList) this.mData).maxCursor = feedItemList.maxCursor;
                ((FeedItemList) this.mData).cursor = feedItemList.cursor;
                return;
            }
            ((FeedItemList) this.mData).hasMore = 0;
            return;
        } else if (feedItemList == null) {
            this.mData = new FeedItemList();
            ((FeedItemList) this.mData).hasMore = 0;
            return;
        }
        this.mData = feedItemList;
    }

    /* renamed from: a */
    private static List<Aweme> m146376a(List<Aweme> list, List<Aweme> list2) {
        if (list == null || list2 == null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (Aweme aweme : list) {
            arrayList.add(aweme);
            Iterator it = list2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                if (TextUtils.equals(aweme.getAid(), ((Aweme) it.next()).getAid())) {
                    arrayList.remove(aweme);
                    break;
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m146378a(String str, String str2, int i, long j) {
        C23397p a = C23397p.m76735a();
        C6309f fVar = this.mHandler;
        final String str3 = str;
        final String str4 = str2;
        final long j2 = j;
        C465781 r1 = new Callable(10) {
            public final Object call() throws Exception {
                return GameStationApi.m80563a(str3, str4, (long) 10, j2);
            }
        };
        a.mo60807a(fVar, r1, 0);
    }
}
