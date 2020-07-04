package p346io.reactivex.internal.util;

import java.io.Serializable;
import org.p361a.C48293c;
import org.p361a.C48294d;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.p347b.C7321c;

/* renamed from: io.reactivex.internal.util.NotificationLite */
public enum NotificationLite {
    COMPLETE;

    /* renamed from: io.reactivex.internal.util.NotificationLite$a */
    static final class C47829a implements Serializable {
        private static final long serialVersionUID = -7482590109178395495L;

        /* renamed from: a */
        final C7321c f122615a;

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationLite.Disposable[");
            sb.append(this.f122615a);
            sb.append("]");
            return sb.toString();
        }

        C47829a(C7321c cVar) {
            this.f122615a = cVar;
        }
    }

    /* renamed from: io.reactivex.internal.util.NotificationLite$b */
    static final class C47830b implements Serializable {
        private static final long serialVersionUID = -8759979445933046293L;

        /* renamed from: a */
        final Throwable f122616a;

        public final int hashCode() {
            return this.f122616a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationLite.Error[");
            sb.append(this.f122616a);
            sb.append("]");
            return sb.toString();
        }

        C47830b(Throwable th) {
            this.f122616a = th;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof C47830b)) {
                return false;
            }
            return C7364b.m23082a((Object) this.f122616a, (Object) ((C47830b) obj).f122616a);
        }
    }

    /* renamed from: io.reactivex.internal.util.NotificationLite$c */
    static final class C47831c implements Serializable {
        private static final long serialVersionUID = -1322257508628817540L;

        /* renamed from: a */
        final C48294d f122617a;

        public final String toString() {
            StringBuilder sb = new StringBuilder("NotificationLite.Subscription[");
            sb.append(this.f122617a);
            sb.append("]");
            return sb.toString();
        }

        C47831c(C48294d dVar) {
            this.f122617a = dVar;
        }
    }

    public static Object complete() {
        return COMPLETE;
    }

    public static <T> T getValue(Object obj) {
        return obj;
    }

    public static <T> Object next(T t) {
        return t;
    }

    public final String toString() {
        return "NotificationLite.Complete";
    }

    public static boolean isDisposable(Object obj) {
        return obj instanceof C47829a;
    }

    public static boolean isError(Object obj) {
        return obj instanceof C47830b;
    }

    public static boolean isSubscription(Object obj) {
        return obj instanceof C47831c;
    }

    public static Object disposable(C7321c cVar) {
        return new C47829a(cVar);
    }

    public static Object error(Throwable th) {
        return new C47830b(th);
    }

    public static C7321c getDisposable(Object obj) {
        return ((C47829a) obj).f122615a;
    }

    public static Throwable getError(Object obj) {
        return ((C47830b) obj).f122616a;
    }

    public static C48294d getSubscription(Object obj) {
        return ((C47831c) obj).f122617a;
    }

    public static boolean isComplete(Object obj) {
        if (obj == COMPLETE) {
            return true;
        }
        return false;
    }

    public static Object subscription(C48294d dVar) {
        return new C47831c(dVar);
    }

    public static <T> boolean accept(Object obj, C7498y<? super T> yVar) {
        if (obj == COMPLETE) {
            yVar.onComplete();
            return true;
        } else if (obj instanceof C47830b) {
            yVar.onError(((C47830b) obj).f122616a);
            return true;
        } else {
            yVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean accept(Object obj, C48293c<? super T> cVar) {
        if (obj == COMPLETE) {
            cVar.onComplete();
            return true;
        } else if (obj instanceof C47830b) {
            cVar.onError(((C47830b) obj).f122616a);
            return true;
        } else {
            cVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, C7498y<? super T> yVar) {
        if (obj == COMPLETE) {
            yVar.onComplete();
            return true;
        } else if (obj instanceof C47830b) {
            yVar.onError(((C47830b) obj).f122616a);
            return true;
        } else if (obj instanceof C47829a) {
            yVar.onSubscribe(((C47829a) obj).f122615a);
            return false;
        } else {
            yVar.onNext(obj);
            return false;
        }
    }

    public static <T> boolean acceptFull(Object obj, C48293c<? super T> cVar) {
        if (obj == COMPLETE) {
            cVar.onComplete();
            return true;
        } else if (obj instanceof C47830b) {
            cVar.onError(((C47830b) obj).f122616a);
            return true;
        } else if (obj instanceof C47831c) {
            cVar.onSubscribe(((C47831c) obj).f122617a);
            return false;
        } else {
            cVar.onNext(obj);
            return false;
        }
    }
}
