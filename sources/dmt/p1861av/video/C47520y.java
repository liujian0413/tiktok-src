package dmt.p1861av.video;

/* renamed from: dmt.av.video.y */
public final class C47520y implements Cloneable {

    /* renamed from: a */
    public final String f121995a;

    /* renamed from: b */
    public final long f121996b;

    /* renamed from: c */
    public int f121997c;

    public final int hashCode() {
        return super.hashCode();
    }

    /* renamed from: a */
    public static C47520y m148314a() {
        return new C47520y("0", 0);
    }

    /* renamed from: b */
    public static C47520y m148316b() {
        return new C47520y("1", 0);
    }

    /* renamed from: c */
    public final C47520y clone() {
        try {
            return (C47520y) super.clone();
        } catch (CloneNotSupportedException unused) {
            throw new AssertionError();
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VETimeEffectOp{mType='");
        sb.append(this.f121995a);
        sb.append('\'');
        sb.append(", mTimePoint=");
        sb.append(this.f121996b);
        sb.append(", mIndex=");
        sb.append(this.f121997c);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public static C47520y m148315a(long j) {
        return new C47520y("2", j);
    }

    /* renamed from: b */
    public static C47520y m148317b(long j) {
        return new C47520y("3", j);
    }

    /* renamed from: c */
    public final C47520y mo119646c(long j) {
        return new C47520y(this.f121995a, j);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C47520y)) {
            return false;
        }
        C47520y yVar = (C47520y) obj;
        if (this.f121995a == yVar.f121995a && this.f121996b == yVar.f121996b && this.f121997c == yVar.f121997c) {
            return true;
        }
        return false;
    }

    private C47520y(String str, long j) {
        this.f121995a = str;
        this.f121996b = j;
    }
}
