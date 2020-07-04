package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;
import com.google.android.gms.internal.ads.axu.C15550e;

public final class aue extends axu<aue, C15539a> implements azc {
    private static volatile azm<aue> zzdu;
    /* access modifiers changed from: private */
    public static final aue zzfnw = new aue();
    private int zzdi;
    private String zzfnu = "";
    public ayc<ato> zzfnv = m47706l();

    /* renamed from: com.google.android.gms.internal.ads.aue$a */
    public static final class C15539a extends C15546a<aue, C15539a> implements azc {
        private C15539a() {
            super(aue.zzfnw);
        }

        /* renamed from: a */
        public final C15539a mo40047a(String str) {
            mo40291c();
            ((aue) this.f41195a).m47294a(str);
            return this;
        }

        /* renamed from: a */
        public final C15539a mo40046a(ato ato) {
            mo40291c();
            ((aue) this.f41195a).m47291a(ato);
            return this;
        }

        /* synthetic */ C15539a(auf auf) {
            this();
        }
    }

    private aue() {
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m47294a(String str) {
        if (str != null) {
            this.zzfnu = str;
            return;
        }
        throw new NullPointerException();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public final void m47291a(ato ato) {
        if (ato != null) {
            if (!this.zzfnv.mo40090a()) {
                ayc<ato> ayc = this.zzfnv;
                int size = ayc.size();
                this.zzfnv = ayc.mo40105a(size == 0 ? 10 : size << 1);
            }
            this.zzfnv.add(ato);
            return;
        }
        throw new NullPointerException();
    }

    /* renamed from: a */
    public static C15539a m47290a() {
        return (C15539a) ((C15546a) zzfnw.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final Object mo39285a(int i, Object obj, Object obj2) {
        switch (auf.f41034a[i - 1]) {
            case 1:
                return new aue();
            case 2:
                return new C15539a(null);
            case 3:
                Object[] objArr = {"zzdi", "zzfnu", "zzfnv", ato.class};
                return m47701a((aza) zzfnw, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001Ȉ\u0002\u001b", objArr);
            case 4:
                return zzfnw;
            case 5:
                azm<aue> azm = zzdu;
                if (azm == null) {
                    synchronized (aue.class) {
                        azm = zzdu;
                        if (azm == null) {
                            azm = new C15547b<>(zzfnw);
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
        axu.m47703a(aue.class, zzfnw);
    }
}
