package com.p280ss.android.ugc.aweme.poi.p335ui.detail.widget;

import android.support.p022v4.util.C0904k;
import android.support.p022v4.util.Pools.C0887a;
import android.support.p022v4.util.Pools.SimplePool;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.a */
public final class C35373a<T> {

    /* renamed from: a */
    private final C0887a<ArrayList<T>> f92799a = new SimplePool(10);

    /* renamed from: b */
    private final C0904k<T, ArrayList<T>> f92800b = new C0904k<>();

    /* renamed from: c */
    private final ArrayList<T> f92801c = new ArrayList<>();

    /* renamed from: d */
    private final HashSet<T> f92802d = new HashSet<>();

    /* renamed from: c */
    private ArrayList<T> m114239c() {
        ArrayList<T> arrayList = (ArrayList) this.f92799a.acquire();
        if (arrayList == null) {
            return new ArrayList<>();
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo90083a() {
        int size = this.f92800b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f92800b.mo3418c(i);
            if (arrayList != null) {
                m114238a(arrayList);
            }
        }
        this.f92800b.clear();
    }

    /* renamed from: b */
    public final ArrayList<T> mo90086b() {
        this.f92801c.clear();
        this.f92802d.clear();
        int size = this.f92800b.size();
        for (int i = 0; i < size; i++) {
            m114237a(this.f92800b.mo3417b(i), this.f92801c, this.f92802d);
        }
        return this.f92801c;
    }

    /* renamed from: b */
    public final boolean mo90087b(T t) {
        return this.f92800b.containsKey(t);
    }

    /* renamed from: a */
    private void m114238a(ArrayList<T> arrayList) {
        arrayList.clear();
        this.f92799a.release(arrayList);
    }

    /* renamed from: c */
    public final List mo90088c(T t) {
        return (List) this.f92800b.get(t);
    }

    /* renamed from: e */
    public final boolean mo90090e(T t) {
        int size = this.f92800b.size();
        for (int i = 0; i < size; i++) {
            ArrayList arrayList = (ArrayList) this.f92800b.mo3418c(i);
            if (arrayList != null && arrayList.contains(t)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public final List<T> mo90089d(T t) {
        int size = this.f92800b.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            ArrayList arrayList2 = (ArrayList) this.f92800b.mo3418c(i);
            if (arrayList2 != null && arrayList2.contains(t)) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(this.f92800b.mo3417b(i));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final void mo90084a(T t) {
        if (!this.f92800b.containsKey(t)) {
            this.f92800b.put(t, null);
        }
    }

    /* renamed from: a */
    public final void mo90085a(T t, T t2) {
        if (!this.f92800b.containsKey(t) || !this.f92800b.containsKey(t2)) {
            throw new IllegalArgumentException("All nodes must be present in the graph before being added as an edge");
        }
        ArrayList arrayList = (ArrayList) this.f92800b.get(t);
        if (arrayList == null) {
            arrayList = m114239c();
            this.f92800b.put(t, arrayList);
        }
        arrayList.add(t2);
    }

    /* renamed from: a */
    private void m114237a(T t, ArrayList<T> arrayList, HashSet<T> hashSet) {
        if (!arrayList.contains(t)) {
            if (!hashSet.contains(t)) {
                hashSet.add(t);
                ArrayList arrayList2 = (ArrayList) this.f92800b.get(t);
                if (arrayList2 != null) {
                    int size = arrayList2.size();
                    for (int i = 0; i < size; i++) {
                        m114237a(arrayList2.get(i), arrayList, hashSet);
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
