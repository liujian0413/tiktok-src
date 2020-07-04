package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import java.util.Map;
import java.util.Map.Entry;

@C6505uv
public final class zzaju extends AbstractSafeParcelable {
    public static final Creator<zzaju> CREATOR = new C15764il();

    /* renamed from: a */
    private final String f45514a;

    /* renamed from: b */
    private final String[] f45515b;

    /* renamed from: c */
    private final String[] f45516c;

    zzaju(String str, String[] strArr, String[] strArr2) {
        this.f45514a = str;
        this.f45515b = strArr;
        this.f45516c = strArr2;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 1, this.f45514a, false);
        C15269a.m44462a(parcel, 2, this.f45515b, false);
        C15269a.m44462a(parcel, 3, this.f45516c, false);
        C15269a.m44443a(parcel, a);
    }

    /* renamed from: a */
    public static zzaju m52662a(bqk bqk) throws zza {
        Map b = bqk.mo39255b();
        int size = b.size();
        String[] strArr = new String[size];
        String[] strArr2 = new String[size];
        int i = 0;
        for (Entry entry : b.entrySet()) {
            strArr[i] = (String) entry.getKey();
            strArr2[i] = (String) entry.getValue();
            i++;
        }
        return new zzaju(bqk.f43252b, strArr, strArr2);
    }
}
