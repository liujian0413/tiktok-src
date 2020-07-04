package com.bytedance.frameworks.baselib.network.http.retrofit;

import com.bytedance.frameworks.baselib.network.http.C10122c;
import com.bytedance.frameworks.baselib.network.http.C10142f;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p637a.C12462c.C12463a;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;

public class BaseSsInterceptor implements C12469a {
    /* renamed from: a */
    public final C12534t mo10436a(C12470a aVar) throws Exception {
        return C10175a.m30236a(this, aVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo24872a(C12462c cVar, C12534t tVar) throws Exception {
    }

    /* renamed from: a */
    private static String m30227a(String str) {
        try {
            return C10142f.m30097a(str, true);
        } catch (Throwable unused) {
            return str;
        }
    }

    /* renamed from: b */
    public final C12534t mo24873b(C12470a aVar) throws Exception {
        C12462c a = mo24871a(aVar.mo30456a());
        C12534t a2 = aVar.mo30457a(a);
        mo24872a(a, a2);
        return a2;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public C12462c mo24871a(C12462c cVar) {
        String str;
        if (cVar == null) {
            return cVar;
        }
        String str2 = cVar.f33098b;
        if (cVar.f33105i instanceof C10122c) {
            str = C10142f.m30096a(str2, (C10122c) cVar.f33105i);
        } else {
            str = C10142f.m30095a(str2);
        }
        if (cVar.f33104h) {
            str = m30227a(str);
        }
        C12463a a = cVar.mo30443a();
        a.mo30447a(str);
        return a.mo30449a();
    }
}
