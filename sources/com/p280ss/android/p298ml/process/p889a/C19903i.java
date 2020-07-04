package com.p280ss.android.p298ml.process.p889a;

import com.p280ss.android.p298ml.process.C6834d;
import com.p280ss.android.p298ml.process.C6835e;
import java.util.List;

/* renamed from: com.ss.android.ml.process.a.i */
public final class C19903i implements C6835e {
    /* renamed from: a */
    public final void mo16695a(C6834d dVar) {
        float[] fArr = dVar.f19458b;
        List oPTs = dVar.f19461e.getOPTs();
        float floatValue = ((Float) oPTs.get(0)).floatValue();
        fArr[0] = (fArr[0] * floatValue) + ((Float) oPTs.get(1)).floatValue();
    }
}
