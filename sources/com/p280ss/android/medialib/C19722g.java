package com.p280ss.android.medialib;

import android.text.TextUtils;
import java.io.File;

/* renamed from: com.ss.android.medialib.g */
public final class C19722g {
    /* renamed from: a */
    public static boolean m65025a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }
}
