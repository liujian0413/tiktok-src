package com.p280ss.android.ugc.aweme.crossplatform.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.common.utility.C9729e;
import com.bytedance.ies.abmock.C6384b;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.ies.dmt.p262ui.p563c.C10761a;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.activity.C23255b;
import com.p280ss.android.ugc.aweme.base.activity.C23257d;
import com.p280ss.android.ugc.aweme.base.p1063g.C23346d;
import com.p280ss.android.ugc.aweme.bullet.BulletContainerActivity;
import com.p280ss.android.ugc.aweme.bullet.C23563b;
import com.p280ss.android.ugc.aweme.bullet.p1074ab.MTReactUseBulletExperiment;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25252aw;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25367k;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25832a;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25835d;
import com.p280ss.android.ugc.aweme.crossplatform.base.C25836e;
import com.p280ss.android.ugc.aweme.crossplatform.business.C25862i;
import com.p280ss.android.ugc.aweme.crossplatform.business.C25864j;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b;
import com.p280ss.android.ugc.aweme.crossplatform.params.base.C25886b.C25887a;
import com.p280ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26038l;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26039m;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import com.p280ss.android.ugc.aweme.favorites.viewholder.C27834b;
import com.p280ss.android.ugc.aweme.framework.p1276e.C29962c;
import com.p280ss.android.ugc.aweme.live.p1363c.C32471b;
import com.p280ss.android.ugc.aweme.p1685ug.C42687b;
import com.p280ss.android.ugc.aweme.shortvideo.util.C41553g;
import com.p280ss.android.ugc.aweme.utils.C43073dv;
import com.p280ss.android.ugc.aweme.utils.p1695d.C43045c;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.lang.ref.WeakReference;
import org.greenrobot.eventbus.C7705c;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity */
public class CrossPlatformActivity extends AmeActivity implements C9729e, C23257d, C25835d, C25864j {

    /* renamed from: b */
    public static boolean f68245b = true;

    /* renamed from: a */
    public AbsActivityContainer f68246a;

    /* renamed from: c */
    public C25811a f68247c;

    /* renamed from: d */
    private C25886b f68248d;

    /* renamed from: e */
    private C23255b f68249e;

    /* renamed from: f */
    private boolean f68250f = true;

    /* renamed from: g */
    private C29962c f68251g;

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity$a */
    public interface C25811a {
        /* renamed from: a */
        boolean mo67106a();
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: a */
    public final C25862i mo67101a() {
        if (this.f68246a == null) {
            return null;
        }
        return this.f68246a.getCrossPlatformBusiness();
    }

    public void onPause() {
        super.onPause();
        if (this.f68251g != null) {
            this.f68251g.mo76122b();
        }
    }

    public void setStatusBarColor() {
        if (this.f68246a != null) {
            this.f68246a.mo65874c();
        }
    }

    /* renamed from: c */
    private boolean m84845c() {
        if (!isViewValid()) {
            return false;
        }
        if (this.f68251g == null) {
            this.f68251g = new C29962c(this);
            this.f68251g.f78760g = false;
        }
        return true;
    }

    /* renamed from: d */
    private void m84846d() {
        if (!C6399b.m19944t() && this.f68248d != null) {
            mo67102a(C26039m.class);
        }
    }

    public void onDestroy() {
        C25828m.m84934a().mo67149c();
        super.onDestroy();
        if (this.f68251g != null) {
            this.f68251g.mo76117a();
        }
        if (C27834b.m91252b() != null) {
            C27834b.m91250a(null);
        }
    }

    public void finish() {
        if (this.f68250f) {
            C25367k.m83410a(this);
            super.finish();
            if (this.f68248d != null && this.f68248d.f68476d.f68516k) {
                super.overridePendingTransition(0, R.anim.t);
            }
            if (this.f68246a != null) {
                this.f68246a.mo67093j();
            }
            C25252aw.m83005a(null);
            C7705c.m23799a().mo20391b(C42687b.class);
            getIntent().removeExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY");
        }
    }

    public Resources getResources() {
        if (!this.mFirstResumed) {
            C43073dv.m136653b((Activity) this);
            if (C23346d.m76602a(this)) {
                return new C23346d(super.getResources().getAssets(), super.getResources().getDisplayMetrics(), super.getResources().getConfiguration());
            }
        }
        return super.getResources();
    }

