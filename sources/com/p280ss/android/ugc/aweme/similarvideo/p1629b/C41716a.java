package com.p280ss.android.ugc.aweme.similarvideo.p1629b;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.similarvideo.api.SimilarVideoSearchApi;
import com.p280ss.android.ugc.aweme.similarvideo.p1628a.C41715b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.similarvideo.b.a */
public final class C41716a extends C25673a<Aweme, C41715b> {

    /* renamed from: a */
    public String f108590a;

    /* renamed from: b */
    private String f108591b;

    /* renamed from: c */
    private ArrayList<Integer> f108592c = new ArrayList<>();

    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C41715b) this.mData).f108586c;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((C41715b) this.mData).f108585b) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        if (objArr.length == 1) {
            m132832a(this.f108591b, 0, 10);
        } else {
            m132832a(objArr[1], 0, 10);
        }
    }

    public final void loadMoreList(Object... objArr) {
        int i = 0;
        if (objArr.length == 1) {
            String str = this.f108591b;
            if (!isDataEmpty()) {
                i = ((C41715b) this.mData).f108584a;
            }
            m132832a(str, i, 10);
            return;
        }
        String str2 = objArr[1];
        if (!isDataEmpty()) {
            i = ((C41715b) this.mData).f108584a;
        }
        m132832a(str2, i, 10);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C41715b bVar) {
        boolean z;
        int i;
        boolean z2 = false;
        if (bVar == null || C6307b.m19566a((Collection<T>) bVar.f108586c)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (this.mListQueryType == 1) {
                this.f108590a = bVar.getRequestId();
                C28199ae.m92689a().mo71792a(bVar.getRequestId(), bVar.f108587d);
            }
            this.f108592c.clear();
            ArrayList<Aweme> arrayList = bVar.f108586c;
            int size = arrayList.size();
            for (int i2 = 0; i2 < size; i2++) {
                Aweme updateAweme = ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).updateAweme((Aweme) bVar.f108586c.get(i2));
                if (this.mData == null || ((C41715b) this.mData).f108586c == null) {
                    i = 0;
                } else {
                    i = ((C41715b) this.mData).f108586c.size();
                }
                updateAweme.setRequestId(this.f108590a);
                IRequestIdService iRequestIdService = (IRequestIdService) ServiceManager.get().getService(IRequestIdService.class);
                StringBuilder sb = new StringBuilder();
                sb.append(updateAweme.getAid());
                sb.append(16);
                iRequestIdService.setRequestIdAndIndex(sb.toString(), this.f108590a, i + i2);
                arrayList.set(i2, updateAweme);
                if (!(this.mListQueryType == 1 || this.mData == null || !m132833a(((C41715b) this.mData).f108586c, updateAweme))) {
                    this.f108592c.add(Integer.valueOf(i2));
                }
            }
            if (this.f108592c.size() != 0) {
                for (int size2 = this.f108592c.size() - 1; size2 >= 0; size2--) {
                    if (arrayList.size() > ((Integer) this.f108592c.get(size2)).intValue()) {
                        arrayList.remove(((Integer) this.f108592c.get(size2)).intValue());
                    }
                }
            }
            int i3 = this.mListQueryType;
            if (i3 != 1) {
                if (i3 == 4) {
                    ((C41715b) this.mData).f108586c.addAll(arrayList);
                    C41715b bVar2 = (C41715b) this.mData;
                    if (bVar.f108585b && ((C41715b) this.mData).f108585b) {
                        z2 = true;
                    }
                    bVar2.f108585b = z2;
                    ((C41715b) this.mData).f108584a = bVar.f108584a;
                }
                return;
            }
            this.mData = bVar;
            ((C41715b) this.mData).f108586c = arrayList;
        } else {
            if (this.mListQueryType == 1) {
                this.mData = bVar;
            }
            if (this.mData != null) {
                ((C41715b) this.mData).f108585b = false;
            }
        }
    }

    /* renamed from: a */
    private static boolean m132833a(Collection<Aweme> collection, Aweme aweme) {
        if (aweme == null || aweme.getAid() == null || collection == null || collection.isEmpty()) {
            return false;
        }
        String aid = aweme.getAid();
        for (Aweme aweme2 : collection) {
            if (aweme2 != null && aid.equals(aweme2.getAid())) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private void m132832a(final String str, final int i, int i2) {
        this.f108591b = str;
        C23397p.m76735a().mo60807a(this.mHandler, new Callable(10) {
            public final Object call() throws Exception {
                return SimilarVideoSearchApi.m132830a(str, (long) i, 10);
            }
        }, 0);
    }
}
