package com.p280ss.android.ugc.p1716b;

import android.text.TextUtils;
import com.bytedance.common.utility.C6306c;
import java.io.File;

/* renamed from: com.ss.android.ugc.b.a */
public final class C43650a {

    /* renamed from: a */
    static final char[] f112965a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: b */
    public static String m138300b(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(C6306c.m19561a(str));
        sb.append(".mp3");
        return sb.toString();
    }

    /* renamed from: c */
    private static void m138301c(String str) {
        try {
            File file = new File(str);
            if (file.getParentFile().exists()) {
                file.mkdir();
                return;
            }
            m138301c(file.getParent());
            file.mkdir();
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static boolean m138299a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return new File(str).exists();
    }

    /* renamed from: a */
    public static File m138298a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(str);
        if (!file.exists()) {
            m138301c(file.getPath());
        }
        return file;
    }
}
