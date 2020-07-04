package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.os.Message;
import android.view.View;
import android.view.WindowManager.BadTokenException;
import android.webkit.ConsoleMessage;
import android.webkit.GeolocationPermissions.Callback;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.PermissionRequest;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.CustomViewCallback;
import android.webkit.WebStorage.QuotaUpdater;
import android.webkit.WebView;
import android.webkit.WebView.WebViewTransport;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.example.p266a.C6490c;
import com.google.android.gms.ads.internal.C14817bv;
import com.google.android.gms.ads.internal.overlay.C14836c;
import com.google.android.gms.common.util.C15333p;

@C6505uv
public final class ama extends WebChromeClient {

    /* renamed from: a */
    private final ami f40632a;

    public ama(ami ami) {
        this.f40632a = ami;
    }

    /* renamed from: a */
    private final boolean m46340a(Context context, String str, String str2, String str3, String str4, JsResult jsResult, JsPromptResult jsPromptResult, boolean z) {
        try {
            if (!(this.f40632a == null || this.f40632a.mo39761w() == null || this.f40632a.mo39761w().mo39766a() == null)) {
                C14817bv a = this.f40632a.mo39761w().mo39766a();
                if (a != null && !a.mo37761b()) {
                    StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 11 + String.valueOf(str3).length());
                    sb.append("window.");
                    sb.append(str);
                    sb.append("('");
                    sb.append(str3);
                    sb.append("')");
                    a.mo37760a(sb.toString());
                    return false;
                }
            }
            Builder builder = new Builder(context);
            builder.setTitle(str2);
            if (z) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                TextView textView = new TextView(context);
                textView.setText(str3);
                EditText editText = new EditText(context);
                editText.setText(str4);
                linearLayout.addView(textView);
                linearLayout.addView(editText);
                builder.setView(linearLayout).setPositiveButton(17039370, new amg(jsPromptResult, editText)).setNegativeButton(17039360, new amf(jsPromptResult)).setOnCancelListener(new ame(jsPromptResult)).create().show();
            } else {
                builder.setMessage(str3).setPositiveButton(17039370, new amd(jsResult)).setNegativeButton(17039360, new amc(jsResult)).setOnCancelListener(new amb(jsResult)).create().show();
            }
        } catch (BadTokenException e) {
            acd.m45780c("Fail to display Dialog.", e);
        }
        return true;
    }

    public final boolean onCreateWindow(WebView webView, boolean z, boolean z2, Message message) {
        WebViewTransport webViewTransport = (WebViewTransport) message.obj;
        WebView webView2 = new WebView(webView.getContext());
        if (this.f40632a.mo39762x() != null) {
            webView2.setWebViewClient(C6490c.m20171a(this.f40632a.mo39762x()));
        }
        webViewTransport.setWebView(webView2);
        message.sendToTarget();
        return true;
    }

    public final void onCloseWindow(WebView webView) {
        if (!(webView instanceof ami)) {
            acd.m45783e("Tried to close a WebView that wasn't an AdWebView.");
            return;
        }
        C14836c s = ((ami) webView).mo39751s();
        if (s == null) {
            acd.m45783e("Tried to close an AdWebView not associated with an overlay.");
        } else {
            s.mo37808a();
        }
    }

    public final boolean onConsoleMessage(ConsoleMessage consoleMessage) {
        String message = consoleMessage.message();
        String sourceId = consoleMessage.sourceId();
        int lineNumber = consoleMessage.lineNumber();
        StringBuilder sb = new StringBuilder(String.valueOf(message).length() + 19 + String.valueOf(sourceId).length());
        sb.append("JS: ");
        sb.append(message);
        sb.append(" (");
        sb.append(sourceId);
        sb.append(":");
        sb.append(lineNumber);
        sb.append(")");
        String sb2 = sb.toString();
        if (sb2.contains("Application Cache")) {
            return super.onConsoleMessage(consoleMessage);
        }
        switch (amh.f40640a[consoleMessage.messageLevel().ordinal()]) {
            case 1:
                acd.m45779c(sb2);
                break;
            case 2:
                acd.m45783e(sb2);
                break;
            case 3:
            case 4:
                acd.m45781d(sb2);
                break;
            case 5:
                acd.m45777b(sb2);
                break;
            default:
                acd.m45781d(sb2);
                break;
        }
        return super.onConsoleMessage(consoleMessage);
    }

    public final void onExceededDatabaseQuota(String str, String str2, long j, long j2, long j3, QuotaUpdater quotaUpdater) {
        long j4 = 5242880 - j3;
        if (j4 <= 0) {
            quotaUpdater.updateQuota(j);
            return;
        }
        if (j != 0) {
            if (j2 == 0) {
                j = Math.min(j + Math.min(131072, j4), 1048576);
            } else if (j2 <= Math.min(1048576 - j, j4)) {
                j += j2;
            }
            j2 = j;
        } else if (j2 > j4 || j2 > 1048576) {
            j2 = 0;
        }
        quotaUpdater.updateQuota(j2);
    }

    public final void onHideCustomView() {
        C14836c s = this.f40632a.mo39751s();
        if (s == null) {
            acd.m45783e("Could not get ad overlay when hiding custom view.");
        } else {
            s.mo37815b();
        }
    }

    /* renamed from: a */
    private static Context m46339a(WebView webView) {
        if (!(webView instanceof ami)) {
            return webView.getContext();
        }
        ami ami = (ami) webView;
        Activity d = ami.mo39466d();
        if (d != null) {
            return d;
        }
        return ami.getContext();
    }

    public final boolean onJsAlert(WebView webView, String str, String str2, JsResult jsResult) {
        return m46340a(m46339a(webView), "alert", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsBeforeUnload(WebView webView, String str, String str2, JsResult jsResult) {
        return m46340a(m46339a(webView), "onBeforeUnload", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsConfirm(WebView webView, String str, String str2, JsResult jsResult) {
        return m46340a(m46339a(webView), "confirm", str, str2, null, jsResult, null, false);
    }

    public final boolean onJsPrompt(WebView webView, String str, String str2, String str3, JsPromptResult jsPromptResult) {
        return m46340a(m46339a(webView), "prompt", str, str2, str3, null, jsPromptResult, true);
    }

    public final void onReachedMaxAppCacheSize(long j, long j2, QuotaUpdater quotaUpdater) {
        long j3 = j + 131072;
        if (5242880 - j2 < j3) {
            quotaUpdater.updateQuota(0);
        } else {
            quotaUpdater.updateQuota(j3);
        }
    }

    public final void onShowCustomView(View view, CustomViewCallback customViewCallback) {
        onShowCustomView(view, -1, customViewCallback);
    }

    public final void onShowCustomView(View view, int i, CustomViewCallback customViewCallback) {
        C14836c s = this.f40632a.mo39751s();
        if (s == null) {
            acd.m45783e("Could not get ad overlay when showing custom view.");
            customViewCallback.onCustomViewHidden();
            return;
        }
        s.mo37812a(view, customViewCallback);
        s.mo37809a(i);
    }

    public final void onGeolocationPermissionsShowPrompt(String str, Callback callback) {
        if (callback != null) {
            callback.invoke(str, acl.m45535a(this.f40632a.getContext(), "android.permission.ACCESS_FINE_LOCATION") || acl.m45535a(this.f40632a.getContext(), "android.permission.ACCESS_COARSE_LOCATION"), true);
        }
    }

    public final void onPermissionRequest(PermissionRequest permissionRequest) {
        if (C15333p.m44600g()) {
            if (!((Boolean) bym.m50299d().mo41272a(C15585bw.f43802aw)).booleanValue()) {
                if (this.f40632a == null || this.f40632a.mo39761w() == null || this.f40632a.mo39761w().mo39792l() == null) {
                    super.onPermissionRequest(permissionRequest);
                    return;
                }
                String[] a = this.f40632a.mo39761w().mo39792l().mo39031a(permissionRequest.getResources());
                if (a.length > 0) {
                    permissionRequest.grant(a);
                    return;
                } else {
                    permissionRequest.deny();
                    return;
                }
            }
        }
        super.onPermissionRequest(permissionRequest);
    }
}
