package com.bytedance.android.p089a.p099b.p104d.p107c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.p089a.p090a.C2219d;
import com.bytedance.android.p089a.p090a.p092b.C2212a;
import com.bytedance.android.p089a.p090a.p092b.C2213b;
import com.bytedance.android.p089a.p090a.p095e.C2222b;
import com.bytedance.android.p089a.p099b.p104d.C2257b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.b.d.c.a */
public final class C2259a implements C2257b {

    /* renamed from: a */
    private C2212a f7531a;

    /* renamed from: a */
    public final void mo7998a(int i) {
    }

    /* renamed from: a */
    public final void mo7997a() {
        this.f7531a.mo7945b().mo7946c();
    }

    /* renamed from: d */
    public final void mo8004d() {
        this.f7531a.mo7946c();
        this.f7531a = null;
    }

    public C2259a() {
        Context context = C2219d.m9560c().f7457b;
        this.f7531a = new C2213b(context, "ad_tracker_c2s_store_v2_adym3");
        C2212a aVar = C2219d.m9560c().f7461f;
        if (aVar != null && aVar.mo7944b("sp_c2s_store_version", 0) < 2) {
            m9712a(context);
            aVar.mo7941a("sp_c2s_store_version", 2).mo7946c();
        }
    }

    /* renamed from: b */
    public final List<C2222b> mo8000b() {
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList<>();
        Map a = this.f7531a.mo7943a();
        for (String str : a.keySet()) {
            Object obj = a.get(str);
            if (obj instanceof String) {
                C2222b b = m9714b((String) obj);
                if (b != null) {
                    arrayList.add(b);
                } else {
                    arrayList2.add(str);
                }
            } else {
                arrayList2.add(str);
            }
        }
        if (!arrayList2.isEmpty()) {
            for (String a2 : arrayList2) {
                this.f7531a.mo7940a(a2);
            }
            this.f7531a.mo7946c();
        }
        return arrayList;
    }

    /* renamed from: c */
    public final List<C2222b> mo8002c() {
        ArrayList arrayList = new ArrayList();
        ArrayList<String> arrayList2 = new ArrayList<>();
        Map a = this.f7531a.mo7943a();
        for (String str : a.keySet()) {
            Object obj = a.get(str);
            if (obj instanceof String) {
                C2222b b = m9714b((String) obj);
                if (b == null) {
                    arrayList2.add(str);
                } else if (b.f7473k > 0) {
                    arrayList.add(b);
                }
            } else {
                arrayList2.add(str);
            }
        }
        if (!arrayList2.isEmpty()) {
            for (String a2 : arrayList2) {
                this.f7531a.mo7940a(a2);
            }
            this.f7531a.mo7946c();
        }
        return arrayList;
    }

    /* renamed from: c */
    public final void mo8003c(C2222b bVar) {
        mo7999a(bVar);
    }

