package com.bytedance.polaris.p634b;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewParent;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ImageView;
import com.example.p266a.C6490c;
import java.util.HashSet;

/* renamed from: com.bytedance.polaris.b.r */
public final class C12367r {

    /* renamed from: a */
    static final HashSet<String> f32805a;

    /* renamed from: b */
    static final HashSet<String> f32806b;

    /* renamed from: c */
    private static int f32807c = -1;

    static {
        HashSet<String> hashSet = new HashSet<>();
        hashSet.add("HUAWEI C8812");
        hashSet.add("HUAWEI C8812E");
        hashSet.add("HUAWEI C8825D");
        hashSet.add("HUAWEI U8825D");
        hashSet.add("HUAWEI C8950D");
        hashSet.add("HUAWEI U8950D");
        f32805a = hashSet;
        HashSet<String> hashSet2 = new HashSet<>();
        hashSet2.add("ZTE V955");
        hashSet2.add("ZTE N881E");
        hashSet2.add("ZTE N881F");
        hashSet2.add("ZTE N880G");
        hashSet2.add("ZTE N880F");
        hashSet2.add("ZTE V889F");
        f32806b = hashSet2;
    }

    /* renamed from: a */
    public static void m35916a(int i) {
        f32807c = i;
    }

    /* renamed from: a */
    public static void m35918a(WebView webView) {
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
    public static void m35917a(Context context, WebView webView) {
        if (!(context == null || webView == null || !(context instanceof Activity))) {
            Activity activity = (Activity) context;
            if (activity.isFinishing()) {
                try {
                    C12355i.m35892a(webView, "about:blank");
                    if (f32807c > 0) {
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
