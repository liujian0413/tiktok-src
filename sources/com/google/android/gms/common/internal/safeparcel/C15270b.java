package com.google.android.gms.common.internal.safeparcel;

import android.content.Intent;
import android.os.Parcel;

/* renamed from: com.google.android.gms.common.internal.safeparcel.b */
public final class C15270b {
    /* renamed from: a */
    private static <T extends SafeParcelable> byte[] m44471a(T t) {
        Parcel obtain = Parcel.obtain();
        t.writeToParcel(obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* renamed from: a */
    public static <T extends SafeParcelable> void m44470a(T t, Intent intent, String str) {
        intent.putExtra(str, m44471a(t));
    }
}
