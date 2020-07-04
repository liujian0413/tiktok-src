package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;
import com.google.android.gms.internal.ads.axu.C15550e;

public final class asf extends axu<asf, C15512a> implements azc {
    private static volatile azm<asf> zzdu;
    /* access modifiers changed from: private */
    public static final asf zzfjl = new asf();
    public int zzfih;
    public zzcce zzfip = zzcce.zzfuo;

    /* renamed from: com.google.android.gms.internal.ads.asf$a */
    public static final class C15512a extends C15546a<asf, C15512a> implements azc {
        private C15512a() {
            super(asf.zzfjl);
        }

        /* renamed from: a */
        public final C15512a mo39979a(int i) {
            mo40291c();
            ((asf) this.f41195a).zzfih = 0;
            return this;
        }

        /* renamed from: a */
        public final C15512a mo39980a(zzcce zzcce) {
            mo40291c();
            ((asf) this.f41195a).m47095b(zzcce);
            return this;
        }

        /* synthetic */ C15512a(asg asg) {
            this();
        }
    }

    private asf() {
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m47095b(zzcce zzcce) {
        if (zzcce != null) {
            this.zzfip = zzcce;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static asf m47091a(zzcce zzcce) throws zzcdx {
        return (asf) axu.m47695a(zzfjl, zzcce);
    }

    /* renamed from: a */
    public static C15512a m47090a() {
        return (C15512a) ((C15546a) zzfjl.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (asg.f40993a[i - 1]) {
            case 1:
                return new asf();
            case 2:
                return new C15512a(null);
            case 3:
                Object[] objArr = {"zzfih", "zzfip"};
                return m47701a((aza) zzfjl, "\u0000\u0002\u0000\u0000\u0001\u0003\u0002\u0000\u0000\u0000\u0001\u000b\u0003\n", objArr);
            case 4:
                return zzfjl;
            case 5:
                azm<asf> azm = zzdu;
                if (azm == null) {
                    synchronized (asf.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfjl);
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
        axu.m47703a(asf.class, zzfjl);
    }
}
