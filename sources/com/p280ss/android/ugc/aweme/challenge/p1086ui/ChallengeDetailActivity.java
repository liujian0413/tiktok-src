package com.p280ss.android.ugc.aweme.challenge.p1086ui;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.p022v4.app.C0608j;
import android.support.p022v4.app.C0633q;
import android.support.p022v4.app.Fragment;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.p280ss.android.ugc.aweme.analysis.Analysis;
import com.p280ss.android.ugc.aweme.app.p305g.C22984d;
import com.p280ss.android.ugc.aweme.base.activity.AmeSlideSSActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.challenge.model.ChallengeDetailParam;
import com.p280ss.android.ugc.aweme.challenge.p1086ui.ChallengeDetailFragment.C23711a;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25242ao;
import com.p280ss.android.ugc.aweme.common.C6907h;
import com.p280ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p280ss.android.ugc.aweme.p1003am.C22491a;
import com.p280ss.android.ugc.aweme.services.IAVService;
import com.p280ss.android.ugc.aweme.setting.C7212bb;
import com.p280ss.android.ugc.aweme.utils.C43103en;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Map;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity */
public final class ChallengeDetailActivity extends AmeSlideSSActivity {

    /* renamed from: b */
    public static final C23709a f62498b = new C23709a(null);

    /* renamed from: c */
    private ChallengeDetailParam f62499c;

    /* renamed from: d */
    private String f62500d = "";

    /* renamed from: e */
    private String f62501e = "";

    /* renamed from: com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity$a */
    public static final class C23709a {
        private C23709a() {
        }

        public /* synthetic */ C23709a(C7571f fVar) {
            this();
        }

        /* renamed from: a */
        public final void mo61686a(Context context, String str, String str2, int i, boolean z) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(str, "challengeId");
            C7573i.m23587b(str2, "from");
            m77720a(context, null, str, str2, i, z);
        }

