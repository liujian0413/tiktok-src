package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.Handler;
import android.util.SparseArray;
import java.io.IOException;

final class bpj implements bnf, bpt, bqe, brn<bpo> {

    /* renamed from: A */
    private boolean[] f43121A;

    /* renamed from: B */
    private boolean f43122B;

    /* renamed from: C */
    private long f43123C;

    /* renamed from: D */
    private long f43124D;

    /* renamed from: E */
    private long f43125E;

    /* renamed from: F */
    private int f43126F;

    /* renamed from: G */
    private boolean f43127G;
    /* access modifiers changed from: private */

    /* renamed from: H */
    public boolean f43128H;

    /* renamed from: a */
    private final Uri f43129a;

    /* renamed from: b */
    private final bre f43130b;

    /* renamed from: c */
    private final int f43131c;

    /* renamed from: d */
    private final Handler f43132d;
    /* access modifiers changed from: private */

    /* renamed from: e */
    public final bps f43133e;

    /* renamed from: f */
    private final bpw f43134f;

    /* renamed from: g */
    private final brc f43135g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public final String f43136h = null;
    /* access modifiers changed from: private */

    /* renamed from: i */
    public final long f43137i;

    /* renamed from: j */
    private final brm f43138j;

    /* renamed from: k */
    private final bpp f43139k;

    /* renamed from: l */
    private final brt f43140l;

    /* renamed from: m */
    private final Runnable f43141m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public final Runnable f43142n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public final Handler f43143o;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public final SparseArray<bqc> f43144p;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public bpu f43145q;

    /* renamed from: r */
    private bnk f43146r;

    /* renamed from: s */
    private boolean f43147s;

    /* renamed from: t */
    private boolean f43148t;

    /* renamed from: u */
    private boolean f43149u;

    /* renamed from: v */
    private boolean f43150v;

    /* renamed from: w */
    private int f43151w;

    /* renamed from: x */
    private bql f43152x;

    /* renamed from: y */
    private long f43153y;

    /* renamed from: z */
    private boolean[] f43154z;

    public bpj(Uri uri, bre bre, bnd[] bndArr, int i, Handler handler, bps bps, bpw bpw, brc brc, String str, int i2) {
        this.f43129a = uri;
        this.f43130b = bre;
        this.f43131c = i;
        this.f43132d = handler;
        this.f43133e = bps;
        this.f43134f = bpw;
        this.f43135g = brc;
        this.f43137i = (long) i2;
        this.f43138j = new brm("Loader:ExtractorMediaPeriod");
        this.f43139k = new bpp(bndArr, this);
        this.f43140l = new brt();
        this.f43141m = new bpk(this);
        this.f43142n = new bpl(this);
        this.f43143o = new Handler();
        this.f43125E = -9223372036854775807L;
        this.f43144p = new SparseArray<>();
        this.f43123C = -1;
    }

    /* renamed from: b */
    public final void mo41097b() {
        this.f43138j.mo41203a((Runnable) new bpm(this, this.f43139k));
        this.f43143o.removeCallbacksAndMessages(null);
        this.f43128H = true;
    }

    /* renamed from: a */
    public final void mo41091a(bpu bpu, long j) {
        this.f43145q = bpu;
        this.f43140l.mo41210a();
        m49641g();
    }

    /* renamed from: c */
    public final bql mo41098c() {
        return this.f43152x;
    }

    /* renamed from: a */
    public final long mo41089a(bqv[] bqvArr, boolean[] zArr, bqf[] bqfArr, boolean[] zArr2, long j) {
        brr.m49873b(this.f43148t);
        for (int i = 0; i < bqvArr.length; i++) {
            if (bqfArr[i] != null && (bqvArr[i] == null || !zArr[i])) {
                int a = bqfArr[i].f43174a;
                brr.m49873b(this.f43154z[a]);
                this.f43151w--;
                this.f43154z[a] = false;
                ((bqc) this.f43144p.valueAt(a)).mo41134b();
                bqfArr[i] = null;
            }
        }
        boolean z = false;
        for (int i2 = 0; i2 < bqvArr.length; i2++) {
            if (bqfArr[i2] == null && bqvArr[i2] != null) {
                bqv bqv = bqvArr[i2];
                brr.m49873b(bqv.mo41165b() == 1);
                brr.m49873b(bqv.mo41166b(0) == 0);
                int a2 = this.f43152x.mo41159a(bqv.mo41163a());
                brr.m49873b(!this.f43154z[a2]);
                this.f43151w++;
                this.f43154z[a2] = true;
                bqfArr[i2] = new bpq(this, a2);
                zArr2[i2] = true;
                z = true;
            }
        }
        if (!this.f43149u) {
            int size = this.f43144p.size();
            for (int i3 = 0; i3 < size; i3++) {
                if (!this.f43154z[i3]) {
                    ((bqc) this.f43144p.valueAt(i3)).mo41134b();
                }
            }
        }
        if (this.f43151w == 0) {
            this.f43150v = false;
            if (this.f43138j.mo41204a()) {
                this.f43138j.mo41205b();
            }
        } else if (!this.f43149u ? j != 0 : z) {
            j = mo41096b(j);
            for (int i4 = 0; i4 < bqfArr.length; i4++) {
                if (bqfArr[i4] != null) {
                    zArr2[i4] = true;
                }
            }
        }
        this.f43149u = true;
        return j;
    }

