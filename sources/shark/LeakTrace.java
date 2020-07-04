package shark;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import shark.internal.C48786g;

public final class LeakTrace implements Serializable {
    private final List<LeakTraceElement> elements;
    private final List<LeakTraceElement> leakCauses;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<shark.LeakTraceElement>, for r1v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ shark.LeakTrace copy$default(shark.LeakTrace r0, java.util.List<shark.LeakTraceElement> r1, int r2, java.lang.Object r3) {
        /*
            r2 = r2 & 1
            if (r2 == 0) goto L_0x0006
            java.util.List<shark.LeakTraceElement> r1 = r0.elements
        L_0x0006:
            shark.LeakTrace r0 = r0.copy(r1)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.LeakTrace.copy$default(shark.LeakTrace, java.util.List, int, java.lang.Object):shark.LeakTrace");
    }

    public final List<LeakTraceElement> component1() {
        return this.elements;
    }

    public final LeakTrace copy(List<LeakTraceElement> list) {
        C7573i.m23587b(list, "elements");
        return new LeakTrace(list);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.elements, (java.lang.Object) ((shark.LeakTrace) r2).elements) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof shark.LeakTrace
            if (r0 == 0) goto L_0x0013
            shark.LeakTrace r2 = (shark.LeakTrace) r2
            java.util.List<shark.LeakTraceElement> r0 = r1.elements
            java.util.List<shark.LeakTraceElement> r2 = r2.elements
            boolean r2 = kotlin.jvm.internal.C7573i.m23585a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.LeakTrace.equals(java.lang.Object):boolean");
    }

    public final List<LeakTraceElement> getElements() {
        return this.elements;
    }

    public final List<LeakTraceElement> getLeakCauses() {
        return this.leakCauses;
    }

    public final int hashCode() {
        List<LeakTraceElement> list = this.elements;
        if (list != null) {
            return list.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("\n");
        sb.append(C48786g.m150663a(this));
        sb.append(10);
        return sb.toString();
    }

    public LeakTrace(List<LeakTraceElement> list) {
        C7573i.m23587b(list, "elements");
        this.elements = list;
        Iterable iterable = this.elements;
        Collection arrayList = new ArrayList();
        int i = 0;
        for (Object next : iterable) {
            int i2 = i + 1;
            if (i < 0) {
                C7525m.m23465b();
            }
            if (elementMayBeLeakCause(i)) {
                arrayList.add(next);
            }
            i = i2;
        }
        this.leakCauses = (List) arrayList;
    }

    public final boolean elementMayBeLeakCause(int i) {
        switch (C48853q.f124205a[((LeakTraceElement) this.elements.get(i)).getLeakStatus().ordinal()]) {
            case 1:
                return true;
            case 2:
                if (i >= C7525m.m23459a(this.elements) || ((LeakTraceElement) this.elements.get(i + 1)).getLeakStatus() == LeakNodeStatus.NOT_LEAKING) {
                    return false;
                }
                return true;
            default:
                return false;
        }
    }
}
