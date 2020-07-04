package com.p280ss.android.ugc.aweme.feed.p1233i;

import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.FeedItemList;
import java.util.Collection;

/* renamed from: com.ss.android.ugc.aweme.feed.i.n */
public final class C28461n extends C28447b {

    /* renamed from: g */
    private boolean f75059g = true;

    /* renamed from: a */
    public final boolean mo72182a() {
        return this.f75059g;
    }

    public C28461n(int i) {
        super(6);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void handleData(FeedItemList feedItemList) {
        boolean z = true;
        if (feedItemList == null || C6307b.m19566a((Collection<T>) feedItemList.getItems()) || isDataEmpty()) {
            this.f75059g = true;
        } else {
            Aweme aweme = (Aweme) ((FeedItemList) this.mData).getItems().get(0);
            Aweme aweme2 = (Aweme) feedItemList.getItems().get(0);
            if (!(aweme == null || aweme2 == null || !C6319n.m19594a(aweme.getAid(), aweme2.getAid()))) {
                z = false;
            }
            this.f75059g = z;
        }
        super.handleData(feedItemList);
    }
}
