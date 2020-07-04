package android.support.p029v7.util;

/* renamed from: android.support.v7.util.BatchingListUpdateCallback */
public class BatchingListUpdateCallback implements C1151b {

    /* renamed from: a */
    final C1151b f4110a;

    /* renamed from: b */
    int f4111b;

    /* renamed from: c */
    int f4112c = -1;

    /* renamed from: d */
    int f4113d = -1;

    /* renamed from: e */
    Object f4114e;

    /* renamed from: a */
    public final void mo4543a() {
        if (this.f4111b != 0) {
            switch (this.f4111b) {
                case 1:
                    this.f4110a.mo253a(this.f4112c, this.f4113d);
                    break;
                case 2:
                    this.f4110a.mo255b(this.f4112c, this.f4113d);
                    break;
                case 3:
                    this.f4110a.mo254a(this.f4112c, this.f4113d, this.f4114e);
                    break;
            }
            this.f4114e = null;
            this.f4111b = 0;
        }
    }

    public BatchingListUpdateCallback(C1151b bVar) {
        this.f4110a = bVar;
    }

    /* renamed from: c */
    public final void mo256c(int i, int i2) {
        mo4543a();
        this.f4110a.mo256c(i, i2);
    }

    /* renamed from: b */
    public final void mo255b(int i, int i2) {
        if (this.f4111b != 2 || this.f4112c < i || this.f4112c > i + i2) {
            mo4543a();
            this.f4112c = i;
            this.f4113d = i2;
            this.f4111b = 2;
            return;
        }
        this.f4113d += i2;
        this.f4112c = i;
    }

    /* renamed from: a */
    public final void mo253a(int i, int i2) {
        if (this.f4111b != 1 || i < this.f4112c || i > this.f4112c + this.f4113d) {
            mo4543a();
            this.f4112c = i;
            this.f4113d = i2;
            this.f4111b = 1;
            return;
        }
        this.f4113d += i2;
        this.f4112c = Math.min(i, this.f4112c);
    }

    /* renamed from: a */
    public final void mo254a(int i, int i2, Object obj) {
        if (this.f4111b == 3 && i <= this.f4112c + this.f4113d) {
            int i3 = i + i2;
            if (i3 >= this.f4112c && this.f4114e == obj) {
                int i4 = this.f4112c + this.f4113d;
                this.f4112c = Math.min(i, this.f4112c);
                this.f4113d = Math.max(i4, i3) - this.f4112c;
                return;
            }
        }
        mo4543a();
        this.f4112c = i;
        this.f4113d = i2;
        this.f4114e = obj;
        this.f4111b = 3;
    }
}
