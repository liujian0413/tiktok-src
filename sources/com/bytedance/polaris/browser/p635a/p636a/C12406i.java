package com.bytedance.polaris.browser.p635a.p636a;

import android.app.Activity;
import com.bytedance.polaris.browser.p635a.C12408b;
import com.bytedance.polaris.browser.p635a.C12409c;
import com.bytedance.polaris.browser.p635a.p636a.C12396c.C12397a;
import com.bytedance.polaris.depend.C12424e;
import com.bytedance.polaris.depend.C12428i;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.browser.a.a.i */
public final class C12406i implements C12408b {

    /* renamed from: a */
    private final C12397a f32945a;

    /* renamed from: b */
    private final WeakReference<Activity> f32946b;

    /* renamed from: c */
    private boolean f32947c;

    /* renamed from: a */
    public final boolean mo30260a(C12409c cVar, JSONObject jSONObject) {
        return false;
    }

    /* renamed from: a */
    public final void mo30259a() {
        this.f32947c = true;
        C12424e i = C12428i.m36159i();
        if (i == null || !i.mo30325d()) {
            m36073a(true, false);
        }
    }

    /* renamed from: b */
    public final void mo30261b() {
        Activity activity;
        if (this.f32947c) {
            this.f32947c = false;
            if (this.f32946b != null) {
                activity = (Activity) this.f32946b.get();
            } else {
                activity = null;
            }
            if (activity != null && !activity.isFinishing()) {
                m36073a(false, false);
            }
        }
    }

    public C12406i(WeakReference<Activity> weakReference, C12397a aVar) {
        this.f32946b = weakReference;
        this.f32945a = aVar;
    }

    /* renamed from: a */
    private void m36073a(boolean z, boolean z2) {
        String str;
        if (this.f32945a != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", "1");
                jSONObject.put("from_tab", false);
                if (z) {
                    str = "visible";
                } else {
                    str = "invisible";
                }
                this.f32945a.mo30297b(str, jSONObject);
            } catch (Exception unused) {
            }
        }
    }
}
