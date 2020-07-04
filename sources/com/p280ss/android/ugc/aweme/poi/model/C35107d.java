package com.p280ss.android.ugc.aweme.poi.model;

import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.common.utility.collection.C6309f;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.poi.api.PoiApi;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.poi.model.d */
public final class C35107d extends C25673a<Aweme, C35106c> {
    public final List<Aweme> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C35106c) this.mData).mo89326a();
    }

    public final boolean isHasMore() {
        if (this.mData == null || ((C35106c) this.mData).f91791b != 1) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public boolean deleteItem(Aweme aweme) {
        return C28482e.m93607a(getItems(), aweme, this.mNotifyListeners);
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 4) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        m113264a(objArr[1], 20, 0, objArr[2].intValue());
    }

    public final void setItems(List<Aweme> list) {
        if (this.mData == null) {
            this.mData = new C35106c();
        }
        ((C35106c) this.mData).f91791b = 1;
        ((C35106c) this.mData).f91790a = list;
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        String str = objArr[1];
        if (isDataEmpty()) {
            i = 0;
        } else {
            i = ((C35106c) this.mData).f91792c;
        }
        m113264a(str, 20, i, objArr[2].intValue());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C35106c cVar) {
        boolean z;
        if (cVar == null || C6307b.m19566a((Collection<T>) cVar.mo89326a())) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            List a = cVar.mo89326a();
            if (!C6307b.m19566a((Collection<T>) a)) {
                int size = a.size();
                for (int i = 0; i < size; i++) {
                    a.set(i, ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme((Aweme) a.get(i)));
                }
            }
            int i2 = this.mListQueryType;
            if (i2 != 1) {
                if (i2 == 4) {
                    ((C35106c) this.mData).mo89326a().addAll(cVar.mo89326a());
                    ((C35106c) this.mData).f91791b &= cVar.f91791b;
                    ((C35106c) this.mData).f91792c = cVar.f91792c;
                }
                return;
            }
            this.mData = cVar;
        } else if (this.mData != null) {
            ((C35106c) this.mData).f91791b = 0;
        }
    }

    /* renamed from: a */
    private void m113264a(String str, int i, int i2, int i3) {
        C23397p a = C23397p.m76735a();
        C6309f fVar = this.mHandler;
        final String str2 = str;
        final int i4 = i2;
        final int i5 = i3;
        C351081 r1 = new Callable<C35106c>(20) {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public C35106c call() throws Exception {
                return PoiApi.m113163a(str2, 20, i4, i5);
            }
        };
        a.mo60807a(fVar, r1, 0);
    }
}
