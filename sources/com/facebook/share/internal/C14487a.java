package com.facebook.share.internal;

import com.facebook.share.model.CameraEffectArguments;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.a */
public final class C14487a {

    /* renamed from: a */
    private static final Map<Class<?>, C14491a> f37463a;

    /* renamed from: com.facebook.share.internal.a$a */
    public interface C14491a {
        /* renamed from: a */
        void mo36669a(JSONObject jSONObject, String str, Object obj) throws JSONException;
    }

    static {
        HashMap hashMap = new HashMap();
        f37463a = hashMap;
        hashMap.put(String.class, new C14491a() {
            /* renamed from: a */
            public final void mo36669a(JSONObject jSONObject, String str, Object obj) throws JSONException {
                jSONObject.put(str, obj);
            }
        });
        f37463a.put(String[].class, new C14491a() {
            /* renamed from: a */
            public final void mo36669a(JSONObject jSONObject, String str, Object obj) throws JSONException {
                JSONArray jSONArray = new JSONArray();
                for (String put : (String[]) obj) {
                    jSONArray.put(put);
                }
                jSONObject.put(str, jSONArray);
            }
        });
        f37463a.put(JSONArray.class, new C14491a() {
            /* renamed from: a */
            public final void mo36669a(JSONObject jSONObject, String str, Object obj) throws JSONException {
                throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
            }
        });
    }

    /* renamed from: a */
    public static JSONObject m41826a(CameraEffectArguments cameraEffectArguments) throws JSONException {
        if (cameraEffectArguments == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (String str : cameraEffectArguments.mo36724a()) {
            Object a = cameraEffectArguments.mo36723a(str);
            if (a != null) {
                C14491a aVar = (C14491a) f37463a.get(a.getClass());
                if (aVar != null) {
                    aVar.mo36669a(jSONObject, str, a);
                } else {
                    StringBuilder sb = new StringBuilder("Unsupported type: ");
                    sb.append(a.getClass());
                    throw new IllegalArgumentException(sb.toString());
                }
            }
        }
        return jSONObject;
    }
}
