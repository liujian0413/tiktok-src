package com.p280ss.android.ugc.aweme.app;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Process;
import android.support.p022v4.app.ActivityCompat;
import android.support.p022v4.app.C0598c;
import android.text.TextUtils;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C6319n;
import com.bytedance.common.utility.collection.C6307b;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.ugc.appcontext.C6405d;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.bytedance.router.SmartRouter;
import com.bytedance.sdk.account.p645a.p646a.C12707b;
import com.bytedance.sdk.account.p645a.p647b.C12720d;
import com.bytedance.sdk.account.p645a.p649d.C12733e;
import com.p280ss.android.newmedia.message.C19950a;
import com.p280ss.android.sdk.activity.SSActivity;
import com.p280ss.android.ugc.aweme.AccountUserService;
import com.p280ss.android.ugc.aweme.account.C6861a;
import com.p280ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p280ss.android.ugc.aweme.app.C22689a.C22708e;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.app.p305g.C22988e;
import com.p280ss.android.ugc.aweme.app.p306k.C23000a;
import com.p280ss.android.ugc.aweme.base.activity.C23256c;
import com.p280ss.android.ugc.aweme.base.p1063g.C23346d;
import com.p280ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25292bt;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.detail.experiment.DetailEnterAnimationTimeExperiment;
import com.p280ss.android.ugc.aweme.detail.p1167ui.DetailActivity;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29960a;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.login.C32657g;
import com.p280ss.android.ugc.aweme.main.C32993do;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.p331m.C7164b;
import com.p280ss.android.ugc.aweme.preinstall.PreinstallUtils;
import com.p280ss.android.ugc.aweme.profile.viewmodel.MultiAccountViewModel;
import com.p280ss.android.ugc.aweme.qrcode.p1494a.C37007c;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.share.command.C38012e;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41553g;
import com.p280ss.android.ugc.aweme.util.C42894r;
import com.p280ss.android.ugc.aweme.utils.ActivityStack;
import com.p280ss.android.ugc.aweme.utils.C43073dv;
import com.p280ss.android.ugc.aweme.video.C43233i;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity */
public class DeepLinkHandlerActivity extends SSActivity {

    /* renamed from: a */
    protected C22988e f60344a = new C22988e();

    /* renamed from: b */
    protected Uri f60345b;

    /* renamed from: c */
    protected boolean f60346c = false;

    /* renamed from: d */
    protected boolean f60347d = false;

    /* renamed from: e */
    protected boolean f60348e = false;

    /* renamed from: f */
    private boolean f60349f = false;

    /* renamed from: g */
    private boolean f60350g = false;

    /* renamed from: h */
    private boolean f60351h = false;

    /* renamed from: i */
    private ArrayList<String> f60352i = new ArrayList<>();

    /* renamed from: j */
    private ArrayList<Intent> f60353j = new ArrayList<>();

    /* renamed from: m */
    private Intent f60354m = null;

    /* renamed from: n */
    private Intent f60355n = null;

    /* renamed from: o */
    private boolean f60356o = false;

    /* renamed from: p */
    private boolean f60357p = false;

    /* renamed from: q */
    private AccountUserService f60358q = new AccountUserService();

