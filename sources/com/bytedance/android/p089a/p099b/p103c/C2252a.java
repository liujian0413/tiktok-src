package com.bytedance.android.p089a.p099b.p103c;

import android.os.SystemClock;
import com.bytedance.android.p089a.p090a.p096f.C2226b;
import com.bytedance.android.p089a.p090a.p098h.C2231b;
import com.bytedance.android.p089a.p099b.p100a.C2239a;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.b.c.a */
public final class C2252a extends C2226b {

    /* renamed from: a */
    public C2254a f7517a;

    /* renamed from: b */
    public long f7518b;

    /* renamed from: c */
    public boolean f7519c;

    /* renamed from: d */
    public int f7520d;

    /* renamed from: e */
    public C2239a f7521e;

    /* renamed from: g */
    private List<String> f7522g;

    /* renamed from: h */
    private List<String> f7523h;

    /* renamed from: i */
    private List<String> f7524i;

    /* renamed from: com.bytedance.android.a.b.c.a$a */
    public static final class C2254a {

        /* renamed from: a */
        public boolean f7525a = true;

        /* renamed from: b */
        public int f7526b;

        /* renamed from: c */
        public C2239a f7527c;

        /* renamed from: a */
        public final C2252a mo7995a() {
            return new C2252a(this);
        }

        /* renamed from: a */
        public final C2254a mo7992a(int i) {
            this.f7526b = i;
            return this;
        }

        /* renamed from: a */
        public final C2254a mo7993a(C2239a aVar) {
            this.f7527c = aVar;
            return this;
        }

        /* renamed from: a */
        public final C2254a mo7994a(boolean z) {
            this.f7525a = z;
            return this;
        }
    }

    /* renamed from: a */
    public final List<String> mo7990a() {
        if (this.f7524i == null) {
            this.f7524i = new ArrayList();
        }
        return this.f7524i;
    }

    /* renamed from: a */
    public final List<String> mo7991a(boolean z) {
        List<String> list;
        if (z) {
            list = this.f7522g;
        } else {
            list = this.f7523h;
        }
        if (list != null) {
            return list;
        }
        return new ArrayList();
    }

    private C2252a(C2254a aVar) {
        this.f7522g = new ArrayList();
        this.f7523h = new ArrayList();
        this.f7524i = new ArrayList();
        this.f7517a = aVar;
        this.f7486f = aVar.f7525a;
        this.f7520d = aVar.f7526b;
        this.f7521e = aVar.f7527c;
        this.f7518b = SystemClock.uptimeMillis();
        this.f7523h = new ArrayList();
        this.f7523h = new ArrayList(24);
        this.f7523h.add("__MAC__");
        this.f7523h.add("{MAC}");
        this.f7523h.add("__MAC1__");
        this.f7523h.add("{MAC1}");
        this.f7523h.add("__ANDROIDID__");
        this.f7523h.add("{ANDROIDID}");
        this.f7523h.add("__ANDROIDID1__");
        this.f7523h.add("{ANDROIDID1}");
        this.f7523h.add("__IMEI__");
        this.f7523h.add("{IMEI}");
        this.f7523h.add("__AAID__");
        this.f7523h.add("{AAID}");
        this.f7523h.add("__OPENUDID__");
        this.f7523h.add("{OPENUDID}");
        this.f7523h.add("__OS__");
        this.f7523h.add("{OS}");
        this.f7523h.add("__IP__");
        this.f7523h.add("{IP}");
        this.f7523h.add("__LBS__");
        this.f7523h.add("{LBS}");
        this.f7523h.add("__GEO__");
        this.f7523h.add("{GEO}");
        this.f7523h.add("__UA__");
        this.f7523h.add("{UA}");
    }

    /* renamed from: a */
    public final void mo7963a(JSONObject jSONObject) {
        super.mo7963a(jSONObject);
        if (jSONObject != null) {
            try {
                this.f7519c = jSONObject.optBoolean("store_when_offline", false);
                this.f7520d = jSONObject.optInt("android_store_impl", 0);
                ArrayList arrayList = new ArrayList();
                arrayList.add("__IDFA__");
                arrayList.add("{IDFA}");
                arrayList.add("__UDID__");
                arrayList.add("{UDID}");
                if (this.f7522g == null) {
                    this.f7522g = new ArrayList();
                }
                this.f7522g.clear();
                JSONArray optJSONArray = jSONObject.optJSONArray("macro_standard");
                if (optJSONArray != null) {
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        Object obj = optJSONArray.get(i);
                        if (obj instanceof String) {
                            this.f7522g.add((String) obj);
                        }
                    }
                }
                this.f7522g.removeAll(arrayList);
                if (this.f7523h == null) {
                    this.f7523h = new ArrayList();
                }
                this.f7523h.clear();
                JSONArray optJSONArray2 = jSONObject.optJSONArray("macro_non_standard");
                if (optJSONArray2 != null) {
                    for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                        Object obj2 = optJSONArray2.get(i2);
                        if (obj2 instanceof String) {
                            this.f7523h.add((String) obj2);
                        }
                    }
                }
                this.f7523h.removeAll(arrayList);
                if (this.f7524i == null) {
                    this.f7524i = new ArrayList();
                }
                this.f7524i.clear();
                JSONArray optJSONArray3 = jSONObject.optJSONArray("macro_blacklist");
                if (optJSONArray3 != null) {
                    for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                        Object obj3 = optJSONArray3.get(i3);
                        if (obj3 instanceof String) {
                            this.f7524i.add((String) obj3);
                        }
                    }
                }
            } catch (Throwable th) {
                C2231b.m9595a();
                th.getMessage();
            }
            this.f7518b = SystemClock.uptimeMillis();
        }
    }
}
