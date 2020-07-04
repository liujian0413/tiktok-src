package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;

public final class aua extends axu<aua, C15538a> implements azc {
    private static volatile azm<aua> zzdu;
    /* access modifiers changed from: private */
    public static final aua zzfnm = new aua();
    public String zzfnk = "";
    private atm zzfnl;

    /* renamed from: com.google.android.gms.internal.ads.aua$a */
    public static final class C15538a extends C15546a<aua, C15538a> implements azc {
        private C15538a() {
            super(aua.zzfnm);
        }

        /* synthetic */ C15538a(aub aub) {
            this();
        }
    }

    private aua() {
    }

    /* renamed from: a */
    public final atm mo40045a() {
        return this.zzfnl == null ? atm.m47207a() : this.zzfnl;
    }

    /* renamed from: a */
    public static aua m47284a(zzcce zzcce) throws zzcdx {
        return (aua) axu.m47695a(zzfnm, zzcce);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (aub.f41032a[i - 1]) {
            case 1:
                return new aua();
            case 2:
                return new C15538a(null);
            case 3:
                Object[] objArr = {"zzfnk", "zzfnl"};
                return m47701a((aza) zzfnm, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002\t", objArr);
            case 4:
                return zzfnm;
            case 5:
                azm<aua> azm = zzdu;
                if (azm == null) {
                    synchronized (aua.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfnm);
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
    public static aua m47285b() {
        return zzfnm;
    }

    static {
        axu.m47703a(aua.class, zzfnm);
    }
}
