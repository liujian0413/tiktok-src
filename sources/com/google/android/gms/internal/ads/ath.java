package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;

public final class ath extends axu<ath, C15525a> implements azc {
    private static volatile azm<ath> zzdu;
    /* access modifiers changed from: private */
    public static final ath zzflv = new ath();
    private int zzflt;
    public int zzflu;

    /* renamed from: com.google.android.gms.internal.ads.ath$a */
    public static final class C15525a extends C15546a<ath, C15525a> implements azc {
        private C15525a() {
            super(ath.zzflv);
        }

        /* synthetic */ C15525a(ati ati) {
            this();
        }
    }

    private ath() {
    }

    /* renamed from: a */
    public final zzbvw mo40022a() {
        zzbvw zzeh = zzbvw.zzeh(this.zzflt);
        return zzeh == null ? zzbvw.UNRECOGNIZED : zzeh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (ati.f41022a[i - 1]) {
            case 1:
                return new ath();
            case 2:
                return new C15525a(null);
            case 3:
                Object[] objArr = {"zzflt", "zzflu"};
                return m47701a((aza) zzflv, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\f\u0002\u000b", objArr);
            case 4:
                return zzflv;
            case 5:
                azm<ath> azm = zzdu;
                if (azm == null) {
                    synchronized (ath.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzflv);
                            zzdu = azm;
                        }
                    }
                }
                return azm;
            case 6:
                return Byte.valueOf(1);
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* renamed from: b */
    public static ath m47203b() {
        return zzflv;
    }

    static {
        axu.m47703a(ath.class, zzflv);
    }
}
