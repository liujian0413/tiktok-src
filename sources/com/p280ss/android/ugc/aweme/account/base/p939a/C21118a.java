package com.p280ss.android.ugc.aweme.account.base.p939a;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Resources.NotFoundException;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.example.p266a.C6490c;
import com.p280ss.android.ugc.aweme.account.p933a.p934a.C21100a;
import com.p280ss.android.ugc.aweme.account.util.C22340q;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.ss.android.ugc.aweme.account.base.a.a */
public final class C21118a extends Dialog {

    /* renamed from: a */
    public C21120a f56695a;

    /* renamed from: com.ss.android.ugc.aweme.account.base.a.a$a */
    public static class C21120a {

        /* renamed from: a */
        public String f56696a;

        /* renamed from: b */
        public String f56697b;

        /* renamed from: a */
        public final C21120a mo56982a(String str) {
            this.f56696a = str;
            return this;
        }

        /* renamed from: a */
        public final C21118a mo56983a(Context context) {
            C21118a aVar = new C21118a(context);
            aVar.f56695a = this;
            return aVar;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo56980a(View view) {
        hide();
    }

    private C21118a(Context context) {
        super(context, R.style.w2);
    }

    /* renamed from: a */
    public static Dialog m71202a(Context context) {
        return new C21120a().mo56982a(C22340q.m73949a("terms-of-use")).mo56983a(context);
    }

    /* renamed from: b */
    public static Dialog m71203b(Context context) {
        return new C21120a().mo56982a(C22340q.m73949a("privacy-policy")).mo56983a(context);
    }

    /* access modifiers changed from: protected */
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getWindow() != null) {
            if (C21100a.m71156a(getContext())) {
                getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
            }
            getWindow().requestFeature(1);
        }
        try {
            setContentView(R.layout.ah9);
        } catch (NotFoundException unused) {
        }
        if (getWindow() != null) {
            getWindow().setBackgroundDrawable(new ColorDrawable(0));
            getWindow().setLayout(-1, -1);
        }
        setCancelable(true);
        TextView textView = (TextView) findViewById(R.id.title);
        if (!TextUtils.isEmpty(this.f56695a.f56697b)) {
            textView.setText(this.f56695a.f56697b);
        } else {
            textView.setText(R.string.pk);
        }
        findViewById(R.id.jo).setOnClickListener(new C21121b(this));
        WebView webView = (WebView) findViewById(R.id.egh);
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebViewClient(C6490c.m20171a(new WebViewClient()));
        C21122c.m71207a(webView, this.f56695a.f56696a);
    }
}
