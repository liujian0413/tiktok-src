package com.p280ss.android.ugc.aweme.beauty;

import android.content.SharedPreferences;
import com.p280ss.android.ugc.aweme.p340x.C7285c;
import com.p280ss.android.ugc.aweme.port.p1479in.C35574k;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.ss.android.ugc.aweme.beauty.d */
public final class C23533d {

    /* renamed from: a */
    public static final C23533d f62113a = new C23533d();

    /* renamed from: b */
    private static final SharedPreferences f62114b = C7285c.m22838a(C35574k.m114861b(), "beauty_params", 0);

    private C23533d() {
    }

    /* renamed from: c */
    private static String m77295c(int i, String str) {
        StringBuilder sb = new StringBuilder("beauty_params_default");
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: d */
    private static String m77296d(int i, String str) {
        StringBuilder sb = new StringBuilder("beauty_params_max");
        sb.append(i);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: a */
    public static final float m77291a(int i, String str) {
        float f;
        C7573i.m23587b(str, "gender");
        float f2 = f62114b.getFloat(m77295c(i, str), -1.0f);
        if (f2 != -1.0f) {
            return f2;
        }
        if (!C7573i.m23585a((Object) str, (Object) "0")) {
            f = f62114b.getFloat(m77295c(i, "0"), -1.0f);
        } else {
            f = f62114b.getFloat(m77295c(i, "2"), -1.0f);
        }
        return f;
    }

    /* renamed from: b */
    public static final float m77293b(int i, String str) {
        float f;
        C7573i.m23587b(str, "gender");
        float f2 = f62114b.getFloat(m77296d(i, str), -1.0f);
        if (f2 != -1.0f) {
            return f2;
        }
        if (!C7573i.m23585a((Object) str, (Object) "0")) {
            f = f62114b.getFloat(m77296d(i, "0"), -1.0f);
        } else {
            f = f62114b.getFloat(m77296d(i, "2"), -1.0f);
        }
        return f;
    }

    /* renamed from: a */
    public static final void m77292a(int i, String str, float f) {
        C7573i.m23587b(str, "gender");
        f62114b.edit().putFloat(m77295c(i, str), f).commit();
    }

    /* renamed from: b */
    public static final void m77294b(int i, String str, float f) {
        C7573i.m23587b(str, "gender");
        f62114b.edit().putFloat(m77296d(i, str), f).commit();
    }
}
