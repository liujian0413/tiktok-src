package p1886me.drakeet.multitype;

/* renamed from: me.drakeet.multitype.f */
final class C48229f<T> implements C48230g<T>, C48231h<T> {

    /* renamed from: a */
    private final MultiTypeAdapter f123135a;

    /* renamed from: b */
    private final Class<? extends T> f123136b;

    /* renamed from: c */
    private C48226c<T, ?>[] f123137c;

    @SafeVarargs
    /* renamed from: a */
    public final C48230g<T> mo120465a(C48226c<T, ?>... cVarArr) {
        this.f123137c = cVarArr;
        return this;
    }

    /* renamed from: a */
    public final void mo120466a(C48227d<T> dVar) {
        m149631b(dVar);
    }

    /* renamed from: b */
    private void m149631b(C48227d<T> dVar) {
        for (C48226c<T, ?> a : this.f123137c) {
            this.f123135a.mo120458a(this.f123136b, a, dVar);
        }
    }

    C48229f(MultiTypeAdapter multiTypeAdapter, Class<? extends T> cls) {
        this.f123136b = cls;
        this.f123135a = multiTypeAdapter;
    }
}
