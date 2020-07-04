package com.p280ss.android.ugc.aweme.poi.p335ui;

import android.support.p029v7.widget.LinearSmoothScroller;
import android.support.p029v7.widget.RecyclerView.C1287r;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.newfollow.model.C34145b;
import com.p280ss.android.ugc.aweme.poi.C35086h.C35087a;
import com.p280ss.android.ugc.aweme.poi.adapter.PoiAwemeFeedAdapter;
import com.p280ss.android.ugc.aweme.poi.bean.PoiAwemePosition;
import com.p280ss.android.ugc.aweme.poi.model.C35118h;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.w */
public final class C35433w extends C35390l {

    /* renamed from: w */
    public PoiAwemePosition f92941w;

    public final void bd_() {
        if (isViewValid() && this.f92835n.mo66539h() != null && ((!(this.f92835n.mo66539h() instanceof C25673a) || !((C25673a) this.f92835n.mo66539h()).isDataEmpty()) && ((C35118h) this.f92835n.mo66539h()).isHasMore() && this.f92835n != null)) {
            this.f92835n.mo56976a(Integer.valueOf(4), new C35087a().mo88937a(this.f92832k).mo88945d(this.f92833l).mo88940b(3).mo88939a());
        }
    }

    /* renamed from: a */
    public final void mo75133a(int i) {
        super.mo75133a(i);
        if (isViewValid()) {
        }
    }

    public C35433w(PoiAwemePosition poiAwemePosition, String str) {
        this.f92941w = poiAwemePosition;
        this.f92833l = str;
    }

    /* renamed from: a */
    public final void mo75152a(List<C34145b> list, boolean z) {
        super.mo75152a(list, z);
        if (this.f92941w != null && ((PoiAwemeFeedAdapter) this.f77427f).getItemCount() > this.f92941w.position && this.f92941w.position >= 0) {
            mo90112a((Runnable) new Runnable() {
                public final void run() {
                    C354351 r0 = new LinearSmoothScroller(C35433w.this.getContext()) {
                        /* renamed from: a */
                        public final int mo5466a(int i, int i2, int i3, int i4, int i5) {
                            return super.mo5466a(i, i2, i3, i4, -1) + C35433w.this.f92941w.offset;
                        }
                    };
                    r0.f4993g = C35433w.this.f92941w.position;
                    C35433w.this.f77428g.mo5755a((C1287r) r0);
                }
            });
        }
    }

    /* renamed from: a */
    public final void mo89813a(boolean z, String str, String str2, boolean z2) {
        if (this.f92835n != null) {
            this.f92835n.mo56976a(Integer.valueOf(1), new C35087a().mo88937a(this.f92832k).mo88945d(this.f92833l).mo88940b(3).mo88939a());
        }
    }
}
