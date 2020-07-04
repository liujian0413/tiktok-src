package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;

public final class atq extends axu<atq, C15528a> implements azc {
    private static volatile azm<atq> zzdu;
    /* access modifiers changed from: private */
    public static final atq zzfmw = new atq();
    private int zzdi;
    public int zzfmu;
    public ayc<C15529b> zzfmv = m47706l();

    /* renamed from: com.google.android.gms.internal.ads.atq$a */
    public static final class C15528a extends C15546a<atq, C15528a> implements azc {
        private C15528a() {
            super(atq.zzfmw);
        }

        /* synthetic */ C15528a(atr atr) {
            this();
        }
    }

    /* renamed from: com.google.android.gms.internal.ads.atq$b */
    public static final class C15529b extends axu<C15529b, C15530a> implements azc {
        private static volatile azm<C15529b> zzdu;
        /* access modifiers changed from: private */
        public static final C15529b zzfna = new C15529b();
        private int zzfmn;
        private zzbwe zzfmx;
        private int zzfmy;
        public int zzfmz;

        /* renamed from: com.google.android.gms.internal.ads.atq$b$a */
        public static final class C15530a extends C15546a<C15529b, C15530a> implements azc {
            private C15530a() {
                super(C15529b.zzfna);
            }

            /* synthetic */ C15530a(atr atr) {
                this();
            }
        }

        private C15529b() {
        }

        /* renamed from: a */
        public final boolean mo40029a() {
            return this.zzfmx != null;
        }

        /* renamed from: b */
        public final zzbwe mo40030b() {
            return this.zzfmx == null ? zzbwe.m52988c() : this.zzfmx;
        }

        /* renamed from: c */
        public final zzbwh mo40031c() {
            zzbwh zzek = zzbwh.zzek(this.zzfmy);
            return zzek == null ? zzbwh.UNRECOGNIZED : zzek;
        }

        /* renamed from: d */
        public final zzbwz mo40032d() {
            zzbwz zzev = zzbwz.zzev(this.zzfmn);
            return zzev == null ? zzbwz.UNRECOGNIZED : zzev;
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo39285a(int i, Object obj, Object obj2) {
            switch (atr.f41026a[i - 1]) {
                case 1:
                    return new C15529b();
                case 2:
                    return new C15530a(null);
                case 3:
                    Object[] objArr = {"zzfmx", "zzfmy", "zzfmz", "zzfmn"};
                    return m47701a((aza) zzfna, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\t\u0002\f\u0003\u000b\u0004\f", objArr);
                case 4:
                    return zzfna;
                case 5:
                    azm<C15529b> azm = zzdu;
                    if (azm == null) {
                        synchronized (C15529b.class) {
                            azm = zzdu;
                            if (azm == null) {
                                azm = new C15547b<>(zzfna);
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
            axu.m47703a(C15529b.class, zzfna);
        }
    }

    private atq() {
    }

    /* renamed from: a */
    public final int mo40028a() {
        return this.zzfmv.size();
    }

    /* renamed from: a */
    public static atq m47226a(byte[] bArr) throws zzcdx {
        return (atq) axu.m47697a(zzfmw, bArr);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (atr.f41026a[i - 1]) {
            case 1:
                return new atq();
            case 2:
                return new C15528a(null);
            case 3:
                Object[] objArr = {"zzdi", "zzfmu", "zzfmv", C15529b.class};
                return m47701a((aza) zzfmw, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\u000b\u0002\u001b", objArr);
            case 4:
                return zzfmw;
            case 5:
                azm<atq> azm = zzdu;
                if (azm == null) {
                    synchronized (atq.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfmw);
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
        axu.m47703a(atq.class, zzfmw);
    }
}
