package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.C15183g;
import com.google.android.gms.common.p749d.C15176d;

/* renamed from: com.google.android.gms.common.util.u */
public final class C15338u {
    /* renamed from: a */
    public static boolean m44611a(Context context, int i) {
        if (!m44612a(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            return C15183g.m44180a(context).mo38479a(context.getPackageManager().getPackageInfo("com.google.android.gms", 64));
        } catch (NameNotFoundException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m44612a(Context context, int i, String str) {
        return C15176d.m44159a(context).mo38465a(i, str);
    }
}
