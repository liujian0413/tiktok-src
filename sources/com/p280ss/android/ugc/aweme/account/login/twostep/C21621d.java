package com.p280ss.android.ugc.aweme.account.login.twostep;

import android.support.p029v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.TextView;
import bolts.C1591g;
import bolts.C1592h;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9730f;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21866f;
import com.p280ss.android.ugc.aweme.account.login.p974ui.C21866f.C21868b;
import com.p280ss.android.ugc.aweme.account.login.twostep.C21635g.C21636a;
import com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21600b;
import com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21600b.C21601a;
import com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21602c;
import com.p280ss.android.ugc.aweme.account.p982ui.CodeInputView;
import com.p280ss.android.ugc.aweme.account.p982ui.CodeInputView.C22248a;
import com.p280ss.android.ugc.aweme.account.p982ui.LoadingCircleView;
import com.p280ss.android.ugc.aweme.account.p982ui.TimerTextView;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.d */
public final class C21621d extends C21635g implements C22248a {

    /* renamed from: f */
    public static final boolean f58039f = C7163a.m22363a();

    /* renamed from: g */
    public static final C21622a f58040g = new C21622a(null);

    /* renamed from: a */
    public TimerTextView f58041a;

    /* renamed from: b */
    public CodeInputView f58042b;

    /* renamed from: c */
    public TextView f58043c;

    /* renamed from: d */
    public View f58044d;

    /* renamed from: e */
    public boolean f58045e;

    /* renamed from: m */
    private LoadingCircleView f58046m;

    /* renamed from: n */
    private TextView f58047n;

    /* renamed from: o */
    private View f58048o;

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.d$a */
    public static final class C21622a {
        private C21622a() {
        }

        public /* synthetic */ C21622a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.d$b */
    static final class C21623b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C21621d f58049a;

        C21623b(C21621d dVar) {
            this.f58049a = dVar;
        }

