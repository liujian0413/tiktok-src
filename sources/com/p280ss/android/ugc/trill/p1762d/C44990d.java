package com.p280ss.android.ugc.trill.p1762d;

import android.content.ContentResolver;
import android.provider.Settings.System;
import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.lancet.p327a.C32273a;

/* renamed from: com.ss.android.ugc.trill.d.d */
final class C44990d {
    /* renamed from: a */
    static String m141960a(ContentResolver contentResolver, String str) {
        if (!TextUtils.equals(str, "android_id")) {
            return System.getString(contentResolver, str);
        }
        if (TextUtils.isEmpty(C32273a.f84338a)) {
            C32273a.f84338a = System.getString(contentResolver, str);
        }
        return C32273a.f84338a;
    }
}
