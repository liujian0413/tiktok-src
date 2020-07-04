package com.bytedance.frameworks.baselib.network.http.retrofit;

import com.bytedance.frameworks.baselib.network.http.C10142f;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p637a.C12462c.C12463a;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;

public final class RequestVertifyInterceptor implements C12469a {
    /* renamed from: a */
    public final C12534t mo10436a(C12470a aVar) throws Exception {
        return C10179b.m30245a(this, aVar);
    }

    /* renamed from: a */
    private C12462c m30232a(C12462c cVar) {
        if (cVar != null && !cVar.f33102f) {
            return m30233b(cVar);
        }
        return cVar;
    }

    /* renamed from: b */
    public final C12534t mo24874b(C12470a aVar) throws Exception {
        return aVar.mo30457a(m30232a(aVar.mo30456a()));
    }

    /* renamed from: b */
    private static C12462c m30233b(C12462c cVar) {
        try {
            String a = C10142f.m30098a(cVar.f33098b, cVar.f33104h, cVar.f33100d);
            C12463a a2 = cVar.mo30443a();
            a2.mo30447a(a);
            return a2.mo30449a();
        } catch (Throwable unused) {
            return cVar;
        }
    }
}
