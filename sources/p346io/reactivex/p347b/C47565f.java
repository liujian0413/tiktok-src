package p346io.reactivex.p347b;

/* renamed from: io.reactivex.b.f */
final class C47565f extends C47564e<Runnable> {
    private static final long serialVersionUID = -8219729196779211169L;

    public final String toString() {
        StringBuilder sb = new StringBuilder("RunnableDisposable(disposed=");
        sb.append(isDisposed());
        sb.append(", ");
        sb.append(get());
        sb.append(")");
        return sb.toString();
    }

    C47565f(Runnable runnable) {
        super(runnable);
    }

    /* renamed from: a */
    private static void m148353a(Runnable runnable) {
        runnable.run();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo119659a(Object obj) {
        m148353a((Runnable) obj);
    }
}
