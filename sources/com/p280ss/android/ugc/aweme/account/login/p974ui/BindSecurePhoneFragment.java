package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12832o;
import com.p280ss.android.mobilelib.model.PersistentData;
import com.p280ss.android.mobilelib.view.InputCodePasswordView;
import com.p280ss.android.ugc.aweme.account.C21169e;
import com.p280ss.android.ugc.aweme.account.login.C21559m;
import com.p280ss.android.ugc.aweme.account.login.C21569n;
import com.p280ss.android.ugc.aweme.account.login.loginlog.C21558a;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21340q;
import com.p280ss.android.ugc.aweme.account.login.p957c.C21352a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21101a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p946i.C21220e;
import com.p280ss.android.ugc.aweme.account.p950k.C21227b;
import com.p280ss.android.ugc.aweme.account.view.StateButton.C22358a;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment */
public class BindSecurePhoneFragment extends BaseVerifyCodeFragment<C21352a> implements InputCodePasswordView {

    /* renamed from: e */
    protected String f58378e;

    /* renamed from: q */
    protected TextView f58379q;

    /* renamed from: r */
    public EditText f58380r;

    /* renamed from: s */
    public View f58381s;

    /* renamed from: t */
    public C21352a f58382t;

    /* renamed from: u */
    public C21340q f58383u;

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final boolean mo58147k() {
        return true;
    }

    public void onDestroy() {
        super.onDestroy();
    }

    public void onResendFail() {
    }

