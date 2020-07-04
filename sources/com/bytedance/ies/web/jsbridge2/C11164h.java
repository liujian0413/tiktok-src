package com.bytedance.ies.web.jsbridge2;

import java.lang.reflect.Type;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.web.jsbridge2.h */
final class C11164h {

    /* renamed from: a */
    private C11167k f30298a;

    private C11164h(C11167k kVar) {
        this.f30298a = kVar;
    }

    /* renamed from: a */
    static C11164h m32679a(C11167k kVar) {
        return new C11164h(kVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <T> String mo27182a(T t) {
        String str;
        if (t == null) {
            return "{}";
        }
        if ((t instanceof JSONObject) || (t instanceof JSONArray)) {
            str = t.toString();
        } else {
            str = this.f30298a.mo11660a(t);
        }
        m32680a(str);
        return str;
    }

    /* renamed from: a */
    private static void m32680a(String str) {
        if (!str.startsWith("{") || !str.endsWith("}")) {
            StringBuilder sb = new StringBuilder("Param is not allowed to be List or JSONArray, rawString:\n ");
            sb.append(str);
            C11165i.m32683a((RuntimeException) new IllegalArgumentException(sb.toString()));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final <T> T mo27181a(String str, Type type) throws JSONException {
        m32680a(str);
        if (type.equals(JSONObject.class) || ((type instanceof Class) && JSONObject.class.isAssignableFrom((Class) type))) {
            return new JSONObject(str);
        }
        return this.f30298a.mo11659a(str, type);
    }
}
