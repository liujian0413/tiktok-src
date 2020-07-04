package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1280l;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.router.SmartRouter;
import com.p280ss.android.ugc.aweme.app.api.C6866d;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.awemeservice.api.IAwemeService;
import com.p280ss.android.ugc.aweme.awemeservice.api.IRequestIdService;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.base.p1058c.C23281a;
import com.p280ss.android.ugc.aweme.challenge.C23685d;
import com.p280ss.android.ugc.aweme.challenge.adapter.DetailAwemeAdapter;
import com.p280ss.android.ugc.aweme.challenge.adapter.DetailAwemeViewHolder;
import com.p280ss.android.ugc.aweme.challenge.p1082a.C23660c;
import com.p280ss.android.ugc.aweme.common.C25640a;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.adapter.AnimatedAdapter;
import com.p280ss.android.ugc.aweme.common.adapter.AnimatedViewHolder;
import com.p280ss.android.ugc.aweme.common.adapter.C25650d;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1142c.C25657a;
import com.p280ss.android.ugc.aweme.common.p1142c.C25663d;
import com.p280ss.android.ugc.aweme.common.p1144e.C25673a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.common.p1144e.C25676d;
import com.p280ss.android.ugc.aweme.common.widget.scrollablelayout.C25765b.C25766a;
import com.p280ss.android.ugc.aweme.detail.C26060f;
import com.p280ss.android.ugc.aweme.detail.C26116k;
import com.p280ss.android.ugc.aweme.discover.model.Challenge;
import com.p280ss.android.ugc.aweme.feed.event.C28318an;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.p280ss.android.ugc.aweme.feed.model.Aweme;
import com.p280ss.android.ugc.aweme.feed.p1226b.C28229b;
import com.p280ss.android.ugc.aweme.feed.p1234j.C28503s;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29961b;
import com.p280ss.android.ugc.aweme.framework.p312a.C6921a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.metrics.C33230ac;
import com.p280ss.android.ugc.aweme.metrics.C33246ar;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.p280ss.android.ugc.aweme.performance.C7188c;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.p1480a.C35663a;
import com.p280ss.android.ugc.aweme.setting.C37656k;
import com.p280ss.android.ugc.aweme.utils.C42961az;
import com.p280ss.android.ugc.aweme.utils.C42980bm;
import com.p280ss.android.ugc.aweme.utils.C43060dk;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetProxyTimeoutExperiment;
import com.p280ss.android.ugc.aweme.views.FpsRecyclerView;
import com.p280ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.C7709l;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment */
public class DetailAwemeListFragment extends AmeBaseFragment implements C23685d, C6905a, C25663d<AnimatedViewHolder>, C25676d, C25766a, C26060f, C28532n {

    /* renamed from: A */
    private String f62584A;

    /* renamed from: B */
    private SparseArray<C25674b> f62585B = new SparseArray<>();

    /* renamed from: e */
    public int f62586e;

    /* renamed from: f */
    public String f62587f;

    /* renamed from: g */
    public C25674b f62588g;

    /* renamed from: h */
    public String f62589h;

    /* renamed from: i */
    public boolean f62590i;

    /* renamed from: j */
    public float f62591j;

    /* renamed from: k */
    protected DetailAwemeAdapter f62592k;

    /* renamed from: l */
    public C23742a f62593l;

    /* renamed from: m */
    public int f62594m;
    public RecyclerView mListView;
    DmtStatusView mStatusView;
    FrameLayout mStatusViewContainer;

    /* renamed from: n */
    public C26116k f62595n;

    /* renamed from: o */
    public Challenge f62596o;

    /* renamed from: p */
    public boolean f62597p;

    /* renamed from: q */
    public boolean f62598q;

    /* renamed from: r */
    public SparseArray<DetailAwemeAdapter> f62599r = new SparseArray<>();

    /* renamed from: s */
    public SparseBooleanArray f62600s = new SparseBooleanArray();

    /* renamed from: t */
    public SparseBooleanArray f62601t = new SparseBooleanArray();

    /* renamed from: u */
    public SparseArray<DmtStatusView> f62602u = new SparseArray<>();

    /* renamed from: v */
    public DetailAwemeListProvider f62603v;

    /* renamed from: w */
    private int f62604w = 3;

