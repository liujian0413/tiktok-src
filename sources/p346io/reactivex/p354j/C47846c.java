package p346io.reactivex.p354j;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import p346io.reactivex.C7498y;
import p346io.reactivex.internal.p352a.C7364b;
import p346io.reactivex.internal.util.NotificationLite;
import p346io.reactivex.p347b.C7321c;
import p346io.reactivex.p350f.C7332a;

/* renamed from: io.reactivex.j.c */
public final class C47846c<T> extends C7489f<T> {

    /* renamed from: c */
    static final C47848b[] f122646c = new C47848b[0];

    /* renamed from: d */
    static final C47848b[] f122647d = new C47848b[0];

    /* renamed from: f */
    private static final Object[] f122648f = new Object[0];

    /* renamed from: a */
    final C47847a<T> f122649a;

    /* renamed from: b */
    final AtomicReference<C47848b<T>[]> f122650b = new AtomicReference<>(f122646c);

    /* renamed from: e */
    boolean f122651e;

    /* renamed from: io.reactivex.j.c$a */
    interface C47847a<T> {
        /* renamed from: a */
        void mo119922a(C47848b<T> bVar);

        /* renamed from: a */
        void mo119923a(T t);

        /* renamed from: b */
        void mo119924b(Object obj);

        boolean compareAndSet(Object obj, Object obj2);
    }

    /* renamed from: io.reactivex.j.c$b */
    static final class C47848b<T> extends AtomicInteger implements C7321c {
        private static final long serialVersionUID = 466549804534799122L;

        /* renamed from: a */
        final C7498y<? super T> f122652a;

        /* renamed from: b */
        final C47846c<T> f122653b;

        /* renamed from: c */
        Object f122654c;

        /* renamed from: d */
        volatile boolean f122655d;

        public final boolean isDisposed() {
            return this.f122655d;
        }

        public final void dispose() {
            if (!this.f122655d) {
                this.f122655d = true;
                this.f122653b.mo119921a(this);
            }
        }

        C47848b(C7498y<? super T> yVar, C47846c<T> cVar) {
            this.f122652a = yVar;
            this.f122653b = cVar;
        }
    }

    /* renamed from: io.reactivex.j.c$c */
    static final class C47849c<T> extends AtomicReference<Object> implements C47847a<T> {
        private static final long serialVersionUID = -733876083048047795L;

        /* renamed from: a */
        final List<Object> f122656a = new ArrayList(C7364b.m23078a(16, "capacityHint"));

        /* renamed from: b */
        volatile boolean f122657b;

        /* renamed from: c */
        volatile int f122658c;

        /* renamed from: a */
        public final void mo119923a(T t) {
            this.f122656a.add(t);
            this.f122658c++;
        }

        /* renamed from: b */
        public final void mo119924b(Object obj) {
            this.f122656a.add(obj);
            this.f122658c++;
            this.f122657b = true;
        }

        C47849c(int i) {
        }

        /* renamed from: a */
        public final void mo119922a(C47848b<T> bVar) {
            if (bVar.getAndIncrement() == 0) {
                List<Object> list = this.f122656a;
                C7498y<? super T> yVar = bVar.f122652a;
                Integer num = (Integer) bVar.f122654c;
                int i = 0;
                if (num != null) {
                    i = num.intValue();
                } else {
                    bVar.f122654c = Integer.valueOf(0);
                }
                int i2 = 1;
                while (!bVar.f122655d) {
                    int i3 = this.f122658c;
                    while (i3 != i) {
                        if (bVar.f122655d) {
                            bVar.f122654c = null;
                            return;
                        }
                        Object obj = list.get(i);
                        if (this.f122657b) {
                            int i4 = i + 1;
                            if (i4 == i3) {
                                i3 = this.f122658c;
                                if (i4 == i3) {
                                    if (NotificationLite.isComplete(obj)) {
                                        yVar.onComplete();
                                    } else {
                                        yVar.onError(NotificationLite.getError(obj));
                                    }
                                    bVar.f122654c = null;
                                    bVar.f122655d = true;
                                    return;
                                }
                            } else {
                                continue;
                            }
                        }
                        yVar.onNext(obj);
                        i++;
                    }
                    if (i == this.f122658c) {
                        bVar.f122654c = Integer.valueOf(i);
                        i2 = bVar.addAndGet(-i2);
                        if (i2 == 0) {
                            return;
                        }
                    }
                }
                bVar.f122654c = null;
            }
        }
    }

