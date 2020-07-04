package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;
import com.google.android.gms.internal.ads.axu.C15550e;

public final class ary extends axu<ary, C15508a> implements azc {
    private static volatile azm<ary> zzdu;
    /* access modifiers changed from: private */
    public static final ary zzfje = new ary();
    public int zzfih;
    public zzcce zzfip = zzcce.zzfuo;
    private asc zzfjd;

    /* renamed from: com.google.android.gms.internal.ads.ary$a */
    public static final class C15508a extends C15546a<ary, C15508a> implements azc {
        private C15508a() {
            super(ary.zzfje);
        }

        /* renamed from: a */
        public final C15508a mo39969a(int i) {
            mo40291c();
            ((ary) this.f41195a).zzfih = 0;
            return this;
        }

        /* renamed from: a */
        public final C15508a mo39970a(asc asc) {
            mo40291c();
            ((ary) this.f41195a).m47051a(asc);
            return this;
        }

        /* renamed from: a */
        public final C15508a mo39971a(zzcce zzcce) {
            mo40291c();
            ((ary) this.f41195a).m47053b(zzcce);
            return this;
        }

        /* synthetic */ C15508a(arz arz) {
            this();
        }
    }

    private ary() {
    }

    /* renamed from: a */
    public final asc mo39968a() {
        return this.zzfjd == null ? asc.m47087a() : this.zzfjd;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m47051a(asc asc) {
        if (asc != null) {
            this.zzfjd = asc;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m47053b(zzcce zzcce) {
        if (zzcce != null) {
            this.zzfip = zzcce;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static ary m47047a(zzcce zzcce) throws zzcdx {
        return (ary) axu.m47695a(zzfje, zzcce);
    }

    /* renamed from: b */
    public static C15508a m47052b() {
        return (C15508a) ((C15546a) zzfje.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (arz.f40973a[i - 1]) {
            case 1:
                return new ary();
            case 2:
                return new C15508a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzfjd", "zzfip"};
                return m47701a((aza) zzfje, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", objArr);
            case 4:
                return zzfje;
            case 5:
                azm<ary> azm = zzdu;
                if (azm == null) {
                    synchronized (ary.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfje);
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
        axu.m47703a(ary.class, zzfje);
    }
}
