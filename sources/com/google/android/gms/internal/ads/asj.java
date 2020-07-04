package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;
import com.google.android.gms.internal.ads.axu.C15550e;

public final class asj extends axu<asj, C15514a> implements azc {
    private static volatile azm<asj> zzdu;
    /* access modifiers changed from: private */
    public static final asj zzfjp = new asj();
    public int zzfih;
    public zzcce zzfip = zzcce.zzfuo;

    /* renamed from: com.google.android.gms.internal.ads.asj$a */
    public static final class C15514a extends C15546a<asj, C15514a> implements azc {
        private C15514a() {
            super(asj.zzfjp);
        }

        /* renamed from: a */
        public final C15514a mo39981a(int i) {
            mo40291c();
            ((asj) this.f41195a).zzfih = 0;
            return this;
        }

        /* renamed from: a */
        public final C15514a mo39982a(zzcce zzcce) {
            mo40291c();
            ((asj) this.f41195a).m47107b(zzcce);
            return this;
        }

        /* synthetic */ C15514a(ask ask) {
            this();
        }
    }

    private asj() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m47107b(zzcce zzcce) {
        if (zzcce != null) {
            this.zzfip = zzcce;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static asj m47103a(zzcce zzcce) throws zzcdx {
        return (asj) axu.m47695a(zzfjp, zzcce);
    }

    /* renamed from: a */
    public static C15514a m47102a() {
        return (C15514a) ((C15546a) zzfjp.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (ask.f40995a[i - 1]) {
            case 1:
                return new asj();
            case 2:
                return new C15514a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzfip"};
                return m47701a((aza) zzfjp, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\n", objArr);
            case 4:
                return zzfjp;
            case 5:
                azm<asj> azm = zzdu;
                if (azm == null) {
                    synchronized (asj.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfjp);
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
        axu.m47703a(asj.class, zzfjp);
    }
}
