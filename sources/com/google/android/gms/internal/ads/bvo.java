package com.google.android.gms.internal.ads;

import java.util.Comparator;

public final class bvo implements Comparator<bvc> {
    public bvo(bvn bvn) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        bvc bvc = (bvc) obj;
        bvc bvc2 = (bvc) obj2;
        if (bvc.f43691b < bvc2.f43691b) {
            return -1;
        }
        if (bvc.f43691b > bvc2.f43691b) {
            return 1;
        }
        if (bvc.f43690a < bvc2.f43690a) {
            return -1;
        }
        if (bvc.f43690a > bvc2.f43690a) {
            return 1;
        }
        float f = (bvc.f43693d - bvc.f43691b) * (bvc.f43692c - bvc.f43690a);
        float f2 = (bvc2.f43693d - bvc2.f43691b) * (bvc2.f43692c - bvc2.f43690a);
        if (f > f2) {
            return -1;
        }
        if (f < f2) {
            return 1;
        }
        return 0;
    }
}
