package com.p280ss.android.ttplatformsdk.view;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.ComponentName;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.CookieManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.example.p266a.C6490c;
import com.p280ss.android.ttplatformsdk.p911b.C20426a;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ttplatformsdk.view.TtBaseAuthorizeActivity */
public abstract class TtBaseAuthorizeActivity extends Activity {

    /* renamed from: a */
    public WebView f55172a;

    /* renamed from: b */
    public int f55173b;

    /* renamed from: c */
    protected long f55174c;

    /* renamed from: d */
    private View f55175d;

    /* renamed from: e */
    private TextView f55176e;

    /* renamed from: f */
    private TextView f55177f;

    /* renamed from: g */
    private ProgressBar f55178g;

    /* renamed from: h */
    private boolean f55179h;

    /* renamed from: i */
    private boolean f55180i;

    /* renamed from: j */
    private int f55181j;

    /* renamed from: k */
    private int f55182k;

    /* renamed from: com.ss.android.ttplatformsdk.view.TtBaseAuthorizeActivity$a */
    public final class C20435a extends WebChromeClient {
        public C20435a() {
        }

        public final void onProgressChanged(WebView webView, int i) {
            TtBaseAuthorizeActivity.this.mo54986a(i);
            if (i >= 100) {
                TtBaseAuthorizeActivity.this.mo54994e();
            }
        }
    }

    /* renamed from: com.ss.android.ttplatformsdk.view.TtBaseAuthorizeActivity$b */
    public final class C20436b extends WebViewClient {
        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return C6490c.m20174a(webView, renderProcessGoneDetail);
        }

