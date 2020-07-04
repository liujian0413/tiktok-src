package android.support.p029v7.widget;

import android.support.p029v7.widget.RecyclerView.C1267f;
import android.support.p029v7.widget.RecyclerView.C1267f.C1270c;
import android.support.p029v7.widget.RecyclerView.C1293v;
import android.view.View;

/* renamed from: android.support.v7.widget.SimpleItemAnimator */
public abstract class SimpleItemAnimator extends C1267f {

    /* renamed from: m */
    public boolean f5112m = true;

    /* renamed from: a */
    public abstract boolean mo5326a(C1293v vVar);

    /* renamed from: a */
    public abstract boolean mo5327a(C1293v vVar, int i, int i2, int i3, int i4);

    /* renamed from: a */
    public abstract boolean mo5328a(C1293v vVar, C1293v vVar2, int i, int i2, int i3, int i4);

    /* renamed from: b */
    public abstract boolean mo5332b(C1293v vVar);

    /* renamed from: h */
    public final void mo6003h(C1293v vVar) {
        mo5736f(vVar);
    }

    /* renamed from: i */
    public final void mo6004i(C1293v vVar) {
        mo5736f(vVar);
    }

    /* renamed from: j */
    public final void mo6005j(C1293v vVar) {
        mo5736f(vVar);
    }

    /* renamed from: g */
    public final boolean mo5737g(C1293v vVar) {
        if (!this.f5112m || vVar.isInvalid()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo6002a(C1293v vVar, boolean z) {
        mo5736f(vVar);
    }

    /* renamed from: a */
    public final boolean mo5731a(C1293v vVar, C1270c cVar, C1270c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f4944a;
        int i4 = cVar.f4945b;
        View view = vVar.itemView;
        if (cVar2 == null) {
            i = view.getLeft();
        } else {
            i = cVar2.f4944a;
        }
        int i5 = i;
        if (cVar2 == null) {
            i2 = view.getTop();
        } else {
            i2 = cVar2.f4945b;
        }
        int i6 = i2;
        if (vVar.isRemoved() || (i3 == i5 && i4 == i6)) {
            return mo5326a(vVar);
        }
        view.layout(i5, i6, view.getWidth() + i5, view.getHeight() + i6);
        return mo5327a(vVar, i3, i4, i5, i6);
    }

    /* renamed from: b */
    public final boolean mo5733b(C1293v vVar, C1270c cVar, C1270c cVar2) {
        if (cVar == null || (cVar.f4944a == cVar2.f4944a && cVar.f4945b == cVar2.f4945b)) {
            return mo5332b(vVar);
        }
        return mo5327a(vVar, cVar.f4944a, cVar.f4945b, cVar2.f4944a, cVar2.f4945b);
    }

    /* renamed from: c */
    public final boolean mo5734c(C1293v vVar, C1270c cVar, C1270c cVar2) {
        if (cVar.f4944a == cVar2.f4944a && cVar.f4945b == cVar2.f4945b) {
            mo6004i(vVar);
            return false;
        }
        return mo5327a(vVar, cVar.f4944a, cVar.f4945b, cVar2.f4944a, cVar2.f4945b);
    }

    /* renamed from: a */
    public final boolean mo5732a(C1293v vVar, C1293v vVar2, C1270c cVar, C1270c cVar2) {
        int i;
        int i2;
        int i3 = cVar.f4944a;
        int i4 = cVar.f4945b;
        if (vVar2.shouldIgnore()) {
            int i5 = cVar.f4944a;
            i = cVar.f4945b;
            i2 = i5;
        } else {
            i2 = cVar2.f4944a;
            i = cVar2.f4945b;
        }
        return mo5328a(vVar, vVar2, i3, i4, i2, i);
    }
}
