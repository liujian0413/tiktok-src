package com.p280ss.android.ugc.aweme.setting.commentfilter;

import android.app.Activity;
import android.arch.lifecycle.C0043i;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.animation.AlphaAnimation;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.common.views.CommonItemView;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.IAccountUserService;
import com.p280ss.android.ugc.aweme.account.C21115b;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23083a;
import com.p280ss.android.ugc.aweme.arch.widgets.base.C23087c;
import com.p280ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p280ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p280ss.android.ugc.aweme.base.api.BaseResponse;
import com.p280ss.android.ugc.aweme.base.utils.C23486n;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy;
import com.p280ss.android.ugc.aweme.p1216fe.p1218b.C27870d;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.setting.commentfilter.adapter.KeywordListAdapter;
import com.p280ss.android.ugc.aweme.setting.commentfilter.p1514a.C37600a;
import com.p280ss.android.ugc.aweme.setting.serverpush.model.C37723b;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37708a;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37709b;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37713d;
import com.p280ss.android.ugc.aweme.setting.serverpush.p1527a.C37716e;
import com.p280ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.C7577n;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity */
public final class CommentFilterActivity extends AmeBaseActivity implements C0053p<C23083a>, C37708a, C37709b {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f98024a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentFilterActivity.class), "mModel", "getMModel()Lcom/ss/android/ugc/aweme/setting/commentfilter/model/CommentFilterModel;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentFilterActivity.class), "mPushSettingPresenter", "getMPushSettingPresenter()Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingFetchPresenter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentFilterActivity.class), "mPushSettingChangePresenter", "getMPushSettingChangePresenter()Lcom/ss/android/ugc/aweme/setting/serverpush/presenter/PushSettingChangePresenter;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(CommentFilterActivity.class), "mDataCenter", "getMDataCenter()Lcom/ss/android/ugc/aweme/arch/widgets/base/DataCenter;"))};

    /* renamed from: d */
    public static final C37589a f98025d = new C37589a(null);

    /* renamed from: b */
    public final C27870d f98026b = C27870d.m91297a();

    /* renamed from: c */
    public final String f98027c;

    /* renamed from: e */
    private String f98028e = "";

    /* renamed from: q */
    private int f98029q;

    /* renamed from: r */
    private int f98030r;

    /* renamed from: s */
    private boolean f98031s;

    /* renamed from: t */
    private boolean f98032t;

    /* renamed from: u */
    private final C7541d f98033u = C7546e.m23569a(new C37596h(this));

    /* renamed from: v */
    private final C7541d f98034v = C7546e.m23569a(new C37598j(this));

    /* renamed from: w */
    private final C7541d f98035w = C7546e.m23569a(new C37597i(this));

    /* renamed from: x */
    private final C7541d f98036x = C7546e.m23569a(new C37595g(this));

    /* renamed from: y */
    private HashMap f98037y;

    /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity$a */
    public static final class C37589a {
        private C37589a() {
        }

        public /* synthetic */ C37589a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity$b */
    static final class C37590b implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ CommentFilterActivity f98038a;

        /* renamed from: b */
        final /* synthetic */ AnimationSet f98039b;

        C37590b(CommentFilterActivity commentFilterActivity, AnimationSet animationSet) {
            this.f98038a = commentFilterActivity;
            this.f98039b = animationSet;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            Object systemService = this.f98038a.getSystemService("input_method");
            if (systemService != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                LinearLayout linearLayout = (LinearLayout) this.f98038a.mo94901a((int) R.id.a19);
                C7573i.m23582a((Object) linearLayout, "container");
                inputMethodManager.hideSoftInputFromWindow(linearLayout.getWindowToken(), 0);
                RecyclerView recyclerView = (RecyclerView) this.f98038a.mo94901a((int) R.id.bfo);
                C7573i.m23582a((Object) recyclerView, "keywords_list");
                C1262a adapter = recyclerView.getAdapter();
                if (!(adapter instanceof KeywordListAdapter)) {
                    adapter = null;
                }
                KeywordListAdapter keywordListAdapter = (KeywordListAdapter) adapter;
                if (keywordListAdapter != null) {
                    View view2 = keywordListAdapter.f98059d;
                    if (view2 != null) {
                        view2.clearFocus();
                    }
                }
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity$c */
    static final class C37591c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommentFilterActivity f98040a;

        C37591c(CommentFilterActivity commentFilterActivity) {
            this.f98040a = commentFilterActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f98040a.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity$d */
    static final class C37592d implements OnTouchListener {

        /* renamed from: a */
        final /* synthetic */ CommentFilterActivity f98041a;

        C37592d(CommentFilterActivity commentFilterActivity) {
            this.f98041a = commentFilterActivity;
        }

        public final boolean onTouch(View view, MotionEvent motionEvent) {
            RecyclerView recyclerView = (RecyclerView) this.f98041a.mo94901a((int) R.id.bfo);
            C7573i.m23582a((Object) recyclerView, "keywords_list");
            C1262a adapter = recyclerView.getAdapter();
            if (!(adapter instanceof KeywordListAdapter)) {
                adapter = null;
            }
            KeywordListAdapter keywordListAdapter = (KeywordListAdapter) adapter;
            if (keywordListAdapter != null) {
                View view2 = keywordListAdapter.f98059d;
                if (view2 != null) {
                    view2.clearFocus();
                }
            }
            Object systemService = this.f98041a.getSystemService("input_method");
            if (systemService != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                LinearLayout linearLayout = (LinearLayout) this.f98041a.mo94901a((int) R.id.a19);
                C7573i.m23582a((Object) linearLayout, "container");
                inputMethodManager.hideSoftInputFromWindow(linearLayout.getWindowToken(), 0);
                return false;
            }
            throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity$e */
    static final class C37593e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommentFilterActivity f98042a;

        C37593e(CommentFilterActivity commentFilterActivity) {
            this.f98042a = commentFilterActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            CommonItemView commonItemView = (CommonItemView) this.f98042a.mo94901a((int) R.id.za);
            C7573i.m23582a((Object) commonItemView, "comment_filter_item");
            CommonItemView commonItemView2 = (CommonItemView) this.f98042a.mo94901a((int) R.id.za);
            C7573i.m23582a((Object) commonItemView2, "comment_filter_item");
            commonItemView.setChecked(!commonItemView2.mo25778c());
            this.f98042a.mo94903j();
            CommonItemView commonItemView3 = (CommonItemView) this.f98042a.mo94901a((int) R.id.za);
            C7573i.m23582a((Object) commonItemView3, "comment_filter_item");
            if (commonItemView3.mo25778c() && ((ArrayList) this.f98042a.mo94902i().mo60135a("list_keywords")) == null) {
                this.f98042a.mo58711c().mo94911a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity$f */
    static final class C37594f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ CommentFilterActivity f98043a;

        C37594f(CommentFilterActivity commentFilterActivity) {
            this.f98043a = commentFilterActivity;
        }

        public final void onClick(View view) {
            int i;
            String str;
            ClickInstrumentation.onClick(view);
            CommonItemView commonItemView = (CommonItemView) this.f98043a.mo94901a((int) R.id.z_);
            C7573i.m23582a((Object) commonItemView, "comment_filter_ai");
            CommonItemView commonItemView2 = (CommonItemView) this.f98043a.mo94901a((int) R.id.z_);
            C7573i.m23582a((Object) commonItemView2, "comment_filter_ai");
            commonItemView.setChecked(!commonItemView2.mo25778c());
            CommonItemView commonItemView3 = (CommonItemView) this.f98043a.mo94901a((int) R.id.z_);
            C7573i.m23582a((Object) commonItemView3, "comment_filter_ai");
            if (commonItemView3.mo25778c()) {
                i = 1;
            } else {
                i = 2;
            }
            this.f98043a.mo59893d().mo56976a("comment_offensive_filter", Integer.valueOf(i));
            C27870d dVar = this.f98043a.f98026b;
            StringBuilder sb = new StringBuilder("comment_offensive_filter_");
            sb.append(this.f98043a.f98027c);
            dVar.mo71351b(sb.toString(), Integer.valueOf(i));
            CommonItemView commonItemView4 = (CommonItemView) this.f98043a.mo94901a((int) R.id.z_);
            C7573i.m23582a((Object) commonItemView4, "comment_filter_ai");
            if (commonItemView4.mo25778c()) {
                str = "ai_filter_on";
            } else {
                str = "ai_filter_off";
            }
            C6907h.m21524a(str, (Map) new C22984d().f60753a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity$g */
    static final class C37595g extends Lambda implements C7561a<DataCenter> {

        /* renamed from: a */
        final /* synthetic */ CommentFilterActivity f98044a;

        C37595g(CommentFilterActivity commentFilterActivity) {
            this.f98044a = commentFilterActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public DataCenter invoke() {
            return DataCenter.m75849a(C23087c.m75888a((FragmentActivity) this.f98044a), (C0043i) this.f98044a).mo60132a("list_keywords", (C0053p<C23083a>) this.f98044a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity$h */
    static final class C37596h extends Lambda implements C7561a<C37600a> {

        /* renamed from: a */
        final /* synthetic */ CommentFilterActivity f98045a;

        C37596h(CommentFilterActivity commentFilterActivity) {
            this.f98045a = commentFilterActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C37600a invoke() {
            return new C37600a(this.f98045a.mo94902i());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity$i */
    static final class C37597i extends Lambda implements C7561a<C37713d> {

        /* renamed from: a */
        final /* synthetic */ CommentFilterActivity f98046a;

        C37597i(CommentFilterActivity commentFilterActivity) {
            this.f98046a = commentFilterActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C37713d invoke() {
            C37713d dVar = new C37713d();
            dVar.mo66537a(this.f98046a);
            return dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity$j */
    static final class C37598j extends Lambda implements C7561a<C37716e> {

        /* renamed from: a */
        final /* synthetic */ CommentFilterActivity f98047a;

        C37598j(CommentFilterActivity commentFilterActivity) {
            this.f98047a = commentFilterActivity;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C37716e invoke() {
            C37716e eVar = new C37716e();
            eVar.mo66537a(this.f98047a);
            return eVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity$k */
    static final class C37599k<TTaskResult, TContinuationResult> implements C1591g<BaseResponse, Object> {

        /* renamed from: a */
        final /* synthetic */ CommentFilterActivity f98048a;

        /* renamed from: b */
        final /* synthetic */ ArrayList f98049b;

        C37599k(CommentFilterActivity commentFilterActivity, ArrayList arrayList) {
            this.f98048a = commentFilterActivity;
            this.f98049b = arrayList;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Void then(C1592h<BaseResponse> hVar) {
            Integer num;
            C7573i.m23582a((Object) hVar, "it");
            if (hVar.mo6887c() || hVar.mo6889d() || !hVar.mo6882b()) {
                return null;
            }
            CommonItemView commonItemView = (CommonItemView) this.f98048a.mo94901a((int) R.id.za);
            C7573i.m23582a((Object) commonItemView, "comment_filter_item");
            if (commonItemView.mo25778c()) {
                ArrayList arrayList = this.f98049b;
                if (arrayList != null) {
                    num = Integer.valueOf(arrayList.size());
                } else {
                    num = null;
                }
                if (num.intValue() == 0) {
                    this.f98048a.mo59893d().mo56976a("comment_filter_status", Integer.valueOf(2));
                }
            } else {
                this.f98048a.mo59893d().mo56976a("comment_filter_status", Integer.valueOf(2));
            }
            return null;
        }
    }

    /* renamed from: k */
    private final C37716e m120387k() {
        return (C37716e) this.f98034v.getValue();
    }

    /* renamed from: a */
    public final int mo58708a() {
        return R.layout.ay;
    }

    /* renamed from: a */
    public final View mo94901a(int i) {
        if (this.f98037y == null) {
            this.f98037y = new HashMap();
        }
        View view = (View) this.f98037y.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f98037y.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: c */
    public final C37600a mo58711c() {
        return (C37600a) this.f98033u.getValue();
    }

    /* renamed from: c_ */
    public final void mo83182c_(Exception exc) {
    }

    /* renamed from: d */
    public final C37713d mo59893d() {
        return (C37713d) this.f98035w.getValue();
    }

    /* renamed from: i */
    public final DataCenter mo94902i() {
        return (DataCenter) this.f98036x.getValue();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void setStatusBarColor() {
        C7212bb.m22498b(this);
    }

    public final void bJ_() {
        C10761a.m31399c((Context) this, (int) R.string.cr9).mo25750a();
    }

    public final void onDestroy() {
        super.onDestroy();
        ImmersionBar.with((Activity) this).destroy();
    }

    public final void bI_() {
        C27870d dVar = this.f98026b;
        StringBuilder sb = new StringBuilder("settings_times_");
        sb.append(this.f98027c);
        dVar.mo71352b(sb.toString(), "1");
        C27870d dVar2 = this.f98026b;
        StringBuilder sb2 = new StringBuilder("not_now_times_");
        sb2.append(this.f98027c);
        dVar2.mo71352b(sb2.toString(), "2");
    }

    public CommentFilterActivity() {
        IAccountUserService a = C21115b.m71197a();
        C7573i.m23582a((Object) a, "AccountUserProxyService.get()");
        this.f98027c = a.getCurUserId();
    }

    /* renamed from: j */
    public final void mo94903j() {
        CommonItemView commonItemView = (CommonItemView) mo94901a((int) R.id.za);
        C7573i.m23582a((Object) commonItemView, "comment_filter_item");
        if (commonItemView.mo25778c()) {
            ((CommonItemView) mo94901a((int) R.id.za)).setDesc(this.f98028e);
        } else {
            ((CommonItemView) mo94901a((int) R.id.za)).setDesc(getString(R.string.do_));
            Object systemService = getSystemService("input_method");
            if (systemService != null) {
                InputMethodManager inputMethodManager = (InputMethodManager) systemService;
                LinearLayout linearLayout = (LinearLayout) mo94901a((int) R.id.a19);
                C7573i.m23582a((Object) linearLayout, "container");
                inputMethodManager.hideSoftInputFromWindow(linearLayout.getWindowToken(), 0);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
            }
        }
        m120389m();
    }

    /* renamed from: l */
    private void m120388l() {
        boolean z;
        int i;
        View findViewById = findViewById(R.id.title);
        C7573i.m23582a((Object) findViewById, "findViewById<TextView>(R.id.title)");
        ((TextView) findViewById).setText(getString(R.string.dnm));
        ((ImageView) findViewById(R.id.jo)).setOnClickListener(new C37591c(this));
        ((LinearLayout) mo94901a((int) R.id.a19)).setOnTouchListener(new C37592d(this));
        CommonItemView commonItemView = (CommonItemView) mo94901a((int) R.id.za);
        C7573i.m23582a((Object) commonItemView, "comment_filter_item");
        boolean z2 = false;
        if (this.f98029q == 1) {
            z = true;
        } else {
            z = false;
        }
        commonItemView.setChecked(z);
        ((CommonItemView) mo94901a((int) R.id.za)).setOnClickListener(new C37593e(this));
        CommonItemView commonItemView2 = (CommonItemView) mo94901a((int) R.id.z_);
        C7573i.m23582a((Object) commonItemView2, "comment_filter_ai");
        if (this.f98031s) {
            i = 0;
        } else {
            i = 8;
        }
        commonItemView2.setVisibility(i);
        CommonItemView commonItemView3 = (CommonItemView) mo94901a((int) R.id.z_);
        C7573i.m23582a((Object) commonItemView3, "comment_filter_ai");
        if (this.f98030r != 2) {
            z2 = true;
        }
        commonItemView3.setChecked(z2);
        ((CommonItemView) mo94901a((int) R.id.z_)).setOnClickListener(new C37594f(this));
    }

    /* renamed from: m */
    private final void m120389m() {
        CommonItemView commonItemView = (CommonItemView) mo94901a((int) R.id.za);
        C7573i.m23582a((Object) commonItemView, "comment_filter_item");
        if (commonItemView.mo25778c()) {
            AnimationSet animationSet = new AnimationSet(true);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(300);
            animationSet.addAnimation(alphaAnimation);
            TranslateAnimation translateAnimation = new TranslateAnimation(0.0f, 0.0f, (float) (-C23486n.m77122a(48.0d)), 0.0f);
            translateAnimation.setDuration(300);
            animationSet.addAnimation(translateAnimation);
            RecyclerView recyclerView = (RecyclerView) mo94901a((int) R.id.bfo);
            C1273i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager == null) {
                layoutManager = new WrapLinearLayoutManager(this);
            }
            recyclerView.setLayoutManager(layoutManager);
            C1262a adapter = recyclerView.getAdapter();
            if (adapter == null) {
                Context context = this;
                LinearLayout linearLayout = (LinearLayout) mo94901a((int) R.id.a19);
                C7573i.m23582a((Object) linearLayout, "container");
                adapter = new KeywordListAdapter(context, linearLayout);
            }
            recyclerView.setAdapter(adapter);
            recyclerView.setItemViewCacheSize(0);
            recyclerView.setVisibility(0);
            recyclerView.startAnimation(animationSet);
            recyclerView.setOnTouchListener(new C37590b(this, animationSet));
            return;
        }
        AnimationSet animationSet2 = new AnimationSet(true);
        AlphaAnimation alphaAnimation2 = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation2.setDuration(300);
        animationSet2.addAnimation(alphaAnimation2);
        TranslateAnimation translateAnimation2 = new TranslateAnimation(0.0f, 0.0f, 0.0f, (float) (-C23486n.m77122a(48.0d)));
        translateAnimation2.setDuration(300);
        animationSet2.addAnimation(translateAnimation2);
        RecyclerView recyclerView2 = (RecyclerView) mo94901a((int) R.id.bfo);
        recyclerView2.setVisibility(8);
        recyclerView2.startAnimation(animationSet2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ae  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x012e  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0130  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0149  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x014c  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x0161  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x0166  */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x0189  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x01a8  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01bc  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x01d7  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onBackPressed() {
        /*
            r8 = this;
            boolean r0 = r8.f98032t
            r1 = 0
            if (r0 != 0) goto L_0x000c
            r8.setResult(r1)
            super.onBackPressed()
            return
        L_0x000c:
            r0 = 2131299229(0x7f090b9d, float:1.8216454E38)
            android.view.View r0 = r8.mo94901a(r0)
            android.support.v7.widget.RecyclerView r0 = (android.support.p029v7.widget.RecyclerView) r0
            java.lang.String r2 = "keywords_list"
            kotlin.jvm.internal.C7573i.m23582a(r0, r2)
            android.support.v7.widget.RecyclerView$a r0 = r0.getAdapter()
            boolean r2 = r0 instanceof com.p280ss.android.ugc.aweme.setting.commentfilter.adapter.KeywordListAdapter
            r3 = 0
            if (r2 != 0) goto L_0x0024
            r0 = r3
        L_0x0024:
            com.ss.android.ugc.aweme.setting.commentfilter.adapter.KeywordListAdapter r0 = (com.p280ss.android.ugc.aweme.setting.commentfilter.adapter.KeywordListAdapter) r0
            r2 = 1
            if (r0 == 0) goto L_0x00a4
            java.util.List<java.lang.String> r0 = r0.f98056a
            if (r0 == 0) goto L_0x00a4
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Collection r4 = (java.util.Collection) r4
            java.util.Iterator r0 = r0.iterator()
        L_0x003a:
            boolean r5 = r0.hasNext()
            if (r5 == 0) goto L_0x0068
            java.lang.Object r5 = r0.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            if (r6 == 0) goto L_0x0060
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            java.lang.CharSequence r6 = kotlin.text.C7634n.m23774c(r6)
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = ""
            boolean r6 = kotlin.jvm.internal.C7573i.m23585a(r6, r7)
            r6 = r6 ^ r2
            if (r6 == 0) goto L_0x003a
            r4.add(r5)
            goto L_0x003a
        L_0x0060:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
            r0.<init>(r1)
            throw r0
        L_0x0068:
            java.util.List r4 = (java.util.List) r4
            java.lang.Iterable r4 = (java.lang.Iterable) r4
            java.util.ArrayList r0 = new java.util.ArrayList
            r5 = 10
            int r5 = kotlin.collections.C7525m.m23469a(r4, r5)
            r0.<init>(r5)
            java.util.Collection r0 = (java.util.Collection) r0
            java.util.Iterator r4 = r4.iterator()
        L_0x007d:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x00a1
            java.lang.Object r5 = r4.next()
            java.lang.String r5 = (java.lang.String) r5
            if (r5 == 0) goto L_0x0099
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.CharSequence r5 = kotlin.text.C7634n.m23762b(r5)
            java.lang.String r5 = r5.toString()
            r0.add(r5)
            goto L_0x007d
        L_0x0099:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.CharSequence"
            r0.<init>(r1)
            throw r0
        L_0x00a1:
            java.util.List r0 = (java.util.List) r0
            goto L_0x00a5
        L_0x00a4:
            r0 = r3
        L_0x00a5:
            boolean r4 = r0 instanceof java.util.ArrayList
            if (r4 != 0) goto L_0x00aa
            r0 = r3
        L_0x00aa:
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            if (r0 == 0) goto L_0x00d0
            com.ss.android.ugc.aweme.setting.commentfilter.a.a r3 = r8.mo58711c()
            com.google.gson.e r4 = new com.google.gson.e
            r4.<init>()
            java.lang.String r4 = r4.mo15979b(r0)
            java.lang.String r5 = "Gson().toJson(recyclerList)"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            bolts.h r3 = r3.mo94910a(r4)
            com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity$k r4 = new com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity$k
            r4.<init>(r8, r0)
            bolts.g r4 = (bolts.C1591g) r4
            java.util.concurrent.Executor r5 = bolts.C1592h.f5958b
            r3.mo6876a(r4, r5)
        L_0x00d0:
            r3 = 2131297218(0x7f0903c2, float:1.8212375E38)
            android.view.View r4 = r8.mo94901a(r3)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = (com.bytedance.ies.dmt.p262ui.common.views.CommonItemView) r4
            java.lang.String r5 = "comment_filter_item"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            boolean r4 = r4.mo25778c()
            if (r4 == 0) goto L_0x010a
            if (r0 == 0) goto L_0x010a
            int r0 = r0.size()
            if (r0 != 0) goto L_0x010a
            android.view.View r0 = r8.mo94901a(r3)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = (com.bytedance.ies.dmt.p262ui.common.views.CommonItemView) r0
            java.lang.String r4 = "comment_filter_item"
            kotlin.jvm.internal.C7573i.m23582a(r0, r4)
            android.view.View r4 = r8.mo94901a(r3)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = (com.bytedance.ies.dmt.p262ui.common.views.CommonItemView) r4
            java.lang.String r5 = "comment_filter_item"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            boolean r4 = r4.mo25778c()
            r4 = r4 ^ r2
            r0.setChecked(r4)
        L_0x010a:
            com.ss.android.ugc.aweme.fe.b.d r0 = r8.f98026b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "comment_filter_status_"
            r4.<init>(r5)
            java.lang.String r5 = r8.f98027c
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            android.view.View r5 = r8.mo94901a(r3)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r5 = (com.bytedance.ies.dmt.p262ui.common.views.CommonItemView) r5
            java.lang.String r6 = "comment_filter_item"
            kotlin.jvm.internal.C7573i.m23582a(r5, r6)
            boolean r5 = r5.mo25778c()
            r6 = 2
            if (r5 == 0) goto L_0x0130
            r5 = 1
            goto L_0x0131
        L_0x0130:
            r5 = 2
        L_0x0131:
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r0.mo71351b(r4, r5)
            android.view.View r0 = r8.mo94901a(r3)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r0 = (com.bytedance.ies.dmt.p262ui.common.views.CommonItemView) r0
            java.lang.String r4 = "comment_filter_item"
            kotlin.jvm.internal.C7573i.m23582a(r0, r4)
            boolean r0 = r0.mo25778c()
            if (r0 == 0) goto L_0x014c
            java.lang.String r0 = "filter_on"
            goto L_0x014e
        L_0x014c:
            java.lang.String r0 = "filter_off"
        L_0x014e:
            android.view.View r4 = r8.mo94901a(r3)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = (com.bytedance.ies.dmt.p262ui.common.views.CommonItemView) r4
            java.lang.String r5 = "comment_filter_item"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            boolean r4 = r4.mo25778c()
            int r5 = r8.f98029q
            if (r5 != r2) goto L_0x0163
            r5 = 1
            goto L_0x0164
        L_0x0163:
            r5 = 0
        L_0x0164:
            if (r4 == r5) goto L_0x0170
            com.ss.android.ugc.aweme.app.g.d r4 = new com.ss.android.ugc.aweme.app.g.d
            r4.<init>()
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f60753a
            com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r4)
        L_0x0170:
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r4 = "comment_filter_status"
            android.view.View r3 = r8.mo94901a(r3)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r3 = (com.bytedance.ies.dmt.p262ui.common.views.CommonItemView) r3
            java.lang.String r5 = "comment_filter_item"
            kotlin.jvm.internal.C7573i.m23582a(r3, r5)
            boolean r3 = r3.mo25778c()
            if (r3 == 0) goto L_0x0189
            r3 = 1
            goto L_0x018a
        L_0x0189:
            r3 = 2
        L_0x018a:
            r0.putExtra(r4, r3)
            android.content.Intent r0 = r8.getIntent()
            java.lang.String r3 = "comment_offensive_filter"
            r4 = 2131297217(0x7f0903c1, float:1.8212373E38)
            android.view.View r4 = r8.mo94901a(r4)
            com.bytedance.ies.dmt.ui.common.views.CommonItemView r4 = (com.bytedance.ies.dmt.p262ui.common.views.CommonItemView) r4
            java.lang.String r5 = "comment_filter_ai"
            kotlin.jvm.internal.C7573i.m23582a(r4, r5)
            boolean r4 = r4.mo25778c()
            if (r4 == 0) goto L_0x01a8
            goto L_0x01a9
        L_0x01a8:
            r2 = 2
        L_0x01a9:
            r0.putExtra(r3, r2)
            r0 = -1
            android.content.Intent r2 = r8.getIntent()
            r8.setResult(r0, r2)
            java.lang.String r0 = "input_method"
            java.lang.Object r0 = r8.getSystemService(r0)
            if (r0 == 0) goto L_0x01d7
            android.view.inputmethod.InputMethodManager r0 = (android.view.inputmethod.InputMethodManager) r0
            r2 = 2131297290(0x7f09040a, float:1.821252E38)
            android.view.View r2 = r8.mo94901a(r2)
            android.widget.LinearLayout r2 = (android.widget.LinearLayout) r2
            java.lang.String r3 = "container"
            kotlin.jvm.internal.C7573i.m23582a(r2, r3)
            android.os.IBinder r2 = r2.getWindowToken()
            r0.hideSoftInputFromWindow(r2, r1)
            super.onBackPressed()
            return
        L_0x01d7:
            kotlin.TypeCastException r0 = new kotlin.TypeCastException
            java.lang.String r1 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity.onBackPressed():void");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void onChanged(C23083a aVar) {
        List list;
        KeywordListAdapter keywordListAdapter = null;
        if (aVar != null) {
            list = (List) aVar.mo60161a();
        } else {
            list = null;
        }
        if (!C7577n.m23623c(list)) {
            list = null;
        }
        if (list != null) {
            RecyclerView recyclerView = (RecyclerView) mo94901a((int) R.id.bfo);
            C7573i.m23582a((Object) recyclerView, "keywords_list");
            C1262a adapter = recyclerView.getAdapter();
            if (adapter instanceof KeywordListAdapter) {
                keywordListAdapter = adapter;
            }
            KeywordListAdapter keywordListAdapter2 = keywordListAdapter;
            if (keywordListAdapter2 != null) {
                List<String> list2 = keywordListAdapter2.f98056a;
                if (list2 != null) {
                    list2.addAll(1, list);
                }
            }
            RecyclerView recyclerView2 = (RecyclerView) mo94901a((int) R.id.bfo);
            C7573i.m23582a((Object) recyclerView2, "keywords_list");
            C1262a adapter2 = recyclerView2.getAdapter();
            if (adapter2 != null) {
                adapter2.notifyItemRangeInserted(1, list.size());
            }
            this.f98032t = true;
        }
    }

    /* renamed from: a */
    public final void mo83181a(C37723b bVar) {
        int i;
        int i2;
        boolean z;
        if (bVar == null || bVar.f98252J != this.f98030r || bVar.f98251I != this.f98029q) {
            boolean z2 = true;
            if (bVar == null || bVar.f98252J != this.f98030r) {
                if (bVar != null) {
                    i2 = bVar.f98252J;
                } else {
                    i2 = 0;
                }
                this.f98030r = i2;
                CommonItemView commonItemView = (CommonItemView) mo94901a((int) R.id.z_);
                C7573i.m23582a((Object) commonItemView, "comment_filter_ai");
                if (this.f98030r != 2) {
                    z = true;
                } else {
                    z = false;
                }
                commonItemView.setChecked(z);
            }
            if (bVar == null || bVar.f98251I != this.f98029q) {
                if (bVar != null) {
                    i = bVar.f98251I;
                } else {
                    i = 0;
                }
                this.f98029q = i;
                CommonItemView commonItemView2 = (CommonItemView) mo94901a((int) R.id.za);
                C7573i.m23582a((Object) commonItemView2, "comment_filter_item");
                if (this.f98029q != 1) {
                    z2 = false;
                }
                commonItemView2.setChecked(z2);
                CommonItemView commonItemView3 = (CommonItemView) mo94901a((int) R.id.za);
                C7573i.m23582a((Object) commonItemView3, "comment_filter_item");
                if (commonItemView3.mo25778c()) {
                    mo58711c().mo94911a();
                }
                mo94903j();
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        String str;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity", "onCreate", true);
        super.onCreate(bundle);
        try {
            IESSettingsProxy a = C30199h.m98861a();
            C7573i.m23582a((Object) a, "SettingsReader.get()");
            Boolean enableCommentOffensiveFilterSwitch = a.getEnableCommentOffensiveFilterSwitch();
            C7573i.m23582a((Object) enableCommentOffensiveFilterSwitch, "SettingsReader.get().ena…mentOffensiveFilterSwitch");
            this.f98031s = enableCommentOffensiveFilterSwitch.booleanValue();
        } catch (NullValueException unused) {
            this.f98031s = false;
        }
        C27870d dVar = this.f98026b;
        StringBuilder sb = new StringBuilder("comment_offensive_filter_");
        sb.append(this.f98027c);
        Integer a2 = dVar.mo71347a(sb.toString(), Integer.valueOf(0));
        C7573i.m23582a((Object) a2, "storage.get(COMMENT_OFFE…NSIVE_FILTER_NEVER_USERD)");
        this.f98030r = a2.intValue();
        C27870d dVar2 = this.f98026b;
        StringBuilder sb2 = new StringBuilder("comment_filter_status_");
        sb2.append(this.f98027c);
        Integer a3 = dVar2.mo71347a(sb2.toString(), Integer.valueOf(0));
        C7573i.m23582a((Object) a3, "storage.get(COMMENT_FILT…OMMENT_FILTER_NEVER_USED)");
        this.f98029q = a3.intValue();
        m120388l();
        m120387k().mo56976a(new Object[0]);
        StringBuilder sb3 = new StringBuilder();
        sb3.append(getString(R.string.do_));
        sb3.append("\n");
        try {
            IESSettingsProxy a4 = C30199h.m98861a();
            C7573i.m23582a((Object) a4, "SettingsReader.get()");
            str = a4.getCommentFilterTipsSupported();
        } catch (NullValueException unused2) {
            str = "";
        }
        sb3.append(str);
        String sb4 = sb3.toString();
        if (sb4 != null) {
            this.f98028e = C7634n.m23762b(sb4).toString();
            CommonItemView commonItemView = (CommonItemView) mo94901a((int) R.id.za);
            C7573i.m23582a((Object) commonItemView, "comment_filter_item");
            if (commonItemView.mo25778c()) {
                mo58711c().mo94911a();
                mo94903j();
            }
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.setting.commentfilter.CommentFilterActivity", "onCreate", false);
            return;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlin.CharSequence");
    }
}
