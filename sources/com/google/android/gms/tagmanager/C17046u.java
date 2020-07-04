package com.google.android.gms.tagmanager;

import android.os.Build.VERSION;
import java.io.File;

/* renamed from: com.google.android.gms.tagmanager.u */
final class C17046u {
    /* renamed from: a */
    private static int m56567a() {
        try {
            return Integer.parseInt(VERSION.SDK);
        } catch (NumberFormatException unused) {
            String str = "Invalid version number: ";
            String valueOf = String.valueOf(VERSION.SDK);
            if (valueOf.length() != 0) {
                str.concat(valueOf);
            } else {
                new String(str);
            }
            return 0;
        }
    }

    /* renamed from: a */
    static boolean m56568a(String str) {
        if (m56567a() < 9) {
            return false;
        }
        File file = new File(str);
        file.setReadable(false, false);
        file.setWritable(false, false);
        file.setReadable(true, true);
        file.setWritable(true, true);
        return true;
    }
}
