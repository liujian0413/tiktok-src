package com.bytedance.android.livesdk.feed.viewmodel;

import com.bytedance.android.livesdk.feed.C6019g;
import com.bytedance.android.livesdk.feed.IFeedRepository;
import com.bytedance.android.livesdk.feed.p229d.C5971a;

public class FragmentFeedViewModel extends BaseFeedDataViewModel {

    /* renamed from: x */
    public boolean f21087x;

    /* renamed from: y */
    private boolean f21088y;

    /* renamed from: j */
    private void m23985j() {
        if (!this.f21087x) {
            super.mo20490d();
            this.f21087x = true;
        }
    }

    /* renamed from: k */
    private void m23986k() {
        if (this.f21087x && this.f21060a != null) {
            this.f21060a.mo14501d();
        }
    }

    /* renamed from: d */
    public final void mo20490d() {
        if (this.f21088y) {
            m23985j();
        }
    }

    /* renamed from: a */
    public final void mo20503a(boolean z) {
        this.f21088y = z;
        if (!this.f21088y) {
            m23986k();
        }
        mo20490d();
    }

    public FragmentFeedViewModel(IFeedRepository iFeedRepository, C6019g gVar, C5971a aVar) {
        super(iFeedRepository, gVar, aVar);
    }
}
