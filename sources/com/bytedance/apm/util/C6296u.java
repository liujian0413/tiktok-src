package com.bytedance.apm.util;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.apm.util.u */
public final class C6296u {
    /* renamed from: a */
    public static String m19534a(String str) {
        if (str == null) {
            return null;
        }
        try {
            URL url = new URL(str);
            StringBuffer stringBuffer = new StringBuffer();
            stringBuffer.append(url.getProtocol());
            stringBuffer.append("://");
            stringBuffer.append(url.getHost());
            if (url.getPort() != -1) {
                stringBuffer.append(":");
                stringBuffer.append(url.getPort());
            }
            stringBuffer.append(url.getPath());
            return stringBuffer.toString();
        } catch (MalformedURLException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static String m19535a(String str, String str2) {
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    public static String m19536a(String str, Map<String, String> map) {
        String str2;
        if (TextUtils.isDigitsOnly(str) || map == null || map.isEmpty()) {
            return str;
        }
        if (str.indexOf("?") < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("?");
            str = sb.toString();
        }
        if (str.endsWith("?")) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(m19535a("sdk_version", "UTF-8"));
            sb2.append("=");
            sb2.append(m19535a("400", "UTF-8"));
            str2 = sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(str);
            sb3.append("&");
            sb3.append(m19535a("sdk_version", "UTF-8"));
            sb3.append("=");
            sb3.append(m19535a("400", "UTF-8"));
            str2 = sb3.toString();
        }
        if (map != null && map.size() > 0) {
            for (Entry entry : map.entrySet()) {
                if (map.get(entry.getKey()) != null) {
                    if (str2.endsWith("?")) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(str2);
                        sb4.append(m19535a(entry.getKey().toString(), "UTF-8"));
                        sb4.append("=");
                        sb4.append(m19535a(((String) map.get(entry.getKey())).toString(), "UTF-8"));
                        str2 = sb4.toString();
                    } else {
                        StringBuilder sb5 = new StringBuilder();
                        sb5.append(str2);
                        sb5.append("&");
                        sb5.append(m19535a(entry.getKey().toString(), "UTF-8"));
                        sb5.append("=");
                        sb5.append(m19535a(((String) map.get(entry.getKey())).toString(), "UTF-8"));
                        str2 = sb5.toString();
                    }
                }
            }
        }
        return str2;
    }
}
