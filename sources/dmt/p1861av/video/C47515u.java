package dmt.p1861av.video;

/* renamed from: dmt.av.video.u */
public final class C47515u {

    /* renamed from: a */
    public int f121977a;

    /* renamed from: b */
    public int f121978b;

    public final String toString() {
        StringBuilder sb = new StringBuilder("VEMusicStartChangeOp{mStartMillis=");
        sb.append(this.f121977a);
        sb.append(", mDuration=");
        sb.append(this.f121978b);
        sb.append('}');
        return sb.toString();
    }

    private C47515u(int i, int i2) {
        this.f121977a = i;
        this.f121978b = i2;
    }

    /* renamed from: a */
    public static C47515u m148294a(int i, int i2) {
        return new C47515u(i, i2);
    }
}
