package com.p280ss.android.ugc.bogut.library.view;

import android.os.Parcel;

/* renamed from: com.ss.android.ugc.bogut.library.view.a */
class C43673a {

    /* renamed from: a */
    private static final ClassLoader f113026a = C43673a.class.getClassLoader();

    C43673a() {
    }

    /* renamed from: a */
    static byte[] m138358a(Object obj) {
        Parcel obtain = Parcel.obtain();
        obtain.writeValue(obj);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    /* renamed from: a */
    static <T> T m138357a(byte[] bArr) {
        Parcel obtain = Parcel.obtain();
        obtain.unmarshall(bArr, 0, bArr.length);
        obtain.setDataPosition(0);
        T readValue = obtain.readValue(f113026a);
        obtain.recycle();
        return readValue;
    }
}
