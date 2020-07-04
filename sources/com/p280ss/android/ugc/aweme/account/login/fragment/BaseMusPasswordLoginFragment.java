package com.p280ss.android.ugc.aweme.account.login.fragment;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnFocusChangeListener;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12833p;
import com.bytedance.sdk.account.p662f.p663a.C12837t;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12852m;
import com.bytedance.sdk.account.p662f.p664b.p665a.C12857r;
import com.bytedance.sdk.account.p668i.C12898b;
import com.p280ss.android.account.C18892b.C18893a;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.C21169e;
import com.p280ss.android.ugc.aweme.account.login.C21537g;
import com.p280ss.android.ugc.aweme.account.login.C21578r;
import com.p280ss.android.ugc.aweme.account.login.C21579s;
import com.p280ss.android.ugc.aweme.account.login.C21642z;
import com.p280ss.android.ugc.aweme.account.login.forgetpsw.p961ui.FindPswByEmailActivity;
import com.p280ss.android.ugc.aweme.account.login.model.AccountPassLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p280ss.android.ugc.aweme.account.login.p957c.C21353b;
import com.p280ss.android.ugc.aweme.account.login.p957c.C21358g;
import com.p280ss.android.ugc.aweme.account.login.p974ui.InputCaptchaFragment.C21823a;
import com.p280ss.android.ugc.aweme.account.login.p974ui.LoginButton;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p946i.C21220e;
import com.p280ss.android.ugc.aweme.account.p946i.C21221f;
import com.p280ss.android.ugc.aweme.account.p946i.C21222g;
import com.p280ss.android.ugc.aweme.account.p950k.C21231d;
import com.p280ss.android.ugc.aweme.account.util.C22334m;
import com.p280ss.android.ugc.aweme.account.util.C22334m.C22336a;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.p1416n.C34032a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.poi.services.POIService;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.BaseMusPasswordLoginFragment */
public class BaseMusPasswordLoginFragment extends BaseMusLoginFragment implements TextWatcher, OnClickListener, C21353b, C21642z {

    /* renamed from: x */
    private static final boolean f57425x = C7163a.m22363a();

    /* renamed from: A */
    private View f57426A;

    /* renamed from: B */
    private View f57427B;

    /* renamed from: C */
    private View f57428C;

    /* renamed from: D */
    private View f57429D;

    /* renamed from: E */
    private View f57430E;

    /* renamed from: F */
    private View f57431F;

    /* renamed from: G */
    private View f57432G;

    /* renamed from: H */
    private View f57433H;

    /* renamed from: J */
    private TextView f57434J;

    /* renamed from: K */
    private C21358g f57435K;

    /* renamed from: L */
    private boolean f57436L = true;

    /* renamed from: M */
    private OnFocusChangeListener f57437M = new OnFocusChangeListener() {
        public final void onFocusChange(View view, boolean z) {
            int i = 0;
            if (view.getId() == R.id.ag2) {
                ImageView imageView = BaseMusPasswordLoginFragment.this.f57443q;
                if (!z || TextUtils.isEmpty(BaseMusPasswordLoginFragment.this.f57441o.getText())) {
                    i = 8;
                }
                imageView.setVisibility(i);
                return;
            }
            if (view.getId() == R.id.agg) {
                ImageView imageView2 = BaseMusPasswordLoginFragment.this.f57444r;
                if (!z || TextUtils.isEmpty(BaseMusPasswordLoginFragment.this.f57442p.getText())) {
                    i = 8;
                }
                imageView2.setVisibility(i);
            }
        }
    };

    /* renamed from: N */
    private int f57438N = 0;

    /* renamed from: O */
    private int f57439O = 0;

    /* renamed from: n */
    public LoginButton f57440n;

    /* renamed from: o */
    public EditText f57441o;

    /* renamed from: p */
    public EditText f57442p;

    /* renamed from: q */
    public ImageView f57443q;

    /* renamed from: r */
    public ImageView f57444r;

    /* renamed from: s */
    public C21388b f57445s = new C21388b();

    /* renamed from: t */
    public String f57446t = "";

    /* renamed from: u */
    public String f57447u;

    /* renamed from: v */
    public String f57448v;

    /* renamed from: w */
    public C21386a f57449w;

    /* renamed from: y */
    private View f57450y;

