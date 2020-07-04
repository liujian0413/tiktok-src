package com.p280ss.android.ugc.aweme.similarvideo.p1630ui;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.FrameLayout.LayoutParams;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.p817ad.splash.p836g.C19128g;
import com.p280ss.android.ugc.aweme.app.api.p1023b.C22814a;
import com.p280ss.android.ugc.aweme.base.C23279c.C23280a;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.base.opensourcemodified.android.support.p1064v4.widget.SwipeRefreshLayout.C23386b;
import com.p280ss.android.ugc.aweme.base.widget.RecyclerHeaderViewAdapter;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.common.p1144e.C25676d;
import com.p280ss.android.ugc.aweme.common.widget.ZeusFrameLayout;
import com.p280ss.android.ugc.aweme.discover.mob.C26780aa;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.p280ss.android.ugc.aweme.feed.listener.C28533o;
import com.p280ss.android.ugc.aweme.feed.listener.OnGradualScrollListener;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28229b;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.feed.panel.CellFeedFragmentPanel;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.similarvideo.p1629b.C41716a;
import com.p280ss.android.ugc.aweme.similarvideo.p1629b.C41718b;
import com.p280ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p280ss.android.ugc.common.component.fragment.C43676b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoFragment */
public class SimilarVideoFragment extends AmeBaseFragment implements C23685d, C6905a, C25675c<Aweme>, C28532n, C28533o {

    /* renamed from: i */
    private static String f108602i;

    /* renamed from: e */
    public C41725a f108603e;

    /* renamed from: f */
    protected CellFeedFragmentPanel f108604f = m132844k();

    /* renamed from: g */
    protected RecyclerHeaderViewAdapter<Aweme> f108605g;

    /* renamed from: h */
    protected C41718b f108606h;
    ZeusFrameLayout mLayout;
    protected RecyclerView mRecyclerView;
    protected SwipeRefreshLayout mRefreshLayout;
    protected DmtStatusView mStatusView;

    /* renamed from: com.ss.android.ugc.aweme.similarvideo.ui.SimilarVideoFragment$a */
    public interface C41725a {
        /* renamed from: a */
        void mo102494a();
    }

    /* renamed from: l */
    private static String m132845l() {
        return "similar_videos";
    }

    /* renamed from: r */
    private static String m132851r() {
        return "from_search_similar_aweme";
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        m132854u();
    }

    public final void aE_() {
        m132854u();
    }

    public final void aP_() {
        bd_();
    }

    /* renamed from: j */
    public final void mo68436j() {
    }

    /* renamed from: m */
    private void m132846m() {
        this.f108605g = this.f108604f.mo73299g();
    }

    /* renamed from: o */
    private C1273i m132848o() {
        return new WrapGridLayoutManager(getContext(), 2, 1, false);
    }

    /* renamed from: q */
    private void m132850q() {
        if (isViewValid() && this.mUserVisibleHint) {
            mo102495g();
        }
    }

    /* renamed from: t */
    private void m132853t() {
        m132856w();
        this.f108605g.mo66507h();
    }

    /* renamed from: w */
    private void m132856w() {
        new Handler().postDelayed(new Runnable() {
            public final void run() {
                if (SimilarVideoFragment.this.isViewValid() && SimilarVideoFragment.this.mRefreshLayout != null) {
                    SimilarVideoFragment.this.mRefreshLayout.setRefreshing(false);
                }
            }
        }, 500);
    }

    /* renamed from: C */
    public final SparseArray<C43676b> mo16932C() {
        SparseArray<C43676b> C = super.mo16932C();
        C.append(C23280a.f61313b, this.f108604f);
        return C;
    }

    public final void aD_() {
        if (isViewValid()) {
            this.f108605g.ag_();
        }
    }

    public final boolean aR_() {
        return ((C25673a) this.f108606h.mo66539h()).isHasMore();
    }

    public final void ae_() {
        if (isViewValid()) {
            m132855v();
        }
    }

    public final void bd_() {
        if (isViewValid()) {
            m132852s();
        }
    }

    /* renamed from: k */
    private CellFeedFragmentPanel m132844k() {
        if (this.f108604f == null) {
            this.f108604f = new CellFeedFragmentPanel(m132845l(), this, this, 16);
        }
        return this.f108604f;
    }

    /* renamed from: p */
    private void m132849p() {
        this.f108606h = new C41718b();
        this.f108606h.mo66537a(this);
        this.f108606h.mo66568a((C25676d) this.f108604f);
        this.f108606h.mo66536a(new C41716a());
    }

    /* renamed from: s */
    private void m132852s() {
        this.f108606h.mo56976a(Integer.valueOf(4), f108602i);
    }

    /* renamed from: u */
    private void m132854u() {
        if (this.mRecyclerView.getChildCount() > 0) {
            this.mRefreshLayout.setRefreshing(true);
        } else {
            this.mStatusView.mo25942f();
        }
    }

