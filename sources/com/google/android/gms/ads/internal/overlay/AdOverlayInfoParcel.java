package com.google.android.gms.ads.internal.overlay;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.google.android.gms.ads.internal.zzar;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.C15269a;
import com.google.android.gms.dynamic.C15345b.C15346a;
import com.google.android.gms.dynamic.C15349d;
import com.google.android.gms.internal.ads.C15721gw;
import com.google.android.gms.internal.ads.C15723gy;
import com.google.android.gms.internal.ads.C6505uv;
import com.google.android.gms.internal.ads.ami;
import com.google.android.gms.internal.ads.bxr;
import com.google.android.gms.internal.ads.zzbgz;

@C6505uv
public final class AdOverlayInfoParcel extends AbstractSafeParcelable implements ReflectedParcelable {
    public static final Creator<AdOverlayInfoParcel> CREATOR = new C14846m();

    /* renamed from: a */
    public final zzc f38408a;

    /* renamed from: b */
    public final bxr f38409b;

    /* renamed from: c */
    public final C14847n f38410c;

    /* renamed from: d */
    public final ami f38411d;

    /* renamed from: e */
    public final C15723gy f38412e;

    /* renamed from: f */
    public final String f38413f;

    /* renamed from: g */
    public final boolean f38414g;

    /* renamed from: h */
    public final String f38415h;

    /* renamed from: i */
    public final C14853t f38416i;

    /* renamed from: j */
    public final int f38417j;

    /* renamed from: k */
    public final int f38418k;

    /* renamed from: l */
    public final String f38419l;

    /* renamed from: m */
    public final zzbgz f38420m;

    /* renamed from: n */
    public final String f38421n;

    /* renamed from: o */
    public final zzar f38422o;

    /* renamed from: p */
    public final C15721gw f38423p;

    /* renamed from: a */
    public static void m43100a(Intent intent, AdOverlayInfoParcel adOverlayInfoParcel) {
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
    }

    /* renamed from: a */
    public static AdOverlayInfoParcel m43099a(Intent intent) {
        try {
            Bundle bundleExtra = intent.getBundleExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
            bundleExtra.setClassLoader(AdOverlayInfoParcel.class.getClassLoader());
            return (AdOverlayInfoParcel) bundleExtra.getParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo");
        } catch (Exception unused) {
            return null;
        }
    }

    public AdOverlayInfoParcel(bxr bxr, C14847n nVar, C14853t tVar, ami ami, int i, zzbgz zzbgz, String str, zzar zzar) {
        this.f38409b = bxr;
        this.f38410c = nVar;
        this.f38411d = ami;
        this.f38416i = tVar;
        this.f38417j = i;
        this.f38418k = 1;
        this.f38420m = zzbgz;
        this.f38421n = str;
        this.f38422o = zzar;
    }

    public AdOverlayInfoParcel(bxr bxr, C14847n nVar, C14853t tVar, ami ami, boolean z, int i, zzbgz zzbgz) {
        this.f38409b = bxr;
        this.f38410c = nVar;
        this.f38411d = ami;
        this.f38414g = z;
        this.f38416i = tVar;
        this.f38417j = i;
        this.f38418k = 2;
        this.f38420m = zzbgz;
    }

    public AdOverlayInfoParcel(bxr bxr, C14847n nVar, C15721gw gwVar, C15723gy gyVar, C14853t tVar, ami ami, boolean z, int i, String str, zzbgz zzbgz) {
        this.f38409b = bxr;
        this.f38410c = nVar;
        this.f38411d = ami;
        this.f38423p = gwVar;
        this.f38412e = gyVar;
        this.f38414g = z;
        this.f38416i = tVar;
        this.f38417j = i;
        this.f38418k = 3;
        this.f38419l = str;
        this.f38420m = zzbgz;
    }

    public AdOverlayInfoParcel(bxr bxr, C14847n nVar, C15721gw gwVar, C15723gy gyVar, C14853t tVar, ami ami, boolean z, int i, String str, String str2, zzbgz zzbgz) {
        this.f38409b = bxr;
        this.f38410c = nVar;
        this.f38411d = ami;
        this.f38423p = gwVar;
        this.f38412e = gyVar;
        this.f38413f = str2;
        this.f38414g = z;
        this.f38415h = str;
        this.f38416i = tVar;
        this.f38417j = i;
        this.f38418k = 3;
        this.f38420m = zzbgz;
    }

    public AdOverlayInfoParcel(zzc zzc, bxr bxr, C14847n nVar, C14853t tVar, zzbgz zzbgz) {
        this.f38408a = zzc;
        this.f38409b = bxr;
        this.f38410c = nVar;
        this.f38416i = tVar;
        this.f38417j = -1;
        this.f38418k = 4;
        this.f38420m = zzbgz;
    }

    AdOverlayInfoParcel(zzc zzc, IBinder iBinder, IBinder iBinder2, IBinder iBinder3, IBinder iBinder4, String str, boolean z, String str2, IBinder iBinder5, int i, int i2, String str3, zzbgz zzbgz, String str4, zzar zzar, IBinder iBinder6) {
        this.f38408a = zzc;
        this.f38409b = (bxr) C15349d.m44669a(C15346a.m44656a(iBinder));
        this.f38410c = (C14847n) C15349d.m44669a(C15346a.m44656a(iBinder2));
        this.f38411d = (ami) C15349d.m44669a(C15346a.m44656a(iBinder3));
        this.f38423p = (C15721gw) C15349d.m44669a(C15346a.m44656a(iBinder6));
        this.f38412e = (C15723gy) C15349d.m44669a(C15346a.m44656a(iBinder4));
        this.f38413f = str;
        this.f38414g = z;
        this.f38415h = str2;
        this.f38416i = (C14853t) C15349d.m44669a(C15346a.m44656a(iBinder5));
        this.f38417j = i;
        this.f38418k = i2;
        this.f38419l = str3;
        this.f38420m = zzbgz;
        this.f38421n = str4;
        this.f38422o = zzar;
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = C15269a.m44442a(parcel);
        C15269a.m44452a(parcel, 2, (Parcelable) this.f38408a, i, false);
        C15269a.m44450a(parcel, 3, C15349d.m44668a(this.f38409b).asBinder(), false);
        C15269a.m44450a(parcel, 4, C15349d.m44668a(this.f38410c).asBinder(), false);
        C15269a.m44450a(parcel, 5, C15349d.m44668a(this.f38411d).asBinder(), false);
        C15269a.m44450a(parcel, 6, C15349d.m44668a(this.f38412e).asBinder(), false);
        C15269a.m44457a(parcel, 7, this.f38413f, false);
        C15269a.m44459a(parcel, 8, this.f38414g);
        C15269a.m44457a(parcel, 9, this.f38415h, false);
        C15269a.m44450a(parcel, 10, C15349d.m44668a(this.f38416i).asBinder(), false);
        C15269a.m44447a(parcel, 11, this.f38417j);
        C15269a.m44447a(parcel, 12, this.f38418k);
        C15269a.m44457a(parcel, 13, this.f38419l, false);
        C15269a.m44452a(parcel, 14, (Parcelable) this.f38420m, i, false);
        C15269a.m44457a(parcel, 16, this.f38421n, false);
        C15269a.m44452a(parcel, 17, (Parcelable) this.f38422o, i, false);
        C15269a.m44450a(parcel, 18, C15349d.m44668a(this.f38423p).asBinder(), false);
        C15269a.m44443a(parcel, a);
    }
}
