package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;

public final class asm extends axu<asm, C15515a> implements azc {
    private static volatile azm<asm> zzdu;
    /* access modifiers changed from: private */
    public static final asm zzfkn = new asm();
    private atm zzfkm;

    /* renamed from: com.google.android.gms.internal.ads.asm$a */
    public static final class C15515a extends C15546a<asm, C15515a> implements azc {
        private C15515a() {
            super(asm.zzfkn);
        }

        /* synthetic */ C15515a(asn asn) {
            this();
        }
    }

    private asm() {
    }

    /* renamed from: a */
    public final atm mo39983a() {
        return this.zzfkm == null ? atm.m47207a() : this.zzfkm;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (asn.f40996a[i - 1]) {
            case 1:
                return new asm();
            case 2:
                return new C15515a(null);
            case 3:
                Object[] objArr = {"zzfkm"};
                return m47701a((aza) zzfkn, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\t", objArr);
            case 4:
                return zzfkn;
            case 5:
                azm<asm> azm = zzdu;
                if (azm == null) {
                    synchronized (asm.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfkn);
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
    public static asm m47111b() {
        return zzfkn;
    }

    static {
        axu.m47703a(asm.class, zzfkn);
    }
}
