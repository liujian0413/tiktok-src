package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;
import com.google.android.gms.internal.ads.axu.C15550e;
import com.p280ss.android.ugc.aweme.photomovie.PhotoMovieContext;
import com.p280ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p280ss.android.ugc.aweme.video.preload.model.PreloadTask;

public final class zzbo {

    /* renamed from: com.google.android.gms.internal.ads.zzbo$a */
    public static final class C16237a extends axu<C16237a, C16238a> implements azc {
        private static volatile azm<C16237a> zzdu;
        /* access modifiers changed from: private */
        public static final C16237a zzka = new C16237a();
        private int zzdi;
        private long zzjv;
        private int zzjw;
        private boolean zzjx;
        private aya zzjy = m47705k();
        private long zzjz;

        /* renamed from: com.google.android.gms.internal.ads.zzbo$a$a */
        public static final class C16238a extends C15546a<C16237a, C16238a> implements azc {
            private C16238a() {
                super(C16237a.zzka);
            }

            /* synthetic */ C16238a(anx anx) {
                this();
            }
        }

        private C16237a() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo39285a(int i, Object obj, Object obj2) {
            switch (anx.f40805a[i - 1]) {
                case 1:
                    return new C16237a();
                case 2:
                    return new C16238a(null);
                case 3:
                    Object[] objArr = {"zzdi", "zzjv", "zzjw", "zzjx", "zzjy", "zzjz"};
                    return m47701a((aza) zzka, "\u0001\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0001\u0000\u0001\u0002\u0000\u0002\u0004\u0001\u0003\u0007\u0002\u0004\u0016\u0005\u0003\u0003", objArr);
                case 4:
                    return zzka;
                case 5:
                    azm<C16237a> azm = zzdu;
                    if (azm == null) {
                        synchronized (C16237a.class) {
                            azm = zzdu;
                            if (azm == null) {
                                azm = new C15547b<>(zzka);
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
            axu.m47703a(C16237a.class, zzka);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.zzbo$b */
    public static final class C16239b extends axu<C16239b, C16240a> implements azc {
        private static volatile azm<C16239b> zzdu;
        /* access modifiers changed from: private */
        public static final C16239b zzki = new C16239b();
        private int zzdi;
        public zzcce zzke = zzcce.zzfuo;
        public zzcce zzkf = zzcce.zzfuo;
        public zzcce zzkg = zzcce.zzfuo;
        public zzcce zzkh = zzcce.zzfuo;

        /* renamed from: com.google.android.gms.internal.ads.zzbo$b$a */
        public static final class C16240a extends C15546a<C16239b, C16240a> implements azc {
            private C16240a() {
                super(C16239b.zzki);
            }

            /* renamed from: a */
            public final C16240a mo42186a(zzcce zzcce) {
                mo40291c();
                ((C16239b) this.f41195a).m52679a(zzcce);
                return this;
            }

            /* renamed from: b */
            public final C16240a mo42187b(zzcce zzcce) {
                mo40291c();
                ((C16239b) this.f41195a).m52682b(zzcce);
                return this;
            }

            /* renamed from: c */
            public final C16240a mo42188c(zzcce zzcce) {
                mo40291c();
                ((C16239b) this.f41195a).m52684c(zzcce);
                return this;
            }

            /* renamed from: d */
            public final C16240a mo42189d(zzcce zzcce) {
                mo40291c();
                ((C16239b) this.f41195a).m52686d(zzcce);
                return this;
            }

            /* synthetic */ C16240a(anx anx) {
                this();
            }
        }

        private C16239b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m52679a(zzcce zzcce) {
            if (zzcce != null) {
                this.zzdi |= 1;
                this.zzke = zzcce;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m52682b(zzcce zzcce) {
            if (zzcce != null) {
                this.zzdi |= 2;
                this.zzkf = zzcce;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final void m52684c(zzcce zzcce) {
            if (zzcce != null) {
                this.zzdi |= 4;
                this.zzkg = zzcce;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final void m52686d(zzcce zzcce) {
            if (zzcce != null) {
                this.zzdi |= 8;
                this.zzkh = zzcce;
                return;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public static C16239b m52677a(byte[] bArr, axi axi) throws zzcdx {
            return (C16239b) axu.m47699a(zzki, bArr, axi);
        }

        /* renamed from: a */
        public static C16240a m52676a() {
            return (C16240a) ((C15546a) zzki.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo39285a(int i, Object obj, Object obj2) {
            switch (anx.f40805a[i - 1]) {
                case 1:
                    return new C16239b();
                case 2:
                    return new C16240a(null);
                case 3:
                    Object[] objArr = {"zzdi", "zzke", "zzkf", "zzkg", "zzkh"};
                    return m47701a((aza) zzki, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\n\u0000\u0002\n\u0001\u0003\n\u0002\u0004\n\u0003", objArr);
                case 4:
                    return zzki;
                case 5:
                    azm<C16239b> azm = zzdu;
                    if (azm == null) {
                        synchronized (C16239b.class) {
                            azm = zzdu;
                            if (azm == null) {
                                azm = new C15547b<>(zzki);
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
            axu.m47703a(C16239b.class, zzki);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.zzbo$c */
    public static final class C16241c extends axu<C16241c, C16242a> implements azc {
        private static volatile azm<C16241c> zzdu;
        /* access modifiers changed from: private */
        public static final C16241c zzla = new C16241c();
        private int zzdi;
        public long zzjv;
        private String zzky = "";
        private zzcce zzkz = zzcce.zzfuo;

        /* renamed from: com.google.android.gms.internal.ads.zzbo$c$a */
        public static final class C16242a extends C15546a<C16241c, C16242a> implements azc {
            private C16242a() {
                super(C16241c.zzla);
            }

            /* synthetic */ C16242a(anx anx) {
                this();
            }
        }

        private C16241c() {
        }

        /* renamed from: a */
        public final boolean mo42190a() {
            return (this.zzdi & 1) == 1;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo39285a(int i, Object obj, Object obj2) {
            switch (anx.f40805a[i - 1]) {
                case 1:
                    return new C16241c();
                case 2:
                    return new C16242a(null);
                case 3:
                    Object[] objArr = {"zzdi", "zzjv", "zzky", "zzkz"};
                    return m47701a((aza) zzla, "\u0001\u0003\u0000\u0001\u0001\u0004\u0003\u0000\u0000\u0000\u0001\u0002\u0000\u0003\b\u0001\u0004\n\u0002", objArr);
                case 4:
                    return zzla;
                case 5:
                    azm<C16241c> azm = zzdu;
                    if (azm == null) {
                        synchronized (C16241c.class) {
                            azm = zzdu;
                            if (azm == null) {
                                azm = new C15547b<>(zzla);
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
        public static C16241c m52692b() {
            return zzla;
        }

        static {
            axu.m47703a(C16241c.class, zzla);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.zzbo$d */
    public static final class C16243d extends axu<C16243d, C16244a> implements azc {
        private static volatile azm<C16243d> zzdu;
        /* access modifiers changed from: private */
        public static final C16243d zzlb = new C16243d();
        private int zzdi;
        private String zzen = "";

        /* renamed from: com.google.android.gms.internal.ads.zzbo$d$a */
        public static final class C16244a extends C15546a<C16243d, C16244a> implements azc {
            private C16244a() {
                super(C16243d.zzlb);
            }

            /* renamed from: a */
            public final C16244a mo42191a(String str) {
                mo40291c();
                ((C16243d) this.f41195a).m52698a(str);
                return this;
            }

            /* synthetic */ C16244a(anx anx) {
                this();
            }
        }

        private C16243d() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m52698a(String str) {
            if (str != null) {
                this.zzdi |= 1;
                this.zzen = str;
                return;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public static C16244a m52696a() {
            return (C16244a) ((C15546a) zzlb.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo39285a(int i, Object obj, Object obj2) {
            switch (anx.f40805a[i - 1]) {
                case 1:
                    return new C16243d();
                case 2:
                    return new C16244a(null);
                case 3:
                    Object[] objArr = {"zzdi", "zzen"};
                    return m47701a((aza) zzlb, "\u0001\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001\b\u0000", objArr);
                case 4:
                    return zzlb;
                case 5:
                    azm<C16243d> azm = zzdu;
                    if (azm == null) {
                        synchronized (C16243d.class) {
                            azm = zzdu;
                            if (azm == null) {
                                azm = new C15547b<>(zzlb);
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
            axu.m47703a(C16243d.class, zzlb);
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.zzbo$e */
    public static final class C16245e extends axu<C16245e, C16246a> implements azc {
        private static volatile azm<C16245e> zzdu;
        /* access modifiers changed from: private */
        public static final C16245e zzld = new C16245e();
        private int zzdi;
        private int zzgv = 1;
        private int zzgw = 1;
        private zzcce zzkf = zzcce.zzfuo;
        private ayc<zzcce> zzlc = m47706l();

        /* renamed from: com.google.android.gms.internal.ads.zzbo$e$a */
        public static final class C16246a extends C15546a<C16245e, C16246a> implements azc {
            private C16246a() {
                super(C16245e.zzld);
            }

            /* renamed from: a */
            public final C16246a mo42193a(zzcce zzcce) {
                mo40291c();
                ((C16245e) this.f41195a).m52706a(zzcce);
                return this;
            }

            /* renamed from: b */
            public final C16246a mo42194b(zzcce zzcce) {
                mo40291c();
                ((C16245e) this.f41195a).m52709b(zzcce);
                return this;
            }

            /* renamed from: a */
            public final C16246a mo42192a(zzbv zzbv) {
                mo40291c();
                ((C16245e) this.f41195a).m52705a(zzbv);
                return this;
            }

            /* synthetic */ C16246a(anx anx) {
                this();
            }
        }

        private C16245e() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m52706a(zzcce zzcce) {
            if (zzcce != null) {
                if (!this.zzlc.mo40090a()) {
                    ayc<zzcce> ayc = this.zzlc;
                    int size = ayc.size();
                    this.zzlc = ayc.mo40105a(size == 0 ? 10 : size << 1);
                }
                this.zzlc.add(zzcce);
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m52709b(zzcce zzcce) {
            if (zzcce != null) {
                this.zzdi |= 1;
                this.zzkf = zzcce;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m52705a(zzbv zzbv) {
            if (zzbv != null) {
                this.zzdi |= 4;
                this.zzgv = zzbv.zzac();
                return;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public static C16246a m52702a() {
            return (C16246a) ((C15546a) zzld.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo39285a(int i, Object obj, Object obj2) {
            switch (anx.f40805a[i - 1]) {
                case 1:
                    return new C16245e();
                case 2:
                    return new C16246a(null);
                case 3:
                    Object[] objArr = {"zzdi", "zzlc", "zzkf", "zzgw", zzcb.zzad(), "zzgv", zzbv.zzad()};
                    return m47701a((aza) zzld, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001c\u0002\n\u0000\u0003\f\u0001\u0004\f\u0002", objArr);
                case 4:
                    return zzld;
                case 5:
                    azm<C16245e> azm = zzdu;
                    if (azm == null) {
                        synchronized (C16245e.class) {
                            azm = zzdu;
                            if (azm == null) {
                                azm = new C15547b<>(zzld);
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
            axu.m47703a(C16245e.class, zzld);
        }
    }

    public static final class zza extends axu<zza, C16247a> implements azc {
        private static volatile azm<zza> zzdu;
        /* access modifiers changed from: private */
        public static final zza zzhi = new zza();
        private int zzdi;
        private String zzds = "";
        public String zzei = "";
        private String zzek = "";
        private String zzel = "D";
        private String zzem = "D";
        private int zzep;
        private int zzeq;
        private String zzer = "";
        private long zzes;
        private long zzet;
        private long zzeu;
        private long zzev;
        private long zzew;
        private long zzex;
        private long zzey;
        private long zzez;
        private long zzfa;
        private long zzfb;
        private String zzfc = "";
        private long zzfd;
        private long zzfe;
        private long zzff;
        private long zzfg;
        private long zzfh;
        private long zzfi;
        private long zzfj;
        private long zzfk;
        private long zzfl;
        private String zzfm = "";
        private long zzfn;
        private long zzfo;
        private long zzfp;
        private long zzfq;
        private long zzfr = -1;
        private long zzfs = -1;
        private C16237a zzft;
        private long zzfu = -1;
        private long zzfv = -1;
        private long zzfw = -1;
        private long zzfx = -1;
        private long zzfy = -1;
        private long zzfz = -1;
        private int zzga = 1000;
        private int zzgb = 1000;
        private long zzgc = -1;
        private long zzgd = -1;
        private long zzge = -1;
        private long zzgf = -1;
        private long zzgg = -1;
        private int zzgh = 1000;
        private C16248b zzgi;
        private ayc<C16248b> zzgj = m47706l();
        private C16250c zzgk;
        private long zzgl = -1;
        private long zzgm = -1;
        private long zzgn = -1;
        private long zzgo = -1;
        private long zzgp = -1;
        private long zzgq = -1;
        private long zzgr = -1;
        private long zzgs = -1;
        private String zzgt = "D";
        private long zzgu = -1;
        private int zzgv;
        private int zzgw;
        private int zzgx;
        private C16243d zzgy;
        private long zzgz = -1;
        private int zzha = 1000;
        private long zzhb;
        private String zzhc = "";
        private int zzhd = 2;
        private boolean zzhe;
        private String zzhf = "";
        private long zzhg;
        private C16241c zzhh;

        /* renamed from: com.google.android.gms.internal.ads.zzbo$zza$a */
        public static final class C16247a extends C15546a<zza, C16247a> implements azc {
            private C16247a() {
                super(zza.zzhi);
            }

            /* renamed from: a */
            public final C16247a mo42212a(String str) {
                mo40291c();
                ((zza) this.f41195a).m52744a(str);
                return this;
            }

            /* renamed from: b */
            public final C16247a mo42217b(String str) {
                mo40291c();
                ((zza) this.f41195a).m52753b(str);
                return this;
            }

            /* renamed from: a */
            public final C16247a mo42206a(long j) {
                mo40291c();
                ((zza) this.f41195a).m52729a(j);
                return this;
            }

            /* renamed from: b */
            public final C16247a mo42214b(long j) {
                mo40291c();
                ((zza) this.f41195a).m52746b(j);
                return this;
            }

            /* renamed from: c */
            public final C16247a mo42218c(long j) {
                mo40291c();
                ((zza) this.f41195a).m52754c(j);
                return this;
            }

            /* renamed from: d */
            public final C16247a mo42221d(long j) {
                mo40291c();
                ((zza) this.f41195a).m52761d(j);
                return this;
            }

            /* renamed from: e */
            public final C16247a mo42224e(long j) {
                mo40291c();
                ((zza) this.f41195a).m52768e(j);
                return this;
            }

            /* renamed from: f */
            public final C16247a mo42226f(long j) {
                mo40291c();
                ((zza) this.f41195a).m52772f(j);
                return this;
            }

            /* renamed from: g */
            public final C16247a mo42228g(long j) {
                mo40291c();
                ((zza) this.f41195a).m52776g(j);
                return this;
            }

            /* renamed from: h */
            public final C16247a mo42230h(long j) {
                mo40291c();
                ((zza) this.f41195a).m52780h(j);
                return this;
            }

            /* renamed from: i */
            public final C16247a mo42232i(long j) {
                mo40291c();
                ((zza) this.f41195a).m52784i(j);
                return this;
            }

            /* renamed from: j */
            public final C16247a mo42234j(long j) {
                mo40291c();
                ((zza) this.f41195a).m52788j(j);
                return this;
            }

            /* renamed from: k */
            public final C16247a mo42235k(long j) {
                mo40291c();
                ((zza) this.f41195a).m52790k(j);
                return this;
            }

            /* renamed from: l */
            public final C16247a mo42236l(long j) {
                mo40291c();
                ((zza) this.f41195a).m52792l(j);
                return this;
            }

            /* renamed from: c */
            public final C16247a mo42220c(String str) {
                mo40291c();
                ((zza) this.f41195a).m52759c(str);
                return this;
            }

            /* renamed from: d */
            public final C16247a mo42223d(String str) {
                mo40291c();
                ((zza) this.f41195a).m52766d(str);
                return this;
            }

            /* renamed from: m */
            public final C16247a mo42237m(long j) {
                mo40291c();
                ((zza) this.f41195a).m52794m(j);
                return this;
            }

            /* renamed from: n */
            public final C16247a mo42238n(long j) {
                mo40291c();
                ((zza) this.f41195a).m52796n(j);
                return this;
            }

            /* renamed from: o */
            public final C16247a mo42239o(long j) {
                mo40291c();
                ((zza) this.f41195a).m52798o(j);
                return this;
            }

            /* renamed from: e */
            public final C16247a mo42225e(String str) {
                mo40291c();
                ((zza) this.f41195a).m52771e(str);
                return this;
            }

            /* renamed from: p */
            public final C16247a mo42240p(long j) {
                mo40291c();
                ((zza) this.f41195a).m52801p(j);
                return this;
            }

            /* renamed from: q */
            public final C16247a mo42241q(long j) {
                mo40291c();
                ((zza) this.f41195a).m52803q(j);
                return this;
            }

            /* renamed from: r */
            public final C16247a mo42242r(long j) {
                mo40291c();
                ((zza) this.f41195a).m52805r(j);
                return this;
            }

            /* renamed from: s */
            public final C16247a mo42243s(long j) {
                mo40291c();
                ((zza) this.f41195a).m52807s(j);
                return this;
            }

            /* renamed from: t */
            public final C16247a mo42244t(long j) {
                mo40291c();
                ((zza) this.f41195a).m52809t(j);
                return this;
            }

            /* renamed from: u */
            public final C16247a mo42245u(long j) {
                mo40291c();
                ((zza) this.f41195a).m52811u(j);
                return this;
            }

            /* renamed from: v */
            public final C16247a mo42246v(long j) {
                mo40291c();
                ((zza) this.f41195a).m52813v(j);
                return this;
            }

            /* renamed from: w */
            public final C16247a mo42247w(long j) {
                mo40291c();
                ((zza) this.f41195a).m52815w(j);
                return this;
            }

            /* renamed from: x */
            public final C16247a mo42248x(long j) {
                mo40291c();
                ((zza) this.f41195a).m52817x(j);
                return this;
            }

            /* renamed from: f */
            public final C16247a mo42227f(String str) {
                mo40291c();
                ((zza) this.f41195a).m52775f(str);
                return this;
            }

            /* renamed from: g */
            public final C16247a mo42229g(String str) {
                mo40291c();
                ((zza) this.f41195a).m52779g(str);
                return this;
            }

            /* renamed from: a */
            public final C16247a mo42211a(zzby zzby) {
                mo40291c();
                ((zza) this.f41195a).m52743a(zzby);
                return this;
            }

            /* renamed from: b */
            public final C16247a mo42216b(zzby zzby) {
                mo40291c();
                ((zza) this.f41195a).m52752b(zzby);
                return this;
            }

            /* renamed from: y */
            public final C16247a mo42249y(long j) {
                mo40291c();
                ((zza) this.f41195a).m52819y(j);
                return this;
            }

            /* renamed from: z */
            public final C16247a mo42250z(long j) {
                mo40291c();
                ((zza) this.f41195a).m52821z(j);
                return this;
            }

            /* renamed from: A */
            public final C16247a mo42198A(long j) {
                mo40291c();
                ((zza) this.f41195a).m52714A(j);
                return this;
            }

            /* renamed from: c */
            public final C16247a mo42219c(zzby zzby) {
                mo40291c();
                ((zza) this.f41195a).m52758c(zzby);
                return this;
            }

            /* renamed from: a */
            public final C16247a mo42208a(C16248b bVar) {
                mo40291c();
                ((zza) this.f41195a).m52731a(bVar);
                return this;
            }

            /* renamed from: b */
            public final C16247a mo42215b(C16248b bVar) {
                mo40291c();
                ((zza) this.f41195a).m52747b(bVar);
                return this;
            }

            /* renamed from: a */
            public final C16247a mo42205a() {
                mo40291c();
                ((zza) this.f41195a).m52800p();
                return this;
            }

            /* renamed from: a */
            public final C16247a mo42209a(C16250c cVar) {
                mo40291c();
                ((zza) this.f41195a).m52732a(cVar);
                return this;
            }

            /* renamed from: B */
            public final C16247a mo42199B(long j) {
                mo40291c();
                ((zza) this.f41195a).m52716B(j);
                return this;
            }

            /* renamed from: C */
            public final C16247a mo42200C(long j) {
                mo40291c();
                ((zza) this.f41195a).m52718C(j);
                return this;
            }

            /* renamed from: D */
            public final C16247a mo42201D(long j) {
                mo40291c();
                ((zza) this.f41195a).m52720D(j);
                return this;
            }

            /* renamed from: E */
            public final C16247a mo42202E(long j) {
                mo40291c();
                ((zza) this.f41195a).m52722E(j);
                return this;
            }

            /* renamed from: F */
            public final C16247a mo42203F(long j) {
                mo40291c();
                ((zza) this.f41195a).m52724F(j);
                return this;
            }

            /* renamed from: h */
            public final C16247a mo42231h(String str) {
                mo40291c();
                ((zza) this.f41195a).m52783h(str);
                return this;
            }

            /* renamed from: a */
            public final C16247a mo42207a(C16243d dVar) {
                mo40291c();
                ((zza) this.f41195a).m52730a(dVar);
                return this;
            }

            /* renamed from: d */
            public final C16247a mo42222d(zzby zzby) {
                mo40291c();
                ((zza) this.f41195a).m52765d(zzby);
                return this;
            }

            /* renamed from: i */
            public final C16247a mo42233i(String str) {
                mo40291c();
                ((zza) this.f41195a).m52787i(str);
                return this;
            }

            /* renamed from: a */
            public final C16247a mo42210a(zzc zzc) {
                mo40291c();
                ((zza) this.f41195a).m52733a(zzc);
                return this;
            }

            /* renamed from: a */
            public final C16247a mo42213a(boolean z) {
                mo40291c();
                ((zza) this.f41195a).m52745a(z);
                return this;
            }

            /* renamed from: G */
            public final C16247a mo42204G(long j) {
                mo40291c();
                ((zza) this.f41195a).m52726G(j);
                return this;
            }

            /* synthetic */ C16247a(anx anx) {
                this();
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.zzbo$zza$b */
        public static final class C16248b extends axu<C16248b, C16249a> implements azc {
            private static volatile azm<C16248b> zzdu;
            /* access modifiers changed from: private */
            public static final C16248b zzjp = new C16248b();
            private int zzdi;
            private long zzfd = -1;
            private long zzfe = -1;
            private long zziw = -1;
            private long zzix = -1;
            private long zziy = -1;
            private long zziz = -1;
            private int zzja = 1000;
            private long zzjb = -1;
            private long zzjc = -1;
            private long zzjd = -1;
            private int zzje = 1000;
            private long zzjf = -1;
            private long zzjg = -1;
            private long zzjh = -1;
            private long zzji = -1;
            private long zzjj;
            private long zzjk;
            private long zzjl = -1;
            private long zzjm = -1;
            private long zzjn = -1;
            private long zzjo = -1;

            /* renamed from: com.google.android.gms.internal.ads.zzbo$zza$b$a */
            public static final class C16249a extends C15546a<C16248b, C16249a> implements azc {
                private C16249a() {
                    super(C16248b.zzjp);
                }

                /* renamed from: a */
                public final C16249a mo42251a(long j) {
                    mo40291c();
                    ((C16248b) this.f41195a).m52881a(j);
                    return this;
                }

                /* renamed from: b */
                public final C16249a mo42253b(long j) {
                    mo40291c();
                    ((C16248b) this.f41195a).m52887b(j);
                    return this;
                }

                /* renamed from: c */
                public final C16249a mo42255c(long j) {
                    mo40291c();
                    ((C16248b) this.f41195a).m52892c(j);
                    return this;
                }

                /* renamed from: d */
                public final C16249a mo42256d(long j) {
                    mo40291c();
                    ((C16248b) this.f41195a).m52894d(j);
                    return this;
                }

                /* renamed from: a */
                public final C16249a mo42205a() {
                    mo40291c();
                    ((C16248b) this.f41195a).m52891c();
                    return this;
                }

                /* renamed from: e */
                public final C16249a mo42257e(long j) {
                    mo40291c();
                    ((C16248b) this.f41195a).m52896e(j);
                    return this;
                }

                /* renamed from: f */
                public final C16249a mo42258f(long j) {
                    mo40291c();
                    ((C16248b) this.f41195a).m52898f(j);
                    return this;
                }

                /* renamed from: a */
                public final C16249a mo42252a(zzby zzby) {
                    mo40291c();
                    ((C16248b) this.f41195a).m52885a(zzby);
                    return this;
                }

                /* renamed from: g */
                public final C16249a mo42259g(long j) {
                    mo40291c();
                    ((C16248b) this.f41195a).m52900g(j);
                    return this;
                }

                /* renamed from: h */
                public final C16249a mo42260h(long j) {
                    mo40291c();
                    ((C16248b) this.f41195a).m52902h(j);
                    return this;
                }

                /* renamed from: i */
                public final C16249a mo42261i(long j) {
                    mo40291c();
                    ((C16248b) this.f41195a).m52904i(j);
                    return this;
                }

                /* renamed from: b */
                public final C16249a mo42254b(zzby zzby) {
                    mo40291c();
                    ((C16248b) this.f41195a).m52890b(zzby);
                    return this;
                }

                /* renamed from: j */
                public final C16249a mo42262j(long j) {
                    mo40291c();
                    ((C16248b) this.f41195a).m52906j(j);
                    return this;
                }

                /* renamed from: k */
                public final C16249a mo42263k(long j) {
                    mo40291c();
                    ((C16248b) this.f41195a).m52908k(j);
                    return this;
                }

                /* renamed from: l */
                public final C16249a mo42264l(long j) {
                    mo40291c();
                    ((C16248b) this.f41195a).m52910l(j);
                    return this;
                }

                /* renamed from: m */
                public final C16249a mo42265m(long j) {
                    mo40291c();
                    ((C16248b) this.f41195a).m52912m(j);
                    return this;
                }

                /* renamed from: n */
                public final C16249a mo42266n(long j) {
                    mo40291c();
                    ((C16248b) this.f41195a).m52914n(j);
                    return this;
                }

                /* renamed from: o */
                public final C16249a mo42267o(long j) {
                    mo40291c();
                    ((C16248b) this.f41195a).m52916o(j);
                    return this;
                }

                /* renamed from: p */
                public final C16249a mo42268p(long j) {
                    mo40291c();
                    ((C16248b) this.f41195a).m52918p(j);
                    return this;
                }

                /* renamed from: q */
                public final C16249a mo42269q(long j) {
                    mo40291c();
                    ((C16248b) this.f41195a).m52920q(j);
                    return this;
                }

                /* synthetic */ C16249a(anx anx) {
                    this();
                }
            }

            private C16248b() {
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public final void m52881a(long j) {
                this.zzdi |= 1;
                this.zzfd = j;
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public final void m52887b(long j) {
                this.zzdi |= 2;
                this.zzfe = j;
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public final void m52892c(long j) {
                this.zzdi |= 4;
                this.zziw = j;
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public final void m52894d(long j) {
                this.zzdi |= 8;
                this.zzix = j;
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public final void m52891c() {
                this.zzdi &= -9;
                this.zzix = -1;
            }

            /* access modifiers changed from: private */
            /* renamed from: e */
            public final void m52896e(long j) {
                this.zzdi |= 16;
                this.zziy = j;
            }

            /* access modifiers changed from: private */
            /* renamed from: f */
            public final void m52898f(long j) {
                this.zzdi |= 32;
                this.zziz = j;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public final void m52885a(zzby zzby) {
                if (zzby != null) {
                    this.zzdi |= 64;
                    this.zzja = zzby.zzac();
                    return;
                }
                throw new NullPointerException();
            }

            /* access modifiers changed from: private */
            /* renamed from: g */
            public final void m52900g(long j) {
                this.zzdi |= PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
                this.zzjb = j;
            }

            /* access modifiers changed from: private */
            /* renamed from: h */
            public final void m52902h(long j) {
                this.zzdi |= 256;
                this.zzjc = j;
            }

            /* access modifiers changed from: private */
            /* renamed from: i */
            public final void m52904i(long j) {
                this.zzdi |= 512;
                this.zzjd = j;
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public final void m52890b(zzby zzby) {
                if (zzby != null) {
                    this.zzdi |= PreloadTask.BYTE_UNIT_NUMBER;
                    this.zzje = zzby.zzac();
                    return;
                }
                throw new NullPointerException();
            }

            /* access modifiers changed from: private */
            /* renamed from: j */
            public final void m52906j(long j) {
                this.zzdi |= 2048;
                this.zzjf = j;
            }

            /* access modifiers changed from: private */
            /* renamed from: k */
            public final void m52908k(long j) {
                this.zzdi |= 4096;
                this.zzjg = j;
            }

            /* access modifiers changed from: private */
            /* renamed from: l */
            public final void m52910l(long j) {
                this.zzdi |= VideoCacheReadBuffersizeExperiment.DEFAULT;
                this.zzjh = j;
            }

            /* access modifiers changed from: private */
            /* renamed from: m */
            public final void m52912m(long j) {
                this.zzdi |= 16384;
                this.zzji = j;
            }

            /* access modifiers changed from: private */
            /* renamed from: n */
            public final void m52914n(long j) {
                this.zzdi |= 32768;
                this.zzjj = j;
            }

            /* access modifiers changed from: private */
            /* renamed from: o */
            public final void m52916o(long j) {
                this.zzdi |= 65536;
                this.zzjk = j;
            }

            /* access modifiers changed from: private */
            /* renamed from: p */
            public final void m52918p(long j) {
                this.zzdi |= 131072;
                this.zzjl = j;
            }

            /* access modifiers changed from: private */
            /* renamed from: q */
            public final void m52920q(long j) {
                this.zzdi |= 262144;
                this.zzjm = j;
            }

            /* renamed from: a */
            public static C16249a m52880a() {
                return (C16249a) ((C15546a) zzjp.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo39285a(int i, Object obj, Object obj2) {
                switch (anx.f40805a[i - 1]) {
                    case 1:
                        return new C16248b();
                    case 2:
                        return new C16249a(null);
                    case 3:
                        Object[] objArr = {"zzdi", "zzfd", "zzfe", "zziw", "zzix", "zziy", "zziz", "zzja", zzby.zzad(), "zzjb", "zzjc", "zzjd", "zzje", zzby.zzad(), "zzjf", "zzjg", "zzjh", "zzji", "zzjj", "zzjk", "zzjl", "zzjm", "zzjn", "zzjo"};
                        return m47701a((aza) zzjp, "\u0001\u0015\u0000\u0001\u0001\u0015\u0015\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\f\u0006\b\u0002\u0007\t\u0002\b\n\u0002\t\u000b\f\n\f\u0002\u000b\r\u0002\f\u000e\u0002\r\u000f\u0002\u000e\u0010\u0002\u000f\u0011\u0002\u0010\u0012\u0002\u0011\u0013\u0002\u0012\u0014\u0002\u0013\u0015\u0002\u0014", objArr);
                    case 4:
                        return zzjp;
                    case 5:
                        azm<C16248b> azm = zzdu;
                        if (azm == null) {
                            synchronized (C16248b.class) {
                                azm = zzdu;
                                if (azm == null) {
                                    azm = new C15547b<>(zzjp);
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
                axu.m47703a(C16248b.class, zzjp);
            }
        }

        /* renamed from: com.google.android.gms.internal.ads.zzbo$zza$c */
        public static final class C16250c extends axu<C16250c, C16251a> implements azc {
            private static volatile azm<C16250c> zzdu;
            /* access modifiers changed from: private */
            public static final C16250c zzju = new C16250c();
            private int zzdi;
            private long zzgf = -1;
            private long zzgg = -1;
            private long zzjq = -1;
            private long zzjr = -1;
            private long zzjs = -1;
            private long zzjt = -1;

            /* renamed from: com.google.android.gms.internal.ads.zzbo$zza$c$a */
            public static final class C16251a extends C15546a<C16250c, C16251a> implements azc {
                private C16251a() {
                    super(C16250c.zzju);
                }

                /* renamed from: a */
                public final C16251a mo42270a(long j) {
                    mo40291c();
                    ((C16250c) this.f41195a).m52944a(j);
                    return this;
                }

                /* renamed from: b */
                public final C16251a mo42271b(long j) {
                    mo40291c();
                    ((C16250c) this.f41195a).m52947b(j);
                    return this;
                }

                /* renamed from: c */
                public final C16251a mo42272c(long j) {
                    mo40291c();
                    ((C16250c) this.f41195a).m52949c(j);
                    return this;
                }

                /* renamed from: d */
                public final C16251a mo42273d(long j) {
                    mo40291c();
                    ((C16250c) this.f41195a).m52951d(j);
                    return this;
                }

                /* synthetic */ C16251a(anx anx) {
                    this();
                }
            }

            private C16250c() {
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public final void m52944a(long j) {
                this.zzdi |= 4;
                this.zzjq = j;
            }

            /* access modifiers changed from: private */
            /* renamed from: b */
            public final void m52947b(long j) {
                this.zzdi |= 8;
                this.zzjr = j;
            }

            /* access modifiers changed from: private */
            /* renamed from: c */
            public final void m52949c(long j) {
                this.zzdi |= 16;
                this.zzjs = j;
            }

            /* access modifiers changed from: private */
            /* renamed from: d */
            public final void m52951d(long j) {
                this.zzdi |= 32;
                this.zzjt = j;
            }

            /* renamed from: a */
            public static C16251a m52943a() {
                return (C16251a) ((C15546a) zzju.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
            }

            /* access modifiers changed from: protected */
            /* renamed from: a */
            public final Object mo39285a(int i, Object obj, Object obj2) {
                switch (anx.f40805a[i - 1]) {
                    case 1:
                        return new C16250c();
                    case 2:
                        return new C16251a(null);
                    case 3:
                        Object[] objArr = {"zzdi", "zzgf", "zzgg", "zzjq", "zzjr", "zzjs", "zzjt"};
                        return m47701a((aza) zzju, "\u0001\u0006\u0000\u0001\u0001\u0006\u0006\u0000\u0000\u0000\u0001\u0002\u0000\u0002\u0002\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005", objArr);
                    case 4:
                        return zzju;
                    case 5:
                        azm<C16250c> azm = zzdu;
                        if (azm == null) {
                            synchronized (C16250c.class) {
                                azm = zzdu;
                                if (azm == null) {
                                    azm = new C15547b<>(zzju);
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
                axu.m47703a(C16250c.class, zzju);
            }
        }

        public enum zzb implements axx {
            DEBUGGER_STATE_UNSPECIFIED(0),
            DEBUGGER_STATE_NOT_INSTALLED(1),
            DEBUGGER_STATE_INSTALLED(2),
            DEBUGGER_STATE_ACTIVE(3);
            
            private static final axy<zzb> zzef = null;
            private final int value;

            public final int zzac() {
                return this.value;
            }

            public static zzb zzf(int i) {
                switch (i) {
                    case 0:
                        return DEBUGGER_STATE_UNSPECIFIED;
                    case 1:
                        return DEBUGGER_STATE_NOT_INSTALLED;
                    case 2:
                        return DEBUGGER_STATE_INSTALLED;
                    case 3:
                        return DEBUGGER_STATE_ACTIVE;
                    default:
                        return null;
                }
            }

            public static axz zzad() {
                return aps.f40897a;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzef = new aox();
            }
        }

        public enum zzc implements axx {
            DEVICE_IDENTIFIER_NO_ID(0),
            DEVICE_IDENTIFIER_APP_SPECIFIC_ID(1),
            DEVICE_IDENTIFIER_GLOBAL_ID(2),
            DEVICE_IDENTIFIER_ADVERTISER_ID(3),
            DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED(4),
            DEVICE_IDENTIFIER_ANDROID_AD_ID(5),
            DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID(6);
            
            private static final axy<zzc> zzef = null;
            private final int value;

            public final int zzac() {
                return this.value;
            }

            public static zzc zzg(int i) {
                switch (i) {
                    case 0:
                        return DEVICE_IDENTIFIER_NO_ID;
                    case 1:
                        return DEVICE_IDENTIFIER_APP_SPECIFIC_ID;
                    case 2:
                        return DEVICE_IDENTIFIER_GLOBAL_ID;
                    case 3:
                        return DEVICE_IDENTIFIER_ADVERTISER_ID;
                    case 4:
                        return DEVICE_IDENTIFIER_ADVERTISER_ID_UNHASHED;
                    case 5:
                        return DEVICE_IDENTIFIER_ANDROID_AD_ID;
                    case 6:
                        return DEVICE_IDENTIFIER_GFIBER_ADVERTISING_ID;
                    default:
                        return null;
                }
            }

            public static axz zzad() {
                return arj.f40961a;
            }

            private zzc(int i) {
                this.value = i;
            }

            static {
                zzef = new aqn();
            }
        }

        public enum zzd implements axx {
            ERROR_ENCODE_SIZE_FAIL(1),
            ERROR_UNKNOWN(3),
            ERROR_NO_SIGNALS(5),
            ERROR_ENCRYPTION(7),
            ERROR_MEMORY(9),
            ERROR_SIMULATOR(11),
            ERROR_SERVICE(13),
            ERROR_THREAD(15),
            PSN_WEB64_FAIL(2),
            PSN_DECRYPT_SIZE_FAIL(4),
            PSN_MD5_CHECK_FAIL(8),
            PSN_MD5_SIZE_FAIL(16),
            PSN_MD5_FAIL(32),
            PSN_DECODE_FAIL(64),
            PSN_SALT_FAIL(PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH),
            PSN_BITSLICER_FAIL(256),
            PSN_REQUEST_TYPE_FAIL(512),
            PSN_INVALID_ERROR_CODE(PreloadTask.BYTE_UNIT_NUMBER),
            PSN_TIMESTAMP_EXPIRED(2048),
            PSN_ENCODE_SIZE_FAIL(4096),
            PSN_BLANK_VALUE(VideoCacheReadBuffersizeExperiment.DEFAULT),
            PSN_INITIALIZATION_FAIL(16384),
            PSN_GASS_CLIENT_FAIL(32768),
            PSN_SIGNALS_TIMEOUT(65536),
            PSN_TINK_FAIL(131072);
            
            private static final axy<zzd> zzef = null;
            private final int value;

            public final int zzac() {
                return this.value;
            }

            private zzd(int i) {
                this.value = i;
            }

            static {
                zzef = new ase();
            }
        }

        private zza() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m52744a(String str) {
            if (str != null) {
                this.zzdi |= 1;
                this.zzer = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m52753b(String str) {
            if (str != null) {
                this.zzdi |= 2;
                this.zzds = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m52729a(long j) {
            this.zzdi |= 4;
            this.zzes = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m52746b(long j) {
            this.zzdi |= 16;
            this.zzeu = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final void m52754c(long j) {
            this.zzdi |= 32;
            this.zzev = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final void m52761d(long j) {
            this.zzdi |= PreloadTask.BYTE_UNIT_NUMBER;
            this.zzfa = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final void m52768e(long j) {
            this.zzdi |= 2048;
            this.zzfb = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final void m52772f(long j) {
            this.zzdi |= VideoCacheReadBuffersizeExperiment.DEFAULT;
            this.zzfd = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public final void m52776g(long j) {
            this.zzdi |= 16384;
            this.zzfe = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public final void m52780h(long j) {
            this.zzdi |= 32768;
            this.zzff = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public final void m52784i(long j) {
            this.zzdi |= 65536;
            this.zzfg = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: j */
        public final void m52788j(long j) {
            this.zzdi |= 524288;
            this.zzfj = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: k */
        public final void m52790k(long j) {
            this.zzdi |= 1048576;
            this.zzfk = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: l */
        public final void m52792l(long j) {
            this.zzdi |= 2097152;
            this.zzfl = j;
        }

        /* renamed from: a */
        public final boolean mo42195a() {
            return (this.zzdi & 4194304) == 4194304;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final void m52759c(String str) {
            if (str != null) {
                this.zzdi |= 4194304;
                this.zzei = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final void m52766d(String str) {
            if (str != null) {
                this.zzdi |= 8388608;
                this.zzfm = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: m */
        public final void m52794m(long j) {
            this.zzdi |= 16777216;
            this.zzfn = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: n */
        public final void m52796n(long j) {
            this.zzdi |= 33554432;
            this.zzfo = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: o */
        public final void m52798o(long j) {
            this.zzdi |= 67108864;
            this.zzfp = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: e */
        public final void m52771e(String str) {
            if (str != null) {
                this.zzdi |= 134217728;
                this.zzek = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public final void m52801p(long j) {
            this.zzdi |= 268435456;
            this.zzfq = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: q */
        public final void m52803q(long j) {
            this.zzdi |= 536870912;
            this.zzfr = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: r */
        public final void m52805r(long j) {
            this.zzdi |= 1073741824;
            this.zzfs = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: s */
        public final void m52807s(long j) {
            this.zzep |= 1;
            this.zzfu = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: t */
        public final void m52809t(long j) {
            this.zzep |= 2;
            this.zzfv = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: u */
        public final void m52811u(long j) {
            this.zzep |= 4;
            this.zzfw = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: v */
        public final void m52813v(long j) {
            this.zzep |= 8;
            this.zzfx = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: w */
        public final void m52815w(long j) {
            this.zzep |= 16;
            this.zzfy = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: x */
        public final void m52817x(long j) {
            this.zzep |= 32;
            this.zzfz = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: f */
        public final void m52775f(String str) {
            if (str != null) {
                this.zzep |= 64;
                this.zzel = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: g */
        public final void m52779g(String str) {
            if (str != null) {
                this.zzep |= PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
                this.zzem = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m52743a(zzby zzby) {
            if (zzby != null) {
                this.zzep |= 256;
                this.zzga = zzby.zzac();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m52752b(zzby zzby) {
            if (zzby != null) {
                this.zzep |= 512;
                this.zzgb = zzby.zzac();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: y */
        public final void m52819y(long j) {
            this.zzep |= PreloadTask.BYTE_UNIT_NUMBER;
            this.zzgc = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: z */
        public final void m52821z(long j) {
            this.zzep |= 2048;
            this.zzgd = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: A */
        public final void m52714A(long j) {
            this.zzep |= 4096;
            this.zzge = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final void m52758c(zzby zzby) {
            if (zzby != null) {
                this.zzep |= 32768;
                this.zzgh = zzby.zzac();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m52731a(C16248b bVar) {
            if (bVar != null) {
                this.zzgi = bVar;
                this.zzep |= 65536;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m52747b(C16248b bVar) {
            if (bVar != null) {
                if (!this.zzgj.mo40090a()) {
                    ayc<C16248b> ayc = this.zzgj;
                    int size = ayc.size();
                    this.zzgj = ayc.mo40105a(size == 0 ? 10 : size << 1);
                }
                this.zzgj.add(bVar);
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: p */
        public final void m52800p() {
            this.zzgj = m47706l();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m52732a(C16250c cVar) {
            if (cVar != null) {
                this.zzgk = cVar;
                this.zzep |= 131072;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: B */
        public final void m52716B(long j) {
            this.zzep |= 524288;
            this.zzgm = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: C */
        public final void m52718C(long j) {
            this.zzep |= 1048576;
            this.zzgn = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: D */
        public final void m52720D(long j) {
            this.zzep |= 2097152;
            this.zzgo = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: E */
        public final void m52722E(long j) {
            this.zzep |= 16777216;
            this.zzgr = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: F */
        public final void m52724F(long j) {
            this.zzep |= 33554432;
            this.zzgs = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: h */
        public final void m52783h(String str) {
            if (str != null) {
                this.zzep |= 67108864;
                this.zzgt = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m52730a(C16243d dVar) {
            if (dVar != null) {
                this.zzgy = dVar;
                this.zzep |= Integer.MIN_VALUE;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: d */
        public final void m52765d(zzby zzby) {
            if (zzby != null) {
                this.zzeq |= 2;
                this.zzha = zzby.zzac();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: i */
        public final void m52787i(String str) {
            if (str != null) {
                this.zzeq |= 8;
                this.zzhc = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m52733a(zzc zzc2) {
            if (zzc2 != null) {
                this.zzeq |= 16;
                this.zzhd = zzc2.zzac();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m52745a(boolean z) {
            this.zzeq |= 32;
            this.zzhe = z;
        }

        /* access modifiers changed from: private */
        /* renamed from: G */
        public final void m52726G(long j) {
            this.zzeq |= PhotoMovieContext.PHOTO_MOVIE_COVER_WIDTH;
            this.zzhg = j;
        }

        /* renamed from: b */
        public final boolean mo42196b() {
            return (this.zzeq & 256) == 256;
        }

        /* renamed from: c */
        public final C16241c mo42197c() {
            return this.zzhh == null ? C16241c.m52692b() : this.zzhh;
        }

        /* renamed from: a */
        public static zza m52728a(byte[] bArr, axi axi) throws zzcdx {
            return (zza) axu.m47699a(zzhi, bArr, axi);
        }

        /* renamed from: d */
        public static C16247a m52760d() {
            return (C16247a) ((C15546a) zzhi.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo39285a(int i, Object obj, Object obj2) {
            switch (anx.f40805a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C16247a(null);
                case 3:
                    Object[] objArr = {"zzdi", "zzep", "zzeq", "zzer", "zzds", "zzes", "zzet", "zzeu", "zzev", "zzew", "zzex", "zzey", "zzez", "zzfa", "zzfb", "zzfc", "zzfd", "zzfe", "zzff", "zzfg", "zzfh", "zzfi", "zzfj", "zzhb", "zzfk", "zzfl", "zzhc", "zzhg", "zzhd", zzc.zzad(), "zzei", "zzhe", "zzfm", "zzhf", "zzfn", "zzfo", "zzfp", "zzek", "zzfq", "zzfr", "zzfs", "zzft", "zzfu", "zzfv", "zzfw", "zzfx", "zzgj", C16248b.class, "zzfy", "zzfz", "zzel", "zzem", "zzga", zzby.zzad(), "zzgb", zzby.zzad(), "zzgi", "zzgc", "zzgd", "zzge", "zzgf", "zzgg", "zzgh", zzby.zzad(), "zzgk", "zzgl", "zzgm", "zzgn", "zzgo", "zzgr", "zzgs", "zzgu", "zzgv", zzbv.zzad(), "zzgw", zzcb.zzad(), "zzgt", "zzgx", zzb.zzad(), "zzgy", "zzgz", "zzgp", "zzgq", "zzha", zzby.zzad(), "zzhh"};
                    return m47701a((aza) zzhi, "\u0001J\u0000\u0003\u0001ÉJ\u0000\u0001\u0000\u0001\b\u0000\u0002\b\u0001\u0003\u0002\u0002\u0004\u0002\u0003\u0005\u0002\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\u0002\u0007\t\u0002\b\n\u0002\t\u000b\u0002\n\f\u0002\u000b\r\b\f\u000e\u0002\r\u000f\u0002\u000e\u0010\u0002\u000f\u0011\u0002\u0010\u0012\u0002\u0011\u0013\u0002\u0012\u0014\u0002\u0013\u0015\u0002B\u0016\u0002\u0014\u0017\u0002\u0015\u0018\bC\u0019\u0002G\u001a\fD\u001b\b\u0016\u001c\u0007E\u001d\b\u0017\u001e\bF\u001f\u0002\u0018 \u0002\u0019!\u0002\u001a\"\b\u001b#\u0002\u001c$\u0002\u001d%\u0002\u001e&\t\u001f'\u0002 (\u0002!)\u0002\"*\u0002#+\u001b,\u0002$-\u0002%.\b&/\b'0\f(1\f)2\t03\u0002*4\u0002+5\u0002,6\u0002-7\u0002.8\f/9\t1:\u00022;\u00023<\u00024=\u00025>\u00028?\u00029@\u0002;A\f<B\f=C\b:D\f>E\t?F\u0002@G\u00026H\u00027I\fAÉ\tH", objArr);
                case 4:
                    return zzhi;
                case 5:
                    azm<zza> azm = zzdu;
                    if (azm == null) {
                        synchronized (zza.class) {
                            azm = zzdu;
                            if (azm == null) {
                                azm = new C15547b<>(zzhi);
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
            axu.m47703a(zza.class, zzhi);
        }
    }
}
