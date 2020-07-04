package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12836s;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.C21173f;
import com.p280ss.android.ugc.aweme.account.login.C21579s;
import com.p280ss.android.ugc.aweme.account.login.C21642z;
import com.p280ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.C21566a;
import com.p280ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p280ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21866f;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21903c;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21931e;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22047a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22048b;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.InputResultIndicator;
import com.p280ss.android.ugc.aweme.account.login.p975v2.timer.TimerHolder.C22033a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.timer.TimerHolder.C22034b;
import com.p280ss.android.ugc.aweme.account.login.sms.C21586a;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber;
import com.p280ss.android.ugc.aweme.account.login.view.C22156a;
import com.p280ss.android.ugc.aweme.account.login.view.C22156a.C22157a;
import com.p280ss.android.ugc.aweme.account.login.view.C22156a.C22158b;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p951l.C21247i;
import com.p280ss.android.ugc.aweme.account.p982ui.LoadingButton;
import com.p280ss.android.ugc.aweme.account.p982ui.PhoneInputView;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Map;
import kotlin.C7541d;
import kotlin.C7546e;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.C7575l;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.PropertyReference1;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.p357a.C7561a;
import kotlin.reflect.C7595j;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment */
public final class PhoneLoginFragment extends BaseI18nLoginFragment implements C21642z {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f59124f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PhoneLoginFragment.class), "phoneHintHelper", "getPhoneHintHelper()Lcom/ss/android/ugc/aweme/account/login/sms/GooglePhoneHintHelper;"))};

    /* renamed from: i */
    public static final C22118a f59125i = new C22118a(null);

    /* renamed from: g */
    public C22156a f59126g;

    /* renamed from: h */
    public boolean f59127h = true;

    /* renamed from: k */
    private boolean f59128k;

    /* renamed from: l */
    private boolean f59129l;

    /* renamed from: m */
    private final C7541d f59130m = C7546e.m23569a(new C22121d(this));

    /* renamed from: n */
    private HashMap f59131n;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment$a */
    public static final class C22118a {
        private C22118a() {
        }

        public /* synthetic */ C22118a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m73550a(boolean z, String str) {
            C7573i.m23587b(str, "enterMethod");
            C6907h.m21524a("login_click_next_result", (Map) new C21102b().mo56946a("platform", "phone").mo56946a("enter_method", str).mo56944a("is_success", z ? 1 : 0).mo56944a("is_register", 0).f56672a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment$b */
    static final class C22119b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PhoneLoginFragment f59132a;

        C22119b(PhoneLoginFragment phoneLoginFragment) {
            this.f59132a = phoneLoginFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f59132a.f59127h = false;
            C6907h.m21524a("login_click_next", (Map) new C21102b().mo56946a("platform", "phone").mo56946a("enter_method", this.f59132a.mo58341f()).f56672a);
            if (!PhoneNumberUtil.m73061b(((PhoneInputView) this.f59132a.mo58338b(R.id.cav)).getCountryCodeString(), ((PhoneInputView) this.f59132a.mo58338b(R.id.cav)).getPhoneNumberString())) {
                C22118a.m73550a(false, this.f59132a.mo58341f());
                PhoneLoginFragment phoneLoginFragment = this.f59132a;
                String string = this.f59132a.getString(R.string.adg);
                C7573i.m23582a((Object) string, "getString(R.string.commo…ration_phone_input_error)");
                phoneLoginFragment.mo58335a(0, string);
            } else if (C21247i.m71506a(((PhoneInputView) this.f59132a.mo58338b(R.id.cav)).getCountryCodeString())) {
                this.f59132a.mo57299a();
            } else {
                this.f59132a.mo58453a(false, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment$c */
    public static final class C22120c extends C21173f {

        /* renamed from: a */
        final /* synthetic */ PhoneLoginFragment f59133a;

        C22120c(PhoneLoginFragment phoneLoginFragment) {
            this.f59133a = phoneLoginFragment;
        }

        public final void afterTextChanged(Editable editable) {
            ((InputResultIndicator) this.f59133a.mo58338b(R.id.cau)).mo58394a();
            LoadingButton loadingButton = (LoadingButton) this.f59133a.mo58338b(R.id.f124314cat);
            C7573i.m23582a((Object) loadingButton, "phoneLoginContinueBtn");
            boolean z = false;
            if (editable != null) {
                String obj = editable.toString();
                if (obj != null && obj.length() > 0) {
                    z = true;
                }
            }
            loadingButton.setEnabled(z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment$d */
    static final class C22121d extends Lambda implements C7561a<C21586a> {

        /* renamed from: a */
        final /* synthetic */ PhoneLoginFragment f59134a;

        C22121d(PhoneLoginFragment phoneLoginFragment) {
            this.f59134a = phoneLoginFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C21586a invoke() {
            return new C21586a(this.f59134a, this.f59134a.mo58341f());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment$e */
    public static final class C22122e implements C22157a {

        /* renamed from: a */
        final /* synthetic */ PhoneLoginFragment f59135a;

        /* renamed from: a */
        public final void mo57660a() {
            C42951au.m136343b(this.f59135a.f59126g);
        }

        C22122e(PhoneLoginFragment phoneLoginFragment) {
            this.f59135a = phoneLoginFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment$f */
    static final class C22123f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PhoneLoginFragment f59136a;

        /* renamed from: b */
        final /* synthetic */ boolean f59137b;

        C22123f(PhoneLoginFragment phoneLoginFragment, boolean z) {
            this.f59136a = phoneLoginFragment;
            this.f59137b = z;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f59136a.mo58452a(this.f59137b);
            this.f59136a.mo58453a(this.f59137b, true);
            C42951au.m136343b(this.f59136a.f59126g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment$g */
    static final class C22124g implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PhoneLoginFragment f59138a;

        /* renamed from: b */
        final /* synthetic */ boolean f59139b;

        C22124g(PhoneLoginFragment phoneLoginFragment, boolean z) {
            this.f59138a = phoneLoginFragment;
            this.f59139b = z;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f59138a.mo58452a(!this.f59139b);
            this.f59138a.mo58453a(!this.f59139b, true);
            C42951au.m136343b(this.f59138a.f59126g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment$h */
    static final class C22125h<T> implements C7326g<C12710e<C12836s>> {

        /* renamed from: a */
        final /* synthetic */ PhoneLoginFragment f59140a;

        C22125h(PhoneLoginFragment phoneLoginFragment) {
            this.f59140a = phoneLoginFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12836s> eVar) {
            C22118a.m73550a(true, this.f59140a.mo58341f());
            this.f59140a.mo58454a(true, true, false);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneLoginFragment$i */
    static final class C22126i<T> implements C7326g<C12710e<C12836s>> {

        /* renamed from: a */
        final /* synthetic */ PhoneLoginFragment f59141a;

        /* renamed from: b */
        final /* synthetic */ boolean f59142b;

        C22126i(PhoneLoginFragment phoneLoginFragment, boolean z) {
            this.f59141a = phoneLoginFragment;
            this.f59142b = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12836s> eVar) {
            C22118a.m73550a(true, this.f59141a.mo58341f());
            this.f59141a.mo58454a(false, true, this.f59142b);
        }
    }

    /* renamed from: u */
    private final C21586a m73535u() {
        return (C21586a) this.f59130m.getValue();
    }

    /* renamed from: X_ */
    public final boolean mo57516X_() {
        return this.f59127h;
    }

    /* renamed from: b */
    public final View mo58338b(int i) {
        if (this.f59131n == null) {
            this.f59131n = new HashMap();
        }
        View view = (View) this.f59131n.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59131n.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: n */
    public final void mo58347n() {
        if (this.f59131n != null) {
            this.f59131n.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo58347n();
    }

    /* renamed from: p */
    public final int mo58417p() {
        return R.layout.b1n;
    }

    public final void onStop() {
        super.onStop();
        m73535u().mo57776b();
    }

    /* renamed from: q */
    public final void mo58418q() {
        ((LoadingButton) mo58338b(R.id.f124314cat)).mo58680b();
    }

    /* renamed from: r */
    public final void mo58419r() {
        ((LoadingButton) mo58338b(R.id.f124314cat)).mo58679a();
    }

    /* renamed from: o */
    public final C22047a mo58416o() {
        C22047a aVar = new C22047a(null, null, false, null, null, true, null, false, false, 454, null);
        return aVar;
    }

    /* renamed from: w */
    private final void m73537w() {
        if (((PhoneInputView) mo58338b(R.id.cav)).getPhoneNumber() <= 0 && !this.f59129l) {
            m73535u().mo57774a(((PhoneInputView) mo58338b(R.id.cav)).getEditText());
        }
        this.f59129l = true;
        C22048b.m73350a(((PhoneInputView) mo58338b(R.id.cav)).getInputView().getEditText());
    }

    /* renamed from: v */
    private final void m73536v() {
        boolean z;
        if (!C21671bd.m72539g()) {
            BaseLoginMethod a = C21579s.m72305a(LoginMethodName.DEFAULT);
            if (a instanceof PhoneLoginMethod) {
                PhoneLoginMethod phoneLoginMethod = (PhoneLoginMethod) a;
                if (phoneLoginMethod.getPhoneNumber().getNationalNumber() != 0) {
                    ((PhoneInputView) mo58338b(R.id.cav)).setPhoneNumber(String.valueOf(phoneLoginMethod.getPhoneNumber().getNationalNumber()));
                }
                ((PhoneInputView) mo58338b(R.id.cav)).setCountry(C21566a.f57897h.mo57756a(phoneLoginMethod.getPhoneNumber()));
            }
        }
        boolean z2 = false;
        if (((PhoneInputView) mo58338b(R.id.cav)).getCountryCodeString().length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (((PhoneInputView) mo58338b(R.id.cav)).getCountryName().length() == 0) {
                z2 = true;
            }
            if (z2) {
                ((PhoneInputView) mo58338b(R.id.cav)).mo58693a();
            }
        }
    }

    /* renamed from: a */
    public final void mo57299a() {
        String string;
        String string2;
        if (getActivity() != null) {
            String countryCodeString = ((PhoneInputView) mo58338b(R.id.cav)).getCountryCodeString();
            boolean b = C21247i.m71507b(countryCodeString);
            if (C21247i.m71507b(countryCodeString)) {
                string = getString(R.string.dlx);
                C7573i.m23582a((Object) string, "getString(R.string.send_…de_dialog_item_whats_app)");
                string2 = getString(R.string.dlw);
                C7573i.m23582a((Object) string2, "getString(R.string.send_code_dialog_item_sms)");
            } else {
                string = getString(R.string.dlw);
                C7573i.m23582a((Object) string, "getString(R.string.send_code_dialog_item_sms)");
                string2 = getString(R.string.dlx);
                C7573i.m23582a((Object) string2, "getString(R.string.send_…de_dialog_item_whats_app)");
            }
            String str = string;
            String str2 = string2;
            String fullPhoneNumber = ((PhoneInputView) mo58338b(R.id.cav)).getFullPhoneNumber();
            FragmentActivity activity = getActivity();
            if (activity == null) {
                C7573i.m23580a();
            }
            C7573i.m23582a((Object) activity, "activity!!");
            Context context = activity;
            String string3 = getString(R.string.dly);
            C7573i.m23582a((Object) string3, "getString(R.string.send_code_dialog_title)");
            String string4 = getString(R.string.dlv, fullPhoneNumber);
            C7573i.m23582a((Object) string4, "getString(R.string.send_…og_desc, phoneNumberText)");
            C22158b bVar = new C22158b(string3, string4, str, str2, mo58342g(), fullPhoneNumber);
            this.f59126g = new C22156a(context, bVar);
            C22156a aVar = this.f59126g;
            if (aVar == null) {
                C7573i.m23580a();
            }
            aVar.f59195a = new C22122e(this);
            C22156a aVar2 = this.f59126g;
            if (aVar2 == null) {
                C7573i.m23580a();
            }
            aVar2.f59196b = new C22123f(this, b);
            C22156a aVar3 = this.f59126g;
            if (aVar3 == null) {
                C7573i.m23580a();
            }
            aVar3.f59197c = new C22124g(this, b);
            C42951au.m136342a(this.f59126g);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m73535u().mo57772a();
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (z) {
            if (isViewValid()) {
                m73537w();
                return;
            }
            this.f59128k = true;
        }
    }

    /* renamed from: a */
    public final void mo58452a(boolean z) {
        String str;
        if (z) {
            str = "phone_verification_click_whatsapp";
        } else {
            str = "phone_verification_click_sms";
        }
        C6907h.m21524a(str, (Map) new C21102b().mo56946a("enter_type", mo58342g()).f56672a);
    }

    /* renamed from: a */
    public final void mo58335a(int i, String str) {
        C7573i.m23587b(str, "message");
        ((InputResultIndicator) mo58338b(R.id.cau)).mo58395a(str);
        ((LoadingButton) mo58338b(R.id.f124314cat)).mo58680b();
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        mo58425a((LoadingButton) mo58338b(R.id.f124314cat), new C22119b(this));
        ((PhoneInputView) mo58338b(R.id.cav)).getInputView().setTextWatcher(new C22120c(this));
        m73536v();
        if (this.f59128k) {
            m73537w();
            this.f59128k = false;
        }
    }

    /* renamed from: a */
    public final void mo58453a(boolean z, boolean z2) {
        String str;
        String str2;
        String str3;
        boolean z3 = z2;
        C22034b a = C22033a.m73316a(getActivity(), ((PhoneInputView) mo58338b(R.id.cav)).getFullPhoneNumber(), Scene.LOGIN);
        if (a != null) {
            C21866f fVar = a.f58908a;
            if (fVar != null && fVar.mo58295e()) {
                mo58454a(z, false, false);
                return;
            }
        }
        if (z) {
            C21931e eVar = C21931e.f58668a;
            BaseAccountFlowFragment baseAccountFlowFragment = this;
            PhoneNumber phoneNumberObject = ((PhoneInputView) mo58338b(R.id.cav)).getPhoneNumberObject();
            Scene scene = Scene.LOGIN;
            Step step = Step.PHONE_SMS_LOGIN;
            if (z3) {
                str3 = "user_click";
            } else {
                str3 = "auto_system";
            }
            eVar.mo58377a(baseAccountFlowFragment, phoneNumberObject, scene, step, str3, "").mo19278c((C7326g<? super T>) new C22125h<Object>(this)).mo19273b();
            return;
        }
        C21931e eVar2 = C21931e.f58668a;
        BaseAccountFlowFragment baseAccountFlowFragment2 = this;
        String a2 = PhoneNumberUtil.m73058a(((PhoneInputView) mo58338b(R.id.cav)).getPhoneNumberObject());
        Scene scene2 = Scene.LOGIN;
        Step step2 = Step.PHONE_SMS_LOGIN;
        String str4 = "";
        if (z3) {
            str = "user_click";
        } else {
            str = "auto_system";
        }
        String str5 = str;
        if (z3) {
            str2 = "choose_dialog";
        } else {
            str2 = null;
        }
        eVar2.mo58380a(baseAccountFlowFragment2, a2, scene2, step2, str4, str5, str2).mo19278c((C7326g<? super T>) new C22126i<Object>(this, z3)).mo19273b();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m73535u().mo57773a(i, i2, intent);
    }

    /* renamed from: a */
    public final void mo58454a(boolean z, boolean z2, boolean z3) {
        C21903c.m73114a((Fragment) this, ((PhoneInputView) mo58338b(R.id.cav)).getPhoneNumberObject());
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", Step.PHONE_SMS_LOGIN.getValue());
        arguments.putInt("current_scene", Scene.LOGIN.getValue());
        arguments.putBoolean("code_sent", z2);
        arguments.putBoolean("use_whatsapp", z);
        arguments.putBoolean("from_choose_dialog", z3);
        C7573i.m23582a((Object) arguments, "(arguments ?: Bundle()).…omChooseDialog)\n        }");
        mo58336a(arguments);
    }
}
