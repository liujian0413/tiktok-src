package com.swmansion.gesturehandler.react;

import android.util.SparseArray;
import android.view.View;
import com.swmansion.gesturehandler.C46347b;
import com.swmansion.gesturehandler.C46351e;
import java.util.ArrayList;

/* renamed from: com.swmansion.gesturehandler.react.f */
public final class C46383f implements C46351e {

    /* renamed from: a */
    private final SparseArray<C46347b> f119418a = new SparseArray<>();

    /* renamed from: b */
    private final SparseArray<Integer> f119419b = new SparseArray<>();

    /* renamed from: c */
    private final SparseArray<ArrayList<C46347b>> f119420c = new SparseArray<>();

    /* renamed from: a */
    public final synchronized void mo115303a() {
        this.f119418a.clear();
        this.f119419b.clear();
        this.f119420c.clear();
    }

    /* renamed from: c */
    private synchronized ArrayList<C46347b> m145700c(int i) {
        return (ArrayList) this.f119420c.get(i);
    }

    /* renamed from: a */
    public final synchronized C46347b mo115302a(int i) {
        return (C46347b) this.f119418a.get(i);
    }

    /* renamed from: a */
    public final synchronized ArrayList<C46347b> mo115225a(View view) {
        return m145700c(view.getId());
    }

    /* renamed from: b */
    public final synchronized void mo115306b(int i) {
        C46347b bVar = (C46347b) this.f119418a.get(i);
        if (bVar != null) {
            m145699b(bVar);
            this.f119418a.remove(i);
        }
    }

    /* renamed from: b */
    private synchronized void m145699b(C46347b bVar) {
        Integer num = (Integer) this.f119419b.get(bVar.f119284c);
        if (num != null) {
            this.f119419b.remove(bVar.f119284c);
            ArrayList arrayList = (ArrayList) this.f119420c.get(num.intValue());
            if (arrayList != null) {
                arrayList.remove(bVar);
                if (arrayList.size() == 0) {
                    this.f119420c.remove(num.intValue());
                }
            }
        }
        if (bVar.f119285d != null) {
            bVar.mo115209d();
        }
    }

    /* renamed from: a */
    public final synchronized void mo115304a(C46347b bVar) {
        this.f119418a.put(bVar.f119284c, bVar);
    }

    /* renamed from: a */
    private synchronized void m145698a(int i, C46347b bVar) {
        if (this.f119419b.get(bVar.f119284c) == null) {
            this.f119419b.put(bVar.f119284c, Integer.valueOf(i));
            ArrayList arrayList = (ArrayList) this.f119420c.get(i);
            if (arrayList == null) {
                ArrayList arrayList2 = new ArrayList(1);
                arrayList2.add(bVar);
                this.f119420c.put(i, arrayList2);
                return;
            }
            arrayList.add(bVar);
            return;
        }
        StringBuilder sb = new StringBuilder("Handler ");
        sb.append(bVar);
        sb.append(" already attached");
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final synchronized boolean mo115305a(int i, int i2) {
        C46347b bVar = (C46347b) this.f119418a.get(i);
        if (bVar == null) {
            return false;
        }
        m145699b(bVar);
        m145698a(i2, bVar);
        return true;
    }
}
