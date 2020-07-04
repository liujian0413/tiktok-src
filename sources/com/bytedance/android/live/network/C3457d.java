package com.bytedance.android.live.network;

import android.util.Pair;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;

/* renamed from: com.bytedance.android.live.network.d */
public abstract /* synthetic */ class C3457d {
    /* renamed from: a */
    public static String m12797a(List<Pair<String, String>> list, String str) {
        StringBuilder sb = new StringBuilder();
        for (Pair pair : list) {
            String a = m12796a((String) pair.first, str);
            String str2 = (String) pair.second;
            String a2 = str2 != null ? m12796a(str2, str) : "";
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(a);
            sb.append("=");
            sb.append(a2);
        }
        return sb.toString();
    }

    /* renamed from: a */
    private static String m12796a(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
