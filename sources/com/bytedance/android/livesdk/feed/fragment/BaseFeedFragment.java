package com.bytedance.android.livesdk.feed.fragment;

import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0065w.C0067b;
import android.arch.lifecycle.C0069x;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.android.live.base.model.feed.FeedItem;
import com.bytedance.android.live.core.feed.FeedApi;
import com.bytedance.android.live.core.p145a.C3149e;
import com.bytedance.android.live.core.p145a.C3154j;
import com.bytedance.android.live.core.p157ui.BaseFragment;
import com.bytedance.android.live.network.C3458e;
import com.bytedance.android.livesdk.feed.C5966c;
import com.bytedance.android.livesdk.feed.C5974e;
import com.bytedance.android.livesdk.feed.C6019g;
import com.bytedance.android.livesdk.feed.C6034i;
import com.bytedance.android.livesdk.feed.C6077n;
import com.bytedance.android.livesdk.feed.FixEmptyItemInStaggeredLayoutScrollListener;
import com.bytedance.android.livesdk.feed.adapter.BaseFeedAdapter;
import com.bytedance.android.livesdk.feed.adapter.C5933c;
import com.bytedance.android.livesdk.feed.adapter.C5933c.C5936a;
import com.bytedance.android.livesdk.feed.adapter.C5933c.C5937b;
import com.bytedance.android.livesdk.feed.p227b.C5951b;
import com.bytedance.android.livesdk.feed.p234i.C6035a;
import com.bytedance.android.livesdk.feed.repository.FeedRepository;
import com.bytedance.android.livesdk.feed.services.C6121d;
import com.bytedance.android.livesdk.feed.tab.p364b.C7771n;
import com.bytedance.android.livesdk.feed.viewmodel.BaseFeedDataViewModel;
import com.bytedance.android.livesdk.feed.viewmodel.FragmentFeedViewModel;
import com.zhiliaoapp.musically.df_live_zego_link.R;

public abstract class BaseFeedFragment extends BaseFragment implements C6019g, C6034i {

    /* renamed from: a */
    protected FragmentFeedViewModel f17766a;

    /* renamed from: b */
    protected C5974e f17767b;

    /* renamed from: c */
    protected RecyclerView f17768c;

    /* renamed from: d */
    protected C5933c f17769d;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C5936a mo14649a(C5936a aVar) {
        return aVar;
    }

    /* renamed from: a */
    public String mo14650a() {
        return "";
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo14654b(FeedItem feedItem) {
    }

    /* renamed from: b */
    public String mo14653b() {
        return "";
    }

    /* renamed from: c */
    public long mo14655c() {
        return 0;
    }

    /* renamed from: d */
    public int mo14656d() {
        return 4;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public abstract BaseFeedAdapter mo14658f();

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public int mo14660h() {
        return 2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public abstract C1272h mo14661i();

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public C1273i mo14659g() {
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(mo14660h(), 1);
        staggeredGridLayoutManager.mo5427b(0);
        return staggeredGridLayoutManager;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public FragmentFeedViewModel mo14657e() {
        return (FragmentFeedViewModel) C0069x.m158a((Fragment) this, (C0067b) this.f17767b.mo14623a((C6019g) this)).mo147a(FragmentFeedViewModel.class);
    }

    public void onPause() {
        super.onPause();
        if (mo14658f() != null) {
            mo14658f().mo14527h();
        }
    }

    public void onResume() {
        super.onResume();
        if (mo14658f() != null) {
            mo14658f().mo14526g();
        }
    }

    public void onStop() {
        super.onStop();
        if (mo14658f() != null) {
            mo14658f().mo14525f();
        }
    }

    /* renamed from: j */
    private C5974e mo14668j() {
        FeedRepository feedRepository = new FeedRepository(C6121d.m19067a(), (FeedApi) C3458e.m12798a().mo10440a(FeedApi.class), new C3149e(), new C3154j(), new C3149e(), C6121d.m19068b(), null, new C5966c(C7771n.m23888d()));
        C5974e eVar = new C5974e(feedRepository, C7771n.m23888d(), C5951b.m18633a().getApplicationContext(), new C6077n() {
        }, new C6035a());
        return eVar;
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f17767b = mo14668j();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.bytedance.android.live.base.model.ImageModel>, for r3v0, types: [java.util.List, java.util.List<com.bytedance.android.live.base.model.ImageModel>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ void mo14652a(java.util.List<com.bytedance.android.live.base.model.ImageModel> r3) {
        /*
            r2 = this;
            java.util.Iterator r3 = r3.iterator()
        L_0x0004:
            boolean r0 = r3.hasNext()
            if (r0 == 0) goto L_0x0018
            java.lang.Object r0 = r3.next()
            com.bytedance.android.live.base.model.ImageModel r0 = (com.bytedance.android.live.base.model.ImageModel) r0
            android.content.Context r1 = r2.getContext()
            com.bytedance.android.live.core.utils.C3393m.m12616a(r1, r0)
            goto L_0x0004
        L_0x0018:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.feed.fragment.BaseFeedFragment.mo14652a(java.util.List):void");
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.f17766a != null) {
            this.f17766a.mo20503a(z);
        }
        if (mo14658f() != null) {
            mo14658f().mo14518a(z);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f17766a = mo14657e();
        this.f17769d = mo14649a(new C5936a().mo14542a((C0043i) this).mo14550a((BaseFeedDataViewModel) this.f17766a).mo14545a(this.f17768c).mo14548a((C5937b) new C6002a(this)).mo14547a(mo14658f()).mo14544a(mo14659g()).mo14543a(mo14661i()).mo14551a(false).mo14541a(mo14660h()).mo14549a((C6034i) this)).mo14552a();
        this.f17769d.mo14532a();
        this.f17766a.mo20503a(this.mUserVisibleHint);
        this.f17768c.mo5528a((C1281m) new FixEmptyItemInStaggeredLayoutScrollListener(mo14660h()));
        this.f17766a.f21065n.observe(this, new C6003b(this));
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.apz, viewGroup, false);
        this.f17768c = (RecyclerView) inflate.findViewById(R.id.bn1);
        return inflate;
    }
}
