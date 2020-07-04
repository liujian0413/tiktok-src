package com.bytedance.ies.bullet.core.common;

import java.util.Iterator;
import kotlin.jvm.internal.C7573i;
import org.json.JSONObject;

/* renamed from: com.bytedance.ies.bullet.core.common.d */
public final class C10350d {
    /* renamed from: a */
    public static final void m30638a(JSONObject jSONObject, JSONObject jSONObject2) {
        C7573i.m23587b(jSONObject, "$this$wrap");
        C7573i.m23587b(jSONObject2, "json");
        Iterator keys = jSONObject2.keys();
        C7573i.m23582a((Object) keys, "json.keys()");
        while (keys.hasNext()) {
            String str = (String) keys.next();
            jSONObject.put(str, jSONObject2.opt(str));
        }
    }
}
