package com.p280ss.android.ugc.aweme.lancet;

import android.text.TextUtils;
import com.bytedance.common.utility.reflect.C6322b;

/* renamed from: com.ss.android.ugc.aweme.lancet.h */
public final class C7112h {

    /* renamed from: a */
    public static volatile String f19977a;

    /* renamed from: a */
    public static String m22207a() {
        if (TextUtils.isEmpty(f19977a)) {
            try {
                Object obj = C6322b.m19609a(Class.forName("android.app.ActivityThread")).mo15160b("currentActivityThread").mo15160b("getProcessName").f18556a;
                if (obj != null && (obj instanceof String)) {
                    String str = (String) obj;
                    f19977a = str;
                    return str;
                }
            } catch (Throwable unused) {
            }
        }
        return f19977a;
    }
}
