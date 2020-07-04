package com.bytedance.lighten.core.p613d;

import android.view.View;
import java.util.HashMap;

/* renamed from: com.bytedance.lighten.core.d.a */
public final class C12118a {

    /* renamed from: com.bytedance.lighten.core.d.a$a */
    static class C12120a extends HashMap<String, Object> {
        private C12120a(String str, Object obj) {
            put(str, obj);
        }
    }

    /* renamed from: a */
    public static Object m35284a(View view) {
        return m35285a(view, "DraweeHolder");
    }

    /* renamed from: a */
    private static Object m35285a(View view, String str) {
        return m35289b(view, str, null);
    }

    /* renamed from: a */
    public static void m35286a(View view, Object obj) {
        m35287a(view, "DraweeHolder", obj);
    }

    /* renamed from: b */
    private static Object m35289b(View view, String str, Object obj) {
        if (view != null) {
            Object tag = view.getTag();
            if (tag instanceof C12120a) {
                Object obj2 = ((C12120a) tag).get(str);
                if (obj2 != null) {
                    return obj2;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private static boolean m35287a(View view, String str, Object obj) {
        return m35288a(view, str, obj, true);
    }

    /* renamed from: a */
    private static boolean m35288a(View view, String str, Object obj, boolean z) {
        if (view == null) {
            return false;
        }
        Object tag = view.getTag();
        if (tag instanceof C12120a) {
            ((C12120a) tag).put(str, obj);
            return true;
        }
        view.setTag(new C12120a(str, obj));
        return true;
    }
}
