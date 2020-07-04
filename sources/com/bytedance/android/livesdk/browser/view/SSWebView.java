package com.bytedance.android.livesdk.browser.view;

import android.content.Context;
import android.net.Uri;
import android.util.AttributeSet;
import android.webkit.CookieManager;
import android.webkit.DownloadListener;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.bytedance.android.live.utility.C3596c;
import com.bytedance.android.livesdk.utils.C9065g;
import com.bytedance.android.livesdkapi.host.C9466h;
import com.bytedance.android.livesdkapi.host.IHostContext;
import com.bytedance.common.utility.C6319n;
import com.bytedance.frameworks.baselib.network.http.util.C10189i;
import java.net.URI;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class SSWebView extends WebView {
    public boolean canGoBack() {
        try {
            return super.canGoBack();
        } catch (Exception unused) {
            return false;
        }
    }

    public boolean canGoForward() {
        try {
            return super.canGoForward();
        } catch (Exception unused) {
            return false;
        }
    }

    public void clearFormData() {
        try {
            super.clearFormData();
        } catch (Exception unused) {
        }
    }

    public void clearHistory() {
        try {
            super.clearHistory();
        } catch (Exception unused) {
        }
    }

    public void computeScroll() {
        try {
            super.computeScroll();
        } catch (Exception unused) {
        }
    }

    public int getContentHeight() {
        try {
            return super.getContentHeight();
        } catch (Exception unused) {
            return 1;
        }
    }

    public String getOriginalUrl() {
        try {
            return super.getOriginalUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public int getProgress() {
        try {
            return super.getProgress();
        } catch (Exception unused) {
            return 100;
        }
    }

    public String getUrl() {
        try {
            return super.getUrl();
        } catch (Exception unused) {
            return null;
        }
    }

    public void goBack() {
        try {
            super.goBack();
        } catch (Exception unused) {
        }
    }

    public void goForward() {
        try {
            super.goForward();
        } catch (Exception unused) {
        }
    }

    public void reload() {
        try {
            super.reload();
        } catch (Exception unused) {
        }
    }

    public void stopLoading() {
        try {
            super.stopLoading();
        } catch (Exception unused) {
        }
    }

    public SSWebView(Context context) {
        super(context);
    }

    public boolean canGoBackOrForward(int i) {
        try {
            return super.canGoBackOrForward(i);
        } catch (Exception unused) {
            return false;
        }
    }

    public void clearCache(boolean z) {
        try {
            super.clearCache(z);
        } catch (Exception unused) {
        }
    }

    public void goBackOrForward(int i) {
        try {
            super.goBackOrForward(i);
        } catch (Exception unused) {
        }
    }

    public void setBackgroundColor(int i) {
        try {
            super.setBackgroundColor(i);
        } catch (Exception unused) {
        }
    }

    public void setDownloadListener(DownloadListener downloadListener) {
        try {
            super.setDownloadListener(downloadListener);
        } catch (Exception unused) {
        }
    }

    public void setNetworkAvailable(boolean z) {
        try {
            super.setNetworkAvailable(z);
        } catch (Exception unused) {
        }
    }

    public void setOverScrollMode(int i) {
        try {
            super.setOverScrollMode(i);
        } catch (Exception unused) {
        }
    }

    public void setWebChromeClient(WebChromeClient webChromeClient) {
        try {
            super.setWebChromeClient(webChromeClient);
        } catch (Exception unused) {
        }
    }

    public void setWebViewClient(WebViewClient webViewClient) {
        try {
            super.setWebViewClient(webViewClient);
        } catch (Exception unused) {
        }
    }

    public void loadUrl(String str) {
        try {
            String filterUrl = filterUrl(str);
            C4226d.m14360a(this, filterUrl, requestHeader(filterUrl, null));
        } catch (Exception unused) {
        }
    }

    private String tryReplaceUrlToBoe(String str) {
        if (str == null) {
            return str;
        }
        try {
            URI create = URI.create(str);
            String host = create.getHost();
            StringBuilder sb = new StringBuilder();
            sb.append(host);
            sb.append(".boe-gateway.byted.org");
            String sb2 = sb.toString();
            if (!C6319n.m19593a(sb2)) {
                return C10189i.m30261a(create.getScheme(), sb2, create.getPort(), create.getRawPath(), create.getRawQuery(), create.getRawFragment()).toString();
            }
        } catch (Throwable unused) {
        }
        return str;
    }

    private String filterUrl(String str) {
        Context context = getContext();
        if (context != null && C9065g.m27070a(str)) {
            str = C9065g.m27069a(context, str);
        }
        try {
            if (((IHostContext) C3596c.m13172a(IHostContext.class)).isLocalTest() && getContext().getAssets() != null && getContext().getAssets().list("") != null && Arrays.asList(getContext().getAssets().list("")).contains("ttnet_config.json")) {
                str = tryReplaceUrlToBoe(str);
            }
        } catch (Exception unused) {
        }
        syncCookie(str);
        return str;
    }

    private void syncCookie(String str) {
        CookieManager instance = CookieManager.getInstance();
        instance.setAcceptCookie(true);
        List a = ((C9466h) C3596c.m13172a(C9466h.class)).mo23272a(str);
        Uri parse = Uri.parse(str);
        String str2 = "";
        if (parse != null) {
            str2 = parse.getHost();
        }
        if (a != null && str2 != null) {
            for (int i = 0; i < a.size(); i++) {
                String[] split = ((String) a.get(i)).split(";");
                for (String replace : split) {
                    instance.setCookie(str2, replace.replace(" ", ""));
                }
            }
        }
    }

    public SSWebView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void evaluateJavascript(String str, ValueCallback<String> valueCallback) {
        try {
            super.evaluateJavascript(str, valueCallback);
        } catch (Exception unused) {
        }
    }

    public void postUrl(String str, byte[] bArr) {
        try {
            super.postUrl(filterUrl(str), bArr);
        } catch (Exception unused) {
        }
    }

    public void loadUrl(String str, Map<String, String> map) {
        try {
            String filterUrl = filterUrl(str);
            C4226d.m14360a(this, filterUrl, requestHeader(filterUrl, map));
        } catch (Exception unused) {
        }
    }

    private static Map<String, String> requestHeader(String str, Map<String, String> map) {
        Map<String, String> b = ((C9466h) C3596c.m13172a(C9466h.class)).mo23274b(str);
        if (b.isEmpty()) {
            return map;
        }
        if (map == null || map.isEmpty()) {
            return b;
        }
        HashMap hashMap = new HashMap(map);
        for (Entry entry : b.entrySet()) {
            hashMap.put(entry.getKey(), entry.getValue());
        }
        return hashMap;
    }

    public void loadData(String str, String str2, String str3) {
        try {
            super.loadData(str, str2, str3);
        } catch (Exception unused) {
        }
    }

    public SSWebView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public void loadDataWithBaseURL(String str, String str2, String str3, String str4, String str5) {
        try {
            super.loadDataWithBaseURL(str, str2, str3, str4, str5);
        } catch (Exception unused) {
        }
    }
}
