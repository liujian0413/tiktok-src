package com.p280ss.android.ugc.aweme.feed.p1238ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.C23279c.C23280a;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.C23389b;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout.C23386b;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.p280ss.android.ugc.aweme.feed.listener.C28533o;
import com.p280ss.android.ugc.aweme.feed.listener.OnGradualScrollListener;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28229b;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28447b;
import com.p280ss.android.ugc.aweme.feed.p1233i.C28454h;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel;
import com.p280ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.main.C32958db;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.common.component.fragment.C43676b;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.FeedTimeLineFragment */
public class FeedTimeLineFragment extends FeedFragment implements C23685d, C6905a, C28532n, C28533o {

    /* renamed from: e */
    C23389b f75700e;

    /* renamed from: f */
    public View f75701f;

    /* renamed from: g */
    private C28454h f75702g;

    /* renamed from: h */
    private CellFeedFragmentPanel f75703h = new CellFeedFragmentPanel("homepage_fresh", this, this, 2);
    ViewGroup mFlRootContanier;
    FeedSwipeRefreshLayout mRefreshLayout;
    DmtStatusView mStatusView;
    View mVTabBg;

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    public final void aP_() {
        bd_();
    }

    public final boolean aR_() {
        return this.f75702g.mo72194j();
    }

    /* renamed from: C */
    public final SparseArray<C43676b> mo16932C() {
        SparseArray<C43676b> C = super.mo16932C();
        C.append(C23280a.f61313b, this.f75703h);
        return C;
    }

    /* renamed from: p */
    public final void mo73821p() {
        this.f75700e.setRefreshing(true);
        mo73772d_(false);
    }

    public final void bd_() {
        this.f75702g.mo56976a(Integer.valueOf(4), Integer.valueOf(2), Integer.valueOf(2));
    }

    /* renamed from: j */
    public final void mo68436j() {
        if (!this.f75702g.mo72192f()) {
            C10761a.m31409e(getContext(), (int) R.string.cml).mo25750a();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f75702g != null) {
            this.f75702g.mo59134U_();
        }
        this.f75703h.mo67634n();
    }

    /* renamed from: a */
    private void m94614a() {
        this.mStatusView.setBuilder(C10803a.m31631a((Context) getActivity()).mo25954a((int) R.string.b0z));
        this.mRefreshLayout.mo60699a(false, (int) C9738o.m28708b((Context) getActivity(), 49.0f), (int) C9738o.m28708b((Context) getActivity(), 113.0f));
        this.mRefreshLayout.setOnRefreshListener(new C23386b() {
            /* renamed from: a */
            public final void mo60744a() {
                FeedTimeLineFragment.this.mo73772d_(false);
            }
        });
        this.f75703h.mo73303a("timeline_list");
        this.f75701f = getActivity().findViewById(R.id.oc);
        this.f75703h.mo73303a("timeline_list");
        this.f75700e = new C32958db(this.mRefreshLayout);
    }

    /* renamed from: a */
    public final void mo59100a(boolean z) {
        this.f75703h.mo73304a(z);
    }

    /* renamed from: d */
    public final void mo73815d(boolean z) {
        super.mo73815d(z);
        this.f75703h.mo73307k();
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.f75703h.mo67627f(z);
    }

    /* renamed from: c */
    public final void mo73814c(boolean z) {
        if (this.mUserVisibleHint && isViewValid()) {
            super.mo73814c(z);
            this.f75703h.mo73306j();
            mo73840e(true);
        }
    }

    /* renamed from: d_ */
    public final boolean mo73772d_(boolean z) {
        if (!isViewValid()) {
            return false;
        }
        if (!C29020v.m95257a(getActivity())) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
            this.f75700e.setRefreshing(false);
            return false;
        } else if (this.f75702g.mo66540i()) {
            return false;
        } else {
            this.f75702g.mo72189a(z);
            this.f75702g.mo56976a(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(1));
            return true;
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f75703h.mo67605a(view, bundle);
        m94614a();
        this.f75703h.mo73293a((C1281m) new OnGradualScrollListener());
        this.f75703h.mo73294a((C6905a) this);
        this.f75703h.f75269h = this;
        this.f75702g = new C28454h(this);
        this.f75702g.mo66537a(this.f75703h);
        this.f75702g.mo66536a(new C28447b(20));
        this.f75702g.mo56976a(Integer.valueOf(1), Integer.valueOf(2), Integer.valueOf(0));
        this.f75684m = -1;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.rm, viewGroup, false);
    }

    /* renamed from: a */
    public final void mo61615a(View view, Aweme aweme, String str) {
        if (aweme != null && getActivity() != null) {
            C28503s.m93679a((C25673a) this.f75702g.mo66539h());
            C7195s a = C7195s.m22438a();
            FragmentActivity activity = getActivity();
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(aweme.getAid());
            a.mo18681a((Activity) activity, C7203u.m22460a(sb.toString()).mo18694a("refer", str).mo18694a("video_from", "from_time_line").mo18695a(), view);
            C28229b.m92772a(aweme);
            C6907h.onEvent(MobClick.obtain().setEventName("feed_enter").setLabelName(str).setValue(aweme.getAid()).setJsonObject(((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestIdAndOrderJsonObject(aweme, 0)));
        }
    }
}