    /* renamed from: z */
    private View f57451z;

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.BaseMusPasswordLoginFragment$a */
    class C21386a implements C21823a {
        /* renamed from: a */
        public final void mo57346a() {
            if (BaseMusPasswordLoginFragment.this.isViewValid() && BaseMusPasswordLoginFragment.this.getContext() != null) {
                BaseMusPasswordLoginFragment.this.mo57355c();
                BaseMusPasswordLoginFragment.this.mo57509e().mo57208a(C21169e.f56922g, (C12852m) new C12852m() {
                    public final void onSuccess(C12710e<C12833p> eVar) {
                        if (BaseMusPasswordLoginFragment.this.isViewValid() && BaseMusPasswordLoginFragment.this.getContext() != null) {
                            C21386a.this.mo57526a(eVar);
                        }
                    }

                    public final void onError(C12710e<C12833p> eVar, int i) {
                        if (BaseMusPasswordLoginFragment.this.isViewValid() && BaseMusPasswordLoginFragment.this.getContext() != null) {
                            C21386a.this.mo57526a(eVar);
                        }
                    }
                });
            }
        }

        private C21386a() {
        }

        /* renamed from: a */
        public final void mo57526a(C12710e<C12833p> eVar) {
            JSONObject jSONObject;
            JSONObject jSONObject2;
            if (eVar.f33709g != null) {
                jSONObject = ((C12833p) eVar.f33709g).f33964l;
            } else {
                jSONObject = null;
            }
            if (jSONObject != null) {
                jSONObject2 = jSONObject.optJSONObject("data");
            } else {
                jSONObject2 = null;
            }
            if (jSONObject2 != null) {
                String optString = jSONObject2.optString("captcha");
                if (!TextUtils.isEmpty(optString)) {
                    BaseMusPasswordLoginFragment.this.mo57354a(optString, null, C21169e.f56922g, BaseMusPasswordLoginFragment.this.f57449w);
                }
            }
        }

