package com.benchmark;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.benchmark.g */
public interface C1999g extends IInterface {

    /* renamed from: com.benchmark.g$a */
    public static abstract class C2000a extends Binder implements C1999g {

        /* renamed from: com.benchmark.g$a$a */
        static class C2001a implements C1999g {

            /* renamed from: a */
            private IBinder f7072a;

            public final IBinder asBinder() {
                return this.f7072a;
            }

            C2001a(IBinder iBinder) {
                this.f7072a = iBinder;
            }

            /* renamed from: a */
            public final void mo7614a(Benchmark benchmark) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IBMCallback");
                    if (benchmark != null) {
                        obtain.writeInt(1);
                        benchmark.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7072a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: b */
            public final void mo7617b(Benchmark benchmark, BenchmarkResult benchmarkResult) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IBMCallback");
                    if (benchmark != null) {
                        obtain.writeInt(1);
                        benchmark.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (benchmarkResult != null) {
                        obtain.writeInt(1);
                        benchmarkResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7072a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo7615a(Benchmark benchmark, BenchmarkResult benchmarkResult) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.benchmark.IBMCallback");
                    if (benchmark != null) {
                        obtain.writeInt(1);
                        benchmark.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (benchmarkResult != null) {
                        obtain.writeInt(1);
                        benchmarkResult.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f7072a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C2000a() {
            attachInterface(this, "com.benchmark.IBMCallback");
        }

        /* renamed from: a */
        public static C1999g m9052a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.benchmark.IBMCallback");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C1999g)) {
                return new C2001a(iBinder);
            }
            return (C1999g) queryLocalInterface;
        }

        /* JADX WARNING: type inference failed for: r1v1 */
        /* JADX WARNING: type inference failed for: r1v2, types: [com.benchmark.BenchmarkResult] */
        /* JADX WARNING: type inference failed for: r1v4, types: [com.benchmark.BenchmarkResult] */
        /* JADX WARNING: type inference failed for: r1v5, types: [com.benchmark.BenchmarkResult] */
        /* JADX WARNING: type inference failed for: r1v7, types: [com.benchmark.BenchmarkResult] */
        /* JADX WARNING: type inference failed for: r1v8, types: [com.benchmark.Benchmark] */
        /* JADX WARNING: type inference failed for: r1v10, types: [com.benchmark.Benchmark] */
        /* JADX WARNING: type inference failed for: r1v11 */
        /* JADX WARNING: type inference failed for: r1v12 */
        /* JADX WARNING: type inference failed for: r1v13 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v1
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.benchmark.BenchmarkResult, com.benchmark.Benchmark]
          uses: [com.benchmark.BenchmarkResult, com.benchmark.Benchmark]
          mth insns count: 53
        	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
        	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$0(DepthTraversal.java:13)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:13)
        	at jadx.core.ProcessClass.process(ProcessClass.java:30)
        	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
        	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
        	at jadx.core.ProcessClass.process(ProcessClass.java:35)
        	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
        	at jadx.api.JavaClass.decompile(JavaClass.java:62)
        	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
         */
        /* JADX WARNING: Unknown variable types count: 4 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
            /*
                r3 = this;
                java.lang.String r0 = "com.benchmark.IBMCallback"
                r1 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r2 = 1
                if (r4 == r1) goto L_0x007c
                r1 = 0
                switch(r4) {
                    case 1: goto L_0x0053;
                    case 2: goto L_0x002a;
                    case 3: goto L_0x0011;
                    default: goto L_0x000c;
                }
            L_0x000c:
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L_0x0011:
                r5.enforceInterface(r0)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0023
                android.os.Parcelable$Creator<com.benchmark.Benchmark> r4 = com.benchmark.Benchmark.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r1 = r4
                com.benchmark.Benchmark r1 = (com.benchmark.Benchmark) r1
            L_0x0023:
                r3.mo7614a(r1)
                r6.writeNoException()
                return r2
            L_0x002a:
                r5.enforceInterface(r0)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x003c
                android.os.Parcelable$Creator<com.benchmark.Benchmark> r4 = com.benchmark.Benchmark.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                com.benchmark.Benchmark r4 = (com.benchmark.Benchmark) r4
                goto L_0x003d
            L_0x003c:
                r4 = r1
            L_0x003d:
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x004c
                android.os.Parcelable$Creator<com.benchmark.BenchmarkResult> r7 = com.benchmark.BenchmarkResult.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                r1 = r5
                com.benchmark.BenchmarkResult r1 = (com.benchmark.BenchmarkResult) r1
            L_0x004c:
                r3.mo7617b(r4, r1)
                r6.writeNoException()
                return r2
            L_0x0053:
                r5.enforceInterface(r0)
                int r4 = r5.readInt()
                if (r4 == 0) goto L_0x0065
                android.os.Parcelable$Creator<com.benchmark.Benchmark> r4 = com.benchmark.Benchmark.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                com.benchmark.Benchmark r4 = (com.benchmark.Benchmark) r4
                goto L_0x0066
            L_0x0065:
                r4 = r1
            L_0x0066:
                int r7 = r5.readInt()
                if (r7 == 0) goto L_0x0075
                android.os.Parcelable$Creator<com.benchmark.BenchmarkResult> r7 = com.benchmark.BenchmarkResult.CREATOR
                java.lang.Object r5 = r7.createFromParcel(r5)
                r1 = r5
                com.benchmark.BenchmarkResult r1 = (com.benchmark.BenchmarkResult) r1
            L_0x0075:
                r3.mo7615a(r4, r1)
                r6.writeNoException()
                return r2
            L_0x007c:
                r6.writeString(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.benchmark.C1999g.C2000a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    void mo7614a(Benchmark benchmark) throws RemoteException;

    /* renamed from: a */
    void mo7615a(Benchmark benchmark, BenchmarkResult benchmarkResult) throws RemoteException;

    /* renamed from: b */
    void mo7617b(Benchmark benchmark, BenchmarkResult benchmarkResult) throws RemoteException;
}
