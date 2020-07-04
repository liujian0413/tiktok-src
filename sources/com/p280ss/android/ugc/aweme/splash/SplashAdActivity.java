package com.p280ss.android.ugc.aweme.splash;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.ies.uikit.base.AbsActivity;
import com.bytedance.p066a.p067a.p070b.p072b.C2077a;
import com.p280ss.android.p817ad.splash.C19115e;
import com.p280ss.android.p817ad.splash.C19142i;
import com.p280ss.android.p817ad.splash.C19152n;
import com.p280ss.android.ugc.aweme.app.AwemeAppData;
import com.p280ss.android.ugc.aweme.app.C6877n;
import com.p280ss.android.ugc.aweme.app.p306k.C6870b;
import com.p280ss.android.ugc.aweme.base.p1063g.C23346d;
import com.p280ss.android.ugc.aweme.commercialize.log.C24976t;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25054b;
import com.p280ss.android.ugc.aweme.commercialize.splash.C25083o;
import com.p280ss.android.ugc.aweme.lego.C7121a;
import com.p280ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.p280ss.android.ugc.aweme.main.MainActivity;
import com.p280ss.android.ugc.aweme.p304ab.C6857a;
import com.p280ss.android.ugc.aweme.setting.C7213d;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41553g;
import com.p280ss.android.ugc.aweme.util.C42880h;
import com.p280ss.android.ugc.aweme.utils.C43073dv;
import com.p280ss.android.ugc.aweme.utils.C43103en;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.splash.SplashAdActivity */
public class SplashAdActivity extends AbsActivity implements C41738c {

    /* renamed from: a */
    public static final C41730b f108615a = new C41730b();

    /* renamed from: b */
    public static volatile Object f108616b = new Object();

    /* renamed from: c */
    public static boolean f108617c = false;

    /* renamed from: d */
    public static volatile boolean f108618d = false;

    /* renamed from: e */
    private C19152n f108619e;

    /* renamed from: f */
    private View f108620f;

    /* renamed from: g */
    private boolean f108621g;

    /* renamed from: com.ss.android.ugc.aweme.splash.SplashAdActivity$a */
    static class C41729a implements C19115e {

        /* renamed from: a */
        SplashAdActivity f108622a;

        private C41729a() {
        }

        /* renamed from: a */
        public final void mo50822a(View view) {
            SplashAdActivity.f108617c = false;
            SplashAdActivity splashAdActivity = this.f108622a;
            if (splashAdActivity != null) {
                if (SplashAdActivity.f108618d) {
                    SplashAdActivity.f108618d = false;
                    synchronized (SplashAdActivity.f108616b) {
                        SplashAdActivity.f108616b.notifyAll();
                    }
                }
                splashAdActivity.finish();
            }
        }

        /* renamed from: a */
        public final void mo50821a(long j, String str) {
            C24976t.m82037a((Context) this.f108622a, j, str, System.currentTimeMillis() - C25083o.f66206b.mo65592a());
        }

        /* renamed from: a */
        public final void mo50823a(View view, C19142i iVar) {
            SplashAdActivity splashAdActivity = this.f108622a;
            if (splashAdActivity != null) {
                C42880h.m136156a("openSplashScheme: from = SplashAdActivity");
                C41752n.m132949a(splashAdActivity, iVar, C41743h.f108637a);
                splashAdActivity.finish();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.splash.SplashAdActivity$b */
    public static class C41730b {

        /* renamed from: a */
        C19152n f108623a;

        /* renamed from: b */
        View f108624b;

        /* renamed from: c */
        C41729a f108625c;

        C41730b() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo102517a() {
            this.f108623a = null;
            this.f108624b = null;
            this.f108625c = null;
        }

        /* renamed from: a */
        public final boolean mo102518a(Context context) {
            if (C6870b.m21394b()) {
                return false;
            }
            if (context == null) {
                mo102517a();
                return false;
            } else if (C7213d.m22500a().mo18740aC() != 0 || !AwemeAppData.m65765a().f60327g) {
                this.f108623a = SplashAdManagerHolder.m132886a(context.getApplicationContext()).mo50577d();
                this.f108625c = new C41729a();
                this.f108623a.mo50591a((C19115e) this.f108625c);
                C25054b.m82490a().mo65554b();
                this.f108624b = this.f108623a.mo50590a(context);
                if (this.f108624b == null) {
                    mo102517a();
                    return false;
                }
                ((MainLooperOptService) C7121a.m22243a(MainLooperOptService.class)).enable(false);
                Intent intent = new Intent(context, SplashAdActivity.class);
                if (context instanceof Activity) {
                    intent.putExtra("from", context.getClass().getName());
                } else {
                    intent.addFlags(268435456);
                }
                context.startActivity(intent);
                return true;
            } else {
                AwemeAppData.m65765a().f60327g = false;
                return false;
            }
        }
    }

    /* renamed from: b */
    public static boolean m132876b() {
        return f108617c;
    }

    /* renamed from: a */
    public final void mo102514a(Context context) {
        super.attachBaseContext(context);
    }

    /* access modifiers changed from: protected */
    public void attachBaseContext(Context context) {
        C41744i.m132937a(this, context);
    }

    public boolean isSplashShowing() {
        return true;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashAdActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public static Object m132875a() {
        f108618d = true;
        return f108616b;
    }

    public Resources getResources() {
        if (!this.f108621g) {
            C43073dv.m136653b((Activity) this);
            if (C23346d.m76602a(this)) {
                return new C23346d(super.getResources().getAssets(), super.getResources().getDisplayMetrics(), super.getResources().getConfiguration());
            }
        }
        return super.getResources();
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashAdActivity", "onResume", true);
        this.f108621g = true;
        if (!isFinishing() && VERSION.SDK_INT >= 24 && VERSION.SDK_INT < 28) {
            C43073dv.m136651a((Activity) this);
        }
        if (isFinishing()) {
            C41553g.m132328a(this);
            C2077a.m9159a("crash_service_destory_timeout");
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashAdActivity", "onResume", false);
            return;
        }
        super.onResume();
        C43103en.m136721a(this);
        C43073dv.m136651a((Activity) this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashAdActivity", "onResume", false);
    }

    public void onCreate(Bundle bundle) {
        String str;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashAdActivity", "onCreate", true);
        super.onCreate(bundle);
        C6857a.m21312e().mo16818a();
        try {
            setContentView((int) R.layout.ev);
            this.f108619e = f108615a.f108623a;
            this.f108620f = f108615a.f108624b;
            C41729a aVar = f108615a.f108625c;
            if (aVar != null) {
                aVar.f108622a = this;
            }
            f108615a.mo102517a();
            if (this.f108620f != null) {
                this.f108620f.setBackgroundResource(R.drawable.bjs);
                ((ViewGroup) findViewById(R.id.d9_)).addView(this.f108620f);
            } else {
                if (getIntent() == null) {
                    str = null;
                } else {
                    str = getIntent().getStringExtra("from");
                }
                if (!TextUtils.equals(str, MainActivity.class.getName())) {
                    C25054b.m82490a().mo65554b();
                }
                finish();
                overridePendingTransition(0, 0);
            }
            f108617c = true;
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashAdActivity", "onCreate", false);
            return;
        } catch (RuntimeException e) {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("exception", e.toString());
            C6877n.m21447a("splash_set_content_view", jSONObject);
        } catch (Throwable unused) {
        }
        f108615a.mo102517a();
        finish();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.splash.SplashAdActivity", "onCreate", false);
    }
}
