package android.arch.p005a.p006a;

/* renamed from: android.arch.a.a.d */
public abstract class C0007d {
    /* renamed from: a */
    public abstract void mo15a(Runnable runnable);

    /* renamed from: b */
    public abstract void mo16b(Runnable runnable);

    /* renamed from: d */
    public abstract boolean mo17d();

    /* renamed from: c */
    public final void mo20c(Runnable runnable) {
        if (mo17d()) {
            runnable.run();
        } else {
            mo16b(runnable);
        }
    }
}
