package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;

public final class ash extends axu<ash, C15513a> implements azc {
    private static volatile azm<ash> zzdu;
    /* access modifiers changed from: private */
    public static final ash zzfjm = new ash();
    public int zzfir;

    /* renamed from: com.google.android.gms.internal.ads.ash$a */
    public static final class C15513a extends C15546a<ash, C15513a> implements azc {
        private C15513a() {
            super(ash.zzfjm);
        }

        /* synthetic */ C15513a(asi asi) {
            this();
        }
    }

    private ash() {
    }

    /* renamed from: a */
    public static ash m47100a(zzcce zzcce) throws zzcdx {
        return (ash) axu.m47695a(zzfjm, zzcce);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (asi.f40994a[i - 1]) {
            case 1:
                return new ash();
            case 2:
                return new C15513a(null);
            case 3:
                Object[] objArr = {"zzfir"};
                return m47701a((aza) zzfjm, "\u0000\u0001\u0000\u0000\u0002\u0002\u0001\u0000\u0000\u0000\u0002\u000b", objArr);
            case 4:
                return zzfjm;
            case 5:
                azm<ash> azm = zzdu;
                if (azm == null) {
                    synchronized (ash.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfjm);
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
        axu.m47703a(ash.class, zzfjm);
    }
}
