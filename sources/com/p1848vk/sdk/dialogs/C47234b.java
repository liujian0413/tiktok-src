package com.p1848vk.sdk.dialogs;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.C1642a;
import com.example.p266a.C6490c;
import com.p1848vk.sdk.VKServiceActivity;
import com.p1848vk.sdk.api.C47121c;
import com.p1848vk.sdk.p1849a.C47109c;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.Locale;
import java.util.Map;

/* renamed from: com.vk.sdk.dialogs.b */
public final class C47234b implements OnDismissListener {

    /* renamed from: a */
    protected C47121c f121394a;

    /* renamed from: b */
    protected WebView f121395b;

    /* renamed from: c */
    protected View f121396c;

    /* renamed from: d */
    protected View f121397d;

    /* renamed from: e */
    protected Bundle f121398e;

    /* renamed from: f */
    protected Intent f121399f;

    /* renamed from: g */
    public int f121400g = -1;

    /* renamed from: h */
    protected int f121401h;

    /* renamed from: i */
    protected Dialog f121402i;

    /* renamed from: com.vk.sdk.dialogs.b$a */
    static class C47236a extends WebViewClient {

        /* renamed from: a */
        boolean f121405a = true;

        /* renamed from: b */
        final C47234b f121406b;

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return C6490c.m20174a(webView, renderProcessGoneDetail);
        }

        public C47236a(C47234b bVar) {
            this.f121406b = bVar;
        }

        /* renamed from: a */
        private boolean m147709a(String str) {
            if (!str.startsWith("https://oauth.vk.com/blank.html")) {
                return false;
            }
            Intent intent = new Intent("com.vk.auth-token");
            String substring = str.substring(str.indexOf(35) + 1);
            intent.putExtra("extra-token-data", substring);
            Map a = C47109c.m147306a(substring);
            if (this.f121406b.f121394a != null) {
                intent.putExtra("extra-validation-request", this.f121406b.f121394a.f120922c.mo118683a());
            }
            if (a == null || (!a.containsKey("error") && !a.containsKey("cancel"))) {
                this.f121406b.mo118712a(-1, intent);
            } else {
                this.f121406b.mo118712a(0, intent);
            }
            this.f121406b.mo118714b();
            return true;
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            if (m147709a(str)) {
                return true;
            }
            this.f121405a = true;
            return false;
        }

        public final void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            if (this.f121405a) {
                if (this.f121406b.f121396c != null) {
                    this.f121406b.f121396c.setVisibility(8);
                }
                webView.setVisibility(0);
            }
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            super.onPageStarted(webView, str, bitmap);
            m147709a(str);
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            this.f121405a = false;
            try {
                new Builder(webView.getContext()).setMessage(str).setPositiveButton(R.string.fq0, new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C47236a.this.f121406b.mo118711a();
                    }
                }).setNegativeButton(17039360, new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        C47236a.this.f121406b.mo118714b();
                    }
                }).show();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: b */
    public final void mo118714b() {
        if (this.f121402i != null) {
            C47240d.m147711a(this.f121402i);
        }
    }

    /* renamed from: a */
    public final void mo118711a() {
        String str;
        try {
            if (this.f121394a == null) {
                str = null;
            } else {
                str = this.f121394a.f120929j;
            }
            if (str == null) {
                int i = this.f121398e.getInt("client_id", 0);
                str = C1642a.m8035a(Locale.US, "https://oauth.vk.com/authorize?client_id=%s&scope=%s&redirect_uri=%s&display=mobile&v=%s&response_type=token&revoke=%d", new Object[]{Integer.valueOf(i), this.f121398e.getString("scope"), "https://oauth.vk.com/blank.html", this.f121398e.getString(C38347c.f99551f), Integer.valueOf(this.f121398e.getBoolean("revoke", false) ? 1 : 0)});
            }
            this.f121395b.setWebViewClient(C6490c.m20171a((WebViewClient) new C47236a(this)));
            this.f121395b.getSettings().setJavaScriptEnabled(true);
            C47240d.m147712a(this.f121395b, str);
            this.f121395b.setBackgroundColor(0);
            if (VERSION.SDK_INT >= 11) {
                this.f121395b.setLayerType(1, null);
            }
            this.f121395b.setVerticalScrollBarEnabled(false);
            this.f121395b.setVisibility(4);
            this.f121395b.setOverScrollMode(2);
            this.f121396c.setVisibility(0);
        } catch (Exception unused) {
            this.f121400g = 0;
            mo118714b();
        }
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Activity activity;
        if (this.f121397d == null) {
            activity = null;
        } else {
            activity = (Activity) this.f121397d.getContext();
        }
        if (activity instanceof VKServiceActivity) {
            ((VKServiceActivity) activity).mo118379a(this.f121401h, this.f121400g, this.f121399f);
        }
    }

    /* renamed from: a */
    public final void mo118712a(int i, Intent intent) {
        this.f121400g = i;
        this.f121399f = intent;
    }

    /* renamed from: a */
    public final void mo118713a(Activity activity, Bundle bundle, int i, C47121c cVar) {
        this.f121394a = cVar;
        this.f121398e = bundle;
        this.f121401h = i;
        this.f121397d = View.inflate(activity, R.layout.b58, null);
        this.f121396c = this.f121397d.findViewById(R.id.cky);
        this.f121395b = (WebView) this.f121397d.findViewById(R.id.a2x);
        final Dialog dialog = new Dialog(activity, R.style.o6);
        dialog.setContentView(this.f121397d);
        dialog.setOnCancelListener(new OnCancelListener() {
            public final void onCancel(DialogInterface dialogInterface) {
                C47239c.m147710a(dialog);
            }
        });
        dialog.setOnDismissListener(this);
        if (VERSION.SDK_INT >= 21) {
            dialog.getWindow().setStatusBarColor(0);
        }
        this.f121402i = dialog;
        this.f121402i.show();
        mo118711a();
    }
}
