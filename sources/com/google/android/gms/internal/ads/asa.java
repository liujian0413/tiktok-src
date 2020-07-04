package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;

public final class asa extends axu<asa, C15510a> implements azc {
    private static volatile azm<asa> zzdu;
    /* access modifiers changed from: private */
    public static final asa zzfjf = new asa();
    public int zzfir;
    private asc zzfjd;

    /* renamed from: com.google.android.gms.internal.ads.asa$a */
    public static final class C15510a extends C15546a<asa, C15510a> implements azc {
        private C15510a() {
            super(asa.zzfjf);
        }

        /* synthetic */ C15510a(asb asb) {
            this();
        }
    }

    private asa() {
    }

    /* renamed from: a */
    public final asc mo39978a() {
        return this.zzfjd == null ? asc.m47087a() : this.zzfjd;
    }

    /* renamed from: a */
    public static asa m47083a(zzcce zzcce) throws zzcdx {
        return (asa) axu.m47695a(zzfjf, zzcce);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (asb.f40991a[i - 1]) {
            case 1:
                return new asa();
            case 2:
                return new C15510a(null);
            case 3:
                Object[] objArr = {"zzfjd", "zzfir"};
                return m47701a((aza) zzfjf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", objArr);
            case 4:
                return zzfjf;
            case 5:
                azm<asa> azm = zzdu;
                if (azm == null) {
                    synchronized (asa.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfjf);
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
        axu.m47703a(asa.class, zzfjf);
    }
}
