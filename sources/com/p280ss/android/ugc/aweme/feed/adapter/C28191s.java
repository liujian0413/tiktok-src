package com.p280ss.android.ugc.aweme.feed.adapter;

import android.support.p022v4.app.Fragment;
import android.view.View;
import android.view.View.OnTouchListener;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.event.C28343z;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28482e;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.s */
public final class C28191s extends FeedImageViewHolder {

    /* renamed from: f */
    private final C28193u f74292f = new C28193u(this.f74252h, this.tagLayout);

    /* renamed from: g */
    private Aweme f74293g;

    /* renamed from: A */
    public final Aweme mo71542A() {
        return this.f74293g;
    }

    /* access modifiers changed from: protected */
    /* renamed from: w */
    public final void mo71540w() {
        super.mo71540w();
        this.f74292f.mo71787a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Aweme mo71532d(int i) {
        if (C28193u.m92669a(i)) {
            return mo71542A();
        }
        return super.mo71532d(i);
    }

    /* renamed from: a */
    public final void mo65708a(Aweme aweme) {
        this.f74293g = aweme;
        this.f74292f.f74296a = this.f74293g;
        super.mo65708a(C28482e.m93610c(this.f74293g));
    }

    C28191s(int i, View view, C28343z<C28318an> zVar, String str, OnTouchListener onTouchListener, Fragment fragment, int i2) {
        super(i, view, zVar, str, onTouchListener, fragment, i2);
    }
}
