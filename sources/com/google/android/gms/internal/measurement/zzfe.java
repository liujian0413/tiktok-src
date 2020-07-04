package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16579hf.C16580a;
import com.google.android.gms.internal.measurement.C16579hf.C16581b;
import com.google.android.gms.internal.measurement.C16579hf.C16584e;

public final class zzfe {

    /* renamed from: com.google.android.gms.internal.measurement.zzfe$a */
    public static final class C16705a extends C16579hf<C16705a, C16706a> implements C16617il {
        /* access modifiers changed from: private */
        public static final C16705a zzauw = new C16705a();
        private static volatile C16626iu<C16705a> zznw;
        private String zzauu = "";
        private long zzauv;
        private int zznr;

        /* renamed from: com.google.android.gms.internal.measurement.zzfe$a$a */
        public static final class C16706a extends C16580a<C16705a, C16706a> implements C16617il {
            private C16706a() {
                super(C16705a.zzauw);
            }

            /* renamed from: a */
            public final C16706a mo43241a(String str) {
                mo42940b();
                ((C16705a) this.f46403a).m54898a(str);
                return this;
            }

            /* renamed from: a */
            public final C16706a mo43240a(long j) {
                mo42940b();
                ((C16705a) this.f46403a).m54895a(j);
                return this;
            }

            /* synthetic */ C16706a(C16483ds dsVar) {
                this();
            }
        }

        private C16705a() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m54898a(String str) {
            if (str != null) {
                this.zznr |= 1;
                this.zzauu = str;
                return;
            }
            throw new NullPointerException();
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m54895a(long j) {
            this.zznr |= 2;
            this.zzauv = j;
        }

        /* renamed from: a */
        public static C16706a m54894a() {
            return (C16706a) ((C16580a) zzauw.mo42928a(C16584e.f46411e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo42928a(int i, Object obj, Object obj2) {
            switch (C16483ds.f46117a[i - 1]) {
                case 1:
                    return new C16705a();
                case 2:
                    return new C16706a(null);
                case 3:
                    Object[] objArr = {"zznr", "zzauu", "zzauv"};
                    return m54149a((C16615ij) zzauw, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001\b\u0000\u0002\u0002\u0001", objArr);
                case 4:
                    return zzauw;
                case 5:
                    C16626iu<C16705a> iuVar = zznw;
                    if (iuVar == null) {
                        synchronized (C16705a.class) {
                            iuVar = zznw;
                            if (iuVar == null) {
                                iuVar = new C16581b<>(zzauw);
                                zznw = iuVar;
                            }
                        }
                    }
                    return iuVar;
                case 6:
                    return Byte.valueOf(1);
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        static {
            C16579hf.m54151a(C16705a.class, zzauw);
        }
    }

    public static final class zzb extends C16579hf<zzb, C16707a> implements C16617il {
        /* access modifiers changed from: private */
        public static final zzb zzauz = new zzb();
        private static volatile C16626iu<zzb> zznw;
        private int zzaux = 1;
        private C16590hl<C16705a> zzauy = m54153i();
        private int zznr;

        /* renamed from: com.google.android.gms.internal.measurement.zzfe$zzb$a */
        public static final class C16707a extends C16580a<zzb, C16707a> implements C16617il {
            private C16707a() {
                super(zzb.zzauz);
            }

            /* renamed from: a */
            public final C16707a mo43242a(C16705a aVar) {
                mo42940b();
                ((zzb) this.f46403a).m54904a(aVar);
                return this;
            }

            /* synthetic */ C16707a(C16483ds dsVar) {
                this();
            }
        }

        /* renamed from: com.google.android.gms.internal.measurement.zzfe$zzb$zzb reason: collision with other inner class name */
        public enum C48894zzb implements C16587hi {
            RADS(1),
            PROVISIONING(2);
            
            private static final C16588hj<C48894zzb> zzoa = null;
            private final int value;

            public final int zzc() {
                return this.value;
            }

            public static C48894zzb zzt(int i) {
                switch (i) {
                    case 1:
                        return RADS;
                    case 2:
                        return PROVISIONING;
                    default:
                        return null;
                }
            }

            public static C16589hk zzd() {
                return C16485du.f46118a;
            }

            private C48894zzb(int i) {
                this.value = i;
            }

            static {
                zzoa = new C16484dt();
            }
        }

        private zzb() {
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public final void m54904a(C16705a aVar) {
            if (aVar != null) {
                if (!this.zzauy.mo42732a()) {
                    C16590hl<C16705a> hlVar = this.zzauy;
                    int size = hlVar.size();
                    this.zzauy = hlVar.mo42747a(size == 0 ? 10 : size << 1);
                }
                this.zzauy.add(aVar);
                return;
            }
            throw new NullPointerException();
        }

        /* renamed from: a */
        public static C16707a m54903a() {
            return (C16707a) ((C16580a) zzauz.mo42928a(C16584e.f46411e, (Object) null, (Object) null));
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo42928a(int i, Object obj, Object obj2) {
            switch (C16483ds.f46117a[i - 1]) {
                case 1:
                    return new zzb();
                case 2:
                    return new C16707a(null);
                case 3:
                    Object[] objArr = {"zznr", "zzaux", C48894zzb.zzd(), "zzauy", C16705a.class};
                    return m54149a((C16615ij) zzauz, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0001\u0000\u0001\f\u0000\u0002\u001b", objArr);
                case 4:
                    return zzauz;
                case 5:
                    C16626iu<zzb> iuVar = zznw;
                    if (iuVar == null) {
                        synchronized (zzb.class) {
                            iuVar = zznw;
                            if (iuVar == null) {
                                iuVar = new C16581b<>(zzauz);
                                zznw = iuVar;
                            }
                        }
                    }
                    return iuVar;
                case 6:
                    return Byte.valueOf(1);
                case 7:
                    return null;
                default:
                    throw new UnsupportedOperationException();
            }
        }

        /* renamed from: b */
        public static C16626iu<zzb> m54906b() {
            return (C16626iu) zzauz.mo42928a(C16584e.f46413g, (Object) null, (Object) null);
        }

        static {
            C16579hf.m54151a(zzb.class, zzauz);
        }
    }
}
