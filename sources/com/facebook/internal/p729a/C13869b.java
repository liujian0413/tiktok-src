package com.facebook.internal.p729a;

import com.C1642a;
import com.facebook.AccessToken;
import com.facebook.C13499h;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest.C13090b;
import com.facebook.internal.C13967z;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.InputStream;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.a.b */
public final class C13869b {
    /* renamed from: b */
    public static File m40961b() {
        File file = new File(C13499h.m39721g().getCacheDir(), "instrument");
        if (file.exists() || file.mkdirs()) {
            return file;
        }
        return null;
    }

    /* renamed from: a */
    public static File[] m40960a() {
        File b = m40961b();
        if (b == null) {
            return new File[0];
        }
        File[] listFiles = b.listFiles(new FilenameFilter() {
            public final boolean accept(File file, String str) {
                return str.matches(C1642a.m8034a("^%s[0-9]+.json$", new Object[]{"crash_log_"}));
            }
        });
        if (listFiles != null) {
            return listFiles;
        }
        return new File[0];
    }

    /* renamed from: a */
    public static String m40955a(Throwable th) {
        if (th == null) {
            return null;
        }
        if (th.getCause() == null) {
            return th.toString();
        }
        return th.getCause().toString();
    }

    /* renamed from: b */
    public static String m40962b(Throwable th) {
        Throwable th2 = null;
        if (th == null) {
            return null;
        }
        JSONArray jSONArray = new JSONArray();
        while (true) {
            Throwable th3 = th2;
            th2 = th;
            Throwable th4 = th3;
            if (th2 != null && th2 != th4) {
                for (StackTraceElement stackTraceElement : th2.getStackTrace()) {
                    jSONArray.put(stackTraceElement.toString());
                }
                th = th2.getCause();
            }
        }
        return jSONArray.toString();
    }

    /* renamed from: c */
    public static boolean m40963c(Throwable th) {
        if (th == null) {
            return false;
        }
        Throwable th2 = null;
        while (true) {
            Throwable th3 = th2;
            th2 = th;
            Throwable th4 = th3;
            if (th2 == null || th2 == th4) {
                return false;
            }
            for (StackTraceElement className : th2.getStackTrace()) {
                if (className.getClassName().startsWith("com.facebook")) {
                    return true;
                }
            }
            th = th2.getCause();
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m40959a(String str) {
        File b = m40961b();
        if (b == null || str == null) {
            return false;
        }
        return new File(b, str).delete();
    }

    /* renamed from: a */
    public static JSONObject m40956a(String str, boolean z) {
        File b = m40961b();
        if (b == null || str == null) {
            return null;
        }
        try {
            return new JSONObject(C13967z.m41221a((InputStream) new FileInputStream(new File(b, str))));
        } catch (Exception unused) {
            m40959a(str);
            return null;
        }
    }

    /* renamed from: a */
    public static void m40957a(String str, String str2) {
        File b = m40961b();
        if (b != null && str != null && str2 != null) {
            try {
                FileOutputStream fileOutputStream = new FileOutputStream(new File(b, str));
                fileOutputStream.write(str2.getBytes());
                fileOutputStream.close();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: a */
    public static void m40958a(String str, JSONArray jSONArray, C13090b bVar) {
        if (jSONArray.length() != 0) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put(str, jSONArray.toString());
                GraphRequest.m38253a((AccessToken) null, C1642a.m8034a("%s/instruments", new Object[]{C13499h.m39725k()}), jSONObject, bVar).mo31790b();
            } catch (JSONException unused) {
            }
        }
    }
}
