package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.c */
public final class C27951c implements C11093e {

    /* renamed from: a */
    public WeakReference<Activity> f73645a;

    /* renamed from: b */
    private C27940a f73646b;

    /* renamed from: c */
    private C11087a f73647c;

    /* renamed from: d */
    private String f73648d;

    /* renamed from: a */
    public final void mo71435a(JSONArray jSONArray) {
        this.f73646b.mo71415a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 1);
            jSONObject.put("msg", "uploadSuccess");
            jSONObject.put("data", jSONArray);
            this.f73647c.mo27030a(this.f73648d, jSONObject);
        } catch (JSONException unused) {
            this.f73647c.mo27030a(this.f73648d, (JSONObject) null);
        }
    }

    public final void call(C11097i iVar, JSONObject jSONObject) throws Exception {
        iVar.f30173f = false;
        this.f73648d = iVar.f30169b;
        this.f73646b.mo71416a(iVar.f30171d);
    }

    public C27951c(Activity activity, C11087a aVar) {
        this.f73647c = aVar;
        this.f73645a = new WeakReference<>(activity);
        this.f73646b = new C27940a(activity) {
            /* renamed from: a */
            public final void mo71400a(final JSONArray jSONArray) {
                Activity activity = (Activity) C27951c.this.f73645a.get();
                if (activity != null) {
                    activity.runOnUiThread(new Runnable() {
                        public final void run() {
                            C27951c.this.mo71435a(jSONArray);
                        }
                    });
                }
            }

            /* renamed from: a */
            public final void mo71399a(final int i, final String str) {
                Activity activity = (Activity) C27951c.this.f73645a.get();
                if (activity != null) {
                    activity.runOnUiThread(new Runnable() {
                        public final void run() {
                            C27951c.this.mo71434a(i, str);
                        }
                    });
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo71434a(int i, String str) {
        this.f73646b.mo71415a();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            jSONObject.put("msg", str);
            jSONObject.put("data", new JSONArray());
            this.f73647c.mo27030a(this.f73648d, jSONObject);
        } catch (JSONException unused) {
            this.f73647c.mo27030a(this.f73648d, (JSONObject) null);
        }
    }
}
