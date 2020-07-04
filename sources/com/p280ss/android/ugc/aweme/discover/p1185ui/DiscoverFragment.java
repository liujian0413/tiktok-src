package com.p280ss.android.ugc.aweme.discover.p1185ui;

import android.arch.lifecycle.C0053p;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.p022v4.app.Fragment;
import android.support.p029v7.widget.GridLayoutManager.C1241a;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1290s;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import bolts.C1592h;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.facebook.drawee.backends.pipeline.C13380c;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.socialbase.downloader.exception.BaseException;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.app.C23060u;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.C23073b;
import com.p280ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.commercialize.loft.LoftNestedRefreshLayout;
import com.p280ss.android.ugc.aweme.commercialize.loft.LoftPlayActivity;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.C24877b;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.C24877b.C24880b;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.C24891f;
import com.p280ss.android.ugc.aweme.commercialize.loft.model.Loft;
import com.p280ss.android.ugc.aweme.commercialize.loft.p1131b.C24858b;
import com.p280ss.android.ugc.aweme.commercialize.loft.p1131b.C24860d;
import com.p280ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController;
import com.p280ss.android.ugc.aweme.commercialize.loft.view.IntermediateStateViewController.ViewType;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1147h.C25692c;
import com.p280ss.android.ugc.aweme.discover.activity.HotSearchAndDiscoveryActivity;
import com.p280ss.android.ugc.aweme.discover.adapter.CategoryListAdapter;
import com.p280ss.android.ugc.aweme.discover.adapter.CategoryListAdapter.C26375a;
import com.p280ss.android.ugc.aweme.discover.adapter.CategoryListAdapter.C26376b;
import com.p280ss.android.ugc.aweme.discover.adapter.HotSearchImageViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.HotSearchWordViewHolder;
import com.p280ss.android.ugc.aweme.discover.adapter.HotVideoViewHolder;
import com.p280ss.android.ugc.aweme.discover.base.C26596c;
import com.p280ss.android.ugc.aweme.discover.base.LoadMoreAdapterWrapper;
import com.p280ss.android.ugc.aweme.discover.helper.C26654b;
import com.p280ss.android.ugc.aweme.discover.helper.C26656d;
import com.p280ss.android.ugc.aweme.discover.helper.ChangeCoverScrollListener;
import com.p280ss.android.ugc.aweme.discover.helper.OnCategoryScrollListener;
import com.p280ss.android.ugc.aweme.discover.helper.OnCategoryScrollListener.C26647a;
import com.p280ss.android.ugc.aweme.discover.mob.C26781b;
import com.p280ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p280ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel;
import com.p280ss.android.ugc.aweme.discover.widget.BannerSwipeRefreshLayout;
import com.p280ss.android.ugc.aweme.discover.widget.DiscoveryRecyclerView;
import com.p280ss.android.ugc.aweme.friends.adapter.DividerItemDecorationWithMargin;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.main.MainAnimViewModel;
import com.p280ss.android.ugc.aweme.main.experiment.C33002a;
import com.p280ss.android.ugc.aweme.main.experiment.C33003b;
import com.p280ss.android.ugc.aweme.performance.C7188c;
import com.p280ss.android.ugc.aweme.qrcode.QRCodePermissionActivity;
import com.p280ss.android.ugc.aweme.utils.C42980bm;
import com.p280ss.android.ugc.aweme.utils.C43051dc;
import com.p280ss.android.ugc.aweme.utils.C43122ff;
import com.p280ss.android.ugc.aweme.views.C43361b;
import com.p280ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.DiscoverFragment */
public class DiscoverFragment extends AmeBaseFragment implements C0053p<Boolean>, C24880b, C26376b, C26596c, C26647a {

    /* renamed from: e */
    protected SearchStateViewModel f70915e;

    /* renamed from: f */
    public IntermediateStateViewController f70916f;

    /* renamed from: g */
    public int f70917g;

    /* renamed from: h */
    public LoftNestedRefreshLayout f70918h;

    /* renamed from: i */
    private C1273i f70919i;

    /* renamed from: j */
    private AnalysisStayTimeFragmentComponent f70920j;

    /* renamed from: k */
    private int f70921k = 1;

    /* renamed from: l */
    private MainAnimViewModel f70922l;

