package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.C15267r;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;

public class PatternItem extends AbstractSafeParcelable {
    public static final Creator<PatternItem> CREATOR = new C16781m();

    /* renamed from: a */
    private static final String f46822a = "PatternItem";

    /* renamed from: b */
    private final int f46823b;

    /* renamed from: c */
    private final Float f46824c;

    public PatternItem(int i, Float f) {
        boolean z = true;
        if (i != 1 && (f == null || f.floatValue() < 0.0f)) {
            z = false;
        }
        String valueOf = String.valueOf(f);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 45);
        sb.append("Invalid PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        C15267r.m44395b(z, sb.toString());
        this.f46823b = i;
        this.f46824c = f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PatternItem)) {
            return false;
        }
        PatternItem patternItem = (PatternItem) obj;
        return this.f46823b == patternItem.f46823b && C15265q.m44381a(this.f46824c, patternItem.f46824c);
    }

    public int hashCode() {
        return C15265q.m44379a(Integer.valueOf(this.f46823b), this.f46824c);
    }

    public String toString() {
        int i = this.f46823b;
        String valueOf = String.valueOf(this.f46824c);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 39);
        sb.append("[PatternItem: type=");
        sb.append(i);
        sb.append(" length=");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 2, this.f46823b);
        C15269a.m44454a(parcel, 3, this.f46824c, false);
        C15269a.m44443a(parcel, a);
    }
}
