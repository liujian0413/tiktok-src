package kotlin;

import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7561a;

/* renamed from: kotlin.g */
public class C7556g {
    /* renamed from: a */
    public static final <T> C7541d<T> m23569a(C7561a<? extends T> aVar) {
        C7573i.m23587b(aVar, "initializer");
        return new C7578k<>(aVar, null, 2, null);
    }

    /* renamed from: a */
    public static final <T> C7541d<T> m23568a(LazyThreadSafetyMode lazyThreadSafetyMode, C7561a<? extends T> aVar) {
        C7573i.m23587b(lazyThreadSafetyMode, "mode");
        C7573i.m23587b(aVar, "initializer");
        switch (C7555f.f20882a[lazyThreadSafetyMode.ordinal()]) {
            case 1:
                return new C7578k<>(aVar, null, 2, null);
            case 2:
                return new C7558j<>(aVar);
            case 3:
                return new UnsafeLazyImpl<>(aVar);
            default:
                throw new NoWhenBranchMatchedException();
        }
    }
}
