package com.google.android.gms.auth;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import java.util.List;

public class AccountChangeEventsResponse extends AbstractSafeParcelable {
    public static final Creator<AccountChangeEventsResponse> CREATOR = new C15006c();

    /* renamed from: a */
    public final List<AccountChangeEvent> f38638a;

    /* renamed from: b */
    private final int f38639b;

    AccountChangeEventsResponse(int i, List<AccountChangeEvent> list) {
        this.f38639b = i;
        this.f38638a = (List) C15267r.m44384a(list);
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f38639b);
        C15269a.m44468c(parcel, 2, this.f38638a, false);
        C15269a.m44443a(parcel, a);
    }
}
