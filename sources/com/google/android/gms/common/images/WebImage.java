package com.google.android.gms.common.images;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.C1642a;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import java.util.Locale;

public final class WebImage extends AbstractSafeParcelable {
    public static final Creator<WebImage> CREATOR = new C15193d();

    /* renamed from: a */
    public final Uri f39303a;

    /* renamed from: b */
    public final int f39304b;

    /* renamed from: c */
    public final int f39305c;

    /* renamed from: d */
    private final int f39306d;

    WebImage(int i, Uri uri, int i2, int i3) {
        this.f39306d = i;
        this.f39303a = uri;
        this.f39304b = i2;
        this.f39305c = i3;
    }

    public final String toString() {
        return C1642a.m8035a(Locale.US, "Image %dx%d %s", new Object[]{Integer.valueOf(this.f39304b), Integer.valueOf(this.f39305c), this.f39303a.toString()});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof WebImage)) {
            return false;
        }
        WebImage webImage = (WebImage) obj;
        return C15265q.m44381a(this.f39303a, webImage.f39303a) && this.f39304b == webImage.f39304b && this.f39305c == webImage.f39305c;
    }

    public final int hashCode() {
        return C15265q.m44379a(this.f39303a, Integer.valueOf(this.f39304b), Integer.valueOf(this.f39305c));
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44447a(parcel, 1, this.f39306d);
        C15269a.m44452a(parcel, 2, (Parcelable) this.f39303a, i, false);
        C15269a.m44447a(parcel, 3, this.f39304b);
        C15269a.m44447a(parcel, 4, this.f39305c);
        C15269a.m44443a(parcel, a);
    }
}
