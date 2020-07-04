package com.bytedance.polaris.browser.p635a.p636a;

import android.app.Activity;
import com.bytedance.polaris.browser.p635a.C12408b;
import com.bytedance.polaris.browser.p635a.C12409c;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.bytedance.polaris.browser.a.a.j */
public final class C12407j implements C12408b {

    /* renamed from: a */
    private final WeakReference<Activity> f32948a;

    /* renamed from: b */
    private final C12396c f32949b;

    /* renamed from: c */
    private boolean f32950c;

    /* renamed from: a */
    public final boolean mo30260a(C12409c cVar, JSONObject jSONObject) {
        return false;
    }

    /* renamed from: a */
    public final void mo30259a() {
        this.f32950c = true;
        m36077a(true);
    }

    /* renamed from: b */
    public final void mo30261b() {
        Activity activity;
        if (this.f32950c) {
            this.f32950c = false;
            if (this.f32948a != null) {
                activity = (Activity) this.f32948a.get();
            } else {
                activity = null;
            }
            if (activity != null && !activity.isFinishing()) {
                m36077a(false);
            }
        }
    }

    /* renamed from: a */
    private void m36077a(boolean z) {
        String str;
        if (this.f32949b != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", "1");
                if (z) {
                    str = "visible";
                } else {
                    str = "invisible";
                }
                this.f32949b.mo30270b(str, jSONObject);
            } catch (Exception unused) {
            }
        }
    }

    public C12407j(WeakReference<Activity> weakReference, C12396c cVar) {
        this.f32948a = weakReference;
        this.f32949b = cVar;
    }
}
