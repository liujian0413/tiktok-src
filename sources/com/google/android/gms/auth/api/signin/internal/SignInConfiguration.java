package com.google.android.gms.auth.api.signin.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class SignInConfiguration extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<SignInConfiguration> CREATOR = new C15003u();

    /* renamed from: a */
    public GoogleSignInOptions f38819a;

    /* renamed from: b */
    private final String f38820b;

    public SignInConfiguration(String str, GoogleSignInOptions googleSignInOptions) {
        this.f38820b = C15267r.m44386a(str);
        this.f38819a = googleSignInOptions;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 2, this.f38820b, false);
        C15269a.m44452a(parcel, 5, (Parcelable) this.f38819a, i, false);
        C15269a.m44443a(parcel, a);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof SignInConfiguration)) {
            return false;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) obj;
        if (!this.f38820b.equals(signInConfiguration.f38820b) || (this.f38819a != null ? !this.f38819a.equals(signInConfiguration.f38819a) : signInConfiguration.f38819a != null)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return new C14983a().mo38116a((Object) this.f38820b).mo38116a((Object) this.f38819a).f38829a;
    }
}
