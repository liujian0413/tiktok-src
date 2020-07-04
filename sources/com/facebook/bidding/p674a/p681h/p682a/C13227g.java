package com.facebook.bidding.p674a.p681h.p682a;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.Map;

/* renamed from: com.facebook.bidding.a.h.a.g */
public abstract class C13227g {

    /* renamed from: a */
    public String f35048a = "";

    /* renamed from: b */
    public C13223c f35049b;

    /* renamed from: c */
    public String f35050c;

    /* renamed from: d */
    public byte[] f35051d;

    public C13227g(String str, Map<String, String> map) {
        if (str != null) {
            this.f35048a = str;
        }
        if (map != null) {
            String a = m38655a(map);
            StringBuilder sb = new StringBuilder();
            sb.append(this.f35048a);
            sb.append("?");
            sb.append(a);
            this.f35048a = sb.toString();
        }
    }

    /* renamed from: a */
    private static String m38655a(Map<String, String> map) {
        StringBuilder sb = new StringBuilder();
        for (String str : map.keySet()) {
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(str);
            String str2 = (String) map.get(str);
            if (str2 != null) {
                sb.append("=");
                try {
                    sb.append(URLEncoder.encode(str2, "UTF-8"));
                } catch (UnsupportedEncodingException unused) {
                }
            }
        }
        return sb.toString();
    }
}
