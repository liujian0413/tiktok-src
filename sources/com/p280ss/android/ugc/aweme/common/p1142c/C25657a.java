package com.p280ss.android.ugc.aweme.common.p1142c;

import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1293v;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.OnAnimatedScrollListener;
import com.p280ss.android.ugc.aweme.common.adapter.C25650d;

/* renamed from: com.ss.android.ugc.aweme.common.c.a */
public final class C25657a {

    /* renamed from: a */
    public RecyclerView f67578a;

    /* renamed from: b */
    public OnAnimatedScrollListener f67579b;

    /* renamed from: a */
    public final void mo66544a() {
        if (this.f67578a != null) {
            int childCount = this.f67578a.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1293v b = this.f67578a.mo5539b(this.f67578a.getChildAt(i));
                if (b.mItemViewType == 0) {
                    C25650d dVar = (C25650d) b;
                    dVar.mo66493b(false);
                    dVar.bz_();
                }
            }
        }
    }

    public C25657a(RecyclerView recyclerView, OnAnimatedScrollListener onAnimatedScrollListener) {
        this.f67579b = onAnimatedScrollListener;
        this.f67578a = recyclerView;
    }

    /* renamed from: a */
    public final void mo66545a(final boolean z, boolean z2) {
        int i;
        C256581 r0 = new Runnable() {
            public final void run() {
                if (C25657a.this.f67579b != null && C25657a.this.f67578a != null && (!z || C25659b.m84379a(C6399b.m19921a()))) {
                    C25657a.this.f67579b.mo61762a(C25657a.this.f67578a, z);
                }
            }
        };
        if (z2) {
            i = 100;
        } else {
            i = 0;
        }
        C6726a.m20843a(r0, i);
    }
}
