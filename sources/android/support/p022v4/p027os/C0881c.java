package android.support.p022v4.p027os;

import android.os.Build.VERSION;
import android.os.Environment;
import java.io.File;
import java.io.IOException;

/* renamed from: android.support.v4.os.c */
public final class C0881c {
    /* renamed from: a */
    public static String m3748a(File file) {
        if (VERSION.SDK_INT >= 19) {
            return Environment.getStorageState(file);
        }
        try {
            if (file.getCanonicalPath().startsWith(Environment.getExternalStorageDirectory().getCanonicalPath())) {
                return Environment.getExternalStorageState();
            }
        } catch (IOException unused) {
        }
        return "unknown";
    }
}
