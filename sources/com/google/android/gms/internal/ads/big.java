package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.SystemClock;
import android.util.SparseArray;
import com.p280ss.android.ugc.aweme.feed.experiment.DouPlusShareGuideExperiment;
import java.io.IOException;

public final class big implements bho, bif, bjx {

    /* renamed from: A */
    private IOException f42096A;

    /* renamed from: B */
    private boolean f42097B;

    /* renamed from: C */
    private int f42098C;

    /* renamed from: D */
    private long f42099D;

    /* renamed from: E */
    private boolean f42100E;
    /* access modifiers changed from: private */

    /* renamed from: F */
    public int f42101F;

    /* renamed from: G */
    private int f42102G;

    /* renamed from: a */
    private final bid f42103a;

    /* renamed from: b */
    private final bjr f42104b;

    /* renamed from: c */
    private final int f42105c;

    /* renamed from: d */
    private final SparseArray<bii> f42106d;

    /* renamed from: e */
    private final int f42107e;

    /* renamed from: f */
    private final boolean f42108f;

    /* renamed from: g */
    private final Uri f42109g;

    /* renamed from: h */
    private final bjp f42110h;

    /* renamed from: i */
    private volatile boolean f42111i;

    /* renamed from: j */
    private volatile bio f42112j;

    /* renamed from: k */
    private volatile bhv f42113k;

    /* renamed from: l */
    private boolean f42114l;

    /* renamed from: m */
    private int f42115m;

    /* renamed from: n */
    private bhp[] f42116n;

    /* renamed from: o */
    private long f42117o;

    /* renamed from: p */
    private boolean[] f42118p;

    /* renamed from: q */
    private boolean[] f42119q;

    /* renamed from: r */
    private boolean[] f42120r;

    /* renamed from: s */
    private int f42121s;

    /* renamed from: t */
    private long f42122t;

    /* renamed from: u */
    private long f42123u;

    /* renamed from: v */
    private long f42124v;

    /* renamed from: w */
    private boolean f42125w;

    /* renamed from: x */
    private long f42126x;

    /* renamed from: y */
    private bjw f42127y;

    /* renamed from: z */
    private bih f42128z;

    public big(Uri uri, bjp bjp, bid bid, int i, int i2) {
        this(uri, bjp, bid, 2, i2, -1);
    }

    private big(Uri uri, bjp bjp, bid bid, int i, int i2, int i3) {
        this.f42109g = uri;
        this.f42110h = bjp;
        this.f42103a = bid;
        this.f42121s = 2;
        this.f42105c = i2;
        this.f42107e = -1;
        this.f42106d = new SparseArray<>();
        this.f42104b = new bjr(262144);
        this.f42124v = -1;
        this.f42108f = true;
        bid.mo40746a(this);
    }

