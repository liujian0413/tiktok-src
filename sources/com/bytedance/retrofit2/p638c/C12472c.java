package com.bytedance.retrofit2.p638c;

import android.os.SystemClock;
import com.bytedance.frameworks.baselib.network.http.C10104a;
import com.bytedance.retrofit2.C12520r;
import com.bytedance.retrofit2.C12534t;
import com.bytedance.retrofit2.p637a.C12462c;
import com.p280ss.android.ugc.aweme.feed.C28062aa;
import com.p280ss.android.ugc.aweme.p759ac.C15459b;
import com.p280ss.android.ugc.aweme.p759ac.C15460c;

/* renamed from: com.bytedance.retrofit2.c.c */
final class C12472c {
    /* renamed from: a */
    static C12534t m36293a(C12471b bVar, C12462c cVar) throws Exception {
        C12520r rVar = bVar.f33125b;
        if (!(rVar instanceof C15459b)) {
            C12520r bVar2 = new C15459b(rVar.f33205a, rVar.f33206b);
            bVar.f33125b = bVar2;
            rVar = bVar2;
        }
        C12534t b = bVar.mo30459b(cVar);
        if (Integer.valueOf(bVar.f33124a).intValue() == 0 && b.f33301a != null && (b.f33301a.f33123f instanceof C10104a)) {
            C10104a aVar = (C10104a) b.f33301a.f33123f;
            if (aVar.f27505h > 0 && (rVar instanceof C15459b)) {
                C15459b bVar3 = (C15459b) rVar;
                bVar3.f39784x = System.currentTimeMillis();
                bVar3.f39785y = SystemClock.uptimeMillis() - bVar3.f39786z;
                C15460c.m45270a(cVar.f33098b, aVar, bVar3);
                C28062aa.m91698a().mo71509a(cVar, aVar, bVar3);
            }
        }
        return b;
    }
}
