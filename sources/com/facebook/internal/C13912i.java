package com.facebook.internal;

import com.facebook.FacebookRequestError.Category;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.i */
public final class C13912i {

    /* renamed from: g */
    private static C13912i f36816g;

    /* renamed from: a */
    public final Map<Integer, Set<Integer>> f36817a;

    /* renamed from: b */
    public final Map<Integer, Set<Integer>> f36818b;

    /* renamed from: c */
    public final Map<Integer, Set<Integer>> f36819c;

    /* renamed from: d */
    private final String f36820d;

    /* renamed from: e */
    private final String f36821e;

    /* renamed from: f */
    private final String f36822f;

    /* renamed from: a */
    public static synchronized C13912i m41073a() {
        C13912i iVar;
        synchronized (C13912i.class) {
            if (f36816g == null) {
                f36816g = m41076b();
            }
            iVar = f36816g;
        }
        return iVar;
    }

    /* renamed from: b */
    private static C13912i m41076b() {
        C13912i iVar = new C13912i(null, new HashMap<Integer, Set<Integer>>() {
            {
                put(Integer.valueOf(2), null);
                put(Integer.valueOf(4), null);
                put(Integer.valueOf(9), null);
                put(Integer.valueOf(17), null);
                put(Integer.valueOf(341), null);
            }
        }, new HashMap<Integer, Set<Integer>>() {
            {
                put(Integer.valueOf(102), null);
                put(Integer.valueOf(190), null);
                put(Integer.valueOf(412), null);
            }
        }, null, null, null);
        return iVar;
    }

    /* renamed from: a */
    public final String mo33571a(Category category) {
        switch (category) {
            case OTHER:
                return this.f36820d;
            case LOGIN_RECOVERABLE:
                return this.f36822f;
            case TRANSIENT:
                return this.f36821e;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public static C13912i m41074a(JSONArray jSONArray) {
        if (jSONArray == null) {
            return null;
        }
        Map map = null;
        Map map2 = null;
        Map map3 = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("name");
                if (optString != null) {
                    if (optString.equalsIgnoreCase("other")) {
                        str = optJSONObject.optString("recovery_message", null);
                        map = m41075a(optJSONObject);
                    } else if (optString.equalsIgnoreCase("transient")) {
                        str2 = optJSONObject.optString("recovery_message", null);
                        map2 = m41075a(optJSONObject);
                    } else if (optString.equalsIgnoreCase("login_recoverable")) {
                        str3 = optJSONObject.optString("recovery_message", null);
                        map3 = m41075a(optJSONObject);
                    }
                }
            }
        }
        C13912i iVar = new C13912i(map, map2, map3, str, str2, str3);
        return iVar;
    }

    /* renamed from: a */
    private static Map<Integer, Set<Integer>> m41075a(JSONObject jSONObject) {
        HashSet hashSet;
        JSONArray optJSONArray = jSONObject.optJSONArray("items");
        if (optJSONArray.length() == 0) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                int optInt = optJSONObject.optInt("code");
                if (optInt != 0) {
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("subcodes");
                    if (optJSONArray2 == null || optJSONArray2.length() <= 0) {
                        hashSet = null;
                    } else {
                        hashSet = new HashSet();
                        for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                            int optInt2 = optJSONArray2.optInt(i2);
                            if (optInt2 != 0) {
                                hashSet.add(Integer.valueOf(optInt2));
                            }
                        }
                    }
                    hashMap.put(Integer.valueOf(optInt), hashSet);
                }
            }
        }
        return hashMap;
    }

    /* renamed from: a */
    public final Category mo33570a(int i, int i2, boolean z) {
        if (z) {
            return Category.TRANSIENT;
        }
        if (this.f36817a != null && this.f36817a.containsKey(Integer.valueOf(i))) {
            Set set = (Set) this.f36817a.get(Integer.valueOf(i));
            if (set == null || set.contains(Integer.valueOf(i2))) {
                return Category.OTHER;
            }
        }
        if (this.f36819c != null && this.f36819c.containsKey(Integer.valueOf(i))) {
            Set set2 = (Set) this.f36819c.get(Integer.valueOf(i));
            if (set2 == null || set2.contains(Integer.valueOf(i2))) {
                return Category.LOGIN_RECOVERABLE;
            }
        }
        if (this.f36818b != null && this.f36818b.containsKey(Integer.valueOf(i))) {
            Set set3 = (Set) this.f36818b.get(Integer.valueOf(i));
            if (set3 == null || set3.contains(Integer.valueOf(i2))) {
                return Category.TRANSIENT;
            }
        }
        return Category.OTHER;
    }

    private C13912i(Map<Integer, Set<Integer>> map, Map<Integer, Set<Integer>> map2, Map<Integer, Set<Integer>> map3, String str, String str2, String str3) {
        this.f36817a = map;
        this.f36818b = map2;
        this.f36819c = map3;
        this.f36820d = str;
        this.f36821e = str2;
        this.f36822f = str3;
    }
}
