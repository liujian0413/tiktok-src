package com.google.android.gms.internal.ads;

import java.util.Comparator;

final class awn implements Comparator<zzcce> {
    awn() {
    }

    public final /* synthetic */ int compare(Object obj, Object obj2) {
        zzcce zzcce = (zzcce) obj;
        zzcce zzcce2 = (zzcce) obj2;
        aws aws = (aws) zzcce.iterator();
        aws aws2 = (aws) zzcce2.iterator();
        while (aws.hasNext() && aws2.hasNext()) {
            int compare = Integer.compare(zzcce.zzb(aws.mo40111a()), zzcce.zzb(aws2.mo40111a()));
            if (compare != 0) {
                return compare;
            }
        }
        return Integer.compare(zzcce.size(), zzcce2.size());
    }
}
