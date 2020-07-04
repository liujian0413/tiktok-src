package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;
import com.google.android.gms.internal.ads.axu.C15550e;

public final class aro extends axu<aro, C15502a> implements azc {
    private static volatile azm<aro> zzdu;
    /* access modifiers changed from: private */
    public static final aro zzfik = new aro();
    public int zzfih;
    private ars zzfii;
    private atc zzfij;

    /* renamed from: com.google.android.gms.internal.ads.aro$a */
    public static final class C15502a extends C15546a<aro, C15502a> implements azc {
        private C15502a() {
            super(aro.zzfik);
        }

        /* renamed from: a */
        public final C15502a mo39958a(int i) {
            mo40291c();
            ((aro) this.f41195a).zzfih = i;
            return this;
        }

        /* renamed from: a */
        public final C15502a mo39959a(ars ars) {
            mo40291c();
            ((aro) this.f41195a).m47010a(ars);
            return this;
        }

        /* renamed from: a */
        public final C15502a mo39960a(atc atc) {
            mo40291c();
            ((aro) this.f41195a).m47011a(atc);
            return this;
        }

        /* synthetic */ C15502a(arp arp) {
            this();
        }
    }

    private aro() {
    }

    /* renamed from: a */
    public final ars mo39956a() {
        return this.zzfii == null ? ars.m47032c() : this.zzfii;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m47010a(ars ars) {
        if (ars != null) {
            this.zzfii = ars;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    public final atc mo39957b() {
        return this.zzfij == null ? atc.m47191c() : this.zzfij;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m47011a(atc atc) {
        if (atc != null) {
            this.zzfij = atc;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static aro m47006a(zzcce zzcce) throws zzcdx {
        return (aro) axu.m47695a(zzfik, zzcce);
    }

    /* renamed from: c */
    public static C15502a m47012c() {
        return (C15502a) ((C15546a) zzfik.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (arp.f40968a[i - 1]) {
            case 1:
                return new aro();
            case 2:
                return new C15502a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzfii", "zzfij"};
                return m47701a((aza) zzfik, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\t", objArr);
            case 4:
                return zzfik;
            case 5:
                azm<aro> azm = zzdu;
                if (azm == null) {
                    synchronized (aro.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfik);
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
        axu.m47703a(aro.class, zzfik);
    }
}
