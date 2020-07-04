package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments;

import android.arch.lifecycle.C0052o;
import android.arch.lifecycle.C0053p;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.constraint.C0177b;
import android.support.constraint.ConstraintLayout;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p561a.C10730a.C10741a;
import com.bytedance.ies.dmt.p262ui.p564d.C10789c;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p645a.p646a.C12713h;
import com.bytedance.sdk.account.p645a.p649d.C12729a;
import com.bytedance.sdk.account.p662f.p663a.C12819b;
import com.bytedance.sdk.account.p662f.p663a.C12820c;
import com.bytedance.sdk.account.p662f.p663a.C12824g;
import com.bytedance.sdk.account.p662f.p663a.C12825h;
import com.bytedance.sdk.account.p662f.p663a.C12831n;
import com.bytedance.sdk.account.p662f.p663a.C12836s;
import com.bytedance.sdk.account.p668i.C12898b;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21866f;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21866f.C21868b;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21931e;
import com.p280ss.android.ugc.aweme.account.login.p975v2.network.p976a.C21913a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22047a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22048b;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.InputResultIndicator;
import com.p280ss.android.ugc.aweme.account.login.p975v2.timer.TimerHolder.C22033a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.timer.TimerHolder.C22034b;
import com.p280ss.android.ugc.aweme.account.login.sms.C21590e;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber;
import com.p280ss.android.ugc.aweme.account.loginsetting.C22173a;
import com.p280ss.android.ugc.aweme.account.loginsetting.C22180e;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p982ui.CodeInputView;
import com.p280ss.android.ugc.aweme.account.p982ui.CodeInputView.C22248a;
import com.p280ss.android.ugc.aweme.account.p982ui.LoadingCircleView;
import com.p280ss.android.ugc.aweme.account.p982ui.TimerTextView;
import com.p280ss.android.ugc.aweme.account.views.C22364b;
import com.p280ss.android.ugc.aweme.account.views.C22367e;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.p1192e.p1193a.C27326a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment */
public final class InputCodeFragment extends BaseI18nLoginFragment implements OnClickListener, C22248a {

    /* renamed from: g */
    public static final C22080a f59044g = new C22080a(null);

    /* renamed from: f */
    public boolean f59045f;

    /* renamed from: h */
    private boolean f59046h;

    /* renamed from: i */
    private boolean f59047i;

    /* renamed from: k */
    private PhoneNumber f59048k;

    /* renamed from: l */
    private String f59049l = "";

    /* renamed from: m */
    private int f59050m;

    /* renamed from: n */
    private C22034b f59051n;

    /* renamed from: o */
    private C21866f f59052o;

    /* renamed from: p */
    private boolean f59053p;

    /* renamed from: q */
    private C21590e f59054q;

    /* renamed from: r */
    private boolean f59055r;

    /* renamed from: s */
    private boolean f59056s;

    /* renamed from: t */
    private String f59057t;

    /* renamed from: u */
    private String f59058u = "";

    /* renamed from: v */
    private String f59059v = "";

    /* renamed from: w */
    private final C22098s f59060w = new C22098s(this);

    /* renamed from: x */
    private HashMap f59061x;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment$a */
    public static final class C22080a {
        private C22080a() {
        }

        public /* synthetic */ C22080a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment$b */
    public static final class C22081b implements C22173a {

        /* renamed from: a */
        final /* synthetic */ InputCodeFragment f59062a;

        C22081b(InputCodeFragment inputCodeFragment) {
            this.f59062a = inputCodeFragment;
        }

