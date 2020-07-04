package kotlin.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C7573i;
import kotlin.p355d.C47960b;
import kotlin.p355d.C7542d;

/* renamed from: kotlin.internal.a */
public class C47966a {

    /* renamed from: kotlin.internal.a$a */
    static final class C47967a {

        /* renamed from: a */
        public static final Method f122804a;

        /* renamed from: b */
        public static final C47967a f122805b = new C47967a();

        private C47967a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:13:0x0049 A[EDGE_INSN: B:13:0x0049->B:11:0x0049 ?: BREAK  , SYNTHETIC] */
        /* JADX WARNING: Removed duplicated region for block: B:9:0x0045 A[LOOP:0: B:1:0x0015->B:9:0x0045, LOOP_END] */
        static {
            /*
                kotlin.internal.a$a r0 = new kotlin.internal.a$a
                r0.<init>()
                f122805b = r0
                java.lang.Class<java.lang.Throwable> r0 = java.lang.Throwable.class
                java.lang.reflect.Method[] r1 = r0.getMethods()
                java.lang.String r2 = "throwableClass.methods"
                kotlin.jvm.internal.C7573i.m23582a(r1, r2)
                int r2 = r1.length
                r3 = 0
                r4 = 0
            L_0x0015:
                if (r4 >= r2) goto L_0x0048
                r5 = r1[r4]
                java.lang.String r6 = "it"
                kotlin.jvm.internal.C7573i.m23582a(r5, r6)
                java.lang.String r6 = r5.getName()
                java.lang.String r7 = "addSuppressed"
                boolean r6 = kotlin.jvm.internal.C7573i.m23585a(r6, r7)
                if (r6 == 0) goto L_0x0041
                java.lang.Class[] r6 = r5.getParameterTypes()
                java.lang.String r7 = "it.parameterTypes"
                kotlin.jvm.internal.C7573i.m23582a(r6, r7)
                java.lang.Object r6 = kotlin.collections.C7519g.m23436b((T[]) r6)
                java.lang.Class r6 = (java.lang.Class) r6
                boolean r6 = kotlin.jvm.internal.C7573i.m23585a(r6, r0)
                if (r6 == 0) goto L_0x0041
                r6 = 1
                goto L_0x0042
            L_0x0041:
                r6 = 0
            L_0x0042:
                if (r6 == 0) goto L_0x0045
                goto L_0x0049
            L_0x0045:
                int r4 = r4 + 1
                goto L_0x0015
            L_0x0048:
                r5 = 0
            L_0x0049:
                f122804a = r5
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.internal.C47966a.C47967a.<clinit>():void");
        }
    }

    /* renamed from: a */
    public C7542d mo120165a() {
        return new C47960b();
    }

    /* renamed from: a */
    public void mo120166a(Throwable th, Throwable th2) {
        C7573i.m23587b(th, "cause");
        C7573i.m23587b(th2, "exception");
        Method method = C47967a.f122804a;
        if (method != null) {
            method.invoke(th, new Object[]{th2});
        }
    }
}
