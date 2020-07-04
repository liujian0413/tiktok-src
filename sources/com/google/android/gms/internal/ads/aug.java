package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;
import com.google.android.gms.internal.ads.axu.C15550e;

public final class aug extends axu<aug, C15540a> implements azc {
    private static volatile azm<aug> zzdu;
    /* access modifiers changed from: private */
    public static final aug zzfow = new aug();
    public int zzfih;
    public zzcce zzfip = zzcce.zzfuo;

    /* renamed from: com.google.android.gms.internal.ads.aug$a */
    public static final class C15540a extends C15546a<aug, C15540a> implements azc {
        private C15540a() {
            super(aug.zzfow);
        }

        /* renamed from: a */
        public final C15540a mo40048a(int i) {
            mo40291c();
            ((aug) this.f41195a).zzfih = 0;
            return this;
        }

        /* renamed from: a */
        public final C15540a mo40049a(zzcce zzcce) {
            mo40291c();
            ((aug) this.f41195a).m47304b(zzcce);
            return this;
        }

        /* synthetic */ C15540a(auh auh) {
            this();
        }
    }

    private aug() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m47304b(zzcce zzcce) {
        if (zzcce != null) {
            this.zzfip = zzcce;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static aug m47300a(zzcce zzcce) throws zzcdx {
        return (aug) axu.m47695a(zzfow, zzcce);
    }

    /* renamed from: a */
    public static C15540a m47299a() {
        return (C15540a) ((C15546a) zzfow.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (auh.f41035a[i - 1]) {
            case 1:
                return new aug();
            case 2:
                return new C15540a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzfip"};
                return m47701a((aza) zzfow, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", objArr);
            case 4:
                return zzfow;
            case 5:
                azm<aug> azm = zzdu;
                if (azm == null) {
                    synchronized (aug.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfow);
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
        axu.m47703a(aug.class, zzfow);
    }
}
