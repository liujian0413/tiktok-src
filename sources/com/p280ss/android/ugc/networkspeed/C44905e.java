package com.p280ss.android.ugc.networkspeed;

/* renamed from: com.ss.android.ugc.networkspeed.e */
public final class C44905e implements Comparable<C44905e> {

    /* renamed from: a */
    public static boolean f115482a = true;

    /* renamed from: b */
    public double f115483b;

    /* renamed from: c */
    public double f115484c;

    /* renamed from: d */
    public long f115485d;

    /* renamed from: e */
    public long f115486e;

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpeedRecord{mSpeed=");
        sb.append(this.f115483b);
        sb.append(", mWeight=");
        sb.append(this.f115484c);
        sb.append(", mCostTime=");
        sb.append(this.f115485d);
        sb.append(", currentTime=");
        sb.append(this.f115486e);
        sb.append('}');
        return sb.toString();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int compareTo(C44905e eVar) {
        if (this.f115483b == eVar.f115483b) {
            return 0;
        }
        if (this.f115483b < eVar.f115483b) {
            return -1;
        }
        return 1;
    }

    public C44905e(double d, double d2, long j, long j2) {
        this.f115483b = d;
        this.f115484c = d2;
        this.f115485d = j;
        this.f115486e = j2;
        if (!f115482a) {
            return;
        }
        if (this.f115483b < 0.0d || this.f115484c < 0.0d) {
            throw new IllegalArgumentException(toString());
        }
    }
}
