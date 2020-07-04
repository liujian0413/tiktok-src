package com.p280ss.android.ugc.aweme.commercialize.coupon.p1120a;

import com.bytedance.common.utility.collection.C6307b;
import com.p280ss.android.ugc.aweme.base.C23397p;
import com.p280ss.android.ugc.aweme.commercialize.coupon.api.CouponApi;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.C24594b;
import com.p280ss.android.ugc.aweme.commercialize.coupon.model.CouponInfo;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.a.c */
public final class C24580c extends C25673a<CouponInfo, C24594b> {

    /* renamed from: a */
    public boolean f64828a;

    /* renamed from: b */
    public int f64829b;

    /* renamed from: c */
    private List<CouponInfo> f64830c = new ArrayList();

    /* renamed from: d */
    private boolean f64831d = false;

    /* renamed from: e */
    private int f64832e;

    public final List<CouponInfo> getItems() {
        return this.f64830c;
    }

    public final boolean isHasMore() {
        return this.f64831d;
    }

    public final void loadMoreList(Object... objArr) {
        m80621a(this.f64832e);
    }

    public final void refreshList(Object... objArr) {
        m80621a(1);
    }

    /* renamed from: a */
    private void m80621a(final int i) {
        C23397p.m76735a().mo60807a(this.mHandler, new Callable() {
            public final Object call() throws Exception {
                return CouponApi.m80642a(i, 10, C24580c.this.f64829b);
            }
        }, 0);
    }

    public final boolean checkParams(Object... objArr) {
        if (objArr == null || objArr.length != 1) {
            return false;
        }
        return true;
    }

    public C24580c(boolean z) {
        int i = 1;
        this.f64832e = 1;
        this.f64828a = false;
        if (!z) {
            i = 4;
        }
        this.f64829b = i;
    }

    /* renamed from: a */
    private void m80623a(boolean z) {
        if (z) {
            this.f64828a = false;
        }
        this.mIsNewDataEmpty = true;
        this.f64831d = false;
        this.f64832e = 1;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void handleData(C24594b bVar) {
        if (bVar == null) {
            m80623a(true);
            return;
        }
        this.f64831d = bVar.f64865d;
        this.f64828a = bVar.f64864c;
        if (C6307b.m19566a((Collection<T>) bVar.f64862a)) {
            m80623a(false);
            return;
        }
        if (this.mListQueryType == 1) {
            this.f64830c.clear();
            this.f64832e = 1;
        }
        this.f64832e++;
        this.f64830c.addAll(bVar.f64862a);
    }
}
