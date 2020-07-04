package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.FragmentActivity;
import android.telephony.TelephonyManager;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.sdk.account.p645a.C12728d;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p662f.p663a.C12822e;
import com.bytedance.sdk.account.p662f.p663a.C12836s;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12844e;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12855p;
import com.google.common.collect.C17995dt;
import com.google.common.util.concurrent.C18245g;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.C21169e;
import com.p280ss.android.ugc.aweme.account.api.p937b.C21112b;
import com.p280ss.android.ugc.aweme.account.login.C21638v;
import com.p280ss.android.ugc.aweme.account.login.MusLoginActivity;
import com.p280ss.android.ugc.aweme.account.login.bean.EmailExistBean;
import com.p280ss.android.ugc.aweme.account.login.model.C21566a;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21337n;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21348y;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21883t.C21884a;
import com.p280ss.android.ugc.aweme.account.login.p974ui.LoginButton;
import com.p280ss.android.ugc.aweme.account.login.p974ui.MusCountryListActivity;
import com.p280ss.android.ugc.aweme.account.login.p974ui.MusRegisterTabLayout;
import com.p280ss.android.ugc.aweme.account.login.p974ui.MusRegisterTabLayout.C21840a;
import com.p280ss.android.ugc.aweme.account.login.sms.C21586a;
import com.p280ss.android.ugc.aweme.account.login.view.C22156a;
import com.p280ss.android.ugc.aweme.account.login.view.C22156a.C22158b;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a.C21171a;
import com.p280ss.android.ugc.aweme.account.p950k.C21231d;
import com.p280ss.android.ugc.aweme.account.p950k.C21235f;
import com.p280ss.android.ugc.aweme.account.p951l.C21241d;
import com.p280ss.android.ugc.aweme.account.p951l.C21247i;
import com.p280ss.android.ugc.aweme.account.shortvideo.p981ui.PressFadeLinearLayout;
import com.p280ss.android.ugc.aweme.account.util.C22334m;
import com.p280ss.android.ugc.aweme.account.util.C22338o;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.p280ss.android.ugc.aweme.account.views.C22364b;
import com.p280ss.android.ugc.aweme.account.views.C22367e;
import com.p280ss.android.ugc.aweme.base.utils.C23481i;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.BaseMusRegisterFragment */
public abstract class BaseMusRegisterFragment extends BaseMusLoginFragment implements C21171a, C21337n {

    /* renamed from: A */
    public String f57456A;

    /* renamed from: B */
    public String f57457B;

    /* renamed from: C */
    public boolean f57458C = false;

    /* renamed from: D */
    private ViewGroup f57459D;

    /* renamed from: E */
    private ViewGroup f57460E;

    /* renamed from: F */
    private TextView f57461F;

    /* renamed from: G */
    private PressFadeLinearLayout f57462G;

    /* renamed from: H */
    private View f57463H;

    /* renamed from: J */
    private Boolean f57464J = Boolean.valueOf(false);

    /* renamed from: K */
    private C21586a f57465K;

    /* renamed from: L */
    private C22156a f57466L;

    /* renamed from: M */
    private C12728d f57467M;

    /* renamed from: N */
    private OnFocusChangeListener f57468N = new OnFocusChangeListener() {
        public final void onFocusChange(View view, boolean z) {
            int i = 0;
            if (view.getId() == R.id.age) {
                ImageView imageView = BaseMusRegisterFragment.this.f57481x;
                if (!z || TextUtils.isEmpty(BaseMusRegisterFragment.this.f57473p.getText())) {
                    i = 8;
                }
                imageView.setVisibility(i);
                return;
            }
            if (view.getId() == R.id.ag0) {
                ImageView imageView2 = BaseMusRegisterFragment.this.f57480w;
                if (!z || TextUtils.isEmpty(BaseMusRegisterFragment.this.f57472o.getText())) {
                    i = 8;
                }
                imageView2.setVisibility(i);
            }
        }
    };

    /* renamed from: O */
    private int f57469O = 0;

    /* renamed from: P */
    private int f57470P = 0;

    /* renamed from: n */
    public MusRegisterTabLayout f57471n;

    /* renamed from: o */
    public EditText f57472o;

    /* renamed from: p */
    public EditText f57473p;

    /* renamed from: q */
    public View f57474q;

    /* renamed from: r */
    public LoginButton f57475r;

    /* renamed from: s */
    public TextView f57476s;

    /* renamed from: t */
    public TextView f57477t;

    /* renamed from: u */
    public View f57478u;

    /* renamed from: v */
    public TextView f57479v;

    /* renamed from: w */
    public ImageView f57480w;

    /* renamed from: x */
    public ImageView f57481x;

    /* renamed from: y */
    public MusRegisterTabLayout f57482y;

    /* renamed from: z */
    public String f57483z;

    /* renamed from: Y_ */
    public final boolean mo16933Y_() {
        return false;
    }

    /* renamed from: j */
    public abstract void mo57530j();

    /* renamed from: k */
    public abstract void mo57531k();

    public void onDestroyView() {
        super.onDestroyView();
    }

