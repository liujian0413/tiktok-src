package com.google.android.gms.common.util;

import android.content.Context;
import android.content.SharedPreferences.Editor;
import java.io.File;

/* renamed from: com.google.android.gms.common.util.s */
public final class C15336s {
    /* renamed from: a */
    public static void m44609a(Context context, Editor editor, String str) {
        File file = new File(context.getApplicationInfo().dataDir, "shared_prefs");
        File parentFile = file.getParentFile();
        if (parentFile != null) {
            parentFile.setExecutable(true, false);
        }
        file.setExecutable(true, false);
        editor.commit();
        new File(file, String.valueOf(str).concat(".xml")).setReadable(true, false);
    }
}
