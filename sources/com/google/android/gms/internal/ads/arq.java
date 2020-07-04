package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;

public final class arq extends axu<arq, C15503a> implements azc {
    private static volatile azm<arq> zzdu;
    /* access modifiers changed from: private */
    public static final arq zzfin = new arq();
    private aru zzfil;
    private atf zzfim;

    /* renamed from: com.google.android.gms.internal.ads.arq$a */
    public static final class C15503a extends C15546a<arq, C15503a> implements azc {
        private C15503a() {
            super(arq.zzfin);
        }

        /* synthetic */ C15503a(arr arr) {
            this();
        }
    }

    private arq() {
    }

    /* renamed from: a */
    public final aru mo39961a() {
        return this.zzfil == null ? aru.m47040b() : this.zzfil;
    }

    /* renamed from: b */
    public final atf mo39962b() {
        return this.zzfim == null ? atf.m47199b() : this.zzfim;
    }

    /* renamed from: a */
    public static arq m47020a(zzcce zzcce) throws zzcdx {
        return (arq) axu.m47695a(zzfin, zzcce);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (arr.f40969a[i - 1]) {
            case 1:
                return new arq();
            case 2:
                return new C15503a(null);
            case 3:
                Object[] objArr = {"zzfil", "zzfim"};
                return m47701a((aza) zzfin, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\t", objArr);
            case 4:
                return zzfin;
            case 5:
                azm<arq> azm = zzdu;
                if (azm == null) {
                    synchronized (arq.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfin);
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
        axu.m47703a(arq.class, zzfin);
    }
}
