package com.facebook.internal;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.internal.c */
public final class C13896c {

    /* renamed from: a */
    private static final Map<Class<?>, C13904a> f36808a;

    /* renamed from: com.facebook.internal.c$a */
    public interface C13904a {
        /* renamed from: a */
        void mo33554a(Bundle bundle, String str, Object obj) throws JSONException;

        /* renamed from: a */
        void mo33555a(JSONObject jSONObject, String str, Object obj) throws JSONException;
    }

    static {
        HashMap hashMap = new HashMap();
        f36808a = hashMap;
        hashMap.put(Boolean.class, new C13904a() {
            /* renamed from: a */
            public final void mo33555a(JSONObject jSONObject, String str, Object obj) throws JSONException {
                jSONObject.put(str, obj);
            }

            /* renamed from: a */
            public final void mo33554a(Bundle bundle, String str, Object obj) throws JSONException {
                bundle.putBoolean(str, ((Boolean) obj).booleanValue());
            }
        });
        f36808a.put(Integer.class, new C13904a() {
            /* renamed from: a */
            public final void mo33555a(JSONObject jSONObject, String str, Object obj) throws JSONException {
                jSONObject.put(str, obj);
            }

            /* renamed from: a */
            public final void mo33554a(Bundle bundle, String str, Object obj) throws JSONException {
                bundle.putInt(str, ((Integer) obj).intValue());
            }
        });
        f36808a.put(Long.class, new C13904a() {
            /* renamed from: a */
            public final void mo33555a(JSONObject jSONObject, String str, Object obj) throws JSONException {
                jSONObject.put(str, obj);
            }

            /* renamed from: a */
            public final void mo33554a(Bundle bundle, String str, Object obj) throws JSONException {
                bundle.putLong(str, ((Long) obj).longValue());
            }
        });
        f36808a.put(Double.class, new C13904a() {
            /* renamed from: a */
            public final void mo33555a(JSONObject jSONObject, String str, Object obj) throws JSONException {
                jSONObject.put(str, obj);
            }

            /* renamed from: a */
            public final void mo33554a(Bundle bundle, String str, Object obj) throws JSONException {
                bundle.putDouble(str, ((Double) obj).doubleValue());
            }
        });
        f36808a.put(String.class, new C13904a() {
            /* renamed from: a */
            public final void mo33555a(JSONObject jSONObject, String str, Object obj) throws JSONException {
                jSONObject.put(str, obj);
            }

            /* renamed from: a */
            public final void mo33554a(Bundle bundle, String str, Object obj) throws JSONException {
                bundle.putString(str, (String) obj);
            }
        });
        f36808a.put(String[].class, new C13904a() {
            /* renamed from: a */
            public final void mo33554a(Bundle bundle, String str, Object obj) throws JSONException {
                throw new IllegalArgumentException("Unexpected type from JSON");
            }

            /* renamed from: a */
            public final void mo33555a(JSONObject jSONObject, String str, Object obj) throws JSONException {
                JSONArray jSONArray = new JSONArray();
                for (String put : (String[]) obj) {
                    jSONArray.put(put);
                }
                jSONObject.put(str, jSONArray);
            }
        });
        f36808a.put(JSONArray.class, new C13904a() {
            /* renamed from: a */
            public final void mo33555a(JSONObject jSONObject, String str, Object obj) throws JSONException {
                throw new IllegalArgumentException("JSONArray's are not supported in bundles.");
            }

            /* renamed from: a */
            public final void mo33554a(Bundle bundle, String str, Object obj) throws JSONException {
                JSONArray jSONArray = (JSONArray) obj;
                ArrayList arrayList = new ArrayList();
                if (jSONArray.length() == 0) {
                    bundle.putStringArrayList(str, arrayList);
                    return;
                }
                int i = 0;
                while (i < jSONArray.length()) {
                    Object obj2 = jSONArray.get(i);
                    if (obj2 instanceof String) {
                        arrayList.add((String) obj2);
                        i++;
                    } else {
                        StringBuilder sb = new StringBuilder("Unexpected type in an array: ");
                        sb.append(obj2.getClass());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
                bundle.putStringArrayList(str, arrayList);
            }
        });
    }

    /* renamed from: a */
    public static Bundle m41029a(JSONObject jSONObject) throws JSONException {
        Bundle bundle = new Bundle();
        Iterator keys = jSONObject.keys();
        while (keys.hasNext()) {
            String str = (String) keys.next();
            Object obj = jSONObject.get(str);
            if (!(obj == null || obj == JSONObject.NULL)) {
                if (obj instanceof JSONObject) {
                    bundle.putBundle(str, m41029a((JSONObject) obj));
                } else {
                    C13904a aVar = (C13904a) f36808a.get(obj.getClass());
                    if (aVar != null) {
                        aVar.mo33554a(bundle, str, obj);
                    } else {
                        StringBuilder sb = new StringBuilder("Unsupported type: ");
                        sb.append(obj.getClass());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return bundle;
    }

    /* renamed from: a */
    public static JSONObject m41030a(Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : bundle.keySet()) {
            Object obj = bundle.get(str);
            if (obj != null) {
                if (obj instanceof List) {
                    JSONArray jSONArray = new JSONArray();
                    for (String put : (List) obj) {
                        jSONArray.put(put);
                    }
                    jSONObject.put(str, jSONArray);
                } else if (obj instanceof Bundle) {
                    jSONObject.put(str, m41030a((Bundle) obj));
                } else {
                    C13904a aVar = (C13904a) f36808a.get(obj.getClass());
                    if (aVar != null) {
                        aVar.mo33555a(jSONObject, str, obj);
                    } else {
                        StringBuilder sb = new StringBuilder("Unsupported type: ");
                        sb.append(obj.getClass());
                        throw new IllegalArgumentException(sb.toString());
                    }
                }
            }
        }
        return jSONObject;
    }
}
