package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;

public final class arw extends axu<arw, C15507a> implements azc {
    private static volatile azm<arw> zzdu;
    /* access modifiers changed from: private */
    public static final arw zzfjc = new arw();
    public int zzfjb;

    /* renamed from: com.google.android.gms.internal.ads.arw$a */
    public static final class C15507a extends C15546a<arw, C15507a> implements azc {
        private C15507a() {
            super(arw.zzfjc);
        }

        /* synthetic */ C15507a(arx arx) {
            this();
        }
    }

    private arw() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (arx.f40972a[i - 1]) {
            case 1:
                return new arw();
            case 2:
                return new C15507a(null);
            case 3:
                Object[] objArr = {"zzfjb"};
                return m47701a((aza) zzfjc, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u000b", objArr);
            case 4:
                return zzfjc;
            case 5:
                azm<arw> azm = zzdu;
                if (azm == null) {
                    synchronized (arw.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfjc);
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
    public static arw m47044a() {
        return zzfjc;
    }

    static {
        axu.m47703a(arw.class, zzfjc);
    }
}
