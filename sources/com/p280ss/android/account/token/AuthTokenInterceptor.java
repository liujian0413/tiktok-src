package com.p280ss.android.account.token;

import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.account.token.AuthTokenInterceptor */
public class AuthTokenInterceptor implements C12469a {
    /* renamed from: a */
    public final C12534t mo10436a(C12470a aVar) throws Exception {
        return C18904e.m61713a(this, aVar);
    }

    /* renamed from: b */
    public static C12534t m61678b(C12470a aVar) throws Exception {
        C12462c a = aVar.mo30456a();
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(a.f33099c);
        C18900c.m61696a(a.f33098b, (List<C12461b>) arrayList);
        C12534t a2 = aVar.mo30457a(a.mo30443a().mo30448a((List<C12461b>) arrayList).mo30449a());
        C18900c.m61697b(a.f33098b, a2.mo30511b());
        return a2;
    }
}
