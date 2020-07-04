package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;
import com.google.android.gms.internal.ads.axu.C15550e;

public final class ats extends axu<ats, C15531a> implements azc {
    private static volatile azm<ats> zzdu;
    /* access modifiers changed from: private */
    public static final ats zzfnc = new ats();
    private int zzdi;
    public int zzfmu;
    private ayc<C15532b> zzfnb = m47706l();

    /* renamed from: com.google.android.gms.internal.ads.ats$a */
    public static final class C15531a extends C15546a<ats, C15531a> implements azc {
        private C15531a() {
            super(ats.zzfnc);
        }

        /* renamed from: a */
        public final C15531a mo40033a(int i) {
            mo40291c();
            ((ats) this.f41195a).zzfmu = i;
            return this;
        }

        /* renamed from: a */
        public final C15531a mo40034a(C15532b bVar) {
            mo40291c();
            ((ats) this.f41195a).m47237a(bVar);
            return this;
        }

        /* synthetic */ C15531a(att att) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.ats$b */
    public static final class C15532b extends axu<C15532b, C15533a> implements azc {
        private static volatile azm<C15532b> zzdu;
        /* access modifiers changed from: private */
        public static final C15532b zzfnd = new C15532b();
        private String zzflw = "";
        private int zzfmn;
        private int zzfmy;
        public int zzfmz;

        /* renamed from: com.google.android.gms.internal.ads.ats$b$a */
        public static final class C15533a extends C15546a<C15532b, C15533a> implements azc {
            private C15533a() {
                super(C15532b.zzfnd);
            }

            /* renamed from: a */
            public final C15533a mo40038a(String str) {
                mo40291c();
                ((C15532b) this.f41195a).m47251a(str);
                return this;
            }

            /* renamed from: a */
            public final C15533a mo40036a(zzbwh zzbwh) {
                mo40291c();
                ((C15532b) this.f41195a).m47249a(zzbwh);
                return this;
            }

            /* renamed from: a */
            public final C15533a mo40035a(int i) {
                mo40291c();
                ((C15532b) this.f41195a).zzfmz = i;
                return this;
            }

            /* renamed from: a */
            public final C15533a mo40037a(zzbwz zzbwz) {
                mo40291c();
                ((C15532b) this.f41195a).m47250a(zzbwz);
                return this;
            }

            /* synthetic */ C15533a(att att) {
                this();
            }
        }

        private C15532b() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m47251a(String str) {
            if (str != null) {
                this.zzflw = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m47249a(zzbwh zzbwh) {
            if (zzbwh != null) {
                this.zzfmy = zzbwh.zzac();
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m47250a(zzbwz zzbwz) {
            if (zzbwz != null) {
                this.zzfmn = zzbwz.zzac();
                return;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public static C15533a m47244a() {
            return (C15533a) ((C15546a) zzfnd.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo39285a(int i, Object obj, Object obj2) {
            switch (att.f41027a[i - 1]) {
                case 1:
                    return new C15532b();
                case 2:
                    return new C15533a(null);
                case 3:
                    Object[] objArr = {"zzflw", "zzfmy", "zzfmz", "zzfmn"};
                    return m47701a((aza) zzfnd, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f", objArr);
                case 4:
                    return zzfnd;
                case 5:
                    azm<C15532b> azm = zzdu;
                    if (azm == null) {
                        synchronized (C15532b.class) {
                            azm = zzdu;
                            if (azm == null) {
                                azm = new C15547b<>(zzfnd);
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
            axu.m47703a(C15532b.class, zzfnd);
        }
    }

    private ats() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m47237a(C15532b bVar) {
        if (bVar != null) {
            if (!this.zzfnb.mo40090a()) {
                ayc<C15532b> ayc = this.zzfnb;
                int size = ayc.size();
                this.zzfnb = ayc.mo40105a(size == 0 ? 10 : size << 1);
            }
            this.zzfnb.add(bVar);
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static C15531a m47236a() {
        return (C15531a) ((C15546a) zzfnc.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (att.f41027a[i - 1]) {
            case 1:
                return new ats();
            case 2:
                return new C15531a(null);
            case 3:
                Object[] objArr = {"zzdi", "zzfmu", "zzfnb", C15532b.class};
                return m47701a((aza) zzfnc, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", objArr);
            case 4:
                return zzfnc;
            case 5:
                azm<ats> azm = zzdu;
                if (azm == null) {
                    synchronized (ats.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfnc);
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
        axu.m47703a(ats.class, zzfnc);
    }
}
