package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.support.p022v4.app.FragmentActivity;
import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12836s;
import com.p280ss.android.ugc.aweme.account.C21173f;
import com.p280ss.android.ugc.aweme.account.base.p939a.C21118a;
import com.p280ss.android.ugc.aweme.account.login.C21278ac;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21866f;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21903c;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21931e;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.AccountKeyBoardHelper.C22035a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22047a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22048b;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.InputResultIndicator;
import com.p280ss.android.ugc.aweme.account.login.p975v2.timer.TimerHolder.C22033a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.timer.TimerHolder.C22034b;
import com.p280ss.android.ugc.aweme.account.login.sms.C21586a;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
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

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment */
public final class PhoneSignUpFragment extends BaseI18nLoginFragment {

    /* renamed from: f */
    static final /* synthetic */ C7595j[] f59143f = {C7575l.m23602a((PropertyReference1) new PropertyReference1Impl(C7575l.m23595a(PhoneSignUpFragment.class), "phoneHintHelper", "getPhoneHintHelper()Lcom/ss/android/ugc/aweme/account/login/sms/GooglePhoneHintHelper;"))};

    /* renamed from: h */
    public static final C22127a f59144h = new C22127a(null);

    /* renamed from: g */
    public C22156a f59145g;

    /* renamed from: i */
    private boolean f59146i;

    /* renamed from: k */
    private final C7541d f59147k = C7546e.m23569a(new C22132f(this));

    /* renamed from: l */
    private HashMap f59148l;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment$a */
    public static final class C22127a {
        private C22127a() {
        }

