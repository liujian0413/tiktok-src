package com.p280ss.android.ugc.aweme.crossplatform;

import android.view.ViewGroup;
import android.view.ViewParent;
import com.p280ss.android.ugc.aweme.crossplatform.view.C26027e;
import com.p280ss.android.ugc.aweme.crossplatform.view.CrossPlatformWebView;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C7581n;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: com.ss.android.ugc.aweme.crossplatform.RNPreloadHelper */
public final class RNPreloadHelper {

    /* renamed from: a */
    public static final RNPreloadHelper f68232a = new RNPreloadHelper();

    /* renamed from: b */
    private static Map<String, C26027e> f68233b = new LinkedHashMap();

    /* renamed from: c */
    private static Map<String, Integer> f68234c = new LinkedHashMap();

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.RNPreloadHelper$PreloadResult */
    public enum PreloadResult {
        FAILED,
        H5,
        RN
    }

    /* renamed from: com.ss.android.ugc.aweme.crossplatform.RNPreloadHelper$a */
    public interface C25807a {
        /* renamed from: a */
        C26027e mo67080a(String str);
    }

    private RNPreloadHelper() {
    }

    /* renamed from: a */
    public static C26027e m84813a(String str) {
        C7573i.m23587b(str, "url");
        return (C26027e) f68233b.get(str);
    }

    /* renamed from: d */
    public static void m84818d(String str) {
        C7573i.m23587b(str, "url");
        f68233b.put(str, null);
    }

    /* renamed from: e */
    private static Integer m84819e(String str) {
        C7573i.m23587b(str, "url");
        return (Integer) f68234c.get(str);
    }

    /* renamed from: a */
    public static boolean m84815a(CrossPlatformWebView crossPlatformWebView) {
        C7573i.m23587b(crossPlatformWebView, "view");
        if (!(crossPlatformWebView instanceof C26027e) || !((C26027e) crossPlatformWebView).getMFromPreload()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static void m84816b(String str) {
        C7573i.m23587b(str, "url");
        Integer num = (Integer) f68234c.get(str);
        if (num == null) {
            f68234c.put(str, Integer.valueOf(1));
        } else {
            f68234c.put(str, Integer.valueOf(num.intValue() + 1));
        }
    }

    /* renamed from: c */
    public static void m84817c(String str) {
        C7573i.m23587b(str, "url");
        Integer num = (Integer) f68234c.get(str);
        if (num == null) {
            f68234c.put(str, Integer.valueOf(0));
        } else if (num.intValue() != 0) {
            f68234c.put(str, Integer.valueOf(num.intValue() - 1));
        }
    }

    /* renamed from: a */
    public static PreloadResult m84812a(String str, String str2, C25807a aVar) {
        C7573i.m23587b(str, "baseUrl");
        C7573i.m23587b(str2, "loadUrl");
        C7573i.m23587b(aVar, "factory");
        if (((C26027e) f68233b.get(str)) != null) {
            return PreloadResult.FAILED;
        }
        C26027e a = aVar.mo67080a(str);
        f68233b.put(str, a);
        a.mo67475a(str2, false, false);
        if (a.getMLoadRnSuccess()) {
            return PreloadResult.RN;
        }
        return PreloadResult.H5;
    }

    /* renamed from: a */
    private static boolean m84814a(ViewGroup viewGroup, CrossPlatformWebView crossPlatformWebView, CrossPlatformWebView crossPlatformWebView2) {
        ViewGroup viewGroup2 = null;
        crossPlatformWebView.mo67493g(null);
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            if (viewGroup.getChildAt(i) == crossPlatformWebView) {
                viewGroup.removeViewAt(i);
                ViewParent parent = crossPlatformWebView2.getParent();
                if (parent instanceof ViewGroup) {
                    viewGroup2 = parent;
                }
                ViewGroup viewGroup3 = viewGroup2;
                if (viewGroup3 != null) {
                    viewGroup3.removeView(crossPlatformWebView2);
                }
                crossPlatformWebView2.setLayoutParams(crossPlatformWebView.getLayoutParams());
                viewGroup.addView(crossPlatformWebView2, i);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final CrossPlatformWebView mo67079a(String str, CrossPlatformWebView crossPlatformWebView, C7561a<C7581n> aVar) {
        C7573i.m23587b(str, "url");
        C7573i.m23587b(crossPlatformWebView, "crossPlatformWebView");
        C7573i.m23587b(aVar, "actionOnNotPreload");
        ViewParent parent = crossPlatformWebView.getParent();
        if (!(parent instanceof ViewGroup)) {
            parent = null;
        }
        ViewGroup viewGroup = (ViewGroup) parent;
        C26027e a = m84813a(str);
        if (viewGroup == null) {
            return crossPlatformWebView;
        }
        if (a == null) {
            aVar.invoke();
            return crossPlatformWebView;
        }
        Integer e = m84819e(str);
        if (e != null && e.intValue() > 0) {
            return crossPlatformWebView;
        }
        CrossPlatformWebView crossPlatformWebView2 = a;
        if (!m84814a(viewGroup, crossPlatformWebView, crossPlatformWebView2)) {
            return crossPlatformWebView;
        }
        a.setMFromPreload(true);
        return crossPlatformWebView2;
    }
}
