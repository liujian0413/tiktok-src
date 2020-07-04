package com.facebook.bidding.p674a.p680f;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.facebook.bidding.p674a.p675a.C13205a;
import java.util.Locale;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.facebook.bidding.a.f.c */
public final class C13219c {

    /* renamed from: a */
    public static String f35031a = "Unknown";

    /* renamed from: b */
    private static final AtomicBoolean f35032b = new AtomicBoolean();

    /* renamed from: c */
    private static String f35033c = null;

    /* renamed from: a */
    private static String m38630a(C13205a aVar) {
        String a = aVar.mo32400a();
        if (TextUtils.isEmpty(a)) {
            f35032b.getAndSet(true);
        }
        return a;
    }

    /* renamed from: a */
    public static String m38631a(C13205a aVar, Context context) {
        StringBuilder sb = new StringBuilder();
        sb.append(m38632b(context));
        sb.append(" [FBAN/AudienceNetworkForAndroid;FBSN/Android");
        sb.append(";FBSV/");
        sb.append(C13205a.f34999a);
        sb.append(";FBAB/");
        sb.append(m38630a(aVar));
        sb.append(";FBAV/");
        sb.append(aVar.mo32401b());
        sb.append(";FBBV/");
        sb.append(aVar.mo32402c());
        sb.append(";FBVS/1.0");
        sb.append(";FBLC/");
        sb.append(Locale.getDefault().toString());
        sb.append("]");
        return sb.toString();
    }

    /* renamed from: b */
    private static synchronized String m38632b(Context context) {
        synchronized (C13219c.class) {
            if (context == null) {
                String str = f35031a;
                return str;
            } else if (f35033c != null) {
                String str2 = f35033c;
                return str2;
            } else {
                String c = m38633c(context);
                if (c == null) {
                    String str3 = f35031a;
                    return str3;
                }
                f35033c = c;
                return c;
            }
        }
    }

    /* renamed from: c */
    private static String m38633c(final Context context) {
        FutureTask futureTask = new FutureTask(new Callable<String>() {
            /* access modifiers changed from: private */
            /* renamed from: a */
            public String call() {
                if (VERSION.SDK_INT >= 17) {
                    try {
                        return C13219c.m38634d(context);
                    } catch (Throwable unused) {
                    }
                }
                WebView webView = new WebView(context.getApplicationContext());
                String userAgentString = webView.getSettings().getUserAgentString();
                webView.destroy();
                return userAgentString;
            }
        });
        int i = 0;
        while (i < 3) {
            C13218b.m38628a(futureTask);
            try {
                return (String) futureTask.get();
            } catch (Throwable unused) {
                SystemClock.sleep(500);
                i++;
            }
        }
        return null;
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public static String m38634d(Context context) {
        return WebSettings.getDefaultUserAgent(context);
    }
}
