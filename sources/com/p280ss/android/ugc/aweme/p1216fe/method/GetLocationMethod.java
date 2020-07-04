package com.p280ss.android.ugc.aweme.p1216fe.method;

import android.app.Activity;
import android.content.Context;
import com.bytedance.ies.ugc.appcontext.C6399b;
import com.p280ss.android.ugc.aweme.app.AwemeApplication;
import com.p280ss.android.ugc.aweme.location.C32616a;
import com.p280ss.android.ugc.aweme.location.C32624f;
import com.p280ss.android.ugc.aweme.location.C32630h;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod;
import com.p280ss.android.ugc.aweme.p1216fe.base.BaseCommonJavaMethod.C27876a;
import com.p280ss.android.ugc.aweme.poi.LocationBundle;
import com.p280ss.android.ugc.aweme.utils.permission.C43152a.C43154a;
import org.json.JSONObject;

/* renamed from: com.ss.android.ugc.aweme.fe.method.GetLocationMethod */
public class GetLocationMethod extends BaseCommonJavaMethod {
    /* renamed from: c */
    public final Context mo71374c() {
        if (this.f73443f != null) {
            return (Context) this.f73443f.get();
        }
        return null;
    }

    /* renamed from: a */
    public static void m91358a(C27876a aVar, LocationBundle locationBundle) throws Exception {
        if (aVar != null) {
            if (locationBundle == null) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("code", 0);
                jSONObject.put("latitude", 0);
                jSONObject.put("longitude", 0);
                aVar.mo71363a((Object) jSONObject);
                return;
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("code", 1);
            jSONObject2.put("latitude", locationBundle.latitude);
            jSONObject2.put("longitude", locationBundle.longitude);
            aVar.mo71363a((Object) jSONObject2);
        }
    }

    /* renamed from: a */
    public final void mo64209a(JSONObject jSONObject, final C27876a aVar) {
        if (C6399b.m19944t()) {
            aVar.mo71362a(-1, "");
            return;
        }
        try {
            if (mo71374c() == null || !(mo71374c() instanceof Activity)) {
                LocationBundle a = C32630h.m105696b(AwemeApplication.m21341a()).mo83993a();
                C32630h.m105696b(C6399b.m19921a()).mo83998b();
                m91358a(aVar, a);
            } else if (!C32616a.m105657e()) {
                C32616a.m105654a((Activity) mo71374c(), (C43154a) new C43154a() {
                    /* renamed from: b */
                    public final void mo71376b() {
                        try {
                            GetLocationMethod.m91358a(aVar, (LocationBundle) null);
                        } catch (Exception unused) {
                        }
                    }

                    /* renamed from: a */
                    public final void mo71375a() {
                        LocationBundle a = C32630h.m105696b(GetLocationMethod.this.mo71374c()).mo83994a((C32624f) null);
                        C32630h.m105696b(GetLocationMethod.this.mo71374c()).mo83998b();
                        if (a != null) {
                            try {
                                GetLocationMethod.m91358a(aVar, a);
                            } catch (Exception unused) {
                            }
                            return;
                        }
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("code", 2);
                        jSONObject.put("latitude", 0);
                        jSONObject.put("longitude", 0);
                        aVar.mo71363a((Object) jSONObject);
                    }
                });
            } else {
                LocationBundle a2 = C32630h.m105696b(mo71374c()).mo83994a((C32624f) null);
                C32630h.m105696b(mo71374c()).mo83998b();
                m91358a(aVar, a2);
            }
        } catch (Exception unused) {
        }
    }
}
