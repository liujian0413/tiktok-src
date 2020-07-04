package com.p280ss.android.ugc.aweme.favorites.model;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.favorites.api.UserFavoritesApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.a */
public final class C27761a extends C25673a<Challenge, C27763b> {
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List<Challenge> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C27763b) this.mData).f73205a;
    }

    public C27761a() {
        C27763b bVar = new C27763b();
        bVar.f73205a = new ArrayList();
        bVar.mo71256a(true);
        this.mData = bVar;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((C27763b) this.mData).mo71257a()) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        m91016a(0, 12);
    }

    public final void loadMoreList(Object... objArr) {
        m91016a(((C27763b) this.mData).f73206b, 10);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C27763b bVar) {
        boolean z;
        boolean z2 = false;
        if (bVar == null || C6307b.m19566a((Collection<T>) bVar.f73205a)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = bVar;
            } else if (i == 4) {
                if (this.mData == null) {
                    this.mData = bVar;
                    return;
                }
                ((C27763b) this.mData).f73205a.addAll(m91015a(bVar.f73205a, ((C27763b) this.mData).f73205a));
                ((C27763b) this.mData).f73206b = bVar.f73206b;
                C27763b bVar2 = (C27763b) this.mData;
                if (bVar.mo71257a() && ((C27763b) this.mData).mo71257a()) {
                    z2 = true;
                }
                bVar2.mo71256a(z2);
            }
        } else {
            if (this.mData != null) {
                if (this.mListQueryType == 1) {
                    ((C27763b) this.mData).f73205a.clear();
                }
                ((C27763b) this.mData).mo71256a(false);
            }
        }
    }

    /* renamed from: a */
    private void m91016a(final int i, final int i2) {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return UserFavoritesApi.m90940a(i, i2);
            }
        }, 0);
    }

    /* renamed from: a */
    private static List<Challenge> m91015a(List<Challenge> list, List<Challenge> list2) {
        ArrayList arrayList = new ArrayList();
        for (Challenge challenge : list) {
            arrayList.add(challenge);
            for (Challenge cid : list2) {
                if (challenge.getCid().equals(cid.getCid())) {
                    arrayList.remove(challenge);
                }
            }
        }
        return arrayList;
    }
}
