package kotlin.coroutines.jvm.internal;

import java.lang.reflect.Method;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.coroutines.jvm.internal.g */
final class C47956g {

    /* renamed from: a */
    public static C47957a f122787a;

    /* renamed from: b */
    public static final C47956g f122788b = new C47956g();

    /* renamed from: c */
    private static final C47957a f122789c = new C47957a(null, null, null);

    /* renamed from: kotlin.coroutines.jvm.internal.g$a */
    static final class C47957a {

        /* renamed from: a */
        public final Method f122790a;

        /* renamed from: b */
        public final Method f122791b;

        /* renamed from: c */
        public final Method f122792c;

        public C47957a(Method method, Method method2, Method method3) {
            this.f122790a = method;
            this.f122791b = method2;
            this.f122792c = method3;
        }
    }

    private C47956g() {
    }

    /* renamed from: b */
    private static C47957a m148892b(BaseContinuationImpl baseContinuationImpl) {
        try {
            C47957a aVar = new C47957a(Class.class.getDeclaredMethod("getModule", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", new Class[0]), baseContinuationImpl.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", new Class[0]));
            f122787a = aVar;
            return aVar;
        } catch (Exception unused) {
            C47957a aVar2 = f122789c;
            f122787a = aVar2;
            return aVar2;
        }
    }

    /* renamed from: a */
    public final String mo120161a(BaseContinuationImpl baseContinuationImpl) {
        Object obj;
        C7573i.m23587b(baseContinuationImpl, "continuation");
        C47957a aVar = f122787a;
        if (aVar == null) {
            aVar = m148892b(baseContinuationImpl);
        }
        if (aVar == f122789c) {
            return null;
        }
        Method method = aVar.f122790a;
        if (method != null) {
            Object invoke = method.invoke(baseContinuationImpl.getClass(), new Object[0]);
            if (invoke != null) {
                Method method2 = aVar.f122791b;
                if (method2 != null) {
                    Object invoke2 = method2.invoke(invoke, new Object[0]);
                    if (invoke2 != null) {
                        Method method3 = aVar.f122792c;
                        if (method3 != null) {
                            obj = method3.invoke(invoke2, new Object[0]);
                        } else {
                            obj = null;
                        }
                        if (!(obj instanceof String)) {
                            obj = null;
                        }
                        return (String) obj;
                    }
                }
                return null;
            }
        }
        return null;
    }
}
