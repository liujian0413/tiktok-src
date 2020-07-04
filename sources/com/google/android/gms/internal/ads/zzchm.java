package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;

public final class zzchm {

    public static final class zza extends axu<zza, C16259a> implements azc {
        private static volatile azm<zza> zzdu;
        /* access modifiers changed from: private */
        public static final zza zzggn = new zza();
        private int zzdi;
        private int zzggg;
        private C16260b zzggh;
        private zzcce zzggi = zzcce.zzfuo;
        private zzcce zzggj = zzcce.zzfuo;
        private boolean zzggk;
        private boolean zzggl;
        private byte zzggm = 2;

        /* renamed from: com.google.android.gms.internal.ads.zzchm$zza$a */
        public static final class C16259a extends C15546a<zza, C16259a> implements azc {
            private C16259a() {
                super(zza.zzggn);
            }

            /* synthetic */ C16259a(bbo bbo) {
                this();
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.zzchm$zza$b */
        public static final class C16260b extends axu<C16260b, C16261a> implements azc {
            private static volatile azm<C16260b> zzdu;
            /* access modifiers changed from: private */
            public static final C16260b zzggs = new C16260b();
            private int zzdi;
            private String zzggo = "";
            private String zzggp = "";
            private String zzggq = "";
            private int zzggr;

            /* renamed from: com.google.android.gms.internal.ads.zzchm$zza$b$a */
            public static final class C16261a extends C15546a<C16260b, C16261a> implements azc {
                private C16261a() {
                    super(C16260b.zzggs);
                }

                /* synthetic */ C16261a(bbo bbo) {
                    this();
                }
            }

            private C16260b() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo39285a(int i, Object obj, Object obj2) {
                switch (bbo.f41386a[i - 1]) {
                    case 1:
                        return new C16260b();
                    case 2:
                        return new C16261a(null);
                    case 3:
                        Object[] objArr = {"zzdi", "zzggo", "zzggp", "zzggq", "zzggr"};
                        return m47701a((aza) zzggs, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\b\u0000\u0002\b\u0001\u0003\b\u0002\u0004\u0004\u0003", objArr);
                    case 4:
                        return zzggs;
                    case 5:
                        azm<C16260b> azm = zzdu;
                        if (azm == null) {
                            synchronized (C16260b.class) {
                                azm = zzdu;
                                if (azm == null) {
                                    azm = new C15547b<>(zzggs);
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
                axu.m47703a(C16260b.class, zzggs);
            }
        }

        public enum zzc implements axx {
            SAFE(0),
            DANGEROUS(1),
            UNKNOWN(2),
            POTENTIALLY_UNWANTED(3),
            DANGEROUS_HOST(4);
            
            private static final axy<zzc> zzef = null;
            private final int value;

            public final int zzac() {
                return this.value;
            }

            public static zzc zzhc(int i) {
                switch (i) {
                    case 0:
                        return SAFE;
                    case 1:
                        return DANGEROUS;
                    case 2:
                        return UNKNOWN;
                    case 3:
                        return POTENTIALLY_UNWANTED;
                    case 4:
                        return DANGEROUS_HOST;
                    default:
                        return null;
                }
            }

            public static axz zzad() {
                return bbq.f41387a;
            }

            private zzc(int i) {
                this.value = i;
            }

            static {
                zzef = new bbp();
            }
        }

        private zza() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo39285a(int i, Object obj, Object obj2) {
            int i2 = 0;
            switch (bbo.f41386a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C16259a(null);
                case 3:
                    Object[] objArr = {"zzdi", "zzggg", zzc.zzad(), "zzggh", "zzggi", "zzggj", "zzggk", "zzggl"};
                    return m47701a((aza) zzggn, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0001\u0001Ԍ\u0000\u0002\t\u0001\u0003\n\u0002\u0004\n\u0003\u0005\u0007\u0004\u0006\u0007\u0005", objArr);
                case 4:
                    return zzggn;
                case 5:
                    azm<zza> azm = zzdu;
                    if (azm == null) {
                        synchronized (zza.class) {
                            azm = zzdu;
                            if (azm == null) {
                                azm = new C15547b<>(zzggn);
                                zzdu = azm;
                            }
                        }
                    }
                    return azm;
                case 6:
                    return Byte.valueOf(this.zzggm);
                case 7:
                    if (obj != null) {
                        i2 = 1;
                    }
                    this.zzggm = (byte) i2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            axu.m47703a(zza.class, zzggn);
        }
    }

    public static final class zzb extends axu<zzb, C16262a> implements azc {
        private static volatile azm<zzb> zzdu;
        /* access modifiers changed from: private */
        public static final zzb zzgho = new zzb();
        private int zzcgq;
        private int zzdi;
        private zzcce zzggi = zzcce.zzfuo;
        private byte zzggm = 2;
        private String zzggp = "";
        private int zzggz;
        private String zzgha = "";
        private String zzghb = "";
        private C16263b zzghc;
        private ayc<zzh> zzghd = m47706l();
        private String zzghe = "";
        private zzf zzghf;
        private boolean zzghg;
        private ayc<String> zzghh = axu.m47706l();
        private String zzghi = "";
        private boolean zzghj;
        private boolean zzghk;
        private C16275f zzghl;
        private ayc<String> zzghm = axu.m47706l();
        private ayc<String> zzghn = axu.m47706l();

        /* renamed from: com.google.android.gms.internal.ads.zzchm$zzb$a */
        public static final class C16262a extends C15546a<zzb, C16262a> implements azc {
            private C16262a() {
                super(zzb.zzgho);
            }

            /* synthetic */ C16262a(bbo bbo) {
                this();
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.zzchm$zzb$b */
        public static final class C16263b extends axu<C16263b, C16264a> implements azc {
            private static volatile azm<C16263b> zzdu;
            /* access modifiers changed from: private */
            public static final C16263b zzghq = new C16263b();
            private int zzdi;
            private String zzghp = "";

            /* renamed from: com.google.android.gms.internal.ads.zzchm$zzb$b$a */
            public static final class C16264a extends C15546a<C16263b, C16264a> implements azc {
                private C16264a() {
                    super(C16263b.zzghq);
                }

                /* synthetic */ C16264a(bbo bbo) {
                    this();
                }
            }

            private C16263b() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo39285a(int i, Object obj, Object obj2) {
                switch (bbo.f41386a[i - 1]) {
                    case 1:
                        return new C16263b();
                    case 2:
                        return new C16264a(null);
                    case 3:
                        Object[] objArr = {"zzdi", "zzghp"};
                        return m47701a((aza) zzghq, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", objArr);
                    case 4:
                        return zzghq;
                    case 5:
                        azm<C16263b> azm = zzdu;
                        if (azm == null) {
                            synchronized (C16263b.class) {
                                azm = zzdu;
                                if (azm == null) {
                                    azm = new C15547b<>(zzghq);
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
                axu.m47703a(C16263b.class, zzghq);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.zzchm$zzb$c */
        public static final class C16265c extends axu<C16265c, C16266a> implements azc {
            private static volatile azm<C16265c> zzdu;
            /* access modifiers changed from: private */
            public static final C16265c zzghs = new C16265c();
            private int zzdi;
            private zzcce zzflx = zzcce.zzfuo;
            private byte zzggm = 2;
            private zzcce zzghr = zzcce.zzfuo;

            /* renamed from: com.google.android.gms.internal.ads.zzchm$zzb$c$a */
            public static final class C16266a extends C15546a<C16265c, C16266a> implements azc {
                private C16266a() {
                    super(C16265c.zzghs);
                }

                /* synthetic */ C16266a(bbo bbo) {
                    this();
                }
            }

            private C16265c() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo39285a(int i, Object obj, Object obj2) {
                int i2 = 0;
                switch (bbo.f41386a[i - 1]) {
                    case 1:
                        return new C16265c();
                    case 2:
                        return new C16266a(null);
                    case 3:
                        Object[] objArr = {"zzdi", "zzghr", "zzflx"};
                        return m47701a((aza) zzghs, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0001\u0001Ԋ\u0000\u0002\n\u0001", objArr);
                    case 4:
                        return zzghs;
                    case 5:
                        azm<C16265c> azm = zzdu;
                        if (azm == null) {
                            synchronized (C16265c.class) {
                                azm = zzdu;
                                if (azm == null) {
                                    azm = new C15547b<>(zzghs);
                                    zzdu = azm;
                                }
                            }
                        }
                        return azm;
                    case 6:
                        return Byte.valueOf(this.zzggm);
                    case 7:
                        if (obj != null) {
                            i2 = 1;
                        }
                        this.zzggm = (byte) i2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                axu.m47703a(C16265c.class, zzghs);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.zzchm$zzb$d */
        public static final class C16267d extends axu<C16267d, C16268a> implements azc {
            private static volatile azm<C16267d> zzdu;
            /* access modifiers changed from: private */
            public static final C16267d zzghy = new C16267d();
            private int zzdi;
            private byte zzggm = 2;
            private C16269b zzght;
            private ayc<C16265c> zzghu = m47706l();
            private zzcce zzghv = zzcce.zzfuo;
            private zzcce zzghw = zzcce.zzfuo;
            private int zzghx;

            /* renamed from: com.google.android.gms.internal.ads.zzchm$zzb$d$a */
            public static final class C16268a extends C15546a<C16267d, C16268a> implements azc {
                private C16268a() {
                    super(C16267d.zzghy);
                }

                /* synthetic */ C16268a(bbo bbo) {
                    this();
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.zzchm$zzb$d$b */
            public static final class C16269b extends axu<C16269b, C16270a> implements azc {
                private static volatile azm<C16269b> zzdu;
                /* access modifiers changed from: private */
                public static final C16269b zzgic = new C16269b();
                private int zzdi;
                private zzcce zzghz = zzcce.zzfuo;
                private zzcce zzgia = zzcce.zzfuo;
                private zzcce zzgib = zzcce.zzfuo;

                /* renamed from: com.google.android.gms.internal.ads.zzchm$zzb$d$b$a */
                public static final class C16270a extends C15546a<C16269b, C16270a> implements azc {
                    private C16270a() {
                        super(C16269b.zzgic);
                    }

                    /* synthetic */ C16270a(bbo bbo) {
                        this();
                    }
                }

                private C16269b() {
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final Object mo39285a(int i, Object obj, Object obj2) {
                    switch (bbo.f41386a[i - 1]) {
                        case 1:
                            return new C16269b();
                        case 2:
                            return new C16270a(null);
                        case 3:
                            Object[] objArr = {"zzdi", "zzghz", "zzgia", "zzgib"};
                            return m47701a((aza) zzgic, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\n\u0000\u0002\n\u0001\u0003\n\u0002", objArr);
                        case 4:
                            return zzgic;
                        case 5:
                            azm<C16269b> azm = zzdu;
                            if (azm == null) {
                                synchronized (C16269b.class) {
                                    azm = zzdu;
                                    if (azm == null) {
                                        azm = new C15547b<>(zzgic);
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
                    axu.m47703a(C16269b.class, zzgic);
                }
            }

            private C16267d() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo39285a(int i, Object obj, Object obj2) {
                int i2 = 0;
                switch (bbo.f41386a[i - 1]) {
                    case 1:
                        return new C16267d();
                    case 2:
                        return new C16268a(null);
                    case 3:
                        Object[] objArr = {"zzdi", "zzght", "zzghu", C16265c.class, "zzghv", "zzghw", "zzghx"};
                        return m47701a((aza) zzghy, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0001\u0001\t\u0000\u0002Л\u0003\n\u0001\u0004\n\u0002\u0005\u0004\u0003", objArr);
                    case 4:
                        return zzghy;
                    case 5:
                        azm<C16267d> azm = zzdu;
                        if (azm == null) {
                            synchronized (C16267d.class) {
                                azm = zzdu;
                                if (azm == null) {
                                    azm = new C15547b<>(zzghy);
                                    zzdu = azm;
                                }
                            }
                        }
                        return azm;
                    case 6:
                        return Byte.valueOf(this.zzggm);
                    case 7:
                        if (obj != null) {
                            i2 = 1;
                        }
                        this.zzggm = (byte) i2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                axu.m47703a(C16267d.class, zzghy);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.zzchm$zzb$e */
        public static final class C16271e extends axu<C16271e, C16272a> implements azc {
            private static volatile azm<C16271e> zzdu;
            /* access modifiers changed from: private */
            public static final C16271e zzgif = new C16271e();
            private int zzdi;
            private byte zzggm = 2;
            private ayc<C16265c> zzghu = m47706l();
            private zzcce zzghv = zzcce.zzfuo;
            private zzcce zzghw = zzcce.zzfuo;
            private int zzghx;
            private C16273b zzgid;
            private zzcce zzgie = zzcce.zzfuo;

            /* renamed from: com.google.android.gms.internal.ads.zzchm$zzb$e$a */
            public static final class C16272a extends C15546a<C16271e, C16272a> implements azc {
                private C16272a() {
                    super(C16271e.zzgif);
                }

                /* synthetic */ C16272a(bbo bbo) {
                    this();
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.zzchm$zzb$e$b */
            public static final class C16273b extends axu<C16273b, C16274a> implements azc {
                private static volatile azm<C16273b> zzdu;
                /* access modifiers changed from: private */
                public static final C16273b zzgii = new C16273b();
                private int zzdi;
                private zzcce zzgib = zzcce.zzfuo;
                private int zzgig;
                private zzcce zzgih = zzcce.zzfuo;

                /* renamed from: com.google.android.gms.internal.ads.zzchm$zzb$e$b$a */
                public static final class C16274a extends C15546a<C16273b, C16274a> implements azc {
                    private C16274a() {
                        super(C16273b.zzgii);
                    }

                    /* synthetic */ C16274a(bbo bbo) {
                        this();
                    }
                }

                private C16273b() {
                }

                /* access modifiers changed from: protected */
                /* renamed from: a */
                public final Object mo39285a(int i, Object obj, Object obj2) {
                    switch (bbo.f41386a[i - 1]) {
                        case 1:
                            return new C16273b();
                        case 2:
                            return new C16274a(null);
                        case 3:
                            Object[] objArr = {"zzdi", "zzgig", "zzgih", "zzgib"};
                            return m47701a((aza) zzgii, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\u0004\u0000\u0002\n\u0001\u0003\n\u0002", objArr);
                        case 4:
                            return zzgii;
                        case 5:
                            azm<C16273b> azm = zzdu;
                            if (azm == null) {
                                synchronized (C16273b.class) {
                                    azm = zzdu;
                                    if (azm == null) {
                                        azm = new C15547b<>(zzgii);
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
                    axu.m47703a(C16273b.class, zzgii);
                }
            }

            private C16271e() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo39285a(int i, Object obj, Object obj2) {
                int i2 = 0;
                switch (bbo.f41386a[i - 1]) {
                    case 1:
                        return new C16271e();
                    case 2:
                        return new C16272a(null);
                    case 3:
                        Object[] objArr = {"zzdi", "zzgid", "zzghu", C16265c.class, "zzghv", "zzghw", "zzghx", "zzgie"};
                        return m47701a((aza) zzgif, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0001\u0001\u0001\t\u0000\u0002Л\u0003\n\u0001\u0004\n\u0002\u0005\u0004\u0003\u0006\n\u0004", objArr);
                    case 4:
                        return zzgif;
                    case 5:
                        azm<C16271e> azm = zzdu;
                        if (azm == null) {
                            synchronized (C16271e.class) {
                                azm = zzdu;
                                if (azm == null) {
                                    azm = new C15547b<>(zzgif);
                                    zzdu = azm;
                                }
                            }
                        }
                        return azm;
                    case 6:
                        return Byte.valueOf(this.zzggm);
                    case 7:
                        if (obj != null) {
                            i2 = 1;
                        }
                        this.zzggm = (byte) i2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                axu.m47703a(C16271e.class, zzgif);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.zzchm$zzb$f */
        public static final class C16275f extends axu<C16275f, C16276a> implements azc {
            private static volatile azm<C16275f> zzdu;
            /* access modifiers changed from: private */
            public static final C16275f zzgjr = new C16275f();
            private int zzdi;
            private String zzgjo = "";
            private long zzgjp;
            private boolean zzgjq;

            /* renamed from: com.google.android.gms.internal.ads.zzchm$zzb$f$a */
            public static final class C16276a extends C15546a<C16275f, C16276a> implements azc {
                private C16276a() {
                    super(C16275f.zzgjr);
                }

                /* synthetic */ C16276a(bbo bbo) {
                    this();
                }
            }

            private C16275f() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo39285a(int i, Object obj, Object obj2) {
                switch (bbo.f41386a[i - 1]) {
                    case 1:
                        return new C16275f();
                    case 2:
                        return new C16276a(null);
                    case 3:
                        Object[] objArr = {"zzdi", "zzgjo", "zzgjp", "zzgjq"};
                        return m47701a((aza) zzgjr, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\u0007\u0002", objArr);
                    case 4:
                        return zzgjr;
                    case 5:
                        azm<C16275f> azm = zzdu;
                        if (azm == null) {
                            synchronized (C16275f.class) {
                                azm = zzdu;
                                if (azm == null) {
                                    azm = new C15547b<>(zzgjr);
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
                axu.m47703a(C16275f.class, zzgjr);
            }
        }

        public static final class zzf extends axu<zzf, C16277a> implements azc {
            private static volatile azm<zzf> zzdu;
            /* access modifiers changed from: private */
            public static final zzf zzgil = new zzf();
            private int zzcgq;
            private int zzdi;
            private String zzgij = "";
            private zzcce zzgik = zzcce.zzfuo;

            /* renamed from: com.google.android.gms.internal.ads.zzchm$zzb$zzf$a */
            public static final class C16277a extends C15546a<zzf, C16277a> implements azc {
                private C16277a() {
                    super(zzf.zzgil);
                }

                /* synthetic */ C16277a(bbo bbo) {
                    this();
                }
            }

            /* renamed from: com.google.android.gms.internal.ads.zzchm$zzb$zzf$zzb reason: collision with other inner class name */
            public enum C48892zzb implements axx {
                TYPE_UNKNOWN(0),
                TYPE_CREATIVE(1);
                
                private static final axy<C48892zzb> zzef = null;
                private final int value;

                public final int zzac() {
                    return this.value;
                }

                public static C48892zzb zzhd(int i) {
                    switch (i) {
                        case 0:
                            return TYPE_UNKNOWN;
                        case 1:
                            return TYPE_CREATIVE;
                        default:
                            return null;
                    }
                }

                public static axz zzad() {
                    return bbs.f41388a;
                }

                private C48892zzb(int i) {
                    this.value = i;
                }

                static {
                    zzef = new bbr();
                }
            }

            private zzf() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo39285a(int i, Object obj, Object obj2) {
                switch (bbo.f41386a[i - 1]) {
                    case 1:
                        return new zzf();
                    case 2:
                        return new C16277a(null);
                    case 3:
                        Object[] objArr = {"zzdi", "zzcgq", C48892zzb.zzad(), "zzgij", "zzgik"};
                        return m47701a((aza) zzgil, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\n\u0002", objArr);
                    case 4:
                        return zzgil;
                    case 5:
                        azm<zzf> azm = zzdu;
                        if (azm == null) {
                            synchronized (zzf.class) {
                                azm = zzdu;
                                if (azm == null) {
                                    azm = new C15547b<>(zzgil);
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
                axu.m47703a(zzf.class, zzgil);
            }
        }

        public enum zzg implements axx {
            UNKNOWN(0),
            URL_PHISHING(1),
            URL_MALWARE(2),
            URL_UNWANTED(3),
            CLIENT_SIDE_PHISHING_URL(4),
            CLIENT_SIDE_MALWARE_URL(5),
            DANGEROUS_DOWNLOAD_RECOVERY(6),
            DANGEROUS_DOWNLOAD_WARNING(7),
            OCTAGON_AD(8),
            OCTAGON_AD_SB_MATCH(9);
            
            private static final axy<zzg> zzef = null;
            private final int value;

            public final int zzac() {
                return this.value;
            }

            public static zzg zzhe(int i) {
                switch (i) {
                    case 0:
                        return UNKNOWN;
                    case 1:
                        return URL_PHISHING;
                    case 2:
                        return URL_MALWARE;
                    case 3:
                        return URL_UNWANTED;
                    case 4:
                        return CLIENT_SIDE_PHISHING_URL;
                    case 5:
                        return CLIENT_SIDE_MALWARE_URL;
                    case 6:
                        return DANGEROUS_DOWNLOAD_RECOVERY;
                    case 7:
                        return DANGEROUS_DOWNLOAD_WARNING;
                    case 8:
                        return OCTAGON_AD;
                    case 9:
                        return OCTAGON_AD_SB_MATCH;
                    default:
                        return null;
                }
            }

            public static axz zzad() {
                return bbu.f41389a;
            }

            private zzg(int i) {
                this.value = i;
            }

            static {
                zzef = new bbt();
            }
        }

        public static final class zzh extends axu<zzh, C16278a> implements azc {
            private static volatile azm<zzh> zzdu;
            /* access modifiers changed from: private */
            public static final zzh zzgji = new zzh();
            private int zzdi;
            private byte zzggm = 2;
            private String zzggp = "";
            private int zzgja;
            private C16267d zzgjb;
            private C16271e zzgjc;
            private int zzgjd;
            private aya zzgje = m47705k();
            private String zzgjf = "";
            private int zzgjg;
            private ayc<String> zzgjh = axu.m47706l();

            /* renamed from: com.google.android.gms.internal.ads.zzchm$zzb$zzh$a */
            public static final class C16278a extends C15546a<zzh, C16278a> implements azc {
                private C16278a() {
                    super(zzh.zzgji);
                }

                /* synthetic */ C16278a(bbo bbo) {
                    this();
                }
            }

            public enum zza implements axx {
                AD_RESOURCE_UNKNOWN(0),
                AD_RESOURCE_CREATIVE(1),
                AD_RESOURCE_POST_CLICK(2),
                AD_RESOURCE_AUTO_CLICK_DESTINATION(3);
                
                private static final axy<zza> zzef = null;
                private final int value;

                public final int zzac() {
                    return this.value;
                }

                public static zza zzhf(int i) {
                    switch (i) {
                        case 0:
                            return AD_RESOURCE_UNKNOWN;
                        case 1:
                            return AD_RESOURCE_CREATIVE;
                        case 2:
                            return AD_RESOURCE_POST_CLICK;
                        case 3:
                            return AD_RESOURCE_AUTO_CLICK_DESTINATION;
                        default:
                            return null;
                    }
                }

                public static axz zzad() {
                    return bbw.f41390a;
                }

                private zza(int i) {
                    this.value = i;
                }

                static {
                    zzef = new bbv();
                }
            }

            private zzh() {
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo39285a(int i, Object obj, Object obj2) {
                int i2 = 0;
                switch (bbo.f41386a[i - 1]) {
                    case 1:
                        return new zzh();
                    case 2:
                        return new C16278a(null);
                    case 3:
                        Object[] objArr = {"zzdi", "zzgja", "zzggp", "zzgjb", "zzgjc", "zzgjd", "zzgje", "zzgjf", "zzgjg", zza.zzad(), "zzgjh"};
                        return m47701a((aza) zzgji, "\u0001\t\u0000\u0001\u0001\t\t\u0000\u0002\u0003\u0001Ԅ\u0000\u0002\b\u0001\u0003Љ\u0002\u0004Љ\u0003\u0005\u0004\u0004\u0006\u0016\u0007\b\u0005\b\f\u0006\t\u001a", objArr);
                    case 4:
                        return zzgji;
                    case 5:
                        azm<zzh> azm = zzdu;
                        if (azm == null) {
                            synchronized (zzh.class) {
                                azm = zzdu;
                                if (azm == null) {
                                    azm = new C15547b<>(zzgji);
                                    zzdu = azm;
                                }
                            }
                        }
                        return azm;
                    case 6:
                        return Byte.valueOf(this.zzggm);
                    case 7:
                        if (obj != null) {
                            i2 = 1;
                        }
                        this.zzggm = (byte) i2;
                        return null;
                    default:
                        throw new UnsupportedOperationException();
                }
            }

            static {
                axu.m47703a(zzh.class, zzgji);
            }
        }

        private zzb() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo39285a(int i, Object obj, Object obj2) {
            int i2 = 0;
            switch (bbo.f41386a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new C16262a(null);
                case 3:
                    Object[] objArr = {"zzdi", "zzggp", "zzgha", "zzghb", "zzghd", zzh.class, "zzghg", "zzghh", "zzghi", "zzghj", "zzghk", "zzcgq", zzg.zzad(), "zzggz", zzc.zzad(), "zzghc", "zzghe", "zzghf", "zzggi", "zzghl", "zzghm", "zzghn"};
                    return m47701a((aza) zzgho, "\u0001\u0012\u0000\u0001\u0001\u0015\u0012\u0000\u0004\u0001\u0001\b\u0002\u0002\b\u0003\u0003\b\u0004\u0004Л\u0005\u0007\b\u0006\u001a\u0007\b\t\b\u0007\n\t\u0007\u000b\n\f\u0000\u000b\f\u0001\f\t\u0005\r\b\u0006\u000e\t\u0007\u000f\n\f\u0011\t\r\u0014\u001a\u0015\u001a", objArr);
                case 4:
                    return zzgho;
                case 5:
                    azm<zzb> azm = zzdu;
                    if (azm == null) {
                        synchronized (zzb.class) {
                            azm = zzdu;
                            if (azm == null) {
                                azm = new C15547b<>(zzgho);
                                zzdu = azm;
                            }
                        }
                    }
                    return azm;
                case 6:
                    return Byte.valueOf(this.zzggm);
                case 7:
                    if (obj != null) {
                        i2 = 1;
                    }
                    this.zzggm = (byte) i2;
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            axu.m47703a(zzb.class, zzgho);
        }
    }
}
