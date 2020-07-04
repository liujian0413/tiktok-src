package com.p280ss.android.ugc.aweme.notification.newstyle;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p022v4.widget.SwipeRefreshLayout;
import android.support.p022v4.widget.SwipeRefreshLayout.C1032b;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1267f;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.SimpleItemAnimator;
import android.text.TextUtils;
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
import com.bytedance.ies.dmt.p262ui.widget.C10805b.C10806a;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.p308ui.RecyclerItemDecoration;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import com.p280ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;
import com.p280ss.android.ugc.aweme.notification.newstyle.adapter.NotificationDelegateAdapter;
import com.p280ss.android.ugc.aweme.notification.newstyle.delegate.C34526c;
import com.p280ss.android.ugc.aweme.notification.newstyle.delegate.C34527d;
import com.p280ss.android.ugc.aweme.notification.newstyle.delegate.C34533i;
import com.p280ss.android.ugc.aweme.notification.newstyle.model.C34559d;
import com.p280ss.android.ugc.aweme.notification.newstyle.p1440a.C34501c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.List;
import kotlin.C7581n;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity */
public final class MusNotificationDetailActivity extends AmeSSActivity implements C1032b, C6905a, C25675c<BaseNotice> {

    /* renamed from: a */
    public static final C34493a f89965a = new C34493a(null);

    /* renamed from: b */
    private int f89966b = -1;

    /* renamed from: c */
    private int f89967c;

    /* renamed from: d */
    private final C34533i f89968d = C34533i.f90106a;

    /* renamed from: e */
    private C34526c f89969e;

    /* renamed from: f */
    private C34527d f89970f;

    /* renamed from: g */
    private NotificationDelegateAdapter f89971g;

    /* renamed from: h */
    private C34501c f89972h;

    /* renamed from: i */
    private C34559d f89973i;

    /* renamed from: j */
    private ImmersionBar f89974j;

    /* renamed from: k */
    private boolean f89975k;

    /* renamed from: l */
    private HashMap f89976l;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity$a */
    public static final class C34493a {
        private C34493a() {
        }

        public /* synthetic */ C34493a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final void mo87802a(Context context, int i, int i2) {
            C7573i.m23587b(context, "context");
            m111533a(context, i, i2, null);
        }

