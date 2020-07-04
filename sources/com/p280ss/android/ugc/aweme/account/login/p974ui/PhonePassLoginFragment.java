package com.p280ss.android.ugc.aweme.account.login.p974ui;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.EditText;
import android.widget.TextView;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.NullValueException;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.bytedance.sdk.account.p645a.p646a.C12710e;
import com.bytedance.sdk.account.p662f.p663a.C12827j;
import com.facebook.ads.AdError;
import com.p280ss.android.common.applog.AppLog;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.common.util.C19290j;
import com.p280ss.android.mobilelib.model.PersistentData;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginMethod;
import com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginPart;
import com.p280ss.android.ugc.aweme.account.login.C21578r;
import com.p280ss.android.ugc.aweme.account.login.C21579s;
import com.p280ss.android.ugc.aweme.account.login.C21642z;
import com.p280ss.android.ugc.aweme.account.login.loginlog.C21558a;
import com.p280ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.LoginMethodName;
import com.p280ss.android.ugc.aweme.account.login.model.PhoneLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21319a;
import com.p280ss.android.ugc.aweme.account.login.p956b.C21339p;
import com.p280ss.android.ugc.aweme.account.login.p957c.C21356e;
import com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginView.C21852a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21101a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p946i.C21220e;
import com.p280ss.android.ugc.aweme.account.p950k.C21225a;
import com.p280ss.android.ugc.aweme.account.p950k.C21227b;
import com.p280ss.android.ugc.aweme.account.util.C22334m;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.p280ss.android.ugc.aweme.account.util.C22347v;
import com.p280ss.android.ugc.aweme.base.p308ui.C23467g;
import com.p280ss.android.ugc.aweme.base.utils.C23482j;
import com.p280ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.global.config.settings.C30199h;
import com.p280ss.android.ugc.aweme.main.p1385g.C33038x;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.router.C7195s;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment */
public class PhonePassLoginFragment extends BasePhoneNumberInputFragment<C21356e> implements C21319a, C21642z {

    /* renamed from: e */
    public static final boolean f58484e = C7163a.m22363a();

    /* renamed from: q */
    public PhonePassLoginView f58485q;

    /* renamed from: r */
    private EditText f58486r;

    /* renamed from: s */
    private C21356e f58487s;

    /* renamed from: t */
    private View f58488t;

    /* renamed from: u */
    private C21339p f58489u;

    /* renamed from: v */
    private boolean f58490v;

    /* renamed from: w */
    private TextView f58491w;

    /* renamed from: x */
    private View f58492x;

    /* renamed from: y */
    private boolean f58493y = true;

