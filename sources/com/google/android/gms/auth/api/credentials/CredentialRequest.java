package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig.C14954a;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class CredentialRequest extends AbstractSafeParcelable {
    public static final Creator<CredentialRequest> CREATOR = new C14960e();

    /* renamed from: a */
    public final boolean f38715a;

    /* renamed from: b */
    public final String[] f38716b;

    /* renamed from: c */
    public final CredentialPickerConfig f38717c;

    /* renamed from: d */
    public final CredentialPickerConfig f38718d;

    /* renamed from: e */
    public final boolean f38719e;

    /* renamed from: f */
    public final String f38720f;

    /* renamed from: g */
    public final String f38721g;

    /* renamed from: h */
    private final int f38722h;

    /* renamed from: i */
    private final boolean f38723i;

    CredentialRequest(int i, boolean z, String[] strArr, CredentialPickerConfig credentialPickerConfig, CredentialPickerConfig credentialPickerConfig2, boolean z2, String str, String str2, boolean z3) {
        this.f38722h = i;
        this.f38715a = z;
        this.f38716b = (String[]) C15267r.m44384a(strArr);
        if (credentialPickerConfig == null) {
            credentialPickerConfig = new C14954a().mo38050a();
        }
        this.f38717c = credentialPickerConfig;
        if (credentialPickerConfig2 == null) {
            credentialPickerConfig2 = new C14954a().mo38050a();
        }
        this.f38718d = credentialPickerConfig2;
        if (i < 3) {
            this.f38719e = true;
            this.f38720f = null;
            this.f38721g = null;
        } else {
            this.f38719e = z2;
            this.f38720f = str;
            this.f38721g = str2;
        }
        this.f38723i = z3;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44459a(parcel, 1, this.f38715a);
        C15269a.m44462a(parcel, 2, this.f38716b, false);
        C15269a.m44452a(parcel, 3, (Parcelable) this.f38717c, i, false);
        C15269a.m44452a(parcel, 4, (Parcelable) this.f38718d, i, false);
        C15269a.m44459a(parcel, 5, this.f38719e);
        C15269a.m44457a(parcel, 6, this.f38720f, false);
        C15269a.m44457a(parcel, 7, this.f38721g, false);
        C15269a.m44447a(parcel, 1000, this.f38722h);
        C15269a.m44459a(parcel, 8, this.f38723i);
        C15269a.m44443a(parcel, a);
    }
}
