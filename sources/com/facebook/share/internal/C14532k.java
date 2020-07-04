package com.facebook.share.internal;

import com.facebook.share.model.ShareOpenGraphAction;
import com.facebook.share.model.ShareOpenGraphObject;
import com.facebook.share.model.SharePhoto;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.facebook.share.internal.k */
public final class C14532k {

    /* renamed from: com.facebook.share.internal.k$a */
    public interface C14533a {
        /* renamed from: a */
        JSONObject mo36699a(SharePhoto sharePhoto);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.Object>, for r2v0, types: [java.util.List, java.util.List<java.lang.Object>] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static org.json.JSONArray m41959a(java.util.List<java.lang.Object> r2, com.facebook.share.internal.C14532k.C14533a r3) throws org.json.JSONException {
        /*
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            java.util.Iterator r2 = r2.iterator()
        L_0x0009:
            boolean r1 = r2.hasNext()
            if (r1 == 0) goto L_0x001b
            java.lang.Object r1 = r2.next()
            java.lang.Object r1 = m41958a(r1, r3)
            r0.put(r1)
            goto L_0x0009
        L_0x001b:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.share.internal.C14532k.m41959a(java.util.List, com.facebook.share.internal.k$a):org.json.JSONArray");
    }

    /* renamed from: a */
    public static JSONObject m41960a(ShareOpenGraphAction shareOpenGraphAction, C14533a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : shareOpenGraphAction.mo36792c()) {
            jSONObject.put(str, m41958a(shareOpenGraphAction.mo36789a(str), aVar));
        }
        return jSONObject;
    }

    /* renamed from: a */
    private static Object m41958a(Object obj, C14533a aVar) throws JSONException {
        if (obj == null) {
            return JSONObject.NULL;
        }
        if ((obj instanceof String) || (obj instanceof Boolean) || (obj instanceof Double) || (obj instanceof Float) || (obj instanceof Integer) || (obj instanceof Long)) {
            return obj;
        }
        if (obj instanceof SharePhoto) {
            if (aVar != null) {
                return aVar.mo36699a((SharePhoto) obj);
            }
            return null;
        } else if (obj instanceof ShareOpenGraphObject) {
            return m41961a((ShareOpenGraphObject) obj, aVar);
        } else {
            if (obj instanceof List) {
                return m41959a((List) obj, aVar);
            }
            StringBuilder sb = new StringBuilder("Invalid object found for JSON serialization: ");
            sb.append(obj.toString());
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private static JSONObject m41961a(ShareOpenGraphObject shareOpenGraphObject, C14533a aVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        for (String str : shareOpenGraphObject.mo36792c()) {
            jSONObject.put(str, m41958a(shareOpenGraphObject.mo36789a(str), aVar));
        }
        return jSONObject;
    }
}
