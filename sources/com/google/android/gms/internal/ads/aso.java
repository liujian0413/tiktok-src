package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;

public final class aso extends axu<aso, C15516a> implements azc {
    private static volatile azm<aso> zzdu;
    /* access modifiers changed from: private */
    public static final aso zzfkp = new aso();
    private asq zzfko;

    /* renamed from: com.google.android.gms.internal.ads.aso$a */
    public static final class C15516a extends C15546a<aso, C15516a> implements azc {
        private C15516a() {
            super(aso.zzfkp);
        }

        /* synthetic */ C15516a(asp asp) {
            this();
        }
    }

    private aso() {
    }

    /* renamed from: a */
    public final asq mo39984a() {
        return this.zzfko == null ? asq.m47119d() : this.zzfko;
    }

    /* renamed from: a */
    public static aso m47115a(zzcce zzcce) throws zzcdx {
        return (aso) axu.m47695a(zzfkp, zzcce);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (asp.f40997a[i - 1]) {
            case 1:
                return new aso();
            case 2:
                return new C15516a(null);
            case 3:
                Object[] objArr = {"zzfko"};
                return m47701a((aza) zzfkp, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\t", objArr);
            case 4:
                return zzfkp;
            case 5:
                azm<aso> azm = zzdu;
                if (azm == null) {
                    synchronized (aso.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfkp);
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

    static {
        axu.m47703a(aso.class, zzfkp);
    }
}
