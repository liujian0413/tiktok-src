package com.bytedance.p073ad.symphony.nativead.p087fb;

import android.net.Uri;
import com.facebook.ads.NativeAd;
import java.lang.reflect.Field;
import java.net.URLEncoder;

/* renamed from: com.bytedance.ad.symphony.nativead.fb.d */
public class C2183d {

    /* renamed from: a */
    private static final String f7410a = "d";

    /* renamed from: com.bytedance.ad.symphony.nativead.fb.d$a */
    public static class C2184a {

        /* renamed from: a */
        public String f7411a;

        /* renamed from: b */
        public String f7412b;
    }

    /* renamed from: a */
    public static C2184a m9496a(NativeAd nativeAd) {
        C2184a aVar = new C2184a();
        try {
            Field declaredField = nativeAd.getClass().getSuperclass().getDeclaredField("mNativeAdBaseApi");
            declaredField.setAccessible(true);
            Object a = m9497a(declaredField.get(nativeAd), "B");
            Uri uri = (Uri) m9497a(a, "D");
            if (uri != null) {
                aVar.f7411a = URLEncoder.encode(uri.toString());
            }
            String str = (String) m9497a(m9497a(a, "O"), "C");
            if (str != null) {
                aVar.f7412b = str;
            }
        } catch (Throwable unused) {
        }
        return aVar;
    }

    /* renamed from: a */
    private static Object m9497a(Object obj, String str) {
        try {
            Field declaredField = obj.getClass().getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField.get(obj);
        } catch (Throwable unused) {
            return null;
        }
    }
}
