package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;

public final class asc extends axu<asc, C15511a> implements azc {
    private static volatile azm<asc> zzdu;
    /* access modifiers changed from: private */
    public static final asc zzfjg = new asc();
    public int zzfjb;

    /* renamed from: com.google.android.gms.internal.ads.asc$a */
    public static final class C15511a extends C15546a<asc, C15511a> implements azc {
        private C15511a() {
            super(asc.zzfjg);
        }

        /* synthetic */ C15511a(asd asd) {
            this();
        }
    }

    private asc() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (asd.f40992a[i - 1]) {
            case 1:
                return new asc();
            case 2:
                return new C15511a(null);
            case 3:
                Object[] objArr = {"zzfjb"};
                return m47701a((aza) zzfjg, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", objArr);
            case 4:
                return zzfjg;
            case 5:
                azm<asc> azm = zzdu;
                if (azm == null) {
                    synchronized (asc.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfjg);
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
    public static asc m47087a() {
        return zzfjg;
    }

    static {
        axu.m47703a(asc.class, zzfjg);
    }
}
