package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;
import com.google.android.gms.internal.ads.axu.C15550e;

public final class ato extends axu<ato, C15527a> implements azc {
    private static volatile azm<ato> zzdu;
    /* access modifiers changed from: private */
    public static final ato zzfmt = new ato();
    public String zzflw = "";
    public String zzfmp = "";
    public int zzfmq;
    public boolean zzfmr;
    public String zzfms = "";

    /* renamed from: com.google.android.gms.internal.ads.ato$a */
    public static final class C15527a extends C15546a<ato, C15527a> implements azc {
        private C15527a() {
            super(ato.zzfmt);
        }

        /* renamed from: a */
        public final C15527a mo40024a(String str) {
            mo40291c();
            ((ato) this.f41195a).m47214a(str);
            return this;
        }

        /* renamed from: b */
        public final C15527a mo40026b(String str) {
            mo40291c();
            ((ato) this.f41195a).m47217b(str);
            return this;
        }

        /* renamed from: a */
        public final C15527a mo40023a(int i) {
            mo40291c();
            ((ato) this.f41195a).zzfmq = 0;
            return this;
        }

        /* renamed from: a */
        public final C15527a mo40025a(boolean z) {
            mo40291c();
            ((ato) this.f41195a).zzfmr = true;
            return this;
        }

        /* renamed from: c */
        public final C15527a mo40027c(String str) {
            mo40291c();
            ((ato) this.f41195a).m47219c(str);
            return this;
        }

        /* synthetic */ C15527a(atp atp) {
            this();
        }
    }

    private ato() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m47214a(String str) {
        if (str != null) {
            this.zzfmp = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public final void m47217b(String str) {
        if (str != null) {
            this.zzflw = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final void m47219c(String str) {
        if (str != null) {
            this.zzfms = str;
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static C15527a m47210a() {
        return (C15527a) ((C15546a) zzfmt.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (atp.f41025a[i - 1]) {
            case 1:
                return new ato();
            case 2:
                return new C15527a(null);
            case 3:
                Object[] objArr = {"zzfmp", "zzflw", "zzfmq", "zzfmr", "zzfms"};
                return m47701a((aza) zzfmt, "\u0000\u0005\u0000\u0000\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002Ȉ\u0003\u000b\u0004\u0007\u0005Ȉ", objArr);
            case 4:
                return zzfmt;
            case 5:
                azm<ato> azm = zzdu;
                if (azm == null) {
                    synchronized (ato.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfmt);
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
        axu.m47703a(ato.class, zzfmt);
    }
}
