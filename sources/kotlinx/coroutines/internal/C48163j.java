package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlinx.coroutines.internal.j */
public class C48163j {

    /* renamed from: a */
    private static final AtomicReferenceFieldUpdater f123014a = AtomicReferenceFieldUpdater.newUpdater(C48163j.class, Object.class, "_removedRef");

    /* renamed from: c */
    static final AtomicReferenceFieldUpdater f123015c = AtomicReferenceFieldUpdater.newUpdater(C48163j.class, Object.class, "_next");

    /* renamed from: d */
    static final AtomicReferenceFieldUpdater f123016d = AtomicReferenceFieldUpdater.newUpdater(C48163j.class, Object.class, "_prev");
    volatile Object _next = this;
    volatile Object _prev = this;
    private volatile Object _removedRef;

    /* renamed from: kotlinx.coroutines.internal.j$a */
    public static abstract class C48164a extends C48152d<C48163j> {

        /* renamed from: d */
        public C48163j f123017d;

        /* renamed from: e */
        public final C48163j f123018e;

        public C48164a(C48163j jVar) {
            C7573i.m23587b(jVar, "newNode");
            this.f123018e = jVar;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public void mo120370a(C48163j jVar, Object obj) {
            boolean z;
            C48163j jVar2;
            C7573i.m23587b(jVar, "affected");
            if (obj == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                jVar2 = this.f123018e;
            } else {
                jVar2 = this.f123017d;
            }
            if (jVar2 != null && C48163j.f123015c.compareAndSet(jVar, this, jVar2) && z) {
                C48163j jVar3 = this.f123018e;
                C48163j jVar4 = this.f123017d;
                if (jVar4 == null) {
                    C7573i.m23580a();
                }
                jVar3.mo120376b(jVar4);
            }
        }
    }

    /* renamed from: d */
    public final boolean mo120377d() {
        return mo120378e() instanceof C48174r;
    }

    /* renamed from: e */
    public final Object mo120378e() {
        while (true) {
            Object obj = this._next;
            if (!(obj instanceof C48173q)) {
                return obj;
            }
            ((C48173q) obj).mo120371b(this);
        }
    }

    /* renamed from: f */
    public final C48163j mo120379f() {
        return C48162i.m149411a(mo120378e());
    }

    /* renamed from: h */
    public final C48163j mo120381h() {
        return C48162i.m149411a(mo120380g());
    }

    /* renamed from: i */
    private C48174r m149414i() {
        C48174r rVar = (C48174r) this._removedRef;
        if (rVar != null) {
            return rVar;
        }
        C48174r rVar2 = new C48174r(this);
        f123014a.lazySet(this, rVar2);
        return rVar2;
    }

