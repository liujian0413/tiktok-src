package com.p280ss.android.ugc.aweme.account.login.twostep;

import android.content.Context;
import android.content.Intent;
import android.support.p029v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.widget.ImageView;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9730f;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.dmt.p262ui.p564d.C10789c;
import com.p280ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity;
import com.p280ss.android.ugc.aweme.account.login.twostep.C21635g.C21636a;
import com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity.C21594b;
import com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21602c;
import com.p280ss.android.ugc.aweme.account.p982ui.LoadingButton;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.e */
public final class C21628e extends C21635g implements C21594b {

    /* renamed from: d */
    public static final boolean f58054d = C7163a.m22363a();

    /* renamed from: e */
    public static final C21629a f58055e = new C21629a(null);

    /* renamed from: a */
    public LoadingButton f58056a;

    /* renamed from: b */
    public ImageView f58057b;

    /* renamed from: c */
    public String f58058c;

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.e$a */
    public static final class C21629a {
        private C21629a() {
        }

        public /* synthetic */ C21629a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.e$b */
    static final class C21630b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C21628e f58059a;

        C21630b(C21628e eVar) {
            this.f58059a = eVar;
        }

        public final void run() {
            JSONObject jSONObject;
            JSONArray jSONArray;
            JSONObject jSONObject2 = this.f58059a.f58068h;
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.getJSONObject("data");
            } else {
                jSONObject = null;
            }
            C21628e eVar = this.f58059a;
            String a = C9730f.m28665a(jSONObject, "verify_ticket", "");
            C7573i.m23582a((Object) a, "JsonUtils.queryString(da…rConst.VERIFY_TICKET, \"\")");
            eVar.mo57851d(a);
            if (jSONObject != null) {
                jSONArray = jSONObject.getJSONArray("platforms");
            } else {
                jSONArray = null;
            }
            if (TextUtils.isEmpty(this.f58059a.f58070j) || jSONArray == null || jSONArray.length() <= 0) {
                this.f58059a.mo57841a(null, "Verify ticket or platform is unavailable");
                return;
            }
            this.f58059a.f58058c = jSONArray.getString(0);
            final int a2 = C21628e.m72422a(this.f58059a.f58058c);
            if (a2 <= 0) {
                C21628e eVar2 = this.f58059a;
                StringBuilder sb = new StringBuilder("Unknown third party platform: ");
                sb.append(this.f58059a.f58058c);
                eVar2.mo57841a(null, sb.toString());
                return;
            }
            C43173w.m136924a((Runnable) new Runnable(this) {

                /* renamed from: a */
                final /* synthetic */ C21630b f58060a;

                {
                    this.f58060a = r1;
                }

                public final void run() {
                    C21628e.m72423a(this.f58060a.f58059a).setEnabled(true);
                    C21628e.m72426b(this.f58060a.f58059a).setImageResource(a2);
                }
            });
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.e$c */
    static final class C21632c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C21628e f58062a;

