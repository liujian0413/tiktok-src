package com.bytedance.sdk.account.utils;

import android.text.TextUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.sdk.account.utils.f */
public final class C12913f {

    /* renamed from: a */
    public final Map<String, String> f34119a;

    /* renamed from: b */
    public String f34120b;

    public final String toString() {
        return m37587a();
    }

    public C12913f() {
        this.f34119a = new HashMap();
        this.f34120b = null;
    }

    /* renamed from: a */
    private String m37587a() {
        if (this.f34119a.isEmpty()) {
            return this.f34120b;
        }
        String a = m37588a(this.f34119a, "UTF-8");
        if (this.f34120b == null || this.f34120b.length() == 0) {
            return a;
        }
        if (this.f34120b.indexOf(63) >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f34120b);
            sb.append("&");
            sb.append(a);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f34120b);
        sb2.append("?");
        sb2.append(a);
        return sb2.toString();
    }

    public C12913f(String str) {
        this.f34119a = new HashMap();
        this.f34120b = str;
    }

    /* renamed from: a */
    public final void mo31394a(String str, int i) {
        this.f34119a.put(str, "380");
    }

    /* renamed from: a */
    public final void mo31395a(String str, String str2) {
        this.f34119a.put(str, str2);
    }

    /* renamed from: b */
    private static String m37589b(String str, String str2) {
        if (str2 == null) {
            str2 = "ISO-8859-1";
        }
        try {
            return URLEncoder.encode(str, str2);
        } catch (UnsupportedEncodingException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /* renamed from: a */
    private static String m37588a(Map<String, String> map, String str) {
        String str2;
        StringBuilder sb = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            String b = m37589b((String) entry.getKey(), str);
            String str3 = (String) entry.getValue();
            if (str3 != null) {
                str2 = m37589b(str3, str);
            } else {
                str2 = "";
            }
            if (!TextUtils.isEmpty(str2)) {
                str2 = str2.replace("+", "%20");
            }
            if (sb.length() > 0) {
                sb.append("&");
            }
            sb.append(b);
            sb.append("=");
            sb.append(str2);
        }
        return sb.toString();
    }
}
