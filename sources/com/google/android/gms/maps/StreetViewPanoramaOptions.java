package com.google.android.gms.maps;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.StreetViewPanoramaCamera;
import com.google.android.gms.maps.model.StreetViewSource;
import com.google.android.gms.maps.p764a.C16730i;

public final class StreetViewPanoramaOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<StreetViewPanoramaOptions> CREATOR = new C16763k();

    /* renamed from: a */
    public StreetViewPanoramaCamera f46717a;

    /* renamed from: b */
    public String f46718b;

    /* renamed from: c */
    public LatLng f46719c;

    /* renamed from: d */
    public Integer f46720d;

    /* renamed from: e */
    public Boolean f46721e = Boolean.valueOf(true);

    /* renamed from: f */
    public Boolean f46722f = Boolean.valueOf(true);

    /* renamed from: g */
    public Boolean f46723g = Boolean.valueOf(true);

    /* renamed from: h */
    public Boolean f46724h = Boolean.valueOf(true);

    /* renamed from: i */
    public Boolean f46725i;

    /* renamed from: j */
    public StreetViewSource f46726j = StreetViewSource.f46863a;

    public StreetViewPanoramaOptions() {
    }

    StreetViewPanoramaOptions(StreetViewPanoramaCamera streetViewPanoramaCamera, String str, LatLng latLng, Integer num, byte b, byte b2, byte b3, byte b4, byte b5, StreetViewSource streetViewSource) {
        this.f46717a = streetViewPanoramaCamera;
        this.f46719c = latLng;
        this.f46720d = num;
        this.f46718b = str;
        this.f46721e = C16730i.m55208a(b);
        this.f46722f = C16730i.m55208a(b2);
        this.f46723g = C16730i.m55208a(b3);
        this.f46724h = C16730i.m55208a(b4);
        this.f46725i = C16730i.m55208a(b5);
        this.f46726j = streetViewSource;
    }

    public final String toString() {
        return C15265q.m44380a((Object) this).mo38611a("PanoramaId", this.f46718b).mo38611a("Position", this.f46719c).mo38611a("Radius", this.f46720d).mo38611a("Source", this.f46726j).mo38611a("StreetViewPanoramaCamera", this.f46717a).mo38611a("UserNavigationEnabled", this.f46721e).mo38611a("ZoomGesturesEnabled", this.f46722f).mo38611a("PanningGesturesEnabled", this.f46723g).mo38611a("StreetNamesEnabled", this.f46724h).mo38611a("UseViewLifecycleInFragment", this.f46725i).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44452a(parcel, 2, (Parcelable) this.f46717a, i, false);
        C15269a.m44457a(parcel, 3, this.f46718b, false);
        C15269a.m44452a(parcel, 4, (Parcelable) this.f46719c, i, false);
        C15269a.m44455a(parcel, 5, this.f46720d, false);
        C15269a.m44444a(parcel, 6, C16730i.m55207a(this.f46721e));
        C15269a.m44444a(parcel, 7, C16730i.m55207a(this.f46722f));
        C15269a.m44444a(parcel, 8, C16730i.m55207a(this.f46723g));
        C15269a.m44444a(parcel, 9, C16730i.m55207a(this.f46724h));
        C15269a.m44444a(parcel, 10, C16730i.m55207a(this.f46725i));
        C15269a.m44452a(parcel, 11, (Parcelable) this.f46726j, i, false);
        C15269a.m44443a(parcel, a);
    }
}
