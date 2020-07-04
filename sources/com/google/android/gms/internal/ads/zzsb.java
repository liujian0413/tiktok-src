package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

public final class zzsb extends zzsa {
    private final int responseCode;
    private final Map<String, List<String>> zzaqj;

    public zzsb(int i, Map<String, List<String>> map, brg brg) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("Response code: ");
        sb.append(i);
        super(sb.toString(), brg, 1);
        this.responseCode = i;
        this.zzaqj = map;
    }
}
