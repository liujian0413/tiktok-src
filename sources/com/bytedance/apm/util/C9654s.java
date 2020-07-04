package com.bytedance.apm.util;

import java.lang.Comparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

/* renamed from: com.bytedance.apm.util.s */
public final class C9654s<E extends Comparable> {

    /* renamed from: a */
    private PriorityQueue<E> f26368a;

    /* renamed from: b */
    private int f26369b;

    /* renamed from: a */
    public final List<E> mo23999a() {
        ArrayList arrayList = new ArrayList(this.f26368a);
        Collections.sort(arrayList);
        return arrayList;
    }

    public C9654s(int i) {
        if (i > 0) {
            this.f26369b = i;
            this.f26368a = new PriorityQueue<>(i, new Comparator<E>() {
                /* renamed from: a */
                private static int m28549a(E e, E e2) {
                    return e.compareTo(e2);
                }

                public final /* synthetic */ int compare(Object obj, Object obj2) {
                    return m28549a((Comparable) obj, (Comparable) obj2);
                }
            });
            return;
        }
        throw new IllegalStateException();
    }

    /* renamed from: a */
    public final void mo24000a(E e) {
        if (this.f26368a.size() < this.f26369b) {
            this.f26368a.add(e);
            return;
        }
        if (e.compareTo((Comparable) this.f26368a.peek()) > 0) {
            this.f26368a.poll();
            this.f26368a.add(e);
        }
    }
}
