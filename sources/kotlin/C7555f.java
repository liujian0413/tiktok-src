package kotlin;

/* renamed from: kotlin.f */
public final /* synthetic */ class C7555f {

    /* renamed from: a */
    public static final /* synthetic */ int[] f20882a;

    static {
        int[] iArr = new int[LazyThreadSafetyMode.values().length];
        f20882a = iArr;
        iArr[LazyThreadSafetyMode.SYNCHRONIZED.ordinal()] = 1;
        f20882a[LazyThreadSafetyMode.PUBLICATION.ordinal()] = 2;
        f20882a[LazyThreadSafetyMode.NONE.ordinal()] = 3;
    }
}
