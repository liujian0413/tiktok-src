package com.p280ss.android.pushmanager.app;

import android.content.Context;
import android.util.Base64;
import java.io.File;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.pushmanager.app.g */
public final class C20051g {
    /* renamed from: a */
    public static void m66037a(Context context) throws IOException {
        if (context != null) {
            m66038a(context, new String[]{"lockFile", "lockFile1", "lockFile2"});
            m66038a(context, new String[]{"observerFile", "observerFile1", "observerFile2"});
        }
    }

    /* renamed from: b */
    public static String m66039b(Context context) {
        if (context == null) {
            return null;
        }
        File filesDir = context.getFilesDir();
        if (filesDir == null || !filesDir.exists()) {
            return null;
        }
        File parentFile = filesDir.getParentFile();
        if (parentFile == null || !parentFile.exists()) {
            return null;
        }
        return parentFile.getAbsolutePath();
    }

    /* renamed from: a */
    public static JSONObject m66036a(byte[] bArr, boolean z) throws DataFormatException, IOException {
        String str;
        byte[] bArr2 = new byte[65536];
        char c = (char) bArr[0];
        if (c == 'a') {
            str = new String(bArr, 1, bArr.length - 1);
        } else if (c == 'c') {
            Inflater inflater = new Inflater();
            if (z) {
                inflater.setInput(Base64.decode(bArr, 1, bArr.length - 1, 0));
            } else {
                inflater.setInput(bArr, 1, bArr.length - 1);
            }
            synchronized (bArr2) {
                int inflate = inflater.inflate(bArr2);
                inflater.end();
                if (inflate <= 0 || inflate >= 65536) {
                    str = null;
                } else {
                    str = new String(bArr2, 0, inflate, "UTF-8");
                }
            }
        } else {
            str = null;
        }
        if (str != null) {
            try {
                return new JSONObject(str);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m66038a(Context context, String[] strArr) {
        if (context != null) {
            try {
                String b = m66039b(context);
                if (b != null) {
                    for (String str : strArr) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(b);
                        sb.append("/files/");
                        sb.append(str);
                        File file = new File(sb.toString());
                        if (file.exists()) {
                            file.delete();
                        }
                    }
                }
            } catch (Exception unused) {
            }
        }
    }
}
