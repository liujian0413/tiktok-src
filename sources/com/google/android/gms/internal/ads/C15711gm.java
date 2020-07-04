package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.C14871k;
import com.google.android.gms.ads.formats.C14747a.C14748a;
import com.google.android.gms.ads.formats.C14747a.C14749b;
import com.google.android.gms.ads.formats.C14761h;
import com.google.android.gms.dynamic.C15345b;
import com.google.android.gms.dynamic.C15349d;
import java.util.ArrayList;
import java.util.List;

@C6505uv
/* renamed from: com.google.android.gms.internal.ads.gm */
public final class C15711gm extends C14761h {

    /* renamed from: a */
    private final C15708gj f44439a;

    /* renamed from: b */
    private final List<C14749b> f44440b = new ArrayList();

    /* renamed from: c */
    private final C15662er f44441c;

    /* renamed from: d */
    private final C14871k f44442d = new C14871k();

    /* renamed from: e */
    private final C14748a f44443e;

    /* renamed from: f */
    private final List<Object> f44444f = new ArrayList();

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0051 A[Catch:{ RemoteException -> 0x005c }] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00b6 A[Catch:{ RemoteException -> 0x00c3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:52:0x0027 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C15711gm(com.google.android.gms.internal.ads.C15708gj r5) {
        /*
            r4 = this;
            r4.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f44440b = r0
            com.google.android.gms.ads.k r0 = new com.google.android.gms.ads.k
            r0.<init>()
            r4.f44442d = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r4.f44444f = r0
            r4.f44439a = r5
            r5 = 0
            com.google.android.gms.internal.ads.gj r0 = r4.f44439a     // Catch:{ RemoteException -> 0x005c }
            java.util.List r0 = r0.mo41500f()     // Catch:{ RemoteException -> 0x005c }
            if (r0 == 0) goto L_0x0062
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RemoteException -> 0x005c }
        L_0x0027:
            boolean r1 = r0.hasNext()     // Catch:{ RemoteException -> 0x005c }
            if (r1 == 0) goto L_0x0062
            java.lang.Object r1 = r0.next()     // Catch:{ RemoteException -> 0x005c }
            boolean r2 = r1 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x005c }
            if (r2 == 0) goto L_0x004e
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ RemoteException -> 0x005c }
            if (r1 == 0) goto L_0x004e
            java.lang.String r2 = "com.google.android.gms.ads.internal.formats.client.INativeAdImage"
            android.os.IInterface r2 = r1.queryLocalInterface(r2)     // Catch:{ RemoteException -> 0x005c }
            boolean r3 = r2 instanceof com.google.android.gms.internal.ads.C15658en     // Catch:{ RemoteException -> 0x005c }
            if (r3 == 0) goto L_0x0047
            r1 = r2
            com.google.android.gms.internal.ads.en r1 = (com.google.android.gms.internal.ads.C15658en) r1     // Catch:{ RemoteException -> 0x005c }
            goto L_0x004f
        L_0x0047:
            com.google.android.gms.internal.ads.ep r2 = new com.google.android.gms.internal.ads.ep     // Catch:{ RemoteException -> 0x005c }
            r2.<init>(r1)     // Catch:{ RemoteException -> 0x005c }
            r1 = r2
            goto L_0x004f
        L_0x004e:
            r1 = r5
        L_0x004f:
            if (r1 == 0) goto L_0x0027
            java.util.List<com.google.android.gms.ads.formats.a$b> r2 = r4.f44440b     // Catch:{ RemoteException -> 0x005c }
            com.google.android.gms.internal.ads.er r3 = new com.google.android.gms.internal.ads.er     // Catch:{ RemoteException -> 0x005c }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x005c }
            r2.add(r3)     // Catch:{ RemoteException -> 0x005c }
            goto L_0x0027
        L_0x005c:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.afm.m45778b(r1, r0)
        L_0x0062:
            com.google.android.gms.internal.ads.gj r0 = r4.f44439a     // Catch:{ RemoteException -> 0x0091 }
            java.util.List r0 = r0.mo41551g()     // Catch:{ RemoteException -> 0x0091 }
            if (r0 == 0) goto L_0x0097
            java.util.Iterator r0 = r0.iterator()     // Catch:{ RemoteException -> 0x0091 }
        L_0x006e:
            boolean r1 = r0.hasNext()     // Catch:{ RemoteException -> 0x0091 }
            if (r1 == 0) goto L_0x0097
            java.lang.Object r1 = r0.next()     // Catch:{ RemoteException -> 0x0091 }
            boolean r2 = r1 instanceof android.os.IBinder     // Catch:{ RemoteException -> 0x0091 }
            if (r2 == 0) goto L_0x0083
            android.os.IBinder r1 = (android.os.IBinder) r1     // Catch:{ RemoteException -> 0x0091 }
            com.google.android.gms.internal.ads.ag r1 = com.google.android.gms.internal.ads.C15479ah.m45850a(r1)     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x0084
        L_0x0083:
            r1 = r5
        L_0x0084:
            if (r1 == 0) goto L_0x006e
            java.util.List<java.lang.Object> r2 = r4.f44444f     // Catch:{ RemoteException -> 0x0091 }
            com.google.android.gms.internal.ads.aj r3 = new com.google.android.gms.internal.ads.aj     // Catch:{ RemoteException -> 0x0091 }
            r3.<init>(r1)     // Catch:{ RemoteException -> 0x0091 }
            r2.add(r3)     // Catch:{ RemoteException -> 0x0091 }
            goto L_0x006e
        L_0x0091:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.afm.m45778b(r1, r0)
        L_0x0097:
            com.google.android.gms.internal.ads.gj r0 = r4.f44439a     // Catch:{ RemoteException -> 0x00a5 }
            com.google.android.gms.internal.ads.en r0 = r0.mo41554j()     // Catch:{ RemoteException -> 0x00a5 }
            if (r0 == 0) goto L_0x00ab
            com.google.android.gms.internal.ads.er r1 = new com.google.android.gms.internal.ads.er     // Catch:{ RemoteException -> 0x00a5 }
            r1.<init>(r0)     // Catch:{ RemoteException -> 0x00a5 }
            goto L_0x00ac
        L_0x00a5:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.afm.m45778b(r1, r0)
        L_0x00ab:
            r1 = r5
        L_0x00ac:
            r4.f44441c = r1
            com.google.android.gms.internal.ads.gj r0 = r4.f44439a     // Catch:{ RemoteException -> 0x00c3 }
            com.google.android.gms.internal.ads.ej r0 = r0.mo41565u()     // Catch:{ RemoteException -> 0x00c3 }
            if (r0 == 0) goto L_0x00c9
            com.google.android.gms.internal.ads.em r0 = new com.google.android.gms.internal.ads.em     // Catch:{ RemoteException -> 0x00c3 }
            com.google.android.gms.internal.ads.gj r1 = r4.f44439a     // Catch:{ RemoteException -> 0x00c3 }
            com.google.android.gms.internal.ads.ej r1 = r1.mo41565u()     // Catch:{ RemoteException -> 0x00c3 }
            r0.<init>(r1)     // Catch:{ RemoteException -> 0x00c3 }
            r5 = r0
            goto L_0x00c9
        L_0x00c3:
            r0 = move-exception
            java.lang.String r1 = ""
            com.google.android.gms.internal.ads.afm.m45778b(r1, r0)
        L_0x00c9:
            r4.f44443e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.C15711gm.<init>(com.google.android.gms.internal.ads.gj):void");
    }

    /* access modifiers changed from: private */
    /* renamed from: n */
    public final C15345b mo37549l() {
        try {
            return this.f44439a.mo41561q();
        } catch (RemoteException e) {
            afm.m45778b("", e);
            return null;
        }
    }

    /* renamed from: m */
    public final Object mo37550m() {
        try {
            C15345b r = this.f44439a.mo41562r();
            if (r != null) {
                return C15349d.m44669a(r);
            }
        } catch (RemoteException e) {
            afm.m45778b("", e);
        }
        return null;
    }

    /* renamed from: a */
    public final String mo37538a() {
        try {
            return this.f44439a.mo41544a();
        } catch (RemoteException e) {
            afm.m45778b("", e);
            return null;
        }
    }

    /* renamed from: b */
    public final List<C14749b> mo37539b() {
        return this.f44440b;
    }

    /* renamed from: c */
    public final String mo37540c() {
        try {
            return this.f44439a.mo41553i();
        } catch (RemoteException e) {
            afm.m45778b("", e);
            return null;
        }
    }

    /* renamed from: d */
    public final C14749b mo37541d() {
        return this.f44441c;
    }

    /* renamed from: e */
    public final String mo37542e() {
        try {
            return this.f44439a.mo41555k();
        } catch (RemoteException e) {
            afm.m45778b("", e);
            return null;
        }
    }

    /* renamed from: g */
    public final Double mo37544g() {
        try {
            double m = this.f44439a.mo41557m();
            if (m == -1.0d) {
                return null;
            }
            return Double.valueOf(m);
        } catch (RemoteException e) {
            afm.m45778b("", e);
            return null;
        }
    }

    /* renamed from: h */
    public final String mo37545h() {
        try {
            return this.f44439a.mo41558n();
        } catch (RemoteException e) {
            afm.m45778b("", e);
            return null;
        }
    }

    /* renamed from: i */
    public final String mo37546i() {
        try {
            return this.f44439a.mo41559o();
        } catch (RemoteException e) {
            afm.m45778b("", e);
            return null;
        }
    }

    /* renamed from: j */
    public final C14871k mo37547j() {
        try {
            if (this.f44439a.mo41560p() != null) {
                this.f44442d.mo37870a(this.f44439a.mo41560p());
            }
        } catch (RemoteException e) {
            afm.m45778b("Exception occurred while getting video controller", e);
        }
        return this.f44442d;
    }

    /* renamed from: k */
    public final void mo37548k() {
        try {
            this.f44439a.mo41566v();
        } catch (RemoteException e) {
            afm.m45778b("", e);
        }
    }

    /* renamed from: f */
    public final String mo37543f() {
        try {
            return this.f44439a.mo41556l();
        } catch (RemoteException e) {
            afm.m45778b("", e);
            return null;
        }
    }
}
