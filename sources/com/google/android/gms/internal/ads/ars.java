package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;
import com.google.android.gms.internal.ads.axu.C15550e;

public final class ars extends axu<ars, C15504a> implements azc {
    private static volatile azm<ars> zzdu;
    /* access modifiers changed from: private */
    public static final ars zzfiz = new ars();
    public int zzfih;
    public zzcce zzfip = zzcce.zzfuo;
    private arw zzfiy;

    /* renamed from: com.google.android.gms.internal.ads.ars$a */
    public static final class C15504a extends C15546a<ars, C15504a> implements azc {
        private C15504a() {
            super(ars.zzfiz);
        }

        /* renamed from: a */
        public final C15504a mo39964a(int i) {
            mo40291c();
            ((ars) this.f41195a).zzfih = 0;
            return this;
        }

        /* renamed from: a */
        public final C15504a mo39965a(arw arw) {
            mo40291c();
            ((ars) this.f41195a).m47029a(arw);
            return this;
        }

        /* renamed from: a */
        public final C15504a mo39966a(zzcce zzcce) {
            mo40291c();
            ((ars) this.f41195a).m47031b(zzcce);
            return this;
        }

        /* synthetic */ C15504a(C15505art art) {
            this();
        }
    }

    private ars() {
    }

    /* renamed from: a */
    public final arw mo39963a() {
        return this.zzfiy == null ? arw.m47044a() : this.zzfiy;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m47029a(arw arw) {
        if (arw != null) {
            this.zzfiy = arw;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m47031b(zzcce zzcce) {
        if (zzcce != null) {
            this.zzfip = zzcce;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static ars m47025a(zzcce zzcce) throws zzcdx {
        return (ars) axu.m47695a(zzfiz, zzcce);
    }

    /* renamed from: b */
    public static C15504a m47030b() {
        return (C15504a) ((C15546a) zzfiz.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (C15505art.f40970a[i - 1]) {
            case 1:
                return new ars();
            case 2:
                return new C15504a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzfiy", "zzfip"};
                return m47701a((aza) zzfiz, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", objArr);
            case 4:
                return zzfiz;
            case 5:
                azm<ars> azm = zzdu;
                if (azm == null) {
                    synchronized (ars.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfiz);
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
    public static ars m47032c() {
        return zzfiz;
    }

    static {
        axu.m47703a(ars.class, zzfiz);
    }
}