    /* renamed from: a */
    public final boolean mo40638a(long j) throws IOException {
        boolean z;
        if (this.f42114l) {
            return true;
        }
        if (this.f42127y == null) {
            this.f42127y = new bjw("Loader:ExtractorSampleSource");
        }
        m48912e();
        if (this.f42112j != null && this.f42111i) {
            int i = 0;
            while (true) {
                if (i >= this.f42106d.size()) {
                    z = true;
                    break;
                } else if (!((bii) this.f42106d.valueAt(i)).mo40741b()) {
                    z = false;
                    break;
                } else {
                    i++;
                }
            }
            if (z) {
                int size = this.f42106d.size();
                this.f42120r = new boolean[size];
                this.f42119q = new boolean[size];
                this.f42118p = new boolean[size];
                this.f42116n = new bhp[size];
                this.f42117o = -1;
                for (int i2 = 0; i2 < size; i2++) {
                    bhl bhl = ((bii) this.f42106d.valueAt(i2)).f42090b;
                    this.f42116n[i2] = new bhp(bhl.f42012a, bhl.f42013b);
                    if (bhl.f42013b != -1 && bhl.f42013b > this.f42117o) {
                        this.f42117o = bhl.f42013b;
                    }
                }
                this.f42114l = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final int mo40634a() {
        return this.f42106d.size();
    }

    /* renamed from: a */
    public final bhp mo40636a(int i) {
        bke.m49060b(this.f42114l);
        return this.f42116n[i];
    }

    /* renamed from: a */
    public final void mo40637a(int i, long j) {
        bke.m49060b(this.f42114l);
        bke.m49060b(!this.f42120r[i]);
        this.f42115m++;
        this.f42120r[i] = true;
        this.f42118p[i] = true;
        if (this.f42115m == 1) {
            mo40643c(j);
        }
    }

    /* renamed from: b */
    public final void mo40640b(int i) {
        bke.m49060b(this.f42114l);
        bke.m49060b(this.f42120r[i]);
        this.f42115m--;
        this.f42120r[i] = false;
        this.f42119q[i] = false;
        if (this.f42115m == 0) {
            if (this.f42127y.f42361a) {
                this.f42127y.mo40799a();
            } else {
                m48915h();
                this.f42104b.mo40797a(0);
            }
        }
    }

    /* renamed from: b */
    public final boolean mo40641b(long j) throws IOException {
        bke.m49060b(this.f42114l);
        bke.m49060b(this.f42115m > 0);
        this.f42122t = j;
        long j2 = this.f42122t;
        for (int i = 0; i < this.f42120r.length; i++) {
            if (!this.f42120r[i]) {
                ((bii) this.f42106d.valueAt(i)).mo40736a(j2);
            }
        }
        return this.f42100E || m48912e();
    }

    /* renamed from: a */
    public final int mo40635a(int i, long j, bhm bhm, bhn bhn, boolean z) throws IOException {
        this.f42122t = j;
        int i2 = 0;
        if (this.f42119q[i]) {
            this.f42119q[i] = false;
            return -5;
        } else if (z || m48916i()) {
            return -2;
        } else {
            bii bii = (bii) this.f42106d.valueAt(i);
            if (this.f42118p[i]) {
                bhm.f42025a = bii.f42090b;
                bhm.f42026b = this.f42113k;
                this.f42118p[i] = false;
                return -4;
            } else if (bii.mo40740a(bhn)) {
                boolean z2 = this.f42108f && bhn.f42031e < this.f42123u;
                int i3 = bhn.f42030d;
                if (z2) {
                    i2 = 134217728;
                }
                bhn.f42030d = i3 | i2;
                bhn.f42031e += this.f42126x;
                return -3;
            } else if (this.f42100E) {
                return -1;
            } else {
                return -2;
            }
        }
    }

    /* renamed from: c */
    public final void mo40643c(long j) {
        bke.m49060b(this.f42114l);
        bke.m49060b(this.f42115m > 0);
        bio bio = this.f42112j;
        this.f42123u = j;
        if ((m48916i() ? this.f42124v : this.f42122t) != j) {
            this.f42122t = j;
            boolean z = !m48916i();
            int i = 0;
            while (z && i < this.f42106d.size()) {
                z &= ((bii) this.f42106d.valueAt(i)).mo40742b(j);
                i++;
            }
            if (!z) {
                m48911d(j);
            }
            for (int i2 = 0; i2 < this.f42119q.length; i2++) {
                this.f42119q[i2] = true;
            }
        }
    }

    /* renamed from: b */
    public final long mo40639b() {
        if (this.f42100E) {
            return -3;
        }
        if (m48916i()) {
            return this.f42124v;
        }
        long j = Long.MIN_VALUE;
        for (int i = 0; i < this.f42106d.size(); i++) {
            j = Math.max(j, ((bii) this.f42106d.valueAt(i)).f42089a);
        }
        return j == Long.MIN_VALUE ? this.f42122t : j;
    }

    /* renamed from: c */
    public final void mo40642c() {
        bke.m49060b(this.f42121s > 0);
        int i = this.f42121s - 1;
        this.f42121s = i;
        if (i == 0 && this.f42127y != null) {
            this.f42127y.mo40801b();
            this.f42127y = null;
        }
    }

    /* renamed from: a */
    public final void mo40751a(bka bka) {
        this.f42100E = true;
    }

    /* renamed from: b */
    public final void mo40753b(bka bka) {
        if (this.f42115m > 0) {
            m48911d(this.f42124v);
            return;
        }
        m48915h();
        this.f42104b.mo40797a(0);
    }

    /* renamed from: a */
    public final void mo40752a(bka bka, IOException iOException) {
        this.f42096A = iOException;
        int i = 1;
        if (this.f42101F <= this.f42102G) {
            i = 1 + this.f42098C;
        }
        this.f42098C = i;
        this.f42099D = SystemClock.elapsedRealtime();
        m48913f();
    }

    /* renamed from: c */
    public final bip mo40749c(int i) {
        bii bii = (bii) this.f42106d.get(i);
        if (bii != null) {
            return bii;
        }
        bii bii2 = new bii(this, this.f42104b);
        this.f42106d.put(i, bii2);
        return bii2;
    }

    /* renamed from: d */
    public final void mo40750d() {
        this.f42111i = true;
    }

    /* renamed from: a */
    public final void mo40748a(bio bio) {
        this.f42112j = bio;
    }

    /* renamed from: a */
    public final void mo40747a(bhv bhv) {
        this.f42113k = bhv;
    }

    /* renamed from: e */
    private final boolean m48912e() throws IOException {
        boolean z;
        m48913f();
        boolean z2 = false;
        if (m48916i()) {
            return false;
        }
        if (this.f42114l) {
            int i = 0;
            while (true) {
                if (i < this.f42120r.length) {
                    if (this.f42120r[i] && !((bii) this.f42106d.valueAt(i)).mo40743c()) {
                        z = true;
                        break;
                    }
                    i++;
                } else {
                    z = false;
                    break;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        return z2;
    }

    /* renamed from: d */
    private final void m48911d(long j) {
        this.f42124v = j;
        this.f42100E = false;
        if (this.f42127y.f42361a) {
            this.f42127y.mo40799a();
            return;
        }
        m48915h();
        m48913f();
    }

    /* renamed from: f */
    private final void m48913f() {
        if (!this.f42100E && !this.f42127y.f42361a) {
            boolean z = true;
            if (this.f42096A != null) {
                if (this.f42128z == null) {
                    z = false;
                }
                bke.m49060b(z);
                if (SystemClock.elapsedRealtime() - this.f42099D >= Math.min((((long) this.f42098C) - 1) * 1000, DouPlusShareGuideExperiment.MIN_VALID_DURATION)) {
                    this.f42096A = null;
                    if (!this.f42114l) {
                        for (int i = 0; i < this.f42106d.size(); i++) {
                            ((bii) this.f42106d.valueAt(i)).mo40735a();
                        }
                        this.f42128z = m48914g();
                    } else {
                        bio bio = this.f42112j;
                    }
                    this.f42102G = this.f42101F;
                    this.f42127y.mo40800a((bka) this.f42128z, (bjx) this);
                }
                return;
            }
            this.f42126x = 0;
            this.f42125w = false;
            if (!this.f42114l) {
                this.f42128z = m48914g();
            } else {
                bke.m49060b(m48916i());
                if (this.f42117o == -1 || this.f42124v < this.f42117o) {
                    bih bih = new bih(this.f42109g, this.f42110h, this.f42103a, this.f42104b, this.f42105c, this.f42112j.mo40728a(this.f42124v));
                    this.f42128z = bih;
                    this.f42124v = -1;
                } else {
                    this.f42100E = true;
                    this.f42124v = -1;
                    return;
                }
            }
            this.f42102G = this.f42101F;
            this.f42127y.mo40800a((bka) this.f42128z, (bjx) this);
        }
    }

    /* renamed from: g */
    private final bih m48914g() {
        bih bih = new bih(this.f42109g, this.f42110h, this.f42103a, this.f42104b, this.f42105c, 0);
        return bih;
    }

    /* renamed from: h */
    private final void m48915h() {
        for (int i = 0; i < this.f42106d.size(); i++) {
            ((bii) this.f42106d.valueAt(i)).mo40735a();
        }
        this.f42128z = null;
        this.f42096A = null;
        this.f42098C = 0;
        this.f42097B = false;
    }

    /* renamed from: i */
    private final boolean m48916i() {
        return this.f42124v != -1;
    }
}
