package dagger.android;

/* renamed from: dagger.android.b */
public interface C7313b<T> {

    /* renamed from: dagger.android.b$a */
    public static abstract class C7314a<T> implements C7315b<T> {
        /* renamed from: a */
        public abstract C7313b<T> mo19117a();

        /* renamed from: b */
        public abstract void mo19119b(T t);

        /* renamed from: a */
        public final C7313b<T> mo19118a(T t) {
            mo19119b(t);
            return mo19117a();
        }
    }

    /* renamed from: dagger.android.b$b */
    public interface C7315b<T> {
        /* renamed from: a */
        C7313b<T> mo19118a(T t);
    }

    /* renamed from: a */
    void mo19116a(T t);
}