    /* renamed from: m */
    private DiscoverViewModel f70923m;
    RelativeLayout mFlRootContainer;
    DiscoveryRecyclerView mListView;
    BannerSwipeRefreshLayout mRefreshLayout;
    View mStatusBar;
    DmtStatusView mStatusView;

    /* renamed from: n */
    private boolean f70924n;

    /* renamed from: o */
    private boolean f70925o;

    /* renamed from: p */
    private boolean f70926p;

    /* renamed from: q */
    private OnCategoryScrollListener f70927q;

    /* renamed from: r */
    private ChangeCoverScrollListener f70928r;

    /* renamed from: s */
    private long f70929s = -1;

    /* renamed from: t */
    private Handler f70930t = new Handler(Looper.getMainLooper());

    /* renamed from: u */
    private Style f70931u;

    /* renamed from: v */
    private boolean f70932v;

    /* renamed from: w */
    private boolean f70933w = true;

    /* renamed from: x */
    private long f70934x = SystemClock.elapsedRealtime();

    /* renamed from: y */
    private Bitmap f70935y;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.DiscoverFragment$Style */
    public enum Style {
        DISCOVER,
        DISCOVER_LEFT,
        HOT_SEARCH,
        HOT_SEARCH_WITH_DISCOVER,
        KEYWORD_SEARCH
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return false;
    }

