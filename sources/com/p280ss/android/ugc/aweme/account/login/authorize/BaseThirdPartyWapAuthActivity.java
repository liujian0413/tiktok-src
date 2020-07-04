package com.p280ss.android.ugc.aweme.account.login.authorize;

import android.content.Intent;
import android.net.Uri;
import android.os.Handler;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.webkit.CookieManager;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.android.sdk.p899a.C20099c;
import com.p280ss.android.ugc.aweme.C21671bd;
import com.p280ss.android.ugc.aweme.account.login.BaseActivity;
import com.p280ss.android.ugc.aweme.app.C22909c;
import com.p280ss.android.ugc.aweme.main.p1385g.C33014a;
import com.p280ss.android.ugc.aweme.main.p1385g.C33039y;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.BaseThirdPartyWapAuthActivity */
public abstract class BaseThirdPartyWapAuthActivity extends BaseActivity {

    /* renamed from: l */
    WebView f57245l;

    /* renamed from: m */
    ProgressBar f57246m;

    /* renamed from: n */
    Handler f57247n;

    /* renamed from: o */
    Runnable f57248o;

    /* renamed from: p */
    View f57249p;

    /* renamed from: q */
    CheckBox f57250q;

    /* renamed from: r */
    C20099c f57251r;

    /* renamed from: s */
    private TextView f57252s;

    /* renamed from: t */
    private boolean f57253t;

    /* renamed from: com.ss.android.ugc.aweme.account.login.authorize.BaseThirdPartyWapAuthActivity$a */
    class C21300a extends WebChromeClient {
        C21300a() {
        }

        public final void onProgressChanged(WebView webView, int i) {
            BaseThirdPartyWapAuthActivity.this.mo57317a(i);
            if (i >= 100) {
                BaseThirdPartyWapAuthActivity.this.mo57320e();
            }
        }
    }

    /* renamed from: a */
    public final int mo57175a() {
        return R.layout.ajl;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo57318a(WebView webView);

    /* renamed from: d */
    public final void mo57312d() {
        if (this.f57246m.getVisibility() == 0) {
            this.f57246m.startAnimation(AnimationUtils.loadAnimation(this, 17432577));
            this.f57246m.setVisibility(8);
        }
    }

    /* renamed from: e */
    public final void mo57320e() {
        this.f57247n.removeCallbacks(this.f57248o);
        this.f57247n.postDelayed(this.f57248o, 500);
    }

    public void onDestroy() {
        ((C33039y) C21671bd.m72521a(C33039y.class)).mo60005a(this.f57245l);
        super.onDestroy();
    }

    public void onPause() {
        super.onPause();
        ((C33039y) C21671bd.m72521a(C33039y.class)).mo60004a(this, this.f57245l);
    }

    /* renamed from: b */
    public final void mo57176b() {
        String str;
        super.mo57176b();
        this.f57247n = new Handler();
        this.f57248o = new Runnable() {
            public final void run() {
                BaseThirdPartyWapAuthActivity.this.mo57312d();
            }
        };
        Intent intent = getIntent();
        String dataString = intent.getDataString();
        this.f57253t = intent.getBooleanExtra("KEY_EXTRA_IS_AUTH_ONLY", false);
        if (dataString == null || !dataString.startsWith(WebKitApi.SCHEME_HTTP)) {
            finish();
            return;
        }
        this.f57088h.setText(R.string.dxd);
        try {
            str = Uri.parse(dataString).getQueryParameter("platform");
            if (str != null) {
                try {
                    C20099c a = C20099c.m66277a(str);
                    if (a != null) {
                        this.f57088h.setText(a.f54378o);
                    }
                } catch (Exception unused) {
                }
            }
        } catch (Exception unused2) {
            str = null;
        }
        if (str != null) {
            C20099c[] cVarArr = C20099c.f54365b;
            int length = cVarArr.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                C20099c cVar = cVarArr[i];
                if (cVar.f54376m.equals(str)) {
                    this.f57251r = cVar;
                    break;
                }
                i++;
            }
        }
        this.f57252s = (TextView) findViewById(R.id.d_0);
        this.f57249p = findViewById(R.id.d9w);
        this.f57250q = (CheckBox) findViewById(R.id.d9x);
        this.f57246m = (ProgressBar) findViewById(R.id.d9z);
        CookieManager.getInstance().setAcceptCookie(true);
        this.f57245l = (WebView) findViewById(R.id.d_1);
        WebSettings settings = this.f57245l.getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setSupportZoom(true);
        settings.setSupportMultipleWindows(false);
        settings.setBuiltInZoomControls(true);
        mo57318a(this.f57245l);
        this.f57245l.setWebChromeClient(new C21300a());
        ((C33014a) C21671bd.m72521a(C33014a.class)).mo59999a(dataString, this.f57245l);
    }

    /* renamed from: b */
    private static boolean m71720b(String str) {
        if (TextUtils.isEmpty(str) || !str.contains("auth/login_success") || !str.contains("code=") || !str.contains("state=")) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo57317a(int i) {
        this.f57246m.setProgress(i);
        this.f57247n.removeCallbacks(this.f57248o);
        if (this.f57246m.getVisibility() != 0) {
            this.f57246m.startAnimation(AnimationUtils.loadAnimation(this, 17432576));
            this.f57246m.setVisibility(0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo57319a(String str) {
        if (this.f57253t && m71720b(str)) {
            try {
                Uri parse = Uri.parse(str);
                String queryParameter = parse.getQueryParameter("code");
                String queryParameter2 = parse.getQueryParameter("state");
                Intent intent = new Intent();
                intent.putExtra("h5_auth_code", queryParameter);
                intent.putExtra("h5_auth_state", queryParameter2);
                if (this.f57251r != null) {
                    intent.putExtra("platform", this.f57251r.f54376m);
                }
                setResult(-1, intent);
                finish();
            } catch (Exception unused) {
                setResult(0);
                finish();
            }
            return true;
        } else if (!str.startsWith(C22909c.f60638b)) {
            return false;
        } else {
            Intent intent2 = new Intent();
            intent2.putExtra("callback", str);
            if (this.f57251r != null) {
                intent2.putExtra("platform", this.f57251r.f54376m);
            }
            setResult(-1, intent2);
            finish();
            return true;
        }
    }
}
