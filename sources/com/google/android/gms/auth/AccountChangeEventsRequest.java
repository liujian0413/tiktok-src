package com.google.android.gms.auth;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public class AccountChangeEventsRequest extends AbstractSafeParcelable {
    public static final Creator<AccountChangeEventsRequest> CREATOR = new C15005b();

    /* renamed from: a */
    public int f38634a;

    /* renamed from: b */
    public String f38635b;

    /* renamed from: c */
    public Account f38636c;

    /* renamed from: d */
    private final int f38637d;

    AccountChangeEventsRequest(int i, int i2, String str, Account account) {
        this.f38637d = i;
        this.f38634a = i2;
        this.f38635b = str;
        if (account != null || TextUtils.isEmpty(str)) {
            this.f38636c = account;
        } else {
            this.f38636c = new Account(str, "com.google");
        }
    }

    public AccountChangeEventsRequest() {
        this.f38637d = 1;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f38637d);
        C15269a.m44447a(parcel, 2, this.f38634a);
        C15269a.m44457a(parcel, 3, this.f38635b, false);
        C15269a.m44452a(parcel, 4, (Parcelable) this.f38636c, i, false);
        C15269a.m44443a(parcel, a);
    }
}
