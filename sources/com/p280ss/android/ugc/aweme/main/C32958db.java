package com.p280ss.android.ugc.aweme.main;

import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.C23389b;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.main.p1382d.C32954c;
import com.p280ss.android.ugc.aweme.utils.C42961az;

/* renamed from: com.ss.android.ugc.aweme.main.db */
public final class C32958db implements C23389b {

    /* renamed from: a */
    private SwipeRefreshLayout f85903a;

    public C32958db(SwipeRefreshLayout swipeRefreshLayout) {
        this.f85903a = swipeRefreshLayout;
    }

    public final void setRefreshing(final boolean z) {
        this.f85903a.setRefreshing(z);
        if (!z) {
            C42961az.m136380a(new C32954c() {
                /* access modifiers changed from: private */
                /* renamed from: a */
                public void accept(SwipeRefreshLayout swipeRefreshLayout) {
                    swipeRefreshLayout.setRefreshing(z);
                }
            });
        }
    }
}
