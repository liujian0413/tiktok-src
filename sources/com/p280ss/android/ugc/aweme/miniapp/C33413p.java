package com.p280ss.android.ugc.aweme.miniapp;

import com.bytedance.common.utility.collection.C6307b;
import com.p1843tt.appbrandimpl.MicroAppApi;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33459d;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.miniapp.p */
public final class C33413p extends C25673a<MicroAppInfo, C33459d> {

    /* renamed from: a */
    private int f87262a;

    /* renamed from: b */
    private List<MicroAppInfo> f87263b = new ArrayList();

    /* renamed from: c */
    private boolean f87264c = false;

    public final List<MicroAppInfo> getItems() {
        return this.f87263b;
    }

    public final boolean isHasMore() {
        return this.f87264c;
    }

    /* renamed from: a */
    private void m108064a() {
        this.f87264c = false;
        this.f87262a = 0;
        this.f87263b.clear();
    }

    public final void loadMoreList(Object... objArr) {
        m108065a(this.f87262a);
    }

    public final void refreshList(Object... objArr) {
        m108065a(0);
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m108065a(final int i) {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return MicroAppApi.m146352a(i, 30, 0);
            }
        }, 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C33459d dVar) {
        if (dVar == null || C6307b.m19566a((Collection<T>) dVar.f87339a)) {
            m108064a();
            return;
        }
        this.f87264c = dVar.f87340b;
        this.f87262a = dVar.f87341c;
        if (this.mListQueryType == 1) {
            this.f87263b.clear();
        }
        this.f87263b.addAll(dVar.f87339a);
    }
}
