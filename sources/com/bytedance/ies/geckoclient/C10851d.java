package com.bytedance.ies.geckoclient;

import android.text.TextUtils;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/* renamed from: com.bytedance.ies.geckoclient.d */
public final class C10851d {
    /* renamed from: b */
    public static boolean m31823b(File file) {
        if (file.exists()) {
            return file.delete();
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m31822a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return m31821a(new File(str));
    }

    /* renamed from: b */
    public static boolean m31824b(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        return m31823b(new File(str));
    }

    /* renamed from: a */
    public static boolean m31821a(File file) {
        if (!file.exists()) {
            return true;
        }
        File[] listFiles = file.listFiles();
        if (listFiles == null) {
            return file.delete();
        }
        boolean z = true;
        for (int i = 0; i < listFiles.length; i++) {
            if (!listFiles[i].isDirectory() ? !z || !listFiles[i].delete() : !z || !m31821a(listFiles[i])) {
                z = false;
            } else {
                z = true;
            }
        }
        if (!z || !file.delete()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static String m31820a(String str, String str2) {
        if (!str.endsWith("/")) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("/");
            str = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(str2);
        sb2.append("/");
        return sb2.toString();
    }

    /* renamed from: c */
    private static boolean m31826c(String str, String str2) {
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            FileOutputStream fileOutputStream = new FileOutputStream(str2);
            byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return true;
                }
            }
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: d */
    private static boolean m31827d(String str, String str2) {
        File file = new File(str2);
        if (!file.exists()) {
            file.mkdir();
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str2);
        sb.append("/");
        sb.append(new File(str).getName());
        String sb2 = sb.toString();
        try {
            FileInputStream fileInputStream = new FileInputStream(str);
            FileOutputStream fileOutputStream = new FileOutputStream(sb2);
            byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read > 0) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    fileOutputStream.close();
                    return true;
                }
            }
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: b */
    public static boolean m31825b(String str, String str2) {
        File file = new File(str);
        if (!file.exists()) {
            return false;
        }
        if (file.isDirectory()) {
            File[] listFiles = file.listFiles();
            File file2 = new File(str2);
            if (!file2.exists()) {
                file2.mkdirs();
            }
            for (int i = 0; i < listFiles.length; i++) {
                if (listFiles[i].isDirectory()) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(listFiles[i].getPath());
                    sb.append("/");
                    String sb2 = sb.toString();
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(str2);
                    sb3.append(listFiles[i].getName());
                    sb3.append("/");
                    m31825b(sb2, sb3.toString());
                } else {
                    String path = listFiles[i].getPath();
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(str2);
                    sb4.append(listFiles[i].getName());
                    m31826c(path, sb4.toString());
                }
            }
            return true;
        }
        m31827d(str, str2);
        return true;
    }
}