    /* renamed from: j */
    private final C48163j m149415j() {
        Object obj;
        C48163j jVar;
        do {
            obj = this._prev;
            if (obj instanceof C48174r) {
                return ((C48174r) obj).f123033a;
            }
            if (obj == this) {
                jVar = m149416k();
            } else if (obj != null) {
                jVar = (C48163j) obj;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f123016d.compareAndSet(this, obj, jVar.m149414i()));
        return (C48163j) obj;
    }

    /* renamed from: k */
    private final C48163j m149416k() {
        boolean z;
        C48163j jVar = this;
        C48163j jVar2 = jVar;
        while (!(jVar2 instanceof C48161h)) {
            jVar2 = jVar2.mo120379f();
            if (jVar2 != jVar) {
                z = true;
                continue;
            } else {
                z = false;
                continue;
            }
            if (!z) {
                throw new IllegalStateException("Cannot loop to this while looking for list head".toString());
            }
        }
        return jVar2;
    }

    /* renamed from: c */
    public boolean mo120373c() {
        Object e;
        C48163j jVar;
        do {
            e = mo120378e();
            if ((e instanceof C48174r) || e == this) {
                return false;
            }
            if (e != null) {
                jVar = (C48163j) e;
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        } while (!f123015c.compareAndSet(this, e, jVar.m149414i()));
        m149413c(jVar);
        return true;
    }

    /* renamed from: g */
    public final Object mo120380g() {
        while (true) {
            Object obj = this._prev;
            if (obj instanceof C48174r) {
                return obj;
            }
            if (obj != null) {
                C48163j jVar = (C48163j) obj;
                if (jVar.mo120378e() == this) {
                    return obj;
                }
                m149412a(jVar, null);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    /* renamed from: l */
    private void m149417l() {
        Object e;
        C48163j j = m149415j();
        Object obj = this._next;
        if (obj != null) {
            C48163j jVar = j;
            C48163j jVar2 = null;
            while (true) {
                C48163j jVar3 = ((C48174r) obj).f123033a;
                while (true) {
                    e = jVar3.mo120378e();
                    if (e instanceof C48174r) {
                        break;
                    }
                    Object e2 = jVar.mo120378e();
                    if (e2 instanceof C48174r) {
                        if (jVar2 != null) {
                            jVar.m149415j();
                            f123015c.compareAndSet(jVar2, jVar, ((C48174r) e2).f123033a);
                            jVar = jVar2;
                            jVar2 = null;
                        } else {
                            jVar = C48162i.m149411a(jVar._prev);
                        }
                    } else if (e2 != this) {
                        if (e2 != null) {
                            C48163j jVar4 = (C48163j) e2;
                            if (jVar4 != jVar3) {
                                C48163j jVar5 = jVar;
                                jVar = jVar4;
                                jVar2 = jVar5;
                            } else {
                                return;
                            }
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        }
                    } else if (f123015c.compareAndSet(jVar, this, jVar3)) {
                        return;
                    }
                }
                jVar3.m149415j();
                obj = e;
            }
        } else {
            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Removed");
        }
    }

    /* renamed from: c */
    private void m149413c(C48163j jVar) {
        m149417l();
        jVar.m149412a(C48162i.m149411a(this._prev), null);
    }

    /* renamed from: b */
    public final void mo120376b(C48163j jVar) {
        Object obj;
        do {
            obj = jVar._prev;
            if ((obj instanceof C48174r) || mo120378e() != jVar) {
                return;
            }
        } while (!f123016d.compareAndSet(jVar, obj, this));
        if (mo120378e() instanceof C48174r) {
            if (obj != null) {
                jVar.m149412a((C48163j) obj, null);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
            }
        }
    }

    /* renamed from: a */
    public final boolean mo120375a(C48163j jVar) {
        C7573i.m23587b(jVar, "node");
        f123016d.lazySet(jVar, this);
        f123015c.lazySet(jVar, this);
        while (mo120378e() == this) {
            if (f123015c.compareAndSet(this, this, jVar)) {
                jVar.mo120376b(this);
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private C48163j m149412a(C48163j jVar, C48173q qVar) {
        Object obj;
        while (true) {
            C48163j jVar2 = null;
            while (true) {
                obj = jVar._next;
                if (obj == null) {
                    return jVar;
                }
                if (obj instanceof C48173q) {
                    ((C48173q) obj).mo120371b(jVar);
                } else if (!(obj instanceof C48174r)) {
                    Object obj2 = this._prev;
                    if (obj2 instanceof C48174r) {
                        return null;
                    }
                    if (obj != this) {
                        if (obj != null) {
                            jVar2 = jVar;
                            jVar = (C48163j) obj;
                        } else {
                            throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.internal.Node /* = kotlinx.coroutines.internal.LockFreeLinkedListNode */");
                        }
                    } else if (obj2 == jVar) {
                        return null;
                    } else {
                        if (f123016d.compareAndSet(this, obj2, jVar) && !(jVar._prev instanceof C48174r)) {
                            return null;
                        }
                    }
                } else if (jVar2 != null) {
                    break;
                } else {
                    jVar = C48162i.m149411a(jVar._prev);
                }
            }
            jVar.m149415j();
            f123015c.compareAndSet(jVar2, jVar, ((C48174r) obj).f123033a);
            jVar = jVar2;
        }
    }

    /* renamed from: a */
    public final int mo120374a(C48163j jVar, C48163j jVar2, C48164a aVar) {
        C7573i.m23587b(jVar, "node");
        C7573i.m23587b(jVar2, "next");
        C7573i.m23587b(aVar, "condAdd");
        f123016d.lazySet(jVar, this);
        f123015c.lazySet(jVar, jVar2);
        aVar.f123017d = jVar2;
        if (!f123015c.compareAndSet(this, jVar2, aVar)) {
            return 0;
        }
        if (aVar.mo120371b(this) == null) {
            return 1;
        }
        return 2;
    }
}
