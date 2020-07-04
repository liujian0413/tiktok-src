package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.C14871k;
import com.google.android.gms.ads.formats.C14747a.C14748a;
import com.google.android.gms.ads.formats.C14747a.C14749b;
import com.google.android.gms.ads.formats.C14756f;
import com.google.android.gms.dynamic.C15345b;
import java.util.ArrayList;
import java.util.List;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.fj */
public final class C15681fj extends C14756f {

    /* renamed from: a */
    private final C15678fg f44429a;

    /* renamed from: b */
    private final List<C14749b> f44430b = new ArrayList();

    /* renamed from: c */
    private final C15662er f44431c;

    /* renamed from: d */
    private final C14871k f44432d = new C14871k();

    /* renamed from: e */
    private final C14748a f44433e;

    /* JADX WARNING: Removed duplicated region for block: B:17:0x004a A[Catch:{ RemoteException -> 0x0055 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x007a A[Catch:{ RemoteException -> 0x0087 }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0020 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15681fj(com.google.android.gms.internal.ads.C15678fg r5) {
        /*
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f44430b = r0
            com.google.android.gms.ads.k r0 = new com.google.android.gms.ads.k
            r0.<init>()
            r4.f44432d = r0
            r4.f44429a = r5
            r5 = 0
            com.google.android.gms.internal.ads.fg r0 = r4.f44429a     // Catch:{ RemoteException -> 0x0055 }
            java.util.List r0 = r0.mo41500f()     // Catch:{ RemoteException -> 0x0055 }
            if (r0 == 0) goto L_0x005b
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RemoteException -> 0x0055 }
        L_0x0020:
            boolean r1 = r0.hasNext()     // Catch:{ RemoteException -> 0x0055 }
            if (r1 == 0) goto L_0x005b
            java.lang.Object r1 = r0.next()     // Catch:{ RemoteException -> 0x0055 }
            boolean r2 = r1 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0055 }
            if (r2 == 0) goto L_0x0047
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ RemoteException -> 0x0055 }
            if (r1 == 0) goto L_0x0047
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x0055 }
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C15658en     // Catch:{ RemoteException -> 0x0055 }
            if (r3 == 0) goto L_0x0040
            r1 = r2
            com.google.android.gms.internal.ads.en r1 = (com.google.android.gms.internal.ads.C15658en) r1     // Catch:{ RemoteException -> 0x0055 }
            goto L_0x0048
        L_0x0040:
            com.google.android.gms.internal.ads.ep r2 = new com.google.android.gms.internal.ads.ep     // Catch:{ RemoteException -> 0x0055 }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x0055 }
            r1 = r2
            goto L_0x0048
        L_0x0047:
            r1 = r5
        L_0x0048:
            if (r1 == 0) goto L_0x0020
            java.util.List<com.google.android.gms.ads.formats.a$b> r2 = r4.f44430b     // Catch:{ RemoteException -> 0x0055 }
            com.google.android.gms.internal.ads.er r3 = new com.google.android.gms.internal.ads.er     // Catch:{ RemoteException -> 0x0055 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0055 }
            r2.add(r3)     // Catch:{ RemoteException -> 0x0055 }
            goto L_0x0020
        L_0x0055:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.afm.m45778b(r1, r0)
        L_0x005b:
            com.google.android.gms.internal.ads.fg r0 = r4.f44429a     // Catch:{ RemoteException -> 0x0069 }
            com.google.android.gms.internal.ads.en r0 = r0.mo41522j()     // Catch:{ RemoteException -> 0x0069 }
            if (r0 == 0) goto L_0x006f
            com.google.android.gms.internal.ads.er r1 = new com.google.android.gms.internal.ads.er     // Catch:{ RemoteException -> 0x0069 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x0069 }
            goto L_0x0070
        L_0x0069:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.afm.m45778b(r1, r0)
        L_0x006f:
            r1 = r5
        L_0x0070:
            r4.f44431c = r1
            com.google.android.gms.internal.ads.fg r0 = r4.f44429a     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.ej r0 = r0.mo41528p()     // Catch:{ RemoteException -> 0x0087 }
            if (r0 == 0) goto L_0x008d
            com.google.android.gms.internal.ads.em r0 = new com.google.android.gms.internal.ads.em     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.fg r1 = r4.f44429a     // Catch:{ RemoteException -> 0x0087 }
            com.google.android.gms.internal.ads.ej r1 = r1.mo41528p()     // Catch:{ RemoteException -> 0x0087 }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x0087 }
            r5 = r0
            goto L_0x008d
        L_0x0087:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.afm.m45778b(r1, r0)
        L_0x008d:
            r4.f44433e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15681fj.<init>(com.google.android.gms.internal.ads.fg):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: i */
    public final C15345b mo37498a() {
        try {
            return this.f44429a.mo41526n();
        } catch (RemoteException e) {
            afm.m45778b("", e);
            return null;
        }
    }

    /* renamed from: b */
    public final CharSequence mo37530b() {
        try {
            return this.f44429a.mo41515a();
        } catch (RemoteException e) {
            afm.m45778b("", e);
            return null;
        }
    }

    /* renamed from: c */
    public final List<C14749b> mo37531c() {
        return this.f44430b;
    }

    /* renamed from: d */
    public final CharSequence mo37532d() {
        try {
            return this.f44429a.mo41521i();
        } catch (RemoteException e) {
            afm.m45778b("", e);
            return null;
        }
    }

    /* renamed from: e */
    public final C14749b mo37533e() {
        return this.f44431c;
    }

    /* renamed from: f */
    public final CharSequence mo37534f() {
        try {
            return this.f44429a.mo41523k();
        } catch (RemoteException e) {
            afm.m45778b("", e);
            return null;
        }
    }

    /* renamed from: g */
    public final CharSequence mo37535g() {
        try {
            return this.f44429a.mo41524l();
        } catch (RemoteException e) {
            afm.m45778b("", e);
            return null;
        }
    }

    /* renamed from: h */
    public final C14871k mo37536h() {
        try {
            if (this.f44429a.mo41525m() != null) {
                this.f44432d.mo37870a(this.f44429a.mo41525m());
            }
        } catch (RemoteException e) {
            afm.m45778b("Exception occurred while getting video controller", e);
        }
        return this.f44432d;
    }
}
