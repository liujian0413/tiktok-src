package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;

public final class atw extends axu<atw, C15535a> implements azc {
    private static volatile azm<atw> zzdu;
    /* access modifiers changed from: private */
    public static final atw zzfnh = new atw();
    public String zzfng = "";

    /* renamed from: com.google.android.gms.internal.ads.atw$a */
    public static final class C15535a extends C15546a<atw, C15535a> implements azc {
        private C15535a() {
            super(atw.zzfnh);
        }

        /* synthetic */ C15535a(atx atx) {
            this();
        }
    }

    private atw() {
    }

    /* renamed from: a */
    public static atw m47269a(zzcce zzcce) throws zzcdx {
        return (atw) axu.m47695a(zzfnh, zzcce);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (atx.f41029a[i - 1]) {
            case 1:
                return new atw();
            case 2:
                return new C15535a(null);
            case 3:
                Object[] objArr = {"zzfng"};
                return m47701a((aza) zzfnh, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001Ȉ", objArr);
            case 4:
                return zzfnh;
            case 5:
                azm<atw> azm = zzdu;
                if (azm == null) {
                    synchronized (atw.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfnh);
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
    public static atw m47268a() {
        return zzfnh;
    }

    static {
        axu.m47703a(atw.class, zzfnh);
    }
}
