package com.bytedance.ies.bullet.kit.p261rn.p546c;

import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.bullet.kit.rn.c.a */
public final class C10493a {

    /* renamed from: a */
    public static final C10493a f28230a = new C10493a();

    private C10493a() {
    }

    /* renamed from: a */
    private static JSONArray m30884a(List<? extends Object> list) {
        C7573i.m23587b(list, "list");
        JSONArray jSONArray = new JSONArray();
        for (Object next : list) {
            if (next != null) {
                if (next instanceof List) {
                    jSONArray.put(m30884a((List) next));
                } else if (next instanceof Map) {
                    jSONArray.put(m30885a((Map) next));
                } else {
                    jSONArray.put(next);
                }
            }
        }
        return jSONArray;
    }

    /* renamed from: a */
    public static JSONObject m30885a(Map<String, ? extends Object> map) {
        C7573i.m23587b(map, "map");
        JSONObject jSONObject = new JSONObject();
        for (Entry entry : map.entrySet()) {
            if (entry.getValue() != null) {
                Object value = entry.getValue();
                if (value instanceof List) {
                    String str = (String) entry.getKey();
                    Object value2 = entry.getValue();
                    if (value2 != null) {
                        jSONObject.put(str, m30884a((List) value2));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.List<kotlin.Any?>");
                    }
                } else if (value instanceof Map) {
                    String str2 = (String) entry.getKey();
                    Object value3 = entry.getValue();
                    if (value3 != null) {
                        jSONObject.put(str2, m30885a((Map) value3));
                    } else {
                        throw new TypeCastException("null cannot be cast to non-null type kotlin.collections.Map<kotlin.String, kotlin.Any?>");
                    }
                } else {
                    jSONObject.put((String) entry.getKey(), entry.getValue());
                }
            }
        }
        return jSONObject;
    }

    /* renamed from: a */
    public final String mo25284a(Object obj) {
        C7573i.m23587b(obj, "any");
        if (obj instanceof List) {
            String jSONArray = m30884a((List) obj).toString();
            C7573i.m23582a((Object) jSONArray, "convertListToJson(any as List<Any?>).toString()");
            return jSONArray;
        } else if (!(obj instanceof Map)) {
            return obj.toString();
        } else {
            String jSONObject = m30885a((Map) obj).toString();
            C7573i.m23582a((Object) jSONObject, "convertMapToJson(any as …String, Any?>).toString()");
            return jSONObject;
        }
    }
}
