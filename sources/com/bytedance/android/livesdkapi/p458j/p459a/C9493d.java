package com.bytedance.android.livesdkapi.p458j.p459a;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/* renamed from: com.bytedance.android.livesdkapi.j.a.d */
public final class C9493d {
    /* renamed from: a */
    private static String m28025a(String str, String str2) {
        if (str2 == null) {
            try {
                return URLEncoder.encode(str, "ISO-8859-1");
            } catch (UnsupportedEncodingException e) {
                throw new IllegalArgumentException(e);
            }
        } else if (str2.equals("null_encoding")) {
            return str;
        } else {
            return URLEncoder.encode(str, str2);
        }
    }

    /* renamed from: a */
    public static String m28026a(List<? extends C9492c> list, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (C9492c cVar : list) {
            String a = m28025a(cVar.mo23514a(), str);
            String b = cVar.mo23515b();
            if (b != null) {
                str2 = m28025a(b, str);
            } else {
                str2 = "";
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(a);
            sb.append("=");
            sb.append(str2);
        }
        return sb.toString();
    }
}
