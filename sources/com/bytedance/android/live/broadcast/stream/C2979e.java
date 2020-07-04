package com.bytedance.android.live.broadcast.stream;

import android.text.TextUtils;
import java.io.File;

/* renamed from: com.bytedance.android.live.broadcast.stream.e */
public final class C2979e {
    /* renamed from: a */
    public static boolean m11576a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }
}
