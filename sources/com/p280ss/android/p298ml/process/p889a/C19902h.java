package com.p280ss.android.p298ml.process.p889a;

import com.p280ss.android.p298ml.process.C6831a;
import com.p280ss.android.p298ml.process.C6834d;
import com.p280ss.android.p298ml.process.C6835e;
import java.util.List;

/* renamed from: com.ss.android.ml.process.a.h */
public final class C19902h implements C6835e {
    /* renamed from: a */
    public final void mo16695a(C6834d dVar) {
        float[] fArr = dVar.f19458b;
        C6831a aVar = dVar.f19461e;
        List<String> list = dVar.f19459c;
        List oPTs = aVar.getOPTs();
        List labels = aVar.getLabels();
        if (fArr[0] > ((Float) oPTs.get(0)).floatValue()) {
            list.add(labels.get(1));
        } else {
            list.add(labels.get(0));
        }
    }
}
