package com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments;

import android.os.Bundle;
import android.support.p022v4.app.Fragment;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.widget.DmtTextView;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12836s;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21866f;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.BaseAccountFlowFragment;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.C21903c;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Step;
import com.p280ss.android.ugc.aweme.account.login.p975v2.network.C21931e;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22047a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.C22048b;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.InputResultIndicator;
import com.p280ss.android.ugc.aweme.account.login.p975v2.timer.TimerHolder.C22033a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.timer.TimerHolder.C22034b;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil;
import com.p280ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil.PhoneNumber;
import com.p280ss.android.ugc.aweme.account.p982ui.LoadingButton;
import com.p280ss.android.ugc.aweme.account.p982ui.PhoneInputView;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import p346io.reactivex.p348d.C7326g;

/* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment */
public final class InputPhoneFragment extends BaseI18nLoginFragment {

    /* renamed from: f */
    public static final C22104a f59090f = new C22104a(null);

    /* renamed from: g */
    private String f59091g = "";

    /* renamed from: h */
    private String f59092h = "";

    /* renamed from: i */
    private HashMap f59093i;

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment$a */
    public static final class C22104a {
        private C22104a() {
        }

        public /* synthetic */ C22104a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment$b */
    public static final class C22105b extends C23467g {

        /* renamed from: a */
        final /* synthetic */ EditText f59094a;

        /* renamed from: b */
        final /* synthetic */ InputPhoneFragment f59095b;

        public final void afterTextChanged(Editable editable) {
            super.afterTextChanged(editable);
            LoadingButton loadingButton = (LoadingButton) this.f59095b.mo58338b(R.id.b1p);
            C7573i.m23582a((Object) loadingButton, "inputPhoneNextBtn");
            loadingButton.setEnabled(!TextUtils.isEmpty(this.f59094a.getText()));
            ((InputResultIndicator) this.f59095b.mo58338b(R.id.b1q)).mo58394a();
        }

