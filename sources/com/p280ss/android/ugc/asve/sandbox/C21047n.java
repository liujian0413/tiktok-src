package com.p280ss.android.ugc.asve.sandbox;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.p280ss.android.ugc.asve.sandbox.C21041l.C21042a;
import com.p280ss.android.ugc.asve.sandbox.p928b.C20965u;
import com.p280ss.android.ugc.asve.sandbox.wrap.ASSandBoxRecorderContextWrapper;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21063b;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21066c;
import com.p280ss.android.ugc.asve.sandbox.wrap.C21072e;
import com.p280ss.android.ugc.asve.sandbox.wrap.SandBoxASContextWrapper;

/* renamed from: com.ss.android.ugc.asve.sandbox.n */
public interface C21047n extends IInterface {

    /* renamed from: com.ss.android.ugc.asve.sandbox.n$a */
    public static abstract class C21048a extends Binder implements C21047n {

        /* renamed from: com.ss.android.ugc.asve.sandbox.n$a$a */
        static class C21049a implements C21047n {

            /* renamed from: a */
            private IBinder f56511a;

            public final IBinder asBinder() {
                return this.f56511a;
            }

            /* renamed from: a */
            public final void mo56340a() throws RemoteException {
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandboxRemoteCoreService");
                    this.f56511a.transact(3, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            C21049a(IBinder iBinder) {
                this.f56511a = iBinder;
            }

            /* renamed from: a */
            public final C21041l mo56339a(ASSandBoxRecorderContextWrapper aSSandBoxRecorderContextWrapper) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandboxRemoteCoreService");
                    if (aSSandBoxRecorderContextWrapper != null) {
                        obtain.writeInt(1);
                        aSSandBoxRecorderContextWrapper.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f56511a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return C21042a.m70983a(obtain2.readStrongBinder());
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56341a(C20965u uVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandboxRemoteCoreService");
                    if (uVar != null) {
                        iBinder = uVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    this.f56511a.transact(4, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final void mo56342a(SandBoxASContextWrapper sandBoxASContextWrapper, C21044m mVar, C21066c cVar, C21072e eVar, C21063b bVar, C21023f fVar) throws RemoteException {
                IBinder iBinder;
                IBinder iBinder2;
                IBinder iBinder3;
                IBinder iBinder4;
                IBinder iBinder5;
                Parcel obtain = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.ss.android.ugc.asve.sandbox.ISandboxRemoteCoreService");
                    if (sandBoxASContextWrapper != null) {
                        obtain.writeInt(1);
                        sandBoxASContextWrapper.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (mVar != null) {
                        iBinder = mVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    if (cVar != null) {
                        iBinder2 = cVar.asBinder();
                    } else {
                        iBinder2 = null;
                    }
                    obtain.writeStrongBinder(iBinder2);
                    if (eVar != null) {
                        iBinder3 = eVar.asBinder();
                    } else {
                        iBinder3 = null;
                    }
                    obtain.writeStrongBinder(iBinder3);
                    if (bVar != null) {
                        iBinder4 = bVar.asBinder();
                    } else {
                        iBinder4 = null;
                    }
                    obtain.writeStrongBinder(iBinder4);
                    if (fVar != null) {
                        iBinder5 = fVar.asBinder();
                    } else {
                        iBinder5 = null;
                    }
                    obtain.writeStrongBinder(iBinder5);
                    this.f56511a.transact(2, obtain, null, 1);
                } finally {
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C21048a() {
            attachInterface(this, "com.ss.android.ugc.asve.sandbox.ISandboxRemoteCoreService");
        }

        /* renamed from: a */
        public static C21047n m71014a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.ss.android.ugc.asve.sandbox.ISandboxRemoteCoreService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C21047n)) {
                return new C21049a(iBinder);
            }
            return (C21047n) queryLocalInterface;
        }

        /* JADX WARNING: type inference failed for: r1v1 */
        /* JADX WARNING: type inference failed for: r1v2, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r1v3, types: [android.os.IBinder] */
        /* JADX WARNING: type inference failed for: r1v4 */
        /* JADX WARNING: type inference failed for: r4v0, types: [com.ss.android.ugc.asve.sandbox.wrap.SandBoxASContextWrapper] */
        /* JADX WARNING: type inference failed for: r1v6, types: [com.ss.android.ugc.asve.sandbox.wrap.SandBoxASContextWrapper] */
        /* JADX WARNING: type inference failed for: r1v7 */
        /* JADX WARNING: type inference failed for: r1v8 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v1
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.asve.sandbox.wrap.SandBoxASContextWrapper, android.os.IBinder]
          uses: [android.os.IBinder, ?[OBJECT, ARRAY]]
          mth insns count: 52
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
        public boolean onTransact(int r11, android.os.Parcel r12, android.os.Parcel r13, int r14) throws android.os.RemoteException {
            /*
                r10 = this;
                java.lang.String r0 = "com.ss.android.ugc.asve.sandbox.ISandboxRemoteCoreService"
                r1 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r2 = 1
                if (r11 == r1) goto L_0x008b
                r1 = 0
                switch(r11) {
                    case 1: goto L_0x0067;
                    case 2: goto L_0x0027;
                    case 3: goto L_0x0020;
                    case 4: goto L_0x0011;
                    default: goto L_0x000c;
                }
            L_0x000c:
                boolean r11 = super.onTransact(r11, r12, r13, r14)
                return r11
            L_0x0011:
                r12.enforceInterface(r0)
                android.os.IBinder r11 = r12.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.b.u r11 = com.p280ss.android.ugc.asve.sandbox.p928b.C20965u.C20966a.m70024a(r11)
                r10.mo56341a(r11)
                return r2
            L_0x0020:
                r12.enforceInterface(r0)
                r10.mo56340a()
                return r2
            L_0x0027:
                r12.enforceInterface(r0)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0039
                android.os.Parcelable$Creator<com.ss.android.ugc.asve.sandbox.wrap.SandBoxASContextWrapper> r11 = com.p280ss.android.ugc.asve.sandbox.wrap.SandBoxASContextWrapper.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                r1 = r11
                com.ss.android.ugc.asve.sandbox.wrap.SandBoxASContextWrapper r1 = (com.p280ss.android.ugc.asve.sandbox.wrap.SandBoxASContextWrapper) r1
            L_0x0039:
                r4 = r1
                android.os.IBinder r11 = r12.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.m r5 = com.p280ss.android.ugc.asve.sandbox.C21044m.C21045a.m71006a(r11)
                android.os.IBinder r11 = r12.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.wrap.c r6 = com.p280ss.android.ugc.asve.sandbox.wrap.C21066c.C21067a.m71073a(r11)
                android.os.IBinder r11 = r12.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.wrap.e r7 = com.p280ss.android.ugc.asve.sandbox.wrap.C21072e.C21073a.m71092a(r11)
                android.os.IBinder r11 = r12.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.wrap.b r8 = com.p280ss.android.ugc.asve.sandbox.wrap.C21063b.C21064a.m71067a(r11)
                android.os.IBinder r11 = r12.readStrongBinder()
                com.ss.android.ugc.asve.sandbox.f r9 = com.p280ss.android.ugc.asve.sandbox.C21023f.C21024a.m70575a(r11)
                r3 = r10
                r3.mo56342a(r4, r5, r6, r7, r8, r9)
                return r2
            L_0x0067:
                r12.enforceInterface(r0)
                int r11 = r12.readInt()
                if (r11 == 0) goto L_0x0079
                android.os.Parcelable$Creator<com.ss.android.ugc.asve.sandbox.wrap.ASSandBoxRecorderContextWrapper> r11 = com.p280ss.android.ugc.asve.sandbox.wrap.ASSandBoxRecorderContextWrapper.CREATOR
                java.lang.Object r11 = r11.createFromParcel(r12)
                com.ss.android.ugc.asve.sandbox.wrap.ASSandBoxRecorderContextWrapper r11 = (com.p280ss.android.ugc.asve.sandbox.wrap.ASSandBoxRecorderContextWrapper) r11
                goto L_0x007a
            L_0x0079:
                r11 = r1
            L_0x007a:
                com.ss.android.ugc.asve.sandbox.l r11 = r10.mo56339a(r11)
                r13.writeNoException()
                if (r11 == 0) goto L_0x0087
                android.os.IBinder r1 = r11.asBinder()
            L_0x0087:
                r13.writeStrongBinder(r1)
                return r2
            L_0x008b:
                r13.writeString(r0)
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p280ss.android.ugc.asve.sandbox.C21047n.C21048a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    C21041l mo56339a(ASSandBoxRecorderContextWrapper aSSandBoxRecorderContextWrapper) throws RemoteException;

    /* renamed from: a */
    void mo56340a() throws RemoteException;

    /* renamed from: a */
    void mo56341a(C20965u uVar) throws RemoteException;

    /* renamed from: a */
    void mo56342a(SandBoxASContextWrapper sandBoxASContextWrapper, C21044m mVar, C21066c cVar, C21072e eVar, C21063b bVar, C21023f fVar) throws RemoteException;
}
