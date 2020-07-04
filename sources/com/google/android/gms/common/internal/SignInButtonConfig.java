package com.google.android.gms.common.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public class SignInButtonConfig extends AbstractSafeParcelable {
    public static final Creator<SignInButtonConfig> CREATOR = new C15211ac();

    /* renamed from: a */
    public final int f39343a;

    /* renamed from: b */
    public final int f39344b;

    /* renamed from: c */
    public final Scope[] f39345c;

    /* renamed from: d */
    private final int f39346d;

    SignInButtonConfig(int i, int i2, int i3, Scope[] scopeArr) {
        this.f39346d = i;
        this.f39343a = i2;
        this.f39344b = i3;
        this.f39345c = scopeArr;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f39346d);
        C15269a.m44447a(parcel, 2, this.f39343a);
        C15269a.m44447a(parcel, 3, this.f39344b);
        C15269a.m44461a(parcel, 4, (T[]) this.f39345c, i, false);
        C15269a.m44443a(parcel, a);
    }
}
