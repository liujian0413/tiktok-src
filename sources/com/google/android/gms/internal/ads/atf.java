package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;

public final class atf extends axu<atf, C15524a> implements azc {
    private static volatile azm<atf> zzdu;
    /* access modifiers changed from: private */
    public static final atf zzfls = new atf();
    public int zzfir;
    private ath zzflq;

    /* renamed from: com.google.android.gms.internal.ads.atf$a */
    public static final class C15524a extends C15546a<atf, C15524a> implements azc {
        private C15524a() {
            super(atf.zzfls);
        }

        /* synthetic */ C15524a(atg atg) {
            this();
        }
    }

    private atf() {
    }

    /* renamed from: a */
    public final ath mo40021a() {
        return this.zzflq == null ? ath.m47203b() : this.zzflq;
    }

    /* renamed from: a */
    public static atf m47198a(zzcce zzcce) throws zzcdx {
        return (atf) axu.m47695a(zzfls, zzcce);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (atg.f41021a[i - 1]) {
            case 1:
                return new atf();
            case 2:
                return new C15524a(null);
            case 3:
                Object[] objArr = {"zzflq", "zzfir"};
                return m47701a((aza) zzfls, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0002\u000b", objArr);
            case 4:
                return zzfls;
            case 5:
                azm<atf> azm = zzdu;
                if (azm == null) {
                    synchronized (atf.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfls);
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
    public static atf m47199b() {
        return zzfls;
    }

    static {
        axu.m47703a(atf.class, zzfls);
    }
}
