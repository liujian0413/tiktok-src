package com.bytedance.lighten.core;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;

/* renamed from: com.bytedance.lighten.core.p */
public final class C12137p {
    /* renamed from: a */
    public static boolean m35322a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C12133n.m35304b().mo29799b(Uri.parse(str));
    }

    /* renamed from: b */
    public static String m35323b(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        File a = C12133n.m35304b().mo29798a(Uri.parse(str));
        if (a == null) {
            return "";
        }
        return a.getAbsolutePath();
    }
}
