package com.p280ss.ttvideoengine.p1816i;

import android.content.Context;
import android.media.AudioManager;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Base64;
import com.bytedance.ies.bullet.kit.web.WebKitApi;
import com.p280ss.ttvideoengine.Resolution;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URL;
import java.net.URLEncoder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.HashMap;
import java.util.regex.Pattern;

/* renamed from: com.ss.ttvideoengine.i.g */
public final class C46122g {

    /* renamed from: a */
    private static String f118016a;

    /* renamed from: c */
    public static Looper m144534c() {
        if (Looper.myLooper() != null) {
            return Looper.myLooper();
        }
        return Looper.getMainLooper();
    }

    /* renamed from: b */
    public static final HashMap<String, Resolution> m144532b() {
        HashMap<String, Resolution> hashMap = new HashMap<>();
        hashMap.put("medium", Resolution.Standard);
        hashMap.put("higher", Resolution.High);
        hashMap.put("highest", Resolution.SuperHigh);
        hashMap.put("original", Resolution.ExtremelyHigh);
        return hashMap;
    }

    /* renamed from: a */
    public static final HashMap<String, Resolution> m144528a() {
        HashMap<String, Resolution> hashMap = new HashMap<>();
        hashMap.put("240p", Resolution.L_Standard);
        hashMap.put("360p", Resolution.Standard);
        hashMap.put("480p", Resolution.High);
        hashMap.put("540p", Resolution.H_High);
        hashMap.put("720p", Resolution.SuperHigh);
        hashMap.put("1080p", Resolution.ExtremelyHigh);
        hashMap.put("4k", Resolution.FourK);
        hashMap.put("hdr", Resolution.HDR);
        return hashMap;
    }

    /* renamed from: i */
    private static boolean m144542i(String str) {
        return Pattern.matches("^([A-Za-z0-9+/]{4})*([A-Za-z0-9+/]{4}|[A-Za-z0-9+/]{3}=|[A-Za-z0-9+/]{2}==)$", str);
    }

