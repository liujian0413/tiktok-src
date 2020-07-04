package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public class ResolveAccountRequest extends AbstractSafeParcelable {
    public static final Creator<ResolveAccountRequest> CREATOR = new C15209aa();

    /* renamed from: a */
    public final Account f39334a;

    /* renamed from: b */
    public final int f39335b;

    /* renamed from: c */
    public final GoogleSignInAccount f39336c;

    /* renamed from: d */
    private final int f39337d;

    ResolveAccountRequest(int i, Account account, int i2, GoogleSignInAccount googleSignInAccount) {
        this.f39337d = i;
        this.f39334a = account;
        this.f39335b = i2;
        this.f39336c = googleSignInAccount;
    }

    public ResolveAccountRequest(Account account, int i, GoogleSignInAccount googleSignInAccount) {
        this(2, account, i, googleSignInAccount);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f39337d);
        C15269a.m44452a(parcel, 2, (Parcelable) this.f39334a, i, false);
        C15269a.m44447a(parcel, 3, this.f39335b);
        C15269a.m44452a(parcel, 4, (Parcelable) this.f39336c, i, false);
        C15269a.m44443a(parcel, a);
    }
}
