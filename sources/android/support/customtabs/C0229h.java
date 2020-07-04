package android.support.customtabs;

import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: android.support.customtabs.h */
public interface C0229h extends IInterface {

    /* renamed from: android.support.customtabs.h$a */
    public static abstract class C0230a extends Binder implements C0229h {

        /* renamed from: android.support.customtabs.h$a$a */
        static class C0231a implements C0229h {

            /* renamed from: a */
            private IBinder f871a;

            public final IBinder asBinder() {
                return this.f871a;
            }

            /* renamed from: a */
            public final boolean mo623a(C0226g gVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeTypedList(list);
                    this.f871a.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo624a(C0226g gVar, Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeStrongBinder(gVar != null ? gVar.asBinder() : null);
                    boolean z = true;
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f871a.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            C0231a(IBinder iBinder) {
                this.f871a = iBinder;
            }

            /* renamed from: a */
            public final boolean mo619a(long j) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeLong(j);
                    boolean z = false;
                    this.f871a.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo620a(C0226g gVar) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    if (gVar != null) {
                        iBinder = gVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = false;
                    this.f871a.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final Bundle mo618a(String str, Bundle bundle) throws RemoteException {
                Bundle bundle2;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f871a.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bundle2 = (Bundle) Bundle.CREATOR.createFromParcel(obtain2);
                    } else {
                        bundle2 = null;
                    }
                    return bundle2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo622a(C0226g gVar, Uri uri) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    if (gVar != null) {
                        iBinder = gVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f871a.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final int mo617a(C0226g gVar, String str, Bundle bundle) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    if (gVar != null) {
                        iBinder = gVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeString(str);
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f871a.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: a */
            public final boolean mo621a(C0226g gVar, int i, Uri uri, Bundle bundle) throws RemoteException {
                IBinder iBinder;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("android.support.customtabs.ICustomTabsService");
                    if (gVar != null) {
                        iBinder = gVar.asBinder();
                    } else {
                        iBinder = null;
                    }
                    obtain.writeStrongBinder(iBinder);
                    obtain.writeInt(i);
                    boolean z = true;
                    if (uri != null) {
                        obtain.writeInt(1);
                        uri.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f871a.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public IBinder asBinder() {
            return this;
        }

        public C0230a() {
            attachInterface(this, "android.support.customtabs.ICustomTabsService");
        }

        /* renamed from: a */
        public static C0229h m819a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("android.support.customtabs.ICustomTabsService");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof C0229h)) {
                return new C0231a(iBinder);
            }
            return (C0229h) queryLocalInterface;
        }

        /* JADX WARNING: type inference failed for: r0v1 */
        /* JADX WARNING: type inference failed for: r0v2, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v5, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v6, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v8, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v9, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v11, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v12, types: [android.net.Uri] */
        /* JADX WARNING: type inference failed for: r0v14, types: [android.net.Uri] */
        /* JADX WARNING: type inference failed for: r0v15, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v18, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v19, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v22, types: [android.os.Bundle] */
        /* JADX WARNING: type inference failed for: r0v23 */
        /* JADX WARNING: type inference failed for: r0v24 */
        /* JADX WARNING: type inference failed for: r0v25 */
        /* JADX WARNING: type inference failed for: r0v26 */
        /* JADX WARNING: type inference failed for: r0v27 */
        /* JADX WARNING: type inference failed for: r0v28 */
        /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r0v1
          assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], android.os.Bundle, android.net.Uri]
          uses: [android.os.Bundle, android.net.Uri]
          mth insns count: 130
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
        /* JADX WARNING: Unknown variable types count: 7 */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public boolean onTransact(int r5, android.os.Parcel r6, android.os.Parcel r7, int r8) throws android.os.RemoteException {
            /*
                r4 = this;
                r0 = 1598968902(0x5f4e5446, float:1.4867585E19)
                r1 = 1
                if (r5 == r0) goto L_0x0158
                r0 = 0
                switch(r5) {
                    case 2: goto L_0x0144;
                    case 3: goto L_0x012c;
                    case 4: goto L_0x00f0;
                    case 5: goto L_0x00c3;
                    case 6: goto L_0x009c;
                    case 7: goto L_0x0075;
                    case 8: goto L_0x004a;
                    case 9: goto L_0x000f;
                    default: goto L_0x000a;
                }
            L_0x000a:
                boolean r5 = super.onTransact(r5, r6, r7, r8)
                return r5
            L_0x000f:
                java.lang.String r5 = "android.support.customtabs.ICustomTabsService"
                r6.enforceInterface(r5)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.g r5 = android.support.customtabs.C0226g.C0227a.m805a(r5)
                int r8 = r6.readInt()
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x002f
                android.os.Parcelable$Creator r2 = android.net.Uri.CREATOR
                java.lang.Object r2 = r2.createFromParcel(r6)
                android.net.Uri r2 = (android.net.Uri) r2
                goto L_0x0030
            L_0x002f:
                r2 = r0
            L_0x0030:
                int r3 = r6.readInt()
                if (r3 == 0) goto L_0x003f
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x003f:
                boolean r5 = r4.mo621a(r5, r8, r2, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x004a:
                java.lang.String r5 = "android.support.customtabs.ICustomTabsService"
                r6.enforceInterface(r5)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.g r5 = android.support.customtabs.C0226g.C0227a.m805a(r5)
                java.lang.String r8 = r6.readString()
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x006a
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r0.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x006a:
                int r5 = r4.mo617a(r5, r8, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0075:
                java.lang.String r5 = "android.support.customtabs.ICustomTabsService"
                r6.enforceInterface(r5)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.g r5 = android.support.customtabs.C0226g.C0227a.m805a(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x0091
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.net.Uri r0 = (android.net.Uri) r0
            L_0x0091:
                boolean r5 = r4.mo622a(r5, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x009c:
                java.lang.String r5 = "android.support.customtabs.ICustomTabsService"
                r6.enforceInterface(r5)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.g r5 = android.support.customtabs.C0226g.C0227a.m805a(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00b8
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x00b8:
                boolean r5 = r4.mo624a(r5, r0)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x00c3:
                java.lang.String r5 = "android.support.customtabs.ICustomTabsService"
                r6.enforceInterface(r5)
                java.lang.String r5 = r6.readString()
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x00db
                android.os.Parcelable$Creator r8 = android.os.Bundle.CREATOR
                java.lang.Object r6 = r8.createFromParcel(r6)
                r0 = r6
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x00db:
                android.os.Bundle r5 = r4.mo618a(r5, r0)
                r7.writeNoException()
                if (r5 == 0) goto L_0x00eb
                r7.writeInt(r1)
                r5.writeToParcel(r7, r1)
                goto L_0x00ef
            L_0x00eb:
                r5 = 0
                r7.writeInt(r5)
            L_0x00ef:
                return r1
            L_0x00f0:
                java.lang.String r5 = "android.support.customtabs.ICustomTabsService"
                r6.enforceInterface(r5)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.g r5 = android.support.customtabs.C0226g.C0227a.m805a(r5)
                int r8 = r6.readInt()
                if (r8 == 0) goto L_0x010c
                android.os.Parcelable$Creator r8 = android.net.Uri.CREATOR
                java.lang.Object r8 = r8.createFromParcel(r6)
                android.net.Uri r8 = (android.net.Uri) r8
                goto L_0x010d
            L_0x010c:
                r8 = r0
            L_0x010d:
                int r2 = r6.readInt()
                if (r2 == 0) goto L_0x011b
                android.os.Parcelable$Creator r0 = android.os.Bundle.CREATOR
                java.lang.Object r0 = r0.createFromParcel(r6)
                android.os.Bundle r0 = (android.os.Bundle) r0
            L_0x011b:
                android.os.Parcelable$Creator r2 = android.os.Bundle.CREATOR
                java.util.ArrayList r6 = r6.createTypedArrayList(r2)
                boolean r5 = r4.mo623a(r5, r8, r0, r6)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x012c:
                java.lang.String r5 = "android.support.customtabs.ICustomTabsService"
                r6.enforceInterface(r5)
                android.os.IBinder r5 = r6.readStrongBinder()
                android.support.customtabs.g r5 = android.support.customtabs.C0226g.C0227a.m805a(r5)
                boolean r5 = r4.mo620a(r5)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0144:
                java.lang.String r5 = "android.support.customtabs.ICustomTabsService"
                r6.enforceInterface(r5)
                long r5 = r6.readLong()
                boolean r5 = r4.mo619a(r5)
                r7.writeNoException()
                r7.writeInt(r5)
                return r1
            L_0x0158:
                java.lang.String r5 = "android.support.customtabs.ICustomTabsService"
                r7.writeString(r5)
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: android.support.customtabs.C0229h.C0230a.onTransact(int, android.os.Parcel, android.os.Parcel, int):boolean");
        }
    }

    /* renamed from: a */
    int mo617a(C0226g gVar, String str, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    Bundle mo618a(String str, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    boolean mo619a(long j) throws RemoteException;

    /* renamed from: a */
    boolean mo620a(C0226g gVar) throws RemoteException;

    /* renamed from: a */
    boolean mo621a(C0226g gVar, int i, Uri uri, Bundle bundle) throws RemoteException;

    /* renamed from: a */
    boolean mo622a(C0226g gVar, Uri uri) throws RemoteException;

    /* renamed from: a */
    boolean mo623a(C0226g gVar, Uri uri, Bundle bundle, List<Bundle> list) throws RemoteException;

    /* renamed from: a */
    boolean mo624a(C0226g gVar, Bundle bundle) throws RemoteException;
}
