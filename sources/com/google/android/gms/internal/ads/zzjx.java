package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Map;

public final class zzjx extends zzjw {
    private final int responseCode;
    private final Map<String, List<String>> zzaqj;

    public zzjx(int i, Map<String, List<String>> map, bjq bjq) {
        StringBuilder sb = new StringBuilder(26);
        sb.append("Response code: ");
        sb.append(i);
        super(sb.toString(), bjq);
        this.responseCode = i;
        this.zzaqj = map;
    }
}
