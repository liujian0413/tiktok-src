package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.p761c.C16356a;
import com.google.android.gms.internal.p761c.C16357b;
import com.google.android.gms.internal.p761c.C16358c;

/* renamed from: com.google.android.gms.common.internal.m */
public interface C15256m extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.m$a */
    public static abstract class C15257a extends C16357b implements C15256m {

        /* renamed from: com.google.android.gms.common.internal.m$a$a */
        public static class C15258a extends C16356a implements C15256m {
            C15258a(IBinder iBinder) {
                super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
            }

            /* renamed from: a */
            public final Account mo38513a() throws RemoteException {
                Parcel a = mo42446a(2, mo42449c());
                Account account = (Account) C16358c.m53320a(a, Account.CREATOR);
                a.recycle();
                return account;
            }
        }

        /* renamed from: a */
        public static C15256m m44370a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            if (queryLocalInterface instanceof C15256m) {
                return (C15256m) queryLocalInterface;
            }
            return new C15258a(iBinder);
        }

        /* renamed from: a */
        public final boolean mo38544a(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 2) {
                return false;
            }
            Account a = mo38513a();
            parcel2.writeNoException();
            C16358c.m53325b(parcel2, a);
            return true;
        }
    }

    /* renamed from: a */
    Account mo38513a() throws RemoteException;
}
