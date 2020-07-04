package bolts;

/* renamed from: bolts.j */
final class C1607j {

    /* renamed from: a */
    private C1592h<?> f6011a;

    /* renamed from: a */
    public final void mo6904a() {
        this.f6011a = null;
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            C1592h<?> hVar = this.f6011a;
            if (!(hVar == null || C1592h.m7847a() == null)) {
                new UnobservedTaskException(hVar.mo6891f());
            }
        } finally {
            super.finalize();
        }
    }

    public C1607j(C1592h<?> hVar) {
        this.f6011a = hVar;
    }
}
