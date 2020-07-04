package com.google.android.gms.internal.ads;

import com.C1642a;
import com.google.android.gms.internal.ads.atq.C15529b;
import com.google.android.gms.internal.ads.ats.C15531a;
import com.google.android.gms.internal.ads.ats.C15532b;
import com.google.android.gms.internal.ads.zzbwe.zzb;
import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

final class aqh {

    /* renamed from: a */
    private static final Charset f40918a = Charset.forName("UTF-8");

    /* renamed from: a */
    public static ats m46915a(atq atq) {
        C15531a a = ats.m47236a().mo40033a(atq.zzfmu);
        for (C15529b bVar : atq.zzfmv) {
            a.mo40034a((C15532b) ((axu) C15532b.m47244a().mo40038a(bVar.mo40030b().zzflw).mo40036a(bVar.mo40031c()).mo40037a(bVar.mo40032d()).mo40035a(bVar.zzfmz).mo40293e()));
        }
        return (ats) ((axu) a.mo40293e());
    }

    /* renamed from: b */
    public static void m46916b(atq atq) throws GeneralSecurityException {
        int i = atq.zzfmu;
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (C15529b bVar : atq.zzfmv) {
            if (bVar.mo40031c() != zzbwh.DESTROYED) {
                i2++;
                if (!bVar.mo40029a()) {
                    throw new GeneralSecurityException(C1642a.m8034a("key %d has no key data", new Object[]{Integer.valueOf(bVar.zzfmz)}));
                } else if (bVar.mo40032d() == zzbwz.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(C1642a.m8034a("key %d has unknown prefix", new Object[]{Integer.valueOf(bVar.zzfmz)}));
                } else if (bVar.mo40031c() != zzbwh.UNKNOWN_STATUS) {
                    if (bVar.mo40031c() == zzbwh.ENABLED && bVar.zzfmz == i) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    if (bVar.mo40030b().mo42284a() != zzb.ASYMMETRIC_PUBLIC) {
                        z2 = false;
                    }
                } else {
                    throw new GeneralSecurityException(C1642a.m8034a("key %d has unknown status", new Object[]{Integer.valueOf(bVar.zzfmz)}));
                }
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("empty keyset");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