        C22105b(EditText editText, InputPhoneFragment inputPhoneFragment) {
            this.f59094a = editText;
            this.f59095b = inputPhoneFragment;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment$c */
    static final class C22106c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ InputPhoneFragment f59096a;

        C22106c(InputPhoneFragment inputPhoneFragment) {
            this.f59096a = inputPhoneFragment;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f59096a.mo57299a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment$d */
    static final class C22107d<T> implements C7326g<C12710e<C12836s>> {

        /* renamed from: a */
        final /* synthetic */ InputPhoneFragment f59097a;

        C22107d(InputPhoneFragment inputPhoneFragment) {
            this.f59097a = inputPhoneFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12836s> eVar) {
            this.f59097a.mo58449a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment$e */
    static final class C22108e<T> implements C7326g<C12710e<C12836s>> {

        /* renamed from: a */
        final /* synthetic */ InputPhoneFragment f59098a;

        C22108e(InputPhoneFragment inputPhoneFragment) {
            this.f59098a = inputPhoneFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12836s> eVar) {
            this.f59098a.mo58449a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.v2.ui.fragments.InputPhoneFragment$f */
    static final class C22109f<T> implements C7326g<C12710e<C12836s>> {

        /* renamed from: a */
        final /* synthetic */ InputPhoneFragment f59099a;

        C22109f(InputPhoneFragment inputPhoneFragment) {
            this.f59099a = inputPhoneFragment;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void accept(C12710e<C12836s> eVar) {
            this.f59099a.mo58449a(true);
        }
    }

    /* renamed from: b */
    public final View mo58338b(int i) {
        if (this.f59093i == null) {
            this.f59093i = new HashMap();
        }
        View view = (View) this.f59093i.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f59093i.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: n */
    public final void mo58347n() {
        if (this.f59093i != null) {
            this.f59093i.clear();
        }
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo58347n();
    }

    /* renamed from: p */
    public final int mo58417p() {
        return R.layout.b1k;
    }

    /* renamed from: q */
    public final void mo58418q() {
        LoadingButton loadingButton = (LoadingButton) mo58338b(R.id.b1p);
        if (loadingButton != null) {
            loadingButton.mo58680b();
        }
    }

    /* renamed from: r */
    public final void mo58419r() {
        LoadingButton loadingButton = (LoadingButton) mo58338b(R.id.b1p);
        if (loadingButton != null) {
            loadingButton.mo58679a();
        }
    }

    public final void onResume() {
        super.onResume();
        C22048b.m73350a(((PhoneInputView) mo58338b(R.id.b1r)).getEditText());
    }

    /* renamed from: o */
    public final C22047a mo58416o() {
        boolean z;
        String str;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8 = "";
        switch (C22147d.f59184c[mo58339d().ordinal()]) {
            case 1:
                String string = getString(R.string.ac2);
                C7573i.m23582a((Object) string, "getString(R.string.commo…_reset_phone_input_title)");
                String string2 = getString(R.string.ac1);
                C7573i.m23582a((Object) string2, "getString(R.string.commo…n_reset_phone_input_text)");
                String string3 = getString(R.string.ac4);
                C7573i.m23582a((Object) string3, "getString(R.string.common_login_reset_title)");
                str = "reset_phone_input";
                str3 = string;
                str2 = string2;
                str4 = string3;
                z = true;
                break;
            case 2:
                str7 = getString(R.string.dne);
                C7573i.m23582a((Object) str7, "getString(R.string.setting_bind_phone_input_title)");
                str6 = getString(R.string.dnd);
                C7573i.m23582a((Object) str6, "getString(R.string.setting_bind_phone_input_text)");
                str5 = " ";
                break;
            case 3:
                str7 = getString(R.string.dnb);
                C7573i.m23582a((Object) str7, "getString(R.string.setti…phone_change_input_title)");
                str6 = getString(R.string.dn_);
                C7573i.m23582a((Object) str6, "getString(R.string.setti…hone_change_input_text_1)");
                str5 = " ";
                DmtTextView dmtTextView = (DmtTextView) mo58338b(R.id.b1o);
                C7573i.m23582a((Object) dmtTextView, "inputPhoneDesc");
                dmtTextView.setVisibility(0);
                break;
            default:
                StringBuilder sb = new StringBuilder("Unknown step ");
                sb.append(mo58339d());
                sb.append(" during getCommonUiParam()");
                throw new IllegalStateException(sb.toString());
        }
        str = str8;
        str3 = str7;
        str2 = str6;
        str4 = str5;
        z = false;
        C22047a aVar = new C22047a(str4, null, false, str3, str2, false, str, z, false, 294, null);
        return aVar;
    }

    /* renamed from: a */
    public final void mo57299a() {
        if (!PhoneNumberUtil.m73061b(((PhoneInputView) mo58338b(R.id.b1r)).getCountryCodeString(), ((PhoneInputView) mo58338b(R.id.b1r)).getPhoneNumberString())) {
            String string = getString(R.string.adg);
            C7573i.m23582a((Object) string, "getString(R.string.commo…ration_phone_input_error)");
            mo58335a(0, string);
            return;
        }
        C22034b a = C22033a.m73316a(getActivity(), ((PhoneInputView) mo58338b(R.id.b1r)).getFullPhoneNumber(), mo58344j());
        if (a != null) {
            C21866f fVar = a.f58908a;
            if (fVar != null && fVar.mo58295e()) {
                mo58449a(false);
                return;
            }
        }
        switch (C22147d.f59182a[mo58339d().ordinal()]) {
            case 1:
                C21931e.f58668a.mo58378a((BaseAccountFlowFragment) this, ((PhoneInputView) mo58338b(R.id.b1r)).getPhoneNumberObject(), mo58339d(), "user_click").mo19278c((C7326g<? super T>) new C22107d<Object>(this)).mo19273b();
                return;
            case 2:
                C21931e.f58668a.mo58381b(this, PhoneNumberUtil.m73058a(((PhoneInputView) mo58338b(R.id.b1r)).getPhoneNumberObject()), mo58344j(), mo58339d(), "", "", "user_click").mo19278c((C7326g<? super T>) new C22108e<Object>(this)).mo19273b();
                return;
            case 3:
                C21931e.f58668a.mo58381b(this, PhoneNumberUtil.m73058a(((PhoneInputView) mo58338b(R.id.b1r)).getPhoneNumberObject()), mo58344j(), mo58339d(), this.f59091g, this.f59092h, "user_click").mo19278c((C7326g<? super T>) new C22109f<Object>(this)).mo19273b();
                break;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0029, code lost:
        if (r2 == null) goto L_0x002b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:5:0x0017, code lost:
        if (r2 == null) goto L_0x0019;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r2) {
        /*
            r1 = this;
            super.onCreate(r2)
            com.ss.android.ugc.aweme.account.login.v2.base.Scene r2 = r1.mo58344j()
            com.ss.android.ugc.aweme.account.login.v2.base.Scene r0 = com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene.MODIFY_PHONE
            if (r2 != r0) goto L_0x002f
            android.os.Bundle r2 = r1.getArguments()
            if (r2 == 0) goto L_0x0019
            java.lang.String r0 = "ticket"
            java.lang.String r2 = r2.getString(r0)
            if (r2 != 0) goto L_0x001b
        L_0x0019:
            java.lang.String r2 = ""
        L_0x001b:
            r1.f59091g = r2
            android.os.Bundle r2 = r1.getArguments()
            if (r2 == 0) goto L_0x002b
            java.lang.String r0 = "mUnusableMobileTicket"
            java.lang.String r2 = r2.getString(r0)
            if (r2 != 0) goto L_0x002d
        L_0x002b:
            java.lang.String r2 = ""
        L_0x002d:
            r1.f59092h = r2
        L_0x002f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.fragments.InputPhoneFragment.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo58449a(boolean z) {
        C21903c.m73114a((Fragment) this, ((PhoneInputView) mo58338b(R.id.b1r)).getPhoneNumberObject());
        Bundle arguments = getArguments();
        if (arguments == null) {
            arguments = new Bundle();
        }
        arguments.putBoolean("code_sent", z);
        switch (C22147d.f59183b[mo58339d().ordinal()]) {
            case 1:
                arguments.putInt("next_page", Step.PHONE_SMS_FIND_PASSWORD.getValue());
                break;
            case 2:
                arguments.putInt("next_page", Step.PHONE_SMS_BIND.getValue());
                break;
            case 3:
                arguments.putInt("next_page", Step.PHONE_SMS_MODIFY.getValue());
                break;
        }
        C7573i.m23582a((Object) arguments, "(arguments ?: Bundle()).…)\n            }\n        }");
        mo58336a(arguments);
    }

    /* renamed from: a */
    public final void mo58335a(int i, String str) {
        C7573i.m23587b(str, "message");
        ((InputResultIndicator) mo58338b(R.id.b1q)).mo58395a(str);
    }

    public final void onViewCreated(View view, Bundle bundle) {
        C7573i.m23587b(view, "view");
        super.onViewCreated(view, bundle);
        PhoneInputView phoneInputView = (PhoneInputView) mo58338b(R.id.b1r);
        EditText editText = phoneInputView.getEditText();
        editText.setInputType(3);
        editText.addTextChangedListener(new C22105b(editText, this));
        editText.setHint(getString(R.string.cex));
        PhoneNumber b = C21903c.f58624a.mo58353b((Fragment) this);
        if (b != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(b.getCountryCode());
            phoneInputView.setCountryCode(sb.toString());
            StringBuilder sb2 = new StringBuilder();
            sb2.append(b.getCountryIso());
            phoneInputView.setCountryName(sb2.toString());
            StringBuilder sb3 = new StringBuilder();
            sb3.append(b.getNationalNumber());
            phoneInputView.setPhoneNumber(sb3.toString());
        } else {
            phoneInputView.mo58693a();
        }
        mo58425a((LoadingButton) mo58338b(R.id.b1p), new C22106c(this));
        mo58345k();
    }
}
