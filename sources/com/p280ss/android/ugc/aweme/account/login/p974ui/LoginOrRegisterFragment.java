package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.app.Activity;
import android.arch.lifecycle.C0069x;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Editable;
import android.text.Spannable;
import android.text.Spannable.Factory;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.uikit.dialog.C11029b;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12832o;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.mobilelib.view.InputCodePasswordView;
import com.p280ss.android.mobilelib.view.Register1View;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.C21169e;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginMethod;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginPart;
import com.p280ss.android.ugc.aweme.account.login.C21559m;
import com.p280ss.android.ugc.aweme.account.login.C21569n;
import com.p280ss.android.ugc.aweme.account.login.C21578r;
import com.p280ss.android.ugc.aweme.account.login.C21579s;
import com.p280ss.android.ugc.aweme.account.login.C21642z;
import com.p280ss.android.ugc.aweme.account.login.loginlog.C21558a;
import com.p280ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p280ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21319a;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21340q;
import com.p280ss.android.ugc.aweme.account.login.p957c.C21355d;
import com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginView.C21852a;
import com.p280ss.android.ugc.aweme.account.login.viewmodel.HideLoginPlatformModel;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21101a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p946i.C21220e;
import com.p280ss.android.ugc.aweme.account.p950k.C21225a;
import com.p280ss.android.ugc.aweme.account.p950k.C21227b;
import com.p280ss.android.ugc.aweme.account.p951l.C21242e;
import com.p280ss.android.ugc.aweme.account.util.C22334m;
import com.p280ss.android.ugc.aweme.account.util.C22344s;
import com.p280ss.android.ugc.aweme.account.util.C22347v;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.common.p1148ui.C25713b;
import com.p280ss.android.ugc.aweme.main.p1385g.C33038x;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment */
public class LoginOrRegisterFragment extends BaseVerifyCodeFragment<C21355d> implements InputCodePasswordView, Register1View, C21319a, C21642z {

    /* renamed from: G */
    private ImageView f58425G;

    /* renamed from: H */
    private TextView f58426H;

    /* renamed from: J */
    private boolean f58427J;

