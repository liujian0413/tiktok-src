package com.bytedance.apm.p247j;

import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.bytedance.apm.j.c */
public final class C6242c {

    /* renamed from: a */
    private static C6241b f18367a;

    /* renamed from: b */
    private static C6241b f18368b;

    static {
        C62431 r0 = new C6241b() {
        };
        f18367a = r0;
        f18368b = r0;
    }

    /* renamed from: a */
    public static void m19340a(String str, Object... objArr) {
        if (f18368b != null) {
            JSONObject jSONObject = new JSONObject();
            int length = objArr.length;
            if (length % 2 == 0) {
                int i = 0;
                while (i < length) {
                    try {
                        jSONObject.put(String.valueOf(objArr[i]), String.valueOf(objArr[i + 1]));
                        i += 2;
                    } catch (JSONException unused) {
                    }
                }
                new String[1][0] = jSONObject.toString();
                return;
            }
            throw new IllegalArgumentException();
        }
    }
}
