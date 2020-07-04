package com.bytedance.lobby.instagram;

import android.content.Intent;
import android.os.Bundle;
import android.support.p029v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.CookieManager;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.lobby.C12191a;
import com.example.p266a.C6490c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.UUID;
import okhttp3.HttpUrl;

public class InstagramAuthActivity extends AppCompatActivity {

    /* renamed from: b */
    public static String f32485b;

    /* renamed from: c */
    public static String f32486c;

    /* renamed from: d */
    public static String f32487d;

    /* renamed from: e */
    public static String f32488e;

    /* renamed from: f */
    private static final boolean f32489f = C12191a.f32435a;

    /* renamed from: a */
    public String f32490a = "";

    /* renamed from: g */
    private WebView f32491g;

    public void onBackPressed() {
        Intent intent = new Intent();
        intent.putExtra("ig_result_error_info", "Login flow cancelled by pressing back");
        setResult(-1, intent);
        super.onBackPressed();
    }

    /* renamed from: a */
    private void m35515a() {
        Intent intent = getIntent();
        if (intent != null) {
            f32486c = intent.getStringExtra("client_id");
            f32485b = intent.getStringExtra("redirect_url");
            f32487d = intent.getStringExtra("response_type");
            f32488e = intent.getStringExtra("scope");
        }
    }

    /* renamed from: b */
    private void m35516b() {
        try {
            WebSettings settings = this.f32491g.getSettings();
            settings.setJavaScriptEnabled(true);
            settings.setLoadsImagesAutomatically(true);
            settings.setDefaultTextEncodingName("utf-8");
            settings.setDomStorageEnabled(true);
        } catch (Exception unused) {
        }
        this.f32491g.setWebViewClient(C6490c.m20171a((WebViewClient) new WebViewClient() {

            /* renamed from: b */
            private String f32493b;

            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                return C6490c.m20174a(webView, renderProcessGoneDetail);
            }

            public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
                if (this.f32493b != null && this.f32493b.contains("www.instagram.com/challenge") && TextUtils.equals("https://www.instagram.com/", str)) {
                    HttpUrl parse = HttpUrl.parse("https://www.instagram.com/oauth/authorize");
                    if (parse != null) {
                        String httpUrl = parse.newBuilder().addQueryParameter("client_id", InstagramAuthActivity.f32486c).addQueryParameter("redirect_uri", InstagramAuthActivity.f32485b).addQueryParameter("response_type", InstagramAuthActivity.f32487d).addQueryParameter("state", InstagramAuthActivity.this.f32490a).addQueryParameter("scope", InstagramAuthActivity.f32488e).build().toString();
                        this.f32493b = httpUrl;
                        C12217a.m35520a(webView, httpUrl);
                        return false;
                    }
                }
                this.f32493b = str;
                if (InstagramAuthActivity.this.mo29953a(str) || super.shouldOverrideUrlLoading(webView, str)) {
                    return true;
                }
                return false;
            }
        }));
    }

    /* renamed from: c */
    private void m35517c() {
        this.f32490a = UUID.randomUUID().toString();
        HttpUrl parse = HttpUrl.parse("https://api.instagram.com/oauth/authorize/");
        if (parse != null) {
            C12218b.m35521a(this.f32491g, parse.newBuilder().addQueryParameter("client_id", f32486c).addQueryParameter("redirect_uri", f32485b).addQueryParameter("response_type", "code").addQueryParameter("state", this.f32490a).addQueryParameter("scope", "basic").build().toString());
        }
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView((int) R.layout.cc);
        this.f32491g = (WebView) findViewById(R.id.b24);
        m35515a();
        m35516b();
        CookieManager instance = CookieManager.getInstance();
        if (!TextUtils.isEmpty(instance.getCookie("https://.instagram.com"))) {
            instance.setCookie("https://.instagram.com", "sessionid=");
        }
        m35517c();
    }

    /* renamed from: a */
    public final boolean mo29953a(String str) {
        HttpUrl parse = HttpUrl.parse(str);
        Intent intent = new Intent();
        if (parse != null) {
            try {
                StringBuilder sb = new StringBuilder();
                sb.append(parse.scheme);
                sb.append("://");
                sb.append(parse.url().getHost());
                sb.append(parse.url().getPath());
                if (TextUtils.equals(sb.toString(), f32485b)) {
                    int i = -1;
                    if (!this.f32490a.equals(parse.queryParameter("state"))) {
                        intent.putExtra("ig_result_error_info", "State does not match");
                        setResult(-1, intent);
                        finish();
                        return true;
                    }
                    String queryParameter = parse.queryParameter("error");
                    if (!TextUtils.isEmpty(queryParameter)) {
                        String queryParameter2 = parse.queryParameter("error_description");
                        StringBuilder sb2 = new StringBuilder("error = [ ");
                        sb2.append(queryParameter);
                        sb2.append(" ], desc = [ ");
                        sb2.append(queryParameter2);
                        sb2.append(" ]");
                        String sb3 = sb2.toString();
                        if (!TextUtils.equals(queryParameter2, "The user denied your request.")) {
                            i = 0;
                        }
                        intent.putExtra("ig_result_error_info", sb3);
                        setResult(i, intent);
                        finish();
                        return true;
                    }
                    intent.putExtra("ig_result_code", parse.queryParameter("code"));
                    setResult(1, intent);
                    finish();
                    return true;
                }
            } catch (Exception e) {
                StringBuilder sb4 = new StringBuilder("exception: url = [");
                sb4.append(str);
                sb4.append("], message = [");
                sb4.append(e.getMessage());
                sb4.append("], stacktrace = [");
                sb4.append(Log.getStackTraceString(e));
                sb4.append("]");
                intent.putExtra("ig_result_error_info", sb4.toString());
                setResult(0, intent);
                finish();
                return true;
            }
        }
        return false;
    }
}