    /* renamed from: Z_ */
    public final void mo57356Z_() {
        this.f57475r.mo57356Z_();
    }

    /* renamed from: a */
    public final void mo57357a() {
        this.f57475r.mo57357a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: o */
    public final /* synthetic */ void mo57535o() {
        C42951au.m136343b(this.f57466L);
    }

    public void onPause() {
        super.onPause();
        KeyboardUtils.m77057c(this.f57473p);
    }

    public void onStart() {
        super.onStart();
        this.f57473p.postDelayed(new Runnable() {
            public final void run() {
                BaseMusRegisterFragment.this.mo57500a((View) BaseMusRegisterFragment.this.f57473p);
            }
        }, 500);
    }

    public void onStop() {
        super.onStop();
        this.f57465K.mo57776b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final /* synthetic */ void mo57536p() {
        if (this.f57471n.getCurrentPage() == 0) {
            this.f57465K.f57947a = this.f57473p;
            this.f57465K.mo57777c();
        }
    }

    /* renamed from: s */
    private boolean m71912s() {
        C21884a aVar;
        if (this.f57409h == null) {
            aVar = null;
        } else {
            aVar = this.f57409h.mo57191a(0);
        }
        if (aVar == null || !TextUtils.equals(m71913t(), aVar.f58585a) || aVar.f58586b.f59613b == 0) {
            return false;
        }
        return true;
    }

    /* renamed from: t */
    private String m71913t() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f57476s.getText().toString());
        sb.append("-");
        sb.append(this.f57473p.getText().toString());
        return sb.toString();
    }

