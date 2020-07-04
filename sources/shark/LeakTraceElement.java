package shark;

import java.io.Serializable;
import java.util.Set;
import kotlin.jvm.internal.C7573i;
import shark.internal.C48807m;

public final class LeakTraceElement implements Serializable {
    private final String className;
    private final Holder holder;
    private final Set<String> labels;
    private final LeakNodeStatus leakStatus;
    private final String leakStatusReason;
    private final LeakReference reference;

    public enum Holder {
        OBJECT,
        CLASS,
        THREAD,
        ARRAY
    }

    public enum Type {
        INSTANCE_FIELD,
        STATIC_FIELD,
        LOCAL,
        ARRAY_ENTRY
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.Set, code=java.util.Set<java.lang.String>, for r8v0, types: [java.util.Set] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ shark.LeakTraceElement copy$default(shark.LeakTraceElement r4, shark.LeakReference r5, shark.LeakTraceElement.Holder r6, java.lang.String r7, java.util.Set<java.lang.String> r8, shark.LeakNodeStatus r9, java.lang.String r10, int r11, java.lang.Object r12) {
        /*
            r12 = r11 & 1
            if (r12 == 0) goto L_0x0006
            shark.LeakReference r5 = r4.reference
        L_0x0006:
            r12 = r11 & 2
            if (r12 == 0) goto L_0x000c
            shark.LeakTraceElement$Holder r6 = r4.holder
        L_0x000c:
            r12 = r6
            r6 = r11 & 4
            if (r6 == 0) goto L_0x0013
            java.lang.String r7 = r4.className
        L_0x0013:
            r0 = r7
            r6 = r11 & 8
            if (r6 == 0) goto L_0x001a
            java.util.Set<java.lang.String> r8 = r4.labels
        L_0x001a:
            r1 = r8
            r6 = r11 & 16
            if (r6 == 0) goto L_0x0021
            shark.LeakNodeStatus r9 = r4.leakStatus
        L_0x0021:
            r2 = r9
            r6 = r11 & 32
            if (r6 == 0) goto L_0x0028
            java.lang.String r10 = r4.leakStatusReason
        L_0x0028:
            r3 = r10
            r6 = r4
            r7 = r5
            r8 = r12
            r9 = r0
            r10 = r1
            r11 = r2
            r12 = r3
            shark.LeakTraceElement r4 = r6.copy(r7, r8, r9, r10, r11, r12)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.LeakTraceElement.copy$default(shark.LeakTraceElement, shark.LeakReference, shark.LeakTraceElement$Holder, java.lang.String, java.util.Set, shark.LeakNodeStatus, java.lang.String, int, java.lang.Object):shark.LeakTraceElement");
    }

    public final LeakReference component1() {
        return this.reference;
    }

    public final Holder component2() {
        return this.holder;
    }

    public final String component3() {
        return this.className;
    }

    public final Set<String> component4() {
        return this.labels;
    }

    public final LeakNodeStatus component5() {
        return this.leakStatus;
    }

    public final String component6() {
        return this.leakStatusReason;
    }

    public final LeakTraceElement copy(LeakReference leakReference, Holder holder2, String str, Set<String> set, LeakNodeStatus leakNodeStatus, String str2) {
        C7573i.m23587b(holder2, "holder");
        C7573i.m23587b(str, "className");
        C7573i.m23587b(set, "labels");
        C7573i.m23587b(leakNodeStatus, "leakStatus");
        C7573i.m23587b(str2, "leakStatusReason");
        LeakTraceElement leakTraceElement = new LeakTraceElement(leakReference, holder2, str, set, leakNodeStatus, str2);
        return leakTraceElement;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.leakStatusReason, (java.lang.Object) r3.leakStatusReason) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof shark.LeakTraceElement
            if (r0 == 0) goto L_0x0045
            shark.LeakTraceElement r3 = (shark.LeakTraceElement) r3
            shark.LeakReference r0 = r2.reference
            shark.LeakReference r1 = r3.reference
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            shark.LeakTraceElement$Holder r0 = r2.holder
            shark.LeakTraceElement$Holder r1 = r3.holder
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.className
            java.lang.String r1 = r3.className
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.util.Set<java.lang.String> r0 = r2.labels
            java.util.Set<java.lang.String> r1 = r3.labels
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            shark.LeakNodeStatus r0 = r2.leakStatus
            shark.LeakNodeStatus r1 = r3.leakStatus
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.leakStatusReason
            java.lang.String r3 = r3.leakStatusReason
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r3 = 0
            return r3
        L_0x0047:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.LeakTraceElement.equals(java.lang.Object):boolean");
    }

    public final String getClassName() {
        return this.className;
    }

    public final Holder getHolder() {
        return this.holder;
    }

    public final Set<String> getLabels() {
        return this.labels;
    }

    public final LeakNodeStatus getLeakStatus() {
        return this.leakStatus;
    }

    public final String getLeakStatusReason() {
        return this.leakStatusReason;
    }

    public final LeakReference getReference() {
        return this.reference;
    }

    public final int hashCode() {
        LeakReference leakReference = this.reference;
        int i = 0;
        int hashCode = (leakReference != null ? leakReference.hashCode() : 0) * 31;
        Holder holder2 = this.holder;
        int hashCode2 = (hashCode + (holder2 != null ? holder2.hashCode() : 0)) * 31;
        String str = this.className;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        Set<String> set = this.labels;
        int hashCode4 = (hashCode3 + (set != null ? set.hashCode() : 0)) * 31;
        LeakNodeStatus leakNodeStatus = this.leakStatus;
        int hashCode5 = (hashCode4 + (leakNodeStatus != null ? leakNodeStatus.hashCode() : 0)) * 31;
        String str2 = this.leakStatusReason;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeakTraceElement(reference=");
        sb.append(this.reference);
        sb.append(", holder=");
        sb.append(this.holder);
        sb.append(", className=");
        sb.append(this.className);
        sb.append(", labels=");
        sb.append(this.labels);
        sb.append(", leakStatus=");
        sb.append(this.leakStatus);
        sb.append(", leakStatusReason=");
        sb.append(this.leakStatusReason);
        sb.append(")");
        return sb.toString();
    }

    public final String getClassSimpleName() {
        return C48807m.m150710a(this.className, '.');
    }

    public LeakTraceElement(LeakReference leakReference, Holder holder2, String str, Set<String> set, LeakNodeStatus leakNodeStatus, String str2) {
        C7573i.m23587b(holder2, "holder");
        C7573i.m23587b(str, "className");
        C7573i.m23587b(set, "labels");
        C7573i.m23587b(leakNodeStatus, "leakStatus");
        C7573i.m23587b(str2, "leakStatusReason");
        this.reference = leakReference;
        this.holder = holder2;
        this.className = str;
        this.labels = set;
        this.leakStatus = leakNodeStatus;
        this.leakStatusReason = str2;
    }
}
