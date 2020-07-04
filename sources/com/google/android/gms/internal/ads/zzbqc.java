package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;
import com.google.android.gms.internal.ads.axu.C15550e;

public final class zzbqc extends axu<zzbqc, C16252a> implements azc {
    private static volatile azm<zzbqc> zzdu;
    private static final ayb<Integer, zza> zzfgc = new apa();
    /* access modifiers changed from: private */
    public static final zzbqc zzfgg = new zzbqc();
    private int zzdi;
    private aya zzfgb = m47705k();
    private String zzfgd = "";
    private String zzfge = "";
    private String zzfgf = "";

    /* renamed from: com.google.android.gms.internal.ads.zzbqc$a */
    public static final class C16252a extends C15546a<zzbqc, C16252a> implements azc {
        private C16252a() {
            super(zzbqc.zzfgg);
        }

        /* renamed from: a */
        public final C16252a mo42275a(zza zza) {
            mo40291c();
            ((zzbqc) this.f41195a).m52959a(zza);
            return this;
        }

        /* renamed from: a */
        public final C16252a mo42276a(String str) {
            mo40291c();
            ((zzbqc) this.f41195a).m52962a(str);
            return this;
        }

        /* synthetic */ C16252a(apa apa) {
            this();
        }
    }

    public enum zza implements axx {
        BLOCKED_REASON_UNKNOWN(1),
        BLOCKED_REASON_BACKGROUND(2);
        
        private static final axy<zza> zzef = null;
        private final int value;

        public final int zzac() {
            return this.value;
        }

        public static zza zzdo(int i) {
            switch (i) {
                case 1:
                    return BLOCKED_REASON_UNKNOWN;
                case 2:
                    return BLOCKED_REASON_BACKGROUND;
                default:
                    return null;
            }
        }

        public static axz zzad() {
            return apd.f40893a;
        }

        private zza(int i) {
            this.value = i;
        }

        static {
            zzef = new apc();
        }
    }

    private zzbqc() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m52959a(zza zza2) {
        if (zza2 != null) {
            if (!this.zzfgb.mo40090a()) {
                aya aya = this.zzfgb;
                int size = aya.size();
                this.zzfgb = aya.mo40294b(size == 0 ? 10 : size << 1);
            }
            this.zzfgb.mo40296d(zza2.zzac());
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m52962a(String str) {
        if (str != null) {
            this.zzdi |= 1;
            this.zzfgd = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static C16252a m52958a() {
        return (C16252a) ((C15546a) zzfgg.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (apb.f40892a[i - 1]) {
            case 1:
                return new zzbqc();
            case 2:
                return new C16252a(null);
            case 3:
                Object[] objArr = {"zzdi", "zzfgb", zza.zzad(), "zzfgd", "zzfge", "zzfgf"};
                return m47701a((aza) zzfgg, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0001\u0000\u0001\u001e\u0002\b\u0000\u0003\b\u0001\u0004\b\u0002", objArr);
            case 4:
                return zzfgg;
            case 5:
                azm<zzbqc> azm = zzdu;
                if (azm == null) {
                    synchronized (zzbqc.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfgg);
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
        axu.m47703a(zzbqc.class, zzfgg);
    }
}
