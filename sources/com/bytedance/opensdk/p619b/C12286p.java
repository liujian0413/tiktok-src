package com.bytedance.opensdk.p619b;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.jvm.internal.C7573i;

/* renamed from: com.bytedance.opensdk.b.p */
public final class C12286p {

    /* renamed from: a */
    public static final C12286p f32626a = new C12286p();

    /* renamed from: b */
    private static final String f32627b = f32627b;

    /* renamed from: c */
    private static final String f32628c = f32628c;

    /* renamed from: d */
    private static final String f32629d = f32629d;

    /* renamed from: e */
    private static final String f32630e = f32630e;

    /* renamed from: f */
    private static final String f32631f = f32631f;

    /* renamed from: g */
    private static final String f32632g = f32632g;

    /* renamed from: h */
    private static final int f32633h = 13;

    /* renamed from: i */
    private static final int f32634i = 10;

    /* renamed from: j */
    private static final int f32635j = 32;

    /* renamed from: k */
    private static final int f32636k = 9;

    private C12286p() {
    }

    /* renamed from: a */
    public static String m35721a() {
        return f32627b;
    }

    /* renamed from: a */
    private static String m35722a(String str, String str2) {
        if (str2 == null) {
            try {
                str2 = f32629d;
            } catch (UnsupportedEncodingException e) {
                throw new IllegalArgumentException(e);
            }
        }
        String encode = URLEncoder.encode(str, str2);
        C7573i.m23582a((Object) encode, "URLEncoder.encode(\n     …ENT_CHARSET\n            )");
        return encode;
    }

    /* renamed from: a */
    public final String mo30091a(Map<String, ? extends List<String>> map, String str) {
        boolean z;
        C7573i.m23587b(map, "paramMap");
        C7573i.m23587b(str, "encoding");
        StringBuilder sb = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            List<String> list = (List) entry.getValue();
            String a = m35722a(str2, str);
            if (!list.isEmpty()) {
                for (String a2 : list) {
                    String a3 = m35722a(a2, str);
                    if (sb.length() > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        sb.append(f32631f);
                    }
                    sb.append(a);
                    sb.append(f32632g);
                    sb.append(a3);
                }
            }
        }
        String sb2 = sb.toString();
        C7573i.m23582a((Object) sb2, "result.toString()");
        return sb2;
    }
}
