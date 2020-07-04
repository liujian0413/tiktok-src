package com.google.android.gms.common;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.os.RemoteException;
import com.google.android.gms.common.internal.C15220al;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;

public final class zzk extends AbstractSafeParcelable {
    public static final Creator<zzk> CREATOR = new C15286r();

    /* renamed from: a */
    private final String f39621a;

    /* renamed from: b */
    private final C15280l f39622b;

    /* renamed from: c */
    private final boolean f39623c;

    zzk(String str, IBinder iBinder, boolean z) {
        this.f39621a = str;
        this.f39622b = m44631a(iBinder);
        this.f39623c = z;
    }

    zzk(String str, C15280l lVar, boolean z) {
        this.f39621a = str;
        this.f39622b = lVar;
        this.f39623c = z;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        IBinder iBinder;
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 1, this.f39621a, false);
        if (this.f39622b == null) {
            iBinder = null;
        } else {
            iBinder = this.f39622b.asBinder();
        }
        C15269a.m44450a(parcel, 2, iBinder, false);
        C15269a.m44459a(parcel, 3, this.f39623c);
        C15269a.m44443a(parcel, a);
    }

    /* renamed from: a */
    private static C15280l m44631a(IBinder iBinder) {
        byte[] bArr;
        C15281m mVar = null;
        if (iBinder == null) {
            return null;
        }
        try {
            C15345b a = C15220al.m44237a(iBinder).mo38542a();
            if (a == null) {
                bArr = null;
            } else {
                bArr = (byte[]) C15349d.m44669a(a);
            }
            if (bArr != null) {
                mVar = new C15281m(bArr);
            }
            return mVar;
        } catch (RemoteException unused) {
            return null;
        }
    }
}
