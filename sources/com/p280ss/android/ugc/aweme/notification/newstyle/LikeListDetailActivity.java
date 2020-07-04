package com.p280ss.android.ugc.aweme.notification.newstyle;

import android.app.Activity;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1267f;
import android.support.p029v7.widget.RecyclerView.C1272h;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.SimpleItemAnimator;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.widget.AutoRTLImageView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p262ui.widget.DmtStatusView.C10803a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p280ss.android.ugc.aweme.base.model.UrlModel;
import com.p280ss.android.ugc.aweme.base.p308ui.RecyclerItemDecoration;
import com.p280ss.android.ugc.aweme.common.adapter.LoadMoreRecyclerViewAdapter.C6905a;
import com.p280ss.android.ugc.aweme.common.p1144e.C25675c;
import com.p280ss.android.ugc.aweme.framework.fresco.FrescoRecycleViewScrollListener;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.notification.newstyle.adapter.LikeListAdapter;
import com.p280ss.android.ugc.aweme.notification.newstyle.model.C34555b;
import com.p280ss.android.ugc.aweme.notification.newstyle.p1440a.C34499a;
import com.p280ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.p280ss.android.ugc.aweme.router.C7203u;
import com.p280ss.android.ugc.aweme.userservice.api.C42846a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.C7581n;
import kotlin.LazyThreadSafetyMode;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity */
public final class LikeListDetailActivity extends AmeSSActivity implements C6905a, C25675c<User> {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f89891a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeListDetailActivity.class), "mAdapter", "getMAdapter()Lcom/ss/android/ugc/aweme/notification/newstyle/adapter/LikeListAdapter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeListDetailActivity.class), "mPresenter", "getMPresenter()Lcom/ss/android/ugc/aweme/notification/newstyle/presenter/LikeListPresenter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeListDetailActivity.class), "mAwemeId", "getMAwemeId()Ljava/lang/String;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeListDetailActivity.class), "mRefId", "getMRefId()Ljava/lang/String;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeListDetailActivity.class), "mDiggType", "getMDiggType()I")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeListDetailActivity.class), "mIsNew", "getMIsNew()Z")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeListDetailActivity.class), "mLastReadTime", "getMLastReadTime()J")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeListDetailActivity.class), "mSecondTitle", "getMSecondTitle()Ljava/lang/String;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(LikeListDetailActivity.class), "mCover", "getMCover()Lcom/ss/android/ugc/aweme/base/model/UrlModel;"))};

    /* renamed from: b */
    public static final C34455a f89892b = new C34455a(null);

    /* renamed from: m */
    private static final int f89893m = ((int) C9738o.m28708b(C6399b.m19921a(), 8.0f));

    /* renamed from: c */
    private ImmersionBar f89894c;

    /* renamed from: d */
    private final C7541d f89895d = C7546e.m23568a(LazyThreadSafetyMode.NONE, C34460f.f89909a);

    /* renamed from: e */
    private final C7541d f89896e = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C34466l(this));

    /* renamed from: f */
    private final C7541d f89897f = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C34461g(this));

    /* renamed from: g */
    private final C7541d f89898g = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C34467m(this));

    /* renamed from: h */
    private final C7541d f89899h = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C34463i(this));

    /* renamed from: i */
    private final C7541d f89900i = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C34464j(this));

    /* renamed from: j */
    private final C7541d f89901j = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C34465k(this));

    /* renamed from: k */
    private final C7541d f89902k = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C34468n(this));

    /* renamed from: l */
    private final C7541d f89903l = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C34462h(this));

    /* renamed from: n */
    private HashMap f89904n;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$a */
    public static final class C34455a {
        private C34455a() {
        }

        public /* synthetic */ C34455a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m111439a(Context context, String str, String str2, boolean z, int i, long j, String str3, UrlModel urlModel) {
            boolean z2;
            C7573i.m23587b(context, "context");
            CharSequence charSequence = str;
            boolean z3 = false;
            if (charSequence == null || charSequence.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                CharSequence charSequence2 = str2;
                if (charSequence2 == null || charSequence2.length() == 0) {
                    z3 = true;
                }
                if (!z3) {
                    Intent intent = new Intent(context, LikeListDetailActivity.class);
                    intent.putExtra("aweme_id", str);
                    intent.putExtra("ref_id", str2);
                    intent.putExtra("is_new", z);
                    intent.putExtra("digg_type", i);
                    intent.putExtra("last_read_time", j);
                    intent.putExtra("second_title", str3);
                    if (urlModel != null) {
                        intent.putExtra("cover", urlModel);
                    }
                    context.startActivity(intent);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$b */
    static final class C34456b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f89905a;

        C34456b(LikeListDetailActivity likeListDetailActivity) {
            this.f89905a = likeListDetailActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f89905a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$c */
    static final class C34457c<TTaskResult, TContinuationResult> implements C1591g<Void, C7581n> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f89906a;

        C34457c(LikeListDetailActivity likeListDetailActivity) {
            this.f89906a = likeListDetailActivity;
        }

        public final /* synthetic */ Object then(C1592h hVar) {
            m111440a(hVar);
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m111440a(C1592h<Void> hVar) {
            if (this.f89906a.isViewValid()) {
                ((DmtStatusView) this.f89906a.mo87769a(R.id.dav)).mo25944h();
                C10761a.m31399c((Context) this.f89906a, (int) R.string.cjs).mo25750a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$d */
    static final class C34458d extends Lambda implements C7561a<C7581n> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f89907a;

        C34458d(LikeListDetailActivity likeListDetailActivity) {
            this.f89907a = likeListDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            m111441a();
            return C7581n.f20898a;
        }

        /* renamed from: a */
        private void m111441a() {
            StringBuilder sb = new StringBuilder("aweme://aweme/detail/");
            sb.append(this.f89907a.mo87771f());
            C7203u a = C7203u.m22460a(sb.toString()).mo18694a("refer", "message");
            if (this.f89907a.mo87773h() == 3) {
                a.mo18694a("cid", this.f89907a.mo87772g());
            }
            C7195s.m22438a().mo18682a(a.mo18695a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$e */
    static final class C34459e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f89908a;

        C34459e(LikeListDetailActivity likeListDetailActivity) {
            this.f89908a = likeListDetailActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f89908a.mo87776l();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$f */
    static final class C34460f extends Lambda implements C7561a<LikeListAdapter> {

        /* renamed from: a */
        public static final C34460f f89909a = new C34460f();

        C34460f() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return m111442a();
        }

        /* renamed from: a */
        private static LikeListAdapter m111442a() {
            return new LikeListAdapter(0, 1, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$g */
    static final class C34461g extends Lambda implements C7561a<String> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f89910a;

        C34461g(LikeListDetailActivity likeListDetailActivity) {
            this.f89910a = likeListDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String invoke() {
            return this.f89910a.getIntent().getStringExtra("aweme_id");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$h */
    static final class C34462h extends Lambda implements C7561a<UrlModel> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f89911a;

        C34462h(LikeListDetailActivity likeListDetailActivity) {
            this.f89911a = likeListDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public UrlModel invoke() {
            Serializable serializableExtra = this.f89911a.getIntent().getSerializableExtra("cover");
            if (!(serializableExtra instanceof UrlModel)) {
                serializableExtra = null;
            }
            return (UrlModel) serializableExtra;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$i */
    static final class C34463i extends Lambda implements C7561a<Integer> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f89912a;

        C34463i(LikeListDetailActivity likeListDetailActivity) {
            this.f89912a = likeListDetailActivity;
            super(0);
        }

        /* renamed from: a */
        private int m111445a() {
            return this.f89912a.getIntent().getIntExtra("digg_type", 1);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(m111445a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$j */
    static final class C34464j extends Lambda implements C7561a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f89913a;

        C34464j(LikeListDetailActivity likeListDetailActivity) {
            this.f89913a = likeListDetailActivity;
            super(0);
        }

        /* renamed from: a */
        private boolean m111446a() {
            return this.f89913a.getIntent().getBooleanExtra("is_new", true);
        }

        public final /* synthetic */ Object invoke() {
            return Boolean.valueOf(m111446a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$k */
    static final class C34465k extends Lambda implements C7561a<Long> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f89914a;

        C34465k(LikeListDetailActivity likeListDetailActivity) {
            this.f89914a = likeListDetailActivity;
            super(0);
        }

        /* renamed from: a */
        private long m111447a() {
            return this.f89914a.getIntent().getLongExtra("last_read_time", 0);
        }

        public final /* synthetic */ Object invoke() {
            return Long.valueOf(m111447a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$l */
    static final class C34466l extends Lambda implements C7561a<C34499a> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f89915a;

        C34466l(LikeListDetailActivity likeListDetailActivity) {
            this.f89915a = likeListDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C34499a invoke() {
            C34499a aVar = new C34499a();
            String g = this.f89915a.mo87772g();
            C7573i.m23582a((Object) g, "mRefId");
            C34555b bVar = new C34555b(g, this.f89915a.mo87774j(), this.f89915a.mo87773h(), this.f89915a.mo87775k());
            aVar.mo66536a(bVar);
            aVar.mo66537a(this.f89915a);
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$m */
    static final class C34467m extends Lambda implements C7561a<String> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f89916a;

        C34467m(LikeListDetailActivity likeListDetailActivity) {
            this.f89916a = likeListDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String invoke() {
            return this.f89916a.getIntent().getStringExtra("ref_id");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$n */
    static final class C34468n extends Lambda implements C7561a<String> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f89917a;

        C34468n(LikeListDetailActivity likeListDetailActivity) {
            this.f89917a = likeListDetailActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String invoke() {
            return this.f89917a.getIntent().getStringExtra("second_title");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity$o */
    static final class C34469o<T> implements C0053p<FollowStatus> {

        /* renamed from: a */
        final /* synthetic */ LikeListDetailActivity f89918a;

        C34469o(LikeListDetailActivity likeListDetailActivity) {
            this.f89918a = likeListDetailActivity;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(FollowStatus followStatus) {
            if (followStatus != null) {
                this.f89918a.mo87770e().mo87812a(followStatus);
            }
        }
    }

    /* renamed from: m */
    private final C34499a m111417m() {
        return (C34499a) this.f89896e.getValue();
    }

    /* renamed from: n */
    private final String m111418n() {
        return (String) this.f89902k.getValue();
    }

    /* renamed from: o */
    private final UrlModel m111419o() {
        return (UrlModel) this.f89903l.getValue();
    }

    /* renamed from: a */
    public final View mo87769a(int i) {
        if (this.f89904n == null) {
            this.f89904n = new HashMap();
        }
        View view = (View) this.f89904n.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f89904n.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    public final void aE_() {
    }

    /* renamed from: c */
    public final void mo59109c(Exception exc) {
    }

    /* renamed from: c */
    public final void mo59110c(List<User> list, boolean z) {
    }

    /* renamed from: e */
    public final LikeListAdapter mo87770e() {
        return (LikeListAdapter) this.f89895d.getValue();
    }

    /* renamed from: f */
    public final String mo87771f() {
        return (String) this.f89897f.getValue();
    }

    /* renamed from: g */
    public final String mo87772g() {
        return (String) this.f89898g.getValue();
    }

    /* renamed from: h */
    public final int mo87773h() {
        return ((Number) this.f89899h.getValue()).intValue();
    }

    /* renamed from: j */
    public final boolean mo87774j() {
        return ((Boolean) this.f89900i.getValue()).booleanValue();
    }

    /* renamed from: k */
    public final long mo87775k() {
        return ((Number) this.f89901j.getValue()).longValue();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void aD_() {
        mo87770e().ag_();
    }

    public final void bd_() {
        m111417m().mo87806g();
    }

    /* renamed from: s */
    private final void m111423s() {
        mo87770e().ah_();
        mo87770e().mo66516d(false);
    }

    /* renamed from: S_ */
    public final void mo59098S_() {
        ((DmtStatusView) mo87769a(R.id.dav)).mo25942f();
    }

    public final void onDestroy() {
        super.onDestroy();
        m111417m().mo59134U_();
        ImmersionBar immersionBar = this.f89894c;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
    }

    public final void setStatusBarColor() {
        this.f89894c = ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.a03);
        ImmersionBar immersionBar = this.f89894c;
        if (immersionBar != null) {
            immersionBar.init();
        }
    }

    /* renamed from: q */
    private final void m111421q() {
        ((DmtStatusView) mo87769a(R.id.dav)).setBuilder(C10803a.m31631a((Context) this).mo25953a().mo25955a((int) R.string.bm5, (int) R.string.bm4).mo25956a(R.drawable.b7_, R.string.fi5, R.string.fi2, R.string.fia, new C34459e(this)));
    }

    /* renamed from: r */
    private final void m111422r() {
        boolean z;
        CharSequence f = mo87771f();
        if (f == null || f.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            mo87770e().f89997a = m111419o();
            mo87770e().f89998b = m111418n();
            mo87770e().mo87813a((C7561a<C7581n>) new C34458d<C7581n>(this));
        }
    }

    public final void ae_() {
        if (mo87770e().f67566v) {
            mo87770e().mo66516d(false);
            mo87770e().notifyDataSetChanged();
            m111423s();
        }
        if (mo87770e().getItemCount() == 0) {
            ((DmtStatusView) mo87769a(R.id.dav)).mo25943g();
        }
    }

    /* renamed from: l */
    public final void mo87776l() {
        if (C34498a.m111538a(this)) {
            if (mo87770e().getItemCount() == 0) {
                ((DmtStatusView) mo87769a(R.id.dav)).mo25942f();
            }
            m111417m().mo87805f();
            return;
        }
        if (mo87770e().getItemCount() == 0) {
            C1592h.m7848a(100).mo6876a((C1591g<TResult, TContinuationResult>) new C34457c<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: p */
    private final void m111420p() {
        RecyclerView recyclerView = (RecyclerView) mo87769a(R.id.c7m);
        C7573i.m23582a((Object) recyclerView, "notification_recycler_view");
        C1267f itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            ((SimpleItemAnimator) itemAnimator).f5112m = false;
            RecyclerView recyclerView2 = (RecyclerView) mo87769a(R.id.c7m);
            C7573i.m23582a((Object) recyclerView2, "notification_recycler_view");
            Context context = this;
            recyclerView2.setLayoutManager(new LinearLayoutManager(context));
            ((RecyclerView) mo87769a(R.id.c7m)).mo5525a((C1272h) new RecyclerItemDecoration(1, (int) C9738o.m28708b(context, 1.0f), 0));
            ((RecyclerView) mo87769a(R.id.c7m)).mo5528a((C1281m) new FrescoRecycleViewScrollListener(context));
            m111421q();
            if (VERSION.SDK_INT >= 19) {
                View a = mo87769a(R.id.dal);
                C7573i.m23582a((Object) a, "status_bar");
                a.getLayoutParams().height = C10994a.m32204a(context);
            }
            ((AutoRTLImageView) mo87769a(R.id.jo)).setOnClickListener(new C34456b(this));
            m111422r();
            mo87770e().mo66504a((C6905a) this);
            mo87770e().mo66516d(true);
            mo87770e().ah_();
            RecyclerView recyclerView3 = (RecyclerView) mo87769a(R.id.c7m);
            C7573i.m23582a((Object) recyclerView3, "notification_recycler_view");
            recyclerView3.setAdapter(mo87770e());
            ((DmtStatusView) mo87769a(R.id.dav)).mo25942f();
            mo87776l();
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.SimpleItemAnimator");
    }

    /* renamed from: b */
    public final void mo59107b(Exception exc) {
        mo87770e().mo66508i();
    }

    /* renamed from: a_ */
    public final void mo59105a_(Exception exc) {
        if (mo87770e().f67566v) {
            mo87770e().mo66516d(false);
            mo87770e().notifyDataSetChanged();
        }
        if (mo87770e().getItemCount() == 0) {
            ((DmtStatusView) mo87769a(R.id.dav)).mo25944h();
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.cn);
        m111420p();
        ((C42846a) ServiceManager.get().getService(C42846a.class)).mo104556b().observe(this, new C34469o(this));
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.LikeListDetailActivity", "onCreate", false);
    }

    /* renamed from: b */
    public final void mo59108b(List<User> list, boolean z) {
        boolean z2;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            z = false;
        }
        if (!z) {
            m111423s();
        } else {
            mo87770e().ai_();
        }
        mo87770e().f90000d = m111417m().mo87804e();
        mo87770e().mo62323c(list);
    }

    /* renamed from: a */
    public final void mo59099a(List<User> list, boolean z) {
        int i;
        mo87770e().mo66516d(true);
        if (!z) {
            m111423s();
        } else {
            mo87770e().ai_();
        }
        if (m111417m().mo87804e() == 0) {
            i = f89893m;
        } else {
            i = 0;
        }
        ((FrameLayout) mo87769a(R.id.c7_)).setPadding(0, i, 0, 0);
        mo87770e().f90000d = m111417m().mo87804e();
        mo87770e().mo58045a(list);
        ((DmtStatusView) mo87769a(R.id.dav)).mo25939d();
    }
}
