package android.support.p022v4.widget;

import android.support.p022v4.util.C0904k;
import android.support.p022v4.util.Pools.C0887a;
import android.support.p022v4.util.Pools.SimplePool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: android.support.v4.widget.g */
public final class C1046g<T> {

    /* renamed from: a */
    private final C0887a<ArrayList<T>> f3648a = new SimplePool(10);

    /* renamed from: b */
    private final C0904k<T, ArrayList<T>> f3649b = new C0904k<>();

    /* renamed from: c */
    private final ArrayList<T> f3650c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f3651d = new HashSet<>();

    /* renamed from: c */
    private ArrayList<T> m4511c() {
        ArrayList<T> arrayList = (ArrayList) this.f3648a.acquire();
        if (arrayList == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo4125a() {
        int size = this.f3649b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f3649b.mo3418c(i);
            if (arrayList != null) {
                m4510a(arrayList);
            }
        }
        this.f3649b.clear();
    }

    /* renamed from: b */
    public final ArrayList<T> mo4128b() {
        this.f3650c.clear();
        this.f3651d.clear();
        int size = this.f3649b.size();
        for (int i = 0; i < size; i++) {
            m4509a(this.f3649b.mo3417b(i), this.f3650c, this.f3651d);
        }
        return this.f3650c;
    }

    /* renamed from: b */
    public final boolean mo4129b(T t) {
        return this.f3649b.containsKey(t);
    }

    /* renamed from: a */
    private void m4510a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f3648a.release(arrayList);
    }

    /* renamed from: c */
    public final List mo4130c(T t) {
        return (List) this.f3649b.get(t);
    }

    /* renamed from: e */
    public final boolean mo4132e(T t) {
        int size = this.f3649b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f3649b.mo3418c(i);
            if (arrayList != null && arrayList.contains(t)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final List<T> mo4131d(T t) {
        int size = this.f3649b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) this.f3649b.mo3418c(i);
            if (arrayList2 != null && arrayList2.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f3649b.mo3417b(i));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo4126a(T t) {
        if (!this.f3649b.containsKey(t)) {
            this.f3649b.put(t, null);
        }
    }

    /* renamed from: a */
    public final void mo4127a(T t, T t2) {
        if (!this.f3649b.containsKey(t) || !this.f3649b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.f3649b.get(t);
        if (arrayList == null) {
            arrayList = m4511c();
            this.f3649b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: a */
    private void m4509a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = (ArrayList) this.f3649b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m4509a(arrayList2.get(i), arrayList, hashSet);
                    }
                }
                hashSet.remove(t);
                arrayList.add(t);
                return;
            }
            throw new RuntimeException("This graph contains cyclic dependencies");
        }
    }
}
