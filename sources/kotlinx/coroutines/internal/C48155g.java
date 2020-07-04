package kotlinx.coroutines.internal;

import java.lang.reflect.Constructor;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.ReadLock;
import java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock;
import kotlin.C47965i;
import kotlin.Result;
import kotlin.TypeCastException;
import kotlin.collections.C7519g;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.p1877a.C47886a;

/* renamed from: kotlinx.coroutines.internal.g */
public final class C48155g {

    /* renamed from: a */
    private static final ReentrantReadWriteLock f123004a = new ReentrantReadWriteLock();

    /* renamed from: b */
    private static final WeakHashMap<Class<? extends Throwable>, C7562b<Throwable, Throwable>> f123005b = new WeakHashMap<>();

    /* renamed from: kotlinx.coroutines.internal.g$a */
    public static final class C48156a<T> implements Comparator<T> {
        public final int compare(T t, T t2) {
            Constructor constructor = (Constructor) t2;
            C7573i.m23582a((Object) constructor, "it");
            Comparable valueOf = Integer.valueOf(constructor.getParameterTypes().length);
            Constructor constructor2 = (Constructor) t;
            C7573i.m23582a((Object) constructor2, "it");
            return C47886a.m148819a(valueOf, Integer.valueOf(constructor2.getParameterTypes().length));
        }
    }

    /* renamed from: kotlinx.coroutines.internal.g$b */
    static final class C48157b extends Lambda implements C7562b<Throwable, E> {

        /* renamed from: a */
        final /* synthetic */ Constructor f123006a;

        C48157b(Constructor constructor) {
            this.f123006a = constructor;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public E invoke(Throwable th) {
            E e;
            C7573i.m23587b(th, "e");
            try {
                Object newInstance = this.f123006a.newInstance(new Object[]{th.getMessage(), th});
                if (newInstance != null) {
                    e = Result.m150902constructorimpl((Throwable) newInstance);
                    if (Result.m150908isFailureimpl(e)) {
                        e = null;
                    }
                    return (Throwable) e;
                }
                throw new TypeCastException("null cannot be cast to non-null type E");
            } catch (Throwable th2) {
                e = Result.m150902constructorimpl(C47965i.m148906a(th2));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.g$c */
    static final class C48158c extends Lambda implements C7562b<Throwable, E> {

        /* renamed from: a */
        final /* synthetic */ Constructor f123007a;

        C48158c(Constructor constructor) {
            this.f123007a = constructor;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public E invoke(Throwable th) {
            E e;
            C7573i.m23587b(th, "e");
            try {
                Object newInstance = this.f123007a.newInstance(new Object[]{th});
                if (newInstance != null) {
                    e = Result.m150902constructorimpl((Throwable) newInstance);
                    if (Result.m150908isFailureimpl(e)) {
                        e = null;
                    }
                    return (Throwable) e;
                }
                throw new TypeCastException("null cannot be cast to non-null type E");
            } catch (Throwable th2) {
                e = Result.m150902constructorimpl(C47965i.m148906a(th2));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.g$d */
    static final class C48159d extends Lambda implements C7562b<Throwable, E> {

        /* renamed from: a */
        final /* synthetic */ Constructor f123008a;

        C48159d(Constructor constructor) {
            this.f123008a = constructor;
            super(1);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public E invoke(Throwable th) {
            E e;
            C7573i.m23587b(th, "e");
            try {
                Object newInstance = this.f123008a.newInstance(new Object[0]);
                if (newInstance != null) {
                    e = Result.m150902constructorimpl((Throwable) newInstance);
                    if (Result.m150908isFailureimpl(e)) {
                        e = null;
                    }
                    E e2 = (Throwable) e;
                    if (e2 == null) {
                        return null;
                    }
                    e2.initCause(th);
                    return e2;
                }
                throw new TypeCastException("null cannot be cast to non-null type E");
            } catch (Throwable th2) {
                e = Result.m150902constructorimpl(C47965i.m148906a(th2));
            }
        }
    }

    /* renamed from: kotlinx.coroutines.internal.g$e */
    static final class C48160e extends Lambda implements C7562b {

        /* renamed from: a */
        public static final C48160e f123009a = new C48160e();

        C48160e() {
            super(1);
        }

        /* renamed from: a */
        private static Void m149408a(Throwable th) {
            C7573i.m23587b(th, "it");
            return null;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m149408a((Throwable) obj);
        }
    }

    /* renamed from: a */
    public static final <E extends Throwable> E m149404a(E e) {
        int i;
        C7562b bVar;
        int i2;
        C7562b bVar2;
        C7573i.m23587b(e, "exception");
        ReadLock readLock = f123004a.readLock();
        readLock.lock();
        try {
            C7562b bVar3 = (C7562b) f123005b.get(e.getClass());
            if (bVar3 != null) {
                return (Throwable) bVar3.invoke(e);
            }
            Constructor[] constructors = e.getClass().getConstructors();
            C7573i.m23582a((Object) constructors, "exception.javaClass.constructors");
            Iterator it = C7519g.m23445c((T[]) constructors, (Comparator<? super T>) new C48156a<Object>()).iterator();
            while (true) {
                i = 0;
                if (!it.hasNext()) {
                    bVar = null;
                    break;
                }
                Constructor constructor = (Constructor) it.next();
                C7573i.m23582a((Object) constructor, "constructor");
                Class[] parameterTypes = constructor.getParameterTypes();
                boolean z = true;
                if (parameterTypes.length != 2 || !C7573i.m23585a((Object) parameterTypes[i], (Object) String.class) || !C7573i.m23585a((Object) parameterTypes[1], (Object) Throwable.class)) {
                    if (parameterTypes.length == 1 && C7573i.m23585a((Object) parameterTypes[i], (Object) Throwable.class)) {
                        bVar = new C48158c(constructor);
                        break;
                    }
                    C7573i.m23582a((Object) parameterTypes, "parameters");
                    if (parameterTypes.length != 0) {
                        z = false;
                        continue;
                    }
                    if (z) {
                        bVar = new C48159d(constructor);
                        break;
                    }
                } else {
                    bVar = new C48157b(constructor);
                    break;
                }
            }
            ReentrantReadWriteLock reentrantReadWriteLock = f123004a;
            ReadLock readLock2 = reentrantReadWriteLock.readLock();
            if (reentrantReadWriteLock.getWriteHoldCount() == 0) {
                i2 = reentrantReadWriteLock.getReadHoldCount();
            } else {
                i2 = 0;
            }
            for (int i3 = 0; i3 < i2; i3++) {
                readLock2.unlock();
            }
            WriteLock writeLock = reentrantReadWriteLock.writeLock();
            writeLock.lock();
            try {
                Map map = f123005b;
                Class cls = e.getClass();
                if (bVar == null) {
                    bVar2 = C48160e.f123009a;
                } else {
                    bVar2 = bVar;
                }
                map.put(cls, bVar2);
                writeLock.unlock();
                if (bVar != null) {
                    return (Throwable) bVar.invoke(e);
                }
                return null;
            } finally {
                while (i < i2) {
                    readLock2.lock();
                    i++;
                }
                writeLock.unlock();
            }
        } finally {
            readLock.unlock();
        }
    }
}
