package kotlin.coroutines;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result.Failure;
import kotlin.coroutines.intrinsics.C47948a;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.C47953c;
import kotlin.jvm.internal.C7571f;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.coroutines.f */
public final class C47940f<T> implements C47919b<T>, C47953c {

    /* renamed from: a */
    public static final C47941a f122782a = new C47941a(null);

    /* renamed from: d */
    private static final AtomicReferenceFieldUpdater<C47940f<?>, Object> f122783d = AtomicReferenceFieldUpdater.newUpdater(C47940f.class, Object.class, "b");

    /* renamed from: b */
    private volatile Object f122784b;

    /* renamed from: c */
    private final C47919b<T> f122785c;

    /* renamed from: kotlin.coroutines.f$a */
    static final class C47941a {
        private C47941a() {
        }

        public /* synthetic */ C47941a(C7571f fVar) {
            this();
        }
    }

    public final StackTraceElement getStackTraceElement() {
        return null;
    }

    public final C47924e getContext() {
        return this.f122785c.getContext();
    }

    public final C47953c getCallerFrame() {
        C47919b<T> bVar = this.f122785c;
        if (!(bVar instanceof C47953c)) {
            bVar = null;
        }
        return (C47953c) bVar;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SafeContinuation for ");
        sb.append(this.f122785c);
        return sb.toString();
    }

    /* renamed from: a */
    public final Object mo120151a() {
        Object obj = this.f122784b;
        if (obj == CoroutineSingletons.UNDECIDED) {
            if (f122783d.compareAndSet(this, CoroutineSingletons.UNDECIDED, C47948a.m148881a())) {
                return C47948a.m148881a();
            }
            obj = this.f122784b;
        }
        if (obj == CoroutineSingletons.RESUMED) {
            return C47948a.m148881a();
        }
        if (!(obj instanceof Failure)) {
            return obj;
        }
        throw ((Failure) obj).exception;
    }

    public C47940f(C47919b<? super T> bVar) {
        C7573i.m23587b(bVar, "delegate");
        this(bVar, CoroutineSingletons.UNDECIDED);
    }

    public final void resumeWith(Object obj) {
        while (true) {
            Object obj2 = this.f122784b;
            if (obj2 == CoroutineSingletons.UNDECIDED) {
                if (f122783d.compareAndSet(this, CoroutineSingletons.UNDECIDED, obj)) {
                    return;
                }
            } else if (obj2 != C47948a.m148881a()) {
                throw new IllegalStateException("Already resumed");
            } else if (f122783d.compareAndSet(this, C47948a.m148881a(), CoroutineSingletons.RESUMED)) {
                this.f122785c.resumeWith(obj);
                return;
            }
        }
    }

    private C47940f(C47919b<? super T> bVar, Object obj) {
        C7573i.m23587b(bVar, "delegate");
        this.f122785c = bVar;
        this.f122784b = obj;
    }
}
