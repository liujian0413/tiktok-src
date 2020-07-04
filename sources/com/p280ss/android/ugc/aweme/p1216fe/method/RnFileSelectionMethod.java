package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import android.content.Context;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import java.lang.ref.WeakReference;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.RnFileSelectionMethod */
public class RnFileSelectionMethod extends BaseCommonJavaMethod {

    /* renamed from: a */
    public WeakReference<Activity> f73533a;

    /* renamed from: b */
    private C27940a f73534b;

    /* renamed from: c */
    private C27876a f73535c;

    /* renamed from: a */
    public final void mo71398a(JSONArray jSONArray) {
        this.f73535c.mo71364a(jSONArray, 1, "uploadSuccess");
        this.f73534b.mo71415a();
    }

    public RnFileSelectionMethod(WeakReference<Context> weakReference) {
        Activity activity;
        if (weakReference.get() instanceof Activity) {
            activity = (Activity) weakReference.get();
            this.f73533a = new WeakReference<>(activity);
        } else {
            activity = null;
        }
        this.f73534b = new C27940a(activity) {
            /* renamed from: a */
            public final void mo71400a(final JSONArray jSONArray) {
                Activity activity = (Activity) RnFileSelectionMethod.this.f73533a.get();
                if (activity != null) {
                    activity.runOnUiThread(new Runnable() {
                        public final void run() {
                            RnFileSelectionMethod.this.mo71398a(jSONArray);
                        }
                    });
                }
            }

            /* renamed from: a */
            public final void mo71399a(final int i, final String str) {
                Activity activity = (Activity) RnFileSelectionMethod.this.f73533a.get();
                if (activity != null) {
                    activity.runOnUiThread(new Runnable() {
                        public final void run() {
                            RnFileSelectionMethod.this.mo71397a(i, str);
                        }
                    });
                }
            }
        };
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, C27876a aVar) throws JSONException {
        this.f73535c = aVar;
        this.f73534b.mo71416a(jSONObject);
    }

    /* renamed from: a */
    public final void mo71397a(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("msg", str);
            jSONObject.put("code", i);
            jSONObject.put("data", new JSONArray());
        } catch (JSONException unused) {
        }
        this.f73535c.mo71365a(jSONObject);
        this.f73534b.mo71415a();
    }
}
