package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.C14816bu;
import com.google.android.gms.ads.internal.C14832n;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.jp */
public final class C15795jp {

    /* renamed from: a */
    private final Context f44527a;

    /* renamed from: b */
    private final C15931oq f44528b;

    /* renamed from: c */
    private final zzbgz f44529c;

    /* renamed from: d */
    private final C14816bu f44530d;

    C15795jp(Context context, C15931oq oqVar, zzbgz zzbgz, C14816bu buVar) {
        this.f44527a = context;
        this.f44528b = oqVar;
        this.f44529c = zzbgz;
        this.f44530d = buVar;
    }

    /* renamed from: a */
    public final C14832n mo41677a(String str) {
        C14832n nVar = new C14832n(this.f44527a, new zzyz(), str, this.f44528b, this.f44529c, this.f44530d);
        return nVar;
    }

    /* renamed from: b */
    public final C14832n mo41678b(String str) {
        C14832n nVar = new C14832n(this.f44527a.getApplicationContext(), new zzyz(), str, this.f44528b, this.f44529c, this.f44530d);
        return nVar;
    }

    /* renamed from: a */
    public final Context mo41676a() {
        return this.f44527a.getApplicationContext();
    }

    /* renamed from: b */
    public final C15795jp mo41679b() {
        return new C15795jp(this.f44527a.getApplicationContext(), this.f44528b, this.f44529c, this.f44530d);
    }
}
