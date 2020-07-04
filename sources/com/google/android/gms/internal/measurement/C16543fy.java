package com.google.android.gms.internal.measurement;

import java.util.Comparator;

/* renamed from: com.google.android.gms.internal.measurement.fy */
final class C16543fy implements Comparator<zzte> {
    C16543fy() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzte zzte = (zzte) obj;
        zzte zzte2 = (zzte) obj2;
        C16549gd gdVar = (C16549gd) zzte.iterator();
        C16549gd gdVar2 = (C16549gd) zzte2.iterator();
        while (gdVar.hasNext() && gdVar2.hasNext()) {
            int compare = Integer.compare(zzte.zza(gdVar.mo42753a()), zzte.zza(gdVar2.mo42753a()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzte.size(), zzte2.size());
    }
}
