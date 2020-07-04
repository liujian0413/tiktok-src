package com.p280ss.android.ugc.aweme.account.login.twostep;

import android.support.p029v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9730f;
import com.p280ss.android.ugc.aweme.account.C21173f;
import com.p280ss.android.ugc.aweme.account.login.p975v2.p977ui.InputResultIndicator;
import com.p280ss.android.ugc.aweme.account.login.twostep.C21635g.C21636a;
import com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21602c;
import com.p280ss.android.ugc.aweme.account.p982ui.InputWithIndicator;
import com.p280ss.android.ugc.aweme.account.p982ui.LoadingButton;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.c */
public final class C21615c extends C21635g {

    /* renamed from: b */
    public static final boolean f58030b = C7163a.m22363a();

    /* renamed from: c */
    public static final C21616a f58031c = new C21616a(null);

    /* renamed from: a */
    public LoadingButton f58032a;

    /* renamed from: d */
    private InputWithIndicator f58033d;

    /* renamed from: e */
    private InputResultIndicator f58034e;

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.c$a */
    public static final class C21616a {
        private C21616a() {
        }

        public /* synthetic */ C21616a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.c$b */
    static final class C21617b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C21615c f58035a;

        C21617b(C21615c cVar) {
            this.f58035a = cVar;
        }

