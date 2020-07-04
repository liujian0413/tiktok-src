package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class bvf implements Comparator<bvl> {
    bvf(bve bve) {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        bvl bvl = (bvl) obj;
        bvl bvl2 = (bvl) obj2;
        int i = bvl.f43706c - bvl2.f43706c;
        if (i != 0) {
            return i;
        }
        return (int) (bvl.f43704a - bvl2.f43704a);
    }
}
