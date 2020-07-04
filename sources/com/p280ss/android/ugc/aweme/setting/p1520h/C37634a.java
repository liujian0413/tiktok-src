package com.p280ss.android.ugc.aweme.setting.p1520h;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.setting.api.BlackApiManager;
import com.p280ss.android.ugc.aweme.setting.model.BlackList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.setting.h.a */
public final class C37634a extends C25673a<User, BlackList> {

    /* renamed from: a */
    public int f98108a;

    /* renamed from: b */
    private int f98109b;

    public C37634a() {
        this(0);
    }

    public final List<User> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((BlackList) this.mData).blockList;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((BlackList) this.mData).hasMore) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        m120444a(this.f98109b);
    }

    public final void refreshList(Object... objArr) {
        m120444a(0);
    }

    private C37634a(int i) {
        this.f98108a = 0;
    }

    /* renamed from: a */
    private void m120444a(final int i) {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return BlackApiManager.m120338a(i, 10, C37634a.this.f98108a);
            }
        }, 0);
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(BlackList blackList) {
        boolean z;
        if (blackList == null || C6307b.m19566a((Collection<T>) blackList.blockList)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        int i = this.mListQueryType;
        if (i == 1) {
            this.mData = blackList;
            if (!this.mIsNewDataEmpty) {
                this.f98109b = blackList.index;
            }
        } else if (i == 4) {
            if (!this.mIsNewDataEmpty) {
                ((BlackList) this.mData).blockList.addAll(blackList.blockList);
                ((BlackList) this.mData).hasMore = blackList.hasMore;
                this.f98109b = blackList.index;
                return;
            }
            ((BlackList) this.mData).hasMore = false;
        }
    }
}