    public final void aJ_() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo69560a(List list) {
        CategoryListAdapter categoryListAdapter = (CategoryListAdapter) ((LoadMoreAdapterWrapper) this.mListView.getAdapter()).f70112b;
        if (categoryListAdapter != null) {
            categoryListAdapter.mo67921a(list);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo69559a(Float f) {
        if (this.f70916f != null) {
            this.f70916f.mo65138a(f.floatValue());
        }
    }

    /* renamed from: a */
    public final void mo68280a(boolean z) {
        if (this.f70922l != null) {
            this.f70922l.f85653a.setValue(Boolean.valueOf(!z));
        }
        if (isViewValid() && this.mListView != null) {
            if (z || this.f70921k == 1) {
                CategoryListAdapter categoryListAdapter = (CategoryListAdapter) ((LoadMoreAdapterWrapper) this.mListView.getAdapter()).f70112b;
                if (categoryListAdapter != null) {
                    categoryListAdapter.mo67922a(z);
                }
                if (m88258t()) {
                    if (!z) {
                        this.f70929s = System.currentTimeMillis();
                    } else if (this.f70929s != -1) {
                        long currentTimeMillis = System.currentTimeMillis() - this.f70929s;
                        if (currentTimeMillis > 0) {
                            C1592h.m7855a((Callable<TResult>) new C27052j<TResult>(this, currentTimeMillis), (Executor) C6907h.m21516a());
                        }
                        this.f70929s = -1;
                    }
                }
                if (!z) {
                    C26781b.m87962a();
                }
            }
        }
    }

    /* renamed from: e */
    public final void mo69569e() {
        m88254p();
        m88253o();
    }

    /* renamed from: f */
    public final void mo69571f() {
        this.f70923m.mo69981a(false);
    }

    /* renamed from: k */
    private void m88249k() {
        if (this.f70926p) {
            m88256r();
            this.f70926p = false;
        }
    }

    /* renamed from: r */
    private void m88256r() {
        this.f70930t.removeCallbacksAndMessages(null);
        this.f70918h.setExpand(false);
    }

    /* renamed from: s */
    private void m88257s() {
        HotSearchAndDiscoveryActivity.m86689a(getContext(), true);
    }

    /* renamed from: t */
    private static boolean m88258t() {
        if (!C6399b.m19944t()) {
            return true;
        }
        return C33003b.m106651a();
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("discovery");
    }

    /* renamed from: m */
    private void m88251m() {
        if (this.mStatusView != null && this.mStatusView.mo25945i()) {
            this.mStatusView.setVisibility(4);
        }
    }

    /* renamed from: n */
    private void m88252n() {
        if (this.mStatusView != null && this.mStatusView.mo25945i()) {
            this.mStatusView.setVisibility(0);
        }
    }

    /* renamed from: q */
    private void m88255q() {
        if (!C6399b.m19944t()) {
            this.f70934x = SystemClock.elapsedRealtime();
            ((C24877b) C24877b.f65602l.mo65136a(getContext())).mo65117a((C24880b) this, (String) null);
        }
    }

    /* renamed from: b */
    public final void mo68340b() {
        if (this.f70931u == Style.HOT_SEARCH_WITH_DISCOVER && C26656d.m87587a() && this.f70921k == 1) {
            m88250l();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        ((C24877b) C24877b.f65602l.mo65136a(getContext())).mo65115a();
        this.f70930t.removeCallbacksAndMessages(null);
    }

    public void onDestroyView() {
        CategoryListAdapter categoryListAdapter = (CategoryListAdapter) ((LoadMoreAdapterWrapper) this.mListView.getAdapter()).f70112b;
        if (categoryListAdapter != null) {
            categoryListAdapter.mo67922a(true);
        }
        if (this.mListView != null) {
            this.mListView.setAdapter(null);
        }
        super.onDestroyView();
    }

    /* renamed from: l */
    private void m88250l() {
        if (this.f70933w) {
            this.f70933w = false;
        } else if (this.mListView != null) {
            C1293v f = this.mListView.mo5575f(0);
            if (f instanceof HotSearchImageViewHolder) {
                ((HotSearchImageViewHolder) f).mo67968d();
                return;
            }
            if (f instanceof HotSearchWordViewHolder) {
                ((HotSearchWordViewHolder) f).mo67915b();
            }
        }
    }

    /* renamed from: o */
    private void m88253o() {
        if (((this.mRefreshLayout != null && this.mRefreshLayout.isEnabled()) || (this.f70918h != null && this.f70918h.isEnabled())) && this.mStatusView != null && this.mStatusView.mo25940d(true)) {
            if (this.mStatusView.f29075b) {
                this.f70923m.mo69981a(true);
                return;
            }
            this.f70923m.mo69982a(true, true);
        }
    }

    /* renamed from: p */
    private void m88254p() {
        if (((this.mRefreshLayout != null && this.mRefreshLayout.isEnabled()) || (this.f70918h != null && this.f70918h.isEnabled())) && this.mStatusView != null && this.mStatusView.mo25940d(true)) {
            m88246f(true);
            m88255q();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo69572g() {
        if (!C27102w.m88905a(getContext())) {
            C10761a.m31399c(getContext(), (int) R.string.cjs).mo25750a();
            this.mRefreshLayout.setRefreshing(false);
            return;
        }
        mo69569e();
    }

    /* renamed from: i */
    private void m88247i() {
        this.f70923m = (DiscoverViewModel) C0069x.m157a((Fragment) this).mo147a(DiscoverViewModel.class);
        this.f70923m.f71733d.observe(this, new C27050h(this));
        this.f70923m.f71730a.observe(this, new C27051i(this));
        this.f70923m.f71731b.observe(this, new C27056n(this));
        this.f70923m.f71732c.observe(this, new C27057o(this));
        this.f70923m.f71734e.observe(this, new C27058p(this));
    }

    /* renamed from: j */
    private void m88248j() {
        this.mRefreshLayout.mo60699a(false, (int) C9738o.m28708b((Context) getActivity(), 49.0f), (int) C9738o.m28708b((Context) getActivity(), 113.0f));
        this.mRefreshLayout.setOnRefreshListener(new C27061s(this));
        if (this.f70918h != null) {
            this.f70918h.setIRefresh(new C24860d() {
                /* renamed from: e */
                public final void mo64996e() {
                    if (DiscoverFragment.this.f70916f != null) {
                        DiscoverFragment.this.f70916f.mo64996e();
                    }
                }

                /* renamed from: f */
                public final void mo64997f() {
                    if (DiscoverFragment.this.isViewValid()) {
                        if (!C27101v.m88904a(DiscoverFragment.this.getContext())) {
                            C10761a.m31399c(DiscoverFragment.this.getContext(), (int) R.string.cjs).mo25750a();
                            DiscoverFragment.this.f70918h.setRefreshing(false);
                            return;
                        }
                        DiscoverFragment.this.mo69569e();
                        if (DiscoverFragment.this.f70916f != null) {
                            DiscoverFragment.this.f70916f.mo64997f();
                        }
                    }
                }
            });
            this.f70918h.mo64894a((C24858b) new C24858b() {
                /* renamed from: d */
                public final void mo64994d() {
                    DiscoverFragment.this.mo69567d();
                }

                /* renamed from: c */
                public final void mo64993c() {
                    if (DiscoverFragment.this.f70916f != null) {
                        DiscoverFragment.this.f70916f.mo64993c();
                    }
                }

                /* renamed from: a */
                public final void mo64991a() {
                    C23060u.m75742a().mo60073c().mo59871a(Boolean.valueOf(false));
                    DiscoverFragment.this.mo69562b(((C24877b) C24877b.f65602l.mo65136a(DiscoverFragment.this.getContext())).f65604b);
                    if (DiscoverFragment.this.f70916f != null) {
                        DiscoverFragment.this.f70916f.mo64991a();
                    }
                }

                /* renamed from: b */
                public final void mo64992b() {
                    if (DiscoverFragment.this.f70916f != null) {
                        DiscoverFragment.this.f70916f.mo64992b();
                    }
                    Loft loft = ((C24877b) C24877b.f65602l.mo65136a(DiscoverFragment.this.getContext())).f65604b;
                    if (loft != null) {
                        C6907h.m21524a("enter_second_floor", (Map) C22984d.m75611a().mo59973a("enter_method", "slide_down").mo59973a("is_success", "success").mo59973a("enter_status", String.valueOf(loft.getStatus())).f60753a);
                    }
                }
            });
            this.f70918h.getTotalConsume().observe(this, new C27099t(this));
            mo69567d();
        }
    }

    /* renamed from: d */
    public final void mo69567d() {
        if (this.mRefreshLayout != null) {
            this.mRefreshLayout.setEnabled(!((C24877b) C24877b.f65602l.mo65136a(getContext())).mo65123b());
        }
        if (this.f70918h != null) {
            this.f70918h.setEnabled(((C24877b) C24877b.f65602l.mo65136a(getContext())).mo65123b());
            this.f70918h.setEnableExpand(((C24877b) C24877b.f65602l.mo65136a(getContext())).mo65126c());
        }
        mo69562b(((C24877b) C24877b.f65602l.mo65136a(getContext())).f65604b);
    }

    public void onPause() {
        super.onPause();
        C23060u.m75742a().mo60073c().mo59871a(Boolean.valueOf(false));
        if (this.f70921k == 1) {
            if (this.f70922l != null) {
                this.f70922l.f85653a.setValue(Boolean.valueOf(false));
            }
            if (this.f70920j != null) {
                this.f70920j.onPause();
            }
            if (!this.mHidden) {
                ((CategoryListAdapter) ((LoadMoreAdapterWrapper) this.mListView.getAdapter()).f70112b).mo67922a(true);
            }
        }
    }

    public void onResume() {
        boolean z;
        super.onResume();
        if (this.f70918h != null) {
            if (!((C24877b) C24877b.f65602l.mo65136a(getContext())).mo65123b() || this.f70921k != 1) {
                this.f70918h.setEnabled(false);
            } else {
                mo69567d();
            }
        }
        if (this.f70921k == 1) {
            if (this.f70920j != null) {
                this.f70920j.onResume();
            }
            CategoryListAdapter categoryListAdapter = (CategoryListAdapter) ((LoadMoreAdapterWrapper) this.mListView.getAdapter()).f70112b;
            if (getActivity() instanceof MainActivity) {
                z = ((MainActivity) getActivity()).isInDiscoveryPage();
            } else if (getActivity() instanceof DiscoverActivity) {
                z = true;
            } else {
                z = false;
            }
            if (!this.mHidden && z) {
                categoryListAdapter.mo67922a(false);
                if (this.f70927q != null && this.f70927q.mo68339a()) {
                    m88250l();
                }
                if (this.f70922l != null) {
                    this.f70922l.f85653a.setValue(Boolean.valueOf(true));
                }
            }
            if (!this.mHidden && C43051dc.m136580a()) {
                C26781b.m87962a();
            }
            m88249k();
            if (this.f70916f != null) {
                this.f70916f.mo65149n();
            }
            if (this.f70924n || this.f70925o) {
                m88240a(((C24877b) C24877b.f65602l.mo65136a(getContext())).f65604b, false);
                this.f70925o = false;
                this.f70924n = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo68279a(LoftNestedRefreshLayout loftNestedRefreshLayout) {
        this.f70918h = loftNestedRefreshLayout;
    }

    /* renamed from: b */
    public final void mo68282b(int i) {
        this.f70921k = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo69564c(View view) {
        mo69569e();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo69557a(C23073b bVar) {
        this.f70915e.hotSearchLiveData.setValue(bVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo69563b(Boolean bool) {
        m88242c(bool.booleanValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo69566c(Boolean bool) {
        m88244d(bool.booleanValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo69568d(Loft loft) {
        m88240a(loft, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo69556a(long j) throws Exception {
        C19282c.m63183a(getContext(), "stay_time", "discovery", j, 0);
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo69561b(View view) {
        if (this.f70924n) {
            m88256r();
            this.f70924n = false;
            this.f70926p = false;
        }
        m88249k();
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        mo68280a(!z);
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void onChanged(Boolean bool) {
        if (bool.booleanValue()) {
            m88252n();
        } else {
            m88251m();
        }
        m88241b(bool.booleanValue());
    }

    /* renamed from: e */
    private void m88245e(boolean z) {
        if (this.mRefreshLayout.isEnabled()) {
            this.mRefreshLayout.setRefreshing(false);
        }
        if (this.f70918h != null && this.f70918h.isEnabled()) {
            this.f70918h.setRefreshing(false);
        }
    }

    /* renamed from: f */
    private void m88246f(boolean z) {
        if (this.mRefreshLayout.isEnabled()) {
            this.mRefreshLayout.setSelected(z);
        }
        if (this.f70918h != null && this.f70918h.isEnabled()) {
            this.f70918h.setSelected(z);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo69565c(Loft loft) {
        if (isResumed()) {
            this.f70916f.mo65139a(loft);
            this.f70924n = true;
            this.f70930t.postDelayed(new C27055m(this, loft), 1000);
            return;
        }
        this.f70925o = true;
    }

    public void onCreate(Bundle bundle) {
        FragmentInstrumentation.onCreate("com.ss.android.ugc.aweme.discover.ui.DiscoverFragment");
        super.onCreate(bundle);
        this.f70915e = (SearchStateViewModel) C0069x.m159a(getActivity()).mo147a(SearchStateViewModel.class);
        m88247i();
    }

    /* renamed from: a */
    private void m88239a(Bundle bundle) {
        this.f70931u = (Style) bundle.getSerializable("discover_style");
        this.f70932v = bundle.getBoolean("discover_show_search_title_bar", true);
        if (this.f70931u == null) {
            this.f70931u = Style.HOT_SEARCH_WITH_DISCOVER;
        }
    }

    /* renamed from: b */
    private void m88241b(boolean z) {
        if (this.mListView != null) {
            if (this.f70927q != null) {
                OnCategoryScrollListener.m87556a(this.mListView, z);
            }
            int childCount = this.mListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1293v b = this.mListView.mo5539b(this.mListView.getChildAt(i));
                if ((b instanceof HotVideoViewHolder) && b.mItemViewType == C26375a.m86757c()) {
                    ((HotVideoViewHolder) b).mo67978a(z);
                }
            }
        }
    }

    /* renamed from: c */
    private void m88242c(boolean z) {
        if (isViewValid()) {
            m88246f(false);
            m88245e(false);
            if (this.mStatusView != null) {
                if (z) {
                    this.mStatusView.mo25938c(true);
                    return;
                }
                this.mStatusView.mo25934a(true);
            }
        }
    }

    /* renamed from: d */
    private void m88244d(boolean z) {
        LoadMoreAdapterWrapper loadMoreAdapterWrapper = (LoadMoreAdapterWrapper) this.mListView.getAdapter();
        if (z) {
            loadMoreAdapterWrapper.mo68263b(1);
        } else {
            loadMoreAdapterWrapper.mo68263b(2);
        }
    }

    /* renamed from: b */
    public final void mo69562b(Loft loft) {
        C6726a.m20844b(new C27100u(this, loft));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo69570e(Loft loft) {
        if (!(this.mListView == null || this.mListView.getAdapter() == null)) {
            CategoryListAdapter categoryListAdapter = (CategoryListAdapter) ((LoadMoreAdapterWrapper) this.mListView.getAdapter()).f70112b;
            if (!((C24877b) C24877b.f65602l.mo65136a(getContext())).mo65123b() || loft == null || loft.getGuide() == null) {
                categoryListAdapter.mo67919a(null, getActivity());
            } else {
                categoryListAdapter.mo67919a(new C24891f(loft.getGuide().getImageUrl(), loft.getGuide().getDesc(), this.f70918h.getTotalConsume(), (float) this.f70918h.getHeight()), getActivity());
            }
        }
    }

    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.amy) {
            C6907h.m21524a("qr_code_scan_enter", (Map) C22984d.m75611a().mo59973a("enter_from", "discovery").f60753a);
            QRCodePermissionActivity.m119022a(getContext(), false);
        } else if (id == R.id.e19 && !C43122ff.m136767b()) {
            C33002a.m106650a();
            C6907h.onEvent(MobClick.obtain().setEventName("enter_search").setLabelName("discovery"));
            m88257s();
        }
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (this.f70918h != null) {
            if (z) {
                this.f70918h.setEnabled(false);
            } else {
                mo69567d();
            }
        }
        if (isViewValid()) {
            if (z || this.f70921k == 1) {
                if (this.f70920j != null) {
                    this.f70920j.mo60573a(z);
                }
                if (!z && this.f70927q != null && this.f70927q.mo68339a()) {
                    m88250l();
                }
                if (this.f70922l != null) {
                    this.f70922l.f85653a.setValue(Boolean.valueOf(!z));
                }
                if (this.mListView != null) {
                    CategoryListAdapter categoryListAdapter = (CategoryListAdapter) ((LoadMoreAdapterWrapper) this.mListView.getAdapter()).f70112b;
                    if (categoryListAdapter != null) {
                        categoryListAdapter.mo67922a(z);
                    }
                    if (!z) {
                        C26781b.m87962a();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo67924a(View view) {
        if (isViewValid()) {
            this.mRefreshLayout.setHeader(view);
        }
    }

    /* renamed from: a */
    public final void mo64889a(Loft loft) {
        if (getActivity() != null) {
            C6907h.m21524a("loft_load", (Map) C22984d.m75611a().mo59971a("duration", SystemClock.elapsedRealtime() - this.f70934x).mo59973a("activity_id", loft.getId()).mo59970a("status", 0).f60753a);
            if (this.f70916f == null) {
                this.f70916f = new IntermediateStateViewController(getActivity(), this.f70918h.f65399a, true);
                this.f70918h.setHeader(this.f70916f.mo65150o());
                this.f70916f.mo65140a(loft, ViewType.SECOND_LOFT, (OnClickListener) new C27053k(this));
                this.f70916f.f65673c = new C27054l(this, loft);
            }
            this.f70916f.f65674d = loft;
            mo69567d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo69558a(Boolean bool) {
        LoadMoreAdapterWrapper loadMoreAdapterWrapper = (LoadMoreAdapterWrapper) this.mListView.getAdapter();
        if (!bool.booleanValue()) {
            loadMoreAdapterWrapper.mo68263b(3);
        }
    }

    /* renamed from: a */
    public static DiscoverFragment m88238a(Style style, boolean z) {
        DiscoverFragment discoverFragment = new DiscoverFragment();
        Bundle bundle = new Bundle(1);
        bundle.putSerializable("discover_style", style);
        bundle.putBoolean("discover_show_search_title_bar", z);
        discoverFragment.setArguments(bundle);
        return discoverFragment;
    }

    /* renamed from: a */
    private void m88240a(Loft loft, boolean z) {
        Bitmap bitmap;
        if (getActivity() != null && loft != null && !TextUtils.isEmpty(loft.getId()) && isResumed()) {
            this.f70926p = true;
            this.f70924n = false;
            if (this.f70935y == null) {
                getActivity().getWindow().getDecorView().setDrawingCacheEnabled(true);
                this.f70935y = getActivity().getWindow().getDecorView().getDrawingCache();
            }
            Context context = getContext();
            String id = loft.getId();
            Integer valueOf = Integer.valueOf(0);
            if (z) {
                bitmap = this.f70935y;
            } else {
                bitmap = null;
            }
            LoftPlayActivity.m81481a(context, id, valueOf, bitmap);
        }
    }

    /* renamed from: a */
    public final void mo64887a(int i, Throwable th) {
        if (th == null) {
            C6907h.m21524a("loft_load", (Map) C22984d.m75611a().mo59970a("status", i).f60753a);
        } else if (th instanceof BaseException) {
            BaseException baseException = (BaseException) th;
            C6907h.m21524a("loft_load", (Map) C22984d.m75611a().mo59970a("status", i).mo59970a("error_code", baseException.getErrorCode()).mo59973a("error_msg", baseException.getErrorMessage()).f60753a);
        } else {
            C6907h.m21524a("loft_load", (Map) C22984d.m75611a().mo59970a("status", i).mo59973a("error_msg", th.getMessage()).f60753a);
        }
        mo69567d();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m88239a(getArguments());
        C10805b a = C43361b.m137644a(getActivity(), new C27059q(this));
        DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
        dmtDefaultView.setSupportDelayVisible(true);
        dmtDefaultView.setStatus(a);
        if (this.mStatusView != null) {
            this.mStatusView.setBuilder(C10803a.m31631a((Context) getActivity()).mo25954a((int) R.string.bzv).mo25966c((View) dmtDefaultView));
            this.mStatusView.setUseScreenHeight(getContext().getResources().getDimensionPixelSize(R.dimen.ml));
        }
        if (C26654b.m87574b()) {
            WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(getContext(), 2);
            wrapGridLayoutManager.f4721g = new C1241a() {
                /* renamed from: a */
                public final int mo5386a(int i) {
                    if (DiscoverFragment.this.mListView != null && !((CategoryListAdapter) ((LoadMoreAdapterWrapper) DiscoverFragment.this.mListView.getAdapter()).f70112b).mo67923b(i)) {
                        return 2;
                    }
                    return 1;
                }
            };
            this.f70919i = wrapGridLayoutManager;
            this.mListView.setLayoutManager(this.f70919i);
        } else {
            this.f70919i = new WrapLinearLayoutManager(getContext(), 1, false);
            this.mListView.setLayoutManager(this.f70919i);
        }
        this.mListView.getItemAnimator().f4943l = 0;
        this.mListView.setLabel("discover_list");
        C42980bm.m136450a("discover_list").mo104686a((RecyclerView) this.mListView);
        CategoryListAdapter categoryListAdapter = new CategoryListAdapter(this);
        categoryListAdapter.mo67920a((C26376b) this);
        this.f70927q = new OnCategoryScrollListener();
        this.f70927q.f70263a = this;
        this.mListView.mo5528a((C1281m) this.f70927q);
        this.f70928r = new ChangeCoverScrollListener();
        this.mListView.mo5528a((C1281m) this.f70928r);
        LoadMoreAdapterWrapper loadMoreAdapterWrapper = new LoadMoreAdapterWrapper(categoryListAdapter);
        loadMoreAdapterWrapper.mo68262a(new C27060r(this));
        this.mListView.setAdapter(loadMoreAdapterWrapper);
        if (C7188c.m22428a()) {
            this.mListView.mo5528a((C1281m) new C1281m() {
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    super.onScrollStateChanged(recyclerView, i);
                    switch (i) {
                        case 0:
                            if (C13380c.m39172c().mo33189e()) {
                                C13380c.m39172c().mo33186d();
                                break;
                            }
                            break;
                        case 1:
                            if (DiscoverFragment.this.f70917g != 2) {
                                if (C13380c.m39172c().mo33189e()) {
                                    C13380c.m39172c().mo33186d();
                                    break;
                                }
                            } else {
                                C13380c.m39172c().mo33183c();
                                break;
                            }
                            break;
                        case 2:
                            C13380c.m39172c().mo33183c();
                            break;
                    }
                    DiscoverFragment.this.f70917g = i;
                }
            });
        }
        if (!C26654b.m87574b()) {
            DiscoveryRecyclerView discoveryRecyclerView = this.mListView;
            C268843 r0 = new DividerItemDecorationWithMargin(getResources().getColor(R.color.a4o), (int) C9738o.m28708b(getContext(), 16.0f), (int) C9738o.m28708b(getContext(), 16.0f), 1, categoryListAdapter) {

                /* renamed from: a */
                final /* synthetic */ CategoryListAdapter f70938a;

                public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1290s sVar) {
                    int f = RecyclerView.m5892f(view);
                    if (f > 0 && f < this.f70938a.getItemCount() && this.f70938a.getItemViewType(f) == C26375a.m86755a()) {
                        super.getItemOffsets(rect, view, recyclerView, sVar);
                    }
                }

                {
                    this.f70938a = r6;
                }
            };
            discoveryRecyclerView.mo5525a((C1272h) r0);
        }
        m88248j();
        mo69569e();
        C25692c.m84440a(this.mListView, categoryListAdapter);
        this.f70922l = (MainAnimViewModel) C0069x.m159a(getActivity()).mo147a(MainAnimViewModel.class);
        this.f70922l.f85653a.observe(this, this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.nv, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        if (!m88258t()) {
            this.f70920j = new AnalysisStayTimeFragmentComponent(this, true);
        }
        return inflate;
    }
}
