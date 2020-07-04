package com.p280ss.android.ugc.aweme.net;

import android.net.Uri;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.ss.android.ugc.aweme.net.k */
public final class C34090k {
    /* renamed from: a */
    public static String m109753a(String str) {
        if (VERSION.SDK_INT >= 27) {
            return Uri.parse(str).getHost();
        }
        int indexOf = str.indexOf(92);
        if (indexOf == -1) {
            return Uri.parse(str).getHost();
        }
        return Uri.parse(str.substring(0, indexOf)).getHost();
    }

    /* renamed from: a */
    public static boolean m109754a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (!TextUtils.equals(str, str2)) {
            StringBuilder sb = new StringBuilder(ClassUtils.PACKAGE_SEPARATOR);
            sb.append(str2);
            if (!str.endsWith(sb.toString())) {
                return false;
            }
        }
        return true;
    }
}