    /* renamed from: i */
    public final void mo57529i() {
        C6907h.m21524a("register_click_next", (Map) new C21102b().mo56946a("platform", "email").f56672a);
        if (C22345t.m73962a()) {
            mo57509e().mo57211a(this.f57472o.getText().toString(), (C12844e) new C12844e() {
                public final void onSuccess(C12710e<C12822e> eVar) {
                    if (BaseMusRegisterFragment.this.isViewValid() && BaseMusRegisterFragment.this.getContext() != null) {
                        BaseMusRegisterFragment.this.mo57357a();
                        try {
                            if (eVar.f33709g == null || ((C12822e) eVar.f33709g).f33937d != 1) {
                                C6907h.m21524a("register_click_next_result", (Map) new C21102b().mo56946a("platform", "email").mo56944a("is_success", 1).mo56944a("is_register", 1).f56672a);
                                BaseMusLoginFragment baseMusLoginFragment = (BaseMusLoginFragment) C22334m.m73938a(MusSetPasswordFragment.class, BaseMusRegisterFragment.this.getArguments()).mo58756a("email", BaseMusRegisterFragment.this.f57472o.getText().toString()).mo58756a("enter_type", BaseMusRegisterFragment.this.f57413m).mo58757a("from_register", true).mo58754a("set_pass_scene", 3).mo58753a();
                                baseMusLoginFragment.mo57501a(BaseMusRegisterFragment.this.f57409h);
                                BaseMusRegisterFragment.this.mo57503b(baseMusLoginFragment, false);
                                return;
                            }
                            C6907h.m21524a("register_click_next_result", (Map) new C21102b().mo56946a("platform", "email").mo56944a("is_success", 1).mo56944a("is_register", 1).f56672a);
                            if (BaseMusRegisterFragment.this.getActivity() instanceof MusLoginActivity) {
                                ((MusLoginActivity) BaseMusRegisterFragment.this.getActivity()).f57129a = null;
                            }
                            BaseMusLoginFragment baseMusLoginFragment2 = (BaseMusLoginFragment) C22334m.m73938a(MusLoginPhonePasswordFragment.class, BaseMusRegisterFragment.this.getArguments()).mo58756a("email", BaseMusRegisterFragment.this.f57472o.getText().toString()).mo58754a(POIService.KEY_ORDER, 1).mo58756a("enter_type", BaseMusRegisterFragment.this.f57413m).mo58754a("login_type", 1).mo58757a("from_register", true).mo58753a();
                            baseMusLoginFragment2.mo57501a(BaseMusRegisterFragment.this.f57409h);
                            BaseMusRegisterFragment.this.mo57503b(baseMusLoginFragment2, false);
                        } catch (Exception unused) {
                            C10761a.m31392b(BaseMusRegisterFragment.this.getContext(), (int) R.string.b20, 0).mo25750a();
                        }
                    }
                }

                public final void onError(C12710e<C12822e> eVar, int i) {
                    if (BaseMusRegisterFragment.this.isViewValid() && BaseMusRegisterFragment.this.getContext() != null) {
                        BaseMusRegisterFragment.this.mo57357a();
                        if (eVar.f33702b <= 0) {
                            StringBuilder sb = new StringBuilder("CheckEmail:");
                            sb.append(eVar.f33703c);
                            C21231d.m71459a(1, -10000, sb.toString());
                            C6907h.m21524a("register_click_next_result", (Map) new C21102b().mo56946a("platform", "email").mo56944a("is_success", 0).mo56946a("error_code", "").mo56944a("is_register", 1).f56672a);
                            C10761a.m31392b(BaseMusRegisterFragment.this.getContext(), (int) R.string.cg0, 0).mo25750a();
                        } else if (eVar.f33702b == 1105) {
                            C6907h.m21524a("register_click_next_result", (Map) new C21102b().mo56946a("platform", "email").mo56944a("is_success", 0).mo56944a("error_code", eVar.f33702b).mo56944a("is_register", 1).f56672a);
                            String str = eVar.f33703c;
                            if (!TextUtils.isEmpty(str)) {
                                str = BaseMusRegisterFragment.this.getString(R.string.b20);
                            }
                            C10761a.m31403c(BaseMusRegisterFragment.this.getContext(), str).mo25750a();
                            int i2 = eVar.f33702b;
                            StringBuilder sb2 = new StringBuilder("CheckEmail:");
                            sb2.append(str);
                            C21231d.m71459a(1, i2, sb2.toString());
                        } else if (eVar.f33702b == 4) {
                            C6907h.m21524a("register_click_next_result", (Map) new C21102b().mo56946a("platform", "email").mo56944a("is_success", 0).mo56944a("error_code", eVar.f33702b).mo56944a("is_register", 1).f56672a);
                            String str2 = eVar.f33703c;
                            if (!TextUtils.isEmpty(str2)) {
                                str2 = BaseMusRegisterFragment.this.getString(R.string.b20);
                            }
                            C10761a.m31403c(BaseMusRegisterFragment.this.getContext(), str2).mo25750a();
                            int i3 = eVar.f33702b;
                            StringBuilder sb3 = new StringBuilder("CheckEmail:");
                            sb3.append(str2);
                            C21231d.m71459a(1, i3, sb3.toString());
                        } else if (eVar.f33702b == 6) {
                            C6907h.m21524a("register_click_next_result", (Map) new C21102b().mo56946a("platform", "email").mo56944a("is_success", 0).mo56944a("error_code", eVar.f33702b).mo56944a("is_register", 1).f56672a);
                            C10761a.m31399c(BaseMusRegisterFragment.this.getContext(), (int) R.string.dxr).mo25750a();
                            C21231d.m71459a(1, eVar.f33702b, "CheckEmail:");
                        }
                    }
                }
            });
        } else {
            mo57509e().mo57218b(this.f57472o.getText().toString(), new C18245g<EmailExistBean>() {
                public final void onFailure(Throwable th) {
                    StringBuilder sb = new StringBuilder("emailExist:");
                    sb.append(th.getMessage());
                    C21231d.m71459a(1, -10000, sb.toString());
                    if (BaseMusRegisterFragment.this.isViewValid() && BaseMusRegisterFragment.this.getContext() != null) {
                        C6907h.m21524a("register_click_next_result", (Map) new C21102b().mo56946a("platform", "email").mo56944a("is_success", 0).mo56946a("error_code", "").mo56944a("is_register", 1).f56672a);
                        BaseMusRegisterFragment.this.mo57357a();
                        C21522l.m72202a(Toast.makeText(BaseMusRegisterFragment.this.getContext(), R.string.cg0, 0));
                    }
                }

                /* access modifiers changed from: private */
                /* renamed from: a */
                public void onSuccess(EmailExistBean emailExistBean) {
                    if (BaseMusRegisterFragment.this.isViewValid() && BaseMusRegisterFragment.this.getContext() != null) {
                        BaseMusRegisterFragment.this.mo57357a();
                        if (emailExistBean.getStatus_code() == 40001) {
                            C6907h.m21524a("register_click_next_result", (Map) new C21102b().mo56946a("platform", "email").mo56944a("is_success", 0).mo56944a("error_code", emailExistBean.getStatus_code()).mo56944a("is_register", 1).f56672a);
                            C10761a.m31399c(BaseMusRegisterFragment.this.getContext(), (int) R.string.cg0).mo25750a();
                            C21231d.m71459a(1, emailExistBean.getStatus_code(), emailExistBean.getStatus_msg());
                        } else if (emailExistBean.isIs_registered()) {
                            if (BaseMusRegisterFragment.this.getActivity() instanceof MusLoginActivity) {
                                ((MusLoginActivity) BaseMusRegisterFragment.this.getActivity()).f57129a = null;
                            }
                            C6907h.m21524a("register_click_next_result", (Map) new C21102b().mo56946a("platform", "email").mo56944a("is_success", 0).mo56944a("error_code", emailExistBean.getStatus_code()).mo56944a("is_register", 1).f56672a);
                            BaseMusLoginFragment baseMusLoginFragment = (BaseMusLoginFragment) C22334m.m73938a(MusLoginPhonePasswordFragment.class, BaseMusRegisterFragment.this.getArguments()).mo58756a("email", BaseMusRegisterFragment.this.f57472o.getText().toString()).mo58754a(POIService.KEY_ORDER, 1).mo58756a("enter_type", BaseMusRegisterFragment.this.f57413m).mo58754a("login_type", 1).mo58757a("from_register", true).mo58756a("enter_from", BaseMusRegisterFragment.this.f57411k).mo58753a();
                            baseMusLoginFragment.mo57501a(BaseMusRegisterFragment.this.f57409h);
                            BaseMusRegisterFragment.this.mo57503b(baseMusLoginFragment, false);
                        } else {
                            C6907h.m21524a("register_click_next_result", (Map) new C21102b().mo56946a("platform", "email").mo56944a("is_success", 1).mo56944a("is_register", 1).f56672a);
                            BaseMusLoginFragment baseMusLoginFragment2 = (BaseMusLoginFragment) C22334m.m73938a(MusSetPasswordFragment.class, BaseMusRegisterFragment.this.getArguments()).mo58756a("email", BaseMusRegisterFragment.this.f57472o.getText().toString()).mo58756a("enter_type", BaseMusRegisterFragment.this.f57413m).mo58757a("from_register", true).mo58754a("login_type", 1).mo58756a("enter_from", BaseMusRegisterFragment.this.f57411k).mo58753a();
                            baseMusLoginFragment2.mo57501a(BaseMusRegisterFragment.this.f57409h);
                            BaseMusRegisterFragment.this.mo57503b(baseMusLoginFragment2, false);
                        }
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo57533m() {
        if (this.f57464J.booleanValue()) {
            C6907h.m21524a("register_switch_email", (Map) new C21102b().f56672a);
        } else {
            this.f57464J = Boolean.valueOf(true);
        }
        this.f57459D.setVisibility(8);
        this.f57460E.setVisibility(0);
        this.f57475r.setEnabled(!TextUtils.isEmpty(this.f57472o.getText()));
        this.f57472o.requestFocus();
        mo57500a((View) this.f57472o);
        if (this.f57409h != null) {
            this.f57409h.mo57201c(1);
        }
        m71906c(false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo57534n() {
        if (this.f57464J.booleanValue()) {
            C6907h.m21524a("register_switch_phone", (Map) new C21102b().f56672a);
        } else {
            this.f57464J = Boolean.valueOf(true);
        }
        this.f57459D.setVisibility(0);
        this.f57460E.setVisibility(8);
        this.f57475r.setEnabled(!TextUtils.isEmpty(this.f57473p.getText()));
        this.f57473p.requestFocus();
        mo57500a((View) this.f57473p);
        if (this.f57409h != null) {
            this.f57409h.mo57201c(0);
        }
        m71906c(true);
    }

    /* renamed from: q */
    private void m71910q() {
        if (TextUtils.isEmpty(this.f57483z) || TextUtils.isEmpty(this.f57456A) || TextUtils.isEmpty(this.f57457B)) {
            String str = null;
            TelephonyManager telephonyManager = (TelephonyManager) getActivity().getSystemService("phone");
            if (telephonyManager != null) {
                str = telephonyManager.getSimCountryIso();
            }
            if (TextUtils.isEmpty(str)) {
                str = Locale.getDefault().getCountry();
            }
            if (!TextUtils.isEmpty(str)) {
                C17995dt it = C21566a.m72288b().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C21566a aVar = (C21566a) it.next();
                    if (aVar.f57900c.equalsIgnoreCase(str)) {
                        String str2 = aVar.f57901d;
                        if (!TextUtils.isEmpty(str2) && !str2.startsWith("+")) {
                            StringBuilder sb = new StringBuilder("+");
                            sb.append(str2);
                            str2 = sb.toString();
                        }
                        this.f57476s.setText(str2);
                        this.f57477t.setText(aVar.f57900c);
                    }
                }
            }
        } else {
            this.f57476s.setText(this.f57483z);
            this.f57477t.setText(this.f57456A);
            this.f57473p.setText(this.f57457B);
        }
        if (this.f57409h != null && !this.f57464J.booleanValue()) {
            this.f57471n.setCurrentPage(this.f57409h.mo57200c());
        }
    }

    /* renamed from: r */
    private void m71911r() {
        String str;
        String string;
        if (getContext() != null) {
            boolean b = C21247i.m71507b(this.f57476s.getText().toString());
            String string2 = getString(R.string.dly);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f57483z);
            sb.append(" ");
            sb.append(this.f57457B);
            String string3 = getString(R.string.dlv, sb.toString());
            if (b) {
                str = getString(R.string.dlx);
            } else {
                str = getString(R.string.dlw);
            }
            if (b) {
                string = getString(R.string.dlw);
            } else {
                string = getString(R.string.dlx);
            }
            String str2 = string;
            String str3 = this.f57413m;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(this.f57483z);
            sb2.append(" ");
            sb2.append(this.f57457B);
            C22158b bVar = new C22158b(string2, string3, str, str2, str3, sb2.toString());
            this.f57466L = new C22156a(getContext(), bVar);
            this.f57466L.f59195a = new C21519i(this);
            this.f57466L.f59196b = new C21520j(this, b);
            this.f57466L.f59197c = new C21521k(this, b);
            C42951au.m136342a(this.f57466L);
        }
    }

    /* renamed from: l */
    public final void mo57532l() {
        C6907h.m21524a("register_click_next", (Map) new C21102b().mo56946a("platform", "phone").f56672a);
        if (C21247i.m71506a(this.f57476s.getText().toString())) {
            m71911r();
        } else if (m71912s()) {
            BaseMusLoginFragment baseMusLoginFragment = (BaseMusLoginFragment) C22334m.m73938a(MusSendCodeFragment.class, getArguments()).mo58756a("country_code_alpha_2", this.f57477t.getText().toString()).mo58756a("country_code", this.f57476s.getText().toString()).mo58756a("phone_number", this.f57473p.getText().toString()).mo58757a("from_register", true).mo58757a("use_whatsapp_code", C21247i.m71510e(m71913t())).mo58753a();
            baseMusLoginFragment.mo57501a(this.f57409h);
            mo57503b(baseMusLoginFragment, false);
        } else {
            m71905a(false, true);
        }
    }

    /* renamed from: e */
    private void m71909e(boolean z) {
        String str;
        if (z) {
            str = "phone_verification_click_whatsapp";
        } else {
            str = "phone_verification_click_sms";
        }
        C6907h.m21524a(str, (Map) new C21102b().mo56946a("enter_type", this.f57413m).f56672a);
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f57465K = new C21586a(this, this.f57412l);
        this.f57465K.mo57772a();
        this.f57464J = Boolean.valueOf(false);
    }

    public void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        if (!(bundle == null || this.f57471n.getCurrentPage() != 0 || C21170a.m71336a() == null)) {
            mo57095a(C21170a.m71336a());
        }
    }

    /* renamed from: a */
    public final void mo57095a(C21566a aVar) {
        if (aVar != null) {
            String str = aVar.f57901d;
            if (!TextUtils.isEmpty(str) && !str.startsWith("+")) {
                StringBuilder sb = new StringBuilder("+");
                sb.append(str);
                str = sb.toString();
            }
            this.f57476s.setText(str);
            this.f57477t.setText(aVar.f57900c);
        }
    }

    /* renamed from: c */
    private void m71906c(boolean z) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder sb = new StringBuilder();
        sb.append(C23481i.m77091b(R.string.cf0));
        sb.append(" ");
        String sb2 = sb.toString();
        String b = C23481i.m77091b(R.string.cf1);
        StringBuilder sb3 = new StringBuilder(" ");
        sb3.append(C23481i.m77091b(R.string.cf2));
        sb3.append(" ");
        String sb4 = sb3.toString();
        String b2 = C23481i.m77091b(R.string.cf3);
        spannableStringBuilder.append(sb2).append(b);
        spannableStringBuilder.append(sb4).append(b2);
        if (z) {
            spannableStringBuilder.append(" ").append(C23481i.m77091b(R.string.cfu));
        }
        int color = getContext().getResources().getColor(R.color.lj);
        int color2 = getContext().getResources().getColor(R.color.y3);
        spannableStringBuilder.setSpan(new C22367e(color, color2) {
            public final void onClick(View view) {
                BaseMusRegisterFragment.this.mo57531k();
            }
        }, sb2.length(), sb2.length() + b.length(), 34);
        spannableStringBuilder.setSpan(new C22367e(color, color2) {
            public final void onClick(View view) {
                BaseMusRegisterFragment.this.mo57530j();
            }
        }, sb2.length() + b.length() + sb4.length(), sb2.length() + b.length() + sb4.length() + b2.length(), 34);
        this.f57461F.setHighlightColor(C23481i.m77088a(17170445));
        this.f57461F.setText(spannableStringBuilder);
        this.f57461F.setMovementMethod(C22364b.m74059a());
    }

    /* renamed from: d */
    private void m71908d(boolean z) {
        if (m71912s()) {
            if ((!C21247i.m71510e(m71913t()) || !z) && (C21247i.m71510e(m71913t()) || z)) {
                this.f57458C = true;
            } else {
                BaseMusLoginFragment baseMusLoginFragment = (BaseMusLoginFragment) C22334m.m73938a(MusSendCodeFragment.class, getArguments()).mo58756a("country_code_alpha_2", this.f57477t.getText().toString()).mo58756a("country_code", this.f57476s.getText().toString()).mo58756a("phone_number", this.f57473p.getText().toString()).mo58757a("from_register", true).mo58757a("use_whatsapp_code", C21247i.m71510e(m71913t())).mo58757a("from_choose_dialog", true).mo58753a();
                baseMusLoginFragment.mo57501a(this.f57409h);
                mo57503b(baseMusLoginFragment, false);
                C42951au.m136343b(this.f57466L);
                m71909e(z);
            }
        }
        m71905a(z, false);
        C42951au.m136343b(this.f57466L);
        m71909e(z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo57505b(boolean z) {
        if (this.f57470P == 0) {
            this.f57470P = this.f57471n.getBottom() - this.f57406e.getBottom();
        }
        if (this.f57469O == 0) {
            this.f57469O = this.f57471n.getTop() - this.f57406e.getBottom();
        }
        if (!z) {
            this.f57482y.animate().alpha(0.0f).setDuration(110).start();
            this.f57471n.animate().translationY(0.0f).alpha(1.0f).setStartDelay(110).setDuration(220).start();
            this.f57463H.animate().translationY(0.0f).setStartDelay(110).setDuration(220).start();
        } else if (this.f57475r.getTop() - this.f57463H.getBottom() <= f57404i) {
            this.f57482y.animate().alpha(1.0f).setDuration(110).setStartDelay(110).start();
            this.f57471n.animate().translationY((float) (-this.f57469O)).alpha(0.0f).setDuration(220).start();
            this.f57463H.animate().translationY((float) (-this.f57470P)).setDuration(220).start();
        }
    }

    /* renamed from: d */
    private void m71907d(View view) {
        this.f57471n = (MusRegisterTabLayout) view.findViewById(R.id.dfo);
        this.f57459D = (ViewGroup) view.findViewById(R.id.cb2);
        this.f57472o = (EditText) view.findViewById(R.id.ag0);
        this.f57473p = (EditText) view.findViewById(R.id.age);
        this.f57474q = view.findViewById(R.id.agp);
        this.f57475r = (LoginButton) view.findViewById(R.id.qm);
        this.f57475r.setLoginBackgroundRes(R.drawable.baw);
        this.f57475r.setLoadingBackground(R.drawable.bba);
        this.f57461F = (TextView) view.findViewById(R.id.dh4);
        this.f57476s = (TextView) view.findViewById(R.id.a3u);
        this.f57462G = (PressFadeLinearLayout) view.findViewById(R.id.a3r);
        this.f57477t = (TextView) view.findViewById(R.id.a3s);
        this.f57478u = view.findViewById(R.id.ehn);
        this.f57479v = (TextView) view.findViewById(R.id.ehm);
        this.f57460E = (ViewGroup) view.findViewById(R.id.adt);
        this.f57480w = (ImageView) view.findViewById(R.id.wo);
        this.f57481x = (ImageView) view.findViewById(R.id.ww);
        this.f57463H = view.findViewById(R.id.a24);
        this.f57482y = (MusRegisterTabLayout) view.findViewById(R.id.f124316dmt);
        this.f57482y.setVisibility(0);
        this.f57471n.setVisibility(0);
        this.f57462G.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                BaseMusRegisterFragment.this.getActivity().startActivity(new Intent(BaseMusRegisterFragment.this.getActivity(), MusCountryListActivity.class));
            }
        });
        this.f57471n.setListener(new C21840a() {
            /* renamed from: a */
            public final void mo57538a() {
                BaseMusRegisterFragment.this.f57482y.setCurrentPageWithoutClick(0);
                BaseMusRegisterFragment.this.mo57534n();
            }

            /* renamed from: b */
            public final void mo57539b() {
                BaseMusRegisterFragment.this.f57482y.setCurrentPageWithoutClick(1);
                BaseMusRegisterFragment.this.mo57533m();
            }
        });
        this.f57482y.setListener(new C21840a() {
            /* renamed from: a */
            public final void mo57538a() {
                BaseMusRegisterFragment.this.f57471n.setCurrentPageWithoutClick(0);
                BaseMusRegisterFragment.this.mo57534n();
            }

            /* renamed from: b */
            public final void mo57539b() {
                BaseMusRegisterFragment.this.f57471n.setCurrentPageWithoutClick(1);
                BaseMusRegisterFragment.this.mo57533m();
            }
        });
        this.f57473p.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                int i;
                if (BaseMusRegisterFragment.this.f57471n.getCurrentPage() == 0) {
                    BaseMusRegisterFragment.this.f57475r.setEnabled(!TextUtils.isEmpty(BaseMusRegisterFragment.this.f57473p.getText()));
                    ImageView imageView = BaseMusRegisterFragment.this.f57481x;
                    if (!BaseMusRegisterFragment.this.f57473p.hasFocus() || TextUtils.isEmpty(editable.toString())) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    imageView.setVisibility(i);
                    if (TextUtils.isEmpty(editable.toString())) {
                        BaseMusRegisterFragment.this.f57478u.setVisibility(8);
                        BaseMusRegisterFragment.this.f57474q.setBackgroundColor(BaseMusRegisterFragment.this.getResources().getColor(R.color.le));
                    }
                }
            }
        });
        this.f57473p.setOnFocusChangeListener(this.f57468N);
        this.f57472o.addTextChangedListener(new TextWatcher() {
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            public final void afterTextChanged(Editable editable) {
                int i;
                if (BaseMusRegisterFragment.this.f57471n.getCurrentPage() == 1) {
                    BaseMusRegisterFragment.this.f57475r.setEnabled(C21638v.m72448b(BaseMusRegisterFragment.this.f57472o.getText().toString()));
                    ImageView imageView = BaseMusRegisterFragment.this.f57480w;
                    if (!BaseMusRegisterFragment.this.f57472o.hasFocus() || TextUtils.isEmpty(editable.toString())) {
                        i = 8;
                    } else {
                        i = 0;
                    }
                    imageView.setVisibility(i);
                    if (TextUtils.isEmpty(editable.toString())) {
                        BaseMusRegisterFragment.this.f57478u.setVisibility(8);
                        BaseMusRegisterFragment.this.f57474q.setBackgroundColor(BaseMusRegisterFragment.this.getResources().getColor(R.color.le));
                    }
                }
            }
        });
        this.f57472o.setOnFocusChangeListener(this.f57468N);
        this.f57475r.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (BaseMusRegisterFragment.this.f57471n.getCurrentPage() == 1) {
                    BaseMusRegisterFragment.this.mo57356Z_();
                    BaseMusRegisterFragment.this.mo57529i();
                    return;
                }
                if (BaseMusRegisterFragment.this.f57471n.getCurrentPage() == 0) {
                    BaseMusRegisterFragment.this.f57483z = BaseMusRegisterFragment.this.f57476s.getText().toString();
                    BaseMusRegisterFragment.this.f57456A = BaseMusRegisterFragment.this.f57477t.getText().toString();
                    BaseMusRegisterFragment.this.f57457B = BaseMusRegisterFragment.this.f57473p.getText().toString();
                    BaseMusRegisterFragment.this.mo57532l();
                }
            }
        });
        this.f57480w.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                BaseMusRegisterFragment.this.f57472o.setText("");
                BaseMusRegisterFragment.this.f57480w.setVisibility(8);
            }
        });
        this.f57481x.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                BaseMusRegisterFragment.this.f57473p.setText("");
                BaseMusRegisterFragment.this.f57481x.setVisibility(8);
            }
        });
        this.f57475r.postDelayed(new C21518h(this), 100);
        if (TextUtils.equals(getArguments().getString("login_register_type", "mobile"), "email")) {
            this.f57471n.setCurrentPageWithoutClick(1);
            mo57533m();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo57528b(boolean z, View view) {
        m71908d(z);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo57527a(boolean z, View view) {
        m71908d(!z);
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f57467M = C12798d.m37186a(getActivity());
        C21170a.m71338a((C21171a) this);
        m71907d(view);
        if (bundle == null) {
            m71910q();
        }
    }

    /* renamed from: a */
    private void m71905a(final boolean z, final boolean z2) {
        String str;
        String str2;
        mo57356Z_();
        if (z) {
            str = "send_whatsapp_code";
        } else {
            str = "send_sms";
        }
        C21102b bVar = new C21102b();
        String str3 = "send_method";
        if (z2) {
            str2 = "auto_system";
        } else {
            str2 = "user_click";
        }
        C6907h.m21524a(str, (Map) bVar.mo56946a(str3, str2).mo56944a("send_reason", C21169e.f56936u).mo56946a("enter_method", this.f57412l).mo56946a("enter_from", this.f57411k).f56672a);
        C214017 r10 = new C21348y(this) {
            /* renamed from: c */
            public final void onNeedSecureCaptcha(C12710e<C12836s> eVar) {
                super.onNeedSecureCaptcha(eVar);
                if (z) {
                    C21235f.m71485b(1, C21169e.f56936u, eVar.f33702b, eVar.f33703c);
                } else if (z2) {
                    C21235f.m71483a(1, C21169e.f56936u, eVar.f33702b, eVar.f33703c);
                } else {
                    C21235f.m71484a(1, C21169e.f56936u, eVar.f33702b, eVar.f33703c, "choose_dialog");
                }
                if (BaseMusRegisterFragment.this.isViewValid()) {
                    BaseMusRegisterFragment.this.mo57357a();
                    C6907h.m21524a("register_click_next_result", (Map) new C21102b().mo56946a("platform", "phone").mo56944a("is_success", 0).mo56944a("error_code", eVar.f33702b).mo56946a("error_desc", eVar.f33703c).mo56944a("is_register", 1).f56672a);
                    BaseMusRegisterFragment.this.f57458C = false;
                }
            }

            /* renamed from: b */
            public final void mo57366b(C12710e<C12836s> eVar) {
                if (z) {
                    C21235f.m71485b(1, C21169e.f56936u, eVar.f33702b, eVar.f33703c);
                } else if (z2) {
                    C21235f.m71483a(1, C21169e.f56936u, eVar.f33702b, eVar.f33703c);
                } else {
                    C21235f.m71484a(1, C21169e.f56936u, eVar.f33702b, eVar.f33703c, "choose_dialog");
                }
                if (BaseMusRegisterFragment.this.isViewValid() && BaseMusRegisterFragment.this.getContext() != null) {
                    C6907h.m21524a("register_click_next_result", (Map) new C21102b().mo56946a("platform", "phone").mo56944a("is_success", 0).mo56944a("error_code", eVar.f33702b).mo56946a("error_desc", eVar.f33703c).mo56944a("is_register", 1).f56672a);
                    if (eVar.f33702b == 1002 || eVar.f33702b == 1003) {
                        BaseMusRegisterFragment.this.f57478u.setVisibility(0);
                        BaseMusRegisterFragment.this.f57479v.setText(R.string.cdl);
                        BaseMusRegisterFragment.this.f57474q.setBackgroundColor(BaseMusRegisterFragment.this.getResources().getColor(R.color.a14));
                    } else if (eVar.f33702b == 1001) {
                        C10761a.m31399c((Context) C21671bd.m72532b(), (int) R.string.ctp).mo25750a();
                    } else {
                        C10761a.m31403c((Context) C21671bd.m72532b(), C22338o.m73945a((C12707b) eVar)).mo25750a();
                    }
                    BaseMusRegisterFragment.this.mo57357a();
                    BaseMusRegisterFragment.this.f57458C = false;
                }
            }

            public final void onSuccess(C12710e<C12836s> eVar) {
                if (z) {
                    C21235f.m71485b(0, C21169e.f56936u, 0, "");
                } else if (z2) {
                    C21235f.m71483a(0, C21169e.f56936u, 0, "");
                } else {
                    C21235f.m71484a(0, C21169e.f56936u, 0, "", "choose_dialog");
                }
                if (BaseMusRegisterFragment.this.isViewValid() && BaseMusRegisterFragment.this.getContext() != null) {
                    BaseMusRegisterFragment.this.mo57357a();
                    BaseMusRegisterFragment.this.f57478u.setVisibility(8);
                    BaseMusRegisterFragment.this.f57474q.setBackgroundColor(BaseMusRegisterFragment.this.getResources().getColor(R.color.a7s));
                    BaseMusLoginFragment baseMusLoginFragment = (BaseMusLoginFragment) C22334m.m73938a(MusSendCodeFragment.class, BaseMusRegisterFragment.this.getArguments()).mo58756a("country_code_alpha_2", BaseMusRegisterFragment.this.f57477t.getText().toString()).mo58756a("country_code", BaseMusRegisterFragment.this.f57476s.getText().toString()).mo58756a("phone_number", BaseMusRegisterFragment.this.f57473p.getText().toString()).mo58755a("sms_have_send_time", 60).mo58757a("from_register", true).mo58757a("use_whatsapp_code", z).mo58757a("from_choose_dialog", !z2).mo58757a("reset_ticker", BaseMusRegisterFragment.this.f57458C).mo58753a();
                    if (baseMusLoginFragment != null) {
                        C6907h.m21524a("register_click_next_result", (Map) new C21102b().mo56946a("platform", "phone").mo56944a("is_success", 1).mo56944a("is_register", 1).f56672a);
                    }
                    baseMusLoginFragment.mo57501a(BaseMusRegisterFragment.this.f57409h);
                    BaseMusRegisterFragment.this.mo57503b(baseMusLoginFragment, false);
                    BaseMusRegisterFragment.this.f57458C = false;
                }
            }

            /* renamed from: a */
            public final void onNeedCaptcha(C12710e<C12836s> eVar, String str) {
                if (BaseMusRegisterFragment.this.isViewValid() && BaseMusRegisterFragment.this.getContext() != null) {
                    BaseMusRegisterFragment.this.mo57357a();
                    BaseMusRegisterFragment.this.f57478u.setVisibility(8);
                    BaseMusRegisterFragment.this.f57474q.setBackgroundColor(BaseMusRegisterFragment.this.getResources().getColor(R.color.a7s));
                    BaseMusLoginFragment baseMusLoginFragment = (BaseMusLoginFragment) C22334m.m73938a(MusSendCodeFragment.class, BaseMusRegisterFragment.this.getArguments()).mo58756a("country_code_alpha_2", BaseMusRegisterFragment.this.f57477t.getText().toString()).mo58756a("country_code", BaseMusRegisterFragment.this.f57476s.getText().toString()).mo58756a("phone_number", BaseMusRegisterFragment.this.f57473p.getText().toString()).mo58757a("from_register", true).mo58757a("reset_ticker", BaseMusRegisterFragment.this.f57458C).mo58753a();
                    if (baseMusLoginFragment != null) {
                        C6907h.m21524a("register_click_next_result", (Map) new C21102b().mo56946a("platform", "phone").mo56944a("is_success", 1).mo56944a("is_register", 1).f56672a);
                    }
                    baseMusLoginFragment.mo57501a(BaseMusRegisterFragment.this.f57409h);
                    BaseMusRegisterFragment.this.mo57503b(baseMusLoginFragment, false);
                    BaseMusRegisterFragment.this.f57458C = false;
                }
            }
        };
        if (z) {
            FragmentActivity activity = getActivity();
            StringBuilder sb = new StringBuilder();
            sb.append(this.f57476s.getText().toString());
            sb.append(this.f57473p.getText().toString());
            C21112b.m71186a(activity, sb.toString(), "", C21169e.f56936u, 0, "", 0, C21241d.m71496a() ? 1 : 0, r10).mo31357d();
            return;
        }
        C12728d dVar = this.f57467M;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f57476s.getText().toString());
        sb2.append(this.f57473p.getText().toString());
        dVar.mo31184a(sb2.toString(), "", C21169e.f56936u, 0, "", 0, C21241d.m71496a() ? 1 : 0, (C12855p) r10);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f57465K != null) {
            this.f57465K.mo57773a(i, i2, intent);
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.aei, viewGroup, false);
    }
}
