package com.p280ss.android.ugc.aweme.account.login;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p029v7.widget.LinearLayoutManager;
import android.support.p029v7.widget.RecyclerView;
import android.support.p029v7.widget.RecyclerView.C1262a;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1281m;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.login.I18nSignUpLoginPageActivity.C21257a;
import com.p280ss.android.ugc.aweme.account.login.LoginChannleAdapter.LoginChannleView;
import com.p280ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.p280ss.android.ugc.aweme.account.login.p975v2.C21886a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.SignUpOrLoginActivity.C22045a;
import com.p280ss.android.ugc.aweme.account.login.viewmodel.C22162a;
import com.p280ss.android.ugc.aweme.account.login.viewmodel.C22162a.C22164a;
import com.p280ss.android.ugc.aweme.account.login.viewmodel.C22172c;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p946i.C21220e;
import com.p280ss.android.ugc.aweme.account.p946i.C21221f;
import com.p280ss.android.ugc.aweme.account.p951l.C21242e;
import com.p280ss.android.ugc.aweme.account.util.ThirdLoginSetting;
import com.p280ss.android.ugc.aweme.base.p1056b.C23275a;
import com.p280ss.android.ugc.aweme.base.p1056b.C23277b;
import com.p280ss.android.ugc.aweme.base.p1056b.C23278c;
import com.p280ss.android.ugc.aweme.base.utils.C23485m;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.main.p1385g.C33026l;
import com.p280ss.android.ugc.aweme.p1416n.C34032a;
import com.p280ss.android.ugc.aweme.p307au.C6887b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.List;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.LazyThreadSafetyMode;
import kotlin.TypeCastException;
import kotlin.collections.C7507ae;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import kotlin.text.C7634n;

/* renamed from: com.ss.android.ugc.aweme.account.login.i */
public final class C21539i implements C23278c {

