package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;

public final class atm extends axu<atm, C15526a> implements azc {
    private static volatile azm<atm> zzdu;
    /* access modifiers changed from: private */
    public static final atm zzfmo = new atm();
    public String zzflw = "";
    public zzcce zzflx = zzcce.zzfuo;
    private int zzfmn;

    /* renamed from: com.google.android.gms.internal.ads.atm$a */
    public static final class C15526a extends C15546a<atm, C15526a> implements azc {
        private C15526a() {
            super(atm.zzfmo);
        }

        /* synthetic */ C15526a(atn atn) {
            this();
        }
    }

    private atm() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (atn.f41024a[i - 1]) {
            case 1:
                return new atm();
            case 2:
                return new C15526a(null);
            case 3:
                Object[] objArr = {"zzflw", "zzflx", "zzfmn"};
                return m47701a((aza) zzfmo, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", objArr);
            case 4:
                return zzfmo;
            case 5:
                azm<atm> azm = zzdu;
                if (azm == null) {
                    synchronized (atm.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfmo);
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

    /* renamed from: a */
    public static atm m47207a() {
        return zzfmo;
    }

    static {
        axu.m47703a(atm.class, zzfmo);
    }
}
