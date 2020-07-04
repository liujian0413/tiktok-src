package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.C1642a;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public final class StreetViewSource extends AbstractSafeParcelable {
    public static final Creator<StreetViewSource> CREATOR = new C16789u();

    /* renamed from: a */
    public static final StreetViewSource f46863a = new StreetViewSource(0);

    /* renamed from: b */
    public static final StreetViewSource f46864b = new StreetViewSource(1);

    /* renamed from: c */
    private static final String f46865c = "StreetViewSource";

    /* renamed from: d */
    private final int f46866d;

    public StreetViewSource(int i) {
        this.f46866d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StreetViewSource)) {
            return false;
        }
        return this.f46866d == ((StreetViewSource) obj).f46866d;
    }

    public final int hashCode() {
        return C15265q.m44379a(Integer.valueOf(this.f46866d));
    }

    public final String toString() {
        String str;
        switch (this.f46866d) {
            case 0:
                str = "DEFAULT";
                break;
            case 1:
                str = "OUTDOOR";
                break;
            default:
                str = C1642a.m8034a("UNKNOWN(%s)", new Object[]{Integer.valueOf(this.f46866d)});
                break;
        }
        return C1642a.m8034a("StreetViewSource:%s", new Object[]{str});
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 2, this.f46866d);
        C15269a.m44443a(parcel, a);
    }
}
