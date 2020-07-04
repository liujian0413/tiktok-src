package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;

public final class asz extends axu<asz, C15521a> implements azc {
    private static volatile azm<asz> zzdu;
    /* access modifiers changed from: private */
    public static final asz zzflj = new asz();

    /* renamed from: com.google.android.gms.internal.ads.asz$a */
    public static final class C15521a extends C15546a<asz, C15521a> implements azc {
        private C15521a() {
            super(asz.zzflj);
        }

        /* synthetic */ C15521a(ata ata) {
            this();
        }
    }

    private asz() {
    }

    /* renamed from: a */
    public static asz m47161a(zzcce zzcce) throws zzcdx {
        return (asz) axu.m47695a(zzflj, zzcce);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (ata.f41019a[i - 1]) {
            case 1:
                return new asz();
            case 2:
                return new C15521a(null);
            case 3:
                return m47701a((aza) zzflj, "\u0000\u0000", (Object[]) null);
            case 4:
                return zzflj;
            case 5:
                azm<asz> azm = zzdu;
                if (azm == null) {
                    synchronized (asz.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzflj);
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
        axu.m47703a(asz.class, zzflj);
    }
}
