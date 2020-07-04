package com.p280ss.android.ugc.aweme.tutorial;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.widget.SwipeRefreshLayout;
import android.support.p022v4.widget.SwipeRefreshLayout.C1032b;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.C6311g;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.widget.GridSpacingItemDecoration;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper;
import com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS;
import com.p280ss.android.ugc.aweme.tutorial.net.C42674a;
import com.p280ss.android.ugc.aweme.tutorial.p1683a.C42665a;
import com.p280ss.android.ugc.aweme.tutorial.p1683a.C42670e;
import com.p280ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.tutorial.TutorialCategoryFragment */
public final class TutorialCategoryFragment extends Fragment {

    /* renamed from: a */
    private RecyclerView f110865a;

    /* renamed from: b */
    private SwipeRefreshLayout f110866b;

    /* renamed from: c */
    private DmtStatusView f110867c;

    /* renamed from: d */
    private String f110868d;

    /* renamed from: e */
    private int f110869e;

    /* renamed from: f */
    private final int f110870f = 10;

    /* renamed from: g */
    private int f110871g;

    /* renamed from: h */
    private int f110872h;

    /* renamed from: i */
    private final C42674a f110873i = new C42674a();

    /* renamed from: j */
    private TutorialRecyclerViewAdapter f110874j;

    /* renamed from: k */
    private boolean f110875k;

    /* renamed from: l */
    private boolean f110876l = true;

    /* renamed from: m */
    private HashMap f110877m;

    /* renamed from: com.ss.android.ugc.aweme.tutorial.TutorialCategoryFragment$a */
    static final class C42653a implements C1032b {

        /* renamed from: a */
        final /* synthetic */ TutorialCategoryFragment f110878a;

        C42653a(TutorialCategoryFragment tutorialCategoryFragment) {
            this.f110878a = tutorialCategoryFragment;
        }