    /* renamed from: v */
    private void m132855v() {
        m132856w();
        if (this.f108605g.f67566v) {
            this.f108605g.mo66516d(false);
            this.f108605g.notifyDataSetChanged();
        }
        this.f108605g.mo58045a(null);
        this.mStatusView.mo25943g();
    }

    /* renamed from: g */
    public final void mo102495g() {
        if (!C19128g.m62689b((Context) getActivity())) {
            C6726a.m20843a(new Runnable() {
                public final void run() {
                    if (SimilarVideoFragment.this.isViewValid()) {
                        SimilarVideoFragment.this.mStatusView.mo25944h();
                        C10761a.m31399c((Context) SimilarVideoFragment.this.getActivity(), (int) R.string.cjs).mo25750a();
                    }
                }
            }, 100);
        } else if (this.f108606h != null) {
            m132842b(f108602i);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f108606h != null) {
            this.f108606h.mo59134U_();
        }
        this.f108604f.mo67634n();
    }

    /* renamed from: n */
    private void m132847n() {
        C10805b bVar = new C10806a(getContext()).mo25985a((int) R.drawable.b7c).mo25990b((int) R.string.fic).mo25993c(R.string.fid).f29135a;
        DmtLoadingLayout dmtLoadingLayout = new DmtLoadingLayout(getContext());
        dmtLoadingLayout.setLayoutParams(new LayoutParams(-1, -1));
        dmtLoadingLayout.setUseScreenHeight((int) C9738o.m28708b((Context) getActivity(), 494.0f));
        this.mStatusView.setBuilder(new C10803a(getContext()).mo25960a((View) dmtLoadingLayout).mo25961a(bVar).mo25957a(R.string.fi5, R.string.fi2, R.string.fia, new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                SimilarVideoFragment.this.mo102495g();
            }
        }));
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
        m132843d(exc);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: a */
    public final void mo59100a(boolean z) {
        this.f108604f.mo73304a(z);
    }

    /* renamed from: a */
    public static SimilarVideoFragment m132840a(String str) {
        if (str == null) {
            return null;
        }
        f108602i = str;
        return new SimilarVideoFragment();
    }

    /* renamed from: d */
    private void m132843d(Exception exc) {
        C22814a.m75244a(getContext(), (Throwable) exc);
        m132855v();
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (isViewValid()) {
            m132843d(exc);
        }
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        if (isViewValid()) {
            m132853t();
        }
    }

    /* renamed from: b */
    private void m132842b(String str) {
        this.f108606h.mo56976a(Integer.valueOf(1), str);
    }

    /* renamed from: b */
    public final void mo59108b(List<Aweme> list, boolean z) {
        this.f108604f.mo59108b(list, z);
    }

    /* renamed from: c */
    public final void mo59110c(List<Aweme> list, boolean z) {
        this.f108604f.mo59108b(list, z);
    }

    /* renamed from: a */
    public final void mo59099a(List<Aweme> list, boolean z) {
        if (isViewValid()) {
            this.f108604f.mo59099a(list, z);
            this.mStatusView.mo25939d();
            if (this.f108603e != null) {
                this.f108603e.mo102494a();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f108604f.mo67627f(this.mUserVisibleHint);
        m132841a(view, bundle);
        m132849p();
        m132850q();
    }

    /* renamed from: a */
    private void m132841a(View view, Bundle bundle) {
        m132847n();
        this.mRecyclerView.setLayoutManager(m132848o());
        this.f108604f.mo67605a(view, bundle);
        m132846m();
        this.f108605g.f67550q = getResources().getColor(R.color.a53);
        this.f108604f.f75273l = 16;
        this.f108604f.mo73293a((C1281m) new OnGradualScrollListener());
        this.f108604f.mo73294a((C6905a) this);
        this.f108604f.f75269h = this;
        this.mRefreshLayout.setOnRefreshListener(new C23386b() {
            /* renamed from: a */
            public final void mo60744a() {
                SimilarVideoFragment.this.mo102495g();
            }
        });
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.qz, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        return inflate;
    }

    /* renamed from: a */
    public final void mo61615a(View view, Aweme aweme, String str) {
        if (!(C27326a.m89578a(view) || aweme == null || getActivity() == null)) {
            C28503s.m93679a((C25673a) this.f108606h.mo66539h());
            C7195s a = C7195s.m22438a();
            FragmentActivity activity = getActivity();
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(aweme.getAid());
            a.mo18681a((Activity) activity, C7203u.m22460a(sb.toString()).mo18694a("refer", str).mo18694a("video_from", m132851r()).mo18693a("profile_enterprise_type", aweme.getEnterpriseType()).mo18693a("page_type", 16).mo18695a(), view);
            C28229b.m92772a(aweme);
            C26780aa.m87959a(view, m132845l(), aweme);
        }
    }
}
