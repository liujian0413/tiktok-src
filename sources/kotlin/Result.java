package kotlin;

import java.io.Serializable;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

public final class Result<T> implements Serializable {
    public static final C47884a Companion = new C47884a(null);
    private final Object value;

    public static final class Failure implements Serializable {
        public final Throwable exception;

        public final int hashCode() {
            return this.exception.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Failure(");
            sb.append(this.exception);
            sb.append(')');
            return sb.toString();
        }

        public Failure(Throwable th) {
            C7573i.m23587b(th, "exception");
            this.exception = th;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Failure) || !C7573i.m23585a((Object) this.exception, (Object) ((Failure) obj).exception)) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: kotlin.Result$a */
    public static final class C47884a {
        private C47884a() {
        }

        public /* synthetic */ C47884a(C7571f fVar) {
            this();
        }
    }

    /* renamed from: box-impl reason: not valid java name */
    public static final /* synthetic */ Result m150901boximpl(Object obj) {
        return new Result(obj);
    }

    /* renamed from: constructor-impl reason: not valid java name */
    public static Object m150902constructorimpl(Object obj) {
        return obj;
    }

    /* renamed from: equals-impl reason: not valid java name */
    public static boolean m150903equalsimpl(Object obj, Object obj2) {
        return (obj2 instanceof Result) && C7573i.m23585a(obj, ((Result) obj2).m150911unboximpl());
    }

    /* renamed from: equals-impl0 reason: not valid java name */
    public static final boolean m150904equalsimpl0(Object obj, Object obj2) {
        throw null;
    }

    /* renamed from: hashCode-impl reason: not valid java name */
    public static int m150907hashCodeimpl(Object obj) {
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public static /* synthetic */ void value$annotations() {
    }

    /* renamed from: unbox-impl reason: not valid java name */
    public final /* synthetic */ Object m150911unboximpl() {
        return this.value;
    }

    public final int hashCode() {
        return m150907hashCodeimpl(this.value);
    }

    public final String toString() {
        return m150910toStringimpl(this.value);
    }

    /* renamed from: isFailure-impl reason: not valid java name */
    public static final boolean m150908isFailureimpl(Object obj) {
        return obj instanceof Failure;
    }

    private /* synthetic */ Result(Object obj) {
        this.value = obj;
    }

    /* renamed from: isSuccess-impl reason: not valid java name */
    public static final boolean m150909isSuccessimpl(Object obj) {
        if (!(obj instanceof Failure)) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        return m150903equalsimpl(this.value, obj);
    }

    /* renamed from: exceptionOrNull-impl reason: not valid java name */
    public static final Throwable m150905exceptionOrNullimpl(Object obj) {
        if (obj instanceof Failure) {
            return ((Failure) obj).exception;
        }
        return null;
    }

    /* renamed from: getOrNull-impl reason: not valid java name */
    private static final T m150906getOrNullimpl(Object obj) {
        if (m150908isFailureimpl(obj)) {
            return null;
        }
        return obj;
    }

    /* renamed from: toString-impl reason: not valid java name */
    public static String m150910toStringimpl(Object obj) {
        if (obj instanceof Failure) {
            return obj.toString();
        }
        StringBuilder sb = new StringBuilder("Success(");
        sb.append(obj);
        sb.append(')');
        return sb.toString();
    }
}
