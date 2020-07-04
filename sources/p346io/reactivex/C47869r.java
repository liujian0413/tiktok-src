package p346io.reactivex;

import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.util.NotificationLite;

/* renamed from: io.reactivex.r */
public final class C47869r<T> {

    /* renamed from: b */
    static final C47869r<Object> f122681b = new C47869r<>(null);

    /* renamed from: a */
    final Object f122682a;

    /* renamed from: a */
    public static <T> C47869r<T> m148777a() {
        return f122681b;
    }

    public final int hashCode() {
        Object obj = this.f122682a;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        Object obj = this.f122682a;
        if (obj == null) {
            return "OnCompleteNotification";
        }
        if (NotificationLite.isError(obj)) {
            StringBuilder sb = new StringBuilder("OnErrorNotification[");
            sb.append(NotificationLite.getError(obj));
            sb.append("]");
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder("OnNextNotification[");
        sb2.append(this.f122682a);
        sb2.append("]");
        return sb2.toString();
    }

    private C47869r(Object obj) {
        this.f122682a = obj;
    }

    /* renamed from: a */
    public static <T> C47869r<T> m148778a(T t) {
        C7364b.m23081a(t, "value is null");
        return new C47869r<>(t);
    }

    /* renamed from: a */
    public static <T> C47869r<T> m148779a(Throwable th) {
        C7364b.m23081a(th, "error is null");
        return new C47869r<>(NotificationLite.error(th));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C47869r)) {
            return false;
        }
        return C7364b.m23082a(this.f122682a, ((C47869r) obj).f122682a);
    }
}
