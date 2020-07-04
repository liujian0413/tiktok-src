package com.p280ss.android.ugc.aweme.net.cache;

import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;

/* renamed from: com.ss.android.ugc.aweme.net.cache.IesCacheInterceptpr */
public class IesCacheInterceptpr implements C12469a {
    /* renamed from: a */
    public final C12534t mo10436a(C12470a aVar) throws Exception {
        return C34050f.m109636a(this, aVar);
    }

    /* renamed from: b */
    public static C12534t m109628b(C12470a aVar) throws Exception {
        C12462c a = aVar.mo30456a();
        C34049e a2 = C34051g.m109638a(a);
        if (a2 == null) {
            return aVar.mo30457a(a);
        }
        C12534t a3 = C34051g.m109637a(a, aVar, a2);
        if (a3 != null) {
            return a3;
        }
        return aVar.mo30457a(a);
    }
}
