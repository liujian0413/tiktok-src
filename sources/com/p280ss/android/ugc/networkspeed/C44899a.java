package com.p280ss.android.ugc.networkspeed;

import com.p280ss.android.ugc.networkspeed.C44903d.C44904a;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.networkspeed.a */
public final class C44899a implements C44904a {

    /* renamed from: a */
    private double f115467a = -1.0d;

    /* renamed from: a */
    public final double mo86732a(Queue<C44905e> queue, C44905e[] eVarArr) {
        return mo86733b(queue, eVarArr);
    }

    /* renamed from: b */
    public final double mo86733b(Queue<C44905e> queue, C44905e[] eVarArr) {
        if (queue.size() <= 0) {
            return -1.0d;
        }
        queue.toArray(eVarArr);
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < queue.size(); i2++) {
            double d = (double) i;
            double d2 = eVarArr[i2].f115484c;
            Double.isNaN(d);
            i = (int) (d + d2);
            j += eVarArr[i2].f115485d;
        }
        double d3 = (double) i;
        Double.isNaN(d3);
        double d4 = d3 * 8.0d;
        double d5 = (double) j;
        Double.isNaN(d5);
        double d6 = d4 / (d5 / 1000.0d);
        if (d6 >= 0.0d) {
            this.f115467a = d6;
            return d6;
        }
        throw new IllegalArgumentException();
    }
}
