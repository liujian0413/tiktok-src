package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public final class zzl extends zzaz {
    public static final Creator<zzl> CREATOR = new C14947a();

    /* renamed from: a */
    private static final HashMap<String, Field<?, ?>> f38667a;

    /* renamed from: b */
    private final Set<Integer> f38668b;

    /* renamed from: c */
    private final int f38669c;

    /* renamed from: d */
    private ArrayList<zzr> f38670d;

    /* renamed from: e */
    private int f38671e;

    /* renamed from: f */
    private zzo f38672f;

    zzl(Set<Integer> set, int i, ArrayList<zzr> arrayList, int i2, zzo zzo) {
        this.f38668b = set;
        this.f38669c = i;
        this.f38670d = arrayList;
        this.f38671e = i2;
        this.f38672f = zzo;
    }

    public zzl() {
        this.f38668b = new HashSet(1);
        this.f38669c = 1;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        Set<Integer> set = this.f38668b;
        if (set.contains(Integer.valueOf(1))) {
            C15269a.m44447a(parcel, 1, this.f38669c);
        }
        if (set.contains(Integer.valueOf(2))) {
            C15269a.m44468c(parcel, 2, this.f38670d, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            C15269a.m44447a(parcel, 3, this.f38671e);
        }
        if (set.contains(Integer.valueOf(4))) {
            C15269a.m44452a(parcel, 4, (Parcelable) this.f38672f, i, true);
        }
        C15269a.m44443a(parcel, a);
    }

    /* renamed from: a */
    public final boolean mo38039a(Field field) {
        return this.f38668b.contains(Integer.valueOf(field.f39511f));
    }

    /* renamed from: b */
    public final Object mo38040b(Field field) {
        int i = field.f39511f;
        if (i == 4) {
            return this.f38672f;
        }
        switch (i) {
            case 1:
                return Integer.valueOf(this.f38669c);
            case 2:
                return this.f38670d;
            default:
                int i2 = field.f39511f;
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i2);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Map mo38038a() {
        return f38667a;
    }

    static {
        HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
        f38667a = hashMap;
        hashMap.put("authenticatorData", Field.m44512b("authenticatorData", 2, zzr.class));
        f38667a.put("progress", Field.m44509a("progress", 4, zzo.class));
    }
}
