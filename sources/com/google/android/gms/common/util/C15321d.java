package com.google.android.gms.common.util;

import android.content.Context;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.common.p749d.C15176d;

/* renamed from: com.google.android.gms.common.util.d */
public final class C15321d {
    /* renamed from: a */
    public static boolean m44561a(Context context, String str) {
        "com.google.android.gms".equals(str);
        try {
            if ((C15176d.m44159a(context).mo38462a(str, 0).flags & 2097152) != 0) {
                return true;
            }
            return false;
        } catch (NameNotFoundException unused) {
            return false;
        }
    }
}
