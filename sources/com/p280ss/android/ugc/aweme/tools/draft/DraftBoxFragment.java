package com.p280ss.android.ugc.aweme.tools.draft;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p022v4.view.C0991u;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.titlebar.ButtonTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.dmt.p262ui.widget.util.C10834d;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.facebook.common.references.C13326a;
import com.facebook.imagepipeline.p720g.C13645c;
import com.p280ss.android.p281a.p282a.p283a.C6726a;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.fragment.AmeBaseFragment;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.draft.model.C27311c;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.services.IMainService;
import com.p280ss.android.ugc.aweme.services.draft.IDraftService.DraftListener;
import com.p280ss.android.ugc.aweme.services.draft.IDraftService.DraftListenerAdapter;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41530am;
import com.p280ss.android.ugc.aweme.tools.C42130a;
import com.p280ss.android.ugc.aweme.tools.draft.p1666a.C42276b;
import com.p280ss.android.ugc.aweme.views.DividerItemDecoration;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.WeakHashMap;

/* renamed from: com.ss.android.ugc.aweme.tools.draft.DraftBoxFragment */
public class DraftBoxFragment extends AmeBaseFragment {

    /* renamed from: e */
    View f109998e;

    /* renamed from: f */
    ButtonTitleBar f109999f;

    /* renamed from: g */
    DmtStatusView f110000g;

    /* renamed from: h */
    RecyclerView f110001h;

    /* renamed from: i */
    TextView f110002i;

    /* renamed from: j */
    public TextView f110003j;

    /* renamed from: k */
    FrameLayout f110004k;

    /* renamed from: l */
    public boolean f110005l;

    /* renamed from: m */
    public AwemeDraftAdapter f110006m;

    /* renamed from: n */
    public Set<C27311c> f110007n = new HashSet();

    /* renamed from: o */
    private boolean f110008o;

    /* renamed from: p */
    private boolean f110009p;

    /* renamed from: q */
    private Map<ImageView, C13326a<C13645c>> f110010q = new WeakHashMap();

    /* renamed from: r */
    private ObjectAnimator f110011r;

    /* renamed from: s */
    private ObjectAnimator f110012s;

    /* renamed from: t */
    private DraftListener f110013t = new DraftListenerAdapter() {
        public final void onDraftDelete(C27311c cVar) {
            if (cVar != null) {
                DraftBoxFragment.this.f110006m.mo103713a(cVar.mo70221aj());
            }
        }

        public final void onDraftUpdate(C27311c cVar) {
            if (DraftBoxFragment.this.isViewValid()) {
                DraftBoxFragment.this.f110006m.mo103715c(cVar);
            }
        }

        public final void onDraftCheckedChanged(C27311c cVar, boolean z) {
            if (z) {
                DraftBoxFragment.this.f110007n.add(cVar);
            } else {
                DraftBoxFragment.this.f110007n.remove(cVar);
            }
            DraftBoxFragment.this.f110002i.setText(C1642a.m8034a(DraftBoxFragment.this.getString(R.string.o1), new Object[]{Integer.valueOf(DraftBoxFragment.this.f110007n.size())}));
            if (DraftBoxFragment.this.f110005l) {
                DraftBoxFragment.this.f110003j.setText(C1642a.m8034a(DraftBoxFragment.this.getString(R.string.dqj), new Object[]{DraftBoxFragment.this.mo103738a()}));
            }
            if (DraftBoxFragment.this.f110007n.size() <= 0) {
                DraftBoxFragment.this.mo103746g();
                return;
            }
            if (DraftBoxFragment.this.f110004k.getVisibility() != 0) {
                DraftBoxFragment.this.mo103745f();
            }
        }
    };

    /* renamed from: d */
    public final void mo103743d() {
        mo103749k();
    }

