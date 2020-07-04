package com.google.android.gms.common.server.response;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public final class zak extends AbstractSafeParcelable {
    public static final Creator<zak> CREATOR = new C15304k();

    /* renamed from: a */
    public final String f39538a;

    /* renamed from: b */
    private final int f39539b;

    /* renamed from: c */
    private final HashMap<String, Map<String, Field<?, ?>>> f39540c;

    zak(int i, ArrayList<zal> arrayList, String str) {
        this.f39539b = i;
        HashMap<String, Map<String, Field<?, ?>>> hashMap = new HashMap<>();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            zal zal = (zal) arrayList.get(i2);
            String str2 = zal.f39541a;
            HashMap hashMap2 = new HashMap();
            int size2 = zal.f39542b.size();
            for (int i3 = 0; i3 < size2; i3++) {
                zam zam = (zam) zal.f39542b.get(i3);
                hashMap2.put(zam.f39544a, zam.f39545b);
            }
            hashMap.put(str2, hashMap2);
        }
        this.f39540c = hashMap;
        this.f39538a = (String) C15267r.m44384a(str);
        m44530a();
    }

    /* renamed from: a */
    private void m44530a() {
        for (String str : this.f39540c.keySet()) {
            Map map = (Map) this.f39540c.get(str);
            for (String str2 : map.keySet()) {
                ((Field) map.get(str2)).f39513h = this;
            }
        }
    }

    /* renamed from: a */
    public final Map<String, Field<?, ?>> mo38665a(String str) {
        return (Map) this.f39540c.get(str);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (String str : this.f39540c.keySet()) {
            sb.append(str);
            sb.append(":\n");
            Map map = (Map) this.f39540c.get(str);
            for (String str2 : map.keySet()) {
                sb.append("  ");
                sb.append(str2);
                sb.append(": ");
                sb.append(map.get(str2));
            }
        }
        return sb.toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f39539b);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f39540c.keySet()) {
            arrayList.add(new zal(str, (Map) this.f39540c.get(str)));
        }
        C15269a.m44468c(parcel, 2, arrayList, false);
        C15269a.m44457a(parcel, 3, this.f39538a, false);
        C15269a.m44443a(parcel, a);
    }
}
