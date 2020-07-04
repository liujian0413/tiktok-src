package kotlin.collections;

/* renamed from: kotlin.collections.h */
class C7520h {
    /* renamed from: a */
    public static final void m23417a(int i, int i2) {
        if (i > i2) {
            StringBuilder sb = new StringBuilder("toIndex (");
            sb.append(i);
            sb.append(") is greater than size (");
            sb.append(i2);
            sb.append(").");
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }
}
