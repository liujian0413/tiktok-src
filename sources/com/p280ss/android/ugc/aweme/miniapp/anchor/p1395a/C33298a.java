package com.p280ss.android.ugc.aweme.miniapp.anchor.p1395a;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.miniapp.anchor.AnchorApi;
import com.p280ss.android.ugc.aweme.miniapp.anchor.response.C33351e;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.a.a */
public final class C33298a extends C25673a<MicroAppInfo, C33351e> {

    /* renamed from: a */
    private int f86976a;

    /* renamed from: b */
    private List<MicroAppInfo> f86977b = new ArrayList();

    /* renamed from: c */
    private boolean f86978c = false;

    public final List<MicroAppInfo> getItems() {
        return this.f86977b;
    }

    public final boolean isHasMore() {
        return this.f86978c;
    }

    /* renamed from: a */
    private void m107723a() {
        this.f86978c = false;
        this.f86976a = 0;
        this.f86977b.clear();
    }

    public final void refreshList(Object... objArr) {
        m107724a(0, new Object[0]);
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public final void loadMoreList(Object... objArr) {
        m107724a(this.f86976a, new Object[0]);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C33351e eVar) {
        if (eVar == null || C6307b.m19566a((Collection<T>) eVar.mo85511a())) {
            m107723a();
            return;
        }
        this.f86978c = eVar.mo85512b();
        this.f86976a = eVar.mo85514d();
        if (this.mListQueryType == 1) {
            this.f86977b.clear();
        }
        this.f86977b.addAll(eVar.mo85511a());
    }

    /* renamed from: a */
    private void m107724a(final int i, Object... objArr) {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return AnchorApi.m107702a(i, 20, 0);
            }
        }, 0);
    }
}
