package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public class AuthAccountRequest extends AbstractSafeParcelable {
    public static final Creator<AuthAccountRequest> CREATOR = new C15272u();

    /* renamed from: a */
    public Integer f39311a;

    /* renamed from: b */
    public Integer f39312b;

    /* renamed from: c */
    private final int f39313c;

    /* renamed from: d */
    private final IBinder f39314d;

    /* renamed from: e */
    private final Scope[] f39315e;

    /* renamed from: f */
    private Account f39316f;

    AuthAccountRequest(int i, IBinder iBinder, Scope[] scopeArr, Integer num, Integer num2, Account account) {
        this.f39313c = i;
        this.f39314d = iBinder;
        this.f39315e = scopeArr;
        this.f39311a = num;
        this.f39312b = num2;
        this.f39316f = account;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f39313c);
        C15269a.m44450a(parcel, 2, this.f39314d, false);
        C15269a.m44461a(parcel, 3, (T[]) this.f39315e, i, false);
        C15269a.m44455a(parcel, 4, this.f39311a, false);
        C15269a.m44455a(parcel, 5, this.f39312b, false);
        C15269a.m44452a(parcel, 6, (Parcelable) this.f39316f, i, false);
        C15269a.m44443a(parcel, a);
    }
}
