package android.support.p029v7.widget;

import android.view.View;

/* renamed from: android.support.v7.widget.ba */
final class C1379ba {

    /* renamed from: a */
    final C1381b f5395a;

    /* renamed from: b */
    C1380a f5396b = new C1380a();

    /* renamed from: android.support.v7.widget.ba$a */
    static class C1380a {

        /* renamed from: a */
        int f5397a;

        /* renamed from: b */
        int f5398b;

        /* renamed from: c */
        int f5399c;

        /* renamed from: d */
        int f5400d;

        /* renamed from: e */
        int f5401e;

        C1380a() {
        }

        /* renamed from: a */
        private static int m6804a(int i, int i2) {
            if (i > i2) {
                return 1;
            }
            return i == i2 ? 2 : 4;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6438a() {
            this.f5397a = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final boolean mo6441b() {
            if ((this.f5397a & 7) != 0 && (this.f5397a & (m6804a(this.f5400d, this.f5398b) << 0)) == 0) {
                return false;
            }
            if ((this.f5397a & 112) != 0 && (this.f5397a & (m6804a(this.f5400d, this.f5399c) << 4)) == 0) {
                return false;
            }
            if ((this.f5397a & 1792) != 0 && (this.f5397a & (m6804a(this.f5401e, this.f5398b) << 8)) == 0) {
                return false;
            }
            if ((this.f5397a & 28672) == 0 || (this.f5397a & (m6804a(this.f5401e, this.f5399c) << 12)) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6439a(int i) {
            this.f5397a = i | this.f5397a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6440a(int i, int i2, int i3, int i4) {
            this.f5398b = i;
            this.f5399c = i2;
            this.f5400d = i3;
            this.f5401e = i4;
        }
    }

    /* renamed from: android.support.v7.widget.ba$b */
    interface C1381b {
        /* renamed from: a */
        int mo5808a();

        /* renamed from: a */
        int mo5809a(View view);

        /* renamed from: a */
        View mo5810a(int i);

        /* renamed from: b */
        int mo5811b();

        /* renamed from: b */
        int mo5812b(View view);
    }

    C1379ba(C1381b bVar) {
        this.f5395a = bVar;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo6437a(View view, int i) {
        this.f5396b.mo6440a(this.f5395a.mo5808a(), this.f5395a.mo5811b(), this.f5395a.mo5809a(view), this.f5395a.mo5812b(view));
        this.f5396b.mo6438a();
        this.f5396b.mo6439a(24579);
        return this.f5396b.mo6441b();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final View mo6436a(int i, int i2, int i3, int i4) {
        int i5;
        int a = this.f5395a.mo5808a();
        int b = this.f5395a.mo5811b();
        if (i2 > i) {
            i5 = 1;
        } else {
            i5 = -1;
        }
        View view = null;
        while (i != i2) {
            View a2 = this.f5395a.mo5810a(i);
            this.f5396b.mo6440a(a, b, this.f5395a.mo5809a(a2), this.f5395a.mo5812b(a2));
            if (i3 != 0) {
                this.f5396b.mo6438a();
                this.f5396b.mo6439a(i3);
                if (this.f5396b.mo6441b()) {
                    return a2;
                }
            }
            if (i4 != 0) {
                this.f5396b.mo6438a();
                this.f5396b.mo6439a(i4);
                if (this.f5396b.mo6441b()) {
                    view = a2;
                }
            }
            i += i5;
        }
        return view;
    }
}
