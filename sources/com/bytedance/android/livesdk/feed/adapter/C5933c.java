package com.bytedance.android.livesdk.feed.adapter;

import android.arch.lifecycle.C0043i;
import android.os.Bundle;
import android.support.p022v4.util.C0902i;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.base.model.media.Media;
import com.bytedance.android.live.base.model.user.IUser.Status;
import com.bytedance.android.live.core.network.NetworkStat;
import com.bytedance.android.live.core.paging.viewmodel.PagingViewModel;
import com.bytedance.android.live.core.utils.C3357ab;
import com.bytedance.android.livesdk.feed.BannerSwipeRefreshLayout.C5912a;
import com.bytedance.android.livesdk.feed.C6034i;
import com.bytedance.android.livesdk.feed.feed.FeedDataKey;
import com.bytedance.android.livesdk.feed.p226a.C5925a.C5926a;
import com.bytedance.android.livesdk.feed.repository.BaseFeedRepository.ApiDataStatus;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.bytedance.android.livesdk.feed.adapter.c */
public final class C5933c {

    /* renamed from: a */
    public BaseFeedAdapter f17589a;

    /* renamed from: b */
    public BaseFeedDataViewModel f17590b;

    /* renamed from: c */
    public C1273i f17591c;

    /* renamed from: d */
    public C1272h f17592d;

    /* renamed from: e */
    public C6034i f17593e;

    /* renamed from: f */
    public boolean f17594f;

    /* renamed from: g */
    public C5937b f17595g;

    /* renamed from: h */
    public C5912a f17596h;

    /* renamed from: i */
    public Bundle f17597i;

    /* renamed from: j */
    public C5926a f17598j;

    /* renamed from: k */
    private RecyclerView f17599k;

    /* renamed from: l */
    private C0043i f17600l;

    /* renamed from: m */
    private boolean f17601m;

    /* renamed from: com.bytedance.android.livesdk.feed.adapter.c$a */
    public static class C5936a {

        /* renamed from: a */
        private BaseFeedAdapter f17604a;

        /* renamed from: b */
        private RecyclerView f17605b;

        /* renamed from: c */
        private BaseFeedDataViewModel f17606c;

        /* renamed from: d */
        private C1273i f17607d;

        /* renamed from: e */
        private int f17608e = 2;

        /* renamed from: f */
        private C1272h f17609f;

        /* renamed from: g */
        private C0043i f17610g;

        /* renamed from: h */
        private boolean f17611h;

        /* renamed from: i */
        private C6034i f17612i;

        /* renamed from: j */
        private C5937b f17613j;

        /* renamed from: k */
        private C5912a f17614k;

        /* renamed from: l */
        private Bundle f17615l;

        /* renamed from: a */
        public final C5936a mo14551a(boolean z) {
            this.f17611h = z;
            return this;
        }

        /* renamed from: a */
        public final C5933c mo14552a() {
            if (this.f17605b != null) {
                this.f17605b.setItemAnimator(null);
                if (this.f17604a == null) {
                    throw new IllegalStateException("adapter must not be null");
                } else if (this.f17606c == null) {
                    throw new IllegalStateException("viewModel must not be null");
                } else if (this.f17610g != null) {
                    C5933c cVar = new C5933c(this.f17610g, this.f17604a, this.f17605b, this.f17606c);
                    cVar.f17591c = this.f17607d;
                    if (this.f17607d instanceof StaggeredGridLayoutManager) {
                        ((StaggeredGridLayoutManager) this.f17607d).mo5368a(this.f17608e);
                    }
                    cVar.f17595g = this.f17613j;
                    cVar.f17592d = this.f17609f;
                    cVar.f17594f = this.f17611h;
                    cVar.f17593e = this.f17612i;
                    cVar.f17596h = this.f17614k;
                    cVar.f17597i = this.f17615l;
                    return cVar;
                } else {
                    throw new IllegalStateException("lifecycleOwner must not be null");
                }
            } else {
                throw new IllegalStateException("recyclerView must not be null");
            }
        }

        public C5936a() {
            StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(this.f17608e, 1);
            staggeredGridLayoutManager.mo5427b(0);
            this.f17607d = staggeredGridLayoutManager;
        }

        /* renamed from: a */
        public final C5936a mo14541a(int i) {
            this.f17608e = i;
            return this;
        }

        /* renamed from: a */
        public final C5936a mo14542a(C0043i iVar) {
            this.f17610g = iVar;
            return this;
        }

        /* renamed from: a */
        public final C5936a mo14543a(C1272h hVar) {
            this.f17609f = hVar;
            return this;
        }

        /* renamed from: a */
        public final C5936a mo14544a(C1273i iVar) {
            this.f17607d = iVar;
            return this;
        }

        /* renamed from: a */
        public final C5936a mo14545a(RecyclerView recyclerView) {
            this.f17605b = recyclerView;
            return this;
        }

        /* renamed from: a */
        public final C5936a mo14546a(C5912a aVar) {
            this.f17614k = aVar;
            return this;
        }

        /* renamed from: a */
        public final C5936a mo14547a(BaseFeedAdapter baseFeedAdapter) {
            this.f17604a = baseFeedAdapter;
            return this;
        }

        /* renamed from: a */
        public final C5936a mo14548a(C5937b bVar) {
            this.f17613j = bVar;
            return this;
        }

