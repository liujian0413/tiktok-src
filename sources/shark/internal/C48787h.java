package shark.internal;

import shark.LeakNodeStatus;

/* renamed from: shark.internal.h */
public final /* synthetic */ class C48787h {

    /* renamed from: a */
    public static final /* synthetic */ int[] f124017a;

    static {
        int[] iArr = new int[LeakNodeStatus.values().length];
        f124017a = iArr;
        iArr[LeakNodeStatus.UNKNOWN.ordinal()] = 1;
        f124017a[LeakNodeStatus.NOT_LEAKING.ordinal()] = 2;
        f124017a[LeakNodeStatus.LEAKING.ordinal()] = 3;
    }
}