    /* renamed from: a */
    public final boolean mo41086a(long j) {
        if (this.f43127G || (this.f43148t && this.f43151w == 0)) {
            return false;
        }
        boolean a = this.f43140l.mo41210a();
        if (!this.f43138j.mo41204a()) {
            m49641g();
            a = true;
        }
        return a;
    }

    /* renamed from: H_ */
    public final long mo41085H_() {
        if (this.f43151w == 0) {
            return Long.MIN_VALUE;
        }
        return mo41100e();
    }

    /* renamed from: d */
    public final long mo41099d() {
        if (!this.f43150v) {
            return -9223372036854775807L;
        }
        this.f43150v = false;
        return this.f43124D;
    }

    /* renamed from: e */
    public final long mo41100e() {
        long j;
        if (this.f43127G) {
            return Long.MIN_VALUE;
        }
        if (m49646j()) {
            return this.f43125E;
        }
        if (this.f43122B) {
            j = Long.MAX_VALUE;
            int size = this.f43144p.size();
            for (int i = 0; i < size; i++) {
                if (this.f43121A[i]) {
                    j = Math.min(j, ((bqc) this.f43144p.valueAt(i)).mo41137e());
                }
            }
        } else {
            j = m49644i();
        }
        return j == Long.MIN_VALUE ? this.f43124D : j;
    }

