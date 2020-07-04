package com.bytedance.ies.net.p574b;

import android.text.TextUtils;
import com.bytedance.common.utility.C6311g;
import java.io.IOException;
import java.net.CookieHandler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Pattern;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.HttpUrl;

/* renamed from: com.bytedance.ies.net.b.b */
public final class C10922b implements CookieJar {

    /* renamed from: a */
    private CookieHandler f29579a;

    /* renamed from: b */
    private Pattern f29580b = Pattern.compile("(?<=Domain=)([^;]*)", 2);

    public C10922b(CookieHandler cookieHandler) {
        this.f29579a = cookieHandler;
    }

    public final List<Cookie> loadForRequest(HttpUrl httpUrl) {
        if (httpUrl == null) {
            return Collections.emptyList();
        }
        try {
            Map map = this.f29579a.get(httpUrl.uri(), Collections.emptyMap());
            if (map == null || map.isEmpty()) {
                return Collections.emptyList();
            }
            ArrayList arrayList = null;
            for (Entry entry : map.entrySet()) {
                String str = (String) entry.getKey();
                if (("Cookie".equalsIgnoreCase(str) || "Cookie2".equalsIgnoreCase(str)) && entry.getValue() != null && !((List) entry.getValue()).isEmpty()) {
                    for (String str2 : (List) entry.getValue()) {
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        arrayList.addAll(m32029a(httpUrl, str2));
                    }
                }
            }
            if (arrayList != null) {
                return Collections.unmodifiableList(arrayList);
            }
            return Collections.emptyList();
        } catch (IOException unused) {
            return Collections.emptyList();
        }
    }

    /* renamed from: a */
    private static List<Cookie> m32029a(HttpUrl httpUrl, String str) {
        if (TextUtils.isEmpty(str)) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        String[] split = str.split(";");
        for (String parse : split) {
            Cookie parse2 = Cookie.parse(httpUrl, parse);
            if (parse2 != null) {
                arrayList.add(parse2);
            }
        }
        return arrayList;
    }

    public final void saveFromResponse(HttpUrl httpUrl, List<Cookie> list) {
        if (httpUrl != null && !C6311g.m19573a(list)) {
            ArrayList arrayList = new ArrayList();
            for (Cookie cookie : list) {
                arrayList.add(cookie.toString());
            }
            try {
                this.f29579a.put(httpUrl.uri(), Collections.singletonMap("Set-Cookie", arrayList));
            } catch (IOException unused) {
            }
        }
    }
}
