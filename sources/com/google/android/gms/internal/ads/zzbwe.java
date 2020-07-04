package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;
import com.google.android.gms.internal.ads.axu.C15550e;

public final class zzbwe extends axu<zzbwe, C16254a> implements azc {
    private static volatile azm<zzbwe> zzdu;
    /* access modifiers changed from: private */
    public static final zzbwe zzflz = new zzbwe();
    public String zzflw = "";
    public zzcce zzflx = zzcce.zzfuo;
    private int zzfly;

    /* renamed from: com.google.android.gms.internal.ads.zzbwe$a */
    public static final class C16254a extends C15546a<zzbwe, C16254a> implements azc {
        private C16254a() {
            super(zzbwe.zzflz);
        }

        /* renamed from: a */
        public final C16254a mo42287a(String str) {
            mo40291c();
            ((zzbwe) this.f41195a).m52986a(str);
            return this;
        }

        /* renamed from: a */
        public final C16254a mo42286a(zzcce zzcce) {
            mo40291c();
            ((zzbwe) this.f41195a).m52985a(zzcce);
            return this;
        }

        /* renamed from: a */
        public final C16254a mo42285a(zzb zzb) {
            mo40291c();
            ((zzbwe) this.f41195a).m52981a(zzb);
            return this;
        }

        /* synthetic */ C16254a(atj atj) {
            this();
        }
    }

    public enum zzb implements axx {
        UNKNOWN_KEYMATERIAL(0),
        SYMMETRIC(1),
        ASYMMETRIC_PRIVATE(2),
        ASYMMETRIC_PUBLIC(3),
        REMOTE(4),
        UNRECOGNIZED(-1);
        
        private static final axy<zzb> zzef = null;
        private final int value;

        public final int zzac() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }

        public static zzb zzej(int i) {
            switch (i) {
                case 0:
                    return UNKNOWN_KEYMATERIAL;
                case 1:
                    return SYMMETRIC;
                case 2:
                    return ASYMMETRIC_PRIVATE;
                case 3:
                    return ASYMMETRIC_PUBLIC;
                case 4:
                    return REMOTE;
                default:
                    return null;
            }
        }

        private zzb(int i) {
            this.value = i;
        }

        static {
            zzef = new atk();
        }
    }

    private zzbwe() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m52986a(String str) {
        if (str != null) {
            this.zzflw = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m52985a(zzcce zzcce) {
        if (zzcce != null) {
            this.zzflx = zzcce;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public final zzb mo42284a() {
        zzb zzej = zzb.zzej(this.zzfly);
        return zzej == null ? zzb.UNRECOGNIZED : zzej;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m52981a(zzb zzb2) {
        if (zzb2 != null) {
            this.zzfly = zzb2.zzac();
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: b */
    public static C16254a m52987b() {
        return (C16254a) ((C15546a) zzflz.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (atj.f41023a[i - 1]) {
            case 1:
                return new zzbwe();
            case 2:
                return new C16254a(null);
            case 3:
                Object[] objArr = {"zzflw", "zzflx", "zzfly"};
                return m47701a((aza) zzflz, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001Ȉ\u0002\n\u0003\f", objArr);
            case 4:
                return zzflz;
            case 5:
                azm<zzbwe> azm = zzdu;
                if (azm == null) {
                    synchronized (zzbwe.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzflz);
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

    /* renamed from: c */
    public static zzbwe m52988c() {
        return zzflz;
    }

    static {
        axu.m47703a(zzbwe.class, zzflz);
    }
}