        /* renamed from: a */
        public final C5936a mo14549a(C6034i iVar) {
            this.f17612i = iVar;
            return this;
        }

        /* renamed from: a */
        public final C5936a mo14550a(BaseFeedDataViewModel baseFeedDataViewModel) {
            this.f17606c = baseFeedDataViewModel;
            return this;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.feed.adapter.c$b */
    public interface C5937b {
        /* renamed from: a */
        void mo14553a(FeedItem feedItem);
    }

    private C5933c() {
    }

    /* renamed from: b */
    static final /* synthetic */ boolean m18573b(C0902i iVar) throws Exception {
        return iVar != null;
    }

    /* renamed from: a */
    public final void mo14532a() {
        m18572b();
    }

    /* renamed from: c */
    private void m18574c() {
        this.f17601m = false;
        if (this.f17590b != null) {
            this.f17590b.mo20488b(null, "feed_loadmore");
        }
    }

    /* renamed from: b */
    private void m18572b() {
        this.f17589a.mo14517a((C5948n) new C5948n() {
            /* renamed from: b */
            public final C5912a mo14540b() {
                return C5933c.this.f17596h;
            }

            /* renamed from: a */
            public final FeedDataKey mo14539a() {
                return C5933c.this.f17590b.mo20493g();
            }
        });
        this.f17599k.setAdapter(this.f17589a);
        this.f17599k.setLayoutManager(this.f17591c);
        this.f17599k.mo5528a((C1281m) new C1281m() {
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                super.onScrollStateChanged(recyclerView, i);
                if (i == 0) {
                    C5933c.this.f17589a.mo14519b();
                    C1273i layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager instanceof StaggeredGridLayoutManager) {
                        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                        int[] a = staggeredGridLayoutManager.mo6009a((int[]) null);
                        if (a[0] >= 0 && a[0] < 3) {
                            staggeredGridLayoutManager.mo6013h();
                        }
                    }
                    return;
                }
                C5933c.this.f17589a.mo14521c();
            }

            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (i > 0 || i2 > 0) {
                    C5933c.this.f17589a.mo14521c();
                }
            }
        });
        if (this.f17592d != null) {
            this.f17599k.mo5525a(this.f17592d);
        }
        this.f17589a.mo10076a((PagingViewModel<T>) this.f17590b);
        this.f17589a.mo14528i().mo19291a(C5938d.f17616a).mo19280a((C7326g<? super T>) new C5939e<Object>(this), C5940f.f17618a);
        this.f17589a.mo14529j().mo19280a((C7326g<? super T>) new C5941g<Object>(this), C5942h.f17620a);
        this.f17589a.mo14530k().mo19280a((C7326g<? super T>) new C5943i<Object>(this), C5944j.f17622a);
        this.f17590b.mo20490d();
        this.f17590b.f21060a.mo14496a(this.f17600l);
        this.f17590b.f21061j.observeForever(new C5945k(this));
        this.f17590b.f21074w.observe(this.f17600l, new C5946l(this));
        this.f17590b.f21066o.observe(this.f17600l, new C5947m(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14538a(Object obj) throws Exception {
        m18574c();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14533a(C0902i iVar) throws Exception {
        if (this.f17593e != null) {
            ((Long) iVar.f3155b).longValue();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14534a(FeedItem feedItem) throws Exception {
        this.f17601m = true;
        if (feedItem != null && (feedItem.item instanceof Media)) {
            this.f17589a.mo14525f();
        }
        if (this.f17595g != null) {
            this.f17595g.mo14553a(feedItem);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14536a(ApiDataStatus apiDataStatus) {
        if (apiDataStatus == ApiDataStatus.START) {
            this.f17589a.mo14523d();
        }
        if (apiDataStatus == ApiDataStatus.SUCCESS) {
            this.f17589a.mo14524e();
            this.f17599k.mo5541b(0);
        }
        if (this.f17598j != null && apiDataStatus != null) {
            apiDataStatus.ordinal();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14535a(Status status) {
        boolean z;
        if (this.f17594f && !this.f17601m) {
            this.f17590b.mo20484a("enter_auto");
        }
        if (status == Status.Login && !this.f17601m) {
            NetworkStat networkStat = (NetworkStat) this.f17590b.f9870b.getValue();
            Boolean bool = (Boolean) this.f17590b.f9872d.getValue();
            boolean z2 = true;
            if (networkStat == null || !networkStat.mo10026b()) {
                z = false;
            } else {
                z = true;
            }
            if (bool != null && !bool.booleanValue()) {
                z2 = false;
            }
            if (z && z2) {
                this.f17590b.mo20484a("enter_auto");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo14537a(Integer num) {
        if (num != null && this.f17599k != null) {
            C3357ab.m12509a(this.f17599k, 0);
            if (this.f17590b.mo20495i()) {
                C3357ab.m12509a(this.f17599k, num.intValue());
            } else {
                this.f17599k.mo5541b(num.intValue());
            }
        }
    }

    private C5933c(C0043i iVar, BaseFeedAdapter baseFeedAdapter, RecyclerView recyclerView, BaseFeedDataViewModel baseFeedDataViewModel) {
        this.f17600l = iVar;
        this.f17589a = baseFeedAdapter;
        this.f17599k = recyclerView;
        this.f17590b = baseFeedDataViewModel;
    }
}
