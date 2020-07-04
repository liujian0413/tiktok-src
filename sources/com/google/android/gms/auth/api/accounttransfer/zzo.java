package com.google.android.gms.auth.api.accounttransfer;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.support.p022v4.util.ArrayMap;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.List;
import java.util.Map;

public class zzo extends zzaz {
    public static final Creator<zzo> CREATOR = new C14948b();

    /* renamed from: a */
    private static final ArrayMap<String, Field<?, ?>> f38673a;

    /* renamed from: b */
    private final int f38674b;

    /* renamed from: c */
    private List<String> f38675c;

    /* renamed from: d */
    private List<String> f38676d;

    /* renamed from: e */
    private List<String> f38677e;

    /* renamed from: f */
    private List<String> f38678f;

    /* renamed from: g */
    private List<String> f38679g;

    public zzo() {
        this.f38674b = 1;
    }

    /* renamed from: a */
    public final boolean mo38039a(Field field) {
        return true;
    }

    zzo(int i, List<String> list, List<String> list2, List<String> list3, List<String> list4, List<String> list5) {
        this.f38674b = i;
        this.f38675c = list;
        this.f38676d = list2;
        this.f38677e = list3;
        this.f38678f = list4;
        this.f38679g = list5;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f38674b);
        C15269a.m44466b(parcel, 2, this.f38675c, false);
        C15269a.m44466b(parcel, 3, this.f38676d, false);
        C15269a.m44466b(parcel, 4, this.f38677e, false);
        C15269a.m44466b(parcel, 5, this.f38678f, false);
        C15269a.m44466b(parcel, 6, this.f38679g, false);
        C15269a.m44443a(parcel, a);
    }

    /* renamed from: a */
    public final Map<String, Field<?, ?>> mo38038a() {
        return f38673a;
    }

    /* renamed from: b */
    public final Object mo38040b(Field field) {
        switch (field.f39511f) {
            case 1:
                return Integer.valueOf(this.f38674b);
            case 2:
                return this.f38675c;
            case 3:
                return this.f38676d;
            case 4:
                return this.f38677e;
            case 5:
                return this.f38678f;
            case 6:
                return this.f38679g;
            default:
                int i = field.f39511f;
                StringBuilder sb = new StringBuilder(37);
                sb.append("Unknown SafeParcelable id=");
                sb.append(i);
                throw new IllegalStateException(sb.toString());
        }
    }

    static {
        ArrayMap<String, Field<?, ?>> arrayMap = new ArrayMap<>();
        f38673a = arrayMap;
        arrayMap.put("registered", Field.m44513c("registered", 2));
        f38673a.put("in_progress", Field.m44513c("in_progress", 3));
        f38673a.put("success", Field.m44513c("success", 4));
        f38673a.put("failed", Field.m44513c("failed", 5));
        f38673a.put("escrowed", Field.m44513c("escrowed", 6));
    }
}
