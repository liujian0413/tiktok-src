package com.bytedance.frameworks.baselib.network.http.util;

import com.bytedance.common.utility.C6319n;
import java.net.URI;
import java.net.URISyntaxException;

/* renamed from: com.bytedance.frameworks.baselib.network.http.util.i */
public final class C10189i {
    /* renamed from: a */
    public static URI m30260a(String str) throws RuntimeException {
        if (C6319n.m19593a(str)) {
            return null;
        }
        try {
            return new URI(str);
        } catch (URISyntaxException unused) {
            try {
                return URI.create(str.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused2) {
                return m30264b(str);
            }
        }
    }

    /* renamed from: b */
    public static URI m30264b(String str) throws RuntimeException {
        if (C6319n.m19593a(str)) {
            return null;
        }
        try {
            int indexOf = str.indexOf("?");
            if (indexOf > 0) {
                str = str.substring(0, indexOf);
            }
            return URI.create(str);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static URI m30262a(URI uri, C10182b bVar) throws URISyntaxException {
        return m30263a(uri, bVar, false);
    }

    /* renamed from: a */
    private static URI m30263a(URI uri, C10182b bVar, boolean z) throws URISyntaxException {
        if (uri == null) {
            throw new IllegalArgumentException("URI may nor be null");
        } else if (bVar != null) {
            return m30261a(bVar.f27718d, bVar.f27715a, bVar.f27717c, uri.getRawPath(), uri.getRawQuery(), uri.getRawFragment());
        } else {
            return m30261a(null, null, -1, uri.getRawPath(), uri.getRawQuery(), uri.getRawFragment());
        }
    }

    /* renamed from: a */
    public static URI m30261a(String str, String str2, int i, String str3, String str4, String str5) throws URISyntaxException {
        StringBuilder sb = new StringBuilder();
        if (str2 != null) {
            if (str != null) {
                sb.append(str);
                sb.append("://");
            }
            sb.append(str2);
            if (i > 0) {
                sb.append(':');
                sb.append(i);
            }
        }
        if (str3 == null || !str3.startsWith("/")) {
            sb.append('/');
        }
        if (str3 != null) {
            sb.append(str3);
        }
        if (str4 != null) {
            sb.append('?');
            sb.append(str4);
        }
        if (str5 != null) {
            sb.append('#');
            sb.append(str5);
        }
        return new URI(sb.toString());
    }
}
