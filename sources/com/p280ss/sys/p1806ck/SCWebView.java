package com.p280ss.sys.p1806ck;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.ViewGroup.LayoutParams;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.JsPromptResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import android.webkit.WebSettings.LayoutAlgorithm;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.C1642a;
import com.example.p266a.C6490c;
import com.p280ss.sys.p1806ck.p1807a.C45978e.C45979a;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.ss.sys.ck.SCWebView */
public class SCWebView extends WebView {

    /* renamed from: a */
    private Context f117474a;

    /* renamed from: b */
    private int f117475b;

    /* renamed from: c */
    private int f117476c;

    /* renamed from: d */
    private float[] f117477d = {4.0f, 4.0f, 4.0f, 4.0f, 4.0f, 4.0f, 4.0f, 4.0f};

    /* renamed from: e */
    private List<JSONObject> f117478e = new ArrayList();

    /* renamed from: f */
    private List<JSONObject> f117479f = new ArrayList();

    /* renamed from: com.ss.sys.ck.SCWebView$a */
    public class C45967a extends WebChromeClient {

        /* renamed from: b */
        private SCWebView f117481b;

        C45967a(SCWebView sCWebView) {
            this.f117481b = sCWebView;
        }

        public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
            if (!str2.equals(C45987b.f117522a)) {
                return super.onJsPrompt(webView, str, str2, str3, jsPromptResult);
            }
            jsPromptResult.confirm();
            new C45979a(str3).start();
            return true;
        }
    }

    /* renamed from: com.ss.sys.ck.SCWebView$b */
    public class C45968b extends WebViewClient {

        /* renamed from: b */
        private SCWebView f117483b;

        C45968b(SCWebView sCWebView) {
            this.f117483b = sCWebView;
        }

        public final void doUpdateVisitedHistory(WebView webView, String str, boolean z) {
            super.doUpdateVisitedHistory(webView, str, z);
        }

        public final void onLoadResource(WebView webView, String str) {
            this.f117483b.mo111302b("onLoadResource", str != null ? str : "");
            super.onLoadResource(webView, str);
        }

        public final void onPageFinished(WebView webView, String str) {
            this.f117483b.mo111302b("onPageStarted", str != null ? str : "");
            super.onPageFinished(webView, str);
        }

        public final void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            this.f117483b.mo111302b("onPageStarted", str != null ? str : "");
            super.onPageStarted(webView, str, bitmap);
            SCCheckListener listener = SCCheckUtils.getInstance().getListener();
            if (listener != null) {
                listener.dialogOnReady();
            }
        }

        public final void onReceivedError(WebView webView, int i, String str, String str2) {
            super.onReceivedError(webView, i, str, str2);
            SCWebView sCWebView = this.f117483b;
            String str3 = "onReceivedError";
            String str4 = "URL:%s DES:%s ERR:%d";
            Object[] objArr = new Object[3];
            if (str2 == null) {
                str2 = "";
            }
            objArr[0] = str2;
            if (str == null) {
                str = "";
            }
            objArr[1] = str;
            objArr[2] = Integer.valueOf(i);
            sCWebView.mo111302b(str3, C1642a.m8034a(str4, objArr));
            SCCheckListener listener = SCCheckUtils.getInstance().getListener();
            if (listener != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(i);
                listener.dialogOnError(sb.toString());
            }
            SCCheckUtils.getInstance().netWorkError();
        }

        public final void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            try {
                super.onReceivedError(webView, webResourceRequest, webResourceError);
            } catch (Throwable unused) {
            }
        }

        public final boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return C6490c.m20174a(webView, renderProcessGoneDetail);
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
            try {
                if (VERSION.SDK_INT >= 21 && !webResourceRequest.isForMainFrame() && webResourceRequest.getUrl().getPath().endsWith("/favicon.ico")) {
                    return new WebResourceResponse("image/png", null, null);
                }
            } catch (Exception unused) {
            }
            return super.shouldInterceptRequest(webView, webResourceRequest);
        }

        public final WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
            if (str.toLowerCase().contains("/favicon.ico")) {
                try {
                    return new WebResourceResponse("image/png", null, null);
                } catch (Exception unused) {
                }
            }
            return super.shouldInterceptRequest(webView, str);
        }

        public final boolean shouldOverrideUrlLoading(WebView webView, String str) {
            try {
                str = URLDecoder.decode(str, "UTF-8");
            } catch (UnsupportedEncodingException | IllegalArgumentException unused) {
            }
            if (!str.startsWith("jsbridge://")) {
                return super.shouldOverrideUrlLoading(webView, str);
            }
            SCWebView.m144136a(webView, str);
            return true;
        }
    }

    public SCWebView(Context context) {
        super(context);
        this.f117474a = context;
        mo111300a();
        m144137b();
    }

    public SCWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f117474a = context;
        mo111300a();
        m144137b();
    }

    public SCWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f117474a = context;
        mo111300a();
        m144137b();
    }

    /* renamed from: a */
    private void m144135a(int i, MotionEvent motionEvent) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("ac", i);
            jSONObject.put("dn", motionEvent.getDevice().getName());
            jSONObject.put("db", motionEvent.getDeviceId());
            jSONObject.put("lc", C1642a.m8034a("%s_%s", new Object[]{Float.valueOf(motionEvent.getX()), Float.valueOf(motionEvent.getY())}));
            this.f117478e.add(jSONObject);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    static boolean m144136a(WebView webView, String str) {
        return C45991c.m144189a(webView, str);
    }

    /* renamed from: b */
    private void m144137b() {
        setLayoutParams(new LayoutParams(-2, -2));
    }

    /* renamed from: a */
    public final void mo111300a() {
        WebSettings settings = getSettings();
        settings.setJavaScriptEnabled(true);
        settings.setLoadWithOverviewMode(true);
        settings.setDomStorageEnabled(true);
        settings.setAppCacheEnabled(false);
        settings.setUseWideViewPort(true);
        if (VERSION.SDK_INT >= 21) {
            settings.setMixedContentMode(0);
        }
        settings.setCacheMode(2);
        settings.setLayoutAlgorithm(LayoutAlgorithm.SINGLE_COLUMN);
        setOverScrollMode(2);
        setScrollContainer(false);
        setHorizontalScrollBarEnabled(false);
        setVerticalScrollBarEnabled(false);
        onResume();
        setWebChromeClient(new C45967a(this));
        setWebViewClient(C6490c.m20171a((WebViewClient) new C45968b(this)));
        clearCache(true);
        clearHistory();
    }

    /* renamed from: a */
    public final void mo111301a(String str, String str2) {
        CookieSyncManager.createInstance(this.f117474a);
        CookieManager instance = CookieManager.getInstance();
        StringBuilder sb = new StringBuilder("sec_sessionid=");
        sb.append(str2);
        instance.setCookie(str, sb.toString());
        CookieSyncManager.getInstance().sync();
    }

    /* renamed from: b */
    public final void mo111302b(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("action", str);
            jSONObject.put("time", Calendar.getInstance().getTimeInMillis());
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("url", str2);
            jSONObject.put("detailinfos", jSONObject2);
            this.f117479f.add(jSONObject);
        } catch (Throwable unused) {
        }
    }

    public JSONArray getActionList() {
        if (this.f117479f.size() > 50) {
            this.f117479f = this.f117479f.subList(0, 50);
        }
        return new JSONArray(this.f117479f);
    }

    public JSONArray getMotionList() {
        if (this.f117478e.size() > 50) {
            this.f117478e = this.f117478e.subList(0, 50);
        }
        return new JSONArray(this.f117478e);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (getMeasuredWidth() != 0) {
            this.f117475b = getMeasuredWidth();
        }
        if (getMeasuredHeight() != 0) {
            this.f117476c = getMeasuredHeight();
        }
    }

    public void onPause() {
        super.onPause();
    }

    public void onResume() {
        super.onResume();
    }

    public boolean onTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        switch (action) {
            case 0:
            case 1:
            case 2:
                m144135a(action, motionEvent);
                break;
        }
        return super.onTouchEvent(motionEvent);
    }
}