        public C20436b() {
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            TtBaseAuthorizeActivity.this.f55173b = 2;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            boolean a = TtBaseAuthorizeActivity.this.mo54988a(str);
            if (!TtBaseAuthorizeActivity.this.mo54992c()) {
                TtBaseAuthorizeActivity.this.mo54995f();
            } else if (TtBaseAuthorizeActivity.this.mo54990b(str) || a) {
                return true;
            } else {
                C20437a.m67810a(TtBaseAuthorizeActivity.this.f55172a, str);
            }
            return true;
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            TtBaseAuthorizeActivity.this.f55173b = 1;
        }
    }

    /* renamed from: a */
    public abstract C20426a mo54985a();

    /* renamed from: a */
    public abstract void mo54987a(int i, String str);

    /* renamed from: b */
    public abstract boolean mo54989b();

    /* renamed from: c */
    public abstract void mo54991c(String str);

    /* renamed from: c */
    public abstract boolean mo54992c();

    /* renamed from: d */
    public abstract void mo54993d();

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        m67796h();
    }

    /* renamed from: g */
    private void m67795g() {
        if (!mo54989b()) {
            this.f55179h = true;
            mo54993d();
        }
    }

    /* renamed from: j */
    private void m67798j() {
        this.f55176e.setOnClickListener(new OnClickListener() {
            public final void onClick(View view) {
                ClickInstrumentation.onClick(view);
                TtBaseAuthorizeActivity.this.onBackPressed();
            }
        });
    }

    public void onBackPressed() {
        m67793a("", -10001);
        finish();
    }

    /* renamed from: e */
    public final void mo54994e() {
        if (this.f55178g != null && this.f55178g.getVisibility() == 0) {
            this.f55178g.setVisibility(8);
        }
    }

    /* renamed from: f */
    public final void mo54995f() {
        if (!this.f55180i) {
            this.f55180i = true;
            mo54994e();
            View inflate = LayoutInflater.from(this).inflate(R.layout.afj, null, false);
            inflate.findViewById(R.id.ds9).setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    TtBaseAuthorizeActivity.this.finish();
                }
            });
            new Builder(this).setCancelable(false).setView(inflate).create().show();
        }
    }

    /* renamed from: h */
    private void m67796h() {
        String str;
        String str2;
        if (!mo54989b()) {
            if (!this.f55179h) {
                onBackPressed();
            }
            this.f55179h = false;
            return;
        }
        setContentView(R.layout.aj);
        m67797i();
        m67798j();
        C20426a a = mo54985a();
        if (a != null) {
            this.f55181j = a.f55165j;
            this.f55182k = a.f55166k;
            CookieManager instance = CookieManager.getInstance();
            StringBuilder sb = new StringBuilder("bytedance_oauth_session_id=");
            sb.append(a.f55161f);
            instance.setCookie("https://open.snssdk.com/", sb.toString());
            StringBuilder sb2 = new StringBuilder("bytedance_oauth_user_name=");
            sb2.append(a.f55163h);
            instance.setCookie("https://open.snssdk.com/", sb2.toString());
            StringBuilder sb3 = new StringBuilder("bytedance_oauth_user_avatar=");
            sb3.append(a.f55164i);
            instance.setCookie("https://open.snssdk.com/", sb3.toString());
            StringBuilder sb4 = new StringBuilder("bytedance_oauth_user_id=");
            sb4.append(a.f55162g);
            instance.setCookie("https://open.snssdk.com/", sb4.toString());
            if (getIntent() != null) {
                str = getIntent().getStringExtra("_tt_params_client_key");
            } else {
                str = "";
            }
            if (getIntent() != null) {
                str2 = getIntent().getStringExtra("_tt_params_state");
            } else {
                str2 = "";
            }
            StringBuilder sb5 = new StringBuilder("https://open.snssdk.com/auth/auth_page/");
            sb5.append("?response_type=code");
            sb5.append("&client_key=");
            sb5.append(str);
            sb5.append("&auth_only=1");
            sb5.append("&from_sdk=1");
            sb5.append("&state=");
            sb5.append(str2);
            sb5.append("&redirect_uri=https://api.snssdk.com");
            if (!mo54992c()) {
                mo54995f();
            } else {
                C20438b.m67811a(this.f55172a, sb5.toString());
            }
        } else {
            throw new IllegalArgumentException("init view fail, configuration is null");
        }
    }

    /* renamed from: i */
    private void m67797i() {
        this.f55175d = findViewById(R.id.bkh);
        this.f55176e = (TextView) findViewById(R.id.e3g);
        this.f55177f = (TextView) findViewById(R.id.e3h);
        this.f55172a = (WebView) findViewById(R.id.egi);
        this.f55178g = (ProgressBar) findViewById(R.id.cl2);
        C20426a a = mo54985a();
        if (a != null) {
            if (!TextUtils.isEmpty(a.f55160e)) {
                this.f55175d.setBackgroundColor(Color.parseColor(a.f55160e));
            }
            if (!TextUtils.isEmpty(a.f55156a)) {
                this.f55176e.setText(a.f55156a);
            }
            if (!TextUtils.isEmpty(a.f55158c)) {
                this.f55176e.setTextColor(Color.parseColor(a.f55158c));
            }
            if (!TextUtils.isEmpty(a.f55157b)) {
                this.f55177f.setText(a.f55157b);
            }
            if (!TextUtils.isEmpty(a.f55159d)) {
                this.f55177f.setTextColor(Color.parseColor(a.f55159d));
            }
            this.f55172a.getSettings().setJavaScriptEnabled(true);
            this.f55172a.setWebViewClient(C6490c.m20171a((WebViewClient) new C20436b()));
            this.f55172a.setWebChromeClient(new C20435a());
            return;
        }
        throw new IllegalArgumentException("init view fail, configuration is null");
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("key_is_start_login", false);
    }

    /* renamed from: b */
    private String m67794b(int i) {
        if (i != 0) {
            if (i == 9) {
                return getString(R.string.b28);
            }
            if (i != 999) {
                return getString(R.string.b27);
            }
        }
        return "";
    }

    /* renamed from: a */
    public final void mo54986a(int i) {
        if (this.f55178g != null) {
            this.f55178g.setProgress(i);
            this.f55178g.setVisibility(0);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f55174c = System.currentTimeMillis();
        if (bundle != null) {
            this.f55179h = bundle.getBoolean("key_is_start_login");
        } else {
            m67795g();
        }
    }

    /* renamed from: a */
    public final boolean mo54988a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (scheme.equals("bdauth-jsbridge")) {
                if (TextUtils.equals("login", host)) {
                    return true;
                }
                if (TextUtils.equals("login_fail", host)) {
                    mo54991c(parse.getQueryParameter("error_msg"));
                    return true;
                }
            }
            return false;
        } catch (Throwable unused) {
            return false;
        }
    }

    /* renamed from: b */
    public final boolean mo54990b(String str) {
        int i;
        if (TextUtils.isEmpty(str) || !str.startsWith("https://api.snssdk.com")) {
            return false;
        }
        Uri parse = Uri.parse(str);
        String queryParameter = parse.getQueryParameter("code");
        if (TextUtils.isEmpty(queryParameter)) {
            try {
                i = Integer.parseInt(parse.getQueryParameter("errorCode"));
            } catch (Exception unused) {
                i = 999;
            }
            mo54987a(i, m67794b(i));
            return false;
        }
        m67793a(queryParameter, 0);
        finish();
        return true;
    }

    /* renamed from: a */
    private void m67793a(String str, int i) {
        String str2;
        Bundle bundle = new Bundle();
        bundle.putString("_tt_params_token", str);
        bundle.putInt("_tt_params_error_code", i);
        bundle.putString("_tt_params_error_msg", m67794b(i));
        bundle.putInt("_tt_params_version_code", this.f55181j);
        bundle.putInt("_tt_params_update_version_code", this.f55182k);
        if (getIntent() != null) {
            str2 = getIntent().getStringExtra("_tt_params_package_name");
        } else {
            str2 = "";
        }
        if (!TextUtils.isEmpty(str2)) {
            Intent intent = new Intent();
            StringBuilder sb = new StringBuilder();
            sb.append(str2);
            sb.append(".ttopenapi.TtEntryActivity");
            intent.setComponent(new ComponentName(str2, sb.toString()));
            intent.putExtras(bundle);
            intent.putExtra("start_only_for_android", true);
            startActivity(intent);
        }
    }
}
