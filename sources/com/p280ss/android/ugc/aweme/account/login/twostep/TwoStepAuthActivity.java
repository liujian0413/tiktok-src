package com.p280ss.android.ugc.aweme.account.login.twostep;

import android.app.Activity;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewStub;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.dmt.p262ui.titlebar.NormalTitleBar;
import com.bytedance.ies.dmt.p262ui.titlebar.p565a.C10797a;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.account.base.MusAbsActivity;
import com.p280ss.android.ugc.aweme.account.login.twostep.C21635g.C21636a;
import com.p280ss.android.ugc.aweme.account.p943f.C21176c;
import com.p280ss.android.ugc.aweme.account.p982ui.C22308h;
import com.p280ss.android.ugc.aweme.account.p982ui.C22308h.C22309a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.utils.C43173w;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.concurrent.Callable;
import kotlin.C7581n;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity */
public final class TwoStepAuthActivity extends MusAbsActivity implements C21636a, C22308h {

    /* renamed from: f */
    public static final boolean f57973f = C7163a.m22363a();

    /* renamed from: g */
    public static final C21593a f57974g = new C21593a(null);

    /* renamed from: a */
    public C21635g f57975a;

    /* renamed from: b */
    public String f57976b;

    /* renamed from: c */
    public String f57977c;

    /* renamed from: d */
    public String f57978d;

    /* renamed from: e */
    public C21594b f57979e;

    /* renamed from: h */
    private ViewStub f57980h;

    /* renamed from: i */
    private int f57981i = -1;

    /* renamed from: j */
    private C22309a f57982j;

    /* renamed from: k */
    private boolean f57983k;

    /* renamed from: l */
    private HashMap f57984l;

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity$a */
    public static final class C21593a {
        private C21593a() {
        }

        public /* synthetic */ C21593a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity$b */
    public interface C21594b {
        /* renamed from: a */
        void mo57786a(int i, int i2, Intent intent);
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity$c */
    public static final class C21595c implements C10797a {

        /* renamed from: a */
        final /* synthetic */ TwoStepAuthActivity f57985a;

        /* renamed from: b */
        public final void mo25896b(View view) {
        }

        C21595c(TwoStepAuthActivity twoStepAuthActivity) {
            this.f57985a = twoStepAuthActivity;
        }

