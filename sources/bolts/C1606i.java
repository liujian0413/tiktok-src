package bolts;

/* renamed from: bolts.i */
public final class C1606i<TResult> {

    /* renamed from: a */
    public final C1592h<TResult> f6010a = new C1592h<>();

    /* renamed from: a */
    public final boolean mo6898a() {
        return this.f6010a.mo6893i();
    }

    /* renamed from: b */
    public final void mo6901b() {
        if (!mo6898a()) {
            throw new IllegalStateException("Cannot cancel a completed task.");
        }
    }

    /* renamed from: a */
    public final boolean mo6899a(Exception exc) {
        return this.f6010a.mo6883b(exc);
    }

    /* renamed from: a */
    public final boolean mo6900a(TResult tresult) {
        return this.f6010a.mo6884b(tresult);
    }

    /* renamed from: b */
    public final void mo6902b(Exception exc) {
        if (!mo6899a(exc)) {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    /* renamed from: b */
    public final void mo6903b(TResult tresult) {
        if (!mo6900a(tresult)) {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }
}