    /* renamed from: a */
    public static <T> C47846c<T> m148754a() {
        return new C47846c<>(new C47849c(16));
    }

    public final void onComplete() {
        if (!this.f122651e) {
            this.f122651e = true;
            Object complete = NotificationLite.complete();
            C47847a<T> aVar = this.f122649a;
            aVar.mo119924b(complete);
            for (C47848b a : m148755a(complete)) {
                aVar.mo119922a(a);
            }
        }
    }

    public final void onSubscribe(C7321c cVar) {
        if (this.f122651e) {
            cVar.dispose();
        }
    }

    private C47846c(C47847a<T> aVar) {
        this.f122649a = aVar;
    }

    /* renamed from: a */
    private C47848b<T>[] m148755a(Object obj) {
        if (this.f122649a.compareAndSet(null, obj)) {
            return (C47848b[]) this.f122650b.getAndSet(f122647d);
        }
        return f122647d;
    }

    /* renamed from: a_ */
    public final void mo10166a_(C7498y<? super T> yVar) {
        C47848b bVar = new C47848b(yVar, this);
        yVar.onSubscribe(bVar);
        if (!bVar.f122655d) {
            if (!m148756b(bVar) || !bVar.f122655d) {
                this.f122649a.mo119922a(bVar);
            } else {
                mo119921a(bVar);
            }
        }
    }

    /* renamed from: b */
    private boolean m148756b(C47848b<T> bVar) {
        C47848b[] bVarArr;
        C47848b[] bVarArr2;
        do {
            bVarArr = (C47848b[]) this.f122650b.get();
            if (bVarArr == f122647d) {
                return false;
            }
            int length = bVarArr.length;
            bVarArr2 = new C47848b[(length + 1)];
            System.arraycopy(bVarArr, 0, bVarArr2, 0, length);
            bVarArr2[length] = bVar;
        } while (!this.f122650b.compareAndSet(bVarArr, bVarArr2));
        return true;
    }

    public final void onError(Throwable th) {
        C7364b.m23081a(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f122651e) {
            C7332a.m23029a(th);
            return;
        }
        this.f122651e = true;
        Object error = NotificationLite.error(th);
        C47847a<T> aVar = this.f122649a;
        aVar.mo119924b(error);
        for (C47848b a : m148755a(error)) {
            aVar.mo119922a(a);
        }
    }

    public final void onNext(T t) {
        C7364b.m23081a(t, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!this.f122651e) {
            C47847a<T> aVar = this.f122649a;
            aVar.mo119923a(t);
            for (C47848b a : (C47848b[]) this.f122650b.get()) {
                aVar.mo119922a(a);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo119921a(C47848b<T> bVar) {
        C47848b<T>[] bVarArr;
        C47848b[] bVarArr2;
        do {
            bVarArr = (C47848b[]) this.f122650b.get();
            if (bVarArr != f122647d && bVarArr != f122646c) {
                int length = bVarArr.length;
                int i = -1;
                int i2 = 0;
                while (true) {
                    if (i2 >= length) {
                        break;
                    } else if (bVarArr[i2] == bVar) {
                        i = i2;
                        break;
                    } else {
                        i2++;
                    }
                }
                if (i >= 0) {
                    if (length == 1) {
                        bVarArr2 = f122646c;
                    } else {
                        C47848b[] bVarArr3 = new C47848b[(length - 1)];
                        System.arraycopy(bVarArr, 0, bVarArr3, 0, i);
                        System.arraycopy(bVarArr, i + 1, bVarArr3, i, (length - i) - 1);
                        bVarArr2 = bVarArr3;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        } while (!this.f122650b.compareAndSet(bVarArr, bVarArr2));
    }
}
