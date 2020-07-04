package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import java.util.ArrayList;
import java.util.Map;

public final class zal extends AbstractSafeParcelable {
    public static final Creator<zal> CREATOR = new C15305l();

    /* renamed from: a */
    final String f39541a;

    /* renamed from: b */
    final ArrayList<zam> f39542b;

    /* renamed from: c */
    private final int f39543c;

    zal(int i, String str, ArrayList<zam> arrayList) {
        this.f39543c = i;
        this.f39541a = str;
        this.f39542b = arrayList;
    }

    zal(String str, Map<String, Field<?, ?>> map) {
        ArrayList<zam> arrayList;
        this.f39543c = 1;
        this.f39541a = str;
        if (map == null) {
            arrayList = null;
        } else {
            arrayList = new ArrayList<>();
            for (String str2 : map.keySet()) {
                arrayList.add(new zam(str2, (Field) map.get(str2)));
            }
        }
        this.f39542b = arrayList;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f39543c);
        C15269a.m44457a(parcel, 2, this.f39541a, false);
        C15269a.m44468c(parcel, 3, this.f39542b, false);
        C15269a.m44443a(parcel, a);
    }
}
