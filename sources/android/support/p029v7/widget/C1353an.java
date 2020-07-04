package android.support.p029v7.widget;

/* renamed from: android.support.v7.widget.an */
final class C1353an {

    /* renamed from: a */
    public int f5282a;

    /* renamed from: b */
    public int f5283b;

    /* renamed from: c */
    private int f5284c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f5285d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f5286e;

    /* renamed from: f */
    private int f5287f;

    /* renamed from: g */
    private boolean f5288g;

    /* renamed from: h */
    private boolean f5289h;

    C1353an() {
    }

    /* renamed from: a */
    public final int mo6354a() {
        if (this.f5288g) {
            return this.f5283b;
        }
        return this.f5282a;
    }

    /* renamed from: b */
    public final int mo6357b() {
        if (this.f5288g) {
            return this.f5282a;
        }
        return this.f5283b;
    }

    /* renamed from: a */
    public final void mo6356a(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        if (z != this.f5288g) {
            this.f5288g = z;
            if (!this.f5289h) {
                this.f5282a = this.f5286e;
                this.f5283b = this.f5287f;
            } else if (z) {
                if (this.f5285d != Integer.MIN_VALUE) {
                    i3 = this.f5285d;
                } else {
                    i3 = this.f5286e;
                }
                this.f5282a = i3;
                if (this.f5284c != Integer.MIN_VALUE) {
                    i4 = this.f5284c;
                } else {
                    i4 = this.f5287f;
                }
                this.f5283b = i4;
            } else {
                if (this.f5284c != Integer.MIN_VALUE) {
                    i = this.f5284c;
                } else {
                    i = this.f5286e;
                }
                this.f5282a = i;
                if (this.f5285d != Integer.MIN_VALUE) {
                    i2 = this.f5285d;
                } else {
                    i2 = this.f5287f;
                }
                this.f5283b = i2;
            }
        }
    }

    /* renamed from: a */
    public final void mo6355a(int i, int i2) {
        this.f5284c = i;
        this.f5285d = i2;
        this.f5289h = true;
        if (this.f5288g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f5282a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f5283b = i;
            }
        } else {
            if (i != Integer.MIN_VALUE) {
                this.f5282a = i;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f5283b = i2;
            }
        }
    }

    /* renamed from: b */
    public final void mo6358b(int i, int i2) {
        this.f5289h = false;
        if (i != Integer.MIN_VALUE) {
            this.f5286e = i;
            this.f5282a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f5287f = i2;
            this.f5283b = i2;
        }
    }
}
