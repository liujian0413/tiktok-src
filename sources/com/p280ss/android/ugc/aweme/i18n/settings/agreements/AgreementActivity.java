package com.p280ss.android.ugc.aweme.i18n.settings.agreements;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.example.p266a.C6490c;
import com.gyf.barlibrary.ImmersionBar;
import com.p280ss.android.ugc.aweme.base.AmeActivity;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.web.C43443g;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity */
public class AgreementActivity extends AmeActivity implements OnClickListener {

    /* renamed from: a */
    private ImmersionBar f80237a;
    ImageView mBackBtn;
    TextView mBtn;
    View mLoadingView;
    View mStatusBarView;
    TextView mTextView;
    View mTitleBar;
    WebView mWebView;

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f80237a != null) {
            this.f80237a.destroy();
        }
    }

    public void onPause() {
        super.onPause();
        this.mWebView.onPause();
    }

    /* renamed from: a */
    private void m99746a() {
        if (VERSION.SDK_INT >= 19) {
            this.mStatusBarView.getLayoutParams().height = C10994a.m32204a((Context) this);
        }
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity", "onResume", true);
        super.onResume();
        this.mWebView.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity", "onResume", false);
    }

    public void setStatusBarColor() {
        this.f80237a = ImmersionBar.with((Activity) this);
        if (getContentResolver() != null) {
            this.f80237a.init();
        }
        C23487o.m77155c((Activity) this);
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        finish();
    }

    public void onCreate(Bundle bundle) {
        int i;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.a9);
        if (getIntent().getExtras() == null) {
            finish();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity", "onCreate", false);
            return;
        }
        m99746a();
        Bundle extras = getIntent().getExtras();
        boolean z = extras.getBoolean("FIELD_SHOW_AGREE_BUTTON", false);
        String string = extras.getString("FIELD_TITLE");
        String string2 = extras.getString("URL_FIELD");
        TextView textView = this.mBtn;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        textView.setVisibility(i);
        if (!TextUtils.isEmpty(string2)) {
            C30540a.m99748a(this.mWebView, string2);
            this.mWebView.setWebViewClient(C6490c.m20171a((WebViewClient) new C43443g() {
                public final void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    AgreementActivity.this.mLoadingView.setVisibility(8);
                }

                public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                    Uri parse = Uri.parse(str);
                    String lowerCase = parse.getScheme().toLowerCase();
                    if (parse == null || !"market".equals(lowerCase)) {
                        return super.shouldOverrideUrlLoading(webView, str);
                    }
                    Intent intent = new Intent("android.intent.action.VIEW");
                    intent.setData(parse);
                    intent.addFlags(268435456);
                    webView.getContext().startActivity(intent);
                    return true;
                }
            }));
            this.mWebView.getSettings().setJavaScriptEnabled(true);
        }
        if (!TextUtils.isEmpty(string)) {
            this.mTextView.setText(string);
            this.mTextView.getPaint().setFakeBoldText(true);
        } else {
            this.mTextView.setVisibility(8);
        }
        this.mBackBtn.setOnClickListener(this);
        this.mBtn.setOnClickListener(this);
        if (extras.getBoolean("HIDE_TITLE_BAR", false)) {
            this.mTitleBar.setVisibility(8);
        }
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.i18n.settings.agreements.AgreementActivity", "onCreate", false);
    }

    /* renamed from: a */
    public static void m99747a(Activity activity, String str, boolean z, String str2) {
        Intent intent = new Intent(activity, AgreementActivity.class);
        intent.putExtra("URL_FIELD", str);
        intent.putExtra("FIELD_TITLE", str2);
        intent.putExtra("FIELD_SHOW_AGREE_BUTTON", false);
        activity.startActivity(intent);
    }
}
