package net.openid.appauth;

import android.net.Uri;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: net.openid.appauth.a */
final class C48241a {
    /* renamed from: a */
    static Set<String> m149666a(String... strArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(strArr)));
    }

    /* renamed from: a */
    static Map<String, String> m149663a(Uri uri, Set<String> set) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (String str : uri.getQueryParameterNames()) {
            if (!set.contains(str)) {
                linkedHashMap.put(str, uri.getQueryParameter(str));
            }
        }
        return linkedHashMap;
    }

    /* renamed from: a */
    static Map<String, String> m149664a(Map<String, String> map, Set<String> set) {
        if (map == null) {
            return Collections.emptyMap();
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Entry entry : map.entrySet()) {
            String str = (String) entry.getKey();
            String str2 = (String) entry.getValue();
            C48280n.m149789a(str, (Object) "additional parameter keys cannot be null");
            C48280n.m149789a(str2, (Object) "additional parameter values cannot be null");
            C48280n.m149792a(!set.contains(str), "Parameter %s is directly supported via the authorization request builder, use the builder method instead", str);
            linkedHashMap.put(str, str2);
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    /* renamed from: a */
    static Map<String, String> m149665a(JSONObject jSONObject, Set<String> set) throws JSONException {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            if (!set.contains(str)) {
                linkedHashMap.put(str, jSONObject.get(str).toString());
            }
        }
        return linkedHashMap;
    }
}
