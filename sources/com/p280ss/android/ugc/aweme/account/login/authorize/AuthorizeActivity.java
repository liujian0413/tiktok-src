package com.p280ss.android.ugc.aweme.account.login.authorize;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.Window;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import bolts.C1591g;
import bolts.C1592h;
import com.C1642a;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.lobby.auth.AuthResult;
import com.bytedance.lobby.auth.C12196a;
import com.bytedance.lobby.auth.C12198c;
import com.bytedance.lobby.auth.C12198c.C12200a;
import com.bytedance.lobby.internal.C12222c;
import com.bytedance.lobby.internal.C12226d;
import com.bytedance.sdk.account.p645a.C12737f;
import com.bytedance.sdk.account.p645a.p646a.C12706a;
import com.bytedance.sdk.account.p645a.p646a.C12712g;
import com.bytedance.sdk.account.p660d.C12798d;
import com.bytedance.sdk.account.p668i.C12898b;
import com.p280ss.android.account.C18896d;
import com.p280ss.android.common.p288d.C19282c;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.C21151c;
import com.p280ss.android.ugc.aweme.account.base.SafeHandler;
import com.p280ss.android.ugc.aweme.account.bean.AgeGateResponse;
import com.p280ss.android.ugc.aweme.account.login.BaseActivity;
import com.p280ss.android.ugc.aweme.account.login.C21537g;
import com.p280ss.android.ugc.aweme.account.login.C21570o;
import com.p280ss.android.ugc.aweme.account.login.C21570o.C21571a;
import com.p280ss.android.ugc.aweme.account.login.C21579s;
import com.p280ss.android.ugc.aweme.account.login.agegate.C21288a;
import com.p280ss.android.ugc.aweme.account.login.agegate.C21288a.C21289a;
import com.p280ss.android.ugc.aweme.account.login.agegate.C21297b;
import com.p280ss.android.ugc.aweme.account.login.agegate.C21297b.C21298a;
import com.p280ss.android.ugc.aweme.account.login.authorize.p955a.C21305a;
import com.p280ss.android.ugc.aweme.account.login.authorize.p955a.C21306b;
import com.p280ss.android.ugc.aweme.account.login.authorize.p955a.C21307c;
import com.p280ss.android.ugc.aweme.account.login.model.BaseLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.TPLoginMethod;
import com.p280ss.android.ugc.aweme.account.login.model.TPUserInfo;
import com.p280ss.android.ugc.aweme.account.login.p975v2.C21886a;
import com.p280ss.android.ugc.aweme.account.login.p975v2.base.Scene;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21101a;
import com.p280ss.android.ugc.aweme.account.p933a.p935b.C21102b;
import com.p280ss.android.ugc.aweme.account.p942e.C21170a;
import com.p280ss.android.ugc.aweme.account.p944g.C21196e;
import com.p280ss.android.ugc.aweme.account.p944g.C21198f;
import com.p280ss.android.ugc.aweme.account.p944g.C21199g;
import com.p280ss.android.ugc.aweme.account.p946i.C21222g;
import com.p280ss.android.ugc.aweme.account.p950k.C21227b;
import com.p280ss.android.ugc.aweme.account.p950k.C21231d;
import com.p280ss.android.ugc.aweme.account.p951l.C21237a;
import com.p280ss.android.ugc.aweme.account.util.C22327f;
import com.p280ss.android.ugc.aweme.account.util.C22345t;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.common.MobClick;
import com.p280ss.android.ugc.aweme.main.p1385g.C33014a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.profile.model.User;
import com.p280ss.android.ugc.aweme.utils.C42951au;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity */
public class AuthorizeActivity extends BaseActivity implements C12196a, C21289a, C21305a, C21571a {

    /* renamed from: C */
    private static Set<Integer> f57224C = new HashSet();

    /* renamed from: n */
    private static final boolean f57225n = C7163a.m22363a();

    /* renamed from: A */
    private boolean f57226A;

    /* renamed from: B */
    private Handler f57227B = new SafeHandler(this);

    /* renamed from: D */
    private boolean f57228D = false;

    /* renamed from: E */
    private boolean f57229E = false;

    /* renamed from: F */
    private String f57230F = C21671bd.m72536d();

    /* renamed from: l */
    protected String f57231l;

    /* renamed from: m */
    protected String f57232m;

    /* renamed from: o */
    private C12226d f57233o;

    /* renamed from: p */
    private C12198c f57234p;

    /* renamed from: q */
    private C21196e f57235q;

