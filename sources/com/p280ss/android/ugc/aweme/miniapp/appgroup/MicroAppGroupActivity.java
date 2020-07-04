package com.p280ss.android.ugc.aweme.miniapp.appgroup;

import android.content.Context;
import android.os.Bundle;
import android.support.p029v7.widget.GridLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1267f;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.support.p029v7.widget.SimpleItemAnimator;
import android.view.View;
import android.view.View.OnClickListener;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.widget.C10805b;
import com.bytedance.ies.dmt.p262ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.p1843tt.appbrandimpl.MicroAppApi;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.common.p1144e.C25674b;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.discover.adapter.LoadMoreAdapter;
import com.p280ss.android.ugc.aweme.feed.listener.C28532n;
import com.p280ss.android.ugc.aweme.feed.listener.OnRecyclerViewFlingListener;
import com.p280ss.android.ugc.aweme.miniapp.appgroup.C33369c.C33370a;
import com.p280ss.android.ugc.aweme.miniapp_api.model.C33459d;
import com.p280ss.android.ugc.aweme.miniapp_api.model.MicroAppInfo;
import com.p280ss.android.ugc.aweme.utils.C43098ej;
import com.p280ss.android.ugc.aweme.views.C43361b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity */
public final class MicroAppGroupActivity extends AmeSSActivity implements C25675c<MicroAppInfo>, C28532n, C33370a {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f87158a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MicroAppGroupActivity.class), "mListAdapter", "getMListAdapter()Lcom/ss/android/ugc/aweme/miniapp/appgroup/CollectionMicroAppAdapter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MicroAppGroupActivity.class), "mLoadMoreAdapter", "getMLoadMoreAdapter()Lcom/ss/android/ugc/aweme/discover/adapter/LoadMoreAdapter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MicroAppGroupActivity.class), "mListPresenter", "getMListPresenter()Lcom/ss/android/ugc/aweme/common/presenter/BaseListPresenter;"))};

    /* renamed from: b */
    public final int f87159b = 10;

    /* renamed from: c */
    private final int f87160c = 4;

    /* renamed from: d */
    private final C7541d f87161d = C7546e.m23569a(new C33362e(this));

    /* renamed from: e */
    private final C7541d f87162e = C7546e.m23569a(new C33364g(this));

    /* renamed from: f */
    private final C7541d f87163f = C7546e.m23569a(new C33363f(this));

    /* renamed from: g */
    private HashMap f87164g;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity$a */
    static final class C33358a<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ MicroAppGroupActivity f87165a;

        C33358a(MicroAppGroupActivity microAppGroupActivity) {
            this.f87165a = microAppGroupActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C33459d call() {
            return MicroAppApi.m146352a(0, this.f87165a.f87159b, 0);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity$b */
    public static final class C33359b implements C1591g<C33459d, Void> {

        /* renamed from: a */
        final /* synthetic */ MicroAppGroupActivity f87166a;

        /* renamed from: b */
        final /* synthetic */ boolean f87167b;

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<C33459d> hVar) {
            List list;
            if (this.f87167b) {
                this.f87166a.mo85545h().mo56976a(Integer.valueOf(1));
            }
            if (hVar == null || ((C33459d) hVar.mo6890e()) == null) {
                return null;
            }
            CollectionMicroAppAdapter g = this.f87166a.mo85544g();
            if (((C33459d) hVar.mo6890e()).error_code == 0) {
                Object e = hVar.mo6890e();
                C7573i.m23582a(e, "task.result");
                list = ((C33459d) e).f87339a;
            } else {
                list = null;
            }
            g.mo85543c(list);
            return null;
        }

        C33359b(MicroAppGroupActivity microAppGroupActivity, boolean z) {
            this.f87166a = microAppGroupActivity;
            this.f87167b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity$c */
    static final class C33360c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MicroAppGroupActivity f87168a;

        C33360c(MicroAppGroupActivity microAppGroupActivity) {
            this.f87168a = microAppGroupActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f87168a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity$d */
    static final class C33361d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MicroAppGroupActivity f87169a;

        C33361d(MicroAppGroupActivity microAppGroupActivity) {
            this.f87169a = microAppGroupActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f87169a.mo85546i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity$e */
    static final class C33362e extends Lambda implements C7561a<CollectionMicroAppAdapter> {

        /* renamed from: a */
        final /* synthetic */ MicroAppGroupActivity f87170a;

        C33362e(MicroAppGroupActivity microAppGroupActivity) {
            this.f87170a = microAppGroupActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public CollectionMicroAppAdapter invoke() {
            CollectionMicroAppAdapter collectionMicroAppAdapter = new CollectionMicroAppAdapter(this.f87170a, this.f87170a.mo85545h());
            collectionMicroAppAdapter.mo85541b();
            return collectionMicroAppAdapter;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity$f */
    static final class C33363f extends Lambda implements C7561a<C25674b<C33365a>> {

        /* renamed from: a */
        final /* synthetic */ MicroAppGroupActivity f87171a;

        C33363f(MicroAppGroupActivity microAppGroupActivity) {
            this.f87171a = microAppGroupActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C25674b<C33365a> invoke() {
            C25674b<C33365a> bVar = new C25674b<>();
            bVar.mo66536a(new C33365a());
            bVar.mo66537a(this.f87171a);
            return bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity$g */
    static final class C33364g extends Lambda implements C7561a<LoadMoreAdapter<C1293v>> {

        /* renamed from: a */
        final /* synthetic */ MicroAppGroupActivity f87172a;

        C33364g(MicroAppGroupActivity microAppGroupActivity) {
            this.f87172a = microAppGroupActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public LoadMoreAdapter<C1293v> invoke() {
            return LoadMoreAdapter.m86888a((C1262a<VH>) this.f87172a.mo85544g());
        }
    }

    /* renamed from: a */
    private View m107907a(int i) {
        if (this.f87164g == null) {
            this.f87164g = new HashMap();
        }
        View view = (View) this.f87164g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f87164g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: j */
    private final LoadMoreAdapter<C1293v> m107910j() {
        return (LoadMoreAdapter) this.f87162e.getValue();
    }

    public final void aE_() {
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<MicroAppInfo> list, boolean z) {
    }

    /* renamed from: g */
    public final CollectionMicroAppAdapter mo85544g() {
        return (CollectionMicroAppAdapter) this.f87161d.getValue();
    }

    /* renamed from: h */
    public final C25674b<C33365a> mo85545h() {
        return (C25674b) this.f87163f.getValue();
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        if (isViewValid() && !((DmtStatusView) m107907a((int) R.id.dav)).f29075b) {
            ((DmtStatusView) m107907a((int) R.id.dav)).mo25942f();
        }
    }

    public final void aD_() {
        if (isViewValid()) {
            LoadMoreAdapter j = m107910j();
            C7573i.m23582a((Object) j, "mLoadMoreAdapter");
            j.mo67986a(1);
        }
    }

    public final void aP_() {
        mo85545h().mo56976a(Integer.valueOf(4));
    }

    public final boolean aR_() {
        LoadMoreAdapter j = m107910j();
        C7573i.m23582a((Object) j, "mLoadMoreAdapter");
        if (j.f69540a != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final void mo85546i() {
        if (((DmtStatusView) m107907a((int) R.id.dav)).mo25940d(true)) {
            m107909b(true);
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        C33369c.m107934b(this);
        mo85545h().mo66535W_();
        mo85545h().mo59134U_();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity", "onResume", true);
        super.onResume();
        m107909b(false);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity", "onResume", false);
    }

    public final void setStatusBarColor() {
        C43098ej.m136710a(this, getResources().getColor(R.color.a3z));
    }

    public final void ae_() {
        if (isViewValid()) {
            ((DmtStatusView) m107907a((int) R.id.dav)).mo25938c(true);
            LoadMoreAdapter j = m107910j();
            C7573i.m23582a((Object) j, "mLoadMoreAdapter");
            j.mo67986a(0);
            mo85544g().mo85539a();
        }
    }

    /* renamed from: k */
    private final void m107911k() {
        TextTitleBar textTitleBar = (TextTitleBar) m107907a((int) R.id.djz);
        C7573i.m23582a((Object) textTitleBar, "title_bar");
        textTitleBar.getBackBtn().setOnClickListener(new C33360c(this));
        Context context = this;
        C10805b a = C43361b.m137644a(context, new C33361d(this));
        DmtDefaultView dmtDefaultView = new DmtDefaultView(context);
        dmtDefaultView.setSupportDelayVisible(true);
        dmtDefaultView.setStatus(a);
        ((DmtStatusView) m107907a((int) R.id.dav)).setBuilder(C10803a.m31631a(context).mo25966c((View) dmtDefaultView));
        ((DmtStatusView) m107907a((int) R.id.dav)).setUseScreenHeight(getResources().getDimensionPixelSize(R.dimen.ml));
        m107912l();
    }

    /* renamed from: l */
    private final void m107912l() {
        RecyclerView recyclerView = (RecyclerView) m107907a((int) R.id.cxl);
        C7573i.m23582a((Object) recyclerView, "rv_micro_app_list");
        recyclerView.setAdapter(m107910j());
        RecyclerView recyclerView2 = (RecyclerView) m107907a((int) R.id.cxl);
        C7573i.m23582a((Object) recyclerView2, "rv_micro_app_list");
        recyclerView2.setOnFlingListener(new OnRecyclerViewFlingListener((RecyclerView) m107907a((int) R.id.cxl), this));
        RecyclerView recyclerView3 = (RecyclerView) m107907a((int) R.id.cxl);
        C7573i.m23582a((Object) recyclerView3, "rv_micro_app_list");
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, this.f87160c);
        gridLayoutManager.f4721g = new MicroAppGroupActivity$initRecyclerView$$inlined$apply$lambda$1(gridLayoutManager, this);
        recyclerView3.setLayoutManager(gridLayoutManager);
        RecyclerView recyclerView4 = (RecyclerView) m107907a((int) R.id.cxl);
        C7573i.m23582a((Object) recyclerView4, "rv_micro_app_list");
        C1267f itemAnimator = recyclerView4.getItemAnimator();
        if (itemAnimator != null) {
            ((SimpleItemAnimator) itemAnimator).f5112m = false;
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.SimpleItemAnimator");
    }

    /* renamed from: a */
    public final void mo59100a(boolean z) {
        LoadMoreAdapter j = m107910j();
        C7573i.m23582a((Object) j, "mLoadMoreAdapter");
        j.mo67986a(z ? 1 : 0);
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m107909b(boolean z) {
        C1592h.m7853a((Callable<TResult>) new C33358a<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C33359b<TResult,TContinuationResult>(this, z), C1592h.f5958b);
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (isViewValid()) {
            ((DmtStatusView) m107907a((int) R.id.dav)).mo25944h();
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.adm);
        m107911k();
        m107909b(true);
        C33369c.m107933a(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.miniapp.appgroup.MicroAppGroupActivity", "onCreate", false);
    }

    /* renamed from: b */
    public final void mo59108b(List<MicroAppInfo> list, boolean z) {
        if (isViewValid()) {
            ((DmtStatusView) m107907a((int) R.id.dav)).mo25938c(true);
            LoadMoreAdapter j = m107910j();
            C7573i.m23582a((Object) j, "mLoadMoreAdapter");
            j.mo67986a(z ? 1 : 0);
            mo85544g().mo85542b(list);
        }
    }

    /* renamed from: a */
    public final void mo59099a(List<? extends MicroAppInfo> list, boolean z) {
        if (isViewValid()) {
            ((DmtStatusView) m107907a((int) R.id.dav)).mo25938c(true);
            LoadMoreAdapter j = m107910j();
            C7573i.m23582a((Object) j, "mLoadMoreAdapter");
            j.mo67986a(z ? 1 : 0);
            mo85544g().mo85540a(list);
        }
    }
}
