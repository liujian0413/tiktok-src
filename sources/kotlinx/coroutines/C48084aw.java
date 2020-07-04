package kotlinx.coroutines;

/* renamed from: kotlinx.coroutines.aw */
final class C48084aw implements C48095bd {

    /* renamed from: a */
    private final boolean f122942a;

    /* renamed from: b */
    public final boolean mo120293b() {
        return this.f122942a;
    }

    public final C48117bt cd_() {
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Empty{");
        if (mo120293b()) {
            str = "Active";
        } else {
            str = "New";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }

    public C48084aw(boolean z) {
        this.f122942a = z;
    }
}
