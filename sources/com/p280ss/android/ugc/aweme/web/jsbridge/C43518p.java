package com.p280ss.android.ugc.aweme.web.jsbridge;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.bytedance.ies.web.p582a.C11087a;
import com.bytedance.ies.web.p582a.C11093e;
import com.bytedance.ies.web.p582a.C11097i;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.location.C32616a;
import com.p280ss.android.ugc.aweme.location.C32624f;
import com.p280ss.android.ugc.aweme.location.C32630h;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a.C43154a;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.web.jsbridge.p */
public final class C43518p implements C11093e {

    /* renamed from: a */
    protected WeakReference<Context> f112676a;

    /* renamed from: b */
    public C11087a f112677b;

    /* renamed from: c */
    public String f112678c;

    /* renamed from: a */
    public final Context mo105427a() {
        if (this.f112676a != null) {
            return (Context) this.f112676a.get();
        }
        return null;
    }

    public C43518p(WeakReference<Context> weakReference, C11087a aVar) {
        this.f112676a = weakReference;
        this.f112677b = aVar;
    }

    /* renamed from: b */
    private static void m137992b(JSONObject jSONObject, LocationBundle locationBundle) throws Exception {
        if (locationBundle == null) {
            jSONObject.put("code", 0);
            jSONObject.put("latitude", 0.0d);
            jSONObject.put("longitude", 0.0d);
            return;
        }
        jSONObject.put("code", 1);
        jSONObject.put("latitude", locationBundle.latitude);
        jSONObject.put("longitude", locationBundle.longitude);
    }

    /* renamed from: a */
    public final void mo105428a(JSONObject jSONObject, LocationBundle locationBundle) throws Exception {
        if (locationBundle == null) {
            jSONObject.put("code", 0);
            jSONObject.put("latitude", 0.0d);
            jSONObject.put("longitude", 0.0d);
        } else {
            jSONObject.put("code", 1);
            jSONObject.put("latitude", locationBundle.latitude);
            jSONObject.put("longitude", locationBundle.longitude);
        }
        if (this.f112677b != null) {
            this.f112677b.mo27030a(this.f112678c, jSONObject);
        }
    }

    public final void call(C11097i iVar, final JSONObject jSONObject) throws Exception {
        if (C6399b.m19944t() || iVar == null) {
            m137992b(jSONObject, null);
            return;
        }
        this.f112678c = iVar.f30169b;
        if (mo105427a() == null || !(mo105427a() instanceof Activity)) {
            LocationBundle a = C32630h.m105696b(AwemeApplication.m21341a()).mo83993a();
            C32630h.m105696b(C6399b.m19921a()).mo83998b();
            m137992b(jSONObject, a);
        } else if (!C32616a.m105657e()) {
            C32616a.m105654a((Activity) mo105427a(), (C43154a) new C43154a() {
                /* renamed from: b */
                public final void mo71376b() {
                    try {
                        C43518p.this.mo105428a(new JSONObject(), null);
                    } catch (Exception unused) {
                    }
                }

                /* renamed from: a */
                public final void mo71375a() {
                    LocationBundle a = C32630h.m105696b(C43518p.this.mo105427a()).mo83994a((C32624f) null);
                    C32630h.m105696b(C43518p.this.mo105427a()).mo83998b();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (a != null) {
                            C43518p.this.mo105428a(jSONObject, a);
                            return;
                        }
                        jSONObject.put("code", 2);
                        jSONObject.put("latitude", 0);
                        jSONObject.put("longitude", 0);
                        if (C43518p.this.f112677b != null) {
                            C43518p.this.f112677b.mo27030a(C43518p.this.f112678c, jSONObject);
                        }
                    } catch (Exception unused) {
                    }
                }
            });
        } else {
            LocationBundle a2 = C32630h.m105696b(mo105427a()).mo83994a((C32624f) null);
            C32630h.m105696b(mo105427a()).mo83998b();
            m137992b(jSONObject, a2);
        }
    }
}
