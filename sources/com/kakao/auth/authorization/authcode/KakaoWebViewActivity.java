package com.kakao.auth.authorization.authcode;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.ActivityNotFoundException;
import android.content.ClipData;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Bitmap;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.support.p022v4.content.C0683b;
import android.text.TextUtils;
import android.webkit.ConsoleMessage;
import android.webkit.JsResult;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.ValueCallback;
import android.webkit.WebChromeClient;
import android.webkit.WebChromeClient.FileChooserParams;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;
import com.C1642a;
import com.example.p266a.C6490c;
import com.kakao.auth.KakaoSDK;
import com.kakao.auth.exception.KakaoWebviewException;
import com.kakao.auth.receiver.SmsReceiver;
import com.kakao.auth.receiver.SmsReceiver.ISmsReceiver;
import com.kakao.network.ServerProtocol;
import com.kakao.util.exception.KakaoException;
import com.kakao.util.exception.KakaoException.ErrorType;
import com.kakao.util.helper.SystemInfo;
import com.kakao.util.helper.log.Logger;
import com.p280ss.android.ugc.aweme.lancet.C32278e;
import com.p280ss.android.ugc.aweme.utils.C43112ex;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class KakaoWebViewActivity extends Activity {
    private static SmsReceiver smsReceiver;
    public final Map<String, String> headers = new HashMap();
    public ValueCallback<Uri> imageCallback;
    public ValueCallback<Uri[]> lollipopImageCallback;
    private ProgressBar progressBar;
    private ResultReceiver resultReceiver;
    public boolean shouldProceedWithSslError;
    private String url;
    private boolean useSmsReceiver;
    private boolean useWebViewTimers;
    public WebView webView;

    class KakaoWebChromeClient extends WebChromeClient {
        private KakaoWebChromeClient() {
        }

        public boolean onConsoleMessage(ConsoleMessage consoleMessage) {
            StringBuilder sb = new StringBuilder("KakaoAccountWebView: ");
            sb.append(consoleMessage.message());
            sb.append(" -- (");
            sb.append(consoleMessage.lineNumber());
            sb.append("/");
            sb.append(consoleMessage.sourceId());
            sb.append(")");
            Logger.m60925d(sb.toString());
            return true;
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str) {
            KakaoWebViewActivity.this.imageCallback = valueCallback;
            KakaoWebViewActivity.this.openImageChooserActivity();
        }

        public boolean onShowFileChooser(WebView webView, ValueCallback<Uri[]> valueCallback, FileChooserParams fileChooserParams) {
            KakaoWebViewActivity.this.lollipopImageCallback = valueCallback;
            KakaoWebViewActivity.this.openImageChooserActivity();
            return true;
        }

        public void openFileChooser(ValueCallback<Uri> valueCallback, String str, String str2) {
            KakaoWebViewActivity.this.imageCallback = valueCallback;
            KakaoWebViewActivity.this.openImageChooserActivity();
        }

        public boolean onJsAlert(WebView webView, String str, String str2, final JsResult jsResult) {
            new Builder(KakaoWebViewActivity.this).setMessage(str2).setPositiveButton(17039370, new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    jsResult.confirm();
                }
            }).setCancelable(false).create().show();
            return true;
        }

        /* JADX WARNING: Removed duplicated region for block: B:33:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:36:0x009a  */
        /* JADX WARNING: Removed duplicated region for block: B:39:0x00a6  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x00d4  */
        /* JADX WARNING: Removed duplicated region for block: B:49:0x00db  */
        /* JADX WARNING: Removed duplicated region for block: B:52:0x00e7  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onJsConfirm(android.webkit.WebView r8, java.lang.String r9, java.lang.String r10, final android.webkit.JsResult r11) {
            /*
                r7 = this;
                r8 = 0
                r9 = 17039360(0x1040000, float:2.424457E-38)
                r0 = 17039370(0x104000a, float:2.42446E-38)
                r1 = 0
                org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0074, all -> 0x0070 }
                r2.<init>(r10)     // Catch:{ JSONException -> 0x0074, all -> 0x0070 }
                java.lang.String r3 = "message"
                java.lang.String r3 = r2.optString(r3)     // Catch:{ JSONException -> 0x0074, all -> 0x0070 }
                java.lang.String r4 = "positive"
                java.lang.String r4 = r2.optString(r4)     // Catch:{ JSONException -> 0x006d, all -> 0x006a }
                java.lang.String r5 = "negative"
                java.lang.String r2 = r2.optString(r5)     // Catch:{ JSONException -> 0x0068 }
                boolean r1 = android.text.TextUtils.isEmpty(r3)
                if (r1 == 0) goto L_0x0025
                goto L_0x0026
            L_0x0025:
                r10 = r3
            L_0x0026:
                boolean r1 = android.text.TextUtils.isEmpty(r4)
                if (r1 == 0) goto L_0x0032
                com.kakao.auth.authorization.authcode.KakaoWebViewActivity r1 = com.kakao.auth.authorization.authcode.KakaoWebViewActivity.this
                java.lang.String r4 = r1.getString(r0)
            L_0x0032:
                boolean r0 = android.text.TextUtils.isEmpty(r2)
                if (r0 == 0) goto L_0x003e
                com.kakao.auth.authorization.authcode.KakaoWebViewActivity r0 = com.kakao.auth.authorization.authcode.KakaoWebViewActivity.this
                java.lang.String r2 = r0.getString(r9)
            L_0x003e:
                android.app.AlertDialog$Builder r9 = new android.app.AlertDialog$Builder
                com.kakao.auth.authorization.authcode.KakaoWebViewActivity r0 = com.kakao.auth.authorization.authcode.KakaoWebViewActivity.this
                r9.<init>(r0)
                android.app.AlertDialog$Builder r9 = r9.setMessage(r10)
                com.kakao.auth.authorization.authcode.KakaoWebViewActivity$KakaoWebChromeClient$3 r10 = new com.kakao.auth.authorization.authcode.KakaoWebViewActivity$KakaoWebChromeClient$3
                r10.<init>(r11)
                android.app.AlertDialog$Builder r9 = r9.setPositiveButton(r4, r10)
                com.kakao.auth.authorization.authcode.KakaoWebViewActivity$KakaoWebChromeClient$2 r10 = new com.kakao.auth.authorization.authcode.KakaoWebViewActivity$KakaoWebChromeClient$2
                r10.<init>(r11)
                android.app.AlertDialog$Builder r9 = r9.setNegativeButton(r2, r10)
            L_0x005b:
                android.app.AlertDialog$Builder r8 = r9.setCancelable(r8)
                android.app.AlertDialog r8 = r8.create()
                r8.show()
                goto L_0x00ca
            L_0x0068:
                r2 = move-exception
                goto L_0x0077
            L_0x006a:
                r2 = move-exception
                r4 = r1
                goto L_0x00cd
            L_0x006d:
                r2 = move-exception
                r4 = r1
                goto L_0x0077
            L_0x0070:
                r2 = move-exception
                r3 = r1
                r4 = r3
                goto L_0x00cd
            L_0x0074:
                r2 = move-exception
                r3 = r1
                r4 = r3
            L_0x0077:
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x00cc }
                java.lang.String r6 = "JSONException: "
                r5.<init>(r6)     // Catch:{ all -> 0x00cc }
                java.lang.String r2 = r2.getMessage()     // Catch:{ all -> 0x00cc }
                r5.append(r2)     // Catch:{ all -> 0x00cc }
                java.lang.String r2 = r5.toString()     // Catch:{ all -> 0x00cc }
                com.kakao.util.helper.log.Logger.m60933e(r2)     // Catch:{ all -> 0x00cc }
                boolean r2 = android.text.TextUtils.isEmpty(r3)
                if (r2 == 0) goto L_0x0093
                goto L_0x0094
            L_0x0093:
                r10 = r3
            L_0x0094:
                boolean r2 = android.text.TextUtils.isEmpty(r4)
                if (r2 == 0) goto L_0x00a0
                com.kakao.auth.authorization.authcode.KakaoWebViewActivity r2 = com.kakao.auth.authorization.authcode.KakaoWebViewActivity.this
                java.lang.String r4 = r2.getString(r0)
            L_0x00a0:
                boolean r0 = android.text.TextUtils.isEmpty(r1)
                if (r0 == 0) goto L_0x00ac
                com.kakao.auth.authorization.authcode.KakaoWebViewActivity r0 = com.kakao.auth.authorization.authcode.KakaoWebViewActivity.this
                java.lang.String r1 = r0.getString(r9)
            L_0x00ac:
                android.app.AlertDialog$Builder r9 = new android.app.AlertDialog$Builder
                com.kakao.auth.authorization.authcode.KakaoWebViewActivity r0 = com.kakao.auth.authorization.authcode.KakaoWebViewActivity.this
                r9.<init>(r0)
                android.app.AlertDialog$Builder r9 = r9.setMessage(r10)
                com.kakao.auth.authorization.authcode.KakaoWebViewActivity$KakaoWebChromeClient$3 r10 = new com.kakao.auth.authorization.authcode.KakaoWebViewActivity$KakaoWebChromeClient$3
                r10.<init>(r11)
                android.app.AlertDialog$Builder r9 = r9.setPositiveButton(r4, r10)
                com.kakao.auth.authorization.authcode.KakaoWebViewActivity$KakaoWebChromeClient$2 r10 = new com.kakao.auth.authorization.authcode.KakaoWebViewActivity$KakaoWebChromeClient$2
                r10.<init>(r11)
                android.app.AlertDialog$Builder r9 = r9.setNegativeButton(r1, r10)
                goto L_0x005b
            L_0x00ca:
                r8 = 1
                return r8
            L_0x00cc:
                r2 = move-exception
            L_0x00cd:
                boolean r5 = android.text.TextUtils.isEmpty(r3)
                if (r5 == 0) goto L_0x00d4
                goto L_0x00d5
            L_0x00d4:
                r10 = r3
            L_0x00d5:
                boolean r3 = android.text.TextUtils.isEmpty(r4)
                if (r3 == 0) goto L_0x00e1
                com.kakao.auth.authorization.authcode.KakaoWebViewActivity r3 = com.kakao.auth.authorization.authcode.KakaoWebViewActivity.this
                java.lang.String r4 = r3.getString(r0)
            L_0x00e1:
                boolean r0 = android.text.TextUtils.isEmpty(r1)
                if (r0 == 0) goto L_0x00ed
                com.kakao.auth.authorization.authcode.KakaoWebViewActivity r0 = com.kakao.auth.authorization.authcode.KakaoWebViewActivity.this
                java.lang.String r1 = r0.getString(r9)
            L_0x00ed:
                android.app.AlertDialog$Builder r9 = new android.app.AlertDialog$Builder
                com.kakao.auth.authorization.authcode.KakaoWebViewActivity r0 = com.kakao.auth.authorization.authcode.KakaoWebViewActivity.this
                r9.<init>(r0)
                android.app.AlertDialog$Builder r9 = r9.setMessage(r10)
                com.kakao.auth.authorization.authcode.KakaoWebViewActivity$KakaoWebChromeClient$3 r10 = new com.kakao.auth.authorization.authcode.KakaoWebViewActivity$KakaoWebChromeClient$3
                r10.<init>(r11)
                android.app.AlertDialog$Builder r9 = r9.setPositiveButton(r4, r10)
                com.kakao.auth.authorization.authcode.KakaoWebViewActivity$KakaoWebChromeClient$2 r10 = new com.kakao.auth.authorization.authcode.KakaoWebViewActivity$KakaoWebChromeClient$2
                r10.<init>(r11)
                android.app.AlertDialog$Builder r9 = r9.setNegativeButton(r1, r10)
                android.app.AlertDialog$Builder r8 = r9.setCancelable(r8)
                android.app.AlertDialog r8 = r8.create()
                r8.show()
                throw r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.kakao.auth.authorization.authcode.KakaoWebViewActivity.KakaoWebChromeClient.onJsConfirm(android.webkit.WebView, java.lang.String, java.lang.String, android.webkit.JsResult):boolean");
        }
    }

    class KakaoWebViewClient extends WebViewClient {

        class _lancet {
            private _lancet() {
            }

            static void com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast toast) {
                if (VERSION.SDK_INT == 25) {
                    C43112ex.m136740a(toast);
                }
                toast.show();
            }

            static void com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(WebView webView, String str, Map map) {
                C32278e.m104800a(str);
                webView.loadUrl(str, map);
            }
        }

        public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
            return C6490c.m20174a(webView, renderProcessGoneDetail);
        }

        private KakaoWebViewClient() {
        }

        private boolean handleShouldOverrideUrlLoading(String str) {
            if (str.startsWith("kakao") && (str.contains("://oauth") || str.contains("://ageauth"))) {
                KakaoWebViewActivity.this.sendSuccessToListener(str);
                KakaoWebViewActivity.this.finish();
            } else if (str.contains(ServerProtocol.AUTH_AUTHORITY) || str.contains(ServerProtocol.API_AUTHORITY) || str.contains(ServerProtocol.ACCOUNT_AUTHORITY)) {
                _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(KakaoWebViewActivity.this.webView, str, KakaoWebViewActivity.this.headers);
            } else if (KakaoWebViewActivity.this.isCameraAccessibleScheme(str)) {
                KakaoWebViewActivity.this.processCameraAccessibleScript(KakaoWebViewActivity.this.createCameraAccessibleScript(Uri.parse(str)));
            } else {
                try {
                    KakaoWebViewActivity.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
                } catch (ActivityNotFoundException e) {
                    _lancet.com_ss_android_ugc_aweme_lancet_DesignBugFixLancet_show(Toast.makeText(KakaoWebViewActivity.this.getApplicationContext(), e.getLocalizedMessage(), 0));
                }
            }
            return true;
        }

        public void onPageFinished(WebView webView, String str) {
            super.onPageFinished(webView, str);
            KakaoWebViewActivity.this.setProgressBarVisibility(8);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, String str) {
            StringBuilder sb = new StringBuilder("(Deprecated) Redirect URL: ");
            sb.append(str);
            Logger.m60925d(sb.toString());
            return handleShouldOverrideUrlLoading(str);
        }

        public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
            StringBuilder sb = new StringBuilder("Redirect URL:");
            sb.append(webResourceRequest.getUrl());
            Logger.m60925d(sb.toString());
            return handleShouldOverrideUrlLoading(webResourceRequest.getUrl().toString());
        }

        public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
            StringBuilder sb = new StringBuilder("Webview loading URL: ");
            sb.append(str);
            Logger.m60925d(sb.toString());
            super.onPageStarted(webView, str, bitmap);
            KakaoWebViewActivity.this.setProgressBarVisibility(0);
        }

        public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
            String str;
            super.onReceivedError(webView, webResourceRequest, webResourceError);
            KakaoWebViewActivity.this.setProgressBarVisibility(8);
            KakaoWebViewActivity kakaoWebViewActivity = KakaoWebViewActivity.this;
            int errorCode = webResourceError.getErrorCode();
            if (webResourceError.getDescription() != null) {
                str = webResourceError.getDescription().toString();
            } else {
                str = null;
            }
            kakaoWebViewActivity.sendErrorToListener(new KakaoWebviewException(errorCode, str, webResourceRequest.getUrl().toString()));
            KakaoWebViewActivity.this.finish();
        }

        public void onReceivedSslError(WebView webView, final SslErrorHandler sslErrorHandler, final SslError sslError) {
            KakaoWebViewActivity.this.setProgressBarVisibility(8);
            Builder builder = new Builder(KakaoWebViewActivity.this);
            builder.setTitle(KakaoWebViewActivity.this.getString(R.string.e9w));
            builder.setMessage(KakaoWebViewActivity.this.getString(R.string.c9g));
            KakaoWebViewActivity.this.shouldProceedWithSslError = false;
            builder.setNegativeButton(KakaoWebViewActivity.this.getString(R.string.vh), new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                }
            });
            builder.setPositiveButton(KakaoWebViewActivity.this.getString(R.string.vi), new OnClickListener() {
                public void onClick(DialogInterface dialogInterface, int i) {
                    KakaoWebViewActivity.this.shouldProceedWithSslError = true;
                    sslErrorHandler.proceed();
                }
            });
            AlertDialog create = builder.create();
            create.setOnDismissListener(new OnDismissListener() {
                public void onDismiss(DialogInterface dialogInterface) {
                    String str;
                    if (!KakaoWebViewActivity.this.shouldProceedWithSslError) {
                        sslErrorHandler.cancel();
                        KakaoWebViewActivity kakaoWebViewActivity = KakaoWebViewActivity.this;
                        if (sslError == null) {
                            str = null;
                        } else {
                            str = sslError.toString();
                        }
                        kakaoWebViewActivity.sendErrorToListener(new KakaoWebviewException(-11, str, null));
                        KakaoWebViewActivity.this.finish();
                    }
                }
            });
            if (!KakaoWebViewActivity.this.isFinishing()) {
                create.show();
            }
        }

        public void onReceivedError(WebView webView, int i, String str, String str2) {
            if (VERSION.SDK_INT < 23) {
                super.onReceivedError(webView, i, str, str2);
                KakaoWebViewActivity.this.setProgressBarVisibility(8);
                KakaoWebViewActivity.this.sendErrorToListener(new KakaoWebviewException(i, str, str2));
                KakaoWebViewActivity.this.finish();
            }
        }
    }

    class _lancet {
        private _lancet() {
        }

        static void com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(WebView webView, String str) {
            C32278e.m104800a(str);
            webView.loadUrl(str);
        }

        static void com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(WebView webView, String str, Map map) {
            C32278e.m104800a(str);
            webView.loadUrl(str, map);
        }
    }

    public void finish() {
        overridePendingTransition(0, 0);
        super.finish();
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        unRegisterSmsReceiverIfNeeded();
        super.onDestroy();
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        if (this.useWebViewTimers) {
            this.webView.pauseTimers();
        }
        super.onPause();
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        if (this.useWebViewTimers) {
            this.webView.resumeTimers();
        }
    }

    private void sendCancelToListener() {
        sendErrorToListener(new KakaoException(ErrorType.CANCELED_OPERATION, getString(R.string.m6)));
    }

    private void unRegisterSmsReceiverIfNeeded() {
        if (smsReceiver != null) {
            try {
                Logger.m60925d("unregisterSmsReceiver");
                unregisterReceiver(smsReceiver);
            } catch (Exception unused) {
            }
            smsReceiver = null;
        }
    }

    public void onBackPressed() {
        if (this.webView.canGoBack()) {
            this.webView.goBack();
            return;
        }
        sendCancelToListener();
        super.onBackPressed();
    }

    private void registerSmsReceiverIfNeeded() {
        if (this.useSmsReceiver && smsReceiver == null) {
            Logger.m60925d("registerSmsReceiver");
            smsReceiver = new SmsReceiver(new ISmsReceiver() {

                /* renamed from: com.kakao.auth.authorization.authcode.KakaoWebViewActivity$1$_lancet */
                class _lancet {
                    private _lancet() {
                    }

                    static void com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(WebView webView, String str) {
                        C32278e.m104800a(str);
                        webView.loadUrl(str);
                    }
                }

                public void onCompleteSms(String str) {
                    Logger.m60927d("++ onCompleteSms(%s)", str);
                    if (!TextUtils.isEmpty(str)) {
                        String a = C1642a.m8035a(Locale.US, "javascript:insertSms('%s')", new Object[]{str});
                        StringBuilder sb = new StringBuilder("++ command : ");
                        sb.append(a);
                        Logger.m60925d(sb.toString());
                        _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(KakaoWebViewActivity.this.webView, a);
                    }
                }
            });
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.provider.Telephony.SMS_RECEIVED");
            intentFilter.setPriority(999);
            registerReceiver(smsReceiver, intentFilter);
        }
    }

    /* access modifiers changed from: 0000 */
    public void openImageChooserActivity() {
        Intent intent = new Intent("android.intent.action.GET_CONTENT");
        intent.addCategory("android.intent.category.OPENABLE");
        intent.setType("image/*");
        startActivityForResult(Intent.createChooser(intent, getString(R.string.bsy)), 9999);
    }

    private void initUi() {
        this.webView = (WebView) findViewById(R.id.egh);
        this.progressBar = (ProgressBar) findViewById(R.id.cl2);
        this.webView.setBackgroundResource(17170443);
        this.webView.setVerticalScrollBarEnabled(false);
        this.webView.setHorizontalScrollBarEnabled(false);
        this.webView.setWebViewClient(C6490c.m20171a((WebViewClient) new KakaoWebViewClient()));
        this.webView.setWebChromeClient(new KakaoWebChromeClient());
        this.webView.getSettings().setJavaScriptEnabled(true);
        this.webView.getSettings().setSaveFormData(KakaoSDK.getAdapter().getSessionConfig().isSaveFormData());
        this.webView.getSettings().setSavePassword(false);
        setProgressBarVisibility(0);
        _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(this.webView, this.url, this.headers);
    }

    public static Intent newIntent(Context context) {
        Intent intent = new Intent(context, KakaoWebViewActivity.class);
        intent.addFlags(805371904);
        return intent;
    }

    public void setProgressBarVisibility(int i) {
        if (!isFinishing()) {
            this.progressBar.setVisibility(i);
        }
    }

    /* access modifiers changed from: protected */
    public void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
        parseIntent(intent);
        setProgressBarVisibility(0);
        _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(this.webView, this.url, this.headers);
    }

    public void sendSuccessToListener(String str) {
        if (this.resultReceiver != null) {
            Bundle bundle = new Bundle();
            bundle.putString("key.redirect.url", str);
            this.resultReceiver.send(0, bundle);
        }
    }

    /* access modifiers changed from: 0000 */
    public String createCameraAccessibleScript(Uri uri) {
        int i;
        String queryParameter = uri.getQueryParameter("callback");
        if (queryParameter == null) {
            return null;
        }
        if (VERSION.SDK_INT < 16 || C0683b.m2909b((Context) this, "android.permission.READ_EXTERNAL_STORAGE") == 0) {
            i = 1;
        } else {
            i = 0;
        }
        return C1642a.m8035a(Locale.US, "%s(%d)", new Object[]{queryParameter, Integer.valueOf(i)});
    }

    /* access modifiers changed from: 0000 */
    public boolean isCameraAccessibleScheme(String str) {
        if (str == null) {
            return false;
        }
        Uri parse = Uri.parse(str);
        if (!"kakao".equals(parse.getScheme()) || !"cameraAccessible".equals(parse.getHost())) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        try {
            requestWindowFeature(1);
            super.onCreate(bundle);
            parseIntent(getIntent());
            setContentView(R.layout.ci);
            initUi();
            registerSmsReceiverIfNeeded();
        } catch (Exception e) {
            sendErrorToListener(e);
            finish();
        }
    }

    /* access modifiers changed from: 0000 */
    public void processCameraAccessibleScript(String str) {
        if (str == null) {
            Logger.m60957w("Callback function was not provide. Ignoring custom scheme (%s)", this.url);
        } else if (VERSION.SDK_INT >= 19) {
            this.webView.evaluateJavascript(str, new ValueCallback<String>() {
                public void onReceiveValue(String str) {
                    Logger.m60927d("received value from javascript: %s", str);
                }
            });
        } else {
            _lancet.com_ss_android_ugc_aweme_lancet_H5UrlCheckLancet_loadUrl(this.webView, C1642a.m8035a(Locale.US, "javascript:%s", new Object[]{str}));
        }
    }

    public void sendErrorToListener(Throwable th) {
        KakaoException kakaoException;
        if (this.resultReceiver != null) {
            Bundle bundle = new Bundle();
            if (th instanceof KakaoException) {
                kakaoException = (KakaoException) th;
            } else {
                kakaoException = new KakaoException(th.getMessage(), th);
            }
            bundle.putSerializable("key.exception", kakaoException);
            this.resultReceiver.send(1, bundle);
        }
    }

    private void parseIntent(Intent intent) {
        this.url = intent.getStringExtra("key.url");
        this.useWebViewTimers = intent.getBooleanExtra("key.use.webview.timers", false);
        this.useSmsReceiver = intent.getBooleanExtra("key.use.sms.receiver", false);
        this.resultReceiver = (ResultReceiver) intent.getParcelableExtra("key.result.receiver");
        Bundle bundle = (Bundle) intent.getParcelableExtra("key.extra.headers");
        this.headers.put("KA", SystemInfo.getKAHeader());
        if (bundle != null && !bundle.isEmpty()) {
            for (String str : bundle.keySet()) {
                this.headers.put(str, bundle.getString(str));
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onActivityResult(int i, int i2, Intent intent) {
        Object obj;
        super.onActivityResult(i, i2, intent);
        if (VERSION.SDK_INT >= 21) {
            onActivityResultForLollipop(i, i2, intent);
        } else if (i == 9999 && this.imageCallback != null) {
            if (i2 != -1 || intent == null) {
                obj = null;
            } else {
                obj = intent.getData();
            }
            this.imageCallback.onReceiveValue(obj);
            this.imageCallback = null;
        }
    }

    /* access modifiers changed from: 0000 */
    public void onActivityResultForLollipop(int i, int i2, Intent intent) {
        Uri[] uriArr;
        Uri[] uriArr2;
        if (i == 9999 && this.lollipopImageCallback != null) {
            if (i2 == -1) {
                String dataString = intent.getDataString();
                ClipData clipData = intent.getClipData();
                if (clipData != null) {
                    uriArr2 = new Uri[clipData.getItemCount()];
                    for (int i3 = 0; i3 < clipData.getItemCount(); i3++) {
                        uriArr2[i3] = clipData.getItemAt(i3).getUri();
                    }
                } else {
                    uriArr2 = null;
                }
                uriArr = dataString != null ? new Uri[]{Uri.parse(dataString)} : uriArr2;
            } else {
                uriArr = null;
            }
            this.lollipopImageCallback.onReceiveValue(uriArr);
            this.lollipopImageCallback = null;
        }
    }
}
