package com.google.android.gms.internal.ads;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.RemoteException;
import com.google.android.gms.ads.formats.C14747a.C14749b;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.er */
public final class C15662er extends C14749b {

    /* renamed from: a */
    private final C15658en f44418a;

    /* renamed from: b */
    private final Drawable f44419b;

    /* renamed from: c */
    private final Uri f44420c;

    /* renamed from: d */
    private final double f44421d;

    /* renamed from: e */
    private final int f44422e;

    /* renamed from: f */
    private final int f44423f;

    public C15662er(C15658en enVar) {
        Drawable drawable;
        int i;
        this.f44418a = enVar;
        Uri uri = null;
        try {
            C15345b a = this.f44418a.mo41491a();
            if (a != null) {
                drawable = (Drawable) C15349d.m44669a(a);
                this.f44419b = drawable;
                uri = this.f44418a.mo41492b();
                this.f44420c = uri;
                double d = 1.0d;
                d = this.f44418a.mo41493c();
                this.f44421d = d;
                int i2 = -1;
                i = this.f44418a.mo41494d();
                this.f44422e = i;
                i2 = this.f44418a.mo41495e();
                this.f44423f = i2;
            }
        } catch (RemoteException e) {
            afm.m45778b("", e);
        }
        drawable = null;
        this.f44419b = drawable;
        try {
            uri = this.f44418a.mo41492b();
        } catch (RemoteException e2) {
            afm.m45778b("", e2);
        }
        this.f44420c = uri;
        double d2 = 1.0d;
        try {
            d2 = this.f44418a.mo41493c();
        } catch (RemoteException e3) {
            afm.m45778b("", e3);
        }
        this.f44421d = d2;
        int i22 = -1;
        try {
            i = this.f44418a.mo41494d();
        } catch (RemoteException e4) {
            afm.m45778b("", e4);
            i = -1;
        }
        this.f44422e = i;
        try {
            i22 = this.f44418a.mo41495e();
        } catch (RemoteException e5) {
            afm.m45778b("", e5);
        }
        this.f44423f = i22;
    }

    /* renamed from: a */
    public final Drawable mo37499a() {
        return this.f44419b;
    }

    /* renamed from: b */
    public final Uri mo37500b() {
        return this.f44420c;
    }

    /* renamed from: c */
    public final double mo37501c() {
        return this.f44421d;
    }

    /* renamed from: d */
    public final int mo37502d() {
        return this.f44422e;
    }

    /* renamed from: e */
    public final int mo37503e() {
        return this.f44423f;
    }
}
