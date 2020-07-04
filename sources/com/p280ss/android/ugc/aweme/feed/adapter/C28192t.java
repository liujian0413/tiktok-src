package com.p280ss.android.ugc.aweme.feed.adapter;

import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.View.OnTouchListener;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.helper.C28412a;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p280ss.android.ugc.aweme.feed.p1227c.C28254o;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.t */
public final class C28192t extends VideoViewHolder {

    /* renamed from: A */
    private final C28193u f74294A = new C28193u(this.f74252h, this.tagLayout);

    /* renamed from: B */
    private Aweme f74295B;

    /* renamed from: A */
    public final Aweme mo71542A() {
        return this.f74295B;
    }

    /* access modifiers changed from: protected */
    /* renamed from: J */
    public final void mo71638J() {
        super.mo71638J();
        this.f74294A.mo71787a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final Aweme mo71695f(int i) {
        if (C28193u.m92669a(i)) {
            return mo71542A();
        }
        return super.mo71695f(i);
    }

    /* renamed from: a */
    public final void mo65708a(Aweme aweme) {
        this.f74295B = aweme;
        this.f74294A.f74296a = this.f74295B;
        super.mo65708a(C28482e.m93610c(this.f74295B));
    }

    C28192t(View view, C28343z<C28318an> zVar, OnTouchListener onTouchListener, Fragment fragment, BaseFeedPageParams baseFeedPageParams, C28254o oVar, C28412a aVar) {
        super(view, zVar, onTouchListener, fragment, baseFeedPageParams, oVar, aVar);
    }
}
