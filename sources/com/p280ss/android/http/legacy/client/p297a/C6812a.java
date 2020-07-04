package com.p280ss.android.http.legacy.client.p297a;

import com.p280ss.android.http.legacy.C6811c;
import java.net.URI;
import java.net.URISyntaxException;

/* renamed from: com.ss.android.http.legacy.client.a.a */
public final class C6812a {
    /* renamed from: a */
    public static URI m21175a(URI uri, C6811c cVar) throws URISyntaxException {
        return m21176a(uri, cVar, false);
    }

    /* renamed from: a */
    private static URI m21176a(URI uri, C6811c cVar, boolean z) throws URISyntaxException {
        if (uri == null) {
            throw new IllegalArgumentException("URI may nor be null");
        } else if (cVar != null) {
            return m21174a(cVar.f19414d, cVar.f19411a, cVar.f19413c, uri.getRawPath(), uri.getRawQuery(), uri.getRawFragment());
        } else {
            return m21174a(null, null, -1, uri.getRawPath(), uri.getRawQuery(), uri.getRawFragment());
        }
    }

    /* renamed from: a */
    private static URI m21174a(String str, String str2, int i, String str3, String str4, String str5) throws URISyntaxException {
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
