package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;

public final class asq extends axu<asq, C15517a> implements azc {
    private static volatile azm<asq> zzdu;
    /* access modifiers changed from: private */
    public static final asq zzfkt = new asq();
    private asw zzfkq;
    private asm zzfkr;
    private int zzfks;

    /* renamed from: com.google.android.gms.internal.ads.asq$a */
    public static final class C15517a extends C15546a<asq, C15517a> implements azc {
        private C15517a() {
            super(asq.zzfkt);
        }

        /* synthetic */ C15517a(asr asr) {
            this();
        }
    }

    private asq() {
    }

    /* renamed from: a */
    public final asw mo39985a() {
        return this.zzfkq == null ? asw.m47155c() : this.zzfkq;
    }

    /* renamed from: b */
    public final asm mo39986b() {
        return this.zzfkr == null ? asm.m47111b() : this.zzfkr;
    }

    /* renamed from: c */
    public final zzbuq mo39987c() {
        zzbuq zzdy = zzbuq.zzdy(this.zzfks);
        return zzdy == null ? zzbuq.UNRECOGNIZED : zzdy;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (asr.f40998a[i - 1]) {
            case 1:
                return new asq();
            case 2:
                return new C15517a(null);
            case 3:
                Object[] objArr = {"zzfkq", "zzfkr", "zzfks"};
                return m47701a((aza) zzfkt, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\t\u0002\t\u0003\f", objArr);
            case 4:
                return zzfkt;
            case 5:
                azm<asq> azm = zzdu;
                if (azm == null) {
                    synchronized (asq.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfkt);
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

    /* renamed from: d */
    public static asq m47119d() {
        return zzfkt;
    }

    static {
        axu.m47703a(asq.class, zzfkt);
    }
}
