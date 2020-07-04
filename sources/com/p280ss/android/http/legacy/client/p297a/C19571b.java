package com.p280ss.android.http.legacy.client.p297a;

import com.p280ss.android.http.legacy.C19572d;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/* renamed from: com.ss.android.http.legacy.client.a.b */
public final class C19571b {
    /* renamed from: a */
    private static String m64476a(String str, String str2) {
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
    public static String m64477a(List<? extends C19572d> list, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (C19572d dVar : list) {
            String a = m64476a(dVar.mo51722a(), str);
            String b = dVar.mo51723b();
            if (b != null) {
                str2 = m64476a(b, str);
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
