package com.p280ss.android.ugc.aweme.favorites.model;

import com.bytedance.common.utility.collection.C6307b;
import com.google.common.base.C17440n;
import com.google.common.collect.C18054w;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.favorites.p1210a.C27708k;
import com.p280ss.android.ugc.aweme.sticker.model.NewFaceStickerBean;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.favorites.model.e */
public final class C27767e extends C25673a<NewFaceStickerBean, C27708k> {
    public final boolean checkParams(Object... objArr) {
        return true;
    }

    public final List<NewFaceStickerBean> getItems() {
        if (this.mData == null) {
            return null;
        }
        return ((C27708k) this.mData).f73051a;
    }

    public C27767e() {
        C27708k kVar = new C27708k();
        kVar.f73051a = new ArrayList();
        kVar.mo71167a(false);
        this.mData = kVar;
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((C27708k) this.mData).mo71168a()) {
            return false;
        }
        return true;
    }

    public final void refreshList(Object... objArr) {
        m91027b(0, 12);
    }

    public final void loadMoreList(Object... objArr) {
        m91027b(((C27708k) this.mData).f73052b, 10);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C27708k kVar) {
        boolean z;
        boolean z2 = false;
        if (kVar == null || C6307b.m19566a((Collection<T>) kVar.f73051a)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = kVar;
            } else if (i == 4) {
                if (this.mData == null) {
                    this.mData = kVar;
                    return;
                }
                ((C27708k) this.mData).f73051a.addAll(m91024a(kVar.f73051a, ((C27708k) this.mData).f73051a));
                ((C27708k) this.mData).f73052b = kVar.f73052b;
                C27708k kVar2 = (C27708k) this.mData;
                if (kVar.mo71168a() && ((C27708k) this.mData).mo71168a()) {
                    z2 = true;
                }
                kVar2.mo71167a(z2);
            }
        } else {
            if (this.mData != null) {
                if (this.mListQueryType == 1) {
                    ((C27708k) this.mData).f73051a.clear();
                }
                ((C27708k) this.mData).mo71167a(false);
            }
        }
    }

    /* renamed from: b */
    private void m91027b(int i, int i2) {
        C23397p.m76735a().mo60807a(this.mHandler, new C27768f(i, i2), 0);
    }

    /* renamed from: a */
    private static Collection<NewFaceStickerBean> m91024a(List<NewFaceStickerBean> list, List<NewFaceStickerBean> list2) {
        boolean z;
        if (list2 == null || list2.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        return C18054w.m59709a((Collection<E>) list, (C17440n<? super E>) new C27769g<Object>(z, list2));
    }

    /* renamed from: a */
    static final /* synthetic */ boolean m91026a(boolean z, List list, NewFaceStickerBean newFaceStickerBean) {
        if (z || !list.contains(newFaceStickerBean)) {
            return true;
        }
        return false;
    }
}