    /* renamed from: x */
    private String f62605x;

    /* renamed from: y */
    private String f62606y;

    /* renamed from: z */
    private C25657a f62607z;

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment$DetailAwemeListProvider */
    public interface DetailAwemeListProvider extends Serializable {
        C23743b getJumpToVideoParam(C23743b bVar, Aweme aweme);

        C25674b getPresenter(int i, FragmentActivity fragmentActivity);

        DetailAwemeViewHolder onCreateDetailAwemeViewHolder(View view, String str, C23685d dVar);

        boolean sendCustomRequest(C25674b bVar, int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment$a */
    public interface C23742a {
        /* renamed from: b */
        boolean mo61761b(int i);
    }

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.DetailAwemeListFragment$b */
    public static class C23743b {

        /* renamed from: a */
        public String f62612a = "";

        /* renamed from: b */
        public String f62613b = "";

        /* renamed from: c */
        public String f62614c = "";

        /* renamed from: d */
        public String f62615d = "";

        /* renamed from: e */
        public String f62616e = "";

        /* renamed from: f */
        public int f62617f;
    }

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo61742a(List list, int i) {
    }

    public final void aP_() {
        bd_();
    }

    /* renamed from: j */
    public final View mo61750j() {
        return this.mListView;
    }

    /* renamed from: a */
    public final boolean mo61744a() {
        return this.f62600s.get(this.f62586e, true);
    }

    /* renamed from: a */
    public final void mo61741a(String str) {
        this.f62587f = str;
        this.f62590i = false;
    }

    /* renamed from: a */
    public final void mo61739a(View view, View view2) {
        view2.setOnClickListener(new C23805q(this));
        this.mStatusView.setBuilder(C10803a.m31631a(getContext()).mo25963b(view).mo25966c(view2));
        this.mStatusView.mo25943g();
    }

    /* renamed from: a */
    private void m77814a(boolean z, long j) {
        if (isViewValid()) {
            mo61746b(false);
            m77823v();
            if (this.f62588g != null && !TextUtils.isEmpty(this.f62587f)) {
                if (this.f62603v == null || !this.f62603v.sendCustomRequest(this.f62588g, 1)) {
                    this.f62588g.mo56976a(Integer.valueOf(1), this.f62587f, Integer.valueOf(this.f62594m), Boolean.valueOf(this.f62590i));
                }
                if (z) {
                    this.mStatusView.mo25942f();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo61743a(boolean z, boolean z2) {
        if (this.f62607z != null) {
            this.f62607z.mo66545a(z, z2);
        }
    }

    /* renamed from: a */
    public final void mo61615a(View view, Aweme aweme, String str) {
        if (!(C27326a.m89578a(view) || aweme == null || getActivity() == null)) {
            C23743b bVar = new C23743b();
            bVar.f62614c = str;
            if (!(!C33230ac.m107228g(m77824w()) || !C6399b.m19944t() || aweme == null || this.f62592k == null || this.f62592k.f67539l == null)) {
                int indexOf = this.f62592k.f67539l.indexOf(aweme);
                if (indexOf >= 0) {
                    bVar.f62617f = indexOf;
                }
                bVar.f62616e = this.f62589h;
                bVar.f62615d = this.f62587f;
            }
            C23743b jumpToVideoParam = this.f62603v.getJumpToVideoParam(bVar, aweme);
            if (this.f62588g.mo66539h() != null) {
                List<Aweme> items = ((C25673a) this.f62588g.mo66539h()).getItems();
                if (items != null) {
                    for (Aweme aweme2 : items) {
                        if (aweme2 != null) {
                            aweme2.setFromRawChallenge(this.f62596o);
                        }
                    }
                    ((C25673a) this.f62588g.mo66539h()).setItems(items);
                }
                C28503s.m93679a((C25673a) this.f62588g.mo66539h());
            }
            SmartRouter.buildRoute((Context) getActivity(), "aweme://aweme/detail/").withParam("id", aweme.getAid()).withParam("refer", jumpToVideoParam.f62614c).withParam("previous_page", this.f62606y).withParam("com.ss.android.ugc.aweme.intent.extra.EVENT_TYPE", "").withParam("video_from", jumpToVideoParam.f62612a).withParam("video_challenge_profile_from", m77822u() ? this.f62606y : "").withParam("video_type", this.f62586e).withParam("profile_enterprise_type", aweme.getEnterpriseType()).withParam("process_id", this.f62589h).withParam(jumpToVideoParam.f62613b, this.f62587f).open(10086);
            C28229b.m92772a(aweme);
        }
    }

    /* renamed from: a */
    public final void mo59100a(boolean z) {
        m77812a((AnimatedAdapter) this.f62592k, z);
    }

    /* renamed from: v */
    private void m77823v() {
        this.f62594m = this.f62586e;
    }

    /* renamed from: o */
    private DetailAwemeAdapter m77816o() {
        return new DetailAwemeAdapter(this.f62605x, this, this, this.f62603v);
    }

    /* renamed from: t */
    private void m77821t() {
        if (this.f62607z != null) {
            this.f62607z.mo66544a();
        }
    }

    /* renamed from: u */
    private boolean m77822u() {
        if (this.f62586e == 3 || this.f62586e == 2) {
            return true;
        }
        return false;
    }

    public final boolean aR_() {
        return this.f62601t.get(this.f62586e, true);
    }

    /* renamed from: n */
    public final List<Aweme> mo61754n() {
        if (this.f62592k != null) {
            return this.f62592k.f67539l;
        }
        return null;
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f62588g != null) {
            this.f62588g.mo59134U_();
        }
        m77821t();
    }

    public void onResume() {
        super.onResume();
        if (this.mUserVisibleHint) {
            mo61743a(false, true);
        }
    }

    /* renamed from: d */
    public final void mo61748d() {
        boolean z;
        if (isViewValid()) {
            if (!this.mStatusView.f29075b || mo61744a()) {
                z = true;
            } else {
                z = false;
            }
            m77814a(z, 0);
        }
    }

    /* renamed from: k */
    public final void mo61751k() {
        if (isViewValid() && this.mListView.getChildCount() > 0) {
            this.mListView.mo5561d(0);
        }
    }

    /* renamed from: l */
    public final JSONObject mo61752l() {
        JSONObject jSONObject = new JSONObject();
        String str = "";
        try {
            C25640a h = this.f62588g.mo66539h();
            if (h instanceof C6866d) {
                str = ((C6866d) h).getRequestId();
            }
            jSONObject.put("request_id", str);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: m */
    public final String mo61753m() {
        String str = "";
        try {
            C25640a h = this.f62588g.mo66539h();
            if (h instanceof C6866d) {
                return ((C6866d) h).getRequestId();
            }
            return str;
        } catch (Exception unused) {
            return str;
        }
    }

    public void onPause() {
        super.onPause();
        if (this.mUserVisibleHint) {
            m77821t();
        }
        try {
            m77817p();
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
        }
    }

    public void onStop() {
        try {
            m77817p();
        } catch (Exception e) {
            C6921a.m21559a((Throwable) e);
        }
        super.onStop();
        if (this.mUserVisibleHint) {
            m77821t();
        }
    }

    /* renamed from: p */
    private void m77817p() throws Exception {
        if (this.mListView != null && isViewValid()) {
            int childCount = this.mListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = this.mListView.getChildAt(i);
                if (childAt != null) {
                    C1293v b = this.mListView.mo5539b(childAt);
                    if (b != null && b.mItemViewType == 0) {
                        ((C25650d) b).mo66499j();
                    }
                }
            }
        }
    }

    /* renamed from: r */
    private void m77819r() {
        DmtTextView b = m77815b((int) R.string.c48);
        b.setOnClickListener(new C23806r(this));
        this.mStatusView.setBuilder(C10803a.m31631a(getContext()).mo25963b((View) m77815b((int) R.string.b13)).mo25966c((View) b));
    }

    /* renamed from: s */
    private void m77820s() {
        DetailAwemeAdapter detailAwemeAdapter = this.f62592k;
        if (isViewValid() && this.mListView != null && this.f62592k != null && !detailAwemeAdapter.f62385e) {
            detailAwemeAdapter.f62385e = true;
            int childCount = this.mListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1293v f = this.mListView.mo5575f(i);
                if (f instanceof DetailAwemeViewHolder) {
                    DetailAwemeViewHolder detailAwemeViewHolder = (DetailAwemeViewHolder) f;
                    detailAwemeViewHolder.mo61582c();
                    mo61737a((AnimatedViewHolder) detailAwemeViewHolder);
                }
            }
        }
    }

    /* renamed from: w */
    private String m77824w() {
        int i = this.f62586e;
        if (i == 15) {
            return "prop_page";
        }
        if (i == 20) {
            return "mv_page";
        }
        switch (i) {
            case 0:
            case 1:
                return "single_song";
            case 2:
            case 3:
                return "challenge";
            case 4:
                return "poi_page";
            default:
                return null;
        }
    }

    /* renamed from: g */
    public final void mo61749g() {
        if (isViewValid()) {
            if (!this.mUserVisibleHint || !C37656k.m120485a(getContext()) || !C23807s.m78016a(getActivity())) {
                m77821t();
            } else {
                mo61743a(false, false);
            }
        }
    }

    /* renamed from: q */
    private void m77818q() {
        OnAnimatedScrollListener onAnimatedScrollListener;
        m77819r();
        this.mListView.setLayoutManager(new WrapGridLayoutManager((Context) getActivity(), this.f62604w, 1, false));
        this.mListView.setOverScrollMode(2);
        this.mListView.mo5525a((C1272h) new DetailDecoration((int) C9738o.m28708b(getContext(), 1.0f), this.f62604w));
        this.mListView.mo5527a((C1280l) new C1280l() {
            /* renamed from: a */
            public final void mo5689a(boolean z) {
            }

            /* renamed from: b */
            public final void mo5691b(RecyclerView recyclerView, MotionEvent motionEvent) {
            }

            /* renamed from: a */
            public final boolean mo5690a(RecyclerView recyclerView, MotionEvent motionEvent) {
                switch (motionEvent.getAction()) {
                    case 0:
                        DetailAwemeListFragment.this.f62591j = motionEvent.getY();
                        break;
                    case 1:
                        DetailAwemeListFragment.this.f62591j = motionEvent.getY() - DetailAwemeListFragment.this.f62591j;
                        if (DetailAwemeListFragment.this.f62591j <= 10.0f) {
                            if (DetailAwemeListFragment.this.f62591j < -10.0f && C6399b.m19944t()) {
                                C6907h.m21524a("tag_detail_slide_up", (Map) C22984d.m75611a().mo59973a("process_id", DetailAwemeListFragment.this.f62589h).mo59973a("tag_id", DetailAwemeListFragment.this.f62587f).f60753a);
                                break;
                            }
                        } else if (C6399b.m19944t()) {
                            C6907h.m21524a("tag_detail_slide_down", (Map) C22984d.m75611a().mo59973a("process_id", DetailAwemeListFragment.this.f62589h).mo59973a("tag_id", DetailAwemeListFragment.this.f62587f).f60753a);
                            break;
                        }
                        break;
                }
                return false;
            }
        });
        if (!C7188c.m22428a()) {
            onAnimatedScrollListener = new OnAnimatedScrollListener();
            this.mListView.mo5528a((C1281m) onAnimatedScrollListener);
        } else {
            onAnimatedScrollListener = null;
        }
        this.f62607z = new C25657a(this.mListView, onAnimatedScrollListener);
        this.mListView = C43060dk.m136608a(this.mListView, this);
        if (this.mListView instanceof FpsRecyclerView) {
            ((FpsRecyclerView) this.mListView).setLabel("detail_list");
        }
        C42980bm.m136450a(this.f62605x).mo104686a(this.mListView);
        m77826y();
        m77825x();
    }

    /* renamed from: x */
    private void m77825x() {
        if (this.mStatusViewContainer != null) {
            if (this.f62602u.size() == 0) {
                this.f62602u.put(this.f62586e, this.mStatusView);
                return;
            }
            if (this.mStatusView != null) {
                this.mStatusView.setAlpha(0.0f);
            }
            this.mStatusView = (DmtStatusView) this.f62602u.get(this.f62586e);
            if (this.mStatusView == null) {
                this.mStatusView = new DmtStatusView(this.mStatusViewContainer.getContext());
                m77819r();
                this.mStatusViewContainer.addView(this.mStatusView, new LayoutParams(-1, -1));
                this.f62602u.put(this.f62586e, this.mStatusView);
                return;
            }
            this.mStatusView.setAlpha(1.0f);
        }
    }

    public final void bd_() {
        m77823v();
        if (this.f62588g != null && !TextUtils.isEmpty(this.f62587f) && (this.f62603v == null || !this.f62603v.sendCustomRequest(this.f62588g, 4))) {
            if (!this.f62590i || TextUtils.isEmpty(this.f62584A)) {
                this.f62588g.mo56976a(Integer.valueOf(4), this.f62587f, Integer.valueOf(this.f62594m), Boolean.valueOf(false));
                return;
            }
            this.f62588g.mo56976a(Integer.valueOf(4), this.f62584A, Integer.valueOf(this.f62594m), Boolean.valueOf(true));
        }
    }

    /* renamed from: y */
    private void m77826y() {
        boolean z;
        this.f62588g = (C25674b) this.f62585B.get(this.f62586e);
        if (this.f62588g == null) {
            this.f62588g = this.f62603v.getPresenter(this.f62586e, getActivity());
            if (this.f62588g != null) {
                this.f62588g.mo66537a(new C25675c<Aweme>() {

                    /* renamed from: a */
                    final int f62610a = DetailAwemeListFragment.this.f62586e;

                    public final void aE_() {
                    }

                    /* renamed from: c */
                    public final void mo59109c(Exception exc) {
                    }

                    /* renamed from: c */
                    public final void mo59110c(List<Aweme> list, boolean z) {
                    }

                    /* renamed from: S_ */
                    public final void mo59098S_() {
                        DmtStatusView e = m77851e();
                        if (e != null && !e.f29075b) {
                            e.mo25942f();
                        }
                    }

                    public final void aD_() {
                        AnimatedAdapter animatedAdapter = (AnimatedAdapter) DetailAwemeListFragment.this.f62599r.get(this.f62610a);
                        if (animatedAdapter != null) {
                            animatedAdapter.ag_();
                        }
                    }

                    /* renamed from: e */
                    private DmtStatusView m77851e() {
                        if (!DetailAwemeListFragment.this.isViewValid()) {
                            return null;
                        }
                        if (DetailAwemeListFragment.this.mStatusViewContainer == null) {
                            return DetailAwemeListFragment.this.mStatusView;
                        }
                        return (DmtStatusView) DetailAwemeListFragment.this.f62602u.get(this.f62610a);
                    }

                    public final void ae_() {
                        if (DetailAwemeListFragment.this.isViewValid()) {
                            DmtStatusView e = m77851e();
                            if (DetailAwemeListFragment.this.f62593l != null) {
                                DetailAwemeListFragment.this.f62593l.mo61761b(DetailAwemeListFragment.this.f62586e);
                            } else if (e != null) {
                                e.mo25943g();
                            }
                            if (DetailAwemeListFragment.this.f62595n != null && DetailAwemeListFragment.this.f62586e == this.f62610a) {
                                DetailAwemeListFragment.this.f62595n.mo61715a(DetailAwemeListFragment.this.mo61744a(), false);
                            }
                            DetailAwemeListFragment.this.f62600s.put(this.f62610a, false);
                        }
                    }

                    /* renamed from: b */
                    public final void mo59107b(Exception exc) {
                        AnimatedAdapter animatedAdapter = (AnimatedAdapter) DetailAwemeListFragment.this.f62599r.get(this.f62610a);
                        if (animatedAdapter != null) {
                            animatedAdapter.mo66507h();
                        }
                    }

                    /* renamed from: a_ */
                    public final void mo59105a_(Exception exc) {
                        if (DetailAwemeListFragment.this.isViewValid()) {
                            DmtStatusView e = m77851e();
                            if (e != null) {
                                e.mo25944h();
                            }
                            if (DetailAwemeListFragment.this.f62595n != null && DetailAwemeListFragment.this.f62586e == this.f62610a) {
                                DetailAwemeListFragment.this.f62595n.mo61715a(DetailAwemeListFragment.this.mo61744a(), false);
                            }
                            DetailAwemeListFragment.this.f62600s.put(this.f62610a, false);
                        }
                    }

                    /* renamed from: a */
                    public final void mo59099a(List<Aweme> list, boolean z) {
                        if (DetailAwemeListFragment.this.isViewValid()) {
                            AnimatedAdapter animatedAdapter = (AnimatedAdapter) DetailAwemeListFragment.this.f62599r.get(this.f62610a);
                            DmtStatusView e = m77851e();
                            if (!(animatedAdapter == null || e == null)) {
                                animatedAdapter.ai_();
                                animatedAdapter.mo58045a(DetailAwemeListFragment.m77810a(list));
                                if (!C6307b.m19566a((Collection<T>) list)) {
                                    e.mo25950n();
                                }
                                e.setVisibility(4);
                                if (!z) {
                                    animatedAdapter.mo66516d(false);
                                    animatedAdapter.mo66504a((C6905a) null);
                                }
                            }
                            DetailAwemeListFragment.this.f62601t.put(this.f62610a, z);
                            if (DetailAwemeListFragment.this.f62595n != null && DetailAwemeListFragment.this.f62586e == this.f62610a) {
                                DetailAwemeListFragment.this.f62595n.mo61715a(DetailAwemeListFragment.this.mo61744a(), true);
                            }
                            DetailAwemeListFragment.this.f62600s.put(this.f62610a, false);
                            if (DetailAwemeListFragment.this.mUserVisibleHint && DetailAwemeListFragment.this.f62586e == this.f62610a) {
                                DetailAwemeListFragment.this.mo61743a(false, false);
                            }
                        }
                    }

                    /* renamed from: b */
                    public final void mo59108b(List<Aweme> list, boolean z) {
                        if (DetailAwemeListFragment.this.isViewValid()) {
                            if (list == null) {
                                list = new ArrayList<>();
                            }
                            AnimatedAdapter animatedAdapter = (AnimatedAdapter) DetailAwemeListFragment.this.f62599r.get(this.f62610a);
                            DmtStatusView e = m77851e();
                            if (!(animatedAdapter == null || e == null)) {
                                animatedAdapter.ai_();
                                if (!C6307b.m19566a((Collection<T>) list) || !z) {
                                    List list2 = animatedAdapter.f67539l;
                                    if (list2 == null || list2.size() != list.size() || !list2.containsAll(list)) {
                                        animatedAdapter.mo61577b(DetailAwemeListFragment.m77810a(list));
                                    }
                                    e.setVisibility(4);
                                    DetailAwemeListFragment.this.f62601t.put(this.f62610a, z);
                                    DetailAwemeListFragment.this.mo59100a(z);
                                } else {
                                    if (DetailAwemeListFragment.this.f62586e == this.f62610a) {
                                        DetailAwemeListFragment.this.bd_();
                                    }
                                }
                            }
                        }
                    }
                });
                this.f62588g.mo66568a((C25676d) this);
                this.f62585B.put(this.f62586e, this.f62588g);
            }
            z = true;
        } else {
            z = false;
        }
        this.f62592k = (DetailAwemeAdapter) this.f62599r.get(this.f62586e);
        if (this.f62592k == null) {
            this.f62592k = m77816o();
            this.f62592k.mo66504a((C6905a) this);
            this.f62592k.f67552s = "detail_list";
            this.f62592k.f62385e = this.f62597p;
            this.f62599r.put(this.f62586e, this.f62592k);
            z = true;
        }
        this.mListView.setAdapter(this.f62592k);
        this.f62592k.f62385e = this.f62597p;
        if (!C23807s.m78016a(getActivity())) {
            C10761a.m31399c((Context) getActivity(), (int) R.string.cjs).mo25750a();
        } else if (!this.f62598q && z) {
            mo61748d();
        } else if (!this.mUserVisibleHint || !mo61744a()) {
            if (this.mUserVisibleHint) {
                mo61743a(false, false);
            }
        } else {
            mo61748d();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo61738a(View view) {
        mo61748d();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo61745b(View view) {
        mo61748d();
    }

    @C7709l
    public void onBlockUserEvent(C35663a aVar) {
        mo61748d();
    }

    /* renamed from: b */
    public final void mo61746b(boolean z) {
        this.f62600s.put(this.f62586e, z);
    }

    /* renamed from: a */
    public final void mo61740a(C26116k kVar) {
        this.f62595n = kVar;
    }

    @C7709l
    public void onDynamicEvent(C23660c cVar) {
        if (cVar.f62378a == 0) {
            mo61743a(true, false);
        } else {
            m77821t();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (bundle != null) {
            bundle.putSerializable("provider", this.f62603v);
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            m77820s();
        }
    }

    /* renamed from: c_ */
    public final void mo61747c_(int i) {
        if (isViewValid()) {
            this.f62592k.notifyItemRemoved(i);
            if (this.f62592k.mo60557c() == 0) {
                this.mStatusView.setVisibility(0);
                this.mStatusView.mo25943g();
            }
        }
    }

    @C7709l
    public void onAntiCrawlerEvent(C23281a aVar) {
        String str = aVar.f61317a;
        if (str == null) {
            return;
        }
        if (str.contains("/aweme/v1/challenge/aweme/?") || str.contains("/aweme/v1/music/fresh/aweme/?")) {
            C42961az.m136385f(aVar);
            mo61748d();
        }
    }

    @C7709l
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (isViewValid() && this.f62592k != null) {
            this.f62592k.mo66490a(followStatus);
        }
    }

    @C7709l
    public void onVideoEvent(C28318an anVar) {
        if (anVar.f74631a == 2) {
            this.f62588g.mo66569a((Object) ((IAwemeService) ServiceManager.get().getService(IAwemeService.class)).getAwemeById((String) anVar.f74632b));
        }
    }

    /* renamed from: b */
    private DmtTextView m77815b(int i) {
        DmtTextView dmtTextView = new DmtTextView(new ContextThemeWrapper(getContext(), R.style.ss));
        dmtTextView.setTextColor(getResources().getColor(R.color.a51));
        dmtTextView.setText(i);
        return dmtTextView;
    }

    /* renamed from: a */
    public static List<Aweme> m77810a(List<Aweme> list) {
        ArrayList arrayList = new ArrayList();
        if (C6307b.m19566a((Collection<T>) list)) {
            return arrayList;
        }
        for (Aweme aweme : list) {
            if (aweme != null && !aweme.isAd()) {
                arrayList.add(aweme);
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    private void m77811a(Bundle bundle) {
        if (bundle != null) {
            this.f62586e = bundle.getInt("detail_aweme_list_type", 0);
            this.f62605x = bundle.getString("event_label", "");
            this.f62587f = bundle.getString("detail_id", "");
            this.f62606y = bundle.getString("detail_aweme_from", "");
            this.f62589h = bundle.getString("process_id", "");
            this.f62590i = bundle.getBoolean("extra_challenge_is_hashtag", false);
            this.f62584A = bundle.getString("extra_challenge_hashtag_name", "");
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo61737a(AnimatedViewHolder animatedViewHolder) {
        int i;
        int i2;
        String w = m77824w();
        DetailAwemeViewHolder detailAwemeViewHolder = (DetailAwemeViewHolder) animatedViewHolder;
        if (detailAwemeViewHolder != null && detailAwemeViewHolder.mo66487d() != null) {
            if (!C6399b.m19944t()) {
                if (C6319n.m19594a(w, "single_song")) {
                    i2 = this.f62586e + 4000;
                } else if (C6319n.m19594a(w, "prop_page")) {
                    i2 = this.f62586e + VideoCacheTTnetProxyTimeoutExperiment.DEFAULT;
                } else if (C6319n.m19594a(w, "mv_page")) {
                    i2 = this.f62586e + 11000;
                } else if (C6319n.m19594a(w, "poi_page")) {
                    i = 10;
                    C6907h.m21521a(getContext(), "show", w, detailAwemeViewHolder.mo66487d().getAid(), this.f62587f, ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestIdAndOrderJsonObject(detailAwemeViewHolder.mo66487d(), i));
                    new C33246ar().mo85126a(w).mo85129c(this.f62587f).mo85128c(detailAwemeViewHolder.mo66487d(), i).mo85252e();
                    return;
                } else {
                    i2 = this.f62586e + 3000;
                }
                i = i2;
                C6907h.m21521a(getContext(), "show", w, detailAwemeViewHolder.mo66487d().getAid(), this.f62587f, ((IRequestIdService) ServiceManager.get().getService(IRequestIdService.class)).getRequestIdAndOrderJsonObject(detailAwemeViewHolder.mo66487d(), i));
                new C33246ar().mo85126a(w).mo85129c(this.f62587f).mo85128c(detailAwemeViewHolder.mo66487d(), i).mo85252e();
                return;
            }
            if (C33230ac.m107228g(m77824w()) || C6319n.m19594a(w, "poi_page")) {
                int i3 = this.f62586e;
                if (C6319n.m19594a(w, "poi_page")) {
                    i3 = 10;
                }
                if (!(detailAwemeViewHolder.mo66487d() == null || this.f62592k == null || this.f62592k.f67539l == null)) {
                    int indexOf = this.f62592k.f67539l.indexOf(detailAwemeViewHolder.mo66487d());
                    if (indexOf >= 0) {
                        new C33246ar().mo85126a(m77824w()).mo85131e(String.valueOf(indexOf)).mo85130d(this.f62589h).mo85132f(this.f62587f).mo85128c(detailAwemeViewHolder.mo66487d(), i3).mo85252e();
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private static void m77812a(AnimatedAdapter animatedAdapter, boolean z) {
        if (!z) {
            animatedAdapter.mo66504a((C6905a) null);
            if (C6399b.m19944t()) {
                animatedAdapter.mo66516d(false);
            } else {
                animatedAdapter.mo66516d(true);
                animatedAdapter.ah_();
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        LayoutParams layoutParams = (LayoutParams) this.mStatusView.getLayoutParams();
        layoutParams.topMargin = C29961b.m98232a(getContext(), 80.0f);
        this.mStatusView.setLayoutParams(layoutParams);
        if (this.f62603v == null && bundle != null) {
            Serializable serializable = bundle.getSerializable("provider");
            if (serializable != null && (serializable instanceof DetailAwemeListProvider)) {
                this.f62603v = (DetailAwemeListProvider) serializable;
            }
        }
        m77818q();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.nt, viewGroup, false);
        m77811a(getArguments());
        return inflate;
    }

    /* renamed from: a */
    public static DetailAwemeListFragment m77807a(int i, String str, String str2, String str3, DetailAwemeListProvider detailAwemeListProvider) {
        DetailAwemeListFragment detailAwemeListFragment = new DetailAwemeListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("detail_aweme_list_type", i);
        bundle.putString("event_label", str);
        bundle.putString("detail_id", str2);
        bundle.putString("detail_aweme_from", str3);
        detailAwemeListFragment.setArguments(bundle);
        detailAwemeListFragment.f62603v = detailAwemeListProvider;
        return detailAwemeListFragment;
    }

    /* renamed from: a */
    public static DetailAwemeListFragment m77808a(int i, String str, String str2, boolean z, String str3, String str4, DetailAwemeListProvider detailAwemeListProvider) {
        DetailAwemeListFragment detailAwemeListFragment = new DetailAwemeListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("detail_aweme_list_type", i);
        bundle.putString("event_label", str);
        bundle.putString("detail_id", str2);
        bundle.putBoolean("extra_challenge_is_hashtag", false);
        bundle.putString("extra_challenge_hashtag_name", str3);
        bundle.putString("detail_aweme_from", str4);
        detailAwemeListFragment.setArguments(bundle);
        detailAwemeListFragment.f62603v = detailAwemeListProvider;
        return detailAwemeListFragment;
    }

    /* renamed from: a */
    public static DetailAwemeListFragment m77809a(int i, String str, String str2, boolean z, String str3, String str4, String str5, DetailAwemeListProvider detailAwemeListProvider) {
        DetailAwemeListFragment detailAwemeListFragment = new DetailAwemeListFragment();
        Bundle bundle = new Bundle();
        bundle.putInt("detail_aweme_list_type", 2);
        bundle.putString("event_label", str);
        bundle.putString("detail_id", str2);
        bundle.putBoolean("extra_challenge_is_hashtag", z);
        bundle.putString("extra_challenge_hashtag_name", str3);
        bundle.putString("detail_aweme_from", str4);
        bundle.putString("process_id", str5);
        detailAwemeListFragment.setArguments(bundle);
        detailAwemeListFragment.f62603v = detailAwemeListProvider;
        return detailAwemeListFragment;
    }
}