        /* renamed from: a */
        public final void mo57562a(boolean z) {
            String str;
            StringBuilder sb = new StringBuilder("Voice code ");
            if (z) {
                str = "enabled";
            } else {
                str = "disabled";
            }
            sb.append(str);
            this.f59062a.f59045f = z;
            C22033a.m73317a(this.f59062a.getActivity(), this.f59062a.mo58344j(), this.f59062a.mo58442v(), z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment$c */
    static final class C22082c<T> implements C7326g<C12831n> {

        /* renamed from: a */
        final /* synthetic */ InputCodeFragment f59063a;

        C22082c(InputCodeFragment inputCodeFragment) {
            this.f59063a = inputCodeFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12831n nVar) {
            if (nVar.f33981e != null) {
                C21913a aVar = C21913a.f58632a;
                BaseAccountFlowFragment baseAccountFlowFragment = this.f59063a;
                Scene j = this.f59063a.mo58344j();
                Step d = this.f59063a.mo58339d();
                C12898b bVar = nVar.f33981e;
                C7573i.m23582a((Object) bVar, "it.mUserInfo");
                aVar.mo58367a(baseAccountFlowFragment, j, d, null, bVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment$d */
    static final class C22083d<T> implements C7326g<C12824g> {

        /* renamed from: a */
        final /* synthetic */ InputCodeFragment f59064a;

        C22083d(InputCodeFragment inputCodeFragment) {
            this.f59064a = inputCodeFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12824g gVar) {
            if (gVar.f33948f != null) {
                C21913a aVar = C21913a.f58632a;
                BaseAccountFlowFragment baseAccountFlowFragment = this.f59064a;
                Scene j = this.f59064a.mo58344j();
                Step d = this.f59064a.mo58339d();
                C12898b bVar = gVar.f33948f;
                C7573i.m23582a((Object) bVar, "it.mUserInfo");
                aVar.mo58367a(baseAccountFlowFragment, j, d, null, bVar);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment$e */
    static final class C22084e<T> implements C7326g<C12729a> {

        /* renamed from: a */
        final /* synthetic */ InputCodeFragment f59065a;

        C22084e(InputCodeFragment inputCodeFragment) {
            this.f59065a = inputCodeFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12729a aVar) {
            InputCodeFragment inputCodeFragment = this.f59065a;
            Bundle arguments = this.f59065a.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", Step.RESET_PASSWORD_FOR_PHONE.getValue());
            arguments.putString("ticket", aVar.f33725g);
            C7573i.m23582a((Object) arguments, "(arguments ?: Bundle()).…                        }");
            inputCodeFragment.mo58336a(arguments);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment$f */
    static final class C22085f<T> implements C7326g<C12729a> {

        /* renamed from: a */
        final /* synthetic */ InputCodeFragment f59066a;

        C22085f(InputCodeFragment inputCodeFragment) {
            this.f59066a = inputCodeFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12729a aVar) {
            InputCodeFragment inputCodeFragment = this.f59066a;
            Bundle arguments = this.f59066a.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", Step.RESET_PASSWORD_FOR_EMAIL.getValue());
            arguments.putString("ticket", aVar.f33725g);
            C7573i.m23582a((Object) arguments, "(arguments ?: Bundle()).…                        }");
            inputCodeFragment.mo58336a(arguments);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment$g */
    static final class C22086g<T> implements C7326g<C12710e<C12819b>> {

        /* renamed from: a */
        final /* synthetic */ InputCodeFragment f59067a;

        C22086g(InputCodeFragment inputCodeFragment) {
            this.f59067a = inputCodeFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12819b> eVar) {
            C21913a.m73132a((BaseAccountFlowFragment) this.f59067a, (C12819b) eVar.f33709g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment$h */
    static final class C22087h<T> implements C7326g<C12713h> {

        /* renamed from: a */
        final /* synthetic */ InputCodeFragment f59068a;

        C22087h(InputCodeFragment inputCodeFragment) {
            this.f59068a = inputCodeFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12713h hVar) {
            InputCodeFragment inputCodeFragment = this.f59068a;
            Bundle arguments = this.f59068a.getArguments();
            if (arguments == null) {
                arguments = new Bundle();
            }
            arguments.putInt("next_page", Step.INPUT_PHONE_MODIFY.getValue());
            C7573i.m23582a((Object) hVar, "it");
            arguments.putString("ticket", hVar.f33722g);
            C7573i.m23582a((Object) arguments, "(arguments ?: Bundle()).…                        }");
            inputCodeFragment.mo58336a(arguments);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment$i */
    static final class C22088i<T> implements C7326g<C12710e<C12820c>> {

        /* renamed from: a */
        final /* synthetic */ InputCodeFragment f59069a;

        C22088i(InputCodeFragment inputCodeFragment) {
            this.f59069a = inputCodeFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12820c> eVar) {
            C21913a.m73133a((BaseAccountFlowFragment) this.f59069a, (C12820c) eVar.f33709g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment$j */
    static final class C22089j<T> implements C0053p<String> {

        /* renamed from: a */
        final /* synthetic */ InputCodeFragment f59070a;

        C22089j(InputCodeFragment inputCodeFragment) {
            this.f59070a = inputCodeFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onChanged(String str) {
            ((CodeInputView) this.f59070a.mo58338b((int) R.id.b1g)).setTextAndAutoCheck(str);
            this.f59070a.mo58444x();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment$k */
    static final class C22090k<T> implements C7326g<C12710e<C12836s>> {

        /* renamed from: a */
        final /* synthetic */ InputCodeFragment f59071a;

        C22090k(InputCodeFragment inputCodeFragment) {
            this.f59071a = inputCodeFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12836s> eVar) {
            TimerTextView timerTextView = (TimerTextView) this.f59071a.mo58338b((int) R.id.b1f);
            C7573i.m23582a((Object) timerTextView, "inputCodeTimerView");
            timerTextView.setVisibility(0);
            this.f59071a.mo58443w();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment$l */
    public static final class C22091l extends C22367e {

        /* renamed from: a */
        final /* synthetic */ InputCodeFragment f59072a;

        public final void onClick(View view) {
            C7573i.m23587b(view, "view");
            if (!C27326a.m89578a(view) && this.f59072a.mo58428s()) {
                this.f59072a.onClick(view);
            }
        }

        C22091l(InputCodeFragment inputCodeFragment, int i, int i2) {
            this.f59072a = inputCodeFragment;
            super(i, i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment$m */
    static final class C22092m<T> implements C7326g<C12710e<C12836s>> {

        /* renamed from: a */
        final /* synthetic */ InputCodeFragment f59073a;

        C22092m(InputCodeFragment inputCodeFragment) {
            this.f59073a = inputCodeFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12836s> eVar) {
            this.f59073a.mo58443w();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment$n */
    static final class C22093n<T> implements C7326g<C12710e<C12836s>> {

        /* renamed from: a */
        final /* synthetic */ InputCodeFragment f59074a;

        C22093n(InputCodeFragment inputCodeFragment) {
            this.f59074a = inputCodeFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12836s> eVar) {
            this.f59074a.mo58443w();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment$o */
    static final class C22094o<T> implements C7326g<C12710e<C12825h>> {

        /* renamed from: a */
        final /* synthetic */ InputCodeFragment f59075a;

        C22094o(InputCodeFragment inputCodeFragment) {
            this.f59075a = inputCodeFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12825h> eVar) {
            this.f59075a.mo58443w();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment$p */
    static final class C22095p<T> implements C7326g<C12710e<C12836s>> {

        /* renamed from: a */
        final /* synthetic */ InputCodeFragment f59076a;

        C22095p(InputCodeFragment inputCodeFragment) {
            this.f59076a = inputCodeFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12836s> eVar) {
            this.f59076a.mo58443w();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment$q */
    static final class C22096q<T> implements C7326g<C12710e<C12825h>> {

        /* renamed from: a */
        final /* synthetic */ InputCodeFragment f59077a;

        C22096q(InputCodeFragment inputCodeFragment) {
            this.f59077a = inputCodeFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12825h> eVar) {
            this.f59077a.mo58443w();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment$r */
    static final class C22097r<T> implements C7326g<C12710e<C12836s>> {

        /* renamed from: a */
        final /* synthetic */ InputCodeFragment f59078a;

        C22097r(InputCodeFragment inputCodeFragment) {
            this.f59078a = inputCodeFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12836s> eVar) {
            this.f59078a.mo58443w();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputCodeFragment$s */
    public static final class C22098s extends C21868b {

        /* renamed from: a */
        final /* synthetic */ InputCodeFragment f59079a;

        /* renamed from: a */
        public final void mo57827a() {
            this.f59079a.mo57299a();
        }

        /* renamed from: b */
        public final void mo57828b() {
            if (this.f59079a.isViewValid()) {
                this.f59079a.mo58441u();
            }
        }

        C22098s(InputCodeFragment inputCodeFragment) {
            this.f59079a = inputCodeFragment;
        }

        /* renamed from: a */
        public final void mo58177a(long j) {
            if (this.f59079a.isViewValid()) {
                this.f59079a.mo58439a(j, true);
            }
        }
    }

    /* renamed from: b */
    public final View mo58338b(int i) {
        if (this.f59061x == null) {
            this.f59061x = new HashMap();
        }
        View view = (View) this.f59061x.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59061x.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: n */
    public final void mo58347n() {
        if (this.f59061x != null) {
            this.f59061x.clear();
        }
    }

    public final void onResume() {
        super.onResume();
    }

    /* renamed from: p */
    public final int mo58417p() {
        return R.layout.b1h;
    }

    /* renamed from: q */
    public final void mo58418q() {
        m73432D();
    }

    /* renamed from: r */
    public final void mo58419r() {
        m73431B();
    }

    public final void onDestroyView() {
        C21590e eVar = this.f59054q;
        if (eVar != null) {
            eVar.mo57783c();
        }
        super.onDestroyView();
        mo58347n();
    }

    /* renamed from: B */
    private final void m73431B() {
        LoadingCircleView loadingCircleView = (LoadingCircleView) mo58338b((int) R.id.b1b);
        C7573i.m23582a((Object) loadingCircleView, "inputCodeLoadingView");
        loadingCircleView.setVisibility(0);
        ((LoadingCircleView) mo58338b((int) R.id.b1b)).mo58683a();
    }

    /* renamed from: D */
    private final void m73432D() {
        LoadingCircleView loadingCircleView = (LoadingCircleView) mo58338b((int) R.id.b1b);
        C7573i.m23582a((Object) loadingCircleView, "inputCodeLoadingView");
        loadingCircleView.setVisibility(8);
        ((LoadingCircleView) mo58338b((int) R.id.b1b)).mo58684b();
    }

    /* renamed from: G */
    private final void m73435G() {
        ((InputResultIndicator) mo58338b((int) R.id.b1_)).mo58394a();
        ((CodeInputView) mo58338b((int) R.id.b1g)).mo58649d();
    }

    public final void onStart() {
        super.onStart();
        CodeInputView codeInputView = (CodeInputView) mo58338b((int) R.id.b1g);
        C7573i.m23582a((Object) codeInputView, "inputCodeView");
        C22048b.m73350a(codeInputView);
    }

    /* renamed from: v */
    public final String mo58442v() {
        String str;
        if (TextUtils.isEmpty(this.f59049l)) {
            str = this.f59057t;
            if (str == null) {
                String a = PhoneNumberUtil.m73058a(this.f59048k);
                C7573i.m23582a((Object) a, "PhoneNumberUtil.formatNumber(phoneNumber)");
                return a;
            }
        } else {
            str = this.f59049l;
        }
        return str;
    }

    /* renamed from: x */
    public final void mo58444x() {
        C6907h.m21524a("auto_fill_sms_verification", (Map) new C21102b().mo56946a("enter_method", mo58341f()).f56672a);
    }

    /* renamed from: F */
    private final void m73434F() {
        if (this.f59045f && this.f59048k != null) {
            this.f59055r = true;
            C21931e eVar = C21931e.f58668a;
            BaseAccountFlowFragment baseAccountFlowFragment = this;
            PhoneNumber phoneNumber = this.f59048k;
            if (phoneNumber == null) {
                C7573i.m23580a();
            }
            eVar.mo58376a(baseAccountFlowFragment, phoneNumber, mo58344j(), mo58339d(), "user_click").mo19273b();
        }
    }

    /* renamed from: a */
    public final void mo57299a() {
        TimerTextView timerTextView = (TimerTextView) mo58338b((int) R.id.b1f);
        C7573i.m23582a((Object) timerTextView, "inputCodeTimerView");
        if (timerTextView.getVisibility() != 0) {
            TimerTextView timerTextView2 = (TimerTextView) mo58338b((int) R.id.b1f);
            C7573i.m23582a((Object) timerTextView2, "inputCodeTimerView");
            timerTextView2.setVisibility(0);
        }
        DmtTextView dmtTextView = (DmtTextView) mo58338b((int) R.id.b1c);
        C7573i.m23582a((Object) dmtTextView, "inputCodeResendBtn");
        dmtTextView.setEnabled(false);
    }

    /* renamed from: u */
    public final void mo58441u() {
        TimerTextView timerTextView = (TimerTextView) mo58338b((int) R.id.b1f);
        C7573i.m23582a((Object) timerTextView, "inputCodeTimerView");
        if (timerTextView.getVisibility() != 8) {
            TimerTextView timerTextView2 = (TimerTextView) mo58338b((int) R.id.b1f);
            C7573i.m23582a((Object) timerTextView2, "inputCodeTimerView");
            timerTextView2.setVisibility(8);
        }
        DmtTextView dmtTextView = (DmtTextView) mo58338b((int) R.id.b1c);
        C7573i.m23582a((Object) dmtTextView, "inputCodeResendBtn");
        dmtTextView.setEnabled(true);
    }

    /* renamed from: A */
    private final void m73430A() {
        boolean z;
        Long l;
        if (mo58339d() == Step.PHONE_SMS_SIGN_UP || mo58339d() == Step.PHONE_SMS_LOGIN) {
            z = true;
        } else {
            z = false;
        }
        if (this.f59048k != null && z) {
            StringBuilder sb = new StringBuilder("Checking voice code availability for [");
            PhoneNumber phoneNumber = this.f59048k;
            if (phoneNumber != null) {
                l = Long.valueOf(phoneNumber.getNationalNumber());
            } else {
                l = null;
            }
            sb.append(l);
            sb.append(']');
            C22180e.f59242a.mo58538a(this.f59048k, (C22173a) new C22081b(this));
        }
    }

    /* renamed from: z */
    private final void m73438z() {
        int i;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (this.f59048k == null && this.f59057t == null) {
            if (this.f59049l.length() > 0) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (z3) {
                i = 6;
            } else {
                throw new IllegalStateException("InputCodeFragment needs either a phone or an email");
            }
        } else {
            i = 4;
        }
        this.f59050m = i;
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = arguments.getBoolean("use_whatsapp", false);
        } else {
            z = false;
        }
        this.f59046h = z;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            z2 = arguments2.getBoolean("bind_secure", false);
        } else {
            z2 = false;
        }
        this.f59053p = z2;
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            z4 = arguments3.getBoolean("from_choose_dialog", false);
        }
        this.f59047i = z4;
    }

    /* renamed from: w */
    public final void mo58443w() {
        DmtTextView dmtTextView = (DmtTextView) mo58338b((int) R.id.b1c);
        C7573i.m23582a((Object) dmtTextView, "inputCodeResendBtn");
        dmtTextView.setEnabled(false);
        ((TimerTextView) mo58338b((int) R.id.b1f)).setCallback(this.f59060w);
        C22033a.m73318a(getActivity(), mo58442v(), new C22034b(((TimerTextView) mo58338b((int) R.id.b1f)).mo58722c(), null, 2, null), mo58344j());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0068, code lost:
        if (r0 == null) goto L_0x006a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x007a, code lost:
        if (r0 == null) goto L_0x007c;
     */
    /* renamed from: y */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m73437y() {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.account.login.v2.base.Step r0 = r3.mo58339d()
            int[] r1 = com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.C22146c.f59179b
            int r0 = r0.ordinal()
            r0 = r1[r0]
            switch(r0) {
                case 1: goto L_0x0049;
                case 2: goto L_0x0049;
                case 3: goto L_0x0049;
                case 4: goto L_0x0049;
                case 5: goto L_0x0049;
                case 6: goto L_0x0035;
                case 7: goto L_0x0029;
                case 8: goto L_0x0029;
                default: goto L_0x000f;
            }
        L_0x000f:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Unknown step "
            r1.<init>(r2)
            com.ss.android.ugc.aweme.account.login.v2.base.Step r2 = r3.mo58339d()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            throw r0
        L_0x0029:
            com.ss.android.ugc.aweme.account.login.v2.base.c r0 = com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21903c.f58624a
            r1 = r3
            android.support.v4.app.Fragment r1 = (android.support.p022v4.app.Fragment) r1
            java.lang.String r0 = r0.mo58352a(r1)
            r3.f59049l = r0
            goto L_0x0054
        L_0x0035:
            com.ss.android.ugc.aweme.profile.model.User r0 = com.p280ss.android.ugc.aweme.C21671bd.m72543k()
            java.lang.String r1 = "ModuleStore.getCurUser()"
            kotlin.jvm.internal.C7573i.m23582a(r0, r1)
            java.lang.String r0 = r0.getBindPhone()
            if (r0 != 0) goto L_0x0046
            java.lang.String r0 = ""
        L_0x0046:
            r3.f59057t = r0
            goto L_0x0054
        L_0x0049:
            com.ss.android.ugc.aweme.account.login.v2.base.c r0 = com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21903c.f58624a
            r1 = r3
            android.support.v4.app.Fragment r1 = (android.support.p022v4.app.Fragment) r1
            com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil$PhoneNumber r0 = r0.mo58353b(r1)
            r3.f59048k = r0
        L_0x0054:
            com.ss.android.ugc.aweme.account.login.v2.base.Scene r0 = r3.mo58344j()
            com.ss.android.ugc.aweme.account.login.v2.base.Scene r1 = com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene.MODIFY_PHONE
            if (r0 != r1) goto L_0x0080
            android.os.Bundle r0 = r3.getArguments()
            if (r0 == 0) goto L_0x006a
            java.lang.String r1 = "ticket"
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L_0x006c
        L_0x006a:
            java.lang.String r0 = ""
        L_0x006c:
            r3.f59058u = r0
            android.os.Bundle r0 = r3.getArguments()
            if (r0 == 0) goto L_0x007c
            java.lang.String r1 = "mUnusableMobileTicket"
            java.lang.String r0 = r0.getString(r1)
            if (r0 != 0) goto L_0x007e
        L_0x007c:
            java.lang.String r0 = ""
        L_0x007e:
            r3.f59059v = r0
        L_0x0080:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.InputCodeFragment.m73437y():void");
    }

    /* renamed from: E */
    private final void m73433E() {
        String str = null;
        switch (C22146c.f59180c[mo58339d().ordinal()]) {
            case 1:
            case 2:
                if (this.f59046h) {
                    C21931e.f58668a.mo58377a((BaseAccountFlowFragment) this, this.f59048k, mo58344j(), mo58339d(), "resend", "").mo19278c((C7326g<? super T>) new C22092m<Object>(this)).mo19273b();
                    return;
                }
                C21931e eVar = C21931e.f58668a;
                BaseAccountFlowFragment baseAccountFlowFragment = this;
                String a = PhoneNumberUtil.m73058a(this.f59048k);
                Scene j = mo58344j();
                Step d = mo58339d();
                String str2 = "";
                String str3 = "resend";
                if (this.f59047i) {
                    str = "choose_dialog";
                }
                eVar.mo58380a(baseAccountFlowFragment, a, j, d, str2, str3, str).mo19278c((C7326g<? super T>) new C22093n<Object>(this)).mo19273b();
                return;
            case 3:
                BaseAccountFlowFragment baseAccountFlowFragment2 = this;
                String str4 = this.f59049l;
                Bundle arguments = getArguments();
                if (arguments != null) {
                    str = arguments.getString("password");
                }
                C21931e.m73161a(baseAccountFlowFragment2, str4, 1, true, str).mo19278c((C7326g<? super T>) new C22094o<Object>(this)).mo19273b();
                return;
            case 4:
                C21931e eVar2 = C21931e.f58668a;
                BaseAccountFlowFragment baseAccountFlowFragment3 = this;
                PhoneNumber phoneNumber = this.f59048k;
                if (phoneNumber == null) {
                    C7573i.m23580a();
                }
                eVar2.mo58378a(baseAccountFlowFragment3, phoneNumber, mo58339d(), "resend").mo19278c((C7326g<? super T>) new C22095p<Object>(this)).mo19273b();
                return;
            case 5:
                C21931e.m73161a((BaseAccountFlowFragment) this, this.f59049l, 4, true, (String) null).mo19278c((C7326g<? super T>) new C22096q<Object>(this)).mo19273b();
                return;
            case 6:
            case 7:
            case 8:
                C21931e.f58668a.mo58381b(this, PhoneNumberUtil.m73058a(this.f59048k), mo58344j(), mo58339d(), this.f59058u, this.f59059v, "resend").mo19278c((C7326g<? super T>) new C22097r<Object>(this)).mo19273b();
                return;
            default:
                StringBuilder sb = new StringBuilder("Unknown step [");
                sb.append(mo58339d());
                sb.append("] when trying to send codes");
                throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: o */
    public final C22047a mo58416o() {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        C21866f fVar;
        String string;
        String string2;
        String a;
        String str5;
        String str6 = "";
        int i = C22146c.f59178a[mo58339d().ordinal()];
        int i2 = R.string.ads;
        switch (i) {
            case 1:
                string = getString(R.string.abj);
                C7573i.m23582a((Object) string, "getString(R.string.common_login_panel_entry_2)");
                if (!this.f59046h) {
                    i2 = R.string.aeq;
                }
                string2 = getString(i2);
                C7573i.m23582a((Object) string2, "getString(if (useWhatsAp…btitle\n                })");
                Locale locale = Locale.US;
                C7573i.m23582a((Object) locale, "Locale.US");
                String string3 = getString(R.string.adm);
                C7573i.m23582a((Object) string3, "getString(R.string.commo…istration_phone_sms_text)");
                a = C1642a.m8035a(locale, string3, Arrays.copyOf(new Object[]{PhoneNumberUtil.m73058a(this.f59048k)}, 1));
                C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
                if (!this.f59046h) {
                    str5 = "phone_sign_up_sms_verification_page";
                    break;
                } else {
                    str5 = "phone_sign_up_whatsapp_verification_page";
                    break;
                }
            case 2:
                string = getString(R.string.abj);
                C7573i.m23582a((Object) string, "getString(R.string.common_login_panel_entry_2)");
                string2 = getString(R.string.aej);
                C7573i.m23582a((Object) string2, "getString(R.string.common_verify_email_subtitle)");
                Locale locale2 = Locale.US;
                C7573i.m23582a((Object) locale2, "Locale.US");
                String string4 = getString(R.string.aek);
                C7573i.m23582a((Object) string4, "getString(R.string.common_verify_email_text)");
                a = C1642a.m8035a(locale2, string4, Arrays.copyOf(new Object[]{this.f59049l}, 1));
                C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
                str5 = "email_sign_up_verification_page";
                break;
            case 3:
                string = getString(R.string.ac4);
                C7573i.m23582a((Object) string, "getString(R.string.common_login_reset_title)");
                string2 = getString(R.string.aeq);
                C7573i.m23582a((Object) string2, "getString(R.string.common_verify_sms_subtitle)");
                Locale locale3 = Locale.US;
                C7573i.m23582a((Object) locale3, "Locale.US");
                String string5 = getString(R.string.adm);
                C7573i.m23582a((Object) string5, "getString(R.string.commo…istration_phone_sms_text)");
                a = C1642a.m8035a(locale3, string5, Arrays.copyOf(new Object[]{PhoneNumberUtil.m73058a(this.f59048k)}, 1));
                C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
                str5 = "reset_sms_code_input";
                break;
            case 4:
                string = getString(R.string.ac4);
                C7573i.m23582a((Object) string, "getString(R.string.common_login_reset_title)");
                string2 = getString(R.string.aej);
                C7573i.m23582a((Object) string2, "getString(R.string.common_verify_email_subtitle)");
                Locale locale4 = Locale.US;
                C7573i.m23582a((Object) locale4, "Locale.US");
                String string6 = getString(R.string.aek);
                C7573i.m23582a((Object) string6, "getString(R.string.common_verify_email_text)");
                a = C1642a.m8035a(locale4, string6, Arrays.copyOf(new Object[]{this.f59049l}, 1));
                C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
                str5 = "reset_email_code_input";
                break;
            case 5:
                string = getString(R.string.ad9);
                C7573i.m23582a((Object) string, "getString(R.string.commo…gistration_panel_entry_2)");
                if (!this.f59046h) {
                    i2 = R.string.aeq;
                }
                string2 = getString(i2);
                C7573i.m23582a((Object) string2, "getString(if (useWhatsAp…btitle\n                })");
                Locale locale5 = Locale.US;
                C7573i.m23582a((Object) locale5, "Locale.US");
                String string7 = getString(R.string.adm);
                C7573i.m23582a((Object) string7, "getString(R.string.commo…istration_phone_sms_text)");
                a = C1642a.m8035a(locale5, string7, Arrays.copyOf(new Object[]{PhoneNumberUtil.m73058a(this.f59048k)}, 1));
                C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
                if (!this.f59046h) {
                    str5 = "phone_login_sms_verification_page";
                    break;
                } else {
                    str5 = "phone_login_whatsapp_verification_page";
                    break;
                }
            case 6:
            case 7:
            case 8:
                String str7 = " ";
                String string8 = getString(R.string.aeq);
                C7573i.m23582a((Object) string8, "getString(R.string.common_verify_sms_subtitle)");
                Locale locale6 = Locale.US;
                C7573i.m23582a((Object) locale6, "Locale.US");
                String string9 = getString(R.string.adm);
                C7573i.m23582a((Object) string9, "getString(R.string.commo…istration_phone_sms_text)");
                Object[] objArr = new Object[1];
                String str8 = this.f59057t;
                if (str8 == null) {
                    str8 = PhoneNumberUtil.m73058a(this.f59048k);
                }
                objArr[0] = str8;
                String a2 = C1642a.m8035a(locale6, string9, Arrays.copyOf(objArr, 1));
                C7573i.m23582a((Object) a2, "java.lang.String.format(locale, format, *args)");
                str = str6;
                str4 = str7;
                str3 = string8;
                str2 = a2;
                z = false;
                break;
            default:
                StringBuilder sb = new StringBuilder("Unknown step ");
                sb.append(mo58339d());
                sb.append(" during getCommonUiParam()");
                throw new IllegalStateException(sb.toString());
        }
        str = str5;
        str4 = string;
        str3 = string2;
        str2 = a;
        z = true;
        this.f59051n = C22033a.m73316a(getActivity(), mo58442v(), mo58344j());
        C22034b bVar = this.f59051n;
        if (bVar != null) {
            fVar = bVar.f58908a;
        } else {
            fVar = null;
        }
        this.f59052o = fVar;
        C22047a aVar = new C22047a(str4, null, false, str3, str2, false, str, z, false, 294, null);
        return aVar;
    }

    /* renamed from: b */
    public final void mo57823b(String str) {
        C7573i.m23587b(str, "currentText");
        if (isViewValid()) {
            if (this.f59056s) {
                ((CodeInputView) mo58338b((int) R.id.b1g)).setText("");
                this.f59056s = false;
            }
            m73435G();
        }
    }

    public final void onClick(View view) {
        Integer num;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.b1c) {
            m73433E();
        } else if (num != null && num.intValue() == R.id.b1h) {
            m73434F();
        } else {
            if (num != null && num.intValue() == R.id.b1e) {
                C6907h.m21524a("switch_to_password", (Map) new C21102b().mo56946a("enter_method", mo58341f()).f56672a);
                Bundle arguments = getArguments();
                if (arguments == null) {
                    arguments = new Bundle();
                }
                arguments.putInt("next_page", Step.PHONE_PASSWORD_LOGIN.getValue());
                C7573i.m23582a((Object) arguments, "(arguments ?: Bundle()).….value)\n                }");
                mo58336a(arguments);
            }
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m73437y();
        m73438z();
        if (this.f59054q == null) {
            Context context = getContext();
            if (context == null) {
                C7573i.m23580a();
            }
            this.f59054q = new C21590e(context);
        }
        C21590e eVar = this.f59054q;
        if (eVar == null) {
            C7573i.m23580a();
        }
        eVar.mo57782b();
        C21590e eVar2 = this.f59054q;
        if (eVar2 == null) {
            C7573i.m23580a();
        }
        eVar2.mo57780a();
        if (mo58339d() == Step.PHONE_SMS_LOGIN || mo58339d() == Step.PHONE_SMS_SIGN_UP) {
            if (this.f59046h) {
                C6907h.m21524a("phone_login_enter_whatsapp_code", (Map) new C21102b().mo56946a("enter_type", mo58342g()).f56672a);
            } else {
                C6907h.m21524a("phone_login_enter_sms", (Map) new C21102b().mo56946a("enter_type", mo58342g()).mo56946a("enter_method", mo58341f()).f56672a);
            }
        }
        mo58345k();
    }

    /* renamed from: a */
    public final void mo57821a(String str) {
        C7573i.m23587b(str, "codes");
        CodeInputView codeInputView = (CodeInputView) mo58338b((int) R.id.b1g);
        C7573i.m23582a((Object) codeInputView, "inputCodeView");
        codeInputView.setEnabled(false);
        this.f59056s = false;
        m73431B();
        switch (C22146c.f59181d[mo58339d().ordinal()]) {
            case 1:
            case 2:
                C21931e.m73159a((BaseAccountFlowFragment) this, this.f59048k, str, mo58344j(), mo58339d(), this.f59046h).mo19278c((C7326g<? super T>) new C22082c<Object>(this)).mo19273b();
                return;
            case 3:
                C21931e.m73165a((BaseAccountFlowFragment) this, this.f59049l, str, mo58344j(), mo58339d()).mo19278c((C7326g<? super T>) new C22083d<Object>(this)).mo19273b();
                return;
            case 4:
                C21931e.m73170b((BaseAccountFlowFragment) this, this.f59048k, str, mo58344j(), mo58339d()).mo19278c((C7326g<? super T>) new C22084e<Object>(this)).mo19273b();
                return;
            case 5:
                C21931e.m73173b((BaseAccountFlowFragment) this, this.f59049l, str, mo58344j(), mo58339d()).mo19278c((C7326g<? super T>) new C22085f<Object>(this)).mo19273b();
                return;
            case 6:
                C21931e.m73163a((BaseAccountFlowFragment) this, PhoneNumberUtil.m73058a(this.f59048k), mo58344j(), mo58339d(), str).mo19278c((C7326g<? super T>) new C22086g<Object>(this)).mo19273b();
                return;
            case 7:
                C21931e.f58668a.mo58379a((BaseAccountFlowFragment) this, mo58344j(), mo58339d(), str).mo19278c((C7326g<? super T>) new C22087h<Object>(this)).mo19273b();
                return;
            case 8:
                C21931e.m73174c(this, PhoneNumberUtil.m73058a(this.f59048k), mo58344j(), mo58339d(), str, this.f59058u, this.f59059v).mo19278c((C7326g<? super T>) new C22088i<Object>(this)).mo19273b();
                return;
            default:
                StringBuilder sb = new StringBuilder("Unknown step [");
                sb.append(mo58339d());
                sb.append("] when trying to validate codes");
                throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final void mo58335a(int i, String str) {
        String str2;
        C7573i.m23587b(str, "message");
        if (!this.f59055r || i != 1206) {
            this.f59056s = true;
            CodeInputView codeInputView = (CodeInputView) mo58338b((int) R.id.b1g);
            C7573i.m23582a((Object) codeInputView, "inputCodeView");
            codeInputView.setEnabled(true);
            ((CodeInputView) mo58338b((int) R.id.b1g)).mo58648c();
            ((InputResultIndicator) mo58338b((int) R.id.b1_)).mo58395a(str);
            return;
        }
        this.f59055r = false;
        C10741a aVar = new C10741a(getContext());
        Context context = getContext();
        if (context != null) {
            str2 = context.getString(R.string.adp);
        } else {
            str2 = null;
        }
        aVar.mo25653a(str2).mo25650a((int) R.string.ag4, (DialogInterface.OnClickListener) null).mo25656a().mo25638b().setCancelable(false);
    }

    /* renamed from: a */
    public final void mo58439a(long j, boolean z) {
        if (this.f59045f && j <= 50000) {
            DmtTextView dmtTextView = (DmtTextView) mo58338b((int) R.id.b1h);
            C7573i.m23582a((Object) dmtTextView, "inputCodeVoiceLayout");
            if (dmtTextView.getVisibility() != 0) {
                DmtTextView dmtTextView2 = (DmtTextView) mo58338b((int) R.id.b1h);
                C7573i.m23582a((Object) dmtTextView2, "inputCodeVoiceLayout");
                dmtTextView2.setVisibility(0);
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        long j;
        boolean z;
        Boolean bool;
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        if (mo58339d() == Step.PHONE_SMS_LOGIN && !this.f59053p) {
            DmtTextView dmtTextView = (DmtTextView) mo58338b((int) R.id.b1e);
            C7573i.m23582a((Object) dmtTextView, "inputCodeSwitchPasswordBtn");
            dmtTextView.setVisibility(0);
        }
        TimerTextView timerTextView = (TimerTextView) mo58338b((int) R.id.b1f);
        C21866f fVar = this.f59052o;
        if (fVar != null) {
            j = fVar.mo58293c();
        } else {
            j = 60000;
        }
        timerTextView.mo58719a(j, 60000, 1000, "s");
        CodeInputView codeInputView = (CodeInputView) mo58338b((int) R.id.b1g);
        C7573i.m23582a((Object) codeInputView, "inputCodeView");
        codeInputView.setEnabled(true);
        ((CodeInputView) mo58338b((int) R.id.b1g)).mo58644a();
        ((CodeInputView) mo58338b((int) R.id.b1g)).mo58646b();
        ((CodeInputView) mo58338b((int) R.id.b1g)).setCallback(this);
        ((CodeInputView) mo58338b((int) R.id.b1g)).setInputLength(this.f59050m);
        C10789c.m31502a((DmtTextView) mo58338b((int) R.id.b1c));
        C10789c.m31502a((DmtTextView) mo58338b((int) R.id.b1e));
        OnClickListener onClickListener = this;
        mo58425a((DmtTextView) mo58338b((int) R.id.b1c), onClickListener);
        String string = getString(R.string.ado);
        C7573i.m23582a((Object) string, "getString(R.string.commo…ation_phone_voice_button)");
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(getString(R.string.adr, string));
        spannableStringBuilder.setSpan(new C22091l(this, getResources().getColor(R.color.lo), getResources().getColor(R.color.lo)), spannableStringBuilder.length() - string.length(), spannableStringBuilder.length(), 34);
        DmtTextView dmtTextView2 = (DmtTextView) mo58338b((int) R.id.b1h);
        C7573i.m23582a((Object) dmtTextView2, "inputCodeVoiceLayout");
        dmtTextView2.setText(spannableStringBuilder);
        DmtTextView dmtTextView3 = (DmtTextView) mo58338b((int) R.id.b1h);
        C7573i.m23582a((Object) dmtTextView3, "inputCodeVoiceLayout");
        dmtTextView3.setMovementMethod(C22364b.m74059a());
        ((DmtTextView) mo58338b((int) R.id.b1e)).setOnClickListener(onClickListener);
        if (!(mo58339d() == Step.EMAIL_SMS_SIGN_UP || mo58339d() == Step.EMAIL_SMS_FIND_PASSWORD)) {
            C21590e eVar = this.f59054q;
            if (eVar == null) {
                C7573i.m23580a();
            }
            C0052o<String> oVar = eVar.f57961a;
            C7573i.m23582a((Object) oVar, "mSmsVerifier!!.smsLiveData");
            CharSequence charSequence = (String) oVar.getValue();
            if (!TextUtils.isEmpty(charSequence)) {
                ((CodeInputView) mo58338b((int) R.id.b1g)).setTextAndAutoCheck(charSequence);
                C21590e eVar2 = this.f59054q;
                if (eVar2 == null) {
                    C7573i.m23580a();
                }
                C0052o<String> oVar2 = eVar2.f57961a;
                C7573i.m23582a((Object) oVar2, "mSmsVerifier!!.smsLiveData");
                oVar2.setValue("");
                mo58444x();
            } else {
                C21590e eVar3 = this.f59054q;
                if (eVar3 == null) {
                    C7573i.m23580a();
                }
                eVar3.f57961a.observe(this, new C22089j(this));
            }
        }
        if (mo58339d() != Step.PHONE_SMS_VERIFY) {
            StringBuilder sb = new StringBuilder("Code sent: ");
            Bundle arguments = getArguments();
            if (arguments == null || !arguments.getBoolean("code_sent")) {
                z = false;
            } else {
                z = true;
            }
            sb.append(z);
            Bundle arguments2 = getArguments();
            if (arguments2 == null || !arguments2.getBoolean("code_sent")) {
                C22034b bVar = this.f59051n;
                Boolean bool2 = null;
                if (bVar != null) {
                    bool = bVar.f58909b;
                } else {
                    bool = null;
                }
                if (bool != null) {
                    C22034b bVar2 = this.f59051n;
                    if (bVar2 != null) {
                        bool2 = bVar2.f58909b;
                    }
                    if (bool2 == null) {
                        C7573i.m23580a();
                    }
                    this.f59045f = bool2.booleanValue();
                    C21866f fVar2 = this.f59052o;
                    if (fVar2 == null) {
                        C7573i.m23580a();
                    }
                    mo58439a(fVar2.mo58293c(), false);
                }
                if (this.f59052o != null) {
                    C21866f fVar3 = this.f59052o;
                    if (fVar3 == null) {
                        C7573i.m23580a();
                    }
                    if (fVar3.mo58295e()) {
                        ((TimerTextView) mo58338b((int) R.id.b1f)).setCallback(this.f59060w);
                        TimerTextView timerTextView2 = (TimerTextView) mo58338b((int) R.id.b1f);
                        C21866f fVar4 = this.f59052o;
                        if (fVar4 == null) {
                            C7573i.m23580a();
                        }
                        timerTextView2.mo58721a(fVar4);
                        mo57299a();
                    }
                }
                mo58441u();
            } else {
                Bundle arguments3 = getArguments();
                if (arguments3 != null) {
                    arguments3.remove("code_sent");
                }
                mo58443w();
                m73430A();
            }
        } else if (this.f59052o == null) {
            TimerTextView timerTextView3 = (TimerTextView) mo58338b((int) R.id.b1f);
            C7573i.m23582a((Object) timerTextView3, "inputCodeTimerView");
            timerTextView3.setVisibility(8);
            C21931e.f58668a.mo58381b(this, "", mo58344j(), mo58339d(), "", this.f59059v, "user_click").mo19278c((C7326g<? super T>) new C22090k<Object>(this)).mo19273b();
        } else {
            C21866f fVar5 = this.f59052o;
            if (fVar5 == null) {
                C7573i.m23580a();
            }
            if (fVar5.mo58295e()) {
                ((TimerTextView) mo58338b((int) R.id.b1f)).setCallback(this.f59060w);
                TimerTextView timerTextView4 = (TimerTextView) mo58338b((int) R.id.b1f);
                C21866f fVar6 = this.f59052o;
                if (fVar6 == null) {
                    C7573i.m23580a();
                }
                timerTextView4.mo58721a(fVar6);
                mo57299a();
            } else {
                C21866f fVar7 = this.f59052o;
                if (fVar7 == null) {
                    C7573i.m23580a();
                }
                if (fVar7.mo58294d()) {
                    mo58441u();
                }
            }
        }
        if (mo58344j() == Scene.BIND_PHONE || mo58344j() == Scene.MODIFY_PHONE) {
            C0177b bVar3 = new C0177b();
            bVar3.mo428a((ConstraintLayout) mo58338b((int) R.id.b1d));
            m73436a(bVar3, R.id.b1c, 20.0f);
            m73436a(bVar3, R.id.b1f, 20.0f);
            m73436a(bVar3, R.id.b1b, 30.0f);
            bVar3.mo430b((ConstraintLayout) mo58338b((int) R.id.b1d));
        }
    }

    /* renamed from: a */
    private final void m73436a(C0177b bVar, int i, float f) {
        bVar.mo424a(i, 4);
        bVar.mo426a(i, 3, R.id.b1a, 4);
        bVar.mo425a(i, 3, (int) C9738o.m28708b(getContext(), f));
    }
}