        public final void onRefresh() {
            this.f110878a.mo104262b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.TutorialCategoryFragment$b */
    static final class C42654b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ TutorialCategoryFragment f110879a;

        C42654b(TutorialCategoryFragment tutorialCategoryFragment) {
            this.f110879a = tutorialCategoryFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f110879a.mo104259a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.TutorialCategoryFragment$c */
    static final class C42655c implements C6905a {

        /* renamed from: a */
        final /* synthetic */ TutorialCategoryFragment f110880a;

        C42655c(TutorialCategoryFragment tutorialCategoryFragment) {
            this.f110880a = tutorialCategoryFragment;
        }

        public final void bd_() {
            this.f110880a.mo104259a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.TutorialCategoryFragment$d */
    static final class C42656d<T> implements C0053p<LiveDataWrapper<C42670e>> {

        /* renamed from: a */
        final /* synthetic */ TutorialCategoryFragment f110881a;

        C42656d(TutorialCategoryFragment tutorialCategoryFragment) {
            this.f110881a = tutorialCategoryFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(LiveDataWrapper<C42670e> liveDataWrapper) {
            this.f110881a.mo104260a(liveDataWrapper);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.TutorialCategoryFragment$e */
    static final class C42657e<T> implements C0053p<LiveDataWrapper<C42670e>> {

        /* renamed from: a */
        final /* synthetic */ TutorialCategoryFragment f110882a;

        C42657e(TutorialCategoryFragment tutorialCategoryFragment) {
            this.f110882a = tutorialCategoryFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(LiveDataWrapper<C42670e> liveDataWrapper) {
            this.f110882a.mo104263b(liveDataWrapper);
        }
    }

    /* renamed from: c */
    private void m135471c() {
        if (this.f110877m != null) {
            this.f110877m.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        m135471c();
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public final void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    /* renamed from: a */
    public final void mo104260a(LiveDataWrapper<C42670e> liveDataWrapper) {
        boolean z;
        if (liveDataWrapper != null) {
            C42670e eVar = (C42670e) liveDataWrapper.f88767a;
            boolean z2 = false;
            if (eVar != null) {
                z = eVar.f110930e < this.f110872h;
                if (eVar.f110930e == 0) {
                    z2 = true;
                }
            } else {
                z = false;
            }
            if (this.f110875k && !z2) {
                m135467a(liveDataWrapper, z);
            } else if (liveDataWrapper.f88768b == STATUS.LOADING) {
                DmtStatusView dmtStatusView = this.f110867c;
                if (dmtStatusView == null) {
                    C7573i.m23583a("statusView");
                }
                dmtStatusView.mo25942f();
            } else if (liveDataWrapper.f88768b == STATUS.ERROR) {
                DmtStatusView dmtStatusView2 = this.f110867c;
                if (dmtStatusView2 == null) {
                    C7573i.m23583a("statusView");
                }
                dmtStatusView2.mo25944h();
            } else {
                if (liveDataWrapper.f88768b == STATUS.SUCCESS) {
                    C42670e eVar2 = (C42670e) liveDataWrapper.f88767a;
                    if (eVar2 == null || eVar2.f110928c != 0) {
                        DmtStatusView dmtStatusView3 = this.f110867c;
                        if (dmtStatusView3 == null) {
                            C7573i.m23583a("statusView");
                        }
                        dmtStatusView3.mo25944h();
                        return;
                    }
                    m135469a((C42670e) liveDataWrapper.f88767a, z);
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo104262b() {
        SwipeRefreshLayout swipeRefreshLayout = this.f110866b;
        if (swipeRefreshLayout == null) {
            C7573i.m23583a("refreshView");
        }
        swipeRefreshLayout.setRefreshing(true);
        C0052o a = C42674a.m135522a(this.f110869e, 0, this.f110870f);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        a.observe(activity, new C42657e(this));
    }

    /* renamed from: a */
    public final void mo104259a() {
        if (this.f110876l) {
            C0052o a = this.f110873i.mo104284a(this.f110869e, this.f110871g, this.f110870f, this.f110872h);
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            a.observe(activity, new C42656d(this));
        } else if (C6399b.m19944t()) {
            TutorialRecyclerViewAdapter tutorialRecyclerViewAdapter = this.f110874j;
            if (tutorialRecyclerViewAdapter == null) {
                C7573i.m23583a("tutorialListAdapter");
            }
            tutorialRecyclerViewAdapter.ai_();
        } else {
            TutorialRecyclerViewAdapter tutorialRecyclerViewAdapter2 = this.f110874j;
            if (tutorialRecyclerViewAdapter2 == null) {
                C7573i.m23583a("tutorialListAdapter");
            }
            tutorialRecyclerViewAdapter2.ah_();
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            mo104259a();
        }
    }

    /* renamed from: a */
    private final void m135468a(C42670e eVar) {
        if (eVar != null) {
            TutorialRecyclerViewAdapter tutorialRecyclerViewAdapter = this.f110874j;
            if (tutorialRecyclerViewAdapter == null) {
                C7573i.m23583a("tutorialListAdapter");
            }
            tutorialRecyclerViewAdapter.ai_();
            DmtStatusView dmtStatusView = this.f110867c;
            if (dmtStatusView == null) {
                C7573i.m23583a("statusView");
            }
            dmtStatusView.mo25939d();
            this.f110871g = (int) eVar.f110926a;
            this.f110876l = eVar.f110927b;
            TutorialRecyclerViewAdapter tutorialRecyclerViewAdapter2 = this.f110874j;
            if (tutorialRecyclerViewAdapter2 == null) {
                C7573i.m23583a("tutorialListAdapter");
            }
            tutorialRecyclerViewAdapter2.mo66502g();
            TutorialRecyclerViewAdapter tutorialRecyclerViewAdapter3 = this.f110874j;
            if (tutorialRecyclerViewAdapter3 == null) {
                C7573i.m23583a("tutorialListAdapter");
            }
            tutorialRecyclerViewAdapter3.mo104268e(eVar.f110929d);
            TutorialRecyclerViewAdapter tutorialRecyclerViewAdapter4 = this.f110874j;
            if (tutorialRecyclerViewAdapter4 == null) {
                C7573i.m23583a("tutorialListAdapter");
            }
            tutorialRecyclerViewAdapter4.notifyDataSetChanged();
            if (C6311g.m19573a(eVar.f110929d)) {
                DmtStatusView dmtStatusView2 = this.f110867c;
                if (dmtStatusView2 == null) {
                    C7573i.m23583a("statusView");
                }
                dmtStatusView2.mo25943g();
                return;
            }
            RecyclerView recyclerView = this.f110865a;
            if (recyclerView == null) {
                C7573i.m23583a("tutorialRecyclerView");
            }
            recyclerView.mo5541b(0);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        if (((com.p280ss.android.ugc.aweme.tutorial.p1683a.C42670e) r0).f110928c != 0) goto L_0x0036;
     */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo104263b(com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper<com.p280ss.android.ugc.aweme.tutorial.p1683a.C42670e> r4) {
        /*
            r3 = this;
            if (r4 != 0) goto L_0x0003
            return
        L_0x0003:
            com.ss.android.ugc.aweme.mvp.model.LiveDataWrapper$STATUS r0 = r4.f88768b
            com.ss.android.ugc.aweme.mvp.model.LiveDataWrapper$STATUS r1 = com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS.ERROR
            r2 = 0
            if (r0 == r1) goto L_0x0036
            M r0 = r4.f88767a
            if (r0 == 0) goto L_0x001c
            M r0 = r4.f88767a
            if (r0 != 0) goto L_0x0015
            kotlin.jvm.internal.C7573i.m23580a()
        L_0x0015:
            com.ss.android.ugc.aweme.tutorial.a.e r0 = (com.p280ss.android.ugc.aweme.tutorial.p1683a.C42670e) r0
            int r0 = r0.f110928c
            if (r0 == 0) goto L_0x001c
            goto L_0x0036
        L_0x001c:
            com.ss.android.ugc.aweme.mvp.model.LiveDataWrapper$STATUS r0 = r4.f88768b
            com.ss.android.ugc.aweme.mvp.model.LiveDataWrapper$STATUS r1 = com.p280ss.android.ugc.aweme.mvp.model.LiveDataWrapper.STATUS.SUCCESS
            if (r0 != r1) goto L_0x0035
            android.support.v4.widget.SwipeRefreshLayout r0 = r3.f110866b
            if (r0 != 0) goto L_0x002b
            java.lang.String r1 = "refreshView"
            kotlin.jvm.internal.C7573i.m23583a(r1)
        L_0x002b:
            r0.setRefreshing(r2)
            M r4 = r4.f88767a
            com.ss.android.ugc.aweme.tutorial.a.e r4 = (com.p280ss.android.ugc.aweme.tutorial.p1683a.C42670e) r4
            r3.m135468a(r4)
        L_0x0035:
            return
        L_0x0036:
            android.support.v4.widget.SwipeRefreshLayout r4 = r3.f110866b
            if (r4 != 0) goto L_0x003f
            java.lang.String r0 = "refreshView"
            kotlin.jvm.internal.C7573i.m23583a(r0)
        L_0x003f:
            r4.setRefreshing(r2)
            android.support.v4.app.FragmentActivity r4 = r3.getActivity()
            android.content.Context r4 = (android.content.Context) r4
            r0 = 2131829143(0x7f112197, float:1.9291247E38)
            com.bytedance.ies.dmt.ui.c.a r4 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31392b(r4, r0, r2)
            r4.mo25750a()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.tutorial.TutorialCategoryFragment.mo104263b(com.ss.android.ugc.aweme.mvp.model.LiveDataWrapper):void");
    }

    /* renamed from: a */
    private final void m135466a(View view) {
        View findViewById = view.findViewById(R.id.a4y);
        C7573i.m23582a((Object) findViewById, "rootView.findViewById(R.…ial_category_load_status)");
        this.f110867c = (DmtStatusView) findViewById;
        View findViewById2 = view.findViewById(R.id.a4z);
        C7573i.m23582a((Object) findViewById2, "rootView.findViewById(R.…l_category_recycler_view)");
        this.f110865a = (RecyclerView) findViewById2;
        View findViewById3 = view.findViewById(R.id.a52);
        C7573i.m23582a((Object) findViewById3, "rootView.findViewById(R.…reation_tutorial_refresh)");
        this.f110866b = (SwipeRefreshLayout) findViewById3;
        SwipeRefreshLayout swipeRefreshLayout = this.f110866b;
        if (swipeRefreshLayout == null) {
            C7573i.m23583a("refreshView");
        }
        swipeRefreshLayout.setOnRefreshListener(new C42653a(this));
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(getContext(), 2, 1, false);
        RecyclerView recyclerView = this.f110865a;
        if (recyclerView == null) {
            C7573i.m23583a("tutorialRecyclerView");
        }
        recyclerView.setItemViewCacheSize(2);
        RecyclerView recyclerView2 = this.f110865a;
        if (recyclerView2 == null) {
            C7573i.m23583a("tutorialRecyclerView");
        }
        recyclerView2.setLayoutManager(wrapGridLayoutManager);
        RecyclerView recyclerView3 = this.f110865a;
        if (recyclerView3 == null) {
            C7573i.m23583a("tutorialRecyclerView");
        }
        recyclerView3.mo5525a((C1272h) new GridSpacingItemDecoration(2, (int) C9738o.m28708b(getContext(), 1.0f), false));
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C7573i.m23580a();
        }
        C7573i.m23582a((Object) activity, "activity!!");
        this.f110874j = new TutorialRecyclerViewAdapter(activity);
        TutorialRecyclerViewAdapter tutorialRecyclerViewAdapter = this.f110874j;
        if (tutorialRecyclerViewAdapter == null) {
            C7573i.m23583a("tutorialListAdapter");
        }
        tutorialRecyclerViewAdapter.mo66516d(true);
        RecyclerView recyclerView4 = this.f110865a;
        if (recyclerView4 == null) {
            C7573i.m23583a("tutorialRecyclerView");
        }
        TutorialRecyclerViewAdapter tutorialRecyclerViewAdapter2 = this.f110874j;
        if (tutorialRecyclerViewAdapter2 == null) {
            C7573i.m23583a("tutorialListAdapter");
        }
        recyclerView4.setAdapter(tutorialRecyclerViewAdapter2);
        DmtStatusView dmtStatusView = this.f110867c;
        if (dmtStatusView == null) {
            C7573i.m23583a("statusView");
        }
        dmtStatusView.setBuilder(C10803a.m31631a(getContext()).mo25957a(R.string.fi5, R.string.fi2, R.string.fia, new C42654b(this)).mo25954a((int) R.string.bzv).mo25965c(1));
        TutorialRecyclerViewAdapter tutorialRecyclerViewAdapter3 = this.f110874j;
        if (tutorialRecyclerViewAdapter3 == null) {
            C7573i.m23583a("tutorialListAdapter");
        }
        tutorialRecyclerViewAdapter3.mo66504a((C6905a) new C42655c(this));
    }

    /* renamed from: a */
    private final void m135469a(C42670e eVar, boolean z) {
        if (eVar != null) {
            if (C6311g.m19573a(eVar.f110929d)) {
                DmtStatusView dmtStatusView = this.f110867c;
                if (dmtStatusView == null) {
                    C7573i.m23583a("statusView");
                }
                dmtStatusView.mo25943g();
            } else {
                DmtStatusView dmtStatusView2 = this.f110867c;
                if (dmtStatusView2 == null) {
                    C7573i.m23583a("statusView");
                }
                dmtStatusView2.mo25939d();
                this.f110875k = true;
            }
            m135470a(eVar, z, eVar.f110930e);
        }
    }

    /* renamed from: a */
    private final void m135467a(LiveDataWrapper<C42670e> liveDataWrapper, boolean z) {
        ArrayList<C42665a> arrayList;
        if (liveDataWrapper != null) {
            if (liveDataWrapper.f88768b == STATUS.LOADING) {
                TutorialRecyclerViewAdapter tutorialRecyclerViewAdapter = this.f110874j;
                if (tutorialRecyclerViewAdapter == null) {
                    C7573i.m23583a("tutorialListAdapter");
                }
                tutorialRecyclerViewAdapter.ag_();
                return;
            }
            if (liveDataWrapper.f88768b != STATUS.ERROR) {
                C42670e eVar = (C42670e) liveDataWrapper.f88767a;
                if (eVar != null && eVar.f110928c == 0) {
                    if (liveDataWrapper.f88768b == STATUS.SUCCESS) {
                        C42670e eVar2 = (C42670e) liveDataWrapper.f88767a;
                        if (eVar2 != null) {
                            arrayList = eVar2.f110929d;
                        } else {
                            arrayList = null;
                        }
                        if (!C6311g.m19573a(arrayList)) {
                            TutorialRecyclerViewAdapter tutorialRecyclerViewAdapter2 = this.f110874j;
                            if (tutorialRecyclerViewAdapter2 == null) {
                                C7573i.m23583a("tutorialListAdapter");
                            }
                            tutorialRecyclerViewAdapter2.ai_();
                            M m = liveDataWrapper.f88767a;
                            if (m == null) {
                                C7573i.m23580a();
                            }
                            C7573i.m23582a((Object) m, "liveDataWrapper.response!!");
                            C42670e eVar3 = (C42670e) m;
                            M m2 = liveDataWrapper.f88767a;
                            if (m2 == null) {
                                C7573i.m23580a();
                            }
                            m135470a(eVar3, z, ((C42670e) m2).f110930e);
                        } else if (C6399b.m19944t()) {
                            TutorialRecyclerViewAdapter tutorialRecyclerViewAdapter3 = this.f110874j;
                            if (tutorialRecyclerViewAdapter3 == null) {
                                C7573i.m23583a("tutorialListAdapter");
                            }
                            tutorialRecyclerViewAdapter3.ai_();
                            return;
                        } else {
                            TutorialRecyclerViewAdapter tutorialRecyclerViewAdapter4 = this.f110874j;
                            if (tutorialRecyclerViewAdapter4 == null) {
                                C7573i.m23583a("tutorialListAdapter");
                            }
                            tutorialRecyclerViewAdapter4.ah_();
                            return;
                        }
                    }
                    return;
                }
            }
            TutorialRecyclerViewAdapter tutorialRecyclerViewAdapter5 = this.f110874j;
            if (tutorialRecyclerViewAdapter5 == null) {
                C7573i.m23583a("tutorialListAdapter");
            }
            tutorialRecyclerViewAdapter5.mo66507h();
        }
    }

    /* renamed from: a */
    public final void mo104261a(String str, int i, int i2) {
        C7573i.m23587b(str, "categoryName");
        this.f110868d = str;
        this.f110869e = i;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C7573i.m23587b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.iv, viewGroup, false);
        C7573i.m23582a((Object) inflate, "view");
        m135466a(inflate);
        return inflate;
    }

    /* renamed from: a */
    private final void m135470a(C42670e eVar, boolean z, int i) {
        int i2;
        if (z) {
            TutorialRecyclerViewAdapter tutorialRecyclerViewAdapter = this.f110874j;
            if (tutorialRecyclerViewAdapter == null) {
                C7573i.m23583a("tutorialListAdapter");
            }
            i2 = tutorialRecyclerViewAdapter.mo104267a(i, (List<C42665a>) eVar.f110929d);
        } else {
            TutorialRecyclerViewAdapter tutorialRecyclerViewAdapter2 = this.f110874j;
            if (tutorialRecyclerViewAdapter2 == null) {
                C7573i.m23583a("tutorialListAdapter");
            }
            tutorialRecyclerViewAdapter2.mo104268e(eVar.f110929d);
            i2 = eVar.f110929d.size();
            this.f110872h++;
        }
        this.f110871g = (int) eVar.f110926a;
        this.f110876l = eVar.f110927b;
        if (i2 == eVar.f110929d.size()) {
            TutorialRecyclerViewAdapter tutorialRecyclerViewAdapter3 = this.f110874j;
            if (tutorialRecyclerViewAdapter3 == null) {
                C7573i.m23583a("tutorialListAdapter");
            }
            tutorialRecyclerViewAdapter3.notifyItemRangeChanged((int) (eVar.f110926a - ((long) eVar.f110929d.size())), i2);
            return;
        }
        TutorialRecyclerViewAdapter tutorialRecyclerViewAdapter4 = this.f110874j;
        if (tutorialRecyclerViewAdapter4 == null) {
            C7573i.m23583a("tutorialListAdapter");
        }
        tutorialRecyclerViewAdapter4.notifyDataSetChanged();
    }
}