        /* renamed from: a */
        public static void m77720a(Context context, String str, String str2, String str3, int i, boolean z) {
            C7573i.m23587b(context, "context");
            C7573i.m23587b(str2, "challengeId");
            C7573i.m23587b(str3, "from");
            Intent intent = new Intent(context, ChallengeDetailActivity.class);
            intent.putExtra("id", str2);
            intent.putExtra("aweme_id", str);
            intent.putExtra("extra_challenge_from", str3);
            intent.putExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", i);
            intent.putExtra("extra_challenge_is_hashtag", z);
            context.startActivity(intent);
        }
    }

    /* renamed from: a */
    public static final void m77713a(Context context, String str, String str2) {
        f62498b.mo61686a(context, str, str2, 0, false);
    }

    /* renamed from: a */
    public static final void m77714a(Context context, String str, String str2, int i, boolean z) {
        f62498b.mo61686a(context, str, str2, i, false);
    }

    /* renamed from: a */
    public static final void m77715a(Context context, String str, String str2, String str3, int i, boolean z) {
        C23709a.m77720a(context, str, str2, str3, 0, true);
    }

    /* renamed from: f */
    public final int mo60513f() {
        return 0;
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        super.finish();
        C22491a.m74384a(this);
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onResume", true);
        super.onResume();
        C43103en.m136721a(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onResume", false);
    }

    public final void setStatusBarColor() {
        Activity activity = this;
        C10994a.m32208b(activity);
        if (C6399b.m19946v() || C7212bb.m22493a()) {
            C23487o.m77155c(activity);
        }
    }

    /* renamed from: c */
    private final void m77717c() {
        C0608j supportFragmentManager = getSupportFragmentManager();
        C0633q a = supportFragmentManager.mo2645a();
        C7573i.m23582a((Object) a, "fm.beginTransaction()");
        Fragment a2 = supportFragmentManager.mo2644a("challenge_detail_fragment_tag");
        if (a2 == null) {
            ChallengeDetailParam challengeDetailParam = this.f62499c;
            if (challengeDetailParam == null) {
                C7573i.m23583a("detailParam");
            }
            a2 = C23711a.m77780a(challengeDetailParam);
        }
        a2.setUserVisibleHint(true);
        a.mo2600b(R.id.a19, a2, "challenge_detail_fragment_tag");
        a.mo2604c();
    }

    /* renamed from: a */
    private final void m77712a() {
        Object service = ServiceManager.get().getService(IAVService.class);
        C7573i.m23582a(service, "ServiceManager.get().get…e(IAVService::class.java)");
        ((IAVService) service).getFilterService().mo74858a();
        m77716b();
        String stringExtra = getIntent().getStringExtra("is_commerce");
        if (TextUtils.equals(stringExtra, "1") || C7634n.m23717a("true", stringExtra, true)) {
            ChallengeDetailParam challengeDetailParam = this.f62499c;
            if (challengeDetailParam == null) {
                C7573i.m23583a("detailParam");
            }
            C25242ao.m82974a(challengeDetailParam.getCid());
        }
        ChallengeDetailParam challengeDetailParam2 = this.f62499c;
        if (challengeDetailParam2 == null) {
            C7573i.m23583a("detailParam");
        }
        if (TextUtils.isEmpty(challengeDetailParam2.getCid())) {
            finish();
        } else {
            m77717c();
        }
    }

    public final Analysis getAnalysis() {
        long j;
        long j2 = 0;
        try {
            ChallengeDetailParam challengeDetailParam = this.f62499c;
            if (challengeDetailParam == null) {
                C7573i.m23583a("detailParam");
            }
            String cid = challengeDetailParam.getCid();
            if (cid == null) {
                C7573i.m23580a();
            }
            j = Long.parseLong(cid);
        } catch (Exception unused) {
            j = 0;
        }
        try {
            ChallengeDetailParam challengeDetailParam2 = this.f62499c;
            if (challengeDetailParam2 == null) {
                C7573i.m23583a("detailParam");
            }
            String awemeId = challengeDetailParam2.getAwemeId();
            if (awemeId == null) {
                C7573i.m23580a();
            }
            j2 = Long.parseLong(awemeId);
        } catch (Exception unused2) {
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("process_id", this.f62500d);
            jSONObject.put("challenge_id", this.f62501e);
        } catch (JSONException unused3) {
        }
        Analysis ext_json = new Analysis().setLabelName("challenge").setExt_value(j).setValue(j2).setExt_json(jSONObject);
        C7573i.m23582a((Object) ext_json, "Analysis().setLabelName(…alue(aid).setExt_json(jo)");
        return ext_json;
    }

    /* renamed from: b */
    private final void m77716b() {
        boolean z;
        String stringExtra = getIntent().getStringExtra("id");
        if (TextUtils.isEmpty(stringExtra)) {
            stringExtra = getIntent().getStringExtra("cid");
        }
        String str = stringExtra;
        String stringExtra2 = getIntent().getStringExtra("aweme_id");
        String stringExtra3 = getIntent().getStringExtra("extra_challenge_from");
        CharSequence charSequence = stringExtra3;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            stringExtra3 = getIntent().getStringExtra("enter_from");
        }
        String stringExtra4 = getIntent().getStringExtra("from_token");
        boolean booleanExtra = getIntent().getBooleanExtra("extra_challenge_is_hashtag", false);
        int intExtra = getIntent().getIntExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_CHALLENGE_TYPE", 0);
        int intExtra2 = getIntent().getIntExtra("click_reason", 0);
        String stringExtra5 = getIntent().getStringExtra("extra_enterprise_challenge_uid");
        int intExtra3 = getIntent().getIntExtra("show_tab_index", -1);
        this.f62500d = getIntent().getStringExtra("process_id");
        C6907h.m21524a("show_tag_detail", (Map) new C22984d().mo59973a("enter_from", stringExtra3).mo59973a("tag_id", str).f60753a);
        ChallengeDetailParam challengeDetailParam = new ChallengeDetailParam(str, stringExtra2, stringExtra3, stringExtra4, booleanExtra, intExtra, intExtra2, stringExtra5, intExtra3, this.f62500d);
        this.f62499c = challengeDetailParam;
    }

    /* renamed from: a */
    public final void mo61684a(String str) {
        C7573i.m23587b(str, "challengeId");
        this.f62501e = str;
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.ba);
        findViewById(R.id.a19).setBackgroundColor(getResources().getColor(R.color.a7f));
        View findViewById = findViewById(R.id.a19);
        C7573i.m23582a((Object) findViewById, "findViewById<View>(R.id.container)");
        findViewById.setFitsSystemWindows(false);
        m77712a();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.challenge.ui.ChallengeDetailActivity", "onCreate", false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 10086 && i2 == -1) {
            setResult(-1, intent);
            finish();
            overridePendingTransition(0, 0);
        }
    }
}
