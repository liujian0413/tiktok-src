package com.google.android.gms.common.internal;

import android.accounts.Account;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.C15167c;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.C15256m.C15257a;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public class GetServiceRequest extends AbstractSafeParcelable {
    public static final Creator<GetServiceRequest> CREATOR = new C15214af();

    /* renamed from: a */
    String f39323a;

    /* renamed from: b */
    IBinder f39324b;

    /* renamed from: c */
    Scope[] f39325c;

    /* renamed from: d */
    public Bundle f39326d;

    /* renamed from: e */
    Account f39327e;

    /* renamed from: f */
    Feature[] f39328f;

    /* renamed from: g */
    Feature[] f39329g;

    /* renamed from: h */
    private final int f39330h;

    /* renamed from: i */
    private final int f39331i;

    /* renamed from: j */
    private int f39332j;

    /* renamed from: k */
    private boolean f39333k;

    public GetServiceRequest(int i) {
        this.f39330h = 4;
        this.f39332j = C15167c.GOOGLE_PLAY_SERVICES_VERSION_CODE;
        this.f39331i = i;
        this.f39333k = true;
    }

    GetServiceRequest(int i, int i2, int i3, String str, IBinder iBinder, Scope[] scopeArr, Bundle bundle, Account account, Feature[] featureArr, Feature[] featureArr2, boolean z) {
        this.f39330h = i;
        this.f39331i = i2;
        this.f39332j = i3;
        if ("com.google.android.gms".equals(str)) {
            this.f39323a = "com.google.android.gms";
        } else {
            this.f39323a = str;
        }
        if (i < 2) {
            Account account2 = null;
            if (iBinder != null) {
                account2 = C15194a.m44204a(C15257a.m44370a(iBinder));
            }
            this.f39327e = account2;
        } else {
            this.f39324b = iBinder;
            this.f39327e = account;
        }
        this.f39325c = scopeArr;
        this.f39326d = bundle;
        this.f39328f = featureArr;
        this.f39329g = featureArr2;
        this.f39333k = z;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f39330h);
        C15269a.m44447a(parcel, 2, this.f39331i);
        C15269a.m44447a(parcel, 3, this.f39332j);
        C15269a.m44457a(parcel, 4, this.f39323a, false);
        C15269a.m44450a(parcel, 5, this.f39324b, false);
        C15269a.m44461a(parcel, 6, (T[]) this.f39325c, i, false);
        C15269a.m44449a(parcel, 7, this.f39326d, false);
        C15269a.m44452a(parcel, 8, (Parcelable) this.f39327e, i, false);
        C15269a.m44461a(parcel, 10, (T[]) this.f39328f, i, false);
        C15269a.m44461a(parcel, 11, (T[]) this.f39329g, i, false);
        C15269a.m44459a(parcel, 12, this.f39333k);
        C15269a.m44443a(parcel, a);
    }
}