    /* renamed from: z */
    private OnClickListener f58494z = new OnClickListener() {
        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            int id = view.getId();
            if (id == R.id.ayu) {
                if (PhonePassLoginFragment.this.getActivity() != null) {
                    PhonePassLoginFragment.this.mo58125a(view);
                    PhonePassLoginFragment.this.getActivity().onBackPressed();
                }
            } else if (id == R.id.cws) {
                PhonePassLoginFragment.this.mo58125a(view);
            }
        }
    };

    public final boolean ac_() {
        return false;
    }

    /* renamed from: s */
    private String m72998s() {
        return mo58152p();
    }

    public void beforeHandleRequest() {
        if (isViewValid() && this.f58485q != null) {
            this.f58485q.mo57356Z_();
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f58489u != null) {
            this.f58489u.cancel();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: j */
    public C21356e mo58129g() {
        if ((this.f58487s == null || !this.f58487s.isValid()) && getActivity() != null) {
            this.f58487s = new C21356e(getActivity(), this);
        }
        return this.f58487s;
    }

    public void afterHandleRequest() {
        super.afterHandleRequest();
        if (isViewValid() && this.f58485q != null) {
            this.f58485q.mo57357a();
        }
    }

    /* renamed from: X_ */
    public final boolean mo57516X_() {
        if (getArguments() == null || !this.f58493y || C21671bd.m72539g() || getArguments().getInt("bundle_flow_type", C21578r.f57928p) != C21578r.f57931s) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final void mo57106d() {
        AccountLoginAlogHelper.m71517a(this.f58304h, this.f58305i, ALogLoginMethod.PHONE_NUMBER_PASS, "");
        this.f58493y = false;
        C21558a.m72263a().mo57697a("", "", false, "login", "", "login commit");
        if (!mo58147k()) {
            C21225a.m71437a("PhoneNumberIsWrong");
            C10761a.m31399c((Context) getActivity(), (int) R.string.ctm).mo25750a();
            C21558a a = C21558a.m72263a();
            StringBuilder sb = new StringBuilder();
            sb.append(getString(R.string.ctm));
            sb.append("   ");
            sb.append(mo58152p());
            a.mo57697a(sb.toString(), "", false, "login", "", "login commit error");
            AccountLoginAlogHelper.m71522b("", "PhoneNumberIsWrong", ALogLoginPart.PHONE_NUMBER_INVALID, ALogLoginMethod.PHONE_NUMBER_PASS, m72998s());
            return;
        }
        C6907h.m21524a("login_submit", (Map) C21102b.m71165a().mo56946a("enter_from", this.f58304h).mo56946a("enter_method", this.f58305i).mo56946a("enter_type", this.f58306j).mo56946a("group_id", C21220e.m71415a(getArguments())).mo56946a("log_pb", C21220e.m71418b(getArguments())).mo56946a("platform", "phone").f56672a);
        KeyboardUtils.m77057c(this.f58486r);
        if (this.f58487s != null) {
            this.f58487s.mo57442a(mo58152p(), this.f58486r.getText().toString(), null, this.f58489u);
            return;
        }
        C21225a.m71437a("PresenterIsNull");
        AccountLoginAlogHelper.m71522b("", "PresenterIsNull", null, ALogLoginMethod.PHONE_NUMBER_PASS, m72998s());
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (this.f58492x != null) {
            this.f58492x.setOnClickListener(this.f58494z);
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f58490v = arguments.getBoolean("from_login_or_register", false);
        }
    }

    /* renamed from: e */
    public final void mo58172e(String str) {
        C11030a a = C22347v.m73994a(getActivity());
        a.mo26647b((CharSequence) str);
        a.mo26635a((int) R.string.fjq, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C19282c.m63182a(PhonePassLoginFragment.this.getContext(), "login", "login_pop_confirm");
                ((C33038x) C21671bd.m72521a(C33038x.class)).mo60007a((Context) C21671bd.m72532b(), C1642a.m8034a("https://security.snssdk.com/passport/safe/aweme/unlock.html?did=%s", new Object[]{AppLog.getServerDeviceId()}), true);
            }
        });
        a.mo26646b((int) R.string.w_, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C19282c.m63182a(PhonePassLoginFragment.this.getContext(), "login", "login_pop_cancel");
            }
        });
        a.mo26649b();
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        mo58156r();
        mo58126b(this.f58334o);
    }

    public void showErrorMessage(String str, int i, boolean z) {
        if (getActivity() != null) {
            switch (i) {
                case 1009:
                case 1033:
                case 1034:
                case AdError.INTERNAL_ERROR_2003 /*2003*/:
                case AdError.INTERNAL_ERROR_2004 /*2004*/:
                case 2027:
                case 2028:
                    return;
                default:
                    super.showErrorMessage(str, i, z);
                    return;
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.op, viewGroup, false);
        this.f58492x = inflate.findViewById(R.id.ayu);
        this.f58492x.setOnClickListener(this.f58494z);
        inflate.findViewById(R.id.cws).setOnClickListener(this.f58494z);
        this.f58332m = inflate.findViewById(R.id.a3r);
        this.f58334o = (EditText) inflate.findViewById(R.id.acd);
        this.f58335p = inflate.findViewById(R.id.cb0);
        this.f58333n = (TextView) inflate.findViewById(R.id.a3u);
        this.f58485q = (PhonePassLoginView) inflate.findViewById(R.id.ecy);
        this.f58486r = (EditText) inflate.findViewById(R.id.acc);
        this.f58488t = inflate.findViewById(R.id.e6x);
        this.f58486r.addTextChangedListener(new C23467g() {
            public final void afterTextChanged(Editable editable) {
                PhonePassLoginFragment.this.f58485q.setLoginBtnEnable(!TextUtils.isEmpty(editable.toString()));
            }
        });
        this.f58491w = (TextView) inflate.findViewById(R.id.e7d);
        inflate.findViewById(R.id.e6r).setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                C21558a.m72263a().mo57697a("", "", false, "login", "", "忘记密码");
                if (!PhonePassLoginFragment.this.mo58147k()) {
                    C10761a.m31399c((Context) PhonePassLoginFragment.this.getActivity(), (int) R.string.ctm).mo25750a();
                } else {
                    PhonePassLoginFragment.this.mo58130i().mo58138b(C22334m.m73938a(ResetPasswordFragment.class, PhonePassLoginFragment.this.getArguments()).mo58756a("phone_number", PhonePassLoginFragment.this.mo58152p()).mo58756a("mask_phone_number", PhonePassLoginFragment.this.mo58153q()).mo58753a(), false);
                }
            }
        });
        this.f58485q.setEditText(this.f58334o);
        this.f58485q.setEnterMethod(this.f58305i);
        this.f58485q.setLifecycleOwner(this);
        this.f58485q.setLoginListener(new C21852a() {
            /* renamed from: a */
            public final void mo58209a() {
                PhonePassLoginFragment.this.mo57106d();
            }
        });
        this.f58488t.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                if (PhonePassLoginFragment.this.getContext() != null) {
                    try {
                        C7195s.m22438a().mo18682a(C30199h.m98861a().getFeedbackConf().getNotLoggedIn());
                    } catch (NullValueException unused) {
                        C19290j jVar = new C19290j("https://m.tiktok.com/falcon/tiktok_rn_web/feedback/?id=5678&hide_nav_bar=1");
                        jVar.mo51188a("enter_from", "login_pad");
                        ((C33038x) C21671bd.m72521a(C33038x.class)).mo60007a(PhonePassLoginFragment.this.getContext(), jVar.toString(), true);
                    }
                }
            }
        });
        this.f58485q.mo58250a(C22345t.m73965b());
        C6907h.m21524a("phone_login_enter_password", (Map) new C21102b().f56672a);
        this.f58489u = new C21339p(this) {
            public final void onSuccess(C12710e<C12827j> eVar) {
                super.onSuccess(eVar);
                C21225a.m71437a("success");
                if (PhonePassLoginFragment.this.isViewValid()) {
                    PhonePassLoginFragment.this.afterHandleRequest();
                    C21227b.m71450a("aweme_phone_login_rate", 1, C21101a.m71159a().mo56943b());
                    C21558a.m72263a().mo57697a("", "", true, "login", "", "mobile login success");
                    C19282c.m63182a(PhonePassLoginFragment.this.getContext(), "login", "login_success");
                    AccountLoginAlogHelper.m71514a(ALogLoginPart.LOGIN_BY_PASS, ALogLoginMethod.PHONE_NUMBER_PASS, "");
                    PersistentData.inst().saveLastLoginMobile(PhonePassLoginFragment.this.getContext(), ((C12827j) eVar.f33709g).f33956a);
                    if (PhonePassLoginFragment.this.getActivity() instanceof LoginOrRegisterActivity) {
                        ((LoginOrRegisterActivity) PhonePassLoginFragment.this.getActivity()).mo57757a(true);
                        ((LoginOrRegisterActivity) PhonePassLoginFragment.this.getActivity()).mo57193a(PhonePassLoginFragment.this.mo58155d("phone_password"));
                    }
                    C6907h.onEvent(MobClick.obtain().setEventName("sign_in_success").setLabelName("phone").setJsonObject(C21101a.m71159a().mo56942a("enter_from", PhonePassLoginFragment.this.f58304h).mo56942a("position", PhonePassLoginFragment.this.f58305i).mo56943b()));
                    C6907h.m21524a("login_success", (Map) new C21102b().mo56946a("enter_method", PhonePassLoginFragment.this.f58304h).mo56946a("enter_from", PhonePassLoginFragment.this.f58305i).mo56946a("enter_type", PhonePassLoginFragment.this.f58306j).mo56946a("platform", "phone").mo56944a("status", 1).mo56944a("_perf_monitor", 1).f56672a);
                    if (PhonePassLoginFragment.this.getArguments() != null && PhonePassLoginFragment.this.getArguments().getBoolean("need_remember_login_method", true)) {
                        C21579s.m72313b((BaseLoginMethod) new PhoneLoginMethod(C21671bd.m72536d(), LoginMethodName.PHONE_NUMBER_PASS, PhonePassLoginFragment.this.f58330l));
                    }
                }
            }

            /* JADX WARNING: type inference failed for: r4v0 */
            /* JADX WARNING: type inference failed for: r4v1, types: [org.json.JSONObject] */
            /* JADX WARNING: type inference failed for: r4v2, types: [org.json.JSONObject] */
            /* JADX WARNING: type inference failed for: r4v3 */
            /* JADX WARNING: type inference failed for: r10v2, types: [com.ss.android.ugc.aweme.account.login.m] */
            /* JADX WARNING: type inference failed for: r4v5, types: [com.ss.android.ugc.aweme.account.login.m] */
            /* JADX WARNING: type inference failed for: r4v6 */
            /* JADX WARNING: type inference failed for: r4v7 */
            /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r4v0
              assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.aweme.account.login.m, org.json.JSONObject]
              uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], org.json.JSONObject, ?[OBJECT, ARRAY]]
              mth insns count: 236
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
            public final void mo57358a(com.bytedance.sdk.account.p645a.p646a.C12710e<com.bytedance.sdk.account.p662f.p663a.C12827j> r13) {
                /*
                    r12 = this;
                    super.mo57358a(r13)
                    java.lang.String r0 = r13.f33703c
                    com.p280ss.android.ugc.aweme.account.p950k.C21225a.m71437a(r0)
                    int r0 = r13.f33702b
                    java.lang.String r0 = java.lang.String.valueOf(r0)
                    java.lang.String r1 = r13.f33703c
                    com.ss.android.ugc.aweme.account.log.AccountLoginAlogHelper$ALogLoginMethod r2 = com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.ALogLoginMethod.PHONE_NUMBER_PASS
                    java.lang.String r3 = ""
                    r4 = 0
                    com.p280ss.android.ugc.aweme.account.log.AccountLoginAlogHelper.m71522b(r0, r1, r4, r2, r3)
                    int r0 = r13.f33702b
                    java.lang.String r1 = r13.f33703c
                    r2 = 0
                    com.p280ss.android.ugc.aweme.account.p950k.C21231d.m71462a(r2, r0, r1)
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    boolean r0 = r0.isViewValid()
                    if (r0 != 0) goto L_0x0029
                    return
                L_0x0029:
                    java.lang.String r0 = "login_failure"
                    com.ss.android.ugc.aweme.account.a.b.b r1 = new com.ss.android.ugc.aweme.account.a.b.b
                    r1.<init>()
                    java.lang.String r3 = "platform"
                    java.lang.String r5 = "phone"
                    com.ss.android.ugc.aweme.account.a.b.b r1 = r1.mo56946a(r3, r5)
                    java.lang.String r3 = "enter_method"
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r5 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    java.lang.String r5 = r5.f58305i
                    com.ss.android.ugc.aweme.account.a.b.b r1 = r1.mo56946a(r3, r5)
                    java.lang.String r3 = "enter_type"
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r5 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    java.lang.String r5 = r5.f58304h
                    com.ss.android.ugc.aweme.account.a.b.b r1 = r1.mo56946a(r3, r5)
                    java.lang.String r3 = "carrier"
                    java.lang.String r5 = ""
                    com.ss.android.ugc.aweme.account.a.b.b r1 = r1.mo56946a(r3, r5)
                    java.lang.String r3 = "error_code"
                    int r5 = r13.f33702b
                    com.ss.android.ugc.aweme.account.a.b.b r1 = r1.mo56944a(r3, r5)
                    java.util.Map<java.lang.String, java.lang.String> r1 = r1.f56672a
                    com.p280ss.android.ugc.aweme.common.C6907h.m21524a(r0, r1)
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    boolean r0 = r0 instanceof com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterActivity
                    if (r0 == 0) goto L_0x00b8
                    int r0 = r13.f33702b
                    r1 = 1039(0x40f, float:1.456E-42)
                    if (r0 != r1) goto L_0x00ad
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity r0 = (com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterActivity) r0
                    java.lang.Class<com.ss.android.ugc.aweme.account.login.ui.BindSecurePhoneFragment> r1 = com.p280ss.android.ugc.aweme.account.login.p974ui.BindSecurePhoneFragment.class
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r3 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    android.os.Bundle r3 = r3.getArguments()
                    com.ss.android.ugc.aweme.account.util.m$a r1 = com.p280ss.android.ugc.aweme.account.util.C22334m.m73938a(r1, r3)
                    java.lang.String r3 = "phone_number"
                    T r13 = r13.f33709g
                    com.bytedance.sdk.account.f.a.j r13 = (com.bytedance.sdk.account.p662f.p663a.C12827j) r13
                    java.lang.String r13 = r13.f33956a
                    com.ss.android.ugc.aweme.account.util.m$a r13 = r1.mo58756a(r3, r13)
                    java.lang.String r1 = "enter_from"
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r3 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    java.lang.String r3 = r3.f58304h
                    com.ss.android.ugc.aweme.account.util.m$a r13 = r13.mo58756a(r1, r3)
                    java.lang.String r1 = "enter_method"
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r3 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    java.lang.String r3 = r3.f58305i
                    com.ss.android.ugc.aweme.account.util.m$a r13 = r13.mo58756a(r1, r3)
                    android.support.v4.app.Fragment r13 = r13.mo58753a()
                    r0.mo58137a(r13, r2)
                    return
                L_0x00ad:
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    com.ss.android.ugc.aweme.account.login.ui.LoginOrRegisterActivity r0 = (com.p280ss.android.ugc.aweme.account.login.p974ui.LoginOrRegisterActivity) r0
                    r0.mo57757a(r2)
                L_0x00b8:
                    java.lang.String r0 = "aweme_phone_login_rate"
                    com.ss.android.ugc.aweme.account.a.b.a r1 = com.p280ss.android.ugc.aweme.account.p933a.p935b.C21101a.m71159a()
                    java.lang.String r3 = "errorCode"
                    int r5 = r13.f33702b
                    java.lang.String r5 = java.lang.String.valueOf(r5)
                    com.ss.android.ugc.aweme.account.a.b.a r1 = r1.mo56942a(r3, r5)
                    java.lang.String r3 = "errorDesc"
                    java.lang.String r5 = r13.f33703c
                    com.ss.android.ugc.aweme.account.a.b.a r1 = r1.mo56942a(r3, r5)
                    org.json.JSONObject r1 = r1.mo56943b()
                    com.p280ss.android.ugc.aweme.account.p950k.C21227b.m71450a(r0, r2, r1)
                    com.ss.android.ugc.aweme.account.login.loginlog.a r5 = com.p280ss.android.ugc.aweme.account.login.loginlog.C21558a.m72263a()
                    java.lang.String r6 = r13.f33703c
                    java.lang.String r7 = ""
                    r8 = 0
                    java.lang.String r9 = "login"
                    java.lang.String r10 = ""
                    java.lang.String r11 = "mobile login fail"
                    r5.mo57697a(r6, r7, r8, r9, r10, r11)
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    android.content.Context r0 = r0.getContext()
                    java.lang.String r1 = "login"
                    java.lang.String r2 = "login_error"
                    com.p280ss.android.common.p288d.C19282c.m63182a(r0, r1, r2)
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    r0.afterHandleRequest()
                    int r0 = r13.f33702b
                    r1 = 1075(0x433, float:1.506E-42)
                    if (r0 != r1) goto L_0x014b
                    com.ss.android.ugc.aweme.account.login.e r0 = new com.ss.android.ugc.aweme.account.login.e
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r1 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    android.support.v4.app.FragmentActivity r6 = r1.getActivity()
                    int r7 = r13.f33702b
                    T r1 = r13.f33709g
                    if (r1 == 0) goto L_0x0119
                    T r13 = r13.f33709g
                    com.bytedance.sdk.account.f.a.j r13 = (com.bytedance.sdk.account.p662f.p663a.C12827j) r13
                    org.json.JSONObject r13 = r13.f33964l
                    r8 = r13
                    goto L_0x011a
                L_0x0119:
                    r8 = r4
                L_0x011a:
                    com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod r9 = new com.ss.android.ugc.aweme.account.login.model.PhoneLoginMethod
                    java.lang.String r13 = ""
                    com.ss.android.ugc.aweme.account.login.model.LoginMethodName r1 = com.p280ss.android.ugc.aweme.account.login.model.LoginMethodName.PHONE_NUMBER_PASS
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r2 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    com.ss.android.ugc.aweme.account.login.utils.PhoneNumberUtil$PhoneNumber r2 = r2.f58330l
                    r9.<init>(r13, r1, r2)
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r13 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    android.support.v4.app.FragmentActivity r13 = r13.getActivity()
                    boolean r13 = r13 instanceof com.p280ss.android.ugc.aweme.account.login.C21559m
                    if (r13 == 0) goto L_0x013a
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r13 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    android.support.v4.app.FragmentActivity r13 = r13.getActivity()
                    r4 = r13
                    com.ss.android.ugc.aweme.account.login.m r4 = (com.p280ss.android.ugc.aweme.account.login.C21559m) r4
                L_0x013a:
                    r10 = r4
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r13 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    java.lang.String r1 = "phone_password"
                    android.os.Bundle r11 = r13.mo58155d(r1)
                    r5 = r0
                    r5.<init>(r6, r7, r8, r9, r10, r11)
                    com.p280ss.android.ugc.aweme.account.login.C21572p.m72299a(r0)
                    return
                L_0x014b:
                    int r0 = r13.f33702b
                    r1 = 2027(0x7eb, float:2.84E-42)
                    if (r0 == r1) goto L_0x0257
                    int r0 = r13.f33702b
                    r1 = 2028(0x7ec, float:2.842E-42)
                    if (r0 != r1) goto L_0x0159
                    goto L_0x0257
                L_0x0159:
                    int r0 = r13.f33702b
                    r1 = 2003(0x7d3, float:2.807E-42)
                    if (r0 == r1) goto L_0x024f
                    int r0 = r13.f33702b
                    r1 = 2004(0x7d4, float:2.808E-42)
                    if (r0 != r1) goto L_0x0167
                    goto L_0x024f
                L_0x0167:
                    int r0 = r13.f33702b
                    r1 = 1091(0x443, float:1.529E-42)
                    if (r0 == r1) goto L_0x0173
                    int r0 = r13.f33702b
                    r1 = 1093(0x445, float:1.532E-42)
                    if (r0 != r1) goto L_0x01bd
                L_0x0173:
                    T r0 = r13.f33709g
                    if (r0 == 0) goto L_0x017e
                    T r0 = r13.f33709g
                    com.bytedance.sdk.account.f.a.j r0 = (com.bytedance.sdk.account.p662f.p663a.C12827j) r0
                    org.json.JSONObject r0 = r0.f33964l
                    goto L_0x017f
                L_0x017e:
                    r0 = r4
                L_0x017f:
                    if (r0 == 0) goto L_0x0187
                    java.lang.String r1 = "data"
                    org.json.JSONObject r4 = r0.optJSONObject(r1)
                L_0x0187:
                    if (r4 == 0) goto L_0x01bd
                    java.lang.String r0 = "sec_info"
                    java.lang.String r0 = r4.optString(r0)
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 != 0) goto L_0x01bd
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    if (r0 == 0) goto L_0x01bd
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    android.support.v4.app.FragmentActivity r5 = r0.getActivity()
                    java.lang.String r0 = "sec_info"
                    java.lang.String r6 = r4.optString(r0)
                    int r13 = r13.f33702b
                    java.lang.Integer r7 = java.lang.Integer.valueOf(r13)
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r13 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    java.lang.String r8 = r13.f58304h
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r13 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    java.lang.String r9 = r13.f58305i
                    java.lang.String r10 = "phone"
                    com.p280ss.android.ugc.aweme.account.util.C22324c.m73916a(r5, r6, r7, r8, r9, r10)
                    return
                L_0x01bd:
                    java.lang.String r0 = r13.f33703c
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L_0x01dc
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r13 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    android.content.Context r13 = r13.getContext()
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    r1 = 2131824509(0x7f110f7d, float:1.9281848E38)
                    java.lang.String r0 = r0.getString(r1)
                    com.bytedance.ies.dmt.ui.c.a r13 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31403c(r13, r0)
                    r13.mo25750a()
                    return
                L_0x01dc:
                    int r0 = r13.f33702b
                    r1 = 1009(0x3f1, float:1.414E-42)
                    if (r0 != r1) goto L_0x01f2
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    android.content.Context r0 = r0.getContext()
                    java.lang.String r13 = r13.f33703c
                    com.bytedance.ies.dmt.ui.c.a r13 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31403c(r0, r13)
                    r13.mo25750a()
                    return
                L_0x01f2:
                    int r0 = r13.f33702b
                    r1 = 1033(0x409, float:1.448E-42)
                    if (r0 != r1) goto L_0x0208
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    android.content.Context r0 = r0.getContext()
                    java.lang.String r13 = r13.f33703c
                    com.bytedance.ies.dmt.ui.c.a r13 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31403c(r0, r13)
                    r13.mo25750a()
                    return
                L_0x0208:
                    int r0 = r13.f33702b
                    r1 = 1034(0x40a, float:1.449E-42)
                    if (r0 != r1) goto L_0x023b
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    android.support.v4.app.FragmentActivity r0 = r0.getActivity()
                    com.bytedance.ies.uikit.dialog.b$a r0 = com.p280ss.android.ugc.aweme.account.util.C22347v.m73994a(r0)
                    java.lang.String r13 = r13.f33703c
                    r0.mo26647b(r13)
                    r13 = 2131824193(0x7f110e41, float:1.9281207E38)
                    com.ss.android.ugc.aweme.account.login.ui.p r1 = new com.ss.android.ugc.aweme.account.login.ui.p
                    r1.<init>(r12)
                    r0.mo26635a(r13, r1)
                    r13 = 2131821393(0x7f110351, float:1.9275528E38)
                    com.ss.android.ugc.aweme.account.login.ui.q r1 = new com.ss.android.ugc.aweme.account.login.ui.q
                    r1.<init>(r12)
                    r0.mo26646b(r13, r1)
                    com.bytedance.ies.uikit.dialog.b r13 = r0.mo26644a()
                    com.p280ss.android.ugc.aweme.utils.C42951au.m136342a(r13)
                    return
                L_0x023b:
                    int r0 = r13.f33702b
                    boolean r0 = com.p280ss.android.ugc.aweme.account.util.C22344s.m73955a(r0)
                    if (r0 == 0) goto L_0x024e
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    android.content.Context r0 = r0.getContext()
                    java.lang.String r13 = r13.f33703c
                    com.p280ss.android.ugc.aweme.account.util.C22344s.m73952a(r0, r13)
                L_0x024e:
                    return
                L_0x024f:
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    java.lang.String r13 = r13.f33703c
                    r0.mo58172e(r13)
                    return
                L_0x0257:
                    java.lang.String r0 = r13.f33703c
                    boolean r0 = android.text.TextUtils.isEmpty(r0)
                    if (r0 == 0) goto L_0x0269
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r13 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    r0 = 2131824515(0x7f110f83, float:1.928186E38)
                    java.lang.String r13 = r13.getString(r0)
                    goto L_0x026b
                L_0x0269:
                    java.lang.String r13 = r13.f33703c
                L_0x026b:
                    com.ss.android.ugc.aweme.account.login.ui.PhonePassLoginFragment r0 = com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.this
                    android.content.Context r0 = r0.getContext()
                    com.bytedance.ies.dmt.ui.c.a r13 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31403c(r0, r13)
                    r13.mo25750a()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.p974ui.PhonePassLoginFragment.C218465.mo57358a(com.bytedance.sdk.account.a.a.e):void");
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final /* synthetic */ void mo58244a(DialogInterface dialogInterface, int i) {
                C19282c.m63182a(PhonePassLoginFragment.this.getContext(), "login", "login_pop_cancel");
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final /* synthetic */ void mo58245b(DialogInterface dialogInterface, int i) {
                C19282c.m63182a(PhonePassLoginFragment.this.getContext(), "login", "login_pop_confirm");
                PhonePassLoginFragment.this.mo58130i().mo58138b(C22334m.m73938a(ResetPasswordFragment.class, PhonePassLoginFragment.this.getArguments()).mo58756a("phone_number", PhonePassLoginFragment.this.mo58152p()).mo58756a("mask_phone_number", PhonePassLoginFragment.this.mo58153q()).mo58756a("enter_from", PhonePassLoginFragment.this.f58304h).mo58756a("enter_method", PhonePassLoginFragment.this.f58305i).mo58753a(), false);
            }
        };
        if (VERSION.SDK_INT >= 19) {
            View findViewById = inflate.findViewById(R.id.dan);
            LayoutParams layoutParams = findViewById.getLayoutParams();
            layoutParams.height = C23482j.m77101d();
            findViewById.setLayoutParams(layoutParams);
        }
        return inflate;
    }
}
