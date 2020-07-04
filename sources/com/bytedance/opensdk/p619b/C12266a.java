package com.bytedance.opensdk.p619b;

import android.content.Context;
import android.text.TextUtils;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.opensdk.b.a */
public final class C12266a {

    /* renamed from: a */
    public static final C12266a f32612a = new C12266a();

    private C12266a() {
    }

    /* renamed from: a */
    public static String m35662a(Context context) {
        C7573i.m23587b(context, "context");
        String packageName = context.getPackageName();
        C7573i.m23582a((Object) packageName, "context.packageName");
        return packageName;
    }

    /* renamed from: a */
    public static boolean m35663a(Context context, String str) {
        C7573i.m23587b(str, "platformPackageName");
        boolean z = false;
        if (context != null) {
            CharSequence charSequence = str;
            if (!TextUtils.isEmpty(charSequence)) {
                if (!TextUtils.isEmpty(charSequence)) {
                    try {
                        if (context.getPackageManager().getPackageInfo(str, 1) != null) {
                            z = true;
                        }
                    } catch (Exception unused) {
                    }
                }
                return z;
            }
        }
        return false;
    }
}
