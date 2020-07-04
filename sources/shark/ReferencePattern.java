package shark;

import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

public abstract class ReferencePattern implements Serializable {

    public static final class InstanceFieldPattern extends ReferencePattern {
        private final String className;
        private final String fieldName;

        public static /* synthetic */ InstanceFieldPattern copy$default(InstanceFieldPattern instanceFieldPattern, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = instanceFieldPattern.className;
            }
            if ((i & 2) != 0) {
                str2 = instanceFieldPattern.fieldName;
            }
            return instanceFieldPattern.copy(str, str2);
        }

        public final String component1() {
            return this.className;
        }

        public final String component2() {
            return this.fieldName;
        }

        public final InstanceFieldPattern copy(String str, String str2) {
            C7573i.m23587b(str, "className");
            C7573i.m23587b(str2, "fieldName");
            return new InstanceFieldPattern(str, str2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.fieldName, (java.lang.Object) r3.fieldName) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof shark.ReferencePattern.InstanceFieldPattern
                if (r0 == 0) goto L_0x001d
                shark.ReferencePattern$InstanceFieldPattern r3 = (shark.ReferencePattern.InstanceFieldPattern) r3
                java.lang.String r0 = r2.className
                java.lang.String r1 = r3.className
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.lang.String r0 = r2.fieldName
                java.lang.String r3 = r3.fieldName
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
            throw new UnsupportedOperationException("Method not decompiled: shark.ReferencePattern.InstanceFieldPattern.equals(java.lang.Object):boolean");
        }

        public final String getClassName() {
            return this.className;
        }

        public final String getFieldName() {
            return this.fieldName;
        }

        public final int hashCode() {
            String str = this.className;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.fieldName;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("instance field ");
            sb.append(this.className);
            sb.append('#');
            sb.append(this.fieldName);
            return sb.toString();
        }