        public final void run() {
            JSONObject jSONObject;
            JSONObject jSONObject2 = this.f58035a.f58068h;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.getJSONObject("data");
            } else {
                jSONObject = null;
            }
            C21615c cVar = this.f58035a;
            String a = C9730f.m28665a(jSONObject, "verify_ticket", "");
            C7573i.m23582a((Object) a, "JsonUtils.queryString(da…rConst.VERIFY_TICKET, \"\")");
            cVar.mo57851d(a);
            if (TextUtils.isEmpty(this.f58035a.f58070j)) {
                this.f58035a.mo57830a(null, "Cannot find verify ticket from JSON data");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.c$c */
    public static final class C21618c extends C21173f {

        /* renamed from: a */
        final /* synthetic */ C21615c f58036a;

        C21618c(C21615c cVar) {
            this.f58036a = cVar;
        }

        public final void afterTextChanged(Editable editable) {
            String str;
            boolean z;
            LoadingButton a = C21615c.m72392a(this.f58036a);
            if (editable != null) {
                str = editable.toString();
            } else {
                str = null;
            }
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            a.setEnabled(!z);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.c$d */
    static final class C21619d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21615c f58037a;

        C21619d(C21615c cVar) {
            this.f58037a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f58037a.mo57832b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.c$e */
    static final class C21620e<TTaskResult, TContinuationResult> implements C1591g<C21602c, Object> {

        /* renamed from: a */
        final /* synthetic */ C21615c f58038a;

        C21620e(C21615c cVar) {
            this.f58038a = cVar;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:22:0x005d  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public kotlin.C7581n then(bolts.C1592h<com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21602c> r5) {
            /*
                r4 = this;
                boolean r0 = com.p280ss.android.ugc.aweme.utils.C43173w.m136926a(r5)
                r1 = 0
                if (r0 != 0) goto L_0x001e
                com.ss.android.ugc.aweme.account.login.twostep.c r0 = r4.f58038a
                java.lang.String r2 = "it"
                kotlin.jvm.internal.C7573i.m23582a(r5, r2)
                java.lang.Exception r5 = r5.mo6891f()
                if (r5 == 0) goto L_0x0019
                java.lang.String r5 = r5.toString()
                goto L_0x001a
            L_0x0019:
                r5 = r1
            L_0x001a:
                r0.mo57830a(r1, r5)
                return r1
            L_0x001e:
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C7573i.m23582a(r5, r0)
                java.lang.Object r5 = r5.mo6890e()
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c r5 = (com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21602c) r5
                java.lang.String r0 = "success"
                java.lang.String r2 = r5.f58005a
                r3 = 1
                boolean r0 = kotlin.text.C7634n.m23717a(r0, r2, r3)
                if (r0 == 0) goto L_0x0051
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r0 = r5.f58006b
                if (r0 == 0) goto L_0x0051
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r0 = r5.f58006b
                java.lang.String r0 = r0.f58007a
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0045
                goto L_0x0051
            L_0x0045:
                com.ss.android.ugc.aweme.account.login.twostep.c r0 = r4.f58038a
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r5 = r5.f58006b
                java.lang.String r5 = r5.f58007a
                r0.mo57831a(r5)
                kotlin.n r5 = kotlin.C7581n.f20898a
                return r5
            L_0x0051:
                if (r5 == 0) goto L_0x005a
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r0 = r5.f58006b
                if (r0 == 0) goto L_0x005a
                java.lang.Integer r0 = r0.f58009c
                goto L_0x005b
            L_0x005a:
                r0 = r1
            L_0x005b:
                if (r5 == 0) goto L_0x0064
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r5 = r5.f58006b
                if (r5 == 0) goto L_0x0064
                java.lang.String r5 = r5.f58010d
                goto L_0x0065
            L_0x0064:
                r5 = r1
            L_0x0065:
                com.ss.android.ugc.aweme.account.login.twostep.c r2 = r4.f58038a
                r2.mo57830a(r0, r5)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.twostep.C21615c.C21620e.then(bolts.h):kotlin.n");
        }
    }

    /* renamed from: c */
    private final void m72395c() {
        if (this.f58068h == null) {
            mo57830a(null, "JSON is empty");
        } else {
            C43173w.m136929b(new C21617b(this));
        }
    }

    /* renamed from: e */
    private final void m72396e() {
        InputResultIndicator inputResultIndicator = this.f58034e;
        if (inputResultIndicator == null) {
            C7573i.m23583a("passwordInputResult");
        }
        inputResultIndicator.mo58394a();
        LoadingButton loadingButton = this.f58032a;
        if (loadingButton == null) {
            C7573i.m23583a("loadingButton");
        }
        loadingButton.mo58680b();
    }

    /* renamed from: a */
    public final View mo57818a() {
        if (this.f58071k.getLayoutResource() <= 0) {
            this.f58071k.setLayoutResource(R.layout.abr);
        }
        View inflate = this.f58071k.inflate();
        C7573i.m23582a((Object) inflate, "view");
        m72393a(inflate);
        m72395c();
        return inflate;
    }

    /* renamed from: b */
    public final void mo57832b() {
        boolean z;
        InputWithIndicator inputWithIndicator = this.f58033d;
        if (inputWithIndicator == null) {
            C7573i.m23583a("passwordInput");
        }
        String text = inputWithIndicator.getText();
        if (text.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            AppCompatActivity d = mo57850d();
            if (d == null) {
                C7573i.m23580a();
            }
            String string = d.getString(R.string.b21);
            C7573i.m23582a((Object) string, "getActivity()!!.getStrin…ing.error_password_empty)");
            m72394b(string);
            return;
        }
        LoadingButton loadingButton = this.f58032a;
        if (loadingButton == null) {
            C7573i.m23583a("loadingButton");
        }
        loadingButton.mo58679a();
        TwoStepAuthApi.f57989b.mo57789a(text, this.f58070j).mo6876a((C1591g<TResult, TContinuationResult>) new C21620e<TResult,TContinuationResult>(this), C1592h.f5958b);
    }

    /* renamed from: a */
    public static final /* synthetic */ LoadingButton m72392a(C21615c cVar) {
        LoadingButton loadingButton = cVar.f58032a;
        if (loadingButton == null) {
            C7573i.m23583a("loadingButton");
        }
        return loadingButton;
    }

    /* renamed from: b */
    private final void m72394b(String str) {
        InputResultIndicator inputResultIndicator = this.f58034e;
        if (inputResultIndicator == null) {
            C7573i.m23583a("passwordInputResult");
        }
        inputResultIndicator.mo58395a(str);
        LoadingButton loadingButton = this.f58032a;
        if (loadingButton == null) {
            C7573i.m23583a("loadingButton");
        }
        loadingButton.mo58680b();
    }

    /* renamed from: a */
    public final void mo57831a(String str) {
        m72396e();
        mo57852e(str);
    }

    /* renamed from: a */
    private final void m72393a(View view) {
        View findViewById = view.findViewById(R.id.c_g);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.p…ord_authenticator_button)");
        this.f58032a = (LoadingButton) findViewById;
        View findViewById2 = view.findViewById(R.id.c_i);
        C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.p…word_authenticator_input)");
        this.f58033d = (InputWithIndicator) findViewById2;
        View findViewById3 = view.findViewById(R.id.c_j);
        C7573i.m23582a((Object) findViewById3, "view.findViewById(R.id.p…thenticator_input_result)");
        this.f58034e = (InputResultIndicator) findViewById3;
        InputWithIndicator inputWithIndicator = this.f58033d;
        if (inputWithIndicator == null) {
            C7573i.m23583a("passwordInput");
        }
        inputWithIndicator.setTextWatcher(new C21618c(this));
        LoadingButton loadingButton = this.f58032a;
        if (loadingButton == null) {
            C7573i.m23583a("loadingButton");
        }
        loadingButton.setEnabled(false);
        LoadingButton loadingButton2 = this.f58032a;
        if (loadingButton2 == null) {
            C7573i.m23583a("loadingButton");
        }
        loadingButton2.setOnClickListener(new C21619d(this));
    }

    /* renamed from: a */
    public final void mo57830a(Integer num, String str) {
        m72394b(mo57849b(num, str));
    }

    public C21615c(AppCompatActivity appCompatActivity, ViewStub viewStub, C21636a aVar) {
        C7573i.m23587b(appCompatActivity, "activity");
        C7573i.m23587b(viewStub, "stub");
        C7573i.m23587b(aVar, "authCallback");
        super(appCompatActivity, viewStub, aVar);
    }
}
