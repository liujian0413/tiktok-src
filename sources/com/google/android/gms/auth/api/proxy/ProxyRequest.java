package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public class ProxyRequest extends AbstractSafeParcelable {
    public static final Creator<ProxyRequest> CREATOR = new C14968b();

    /* renamed from: a */
    public static final int f38741a = 0;

    /* renamed from: b */
    public static final int f38742b = 1;

    /* renamed from: c */
    public static final int f38743c = 2;

    /* renamed from: d */
    public static final int f38744d = 3;

    /* renamed from: e */
    public static final int f38745e = 4;

    /* renamed from: f */
    public static final int f38746f = 5;

    /* renamed from: g */
    public static final int f38747g = 6;

    /* renamed from: h */
    public static final int f38748h = 7;

    /* renamed from: i */
    public static final int f38749i = 7;

    /* renamed from: j */
    public final String f38750j;

    /* renamed from: k */
    public final int f38751k;

    /* renamed from: l */
    public final long f38752l;

    /* renamed from: m */
    public final byte[] f38753m;

    /* renamed from: n */
    private final int f38754n;

    /* renamed from: o */
    private Bundle f38755o;

    ProxyRequest(int i, String str, int i2, long j, byte[] bArr, Bundle bundle) {
        this.f38754n = i;
        this.f38750j = str;
        this.f38751k = i2;
        this.f38752l = j;
        this.f38753m = bArr;
        this.f38755o = bundle;
    }

    public String toString() {
        String str = this.f38750j;
        int i = this.f38751k;
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 42);
        sb.append("ProxyRequest[ url: ");
        sb.append(str);
        sb.append(", method: ");
        sb.append(i);
        sb.append(" ]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 1, this.f38750j, false);
        C15269a.m44447a(parcel, 2, this.f38751k);
        C15269a.m44448a(parcel, 3, this.f38752l);
        C15269a.m44460a(parcel, 4, this.f38753m, false);
        C15269a.m44449a(parcel, 5, this.f38755o, false);
        C15269a.m44447a(parcel, 1000, this.f38754n);
        C15269a.m44443a(parcel, a);
    }
}