        public /* synthetic */ C22127a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public static void m73568a(Integer num, String str) {
            int i;
            C7573i.m23587b(str, "enterMethod");
            C21102b a = new C21102b().mo56946a("platform", "phone").mo56946a("enter_method", str);
            String str2 = "is_success";
            if (num != null && num.intValue() == 0) {
                i = 1;
            } else {
                i = 0;
            }
            C21102b a2 = a.mo56944a(str2, i).mo56944a("is_register", 1);
            if (num == null) {
                a2.mo56946a("error_code", "");
            } else {
                a2.mo56944a("error_code", num.intValue());
            }
            C6907h.m21524a("register_click_next_result", (Map) a2.f56672a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment$b */
    public static final class C22128b extends C21173f {

        /* renamed from: a */
        final /* synthetic */ PhoneSignUpFragment f59149a;

        C22128b(PhoneSignUpFragment phoneSignUpFragment) {
            this.f59149a = phoneSignUpFragment;
        }

        public final void afterTextChanged(Editable editable) {
            ((InputResultIndicator) this.f59149a.mo58338b(R.id.cay)).mo58394a();
            LoadingButton loadingButton = (LoadingButton) this.f59149a.mo58338b(R.id.caw);
            C7573i.m23582a((Object) loadingButton, "phoneSignUpContinueBtn");
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

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment$c */
    static final class C22129c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PhoneSignUpFragment f59150a;

        C22129c(PhoneSignUpFragment phoneSignUpFragment) {
            this.f59150a = phoneSignUpFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C42951au.m136342a(C21118a.m71202a((Context) this.f59150a.getActivity()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment$d */
    static final class C22130d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PhoneSignUpFragment f59151a;

        C22130d(PhoneSignUpFragment phoneSignUpFragment) {
            this.f59151a = phoneSignUpFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C42951au.m136342a(C21118a.m71203b(this.f59151a.getActivity()));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment$e */
    static final class C22131e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PhoneSignUpFragment f59152a;

        C22131e(PhoneSignUpFragment phoneSignUpFragment) {
            this.f59152a = phoneSignUpFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C6907h.m21524a("register_click_next", (Map) new C21102b().mo56946a("platform", "phone").mo56946a("enter_method", this.f59152a.mo58341f()).f56672a);
            if (!PhoneNumberUtil.m73061b(((PhoneInputView) this.f59152a.mo58338b(R.id.caz)).getCountryCodeString(), ((PhoneInputView) this.f59152a.mo58338b(R.id.caz)).getPhoneNumberString())) {
                C22127a.m73568a(null, this.f59152a.mo58341f());
                PhoneSignUpFragment phoneSignUpFragment = this.f59152a;
                String string = this.f59152a.getString(R.string.adg);
                C7573i.m23582a((Object) string, "getString(R.string.commo…ration_phone_input_error)");
                phoneSignUpFragment.mo58335a(0, string);
            } else if (C21247i.m71506a(((PhoneInputView) this.f59152a.mo58338b(R.id.caz)).getCountryCodeString())) {
                this.f59152a.mo57299a();
            } else {
                this.f59152a.mo58459a(false, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment$f */
    static final class C22132f extends Lambda implements C7561a<C21586a> {

        /* renamed from: a */
        final /* synthetic */ PhoneSignUpFragment f59153a;

        C22132f(PhoneSignUpFragment phoneSignUpFragment) {
            this.f59153a = phoneSignUpFragment;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C21586a invoke() {
            return new C21586a(this.f59153a, this.f59153a.mo58341f());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment$g */
    public static final class C22133g implements C22157a {

        /* renamed from: a */
        final /* synthetic */ PhoneSignUpFragment f59154a;

        /* renamed from: a */
        public final void mo57660a() {
            C42951au.m136343b(this.f59154a.f59145g);
        }

        C22133g(PhoneSignUpFragment phoneSignUpFragment) {
            this.f59154a = phoneSignUpFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment$h */
    static final class C22134h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PhoneSignUpFragment f59155a;

        /* renamed from: b */
        final /* synthetic */ boolean f59156b;

        C22134h(PhoneSignUpFragment phoneSignUpFragment, boolean z) {
            this.f59155a = phoneSignUpFragment;
            this.f59156b = z;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f59155a.mo58458a(this.f59156b);
            this.f59155a.mo58459a(this.f59156b, true);
            C42951au.m136343b(this.f59155a.f59145g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment$i */
    static final class C22135i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ PhoneSignUpFragment f59157a;

        /* renamed from: b */
        final /* synthetic */ boolean f59158b;

        C22135i(PhoneSignUpFragment phoneSignUpFragment, boolean z) {
            this.f59157a = phoneSignUpFragment;
            this.f59158b = z;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f59157a.mo58458a(!this.f59158b);
            this.f59157a.mo58459a(!this.f59158b, true);
            C42951au.m136343b(this.f59157a.f59145g);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment$j */
    static final class C22136j<T> implements C7326g<C12710e<C12836s>> {

        /* renamed from: a */
        final /* synthetic */ PhoneSignUpFragment f59159a;

        C22136j(PhoneSignUpFragment phoneSignUpFragment) {
            this.f59159a = phoneSignUpFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12836s> eVar) {
            C22127a.m73568a(Integer.valueOf(0), this.f59159a.mo58341f());
            this.f59159a.mo58460b(true, true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.PhoneSignUpFragment$k */
    static final class C22137k<T> implements C7326g<C12710e<C12836s>> {

        /* renamed from: a */
        final /* synthetic */ PhoneSignUpFragment f59160a;

        C22137k(PhoneSignUpFragment phoneSignUpFragment) {
            this.f59160a = phoneSignUpFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12836s> eVar) {
            C22127a.m73568a(Integer.valueOf(0), this.f59160a.mo58341f());
            this.f59160a.mo58460b(false, true);
        }
    }

    /* renamed from: u */
    private final C21586a m73556u() {
        return (C21586a) this.f59147k.getValue();
    }

    /* renamed from: b */
    public final View mo58338b(int i) {
        if (this.f59148l == null) {
            this.f59148l = new HashMap();
        }
        View view = (View) this.f59148l.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59148l.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: n */
    public final void mo58347n() {
        if (this.f59148l != null) {
            this.f59148l.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo58347n();
    }

    /* renamed from: p */
    public final int mo58417p() {
        return R.layout.b1o;
    }

    public final void onStop() {
        super.onStop();
        m73556u().mo57776b();
    }

    /* renamed from: q */
    public final void mo58418q() {
        ((LoadingButton) mo58338b(R.id.caw)).mo58680b();
    }

    /* renamed from: r */
    public final void mo58419r() {
        LoadingButton loadingButton = (LoadingButton) mo58338b(R.id.caw);
        if (loadingButton != null) {
            loadingButton.mo58679a();
        }
    }

    /* renamed from: o */
    public final C22047a mo58416o() {
        C22047a aVar = new C22047a(null, null, false, null, null, false, null, false, true, NormalGiftView.ALPHA_255, null);
        return aVar;
    }

    public final void onStart() {
        super.onStart();
        if (C22035a.m73321a()) {
            C22048b.m73350a(((PhoneInputView) mo58338b(R.id.caz)).getInputView().getEditText());
        } else {
            ((PhoneInputView) mo58338b(R.id.caz)).getInputView().getEditText().requestFocus();
        }
    }

    /* renamed from: a */
    public final void mo57299a() {
        String string;
        String string2;
        if (getActivity() != null) {
            String countryCodeString = ((PhoneInputView) mo58338b(R.id.caz)).getCountryCodeString();
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
            String fullPhoneNumber = ((PhoneInputView) mo58338b(R.id.caz)).getFullPhoneNumber();
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
            this.f59145g = new C22156a(context, bVar);
            C22156a aVar = this.f59145g;
            if (aVar == null) {
                C7573i.m23580a();
            }
            aVar.f59195a = new C22133g(this);
            C22156a aVar2 = this.f59145g;
            if (aVar2 == null) {
                C7573i.m23580a();
            }
            aVar2.f59196b = new C22134h(this, b);
            C22156a aVar3 = this.f59145g;
            if (aVar3 == null) {
                C7573i.m23580a();
            }
            aVar3.f59197c = new C22135i(this, b);
            C42951au.m136342a(this.f59145g);
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        m73556u().mo57772a();
    }

    /* renamed from: a */
    public final void mo58458a(boolean z) {
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
        ((InputResultIndicator) mo58338b(R.id.cay)).mo58395a(str);
    }

    /* renamed from: b */
    public final void mo58460b(boolean z, boolean z2) {
        C21903c.m73114a((Fragment) this, ((PhoneInputView) mo58338b(R.id.caz)).getPhoneNumberObject());
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putInt("next_page", Step.PHONE_SMS_SIGN_UP.getValue());
        arguments.putInt("current_scene", Scene.SIGN_UP.getValue());
        arguments.putBoolean("code_sent", z2);
        arguments.putBoolean("use_whatsapp", z);
        C7573i.m23582a((Object) arguments, "(arguments ?: Bundle()).…P, useWhatsApp)\n        }");
        mo58336a(arguments);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        ((PhoneInputView) mo58338b(R.id.caz)).getInputView().setTextWatcher(new C22128b(this));
        C21278ac.m71641a(getContext(), (DmtTextView) mo58338b(R.id.cax), new C22129c(this), new C22130d(this), true);
        ((PhoneInputView) mo58338b(R.id.caz)).mo58693a();
        if (!this.f59146i) {
            m73556u().mo57774a(((PhoneInputView) mo58338b(R.id.caz)).getEditText());
            this.f59146i = true;
        }
        mo58425a((LoadingButton) mo58338b(R.id.caw), new C22131e(this));
    }

    /* renamed from: a */
    public final void mo58459a(boolean z, boolean z2) {
        String str;
        C22034b a = C22033a.m73316a(getActivity(), ((PhoneInputView) mo58338b(R.id.caz)).getFullPhoneNumber(), Scene.LOGIN);
        if (a != null) {
            C21866f fVar = a.f58908a;
            if (fVar != null && fVar.mo58295e()) {
                mo58460b(z, false);
                return;
            }
        }
        if (z) {
            C21931e.f58668a.mo58377a((BaseAccountFlowFragment) this, ((PhoneInputView) mo58338b(R.id.caz)).getPhoneNumberObject(), Scene.SIGN_UP, Step.PHONE_SMS_SIGN_UP, "user_click", "").mo19278c((C7326g<? super T>) new C22136j<Object>(this)).mo19273b();
            return;
        }
        C21931e eVar = C21931e.f58668a;
        BaseAccountFlowFragment baseAccountFlowFragment = this;
        String a2 = PhoneNumberUtil.m73058a(((PhoneInputView) mo58338b(R.id.caz)).getPhoneNumberObject());
        Scene scene = Scene.SIGN_UP;
        Step step = Step.PHONE_SMS_SIGN_UP;
        String str2 = "";
        String str3 = "user_click";
        if (z2) {
            str = "choose_dialog";
        } else {
            str = null;
        }
        eVar.mo58380a(baseAccountFlowFragment, a2, scene, step, str2, str3, str).mo19278c((C7326g<? super T>) new C22137k<Object>(this)).mo19273b();
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        m73556u().mo57773a(i, i2, intent);
    }
}
