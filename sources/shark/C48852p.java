package shark;

import shark.LeakTraceElement.Type;

/* renamed from: shark.p */
public final /* synthetic */ class C48852p {

    /* renamed from: a */
    public static final /* synthetic */ int[] f124203a;

    /* renamed from: b */
    public static final /* synthetic */ int[] f124204b;

    static {
        int[] iArr = new int[Type.values().length];
        f124203a = iArr;
        iArr[Type.ARRAY_ENTRY.ordinal()] = 1;
        f124203a[Type.STATIC_FIELD.ordinal()] = 2;
        f124203a[Type.INSTANCE_FIELD.ordinal()] = 3;
        f124203a[Type.LOCAL.ordinal()] = 4;
        int[] iArr2 = new int[Type.values().length];
        f124204b = iArr2;
        iArr2[Type.ARRAY_ENTRY.ordinal()] = 1;
        f124204b[Type.STATIC_FIELD.ordinal()] = 2;
        f124204b[Type.INSTANCE_FIELD.ordinal()] = 3;
        f124204b[Type.LOCAL.ordinal()] = 4;
    }
}
