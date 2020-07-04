package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.view.Surface;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.nio.ByteBuffer;
import java.util.HashSet;
import java.util.Set;

@C6505uv
public final class akh implements bkt, bps, brq<bre>, bsu {

    /* renamed from: d */
    private static int f40496d;

    /* renamed from: e */
    private static int f40497e;

    /* renamed from: a */
    public final akg f40498a;

    /* renamed from: b */
    public bks f40499b;

    /* renamed from: c */
    public akp f40500c;

    /* renamed from: f */
    private final Context f40501f;

    /* renamed from: g */
    private final blj f40502g;

    /* renamed from: h */
    private final blj f40503h;

    /* renamed from: i */
    private final bqs f40504i;

    /* renamed from: j */
    private final aij f40505j;

    /* renamed from: k */
    private ByteBuffer f40506k;

    /* renamed from: l */
    private boolean f40507l;

    /* renamed from: m */
    private int f40508m;

    /* renamed from: n */
    private Set<WeakReference<akb>> f40509n = new HashSet();

    public akh(Context context, aij aij) {
        this.f40501f = context;
        this.f40505j = aij;
        this.f40498a = new akg();
        bso bso = new bso(this.f40501f, bow.f43108a, 0, acl.f40003a, this, -1);
        this.f40502g = bso;
        this.f40503h = new bmk(bow.f43108a);
        this.f40504i = new bqp();
        if (acd.m45439a()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 28);
            sb.append("ExoPlayerAdapter initialize ");
            sb.append(valueOf);
            acd.m45438a(sb.toString());
        }
        f40496d++;
        this.f40499b = bkw.m49138a(new blj[]{this.f40503h, this.f40502g}, this.f40504i, this.f40498a);
        this.f40499b.mo40850a((bkt) this);
    }

    /* renamed from: a */
    public static int m46199a() {
        return f40496d;
    }

    /* renamed from: b */
    public static int m46201b() {
        return f40497e;
    }

    /* renamed from: a */
    public final void mo39625a(Uri[] uriArr, String str) {
        mo39626a(uriArr, str, ByteBuffer.allocate(0), false);
    }

    /* renamed from: a */
    public final void mo39626a(Uri[] uriArr, String str, ByteBuffer byteBuffer, boolean z) {
        bpv bpv;
        this.f40506k = byteBuffer;
        this.f40507l = z;
        if (uriArr.length == 1) {
            bpv = m46200a(uriArr[0], str);
        } else {
            bpv[] bpvArr = new bpv[uriArr.length];
            for (int i = 0; i < uriArr.length; i++) {
                bpvArr[i] = m46200a(uriArr[i], str);
            }
            bpv = new bpy(bpvArr);
        }
        this.f40499b.mo40851a(bpv);
        f40497e++;
    }

    /* renamed from: c */
    public final void mo39628c() {
        if (this.f40499b != null) {
            this.f40499b.mo40854b((bkt) this);
            this.f40499b.mo40858d();
            this.f40499b = null;
            f40497e--;
        }
    }

    /* renamed from: d */
    public final long mo39629d() {
        return (long) this.f40508m;
    }

    /* renamed from: a */
    public final void mo39619a(IOException iOException) {
        if (this.f40500c != null) {
            this.f40500c.mo39547a("onLoadError", (Exception) iOException);
        }
    }

    /* renamed from: a */
    public final void mo39616a(int i, int i2, int i3, float f) {
        if (this.f40500c != null) {
            this.f40500c.mo39545a(i, i2);
        }
    }

    /* renamed from: a */
    public final void mo39623a(boolean z, int i) {
        if (this.f40500c != null) {
            this.f40500c.mo39549b(i);
        }
    }

    /* renamed from: a */
    public final void mo39618a(zzkt zzkt) {
        if (this.f40500c != null) {
            this.f40500c.mo39547a("onPlayerError", (Exception) zzkt);
        }
    }

    /* renamed from: a */
    public final void mo39615a(int i) {
        for (WeakReference weakReference : this.f40509n) {
            akb akb = (akb) weakReference.get();
            if (akb != null) {
                akb.mo39591a(i);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo39617a(Surface surface, boolean z) {
        bkv bkv = new bkv(this.f40502g, 1, surface);
        if (z) {
            this.f40499b.mo40855b(bkv);
            return;
        }
        this.f40499b.mo40853a(bkv);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo39614a(float f, boolean z) {
        bkv bkv = new bkv(this.f40503h, 2, Float.valueOf(f));
        if (z) {
            this.f40499b.mo40855b(bkv);
            return;
        }
        this.f40499b.mo40853a(bkv);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo39622a(boolean z) {
        for (int i = 0; i < this.f40499b.mo40859e(); i++) {
            this.f40504i.mo41174a(i, !z);
        }
    }

    /* renamed from: a */
    private final bpv m46200a(Uri uri, String str) {
        brf brf;
        brf brf2;
        if (!this.f40507l || this.f40506k.limit() <= 0) {
            if (this.f40505j.f40319i > 0) {
                brf2 = new akj(this, str);
            } else {
                brf2 = new akk(this, str);
            }
            brf akl = this.f40505j.f40320j ? new akl(this, brf2) : brf2;
            if (this.f40506k.limit() > 0) {
                byte[] bArr = new byte[this.f40506k.limit()];
                this.f40506k.get(bArr);
                akl = new akm(akl, bArr);
            }
            brf = akl;
        } else {
            byte[] bArr2 = new byte[this.f40506k.limit()];
            this.f40506k.get(bArr2);
            brf = new aki(bArr2);
        }
        bpr bpr = new bpr(uri, brf, akn.f40519a, -1, acl.f40003a, this, null, this.f40505j.f40317g);
        return bpr;
    }

    public final void finalize() throws Throwable {
        f40496d--;
        if (acd.m45439a()) {
            String valueOf = String.valueOf(this);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 26);
            sb.append("ExoPlayerAdapter finalize ");
            sb.append(valueOf);
            acd.m45438a(sb.toString());
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo39620a(Object obj, int i) {
        this.f40508m += i;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo39621a(Object obj, brg brg) {
        this.f40508m = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ bre mo39612a(brf brf) {
        return new ake(this.f40501f, brf.mo39631a(), this, new ako(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo39624a(boolean z, long j) {
        if (this.f40500c != null) {
            this.f40500c.mo39548a(z, j);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ bre mo39613a(String str) {
        bri bri = new bri(str, null, this.f40505j.f40320j ? null : this, this.f40505j.f40314d, this.f40505j.f40316f, true, null);
        return bri;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ bre mo39627b(String str) {
        akb akb = new akb(str, this.f40505j.f40320j ? null : this, this.f40505j.f40314d, this.f40505j.f40316f, this.f40505j.f40319i);
        this.f40509n.add(new WeakReference(akb));
        return akb;
    }
}
