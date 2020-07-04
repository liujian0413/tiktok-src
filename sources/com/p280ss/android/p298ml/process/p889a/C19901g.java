package com.p280ss.android.p298ml.process.p889a;

import com.p280ss.android.p298ml.process.C6833c;
import com.p280ss.android.p298ml.process.C6834d;
import com.p280ss.android.p298ml.process.C6835e;
import java.util.HashMap;
import java.util.List;

/* renamed from: com.ss.android.ml.process.a.g */
public final class C19901g implements C6835e {
    /* renamed from: a */
    public final void mo16695a(C6834d dVar) {
        float f;
        HashMap<String, Object> hashMap = dVar.f19457a;
        C6833c cVar = dVar.f19460d;
        List labels = cVar.getLabels();
        List args = cVar.getArgs();
        List oPTs = cVar.getOPTs();
        String str = (String) args.get(0);
        int indexOf = labels.indexOf(hashMap.get(str));
        if (indexOf < 0) {
            indexOf = (int) ((Float) oPTs.get(0)).floatValue();
        }
        for (int i = 0; i < labels.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append("#");
            sb.append(i);
            String sb2 = sb.toString();
            if (indexOf == i) {
                f = 1.0f;
            } else {
                f = 0.0f;
            }
            hashMap.put(sb2, Float.valueOf(f));
        }
    }
}
