package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.dd */
public final class C15620dd extends C15659eo {

    /* renamed from: a */
    private final Drawable f44268a;

    /* renamed from: b */
    private final Uri f44269b;

    /* renamed from: c */
    private final double f44270c;

    /* renamed from: d */
    private final int f44271d;

    /* renamed from: e */
    private final int f44272e;

    public C15620dd(Drawable drawable, Uri uri, double d, int i, int i2) {
        this.f44268a = drawable;
        this.f44269b = uri;
        this.f44270c = d;
        this.f44271d = i;
        this.f44272e = i2;
    }

    /* renamed from: a */
    public final C15345b mo41491a() throws RemoteException {
        return C15349d.m44668a(this.f44268a);
    }

    /* renamed from: b */
    public final Uri mo41492b() throws RemoteException {
        return this.f44269b;
    }

    /* renamed from: c */
    public final double mo41493c() {
        return this.f44270c;
    }

    /* renamed from: d */
    public final int mo41494d() {
        return this.f44271d;
    }

    /* renamed from: e */
    public final int mo41495e() {
        return this.f44272e;
    }
}