    /* renamed from: b */
    public final long mo41096b(long j) {
        if (!this.f43146r.mo41001a()) {
            j = 0;
        }
        this.f43124D = j;
        int size = this.f43144p.size();
        boolean z = !m49646j();
        int i = 0;
        while (z && i < size) {
            if (this.f43154z[i]) {
                z = ((bqc) this.f43144p.valueAt(i)).mo41133a(j, false);
            }
            i++;
        }
        if (!z) {
            this.f43125E = j;
            this.f43127G = false;
            if (this.f43138j.mo41204a()) {
                this.f43138j.mo41205b();
            } else {
                for (int i2 = 0; i2 < size; i2++) {
                    ((bqc) this.f43144p.valueAt(i2)).mo41132a(this.f43154z[i2]);
                }
            }
        }
        this.f43150v = false;
        return j;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo41095a(int i) {
        return this.f43127G || (!m49646j() && ((bqc) this.f43144p.valueAt(i)).mo41135c());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final int mo41087a(int i, blg blg, bmw bmw, boolean z) {
        if (this.f43150v || m49646j()) {
            return -3;
        }
        return ((bqc) this.f43144p.valueAt(i)).mo41131a(blg, bmw, z, this.f43127G, this.f43124D);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo41090a(int i, long j) {
        bqc bqc = (bqc) this.f43144p.valueAt(i);
        if (!this.f43127G || j <= bqc.mo41137e()) {
            bqc.mo41133a(j, true);
        } else {
            bqc.mo41138f();
        }
    }

    /* renamed from: a */
    public final bnm mo41017a(int i, int i2) {
        bqc bqc = (bqc) this.f43144p.get(i);
        if (bqc != null) {
            return bqc;
        }
        bqc bqc2 = new bqc(this.f43135g);
        bqc2.f43225a = this;
        this.f43144p.put(i, bqc2);
        return bqc2;
    }

    /* renamed from: a */
    public final void mo41018a() {
        this.f43147s = true;
        this.f43143o.post(this.f43141m);
    }

    /* renamed from: a */
    public final void mo41019a(bnk bnk) {
        this.f43146r = bnk;
        this.f43143o.post(this.f43141m);
    }

    /* renamed from: a */
    public final void mo41094a(zzlg zzlg) {
        this.f43143o.post(this.f43141m);
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public final void m49639f() {
        if (!this.f43128H && !this.f43148t && this.f43146r != null && this.f43147s) {
            int size = this.f43144p.size();
            int i = 0;
            while (i < size) {
                if (((bqc) this.f43144p.valueAt(i)).mo41136d() != null) {
                    i++;
                } else {
                    return;
                }
            }
            this.f43140l.mo41211b();
            bqj[] bqjArr = new bqj[size];
            this.f43121A = new boolean[size];
            this.f43154z = new boolean[size];
            this.f43153y = this.f43146r.mo41002b();
            int i2 = 0;
            while (true) {
                boolean z = true;
                if (i2 < size) {
                    zzlg d = ((bqc) this.f43144p.valueAt(i2)).mo41136d();
                    bqjArr[i2] = new bqj(d);
                    String str = d.f45713c;
                    if (!brw.m49888b(str) && !brw.m49887a(str)) {
                        z = false;
                    }
                    this.f43121A[i2] = z;
                    this.f43122B = z | this.f43122B;
                    i2++;
                } else {
                    this.f43152x = new bql(bqjArr);
                    this.f43148t = true;
                    this.f43134f.mo40874a(new bqi(this.f43153y, this.f43146r.mo41001a()), null);
                    this.f43145q.mo40875a(this);
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    private final void m49633a(bpo bpo) {
        if (this.f43123C == -1) {
            this.f43123C = bpo.f43169i;
        }
    }

    /* renamed from: g */
    private final void m49641g() {
        bpo bpo = new bpo(this, this.f43129a, this.f43130b, this.f43139k, this.f43140l);
        if (this.f43148t) {
            brr.m49873b(m49646j());
            if (this.f43153y == -9223372036854775807L || this.f43125E < this.f43153y) {
                bpo.mo41106a(this.f43146r.mo41000a(this.f43125E), this.f43125E);
                this.f43125E = -9223372036854775807L;
            } else {
                this.f43127G = true;
                this.f43125E = -9223372036854775807L;
                return;
            }
        }
        this.f43126F = m49642h();
        int i = this.f43131c;
        if (i == -1) {
            i = (this.f43148t && this.f43123C == -1 && (this.f43146r == null || this.f43146r.mo41002b() == -9223372036854775807L)) ? 6 : 3;
        }
        this.f43138j.mo41202a(bpo, this, i);
    }

    /* renamed from: h */
    private final int m49642h() {
        int i = 0;
        for (int i2 = 0; i2 < this.f43144p.size(); i2++) {
            i += ((bqc) this.f43144p.valueAt(i2)).mo41130a();
        }
        return i;
    }

    /* renamed from: i */
    private final long m49644i() {
        int size = this.f43144p.size();
        long j = Long.MIN_VALUE;
        for (int i = 0; i < size; i++) {
            j = Math.max(j, ((bqc) this.f43144p.valueAt(i)).mo41137e());
        }
        return j;
    }

    /* renamed from: j */
    private final boolean m49646j() {
        return this.f43125E != -9223372036854775807L;
    }

    /* renamed from: a */
    public final /* synthetic */ int mo41088a(brp brp, long j, long j2, IOException iOException) {
        bpo bpo = (bpo) brp;
        m49633a(bpo);
        if (!(this.f43132d == null || this.f43133e == null)) {
            this.f43132d.post(new bpn(this, iOException));
        }
        if (iOException instanceof zzrb) {
            return 3;
        }
        boolean z = m49642h() > this.f43126F;
        if (this.f43123C == -1 && (this.f43146r == null || this.f43146r.mo41002b() == -9223372036854775807L)) {
            this.f43124D = 0;
            this.f43150v = this.f43148t;
            int size = this.f43144p.size();
            for (int i = 0; i < size; i++) {
                ((bqc) this.f43144p.valueAt(i)).mo41132a(!this.f43148t || this.f43154z[i]);
            }
            bpo.mo41106a(0, 0);
        }
        this.f43126F = m49642h();
        return z ? 1 : 0;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo41093a(brp brp, long j, long j2, boolean z) {
        m49633a((bpo) brp);
        if (!z && this.f43151w > 0) {
            int size = this.f43144p.size();
            for (int i = 0; i < size; i++) {
                ((bqc) this.f43144p.valueAt(i)).mo41132a(this.f43154z[i]);
            }
            this.f43145q.mo40877a(this);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo41092a(brp brp, long j, long j2) {
        m49633a((bpo) brp);
        this.f43127G = true;
        if (this.f43153y == -9223372036854775807L) {
            long i = m49644i();
            this.f43153y = i == Long.MIN_VALUE ? 0 : i + 10000;
            this.f43134f.mo40874a(new bqi(this.f43153y, this.f43146r.mo41001a()), null);
        }
        this.f43145q.mo40877a(this);
    }
}
