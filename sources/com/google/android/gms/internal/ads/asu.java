package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;
import com.google.android.gms.internal.ads.axu.C15550e;

public final class asu extends axu<asu, C15519a> implements azc {
    private static volatile azm<asu> zzdu;
    /* access modifiers changed from: private */
    public static final asu zzfkw = new asu();
    public int zzfih;
    public zzcce zzfke = zzcce.zzfuo;
    public zzcce zzfkf = zzcce.zzfuo;
    private asq zzfko;

    /* renamed from: com.google.android.gms.internal.ads.asu$a */
    public static final class C15519a extends C15546a<asu, C15519a> implements azc {
        private C15519a() {
            super(asu.zzfkw);
        }

        /* renamed from: a */
        public final C15519a mo39993a(int i) {
            mo40291c();
            ((asu) this.f41195a).zzfih = 0;
            return this;
        }

        /* renamed from: a */
        public final C15519a mo39994a(asq asq) {
            mo40291c();
            ((asu) this.f41195a).m47139a(asq);
            return this;
        }

        /* renamed from: a */
        public final C15519a mo39995a(zzcce zzcce) {
            mo40291c();
            ((asu) this.f41195a).m47145b(zzcce);
            return this;
        }

        /* renamed from: b */
        public final C15519a mo39996b(zzcce zzcce) {
            mo40291c();
            ((asu) this.f41195a).m47147c(zzcce);
            return this;
        }

        /* synthetic */ C15519a(asv asv) {
            this();
        }
    }

    private asu() {
    }

    /* renamed from: a */
    public final asq mo39992a() {
        return this.zzfko == null ? asq.m47119d() : this.zzfko;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m47139a(asq asq) {
        if (asq != null) {
            this.zzfko = asq;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m47145b(zzcce zzcce) {
        if (zzcce != null) {
            this.zzfke = zzcce;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m47147c(zzcce zzcce) {
        if (zzcce != null) {
            this.zzfkf = zzcce;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static asu m47138a(zzcce zzcce) throws zzcdx {
        return (asu) axu.m47695a(zzfkw, zzcce);
    }

    /* renamed from: b */
    public static C15519a m47143b() {
        return (C15519a) ((C15546a) zzfkw.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (asv.f41000a[i - 1]) {
            case 1:
                return new asu();
            case 2:
                return new C15519a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzfko", "zzfke", "zzfkf"};
                return m47701a((aza) zzfkw, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n\u0004\n", objArr);
            case 4:
                return zzfkw;
            case 5:
                azm<asu> azm = zzdu;
                if (azm == null) {
                    synchronized (asu.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfkw);
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

    /* renamed from: c */
    public static asu m47146c() {
        return zzfkw;
    }

    static {
        axu.m47703a(asu.class, zzfkw);
    }
}
