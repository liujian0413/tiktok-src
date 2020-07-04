package com.p280ss.android.ugc.aweme.notification.newstyle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.widget.SwipeRefreshLayout;
import android.support.p022v4.widget.SwipeRefreshLayout.C1032b;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1267f;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.SimpleItemAnimator;
import android.view.View;
import android.view.View.OnClickListener;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.p308ui.RecyclerItemDecoration;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import com.p280ss.android.ugc.aweme.notice.api.C34315c;
import com.p280ss.android.ugc.aweme.notification.newstyle.adapter.MusFollowRequestAdapter;
import com.p280ss.android.ugc.aweme.notification.newstyle.followrequest.C34542a;
import com.p280ss.android.ugc.aweme.notification.newstyle.followrequest.p1442a.C34543a;
import com.p280ss.android.ugc.aweme.notification.newstyle.followrequest.p1443b.C34546a;
import com.p280ss.android.ugc.aweme.notification.newstyle.followrequest.p1443b.C34547b;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity */
public final class MusFollowRequestDetailActivity extends AmeSSActivity implements C1032b, C6905a, C34542a, C34547b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f89919a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MusFollowRequestDetailActivity.class), "mPresenter", "getMPresenter()Lcom/ss/android/ugc/aweme/notification/newstyle/followrequest/presenter/FollowRequestPresenter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(MusFollowRequestDetailActivity.class), "mUnreadCount", "getMUnreadCount()I"))};

    /* renamed from: b */
    public static final C34470a f89920b = new C34470a(null);

    /* renamed from: c */
    private ImmersionBar f89921c;

    /* renamed from: d */
    private MusFollowRequestAdapter f89922d;

    /* renamed from: e */
    private final C7541d f89923e = C7546e.m23569a(new C34473d(this));

    /* renamed from: f */
    private final C7541d f89924f = C7546e.m23569a(new C34474e(this));

    /* renamed from: g */
    private HashMap f89925g;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity$a */
    public static final class C34470a {
        private C34470a() {
        }

        public /* synthetic */ C34470a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m111463a(Fragment fragment, int i) {
            C7573i.m23587b(fragment, "fragment");
            Intent intent = new Intent(fragment.getContext(), MusFollowRequestDetailActivity.class);
            intent.putExtra("unread_count", i);
            fragment.startActivityForResult(intent, PreloadTask.BYTE_UNIT_NUMBER);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity$b */
    public static final class C34471b implements C10797a {

        /* renamed from: a */
        final /* synthetic */ MusFollowRequestDetailActivity f89926a;

        /* renamed from: b */
        public final void mo25896b(View view) {
            C7573i.m23587b(view, "view");
        }

        C34471b(MusFollowRequestDetailActivity musFollowRequestDetailActivity) {
            this.f89926a = musFollowRequestDetailActivity;
        }

        /* renamed from: a */
        public final void mo25895a(View view) {
            C7573i.m23587b(view, "view");
            this.f89926a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity$c */
    static final class C34472c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusFollowRequestDetailActivity f89927a;

        C34472c(MusFollowRequestDetailActivity musFollowRequestDetailActivity) {
            this.f89927a = musFollowRequestDetailActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f89927a.onRefresh();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity$d */
    static final class C34473d extends Lambda implements C7561a<C34546a> {

        /* renamed from: a */
        final /* synthetic */ MusFollowRequestDetailActivity f89928a;

        C34473d(MusFollowRequestDetailActivity musFollowRequestDetailActivity) {
            this.f89928a = musFollowRequestDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C34546a invoke() {
            C34546a aVar = new C34546a();
            aVar.mo66536a(new C34543a());
            aVar.mo66537a(this.f89928a);
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity$e */
    static final class C34474e extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ MusFollowRequestDetailActivity f89929a;

        C34474e(MusFollowRequestDetailActivity musFollowRequestDetailActivity) {
            this.f89929a = musFollowRequestDetailActivity;
            super(0);
        }

        /* renamed from: a */
        private int m111467a() {
            return this.f89929a.getIntent().getIntExtra("unread_count", 0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m111467a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity$f */
    static final class C34475f<TTaskResult, TContinuationResult> implements C1591g<Void, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MusFollowRequestDetailActivity f89930a;

        C34475f(MusFollowRequestDetailActivity musFollowRequestDetailActivity) {
            this.f89930a = musFollowRequestDetailActivity;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m111468a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m111468a(C1592h<Void> hVar) {
            if (this.f89930a.isViewValid()) {
                ((DmtStatusView) this.f89930a.mo87780a((int) R.id.dav)).mo25944h();
                C10761a.m31399c((Context) this.f89930a, (int) R.string.cjs).mo25750a();
            }
        }
    }

    /* renamed from: b */
    private final C34546a m111452b() {
        return (C34546a) this.f89923e.getValue();
    }

    /* renamed from: c */
    private final int m111453c() {
        return ((Number) this.f89924f.getValue()).intValue();
    }

    /* renamed from: a */
    public final View mo87780a(int i) {
        if (this.f89925g == null) {
            this.f89925g = new HashMap();
        }
        View view = (View) this.f89925g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f89925g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo87783a(List<User> list, int i) {
        C7573i.m23587b(list, "list");
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void bd_() {
        m111452b().mo87851g();
    }

    /* renamed from: f */
    private final void m111456f() {
        MusFollowRequestAdapter musFollowRequestAdapter = this.f89922d;
        if (musFollowRequestAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        musFollowRequestAdapter.ah_();
        MusFollowRequestAdapter musFollowRequestAdapter2 = this.f89922d;
        if (musFollowRequestAdapter2 == null) {
            C7573i.m23583a("mAdapter");
        }
        musFollowRequestAdapter2.mo66516d(false);
    }

    public final void onDestroy() {
        super.onDestroy();
        m111452b().mo59134U_();
        ImmersionBar immersionBar = this.f89921c;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
    }

    public final void setStatusBarColor() {
        this.f89921c = ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a03);
        ImmersionBar immersionBar = this.f89921c;
        if (immersionBar != null) {
            immersionBar.init();
        }
    }

    /* renamed from: e */
    private final void m111455e() {
        ((DmtStatusView) mo87780a((int) R.id.dav)).setBuilder(C10803a.m31631a((Context) this).mo25953a().mo25955a((int) R.string.d59, (int) R.string.d58).mo25956a(R.drawable.b7_, R.string.fi5, R.string.fi2, R.string.fia, new C34472c(this)));
    }

    /* renamed from: a */
    public final void mo87781a() {
        MusFollowRequestAdapter musFollowRequestAdapter = this.f89922d;
        if (musFollowRequestAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        if (musFollowRequestAdapter.f67566v) {
            MusFollowRequestAdapter musFollowRequestAdapter2 = this.f89922d;
            if (musFollowRequestAdapter2 == null) {
                C7573i.m23583a("mAdapter");
            }
            musFollowRequestAdapter2.mo66516d(false);
            MusFollowRequestAdapter musFollowRequestAdapter3 = this.f89922d;
            if (musFollowRequestAdapter3 == null) {
                C7573i.m23583a("mAdapter");
            }
            musFollowRequestAdapter3.notifyDataSetChanged();
            m111456f();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo87780a((int) R.id.deg);
        C7573i.m23582a((Object) swipeRefreshLayout, "swipe_refresh_layout");
        swipeRefreshLayout.setRefreshing(false);
        MusFollowRequestAdapter musFollowRequestAdapter4 = this.f89922d;
        if (musFollowRequestAdapter4 == null) {
            C7573i.m23583a("mAdapter");
        }
        if (musFollowRequestAdapter4.getItemCount() == 0) {
            ((DmtStatusView) mo87780a((int) R.id.dav)).mo25943g();
        }
    }

    public final void onRefresh() {
        if (C34514b.m111622a(this)) {
            MusFollowRequestAdapter musFollowRequestAdapter = this.f89922d;
            if (musFollowRequestAdapter == null) {
                C7573i.m23583a("mAdapter");
            }
            if (musFollowRequestAdapter.getItemCount() == 0) {
                ((DmtStatusView) mo87780a((int) R.id.dav)).mo25942f();
            }
            m111452b().mo87850f();
            return;
        }
        MusFollowRequestAdapter musFollowRequestAdapter2 = this.f89922d;
        if (musFollowRequestAdapter2 == null) {
            C7573i.m23583a("mAdapter");
        }
        if (musFollowRequestAdapter2.getItemCount() == 0) {
            C1592h.m7848a(100).mo6876a((C1591g<TResult, TContinuationResult>) new C34475f<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: d */
    private final void m111454d() {
        RecyclerView recyclerView = (RecyclerView) mo87780a((int) R.id.cqp);
        C7573i.m23582a((Object) recyclerView, "recycler_view");
        C1267f itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            ((SimpleItemAnimator) itemAnimator).f5112m = false;
            RecyclerView recyclerView2 = (RecyclerView) mo87780a((int) R.id.cqp);
            C7573i.m23582a((Object) recyclerView2, "recycler_view");
            Context context = this;
            recyclerView2.setLayoutManager(new WrapLinearLayoutManager(context));
            ((RecyclerView) mo87780a((int) R.id.cqp)).mo5525a((C1272h) new RecyclerItemDecoration(1, (int) C9738o.m28708b(context, 1.0f), 0));
            ((RecyclerView) mo87780a((int) R.id.cqp)).mo5528a((C1281m) new FrescoRecycleViewScrollListener(context));
            m111455e();
            if (VERSION.SDK_INT >= 19) {
                View a = mo87780a((int) R.id.dal);
                C7573i.m23582a((Object) a, "status_bar");
                a.getLayoutParams().height = C10994a.m32204a(context);
            }
            C34550g.m111722a((RecyclerView) mo87780a((int) R.id.cqp), (SwipeRefreshLayout) mo87780a((int) R.id.deg));
            ((SwipeRefreshLayout) mo87780a((int) R.id.deg)).setOnRefreshListener(this);
            ((TextTitleBar) mo87780a((int) R.id.djz)).setTitle((int) R.string.b8w);
            ((TextTitleBar) mo87780a((int) R.id.djz)).setOnTitleBarClickListener(new C34471b(this));
            this.f89922d = new MusFollowRequestAdapter(this);
            MusFollowRequestAdapter musFollowRequestAdapter = this.f89922d;
            if (musFollowRequestAdapter == null) {
                C7573i.m23583a("mAdapter");
            }
            musFollowRequestAdapter.f90008a = m111453c();
            MusFollowRequestAdapter musFollowRequestAdapter2 = this.f89922d;
            if (musFollowRequestAdapter2 == null) {
                C7573i.m23583a("mAdapter");
            }
            musFollowRequestAdapter2.mo66504a((C6905a) this);
            MusFollowRequestAdapter musFollowRequestAdapter3 = this.f89922d;
            if (musFollowRequestAdapter3 == null) {
                C7573i.m23583a("mAdapter");
            }
            musFollowRequestAdapter3.mo66516d(true);
            MusFollowRequestAdapter musFollowRequestAdapter4 = this.f89922d;
            if (musFollowRequestAdapter4 == null) {
                C7573i.m23583a("mAdapter");
            }
            musFollowRequestAdapter4.ah_();
            RecyclerView recyclerView3 = (RecyclerView) mo87780a((int) R.id.cqp);
            C7573i.m23582a((Object) recyclerView3, "recycler_view");
            MusFollowRequestAdapter musFollowRequestAdapter5 = this.f89922d;
            if (musFollowRequestAdapter5 == null) {
                C7573i.m23583a("mAdapter");
            }
            recyclerView3.setAdapter(musFollowRequestAdapter5);
            ((DmtStatusView) mo87780a((int) R.id.dav)).mo25942f();
            onRefresh();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.SimpleItemAnimator");
    }

    /* renamed from: a */
    public final void mo87785a(boolean z) {
        if (z) {
            MusFollowRequestAdapter musFollowRequestAdapter = this.f89922d;
            if (musFollowRequestAdapter == null) {
                C7573i.m23583a("mAdapter");
            }
            musFollowRequestAdapter.ag_();
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.bq);
        m111454d();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity", "onCreate", false);
    }

    /* renamed from: a */
    public final void mo87782a(Exception exc, boolean z) {
        if (z) {
            MusFollowRequestAdapter musFollowRequestAdapter = this.f89922d;
            if (musFollowRequestAdapter == null) {
                C7573i.m23583a("mAdapter");
            }
            musFollowRequestAdapter.mo66508i();
            return;
        }
        MusFollowRequestAdapter musFollowRequestAdapter2 = this.f89922d;
        if (musFollowRequestAdapter2 == null) {
            C7573i.m23583a("mAdapter");
        }
        if (musFollowRequestAdapter2.f67566v) {
            MusFollowRequestAdapter musFollowRequestAdapter3 = this.f89922d;
            if (musFollowRequestAdapter3 == null) {
                C7573i.m23583a("mAdapter");
            }
            musFollowRequestAdapter3.mo66516d(false);
            MusFollowRequestAdapter musFollowRequestAdapter4 = this.f89922d;
            if (musFollowRequestAdapter4 == null) {
                C7573i.m23583a("mAdapter");
            }
            musFollowRequestAdapter4.notifyDataSetChanged();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo87780a((int) R.id.deg);
        C7573i.m23582a((Object) swipeRefreshLayout, "swipe_refresh_layout");
        swipeRefreshLayout.setRefreshing(false);
        MusFollowRequestAdapter musFollowRequestAdapter5 = this.f89922d;
        if (musFollowRequestAdapter5 == null) {
            C7573i.m23583a("mAdapter");
        }
        if (musFollowRequestAdapter5.getItemCount() == 0) {
            ((DmtStatusView) mo87780a((int) R.id.dav)).mo25944h();
        }
    }

    /* renamed from: a */
    public final void mo87784a(List<User> list, boolean z, boolean z2) {
        C7573i.m23587b(list, "list");
        if (z) {
            if (list.isEmpty()) {
                z2 = false;
            }
            if (!z2) {
                m111456f();
            } else {
                MusFollowRequestAdapter musFollowRequestAdapter = this.f89922d;
                if (musFollowRequestAdapter == null) {
                    C7573i.m23583a("mAdapter");
                }
                musFollowRequestAdapter.ai_();
            }
            MusFollowRequestAdapter musFollowRequestAdapter2 = this.f89922d;
            if (musFollowRequestAdapter2 == null) {
                C7573i.m23583a("mAdapter");
            }
            musFollowRequestAdapter2.mo61577b(list);
            return;
        }
        MusFollowRequestAdapter musFollowRequestAdapter3 = this.f89922d;
        if (musFollowRequestAdapter3 == null) {
            C7573i.m23583a("mAdapter");
        }
        musFollowRequestAdapter3.mo66516d(true);
        if (!z2) {
            m111456f();
        } else {
            MusFollowRequestAdapter musFollowRequestAdapter4 = this.f89922d;
            if (musFollowRequestAdapter4 == null) {
                C7573i.m23583a("mAdapter");
            }
            musFollowRequestAdapter4.ai_();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo87780a((int) R.id.deg);
        C7573i.m23582a((Object) swipeRefreshLayout, "swipe_refresh_layout");
        swipeRefreshLayout.setRefreshing(false);
        MusFollowRequestAdapter musFollowRequestAdapter5 = this.f89922d;
        if (musFollowRequestAdapter5 == null) {
            C7573i.m23583a("mAdapter");
        }
        musFollowRequestAdapter5.f90008a = C34315c.m110974a(12);
        MusFollowRequestAdapter musFollowRequestAdapter6 = this.f89922d;
        if (musFollowRequestAdapter6 == null) {
            C7573i.m23583a("mAdapter");
        }
        musFollowRequestAdapter6.mo58045a(list);
        ((DmtStatusView) mo87780a((int) R.id.dav)).mo25939d();
    }
}
