package com.bytedance.android.p089a.p090a.p096f;

import android.text.TextUtils;
import com.bytedance.android.p089a.p090a.p098h.C2231b;
import com.bytedance.android.p089a.p090a.p098h.C2234e;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: com.bytedance.android.a.a.f.a */
public final class C2223a extends C2226b {

    /* renamed from: a */
    public C2225a f7475a;

    /* renamed from: b */
    public boolean f7476b;

    /* renamed from: c */
    public boolean f7477c;

    /* renamed from: d */
    public String f7478d;

    /* renamed from: e */
    public String f7479e;

    /* renamed from: g */
    private Map<String, JSONObject> f7480g;

    /* renamed from: com.bytedance.android.a.a.f.a$a */
    public static final class C2225a {

        /* renamed from: a */
        public boolean f7481a;

        /* renamed from: b */
        public boolean f7482b;

        /* renamed from: c */
        public boolean f7483c;

        /* renamed from: d */
        public String f7484d;

        /* renamed from: e */
        public JSONObject f7485e;

        /* renamed from: a */
        public final C2223a mo7967a() {
            if (this.f7485e == null) {
                this.f7485e = new JSONObject();
            }
            return new C2223a(this);
        }

        /* renamed from: a */
        public final C2225a mo7964a(String str) {
            this.f7484d = str;
            return this;
        }

        /* renamed from: b */
        public final C2225a mo7968b(boolean z) {
            this.f7483c = z;
            return this;
        }

        /* renamed from: a */
        public final C2225a mo7965a(JSONObject jSONObject) {
            this.f7485e = jSONObject;
            return this;
        }

        /* renamed from: a */
        public final C2225a mo7966a(boolean z) {
            this.f7482b = false;
            return this;
        }
    }

    /* renamed from: a */
    public final JSONObject mo7962a(String str) {
        if (this.f7480g == null) {
            this.f7480g = new HashMap();
        }
        return (JSONObject) this.f7480g.get(str);
    }

    private C2223a(C2225a aVar) {
        this.f7479e = "";
        this.f7475a = aVar;
        this.f7486f = aVar.f7481a;
        this.f7476b = aVar.f7482b;
        this.f7477c = aVar.f7483c;
        this.f7478d = C2234e.m9614c(aVar.f7484d);
        mo7963a(aVar.f7485e);
    }

    /* renamed from: a */
    public final void mo7963a(JSONObject jSONObject) {
        super.mo7963a(jSONObject);
        if (jSONObject != null) {
            try {
                this.f7479e = jSONObject.optString("appid", "");
                if (this.f7480g == null) {
                    this.f7480g = new HashMap();
                }
                this.f7480g.clear();
                JSONObject optJSONObject = jSONObject.optJSONObject("settings");
                if (optJSONObject != null) {
                    Iterator keys = optJSONObject.keys();
                    while (keys.hasNext()) {
                        String str = (String) keys.next();
                        if (!TextUtils.isEmpty(str)) {
                            JSONObject optJSONObject2 = optJSONObject.optJSONObject(str);
                            if (optJSONObject2 != null) {
                                this.f7480g.put(str, optJSONObject2);
                            }
                        }
                    }
                }
            } catch (Throwable th) {
                C2231b.m9595a();
                th.getMessage();
            }
        }
    }
}
