package com.p280ss.android.ugc.iesdownload;

import android.text.TextUtils;
import java.io.File;

/* renamed from: com.ss.android.ugc.iesdownload.a */
public final class C44841a {

    /* renamed from: a */
    public static String f115331a = ".iesdownload";

    /* renamed from: a */
    public static String m141511a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(f115331a);
        return sb.toString();
    }

    /* renamed from: a */
    public static boolean m141512a(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        File file = new File(str);
        File file2 = new File(str2);
        if (!file.exists() || !file.renameTo(file2)) {
            return false;
        }
        return true;
    }
}
