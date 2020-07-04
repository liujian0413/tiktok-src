package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class zzr extends zzaz {
    public static final Creator<zzr> CREATOR = new C14949c();

    /* renamed from: a */
    private static final HashMap<String, Field<?, ?>> f38680a;

    /* renamed from: b */
    private final Set<Integer> f38681b;

    /* renamed from: c */
    private final int f38682c;

    /* renamed from: d */
    private zzt f38683d;

    /* renamed from: e */
    private String f38684e;

    /* renamed from: f */
    private String f38685f;

    /* renamed from: g */
    private String f38686g;

    public zzr() {
        this.f38681b = new HashSet(3);
        this.f38682c = 1;
    }

    zzr(Set<Integer> set, int i, zzt zzt, String str, String str2, String str3) {
        this.f38681b = set;
        this.f38682c = i;
        this.f38683d = zzt;
        this.f38684e = str;
        this.f38685f = str2;
        this.f38686g = str3;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        Set<Integer> set = this.f38681b;
        if (set.contains(Integer.valueOf(1))) {
            C15269a.m44447a(parcel, 1, this.f38682c);
        }
        if (set.contains(Integer.valueOf(2))) {
            C15269a.m44452a(parcel, 2, (Parcelable) this.f38683d, i, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            C15269a.m44457a(parcel, 3, this.f38684e, true);
        }
        if (set.contains(Integer.valueOf(4))) {
            C15269a.m44457a(parcel, 4, this.f38685f, true);
        }
        if (set.contains(Integer.valueOf(5))) {
            C15269a.m44457a(parcel, 5, this.f38686g, true);
        }
        C15269a.m44443a(parcel, a);
    }

    /* renamed from: a */
    public final boolean mo38039a(Field field) {
        return this.f38681b.contains(Integer.valueOf(field.f39511f));
    }

    /* renamed from: b */
    public final Object mo38040b(Field field) {
        switch (field.f39511f) {
            case 1:
                return Integer.valueOf(this.f38682c);
            case 2:
                return this.f38683d;
            case 3:
                return this.f38684e;
            case 4:
                return this.f38685f;
            default:
                int i = field.f39511f;
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    /* renamed from: a */
    public final /* synthetic */ Map mo38038a() {
        return f38680a;
    }

    static {
        HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
        f38680a = hashMap;
        hashMap.put("authenticatorInfo", Field.m44509a("authenticatorInfo", 2, zzt.class));
        f38680a.put("signature", Field.m44511b("signature", 3));
        f38680a.put("package", Field.m44511b("package", 4));
    }
}
