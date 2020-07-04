package com.bytedance.android.live.core.utils.p158a;

import android.view.View;
import java.util.HashMap;

/* renamed from: com.bytedance.android.live.core.utils.a.i */
public final class C3353i {

    /* renamed from: com.bytedance.android.live.core.utils.a.i$a */
    static class C3355a extends HashMap<String, Object> {
        private C3355a(String str, Object obj) {
            put(str, obj);
        }
    }

    /* renamed from: a */
    public static Object m12501a(View view) {
        return m12502a(view, "DraweeHolder");
    }

    /* renamed from: a */
    public static Object m12502a(View view, String str) {
        return m12506b(view, str, null);
    }

    /* renamed from: a */
    public static void m12503a(View view, Object obj) {
        m12504a(view, "DraweeHolder", obj);
    }

    /* renamed from: b */
    private static Object m12506b(View view, String str, Object obj) {
        if (view != null) {
            Object tag = view.getTag();
            if (tag instanceof C3355a) {
                Object obj2 = ((C3355a) tag).get(str);
                if (obj2 != null) {
                    return obj2;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m12504a(View view, String str, Object obj) {
        return m12505a(view, str, obj, true);
    }

    /* renamed from: a */
    private static boolean m12505a(View view, String str, Object obj, boolean z) {
        if (view == null) {
            return false;
        }
        Object tag = view.getTag();
        if (tag instanceof C3355a) {
            ((C3355a) tag).put(str, obj);
            return true;
        }
        view.setTag(new C3355a(str, obj));
        return true;
    }
}
