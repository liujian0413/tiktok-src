package android.support.p029v7.widget;

import android.support.p022v4.p027os.C0885f;
import android.support.p029v7.widget.RecyclerView.C1273i;
import android.support.p029v7.widget.RecyclerView.C1273i.C1276a;
import android.support.p029v7.widget.RecyclerView.C1284o;
import android.support.p029v7.widget.RecyclerView.C1293v;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.concurrent.TimeUnit;

/* renamed from: android.support.v7.widget.ab */
final class C1333ab implements Runnable {

    /* renamed from: a */
    static final ThreadLocal<C1333ab> f5223a = new ThreadLocal<>();

    /* renamed from: e */
    static Comparator<C1336b> f5224e = new Comparator<C1336b>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m6602a((C1336b) obj, (C1336b) obj2);
        }

        /* renamed from: a */
        private static int m6602a(C1336b bVar, C1336b bVar2) {
            boolean z;
            boolean z2;
            if (bVar.f5236d == null) {
                z = true;
            } else {
                z = false;
            }
            if (bVar2.f5236d == null) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z != z2) {
                if (bVar.f5236d == null) {
                    return 1;
                }
                return -1;
            } else if (bVar.f5233a == bVar2.f5233a) {
                int i = bVar2.f5234b - bVar.f5234b;
                if (i != 0) {
                    return i;
                }
                int i2 = bVar.f5235c - bVar2.f5235c;
                if (i2 != 0) {
                    return i2;
                }
                return 0;
            } else if (bVar.f5233a) {
                return -1;
            } else {
                return 1;
            }
        }
    };

    /* renamed from: b */
    ArrayList<RecyclerView> f5225b = new ArrayList<>();

    /* renamed from: c */
    long f5226c;

    /* renamed from: d */
    long f5227d;

    /* renamed from: f */
    private ArrayList<C1336b> f5228f = new ArrayList<>();

    /* renamed from: android.support.v7.widget.ab$a */
    static class C1335a implements C1276a {

        /* renamed from: a */
        int f5229a;

        /* renamed from: b */
        int f5230b;

        /* renamed from: c */
        int[] f5231c;

        /* renamed from: d */
        int f5232d;

        C1335a() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6252a() {
            if (this.f5231c != null) {
                Arrays.fill(this.f5231c, -1);
            }
            this.f5232d = 0;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo6255a(int i) {
            if (this.f5231c != null) {
                int i2 = this.f5232d * 2;
                for (int i3 = 0; i3 < i2; i3 += 2) {
                    if (this.f5231c[i3] == i) {
                        return true;
                    }
                }
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6253a(int i, int i2) {
            this.f5229a = i;
            this.f5230b = i2;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo6254a(RecyclerView recyclerView, boolean z) {
            this.f5232d = 0;
            if (this.f5231c != null) {
                Arrays.fill(this.f5231c, -1);
            }
            C1273i iVar = recyclerView.f4915n;
            if (recyclerView.f4914m != null && iVar != null && iVar.f4952D) {
                if (z) {
                    if (!recyclerView.f4907f.mo6468d()) {
                        iVar.mo5419a(recyclerView.f4914m.getItemCount(), (C1276a) this);
                    }
                } else if (!recyclerView.mo5614m()) {
                    iVar.mo5418a(this.f5229a, this.f5230b, recyclerView.f4857D, (C1276a) this);
                }
                if (this.f5232d > iVar.f4953E) {
                    iVar.f4953E = this.f5232d;
                    iVar.f4954F = z;
                    recyclerView.f4906e.mo5843b();
                }
            }
        }

        /* renamed from: b */
        public final void mo5813b(int i, int i2) {
            if (i < 0) {
                throw new IllegalArgumentException("Layout positions must be non-negative");
            } else if (i2 >= 0) {
                int i3 = this.f5232d * 2;
                if (this.f5231c == null) {
                    this.f5231c = new int[4];
                    Arrays.fill(this.f5231c, -1);
                } else if (i3 >= this.f5231c.length) {
                    int[] iArr = this.f5231c;
                    this.f5231c = new int[(i3 * 2)];
                    System.arraycopy(iArr, 0, this.f5231c, 0, iArr.length);
                }
                this.f5231c[i3] = i;
                this.f5231c[i3 + 1] = i2;
                this.f5232d++;
            } else {
                throw new IllegalArgumentException("Pixel distance must be non-negative");
            }
        }
    }

    /* renamed from: android.support.v7.widget.ab$b */
    static class C1336b {

        /* renamed from: a */
        public boolean f5233a;

        /* renamed from: b */
        public int f5234b;

        /* renamed from: c */
        public int f5235c;

        /* renamed from: d */
        public RecyclerView f5236d;

        /* renamed from: e */
        public int f5237e;

        C1336b() {
        }

        /* renamed from: a */
        public final void mo6256a() {
            this.f5233a = false;
            this.f5234b = 0;
            this.f5235c = 0;
            this.f5236d = null;
            this.f5237e = 0;
        }
    }

    C1333ab() {
    }

    public final void run() {
        try {
            C0885f.m3753a("RV Prefetch");
            if (!this.f5225b.isEmpty()) {
                int size = this.f5225b.size();
                long j = 0;
                for (int i = 0; i < size; i++) {
                    RecyclerView recyclerView = (RecyclerView) this.f5225b.get(i);
                    if (recyclerView.getWindowVisibility() == 0) {
                        j = Math.max(recyclerView.getDrawingTime(), j);
                    }
                }
                if (j == 0) {
                    this.f5226c = 0;
                    C0885f.m3752a();
                    return;
                }
                m6598b(TimeUnit.MILLISECONDS.toNanos(j) + this.f5227d);
                this.f5226c = 0;
                C0885f.m3752a();
            }
        } finally {
            this.f5226c = 0;
            C0885f.m3752a();
        }
    }

    /* renamed from: a */
    private void m6593a() {
        C1336b bVar;
        boolean z;
        int size = this.f5225b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            RecyclerView recyclerView = (RecyclerView) this.f5225b.get(i2);
            if (recyclerView.getWindowVisibility() == 0) {
                recyclerView.f4856C.mo6254a(recyclerView, false);
                i += recyclerView.f4856C.f5232d;
            }
        }
        this.f5228f.ensureCapacity(i);
        int i3 = 0;
        for (int i4 = 0; i4 < size; i4++) {
            RecyclerView recyclerView2 = (RecyclerView) this.f5225b.get(i4);
            if (recyclerView2.getWindowVisibility() == 0) {
                C1335a aVar = recyclerView2.f4856C;
                int abs = Math.abs(aVar.f5229a) + Math.abs(aVar.f5230b);
                int i5 = i3;
                for (int i6 = 0; i6 < aVar.f5232d * 2; i6 += 2) {
                    if (i5 >= this.f5228f.size()) {
                        bVar = new C1336b();
                        this.f5228f.add(bVar);
                    } else {
                        bVar = (C1336b) this.f5228f.get(i5);
                    }
                    int i7 = aVar.f5231c[i6 + 1];
                    if (i7 <= abs) {
                        z = true;
                    } else {
                        z = false;
                    }
                    bVar.f5233a = z;
                    bVar.f5234b = abs;
                    bVar.f5235c = i7;
                    bVar.f5236d = recyclerView2;
                    bVar.f5237e = aVar.f5231c[i6];
                    i5++;
                }
                i3 = i5;
            }
        }
        Collections.sort(this.f5228f, f5224e);
    }

    /* renamed from: b */
    private void m6598b(long j) {
        m6593a();
        m6594a(j);
    }

    /* renamed from: a */
    public final void mo6247a(RecyclerView recyclerView) {
        this.f5225b.add(recyclerView);
    }

    /* renamed from: b */
    public final void mo6249b(RecyclerView recyclerView) {
        this.f5225b.remove(recyclerView);
    }

    /* renamed from: a */
    private void m6594a(long j) {
        int i = 0;
        while (i < this.f5228f.size()) {
            C1336b bVar = (C1336b) this.f5228f.get(i);
            if (bVar.f5236d != null) {
                m6596a(bVar, j);
                bVar.mo6256a();
                i++;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    private void m6595a(RecyclerView recyclerView, long j) {
        if (recyclerView != null) {
            if (recyclerView.f4925x && recyclerView.f4908g.mo6603c() != 0) {
                recyclerView.mo5540b();
            }
            C1335a aVar = recyclerView.f4856C;
            aVar.mo6254a(recyclerView, true);
            if (aVar.f5232d != 0) {
                try {
                    C0885f.m3753a("RV Nested Prefetch");
                    recyclerView.f4857D.mo5868a(recyclerView.f4914m);
                    for (int i = 0; i < aVar.f5232d * 2; i += 2) {
                        m6592a(recyclerView, aVar.f5231c[i], j);
                    }
                } finally {
                    C0885f.m3752a();
                }
            }
        }
    }

    /* renamed from: a */
    private void m6596a(C1336b bVar, long j) {
        long j2;
        if (bVar.f5233a) {
            j2 = Long.MAX_VALUE;
        } else {
            j2 = j;
        }
        C1293v a = m6592a(bVar.f5236d, bVar.f5237e, j2);
        if (a != null && a.mNestedRecyclerView != null && a.isBound() && !a.isInvalid()) {
            m6595a((RecyclerView) a.mNestedRecyclerView.get(), j);
        }
    }

    /* renamed from: a */
    private static boolean m6597a(RecyclerView recyclerView, int i) {
        int c = recyclerView.f4908g.mo6603c();
        for (int i2 = 0; i2 < c; i2++) {
            C1293v d = RecyclerView.m5889d(recyclerView.f4908g.mo6606d(i2));
            if (d.mPosition == i && !d.isInvalid()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private static C1293v m6592a(RecyclerView recyclerView, int i, long j) {
        if (m6597a(recyclerView, i)) {
            return null;
        }
        C1284o oVar = recyclerView.f4906e;
        try {
            recyclerView.mo5579g();
            C1293v a = oVar.mo5831a(i, false, j);
            if (a != null) {
                if (!a.isBound() || a.isInvalid()) {
                    oVar.mo5839a(a, false);
                } else {
                    oVar.mo5840a(a.itemView);
                }
            }
            return a;
        } finally {
            recyclerView.mo5532a(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo6248a(RecyclerView recyclerView, int i, int i2) {
        if (recyclerView.isAttachedToWindow() && this.f5226c == 0) {
            this.f5226c = recyclerView.getNanoTime();
            recyclerView.post(this);
        }
        recyclerView.f4856C.mo6253a(i, i2);
    }
}
