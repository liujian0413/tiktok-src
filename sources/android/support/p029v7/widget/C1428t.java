package android.support.p029v7.widget;

import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.t */
final class C1428t {

    /* renamed from: a */
    final C1430b f5551a;

    /* renamed from: b */
    final C1429a f5552b = new C1429a();

    /* renamed from: c */
    final List<View> f5553c = new ArrayList();

    /* renamed from: android.support.v7.widget.t$a */
    static class C1429a {

        /* renamed from: a */
        long f5554a;

        /* renamed from: b */
        C1429a f5555b;

        C1429a() {
        }

        /* renamed from: b */
        private void m7144b() {
            if (this.f5555b == null) {
                this.f5555b = new C1429a();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6612a() {
            C1429a aVar = this;
            while (true) {
                aVar.f5554a = 0;
                if (aVar.f5555b != null) {
                    aVar = aVar.f5555b;
                } else {
                    return;
                }
            }
        }

        public final String toString() {
            if (this.f5555b == null) {
                return Long.toBinaryString(this.f5554a);
            }
            StringBuilder sb = new StringBuilder();
            sb.append(this.f5555b.toString());
            sb.append("xx");
            sb.append(Long.toBinaryString(this.f5554a));
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6613a(int i) {
            if (i >= 64) {
                m7144b();
                this.f5555b.mo6613a(i - 64);
                return;
            }
            this.f5554a |= 1 << i;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo6615b(int i) {
            if (i < 64) {
                this.f5554a &= (1 << i) ^ -1;
            } else if (this.f5555b != null) {
                this.f5555b.mo6615b(i - 64);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final boolean mo6616c(int i) {
            C1429a aVar = this;
            while (i >= 64) {
                aVar.m7144b();
                aVar = aVar.f5555b;
                i -= 64;
            }
            if ((aVar.f5554a & (1 << i)) != 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: e */
        public final int mo6618e(int i) {
            if (this.f5555b == null) {
                if (i >= 64) {
                    return Long.bitCount(this.f5554a);
                }
                return Long.bitCount(this.f5554a & ((1 << i) - 1));
            } else if (i < 64) {
                return Long.bitCount(this.f5554a & ((1 << i) - 1));
            } else {
                return this.f5555b.mo6618e(i - 64) + Long.bitCount(this.f5554a);
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: d */
        public final boolean mo6617d(int i) {
            boolean z;
            C1429a aVar = this;
            while (i >= 64) {
                aVar.m7144b();
                aVar = aVar.f5555b;
                i -= 64;
            }
            long j = 1 << i;
            if ((aVar.f5554a & j) != 0) {
                z = true;
            } else {
                z = false;
            }
            aVar.f5554a &= j ^ -1;
            long j2 = j - 1;
            aVar.f5554a = (aVar.f5554a & j2) | Long.rotateRight((j2 ^ -1) & aVar.f5554a, 1);
            if (aVar.f5555b != null) {
                if (aVar.f5555b.mo6616c(0)) {
                    aVar.mo6613a(63);
                }
                aVar.f5555b.mo6617d(0);
            }
            return z;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6614a(int i, boolean z) {
            boolean z2;
            boolean z3 = z;
            C1429a aVar = this;
            while (i < 64) {
                if ((aVar.f5554a & Long.MIN_VALUE) != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                long j = (1 << i) - 1;
                aVar.f5554a = (aVar.f5554a & j) | (((j ^ -1) & aVar.f5554a) << 1);
                if (z3) {
                    aVar.mo6613a(i);
                } else {
                    aVar.mo6615b(i);
                }
                if (z2 || aVar.f5555b != null) {
                    aVar.m7144b();
                    aVar = aVar.f5555b;
                    z3 = z2;
                    i = 0;
                } else {
                    return;
                }
            }
            aVar.m7144b();
            aVar.f5555b.mo6614a(i - 64, z3);
        }
    }

    /* renamed from: android.support.v7.widget.t$b */
    interface C1430b {
        /* renamed from: a */
        int mo5662a();

        /* renamed from: a */
        int mo5663a(View view);

        /* renamed from: a */
        void mo5664a(int i);

        /* renamed from: a */
        void mo5665a(View view, int i);

        /* renamed from: a */
        void mo5666a(View view, int i, LayoutParams layoutParams);

        /* renamed from: b */
        C1293v mo5667b(View view);

        /* renamed from: b */
        View mo5668b(int i);

        /* renamed from: b */
        void mo5669b();

        /* renamed from: c */
        void mo5670c(int i);

        /* renamed from: c */
        void mo5671c(View view);

        /* renamed from: d */
        void mo5672d(View view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo6603c() {
        return this.f5551a.mo5662a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo6600b() {
        return this.f5551a.mo5662a() - this.f5553c.size();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6594a() {
        this.f5552b.mo6612a();
        for (int size = this.f5553c.size() - 1; size >= 0; size--) {
            this.f5551a.mo5672d((View) this.f5553c.get(size));
            this.f5553c.remove(size);
        }
        this.f5551a.mo5669b();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f5552b.toString());
        sb.append(", hidden list:");
        sb.append(this.f5553c.size());
        return sb.toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final View mo6606d(int i) {
        return this.f5551a.mo5668b(i);
    }

    /* renamed from: g */
    private void m7125g(View view) {
        this.f5553c.add(view);
        this.f5551a.mo5671c(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final boolean mo6605c(View view) {
        return this.f5553c.contains(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo6608e(int i) {
        int f = m7124f(i);
        this.f5552b.mo6617d(f);
        this.f5551a.mo5670c(f);
    }

    C1428t(C1430b bVar) {
        this.f5551a = bVar;
    }

    /* renamed from: h */
    private boolean m7126h(View view) {
        if (!this.f5553c.remove(view)) {
            return false;
        }
        this.f5551a.mo5672d(view);
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6595a(int i) {
        int f = m7124f(i);
        View b = this.f5551a.mo5668b(f);
        if (b != null) {
            if (this.f5552b.mo6617d(f)) {
                m7126h(b);
            }
            this.f5551a.mo5664a(f);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo6601b(View view) {
        int a = this.f5551a.mo5663a(view);
        if (a != -1 && !this.f5552b.mo6616c(a)) {
            return a - this.f5552b.mo6618e(a);
        }
        return -1;
    }

    /* renamed from: f */
    private int m7124f(int i) {
        if (i < 0) {
            return -1;
        }
        int a = this.f5551a.mo5662a();
        int i2 = i;
        while (i2 < a) {
            int e = i - (i2 - this.f5552b.mo6618e(i2));
            if (e == 0) {
                while (this.f5552b.mo6616c(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += e;
        }
        return -1;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final View mo6602b(int i) {
        return this.f5551a.mo5668b(m7124f(i));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final View mo6604c(int i) {
        int size = this.f5553c.size();
        for (int i2 = 0; i2 < size; i2++) {
            View view = (View) this.f5553c.get(i2);
            C1293v b = this.f5551a.mo5667b(view);
            if (b.getLayoutPosition() == i && !b.isInvalid() && !b.isRemoved()) {
                return view;
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final void mo6607d(View view) {
        int a = this.f5551a.mo5663a(view);
        if (a >= 0) {
            this.f5552b.mo6613a(a);
            m7125g(view);
            return;
        }
        StringBuilder sb = new StringBuilder("view is not a child, cannot hide ");
        sb.append(view);
        throw new IllegalArgumentException(sb.toString());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6596a(View view) {
        int a = this.f5551a.mo5663a(view);
        if (a >= 0) {
            if (this.f5552b.mo6617d(a)) {
                m7126h(view);
            }
            this.f5551a.mo5664a(a);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo6609e(View view) {
        int a = this.f5551a.mo5663a(view);
        if (a < 0) {
            StringBuilder sb = new StringBuilder("view is not a child, cannot hide ");
            sb.append(view);
            throw new IllegalArgumentException(sb.toString());
        } else if (this.f5552b.mo6616c(a)) {
            this.f5552b.mo6615b(a);
            m7126h(view);
        } else {
            StringBuilder sb2 = new StringBuilder("trying to unhide a view that was not hidden");
            sb2.append(view);
            throw new RuntimeException(sb2.toString());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo6610f(View view) {
        int a = this.f5551a.mo5663a(view);
        if (a == -1) {
            m7126h(view);
            return true;
        } else if (!this.f5552b.mo6616c(a)) {
            return false;
        } else {
            this.f5552b.mo6617d(a);
            m7126h(view);
            this.f5551a.mo5664a(a);
            return true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6599a(View view, boolean z) {
        mo6598a(view, -1, true);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6598a(View view, int i, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f5551a.mo5662a();
        } else {
            i2 = m7124f(i);
        }
        this.f5552b.mo6614a(i2, z);
        if (z) {
            m7125g(view);
        }
        this.f5551a.mo5665a(view, i2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6597a(View view, int i, LayoutParams layoutParams, boolean z) {
        int i2;
        if (i < 0) {
            i2 = this.f5551a.mo5662a();
        } else {
            i2 = m7124f(i);
        }
        this.f5552b.mo6614a(i2, z);
        if (z) {
            m7125g(view);
        }
        this.f5551a.mo5666a(view, i2, layoutParams);
    }
}
