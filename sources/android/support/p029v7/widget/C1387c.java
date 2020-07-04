package android.support.p029v7.widget;

import android.support.p022v4.util.Pools.C0887a;
import android.support.p022v4.util.Pools.SimplePool;
import android.support.p029v7.widget.RecyclerView.C1293v;
import java.util.ArrayList;
import java.util.List;

/* renamed from: android.support.v7.widget.c */
final class C1387c implements C1342a {

    /* renamed from: a */
    final ArrayList<C1389b> f5409a;

    /* renamed from: b */
    final ArrayList<C1389b> f5410b;

    /* renamed from: c */
    final C1388a f5411c;

    /* renamed from: d */
    Runnable f5412d;

    /* renamed from: e */
    final boolean f5413e;

    /* renamed from: f */
    final C1341ag f5414f;

    /* renamed from: g */
    private C0887a<C1389b> f5415g;

    /* renamed from: h */
    private int f5416h;

    /* renamed from: android.support.v7.widget.c$a */
    interface C1388a {
        /* renamed from: a */
        C1293v mo5673a(int i);

        /* renamed from: a */
        void mo5674a(int i, int i2);

        /* renamed from: a */
        void mo5675a(int i, int i2, Object obj);

        /* renamed from: a */
        void mo5676a(C1389b bVar);

        /* renamed from: b */
        void mo5677b(int i, int i2);

        /* renamed from: b */
        void mo5678b(C1389b bVar);

        /* renamed from: c */
        void mo5679c(int i, int i2);

        /* renamed from: d */
        void mo5680d(int i, int i2);
    }

    /* renamed from: android.support.v7.widget.c$b */
    static class C1389b {

        /* renamed from: a */
        int f5417a;

        /* renamed from: b */
        int f5418b;

        /* renamed from: c */
        Object f5419c;

        /* renamed from: d */
        int f5420d;

        public final int hashCode() {
            return (((this.f5417a * 31) + this.f5418b) * 31) + this.f5420d;
        }

        /* renamed from: a */
        private String m6876a() {
            int i = this.f5417a;
            if (i == 4) {
                return "up";
            }
            if (i == 8) {
                return "mv";
            }
            switch (i) {
                case 1:
                    return "add";
                case 2:
                    return "rm";
                default:
                    return "??";
            }
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(Integer.toHexString(System.identityHashCode(this)));
            sb.append("[");
            sb.append(m6876a());
            sb.append(",s:");
            sb.append(this.f5418b);
            sb.append("c:");
            sb.append(this.f5420d);
            sb.append(",p:");
            sb.append(this.f5419c);
            sb.append("]");
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            C1389b bVar = (C1389b) obj;
            if (this.f5417a != bVar.f5417a) {
                return false;
            }
            if (this.f5417a == 8 && Math.abs(this.f5420d - this.f5418b) == 1 && this.f5420d == bVar.f5418b && this.f5418b == bVar.f5420d) {
                return true;
            }
            if (this.f5420d != bVar.f5420d || this.f5418b != bVar.f5418b) {
                return false;
            }
            if (this.f5419c != null) {
                if (!this.f5419c.equals(bVar.f5419c)) {
                    return false;
                }
            } else if (bVar.f5419c != null) {
                return false;
            }
            return true;
        }

