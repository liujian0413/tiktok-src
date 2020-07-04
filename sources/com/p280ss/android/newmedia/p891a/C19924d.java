package com.p280ss.android.newmedia.p891a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import com.example.p266a.C6490c;
import com.p280ss.android.common.util.C6776h;
import com.p280ss.android.newmedia.C19936f;
import com.p280ss.android.newmedia.C19937g;
import com.p280ss.android.ugc.aweme.commercialize.utils.C25342cb;
import java.util.HashSet;

/* renamed from: com.ss.android.newmedia.a.d */
public final class C19924d {

    /* renamed from: a */
    static Handler f54006a = null;

    /* renamed from: b */
    static final HashSet<String> f54007b;

    /* renamed from: c */
    static final HashSet<String> f54008c;

    /* renamed from: d */
    private static final boolean f54009d;

    /* renamed from: e */
    private static final boolean f54010e = m65744a();

    /* renamed from: f */
    private static int f54011f = -1;

    /* renamed from: g */
    private static int f54012g = -1;

    /* renamed from: h */
    private static int f54013h = -1;

    /* renamed from: a */
    private static boolean m65744a() {
        if (f54009d) {
            return true;
        }
        if (VERSION.SDK_INT != 16 || !"ZTE N5".equals(Build.MODEL)) {
            return false;
        }
        return true;
    }

    static {
        boolean z;
        if (VERSION.SDK_INT < 16 || !C6776h.m20950c()) {
            z = false;
        } else {
            z = true;
        }
        f54009d = z;
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("HUAWEI C8812");
        hashSet.add("HUAWEI C8812E");
        hashSet.add("HUAWEI C8825D");
        hashSet.add("HUAWEI U8825D");
        hashSet.add("HUAWEI C8950D");
        hashSet.add("HUAWEI U8950D");
        f54007b = hashSet;
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("ZTE V955");
        hashSet2.add("ZTE N881E");
        hashSet2.add("ZTE N881F");
        hashSet2.add("ZTE N880G");
        hashSet2.add("ZTE N880F");
        hashSet2.add("ZTE V889F");
        f54008c = hashSet2;
    }

    /* renamed from: a */
    public static void m65743a(WebView webView) {
        if (webView != null) {
            C25342cb.m83273a(webView);
            webView.setWebChromeClient(null);
            webView.setWebViewClient(C6490c.m20171a((WebViewClient) null));
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView);
                try {
                    webView.destroy();
                } catch (Throwable th) {
                    C25342cb.m83274a(th);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m65742a(Context context, WebView webView) {
        if (context != null && webView != null) {
            if (C19936f.m65765a().mo53439e() == 0) {
                int i = f54011f;
                if (i < 0 && f54010e) {
                    i = 1;
                }
                if (i <= 0) {
                    return;
                }
            }
            if (context instanceof Activity) {
                Activity activity = (Activity) context;
                if (activity.isFinishing()) {
                    try {
                        C19937g.m65773a(webView, "about:blank");
                        if (f54013h > 0) {
                            View rootView = webView.getRootView();
                            if (rootView instanceof ViewGroup) {
                                View childAt = ((ViewGroup) rootView).getChildAt(0);
                                childAt.setDrawingCacheEnabled(true);
                                Bitmap createBitmap = Bitmap.createBitmap(childAt.getDrawingCache());
                                childAt.setDrawingCacheEnabled(false);
                                ImageView imageView = new ImageView(activity);
                                imageView.setImageBitmap(createBitmap);
                                imageView.setVisibility(0);
                                ((ViewGroup) rootView).addView(imageView, new LayoutParams(-1, -1));
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }
}
