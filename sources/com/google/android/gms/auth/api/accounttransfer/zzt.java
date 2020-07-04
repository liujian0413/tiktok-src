package com.google.android.gms.auth.api.accounttransfer;

import android.app.PendingIntent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.support.p022v4.util.C0888a;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.common.server.response.FastJsonResponse.Field;
import com.google.android.gms.internal.auth.zzaz;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class zzt extends zzaz {
    public static final Creator<zzt> CREATOR = new C14950d();

    /* renamed from: a */
    private static final HashMap<String, Field<?, ?>> f38687a;

    /* renamed from: b */
    private final Set<Integer> f38688b;

    /* renamed from: c */
    private final int f38689c;

    /* renamed from: d */
    private String f38690d;

    /* renamed from: e */
    private int f38691e;

    /* renamed from: f */
    private byte[] f38692f;

    /* renamed from: g */
    private PendingIntent f38693g;

    /* renamed from: h */
    private DeviceMetaData f38694h;

    zzt(Set<Integer> set, int i, String str, int i2, byte[] bArr, PendingIntent pendingIntent, DeviceMetaData deviceMetaData) {
        this.f38688b = set;
        this.f38689c = i;
        this.f38690d = str;
        this.f38691e = i2;
        this.f38692f = bArr;
        this.f38693g = pendingIntent;
        this.f38694h = deviceMetaData;
    }

    public zzt() {
        this.f38688b = new C0888a(3);
        this.f38689c = 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        Set<Integer> set = this.f38688b;
        if (set.contains(Integer.valueOf(1))) {
            C15269a.m44447a(parcel, 1, this.f38689c);
        }
        if (set.contains(Integer.valueOf(2))) {
            C15269a.m44457a(parcel, 2, this.f38690d, true);
        }
        if (set.contains(Integer.valueOf(3))) {
            C15269a.m44447a(parcel, 3, this.f38691e);
        }
        if (set.contains(Integer.valueOf(4))) {
            C15269a.m44460a(parcel, 4, this.f38692f, true);
        }
        if (set.contains(Integer.valueOf(5))) {
            C15269a.m44452a(parcel, 5, (Parcelable) this.f38693g, i, true);
        }
        if (set.contains(Integer.valueOf(6))) {
            C15269a.m44452a(parcel, 6, (Parcelable) this.f38694h, i, true);
        }
        C15269a.m44443a(parcel, a);
    }

    /* renamed from: a */
    public final boolean mo38039a(Field field) {
        return this.f38688b.contains(Integer.valueOf(field.f39511f));
    }

    /* renamed from: b */
    public final Object mo38040b(Field field) {
        switch (field.f39511f) {
            case 1:
                return Integer.valueOf(this.f38689c);
            case 2:
                return this.f38690d;
            case 3:
                return Integer.valueOf(this.f38691e);
            case 4:
                return this.f38692f;
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
        return f38687a;
    }

    static {
        HashMap<String, Field<?, ?>> hashMap = new HashMap<>();
        f38687a = hashMap;
        hashMap.put("accountType", Field.m44511b("accountType", 2));
        f38687a.put("status", Field.m44508a("status", 3));
        f38687a.put("transferBytes", Field.m44516d("transferBytes", 4));
    }
}
