package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;
import com.google.android.gms.internal.ads.axu.C15550e;

public final class atc extends axu<atc, C15523a> implements azc {
    private static volatile azm<atc> zzdu;
    /* access modifiers changed from: private */
    public static final atc zzflr = new atc();
    public int zzfih;
    public zzcce zzfip = zzcce.zzfuo;
    private ath zzflq;

    /* renamed from: com.google.android.gms.internal.ads.atc$a */
    public static final class C15523a extends C15546a<atc, C15523a> implements azc {
        private C15523a() {
            super(atc.zzflr);
        }

        /* renamed from: a */
        public final C15523a mo40018a(int i) {
            mo40291c();
            ((atc) this.f41195a).zzfih = 0;
            return this;
        }

        /* renamed from: a */
        public final C15523a mo40019a(ath ath) {
            mo40291c();
            ((atc) this.f41195a).m47188a(ath);
            return this;
        }

        /* renamed from: a */
        public final C15523a mo40020a(zzcce zzcce) {
            mo40291c();
            ((atc) this.f41195a).m47190b(zzcce);
            return this;
        }

        /* synthetic */ C15523a(atd atd) {
            this();
        }
    }

    private atc() {
    }

    /* renamed from: a */
    public final ath mo40017a() {
        return this.zzflq == null ? ath.m47203b() : this.zzflq;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m47188a(ath ath) {
        if (ath != null) {
            this.zzflq = ath;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m47190b(zzcce zzcce) {
        if (zzcce != null) {
            this.zzfip = zzcce;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static atc m47184a(zzcce zzcce) throws zzcdx {
        return (atc) axu.m47695a(zzflr, zzcce);
    }

    /* renamed from: b */
    public static C15523a m47189b() {
        return (C15523a) ((C15546a) zzflr.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (atd.f41020a[i - 1]) {
            case 1:
                return new atc();
            case 2:
                return new C15523a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzflq", "zzfip"};
                return m47701a((aza) zzflr, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", objArr);
            case 4:
                return zzflr;
            case 5:
                azm<atc> azm = zzdu;
                if (azm == null) {
                    synchronized (atc.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzflr);
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
    public static atc m47191c() {
        return zzflr;
    }

    static {
        axu.m47703a(atc.class, zzflr);
    }
}
