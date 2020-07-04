package shark;

/* renamed from: shark.f */
public final /* synthetic */ class C48744f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f123883a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f123884b;

    static {
        int[] iArr = new int[LeakNodeStatus.values().length];
        f123883a = iArr;
        iArr[LeakNodeStatus.UNKNOWN.ordinal()] = 1;
        f123883a[LeakNodeStatus.NOT_LEAKING.ordinal()] = 2;
        f123883a[LeakNodeStatus.LEAKING.ordinal()] = 3;
        int[] iArr2 = new int[LeakNodeStatus.values().length];
        f123884b = iArr2;
        iArr2[LeakNodeStatus.UNKNOWN.ordinal()] = 1;
        f123884b[LeakNodeStatus.LEAKING.ordinal()] = 2;
        f123884b[LeakNodeStatus.NOT_LEAKING.ordinal()] = 3;
    }
}
