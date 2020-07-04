package com.tencent.wcdb;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.tencent.wcdb.d */
final class C46401d implements C46436j {

    /* renamed from: a */
    private IBinder f119465a;

    /* renamed from: b */
    private Bundle f119466b;

    public final IBinder asBinder() {
        return this.f119465a;
    }

    /* renamed from: b */
    public final void mo115421b() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.content.IBulkCursor");
            this.f119465a.transact(7, obtain, obtain2, 0);
            C46434h.m145973a(obtain2);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    /* renamed from: c */
    public final Bundle mo115423c() throws RemoteException {
        if (this.f119466b == null) {
            Parcel obtain = Parcel.obtain();
            Parcel obtain2 = Parcel.obtain();
            try {
                obtain.writeInterfaceToken("android.content.IBulkCursor");
                this.f119465a.transact(5, obtain, obtain2, 0);
                C46434h.m145973a(obtain2);
                this.f119466b = obtain2.readBundle(getClass().getClassLoader());
            } finally {
                obtain.recycle();
                obtain2.recycle();
            }
        }
        return this.f119466b;
    }

    /* renamed from: a */
    public final void mo115419a() throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.content.IBulkCursor");
            this.f119465a.transact(2, obtain, obtain2, 0);
            C46434h.m145973a(obtain2);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    public C46401d(IBinder iBinder) {
        this.f119465a = iBinder;
    }

    /* renamed from: a */
    public final int mo115416a(C46437k kVar) throws RemoteException {
        int i;
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.content.IBulkCursor");
            obtain.writeStrongInterface(kVar);
            boolean transact = this.f119465a.transact(3, obtain, obtain2, 0);
            C46434h.m145973a(obtain2);
            if (!transact) {
                i = -1;
            } else {
                i = obtain2.readInt();
                this.f119466b = obtain2.readBundle(getClass().getClassLoader());
            }
            return i;
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    /* renamed from: a */
    public final Bundle mo115417a(Bundle bundle) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.content.IBulkCursor");
            obtain.writeBundle(bundle);
            this.f119465a.transact(6, obtain, obtain2, 0);
            C46434h.m145973a(obtain2);
            return obtain2.readBundle(getClass().getClassLoader());
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    /* renamed from: b */
    public final void mo115422b(int i) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.content.IBulkCursor");
            obtain.writeInt(i);
            this.f119465a.transact(4, obtain, obtain2, 0);
            C46434h.m145973a(obtain2);
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }

    /* renamed from: a */
    public final CursorWindow mo115418a(int i) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("android.content.IBulkCursor");
            obtain.writeInt(i);
            this.f119465a.transact(1, obtain, obtain2, 0);
            C46434h.m145973a(obtain2);
            CursorWindow cursorWindow = null;
            if (obtain2.readInt() == 1) {
                cursorWindow = CursorWindow.m145728a(obtain2);
            }
            return cursorWindow;
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