        C1389b(int i, int i2, int i3, Object obj) {
            this.f5417a = i;
            this.f5418b = i2;
            this.f5420d = i3;
            this.f5419c = obj;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo6462a(int i, int i2, Object obj) {
        if (i2 <= 0) {
            return false;
        }
        this.f5409a.add(mo6261a(4, i, i2, obj));
        this.f5416h |= 4;
        if (this.f5409a.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6458a() {
        m6843a((List<C1389b>) this.f5409a);
        m6843a((List<C1389b>) this.f5410b);
        this.f5416h = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final boolean mo6468d() {
        if (this.f5409a.size() > 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final boolean mo6470f() {
        if (this.f5410b.isEmpty() || this.f5409a.isEmpty()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final void mo6467c() {
        int size = this.f5410b.size();
        for (int i = 0; i < size; i++) {
            this.f5411c.mo5678b((C1389b) this.f5410b.get(i));
        }
        m6843a((List<C1389b>) this.f5410b);
        this.f5416h = 0;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo6464b() {
        this.f5414f.mo6260a(this.f5409a);
        int size = this.f5409a.size();
        for (int i = 0; i < size; i++) {
            C1389b bVar = (C1389b) this.f5409a.get(i);
            int i2 = bVar.f5417a;
            if (i2 == 4) {
                m6848d(bVar);
            } else if (i2 != 8) {
                switch (i2) {
                    case 1:
                        m6851f(bVar);
                        break;
                    case 2:
                        m6846c(bVar);
                        break;
                }
            } else {
                m6844b(bVar);
            }
            if (this.f5412d != null) {
                this.f5412d.run();
            }
        }
        this.f5409a.clear();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final void mo6469e() {
        mo6467c();
        int size = this.f5409a.size();
        for (int i = 0; i < size; i++) {
            C1389b bVar = (C1389b) this.f5409a.get(i);
            int i2 = bVar.f5417a;
            if (i2 == 4) {
                this.f5411c.mo5678b(bVar);
                this.f5411c.mo5675a(bVar.f5418b, bVar.f5420d, bVar.f5419c);
            } else if (i2 != 8) {
                switch (i2) {
                    case 1:
                        this.f5411c.mo5678b(bVar);
                        this.f5411c.mo5679c(bVar.f5418b, bVar.f5420d);
                        break;
                    case 2:
                        this.f5411c.mo5678b(bVar);
                        this.f5411c.mo5674a(bVar.f5418b, bVar.f5420d);
                        break;
                }
            } else {
                this.f5411c.mo5678b(bVar);
                this.f5411c.mo5680d(bVar.f5418b, bVar.f5420d);
            }
            if (this.f5412d != null) {
                this.f5412d.run();
            }
        }
        m6843a((List<C1389b>) this.f5409a);
        this.f5416h = 0;
    }

    /* renamed from: b */
    private void m6844b(C1389b bVar) {
        m6852g(bVar);
    }

    /* renamed from: f */
    private void m6851f(C1389b bVar) {
        m6852g(bVar);
    }

    C1387c(C1388a aVar) {
        this(aVar, false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final int mo6463b(int i) {
        return m6847d(i, 0);
    }

    /* renamed from: a */
    private void m6843a(List<C1389b> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            mo6262a((C1389b) list.get(i));
        }
        list.clear();
    }

    /* renamed from: c */
    private void m6846c(C1389b bVar) {
        char c;
        boolean z;
        boolean z2;
        int i = bVar.f5418b;
        int i2 = bVar.f5418b + bVar.f5420d;
        int i3 = bVar.f5418b;
        int i4 = 0;
        char c2 = 65535;
        while (i3 < i2) {
            if (this.f5411c.mo5673a(i3) != null || m6849d(i3)) {
                if (c2 == 0) {
                    m6850e(mo6261a(2, i, i4, null));
                    z2 = true;
                } else {
                    z2 = false;
                }
                c = 1;
            } else {
                if (c2 == 1) {
                    m6852g(mo6261a(2, i, i4, null));
                    z = true;
                } else {
                    z = false;
                }
                c = 0;
            }
            if (z) {
                i3 -= i4;
                i2 -= i4;
                i4 = 1;
            } else {
                i4++;
            }
            i3++;
            c2 = c;
        }
        if (i4 != bVar.f5420d) {
            mo6262a(bVar);
            bVar = mo6261a(2, i, i4, null);
        }
        if (c2 == 0) {
            m6850e(bVar);
        } else {
            m6852g(bVar);
        }
    }

    /* renamed from: g */
    private void m6852g(C1389b bVar) {
        this.f5410b.add(bVar);
        int i = bVar.f5417a;
        if (i == 4) {
            this.f5411c.mo5675a(bVar.f5418b, bVar.f5420d, bVar.f5419c);
        } else if (i != 8) {
            switch (i) {
                case 1:
                    this.f5411c.mo5679c(bVar.f5418b, bVar.f5420d);
                    return;
                case 2:
                    this.f5411c.mo5677b(bVar.f5418b, bVar.f5420d);
                    return;
                default:
                    StringBuilder sb = new StringBuilder("Unknown update op type for ");
                    sb.append(bVar);
                    throw new IllegalArgumentException(sb.toString());
            }
        } else {
            this.f5411c.mo5680d(bVar.f5418b, bVar.f5420d);
        }
    }

    /* renamed from: d */
    private void m6848d(C1389b bVar) {
        int i = bVar.f5418b;
        int i2 = bVar.f5418b + bVar.f5420d;
        char c = 65535;
        int i3 = i;
        int i4 = 0;
        for (int i5 = bVar.f5418b; i5 < i2; i5++) {
            if (this.f5411c.mo5673a(i5) != null || m6849d(i5)) {
                if (c == 0) {
                    m6850e(mo6261a(4, i3, i4, bVar.f5419c));
                    i3 = i5;
                    i4 = 0;
                }
                c = 1;
            } else {
                if (c == 1) {
                    m6852g(mo6261a(4, i3, i4, bVar.f5419c));
                    i3 = i5;
                    i4 = 0;
                }
                c = 0;
            }
            i4++;
        }
        if (i4 != bVar.f5420d) {
            Object obj = bVar.f5419c;
            mo6262a(bVar);
            bVar = mo6261a(4, i3, i4, obj);
        }
        if (c == 0) {
            m6850e(bVar);
        } else {
            m6852g(bVar);
        }
    }

    /* renamed from: e */
    private void m6850e(C1389b bVar) {
        int i;
        boolean z;
        if (bVar.f5417a == 1 || bVar.f5417a == 8) {
            throw new IllegalArgumentException("should not dispatch add or move for pre layout");
        }
        int c = m6845c(bVar.f5418b, bVar.f5417a);
        int i2 = bVar.f5418b;
        int i3 = bVar.f5417a;
        if (i3 == 2) {
            i = 0;
        } else if (i3 == 4) {
            i = 1;
        } else {
            StringBuilder sb = new StringBuilder("op should be remove or update.");
            sb.append(bVar);
            throw new IllegalArgumentException(sb.toString());
        }
        int i4 = c;
        int i5 = i2;
        int i6 = 1;
        for (int i7 = 1; i7 < bVar.f5420d; i7++) {
            int c2 = m6845c(bVar.f5418b + (i * i7), bVar.f5417a);
            int i8 = bVar.f5417a;
            if (i8 == 2 ? c2 != i4 : !(i8 == 4 && c2 == i4 + 1)) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                i6++;
            } else {
                C1389b a = mo6261a(bVar.f5417a, i4, i6, bVar.f5419c);
                m6842a(a, i5);
                mo6262a(a);
                if (bVar.f5417a == 4) {
                    i5 += i6;
                }
                i4 = c2;
                i6 = 1;
            }
        }
        Object obj = bVar.f5419c;
        mo6262a(bVar);
        if (i6 > 0) {
            C1389b a2 = mo6261a(bVar.f5417a, i4, i6, obj);
            m6842a(a2, i5);
            mo6262a(a2);
        }
    }

    /* renamed from: a */
    public final void mo6262a(C1389b bVar) {
        if (!this.f5413e) {
            bVar.f5419c = null;
            this.f5415g.release(bVar);
        }
    }

    /* renamed from: d */
    private boolean m6849d(int i) {
        int size = this.f5410b.size();
        for (int i2 = 0; i2 < size; i2++) {
            C1389b bVar = (C1389b) this.f5410b.get(i2);
            if (bVar.f5417a == 8) {
                if (m6847d(bVar.f5420d, i2 + 1) == i) {
                    return true;
                }
            } else if (bVar.f5417a == 1) {
                int i3 = bVar.f5418b + bVar.f5420d;
                for (int i4 = bVar.f5418b; i4 < i3; i4++) {
                    if (m6847d(i4, i2 + 1) == i) {
                        return true;
                    }
                }
                continue;
            } else {
                continue;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo6459a(int i) {
        if ((i & this.f5416h) != 0) {
            return true;
        }
        return false;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0047, code lost:
        continue;
     */
    /* renamed from: c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int mo6466c(int r6) {
        /*
            r5 = this;
            java.util.ArrayList<android.support.v7.widget.c$b> r0 = r5.f5409a
            int r0 = r0.size()
            r1 = 0
        L_0x0007:
            if (r1 >= r0) goto L_0x004a
            java.util.ArrayList<android.support.v7.widget.c$b> r2 = r5.f5409a
            java.lang.Object r2 = r2.get(r1)
            android.support.v7.widget.c$b r2 = (android.support.p029v7.widget.C1387c.C1389b) r2
            int r3 = r2.f5417a
            r4 = 8
            if (r3 == r4) goto L_0x0034
            switch(r3) {
                case 1: goto L_0x002c;
                case 2: goto L_0x001b;
                default: goto L_0x001a;
            }
        L_0x001a:
            goto L_0x0047
        L_0x001b:
            int r3 = r2.f5418b
            if (r3 > r6) goto L_0x0047
            int r3 = r2.f5418b
            int r4 = r2.f5420d
            int r3 = r3 + r4
            if (r3 <= r6) goto L_0x0028
            r6 = -1
            return r6
        L_0x0028:
            int r2 = r2.f5420d
            int r6 = r6 - r2
            goto L_0x0047
        L_0x002c:
            int r3 = r2.f5418b
            if (r3 > r6) goto L_0x0047
            int r2 = r2.f5420d
            int r6 = r6 + r2
            goto L_0x0047
        L_0x0034:
            int r3 = r2.f5418b
            if (r3 != r6) goto L_0x003b
            int r6 = r2.f5420d
            goto L_0x0047
        L_0x003b:
            int r3 = r2.f5418b
            if (r3 >= r6) goto L_0x0041
            int r6 = r6 + -1
        L_0x0041:
            int r2 = r2.f5420d
            if (r2 > r6) goto L_0x0047
            int r6 = r6 + 1
        L_0x0047:
            int r1 = r1 + 1
            goto L_0x0007
        L_0x004a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p029v7.widget.C1387c.mo6466c(int):int");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final boolean mo6465b(int i, int i2) {
        if (i2 <= 0) {
            return false;
        }
        this.f5409a.add(mo6261a(2, i, i2, null));
        this.f5416h |= 2;
        if (this.f5409a.size() == 1) {
            return true;
        }
        return false;
    }

    private C1387c(C1388a aVar, boolean z) {
        this.f5415g = new SimplePool(30);
        this.f5409a = new ArrayList<>();
        this.f5410b = new ArrayList<>();
        this.f5416h = 0;
        this.f5411c = aVar;
        this.f5413e = false;
        this.f5414f = new C1341ag(this);
    }

    /* renamed from: a */
    private void m6842a(C1389b bVar, int i) {
        this.f5411c.mo5676a(bVar);
        int i2 = bVar.f5417a;
        if (i2 == 2) {
            this.f5411c.mo5674a(i, bVar.f5420d);
        } else if (i2 == 4) {
            this.f5411c.mo5675a(i, bVar.f5420d, bVar.f5419c);
        } else {
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
    }

    /* renamed from: d */
    private int m6847d(int i, int i2) {
        int size = this.f5410b.size();
        while (i2 < size) {
            C1389b bVar = (C1389b) this.f5410b.get(i2);
            if (bVar.f5417a == 8) {
                if (bVar.f5418b == i) {
                    i = bVar.f5420d;
                } else {
                    if (bVar.f5418b < i) {
                        i--;
                    }
                    if (bVar.f5420d <= i) {
                        i++;
                    }
                }
            } else if (bVar.f5418b > i) {
                continue;
            } else if (bVar.f5417a == 2) {
                if (i < bVar.f5418b + bVar.f5420d) {
                    return -1;
                }
                i -= bVar.f5420d;
            } else if (bVar.f5417a == 1) {
                i += bVar.f5420d;
            }
            i2++;
        }
        return i;
    }

    /* renamed from: c */
    private int m6845c(int i, int i2) {
        int i3;
        int i4;
        for (int size = this.f5410b.size() - 1; size >= 0; size--) {
            C1389b bVar = (C1389b) this.f5410b.get(size);
            if (bVar.f5417a == 8) {
                if (bVar.f5418b < bVar.f5420d) {
                    i4 = bVar.f5418b;
                    i3 = bVar.f5420d;
                } else {
                    i4 = bVar.f5420d;
                    i3 = bVar.f5418b;
                }
                if (i < i4 || i > i3) {
                    if (i < bVar.f5418b) {
                        if (i2 == 1) {
                            bVar.f5418b++;
                            bVar.f5420d++;
                        } else if (i2 == 2) {
                            bVar.f5418b--;
                            bVar.f5420d--;
                        }
                    }
                } else if (i4 == bVar.f5418b) {
                    if (i2 == 1) {
                        bVar.f5420d++;
                    } else if (i2 == 2) {
                        bVar.f5420d--;
                    }
                    i++;
                } else {
                    if (i2 == 1) {
                        bVar.f5418b++;
                    } else if (i2 == 2) {
                        bVar.f5418b--;
                    }
                    i--;
                }
            } else if (bVar.f5418b <= i) {
                if (bVar.f5417a == 1) {
                    i -= bVar.f5420d;
                } else if (bVar.f5417a == 2) {
                    i += bVar.f5420d;
                }
            } else if (i2 == 1) {
                bVar.f5418b++;
            } else if (i2 == 2) {
                bVar.f5418b--;
            }
        }
        for (int size2 = this.f5410b.size() - 1; size2 >= 0; size2--) {
            C1389b bVar2 = (C1389b) this.f5410b.get(size2);
            if (bVar2.f5417a == 8) {
                if (bVar2.f5420d == bVar2.f5418b || bVar2.f5420d < 0) {
                    this.f5410b.remove(size2);
                    mo6262a(bVar2);
                }
            } else if (bVar2.f5420d <= 0) {
                this.f5410b.remove(size2);
                mo6262a(bVar2);
            }
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo6460a(int i, int i2) {
        if (i2 <= 0) {
            return false;
        }
        this.f5409a.add(mo6261a(1, i, i2, null));
        this.f5416h |= 1;
        if (this.f5409a.size() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo6461a(int i, int i2, int i3) {
        if (i == i2) {
            return false;
        }
        if (i3 == 1) {
            this.f5409a.add(mo6261a(8, i, i2, null));
            this.f5416h |= 8;
            if (this.f5409a.size() == 1) {
                return true;
            }
            return false;
        }
        throw new IllegalArgumentException("Moving more than 1 item is not supported yet");
    }

    /* renamed from: a */
    public final C1389b mo6261a(int i, int i2, int i3, Object obj) {
        C1389b bVar = (C1389b) this.f5415g.acquire();
        if (bVar == null) {
            return new C1389b(i, i2, i3, obj);
        }
        bVar.f5417a = i;
        bVar.f5418b = i2;
        bVar.f5420d = i3;
        bVar.f5419c = obj;
        return bVar;
    }
}