        C21632c(C21628e eVar) {
            this.f58062a = eVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C21628e.m72423a(this.f58062a).mo58679a();
            Intent intent = new Intent(this.f58062a.mo57850d(), AuthorizeActivity.class);
            intent.putExtra("platform", this.f58062a.f58058c);
            intent.putExtra("is_only_fetch_token", true);
            intent.putExtra("is_login", false);
            if (this.f58062a.mo57850d() instanceof TwoStepAuthActivity) {
                AppCompatActivity d = this.f58062a.mo57850d();
                if (d != null) {
                    ((TwoStepAuthActivity) d).f57979e = this.f58062a;
                } else {
                    throw new TypeCastException("null cannot be cast to non-null type com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity");
                }
            }
            AppCompatActivity d2 = this.f58062a.mo57850d();
            if (d2 != null) {
                d2.startActivityForResult(intent, 123);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.e$d */
    static final class C21633d<TTaskResult, TContinuationResult> implements C1591g<C21602c, Object> {

        /* renamed from: a */
        final /* synthetic */ C21628e f58063a;

        C21633d(C21628e eVar) {
            this.f58063a = eVar;
        }

        /* access modifiers changed from: private */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x004e  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public kotlin.C7581n then(bolts.C1592h<com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21602c> r5) {
            /*
                r4 = this;
                boolean r0 = com.p280ss.android.ugc.aweme.utils.C43173w.m136926a(r5)
                r1 = 0
                if (r0 != 0) goto L_0x000f
                com.ss.android.ugc.aweme.account.login.twostep.e r5 = r4.f58063a
                java.lang.String r0 = "TwoStepAuthApi.verifyThirdParty bolts Task error"
                r5.mo57841a(r1, r0)
                return r1
            L_0x000f:
                java.lang.String r0 = "it"
                kotlin.jvm.internal.C7573i.m23582a(r5, r0)
                java.lang.Object r5 = r5.mo6890e()
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c r5 = (com.p280ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi.C21602c) r5
                java.lang.String r0 = "success"
                java.lang.String r2 = r5.f58005a
                r3 = 1
                boolean r0 = kotlin.text.C7634n.m23717a(r0, r2, r3)
                if (r0 == 0) goto L_0x0042
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r0 = r5.f58006b
                if (r0 == 0) goto L_0x0042
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r0 = r5.f58006b
                java.lang.String r0 = r0.f58007a
                java.lang.CharSequence r0 = (java.lang.CharSequence) r0
                boolean r0 = android.text.TextUtils.isEmpty(r0)
                if (r0 == 0) goto L_0x0036
                goto L_0x0042
            L_0x0036:
                com.ss.android.ugc.aweme.account.login.twostep.e r0 = r4.f58063a
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r5 = r5.f58006b
                java.lang.String r5 = r5.f58007a
                r0.mo57842b(r5)
                kotlin.n r5 = kotlin.C7581n.f20898a
                return r5
            L_0x0042:
                if (r5 == 0) goto L_0x004b
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r0 = r5.f58006b
                if (r0 == 0) goto L_0x004b
                java.lang.Integer r0 = r0.f58009c
                goto L_0x004c
            L_0x004b:
                r0 = r1
            L_0x004c:
                if (r5 == 0) goto L_0x0055
                com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthApi$c$a r5 = r5.f58006b
                if (r5 == 0) goto L_0x0055
                java.lang.String r5 = r5.f58010d
                goto L_0x0056
            L_0x0055:
                r5 = r1
            L_0x0056:
                com.ss.android.ugc.aweme.account.login.twostep.e r2 = r4.f58063a
                r2.mo57841a(r0, r5)
                com.ss.android.ugc.aweme.account.login.twostep.e r0 = r4.f58063a
                android.support.v7.app.AppCompatActivity r0 = r0.mo57850d()
                android.content.Context r0 = (android.content.Context) r0
                com.bytedance.ies.dmt.ui.c.a r5 = com.bytedance.ies.dmt.p262ui.p563c.C10761a.m31403c(r0, r5)
                r5.mo25750a()
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.twostep.C21628e.C21633d.then(bolts.h):kotlin.n");
        }
    }

    /* renamed from: b */
    private final void m72427b() {
        if (this.f58068h == null) {
            mo57841a(null, "JSON is empty");
        } else {
            C43173w.m136929b(new C21630b(this));
        }
    }

    /* renamed from: a */
    public final View mo57818a() {
        if (this.f58071k.getLayoutResource() <= 0) {
            this.f58071k.setLayoutResource(R.layout.abt);
        }
        View inflate = this.f58071k.inflate();
        C7573i.m23582a((Object) inflate, "view");
        m72424a(inflate);
        m72427b();
        return inflate;
    }

    /* renamed from: a */
    public static final /* synthetic */ LoadingButton m72423a(C21628e eVar) {
        LoadingButton loadingButton = eVar.f58056a;
        if (loadingButton == null) {
            C7573i.m23583a("verifyButton");
        }
        return loadingButton;
    }

    /* renamed from: b */
    public static final /* synthetic */ ImageView m72426b(C21628e eVar) {
        ImageView imageView = eVar.f58057b;
        if (imageView == null) {
            C7573i.m23583a("providerImage");
        }
        return imageView;
    }

    /* renamed from: b */
    public final void mo57842b(String str) {
        LoadingButton loadingButton = this.f58056a;
        if (loadingButton == null) {
            C7573i.m23583a("verifyButton");
        }
        loadingButton.mo58680b();
        mo57852e(str);
    }

    /* renamed from: a */
    public static int m72422a(String str) {
        if (str != null) {
            switch (str.hashCode()) {
                case -1240244679:
                    if (str.equals("google")) {
                        return R.drawable.wc;
                    }
                    break;
                case -916346253:
                    if (str.equals("twitter")) {
                        return R.drawable.wg;
                    }
                    break;
                case 3765:
                    if (str.equals("vk")) {
                        return R.drawable.wh;
                    }
                    break;
                case 3321844:
                    if (str.equals("line")) {
                        return R.drawable.wf;
                    }
                    break;
                case 28903346:
                    if (str.equals("instagram")) {
                        return R.drawable.wd;
                    }
                    break;
                case 486515695:
                    if (str.equals("kakaotalk")) {
                        return R.drawable.we;
                    }
                    break;
                case 497130182:
                    if (str.equals("facebook")) {
                        return R.drawable.wb;
                    }
                    break;
            }
        }
        return 0;
    }

    /* renamed from: a */
    private final void m72424a(View view) {
        View findViewById = view.findViewById(R.id.buc);
        C7573i.m23582a((Object) findViewById, "view.findViewById(R.id.lobby_authenticator_image)");
        this.f58057b = (ImageView) findViewById;
        View findViewById2 = view.findViewById(R.id.bub);
        C7573i.m23582a((Object) findViewById2, "view.findViewById(R.id.lobby_authenticator_button)");
        this.f58056a = (LoadingButton) findViewById2;
        LoadingButton loadingButton = this.f58056a;
        if (loadingButton == null) {
            C7573i.m23583a("verifyButton");
        }
        C10789c.m31502a(loadingButton);
        LoadingButton loadingButton2 = this.f58056a;
        if (loadingButton2 == null) {
            C7573i.m23583a("verifyButton");
        }
        loadingButton2.setEnabled(false);
        LoadingButton loadingButton3 = this.f58056a;
        if (loadingButton3 == null) {
            C7573i.m23583a("verifyButton");
        }
        loadingButton3.setOnClickListener(new C21632c(this));
    }

    /* renamed from: a */
    public final void mo57841a(Integer num, String str) {
        LoadingButton loadingButton = this.f58056a;
        if (loadingButton == null) {
            C7573i.m23583a("verifyButton");
        }
        loadingButton.mo58680b();
        C10761a.m31403c((Context) mo57850d(), mo57849b(num, str)).mo25750a();
    }

    public C21628e(AppCompatActivity appCompatActivity, ViewStub viewStub, C21636a aVar) {
        C7573i.m23587b(appCompatActivity, "activity");
        C7573i.m23587b(viewStub, "stub");
        C7573i.m23587b(aVar, "authCallback");
        super(appCompatActivity, viewStub, aVar);
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r1v4, types: [java.lang.Integer] */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: type inference failed for: r1v6 */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x003f, code lost:
        if (r9 == null) goto L_0x0044;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], java.lang.Integer, java.lang.String]
      uses: [java.lang.String, ?[OBJECT, ARRAY]]
      mth insns count: 44
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo57786a(int r9, int r10, android.content.Intent r11) {
        /*
            r8 = this;
            r0 = 123(0x7b, float:1.72E-43)
            if (r9 != r0) goto L_0x0065
            r9 = -1
            r0 = 0
            r1 = 0
            if (r10 != r9) goto L_0x004c
            if (r11 == 0) goto L_0x0013
            java.lang.String r9 = "access_token"
            java.lang.String r9 = r11.getStringExtra(r9)
            r3 = r9
            goto L_0x0014
        L_0x0013:
            r3 = r1
        L_0x0014:
            if (r11 == 0) goto L_0x001e
            java.lang.String r9 = "access_token_secret"
            java.lang.String r9 = r11.getStringExtra(r9)
            r4 = r9
            goto L_0x001f
        L_0x001e:
            r4 = r1
        L_0x001f:
            if (r11 == 0) goto L_0x0029
            java.lang.String r9 = "code"
            java.lang.String r9 = r11.getStringExtra(r9)
            r5 = r9
            goto L_0x002a
        L_0x0029:
            r5 = r1
        L_0x002a:
            if (r11 == 0) goto L_0x0036
            java.lang.String r9 = "expires_in"
            int r9 = r11.getIntExtra(r9, r0)
            java.lang.Integer r1 = java.lang.Integer.valueOf(r9)
        L_0x0036:
            r6 = r1
            if (r11 == 0) goto L_0x0044
            java.lang.String r9 = "platform_id"
            java.lang.String r9 = r11.getStringExtra(r9)
            if (r9 != 0) goto L_0x0042
            goto L_0x0044
        L_0x0042:
            r7 = r9
            goto L_0x0047
        L_0x0044:
            java.lang.String r9 = ""
            goto L_0x0042
        L_0x0047:
            r2 = r8
            r2.m72425a(r3, r4, r5, r6, r7)
            return
        L_0x004c:
            if (r11 == 0) goto L_0x0059
            java.lang.String r9 = "error_code"
            int r9 = r11.getIntExtra(r9, r0)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            goto L_0x005a
        L_0x0059:
            r9 = r1
        L_0x005a:
            if (r11 == 0) goto L_0x0062
            java.lang.String r10 = "description"
            java.lang.String r1 = r11.getStringExtra(r10)
        L_0x0062:
            r8.mo57841a(r9, r1)
        L_0x0065:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.aweme.account.login.twostep.C21628e.mo57786a(int, int, android.content.Intent):void");
    }

    /* renamed from: a */
    private final void m72425a(String str, String str2, String str3, Integer num, String str4) {
        TwoStepAuthApi.f57989b.mo57791a(str, str2, str3, num, this.f58058c, str4, this.f58070j).mo6876a((C1591g<TResult, TContinuationResult>) new C21633d<TResult,TContinuationResult>(this), C1592h.f5958b);
    }
}
