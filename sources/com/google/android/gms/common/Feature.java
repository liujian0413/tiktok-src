package com.google.android.gms.common;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.p280ss.android.ugc.aweme.sharer.p1545b.C38347c;

public class Feature extends AbstractSafeParcelable {
    public static final Creator<Feature> CREATOR = new C15185i();

    /* renamed from: a */
    public final String f38850a;

    /* renamed from: b */
    private final int f38851b;

    /* renamed from: c */
    private final long f38852c;

    public Feature(String str, int i, long j) {
        this.f38850a = str;
        this.f38851b = i;
        this.f38852c = j;
    }

    /* renamed from: a */
    public final long mo38159a() {
        return this.f38852c == -1 ? (long) this.f38851b : this.f38852c;
    }

    public void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44457a(parcel, 1, this.f38850a, false);
        C15269a.m44447a(parcel, 2, this.f38851b);
        C15269a.m44448a(parcel, 3, mo38159a());
        C15269a.m44443a(parcel, a);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) obj;
        if (((this.f38850a == null || !this.f38850a.equals(feature.f38850a)) && (this.f38850a != null || feature.f38850a != null)) || mo38159a() != feature.mo38159a()) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return C15265q.m44379a(this.f38850a, Long.valueOf(mo38159a()));
    }

    public String toString() {
        return C15265q.m44380a((Object) this).mo38611a("name", this.f38850a).mo38611a(C38347c.f99551f, Long.valueOf(mo38159a())).toString();
    }
}
