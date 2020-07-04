package com.google.android.gms.common.internal;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: com.google.android.gms.common.internal.p */
public interface C15262p extends IInterface {

    /* renamed from: com.google.android.gms.common.internal.p$a */
    public static abstract class C15263a extends Binder implements C15262p {

        /* renamed from: com.google.android.gms.common.internal.p$a$a */
        static class C15264a implements C15262p {

            /* renamed from: a */
            private final IBinder f39462a;

            C15264a(IBinder iBinder) {
                this.f39462a = iBinder;
            }

            public final IBinder asBinder() {
                return this.f39462a;
            }

            /* renamed from: a */
            public final void mo38608a(C15260o oVar, GetServiceRequest getServiceRequest) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
                    obtain.writeStrongBinder(oVar != null ? oVar.asBinder() : null);
                    if (getServiceRequest != null) {
                        obtain.writeInt(1);
                        getServiceRequest.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f39462a.transact(46, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            C15260o oVar;
            if (i > 16777215) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.google.android.gms.common.internal.IGmsServiceBroker");
            IBinder readStrongBinder = parcel.readStrongBinder();
            GetServiceRequest getServiceRequest = null;
            if (readStrongBinder == null) {
                oVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.common.internal.IGmsCallbacks");
                if (queryLocalInterface instanceof C15260o) {
                    oVar = (C15260o) queryLocalInterface;
                } else {
                    oVar = new C15222an(readStrongBinder);
                }
            }
            if (i == 46) {
                if (parcel.readInt() != 0) {
                    getServiceRequest = (GetServiceRequest) GetServiceRequest.CREATOR.createFromParcel(parcel);
                }
                mo38608a(oVar, getServiceRequest);
                parcel2.writeNoException();
                return true;
            } else if (i == 47) {
                if (parcel.readInt() != 0) {
                    zzr.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            } else {
                parcel.readInt();
                if (i != 4) {
                    parcel.readString();
                }
                if (!(i == 23 || i == 25 || i == 27)) {
                    if (i != 30) {
                        if (i != 34) {
                            if (!(i == 41 || i == 43)) {
                                switch (i) {
                                    case 1:
                                        parcel.readString();
                                        parcel.createStringArray();
                                        parcel.readString();
                                        if (parcel.readInt() != 0) {
                                            Bundle.CREATOR.createFromParcel(parcel);
                                            break;
                                        }
                                        break;
                                    case 2:
                                        break;
                                    default:
                                        switch (i) {
                                            case 5:
                                            case 6:
                                            case 7:
                                            case 8:
                                            case 11:
                                            case 12:
                                            case 13:
                                            case 14:
                                            case 15:
                                            case 16:
                                            case 17:
                                            case 18:
                                                break;
                                            case 9:
                                                parcel.readString();
                                                parcel.createStringArray();
                                                parcel.readString();
                                                parcel.readStrongBinder();
                                                parcel.readString();
                                                if (parcel.readInt() != 0) {
                                                    Bundle.CREATOR.createFromParcel(parcel);
                                                    break;
                                                }
                                                break;
                                            case 10:
                                                parcel.readString();
                                                parcel.createStringArray();
                                                break;
                                            case 19:
                                                parcel.readStrongBinder();
                                                if (parcel.readInt() != 0) {
                                                    Bundle.CREATOR.createFromParcel(parcel);
                                                    break;
                                                }
                                                break;
                                            case 20:
                                                break;
                                            default:
                                                switch (i) {
                                                    case 37:
                                                    case 38:
                                                        break;
                                                }
                                        }
                                }
                            }
                        } else {
                            parcel.readString();
                        }
                        throw new UnsupportedOperationException();
                    }
                    parcel.createStringArray();
                    parcel.readString();
                    if (parcel.readInt() != 0) {
                        Bundle.CREATOR.createFromParcel(parcel);
                    }
                    throw new UnsupportedOperationException();
                }
                if (parcel.readInt() != 0) {
                    Bundle.CREATOR.createFromParcel(parcel);
                }
                throw new UnsupportedOperationException();
            }
        }
    }

    /* renamed from: a */
    void mo38608a(C15260o oVar, GetServiceRequest getServiceRequest) throws RemoteException;
}