        /* renamed from: a */
        public final void mo25895a(View view) {
            this.f57985a.onBackPressed();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity$d */
    static final class C21596d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ TwoStepAuthActivity f57986a;

        C21596d(TwoStepAuthActivity twoStepAuthActivity) {
            this.f57986a = twoStepAuthActivity;
        }

        public final /* synthetic */ Object call() {
            return Boolean.valueOf(m72358a());
        }

        /* renamed from: a */
        private boolean m72358a() {
            JSONObject jSONObject;
            String str = null;
            try {
                jSONObject = new JSONObject(this.f57986a.f57977c);
            } catch (JSONException unused) {
                jSONObject = null;
            }
            if (jSONObject == null) {
                return false;
            }
            C21635g gVar = this.f57986a.f57975a;
            if (gVar != null) {
                gVar.mo57848a(jSONObject);
            }
            TwoStepAuthActivity twoStepAuthActivity = this.f57986a;
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            if (jSONObject2 != null) {
                str = jSONObject2.optString("profile_key");
            }
            twoStepAuthActivity.f57978d = str;
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity$e */
    static final class C21597e<TTaskResult, TContinuationResult> implements C1591g<Boolean, Object> {

        /* renamed from: a */
        final /* synthetic */ TwoStepAuthActivity f57987a;

        C21597e(TwoStepAuthActivity twoStepAuthActivity) {
            this.f57987a = twoStepAuthActivity;
        }

        public final Object then(C1592h<Boolean> hVar) {
            if (!C43173w.m136926a((C1592h) hVar)) {
                return C7581n.f20898a;
            }
            C21635g gVar = this.f57987a.f57975a;
            if (gVar != null) {
                gVar.f58069i = this.f57987a.f57976b;
            }
            C21635g gVar2 = this.f57987a.f57975a;
            if (gVar2 != null) {
                return gVar2.mo57818a();
            }
            return null;
        }
    }

    /* renamed from: a */
    private View m72352a(int i) {
        if (this.f57984l == null) {
            this.f57984l = new HashMap();
        }
        View view = (View) this.f57984l.get(Integer.valueOf(R.id.e6b));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(R.id.e6b);
        this.f57984l.put(Integer.valueOf(R.id.e6b), findViewById);
        return findViewById;
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void onDestroy() {
        super.onDestroy();
        this.f57979e = null;
    }

    public final void onBackPressed() {
        boolean z;
        if (this.f57982j != null) {
            C22309a aVar = this.f57982j;
            if (aVar == null) {
                C7573i.m23580a();
            }
            z = aVar.mo58743a();
        } else {
            z = false;
        }
        if (!z) {
            this.f57983k = true;
            finish();
        }
    }

    public final void onStop() {
        super.onStop();
        if (this.f57983k) {
            C21634f.m72433a().mo57847a(new C21176c(null, null, Integer.valueOf(0), "User left TwoStepAuthActivity before completing auth process"));
        }
    }

    public final void setStatusBarColor() {
        ImmersionBar.with((Activity) this).statusBarColor((int) R.color.a_k).statusBarDarkFont(true).init();
    }

    /* renamed from: a */
    private final void m72353a() {
        if (this.f57981i == -1) {
            new StringBuilder("Unknown TwoStepAuthType: ").append(this.f57981i);
            finish();
        } else if (TextUtils.isEmpty(this.f57977c)) {
            finish();
        } else {
            switch (this.f57981i) {
                case 1:
                    AppCompatActivity appCompatActivity = this;
                    ViewStub viewStub = this.f57980h;
                    if (viewStub == null) {
                        C7573i.m23583a("contentStub");
                    }
                    this.f57975a = new C21621d(appCompatActivity, viewStub, this);
                    break;
                case 2:
                    AppCompatActivity appCompatActivity2 = this;
                    ViewStub viewStub2 = this.f57980h;
                    if (viewStub2 == null) {
                        C7573i.m23583a("contentStub");
                    }
                    this.f57975a = new C21615c(appCompatActivity2, viewStub2, this);
                    break;
                case 3:
                    AppCompatActivity appCompatActivity3 = this;
                    ViewStub viewStub3 = this.f57980h;
                    if (viewStub3 == null) {
                        C7573i.m23583a("contentStub");
                    }
                    this.f57975a = new C21628e(appCompatActivity3, viewStub3, this);
                    break;
                case 4:
                    AppCompatActivity appCompatActivity4 = this;
                    ViewStub viewStub4 = this.f57980h;
                    if (viewStub4 == null) {
                        C7573i.m23583a("contentStub");
                    }
                    this.f57975a = new C21608b(appCompatActivity4, viewStub4, this);
                    break;
                case 5:
                    AppCompatActivity appCompatActivity5 = this;
                    ViewStub viewStub5 = this.f57980h;
                    if (viewStub5 == null) {
                        C7573i.m23583a("contentStub");
                    }
                    this.f57975a = new C21605a(appCompatActivity5, viewStub5, this);
                    break;
            }
            C1592h.m7853a((Callable<TResult>) new C21596d<TResult>(this)).mo6876a((C1591g<TResult, TContinuationResult>) new C21597e<TResult,TContinuationResult>(this), C1592h.f5958b);
        }
    }

    /* renamed from: a */
    public final void mo57784a(String str) {
        C21634f.m72433a().mo57847a(new C21176c(str, this.f57978d, Integer.valueOf(0), null));
        finish();
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.f5);
        ((NormalTitleBar) m72352a((int) R.id.e6b)).setOnTitleBarClickListener(new C21595c(this));
        ((NormalTitleBar) m72352a((int) R.id.e6b)).mo25857a(false);
        NormalTitleBar normalTitleBar = (NormalTitleBar) m72352a((int) R.id.e6b);
        C7573i.m23582a((Object) normalTitleBar, "two_step_auth_title_bar");
        normalTitleBar.getStartBtn().setImageResource(R.drawable.cmx);
        ViewStub viewStub = (ViewStub) findViewById(R.id.e6a);
        C7573i.m23582a((Object) viewStub, "two_step_auth_content_stub");
        this.f57980h = viewStub;
        this.f57981i = getIntent().getIntExtra("auth_type", -1);
        this.f57977c = getIntent().getStringExtra("auth_data");
        this.f57976b = getIntent().getStringExtra("url_path");
        m72353a();
        getWindow().setBackgroundDrawable(new ColorDrawable(getResources().getColor(R.color.l0)));
        NormalTitleBar normalTitleBar2 = (NormalTitleBar) m72352a((int) R.id.e6b);
        C7573i.m23582a((Object) normalTitleBar2, "two_step_auth_title_bar");
        normalTitleBar2.getStartBtn().setImageResource(R.drawable.cmx);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.account.login.twostep.TwoStepAuthActivity", "onCreate", false);
    }

    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        C21594b bVar = this.f57979e;
        if (bVar != null) {
            bVar.mo57786a(i, i2, intent);
        }
    }
}
