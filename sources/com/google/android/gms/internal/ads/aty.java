package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;
import com.google.android.gms.internal.ads.axu.C15550e;

public final class aty extends axu<aty, C15536a> implements azc {
    private static volatile azm<aty> zzdu;
    /* access modifiers changed from: private */
    public static final aty zzfnj = new aty();
    public int zzfih;
    private aua zzfni;

    /* renamed from: com.google.android.gms.internal.ads.aty$a */
    public static final class C15536a extends C15546a<aty, C15536a> implements azc {
        private C15536a() {
            super(aty.zzfnj);
        }

        /* renamed from: a */
        public final C15536a mo40043a(int i) {
            mo40291c();
            ((aty) this.f41195a).zzfih = 0;
            return this;
        }

        /* renamed from: a */
        public final C15536a mo40044a(aua aua) {
            mo40291c();
            ((aty) this.f41195a).m47275a(aua);
            return this;
        }

        /* synthetic */ C15536a(atz atz) {
            this();
        }
    }

    private aty() {
    }

    /* renamed from: a */
    public final aua mo40042a() {
        return this.zzfni == null ? aua.m47285b() : this.zzfni;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m47275a(aua aua) {
        if (aua != null) {
            this.zzfni = aua;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static aty m47272a(zzcce zzcce) throws zzcdx {
        return (aty) axu.m47695a(zzfnj, zzcce);
    }

    /* renamed from: b */
    public static C15536a m47276b() {
        return (C15536a) ((C15546a) zzfnj.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (atz.f41030a[i - 1]) {
            case 1:
                return new aty();
            case 2:
                return new C15536a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzfni"};
                return m47701a((aza) zzfnj, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", objArr);
            case 4:
                return zzfnj;
            case 5:
                azm<aty> azm = zzdu;
                if (azm == null) {
                    synchronized (aty.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfnj);
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
        axu.m47703a(aty.class, zzfnj);
    }
}
