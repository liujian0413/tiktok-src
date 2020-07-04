package com.google.android.gms.internal.ads;

import android.content.Context;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.hr */
public final class C15743hr implements C15742hq<C15836lc> {

    /* renamed from: a */
    private final Context f44479a;

    /* renamed from: b */
    private final zzbgz f44480b;

    public C15743hr(Context context, zzbgz zzbgz) {
        this.f44479a = context;
        this.f44480b = zzbgz;
    }

    /* renamed from: b */
    private static C15748hw m51015b(JSONObject jSONObject) {
        String optString = jSONObject.optString("http_request_id");
        String optString2 = jSONObject.optString("url");
        URL url = null;
        String optString3 = jSONObject.optString("post_body", null);
        try {
            url = new URL(optString2);
        } catch (MalformedURLException e) {
            acd.m45778b("Error constructing http request.", e);
        }
        ArrayList arrayList = new ArrayList();
        JSONArray optJSONArray = jSONObject.optJSONArray("headers");
        if (optJSONArray == null) {
            optJSONArray = new JSONArray();
        }
        for (int i = 0; i < optJSONArray.length(); i++) {
            JSONObject optJSONObject = optJSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                arrayList.add(new C15747hv(optJSONObject.optString("key"), optJSONObject.optString("value")));
            }
        }
        return new C15748hw(optString, url, arrayList, optString3);
    }

    /* renamed from: a */
    private static JSONObject m51014a(C15750hy hyVar) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("http_request_id", hyVar.f44495a);
            if (hyVar.f44498d != null) {
                jSONObject.put("body", hyVar.f44498d);
            }
            JSONArray jSONArray = new JSONArray();
            for (C15747hv hvVar : hyVar.f44497c) {
                jSONArray.put(new JSONObject().put("key", hvVar.f44486a).put("value", hvVar.f44487b));
            }
            jSONObject.put("headers", jSONArray);
            jSONObject.put("response_code", hyVar.f44496b);
        } catch (JSONException e) {
            acd.m45778b("Error constructing JSON for http response.", e);
        }
        return jSONObject;
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00e8  */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x00ef  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final com.google.android.gms.internal.ads.C15749hx m51013a(com.google.android.gms.internal.ads.C15748hw r13) {
        /*
            r12 = this;
            r0 = 0
            r1 = 0
            java.net.URL r2 = r13.f44489b     // Catch:{ Exception -> 0x00db, all -> 0x00d8 }
            java.net.URLConnection r2 = r2.openConnection()     // Catch:{ Exception -> 0x00db, all -> 0x00d8 }
            java.net.HttpURLConnection r2 = (java.net.HttpURLConnection) r2     // Catch:{ Exception -> 0x00db, all -> 0x00d8 }
            com.google.android.gms.internal.ads.acl r3 = com.google.android.gms.ads.internal.C14793ay.m42895a()     // Catch:{ Exception -> 0x00d6 }
            android.content.Context r4 = r12.f44479a     // Catch:{ Exception -> 0x00d6 }
            com.google.android.gms.internal.ads.zzbgz r5 = r12.f44480b     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r5 = r5.f45677a     // Catch:{ Exception -> 0x00d6 }
            r3.mo39173a(r4, r5, r0, r2)     // Catch:{ Exception -> 0x00d6 }
            java.util.ArrayList<com.google.android.gms.internal.ads.hv> r3 = r13.f44490c     // Catch:{ Exception -> 0x00d6 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ Exception -> 0x00d6 }
            int r4 = r3.size()     // Catch:{ Exception -> 0x00d6 }
            r5 = 0
        L_0x0020:
            if (r5 >= r4) goto L_0x0032
            java.lang.Object r6 = r3.get(r5)     // Catch:{ Exception -> 0x00d6 }
            int r5 = r5 + 1
            com.google.android.gms.internal.ads.hv r6 = (com.google.android.gms.internal.ads.C15747hv) r6     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r7 = r6.f44486a     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r6 = r6.f44487b     // Catch:{ Exception -> 0x00d6 }
            com.google.android.gms.internal.ads.C15744hs.m51019a(r2, r7, r6)     // Catch:{ Exception -> 0x00d6 }
            goto L_0x0020
        L_0x0032:
            java.lang.String r3 = r13.f44491d     // Catch:{ Exception -> 0x00d6 }
            boolean r3 = android.text.TextUtils.isEmpty(r3)     // Catch:{ Exception -> 0x00d6 }
            r4 = 1
            if (r3 != 0) goto L_0x0058
            r2.setDoOutput(r4)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r3 = r13.f44491d     // Catch:{ Exception -> 0x00d6 }
            byte[] r3 = r3.getBytes()     // Catch:{ Exception -> 0x00d6 }
            int r5 = r3.length     // Catch:{ Exception -> 0x00d6 }
            r2.setFixedLengthStreamingMode(r5)     // Catch:{ Exception -> 0x00d6 }
            java.io.BufferedOutputStream r5 = new java.io.BufferedOutputStream     // Catch:{ Exception -> 0x00d6 }
            java.io.OutputStream r6 = r2.getOutputStream()     // Catch:{ Exception -> 0x00d6 }
            r5.<init>(r6)     // Catch:{ Exception -> 0x00d6 }
            r5.write(r3)     // Catch:{ Exception -> 0x00d6 }
            r5.close()     // Catch:{ Exception -> 0x00d6 }
            goto L_0x0059
        L_0x0058:
            r3 = r1
        L_0x0059:
            com.google.android.gms.internal.ads.afg r5 = new com.google.android.gms.internal.ads.afg     // Catch:{ Exception -> 0x00d6 }
            r5.<init>()     // Catch:{ Exception -> 0x00d6 }
            r5.mo39280a(r2, r3)     // Catch:{ Exception -> 0x00d6 }
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ Exception -> 0x00d6 }
            r3.<init>()     // Catch:{ Exception -> 0x00d6 }
            java.util.Map r6 = r2.getHeaderFields()     // Catch:{ Exception -> 0x00d6 }
            if (r6 == 0) goto L_0x00a9
            java.util.Map r6 = r2.getHeaderFields()     // Catch:{ Exception -> 0x00d6 }
            java.util.Set r6 = r6.entrySet()     // Catch:{ Exception -> 0x00d6 }
            java.util.Iterator r6 = r6.iterator()     // Catch:{ Exception -> 0x00d6 }
        L_0x0078:
            boolean r7 = r6.hasNext()     // Catch:{ Exception -> 0x00d6 }
            if (r7 == 0) goto L_0x00a9
            java.lang.Object r7 = r6.next()     // Catch:{ Exception -> 0x00d6 }
            java.util.Map$Entry r7 = (java.util.Map.Entry) r7     // Catch:{ Exception -> 0x00d6 }
            java.lang.Object r8 = r7.getValue()     // Catch:{ Exception -> 0x00d6 }
            java.util.List r8 = (java.util.List) r8     // Catch:{ Exception -> 0x00d6 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ Exception -> 0x00d6 }
        L_0x008e:
            boolean r9 = r8.hasNext()     // Catch:{ Exception -> 0x00d6 }
            if (r9 == 0) goto L_0x0078
            java.lang.Object r9 = r8.next()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x00d6 }
            com.google.android.gms.internal.ads.hv r10 = new com.google.android.gms.internal.ads.hv     // Catch:{ Exception -> 0x00d6 }
            java.lang.Object r11 = r7.getKey()     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r11 = (java.lang.String) r11     // Catch:{ Exception -> 0x00d6 }
            r10.<init>(r11, r9)     // Catch:{ Exception -> 0x00d6 }
            r3.add(r10)     // Catch:{ Exception -> 0x00d6 }
            goto L_0x008e
        L_0x00a9:
            com.google.android.gms.internal.ads.hy r6 = new com.google.android.gms.internal.ads.hy     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r13 = r13.f44488a     // Catch:{ Exception -> 0x00d6 }
            int r7 = r2.getResponseCode()     // Catch:{ Exception -> 0x00d6 }
            java.io.InputStreamReader r8 = new java.io.InputStreamReader     // Catch:{ Exception -> 0x00d6 }
            java.io.InputStream r9 = com.google.android.gms.internal.ads.C15744hs.m51018a(r2)     // Catch:{ Exception -> 0x00d6 }
            r8.<init>(r9)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r8 = com.google.android.gms.internal.ads.acl.m45521a(r8)     // Catch:{ Exception -> 0x00d6 }
            r6.<init>(r13, r7, r3, r8)     // Catch:{ Exception -> 0x00d6 }
            int r13 = r6.f44496b     // Catch:{ Exception -> 0x00d6 }
            r5.mo39279a(r2, r13)     // Catch:{ Exception -> 0x00d6 }
            java.lang.String r13 = r6.f44498d     // Catch:{ Exception -> 0x00d6 }
            r5.mo39277a(r13)     // Catch:{ Exception -> 0x00d6 }
            com.google.android.gms.internal.ads.hx r13 = new com.google.android.gms.internal.ads.hx     // Catch:{ Exception -> 0x00d6 }
            r13.<init>(r12, r4, r6, r1)     // Catch:{ Exception -> 0x00d6 }
            if (r2 == 0) goto L_0x00d5
            r2.disconnect()
        L_0x00d5:
            return r13
        L_0x00d6:
            r13 = move-exception
            goto L_0x00dd
        L_0x00d8:
            r13 = move-exception
            r2 = r1
            goto L_0x00ed
        L_0x00db:
            r13 = move-exception
            r2 = r1
        L_0x00dd:
            com.google.android.gms.internal.ads.hx r3 = new com.google.android.gms.internal.ads.hx     // Catch:{ all -> 0x00ec }
            java.lang.String r13 = r13.toString()     // Catch:{ all -> 0x00ec }
            r3.<init>(r12, r0, r1, r13)     // Catch:{ all -> 0x00ec }
            if (r2 == 0) goto L_0x00eb
            r2.disconnect()
        L_0x00eb:
            return r3
        L_0x00ec:
            r13 = move-exception
        L_0x00ed:
            if (r2 == 0) goto L_0x00f2
            r2.disconnect()
        L_0x00f2:
            throw r13
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15743hr.m51013a(com.google.android.gms.internal.ads.hw):com.google.android.gms.internal.ads.hx");
    }

    /* renamed from: a */
    public final JSONObject mo41646a(JSONObject jSONObject) {
        String str;
        JSONObject jSONObject2 = new JSONObject();
        try {
            str = jSONObject.optString("http_request_id");
            try {
                C15749hx a = m51013a(m51015b(jSONObject));
                if (a.f44493b) {
                    jSONObject2.put("response", m51014a(a.f44492a));
                    jSONObject2.put("success", true);
                } else {
                    jSONObject2.put("response", new JSONObject().put("http_request_id", str));
                    jSONObject2.put("success", false);
                    jSONObject2.put("reason", a.f44494c);
                }
            } catch (Exception e) {
                e = e;
                acd.m45778b("Error executing http request.", e);
                try {
                    jSONObject2.put("response", new JSONObject().put("http_request_id", str));
                    jSONObject2.put("success", false);
                    jSONObject2.put("reason", e.toString());
                } catch (JSONException e2) {
                    acd.m45778b("Error executing http request.", e2);
                }
                return jSONObject2;
            }
        } catch (Exception e3) {
            e = e3;
            str = "";
            acd.m45778b("Error executing http request.", e);
            jSONObject2.put("response", new JSONObject().put("http_request_id", str));
            jSONObject2.put("success", false);
            jSONObject2.put("reason", e.toString());
            return jSONObject2;
        }
        return jSONObject2;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo37744a(Object obj, Map map) {
        acj.m45508a((Runnable) new C15745ht(this, map, (C15836lc) obj));
    }
}