    /* renamed from: K */
    private OnClickListener f58428K = new OnClickListener() {
        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            int id = view.getId();
            if (id == R.id.e6h) {
                if (LoginOrRegisterFragment.this.getActivity() != null) {
                    C25713b.m84474a((Activity) LoginOrRegisterFragment.this.getActivity(), (View) LoginOrRegisterFragment.this.f58334o);
                    if (LoginOrRegisterFragment.this.f58435v) {
                        LoginOrRegisterFragment.this.getActivity().onBackPressed();
                    } else {
                        LoginOrRegisterFragment.this.getActivity().finish();
                    }
                }
                if (LoginOrRegisterFragment.this.f58431r) {
                    C21671bd.m72523a(50, 1, "");
                }
            } else if (id == R.id.e6x) {
                C21242e.m71499a(C21671bd.m72532b(), "login_pad", "");
            } else if (id == R.id.cws) {
                KeyboardUtils.m77057c(LoginOrRegisterFragment.this.f58334o);
            }
        }
    };

    /* renamed from: e */
    protected ThirdPartyLoginView f58429e;

    /* renamed from: q */
    protected PhonePassLoginView f58430q;

    /* renamed from: r */
    protected boolean f58431r;

    /* renamed from: s */
    public EditText f58432s;

    /* renamed from: t */
    protected C21355d f58433t;

    /* renamed from: u */
    protected C21340q f58434u;

    /* renamed from: v */
    public boolean f58435v;

    /* renamed from: w */
    public boolean f58436w = true;

    /* renamed from: x */
    private View f58437x;

    public final boolean ac_() {
        return false;
    }

    public void onCheckMobileSuccess() {
    }

    public void onCheckMobileUserExist(String str) {
    }

    public void onResendFail() {
    }

    public void onResendSuccess() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo58167v() {
        return 0;
    }

    /* renamed from: w */
    public final int mo58168w() {
        return C21169e.f56936u;
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo58175y() {
        this.f58427J = true;
        m72954t();
    }

    public void onCheckMobileFail() {
        C19282c.m63182a(getActivity(), "registered_fail", "phone");
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f58434u != null) {
            this.f58434u.cancel();
        }
    }

    public void onStart() {
        super.onStart();
        C21671bd.m72523a(2, 1, "");
    }

    public void onStop() {
        super.onStop();
        C21671bd.m72523a(2, 4, "");
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public final boolean mo58174x() {
        if (this.f58429e.getVisibility() != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    private boolean m72952j() {
        if (C9738o.m28691a(getContext()) < 720 || C9738o.m28709b(getContext()) < 1280) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: private */
    /* renamed from: s */
    public C21355d mo58129g() {
        if ((this.f58433t == null || !this.f58433t.isValid()) && getContext() != null) {
            this.f58433t = new C21355d(getContext(), this);
        }
        return this.f58433t;
    }

    public void afterHandleRequest() {
        super.afterHandleRequest();
        try {
            if (isViewValid()) {
                if (getActivity() != null) {
                    this.f58430q.mo57357a();
                }
            }
        } catch (Exception unused) {
        }
    }

    public void beforeHandleRequest() {
        try {
            if (isViewValid()) {
                if (getActivity() != null) {
                    this.f58430q.mo57356Z_();
                }
            }
        } catch (Exception unused) {
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo57106d() {
        if (TextUtils.isEmpty(this.f58334o.getText().toString())) {
            m72950c((View) this.f58334o);
        } else {
            m72950c((View) this.f58432s);
        }
    }

    public void onPause() {
        super.onPause();
        C25713b.m84474a((Activity) getActivity(), (View) this.f58432s);
        C25713b.m84474a((Activity) getActivity(), (View) this.f58334o);
    }

    /* renamed from: t */
    private void m72954t() {
        if (this.f58429e.getVisibility() != 0 && !this.f58427J && !this.f58435v) {
            C9738o.m28712b(this.f58437x, 8);
        } else if (C21671bd.m72540h().getShowFeedback() == 1) {
            C9738o.m28712b(this.f58437x, 0);
        }
    }

    /* renamed from: X_ */
    public final boolean mo57516X_() {
        if (getArguments() == null || !this.f58436w || C21671bd.m72539g() || getArguments().getInt("bundle_flow_type", C21578r.f57928p) != C21578r.f57930r) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    private static void m72950c(View view) {
        view.requestFocus();
        KeyboardUtils.m77055a(view);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo58161b(int i) {
        if (isViewValid()) {
            this.f58432s.requestFocus();
            this.f58436w = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo58154c(String str) {
        m72951f(str);
        this.f58358A.setEnabled(mo58147k());
        this.f58358A.setClickable(mo58147k());
        this.f58429e.getVisibility();
        m72954t();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f58431r = arguments.getBoolean("bundle_need_back");
            this.f58435v = arguments.getBoolean("from_one_login");
        }
    }

    /* renamed from: f */
    private void m72951f(String str) {
        if (str != null) {
            if (this.f58435v) {
                this.f58429e.setVisibility(8);
                this.f58430q.setVisibility(0);
            } else if (str.length() == 0) {
                this.f58429e.setVisibility(0);
                this.f58430q.setVisibility(8);
                this.f58359B.setVisibility(8);
            } else {
                this.f58429e.setVisibility(8);
                this.f58430q.setVisibility(0);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo58156r();
        this.f58434u = new C21340q(this) {
            public final void onSuccess(C12710e<C12832o> eVar) {
                super.onSuccess(eVar);
                C21225a.m71437a("success");
                C21558a.m72263a().mo57697a("", "", true, "login", "", "mobile login success");
                C21227b.m71450a("aweme_phone_login_rate", 1, C21101a.m71159a().mo56943b());
                AccountLoginAlogHelper.m71514a(ALogLoginPart.LOGIN_BY_PHONE_SMS, ALogLoginMethod.PHONE_SMS, "");
                if (LoginOrRegisterFragment.this.getActivity() != null) {
                    if (LoginOrRegisterFragment.this.getActivity() instanceof C21569n) {
                        ((C21569n) LoginOrRegisterFragment.this.getActivity()).mo57757a(true);
                    }
                    ((C21559m) LoginOrRegisterFragment.this.getActivity()).mo57193a(LoginOrRegisterFragment.this.mo58155d("phone_sms"));
                }
                if (LoginOrRegisterFragment.this.f58430q != null) {
                    LoginOrRegisterFragment.this.f58430q.mo57357a();
                }
                C6907h.onEvent(MobClick.obtain().setEventName("sign_in_success").setLabelName("sms_verification").setJsonObject(C21101a.m71159a().mo56942a("enter_from", LoginOrRegisterFragment.this.f58304h).mo56942a("position", LoginOrRegisterFragment.this.f58305i).mo56943b()));
                C6907h.m21524a("login_success", (Map) new C21102b().mo56946a("enter_method", LoginOrRegisterFragment.this.f58305i).mo56946a("enter_from", LoginOrRegisterFragment.this.f58304h).mo56946a("platform", "sms_verification").mo56944a("status", 1).mo56944a("_perf_monitor", 1).f56672a);
                if (LoginOrRegisterFragment.this.getArguments() != null && LoginOrRegisterFragment.this.getArguments().getBoolean("need_remember_login_method", true)) {
                    C21579s.m72313b((BaseLoginMethod) new PhoneLoginMethod(C21671bd.m72536d(), LoginMethodName.PHONE_SMS, LoginOrRegisterFragment.this.f58330l));
                }
            }

            /* JADX WARNING: type inference failed for: r4v0 */
            /* JADX WARNING: type inference failed for: r4v1, types: [org.json.JSONObject] */
            /* JADX WARNING: type inference failed for: r4v2, types: [org.json.JSONObject] */
            /* JADX WARNING: type inference failed for: r4v3 */
            /* JADX WARNING: type inference failed for: r10v1, types: [com.ss.android.ugc.aweme.account.login.m] */
            /* JADX WARNING: type inference failed for: r4v5, types: [com.ss.android.ugc.aweme.account.login.m] */
            /* JADX WARNING: type inference failed for: r4v6 */
            /* JADX WARNING: type inference failed for: r4v7 */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v0
              assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.aweme.account.login.m, org.json.JSONObject]
              uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], org.json.JSONObject, ?[OBJECT, ARRAY]]
              mth insns count: 186
            	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
            	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
            	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
            	at jadx.core.ProcessClass.process(ProcessClass.java:30)
            	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
            	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
            	at jadx.core.ProcessClass.process(ProcessClass.java:35)
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
             */
            /* JADX WARNING: Unknown variable types count: 4 */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo57260a(com.bytedance.sdk.account.p645a.p646a.C12710e<com.bytedance.sdk.account.p662f.p663a.C12832o> r13) {
                /*
                    r12 = this;
                    super.mo57260a(r13)
                    java.lang.String r0 = r13.f33703c
                    com.p280ss.android.ugc.aweme.account.p950k.C21225a.m71437a(r0)
                    java.lang.String r0 = "login_failure"
                    com.ss.android.ugc.aweme.account.a.b.b r1 = new com.ss.android.ugc.aweme.account.a.b.b
                    r1.<init>()
                    java.lang.String r2 = "enter_method"
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r3 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    java.lang.String r3 = r3.f58305i
                    com.ss.android.ugc.aweme.account.a.b.b r1 = r1.mo56946a(r2, r3)
                    java.lang.String r2 = "platform"
                    java.lang.String r3 = "sms_verification"
                    com.ss.android.ugc.aweme.account.a.b.b r1 = r1.mo56946a(r2, r3)
                    java.lang.String r2 = "enter_type"
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r3 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    java.lang.String r3 = r3.f58306j
                    com.ss.android.ugc.aweme.account.a.b.b r1 = r1.mo56946a(r2, r3)
                    java.lang.String r2 = "carrier"
                    java.lang.String r3 = ""
                    com.ss.android.ugc.aweme.account.a.b.b r1 = r1.mo56946a(r2, r3)
                    java.lang.String r2 = "error_code"
                    int r3 = r13.f33702b
                    com.ss.android.ugc.aweme.account.a.b.b r1 = r1.mo56944a(r2, r3)
                    java.util.Map<java.lang.String, java.lang.String> r1 = r1.f56672a
                    com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r1)
                    int r0 = r13.f33702b
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    java.lang.String r1 = r13.f33703c
                    com.ss.android.ugc.aweme.account.log.AccountLoginAlogHelper$ALogLoginMethod r2 = com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginMethod.PHONE_SMS
                    java.lang.String r3 = ""
                    r4 = 0
                    com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.m71522b(r0, r1, r4, r2, r3)
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    boolean r0 = r0 instanceof com.p280ss.android.ugc.aweme.account.login.C21569n
                    r1 = 0
                    if (r0 == 0) goto L_0x0066
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    com.ss.android.ugc.aweme.account.login.n r0 = (com.p280ss.android.ugc.aweme.account.login.C21569n) r0
                    r0.mo57757a(r1)
                L_0x0066:
                    java.lang.String r0 = ""
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r2 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    android.content.Context r2 = r2.getContext()
                    if (r2 == 0) goto L_0x0079
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    r2 = 2131824509(0x7f110f7d, float:1.9281848E38)
                    java.lang.String r0 = r0.getString(r2)
                L_0x0079:
                    java.lang.String r2 = r13.f33703c
                    boolean r2 = android.text.TextUtils.isEmpty(r2)
                    if (r2 == 0) goto L_0x0082
                    goto L_0x0084
                L_0x0082:
                    java.lang.String r0 = r13.f33703c
                L_0x0084:
                    int r2 = r13.f33702b
                    java.lang.String r3 = r13.f33703c
                    com.p280ss.android.ugc.aweme.account.p950k.C21231d.m71464b(r1, r2, r3)
                    java.lang.String r2 = "aweme_phone_login_rate"
                    com.ss.android.ugc.aweme.account.a.b.a r3 = com.p280ss.android.ugc.aweme.account.p933a.p935b.C21101a.m71159a()
                    java.lang.String r5 = "errorCode"
                    int r6 = r13.f33702b
                    java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
                    com.ss.android.ugc.aweme.account.a.b.a r3 = r3.mo56940a(r5, r6)
                    java.lang.String r5 = "errorDesc"
                    java.lang.String r6 = r13.f33703c
                    com.ss.android.ugc.aweme.account.a.b.a r3 = r3.mo56942a(r5, r6)
                    org.json.JSONObject r3 = r3.mo56943b()
                    com.p280ss.android.ugc.aweme.account.p950k.C21227b.m71450a(r2, r1, r3)
                    int r1 = r13.f33702b
                    r2 = 1075(0x433, float:1.506E-42)
                    if (r1 != r2) goto L_0x00fb
                    com.ss.android.ugc.aweme.account.login.e r0 = new com.ss.android.ugc.aweme.account.login.e
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r1 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    android.support.v4.app.FragmentActivity r6 = r1.getActivity()
                    int r7 = r13.f33702b
                    T r1 = r13.f33709g
                    if (r1 == 0) goto L_0x00c8
                    T r13 = r13.f33709g
                    com.bytedance.sdk.account.f.a.o r13 = (com.bytedance.sdk.account.p662f.p663a.C12832o) r13
                    org.json.JSONObject r13 = r13.f33964l
                    r8 = r13
                    goto L_0x00c9
                L_0x00c8:
                    r8 = r4
                L_0x00c9:
                    com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod r9 = new com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod
                    java.lang.String r13 = ""
                    com.ss.android.ugc.aweme.account.login.model.LoginMethodName r1 = com.p280ss.android.ugc.aweme.account.login.model.LoginMethodName.PHONE_SMS
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r2 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil$PhoneNumber r2 = r2.f58330l
                    r9.<init>(r13, r1, r2)
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r13 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    android.support.v4.app.FragmentActivity r13 = r13.getActivity()
                    boolean r13 = r13 instanceof com.p280ss.android.ugc.aweme.account.login.C21559m
                    if (r13 == 0) goto L_0x00e9
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r13 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    android.support.v4.app.FragmentActivity r13 = r13.getActivity()
                    r4 = r13
                    com.ss.android.ugc.aweme.account.login.m r4 = (com.p280ss.android.ugc.aweme.account.login.C21559m) r4
                L_0x00e9:
                    r10 = r4
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r13 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    java.lang.String r1 = "phone_sms"
                    android.os.Bundle r11 = r13.mo58155d(r1)
                    r5 = r0
                    r5.<init>(r6, r7, r8, r9, r10, r11)
                    com.p280ss.android.ugc.aweme.account.login.C21572p.m72299a(r0)
                    goto L_0x01f5
                L_0x00fb:
                    java.util.Set<java.lang.Integer> r1 = com.p280ss.android.ugc.aweme.account.util.C22325d.f59597a
                    int r2 = r13.f33702b
                    java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
                    boolean r1 = r1.contains(r2)
                    if (r1 == 0) goto L_0x0130
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r13 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    android.support.v4.app.FragmentActivity r13 = r13.getActivity()
                    if (r13 == 0) goto L_0x01f5
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r13 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    android.support.v4.app.FragmentActivity r13 = r13.getActivity()
                    android.content.Context r13 = r13.getApplicationContext()
                    r0 = 2131829350(0x7f112266, float:1.9291667E38)
                    com.bytedance.ies.dmt.ui.c.a r13 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r13, r0)
                    r13.mo25750a()
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r13 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    android.support.v4.app.FragmentActivity r13 = r13.getActivity()
                    r13.finish()
                    goto L_0x01f5
                L_0x0130:
                    int r1 = r13.f33702b
                    r2 = 2027(0x7eb, float:2.84E-42)
                    if (r1 == r2) goto L_0x01d4
                    int r1 = r13.f33702b
                    r2 = 2028(0x7ec, float:2.842E-42)
                    if (r1 != r2) goto L_0x013e
                    goto L_0x01d4
                L_0x013e:
                    int r1 = r13.f33702b
                    r2 = 2003(0x7d3, float:2.807E-42)
                    if (r1 == r2) goto L_0x01af
                    int r1 = r13.f33702b
                    r2 = 2004(0x7d4, float:2.808E-42)
                    if (r1 != r2) goto L_0x014b
                    goto L_0x01af
                L_0x014b:
                    int r1 = r13.f33702b
                    r2 = 1091(0x443, float:1.529E-42)
                    if (r1 == r2) goto L_0x0165
                    int r1 = r13.f33702b
                    r2 = 1093(0x445, float:1.532E-42)
                    if (r1 != r2) goto L_0x0158
                    goto L_0x0165
                L_0x0158:
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r1 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    android.content.Context r1 = r1.getContext()
                    int r13 = r13.f33702b
                    com.p280ss.android.ugc.aweme.account.util.C22344s.m73953a(r1, r0, r13)
                    goto L_0x01f5
                L_0x0165:
                    T r0 = r13.f33709g
                    if (r0 == 0) goto L_0x0170
                    T r0 = r13.f33709g
                    com.bytedance.sdk.account.f.a.o r0 = (com.bytedance.sdk.account.p662f.p663a.C12832o) r0
                    org.json.JSONObject r0 = r0.f33964l
                    goto L_0x0171
                L_0x0170:
                    r0 = r4
                L_0x0171:
                    if (r0 == 0) goto L_0x0179
                    java.lang.String r1 = "data"
                    org.json.JSONObject r4 = r0.optJSONObject(r1)
                L_0x0179:
                    if (r4 == 0) goto L_0x01f5
                    java.lang.String r0 = "sec_info"
                    java.lang.String r0 = r4.optString(r0)
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 != 0) goto L_0x01f5
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    if (r0 == 0) goto L_0x01f5
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    android.support.v4.app.FragmentActivity r5 = r0.getActivity()
                    java.lang.String r0 = "sec_info"
                    java.lang.String r6 = r4.optString(r0)
                    int r13 = r13.f33702b
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r13 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    java.lang.String r8 = r13.f58306j
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r13 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    java.lang.String r9 = r13.f58305i
                    java.lang.String r10 = "sms_verification"
                    com.p280ss.android.ugc.aweme.account.util.C22324c.m73916a(r5, r6, r7, r8, r9, r10)
                    goto L_0x01f5
                L_0x01af:
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r13 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    android.content.Context r13 = r13.getContext()
                    com.bytedance.ies.uikit.dialog.b$a r13 = com.p280ss.android.ugc.aweme.account.util.C22347v.m73994a(r13)
                    r13.mo26647b(r0)
                    r0 = 2131829202(0x7f1121d2, float:1.9291366E38)
                    android.content.DialogInterface$OnClickListener r1 = com.p280ss.android.ugc.aweme.account.login.p974ui.C21874k.f58575a
                    r13.mo26635a(r0, r1)
                    r0 = 2131821393(0x7f110351, float:1.9275528E38)
                    android.content.DialogInterface$OnClickListener r1 = com.p280ss.android.ugc.aweme.account.login.p974ui.C21875l.f58576a
                    r13.mo26646b(r0, r1)
                    com.bytedance.ies.uikit.dialog.b r13 = r13.mo26644a()
                    com.p280ss.android.ugc.aweme.utils.C42951au.m136342a(r13)
                    goto L_0x01f5
                L_0x01d4:
                    java.lang.String r0 = r13.f33703c
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L_0x01e6
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r13 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    r0 = 2131824515(0x7f110f83, float:1.928186E38)
                    java.lang.String r13 = r13.getString(r0)
                    goto L_0x01e8
                L_0x01e6:
                    java.lang.String r13 = r13.f33703c
                L_0x01e8:
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    android.content.Context r0 = r0.getContext()
                    com.bytedance.ies.dmt.ui.c.a r13 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31403c(r0, r13)
                    r13.mo25750a()
                L_0x01f5:
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r13 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginView r13 = r13.f58430q
                    if (r13 == 0) goto L_0x0202
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterFragment r13 = com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.this
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginView r13 = r13.f58430q
                    r13.mo57357a()
                L_0x0202:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterFragment.C218295.mo57260a(com.bytedance.sdk.account.a.a.e):void");
            }

            /* renamed from: a */
            public final void onNeedCaptcha(C12710e<C12832o> eVar, String str) {
                super.onNeedCaptcha(eVar, str);
                if (LoginOrRegisterFragment.this.f58430q != null) {
                    LoginOrRegisterFragment.this.f58430q.mo57357a();
                }
            }
        };
        this.f58430q.setEditText(this.f58334o);
        m72954t();
        if (m72952j()) {
            this.f58334o.postDelayed(new C21873j(this), 500);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        String str;
        String str2;
        super.onActivityResult(i, i2, intent);
        if (i == 1001) {
            boolean z = false;
            if (intent != null && intent.getBooleanExtra("need_finish_login", false)) {
                z = true;
            }
            C11029b bVar = null;
            if (intent != null) {
                str = intent.getStringExtra("toast_tips");
            } else {
                str = null;
            }
            int i3 = -1;
            if (intent != null) {
                i3 = intent.getIntExtra("error_code", -1);
            }
            if (intent != null) {
                str2 = intent.getStringExtra("description");
            } else {
                str2 = null;
            }
            if ((i3 == 2003 || i3 == 2004) && !TextUtils.isEmpty(str2)) {
                C11030a a = C22347v.m73994a(getActivity());
                a.mo26647b((CharSequence) str2);
                a.mo26635a((int) R.string.fjq, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C19282c.m63182a(LoginOrRegisterFragment.this.getActivity(), "login", "login_pop_confirm");
                        ((C33038x) C21671bd.m72521a(C33038x.class)).mo60007a((Context) LoginOrRegisterFragment.this.getActivity(), C1642a.m8034a("https://security.snssdk.com/passport/safe/aweme/unlock.html?did=%s", new Object[]{AppLog.getServerDeviceId()}), true);
                    }
                });
                a.mo26646b((int) R.string.w_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C19282c.m63182a(LoginOrRegisterFragment.this.getActivity(), "login", "login_pop_cancel");
                    }
                });
                bVar = a.mo26644a();
                C42951au.m136342a(bVar);
            } else if (i3 == 2027 || i3 == 2028) {
                if (TextUtils.isEmpty(str2)) {
                    str2 = getString(R.string.c6i);
                }
                C10761a.m31403c(getContext(), str2).mo25750a();
            }
            if (!TextUtils.isEmpty(str) && getActivity() != null) {
                if (z) {
                    C10761a.m31403c(getActivity().getApplicationContext(), str).mo25750a();
                } else {
                    C22344s.m73953a(getContext(), str, i3);
                }
            }
            if (z && getActivity() != null) {
                C42951au.m136343b(bVar);
                getActivity().finish();
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        View inflate = layoutInflater.inflate(R.layout.oo, viewGroup, false);
        this.f58429e = (ThirdPartyLoginView) inflate.findViewById(R.id.edk);
        this.f58430q = (PhonePassLoginView) inflate.findViewById(R.id.ecz);
        this.f58334o = (EditText) inflate.findViewById(R.id.acd);
        this.f58437x = inflate.findViewById(R.id.e6x);
        this.f58332m = inflate.findViewById(R.id.a3r);
        this.f58333n = (TextView) inflate.findViewById(R.id.a3u);
        this.f58335p = inflate.findViewById(R.id.cb0);
        this.f58358A = (TextView) inflate.findViewById(R.id.d8h);
        this.f58359B = (TextView) inflate.findViewById(R.id.aqc);
        this.f58432s = (EditText) inflate.findViewById(R.id.acj);
        this.f58437x.setOnClickListener(this.f58428K);
        this.f58425G = (ImageView) inflate.findViewById(R.id.e6h);
        this.f58425G.setOnClickListener(this.f58428K);
        this.f58430q.setEnterMethod(this.f58305i);
        this.f58426H = (TextView) inflate.findViewById(R.id.avl);
        inflate.findViewById(R.id.cws).setOnClickListener(this.f58428K);
        inflate.findViewById(R.id.c_n).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C6907h.m21524a("switch_to_phone", (Map) new C21102b().mo56946a("enter_method", LoginOrRegisterFragment.this.f58305i).f56672a);
                ((LoginOrRegisterActivity) LoginOrRegisterFragment.this.getActivity()).mo58138b(C22334m.m73938a(PhonePassLoginFragment.class, LoginOrRegisterFragment.this.getArguments()).mo58756a("key_input_phone_num", LoginOrRegisterFragment.this.mo58152p()).mo58756a("enter_from", LoginOrRegisterFragment.this.f58304h).mo58756a("enter_method", LoginOrRegisterFragment.this.f58305i).mo58757a("from_login_or_register", true).mo58753a(), !LoginOrRegisterFragment.this.f58435v);
            }
        });
        this.f58430q.setLifecycleOwner(this);
        this.f58430q.setLoginListener(new C21852a() {
            /* renamed from: a */
            public final void mo58209a() {
                LoginOrRegisterFragment.this.f58436w = false;
                if (!LoginOrRegisterFragment.this.mo58147k()) {
                    C21225a.m71437a("PhoneNumberIsWrong");
                    AccountLoginAlogHelper.m71518a("-1", "phone number invalid", ALogLoginPart.PHONE_NUMBER_INVALID, ALogLoginMethod.PHONE_SMS, null);
                    C10761a.m31403c((Context) C21671bd.m72532b(), LoginOrRegisterFragment.this.getResources().getString(R.string.fsx)).mo25750a();
                    return;
                }
                C6907h.m21524a("login_submit", (Map) C21102b.m71165a().mo56946a("enter_from", LoginOrRegisterFragment.this.f58304h).mo56946a("enter_method", LoginOrRegisterFragment.this.f58305i).mo56946a("enter_type", LoginOrRegisterFragment.this.f58306j).mo56946a("group_id", C21220e.m71415a(LoginOrRegisterFragment.this.getArguments())).mo56946a("log_pb", C21220e.m71418b(LoginOrRegisterFragment.this.getArguments())).mo56946a("platform", "sms_verification").f56672a);
                C6907h.onEvent(MobClick.obtain().setEventName("sign_in").setLabelName("sms_verification").setJsonObject(C21101a.m71159a().mo56942a("enter_from", LoginOrRegisterFragment.this.f58304h).mo56942a("position", LoginOrRegisterFragment.this.f58305i).mo56943b()));
                C6907h.m21524a("login_choose_platform", (Map) C21102b.m71165a().mo56946a("enter_method", LoginOrRegisterFragment.this.f58305i).mo56946a("enter_from", LoginOrRegisterFragment.this.f58304h).mo56946a("platform", "phone").f56672a);
                LoginOrRegisterFragment.this.f58430q.mo57356Z_();
                if (LoginOrRegisterFragment.this.f58433t != null) {
                    LoginOrRegisterFragment.this.f58433t.mo57441a(LoginOrRegisterFragment.this.mo58152p(), LoginOrRegisterFragment.this.f58432s.getText().toString(), "", LoginOrRegisterFragment.this.f58434u);
                }
                if (!TextUtils.equals(LoginOrRegisterFragment.this.f58362E, LoginOrRegisterFragment.this.mo58152p())) {
                    C21101a a = C21101a.m71159a().mo56942a("send_code_phone_number", LoginOrRegisterFragment.this.f58362E).mo56942a("formatted_phone_number", LoginOrRegisterFragment.this.mo58152p());
                    if (LoginOrRegisterFragment.this.f58334o != null) {
                        a.mo56942a("phone_number_raw_input", LoginOrRegisterFragment.this.f58334o.getText().toString());
                    }
                    C21227b.m71452a("send_code_sms_login_phone_number", a.mo56943b());
                    AccountLoginAlogHelper.m71517a(LoginOrRegisterFragment.this.f58304h, LoginOrRegisterFragment.this.f58305i, ALogLoginMethod.PHONE_SMS, "SendCodeNum Equal FormattedNum");
                    return;
                }
                C21225a.m71437a("SendCodeNumNotEqualFormattedNum");
                AccountLoginAlogHelper.m71517a(LoginOrRegisterFragment.this.f58304h, LoginOrRegisterFragment.this.f58305i, ALogLoginMethod.PHONE_SMS, "SendCodeNum not Equal FormattedNum");
            }
        });
        this.f58432s.addTextChangedListener(new C23467g() {
            public final void afterTextChanged(Editable editable) {
                LoginOrRegisterFragment.this.f58430q.mo58249a(LoginOrRegisterFragment.this.f58432s.getText().toString());
            }
        });
        if (VERSION.SDK_INT >= 19) {
            View findViewById = inflate.findViewById(R.id.dan);
            LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = C10994a.m32204a((Context) getActivity());
            findViewById.setLayoutParams(layoutParams);
        }
        if (this.f58359B != null) {
            String string = getString(R.string.wv);
            String string2 = getString(R.string.bb7);
            Factory instance = Factory.getInstance();
            StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(string2);
            Spannable newSpannable = instance.newSpannable(sb.toString());
            newSpannable.setSpan(new ForegroundColorSpan(getResources().getColor(R.color.a5h)), 0, string.length(), 17);
            this.f58359B.setText(newSpannable);
        }
        this.f58429e.setEventType(this.f58304h);
        this.f58429e.setNeedHidePlatform((String) ((HideLoginPlatformModel) C0069x.m159a(getActivity()).mo147a(HideLoginPlatformModel.class)).f59213b.getValue());
        this.f58429e.setPosition(this.f58305i);
        ThirdPartyLoginView thirdPartyLoginView = this.f58429e;
        if (getArguments() == null) {
            bundle2 = new Bundle();
        } else {
            bundle2 = getArguments();
        }
        thirdPartyLoginView.setBundle(bundle2);
        if (this.f58435v) {
            this.f58429e.setVisibility(8);
            this.f58430q.setVisibility(0);
            this.f58425G.setImageResource(R.drawable.a1q);
            this.f58425G.setContentDescription(getString(R.string.bxn));
        } else {
            this.f58425G.setContentDescription(getString(R.string.a5p));
        }
        return inflate;
    }
}
