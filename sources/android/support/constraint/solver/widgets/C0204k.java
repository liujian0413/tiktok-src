package android.support.constraint.solver.widgets;

import java.util.HashSet;
import java.util.Iterator;

/* renamed from: android.support.constraint.solver.widgets.k */
public class C0204k {

    /* renamed from: h */
    HashSet<C0204k> f814h = new HashSet<>(2);

    /* renamed from: i */
    int f815i = 0;

    /* renamed from: a */
    public void mo583a() {
    }

    /* renamed from: f */
    public final boolean mo599f() {
        if (this.f815i == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo589b() {
        this.f815i = 0;
        this.f814h.clear();
    }

    /* renamed from: d */
    public final void mo597d() {
        this.f815i = 0;
        Iterator it = this.f814h.iterator();
        while (it.hasNext()) {
            ((C0204k) it.next()).mo597d();
        }
    }

    /* renamed from: e */
    public final void mo598e() {
        this.f815i = 1;
        Iterator it = this.f814h.iterator();
        while (it.hasNext()) {
            ((C0204k) it.next()).mo583a();
        }
    }

    /* renamed from: a */
    public final void mo596a(C0204k kVar) {
        this.f814h.add(kVar);
    }
}