    /* renamed from: m */
    private void m134457m() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f110005l = arguments.getBoolean("is_disk_manage_mode", false);
        }
    }

    /* renamed from: q */
    private String m134461q() {
        if (this.f110005l) {
            return "storage_management";
        }
        return "personal_homepage";
    }

    /* renamed from: t */
    private static boolean m134464t() {
        return C35574k.m114859a().mo70110y().mo83122g();
    }

    /* access modifiers changed from: private */
    /* renamed from: w */
    public void mo103749k() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: e */
    public final void mo103744e() {
        this.f110008o = !this.f110008o;
        m134466v();
    }

    /* renamed from: n */
    private void m134458n() {
        if (this.f110011r != null) {
            this.f110011r.removeAllListeners();
            this.f110011r.cancel();
        }
        if (this.f110012s != null) {
            this.f110012s.removeAllListeners();
            this.f110012s.cancel();
        }
    }

    /* renamed from: o */
    private void m134459o() {
        this.f110000g.mo25942f();
        C42130a.m134090a().execute(new C42293j(this));
    }

    /* renamed from: p */
    private void m134460p() {
        C41530am.m132280a("Before DraftDataProvider.getDraftData()");
        ArrayList a = C42298o.m134544a();
        C41530am.m132280a("After DraftDataProvider.getDraftData()");
        m134453b((List<C27311c>) a);
    }

    /* renamed from: i */
    public final void mo103747i() {
        if (this.f110008o) {
            this.f110008o = false;
            mo103746g();
            m134466v();
            return;
        }
        mo103749k();
    }

    public void onDestroyView() {
        ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().unregisterDraftListener(this.f110013t);
        m134458n();
        super.onDestroyView();
    }

    public void onStart() {
        super.onStart();
        mo103746g();
        if (this.f110006m != null) {
            this.f110006m.mo66502g();
        }
        m134459o();
    }

    /* renamed from: l */
    private void m134456l() {
        if (this.f110005l) {
            LayoutParams layoutParams = (LayoutParams) this.f110004k.getLayoutParams();
            layoutParams.height = Math.round(C9738o.m28708b(getContext(), 60.0f));
            this.f110004k.setLayoutParams(layoutParams);
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.f110002i.getLayoutParams();
        layoutParams2.gravity = 17;
        layoutParams2.topMargin = 0;
        this.f110002i.setLayoutParams(layoutParams2);
    }

    /* renamed from: u */
    private void m134465u() {
        new C10741a(getContext()).mo25657b((int) R.string.anw).mo25658b((int) R.string.ve, (OnClickListener) null).mo25650a((int) R.string.anl, (OnClickListener) new C42296m(this)).mo25656a().mo25637a();
    }

    /* renamed from: f */
    public final void mo103745f() {
        if (this.f110004k.getVisibility() != 0) {
            this.f110012s = ObjectAnimator.ofFloat(this.f110004k, "translationY", new float[]{(float) this.f110004k.getMeasuredHeight(), 0.0f}).setDuration(200);
            this.f110012s.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    DraftBoxFragment.this.f110004k.setVisibility(0);
                }
            });
            this.f110012s.start();
        }
    }

    /* renamed from: g */
    public final void mo103746g() {
        this.f110007n.clear();
        if (this.f110004k.getVisibility() != 8) {
            this.f110011r = ObjectAnimator.ofFloat(this.f110004k, "translationY", new float[]{(float) this.f110004k.getMeasuredHeight()}).setDuration(200);
            this.f110011r.addListener(new AnimatorListenerAdapter() {
                public final void onAnimationEnd(Animator animator) {
                    DraftBoxFragment.this.f110004k.setVisibility(8);
                }
            });
            this.f110011r.start();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo103748j() {
        if (C42276b.m134489a()) {
            m134452a(((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().getPublishingDraftKey());
        } else {
            m134460p();
        }
    }

    public void onDestroy() {
        for (C13326a close : this.f110010q.values()) {
            close.close();
        }
        this.f110010q.clear();
        super.onDestroy();
    }

    /* renamed from: v */
    private void m134466v() {
        if (this.f110008o) {
            this.f109999f.getEndBtn().setText(getText(R.string.nz));
            this.f109999f.getStartBtn().setVisibility(8);
            this.f109999f.getTitleView().setVisibility(8);
        } else {
            this.f109999f.getEndBtn().setText(getText(R.string.o0));
            this.f109999f.getStartBtn().setVisibility(0);
            this.f109999f.getTitleView().setVisibility(0);
            mo103746g();
        }
        this.f110006m.mo103714a(this.f110008o);
    }

    /* renamed from: a */
    public final String mo103738a() {
        long j = 0;
        for (C27311c cVar : this.f110007n) {
            j += cVar.f72057z;
        }
        return C42276b.m134486a(j, false);
    }

    /* renamed from: r */
    private void m134462r() {
        if (VERSION.SDK_INT >= 19) {
            FragmentActivity activity = getActivity();
            if (activity != null) {
                this.f109998e.getLayoutParams().height = C10994a.m32204a((Context) activity);
            }
        }
        this.f109999f.setTitle(getText(R.string.aw4));
        this.f109999f.getStartBtn().setVisibility(0);
        this.f109999f.getEndBtn().setVisibility(0);
        this.f109999f.getEndBtn().setText(getText(R.string.o0));
        this.f109999f.getEndBtn().setBackgroundColor(0);
        this.f110001h.setOverScrollMode(2);
        this.f110001h.setLayoutManager(new WrapLinearLayoutManager(getActivity()));
        RecyclerView recyclerView = this.f110001h;
        DividerItemDecoration dividerItemDecoration = new DividerItemDecoration(getResources().getColor(R.color.ayd), (int) C9738o.m28708b((Context) getActivity(), 0.0f), 1, C9738o.m28708b((Context) getActivity(), 0.0f), C9738o.m28708b((Context) getActivity(), 0.0f), false);
        recyclerView.mo5525a((C1272h) dividerItemDecoration);
        this.f110006m = new AwemeDraftAdapter(this.f110010q);
        this.f110006m.f109947a = this.f110005l;
        this.f110006m.mo66516d(false);
        this.f110006m.f109948b = new C42295l(this);
        this.f110001h.setAdapter(this.f110006m);
        this.f110000g.setBuilder(C10803a.m31631a(getContext()));
        m134463s();
    }

    /* renamed from: s */
    private void m134463s() {
        if (m134464t()) {
            if (!C6399b.m19946v() && !((IMainService) ServiceManager.get().getService(IMainService.class)).isTiktokWhite()) {
                this.f109999f.getEndBtn().setTextColor(-1);
                this.f109999f.getEndBtn().setLineSpacing(getResources().getDimension(R.dimen.gg), 1.0f);
                this.f109999f.getEndBtn().setTextSize(0, getResources().getDimension(R.dimen.gh));
            }
            this.f109999f.getEndBtn().setTypeface(Typeface.create(this.f109999f.getEndBtn().getTypeface(), 0), 0);
            if (C6399b.m19944t()) {
                this.f109999f.getEndBtn().setFontType(C10834d.f29331a);
            }
            this.f109999f.getEndBtn().setTextSize(1, 17.0f);
            this.f109999f.getTitleView().setTextSize(1, 17.0f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo103740a(View view) {
        m134465u();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo103742b(View view) {
        m134465u();
    }

    /* renamed from: b */
    private void m134453b(List<C27311c> list) {
        C6726a.m20844b(new C42294k(this, list));
    }

    /* renamed from: a */
    private void m134452a(String str) {
        C41530am.m132280a("Before DraftDataProvider.getDraftData()");
        ArrayList a = C42298o.m134545a(this.f110005l, str);
        C41530am.m132280a("After DraftDataProvider.getDraftData()");
        m134453b((List<C27311c>) a);
    }

    /* renamed from: d */
    private TextView m134455d(View view) {
        if (this.f110003j == null) {
            this.f110003j = (TextView) C0991u.m4211e(view, (int) R.id.dv0);
            this.f110003j.setVisibility(0);
        }
        return this.f110003j;
    }

    /* renamed from: a */
    private void m134451a(int i) {
        if (!this.f110009p) {
            C6907h.m21524a("click_draft_entrance", (Map) C22984d.m75611a().mo59970a("draft_cnt", i).mo59973a("enter_from", m134461q()).f60753a);
            this.f110009p = true;
        }
    }

    /* renamed from: c */
    private void m134454c(View view) {
        this.f109999f = (ButtonTitleBar) C0991u.m4211e(view, (int) R.id.djz);
        this.f109998e = C0991u.m4211e(view, (int) R.id.dal);
        this.f110000g = (DmtStatusView) C0991u.m4211e(view, (int) R.id.ab6);
        this.f110001h = (RecyclerView) C0991u.m4211e(view, (int) R.id.cqp);
        this.f110002i = (TextView) C0991u.m4211e(view, (int) R.id.dt1);
        if (this.f110005l) {
            m134455d(view).setVisibility(0);
        }
        this.f110004k = (FrameLayout) C0991u.m4211e(view, (int) R.id.bh4);
        if (this.f110005l) {
            this.f110004k.setOnClickListener(new C42291h(this));
        }
        m134456l();
        this.f109999f.setOnTitleBarClickListener(new C10797a() {
            /* renamed from: a */
            public final void mo25895a(View view) {
                DraftBoxFragment.this.mo103743d();
            }

            /* renamed from: b */
            public final void mo25896b(View view) {
                DraftBoxFragment.this.mo103744e();
            }
        });
        this.f110002i.setOnClickListener(new C42292i(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo103741a(List list) {
        if (isViewValid()) {
            this.f110000g.setVisibility(8);
            m134451a(list.size());
            this.f110006m.mo103716e(list);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m134462r();
        ((IAVService) ServiceManager.get().getService(IAVService.class)).draftService().registerDraftListener(this.f110013t);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo103739a(DialogInterface dialogInterface, int i) {
        C6907h.m21524a("delete_drafts", (Map) C22984d.m75611a().mo59970a("draft_cnt", this.f110007n.size()).mo59973a("enter_from", m134461q()).f60753a);
        this.f110006m.mo103717f();
        mo103746g();
        this.f110008o = false;
        m134466v();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        m134457m();
        View inflate = layoutInflater.inflate(R.layout.o0, viewGroup, false);
        m134454c(inflate);
        return inflate;
    }
}
