package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.af */
public final /* synthetic */ class C48058af {

    /* renamed from: a */
    public static final /* synthetic */ int[] f122904a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f122905b;

    static {
        int[] iArr = new int[CoroutineStart.values().length];
        f122904a = iArr;
        iArr[CoroutineStart.DEFAULT.ordinal()] = 1;
        f122904a[CoroutineStart.ATOMIC.ordinal()] = 2;
        f122904a[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
        f122904a[CoroutineStart.LAZY.ordinal()] = 4;
        int[] iArr2 = new int[CoroutineStart.values().length];
        f122905b = iArr2;
        iArr2[CoroutineStart.DEFAULT.ordinal()] = 1;
        f122905b[CoroutineStart.ATOMIC.ordinal()] = 2;
        f122905b[CoroutineStart.UNDISPATCHED.ordinal()] = 3;
        f122905b[CoroutineStart.LAZY.ordinal()] = 4;
    }
}
