package com.p280ss.android.downloadlib.addownload.p864b;

import com.p280ss.android.downloadlib.p868c.C19523h;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.downloadlib.addownload.b.a */
public final class C19461a {

    /* renamed from: a */
    public long f52688a;

    /* renamed from: b */
    public long f52689b;

    /* renamed from: c */
    public long f52690c;

    /* renamed from: d */
    public String f52691d;

    /* renamed from: e */
    public String f52692e;

    /* renamed from: f */
    public String f52693f;

    /* renamed from: g */
    public String f52694g;

    /* renamed from: h */
    public long f52695h;

    public C19461a() {
    }

    /* renamed from: a */
    public final void mo51526a() {
        this.f52695h = System.currentTimeMillis();
    }

    /* renamed from: b */
    public final JSONObject mo51527b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mDownloadId", this.f52688a);
            jSONObject.put("mAdId", this.f52689b);
            jSONObject.put("mExtValue", this.f52690c);
            jSONObject.put("mPackageName", this.f52691d);
            jSONObject.put("mAppName", this.f52692e);
            jSONObject.put("mLogExtra", this.f52693f);
            jSONObject.put("mFileName", this.f52694g);
            jSONObject.put("mTimeStamp", this.f52695h);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static C19461a m64027a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C19461a aVar = new C19461a();
        try {
            aVar.f52688a = C19523h.m64304a(jSONObject, "mDownloadId");
            aVar.f52689b = C19523h.m64304a(jSONObject, "mAdId");
            aVar.f52690c = C19523h.m64304a(jSONObject, "mExtValue");
            aVar.f52691d = jSONObject.optString("mPackageName");
            aVar.f52692e = jSONObject.optString("mAppName");
            aVar.f52693f = jSONObject.optString("mLogExtra");
            aVar.f52694g = jSONObject.optString("mFileName");
            aVar.f52695h = C19523h.m64304a(jSONObject, "mTimeStamp");
            return aVar;
        } catch (Exception unused) {
            return null;
        }
    }

    public C19461a(long j, long j2, long j3, String str, String str2, String str3, String str4) {
        this.f52688a = j;
        this.f52689b = j2;
        this.f52690c = j3;
        this.f52691d = str;
        this.f52692e = str2;
        this.f52693f = str3;
        this.f52694g = str4;
    }
}
