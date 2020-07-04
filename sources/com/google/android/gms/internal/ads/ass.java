package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;
import com.google.android.gms.internal.ads.axu.C15550e;

public final class ass extends axu<ass, C15518a> implements azc {
    private static volatile azm<ass> zzdu;
    /* access modifiers changed from: private */
    public static final ass zzfkv = new ass();
    public int zzfih;
    public zzcce zzfip = zzcce.zzfuo;
    private asu zzfku;

    /* renamed from: com.google.android.gms.internal.ads.ass$a */
    public static final class C15518a extends C15546a<ass, C15518a> implements azc {
        private C15518a() {
            super(ass.zzfkv);
        }

        /* renamed from: a */
        public final C15518a mo39989a(int i) {
            mo40291c();
            ((ass) this.f41195a).zzfih = 0;
            return this;
        }

        /* renamed from: a */
        public final C15518a mo39990a(asu asu) {
            mo40291c();
            ((ass) this.f41195a).m47129a(asu);
            return this;
        }

        /* renamed from: a */
        public final C15518a mo39991a(zzcce zzcce) {
            mo40291c();
            ((ass) this.f41195a).m47131b(zzcce);
            return this;
        }

        /* synthetic */ C15518a(ast ast) {
            this();
        }
    }

    private ass() {
    }

    /* renamed from: a */
    public final asu mo39988a() {
        return this.zzfku == null ? asu.m47146c() : this.zzfku;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m47129a(asu asu) {
        if (asu != null) {
            this.zzfku = asu;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m47131b(zzcce zzcce) {
        if (zzcce != null) {
            this.zzfip = zzcce;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static ass m47125a(zzcce zzcce) throws zzcdx {
        return (ass) axu.m47695a(zzfkv, zzcce);
    }

    /* renamed from: b */
    public static C15518a m47130b() {
        return (C15518a) ((C15546a) zzfkv.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (ast.f40999a[i - 1]) {
            case 1:
                return new ass();
            case 2:
                return new C15518a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzfku", "zzfip"};
                return m47701a((aza) zzfkv, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u000b\u0002\t\u0003\n", objArr);
            case 4:
                return zzfkv;
            case 5:
                azm<ass> azm = zzdu;
                if (azm == null) {
                    synchronized (ass.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfkv);
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
        axu.m47703a(ass.class, zzfkv);
    }
}
