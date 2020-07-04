package com.google.android.gms.maps;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.util.AttributeSet;
import com.google.android.gms.common.internal.C15265q;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.CameraPosition.C16766a;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.p764a.C16730i;

public final class GoogleMapOptions extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<GoogleMapOptions> CREATOR = new C16761i();

    /* renamed from: a */
    public Boolean f46701a;

    /* renamed from: b */
    public Boolean f46702b;

    /* renamed from: c */
    public int f46703c = -1;

    /* renamed from: d */
    public CameraPosition f46704d;

    /* renamed from: e */
    public Boolean f46705e;

    /* renamed from: f */
    public Boolean f46706f;

    /* renamed from: g */
    public Boolean f46707g;

    /* renamed from: h */
    public Boolean f46708h;

    /* renamed from: i */
    public Boolean f46709i;

    /* renamed from: j */
    public Boolean f46710j;

    /* renamed from: k */
    public Boolean f46711k;

    /* renamed from: l */
    public Boolean f46712l;

    /* renamed from: m */
    public Boolean f46713m;

    /* renamed from: n */
    public Float f46714n;

    /* renamed from: o */
    public Float f46715o;

    /* renamed from: p */
    public LatLngBounds f46716p;

    public GoogleMapOptions() {
    }

    GoogleMapOptions(byte b, byte b2, int i, CameraPosition cameraPosition, byte b3, byte b4, byte b5, byte b6, byte b7, byte b8, byte b9, byte b10, byte b11, Float f, Float f2, LatLngBounds latLngBounds) {
        this.f46701a = C16730i.m55208a(b);
        this.f46702b = C16730i.m55208a(b2);
        this.f46703c = i;
        this.f46704d = cameraPosition;
        this.f46705e = C16730i.m55208a(b3);
        this.f46706f = C16730i.m55208a(b4);
        this.f46707g = C16730i.m55208a(b5);
        this.f46708h = C16730i.m55208a(b6);
        this.f46709i = C16730i.m55208a(b7);
        this.f46710j = C16730i.m55208a(b8);
        this.f46711k = C16730i.m55208a(b9);
        this.f46712l = C16730i.m55208a(b10);
        this.f46713m = C16730i.m55208a(b11);
        this.f46714n = f;
        this.f46715o = f2;
        this.f46716p = latLngBounds;
    }

    /* renamed from: a */
    private GoogleMapOptions m55080a(float f) {
        this.f46714n = Float.valueOf(f);
        return this;
    }

    /* renamed from: a */
    private GoogleMapOptions m55081a(int i) {
        this.f46703c = i;
        return this;
    }

    /* renamed from: a */
    public static GoogleMapOptions m55082a(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R$styleable.MapAttrs);
        GoogleMapOptions googleMapOptions = new GoogleMapOptions();
        if (obtainAttributes.hasValue(13)) {
            googleMapOptions.m55081a(obtainAttributes.getInt(13, -1));
        }
        if (obtainAttributes.hasValue(22)) {
            googleMapOptions.m55085a(obtainAttributes.getBoolean(22, false));
        }
        if (obtainAttributes.hasValue(21)) {
            googleMapOptions.m55087b(obtainAttributes.getBoolean(21, false));
        }
        if (obtainAttributes.hasValue(14)) {
            googleMapOptions.m55091d(obtainAttributes.getBoolean(14, true));
        }
        if (obtainAttributes.hasValue(16)) {
            googleMapOptions.m55095h(obtainAttributes.getBoolean(16, true));
        }
        if (obtainAttributes.hasValue(17)) {
            googleMapOptions.m55092e(obtainAttributes.getBoolean(17, true));
        }
        if (obtainAttributes.hasValue(18)) {
            googleMapOptions.m55094g(obtainAttributes.getBoolean(18, true));
        }
        if (obtainAttributes.hasValue(20)) {
            googleMapOptions.m55093f(obtainAttributes.getBoolean(20, true));
        }
        if (obtainAttributes.hasValue(19)) {
            googleMapOptions.m55089c(obtainAttributes.getBoolean(19, true));
        }
        if (obtainAttributes.hasValue(12)) {
            googleMapOptions.m55096i(obtainAttributes.getBoolean(12, false));
        }
        if (obtainAttributes.hasValue(15)) {
            googleMapOptions.m55097j(obtainAttributes.getBoolean(15, true));
        }
        if (obtainAttributes.hasValue(0)) {
            googleMapOptions.m55098k(obtainAttributes.getBoolean(0, false));
        }
        if (obtainAttributes.hasValue(3)) {
            googleMapOptions.m55080a(obtainAttributes.getFloat(3, Float.NEGATIVE_INFINITY));
        }
        if (obtainAttributes.hasValue(3)) {
            googleMapOptions.m55086b(obtainAttributes.getFloat(2, Float.POSITIVE_INFINITY));
        }
        googleMapOptions.m55084a(m55088b(context, attributeSet));
        googleMapOptions.m55083a(m55090c(context, attributeSet));
        obtainAttributes.recycle();
        return googleMapOptions;
    }

    /* renamed from: a */
    private GoogleMapOptions m55083a(CameraPosition cameraPosition) {
        this.f46704d = cameraPosition;
        return this;
    }

    /* renamed from: a */
    private GoogleMapOptions m55084a(LatLngBounds latLngBounds) {
        this.f46716p = latLngBounds;
        return this;
    }

    /* renamed from: a */
    private GoogleMapOptions m55085a(boolean z) {
        this.f46701a = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: b */
    private GoogleMapOptions m55086b(float f) {
        this.f46715o = Float.valueOf(f);
        return this;
    }

    /* renamed from: b */
    private GoogleMapOptions m55087b(boolean z) {
        this.f46702b = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: b */
    private static LatLngBounds m55088b(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R$styleable.MapAttrs);
        Float valueOf = obtainAttributes.hasValue(10) ? Float.valueOf(obtainAttributes.getFloat(10, 0.0f)) : null;
        Float valueOf2 = obtainAttributes.hasValue(11) ? Float.valueOf(obtainAttributes.getFloat(11, 0.0f)) : null;
        Float valueOf3 = obtainAttributes.hasValue(8) ? Float.valueOf(obtainAttributes.getFloat(8, 0.0f)) : null;
        Float valueOf4 = obtainAttributes.hasValue(9) ? Float.valueOf(obtainAttributes.getFloat(9, 0.0f)) : null;
        obtainAttributes.recycle();
        if (valueOf == null || valueOf2 == null || valueOf3 == null || valueOf4 == null) {
            return null;
        }
        return new LatLngBounds(new LatLng((double) valueOf.floatValue(), (double) valueOf2.floatValue()), new LatLng((double) valueOf3.floatValue(), (double) valueOf4.floatValue()));
    }

    /* renamed from: c */
    private GoogleMapOptions m55089c(boolean z) {
        this.f46705e = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: c */
    private static CameraPosition m55090c(Context context, AttributeSet attributeSet) {
        if (context == null || attributeSet == null) {
            return null;
        }
        TypedArray obtainAttributes = context.getResources().obtainAttributes(attributeSet, R$styleable.MapAttrs);
        LatLng latLng = new LatLng((double) (obtainAttributes.hasValue(4) ? obtainAttributes.getFloat(4, 0.0f) : 0.0f), (double) (obtainAttributes.hasValue(5) ? obtainAttributes.getFloat(5, 0.0f) : 0.0f));
        C16766a a = CameraPosition.m55299a();
        a.mo43398a(latLng);
        if (obtainAttributes.hasValue(7)) {
            a.mo43397a(obtainAttributes.getFloat(7, 0.0f));
        }
        if (obtainAttributes.hasValue(1)) {
            a.mo43401c(obtainAttributes.getFloat(1, 0.0f));
        }
        if (obtainAttributes.hasValue(6)) {
            a.mo43400b(obtainAttributes.getFloat(6, 0.0f));
        }
        obtainAttributes.recycle();
        return a.mo43399a();
    }

    /* renamed from: d */
    private GoogleMapOptions m55091d(boolean z) {
        this.f46706f = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: e */
    private GoogleMapOptions m55092e(boolean z) {
        this.f46707g = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: f */
    private GoogleMapOptions m55093f(boolean z) {
        this.f46708h = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: g */
    private GoogleMapOptions m55094g(boolean z) {
        this.f46709i = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: h */
    private GoogleMapOptions m55095h(boolean z) {
        this.f46710j = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: i */
    private GoogleMapOptions m55096i(boolean z) {
        this.f46711k = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: j */
    private GoogleMapOptions m55097j(boolean z) {
        this.f46712l = Boolean.valueOf(z);
        return this;
    }

    /* renamed from: k */
    private GoogleMapOptions m55098k(boolean z) {
        this.f46713m = Boolean.valueOf(z);
        return this;
    }

    public final String toString() {
        return C15265q.m44380a((Object) this).mo38611a("MapType", Integer.valueOf(this.f46703c)).mo38611a("LiteMode", this.f46711k).mo38611a("Camera", this.f46704d).mo38611a("CompassEnabled", this.f46706f).mo38611a("ZoomControlsEnabled", this.f46705e).mo38611a("ScrollGesturesEnabled", this.f46707g).mo38611a("ZoomGesturesEnabled", this.f46708h).mo38611a("TiltGesturesEnabled", this.f46709i).mo38611a("RotateGesturesEnabled", this.f46710j).mo38611a("MapToolbarEnabled", this.f46712l).mo38611a("AmbientEnabled", this.f46713m).mo38611a("MinZoomPreference", this.f46714n).mo38611a("MaxZoomPreference", this.f46715o).mo38611a("LatLngBoundsForCameraTarget", this.f46716p).mo38611a("ZOrderOnTop", this.f46701a).mo38611a("UseViewLifecycleInFragment", this.f46702b).toString();
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44444a(parcel, 2, C16730i.m55207a(this.f46701a));
        C15269a.m44444a(parcel, 3, C16730i.m55207a(this.f46702b));
        C15269a.m44447a(parcel, 4, this.f46703c);
        C15269a.m44452a(parcel, 5, (Parcelable) this.f46704d, i, false);
        C15269a.m44444a(parcel, 6, C16730i.m55207a(this.f46705e));
        C15269a.m44444a(parcel, 7, C16730i.m55207a(this.f46706f));
        C15269a.m44444a(parcel, 8, C16730i.m55207a(this.f46707g));
        C15269a.m44444a(parcel, 9, C16730i.m55207a(this.f46708h));
        C15269a.m44444a(parcel, 10, C16730i.m55207a(this.f46709i));
        C15269a.m44444a(parcel, 11, C16730i.m55207a(this.f46710j));
        C15269a.m44444a(parcel, 12, C16730i.m55207a(this.f46711k));
        C15269a.m44444a(parcel, 14, C16730i.m55207a(this.f46712l));
        C15269a.m44444a(parcel, 15, C16730i.m55207a(this.f46713m));
        C15269a.m44454a(parcel, 16, this.f46714n, false);
        C15269a.m44454a(parcel, 17, this.f46715o, false);
        C15269a.m44452a(parcel, 18, (Parcelable) this.f46716p, i, false);
        C15269a.m44443a(parcel, a);
    }
}
