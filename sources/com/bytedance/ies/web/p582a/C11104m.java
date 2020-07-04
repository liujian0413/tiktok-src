package com.bytedance.ies.web.p582a;

import android.net.Uri;
import android.os.Build.VERSION;

/* renamed from: com.bytedance.ies.web.a.m */
final class C11104m {
    /* renamed from: a */
    static String m32517a(String str) {
        if (VERSION.SDK_INT >= 27) {
            return Uri.parse(str).getHost();
        }
        int indexOf = str.indexOf(92);
        if (indexOf == -1) {
            return Uri.parse(str).getHost();
        }
        return Uri.parse(str.substring(0, indexOf)).getHost();
    }
}