    public void onResendSuccess() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final String mo58152p() {
        return this.f58378e;
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public final int mo58167v() {
        return 2;
    }

    /* renamed from: w */
    public final int mo58168w() {
        return C21169e.f56936u;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public C21352a mo58129g() {
        if ((this.f58382t == null || !this.f58382t.isValid()) && getContext() != null) {
            this.f58382t = new C21352a(getContext(), this);
        }
        return this.f58382t;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo58161b(int i) {
        if (isViewValid()) {
            this.f58380r.requestFocus();
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f58378e = arguments.getString("phone_number");
        } else {
            this.f58378e = PersistentData.inst().getLastLoginMobile();
        }
    }

    /* renamed from: a */
    public final void mo58182a(String str, String str2) {
        C6907h.onEvent(MobClick.obtain().setEventName(str).setLabelName(str2).setJsonObject(C21101a.m71159a().mo56942a("enter_from", this.f58304h).mo56942a("position", this.f58305i).mo56943b()));
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f58379q = (TextView) view.findViewById(R.id.e73);
        this.f58380r = (EditText) view.findViewById(R.id.acr);
        this.f58358A = (TextView) view.findViewById(R.id.d8h);
        this.f58381s = view.findViewById(R.id.qz);
        this.f58359B = (TextView) view.findViewById(R.id.aqc);
        this.f58379q.setText(this.f58378e);
        this.f58380r.addTextChangedListener(new C23467g() {
            public final void afterTextChanged(Editable editable) {
                int i;
                boolean z = false;
                if (TextUtils.isEmpty(editable.toString())) {
                    i = 0;
                } else {
                    i = editable.toString().length();
                }
                View view = BindSecurePhoneFragment.this.f58381s;
                if (i == 4) {
                    z = true;
                }
                C22358a.m74034a(view, z);
            }
        });
        C22358a.m74034a(this.f58381s, false);
        this.f58381s.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (!TextUtils.isEmpty(BindSecurePhoneFragment.this.f58380r.getText()) && BindSecurePhoneFragment.this.f58380r.getText().toString().length() == 4) {
                    C22358a.m74035b(BindSecurePhoneFragment.this.f58381s);
                    BindSecurePhoneFragment.this.f58382t.mo57436a(BindSecurePhoneFragment.this.f58378e, BindSecurePhoneFragment.this.f58380r.getText().toString(), "", BindSecurePhoneFragment.this.f58383u);
                    BindSecurePhoneFragment.this.mo58182a("credible_auth", "click_auth");
                    C6907h.m21524a("login_submit", (Map) C21102b.m71165a().mo56946a("enter_from", BindSecurePhoneFragment.this.f58304h).mo56946a("enter_method", BindSecurePhoneFragment.this.f58305i).mo56946a("enter_type", BindSecurePhoneFragment.this.f58306j).mo56946a("group_id", C21220e.m71415a(BindSecurePhoneFragment.this.getArguments())).mo56946a("log_pb", C21220e.m71418b(BindSecurePhoneFragment.this.getArguments())).mo56946a("platform", "sms_verification").f56672a);
                }
            }
        });
        this.f58383u = new C21340q(this) {
            public final void onSuccess(C12710e<C12832o> eVar) {
                super.onSuccess(eVar);
                C21558a.m72263a().mo57697a("", "", true, "login", "", "mobile login success");
                C21227b.m71450a("aweme_phone_login_rate", 1, C21101a.m71159a().mo56943b());
                if (BindSecurePhoneFragment.this.getActivity() != null) {
                    if (BindSecurePhoneFragment.this.getActivity() instanceof C21569n) {
                        ((C21569n) BindSecurePhoneFragment.this.getActivity()).mo57757a(true);
                    }
                    ((C21559m) BindSecurePhoneFragment.this.getActivity()).mo57193a(BindSecurePhoneFragment.this.mo58155d("phone_sms"));
                }
                C22358a.m74033a(BindSecurePhoneFragment.this.f58381s);
                BindSecurePhoneFragment.this.mo58182a("credible_auth", "auth_success");
                BindSecurePhoneFragment.this.mo58182a("sign_in_success", "sms_verification");
                KeyboardUtils.m77057c(BindSecurePhoneFragment.this.f58380r);
                C6907h.m21524a("login_success", (Map) new C21102b().mo56946a("enter_method", BindSecurePhoneFragment.this.f58305i).mo56946a("enter_from", BindSecurePhoneFragment.this.f58304h).mo56946a("enter_type", BindSecurePhoneFragment.this.f58306j).mo56946a("platform", "sms_verification").mo56944a("status", 1).mo56944a("_perf_monitor", 1).f56672a);
            }

            /* JADX WARNING: type inference failed for: r2v12 */
            /* JADX WARNING: type inference failed for: r2v13, types: [org.json.JSONObject] */
            /* JADX WARNING: type inference failed for: r2v14, types: [org.json.JSONObject] */
            /* JADX WARNING: type inference failed for: r2v15 */
            /* JADX WARNING: type inference failed for: r8v1, types: [com.ss.android.ugc.aweme.account.login.m] */
            /* JADX WARNING: type inference failed for: r2v17, types: [com.ss.android.ugc.aweme.account.login.m] */
            /* JADX WARNING: type inference failed for: r2v18 */
            /* JADX WARNING: type inference failed for: r2v19 */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r2v12
              assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.aweme.account.login.m, org.json.JSONObject]
              uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], org.json.JSONObject, ?[OBJECT, ARRAY]]
              mth insns count: 161
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
            	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
            	at jadx.api.JavaClass.decompile(JavaClass.java:62)
            	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
             */
            /* JADX WARNING: Unknown variable types count: 4 */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo57260a(com.bytedance.sdk.account.p645a.p646a.C12710e<com.bytedance.sdk.account.p662f.p663a.C12832o> r11) {
                /*
                    r10 = this;
                    super.mo57260a(r11)
                    com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    boolean r0 = r0 instanceof com.p280ss.android.ugc.aweme.account.login.C21569n
                    r1 = 0
                    if (r0 == 0) goto L_0x0019
                    com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    com.ss.android.ugc.aweme.account.login.n r0 = (com.p280ss.android.ugc.aweme.account.login.C21569n) r0
                    r0.mo57757a(r1)
                L_0x0019:
                    int r0 = r11.f33702b
                    java.lang.String r2 = r11.f33703c
                    com.p280ss.android.ugc.aweme.account.p950k.C21231d.m71464b(r1, r0, r2)
                    java.lang.String r0 = "login_failure"
                    com.ss.android.ugc.aweme.account.a.b.b r2 = new com.ss.android.ugc.aweme.account.a.b.b
                    r2.<init>()
                    java.lang.String r3 = "platform"
                    java.lang.String r4 = "sms_verification"
                    com.ss.android.ugc.aweme.account.a.b.b r2 = r2.mo56946a(r3, r4)
                    java.lang.String r3 = "enter_method"
                    com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment r4 = com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.this
                    java.lang.String r4 = r4.f58305i
                    com.ss.android.ugc.aweme.account.a.b.b r2 = r2.mo56946a(r3, r4)
                    java.lang.String r3 = "enter_type"
                    com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment r4 = com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.this
                    java.lang.String r4 = r4.f58306j
                    com.ss.android.ugc.aweme.account.a.b.b r2 = r2.mo56946a(r3, r4)
                    java.lang.String r3 = "carrier"
                    java.lang.String r4 = ""
                    com.ss.android.ugc.aweme.account.a.b.b r2 = r2.mo56946a(r3, r4)
                    java.lang.String r3 = "error_code"
                    int r4 = r11.f33702b
                    com.ss.android.ugc.aweme.account.a.b.b r2 = r2.mo56944a(r3, r4)
                    java.util.Map<java.lang.String, java.lang.String> r2 = r2.f56672a
                    com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r2)
                    java.lang.String r0 = "aweme_phone_login_rate"
                    com.ss.android.ugc.aweme.account.a.b.a r2 = com.p280ss.android.ugc.aweme.account.p933a.p935b.C21101a.m71159a()
                    java.lang.String r3 = "errorCode"
                    int r4 = r11.f33702b
                    java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
                    com.ss.android.ugc.aweme.account.a.b.a r2 = r2.mo56940a(r3, r4)
                    java.lang.String r3 = "errorDesc"
                    java.lang.String r4 = r11.f33703c
                    com.ss.android.ugc.aweme.account.a.b.a r2 = r2.mo56942a(r3, r4)
                    org.json.JSONObject r2 = r2.mo56943b()
                    com.p280ss.android.ugc.aweme.account.p950k.C21227b.m71450a(r0, r1, r2)
                    int r0 = r11.f33702b
                    r1 = 1075(0x433, float:1.506E-42)
                    r2 = 0
                    if (r0 != r1) goto L_0x00bd
                    com.ss.android.ugc.aweme.account.login.e r0 = new com.ss.android.ugc.aweme.account.login.e
                    com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment r1 = com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.this
                    android.support.v4.app.FragmentActivity r4 = r1.getActivity()
                    int r5 = r11.f33702b
                    T r1 = r11.f33709g
                    if (r1 == 0) goto L_0x0096
                    T r11 = r11.f33709g
                    com.bytedance.sdk.account.f.a.o r11 = (com.bytedance.sdk.account.p662f.p663a.C12832o) r11
                    org.json.JSONObject r11 = r11.f33964l
                    r6 = r11
                    goto L_0x0097
                L_0x0096:
                    r6 = r2
                L_0x0097:
                    r7 = 0
                    com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment r11 = com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.this
                    android.support.v4.app.FragmentActivity r11 = r11.getActivity()
                    boolean r11 = r11 instanceof com.p280ss.android.ugc.aweme.account.login.C21559m
                    if (r11 == 0) goto L_0x00ab
                    com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment r11 = com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.this
                    android.support.v4.app.FragmentActivity r11 = r11.getActivity()
                    r2 = r11
                    com.ss.android.ugc.aweme.account.login.m r2 = (com.p280ss.android.ugc.aweme.account.login.C21559m) r2
                L_0x00ab:
                    r8 = r2
                    com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment r11 = com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.this
                    java.lang.String r1 = "phone_sms"
                    android.os.Bundle r9 = r11.mo58155d(r1)
                    r3 = r0
                    r3.<init>(r4, r5, r6, r7, r8, r9)
                    com.p280ss.android.ugc.aweme.account.login.C21572p.m72299a(r0)
                    goto L_0x01bf
                L_0x00bd:
                    java.util.Set<java.lang.Integer> r0 = com.p280ss.android.ugc.aweme.account.util.C22325d.f59597a
                    int r1 = r11.f33702b
                    java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
                    boolean r0 = r0.contains(r1)
                    if (r0 == 0) goto L_0x00f2
                    com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment r11 = com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.this
                    android.support.v4.app.FragmentActivity r11 = r11.getActivity()
                    if (r11 == 0) goto L_0x01bf
                    com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment r11 = com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.this
                    android.support.v4.app.FragmentActivity r11 = r11.getActivity()
                    android.content.Context r11 = r11.getApplicationContext()
                    r0 = 2131829350(0x7f112266, float:1.9291667E38)
                    com.bytedance.ies.dmt.ui.c.a r11 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31399c(r11, r0)
                    r11.mo25750a()
                    com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment r11 = com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.this
                    android.support.v4.app.FragmentActivity r11 = r11.getActivity()
                    r11.finish()
                    goto L_0x01bf
                L_0x00f2:
                    int r0 = r11.f33702b
                    r1 = 2003(0x7d3, float:2.807E-42)
                    if (r0 == r1) goto L_0x0199
                    int r0 = r11.f33702b
                    r1 = 2004(0x7d4, float:2.808E-42)
                    if (r0 != r1) goto L_0x0100
                    goto L_0x0199
                L_0x0100:
                    int r0 = r11.f33702b
                    r1 = 2027(0x7eb, float:2.84E-42)
                    if (r0 == r1) goto L_0x0177
                    int r0 = r11.f33702b
                    r1 = 2028(0x7ec, float:2.842E-42)
                    if (r0 != r1) goto L_0x010d
                    goto L_0x0177
                L_0x010d:
                    int r0 = r11.f33702b
                    r1 = 1091(0x443, float:1.529E-42)
                    if (r0 == r1) goto L_0x012d
                    int r0 = r11.f33702b
                    r1 = 1093(0x445, float:1.532E-42)
                    if (r0 != r1) goto L_0x011a
                    goto L_0x012d
                L_0x011a:
                    com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.this
                    android.content.Context r0 = r0.getContext()
                    java.lang.String r11 = com.p280ss.android.ugc.aweme.account.util.C22338o.m73945a(r11)
                    com.bytedance.ies.dmt.ui.c.a r11 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31403c(r0, r11)
                    r11.mo25750a()
                    goto L_0x01bf
                L_0x012d:
                    T r0 = r11.f33709g
                    if (r0 == 0) goto L_0x0138
                    T r0 = r11.f33709g
                    com.bytedance.sdk.account.f.a.o r0 = (com.bytedance.sdk.account.p662f.p663a.C12832o) r0
                    org.json.JSONObject r0 = r0.f33964l
                    goto L_0x0139
                L_0x0138:
                    r0 = r2
                L_0x0139:
                    if (r0 == 0) goto L_0x0141
                    java.lang.String r1 = "data"
                    org.json.JSONObject r2 = r0.optJSONObject(r1)
                L_0x0141:
                    if (r2 == 0) goto L_0x01bf
                    java.lang.String r0 = "sec_info"
                    java.lang.String r0 = r2.optString(r0)
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 != 0) goto L_0x01bf
                    com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    if (r0 == 0) goto L_0x01bf
                    com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.this
                    android.support.v4.app.FragmentActivity r3 = r0.getActivity()
                    java.lang.String r0 = "sec_info"
                    java.lang.String r4 = r2.optString(r0)
                    int r11 = r11.f33702b
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r11)
                    com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment r11 = com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.this
                    java.lang.String r6 = r11.f58306j
                    com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment r11 = com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.this
                    java.lang.String r7 = r11.f58305i
                    java.lang.String r8 = "sms_verification"
                    com.p280ss.android.ugc.aweme.account.util.C22324c.m73916a(r3, r4, r5, r6, r7, r8)
                    goto L_0x01bf
                L_0x0177:
                    java.lang.String r0 = r11.f33703c
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L_0x0189
                    com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment r11 = com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.this
                    r0 = 2131824515(0x7f110f83, float:1.928186E38)
                    java.lang.String r11 = r11.getString(r0)
                    goto L_0x018b
                L_0x0189:
                    java.lang.String r11 = r11.f33703c
                L_0x018b:
                    com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.this
                    android.content.Context r0 = r0.getContext()
                    com.bytedance.ies.dmt.ui.c.a r11 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31403c(r0, r11)
                    r11.mo25750a()
                    goto L_0x01bf
                L_0x0199:
                    com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.this
                    android.content.Context r0 = r0.getContext()
                    com.bytedance.ies.uikit.dialog.b$a r0 = com.p280ss.android.ugc.aweme.account.util.C22347v.m73994a(r0)
                    java.lang.String r11 = r11.f33703c
                    r0.mo26647b(r11)
                    r11 = 2131829202(0x7f1121d2, float:1.9291366E38)
                    android.content.DialogInterface$OnClickListener r1 = com.p280ss.android.ugc.aweme.account.login.p974ui.C21864d.f58562a
                    r0.mo26635a(r11, r1)
                    r11 = 2131821393(0x7f110351, float:1.9275528E38)
                    android.content.DialogInterface$OnClickListener r1 = com.p280ss.android.ugc.aweme.account.login.p974ui.C21865e.f58563a
                    r0.mo26646b(r11, r1)
                    com.bytedance.ies.uikit.dialog.b r11 = r0.mo26644a()
                    com.p280ss.android.ugc.aweme.utils.C42951au.m136342a(r11)
                L_0x01bf:
                    com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment r11 = com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.this
                    android.view.View r11 = r11.f58381s
                    com.p280ss.android.ugc.aweme.account.view.StateButton.C22358a.m74033a(r11)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.C218113.mo57260a(com.bytedance.sdk.account.a.a.e):void");
            }
        };
        super.mo58156r();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.na, viewGroup, false);
    }
}
