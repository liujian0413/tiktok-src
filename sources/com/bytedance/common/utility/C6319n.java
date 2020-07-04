package com.bytedance.common.utility;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.text.DecimalFormat;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import org.json.JSONObject;

/* renamed from: com.bytedance.common.utility.n */
public final class C6319n {
    /* renamed from: a */
    public static boolean m19593a(String str) {
        if (str == null || str.length() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public static String m19596c(String str) {
        if (!m19593a(str)) {
            try {
                return URLEncoder.encode(str, "UTF-8");
            } catch (UnsupportedEncodingException unused) {
            }
        }
        return str;
    }

    /* renamed from: b */
    public static String m19595b(String str) {
        if (m19593a(str)) {
            return str;
        }
        try {
            String replace = str.replace("[ss_random]", String.valueOf(new Random().nextLong()));
            try {
                return replace.replace("[ss_timestamp]", String.valueOf(System.currentTimeMillis()));
            } catch (Exception unused) {
                return replace;
            }
        } catch (Exception unused2) {
            return str;
        }
    }

    /* renamed from: d */
    public static String m19597d(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            byte[] bytes = str.getBytes("UTF-8");
            for (int i = 0; i < bytes.length; i++) {
                bytes[i] = (byte) (bytes[i] ^ 5);
            }
            return C6306c.m19563a(bytes, 0, bytes.length);
        } catch (Exception unused) {
            return str;
        }
    }

    /* renamed from: a */
    public static String m19589a(long j) {
        long[] jArr = {1099511627776L, 1073741824, 1048576, 1024, 1};
        int i = 0;
        String[] strArr = {"TB", "GB", "MB", "KB", "B"};
        if (j < 1) {
            StringBuilder sb = new StringBuilder("0 ");
            sb.append(strArr[4]);
            return sb.toString();
        }
        String str = null;
        while (true) {
            if (i >= 5) {
                break;
            }
            long j2 = jArr[i];
            if (j >= j2) {
                str = m19590a(j, j2, strArr[i]);
                break;
            }
            i++;
        }
        return str;
    }

    /* renamed from: a */
    public static String m19591a(Map<String, String> map) {
        if (map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str : map.keySet()) {
                String str2 = (String) map.get(str);
                if (!m19593a(str) && !m19593a(str2)) {
                    jSONObject.put(str, str2);
                }
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static boolean m19594a(String str, String str2) {
        if ((!m19593a(str) || !m19593a(str2)) && (str == null || !str.equals(str2))) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static Map<String, String> m19592a(String str, Map<String, String> map) {
        if (m19593a(str) || map == null) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator keys = jSONObject.keys();
            while (keys.hasNext()) {
                String str2 = (String) keys.next();
                String string = jSONObject.getString(str2);
                if (!m19593a(str2) && !m19593a(string)) {
                    map.put(str2, string);
                }
            }
        } catch (Exception unused) {
        }
        return map;
    }

    /* renamed from: a */
    private static String m19590a(long j, long j2, String str) {
        double d;
        if (j2 > 1) {
            double d2 = (double) j;
            double d3 = (double) j2;
            Double.isNaN(d2);
            Double.isNaN(d3);
            d = d2 / d3;
        } else {
            d = (double) j;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(new DecimalFormat("#.##").format(d));
        sb.append(" ");
        sb.append(str);
        return sb.toString();
    }
}