        public final void run() {
            JSONObject jSONObject;
            JSONObject jSONObject2 = this.f58049a.f58068h;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.getJSONObject("data");
            } else {
                jSONObject = null;
            }
            C21621d dVar = this.f58049a;
            String a = C9730f.m28665a(jSONObject, "verify_ticket", "");
            C7573i.m23582a((Object) a, "JsonUtils.queryString(da…rConst.VERIFY_TICKET, \"\")");
            dVar.mo57851d(a);
            if (!TextUtils.isEmpty(this.f58049a.f58070j)) {
                this.f58049a.mo57836b();
            } else {
                this.f58049a.mo57835a(null, "Cannot find verify ticket from JSON data");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.d$c */
    public static final class C21624c extends C21868b {

        /* renamed from: a */
        final /* synthetic */ C21621d f58050a;

        /* renamed from: a */
        public final void mo57827a() {
            C21621d.m72402a(this.f58050a).setVisibility(0);
            C21621d.m72404b(this.f58050a).setEnabled(false);
        }

        /* renamed from: b */
        public final void mo57828b() {
            C21621d.m72402a(this.f58050a).setVisibility(8);
            C21621d.m72404b(this.f58050a).setEnabled(true);
        }

        C21624c(C21621d dVar) {
            this.f58050a = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.d$d */
    static final class C21625d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21621d f58051a;

        C21625d(C21621d dVar) {
            this.f58051a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f58051a.mo57836b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.d$e */
    static final class C21626e<TTaskResult, TContinuationResult> implements C1591g<C21602c, Object> {

        /* renamed from: a */
        final /* synthetic */ C21621d f58052a;

        C21626e(C21621d dVar) {
            this.f58052a = dVar;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0056  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public kotlin.C7581n then(bolts.C1592h<com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21602c> r5) {
            /*
                r4 = this;
                boolean r0 = com.p280ss.android.ugc.aweme.utils.C43173w.m136926a(r5)
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L_0x0014
                com.ss.android.ugc.aweme.account.login.twostep.d r5 = r4.f58052a
                r5.f58045e = r1
                com.ss.android.ugc.aweme.account.login.twostep.d r5 = r4.f58052a
                java.lang.String r0 = "TwoStepAuthApi.verifySmsCode bolts Task error"
                r5.mo57835a(r2, r0)
                return r2
            L_0x0014:
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C7573i.m23582a(r5, r0)
                java.lang.Object r5 = r5.mo6890e()
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c r5 = (com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21602c) r5
                java.lang.String r0 = "success"
                java.lang.String r3 = r5.f58005a
                boolean r0 = kotlin.text.C7634n.m23717a(r0, r3, r1)
                if (r0 == 0) goto L_0x0046
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r0 = r5.f58006b
                if (r0 == 0) goto L_0x0046
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r0 = r5.f58006b
                java.lang.String r0 = r0.f58007a
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x003a
                goto L_0x0046
            L_0x003a:
                com.ss.android.ugc.aweme.account.login.twostep.d r0 = r4.f58052a
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r5 = r5.f58006b
                java.lang.String r5 = r5.f58007a
                r0.mo57838c(r5)
                kotlin.n r5 = kotlin.C7581n.f20898a
                return r5
            L_0x0046:
                com.ss.android.ugc.aweme.account.login.twostep.d r0 = r4.f58052a
                r0.f58045e = r1
                if (r5 == 0) goto L_0x0053
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r0 = r5.f58006b
                if (r0 == 0) goto L_0x0053
                java.lang.Integer r0 = r0.f58009c
                goto L_0x0054
            L_0x0053:
                r0 = r2
            L_0x0054:
                if (r5 == 0) goto L_0x005d
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r5 = r5.f58006b
                if (r5 == 0) goto L_0x005d
                java.lang.String r5 = r5.f58010d
                goto L_0x005e
            L_0x005d:
                r5 = r2
            L_0x005e:
                com.ss.android.ugc.aweme.account.login.twostep.d r1 = r4.f58052a
                r1.mo57835a(r0, r5)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.twostep.C21621d.C21626e.then(bolts.h):kotlin.n");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.d$f */
    static final class C21627f<TTaskResult, TContinuationResult> implements C1591g<C21600b, Object> {

        /* renamed from: a */
        final /* synthetic */ C21621d f58053a;

        C21627f(C21621d dVar) {
            this.f58053a = dVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C21866f then(C1592h<C21600b> hVar) {
            Integer num;
            String str;
            String str2;
            String str3 = null;
            if (C43173w.m136926a((C1592h) hVar)) {
                C7573i.m23582a((Object) hVar, "it");
                if (!C7634n.m23717a("error", ((C21600b) hVar.mo6890e()).f57997a, true)) {
                    if (TextUtils.isEmpty(C21621d.m72405c(this.f58053a).getText())) {
                        TextView c = C21621d.m72405c(this.f58053a);
                        Locale locale = Locale.US;
                        C7573i.m23582a((Object) locale, "Locale.US");
                        AppCompatActivity d = this.f58053a.mo57850d();
                        if (d == null) {
                            C7573i.m23580a();
                        }
                        String string = d.getString(R.string.aer);
                        C7573i.m23582a((Object) string, "getActivity()!!.getStrin…g.common_verify_sms_text)");
                        Object[] objArr = new Object[1];
                        C21601a aVar = ((C21600b) hVar.mo6890e()).f57998b;
                        if (aVar != null) {
                            str3 = aVar.f57999a;
                        }
                        objArr[0] = str3;
                        String a = C1642a.m8035a(locale, string, Arrays.copyOf(objArr, 1));
                        C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
                        c.setText(a);
                    }
                    C21621d.m72406d(this.f58053a).setEnabled(true);
                    C21621d.m72404b(this.f58053a).setEnabled(false);
                    this.f58053a.mo57837c();
                    return C21621d.m72402a(this.f58053a).mo58722c();
                }
            }
            if (C21621d.f58039f) {
                C7573i.m23582a((Object) hVar, "it");
                if (hVar.mo6891f() == null) {
                    C21601a aVar2 = ((C21600b) hVar.mo6890e()).f57998b;
                    if (aVar2 != null) {
                        str2 = aVar2.f58002d;
                    } else {
                        str2 = null;
                    }
                    new Exception(str2);
                }
            }
            C21621d dVar = this.f58053a;
            C7573i.m23582a((Object) hVar, "it");
            C21601a aVar3 = ((C21600b) hVar.mo6890e()).f57998b;
            if (aVar3 != null) {
                num = aVar3.f58003e;
            } else {
                num = null;
            }
            Exception f = hVar.mo6891f();
            if (f != null) {
                String message = f.getMessage();
                if (message != null) {
                    str = message;
                    dVar.mo57835a(num, str);
                    return null;
                }
            }
            C21601a aVar4 = ((C21600b) hVar.mo6890e()).f57998b;
            if (aVar4 != null) {
                str = aVar4.f58002d;
            } else {
                str = null;
            }
            dVar.mo57835a(num, str);
            return null;
        }
    }

    /* renamed from: e */
    private final void m72407e() {
        if (this.f58068h == null) {
            mo57835a(null, "JSON is empty");
        } else {
            C43173w.m136929b(new C21623b(this));
        }
    }

    /* renamed from: f */
    private final void m72408f() {
        LoadingCircleView loadingCircleView = this.f58046m;
        if (loadingCircleView == null) {
            C7573i.m23583a("loadingView");
        }
        loadingCircleView.setVisibility(0);
        LoadingCircleView loadingCircleView2 = this.f58046m;
        if (loadingCircleView2 == null) {
            C7573i.m23583a("loadingView");
        }
        loadingCircleView2.mo58683a();
    }

    /* renamed from: g */
    private final void m72410g() {
        View view = this.f58048o;
        if (view == null) {
            C7573i.m23583a("errorLayout");
        }
        view.setVisibility(8);
        CodeInputView codeInputView = this.f58042b;
        if (codeInputView == null) {
            C7573i.m23583a("codeInputView");
        }
        codeInputView.mo58649d();
    }

    /* renamed from: b */
    public final void mo57836b() {
        TwoStepAuthApi.f57989b.mo57788a(this.f58070j).mo6876a((C1591g<TResult, TContinuationResult>) new C21627f<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: c */
    public final void mo57837c() {
        LoadingCircleView loadingCircleView = this.f58046m;
        if (loadingCircleView == null) {
            C7573i.m23583a("loadingView");
        }
        loadingCircleView.mo58684b();
        LoadingCircleView loadingCircleView2 = this.f58046m;
        if (loadingCircleView2 == null) {
            C7573i.m23583a("loadingView");
        }
        loadingCircleView2.setVisibility(8);
    }

    /* renamed from: a */
    public final View mo57818a() {
        if (this.f58071k.getLayoutResource() <= 0) {
            this.f58071k.setLayoutResource(R.layout.abs);
        }
        View inflate = this.f58071k.inflate();
        C7573i.m23582a((Object) inflate, "view");
        m72403a(inflate);
        m72407e();
        return inflate;
    }

    /* renamed from: a */
    public static final /* synthetic */ TimerTextView m72402a(C21621d dVar) {
        TimerTextView timerTextView = dVar.f58041a;
        if (timerTextView == null) {
            C7573i.m23583a("timerText");
        }
        return timerTextView;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m72404b(C21621d dVar) {
        View view = dVar.f58044d;
        if (view == null) {
            C7573i.m23583a("resendCodeBtn");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ TextView m72405c(C21621d dVar) {
        TextView textView = dVar.f58043c;
        if (textView == null) {
            C7573i.m23583a("descriptionText");
        }
        return textView;
    }

    /* renamed from: d */
    public static final /* synthetic */ CodeInputView m72406d(C21621d dVar) {
        CodeInputView codeInputView = dVar.f58042b;
        if (codeInputView == null) {
            C7573i.m23583a("codeInputView");
        }
        return codeInputView;
    }

    /* renamed from: f */
    private final void m72409f(String str) {
        View view = this.f58048o;
        if (view == null) {
            C7573i.m23583a("errorLayout");
        }
        view.setVisibility(0);
        TextView textView = this.f58047n;
        if (textView == null) {
            C7573i.m23583a("errorText");
        }
        textView.setText(str);
        CodeInputView codeInputView = this.f58042b;
        if (codeInputView == null) {
            C7573i.m23583a("codeInputView");
        }
        codeInputView.mo58648c();
    }

    /* renamed from: b */
    public final void mo57823b(String str) {
        C7573i.m23587b(str, "currentText");
        if (this.f58045e) {
            CodeInputView codeInputView = this.f58042b;
            if (codeInputView == null) {
                C7573i.m23583a("codeInputView");
            }
            codeInputView.setText("");
            this.f58045e = false;
        }
        m72410g();
    }

    /* renamed from: c */
    public final void mo57838c(String str) {
        mo57837c();
        m72410g();
        mo57852e(str);
    }

    /* renamed from: a */
    public final void mo57821a(String str) {
        C7573i.m23587b(str, "codes");
        this.f58045e = false;
        m72408f();
        m72410g();
        TwoStepAuthApi.f57989b.mo57790a(null, str, this.f58070j).mo6876a((C1591g<TResult, TContinuationResult>) new C21626e<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: a */
    private final void m72403a(View view) {
        View findViewById = view.findViewById(R.id.d8d);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.s…de_authenticator_loading)");
        this.f58046m = (LoadingCircleView) findViewById;
        View findViewById2 = view.findViewById(R.id.d8_);
        C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.s…_code_authenticator_desc)");
        this.f58043c = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.d8c);
        C7573i.m23582a((Object) findViewById3, "view.findViewById(R.id.s…code_authenticator_input)");
        this.f58042b = (CodeInputView) findViewById3;
        View findViewById4 = view.findViewById(R.id.d8e);
        C7573i.m23582a((Object) findViewById4, "view.findViewById(R.id.s…ode_authenticator_resend)");
        this.f58044d = findViewById4;
        View findViewById5 = view.findViewById(R.id.d8f);
        C7573i.m23582a((Object) findViewById5, "view.findViewById(R.id.s…code_authenticator_timer)");
        this.f58041a = (TimerTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.d8a);
        C7573i.m23582a((Object) findViewById6, "view.findViewById(R.id.s…thenticator_error_layout)");
        this.f58048o = findViewById6;
        View findViewById7 = view.findViewById(R.id.d8b);
        C7573i.m23582a((Object) findViewById7, "view.findViewById(R.id.s…authenticator_error_text)");
        this.f58047n = (TextView) findViewById7;
        TimerTextView timerTextView = this.f58041a;
        if (timerTextView == null) {
            C7573i.m23583a("timerText");
        }
        timerTextView.mo58720a(60000, 1000, "s");
        TimerTextView timerTextView2 = this.f58041a;
        if (timerTextView2 == null) {
            C7573i.m23583a("timerText");
        }
        timerTextView2.setCallback(new C21624c(this));
        View view2 = this.f58044d;
        if (view2 == null) {
            C7573i.m23583a("resendCodeBtn");
        }
        view2.setEnabled(false);
        View view3 = this.f58044d;
        if (view3 == null) {
            C7573i.m23583a("resendCodeBtn");
        }
        view3.setOnClickListener(new C21625d(this));
        CodeInputView codeInputView = this.f58042b;
        if (codeInputView == null) {
            C7573i.m23583a("codeInputView");
        }
        codeInputView.setEnabled(false);
        CodeInputView codeInputView2 = this.f58042b;
        if (codeInputView2 == null) {
            C7573i.m23583a("codeInputView");
        }
        codeInputView2.mo58644a();
        CodeInputView codeInputView3 = this.f58042b;
        if (codeInputView3 == null) {
            C7573i.m23583a("codeInputView");
        }
        codeInputView3.mo58646b();
        CodeInputView codeInputView4 = this.f58042b;
        if (codeInputView4 == null) {
            C7573i.m23583a("codeInputView");
        }
        codeInputView4.setCallback(this);
    }

    /* renamed from: a */
    public final void mo57835a(Integer num, String str) {
        mo57837c();
        m72409f(mo57849b(num, str));
    }

    public C21621d(AppCompatActivity appCompatActivity, ViewStub viewStub, C21636a aVar) {
        C7573i.m23587b(appCompatActivity, "activity");
        C7573i.m23587b(viewStub, "stub");
        C7573i.m23587b(aVar, "authCallback");
        super(appCompatActivity, viewStub, aVar);
    }
}
