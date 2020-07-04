package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14809bn;
import java.util.Arrays;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.kv */
final class C15828kv {

    /* renamed from: a */
    private final Object[] f44560a;

    C15828kv(zzyv zzyv, String str, int i) {
        this.f44560a = C14809bn.m42978a((String) bym.m50299d().mo41272a(C15585bw.f43768aO), zzyv, str, i, null);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C15828kv)) {
            return false;
        }
        return Arrays.equals(this.f44560a, ((C15828kv) obj).f44560a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f44560a);
    }

    public final String toString() {
        String arrays = Arrays.toString(this.f44560a);
        StringBuilder sb = new StringBuilder(String.valueOf(arrays).length() + 24);
        sb.append("[InterstitialAdPoolKey ");
        sb.append(arrays);
        sb.append("]");
        return sb.toString();
    }
}
