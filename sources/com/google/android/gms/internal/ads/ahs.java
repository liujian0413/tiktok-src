package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;

public final class ahs {

    /* renamed from: com.google.android.gms.internal.ads.ahs$a */
    public static final class C15480a extends axu<C15480a, C15481a> implements azc {
        private static volatile azm<C15480a> zzdu;
        /* access modifiers changed from: private */
        public static final C15480a zzdx = new C15480a();
        private int zzdi;
        private C15482b zzdv;
        private C15484c zzdw;

        /* renamed from: com.google.android.gms.internal.ads.ahs$a$a */
        public static final class C15481a extends C15546a<C15480a, C15481a> implements azc {
            private C15481a() {
                super(C15480a.zzdx);
            }

            /* synthetic */ C15481a(ait ait) {
                this();
            }
        }

        private C15480a() {
        }

        /* renamed from: a */
        public final boolean mo39397a() {
            return (this.zzdi & 1) == 1;
        }

        /* renamed from: b */
        public final C15482b mo39398b() {
            return this.zzdv == null ? C15482b.m45902b() : this.zzdv;
        }

        /* renamed from: c */
        public final boolean mo39399c() {
            return (this.zzdi & 2) == 2;
        }

        /* renamed from: d */
        public final C15484c mo39400d() {
            return this.zzdw == null ? C15484c.m45906a() : this.zzdw;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo39285a(int i, Object obj, Object obj2) {
            switch (ait.f40359a[i - 1]) {
                case 1:
                    return new C15480a();
                case 2:
                    return new C15481a(null);
                case 3:
                    Object[] objArr = {"zzdi", "zzdv", "zzdw"};
                    return m47701a((aza) zzdx, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\t\u0000\u0002\t\u0001", objArr);
                case 4:
                    return zzdx;
                case 5:
                    azm<C15480a> azm = zzdu;
                    if (azm == null) {
                        synchronized (C15480a.class) {
                            azm = zzdu;
                            if (azm == null) {
                                azm = new C15547b<>(zzdx);
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
            axu.m47703a(C15480a.class, zzdx);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.ahs$b */
    public static final class C15482b extends axu<C15482b, C15483a> implements azc {
        private static volatile azm<C15482b> zzdu;
        /* access modifiers changed from: private */
        public static final C15482b zzdz = new C15482b();
        private int zzdi;
        private int zzdy = 2;

        /* renamed from: com.google.android.gms.internal.ads.ahs$b$a */
        public static final class C15483a extends C15546a<C15482b, C15483a> implements azc {
            private C15483a() {
                super(C15482b.zzdz);
            }

            /* synthetic */ C15483a(ait ait) {
                this();
            }
        }

        private C15482b() {
        }

        /* renamed from: a */
        public final zzbl mo39401a() {
            zzbl zzd = zzbl.zzd(this.zzdy);
            return zzd == null ? zzbl.ENUM_SIGNAL_SOURCE_ADSHIELD : zzd;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo39285a(int i, Object obj, Object obj2) {
            switch (ait.f40359a[i - 1]) {
                case 1:
                    return new C15482b();
                case 2:
                    return new C15483a(null);
                case 3:
                    Object[] objArr = {"zzdi", "zzdy", zzbl.zzad()};
                    return m47701a((aza) zzdz, "\u0001\u0001\u0000\u0001\u001b\u001b\u0001\u0000\u0000\u0000\u001b\f\u0000", objArr);
                case 4:
                    return zzdz;
                case 5:
                    azm<C15482b> azm = zzdu;
                    if (azm == null) {
                        synchronized (C15482b.class) {
                            azm = zzdu;
                            if (azm == null) {
                                azm = new C15547b<>(zzdz);
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

        /* renamed from: b */
        public static C15482b m45902b() {
            return zzdz;
        }

        static {
            axu.m47703a(C15482b.class, zzdz);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.ahs$c */
    public static final class C15484c extends axu<C15484c, C15485a> implements azc {
        private static volatile azm<C15484c> zzdu;
        /* access modifiers changed from: private */
        public static final C15484c zzeo = new C15484c();
        private int zzdi;
        public String zzei = "";
        private String zzej = "";
        private String zzek = "";
        private String zzel = "";
        private String zzem = "";
        public String zzen = "";

        /* renamed from: com.google.android.gms.internal.ads.ahs$c$a */
        public static final class C15485a extends C15546a<C15484c, C15485a> implements azc {
            private C15485a() {
                super(C15484c.zzeo);
            }

            /* synthetic */ C15485a(ait ait) {
                this();
            }
        }

        private C15484c() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo39285a(int i, Object obj, Object obj2) {
            switch (ait.f40359a[i - 1]) {
                case 1:
                    return new C15484c();
                case 2:
                    return new C15485a(null);
                case 3:
                    Object[] objArr = {"zzdi", "zzei", "zzej", "zzek", "zzel", "zzem", "zzen"};
                    return m47701a((aza) zzeo, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\b\u0005", objArr);
                case 4:
                    return zzeo;
                case 5:
                    azm<C15484c> azm = zzdu;
                    if (azm == null) {
                        synchronized (C15484c.class) {
                            azm = zzdu;
                            if (azm == null) {
                                azm = new C15547b<>(zzeo);
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

        /* renamed from: a */
        public static C15484c m45906a() {
            return zzeo;
        }

        static {
            axu.m47703a(C15484c.class, zzeo);
        }
    }
}