    /* renamed from: r */
    private MultiAccountViewModel f60359r = new MultiAccountViewModel();

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        this.f60348e = false;
    }

    public void onStart() {
        super.onStart();
        finish();
    }

    /* renamed from: c */
    private boolean m74924c() {
        if (!TimeLockRuler.isTeenModeON()) {
            return false;
        }
        if (!C23018p.m75672a().mo59990c()) {
            startActivity(new Intent(this, MainActivity.class));
        }
        return true;
    }

    /* renamed from: d */
    private void m74925d() {
        if (!C6399b.m19944t()) {
            C38012e.m121338a((Context) this);
            C38012e.m121339a(false);
        }
        if (C6399b.m19947w()) {
            C38012e.m121339a(false);
        }
    }

    /* renamed from: a */
    protected static boolean m74919a() {
        return C23018p.m75672a().mo59990c();
    }

    public Resources getResources() {
        if (!this.f54404l) {
            C43073dv.m136653b((Activity) this);
            if (C23346d.m76602a(this)) {
                return new C23346d(super.getResources().getAssets(), super.getResources().getDisplayMetrics(), super.getResources().getConfiguration());
            }
        }
        return super.getResources();
    }

    /* renamed from: e */
    private void m74926e() {
        Intent intent = getIntent();
        this.f60352i = intent.getStringArrayListExtra("pre_o_urls");
        try {
            if (m74923b(intent)) {
                C23000a.m75647a(this.f60345b, this.f60354m, this);
                if (!this.f60357p) {
                    m74916a(this.f60354m, this.f60355n, this.f60353j, intent);
                }
                C22995i.m75637a().f60773a = false;
                C42894r.m136193a(m74915a(this.f60345b, this.f60352i), true, "");
                new C22974f().mo59950a(this.f60345b, this.f60347d);
            }
        } catch (Exception e) {
            C42894r.m136193a(m74915a(this.f60345b, this.f60352i), false, e.getMessage());
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity", "onResume", true);
        if (!isFinishing() && VERSION.SDK_INT >= 24 && VERSION.SDK_INT < 28) {
            C43073dv.m136651a((Activity) this);
        }
        if (isFinishing()) {
            C41553g.m132328a(this);
            C2077a.m9159a("crash_service_destory_timeout");
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity", "onResume", false);
            return;
        }
        super.onResume();
        C43073dv.m136651a((Activity) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity", "onResume", false);
    }

    public void setTheme(int i) {
        try {
            super.setTheme(i);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private boolean m74920a(Intent intent) {
        if (intent == null) {
            return false;
        }
        String action = intent.getAction();
        if (!C6319n.m19593a(action) && action.indexOf(C22912d.f60644d) == 0) {
            String stringExtra = intent.getStringExtra(C22912d.f60642b);
            if (!C6319n.m19593a(stringExtra)) {
                this.f60345b = Uri.parse(stringExtra);
            }
        }
        if (this.f60345b == null) {
            this.f60345b = intent.getData();
        }
        if (this.f60345b == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    private boolean m74923b(Intent intent) {
        String str;
        Uri uri;
        CharSequence charSequence;
        boolean z;
        String str2;
        boolean z2;
        boolean z3;
        if (intent != null) {
            str = intent.getStringExtra("rule_id");
        } else {
            str = "";
        }
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        List allUidList = this.f60358q.allUidList();
        String curUserId = this.f60358q.getCurUserId();
        if (uri != null) {
            charSequence = uri.getQueryParameter("multi_account_push_uid");
        } else {
            charSequence = null;
        }
        boolean isEmpty = TextUtils.isEmpty(charSequence);
        boolean isLogin = C6861a.m21337f().isLogin();
        boolean equals = TextUtils.equals(charSequence, curUserId);
        boolean contains = allUidList.contains(charSequence);
        if (C6399b.m19947w() && !isEmpty && isLogin && !equals) {
            this.f60357p = true;
            if (((IAVService) ServiceManager.get().getService(IAVService.class)).publishService().isPublishing()) {
                new Handler().post(C23062v.f60879a);
                return false;
            }
            m74918a(contains, intent);
        }
        if (intent == null || !intent.getBooleanExtra("second_jump", false)) {
            z = false;
        } else {
            z = true;
        }
        if (!C6307b.m19566a((Collection<T>) this.f60352i)) {
            if (!C6861a.m21337f().isLogin() || TextUtils.isEmpty(charSequence) || TextUtils.equals(charSequence, this.f60358q.getCurUserId())) {
                if (!m74919a() || z) {
                    Iterator it = this.f60352i.iterator();
                    while (it.hasNext()) {
                        Uri parse = Uri.parse((String) it.next());
                        if (this.f60355n != null) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        Intent a = mo59394a(parse, z3, false);
                        if (a != null) {
                            a.putExtra("is_have_intents", true);
                            a.putExtra("rule_id", str);
                            this.f60353j.add(0, a);
                        }
                    }
                }
            } else if (m74919a()) {
                C42894r.m136193a(this.f60352i.toString(), false, "abs isAppHot == true");
                return false;
            } else {
                this.f60354m = new Intent(this, MainActivity.class);
            }
        }
        if (this.f60354m == null) {
            Uri uri2 = this.f60345b;
            if (this.f60355n != null) {
                z2 = true;
            } else {
                z2 = false;
            }
            this.f60354m = mo59394a(uri2, z2, true);
        }
        if (this.f60354m == null) {
            if (!this.f60356o) {
                if (this.f60345b == null) {
                    str2 = "";
                } else {
                    str2 = this.f60345b.toString();
                }
                C42894r.m136193a(str2, false, "abs intent == null");
            }
            if (!m74919a() && this.f60348e) {
                this.f60354m = new Intent(this, MainActivity.class);
                ActivityCompat.m2905a((Context) this, this.f60354m, (Bundle) null);
            }
            return false;
        }
        this.f60354m.putExtra("from_notification", this.f60347d);
        this.f60354m.putExtra("rule_id", str);
        if (!this.f60346c) {
            this.f60354m.addFlags(268435456);
        }
        if (this.f60353j.size() > 0) {
            if (this.f60354m.getComponent() == null || !TextUtils.equals(MainActivity.class.getName(), this.f60354m.getComponent().getClassName())) {
                this.f60354m.putExtra("is_have_intents", true);
                this.f60353j.add(this.f60354m);
            } else {
                this.f60353j.clear();
            }
        }
        return true;
    }

    public void onCreate(Bundle bundle) {
        boolean z = true;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity", "onCreate", true);
        super.onCreate(bundle);
        if (PreinstallUtils.m115082a(this)) {
            super.onCreate(bundle);
            PreinstallUtils.m115083b(this);
            finish();
            Process.killProcess(Process.myPid());
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity", "onCreate", false);
        } else if (((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isStartWelcomeScreenActivity(this) || ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).isStartJourneyActivity(this)) {
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity", "onCreate", false);
        } else {
            Intent intent = getIntent();
            if (!m74920a(intent)) {
                if (!isFinishing()) {
                    finish();
                }
                if (!intent.getBooleanExtra("from_tile_service", false)) {
                    C42894r.m136193a("", false, "abs uri==null");
                }
                ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity", "onCreate", false);
                return;
            }
            if (C7164b.m22364a()) {
                String stringExtra = intent.getStringExtra("ws");
                if (!TextUtils.isEmpty(stringExtra)) {
                    new C37007c(null);
                    C37007c.m119035a(stringExtra);
                }
            }
            Uri data = intent.getData();
            if (data != null) {
                String path = data.getPath();
                String encodedAuthority = data.getEncodedAuthority();
                if (TextUtils.isEmpty(path) || !path.contains("after_heat_meet_up")) {
                    AwemeAppData.m65765a().f60334n = false;
                } else {
                    AwemeAppData.m65765a().f60334n = true;
                }
                if (TextUtils.equals("diamond2020", encodedAuthority) && TimeLockRuler.isTeenModeON()) {
                    C10761a.m31396b((Context) C29960a.m98230a(), "青少年模式下无法参与活动", 0).mo25750a();
                }
            }
            this.f60349f = TextUtils.equals(intent.getStringExtra("dl_from"), "af");
            this.f60350g = TextUtils.equals(intent.getStringExtra("dl_from"), "facebook");
            if (!this.f60350g && !this.f60349f) {
                z = false;
            }
            C22887b.m75351a(z);
            this.f60346c = C19950a.m65794a(intent, C22912d.f60643c, false);
            this.f60347d = C19950a.m65794a(intent, "from_notification", false);
            AwemeAppData.m65765a().f60327g = this.f60347d;
            C23065y yVar = new C23065y(this, intent);
            yVar.mo60102a(this.f60347d, this.f60345b);
            C22997j jVar = new C22997j(this.f60344a);
            if (!this.f60347d) {
                this.f60345b = jVar.mo59987a(this, this.f60345b);
            }
            C23256c.m76347a(this, this.f54403k);
            if (m74924c()) {
                ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity", "onCreate", false);
                return;
            }
            m74926e();
            C6857a.m21312e().mo16818a();
            C6857a.m21312e().mo16824b();
            m74925d();
            C23065y.m75809a(this.f60345b);
            yVar.mo60101a(this.f60345b, this.f60347d);
            yVar.mo60100a(this.f60345b, this.f60344a, this.f60347d);
            yVar.mo60103b(this.f60345b);
            ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).initMiniAppInDeeplink(this, this.f60345b);
            C22887b.m75351a(false);
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.app.DeepLinkHandlerActivity", "onCreate", false);
        }
    }

    /* renamed from: a */
    public final void mo53828a(int i, int i2) {
        if (!this.f60351h) {
            super.mo53828a(i, i2);
        }
    }

    /* renamed from: a */
    private void m74917a(String str, final Bundle bundle) {
        MultiAccountViewModel.m118558a(str, bundle, (C12720d) new C12720d() {
            public final /* synthetic */ void onSuccess(C12707b bVar) {
                m74930a((C12733e) bVar);
            }

            /* renamed from: a */
            private static void m74930a(C12733e eVar) {
                C6907h.m21524a("switch_account_result", (Map) C22984d.m75611a().mo59970a("status", 1).f60753a);
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public void onError(C12733e eVar, int i) {
                Activity activity;
                if (!DeepLinkHandlerActivity.m74919a()) {
                    C32657g.m105756b(bundle);
                    return;
                }
                if (AwemeAppData.m65765a() != null) {
                    activity = C6405d.m19984g();
                } else {
                    activity = null;
                }
                if (activity != null) {
                    C10761a.m31399c((Context) activity, (int) R.string.b29).mo25750a();
                }
                C6907h.m21524a("switch_account_result", (Map) C22984d.m75611a().mo59970a("status", 0).mo59970a("fail_info", i).f60753a);
            }
        });
    }

    /* renamed from: a */
    private static String m74915a(Uri uri, ArrayList<String> arrayList) {
        if (uri != null) {
            return uri.toString();
        }
        if (!C6307b.m19566a((Collection<T>) arrayList)) {
            return arrayList.toString();
        }
        return "";
    }

    /* renamed from: a */
    private void m74918a(boolean z, Intent intent) {
        Activity previousActivity = ActivityStack.getPreviousActivity();
        if (previousActivity != null) {
            String canonicalName = previousActivity.getClass().getCanonicalName();
            ArrayList arrayList = new ArrayList();
            arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoRecordNewActivity");
            arrayList.add("com.ss.android.ugc.aweme.shortvideo.edit.VEVideoPublishEditActivity");
            arrayList.add("com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishActivity");
            if (arrayList.contains(canonicalName) || (previousActivity instanceof C43233i)) {
                Builder builder = new Builder(previousActivity, R.style.rk);
                builder.setMessage(R.string.d_m);
                builder.setNegativeButton(R.string.w_, C23063w.f60880a);
                builder.setPositiveButton(R.string.afn, new C23064x(this, z, intent));
                AlertDialog create = builder.create();
                create.setCanceledOnTouchOutside(false);
                create.setCancelable(false);
                try {
                    create.show();
                } catch (Exception unused) {
                }
                arrayList.clear();
                return;
            }
            arrayList.clear();
        }
        m74922b(z, intent);
    }

    /* renamed from: b */
    private void m74922b(boolean z, Intent intent) {
        Uri uri;
        String str;
        if (intent != null) {
            uri = intent.getData();
        } else {
            uri = null;
        }
        if (uri != null) {
            str = uri.getQueryParameter("multi_account_push_uid");
        } else {
            str = null;
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("push_intent", intent);
        bundle.putBoolean("mFromNotification", this.f60347d);
        bundle.putBoolean("cancelRestoreOnMain", true);
        if (z) {
            bundle.putBoolean("switch_jump", true);
            m74917a(str, bundle);
            return;
        }
        Intent intent2 = new Intent(C29960a.m98230a(), PushLoginActivity.class);
        intent2.putExtra("multi_account_push_uid", str);
        intent2.putExtra("multi_account", bundle);
        if (m74919a()) {
            startActivity(intent2);
            return;
        }
        ActivityCompat.m2906a((Context) this, new Intent[]{new Intent(this, MainActivity.class), intent2}, (Bundle) null);
    }

    /* renamed from: a */
    public Intent mo59394a(Uri uri, boolean z, boolean z2) {
        boolean z3;
        String str;
        String str2;
        String scheme = uri.getScheme();
        Intent intent = null;
        if (scheme == null) {
            return null;
        }
        String host = uri.getHost();
        if (host == null) {
            return null;
        }
        String path = uri.getPath();
        if (path == null) {
            path = "";
        }
        String str3 = path;
        String stringExtra = getIntent().getStringExtra("from_token");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = "";
        }
        String str4 = stringExtra;
        Uri.Builder buildUpon = uri.buildUpon();
        buildUpon.appendQueryParameter("from_token", str4);
        Uri uri2 = uri;
        if (TextUtils.isEmpty(uri.getQueryParameter("enter_from"))) {
            if (TextUtils.equals("token", getIntent().getStringExtra("enter_from"))) {
                buildUpon.appendQueryParameter("enter_from", "token");
            } else {
                String str5 = "enter_from";
                if (this.f60347d) {
                    str2 = "push";
                } else {
                    str2 = "deeplink";
                }
                buildUpon.appendQueryParameter(str5, str2);
            }
        }
        Uri build = buildUpon.build();
        List deeplinkCommands = ((IBridgeService) ServiceManager.get().getService(IBridgeService.class)).getDeeplinkCommands();
        if (!TextUtils.equals(build.getQueryParameter("gd_label"), "retarget") || C7213d.m22500a().mo18775am() != 1) {
            Iterator it = deeplinkCommands.iterator();
            while (true) {
                if (!it.hasNext()) {
                    z3 = false;
                    break;
                }
                C22708e eVar = (C22708e) it.next();
                if (eVar.mo59802a(scheme, host, str3)) {
                    this.f60344a.mo59979c(eVar.mo59797a(build));
                    intent = eVar.mo59801a(this, build, host, str3, str4, this.f60347d, z);
                    if (intent == null) {
                        eVar.mo59800a((Activity) this, build, this.f60347d);
                    }
                    if (!TextUtils.isEmpty(eVar.mo59799a())) {
                        C22689a.m74980a(build, eVar.mo59799a());
                    } else if (intent != null) {
                        C22689a.m74980a(build, intent.getComponent().getClassName());
                    }
                    z3 = true;
                }
            }
            if (!z3) {
                intent = SmartRouter.buildRoute((Context) this, build.toString()).withParam("is_from_push", this.f60347d).withParam("token_request_id", getIntent().getStringExtra("token_request_id")).buildIntent("push");
                if (intent != null) {
                    C22988e eVar2 = this.f60344a;
                    if (build.getHost() != null) {
                        str = build.getHost();
                    } else {
                        str = "";
                    }
                    eVar2.mo59979c(str);
                    z3 = true;
                }
            }
            if (intent != null && !m74919a()) {
                String a = C32993do.m106643a(build.getQueryParameter("tab_index"));
                if (!"aweme".equals(host) || !"click_push_newvideo".equals(build.getQueryParameter("gd_label")) || !TextUtils.equals(a, "DISCOVER")) {
                    if (!TextUtils.isEmpty(a)) {
                        intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", a);
                    }
                } else if (!TextUtils.isEmpty(a) && !C6399b.m19944t()) {
                    intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB", a);
                }
                intent.putExtra("is_from_push", true);
            }
            if (intent != null) {
                String queryParameter = build.getQueryParameter("backurl");
                if (!TextUtils.isEmpty(queryParameter)) {
                    intent.putExtra("backurl", queryParameter);
                }
            }
            C22995i.m75637a().f60773a = false;
            C25292bt.m83099a(build, intent);
            if (!(intent == null || build.getQueryParameter("gd_label") == null || !build.getQueryParameter("gd_label").startsWith("click_wap"))) {
                intent.putExtra("ads_app_activity_by_wap_click", true);
            }
            if (!z3) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put(C22912d.f60642b, build.toString());
                    C6877n.m21407a("service_monitor", "no_matched_deep_link", jSONObject);
                } catch (Exception unused) {
                }
            }
            if (!z3 && z2) {
                this.f60348e = true;
                this.f60344a.mo59979c("default_homepage");
            }
            return intent;
        }
        this.f60348e = true;
        this.f60356o = true;
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo59399a(boolean z, Intent intent, DialogInterface dialogInterface, int i) {
        m74922b(z, intent);
    }

    /* renamed from: a */
    private void m74916a(Intent intent, Intent intent2, ArrayList<Intent> arrayList, Intent intent3) {
        String str;
        C0598c cVar;
        int i;
        if (getIntent() != null) {
            str = getIntent().getStringExtra("rule_id");
        } else {
            str = "";
        }
        this.f60351h = TextUtils.equals(intent.getComponent().getClassName(), DetailActivity.class.getName());
        this.f54403k = 1;
        Bundle bundle = null;
        if (this.f60351h) {
            int a = C6384b.m19835a().mo15287a(DetailEnterAnimationTimeExperiment.class, true, "detail_animation_time", C6384b.m19835a().mo15295d().detail_animation_time, 0);
            int i2 = R.anim.cj;
            if (a == 1) {
                i2 = R.anim.ci;
                i = R.anim.c8;
            } else if (a == 2) {
                i2 = R.anim.ck;
                i = R.anim.c_;
            } else {
                i = R.anim.cj;
            }
            cVar = C0598c.m2485a((Context) this, i2, i);
        } else {
            cVar = null;
        }
        if (cVar != null) {
            bundle = cVar.mo2580a();
        }
        if (intent2 != null) {
            if (arrayList.size() > 1) {
                intent2.putExtra("next_steps", arrayList);
            } else {
                intent2.putExtra("next_step", intent);
            }
            intent2.putExtra("rule_id", str);
            if (m74919a()) {
                startActivity(intent2, bundle);
                return;
            }
            Intent[] intentArr = new Intent[2];
            intentArr[0] = new Intent(this, MainActivity.class);
            intentArr[0].putExtra("rule_id", str);
            intentArr[1] = intent2;
            ActivityCompat.m2906a((Context) this, intentArr, bundle);
        } else if (arrayList.size() > 1) {
            ActivityCompat.m2906a((Context) this, (Intent[]) arrayList.toArray(new Intent[arrayList.size()]), bundle);
        } else {
            Uri data = intent3.getData();
            if (data != null && data.isHierarchical() && !intent.getBooleanExtra("safeTemplate", false)) {
                for (String str2 : data.getQueryParameterNames()) {
                    intent.putExtra(str2, data.getQueryParameter(str2));
                }
            }
            ActivityCompat.m2905a((Context) this, intent, bundle);
        }
    }
}
