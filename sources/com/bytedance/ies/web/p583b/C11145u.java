package com.bytedance.ies.web.p583b;

import android.net.Uri;
import android.net.Uri.Builder;
import java.net.URLDecoder;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.SortedMap;
import java.util.TreeMap;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.text.C7634n;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.b.u */
public final class C11145u {
    /* renamed from: a */
    public static final Uri m32623a(Uri uri) {
        C7573i.m23587b(uri, "$this$toBasicUri");
        Uri build = new Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build();
        C7573i.m23582a((Object) build, "Uri.Builder()\n        .s…is.path)\n        .build()");
        return build;
    }

    /* renamed from: a */
    public static final SortedMap<String, String> m32625a(JSONObject jSONObject) {
        TreeMap treeMap = new TreeMap();
        if (jSONObject == null) {
            return treeMap;
        }
        Iterator keys = jSONObject.keys();
        C7573i.m23582a((Object) keys, "keys()");
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Map map = treeMap;
            C7573i.m23582a((Object) str, "key");
            String string = jSONObject.getString(str);
            C7573i.m23582a((Object) string, "getString(key)");
            map.put(str, string);
        }
        return treeMap;
    }

    /* renamed from: b */
    public static final SortedMap<String, String> m32627b(Uri uri) {
        boolean z;
        C7573i.m23587b(uri, "$this$getQueryMap");
        TreeMap treeMap = new TreeMap();
        CharSequence query = uri.getQuery();
        if (query == null || query.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return treeMap;
        }
        String query2 = uri.getQuery();
        if (query2 != null) {
            List<String> b = C7634n.m23768b((CharSequence) query2, new String[]{"&"}, false, 0);
            if (b != null) {
                for (String str : b) {
                    int a = C7634n.m23730a((CharSequence) str, "=", 0, false, 6, (Object) null);
                    if (a >= 0) {
                        Map map = treeMap;
                        if (str != null) {
                            String substring = str.substring(0, a);
                            C7573i.m23582a((Object) substring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
                            String decode = URLDecoder.decode(substring, "UTF-8");
                            C7573i.m23582a((Object) decode, "URLDecoder.decode(pair.s…tring(0, index), \"UTF-8\")");
                            int i = a + 1;
                            if (str != null) {
                                String substring2 = str.substring(i);
                                C7573i.m23582a((Object) substring2, "(this as java.lang.String).substring(startIndex)");
                                String decode2 = URLDecoder.decode(substring2, "UTF-8");
                                C7573i.m23582a((Object) decode2, "URLDecoder.decode(pair.s…ring(index + 1), \"UTF-8\")");
                                map.put(decode, decode2);
                            } else {
                                throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
                        }
                    }
                }
                return treeMap;
            }
        }
        return treeMap;
    }

    /* renamed from: a */
    public static final JSONObject m32626a(Map<String, String> map) {
        if (map == null) {
            return new JSONObject();
        }
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            jSONObject.put((String) entry.getKey(), entry.getValue());
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static final String m32624a(String str, Map<String, String> map) {
        C7573i.m23587b(str, "baseUrl");
        C7573i.m23587b(map, "params");
        Builder buildUpon = Uri.parse(str).buildUpon();
        for (Entry entry : map.entrySet()) {
            buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
        }
        String builder = buildUpon.toString();
        C7573i.m23582a((Object) builder, "builder.toString()");
        return builder;
    }
}