        public InstanceFieldPattern(String str, String str2) {
            C7573i.m23587b(str, "className");
            C7573i.m23587b(str2, "fieldName");
            super(null);
            this.className = str;
            this.fieldName = str2;
        }
    }

    public static final class JavaLocalPattern extends ReferencePattern {
        private final String threadName;

        public static /* synthetic */ JavaLocalPattern copy$default(JavaLocalPattern javaLocalPattern, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = javaLocalPattern.threadName;
            }
            return javaLocalPattern.copy(str);
        }

        public final String component1() {
            return this.threadName;
        }

        public final JavaLocalPattern copy(String str) {
            C7573i.m23587b(str, "threadName");
            return new JavaLocalPattern(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.threadName, (java.lang.Object) ((shark.ReferencePattern.JavaLocalPattern) r2).threadName) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof shark.ReferencePattern.JavaLocalPattern
                if (r0 == 0) goto L_0x0013
                shark.ReferencePattern$JavaLocalPattern r2 = (shark.ReferencePattern.JavaLocalPattern) r2
                java.lang.String r0 = r1.threadName
                java.lang.String r2 = r2.threadName
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
            throw new UnsupportedOperationException("Method not decompiled: shark.ReferencePattern.JavaLocalPattern.equals(java.lang.Object):boolean");
        }

        public final String getThreadName() {
            return this.threadName;
        }

        public final int hashCode() {
            String str = this.threadName;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("local variable on thread ");
            sb.append(this.threadName);
            return sb.toString();
        }

        public JavaLocalPattern(String str) {
            C7573i.m23587b(str, "threadName");
            super(null);
            this.threadName = str;
        }
    }

    public static final class NativeGlobalVariablePattern extends ReferencePattern {
        private final String className;

        public static /* synthetic */ NativeGlobalVariablePattern copy$default(NativeGlobalVariablePattern nativeGlobalVariablePattern, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = nativeGlobalVariablePattern.className;
            }
            return nativeGlobalVariablePattern.copy(str);
        }

        public final String component1() {
            return this.className;
        }

        public final NativeGlobalVariablePattern copy(String str) {
            C7573i.m23587b(str, "className");
            return new NativeGlobalVariablePattern(str);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r1.className, (java.lang.Object) ((shark.ReferencePattern.NativeGlobalVariablePattern) r2).className) != false) goto L_0x0015;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r2) {
            /*
                r1 = this;
                if (r1 == r2) goto L_0x0015
                boolean r0 = r2 instanceof shark.ReferencePattern.NativeGlobalVariablePattern
                if (r0 == 0) goto L_0x0013
                shark.ReferencePattern$NativeGlobalVariablePattern r2 = (shark.ReferencePattern.NativeGlobalVariablePattern) r2
                java.lang.String r0 = r1.className
                java.lang.String r2 = r2.className
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
            throw new UnsupportedOperationException("Method not decompiled: shark.ReferencePattern.NativeGlobalVariablePattern.equals(java.lang.Object):boolean");
        }

        public final String getClassName() {
            return this.className;
        }

        public final int hashCode() {
            String str = this.className;
            if (str != null) {
                return str.hashCode();
            }
            return 0;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("native global variable referencing ");
            sb.append(this.className);
            return sb.toString();
        }

        public NativeGlobalVariablePattern(String str) {
            C7573i.m23587b(str, "className");
            super(null);
            this.className = str;
        }
    }

    public static final class StaticFieldPattern extends ReferencePattern {
        private final String className;
        private final String fieldName;

        public static /* synthetic */ StaticFieldPattern copy$default(StaticFieldPattern staticFieldPattern, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = staticFieldPattern.className;
            }
            if ((i & 2) != 0) {
                str2 = staticFieldPattern.fieldName;
            }
            return staticFieldPattern.copy(str, str2);
        }

        public final String component1() {
            return this.className;
        }

        public final String component2() {
            return this.fieldName;
        }

        public final StaticFieldPattern copy(String str, String str2) {
            C7573i.m23587b(str, "className");
            C7573i.m23587b(str2, "fieldName");
            return new StaticFieldPattern(str, str2);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
            if (kotlin.jvm.internal.C7573i.m23585a((java.lang.Object) r2.fieldName, (java.lang.Object) r3.fieldName) != false) goto L_0x001f;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean equals(java.lang.Object r3) {
            /*
                r2 = this;
                if (r2 == r3) goto L_0x001f
                boolean r0 = r3 instanceof shark.ReferencePattern.StaticFieldPattern
                if (r0 == 0) goto L_0x001d
                shark.ReferencePattern$StaticFieldPattern r3 = (shark.ReferencePattern.StaticFieldPattern) r3
                java.lang.String r0 = r2.className
                java.lang.String r1 = r3.className
                boolean r0 = kotlin.jvm.internal.C7573i.m23585a(r0, r1)
                if (r0 == 0) goto L_0x001d
                java.lang.String r0 = r2.fieldName
                java.lang.String r3 = r3.fieldName
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
            throw new UnsupportedOperationException("Method not decompiled: shark.ReferencePattern.StaticFieldPattern.equals(java.lang.Object):boolean");
        }

        public final String getClassName() {
            return this.className;
        }

        public final String getFieldName() {
            return this.fieldName;
        }

        public final int hashCode() {
            String str = this.className;
            int i = 0;
            int hashCode = (str != null ? str.hashCode() : 0) * 31;
            String str2 = this.fieldName;
            if (str2 != null) {
                i = str2.hashCode();
            }
            return hashCode + i;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("static field ");
            sb.append(this.className);
            sb.append('#');
            sb.append(this.fieldName);
            return sb.toString();
        }

        public StaticFieldPattern(String str, String str2) {
            C7573i.m23587b(str, "className");
            C7573i.m23587b(str2, "fieldName");
            super(null);
            this.className = str;
            this.fieldName = str2;
        }
    }

    private ReferencePattern() {
    }

    public /* synthetic */ ReferencePattern(C7571f fVar) {
        this();
    }
}
