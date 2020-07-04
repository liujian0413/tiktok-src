package com.bytedance.crash.p501j.p502a;

import android.content.Context;
import com.bytedance.crash.C9918j;
import com.bytedance.crash.CrashType;
import com.bytedance.crash.p497f.C9896a;
import com.bytedance.crash.p497f.C9898c;
import com.bytedance.crash.p500i.C9915a;
import com.bytedance.crash.p504l.C9996p;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.bytedance.crash.j.a.k */
final class C9936k extends C9924c {
    /* renamed from: a */
    public final C9896a mo24545a(int i, C9896a aVar) {
        JSONObject jSONObject;
        C9896a a = super.mo24545a(i, aVar);
        if (a.f26984a.length() > 0) {
            JSONObject jSONObject2 = a.f26984a;
            C9896a aVar2 = new C9896a();
            jSONObject = jSONObject2;
            a = aVar2;
        } else {
            jSONObject = new JSONObject();
        }
        if (i != 5) {
            switch (i) {
                case 0:
                    C9898c a2 = C9898c.m29248a(this.f27098b);
                    a2.mo24509a(C9918j.m29332a().mo24525a());
                    a.mo24484a(a2);
                    C9996p.m29627a(jSONObject, a2, this.f27097a);
                    break;
                case 1:
                    C9898c g = a.mo24506g();
                    g.mo24508a(C9918j.m29338c().mo24593a());
                    g.mo24507a(C9918j.m29332a().mo24530f());
                    break;
                case 2:
                    C9898c.m29250a(a.mo24506g());
                    try {
                        a.mo24506g().f26992a.put("launch_did", C9915a.m29325a(this.f27098b));
                        break;
                    } catch (Throwable unused) {
                        break;
                    }
            }
        } else {
            C9898c.m29253b(a.mo24506g());
        }
        a.mo24492a("data", (Object) new JSONArray().put(jSONObject));
        return a;
    }

    C9936k(Context context, C9921b bVar, C9926d dVar) {
        super(CrashType.LAUNCH, context, bVar, dVar);
    }
}