    /* renamed from: a */
    static final /* synthetic */ C7595j[] f57850a = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21539i.class), "title_bar", "getTitle_bar()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21539i.class), "divider", "getDivider()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21539i.class), "help", "getHelp()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21539i.class), "ll_login_group", "getLl_login_group()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21539i.class), "channle_list", "getChannle_list()Landroid/support/v7/widget/RecyclerView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21539i.class), "more", "getMore()Landroid/view/View;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21539i.class), "close", "getClose()Landroid/widget/ImageView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21539i.class), "tv_user_terms_of_privacy", "getTv_user_terms_of_privacy()Landroid/widget/TextView;")), C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(C21539i.class), "loginPageViewModel", "getLoginPageViewModel()Lcom/ss/android/ugc/aweme/account/login/viewmodel/LoginPageViewModel;"))};

    /* renamed from: b */
    public Dialog f57851b;

    /* renamed from: c */
    public String f57852c;

    /* renamed from: d */
    public String f57853d;

    /* renamed from: e */
    public String f57854e;

    /* renamed from: f */
    public final int f57855f = 4;

    /* renamed from: g */
    public int f57856g = this.f57855f;

    /* renamed from: h */
    public float f57857h = C9738o.m28708b((Context) this.f57858i, 56.0f);

    /* renamed from: i */
    public final Activity f57858i;

    /* renamed from: j */
    public final View f57859j;

    /* renamed from: k */
    public final Bundle f57860k;

    /* renamed from: l */
    public final boolean f57861l;

    /* renamed from: m */
    public final C23278c f57862m;

    /* renamed from: n */
    private final C7541d f57863n = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C21553l(this));

    /* renamed from: o */
    private final C7541d f57864o = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C21542c(this));

    /* renamed from: p */
    private final C7541d f57865p = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C21543d(this));

    /* renamed from: q */
    private final C7541d f57866q = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C21549i(this));

    /* renamed from: r */
    private final C7541d f57867r = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C21540a(this));

    /* renamed from: s */
    private final C7541d f57868s = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C21552k(this));

    /* renamed from: t */
    private final C7541d f57869t = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C21541b(this));

    /* renamed from: u */
    private final C7541d f57870u = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C21554m(this));

    /* renamed from: v */
    private final C7541d f57871v = C7546e.m23568a(LazyThreadSafetyMode.NONE, new C21550j(this));

    /* renamed from: com.ss.android.ugc.aweme.account.login.i$a */
    static final class C21540a extends Lambda implements C7561a<RecyclerView> {

        /* renamed from: a */
        final /* synthetic */ C21539i f57872a;

        C21540a(C21539i iVar) {
            this.f57872a = iVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public RecyclerView invoke() {
            return (RecyclerView) this.f57872a.f57859j.findViewById(R.id.v2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.i$b */
    static final class C21541b extends Lambda implements C7561a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C21539i f57873a;

        C21541b(C21539i iVar) {
            this.f57873a = iVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public ImageView invoke() {
            return (ImageView) this.f57873a.f57859j.findViewById(R.id.x_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.i$c */
    static final class C21542c extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ C21539i f57874a;

        C21542c(C21539i iVar) {
            this.f57874a = iVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            return this.f57874a.f57859j.findViewById(R.id.a9q);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.i$d */
    static final class C21543d extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ C21539i f57875a;

        C21543d(C21539i iVar) {
            this.f57875a = iVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            return this.f57875a.f57859j.findViewById(R.id.ava);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.i$e */
    static final class C21544e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21539i f57876a;

        C21544e(C21539i iVar) {
            this.f57876a = iVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C21257a.m71553a(this.f57876a.f57858i, this.f57876a.f57860k, false);
            C6907h.m21524a("click_login", (Map) C21102b.m71165a().mo56946a("enter_method", this.f57876a.f57853d).f56672a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.i$f */
    static final class C21545f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21539i f57877a;

        C21545f(C21539i iVar) {
            this.f57877a = iVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f57877a.f57851b == null) {
                this.f57877a.f57851b = C21364f.m71843c(this.f57877a.f57858i);
            }
            Dialog dialog = this.f57877a.f57851b;
            if (dialog == null) {
                C7573i.m23580a();
            }
            dialog.show();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.i$g */
    static final class C21546g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21539i f57878a;

        C21546g(C21539i iVar) {
            this.f57878a = iVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C6907h.m21524a("signup_channel_unfold", C7507ae.m23387a());
            RecyclerView c = this.f57878a.mo57688c();
            C7573i.m23582a((Object) c, "channle_list");
            C1262a adapter = c.getAdapter();
            if (adapter != null) {
                ((LoginChannleAdapter) adapter).f57114a = true;
                RecyclerView c2 = this.f57878a.mo57688c();
                C7573i.m23582a((Object) c2, "channle_list");
                C1262a adapter2 = c2.getAdapter();
                if (adapter2 != null) {
                    ((LoginChannleAdapter) adapter2).f57115b = true;
                    RecyclerView c3 = this.f57878a.mo57688c();
                    C7573i.m23582a((Object) c3, "channle_list");
                    C1262a adapter3 = c3.getAdapter();
                    if (adapter3 == null) {
                        C7573i.m23580a();
                    }
                    adapter3.notifyDataSetChanged();
                    C23485m.m77118b(new Runnable(this) {

                        /* renamed from: a */
                        final /* synthetic */ C21546g f57879a;

                        {
                            this.f57879a = r1;
                        }

                        public final void run() {
                            boolean z;
                            RecyclerView c = this.f57879a.f57878a.mo57688c();
                            C7573i.m23582a((Object) c, "channle_list");
                            C1273i layoutManager = c.getLayoutManager();
                            if (layoutManager != null) {
                                int l = ((LinearLayoutManager) layoutManager).mo5447l();
                                View childAt = this.f57879a.f57878a.mo57688c().getChildAt(l);
                                C7573i.m23582a((Object) childAt, "channle_list.getChildAt(lvp)");
                                int bottom = childAt.getBottom();
                                View d = this.f57879a.f57878a.mo57689d();
                                View d2 = this.f57879a.f57878a.mo57689d();
                                C7573i.m23582a((Object) d2, "more");
                                ObjectAnimator ofPropertyValuesHolder = ObjectAnimator.ofPropertyValuesHolder(d, new PropertyValuesHolder[]{PropertyValuesHolder.ofFloat("alpha", new float[]{1.0f, 0.0f}), PropertyValuesHolder.ofInt("top", new int[]{d2.getTop(), bottom})});
                                C7573i.m23582a((Object) ofPropertyValuesHolder, "anim");
                                ofPropertyValuesHolder.setDuration(300);
                                ofPropertyValuesHolder.start();
                                RecyclerView c2 = this.f57879a.f57878a.mo57688c();
                                C7573i.m23582a((Object) c2, "channle_list");
                                int childCount = c2.getChildCount();
                                for (int i = this.f57879a.f57878a.f57856g + 1; i < childCount; i++) {
                                    View childAt2 = this.f57879a.f57878a.mo57688c().getChildAt(i);
                                    if (!(childAt2 == null || childAt2.getParent() == null)) {
                                        C1293v b = this.f57879a.f57878a.mo57688c().mo5539b(this.f57879a.f57878a.mo57688c().getChildAt(i));
                                        if (b != null) {
                                            LoginChannleView loginChannleView = (LoginChannleView) b;
                                            if (i <= l) {
                                                z = true;
                                            } else {
                                                z = false;
                                            }
                                            loginChannleView.mo57188a(z);
                                        }
                                    }
                                }
                                RecyclerView c3 = this.f57879a.f57878a.mo57688c();
                                C7573i.m23582a((Object) c3, "channle_list");
                                C1262a adapter = c3.getAdapter();
                                if (adapter != null) {
                                    ((LoginChannleAdapter) adapter).f57115b = false;
                                    return;
                                }
                                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.LoginChannleAdapter");
                            }
                            throw new TypeCastException("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                        }
                    });
                    return;
                }
                throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.LoginChannleAdapter");
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.LoginChannleAdapter");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.i$h */
    static final class C21548h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21539i f57880a;

        C21548h(C21539i iVar) {
            this.f57880a = iVar;
        }

        public final void onClick(View view) {
            String str;
            ClickInstrumentation.onClick(view);
            Context context = this.f57880a.f57858i;
            if (this.f57880a.f57861l) {
                str = "signup_login_homepage";
            } else {
                str = "login_homepage";
            }
            C21242e.m71499a(context, str, this.f57880a.f57853d);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.i$i */
    static final class C21549i extends Lambda implements C7561a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C21539i f57881a;

        C21549i(C21539i iVar) {
            this.f57881a = iVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public TextView invoke() {
            return (TextView) this.f57881a.f57859j.findViewById(R.id.brx);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.i$j */
    static final class C21550j extends Lambda implements C7561a<C22172c> {

        /* renamed from: a */
        final /* synthetic */ C21539i f57882a;

        C21550j(C21539i iVar) {
            this.f57882a = iVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C22172c invoke() {
            List a = C22164a.m73600a((C23278c) this.f57882a, Boolean.valueOf(this.f57882a.f57861l));
            a.add(0, new C22162a(R.drawable.w_, new OnClickListener(this) {

                /* renamed from: a */
                final /* synthetic */ C21550j f57883a;

                {
                    this.f57883a = r1;
                }

                public final void onClick(View view) {
                    Intent intent;
                    Intent intent2;
                    ClickInstrumentation.onClick(view);
                    if (this.f57883a.f57882a.f57861l) {
                        C6907h.m21524a("click_sign_up", (Map) C21102b.m71165a().mo56946a("enter_method", this.f57883a.f57882a.f57853d).f56672a);
                        C33026l lVar = (C33026l) C21671bd.m72521a(C33026l.class);
                        if (lVar != null) {
                            lVar.mo60022a("click_sign_up");
                            lVar.mo60023b("SIGNUP");
                        }
                        if (C21886a.f58594a.mo58324c()) {
                            intent2 = C22045a.m73347a(this.f57883a.f57882a.f57858i);
                        } else {
                            intent2 = new Intent(this.f57883a.f57882a.f57858i, MusLoginActivity.class).putExtra("init_page", 1);
                            C7573i.m23582a((Object) intent2, "Intent(activity, MusLogi…tants.INIT_PAGE_REGISTER)");
                        }
                        if (this.f57883a.f57882a.f57860k != null) {
                            this.f57883a.f57882a.f57860k.putString("enter_type", "click_sign_up");
                            intent2.putExtras(this.f57883a.f57882a.f57860k);
                        } else {
                            intent2.putExtra("enter_type", "click_sign_up");
                        }
                        this.f57883a.f57882a.f57858i.startActivity(intent2);
                        return;
                    }
                    C6907h.m21524a("click_login_button", (Map) C21102b.m71165a().mo56946a("enter_from", this.f57883a.f57882a.f57852c).f56672a);
                    C33026l lVar2 = (C33026l) C21671bd.m72521a(C33026l.class);
                    if (lVar2 != null) {
                        lVar2.mo60022a("click_login");
                        lVar2.mo60023b("LOGIN");
                    }
                    if (C21886a.f58594a.mo58324c()) {
                        intent = C22045a.m73348b(this.f57883a.f57882a.f57858i);
                    } else {
                        intent = new Intent(this.f57883a.f57882a.f57858i, MusLoginActivity.class);
                    }
                    if (this.f57883a.f57882a.f57860k != null) {
                        this.f57883a.f57882a.f57860k.putString("enter_type", "click_login");
                        intent.putExtras(this.f57883a.f57882a.f57860k);
                    } else {
                        intent.putExtra("enter_type", "click_login");
                    }
                    C7573i.m23582a((Object) view, "it");
                    view.getContext().startActivity(intent);
                }
            }, R.string.ad4));
            return new C22172c(new C23277b(this.f57882a, C23275a.m76429a("dismiss")), a, new C23277b(this.f57882a, C23275a.m76430a("show", "user_agreement")));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.i$k */
    static final class C21552k extends Lambda implements C7561a<View> {

        /* renamed from: a */
        final /* synthetic */ C21539i f57884a;

        C21552k(C21539i iVar) {
            this.f57884a = iVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public View invoke() {
            return this.f57884a.f57859j.findViewById(R.id.bzu);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.i$l */
    static final class C21553l extends Lambda implements C7561a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C21539i f57885a;

        C21553l(C21539i iVar) {
            this.f57885a = iVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public TextView invoke() {
            return (TextView) this.f57885a.f57859j.findViewById(R.id.djz);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.i$m */
    static final class C21554m extends Lambda implements C7561a<TextView> {

        /* renamed from: a */
        final /* synthetic */ C21539i f57886a;

        C21554m(C21539i iVar) {
            this.f57886a = iVar;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public TextView invoke() {
            return (TextView) this.f57886a.f57859j.findViewById(R.id.e4k);
        }
    }

    /* renamed from: f */
    private View m72231f() {
        return (View) this.f57865p.getValue();
    }

    /* renamed from: g */
    private TextView m72232g() {
        return (TextView) this.f57866q.getValue();
    }

    /* renamed from: h */
    private ImageView m72233h() {
        return (ImageView) this.f57869t.getValue();
    }

    /* renamed from: i */
    private TextView m72234i() {
        return (TextView) this.f57870u.getValue();
    }

    /* renamed from: j */
    private C22172c m72235j() {
        return (C22172c) this.f57871v.getValue();
    }

    /* renamed from: a */
    public final TextView mo57686a() {
        return (TextView) this.f57863n.getValue();
    }

    /* renamed from: b */
    public final View mo57687b() {
        return (View) this.f57864o.getValue();
    }

    /* renamed from: c */
    public final RecyclerView mo57688c() {
        return (RecyclerView) this.f57867r.getValue();
    }

    /* renamed from: d */
    public final View mo57689d() {
        return (View) this.f57868s.getValue();
    }

    /* renamed from: e */
    public final void mo57690e() {
        Dialog dialog = this.f57851b;
        if (dialog != null) {
            C21555j.m72255a(dialog);
        }
    }

    /* renamed from: k */
    private void m72236k() {
        if (this.f57860k != null) {
            this.f57852c = this.f57860k.getString("enter_from");
            this.f57853d = this.f57860k.getString("enter_method");
            this.f57854e = this.f57860k.getString("enter_type");
        }
        if (this.f57861l) {
            ThirdLoginSetting thirdLoginSetting = (ThirdLoginSetting) C6887b.m21436b().mo16895a((Context) C21671bd.m72532b(), "i18n_third_login_strategy", ThirdLoginSetting.class);
            if (thirdLoginSetting != null && thirdLoginSetting.getDirectShowNumber() > 0) {
                this.f57856g = thirdLoginSetting.getDirectShowNumber() + 1;
            }
        }
    }

    /* renamed from: l */
    private void m72237l() {
        RecyclerView c = mo57688c();
        C7573i.m23582a((Object) c, "channle_list");
        List<C22162a> list = m72235j().f59227c;
        C7573i.m23582a((Object) list, "loginPageViewModel.itemViewModelList");
        c.setAdapter(new LoginChannleAdapter(list, this.f57861l, this.f57856g));
        m72231f().setOnClickListener(new C21548h(this));
        mo57688c().mo5528a((C1281m) new I18nLoginViewV2$initView$2(this));
        m72232g().setOnTouchListener(new C34032a(0.5f, 150, null));
        m72233h().setOnClickListener(m72235j().f59226b);
        if (this.f57861l) {
            m72238m();
        } else {
            m72239n();
        }
    }

    /* renamed from: m */
    private void m72238m() {
        TextView g = m72232g();
        C7573i.m23582a((Object) g, "ll_login_group");
        g.setText(m72229a(R.string.ad8, R.string.ad9));
        m72232g().setOnClickListener(new C21544e(this));
        C21278ac.m71641a(this.f57858i, m72234i(), m72235j().f59228d, new C21545f(this), false);
        RecyclerView c = mo57688c();
        C7573i.m23582a((Object) c, "channle_list");
        c.setLayoutManager(new I18nLoginViewV2$initSignUpStyle$3(this, this.f57858i));
        mo57689d().setOnClickListener(new C21546g(this));
        if (this.f57856g >= m72235j().f59227c.size()) {
            View d = mo57689d();
            C7573i.m23582a((Object) d, "more");
            d.setVisibility(8);
            RecyclerView c2 = mo57688c();
            C7573i.m23582a((Object) c2, "channle_list");
            C1262a adapter = c2.getAdapter();
            if (adapter != null) {
                ((LoginChannleAdapter) adapter).f57114a = true;
                return;
            }
            throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.LoginChannleAdapter");
        }
    }

    /* renamed from: n */
    private void m72239n() {
        m72233h().setImageResource(R.drawable.al0);
        m72232g().setOnClickListener(new C23277b(this, C23275a.m76429a(C21556k.m72257a())));
        View d = mo57689d();
        C7573i.m23582a((Object) d, "more");
        d.setVisibility(8);
        TextView i = m72234i();
        C7573i.m23582a((Object) i, "tv_user_terms_of_privacy");
        i.setVisibility(8);
        TextView g = m72232g();
        C7573i.m23582a((Object) g, "ll_login_group");
        g.setText(m72229a(R.string.abi, R.string.abj));
        TextView a = mo57686a();
        C7573i.m23582a((Object) a, "title_bar");
        a.setText(this.f57858i.getText(R.string.abk));
        this.f57859j.setBackgroundResource(R.color.l0);
        RecyclerView c = mo57688c();
        C7573i.m23582a((Object) c, "channle_list");
        c.setLayoutManager(new LinearLayoutManager(this.f57858i));
    }

    /* renamed from: a */
    private void m72230a(String str) {
        String str2;
        C7573i.m23587b(str, "platform");
        if (this.f57860k != null) {
            new C21221f().mo57145a(this.f57860k.getString("enter_from")).mo57146b(C21277ab.m71640a(str)).mo57141b();
        }
        String str3 = "login_submit";
        C21102b a = new C21102b().mo56946a("enter_method", this.f57853d).mo56946a("enter_type", this.f57854e).mo56946a("enter_from", this.f57852c).mo56946a("group_id", C21220e.m71415a(this.f57860k)).mo56946a("log_pb", C21220e.m71418b(this.f57860k)).mo56946a("platform", str);
        String str4 = "login_from";
        if (this.f57861l) {
            str2 = "signup_login_homepage";
        } else {
            str2 = "login_homepage";
        }
        C6907h.m21524a(str3, (Map) a.mo56946a(str4, str2).f56672a);
        C33026l lVar = (C33026l) C21671bd.m72521a(C33026l.class);
        if (lVar != null) {
            StringBuilder sb = new StringBuilder("Mob.Event.LOGIN_SUBMIT_");
            sb.append(str);
            lVar.mo60022a(sb.toString());
            lVar.mo60023b("LOGIN");
        }
        Intent intent = new Intent(this.f57858i, AuthorizeActivity.class);
        if (this.f57860k != null) {
            intent.putExtras(this.f57860k);
        }
        intent.putExtra("platform", str).putExtra("enter_from", this.f57852c).putExtra("enter_method", this.f57853d).putExtra("enter_type", this.f57854e);
        this.f57858i.startActivityForResult(intent, 1001);
        C21364f.m71592a(str, this.f57852c, this.f57853d);
    }

    /* renamed from: a */
    public final String mo57183a(C23275a aVar) {
        if (aVar == null) {
            return null;
        }
        String str = aVar.f61308a;
        if (C7573i.m23585a((Object) str, (Object) "login")) {
            if (!aVar.mo60565b()) {
                return null;
            }
            if (!C21555j.m72256a((Context) this.f57858i)) {
                C10761a.m31399c((Context) this.f57858i, (int) R.string.cjs).mo25750a();
                return null;
            }
            String str2 = (String) aVar.mo60564a();
            C7573i.m23582a((Object) str2, "command.firstArg");
            m72230a(str2);
        } else if (C7573i.m23585a((Object) str, (Object) "show")) {
            if (C6319n.m19594a("user_agreement", (String) aVar.mo60564a())) {
                C21364f.m71842b(this.f57858i).show();
            }
        } else if (C7573i.m23585a((Object) str, (Object) "dismiss") || C7573i.m23585a((Object) str, (Object) C21556k.m72257a())) {
            this.f57862m.mo57183a(aVar);
        }
        return null;
    }

    /* renamed from: a */
    private SpannableStringBuilder m72229a(int i, int i2) {
        String string = this.f57858i.getString(i2);
        String string2 = this.f57858i.getString(i, new Object[]{string});
        CharSequence charSequence = string2;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(charSequence);
        C7573i.m23582a((Object) string2, "temp");
        C7573i.m23582a((Object) string, "rightString");
        int a = C7634n.m23730a(charSequence, string, 0, false, 6, (Object) null);
        int color = this.f57858i.getResources().getColor(R.color.a2w);
        spannableStringBuilder.setSpan(new I18nLoginViewV2$getBottomText$1(color, color), a, string.length() + a, 34);
        return spannableStringBuilder;
    }

    public C21539i(Activity activity, View view, Bundle bundle, boolean z, C23278c cVar) {
        C7573i.m23587b(activity, "activity");
        C7573i.m23587b(view, "view");
        C7573i.m23587b(cVar, "commandExecutor");
        this.f57858i = activity;
        this.f57859j = view;
        this.f57860k = bundle;
        this.f57861l = z;
        this.f57862m = cVar;
        m72236k();
        m72237l();
    }
}
