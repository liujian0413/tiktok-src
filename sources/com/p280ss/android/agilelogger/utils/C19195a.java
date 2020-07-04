package com.p280ss.android.agilelogger.utils;

import android.content.Context;
import java.io.File;

/* renamed from: com.ss.android.agilelogger.utils.a */
public final class C19195a {
    /* renamed from: a */
    public static File m62910a(Context context) {
        File externalFilesDir = context.getExternalFilesDir("logs");
        if (externalFilesDir == null) {
            externalFilesDir = new File(context.getFilesDir(), "logs");
        }
        if (!externalFilesDir.exists()) {
            externalFilesDir.mkdir();
        }
        return externalFilesDir;
    }

    /* renamed from: b */
    public static String m62911b(Context context) {
        StringBuilder sb = new StringBuilder(".logCache_");
        sb.append(C19203g.m62935a(context));
        return sb.toString();
    }

    /* renamed from: c */
    public static String m62912c(Context context) {
        File filesDir = context.getFilesDir();
        if (filesDir == null) {
            return null;
        }
        File file = new File(filesDir.getAbsolutePath(), "ALOG");
        if (!file.exists()) {
            file.mkdir();
        }
        return file.getAbsolutePath();
    }
}
