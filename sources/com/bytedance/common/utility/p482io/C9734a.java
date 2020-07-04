package com.bytedance.common.utility.p482io;

import android.text.TextUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;

/* renamed from: com.bytedance.common.utility.io.a */
public final class C9734a {
    /* renamed from: a */
    public static void m28682a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: b */
    public static boolean m28684b(String str) {
        return new File(str).mkdirs();
    }

    /* renamed from: a */
    public static void m28683a(String str) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (file.exists() && file.isFile()) {
                file.delete();
            }
        }
    }
}
