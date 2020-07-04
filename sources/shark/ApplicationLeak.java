package shark;

import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import shark.internal.C48807m;

public final class ApplicationLeak extends Leak {
    private final String className;
    private final LeakTrace leakTrace;
    private final Integer retainedHeapByteSize;

    /* renamed from: shark.ApplicationLeak$a */
    static final class C48693a extends Lambda implements C7562b<LeakTraceElement, String> {

        /* renamed from: a */
        public static final C48693a f123811a = new C48693a();

        C48693a() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m150435a((LeakTraceElement) obj);
        }

        /* renamed from: a */
        private static String m150435a(LeakTraceElement leakTraceElement) {
            C7573i.m23587b(leakTraceElement, "element");
            LeakReference reference = leakTraceElement.getReference();
            if (reference == null) {
                C7573i.m23580a();
            }
            String groupingName = reference.getGroupingName();
            StringBuilder sb = new StringBuilder();
            sb.append(leakTraceElement.getClassName());
            sb.append(groupingName);
            return sb.toString();
        }
    }

    public static /* synthetic */ ApplicationLeak copy$default(ApplicationLeak applicationLeak, String str, LeakTrace leakTrace2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = applicationLeak.getClassName();
        }
        if ((i & 2) != 0) {
            leakTrace2 = applicationLeak.getLeakTrace();
        }
        if ((i & 4) != 0) {
            num = applicationLeak.getRetainedHeapByteSize();
        }
        return applicationLeak.copy(str, leakTrace2, num);
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

    public final ApplicationLeak copy(String str, LeakTrace leakTrace2, Integer num) {
        C7573i.m23587b(str, "className");
        C7573i.m23587b(leakTrace2, "leakTrace");
        return new ApplicationLeak(str, leakTrace2, num);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0030, code lost:
        if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) getRetainedHeapByteSize(), (java.lang.Object) r3.getRetainedHeapByteSize()) != false) goto L_0x0035;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0035
            boolean r0 = r3 instanceof shark.ApplicationLeak
            if (r0 == 0) goto L_0x0033
            shark.ApplicationLeak r3 = (shark.ApplicationLeak) r3
            java.lang.String r0 = r2.getClassName()
            java.lang.String r1 = r3.getClassName()
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0033
            shark.LeakTrace r0 = r2.getLeakTrace()
            shark.LeakTrace r1 = r3.getLeakTrace()
            boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
            if (r0 == 0) goto L_0x0033
            java.lang.Integer r0 = r2.getRetainedHeapByteSize()
            java.lang.Integer r3 = r3.getRetainedHeapByteSize()
            boolean r3 = kotlin.jvm.internal.C7573i.m23585a(r0, r3)
            if (r3 == 0) goto L_0x0033
            goto L_0x0035
        L_0x0033:
            r3 = 0
            return r3
        L_0x0035:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: shark.ApplicationLeak.equals(java.lang.Object):boolean");
    }

    public final String getClassName() {
        return this.className;
    }

    public final LeakTrace getLeakTrace() {
        return this.leakTrace;
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
        if (retainedHeapByteSize2 != null) {
            i = retainedHeapByteSize2.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ApplicationLeak(className=");
        sb.append(getClassName());
        sb.append(", leakTrace=");
        sb.append(getLeakTrace());
        sb.append(", retainedHeapByteSize=");
        sb.append(getRetainedHeapByteSize());
        sb.append(")");
        return sb.toString();
    }

    /* access modifiers changed from: protected */
    public final String createGroupHash() {
        return C48807m.m150709a(C7525m.m23492a(getLeakTrace().getLeakCauses(), "", null, null, 0, null, C48693a.f123811a, 30, null));
    }

    public ApplicationLeak(String str, LeakTrace leakTrace2, Integer num) {
        C7573i.m23587b(str, "className");
        C7573i.m23587b(leakTrace2, "leakTrace");
        super(null);
        this.className = str;
        this.leakTrace = leakTrace2;
        this.retainedHeapByteSize = num;
    }
}
