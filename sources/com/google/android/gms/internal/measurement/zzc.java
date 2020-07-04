package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.C16579hf.C16580a;
import com.google.android.gms.internal.measurement.C16579hf.C16581b;

public final class zzc {

    public static final class zza extends C16579hf<zza, C16704a> implements C16617il {
        /* access modifiers changed from: private */
        public static final zza zznv = new zza();
        private static volatile C16626iu<zza> zznw;
        private int zznr;
        private int zzns = 1;
        private int zznt;
        private int zznu;

        /* renamed from: com.google.android.gms.internal.measurement.zzc$zza$a */
        public static final class C16704a extends C16580a<zza, C16704a> implements C16617il {
            private C16704a() {
                super(zza.zznv);
            }

            /* synthetic */ C16704a(C16428bu buVar) {
                this();
            }
        }

        public enum zzb implements C16587hi {
            NO_CACHE(1),
            PRIVATE(2),
            PUBLIC(3);
            
            private static final C16588hj<zzb> zzoa = null;
            private final int value;

            public final int zzc() {
                return this.value;
            }

            public static zzb zza(int i) {
                switch (i) {
                    case 1:
                        return NO_CACHE;
                    case 2:
                        return PRIVATE;
                    case 3:
                        return PUBLIC;
                    default:
                        return null;
                }
            }

            public static C16589hk zzd() {
                return C16478dn.f46107a;
            }

            private zzb(int i) {
                this.value = i;
            }

            static {
                zzoa = new C16451cq();
            }
        }

        private zza() {
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final Object mo42928a(int i, Object obj, Object obj2) {
            switch (C16428bu.f45992a[i - 1]) {
                case 1:
                    return new zza();
                case 2:
                    return new C16704a(null);
                case 3:
                    Object[] objArr = {"zznr", "zzns", zzb.zzd(), "zznt", "zznu"};
                    return m54149a((C16615ij) zznv, "\u0001\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0000\u0002\u0004\u0001\u0003\u0004\u0002", objArr);
                case 4:
                    return zznv;
                case 5:
                    C16626iu<zza> iuVar = zznw;
                    if (iuVar == null) {
                        synchronized (zza.class) {
                            iuVar = zznw;
                            if (iuVar == null) {
                                iuVar = new C16581b<>(zznv);
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
            C16579hf.m54151a(zza.class, zznv);
        }
    }
}
