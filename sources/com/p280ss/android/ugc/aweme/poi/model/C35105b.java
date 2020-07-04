package com.p280ss.android.ugc.aweme.poi.model;

import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.detail.p1166j.C26112p;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.model.TextExtraStruct;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.newfollow.model.C34146c;
import com.p280ss.android.ugc.aweme.poi.C35086h;
import com.p280ss.android.ugc.aweme.poi.api.PoiFeedApi;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.model.b */
public final class C35105b extends C35118h implements C26112p {
    public C35105b() {
        this(65441);
    }

    /* renamed from: a */
    public final List<Aweme> mo57985a() {
        return m113258a(getItems());
    }

    public C35105b(int i) {
        super(i);
    }

    public final void loadMoreList(Object... objArr) {
        if (m113315a(2, objArr)) {
            C35086h hVar = objArr[1];
            m113260b(hVar.f91750a, hVar.f91759j, hVar.f91752c);
        }
    }

    public final void refreshList(Object... objArr) {
        if (m113315a(2, objArr)) {
            C35086h hVar = objArr[1];
            m113259a(hVar.f91750a, hVar.f91759j, hVar.f91752c);
        }
    }

    public final void setItems(List<C34145b> list) {
        if (this.mData == null) {
            this.mData = new C34146c();
        }
        ((C34146c) this.mData).f88979a = list;
    }

    /* renamed from: a */
    public static List<Aweme> m113258a(List<C34145b> list) {
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C34145b bVar : list) {
            if (bVar.getFeedType() == 65280) {
                arrayList.add(bVar.getAweme());
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m113259a(String str, int i, String str2) {
        f91861h.getAwemeList(str, i, 20, 0, str2).mo6876a((C1591g<TResult, TContinuationResult>) new C35104a<TResult,TContinuationResult>(this.mHandler, TextExtraStruct.TYPE_CUSTOM, null), C1592h.f5958b);
    }

    /* renamed from: b */
    private void m113260b(String str, int i, String str2) {
        long j;
        PoiFeedApi poiFeedApi = f91861h;
        if (C6307b.m19566a((Collection<T>) getItems())) {
            j = 0;
        } else {
            j = ((C34146c) this.mData).f88981c;
        }
        poiFeedApi.getAwemeList(str, i, 20, j, str2).mo6876a((C1591g<TResult, TContinuationResult>) new C35104a<TResult,TContinuationResult>(this.mHandler, TextExtraStruct.TYPE_CUSTOM_COLOR_CLICK_SPAN, null), C1592h.f5958b);
    }
}