        /* renamed from: a */
        private static void m111533a(Context context, int i, int i2, String str) {
            C7573i.m23587b(context, "context");
            Intent intent = new Intent(context, MusNotificationDetailActivity.class);
            intent.putExtra("from_where", i);
            intent.putExtra("unRead_message_count", i2);
            if (!TextUtils.isEmpty(null)) {
                intent.putExtra("notice_name", null);
            }
            context.startActivity(intent);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity$b */
    public static final class C34494b implements C10797a {

        /* renamed from: a */
        final /* synthetic */ MusNotificationDetailActivity f89977a;

        /* renamed from: b */
        public final void mo25896b(View view) {
            C7573i.m23587b(view, "view");
        }

        C34494b(MusNotificationDetailActivity musNotificationDetailActivity) {
            this.f89977a = musNotificationDetailActivity;
        }

        /* renamed from: a */
        public final void mo25895a(View view) {
            C7573i.m23587b(view, "view");
            this.f89977a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity$c */
    static final class C34495c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusNotificationDetailActivity f89978a;

        C34495c(MusNotificationDetailActivity musNotificationDetailActivity) {
            this.f89978a = musNotificationDetailActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f89978a.onRefresh();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity$d */
    static final class C34496d<TTaskResult, TContinuationResult> implements C1591g<Void, C7581n> {

        /* renamed from: a */
        final /* synthetic */ MusNotificationDetailActivity f89979a;

        C34496d(MusNotificationDetailActivity musNotificationDetailActivity) {
            this.f89979a = musNotificationDetailActivity;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m111537a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m111537a(C1592h<Void> hVar) {
            if (this.f89979a.isViewValid()) {
                ((DmtStatusView) this.f89979a.mo87800a(R.id.dav)).mo25944h();
                C10761a.m31399c((Context) this.f89979a, (int) R.string.cjs).mo25750a();
            }
        }
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
    }

    /* renamed from: a */
    public final View mo87800a(int i) {
        if (this.f89976l == null) {
            this.f89976l = new HashMap();
        }
        View view = (View) this.f89976l.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f89976l.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void aE_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<BaseNotice> list, boolean z) {
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void aD_() {
        NotificationDelegateAdapter notificationDelegateAdapter = this.f89971g;
        if (notificationDelegateAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        notificationDelegateAdapter.ag_();
    }

    /* renamed from: g */
    private final void m111523g() {
        NotificationDelegateAdapter notificationDelegateAdapter = this.f89971g;
        if (notificationDelegateAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        notificationDelegateAdapter.ah_();
        NotificationDelegateAdapter notificationDelegateAdapter2 = this.f89971g;
        if (notificationDelegateAdapter2 == null) {
            C7573i.m23583a("mAdapter");
        }
        notificationDelegateAdapter2.mo66516d(false);
    }

    public final Analysis getAnalysis() {
        Analysis labelName = new Analysis().setLabelName(m111524h());
        C7573i.m23582a((Object) labelName, "Analysis().setLabelName(getEnterFrom())");
        return labelName;
    }

    public final void onDestroy() {
        super.onDestroy();
        C34501c cVar = this.f89972h;
        if (cVar == null) {
            C7573i.m23583a("mNoticePresenter");
        }
        cVar.mo59134U_();
        ImmersionBar immersionBar = this.f89974j;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
    }

    public final void setStatusBarColor() {
        this.f89974j = ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a03);
        ImmersionBar immersionBar = this.f89974j;
        if (immersionBar != null) {
            immersionBar.init();
        }
    }

    /* renamed from: h */
    private final String m111524h() {
        switch (this.f89966b) {
            case 2:
                return "comment";
            case 3:
                return "like";
            case 6:
                return "at";
            case 7:
                return "fans";
            default:
                return "fans";
        }
    }

    public final void bd_() {
        C34501c cVar = this.f89972h;
        if (cVar == null) {
            C7573i.m23583a("mNoticePresenter");
        }
        cVar.mo56976a(Integer.valueOf(4), Integer.valueOf(this.f89966b), null);
    }

    /* renamed from: f */
    private final void m111522f() {
        Context context = this;
        C10806a aVar = new C10806a(context);
        C34527d dVar = this.f89970f;
        if (dVar == null) {
            C7573i.m23583a("mDetailProxy");
        }
        C10806a a = aVar.mo25988a(dVar.mo87839b());
        C34527d dVar2 = this.f89970f;
        if (dVar2 == null) {
            C7573i.m23583a("mDetailProxy");
        }
        ((DmtStatusView) mo87800a(R.id.dav)).setBuilder(C10803a.m31631a(context).mo25953a().mo25961a(a.mo25991b(dVar2.mo87840c()).f29135a).mo25956a(R.drawable.b7_, R.string.fi5, R.string.fi2, R.string.fia, new C34495c(this)));
    }

    public final void ae_() {
        NotificationDelegateAdapter notificationDelegateAdapter = this.f89971g;
        if (notificationDelegateAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        if (notificationDelegateAdapter.f67566v) {
            NotificationDelegateAdapter notificationDelegateAdapter2 = this.f89971g;
            if (notificationDelegateAdapter2 == null) {
                C7573i.m23583a("mAdapter");
            }
            notificationDelegateAdapter2.mo66516d(false);
            NotificationDelegateAdapter notificationDelegateAdapter3 = this.f89971g;
            if (notificationDelegateAdapter3 == null) {
                C7573i.m23583a("mAdapter");
            }
            notificationDelegateAdapter3.notifyDataSetChanged();
            m111523g();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo87800a(R.id.c7s);
        C7573i.m23582a((Object) swipeRefreshLayout, "notification_swipe_refresh_layout");
        swipeRefreshLayout.setRefreshing(false);
        NotificationDelegateAdapter notificationDelegateAdapter4 = this.f89971g;
        if (notificationDelegateAdapter4 == null) {
            C7573i.m23583a("mAdapter");
        }
        if (notificationDelegateAdapter4.getItemCount() == 0) {
            ((DmtStatusView) mo87800a(R.id.dav)).mo25943g();
        }
    }

    public final void onRefresh() {
        if (C34518d.m111627a(this)) {
            NotificationDelegateAdapter notificationDelegateAdapter = this.f89971g;
            if (notificationDelegateAdapter == null) {
                C7573i.m23583a("mAdapter");
            }
            if (notificationDelegateAdapter.getItemCount() == 0) {
                ((DmtStatusView) mo87800a(R.id.dav)).mo25942f();
            }
            C34501c cVar = this.f89972h;
            if (cVar == null) {
                C7573i.m23583a("mNoticePresenter");
            }
            cVar.mo56976a(Integer.valueOf(1), Integer.valueOf(this.f89966b), null);
            return;
        }
        NotificationDelegateAdapter notificationDelegateAdapter2 = this.f89971g;
        if (notificationDelegateAdapter2 == null) {
            C7573i.m23583a("mAdapter");
        }
        if (notificationDelegateAdapter2.getItemCount() == 0) {
            C1592h.m7848a(100).mo6876a((C1591g<TResult, TContinuationResult>) new C34496d<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: e */
    private final void m111521e() {
        RecyclerView recyclerView = (RecyclerView) mo87800a(R.id.c7m);
        C7573i.m23582a((Object) recyclerView, "notification_recycler_view");
        C1267f itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            ((SimpleItemAnimator) itemAnimator).f5112m = false;
            RecyclerView recyclerView2 = (RecyclerView) mo87800a(R.id.c7m);
            C7573i.m23582a((Object) recyclerView2, "notification_recycler_view");
            Context context = this;
            recyclerView2.setLayoutManager(new LinearLayoutManager(context));
            ((RecyclerView) mo87800a(R.id.c7m)).mo5525a((C1272h) new RecyclerItemDecoration(1, (int) C9738o.m28708b(context, 1.0f), 0));
            ((RecyclerView) mo87800a(R.id.c7m)).mo5528a((C1281m) new FrescoRecycleViewScrollListener(context));
            m111522f();
            if (VERSION.SDK_INT >= 19) {
                View a = mo87800a(R.id.dal);
                C7573i.m23582a((Object) a, "status_bar");
                a.getLayoutParams().height = C10994a.m32204a(context);
            }
            ((SwipeRefreshLayout) mo87800a(R.id.c7s)).setOnRefreshListener(this);
            TextTitleBar textTitleBar = (TextTitleBar) mo87800a(R.id.djz);
            C34527d dVar = this.f89970f;
            if (dVar == null) {
                C7573i.m23583a("mDetailProxy");
            }
            textTitleBar.setTitle((CharSequence) dVar.mo87836a());
            ((TextTitleBar) mo87800a(R.id.djz)).setOnTitleBarClickListener(new C34494b(this));
            C34527d dVar2 = this.f89970f;
            if (dVar2 == null) {
                C7573i.m23583a("mDetailProxy");
            }
            this.f89971g = new NotificationDelegateAdapter(dVar2, this.f89967c);
            this.f89972h = new C34501c();
            this.f89973i = new C34559d();
            C34559d dVar3 = this.f89973i;
            if (dVar3 == null) {
                C7573i.m23583a("mNoticeModel");
            }
            dVar3.f90154a = this.f89966b;
            C34501c cVar = this.f89972h;
            if (cVar == null) {
                C7573i.m23583a("mNoticePresenter");
            }
            C34559d dVar4 = this.f89973i;
            if (dVar4 == null) {
                C7573i.m23583a("mNoticeModel");
            }
            cVar.mo66536a(dVar4);
            C34501c cVar2 = this.f89972h;
            if (cVar2 == null) {
                C7573i.m23583a("mNoticePresenter");
            }
            cVar2.mo66537a(this);
            NotificationDelegateAdapter notificationDelegateAdapter = this.f89971g;
            if (notificationDelegateAdapter == null) {
                C7573i.m23583a("mAdapter");
            }
            notificationDelegateAdapter.mo66504a((C6905a) this);
            NotificationDelegateAdapter notificationDelegateAdapter2 = this.f89971g;
            if (notificationDelegateAdapter2 == null) {
                C7573i.m23583a("mAdapter");
            }
            notificationDelegateAdapter2.mo66516d(true);
            NotificationDelegateAdapter notificationDelegateAdapter3 = this.f89971g;
            if (notificationDelegateAdapter3 == null) {
                C7573i.m23583a("mAdapter");
            }
            notificationDelegateAdapter3.ah_();
            RecyclerView recyclerView3 = (RecyclerView) mo87800a(R.id.c7m);
            C7573i.m23582a((Object) recyclerView3, "notification_recycler_view");
            NotificationDelegateAdapter notificationDelegateAdapter4 = this.f89971g;
            if (notificationDelegateAdapter4 == null) {
                C7573i.m23583a("mAdapter");
            }
            recyclerView3.setAdapter(notificationDelegateAdapter4);
            ((DmtStatusView) mo87800a(R.id.dav)).mo25942f();
            onRefresh();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.SimpleItemAnimator");
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        NotificationDelegateAdapter notificationDelegateAdapter = this.f89971g;
        if (notificationDelegateAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        notificationDelegateAdapter.mo66508i();
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        NotificationDelegateAdapter notificationDelegateAdapter = this.f89971g;
        if (notificationDelegateAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        if (notificationDelegateAdapter.f67566v) {
            NotificationDelegateAdapter notificationDelegateAdapter2 = this.f89971g;
            if (notificationDelegateAdapter2 == null) {
                C7573i.m23583a("mAdapter");
            }
            notificationDelegateAdapter2.mo66516d(false);
            NotificationDelegateAdapter notificationDelegateAdapter3 = this.f89971g;
            if (notificationDelegateAdapter3 == null) {
                C7573i.m23583a("mAdapter");
            }
            notificationDelegateAdapter3.notifyDataSetChanged();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo87800a(R.id.c7s);
        C7573i.m23582a((Object) swipeRefreshLayout, "notification_swipe_refresh_layout");
        swipeRefreshLayout.setRefreshing(false);
        NotificationDelegateAdapter notificationDelegateAdapter4 = this.f89971g;
        if (notificationDelegateAdapter4 == null) {
            C7573i.m23583a("mAdapter");
        }
        if (notificationDelegateAdapter4.getItemCount() == 0) {
            ((DmtStatusView) mo87800a(R.id.dav)).mo25944h();
        }
    }

    public final void onCreate(Bundle bundle) {
        C34527d dVar;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.dl);
        this.f89966b = getIntent().getIntExtra("from_where", -1);
        this.f89967c = getIntent().getIntExtra("unRead_message_count", 0);
        if (C34533i.m111669a().get(Integer.valueOf(this.f89966b)) != null) {
            C34526c cVar = (C34526c) C34533i.m111669a().get(Integer.valueOf(this.f89966b));
            if (cVar != null) {
                dVar = cVar.mo87834a();
            } else {
                dVar = null;
            }
            if (dVar != null) {
                Object obj = C34533i.m111669a().get(Integer.valueOf(this.f89966b));
                if (obj == null) {
                    C7573i.m23580a();
                }
                this.f89969e = (C34526c) obj;
                C34526c cVar2 = this.f89969e;
                if (cVar2 == null) {
                    C7573i.m23583a("mDelegate");
                }
                C34527d a = cVar2.mo87834a();
                if (a == null) {
                    C7573i.m23580a();
                }
                this.f89970f = a;
                m111521e();
                ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity", "onCreate", false);
                return;
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusNotificationDetailActivity", "onCreate", false);
    }

    /* renamed from: b */
    public final void mo59108b(List<BaseNotice> list, boolean z) {
        if (list == null || list.isEmpty()) {
            z = false;
        }
        if (!z) {
            m111523g();
        } else {
            NotificationDelegateAdapter notificationDelegateAdapter = this.f89971g;
            if (notificationDelegateAdapter == null) {
                C7573i.m23583a("mAdapter");
            }
            notificationDelegateAdapter.ai_();
        }
        NotificationDelegateAdapter notificationDelegateAdapter2 = this.f89971g;
        if (notificationDelegateAdapter2 == null) {
            C7573i.m23583a("mAdapter");
        }
        notificationDelegateAdapter2.mo61577b(list);
    }

    /* renamed from: a */
    public final void mo59099a(List<BaseNotice> list, boolean z) {
        NotificationDelegateAdapter notificationDelegateAdapter = this.f89971g;
        if (notificationDelegateAdapter == null) {
            C7573i.m23583a("mAdapter");
        }
        notificationDelegateAdapter.mo66516d(true);
        if (this.f89975k) {
            NotificationDelegateAdapter notificationDelegateAdapter2 = this.f89971g;
            if (notificationDelegateAdapter2 == null) {
                C7573i.m23583a("mAdapter");
            }
            notificationDelegateAdapter2.mo87824f();
        }
        this.f89975k = true;
        if (!z) {
            m111523g();
        } else {
            NotificationDelegateAdapter notificationDelegateAdapter3 = this.f89971g;
            if (notificationDelegateAdapter3 == null) {
                C7573i.m23583a("mAdapter");
            }
            notificationDelegateAdapter3.ai_();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo87800a(R.id.c7s);
        C7573i.m23582a((Object) swipeRefreshLayout, "notification_swipe_refresh_layout");
        swipeRefreshLayout.setRefreshing(false);
        NotificationDelegateAdapter notificationDelegateAdapter4 = this.f89971g;
        if (notificationDelegateAdapter4 == null) {
            C7573i.m23583a("mAdapter");
        }
        notificationDelegateAdapter4.mo58045a(list);
        ((DmtStatusView) mo87800a(R.id.dav)).mo25939d();
    }
}
