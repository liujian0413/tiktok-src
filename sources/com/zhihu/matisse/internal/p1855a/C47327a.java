package com.zhihu.matisse.internal.p1855a;

import android.media.ExifInterface;
import java.io.IOException;

/* renamed from: com.zhihu.matisse.internal.a.a */
final class C47327a {

    /* renamed from: a */
    private static final String f121422a = "a";

    private C47327a() {
    }

    /* renamed from: a */
    public static ExifInterface m147768a(String str) throws IOException {
        if (str != null) {
            return new ExifInterface(str);
        }
        throw new NullPointerException("filename should not be null");
    }
}
