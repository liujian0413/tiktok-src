package com.facebook.keyframes.model.keyframedmodels;

import android.view.animation.Interpolator;
import com.facebook.keyframes.p733b.C14012d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* renamed from: com.facebook.keyframes.model.keyframedmodels.a */
public final class C14056a {
    /* renamed from: a */
    public static List<Interpolator> m41434a(float[][][] fArr) {
        if (fArr == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        for (float[][] fArr2 : fArr) {
            arrayList.add(new C14012d(fArr2[0][0], fArr2[0][1], fArr2[1][0], fArr2[1][1]));
        }
        return Collections.unmodifiableList(arrayList);
    }
}
