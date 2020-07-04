package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;

public final class aru extends axu<aru, C15506a> implements azc {
    private static volatile azm<aru> zzdu;
    /* access modifiers changed from: private */
    public static final aru zzfja = new aru();
    public int zzfir;
    private arw zzfiy;

    /* renamed from: com.google.android.gms.internal.ads.aru$a */
    public static final class C15506a extends C15546a<aru, C15506a> implements azc {
        private C15506a() {
            super(aru.zzfja);
        }

        /* synthetic */ C15506a(arv arv) {
            this();
        }
    }

    private aru() {
    }

    /* renamed from: a */
    public final arw mo39967a() {
        return this.zzfiy == null ? arw.m47044a() : this.zzfiy;
    }

    /* renamed from: a */
    public static aru m47039a(zzcce zzcce) throws zzcdx {
        return (aru) axu.m47695a(zzfja, zzcce);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (arv.f40971a[i - 1]) {
            case 1:
                return new aru();
            case 2:
                return new C15506a(null);
            case 3:
                Object[] objArr = {"zzfiy", "zzfir"};
                return m47701a((aza) zzfja, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", objArr);
            case 4:
                return zzfja;
            case 5:
                azm<aru> azm = zzdu;
                if (azm == null) {
                    synchronized (aru.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfja);
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
    public static aru m47040b() {
        return zzfja;
    }

    static {
        axu.m47703a(aru.class, zzfja);
    }
}
