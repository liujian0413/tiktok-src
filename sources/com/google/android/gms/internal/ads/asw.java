package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;

public final class asw extends axu<asw, C15520a> implements azc {
    private static volatile azm<asw> zzdu;
    /* access modifiers changed from: private */
    public static final asw zzfkz = new asw();
    private int zzfiv;
    private int zzfkx;
    public zzcce zzfky = zzcce.zzfuo;

    /* renamed from: com.google.android.gms.internal.ads.asw$a */
    public static final class C15520a extends C15546a<asw, C15520a> implements azc {
        private C15520a() {
            super(asw.zzfkz);
        }

        /* synthetic */ C15520a(asx asx) {
            this();
        }
    }

    private asw() {
    }

    /* renamed from: a */
    public final zzbvs mo39997a() {
        zzbvs zzeg = zzbvs.zzeg(this.zzfkx);
        return zzeg == null ? zzbvs.UNRECOGNIZED : zzeg;
    }

    /* renamed from: b */
    public final zzbvw mo39998b() {
        zzbvw zzeh = zzbvw.zzeh(this.zzfiv);
        return zzeh == null ? zzbvw.UNRECOGNIZED : zzeh;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (asx.f41001a[i - 1]) {
            case 1:
                return new asw();
            case 2:
                return new C15520a(null);
            case 3:
                Object[] objArr = {"zzfkx", "zzfiv", "zzfky"};
                return m47701a((aza) zzfkz, "\u0000\u0003\u0000\u0000\u0001\u000b\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u000b\n", objArr);
            case 4:
                return zzfkz;
            case 5:
                azm<asw> azm = zzdu;
                if (azm == null) {
                    synchronized (asw.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfkz);
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
    public static asw m47155c() {
        return zzfkz;
    }

    static {
        axu.m47703a(asw.class, zzfkz);
    }
}
