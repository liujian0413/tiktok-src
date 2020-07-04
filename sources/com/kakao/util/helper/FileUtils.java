package com.kakao.util.helper;

import android.os.Environment;
import android.text.TextUtils;
import com.C1642a;
import com.kakao.util.helper.log.Logger;
import java.io.File;
import java.util.Locale;

public class FileUtils {
    public static File getExternalStorageDirectory() {
        return Environment.getExternalStorageDirectory();
    }

    public static File getExternalStorageTempFile() {
        return getExternalStorageTempFile(null);
    }

    public static File getExternalStorageCacheDir() {
        File file = new File(C1642a.m8035a(Locale.US, "%s/%s", new Object[]{getExternalStorageDataDir(), "cache"}));
        if (!file.exists() && !file.mkdirs()) {
            StringBuilder sb = new StringBuilder("failed to create dir: ");
            sb.append(file.getPath());
            Logger.m60933e(sb.toString());
        }
        return file;
    }

    public static File getExternalStorageDataDir() {
        File file = new File(C1642a.m8035a(Locale.US, "%s/Android/data/%s", new Object[]{getExternalStorageDirectory(), "com.kakao.sdk"}));
        if (!file.exists() && !file.mkdirs()) {
            StringBuilder sb = new StringBuilder("failed to create dir: ");
            sb.append(file.getPath());
            Logger.m60933e(sb.toString());
        }
        return null;
    }

    public static File getExternalStorageTempDir() {
        File file = new File(getExternalStorageDataDir(), "tmp");
        if (!file.exists() && !file.mkdirs()) {
            StringBuilder sb = new StringBuilder("failed to create dir: ");
            sb.append(file.getPath());
            Logger.m60933e(sb.toString());
        }
        return file;
    }

    public static File getExternalStorageTempFile(String str) {
        String str2;
        if (TextUtils.isEmpty(str)) {
            str2 = "tmp";
        } else {
            str2 = toFileName(str, "_");
        }
        return new File(getExternalStorageTempDir(), C1642a.m8035a(Locale.US, "temp_%s.%s", new Object[]{Long.valueOf(System.currentTimeMillis()), str2}));
    }

    public static String toFileName(String str, String str2) {
        return str.replaceAll("[\"*/:<>?\\\\|]", str2);
    }
}
