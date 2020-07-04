package com.google.android.gms.internal.p760b;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;

/* renamed from: com.google.android.gms.internal.b.c */
public class C16342c {

    /* renamed from: a */
    private static final ClassLoader f45835a = C16342c.class.getClassLoader();

    private C16342c() {
    }

    /* renamed from: a */
    public static <T extends Parcelable> T m53292a(Parcel parcel, Creator<T> creator) {
        if (parcel.readInt() == 0) {
            return null;
        }
        return (Parcelable) creator.createFromParcel(parcel);
    }

    /* renamed from: a */
    public static void m53293a(Parcel parcel, IInterface iInterface) {
        parcel.writeStrongBinder(iInterface == null ? null : iInterface.asBinder());
    }
}
