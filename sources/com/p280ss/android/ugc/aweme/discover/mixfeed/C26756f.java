package com.p280ss.android.ugc.aweme.discover.mixfeed;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.deviceregister.p855c.C19319c;
import com.p280ss.android.ugc.aweme.commercialize.model.SearchAdInfo;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26112p;
import com.p280ss.android.ugc.aweme.discover.abtest.SearchMixCardOrderSynthesis;
import com.p280ss.android.ugc.aweme.discover.abtest.SearchMixFilterAladdinCards;
import com.p280ss.android.ugc.aweme.discover.abtest.SearchMixVideoDisplayStyle;
import com.p280ss.android.ugc.aweme.discover.api.SearchApiNew;
import com.p280ss.android.ugc.aweme.discover.base.C26601f;
import com.p280ss.android.ugc.aweme.discover.p1177c.C26612d;
import com.p280ss.android.ugc.aweme.discover.presenter.C26826h;
import com.p280ss.android.ugc.aweme.feed.C28199ae;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.net.C34089j;
import com.p280ss.android.ugc.aweme.search.filter.C37384a;
import com.p280ss.android.ugc.aweme.search.filter.FilterOption;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.mixfeed.f */
public final class C26756f extends C26826h<C26754d, C26755e> implements C26112p {

    /* renamed from: b */
    public String f70557b;

    /* renamed from: c */
    public SearchAdInfo f70558c;

    /* renamed from: h */
    private double f70559h;

    /* renamed from: i */
    private double f70560i;

    /* renamed from: j */
    private int f70561j;

    /* renamed from: k */
    private String f70562k;

    public final int aF_() {
        return 3;
    }

    /* renamed from: a */
    public final List<Aweme> mo57985a() {
        return m87814a(getItems());
    }

    public final boolean isHasMore() {
        if (this.mData == null || !((C26755e) this.mData).f70554c) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    static final /* synthetic */ C26755e m87813a(C1592h hVar) throws Exception {
        if (hVar.mo6887c()) {
            return null;
        }
        if (!hVar.mo6889d()) {
            return (C26755e) hVar.mo6890e();
        }
        throw hVar.mo6891f();
    }

    /* renamed from: a */
    public static List<Aweme> m87814a(List<C26754d> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C26754d dVar : list) {
            if (dVar.getFeedType() == 65280) {
                arrayList.add(dVar.getAweme());
            } else if (!(dVar.getFeedType() != 65466 || dVar.f70538l == null || dVar.f70538l.getAweme() == null)) {
                arrayList.add(dVar.f70538l.getAweme());
            }
        }
        return arrayList;
    }

    public final void loadMoreList(Object... objArr) {
        int i;
        if (C6307b.m19566a((Collection<T>) getItems())) {
            i = 0;
        } else {
            i = ((C26755e) this.mData).f70553b;
        }
        if (objArr.length == 1) {
            m87817a(this.f70557b, i, 10, this.f70791g);
            return;
        }
        m87816a(this.f70557b, i, 10, 0, objArr[3].doubleValue(), objArr[4].doubleValue(), this.f70791g, objArr[5].intValue(), (FilterOption) objArr[6]);
    }

    public final void refreshList(Object... objArr) {
        Object[] objArr2 = objArr;
        C26612d.f70187a.mo68301a();
        if (objArr2.length == 2) {
            m87817a((String) objArr2[1], 0, 10, "");
            return;
        }
        m87816a((String) objArr2[1], 0, 20, ((Integer) objArr2[2]).intValue(), ((Double) objArr2[3]).doubleValue(), ((Double) objArr2[4]).doubleValue(), "", ((Integer) objArr2[5]).intValue(), (FilterOption) objArr2[6]);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C26755e eVar) {
        boolean z;
        super.handleData(eVar);
        if (eVar != null) {
            this.f70558c = eVar.adInfo;
        }
        this.f70790f = eVar.getRequestId();
        if (eVar == null || C6307b.m19566a((Collection<T>) eVar.f70555d)) {
            z = true;
        } else {
            z = false;
        }
        this.mIsNewDataEmpty = z;
        if (!this.mIsNewDataEmpty) {
            if (this.mListQueryType == 1) {
                this.f70562k = C28199ae.m92689a().mo71790a(eVar.logPb);
            }
            C26601f.f70159a.mo68289a(eVar);
            for (C26754d dVar : eVar.f70555d) {
                if (dVar.getFeedType() == 65460) {
                    dVar.mo68494a(this.f70562k);
                }
            }
            if (this.mListQueryType != 1) {
                Iterator it = eVar.f70555d.iterator();
                while (it.hasNext()) {
                    C26754d dVar2 = (C26754d) it.next();
                    if (!isDataEmpty() && ((C26755e) this.mData).f70555d.indexOf(dVar2) >= 0) {
                        it.remove();
                    }
                }
            }
            int i = this.mListQueryType;
            if (i == 1) {
                this.mData = eVar;
                mo69488b(eVar.f70555d);
            } else if (i == 4) {
                mo69490c(eVar.f70555d);
                ((C26755e) this.mData).f70554c &= eVar.f70554c;
            }
            if (((C26755e) this.mData).f70553b != 0) {
                ((C26755e) this.mData).f70553b = eVar.f70553b;
            }
            C28199ae.m92689a().mo71792a(eVar.getRequestId(), ((C26755e) this.mData).logPb);
            C26601f.m87382b(((C26755e) this.mData).f70555d);
            return;
        }
        if (this.mListQueryType == 1) {
            this.mData = eVar;
            mo69487b();
            if (this.mData != null) {
                ((C26755e) this.mData).f70554c = false;
            }
        }
        if (!(this.mData == null || this.mListQueryType == 2)) {
            ((C26755e) this.mData).f70554c = false;
        }
    }

    /* renamed from: a */
    private void m87817a(String str, int i, int i2, String str2) {
        m87816a(str, i, 10, 0, this.f70559h, this.f70560i, str2, this.f70561j, this.f70788d);
    }

    /* renamed from: a */
    private void m87816a(String str, int i, int i2, int i3, double d, double d2, String str2, int i4, FilterOption filterOption) {
        int i5;
        this.f70557b = str;
        this.f70559h = d;
        this.f70560i = d2;
        this.f70561j = i4;
        this.f70788d = C37384a.m119984b(filterOption);
        int a = C6384b.m19835a().mo15287a(SearchMixVideoDisplayStyle.class, true, "search_mix_multi_mod", C6384b.m19835a().mo15295d().search_mix_multi_mod, 0);
        int a2 = C6384b.m19835a().mo15287a(SearchMixCardOrderSynthesis.class, true, "search_mix_order_disable_synthesis", C6384b.m19835a().mo15295d().search_mix_order_disable_synthesis, 0);
        int a3 = C6384b.m19835a().mo15287a(SearchMixFilterAladdinCards.class, true, "search_mix_filter_aladdin", C6384b.m19835a().mo15295d().search_mix_filter_aladdin, 0);
        if (a != 0) {
            i5 = 1;
        } else {
            i5 = a2;
        }
        SearchApiNew.m87314b().searchMixFeedList(str, i, i2, i3, mo69489c(), this.f70789e, d, d2, str2, i4, C19319c.m63354e(C6399b.m19921a()), C37384a.m119983a(this.f70788d), this.f70788d.getSortType(), this.f70788d.getPublishTime(), i5, a, a3).mo6875a(C26757g.f70563a).mo6875a((C1591g<TResult, TContinuationResult>) new C34089j<TResult,TContinuationResult>(this.mHandler, 0));
    }
}
