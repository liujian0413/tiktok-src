package com.p280ss.android.p298ml.process.p889a;

import com.p280ss.android.p298ml.process.C6833c;
import com.p280ss.android.p298ml.process.C6834d;
import com.p280ss.android.p298ml.process.C6835e;
import java.util.HashMap;

/* renamed from: com.ss.android.ml.process.a.j */
public final class C19904j implements C6835e {
    /* renamed from: a */
    public final void mo16695a(C6834d dVar) {
        HashMap<String, Object> hashMap = dVar.f19457a;
        C6833c cVar = dVar.f19460d;
        for (String str : cVar.getArgs()) {
            Number number = (Number) hashMap.get(str);
            if (number != null) {
                hashMap.put(cVar.getFeature(), Double.valueOf(1.0d / (Math.exp((double) (-number.floatValue())) + 1.0d)));
            }
        }
    }
}