    /* renamed from: r */
    private AuthResult f57236r;

    /* renamed from: s */
    private C12737f f57237s;

    /* renamed from: t */
    private String f57238t;

    /* renamed from: u */
    private boolean f57239u;

    /* renamed from: v */
    private boolean f57240v;

    /* renamed from: w */
    private int f57241w;

    /* renamed from: x */
    private boolean f57242x = true;

    /* renamed from: y */
    private C21570o f57243y;

    /* renamed from: z */
    private boolean f57244z;

    /* renamed from: a */
    public final int mo57175a() {
        return R.layout.ajm;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onResume", false);
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final void mo57309a(int i, String str, String str2, String str3, C12712g gVar) {
        if (!isFinishing()) {
            if (i == 2027 || i == 2028) {
                C10761a.m31403c(getBaseContext(), TextUtils.isEmpty(str) ? getString(R.string.c6i) : str).mo25750a();
            }
            if (this.f57239u) {
                C6907h.m21524a("sso_callback_response", (Map) new C21102b().mo56946a("enter_method", this.f57232m).mo56946a("enter_from", this.f57231l).mo56946a("platform", this.f57238t).mo56944a("status", 0).mo56946a("fail_info", C1642a.m8035a(Locale.CHINA, "error:%d,msg:%s", new Object[]{Integer.valueOf(i), str})).mo56944a("_perf_monitor", 1).f56672a);
            }
            this.f57226A = i == 1011;
            new C21222g().mo57149b(this.f57238t).mo57148a("0").mo57150c(String.valueOf(i)).mo57151d(this.f57244z ? "/passport/auth/only_login/" : "/passport/auth/login/").mo57141b();
            if (!this.f57244z || !this.f57226A) {
                if (!this.f57226A && this.f57239u) {
                    C6907h.m21524a("login_failure", (Map) new C21102b().mo56946a("platform", this.f57238t).mo56946a("enter_method", this.f57232m).mo56946a("enter_type", "click_login").mo56946a("carrier", "").mo56944a("error_code", i).f56672a);
                }
                m71704l();
                if (this.f57239u) {
                    String str4 = this.f57238t;
                    StringBuilder sb = new StringBuilder("passport error:");
                    sb.append(str);
                    C21231d.m71460a(1, str4, i, sb.toString());
                    C21537g.m72220a(i, str, this.f57238t);
                }
                Intent intent = new Intent();
                intent.putExtra("error_code", i);
                if (!C21297b.m71680c() && this.f57226A && !TextUtils.equals(this.f57238t, "facebook") && !TextUtils.equals(this.f57238t, "google") && !C22345t.m73968c()) {
                    m71698b(0, intent);
                } else if (gVar.mo31167a()) {
                    intent.putExtra("description", str);
                    intent.putExtra("repeat_bind_error", true);
                    m71698b(999, intent);
                } else {
                    intent.putExtra("description", str2);
                    m71698b(0, intent);
                }
            } else {
                if (!TextUtils.isEmpty(str3)) {
                    this.f57236r.f32447j.putString("profile_key", str3);
                }
                this.f57227B.post(new C21313g(this));
            }
        }
    }

    /* renamed from: l */
    private void m71704l() {
        C42951au.m136343b(this.f57243y);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo57315g() {
        finish();
        C21671bd.m72547o();
    }

    /* renamed from: j */
    private int m71702j() {
        if (this.f57240v) {
            return 3;
        }
        if (this.f57239u) {
            return 1;
        }
        return 2;
    }

    /* access modifiers changed from: private */
    /* renamed from: k */
    public void mo57316h() {
        if (this.f57243y == null) {
            this.f57243y = new C21570o(this);
            if (C6399b.m19946v()) {
                this.f57243y.f57904a = this;
            }
        }
        C42951au.m136342a(this.f57243y);
    }

    /* renamed from: c */
    public final void mo57311c() {
        m71698b(0, new Intent());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo57312d() {
        if (!this.mStatusDestroyed) {
            new C21297b().mo57303a((Activity) this, this.f57236r, (C21298a) new C21288a(this.f57236r, this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo57313e() {
        if (this.f57239u) {
            m71695a(new Intent());
        } else {
            m71698b(-1, new Intent());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo57314f() {
        C10761a.m31399c(getApplicationContext(), (int) R.string.c6c).mo25750a();
        finish();
        C21671bd.m72547o();
    }

    public void finish() {
        super.finish();
        if (this.f57239u && TextUtils.equals(this.f57230F, C21671bd.m72536d()) && !this.f57229E) {
            C21671bd.m72522a(1, 3, (Object) "");
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (f57224C != null) {
            f57224C.remove(Integer.valueOf(hashCode()));
        }
    }

    /* renamed from: i */
    private void m71701i() {
        Window window = getWindow();
        if (VERSION.SDK_INT >= 21) {
            window.clearFlags(201326592);
            window.getDecorView().setSystemUiVisibility(1280);
            window.addFlags(Integer.MIN_VALUE);
            window.setStatusBarColor(0);
            return;
        }
        if (VERSION.SDK_INT >= 19) {
            window.addFlags(67108864);
        }
    }

    /* renamed from: m */
    private void m71705m() {
        if (C21237a.m71491a()) {
            C21227b.m71450a("monitor_clear_cookie", 1, C21101a.m71159a().mo56942a("enter_from", "lobby").mo56943b());
            try {
                CookieSyncManager.createInstance(this);
                CookieManager.getInstance().removeAllCookie();
                CookieSyncManager.getInstance().sync();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo57176b() {
        super.mo57176b();
        m71701i();
        this.f57237s = C12798d.m37188c(this);
        Intent intent = getIntent();
        this.f57238t = intent.getStringExtra("platform");
        this.f57241w = intent.getIntExtra("account_type", 1);
        this.f57239u = intent.getBooleanExtra("is_login", true);
        this.f57240v = intent.getBooleanExtra("is_only_fetch_token", false);
        if (this.f57240v) {
            this.f57239u = false;
        }
        this.f57242x = true;
        String a = C21199g.m71369a(this.f57238t);
        this.f57233o = C12222c.m35539a();
        C12200a a2 = new C12200a(this).mo29932a((C12196a) this).mo29933a(a);
        Bundle b = C21199g.m71370b(a);
        if (b != null) {
            a2.mo29931a(b);
        }
        this.f57234p = a2.mo29934a();
        this.f57235q = C21198f.m71366a(C21199g.m71369a(this.f57238t));
    }

    /* renamed from: a */
    static final /* synthetic */ Bundle m71694a(C1592h hVar) throws Exception {
        return (Bundle) hVar.mo6890e();
    }

    /* renamed from: b */
    private static String m71697b(AuthResult authResult) {
        if (TextUtils.equals("google", authResult.f32441d)) {
            return "";
        }
        return authResult.f32443f;
    }

    /* renamed from: c */
    private static String m71699c(AuthResult authResult) {
        if (TextUtils.equals("google", authResult.f32441d)) {
            return authResult.f32443f;
        }
        return authResult.f32444g;
    }

    /* renamed from: a */
    public final void mo29929a(AuthResult authResult) {
        if (f57225n) {
            C22327f.m73923a("AuthorizeActivity", authResult.f32447j);
        }
        this.f57236r = authResult;
        if (authResult.f32438a) {
            m71696a(authResult, true);
        } else if (authResult.f32439b) {
            this.f57227B.post(new C21304a(this));
        } else {
            this.f57227B.post(new C21308b(this));
        }
        if (this.f57235q != null) {
            this.f57235q.mo57131a(authResult);
        }
    }

    /* renamed from: a */
    private void m71695a(Intent intent) {
        AgeGateResponse ageGateResponse;
        Scene scene;
        C6907h.m21524a("account_sync_request", (Map) new C21102b().mo56946a("enter_method", this.f57232m).mo56946a("enter_from", this.f57231l).mo56946a("platform", this.f57238t).mo56944a("_perf_monitor", 1).f56672a);
        if (C21297b.m71680c() || !this.f57226A) {
            ageGateResponse = null;
        } else {
            ageGateResponse = new AgeGateResponse(0, "", true, false);
        }
        Bundle bundle = new Bundle(getIntent().getExtras());
        if (this.f57228D) {
            bundle.putBoolean("new_user_need_set_username", true);
            bundle.putBoolean("new_user_need_get_recommend_username", true);
            bundle.putString("set_username_platform", C21199g.m71368a(this.f57234p));
            bundle.putString("enter_from", this.f57231l);
            bundle.putString("enter_method", this.f57232m);
        }
        String str = "current_scene";
        if (this.f57228D) {
            scene = Scene.SIGN_UP;
        } else {
            scene = Scene.LOGIN;
        }
        bundle.putInt(str, scene.getValue());
        bundle.putString("platform", C21199g.m71368a(this.f57234p));
        bundle.putString("login_path", "third_party_auth");
        if (ageGateResponse != null) {
            bundle.putSerializable("age_gate_response", ageGateResponse);
        }
        C21151c.m71289a(bundle).mo6876a((C1591g<TResult, TContinuationResult>) new C21314h<TResult,TContinuationResult>(this, intent), C1592h.f5958b).mo6875a(C21315i.f57274a);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onCreate", true);
        super.onCreate(bundle);
        f57224C.add(Integer.valueOf(hashCode()));
        if (f57224C.size() != 1) {
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onCreate", false);
            return;
        }
        this.f57231l = getIntent().getStringExtra("enter_from");
        this.f57232m = getIntent().getStringExtra("enter_method");
        if (!(this.f57233o == null || this.f57234p == null)) {
            C6907h.onEvent(MobClick.obtain().setEventName("sign_in").setLabelName(this.f57238t));
            C21231d.m71461a(System.currentTimeMillis());
            C12226d.m35547a(this.f57234p);
            if (this.f57239u) {
                C6907h.m21524a("token_request", (Map) new C21102b().mo56946a("enter_method", this.f57232m).mo56946a("enter_from", this.f57231l).mo56946a("platform", this.f57238t).mo56944a("_perf_monitor", 1).f56672a);
            }
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.authorize.AuthorizeActivity", "onCreate", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo57308a(int i, Intent intent) {
        setResult(i, intent);
        finish();
    }

    /* renamed from: b */
    private void m71698b(int i, Intent intent) {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            setResult(i, intent);
            finish();
            return;
        }
        this.f57227B.post(new C21311e(this, i, intent));
    }

    /* renamed from: c */
    private static boolean m71700c(int i, Intent intent) {
        if (i == 0 || intent == null) {
            return false;
        }
        Bundle extras = intent.getExtras();
        if (extras == null || !extras.containsKey("callback")) {
            return false;
        }
        try {
            Uri parse = Uri.parse(extras.getString("callback"));
            String scheme = parse.getScheme();
            if (scheme != null) {
                if (scheme.startsWith(C22909c.f60638b)) {
                    if ("connect_switch".equals(parse.getQueryParameter("error_name"))) {
                        return true;
                    }
                    return false;
                }
            }
            return false;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public final void mo57310a(C12898b bVar, JSONObject jSONObject) {
        C21671bd.m72526a(bVar);
        if (bVar.f34081d && C21886a.f58594a.mo58325d()) {
            this.f57228D = true;
        }
        if (this.f57239u) {
            C21537g.m72221a(this.f57238t);
            C6907h.m21524a("sso_callback_response", (Map) new C21102b().mo56946a("enter_method", this.f57232m).mo56946a("enter_from", this.f57231l).mo56946a("platform", this.f57238t).mo56944a("status", 1).mo56944a("_perf_monitor", 1).f56672a);
            this.f57229E = true;
        }
        ((C33014a) C21671bd.m72521a(C33014a.class)).mo59998a(this.f57238t);
        this.f57227B.post(new C21312f(this));
    }

    /* renamed from: a */
    private void m71696a(AuthResult authResult, boolean z) {
        String a = C21199g.m71367a(authResult);
        String c = C21199g.m71372c(authResult);
        String d = C21199g.m71374d(authResult);
        long j = authResult.f32445h / 1000;
        String b = m71697b(authResult);
        String c2 = m71699c(authResult);
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(authResult.f32442e)) {
            hashMap.put("uid", Uri.encode(authResult.f32442e));
        }
        if (!TextUtils.isEmpty(c2)) {
            hashMap.put("access_token_secret", Uri.encode(c2));
        }
        if (!TextUtils.isEmpty(C21199g.m71371b(authResult))) {
            hashMap.put("profile_key", Uri.encode(C21199g.m71371b(authResult)));
        }
        switch (m71702j()) {
            case 1:
                this.f57244z = z;
                if (this.f57239u && C21671bd.m72540h().isEnableMultiAccountLogin()) {
                    hashMap.put("multi_login", Uri.encode("1"));
                }
                if (!z) {
                    if (TextUtils.isEmpty(a)) {
                        this.f57237s.mo31223b(c, d, b, j, (Map) hashMap, (C12706a<C12712g>) new C21307c<C12712g>(this));
                        break;
                    } else {
                        this.f57237s.mo31219a(c, d, a, j, (Map) hashMap, (C12706a<C12712g>) new C21307c<C12712g>(this));
                        break;
                    }
                } else {
                    m71705m();
                    if (TextUtils.isEmpty(a)) {
                        this.f57237s.mo31226d(c, d, b, j, hashMap, new C21307c(this));
                        break;
                    } else {
                        this.f57237s.mo31225c(c, d, a, j, hashMap, new C21307c(this));
                        break;
                    }
                }
            case 2:
                if (TextUtils.isEmpty(a)) {
                    this.f57237s.mo31224b(c, d, b, j, (Map) hashMap, (C18896d) new C21306b(this));
                    break;
                } else {
                    this.f57237s.mo31220a(c, d, a, j, (Map) hashMap, (C18896d) new C21306b(this));
                    break;
                }
            case 3:
                Intent intent = new Intent();
                if (!TextUtils.isEmpty(b)) {
                    intent.putExtra("access_token", b);
                }
                if (!TextUtils.isEmpty(c2)) {
                    intent.putExtra("access_token_secret", c2);
                }
                if (!TextUtils.isEmpty(a)) {
                    intent.putExtra("code", a);
                }
                if (j > 0) {
                    intent.putExtra("expires_in", j);
                }
                if (!TextUtils.isEmpty(c)) {
                    intent.putExtra("platform_id", c);
                }
                m71698b(-1, intent);
                break;
            default:
                this.f57227B.post(new C21309c(this));
                break;
        }
        this.f57227B.post(new C21310d(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Bundle mo57307a(Intent intent, C1592h hVar) throws Exception {
        String str;
        if (hVar.mo6889d()) {
            m71698b(0, intent);
        } else {
            C21170a.m71337a(11);
            C19282c.m63182a(this, "sign_in_success", this.f57238t);
            m71698b(-1, intent);
            C6907h.m21524a("login_success", (Map) new C21102b().mo56946a("enter_method", this.f57232m).mo56946a("enter_from", this.f57231l).mo56946a("platform", this.f57238t).mo56944a("status", 1).mo56946a("enter_type", "click_login").mo56944a("_perf_monitor", 1).f56672a);
        }
        C6907h.m21524a("account_sync_response", (Map) new C21102b().mo56946a("enter_method", this.f57232m).mo56946a("enter_from", this.f57231l).mo56946a("platform", this.f57238t).mo56944a("status", hVar.mo6889d() ^ true ? 1 : 0).mo56946a("fail_info", "").mo56944a("_perf_monitor", 1).f56672a);
        User k = C21671bd.m72543k();
        if (getIntent().getBooleanExtra("need_remember_login_method", true)) {
            C21579s.m72313b((BaseLoginMethod) new TPLoginMethod(k.getUid(), this.f57238t, TPUserInfo.from(k)));
        }
        if (C21671bd.m72539g()) {
            C21671bd.m72522a(1, 1, (Object) "");
            C21671bd.m72534b(C21671bd.m72543k());
        }
        String str2 = null;
        if (this.f57233o != null) {
            str2 = this.f57233o.mo29966a("twitter");
            str = this.f57233o.mo29968b("twitter");
        } else {
            str = null;
        }
        ((C33014a) C21671bd.m72521a(C33014a.class)).mo60000a(this.f57238t, str2, str);
        return (Bundle) hVar.mo6890e();
    }

    /* renamed from: a */
    public final void mo57279a(int i, AuthResult authResult) {
        if (!isFinishing()) {
            if (i == -1) {
                C6907h.m21524a("login_failure", (Map) new C21102b().mo56946a("platform", C21199g.m71374d(authResult)).mo56946a("enter_method", this.f57231l).mo56946a("enter_type", "click_login").mo56946a("carrier", "").mo56944a("error_code", 56004).f56672a);
            }
            if (i == 0) {
                C6907h.m21524a("login_failure", (Map) new C21102b().mo56946a("platform", C21199g.m71374d(authResult)).mo56946a("enter_method", this.f57231l).mo56946a("enter_type", "click_login").mo56946a("carrier", "").mo56944a("error_code", -3005).f56672a);
            }
            if (authResult == null || i != 1) {
                m71704l();
                m71698b(0, new Intent());
                finish();
                return;
            }
            m71696a(authResult, false);
        }
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        this.f57242x = false;
        if (i == 32972) {
            if (m71700c(i2, intent)) {
                Intent intent2 = new Intent();
                intent2.putExtra("repeat_bind_error", true);
                m71698b(0, intent2);
                return;
            }
            this.f57237s.mo31222a(this.f57238t, null, new C21306b(this));
        }
        super.onActivityResult(i, i2, intent);
    }
}