    /* renamed from: b */
    public static byte[] m144533b(String str) {
        if (!TextUtils.isEmpty(str)) {
            try {
                return Base64.decode(str, 0);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    /* renamed from: h */
    public static final String m144541h(String str) {
        if (TextUtils.isEmpty(str)) {
            return str;
        }
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static float m144531b(Context context) {
        int i;
        if (context == null) {
            return 0.0f;
        }
        int i2 = 0;
        try {
            AudioManager audioManager = (AudioManager) context.getSystemService("audio");
            if (audioManager != null) {
                i = audioManager.getStreamVolume(3);
            } else {
                i = 0;
            }
            if (i >= 0) {
                i2 = i;
            }
        } catch (Exception unused) {
        }
        return (float) i2;
    }

    /* renamed from: c */
    public static final String m144535c(Context context) {
        if (f118016a != null) {
            return f118016a;
        }
        if (context == null) {
            return null;
        }
        try {
            f118016a = context.getApplicationContext().getFilesDir().getAbsolutePath();
            return f118016a;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: f */
    public static final String m144539f(String str) {
        if (TextUtils.isEmpty(str) || str.contains("http://127.0.0.1")) {
            return str;
        }
        return str.replaceAll("http:", "https:");
    }

    /* renamed from: a */
    public static String m144525a(String str) {
        if (TextUtils.isEmpty(str) || !m144542i(str)) {
            return str;
        }
        try {
            return new String(Base64.decode(str, 0), "utf-8");
        } catch (Throwable th) {
            C46123h.m144545a("TTHelper", th.toString());
            return "";
        }
    }

    /* renamed from: c */
    public static final String m144536c(String str) {
        if (str == null || str.length() == 0) {
            return str;
        }
        return str.replace("_", ClassUtils.INNER_CLASS_SEPARATOR).replace("/", "@").replace(ClassUtils.PACKAGE_SEPARATOR, "#");
    }

    /* renamed from: d */
    public static int m144537d(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }
        String[] split = str.split("\\.");
        if (split.length <= 0) {
            return 0;
        }
        int i = 0;
        for (int i2 = 0; i2 < split.length; i2++) {
            if (i2 == 0) {
                i = Integer.parseInt(split[i2]);
            } else {
                i = (i * 100) + Integer.parseInt(split[i2]);
            }
        }
        return i;
    }

    /* renamed from: e */
    public static final String m144538e(String str) {
        if (str == null) {
            return null;
        }
        boolean contains = str.contains(".boe-gateway.byted.org");
        boolean g = m144540g(str);
        if (str.startsWith(WebKitApi.SCHEME_HTTPS)) {
            str = str.replace(WebKitApi.SCHEME_HTTPS, WebKitApi.SCHEME_HTTP);
        }
        if (!g && str.indexOf(WebKitApi.SCHEME_HTTP) == 0 && !contains) {
            try {
                String host = new URL(str).getHost();
                StringBuilder sb = new StringBuilder();
                sb.append(host);
                sb.append(".boe-gateway.byted.org");
                str = str.replace(host, sb);
            } catch (Exception unused) {
            }
        }
        return str;
    }

    /* renamed from: g */
    public static final boolean m144540g(String str) {
        if (str == null || str.equals("")) {
            return false;
        }
        String str2 = "";
        try {
            str2 = new URL(str).getHost();
        } catch (Exception unused) {
        }
        if (Pattern.compile("([1-9]|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])(\\.(\\d|[1-9]\\d|1\\d{2}|2[0-4]\\d|25[0-5])){3}").matcher(str2).find()) {
            return true;
        }
        int indexOf = str.indexOf("[");
        int indexOf2 = str.indexOf("]");
        if (indexOf <= 0 || indexOf2 <= indexOf || str.substring(indexOf, indexOf2).indexOf(":") <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private static String m144543j(String str) {
        if (TextUtils.isEmpty(str)) {
            return "";
        }
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes());
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                String hexString = Integer.toHexString(b & 255);
                if (hexString.length() == 1) {
                    StringBuilder sb2 = new StringBuilder("0");
                    sb2.append(hexString);
                    hexString = sb2.toString();
                }
                sb.append(hexString);
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static final void m144529a(Context context) {
        if (context != null) {
            String c = m144535c(context);
            if (c != null) {
                File file = new File(c);
                if (file.exists() && file.isDirectory()) {
                    File[] listFiles = file.listFiles();
                    if (listFiles != null && listFiles.length != 0) {
                        for (File file2 : listFiles) {
                            if (file2.isFile() && file2.getName().matches("^[0-9]{1,15}\\.cach$")) {
                                file2.delete();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static final void m144530a(File file) {
        if (file != null) {
            if (file.isFile()) {
                file.delete();
                return;
            }
            if (file.isDirectory()) {
                File[] listFiles = file.listFiles();
                if (listFiles == null || listFiles.length == 0) {
                    file.delete();
                    return;
                }
                for (File a : listFiles) {
                    m144530a(a);
                }
                file.delete();
            }
        }
    }

    /* renamed from: a */
    public static String m144524a(Context context, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (context != null) {
            String c = m144535c(context);
            if (!TextUtils.isEmpty(c)) {
                str.replace(c, "");
            }
        }
        return m144543j(str);
    }

    /* renamed from: a */
    public static String m144526a(String str, long j) {
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            sb.append("T");
        }
        sb.append(Long.toString(j));
        sb.append("T");
        sb.append(Integer.toString((int) (Math.random() * 65535.0d)));
        return sb.toString();
    }

    /* renamed from: a */
    public static final String m144527a(String str, String str2) {
        String str3;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return str;
        }
        if (str.indexOf("?") == -1) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("?");
            sb.append(str2);
            str3 = sb.toString();
        } else {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append("&");
            sb2.append(str2);
            str3 = sb2.toString();
        }
        return str3;
    }
}
