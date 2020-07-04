package com.p280ss.android.newmedia.p897ui.webview;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.graphics.Paint;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.p022v4.content.C0683b;
import android.support.p022v4.view.C0991u;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.webkit.URLUtil;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebView.HitTestResult;
import android.widget.Toast;
import bolts.C1591g;
import bolts.C1592h;
import com.bytedance.common.p479c.C9682a;
import com.bytedance.common.p479c.C9684b;
import com.bytedance.common.p479c.C9696e;
import com.bytedance.common.utility.C6319n;
import com.bytedance.ies.uikit.dialog.C11029b.C11030a;
import com.p280ss.android.newmedia.C19929d;
import com.p280ss.android.ugc.aweme.base.utils.C23487o;
import com.p280ss.android.ugc.aweme.legacy.download.C32335d;
import com.p280ss.android.ugc.aweme.p1048ax.C23139a;
import com.p280ss.android.ugc.aweme.p331m.C7163a;
import com.p280ss.android.ugc.aweme.p999aj.C22477b;
import com.p280ss.android.ugc.aweme.p999aj.C22477b.C22480b;
import com.zhiliaoapp.musically.df_live_zego_link.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.newmedia.ui.webview.a */
public final class C19996a {

    /* renamed from: a */
    private WeakReference<Context> f54119a;

    /* renamed from: b */
    private boolean f54120b = true;

    /* renamed from: c */
    private boolean f54121c = true;

    /* renamed from: d */
    private boolean f54122d = true;

    /* renamed from: e */
    private boolean f54123e = true;

    /* renamed from: f */
    private boolean f54124f = true;

    /* renamed from: g */
    private boolean f54125g = true;

    /* renamed from: h */
    private boolean f54126h = true;

    /* renamed from: i */
    private boolean f54127i = true;

    /* renamed from: a */
    public final C19996a mo53544a(boolean z) {
        this.f54127i = true;
        return this;
    }

    /* renamed from: a */
    public static C19996a m65912a(Context context) {
        return new C19996a(context);
    }

    private C19996a(Context context) {
        this.f54119a = new WeakReference<>(context);
    }

    /* renamed from: a */
    public final void mo53545a(WebView webView) {
        if (webView != null && this.f54119a.get() != null) {
            WebSettings settings = webView.getSettings();
            if (settings != null) {
                try {
                    settings.setJavaScriptEnabled(this.f54120b);
                } catch (Exception unused) {
                }
                try {
                    if (this.f54121c) {
                        settings.setSupportZoom(true);
                        settings.setBuiltInZoomControls(true);
                        C9682a.m28608a(settings, false);
                    } else {
                        settings.setSupportZoom(false);
                    }
                } catch (Throwable unused2) {
                }
                settings.setLoadWithOverviewMode(true);
                settings.setUseWideViewPort(this.f54122d);
                settings.setDomStorageEnabled(this.f54124f);
                settings.setAllowFileAccess(this.f54125g);
                settings.setBlockNetworkImage(!this.f54126h);
                if (!this.f54127i) {
                    try {
                        C0991u.m4180a((View) webView, 1, (Paint) null);
                    } catch (Throwable unused3) {
                    }
                }
                C9684b.m28616a(webView.getSettings(), true);
                m65914a(webView, this.f54123e);
                C20005g.f54137a.mo53551a(webView);
                if (C7163a.m22363a() && VERSION.SDK_INT >= 19) {
                    WebView.setWebContentsDebuggingEnabled(true);
                }
                C9696e.m28630a(webView.getSettings(), 0);
                C9696e.m28631a(webView, true);
            }
        }
    }

