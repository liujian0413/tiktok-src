package com.p280ss.android.ugc.aweme.shortvideo;

import android.text.TextUtils;
import java.io.File;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bf */
public final class C38527bf {
    /* renamed from: a */
    public static boolean m123172a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* renamed from: a */
    public static File m123171a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            file.mkdirs();
        }
        return file;
    }
}
