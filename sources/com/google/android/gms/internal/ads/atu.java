package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;
import com.google.android.gms.internal.ads.axu.C15550e;

public final class atu extends axu<atu, C15534a> implements azc {
    private static volatile azm<atu> zzdu;
    /* access modifiers changed from: private */
    public static final atu zzfnf = new atu();
    public int zzfih;
    private atw zzfne;

    /* renamed from: com.google.android.gms.internal.ads.atu$a */
    public static final class C15534a extends C15546a<atu, C15534a> implements azc {
        private C15534a() {
            super(atu.zzfnf);
        }

        /* renamed from: a */
        public final C15534a mo40040a(int i) {
            mo40291c();
            ((atu) this.f41195a).zzfih = 0;
            return this;
        }

        /* renamed from: a */
        public final C15534a mo40041a(atw atw) {
            mo40291c();
            ((atu) this.f41195a).m47261a(atw);
            return this;
        }

        /* synthetic */ C15534a(atv atv) {
            this();
        }
    }

    private atu() {
    }

    /* renamed from: a */
    public final atw mo40039a() {
        return this.zzfne == null ? atw.m47268a() : this.zzfne;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m47261a(atw atw) {
        if (atw != null) {
            this.zzfne = atw;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static atu m47258a(zzcce zzcce) throws zzcdx {
        return (atu) axu.m47695a(zzfnf, zzcce);
    }

    /* renamed from: b */
    public static C15534a m47262b() {
        return (C15534a) ((C15546a) zzfnf.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (atv.f41028a[i - 1]) {
            case 1:
                return new atu();
            case 2:
                return new C15534a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzfne"};
                return m47701a((aza) zzfnf, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", objArr);
            case 4:
                return zzfnf;
            case 5:
                azm<atu> azm = zzdu;
                if (azm == null) {
                    synchronized (atu.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfnf);
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
        axu.m47703a(atu.class, zzfnf);
    }
}
