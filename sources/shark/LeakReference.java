package shark;

import java.io.Serializable;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C7573i;
import shark.LeakTraceElement.Type;

public final class LeakReference implements Serializable {
    private final String name;
    private final Type type;

    public static /* synthetic */ LeakReference copy$default(LeakReference leakReference, Type type2, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            type2 = leakReference.type;
        }
        if ((i & 2) != 0) {
            str = leakReference.name;
        }
        return leakReference.copy(type2, str);
    }

    public final Type component1() {
        return this.type;
    }

    public final String component2() {
        return this.name;
    }

    public final LeakReference copy(Type type2, String str) {
        C7573i.m23587b(type2, "type");
        C7573i.m23587b(str, "name");
        return new LeakReference(type2, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.name, (java.lang.Object) r3.name) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof shark.LeakReference
            if (r0 == 0) goto L_0x001d
            shark.LeakReference r3 = (shark.LeakReference) r3
            shark.LeakTraceElement$Type r0 = r2.type
            shark.LeakTraceElement$Type r1 = r3.type
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.name
            java.lang.String r3 = r3.name
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.LeakReference.equals(java.lang.Object):boolean");
    }

    public final String getName() {
        return this.name;
    }

    public final Type getType() {
        return this.type;
    }

    public final int hashCode() {
        Type type2 = this.type;
        int i = 0;
        int hashCode = (type2 != null ? type2.hashCode() : 0) * 31;
        String str = this.name;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LeakReference(type=");
        sb.append(this.type);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(")");
        return sb.toString();
    }

    public final String getDisplayName() {
        switch (C48852p.f124203a[this.type.ordinal()]) {
            case 1:
                StringBuilder sb = new StringBuilder("[");
                sb.append(this.name);
                sb.append(']');
                return sb.toString();
            case 2:
            case 3:
                return this.name;
            case 4:
                return "<Java Local>";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public final String getGroupingName() {
        switch (C48852p.f124204b[this.type.ordinal()]) {
            case 1:
                return "[x]";
            case 2:
            case 3:
                return this.name;
            case 4:
                return "<Java Local>";
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public LeakReference(Type type2, String str) {
        C7573i.m23587b(type2, "type");
        C7573i.m23587b(str, "name");
        this.type = type2;
        this.name = str;
    }
}
