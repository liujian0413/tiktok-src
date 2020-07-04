package androidx.work.impl.p036b;

import android.arch.p005a.p008c.C0017a;
import androidx.work.BackoffPolicy;
import androidx.work.C1454c;
import androidx.work.C1458e;
import androidx.work.WorkInfo;
import androidx.work.WorkInfo.State;
import java.util.List;

/* renamed from: androidx.work.impl.b.g */
public final class C1501g {

    /* renamed from: q */
    public static final C0017a<List<Object>, List<WorkInfo>> f5733q = new C0017a<List<Object>, List<WorkInfo>>() {
    };

    /* renamed from: a */
    public String f5734a;

    /* renamed from: b */
    public State f5735b = State.ENQUEUED;

    /* renamed from: c */
    public String f5736c;

    /* renamed from: d */
    public String f5737d;

    /* renamed from: e */
    public C1458e f5738e = C1458e.f5672a;

    /* renamed from: f */
    public C1458e f5739f = C1458e.f5672a;

    /* renamed from: g */
    public long f5740g;

    /* renamed from: h */
    public long f5741h;

    /* renamed from: i */
    public long f5742i;

    /* renamed from: j */
    public C1454c f5743j = C1454c.f5656a;

    /* renamed from: k */
    public int f5744k;

    /* renamed from: l */
    public BackoffPolicy f5745l = BackoffPolicy.EXPONENTIAL;

    /* renamed from: m */
    public long f5746m = 30000;

    /* renamed from: n */
    public long f5747n;

    /* renamed from: o */
    public long f5748o;

    /* renamed from: p */
    public long f5749p = -1;

    /* renamed from: a */
    public final boolean mo6753a() {
        if (this.f5741h != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo6754b() {
        if (this.f5735b != State.ENQUEUED || this.f5744k <= 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo6756d() {
        if (!C1454c.f5656a.equals(this.f5743j)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{WorkSpec: ");
        sb.append(this.f5734a);
        sb.append("}");
        return sb.toString();
    }

    /* renamed from: c */
    public final long mo6755c() {
        boolean z;
        long j;
        if (mo6754b()) {
            if (this.f5745l == BackoffPolicy.LINEAR) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                j = this.f5746m * ((long) this.f5744k);
            } else {
                j = (long) Math.scalb((float) this.f5746m, this.f5744k - 1);
            }
            return this.f5747n + Math.min(18000000, j);
        } else if (mo6753a()) {
            return (this.f5747n + this.f5741h) - this.f5742i;
        } else {
            return this.f5747n + this.f5740g;
        }
    }

    public final int hashCode() {
        int i;
        int hashCode = ((((this.f5734a.hashCode() * 31) + this.f5735b.hashCode()) * 31) + this.f5736c.hashCode()) * 31;
        if (this.f5737d != null) {
            i = this.f5737d.hashCode();
        } else {
            i = 0;
        }
        return ((((((((((((((((((((((((hashCode + i) * 31) + this.f5738e.hashCode()) * 31) + this.f5739f.hashCode()) * 31) + ((int) (this.f5740g ^ (this.f5740g >>> 32)))) * 31) + ((int) (this.f5741h ^ (this.f5741h >>> 32)))) * 31) + ((int) (this.f5742i ^ (this.f5742i >>> 32)))) * 31) + this.f5743j.hashCode()) * 31) + this.f5744k) * 31) + this.f5745l.hashCode()) * 31) + ((int) (this.f5746m ^ (this.f5746m >>> 32)))) * 31) + ((int) (this.f5747n ^ (this.f5747n >>> 32)))) * 31) + ((int) (this.f5748o ^ (this.f5748o >>> 32)))) * 31) + ((int) (this.f5749p ^ (this.f5749p >>> 32)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1501g gVar = (C1501g) obj;
        if (this.f5740g != gVar.f5740g || this.f5741h != gVar.f5741h || this.f5742i != gVar.f5742i || this.f5744k != gVar.f5744k || this.f5746m != gVar.f5746m || this.f5747n != gVar.f5747n || this.f5748o != gVar.f5748o || this.f5749p != gVar.f5749p || !this.f5734a.equals(gVar.f5734a) || this.f5735b != gVar.f5735b || !this.f5736c.equals(gVar.f5736c)) {
            return false;
        }
        if (this.f5737d == null ? gVar.f5737d != null : !this.f5737d.equals(gVar.f5737d)) {
            return false;
        }
        if (this.f5738e.equals(gVar.f5738e) && this.f5739f.equals(gVar.f5739f) && this.f5743j.equals(gVar.f5743j) && this.f5745l == gVar.f5745l) {
            return true;
        }
        return false;
    }

    public C1501g(String str, String str2) {
        this.f5734a = str;
        this.f5736c = str2;
    }
}
