package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: com.google.android.gms.common.internal.u */
public final class C15272u implements Creator<AuthAccountRequest> {
    public final /* synthetic */ Object[] newArray(int i) {
        return new AuthAccountRequest[i];
    }

    public final /* synthetic */ Object createFromParcel(Parcel parcel) {
        int b = SafeParcelReader.m44414b(parcel);
        IBinder iBinder = null;
        Scope[] scopeArr = null;
        Integer num = null;
        Integer num2 = null;
        Account account = null;
        int i = 0;
        while (parcel.dataPosition() < b) {
            int a = SafeParcelReader.m44408a(parcel);
            switch (SafeParcelReader.m44407a(a)) {
                case 1:
                    i = SafeParcelReader.m44419d(parcel, a);
                    break;
                case 2:
                    iBinder = SafeParcelReader.m44430o(parcel, a);
                    break;
                case 3:
                    scopeArr = (Scope[]) SafeParcelReader.m44416b(parcel, a, Scope.CREATOR);
                    break;
                case 4:
                    num = SafeParcelReader.m44420e(parcel, a);
                    break;
                case 5:
                    num2 = SafeParcelReader.m44420e(parcel, a);
                    break;
                case 6:
                    account = (Account) SafeParcelReader.m44409a(parcel, a, Account.CREATOR);
                    break;
                default:
                    SafeParcelReader.m44410a(parcel, a);
                    break;
            }
        }
        SafeParcelReader.m44405D(parcel, b);
        AuthAccountRequest authAccountRequest = new AuthAccountRequest(i, iBinder, scopeArr, num, num2, account);
        return authAccountRequest;
    }
}
