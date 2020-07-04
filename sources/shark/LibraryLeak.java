package shark;

import kotlin.jvm.internal.C7573i;
import shark.internal.C48807m;

public final class LibraryLeak extends Leak {
    private final String className;
    private final String description;
    private final LeakTrace leakTrace;
    private final ReferencePattern pattern;
    private final Integer retainedHeapByteSize;

    public static /* synthetic */ LibraryLeak copy$default(LibraryLeak libraryLeak, String str, LeakTrace leakTrace2, Integer num, ReferencePattern referencePattern, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = libraryLeak.getClassName();
        }
        if ((i & 2) != 0) {
            leakTrace2 = libraryLeak.getLeakTrace();
        }
        LeakTrace leakTrace3 = leakTrace2;
        if ((i & 4) != 0) {
            num = libraryLeak.getRetainedHeapByteSize();
        }
        Integer num2 = num;
        if ((i & 8) != 0) {
            referencePattern = libraryLeak.pattern;
        }
        ReferencePattern referencePattern2 = referencePattern;
        if ((i & 16) != 0) {
            str2 = libraryLeak.description;
        }
        return libraryLeak.copy(str, leakTrace3, num2, referencePattern2, str2);
    }

    public final String component1() {
        return getClassName();
    }

    public final LeakTrace component2() {
        return getLeakTrace();
    }

    public final Integer component3() {
        return getRetainedHeapByteSize();
    }

    public final ReferencePattern component4() {
        return this.pattern;
    }

    public final String component5() {
        return this.description;
    }

    public final LibraryLeak copy(String str, LeakTrace leakTrace2, Integer num, ReferencePattern referencePattern, String str2) {
        C7573i.m23587b(str, "className");
        C7573i.m23587b(leakTrace2, "leakTrace");
        C7573i.m23587b(referencePattern, "pattern");
        C7573i.m23587b(str2, "description");
        LibraryLeak libraryLeak = new LibraryLeak(str, leakTrace2, num, referencePattern, str2);
        return libraryLeak;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0044, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.description, (java.lang.Object) r3.description) != false) goto L_0x0049;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0049
            boolean r0 = r3 instanceof shark.LibraryLeak
            if (r0 == 0) goto L_0x0047
            shark.LibraryLeak r3 = (shark.LibraryLeak) r3
            java.lang.String r0 = r2.getClassName()
            java.lang.String r1 = r3.getClassName()
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0047
            shark.LeakTrace r0 = r2.getLeakTrace()
            shark.LeakTrace r1 = r3.getLeakTrace()
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0047
            java.lang.Integer r0 = r2.getRetainedHeapByteSize()
            java.lang.Integer r1 = r3.getRetainedHeapByteSize()
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0047
            shark.ReferencePattern r0 = r2.pattern
            shark.ReferencePattern r1 = r3.pattern
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0047
            java.lang.String r0 = r2.description
            java.lang.String r3 = r3.description
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0047
            goto L_0x0049
        L_0x0047:
            r3 = 0
            return r3
        L_0x0049:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.LibraryLeak.equals(java.lang.Object):boolean");
    }

    public final String getClassName() {
        return this.className;
    }

    public final String getDescription() {
        return this.description;
    }

    public final LeakTrace getLeakTrace() {
        return this.leakTrace;
    }

    public final ReferencePattern getPattern() {
        return this.pattern;
    }

    public final Integer getRetainedHeapByteSize() {
        return this.retainedHeapByteSize;
    }

    public final int hashCode() {
        String className2 = getClassName();
        int i = 0;
        int hashCode = (className2 != null ? className2.hashCode() : 0) * 31;
        LeakTrace leakTrace2 = getLeakTrace();
        int hashCode2 = (hashCode + (leakTrace2 != null ? leakTrace2.hashCode() : 0)) * 31;
        Integer retainedHeapByteSize2 = getRetainedHeapByteSize();
        int hashCode3 = (hashCode2 + (retainedHeapByteSize2 != null ? retainedHeapByteSize2.hashCode() : 0)) * 31;
        ReferencePattern referencePattern = this.pattern;
        int hashCode4 = (hashCode3 + (referencePattern != null ? referencePattern.hashCode() : 0)) * 31;
        String str = this.description;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LibraryLeak(className=");
        sb.append(getClassName());
        sb.append(", leakTrace=");
        sb.append(getLeakTrace());
        sb.append(", retainedHeapByteSize=");
        sb.append(getRetainedHeapByteSize());
        sb.append(", pattern=");
        sb.append(this.pattern);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String createGroupHash() {
        return C48807m.m150709a(this.pattern.toString());
    }

    public LibraryLeak(String str, LeakTrace leakTrace2, Integer num, ReferencePattern referencePattern, String str2) {
        C7573i.m23587b(str, "className");
        C7573i.m23587b(leakTrace2, "leakTrace");
        C7573i.m23587b(referencePattern, "pattern");
        C7573i.m23587b(str2, "description");
        super(null);
        this.className = str;
        this.leakTrace = leakTrace2;
        this.retainedHeapByteSize = num;
        this.pattern = referencePattern;
        this.description = str2;
    }
}
