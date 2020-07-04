package com.google.android.gms.common.api;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class Scope extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<Scope> CREATOR = new C15163m();

    /* renamed from: a */
    public final String f38865a;

    /* renamed from: b */
    private final int f38866b;

    Scope(int i, String str) {
        C15267r.m44387a(str, (Object) "scopeUri must not be null or empty");
        this.f38866b = i;
        this.f38865a = str;
    }

    public Scope(String str) {
        this(1, str);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Scope)) {
            return false;
        }
        return this.f38865a.equals(((Scope) obj).f38865a);
    }

    public final int hashCode() {
        return this.f38865a.hashCode();
    }

    public final String toString() {
        return this.f38865a;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f38866b);
        C15269a.m44457a(parcel, 2, this.f38865a, false);
        C15269a.m44443a(parcel, a);
    }
}
