package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Process;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.webkit.CookieManager;
import android.webkit.CookieSyncManager;
import android.webkit.WebResourceResponse;
import android.webkit.WebSettings;
import com.google.android.gms.ads.internal.C14793ay;
import java.io.InputStream;
import java.util.Map;

@C6505uv
public class acv {
    /* renamed from: a */
    public int mo39191a() {
        return 5;
    }

    /* renamed from: a */
    public String mo39195a(Context context) {
        return "";
    }

    /* renamed from: a */
    public void mo39196a(Activity activity) {
    }

    /* renamed from: a */
    public boolean mo39199a(Activity activity, Configuration configuration) {
        return false;
    }

    /* renamed from: a */
    public boolean mo39201a(View view) {
        return (view.getWindowToken() == null && view.getWindowVisibility() == 8) ? false : true;
    }

    /* renamed from: b */
    public void mo39203b(Context context) {
    }

    /* renamed from: d */
    public int mo39205d() {
        return 1;
    }

    /* renamed from: a */
    public boolean mo39200a(Context context, WebSettings webSettings) {
        return ((Boolean) aet.m45702a(context, new acw(context, webSettings))).booleanValue();
    }

    /* renamed from: a */
    public static boolean m45591a(ami ami) {
        if (ami == null) {
            return false;
        }
        ami.onPause();
        return true;
    }

    /* renamed from: b */
    public static boolean m45592b(ami ami) {
        if (ami == null) {
            return false;
        }
        ami.onResume();
        return true;
    }

    /* renamed from: a */
    public amj mo39194a(ami ami, bwl bwl, boolean z) {
        return new ang(ami, bwl, z);
    }

    /* renamed from: a */
    public void mo39198a(ViewTreeObserver viewTreeObserver, OnGlobalLayoutListener onGlobalLayoutListener) {
        viewTreeObserver.removeGlobalOnLayoutListener(onGlobalLayoutListener);
    }

    /* renamed from: b */
    public LayoutParams mo39202b() {
        return new LayoutParams(-2, -2);
    }

    /* renamed from: a */
    public void mo39197a(View view, Drawable drawable) {
        view.setBackgroundDrawable(drawable);
    }

    /* renamed from: a */
    public Drawable mo39192a(Context context, Bitmap bitmap, boolean z, float f) {
        return new BitmapDrawable(context.getResources(), bitmap);
    }

    /* renamed from: c */
    public static boolean m45593c() {
        int myUid = Process.myUid();
        return myUid == 0 || myUid == 1000;
    }

    /* renamed from: c */
    public CookieManager mo39204c(Context context) {
        if (m45593c()) {
            return null;
        }
        try {
            CookieSyncManager.createInstance(context);
            return CookieManager.getInstance();
        } catch (Throwable th) {
            acd.m45778b("Failed to obtain CookieManager.", th);
            C14793ay.m42898d().mo39089a(th, "ApiLevelUtil.getCookieManager");
            return null;
        }
    }

    /* renamed from: a */
    public WebResourceResponse mo39193a(String str, String str2, int i, String str3, Map<String, String> map, InputStream inputStream) {
        return new WebResourceResponse(str, str2, inputStream);
    }

    private acv() {
    }

    /* renamed from: a */
    public static acv m45590a(int i) {
        if (i >= 28) {
            return new adf();
        }
        if (i >= 26) {
            return new ade();
        }
        if (i >= 24) {
            return new add();
        }
        if (i >= 21) {
            return new adc();
        }
        if (i >= 19) {
            return new adb();
        }
        if (i >= 18) {
            return new acz();
        }
        if (i >= 17) {
            return new acy();
        }
        if (i >= 16) {
            return new ada();
        }
        return new acv();
    }
}
