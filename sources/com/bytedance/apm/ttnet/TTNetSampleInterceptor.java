package com.bytedance.apm.ttnet;

import com.bytedance.apm.p241f.p242a.C6195c;
import com.bytedance.apm.util.C6292i;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12461b;
import com.bytedance.retrofit2.p637a.C12462c;
import com.bytedance.retrofit2.p637a.C12462c.C12463a;
import com.bytedance.retrofit2.p638c.C12469a;
import com.bytedance.retrofit2.p638c.C12469a.C12470a;
import java.util.ArrayList;
import java.util.List;

public class TTNetSampleInterceptor implements C12469a {
    /* renamed from: a */
    public final C12534t mo10436a(C12470a aVar) throws Exception {
        return C9638a.m28512a(this, aVar);
    }

    /* renamed from: b */
    public static C12534t m28510b(C12470a aVar) throws Exception {
        C12462c a = aVar.mo30456a();
        ArrayList arrayList = new ArrayList(a.f33099c);
        C12463a a2 = a.mo30443a();
        if (C6292i.m19525a(a.mo30445b("x-tt-trace-log")) && C6195c.m19233b().f18248c && C6195c.m19233b().f18247b == 1) {
            arrayList.add(new C12461b("x-tt-trace-log", "01"));
        }
        return aVar.mo30457a(a2.mo30448a((List<C12461b>) arrayList).mo30449a());
    }
}
