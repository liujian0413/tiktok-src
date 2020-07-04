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
import com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21598a;
import com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21598a.C21599a;
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

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.b */
public final class C21608b extends C21635g implements C22248a {

    /* renamed from: f */
    public static final boolean f58015f = C7163a.m22363a();

    /* renamed from: g */
    public static final C21609a f58016g = new C21609a(null);

    /* renamed from: a */
    public TimerTextView f58017a;

    /* renamed from: b */
    public CodeInputView f58018b;

    /* renamed from: c */
    public TextView f58019c;

    /* renamed from: d */
    public View f58020d;

    /* renamed from: e */
    public boolean f58021e;

    /* renamed from: m */
    private LoadingCircleView f58022m;

    /* renamed from: n */
    private TextView f58023n;

    /* renamed from: o */
    private View f58024o;

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.b$a */
    public static final class C21609a {
        private C21609a() {
        }

        public /* synthetic */ C21609a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.b$b */
    static final class C21610b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C21608b f58025a;

        C21610b(C21608b bVar) {
            this.f58025a = bVar;
        }

        public final void run() {
            JSONObject jSONObject;
            JSONObject jSONObject2 = this.f58025a.f58068h;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.getJSONObject("data");
            } else {
                jSONObject = null;
            }
            C21608b bVar = this.f58025a;
            String a = C9730f.m28665a(jSONObject, "verify_ticket", "");
            C7573i.m23582a((Object) a, "JsonUtils.queryString(da…rConst.VERIFY_TICKET, \"\")");
            bVar.mo57851d(a);
            if (!TextUtils.isEmpty(this.f58025a.f58070j)) {
                this.f58025a.mo57822b();
            } else {
                this.f58025a.mo57820a(null, "Cannot find verify ticket from JSON data");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.b$c */
    public static final class C21611c extends C21868b {

        /* renamed from: a */
        final /* synthetic */ C21608b f58026a;

        /* renamed from: a */
        public final void mo57827a() {
            C21608b.m72372a(this.f58026a).setVisibility(0);
            C21608b.m72374b(this.f58026a).setEnabled(false);
        }

        /* renamed from: b */
        public final void mo57828b() {
            C21608b.m72372a(this.f58026a).setVisibility(8);
            C21608b.m72374b(this.f58026a).setEnabled(true);
        }

        C21611c(C21608b bVar) {
            this.f58026a = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.b$d */
    static final class C21612d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21608b f58027a;

        C21612d(C21608b bVar) {
            this.f58027a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f58027a.mo57822b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.b$e */
    static final class C21613e<TTaskResult, TContinuationResult> implements C1591g<C21602c, Object> {

        /* renamed from: a */
        final /* synthetic */ C21608b f58028a;

        C21613e(C21608b bVar) {
            this.f58028a = bVar;
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
                com.ss.android.ugc.aweme.account.login.twostep.b r5 = r4.f58028a
                r5.f58021e = r1
                com.ss.android.ugc.aweme.account.login.twostep.b r5 = r4.f58028a
                java.lang.String r0 = "TwoStepAuthApi.verifyEmailCode bolts Task error"
                r5.mo57820a(r2, r0)
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
                com.ss.android.ugc.aweme.account.login.twostep.b r0 = r4.f58028a
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r5 = r5.f58006b
                java.lang.String r5 = r5.f58007a
                r0.mo57825c(r5)
                kotlin.n r5 = kotlin.C7581n.f20898a
                return r5
            L_0x0046:
                com.ss.android.ugc.aweme.account.login.twostep.b r0 = r4.f58028a
                r0.f58021e = r1
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
                com.ss.android.ugc.aweme.account.login.twostep.b r1 = r4.f58028a
                r1.mo57820a(r0, r5)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.twostep.C21608b.C21613e.then(bolts.h):kotlin.n");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.b$f */
    static final class C21614f<TTaskResult, TContinuationResult> implements C1591g<C21598a, Object> {

        /* renamed from: a */
        final /* synthetic */ C21608b f58029a;

        C21614f(C21608b bVar) {
            this.f58029a = bVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public C21866f then(C1592h<C21598a> hVar) {
            Integer num;
            String str;
            String str2;
            String str3 = null;
            if (C43173w.m136926a((C1592h) hVar)) {
                C7573i.m23582a((Object) hVar, "it");
                if (!C7634n.m23717a("error", ((C21598a) hVar.mo6890e()).f57991a, true)) {
                    if (TextUtils.isEmpty(C21608b.m72375c(this.f58029a).getText())) {
                        TextView c = C21608b.m72375c(this.f58029a);
                        Locale locale = Locale.US;
                        C7573i.m23582a((Object) locale, "Locale.US");
                        AppCompatActivity d = this.f58029a.mo57850d();
                        if (d == null) {
                            C7573i.m23580a();
                        }
                        String string = d.getString(R.string.aek);
                        C7573i.m23582a((Object) string, "getActivity()!!.getStrin…common_verify_email_text)");
                        Object[] objArr = new Object[1];
                        C21599a aVar = ((C21598a) hVar.mo6890e()).f57992b;
                        if (aVar != null) {
                            str3 = aVar.f57993a;
                        }
                        objArr[0] = str3;
                        String a = C1642a.m8035a(locale, string, Arrays.copyOf(objArr, 1));
                        C7573i.m23582a((Object) a, "java.lang.String.format(locale, format, *args)");
                        c.setText(a);
                    }
                    C21608b.m72376d(this.f58029a).setEnabled(true);
                    C21608b.m72374b(this.f58029a).setEnabled(false);
                    this.f58029a.mo57824c();
                    return C21608b.m72372a(this.f58029a).mo58722c();
                }
            }
            if (C21608b.f58015f) {
                C7573i.m23582a((Object) hVar, "it");
                if (hVar.mo6891f() == null) {
                    C21599a aVar2 = ((C21598a) hVar.mo6890e()).f57992b;
                    if (aVar2 != null) {
                        str2 = aVar2.f57995c;
                    } else {
                        str2 = null;
                    }
                    new Exception(str2);
                }
            }
            C21608b bVar = this.f58029a;
            C7573i.m23582a((Object) hVar, "it");
            C21599a aVar3 = ((C21598a) hVar.mo6890e()).f57992b;
            if (aVar3 != null) {
                num = aVar3.f57996d;
            } else {
                num = null;
            }
            Exception f = hVar.mo6891f();
            if (f != null) {
                String message = f.getMessage();
                if (message != null) {
                    str = message;
                    bVar.mo57820a(num, str);
                    return null;
                }
            }
            C21599a aVar4 = ((C21598a) hVar.mo6890e()).f57992b;
            if (aVar4 != null) {
                str = aVar4.f57995c;
            } else {
                str = null;
            }
            bVar.mo57820a(num, str);
            return null;
        }
    }

    /* renamed from: e */
    private final void m72377e() {
        if (this.f58068h == null) {
            mo57820a(null, "JSON is empty");
        } else {
            C43173w.m136929b(new C21610b(this));
        }
    }

    /* renamed from: f */
    private final void m72378f() {
        LoadingCircleView loadingCircleView = this.f58022m;
        if (loadingCircleView == null) {
            C7573i.m23583a("loadingView");
        }
        loadingCircleView.setVisibility(0);
        LoadingCircleView loadingCircleView2 = this.f58022m;
        if (loadingCircleView2 == null) {
            C7573i.m23583a("loadingView");
        }
        loadingCircleView2.mo58683a();
    }

    /* renamed from: g */
    private final void m72380g() {
        View view = this.f58024o;
        if (view == null) {
            C7573i.m23583a("errorLayout");
        }
        view.setVisibility(8);
        CodeInputView codeInputView = this.f58018b;
        if (codeInputView == null) {
            C7573i.m23583a("codeInputView");
        }
        codeInputView.mo58649d();
    }

    /* renamed from: b */
    public final void mo57822b() {
        TwoStepAuthApi.f57989b.mo57792b(this.f58070j).mo6876a((C1591g<TResult, TContinuationResult>) new C21614f<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: c */
    public final void mo57824c() {
        LoadingCircleView loadingCircleView = this.f58022m;
        if (loadingCircleView == null) {
            C7573i.m23583a("loadingView");
        }
        loadingCircleView.mo58684b();
        LoadingCircleView loadingCircleView2 = this.f58022m;
        if (loadingCircleView2 == null) {
            C7573i.m23583a("loadingView");
        }
        loadingCircleView2.setVisibility(8);
    }

    /* renamed from: a */
    public final View mo57818a() {
        if (this.f58071k.getLayoutResource() <= 0) {
            this.f58071k.setLayoutResource(R.layout.abq);
        }
        View inflate = this.f58071k.inflate();
        C7573i.m23582a((Object) inflate, "view");
        m72373a(inflate);
        m72377e();
        return inflate;
    }

    /* renamed from: a */
    public static final /* synthetic */ TimerTextView m72372a(C21608b bVar) {
        TimerTextView timerTextView = bVar.f58017a;
        if (timerTextView == null) {
            C7573i.m23583a("timerText");
        }
        return timerTextView;
    }

    /* renamed from: b */
    public static final /* synthetic */ View m72374b(C21608b bVar) {
        View view = bVar.f58020d;
        if (view == null) {
            C7573i.m23583a("resendCodeBtn");
        }
        return view;
    }

    /* renamed from: c */
    public static final /* synthetic */ TextView m72375c(C21608b bVar) {
        TextView textView = bVar.f58019c;
        if (textView == null) {
            C7573i.m23583a("descriptionText");
        }
        return textView;
    }

    /* renamed from: d */
    public static final /* synthetic */ CodeInputView m72376d(C21608b bVar) {
        CodeInputView codeInputView = bVar.f58018b;
        if (codeInputView == null) {
            C7573i.m23583a("codeInputView");
        }
        return codeInputView;
    }

    /* renamed from: f */
    private final void m72379f(String str) {
        View view = this.f58024o;
        if (view == null) {
            C7573i.m23583a("errorLayout");
        }
        view.setVisibility(0);
        TextView textView = this.f58023n;
        if (textView == null) {
            C7573i.m23583a("errorText");
        }
        textView.setText(str);
        CodeInputView codeInputView = this.f58018b;
        if (codeInputView == null) {
            C7573i.m23583a("codeInputView");
        }
        codeInputView.mo58648c();
    }

    /* renamed from: b */
    public final void mo57823b(String str) {
        C7573i.m23587b(str, "currentText");
        if (this.f58021e) {
            CodeInputView codeInputView = this.f58018b;
            if (codeInputView == null) {
                C7573i.m23583a("codeInputView");
            }
            codeInputView.setText("");
            this.f58021e = false;
        }
        m72380g();
    }

    /* renamed from: c */
    public final void mo57825c(String str) {
        mo57824c();
        m72380g();
        mo57852e(str);
    }

    /* renamed from: a */
    public final void mo57821a(String str) {
        C7573i.m23587b(str, "codes");
        this.f58021e = false;
        m72378f();
        m72380g();
        TwoStepAuthApi.f57989b.mo57793b(null, str, this.f58070j).mo6876a((C1591g<TResult, TContinuationResult>) new C21613e<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: a */
    private final void m72373a(View view) {
        View findViewById = view.findViewById(R.id.ado);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.e…de_authenticator_loading)");
        this.f58022m = (LoadingCircleView) findViewById;
        View findViewById2 = view.findViewById(R.id.adk);
        C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.e…_code_authenticator_desc)");
        this.f58019c = (TextView) findViewById2;
        View findViewById3 = view.findViewById(R.id.adn);
        C7573i.m23582a((Object) findViewById3, "view.findViewById(R.id.e…code_authenticator_input)");
        this.f58018b = (CodeInputView) findViewById3;
        View findViewById4 = view.findViewById(R.id.adp);
        C7573i.m23582a((Object) findViewById4, "view.findViewById(R.id.e…ode_authenticator_resend)");
        this.f58020d = findViewById4;
        View findViewById5 = view.findViewById(R.id.adq);
        C7573i.m23582a((Object) findViewById5, "view.findViewById(R.id.e…code_authenticator_timer)");
        this.f58017a = (TimerTextView) findViewById5;
        View findViewById6 = view.findViewById(R.id.adl);
        C7573i.m23582a((Object) findViewById6, "view.findViewById(R.id.e…thenticator_error_layout)");
        this.f58024o = findViewById6;
        View findViewById7 = view.findViewById(R.id.adm);
        C7573i.m23582a((Object) findViewById7, "view.findViewById(R.id.e…authenticator_error_text)");
        this.f58023n = (TextView) findViewById7;
        TimerTextView timerTextView = this.f58017a;
        if (timerTextView == null) {
            C7573i.m23583a("timerText");
        }
        timerTextView.mo58720a(60000, 1000, "s");
        TimerTextView timerTextView2 = this.f58017a;
        if (timerTextView2 == null) {
            C7573i.m23583a("timerText");
        }
        timerTextView2.setCallback(new C21611c(this));
        View view2 = this.f58020d;
        if (view2 == null) {
            C7573i.m23583a("resendCodeBtn");
        }
        view2.setEnabled(false);
        View view3 = this.f58020d;
        if (view3 == null) {
            C7573i.m23583a("resendCodeBtn");
        }
        view3.setOnClickListener(new C21612d(this));
        CodeInputView codeInputView = this.f58018b;
        if (codeInputView == null) {
            C7573i.m23583a("codeInputView");
        }
        codeInputView.setEnabled(false);
        CodeInputView codeInputView2 = this.f58018b;
        if (codeInputView2 == null) {
            C7573i.m23583a("codeInputView");
        }
        codeInputView2.mo58644a();
        CodeInputView codeInputView3 = this.f58018b;
        if (codeInputView3 == null) {
            C7573i.m23583a("codeInputView");
        }
        codeInputView3.mo58646b();
        CodeInputView codeInputView4 = this.f58018b;
        if (codeInputView4 == null) {
            C7573i.m23583a("codeInputView");
        }
        codeInputView4.setCallback(this);
    }

    /* renamed from: a */
    public final void mo57820a(Integer num, String str) {
        mo57824c();
        m72379f(mo57849b(num, str));
    }

    public C21608b(AppCompatActivity appCompatActivity, ViewStub viewStub, C21636a aVar) {
        C7573i.m23587b(appCompatActivity, "activity");
        C7573i.m23587b(viewStub, "stub");
        C7573i.m23587b(aVar, "authCallback");
        super(appCompatActivity, viewStub, aVar);
    }
}