    public void onBackPressed() {
        if (C43045c.m136573c()) {
            Intent intent = (Intent) getIntent().getParcelableExtra("VENDOR_BACK_INTENT_FOR_INTENT_KEY");
            boolean booleanExtra = getIntent().getBooleanExtra("VENDOR_CLICK_BACK_FOR_INTENT_KEY", false);
            if (!(intent == null || intent.resolveActivity(getPackageManager()) == null || booleanExtra)) {
                startActivity(intent);
                finish();
                return;
            }
        }
        if (this.f68246a != null && this.f68250f && (this.f68247c == null || !this.f68247c.mo67106a())) {
            this.f68246a.mo67090b();
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onResume", true);
        if (!isFinishing() && VERSION.SDK_INT >= 24 && VERSION.SDK_INT < 28) {
            C43073dv.m136651a((Activity) this);
        }
        if (isFinishing()) {
            C41553g.m132328a(this);
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onResume", false);
            return;
        }
        super.onResume();
        if (this.f68251g != null) {
            this.f68251g.mo76125c();
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onResume", false);
    }

    /* renamed from: b */
    private void m84844b() {
        Uri data = getIntent().getData();
        if (data != null) {
            if ((data.toString().startsWith(WebKitApi.SCHEME_HTTP) || data.toString().startsWith(WebKitApi.SCHEME_HTTPS)) && TextUtils.equals(data.getQueryParameter("__live_platform__"), "webcast")) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("bundle_no_hw_acceleration", this.f68248d.f68473a.f68439l);
                bundle.putBoolean("hide_nav_bar", this.f68248d.f68476d.f68521p);
                bundle.putBoolean("hide_status_bar", this.f68248d.f68476d.f68522q);
                bundle.putBoolean("hide_more", !this.f68248d.f68476d.f68514i);
                bundle.putInt("bundle_web_view_background_color", this.f68248d.f68476d.f68529x);
                bundle.putLong("ad_id", this.f68248d.f68474b.f68446a);
                bundle.putString("title", this.f68248d.f68476d.f68509d);
                new C32471b().openLiveBrowser(data.toString(), bundle, (Context) this);
                finish();
            }
        }
    }

    /* renamed from: a */
    public final void mo60524a(C23255b bVar) {
        this.f68249e = bVar;
    }

    public void attachBaseContext(Context context) {
        super.attachBaseContext(context);
        C25836e.m84972a().mo67156b();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        if (this.f68246a != null) {
            this.f68246a.mo67084a(configuration);
        }
    }

    /* renamed from: a */
    private void m84843a(C25886b bVar) {
        this.f68246a = new MixActivityContainer(this, bVar);
        this.f68246a.mo67086a((C25821f) new C25816a(this));
        getLifecycle().mo55a(this.f68246a);
    }

    public void showCustomToast(String str) {
        if (m84845c()) {
            this.f68251g.mo76120a(str);
        }
    }

    /* renamed from: a */
    public final <T extends C26038l> T mo67102a(Class<T> cls) {
        if (this.f68246a == null) {
            return null;
        }
        return this.f68246a.mo67082a(cls);
    }

    public void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onCreate", true);
        if (getIntent() != null) {
            Uri data = getIntent().getData();
            if (data != null && !data.isOpaque() && TextUtils.equals("bullet", data.getQueryParameter("hybrid_sdk_version")) && C6384b.m19835a().mo15287a(MTReactUseBulletExperiment.class, true, "mt_rn_use_bullet", C6384b.m19835a().mo15295d().mt_rn_use_bullet, 0) == 1) {
                C23563b.f62166a.mo61488a(this, BulletContainerActivity.class, data.toString());
                finish();
            }
        }
        requestDisableOptimizeViewHierarchy();
        super.onCreate(bundle);
        Intent intent = getIntent();
        intent.putExtra("webview_progress_bar", C25832a.m84960a(intent.getExtras()));
        this.f68248d = C25887a.m85152a(intent);
        this.f68250f = getIntent().getBooleanExtra("key_support_back", true);
        m84844b();
        m84843a(this.f68248d);
        if (!this.f68246a.mo67088a()) {
            this.f68250f = true;
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onCreate", false);
        } else if (C6399b.m19944t() || C25817b.m84917a(this)) {
            if (this.f68248d.f68476d.f68516k) {
                super.overridePendingTransition(R.anim.bq, 0);
            }
            supportRequestWindowFeature(10);
            setContentView((int) R.layout.b5);
            this.f68246a.mo67094k();
            m84846d();
            if (this.f68248d.f68475c != null && TextUtils.equals("page_movie_detail", this.f68248d.f68475c.f68494e)) {
                C27834b.m91250a(new WeakReference<>((CrossPlatformWebView) this.f68246a.mo65877f()));
            }
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onCreate", false);
        } else {
            C10761a.m31392b(C6399b.m19921a(), (int) R.string.cjs, 0).mo25750a();
            this.f68250f = true;
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity", "onCreate", false);
        }
    }

    public void showCustomLongToast(int i, String str) {
        if (m84845c()) {
            this.f68251g.mo76118a(i, str);
        }
    }

    public void startActivity(Intent intent, Bundle bundle) {
        super.startActivity(intent, bundle);
        if (this.f68246a != null) {
            this.f68246a.mo67092i();
        }
    }

    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return super.onCreateView(str, context, attributeSet);
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C43152a.m136868a((Activity) this, i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (this.f68249e != null) {
            this.f68249e.mo60523a(i, i2, intent);
        }
        if (this.f68246a != null) {
            this.f68246a.mo60523a(i, i2, intent);
        }
    }

    public void showCustomToast(int i, String str, int i2, int i3) {
        if (m84845c()) {
            this.f68251g.mo76119a(i, str, i2, i3);
        }
    }

    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        if (!C25828m.m84934a().mo67147a(this.f68248d) || !TextUtils.equals(str, "com.ss.android.ugc.aweme.crossplatform.platform.webview.SingleWebView")) {
            return super.onCreateView(view, str, context, attributeSet);
        }
        SingleWebView a = C25828m.m84934a().mo67146a((Activity) this);
        if (a == null) {
            a = new SingleWebView(this, attributeSet);
        }
        a.setId(R.id.fn);
        return a;
    }
}
