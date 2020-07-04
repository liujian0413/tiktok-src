package com.p280ss.android.p848c.p849a.p851b;

import com.p280ss.android.download.api.p858b.C19387c;
import com.p280ss.android.download.api.p860c.C19390a;
import org.json.JSONObject;

/* renamed from: com.ss.android.c.a.b.a */
public final class C19236a {

    /* renamed from: a */
    public long f52022a;

    /* renamed from: b */
    public long f52023b;

    /* renamed from: c */
    public String f52024c;

    /* renamed from: d */
    public int f52025d;

    /* renamed from: e */
    public String f52026e;

    /* renamed from: f */
    public int f52027f;

    /* renamed from: g */
    public String f52028g;

    /* renamed from: h */
    public boolean f52029h;

    /* renamed from: i */
    public long f52030i;

    /* renamed from: j */
    public JSONObject f52031j;

    /* renamed from: k */
    public long f52032k;

    /* renamed from: l */
    public boolean f52033l;

    /* renamed from: m */
    public int f52034m;

    public C19236a() {
        this.f52025d = 1;
        this.f52029h = true;
    }

    /* renamed from: a */
    public final JSONObject mo51040a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("mId", this.f52022a);
            jSONObject.put("mExtValue", this.f52023b);
            jSONObject.put("mLogExtra", this.f52024c);
            jSONObject.put("mDownloadStatus", this.f52025d);
            jSONObject.put("mPackageName", this.f52026e);
            jSONObject.put("mIsAd", this.f52029h);
            jSONObject.put("mTimeStamp", this.f52030i);
            jSONObject.put("mExtras", this.f52031j);
            jSONObject.put("mVersionCode", this.f52027f);
            jSONObject.put("mVersionName", this.f52028g);
            jSONObject.put("mDownloadId", this.f52032k);
            jSONObject.put("mIsV3Event", this.f52033l);
            jSONObject.put("mScene", this.f52034m);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    /* renamed from: a */
    public static JSONObject m63066a(C19236a aVar) {
        if (aVar == null || aVar.f52031j == null) {
            return new JSONObject();
        }
        return aVar.f52031j;
    }

    /* renamed from: a */
    public static C19236a m63065a(JSONObject jSONObject) {
        C19236a aVar = new C19236a();
        try {
            aVar.f52022a = C19390a.m63716a(jSONObject, "mId");
            aVar.f52023b = C19390a.m63716a(jSONObject, "mExtValue");
            aVar.f52024c = jSONObject.optString("mLogExtra");
            aVar.f52025d = jSONObject.optInt("mDownloadStatus");
            aVar.f52026e = jSONObject.optString("mPackageName");
            aVar.f52029h = jSONObject.optBoolean("mIsAd");
            aVar.f52030i = C19390a.m63716a(jSONObject, "mTimeStamp");
            aVar.f52027f = jSONObject.optInt("mVersionCode");
            aVar.f52028g = jSONObject.optString("mVersionName");
            aVar.f52032k = C19390a.m63716a(jSONObject, "mDownloadId");
            aVar.f52033l = jSONObject.getBoolean("mIsV3Event");
            aVar.f52034m = jSONObject.getInt("mScene");
            try {
                aVar.f52031j = jSONObject.optJSONObject("mExtras");
            } catch (Exception unused) {
                aVar.f52031j = null;
            }
        } catch (Exception unused2) {
        }
        return aVar;
    }

    public C19236a(C19387c cVar, boolean z, long j) {
        this.f52025d = 1;
        this.f52029h = true;
        this.f52022a = cVar.mo50995d();
        this.f52023b = cVar.mo50996e();
        this.f52024c = cVar.mo51009r();
        this.f52026e = cVar.mo51010s();
        this.f52030i = System.currentTimeMillis();
        this.f52031j = cVar.mo51013v();
        this.f52029h = cVar.mo51008q();
        this.f52027f = cVar.mo51006o();
        this.f52028g = cVar.mo51007p();
        this.f52032k = j;
        this.f52033l = z;
    }

    public C19236a(long j, String str, boolean z, long j2) {
        this(j, 0, str, false, 0);
    }

    public C19236a(long j, long j2, String str, boolean z, long j3) {
        this.f52025d = 1;
        this.f52029h = true;
        this.f52022a = j;
        this.f52023b = j2;
        this.f52024c = str;
        this.f52030i = System.currentTimeMillis();
        this.f52032k = j3;
        this.f52033l = z;
    }
}