    /* renamed from: a */
    private void m65914a(WebView webView, boolean z) {
        if (!z) {
            webView.setOnLongClickListener(null);
            webView.setLongClickable(false);
            return;
        }
        webView.setLongClickable(true);
        webView.setOnLongClickListener(new OnLongClickListener() {
            public final boolean onLongClick(View view) {
                if (!(view instanceof WebView)) {
                    return false;
                }
                WebView webView = (WebView) view;
                HitTestResult hitTestResult = webView.getHitTestResult();
                if (hitTestResult == null || webView.getSettings() == null) {
                    return false;
                }
                if (hitTestResult.getType() == 5 || hitTestResult.getType() == 8) {
                    final String extra = hitTestResult.getExtra();
                    final Context context = webView.getContext();
                    if (!(extra == null || context == null || !C19929d.m65759a(extra))) {
                        C11030a aVar = new C11030a(context);
                        aVar.mo26643a((CharSequence[]) new String[]{context.getString(R.string.frn)}, (OnClickListener) new OnClickListener() {
                            /* renamed from: a */
                            public final void mo53547a() {
                                String a = C23139a.m76055a(context);
                                File file = new File(a);
                                if (!file.exists()) {
                                    file.mkdirs();
                                }
                                C1592h.m7853a((Callable<TResult>) new C20000b<TResult>(context, extra, a)).mo6876a((C1591g<TResult, TContinuationResult>) new C20001c<TResult,TContinuationResult>(context), C1592h.f5958b);
                            }

                            /* renamed from: a */
                            static final /* synthetic */ Void m65918a(Context context, C1592h hVar) throws Exception {
                                if (((Boolean) hVar.mo6890e()).booleanValue()) {
                                    C20003e.m65922a(Toast.makeText(context, R.string.e9p, 1));
                                }
                                return null;
                            }

                            public final void onClick(DialogInterface dialogInterface, int i) {
                                if (C0683b.m2909b(context, "android.permission.WRITE_EXTERNAL_STORAGE") == -1) {
                                    C22477b.m74364a(C23487o.m77130a(context), new String[]{"android.permission.WRITE_EXTERNAL_STORAGE"}, new C22480b() {
                                        /* renamed from: a */
                                        public final void mo53549a(String[] strArr, int[] iArr) {
                                            if (iArr.length <= 0 || iArr[0] != 0) {
                                                C20002d.m65921a(Toast.makeText(context, R.string.e9q, 1));
                                            } else {
                                                C199981.this.mo53547a();
                                            }
                                        }
                                    });
                                    return;
                                }
                                mo53547a();
                            }

                            /* renamed from: a */
                            static final /* synthetic */ Boolean m65917a(Context context, String str, String str2) throws Exception {
                                boolean z = false;
                                if (context != null) {
                                    String file = context.getExternalCacheDir().toString();
                                    try {
                                        String guessFileName = URLUtil.guessFileName(str, null, "image/jpeg");
                                        boolean a = C32335d.m104902a(context.getApplicationContext(), -1, str, null, str2, file, guessFileName, null, null);
                                        if (a) {
                                            try {
                                                StringBuilder sb = new StringBuilder();
                                                sb.append(str2);
                                                sb.append(guessFileName);
                                                context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(new File(sb.toString()))));
                                                StringBuilder sb2 = new StringBuilder();
                                                sb2.append(str2);
                                                sb2.append(guessFileName);
                                                MediaScannerConnection.scanFile(context, new String[]{sb2.toString()}, null, null);
                                            } catch (Throwable unused) {
                                            }
                                        }
                                        z = a;
                                    } catch (Throwable unused2) {
                                    }
                                }
                                return Boolean.valueOf(z);
                            }
                        });
                        aVar.mo26649b();
                        return true;
                    }
                }
                return false;
            }
        });
    }

    /* renamed from: a */
    public static String m65913a(String str, long j) {
        if (C6319n.m19593a(str) || j <= 0 || !str.contains("{{ad_id}}")) {
            return null;
        }
        String replace = str.replace("{{ad_id}}", String.valueOf(j));
        StringBuilder sb = new StringBuilder("javascript:(function () {    var JS_ACTLOG_URL = '");
        sb.append(replace);
        sb.append("';    var head = document.getElementsByTagName('head')[0];    var script = document.createElement('script');    script.type = 'text/javascript';    script.src = JS_ACTLOG_URL;    head.appendChild(script);})();");
        return sb.toString();
    }
}
