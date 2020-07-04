package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;
import com.google.android.gms.internal.ads.axu.C15550e;
import com.google.android.gms.internal.ads.zzbqc.C16252a;

public final class zzbqh extends axu<zzbqh, C16253a> implements azc {
    private static volatile azm<zzbqh> zzdu;
    /* access modifiers changed from: private */
    public static final zzbqh zzfgn = new zzbqh();
    private int zzdi;
    private String zzdj = "";
    private int zzfgk;
    private String zzfgl = "";
    private zzbqc zzfgm;

    /* renamed from: com.google.android.gms.internal.ads.zzbqh$a */
    public static final class C16253a extends C15546a<zzbqh, C16253a> implements azc {
        private C16253a() {
            super(zzbqh.zzfgn);
        }

        /* renamed from: a */
        public final C16253a mo42278a(zzb zzb) {
            mo40291c();
            ((zzbqh) this.f41195a).m52969a(zzb);
            return this;
        }

        /* renamed from: a */
        public final C16253a mo42279a(String str) {
            mo40291c();
            ((zzbqh) this.f41195a).m52973a(str);
            return this;
        }

        /* renamed from: a */
        public final C16253a mo42277a(C16252a aVar) {
            mo40291c();
            ((zzbqh) this.f41195a).m52968a(aVar);
            return this;
        }

        /* synthetic */ C16253a(ape ape) {
            this();
        }
    }

    public enum zzb implements axx {
        EVENT_TYPE_UNKNOWN(0),
        BLOCKED_IMPRESSION(1);
        
        private static final axy<zzb> zzef = null;
        private final int value;

        public final int zzac() {
            return this.value;
        }

        public static zzb zzdp(int i) {
            switch (i) {
                case 0:
                    return EVENT_TYPE_UNKNOWN;
                case 1:
                    return BLOCKED_IMPRESSION;
                default:
                    return null;
            }
        }

        public static axz zzad() {
            return apg.f40895a;
        }

        private zzb(int i) {
            this.value = i;
        }

        static {
            zzef = new apf();
        }
    }

    private zzbqh() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m52969a(zzb zzb2) {
        if (zzb2 != null) {
            this.zzdi |= 1;
            this.zzfgk = zzb2.zzac();
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m52973a(String str) {
        if (str != null) {
            this.zzdi |= 2;
            this.zzdj = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m52968a(C16252a aVar) {
        this.zzfgm = (zzbqc) ((axu) aVar.mo40293e());
        this.zzdi |= 8;
    }

    /* renamed from: a */
    public static C16253a m52967a() {
        return (C16253a) ((C15546a) zzfgn.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (ape.f40894a[i - 1]) {
            case 1:
                return new zzbqh();
            case 2:
                return new C16253a(null);
            case 3:
                Object[] objArr = {"zzdi", "zzfgk", zzb.zzad(), "zzdj", "zzfgl", "zzfgm"};
                return m47701a((aza) zzfgn, "\u0001\u0004\u0000\u0001\u0001\u0004\u0004\u0000\u0000\u0000\u0001\f\u0000\u0002\b\u0001\u0003\b\u0002\u0004\t\u0003", objArr);
            case 4:
                return zzfgn;
            case 5:
                azm<zzbqh> azm = zzdu;
                if (azm == null) {
                    synchronized (zzbqh.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfgn);
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
        axu.m47703a(zzbqh.class, zzfgn);
    }
}
