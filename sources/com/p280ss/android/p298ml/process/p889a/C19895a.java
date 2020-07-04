package com.p280ss.android.p298ml.process.p889a;

import com.p280ss.android.p298ml.process.C6833c;
import com.p280ss.android.p298ml.process.C6834d;
import com.p280ss.android.p298ml.process.C6835e;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ml.process.a.a */
public final class C19895a implements C6835e {
    /* renamed from: a */
    public final void mo16695a(C6834d dVar) {
        float f;
        HashMap<String, Object> hashMap = dVar.f19457a;
        C6833c cVar = dVar.f19460d;
        List args = cVar.getArgs();
        Number number = (Number) hashMap.get(args.get(0));
        Number number2 = (Number) hashMap.get(args.get(1));
        float f2 = 0.0f;
        if (number != null) {
            f = number.floatValue();
        } else {
            f = 0.0f;
        }
        if (number2 != null) {
            f2 = number2.floatValue();
        }
        hashMap.put(cVar.getFeature(), Float.valueOf(f / f2));
    }
}
