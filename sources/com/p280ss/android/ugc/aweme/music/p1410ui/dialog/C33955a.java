package com.p280ss.android.ugc.aweme.music.p1410ui.dialog;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.bytedance.ies.uikit.p576a.C10994a;
import com.example.p266a.C6490c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.music.ui.dialog.a */
public final class C33955a extends Dialog {

    /* renamed from: a */
    public C33957a f88588a;

    /* renamed from: b */
    private View f88589b;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.dialog.a$a */
    public static class C33957a {

        /* renamed from: a */
        public String f88591a;

        /* renamed from: b */
        public String f88592b;

        /* renamed from: a */
        public final C33957a mo86622a(String str) {
            this.f88591a = str;
            return this;
        }

        /* renamed from: a */
        public final C33955a mo86623a(Context context) {
            C33955a aVar = new C33955a(context);
            aVar.f88588a = this;
            return aVar;
        }
    }

    /* renamed from: a */
    private void m109421a() {
        if (VERSION.SDK_INT >= 19) {
            this.f88589b.getLayoutParams().height = C10994a.m32204a(getContext());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo86618a(View view) {
        hide();
    }

    public C33955a(Context context) {
        super(context, R.style.w2);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        getWindow().addFlags(67108864);
        getWindow().requestFeature(1);
        try {
            setContentView(R.layout.ah9);
        } catch (NotFoundException unused) {
        }
        getWindow().setBackgroundDrawable(new ColorDrawable(0));
        getWindow().setLayout(-1, -1);
        setCancelable(true);
        TextView textView = (TextView) findViewById(R.id.title);
        if (!TextUtils.isEmpty(this.f88588a.f88592b)) {
            textView.setText(this.f88588a.f88592b);
        } else {
            textView.setText(R.string.pk);
        }
        View findViewById = findViewById(R.id.jo);
        this.f88589b = findViewById(R.id.dal);
        findViewById.setOnClickListener(new C33958b(this));
        WebView webView = (WebView) findViewById(R.id.egh);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(C6490c.m20171a((WebViewClient) new WebViewClient() {
            public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                return C6490c.m20174a(webView, renderProcessGoneDetail);
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
        C33959c.m109425a(webView, this.f88588a.f88591a);
        m109421a();
    }
}
