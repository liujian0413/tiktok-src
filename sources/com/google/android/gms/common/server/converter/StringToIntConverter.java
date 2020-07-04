package com.google.android.gms.common.server.converter;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.SparseArray;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.common.server.response.FastJsonResponse.C15292a;
import java.util.ArrayList;
import java.util.HashMap;

public final class StringToIntConverter extends AbstractSafeParcelable implements C15292a<String, Integer> {
    public static final Creator<StringToIntConverter> CREATOR = new C15290b();

    /* renamed from: a */
    private final int f39497a;

    /* renamed from: b */
    private final HashMap<String, Integer> f39498b;

    /* renamed from: c */
    private final SparseArray<String> f39499c;

    /* renamed from: d */
    private final ArrayList<zaa> f39500d;

    public static final class zaa extends AbstractSafeParcelable {
        public static final Creator<zaa> CREATOR = new C15291c();

        /* renamed from: a */
        final String f39501a;

        /* renamed from: b */
        final int f39502b;

        /* renamed from: c */
        private final int f39503c;

        zaa(int i, String str, int i2) {
            this.f39503c = i;
            this.f39501a = str;
            this.f39502b = i2;
        }

        zaa(String str, int i) {
            this.f39503c = 1;
            this.f39501a = str;
            this.f39502b = i;
        }

        public final void writeToParcel(Parcel parcel, int i) {
            int a = C15269a.m44442a(parcel);
            C15269a.m44447a(parcel, 1, this.f39503c);
            C15269a.m44457a(parcel, 2, this.f39501a, false);
            C15269a.m44447a(parcel, 3, this.f39502b);
            C15269a.m44443a(parcel, a);
        }
    }

    StringToIntConverter(int i, ArrayList<zaa> arrayList) {
        this.f39497a = i;
        this.f39498b = new HashMap<>();
        this.f39499c = new SparseArray<>();
        this.f39500d = null;
        ArrayList arrayList2 = arrayList;
        int size = arrayList2.size();
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList2.get(i2);
            i2++;
            zaa zaa2 = (zaa) obj;
            m44497a(zaa2.f39501a, zaa2.f39502b);
        }
    }

    public StringToIntConverter() {
        this.f39497a = 1;
        this.f39498b = new HashMap<>();
        this.f39499c = new SparseArray<>();
        this.f39500d = null;
    }

    /* renamed from: a */
    private StringToIntConverter m44497a(String str, int i) {
        this.f39498b.put(str, Integer.valueOf(i));
        this.f39499c.put(i, str);
        return this;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f39497a);
        ArrayList arrayList = new ArrayList();
        for (String str : this.f39498b.keySet()) {
            arrayList.add(new zaa(str, ((Integer) this.f39498b.get(str)).intValue()));
        }
        C15269a.m44468c(parcel, 2, arrayList, false);
        C15269a.m44443a(parcel, a);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo38632a(Object obj) {
        String str = (String) this.f39499c.get(((Integer) obj).intValue());
        return (str != null || !this.f39498b.containsKey("gms_unknown")) ? str : "gms_unknown";
    }
}