    /* renamed from: a */
    private void m9713a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.f7531a.mo7940a(str).mo7946c();
        }
    }

    /* renamed from: b */
    public final void mo8001b(C2222b bVar) {
        if (bVar != null && !TextUtils.isEmpty(bVar.f7463a)) {
            m9713a(bVar.f7463a);
        }
    }

    /* renamed from: a */
    public final List<C2222b> mo7996a(List<C2222b> list) {
        if (list == null || list.isEmpty()) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (C2222b bVar : list) {
            if (!mo7999a(bVar)) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x003f, code lost:
        if (android.os.Build.VERSION.SDK_INT >= 24) goto L_0x0041;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0041, code lost:
        r7.deleteSharedPreferences("ad_tracker_c2s_store_1c20b");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0046, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (android.os.Build.VERSION.SDK_INT < 24) goto L_0x0058;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0058, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m9712a(android.content.Context r7) {
        /*
            r6 = this;
            r0 = 24
            java.lang.String r1 = "ad_tracker_c2s_store_1c20b"
            r2 = 0
            android.content.SharedPreferences r1 = com.p280ss.android.ugc.aweme.p340x.C7285c.m22838a(r7, r1, r2)     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            java.util.ArrayList r2 = new java.util.ArrayList     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            r2.<init>()     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            java.util.Map r1 = r1.getAll()     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            java.util.Set r3 = r1.keySet()     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
        L_0x001a:
            boolean r4 = r3.hasNext()     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            if (r4 == 0) goto L_0x003a
            java.lang.Object r4 = r3.next()     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            java.lang.Object r4 = r1.get(r4)     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            boolean r5 = r4 instanceof java.lang.String     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            if (r5 == 0) goto L_0x001a
            java.lang.String r4 = (java.lang.String) r4     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            com.bytedance.android.a.a.e.b r4 = m9715c(r4)     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            if (r4 == 0) goto L_0x001a
            r2.add(r4)     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            goto L_0x001a
        L_0x003a:
            r6.mo7996a(r2)     // Catch:{ Throwable -> 0x0052, all -> 0x0047 }
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r0) goto L_0x0058
        L_0x0041:
            java.lang.String r0 = "ad_tracker_c2s_store_1c20b"
            r7.deleteSharedPreferences(r0)
            return
        L_0x0047:
            r1 = move-exception
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r0) goto L_0x0051
            java.lang.String r0 = "ad_tracker_c2s_store_1c20b"
            r7.deleteSharedPreferences(r0)
        L_0x0051:
            throw r1
        L_0x0052:
            int r1 = android.os.Build.VERSION.SDK_INT
            if (r1 < r0) goto L_0x0058
            goto L_0x0041
        L_0x0058:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p089a.p099b.p104d.p107c.C2259a.m9712a(android.content.Context):void");
    }

    /* renamed from: b */
    private static C2222b m9714b(String str) {
        C2222b bVar;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            String optString = jSONObject.optString("uuid");
            String optString2 = jSONObject.optString("tracker_key");
            long optLong = jSONObject.optLong("ad_id");
            boolean optBoolean = jSONObject.optBoolean("is_standard");
            long optLong2 = jSONObject.optLong("non_std_ad_id");
            ArrayList arrayList = new ArrayList();
            JSONArray optJSONArray = jSONObject.optJSONArray("urls");
            if (optJSONArray != null) {
                for (int i = 0; i < optJSONArray.length(); i++) {
                    arrayList.add(optJSONArray.getString(i));
                }
            }
            String optString3 = jSONObject.optString("log_extra");
            JSONObject optJSONObject = jSONObject.optJSONObject("ad_extra_data");
            try {
                long optLong3 = jSONObject.optLong("create_timestamp");
                C2222b bVar2 = new C2222b(optString, optString2, optLong, arrayList, jSONObject.optInt("track_type"), optBoolean, optLong2, optString3, optJSONObject, jSONObject.optInt("tried_count", 0));
                bVar2.f7471i = optLong3;
                return bVar2;
            } catch (Throwable unused) {
                bVar = null;
                return bVar;
            }
        } catch (Throwable unused2) {
            bVar = null;
            return bVar;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x006a A[Catch:{ JSONException -> 0x0078 }] */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.bytedance.android.p089a.p090a.p095e.C2222b m9715c(java.lang.String r15) {
        /*
            boolean r0 = android.text.TextUtils.isEmpty(r15)
            r1 = 0
            if (r0 == 0) goto L_0x0008
            return r1
        L_0x0008:
            org.json.JSONArray r0 = new org.json.JSONArray     // Catch:{ JSONException -> 0x0078 }
            r0.<init>(r15)     // Catch:{ JSONException -> 0x0078 }
            r15 = 0
            java.lang.String r3 = r0.getString(r15)     // Catch:{ JSONException -> 0x0078 }
            r2 = 1
            java.lang.String r4 = r0.getString(r2)     // Catch:{ JSONException -> 0x0078 }
            r2 = 2
            long r5 = r0.getLong(r2)     // Catch:{ JSONException -> 0x0078 }
            r2 = 3
            r7 = 4
            int r2 = r0.getInt(r2)     // Catch:{ JSONException -> 0x0078 }
            java.util.ArrayList r8 = new java.util.ArrayList     // Catch:{ JSONException -> 0x0078 }
            r8.<init>()     // Catch:{ JSONException -> 0x0078 }
        L_0x0027:
            if (r15 >= r2) goto L_0x0036
            int r9 = r7 + 1
            java.lang.String r7 = r0.getString(r7)     // Catch:{ JSONException -> 0x0078 }
            r8.add(r7)     // Catch:{ JSONException -> 0x0078 }
            int r15 = r15 + 1
            r7 = r9
            goto L_0x0027
        L_0x0036:
            int r15 = r7 + 1
            java.lang.String r12 = r0.getString(r7)     // Catch:{ JSONException -> 0x0078 }
            int r2 = r15 + 1
            java.lang.String r15 = r0.getString(r15)     // Catch:{ JSONException -> 0x0078 }
            boolean r7 = android.text.TextUtils.isEmpty(r15)     // Catch:{ JSONException -> 0x0078 }
            if (r7 != 0) goto L_0x004f
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ JSONException -> 0x004f }
            r7.<init>(r15)     // Catch:{ JSONException -> 0x004f }
            r13 = r7
            goto L_0x0050
        L_0x004f:
            r13 = r1
        L_0x0050:
            int r15 = r2 + 1
            int r9 = r0.getInt(r2)     // Catch:{ JSONException -> 0x0078 }
            int r2 = r15 + 1
            boolean r15 = r0.getBoolean(r15)     // Catch:{ JSONException -> 0x0078 }
            int r7 = r2 + 1
            int r14 = r0.getInt(r2)     // Catch:{ JSONException -> 0x0078 }
            r10 = -1
            int r2 = r0.length()     // Catch:{ JSONException -> 0x0078 }
            if (r7 >= r2) goto L_0x006e
            long r10 = r0.getLong(r7)     // Catch:{ JSONException -> 0x0078 }
        L_0x006e:
            com.bytedance.android.a.a.e.b r0 = new com.bytedance.android.a.a.e.b     // Catch:{ JSONException -> 0x0078 }
            r2 = r0
            r7 = r8
            r8 = r9
            r9 = r15
            r2.<init>(r3, r4, r5, r7, r8, r9, r10, r12, r13, r14)     // Catch:{ JSONException -> 0x0078 }
            return r0
        L_0x0078:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.p089a.p099b.p104d.p107c.C2259a.m9715c(java.lang.String):com.bytedance.android.a.a.e.b");
    }

    /* renamed from: d */
    private static String m9716d(C2222b bVar) {
        if (bVar == null) {
            return "";
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("uuid", bVar.f7463a).put("tracker_key", bVar.f7464b).put("ad_id", bVar.f7465c).put("is_standard", bVar.f7466d).put("non_std_ad_id", bVar.f7467e);
            JSONArray jSONArray = new JSONArray();
            List<String> list = bVar.f7468f;
            if (list != null) {
                for (String put : list) {
                    jSONArray.put(put);
                }
            }
            jSONObject.put("urls", jSONArray);
            jSONObject.put("log_extra", bVar.f7469g).put("ad_extra_data", bVar.f7470h).put("create_timestamp", bVar.f7471i).put("track_type", bVar.f7472j).put("tried_count", bVar.f7473k);
            return jSONObject.toString();
        } catch (Throwable unused) {
            return "";
        }
    }

    /* renamed from: a */
    public final boolean mo7999a(C2222b bVar) {
        if (bVar == null || TextUtils.isEmpty(bVar.f7463a)) {
            return false;
        }
        String d = m9716d(bVar);
        if (TextUtils.isEmpty(d)) {
            return false;
        }
        this.f7531a.mo7942a(bVar.f7463a, d).mo7946c();
        return true;
    }
}
