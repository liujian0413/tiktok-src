package com.p280ss.android.ugc.networkspeed;

import com.p280ss.android.ugc.networkspeed.C44903d.C44904a;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.networkspeed.b */
public final class C44900b implements C44904a {

    /* renamed from: a */
    private double f115468a = -1.0d;

    /* renamed from: a */
    public final double mo86732a(Queue<C44905e> queue, C44905e[] eVarArr) {
        return mo86733b(queue, eVarArr);
    }

    /* renamed from: b */
    public final double mo86733b(Queue<C44905e> queue, C44905e[] eVarArr) {
        double d = -1.0d;
        if (queue.size() <= 0) {
            return -1.0d;
        }
        queue.toArray(eVarArr);
        int i = 0;
        Arrays.sort(eVarArr, 0, queue.size());
        int size = queue.size();
        double d2 = 0.0d;
        for (int i2 = 0; i2 < size; i2++) {
            d2 += eVarArr[i2].f115484c;
        }
        double d3 = d2 / 2.0d;
        while (true) {
            if (i >= size) {
                break;
            }
            d3 -= eVarArr[i].f115484c;
            if (d3 <= 0.0d) {
                d = eVarArr[i].f115483b;
                break;
            }
            i++;
        }
        if (d >= 0.0d) {
            this.f115468a = d;
            return d;
        }
        throw new IllegalArgumentException();
    }
}
