package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.axu.C15546a;
import com.google.android.gms.internal.ads.axu.C15547b;
import com.google.android.gms.internal.ads.axu.C15550e;

public final class afq {

    /* renamed from: com.google.android.gms.internal.ads.afq$a */
    public static final class C15475a extends axu<C15475a, C15476a> implements azc {
        /* access modifiers changed from: private */
        public static final C15475a zzdt = new C15475a();
        private static volatile azm<C15475a> zzdu;
        private int zzdi;
        private String zzdj = "";
        private long zzdk;
        private String zzdl = "";
        private String zzdm = "";
        private String zzdn = "";
        private long zzdo;
        private long zzdp;
        private String zzdq = "";
        private long zzdr;
        private String zzds = "";

        /* renamed from: com.google.android.gms.internal.ads.afq$a$a */
        public static final class C15476a extends C15546a<C15475a, C15476a> implements azc {
            private C15476a() {
                super(C15475a.zzdt);
            }

            /* renamed from: a */
            public final C15476a mo39287a(String str) {
                mo40291c();
                ((C15475a) this.f41195a).m45796a(str);
                return this;
            }

            /* renamed from: a */
            public final C15476a mo39286a(long j) {
                mo40291c();
                ((C15475a) this.f41195a).m45793a(j);
                return this;
            }

            /* renamed from: b */
            public final C15476a mo39288b(String str) {
                mo40291c();
                ((C15475a) this.f41195a).m45799b(str);
                return this;
            }

            /* renamed from: c */
            public final C15476a mo39289c(String str) {
                mo40291c();
                ((C15475a) this.f41195a).m45801c(str);
                return this;
            }

            /* synthetic */ C15476a(agr agr) {
                this();
            }
        }

        private C15475a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m45796a(String str) {
            if (str != null) {
                this.zzdi |= 1;
                this.zzdj = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m45793a(long j) {
            this.zzdi |= 2;
            this.zzdk = j;
        }

        /* access modifiers changed from: private */
        /* renamed from: b */
        public final void m45799b(String str) {
            if (str != null) {
                this.zzdi |= 4;
                this.zzdl = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: c */
        public final void m45801c(String str) {
            if (str != null) {
                this.zzdi |= 8;
                this.zzdm = str;
                return;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public static C15476a m45792a() {
            return (C15476a) ((C15546a) zzdt.mo39285a(C15550e.f41203e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo39285a(int i, Object obj, Object obj2) {
            switch (agr.f40194a[i - 1]) {
                case 1:
                    return new C15475a();
                case 2:
                    return new C15476a(null);
                case 3:
                    Object[] objArr = {"zzdi", "zzdj", "zzdk", "zzdl", "zzdm", "zzdn", "zzdo", "zzdp", "zzdq", "zzdr", "zzds"};
                    return m47701a((aza) zzdt, "\u0001\n\u0000\u0001\u0001\n\n\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001\u0003\b\u0002\u0004\b\u0003\u0005\b\u0004\u0006\u0002\u0005\u0007\u0002\u0006\b\b\u0007\t\u0002\b\n\b\t", objArr);
                case 4:
                    return zzdt;
                case 5:
                    azm<C15475a> azm = zzdu;
                    if (azm == null) {
                        synchronized (C15475a.class) {
                            azm = zzdu;
                            if (azm == null) {
                                azm = new C15547b<>(zzdt);
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
            axu.m47703a(C15475a.class, zzdt);
        }
    }
}
