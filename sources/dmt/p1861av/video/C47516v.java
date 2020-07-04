package dmt.p1861av.video;

/* renamed from: dmt.av.video.v */
public final class C47516v {

    /* renamed from: a */
    public final int f121979a;

    /* renamed from: b */
    public final long f121980b;

    /* renamed from: a */
    public static C47516v m148295a() {
        return new C47516v(0);
    }

    /* renamed from: b */
    public static C47516v m148297b() {
        return new C47516v(1);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VEPreviewControlOp{mType=");
        sb.append(this.f121979a);
        sb.append(", mSeekTo=");
        sb.append(this.f121980b);
        sb.append('}');
        return sb.toString();
    }

    private C47516v(int i) {
        this(i, 0);
    }

    /* renamed from: a */
    public static C47516v m148296a(long j) {
        return new C47516v(2, j);
    }

    /* renamed from: b */
    public static C47516v m148298b(long j) {
        return new C47516v(3, j);
    }

    private C47516v(int i, long j) {
        this.f121979a = i;
        this.f121980b = j;
    }
}
