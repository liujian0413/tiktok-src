package com.bytedance.polaris.widget.webview;

import android.app.Application;
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.TextView;
import com.bytedance.common.utility.C9738o;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.bytedance.polaris.browser.p635a.C12389a;
import com.bytedance.polaris.depend.C12422c;
import com.bytedance.polaris.depend.C12428i;
import com.bytedance.polaris.p634b.C12361l;
import com.bytedance.polaris.p634b.C12370u;
import com.example.p266a.C6490c;
import com.zhiliaoapp.musically.df_live_zego_link.R;

/* renamed from: com.bytedance.polaris.widget.webview.a */
public final class C12440a extends WebViewClient {

    /* renamed from: a */
    TextView f33039a;

    /* renamed from: b */
    int f33040b;

    /* renamed from: c */
    private final C12389a f33041c;

    /* renamed from: d */
    private View f33042d;

    /* renamed from: e */
    private boolean f33043e;

    public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return C6490c.m20174a(webView, renderProcessGoneDetail);
    }

    /* renamed from: a */
    private void m36191a() {
        if (this.f33042d != null && this.f33042d.getParent() != null && this.f33039a != null) {
            try {
                Application c = C12428i.m36153c();
                this.f33042d.setBackgroundColor(c.getResources().getColor(R.color.a2b));
                this.f33039a.setTextColor(c.getResources().getColor(R.color.a2f));
                this.f33039a.setCompoundDrawablesWithIntrinsicBounds(0, R.drawable.bdd, 0, 0);
                C9738o.m28702a((View) this.f33039a, -3, -3, -3, (int) (((float) this.f33042d.getLayoutParams().height) * 0.57f));
            } catch (Throwable unused) {
            }
        }
    }

    public C12440a(C12389a aVar) {
        this.f33041c = aVar;
    }

    /* renamed from: a */
    private static void m36192a(View view) {
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view);
            }
        }
    }

    public final void onPageFinished(WebView webView, String str) {
        this.f33043e = false;
        if (this.f33042d != null && this.f33040b == 0) {
            m36192a(this.f33042d);
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
        C12422c e = C12428i.m36155e();
        if (e == null) {
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }
        WebResourceResponse a = e.mo30306a(webView, webResourceRequest);
        if (a != null) {
            return a;
        }
        return super.shouldInterceptRequest(webView, webResourceRequest);
    }

    public final void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (C12361l.m35898a() && !C12370u.m35938d(str)) {
            new StringBuilder("onLoadResource ").append(str);
        }
        C12389a aVar = this.f33041c;
        if (aVar != null) {
            try {
                aVar.mo30257c(str);
            } catch (Exception unused) {
            }
        }
    }

    public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
        C12422c e = C12428i.m36155e();
        if (e == null) {
            return super.shouldInterceptRequest(webView, str);
        }
        WebResourceResponse a = e.mo30307a(webView, str);
        if (a != null) {
            return a;
        }
        return super.shouldInterceptRequest(webView, str);
    }

    public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
        try {
            Uri parse = Uri.parse(str);
            String lowerCase = parse.getScheme().toLowerCase();
            if (TextUtils.isEmpty(lowerCase) || "about".equals(lowerCase)) {
                return false;
            }
            if ("bytedance".equals(lowerCase)) {
                if (this.f33041c != null && this.f33041c.mo30252a(parse)) {
                    try {
                        this.f33041c.mo30254b(parse);
                    } catch (Exception e) {
                        new StringBuilder("TTAndroidObj handleUri exception: ").append(e);
                    }
                }
                return true;
            }
            if (!WebKitApi.SCHEME_HTTP.equals(lowerCase) && !WebKitApi.SCHEME_HTTPS.equals(lowerCase)) {
                C12422c e2 = C12428i.m36155e();
                if (e2 == null || !e2.mo30310a(webView.getContext(), str)) {
                    return false;
                }
                return true;
            }
            return super.shouldOverrideUrlLoading(webView, str);
        } catch (Exception e3) {
            StringBuilder sb = new StringBuilder("view url ");
            sb.append(str);
            sb.append(" exception: ");
            sb.append(e3);
        }
    }

    public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
        if (!this.f33043e) {
            this.f33040b = 0;
            this.f33043e = true;
        }
    }

    public final void onReceivedError(WebView webView, int i, String str, String str2) {
        m36193a(webView, i, str, str2);
    }

    /* renamed from: a */
    private void m36193a(WebView webView, int i, String str, String str2) {
        if (webView != null && webView.getContext() != null && (i != this.f33040b || this.f33042d == null || this.f33042d.getParent() == null)) {
            Context context = webView.getContext();
            if (this.f33042d == null) {
                this.f33042d = LayoutInflater.from(context).inflate(R.layout.agj, null, false);
                this.f33039a = (TextView) this.f33042d.findViewById(R.id.djn);
                this.f33042d.setOnClickListener(new OnClickListener() {
                    public final void onClick(View view) {
                        if (view.getParent() instanceof WebView) {
                            C12440a.this.f33040b = 0;
                            C9738o.m28712b((View) C12440a.this.f33039a, 8);
                            ((WebView) view.getParent()).reload();
                        }
                    }
                });
            } else {
                m36192a(this.f33042d);
            }
            this.f33040b = i;
            webView.addView(this.f33042d, webView.getWidth(), webView.getHeight());
            m36191a();
            C9738o.m28712b((View) this.f33039a, 0);
        }
    }
}