        /* renamed from: a */
        public final void mo57347a(String str, int i) {
            if (BaseMusPasswordLoginFragment.this.isViewValid() && BaseMusPasswordLoginFragment.this.getContext() != null) {
                BaseMusPasswordLoginFragment.this.mo57355c();
                BaseMusPasswordLoginFragment.this.f57440n.mo57356Z_();
                if ("email".equals(BaseMusPasswordLoginFragment.this.f57446t)) {
                    BaseMusPasswordLoginFragment.this.mo57509e().mo57219b(BaseMusPasswordLoginFragment.this.f57447u, BaseMusPasswordLoginFragment.this.f57448v, str, BaseMusPasswordLoginFragment.this.f57445s);
                    return;
                }
                if ("username".equals(BaseMusPasswordLoginFragment.this.f57446t)) {
                    BaseMusPasswordLoginFragment.this.mo57509e().mo57215a(BaseMusPasswordLoginFragment.this.f57447u, BaseMusPasswordLoginFragment.this.f57448v, str, (C12857r) BaseMusPasswordLoginFragment.this.f57445s);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.fragment.BaseMusPasswordLoginFragment$b */
    class C21388b extends C12857r {
        private C21388b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void onNeedSecureCaptcha(C12710e<C12837t> eVar) {
            super.onNeedSecureCaptcha(eVar);
            if (BaseMusPasswordLoginFragment.this.isViewValid()) {
                BaseMusPasswordLoginFragment.this.f57440n.mo57357a();
            }
        }

        public final void onSuccess(C12710e<C12837t> eVar) {
            if (BaseMusPasswordLoginFragment.this.isViewValid()) {
                BaseMusPasswordLoginFragment.this.f57440n.mo57357a();
                BaseMusPasswordLoginFragment.this.mo57519a(((C12837t) eVar.f33709g).f33964l);
                new C21222g().mo57149b("email").mo57148a("1").mo57141b();
            }
        }

        public final void onError(C12710e<C12837t> eVar, int i) {
            JSONObject jSONObject;
            String str;
            String str2;
            String str3;
            String str4;
            String str5;
            if (BaseMusPasswordLoginFragment.this.isViewValid()) {
                BaseMusPasswordLoginFragment.this.f57440n.mo57357a();
                JSONObject jSONObject2 = null;
                if (eVar.f33709g != null) {
                    jSONObject = ((C12837t) eVar.f33709g).f33964l;
                } else {
                    jSONObject = null;
                }
                if (jSONObject != null) {
                    jSONObject2 = jSONObject.optJSONObject("data");
                }
                if (jSONObject2 != null) {
                    String optString = jSONObject2.optString("captcha");
                    if (!TextUtils.isEmpty(optString)) {
                        BaseMusPasswordLoginFragment.this.mo57354a(optString, eVar.f33703c, C21169e.f56922g, BaseMusPasswordLoginFragment.this.f57449w);
                        return;
                    }
                }
                if (i > 0) {
                    C21231d.m71459a(1, eVar.f33702b, eVar.f33703c);
                    if ("email".equals(BaseMusPasswordLoginFragment.this.f57446t)) {
                        C6907h.m21524a("login_failure", (Map) new C21102b().mo56946a("enter_method", BaseMusPasswordLoginFragment.this.f57412l).mo56946a("platform", "email").mo56946a("enter_type", BaseMusPasswordLoginFragment.this.f57413m).mo56946a("carrier", "").mo56944a("error_code", eVar.f33702b).f56672a);
                    } else if ("username".equals(BaseMusPasswordLoginFragment.this.f57446t)) {
                        C6907h.m21524a("login_failure", (Map) new C21102b().mo56946a("enter_method", BaseMusPasswordLoginFragment.this.f57412l).mo56946a("platform", "handle").mo56946a("enter_type", BaseMusPasswordLoginFragment.this.f57413m).mo56946a("carrier", "").mo56944a("error_code", eVar.f33702b).f56672a);
                    }
                    if (!C21578r.f57916d.contains(Integer.valueOf(eVar.f33702b))) {
                        BaseMusPasswordLoginFragment baseMusPasswordLoginFragment = BaseMusPasswordLoginFragment.this;
                        int i2 = eVar.f33702b;
                        String str6 = eVar.f33703c;
                        if (jSONObject2 != null) {
                            str3 = jSONObject2.optString("mobile");
                        } else {
                            str3 = "";
                        }
                        String str7 = str3;
                        if (jSONObject2 != null) {
                            str4 = jSONObject2.optString("shark_ticket");
                        } else {
                            str4 = "";
                        }
                        String str8 = str4;
                        if (jSONObject2 != null) {
                            str5 = jSONObject2.optString("platform");
                        } else {
                            str5 = "";
                        }
                        baseMusPasswordLoginFragment.mo57518a(i2, str6, str7, str8, str5);
                    }
                    new C21222g().mo57149b("email").mo57148a("0").mo57150c(String.valueOf(eVar.f33702b)).mo57151d("/passport/user/login/").mo57141b();
                    C21537g.m72219a(0, BaseMusPasswordLoginFragment.this.f57446t, eVar.f33702b, eVar.f33703c);
                    return;
                }
                if (eVar != null) {
                    str = eVar.f33703c;
                } else {
                    str = "";
                }
                C21231d.m71459a(1, -10000, str);
                C21517g.m72200a(Toast.makeText(BaseMusPasswordLoginFragment.this.getContext(), R.string.cg0, 0));
                String str9 = BaseMusPasswordLoginFragment.this.f57446t;
                if (eVar.f33703c != null) {
                    str2 = eVar.f33703c;
                } else {
                    str2 = "";
                }
                C21537g.m72219a(0, str9, -1, str2);
                new C21222g().mo57149b("email").mo57148a("0").mo57150c("-1000").mo57151d("/passport/user/login/").mo57141b();
            }
        }
    }

    public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo57522i() {
        KeyboardUtils.m77055a(this.f57441o);
    }

    /* renamed from: j */
    private void m71891j() {
        this.f57435K = new C21358g();
        this.f57435K.mo57444a(this);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f57435K != null) {
            this.f57435K.mo57446c();
        }
    }

    public void onPause() {
        super.onPause();
        KeyboardUtils.m77057c(this.f57441o);
    }

    public void onStart() {
        super.onStart();
        this.f57441o.postDelayed(new C21516f(this), 500);
    }

    /* renamed from: X_ */
    public final boolean mo57516X_() {
        if (getArguments() == null || !this.f57436L || C21671bd.m72539g()) {
            return false;
        }
        int i = getArguments().getInt("init_page", 0);
        if (i == 8 || i == 9) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo57517a() {
        Intent intent = new Intent(getActivity(), FindPswByEmailActivity.class);
        if (getArguments() != null) {
            intent.putExtras(getArguments());
        }
        intent.putExtra("forget_psw_from_tt_email", true);
        startActivityForResult(intent, PreloadTask.BYTE_UNIT_NUMBER);
    }

    /* renamed from: h */
    public final void mo57440h() {
        if (getContext() != null) {
            InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
            if (inputMethodManager != null) {
                inputMethodManager.hideSoftInputFromWindow(this.f57441o.getWindowToken(), 0);
                inputMethodManager.hideSoftInputFromWindow(this.f57442p.getWindowToken(), 0);
            }
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f57449w = new C21386a();
    }

    /* renamed from: b */
    public final void mo57439b(int i) {
        this.f57431F.setBackgroundColor(getResources().getColor(R.color.a14));
        this.f57433H.setVisibility(0);
        this.f57434J.setText(R.string.ccg);
    }

    public void afterTextChanged(Editable editable) {
        boolean z;
        int i;
        LoginButton loginButton = this.f57440n;
        int i2 = 0;
        if (TextUtils.isEmpty(this.f57441o.getText()) || TextUtils.isEmpty(this.f57442p.getText())) {
            z = false;
        } else {
            z = true;
        }
        loginButton.setEnabled(z);
        ImageView imageView = this.f57444r;
        if (!this.f57442p.hasFocus() || TextUtils.isEmpty(this.f57442p.getText())) {
            i = 8;
        } else {
            i = 0;
        }
        imageView.setVisibility(i);
        ImageView imageView2 = this.f57443q;
        if (!this.f57441o.hasFocus() || TextUtils.isEmpty(this.f57441o.getText())) {
            i2 = 8;
        }
        imageView2.setVisibility(i2);
        if (TextUtils.isEmpty(this.f57441o.getText()) && TextUtils.isEmpty(this.f57442p.getText())) {
            this.f57433H.setVisibility(8);
            this.f57431F.setBackgroundColor(getResources().getColor(R.color.le));
            this.f57432G.setBackgroundColor(getResources().getColor(R.color.le));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo57505b(boolean z) {
        int i;
        if (this.f57439O == 0) {
            if (getContext() != null) {
                i = (int) C9738o.m28708b(getContext(), 30.0f);
            } else {
                i = 0;
            }
            this.f57439O = (this.f57427B.getBottom() - this.f57450y.getBottom()) + i;
        }
        if (this.f57438N == 0) {
            this.f57438N = this.f57427B.getTop() - this.f57450y.getBottom();
        }
        if (!z) {
            this.f57451z.animate().alpha(0.0f).setDuration(110).start();
            this.f57426A.animate().alpha(0.0f).setDuration(110).start();
            this.f57427B.animate().translationY(0.0f).alpha(1.0f).setStartDelay(110).setDuration(220).start();
            this.f57430E.animate().translationY(0.0f).setStartDelay(110).setDuration(220).start();
        } else if (this.f57440n.getTop() - this.f57430E.getBottom() <= f57404i) {
            this.f57451z.animate().alpha(1.0f).setDuration(110).setStartDelay(110).start();
            this.f57426A.animate().alpha(1.0f).setDuration(110).setStartDelay(110).start();
            this.f57427B.animate().translationY((float) (-this.f57438N)).alpha(0.0f).setDuration(220).start();
            this.f57430E.animate().translationY((float) (-this.f57439O)).setDuration(220).start();
        }
    }

    public void onClick(View view) {
        boolean z;
        ClickInstrumentation.onClick(view);
        if (view == this.f57450y) {
            if (getActivity() != null) {
                getActivity().onBackPressed();
            }
        } else if (view == this.f57440n) {
            this.f57440n.setEnabled(false);
            new C21221f().mo57145a(this.f57411k).mo57146b("email").mo57141b();
            this.f57435K.mo57445a(this.f57441o.getText().toString(), this.f57442p.getText().toString());
        } else if (view == this.f57428C) {
            mo57517a();
        } else if (view == this.f57429D) {
            C22336a a = C22334m.m73938a(MusInputPhoneFragment.class, getArguments());
            String str = "need_auto_fill_phone_number";
            if (getArguments() == null || getArguments().getBoolean("need_auto_fill_latest_login_info", true)) {
                z = true;
            } else {
                z = false;
            }
            BaseMusLoginFragment baseMusLoginFragment = (BaseMusLoginFragment) a.mo58757a(str, z).mo58754a(POIService.KEY_ORDER, 0).mo58756a("enter_type", this.f57413m).mo58753a();
            if (baseMusLoginFragment != null) {
                C6907h.m21524a("switch_to_phone", (Map) null);
            }
            baseMusLoginFragment.mo57501a(this.f57409h);
            mo57503b(baseMusLoginFragment, true);
        } else if (view == this.f57444r) {
            this.f57444r.setVisibility(8);
            this.f57442p.setText("");
        } else if (view == this.f57443q) {
            this.f57443q.setVisibility(8);
            this.f57441o.setText("");
        }
    }

    /* renamed from: d */
    private void m71890d(View view) {
        this.f57450y = view.findViewById(R.id.b6a);
        this.f57451z = view.findViewById(R.id.e3f);
        this.f57426A = view.findViewById(R.id.dkp);
        this.f57427B = view.findViewById(R.id.dw8);
        this.f57440n = (LoginButton) view.findViewById(R.id.qm);
        this.f57428C = view.findViewById(R.id.duv);
        this.f57441o = (EditText) view.findViewById(R.id.ag2);
        this.f57442p = (EditText) view.findViewById(R.id.agg);
        this.f57431F = view.findViewById(R.id.ag3);
        this.f57432G = view.findViewById(R.id.agj);
        this.f57433H = view.findViewById(R.id.ehn);
        this.f57434J = (TextView) view.findViewById(R.id.ehm);
        this.f57443q = (ImageView) view.findViewById(R.id.wq);
        this.f57444r = (ImageView) view.findViewById(R.id.wx);
        this.f57430E = view.findViewById(R.id.a24);
        this.f57429D = view.findViewById(R.id.qs);
        this.f57429D.setOnClickListener(this);
        this.f57429D.setOnTouchListener(new C34032a(0.5f, 150, null));
        C23487o.m77144a((TextView) this.f57429D, (int) R.drawable.akc);
        this.f57450y.setOnClickListener(this);
        this.f57440n.setOnClickListener(this);
        this.f57428C.setOnClickListener(this);
        this.f57428C.setOnTouchListener(new C34032a(0.5f, 150, null));
        this.f57441o.addTextChangedListener(this);
        this.f57442p.addTextChangedListener(this);
        this.f57441o.setOnFocusChangeListener(this.f57437M);
        this.f57442p.setOnFocusChangeListener(this.f57437M);
        this.f57444r.setOnClickListener(this);
        this.f57443q.setOnClickListener(this);
        view.findViewById(R.id.qr).setVisibility(0);
        this.f57440n.setLoginBackgroundRes(R.drawable.bav);
        this.f57440n.setAutoMirrored(false);
        this.f57440n.setLoadingBackground(R.drawable.bba);
        if (getArguments() != null && getArguments().getBoolean("need_auto_fill_account_name", false)) {
            BaseLoginMethod a = C21579s.m72305a(LoginMethodName.DEFAULT);
            if (a instanceof AccountPassLoginMethod) {
                this.f57441o.setText(((AccountPassLoginMethod) a).getName());
                this.f57442p.requestFocus();
            }
        }
    }

    /* renamed from: a */
    public final void mo57519a(JSONObject jSONObject) {
        LoginMethodName loginMethodName;
        if ("email".equals(this.f57446t)) {
            C6907h.m21524a("login_success", (Map) new C21102b().mo56946a("enter_method", this.f57412l).mo56946a("enter_from", this.f57411k).mo56946a("enter_type", this.f57413m).mo56946a("platform", "email").mo56944a("status", 1).mo56944a("_perf_monitor", 1).f56672a);
        } else if ("username".equals(this.f57446t)) {
            C6907h.m21524a("login_success", (Map) new C21102b().mo56946a("enter_method", this.f57412l).mo56946a("enter_from", this.f57411k).mo56946a("enter_type", this.f57413m).mo56946a("platform", "handle").mo56944a("status", 1).mo56944a("_perf_monitor", 1).f56672a);
        }
        try {
            new C18893a();
            m71873a(jSONObject.optJSONObject("data"), (C12898b) C18893a.m61663b(jSONObject));
        } catch (Exception unused) {
        }
        if (!(this.f57409h == null || getArguments() == null)) {
            Bundle bundle = new Bundle(getArguments());
            bundle.putString("platform", "mobile");
            bundle.putString("login_path", "email_or_username");
            this.f57409h.mo57193a(bundle);
        }
        C21537g.m72219a(1, this.f57446t, 0, "");
        if (getArguments() != null && getArguments().getBoolean("need_remember_login_method", true)) {
            String d = C21671bd.m72536d();
            if (TextUtils.equals("email", this.f57446t)) {
                loginMethodName = LoginMethodName.EMAIL_PASS;
            } else {
                loginMethodName = LoginMethodName.USER_NAME_PASS;
            }
            C21579s.m72313b((BaseLoginMethod) new AccountPassLoginMethod(d, loginMethodName, this.f57447u));
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        m71890d(view);
        m71891j();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.aeg, viewGroup, false);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (i != 1024) {
            super.onActivityResult(i, i2, intent);
        } else if (i2 == -1 && this.f57409h != null) {
            Bundle bundle = new Bundle(getArguments());
            bundle.putString("platform", "email");
            this.f57409h.mo57193a(bundle);
        }
    }

    /* renamed from: a */
    public final void mo57438a(String str, String str2, int i) {
        this.f57447u = str;
        this.f57448v = str2;
        this.f57436L = false;
        mo57510f();
        this.f57440n.mo57356Z_();
        if (i == 0) {
            this.f57446t = "email";
            C6907h.m21524a("login_submit", (Map) new C21102b().mo56946a("enter_method", this.f57412l).mo56946a("enter_from", this.f57411k).mo56946a("enter_type", this.f57413m).mo56946a("group_id", C21220e.m71415a(getArguments())).mo56946a("log_pb", C21220e.m71418b(getArguments())).mo56946a("platform", "email").f56672a);
            mo57509e().mo57219b(str, str2, "", this.f57445s);
        } else if (i == 1) {
            this.f57446t = "username";
            C6907h.m21524a("login_submit", (Map) new C21102b().mo56946a("enter_method", this.f57412l).mo56946a("enter_from", this.f57411k).mo56946a("enter_type", this.f57413m).mo56946a("group_id", C21220e.m71415a(getArguments())).mo56946a("log_pb", C21220e.m71418b(getArguments())).mo56946a("platform", "handle").f56672a);
            mo57509e().mo57215a(str, str2, "", (C12857r) this.f57445s);
        } else {
            this.f57440n.setEnabled(true);
        }
    }

    /* renamed from: a */
    public final void mo57518a(int i, String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        int i2 = i;
        this.f57433H.setVisibility(0);
        this.f57431F.setBackgroundColor(getResources().getColor(R.color.a14));
        this.f57432G.setBackgroundColor(getResources().getColor(R.color.a14));
        boolean isEmpty = TextUtils.isEmpty(str);
        if (i2 != 1011) {
            if (i2 == 2002) {
                MusLoginSecureSendCodeFragment musLoginSecureSendCodeFragment = null;
                if (this.f57446t.equals("email")) {
                    musLoginSecureSendCodeFragment = MusLoginSecureSendCodeFragment.m72069a("", this.f57446t, "", str2, str3, this.f57441o.getText().toString(), this.f57442p.getText().toString(), this.f57411k, this.f57412l);
                } else if (this.f57446t.equals("username")) {
                    musLoginSecureSendCodeFragment = MusLoginSecureSendCodeFragment.m72069a(this.f57441o.getText().toString(), this.f57446t, "", str2, str3, "", this.f57442p.getText().toString(), this.f57411k, this.f57412l);
                }
                if (musLoginSecureSendCodeFragment != null) {
                    musLoginSecureSendCodeFragment.mo57501a((C21524n) getActivity());
                    mo57503b(musLoginSecureSendCodeFragment, false);
                    return;
                }
            } else if (i2 != 2005) {
                switch (i2) {
                    case 2027:
                    case 2028:
                        if (TextUtils.isEmpty(str)) {
                            str5 = getString(R.string.c6i);
                        } else {
                            str5 = str;
                        }
                        this.f57433H.setVisibility(8);
                        C10761a.m31403c(getContext(), str5).mo25750a();
                        return;
                    default:
                        TextView textView = this.f57434J;
                        if (isEmpty) {
                            str6 = getString(R.string.c6c);
                        } else {
                            str6 = str;
                        }
                        textView.setText(str6);
                        break;
                }
            } else {
                MusLoginVerifyThirdFragment a = MusLoginVerifyThirdFragment.m72086a(this.f57441o.getText().toString(), this.f57446t, "", str4, this.f57441o.getText().toString(), this.f57442p.getText().toString(), this.f57411k, this.f57412l);
                a.mo57501a((C21524n) getActivity());
                mo57503b(a, false);
                return;
            }
            return;
        }
        this.f57434J.setText(R.string.cb6);
    }
}
