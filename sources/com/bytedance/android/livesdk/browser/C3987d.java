package com.bytedance.android.livesdk.browser;

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
import com.bytedance.android.live.core.utils.C3410w;
import com.bytedance.android.livesdk.browser.p192b.C3966a;
import com.example.p266a.C6490c;
import com.p280ss.android.common.util.C6776h;
import java.util.HashSet;

/* renamed from: com.bytedance.android.livesdk.browser.d */
public final class C3987d {

    /* renamed from: a */
    static Handler f11864a = null;

    /* renamed from: b */
    static final HashSet<String> f11865b;

    /* renamed from: c */
    static final HashSet<String> f11866c;

    /* renamed from: d */
    private static final boolean f11867d;

    /* renamed from: e */
    private static final boolean f11868e = m13979a();

    /* renamed from: f */
    private static int f11869f = -1;

    /* renamed from: g */
    private static int f11870g = -1;

    /* renamed from: h */
    private static int f11871h = -1;

    /* renamed from: a */
    private static boolean m13979a() {
        if (f11867d) {
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
        f11867d = z;
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("HUAWEI C8812");
        hashSet.add("HUAWEI C8812E");
        hashSet.add("HUAWEI C8825D");
        hashSet.add("HUAWEI U8825D");
        hashSet.add("HUAWEI C8950D");
        hashSet.add("HUAWEI U8950D");
        f11865b = hashSet;
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("ZTE V955");
        hashSet2.add("ZTE N881E");
        hashSet2.add("ZTE N881F");
        hashSet2.add("ZTE N880G");
        hashSet2.add("ZTE N880F");
        hashSet2.add("ZTE V889F");
        f11866c = hashSet2;
    }

    /* renamed from: a */
    public static void m13978a(WebView webView) {
        if (webView != null) {
            webView.setWebChromeClient(null);
            webView.setWebViewClient(C6490c.m20171a((WebViewClient) null));
            ViewParent parent = webView.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(webView);
                try {
                    webView.destroy();
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* renamed from: a */
    public static void m13977a(Context context, C3966a aVar, WebView webView) {
        if (context != null && webView != null && aVar != null) {
            if (aVar.mo11526a() == 0) {
                int i = f11869f;
                if (i < 0 && f11868e) {
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
                        C3410w.m12671a(webView, "about:blank");
                        if (f11871h > 0) {
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
