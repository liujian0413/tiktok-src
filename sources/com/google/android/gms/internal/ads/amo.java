package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14785aq;
import com.google.android.gms.ads.internal.C14816bu;

@C6505uv
public final class amo {
    /* renamed from: a */
    public static agj<ami> m46433a(Context context, zzbgz zzbgz, String str, bdt bdt, C14816bu buVar) {
        agi a = afy.m45817a(null);
        amp amp = new amp(context, bdt, zzbgz, buVar, str);
        return afy.m45819a((agj<A>) a, (aft<? super A, ? extends B>) amp, ago.f40189a);
    }

    /* renamed from: a */
    public static ami m46434a(Context context, anv anv, String str, boolean z, boolean z2, bdt bdt, zzbgz zzbgz, C15600ck ckVar, C14785aq aqVar, C14816bu buVar, bwl bwl) throws zzbnv {
        C15585bw.m50188a(context);
        if (((Boolean) bym.m50299d().mo41272a(C15585bw.f43799at)).booleanValue()) {
            return aoc.m46717a(context, anv, str, z, z2, bdt, zzbgz, ckVar, aqVar, buVar, bwl);
        }
        try {
            amq amq = new amq(context, anv, str, z, z2, bdt, zzbgz, ckVar, aqVar, buVar, bwl);
            return (ami) aet.m45703a(amq);
        } catch (Throwable th) {
            throw new zzbnv("Webview initialization failed.", th);
        }
    }
}
