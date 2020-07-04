package com.google.common.collect;

import com.google.common.base.C17430i;
import com.google.common.base.C17439m;
import com.google.common.collect.C17882cb.C17883a;
import com.google.common.primitives.C18143c;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NavigableSet;
import java.util.NoSuchElementException;
import java.util.Set;

public final class TreeMultiset<E> extends C18042o<E> implements Serializable {
    private static final long serialVersionUID = 1;
    public final transient C17674b<E> header;
    public final transient C17759be<E> range;
    private final transient C17675c<C17674b<E>> rootReference;

    /* renamed from: com.google.common.collect.TreeMultiset$a */
    enum C17671a {
        SIZE {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final int mo45748a(C17674b<?> bVar) {
                return bVar.f48870b;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final long mo45749b(C17674b<?> bVar) {
                if (bVar == null) {
                    return 0;
                }
                return bVar.f48872d;
            }
        },
        DISTINCT {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final int mo45748a(C17674b<?> bVar) {
                return 1;
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: b */
            public final long mo45749b(C17674b<?> bVar) {
                if (bVar == null) {
                    return 0;
                }
                return (long) bVar.f48871c;
            }
        };

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract int mo45748a(C17674b<?> bVar);

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public abstract long mo45749b(C17674b<?> bVar);
    }

    /* renamed from: com.google.common.collect.TreeMultiset$b */
    static final class C17674b<E> {

        /* renamed from: a */
        public final E f48869a;

        /* renamed from: b */
        public int f48870b;

        /* renamed from: c */
        public int f48871c;

        /* renamed from: d */
        public long f48872d;

        /* renamed from: e */
        public C17674b<E> f48873e;

        /* renamed from: f */
        public C17674b<E> f48874f;

        /* renamed from: g */
        public C17674b<E> f48875g;

        /* renamed from: h */
        public C17674b<E> f48876h;

        /* renamed from: i */
        private int f48877i;

        /* renamed from: d */
        private void m58829d() {
            m58825b();
            m58827c();
        }

        /* renamed from: f */
        private int m58831f() {
            return m58828d(this.f48873e) - m58828d(this.f48874f);
        }

        public final String toString() {
            return C17884cc.m59424a(this.f48869a, this.f48870b).toString();
        }

        /* renamed from: c */
        private void m58827c() {
            this.f48877i = Math.max(m58828d(this.f48873e), m58828d(this.f48874f)) + 1;
        }

        /* renamed from: e */
        private C17674b<E> m58830e() {
            int f = m58831f();
            if (f == -2) {
                if (this.f48874f.m58831f() > 0) {
                    this.f48874f = this.f48874f.m58833h();
                }
                return m58832g();
            } else if (f != 2) {
                m58827c();
                return this;
            } else {
                if (this.f48873e.m58831f() < 0) {
                    this.f48873e = this.f48873e.m58832g();
                }
                return m58833h();
            }
        }

        /* renamed from: g */
        private C17674b<E> m58832g() {
            boolean z;
            if (this.f48874f != null) {
                z = true;
            } else {
                z = false;
            }
            C17439m.m57981b(z);
            C17674b<E> bVar = this.f48874f;
            this.f48874f = bVar.f48873e;
            bVar.f48873e = this;
            bVar.f48872d = this.f48872d;
            bVar.f48871c = this.f48871c;
            m58829d();
            bVar.m58827c();
            return bVar;
        }

        /* renamed from: h */
        private C17674b<E> m58833h() {
            boolean z;
            if (this.f48873e != null) {
                z = true;
            } else {
                z = false;
            }
            C17439m.m57981b(z);
            C17674b<E> bVar = this.f48873e;
            this.f48873e = bVar.f48874f;
            bVar.f48874f = this;
            bVar.f48872d = this.f48872d;
            bVar.f48871c = this.f48871c;
            m58829d();
            bVar.m58827c();
            return bVar;
        }

        /* renamed from: a */
        private C17674b<E> m58820a() {
            int i = this.f48870b;
            this.f48870b = 0;
            TreeMultiset.successor(this.f48875g, this.f48876h);
            if (this.f48873e == null) {
                return this.f48874f;
            }
            if (this.f48874f == null) {
                return this.f48873e;
            }
            if (this.f48873e.f48877i >= this.f48874f.f48877i) {
                C17674b<E> bVar = this.f48875g;
                bVar.f48873e = this.f48873e.m58823b(bVar);
                bVar.f48874f = this.f48874f;
                bVar.f48871c = this.f48871c - 1;
                bVar.f48872d = this.f48872d - ((long) i);
                return bVar.m58830e();
            }
            C17674b<E> bVar2 = this.f48876h;
            bVar2.f48874f = this.f48874f.m58821a(bVar2);
            bVar2.f48873e = this.f48873e;
            bVar2.f48871c = this.f48871c - 1;
            bVar2.f48872d = this.f48872d - ((long) i);
            return bVar2.m58830e();
        }

        /* renamed from: b */
        private void m58825b() {
            this.f48871c = TreeMultiset.distinctElements(this.f48873e) + 1 + TreeMultiset.distinctElements(this.f48874f);
            this.f48872d = ((long) this.f48870b) + m58826c(this.f48873e) + m58826c(this.f48874f);
        }

        /* renamed from: c */
        private static long m58826c(C17674b<?> bVar) {
            if (bVar == null) {
                return 0;
            }
            return bVar.f48872d;
        }

        /* renamed from: d */
        private static int m58828d(C17674b<?> bVar) {
            if (bVar == null) {
                return 0;
            }
            return bVar.f48877i;
        }

        /* renamed from: a */
        private C17674b<E> m58821a(C17674b<E> bVar) {
            if (this.f48873e == null) {
                return this.f48874f;
            }
            this.f48873e = this.f48873e.m58821a(bVar);
            this.f48871c--;
            this.f48872d -= (long) bVar.f48870b;
            return m58830e();
        }

        /* renamed from: b */
        private C17674b<E> m58823b(C17674b<E> bVar) {
            if (this.f48874f == null) {
                return this.f48873e;
            }
            this.f48874f = this.f48874f.m58823b(bVar);
            this.f48871c--;
            this.f48872d -= (long) bVar.f48870b;
            return m58830e();
        }

        C17674b(E e, int i) {
            boolean z;
            if (i > 0) {
                z = true;
            } else {
                z = false;
            }
            C17439m.m57968a(z);
            this.f48869a = e;
            this.f48870b = i;
            this.f48872d = (long) i;
            this.f48871c = 1;
            this.f48877i = 1;
            this.f48873e = null;
            this.f48874f = null;
        }

        /* renamed from: a */
        public final int mo45750a(Comparator<? super E> comparator, E e) {
            C17674b bVar = this;
            while (true) {
                int compare = comparator.compare(e, bVar.f48869a);
                if (compare < 0) {
                    if (bVar.f48873e == null) {
                        return 0;
                    }
                    bVar = bVar.f48873e;
                } else if (compare <= 0) {
                    return bVar.f48870b;
                } else {
                    if (bVar.f48874f == null) {
                        return 0;
                    }
                    bVar = bVar.f48874f;
                }
            }
        }

        /* renamed from: c */
        public final C17674b<E> mo45755c(Comparator<? super E> comparator, E e) {
            C17674b bVar = this;
            while (true) {
                int compare = comparator.compare(e, bVar.f48869a);
                if (compare > 0) {
                    if (bVar.f48874f == null) {
                        return bVar;
                    }
                    return (C17674b) C17430i.m57945a(bVar.f48874f.mo45755c(comparator, e), bVar);
                } else if (compare == 0) {
                    return bVar;
                } else {
                    if (bVar.f48873e == null) {
                        return null;
                    }
                    bVar = bVar.f48873e;
                }
            }
        }

        /* renamed from: b */
        private C17674b<E> m58824b(E e, int i) {
            this.f48873e = new C17674b<>(e, i);
            TreeMultiset.successor(this.f48875g, this.f48873e, this);
            this.f48877i = Math.max(2, this.f48877i);
            this.f48871c++;
            this.f48872d += (long) i;
            return this;
        }

        /* renamed from: a */
        private C17674b<E> m58822a(E e, int i) {
            this.f48874f = new C17674b<>(e, i);
            TreeMultiset.successor(this, this.f48874f, this.f48876h);
            this.f48877i = Math.max(2, this.f48877i);
            this.f48871c++;
            this.f48872d += (long) i;
            return this;
        }

        /* renamed from: b */
        public final C17674b<E> mo45753b(Comparator<? super E> comparator, E e) {
            C17674b bVar = this;
            while (true) {
                int compare = comparator.compare(e, bVar.f48869a);
                if (compare < 0) {
                    if (bVar.f48873e == null) {
                        return bVar;
                    }
                    return (C17674b) C17430i.m57945a(bVar.f48873e.mo45753b(comparator, e), bVar);
                } else if (compare == 0) {
                    return bVar;
                } else {
                    if (bVar.f48874f == null) {
                        return null;
                    }
                    bVar = bVar.f48874f;
                }
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final C17674b<E> mo45756c(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int compare = comparator.compare(e, this.f48869a);
            if (compare < 0) {
                C17674b<E> bVar = this.f48873e;
                if (bVar == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        return m58824b(e, i);
                    }
                    return this;
                }
                this.f48873e = bVar.mo45756c(comparator, e, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.f48871c--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.f48871c++;
                }
                this.f48872d += (long) (i - iArr[0]);
                return m58830e();
            } else if (compare > 0) {
                C17674b<E> bVar2 = this.f48874f;
                if (bVar2 == null) {
                    iArr[0] = 0;
                    if (i > 0) {
                        return m58822a(e, i);
                    }
                    return this;
                }
                this.f48874f = bVar2.mo45756c(comparator, e, i, iArr);
                if (i == 0 && iArr[0] != 0) {
                    this.f48871c--;
                } else if (i > 0 && iArr[0] == 0) {
                    this.f48871c++;
                }
                this.f48872d += (long) (i - iArr[0]);
                return m58830e();
            } else {
                iArr[0] = this.f48870b;
                if (i == 0) {
                    return m58820a();
                }
                this.f48872d += (long) (i - this.f48870b);
                this.f48870b = i;
                return this;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17674b<E> mo45752a(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int compare = comparator.compare(e, this.f48869a);
            boolean z = true;
            if (compare < 0) {
                C17674b<E> bVar = this.f48873e;
                if (bVar == null) {
                    iArr[0] = 0;
                    return m58824b(e, i);
                }
                int i2 = bVar.f48877i;
                this.f48873e = bVar.mo45752a(comparator, e, i, iArr);
                if (iArr[0] == 0) {
                    this.f48871c++;
                }
                this.f48872d += (long) i;
                if (this.f48873e.f48877i == i2) {
                    return this;
                }
                return m58830e();
            } else if (compare > 0) {
                C17674b<E> bVar2 = this.f48874f;
                if (bVar2 == null) {
                    iArr[0] = 0;
                    return m58822a(e, i);
                }
                int i3 = bVar2.f48877i;
                this.f48874f = bVar2.mo45752a(comparator, e, i, iArr);
                if (iArr[0] == 0) {
                    this.f48871c++;
                }
                this.f48872d += (long) i;
                if (this.f48874f.f48877i == i3) {
                    return this;
                }
                return m58830e();
            } else {
                iArr[0] = this.f48870b;
                long j = (long) i;
                if (((long) this.f48870b) + j > 2147483647L) {
                    z = false;
                }
                C17439m.m57968a(z);
                this.f48870b += i;
                this.f48872d += j;
                return this;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C17674b<E> mo45754b(Comparator<? super E> comparator, E e, int i, int[] iArr) {
            int compare = comparator.compare(e, this.f48869a);
            if (compare < 0) {
                C17674b<E> bVar = this.f48873e;
                if (bVar == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f48873e = bVar.mo45754b(comparator, e, i, iArr);
                if (iArr[0] > 0) {
                    if (i >= iArr[0]) {
                        this.f48871c--;
                        this.f48872d -= (long) iArr[0];
                    } else {
                        this.f48872d -= (long) i;
                    }
                }
                if (iArr[0] == 0) {
                    return this;
                }
                return m58830e();
            } else if (compare > 0) {
                C17674b<E> bVar2 = this.f48874f;
                if (bVar2 == null) {
                    iArr[0] = 0;
                    return this;
                }
                this.f48874f = bVar2.mo45754b(comparator, e, i, iArr);
                if (iArr[0] > 0) {
                    if (i >= iArr[0]) {
                        this.f48871c--;
                        this.f48872d -= (long) iArr[0];
                    } else {
                        this.f48872d -= (long) i;
                    }
                }
                return m58830e();
            } else {
                iArr[0] = this.f48870b;
                if (i >= this.f48870b) {
                    return m58820a();
                }
                this.f48870b -= i;
                this.f48872d -= (long) i;
                return this;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17674b<E> mo45751a(Comparator<? super E> comparator, E e, int i, int i2, int[] iArr) {
            int compare = comparator.compare(e, this.f48869a);
            if (compare < 0) {
                C17674b<E> bVar = this.f48873e;
                if (bVar == null) {
                    iArr[0] = 0;
                    if (i != 0 || i2 <= 0) {
                        return this;
                    }
                    return m58824b(e, i2);
                }
                this.f48873e = bVar.mo45751a(comparator, e, i, i2, iArr);
                if (iArr[0] == i) {
                    if (i2 == 0 && iArr[0] != 0) {
                        this.f48871c--;
                    } else if (i2 > 0 && iArr[0] == 0) {
                        this.f48871c++;
                    }
                    this.f48872d += (long) (i2 - iArr[0]);
                }
                return m58830e();
            } else if (compare > 0) {
                C17674b<E> bVar2 = this.f48874f;
                if (bVar2 == null) {
                    iArr[0] = 0;
                    if (i != 0 || i2 <= 0) {
                        return this;
                    }
                    return m58822a(e, i2);
                }
                this.f48874f = bVar2.mo45751a(comparator, e, i, i2, iArr);
                if (iArr[0] == i) {
                    if (i2 == 0 && iArr[0] != 0) {
                        this.f48871c--;
                    } else if (i2 > 0 && iArr[0] == 0) {
                        this.f48871c++;
                    }
                    this.f48872d += (long) (i2 - iArr[0]);
                }
                return m58830e();
            } else {
                iArr[0] = this.f48870b;
                if (i == this.f48870b) {
                    if (i2 == 0) {
                        return m58820a();
                    }
                    this.f48872d += (long) (i2 - this.f48870b);
                    this.f48870b = i2;
                }
                return this;
            }
        }
    }

    /* renamed from: com.google.common.collect.TreeMultiset$c */
    static final class C17675c<T> {

        /* renamed from: a */
        public T f48878a;

        private C17675c() {
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo45758a() {
            this.f48878a = null;
        }

        /* renamed from: a */
        public final void mo45759a(T t, T t2) {
            if (this.f48878a == t) {
                this.f48878a = t2;
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    public final /* bridge */ /* synthetic */ Comparator comparator() {
        return super.comparator();
    }

    /* access modifiers changed from: 0000 */
    public final Iterator<C17883a<E>> descendingEntryIterator() {
        return new Iterator<C17883a<E>>() {

            /* renamed from: a */
            C17674b<E> f48862a = TreeMultiset.this.lastNode();

            /* renamed from: b */
            C17883a<E> f48863b = null;

            public final boolean hasNext() {
                if (this.f48862a == null) {
                    return false;
                }
                if (!TreeMultiset.this.range.mo45959a(this.f48862a.f48869a)) {
                    return true;
                }
                this.f48862a = null;
                return false;
            }

            public final void remove() {
                boolean z;
                if (this.f48863b != null) {
                    z = true;
                } else {
                    z = false;
                }
                C18053v.m59703a(z);
                TreeMultiset.this.setCount(this.f48863b.mo45308b(), 0);
                this.f48863b = null;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C17883a<E> next() {
                if (hasNext()) {
                    C17883a<E> wrapEntry = TreeMultiset.this.wrapEntry(this.f48862a);
                    this.f48863b = wrapEntry;
                    if (this.f48862a.f48875g == TreeMultiset.this.header) {
                        this.f48862a = null;
                    } else {
                        this.f48862a = this.f48862a.f48875g;
                    }
                    return wrapEntry;
                }
                throw new NoSuchElementException();
            }
        };
    }

    public final /* bridge */ /* synthetic */ C17954dh descendingMultiset() {
        return super.descendingMultiset();
    }

    public final /* bridge */ /* synthetic */ NavigableSet elementSet() {
        return super.elementSet();
    }

    /* access modifiers changed from: 0000 */
    public final Iterator<C17883a<E>> entryIterator() {
        return new Iterator<C17883a<E>>() {

            /* renamed from: a */
            C17674b<E> f48859a = TreeMultiset.this.firstNode();

            /* renamed from: b */
            C17883a<E> f48860b;

            public final boolean hasNext() {
                if (this.f48859a == null) {
                    return false;
                }
                if (!TreeMultiset.this.range.mo45960b(this.f48859a.f48869a)) {
                    return true;
                }
                this.f48859a = null;
                return false;
            }

            public final void remove() {
                boolean z;
                if (this.f48860b != null) {
                    z = true;
                } else {
                    z = false;
                }
                C18053v.m59703a(z);
                TreeMultiset.this.setCount(this.f48860b.mo45308b(), 0);
                this.f48860b = null;
            }

            /* access modifiers changed from: private */
            /* renamed from: a */
            public C17883a<E> next() {
                if (hasNext()) {
                    C17883a<E> wrapEntry = TreeMultiset.this.wrapEntry(this.f48859a);
                    this.f48860b = wrapEntry;
                    if (this.f48859a.f48876h == TreeMultiset.this.header) {
                        this.f48859a = null;
                    } else {
                        this.f48859a = this.f48859a.f48876h;
                    }
                    return wrapEntry;
                }
                throw new NoSuchElementException();
            }
        };
    }

    public final /* bridge */ /* synthetic */ Set entrySet() {
        return super.entrySet();
    }

    public final /* bridge */ /* synthetic */ C17883a firstEntry() {
        return super.firstEntry();
    }

    public final /* bridge */ /* synthetic */ boolean isEmpty() {
        return super.isEmpty();
    }

    public final Iterator<E> iterator() {
        return C17884cc.m59425a((C17882cb<E>) this);
    }

    public final /* bridge */ /* synthetic */ C17883a lastEntry() {
        return super.lastEntry();
    }

    public final /* bridge */ /* synthetic */ C17883a pollFirstEntry() {
        return super.pollFirstEntry();
    }

    public final /* bridge */ /* synthetic */ C17883a pollLastEntry() {
        return super.pollLastEntry();
    }

    public static <E extends Comparable> TreeMultiset<E> create() {
        return new TreeMultiset<>(C17896ch.m59497b());
    }

    /* access modifiers changed from: 0000 */
    public final int distinctElements() {
        return C18143c.m59970b(aggregateForEntries(C17671a.DISTINCT));
    }

    /* access modifiers changed from: 0000 */
    public final Iterator<E> elementIterator() {
        return C17884cc.m59426a(entryIterator());
    }

    public final int size() {
        return C18143c.m59970b(aggregateForEntries(C17671a.SIZE));
    }

    public final void clear() {
        if (this.range.f48986b || this.range.f48989e) {
            C17782br.m59133h(entryIterator());
            return;
        }
        C17674b<E> bVar = this.header.f48876h;
        while (bVar != this.header) {
            C17674b<E> bVar2 = bVar.f48876h;
            bVar.f48870b = 0;
            bVar.f48873e = null;
            bVar.f48874f = null;
            bVar.f48875g = null;
            bVar.f48876h = null;
            bVar = bVar2;
        }
        successor(this.header, this.header);
        this.rootReference.mo45758a();
    }

    public final C17674b<E> firstNode() {
        C17674b<E> bVar;
        if (((C17674b) this.rootReference.f48878a) == null) {
            return null;
        }
        if (this.range.f48986b) {
            T t = this.range.f48987c;
            bVar = ((C17674b) this.rootReference.f48878a).mo45753b(comparator(), t);
            if (bVar == null) {
                return null;
            }
            if (this.range.f48988d == BoundType.OPEN && comparator().compare(t, bVar.f48869a) == 0) {
                bVar = bVar.f48876h;
            }
        } else {
            bVar = this.header.f48876h;
        }
        if (bVar == this.header || !this.range.mo45961c(bVar.f48869a)) {
            return null;
        }
        return bVar;
    }

    public final C17674b<E> lastNode() {
        C17674b<E> bVar;
        if (((C17674b) this.rootReference.f48878a) == null) {
            return null;
        }
        if (this.range.f48989e) {
            T t = this.range.f48990f;
            bVar = ((C17674b) this.rootReference.f48878a).mo45755c(comparator(), t);
            if (bVar == null) {
                return null;
            }
            if (this.range.f48991g == BoundType.OPEN && comparator().compare(t, bVar.f48869a) == 0) {
                bVar = bVar.f48875g;
            }
        } else {
            bVar = this.header.f48875g;
        }
        if (bVar == this.header || !this.range.mo45961c(bVar.f48869a)) {
            return null;
        }
        return bVar;
    }

    public static <E extends Comparable> TreeMultiset<E> create(Iterable<? extends E> iterable) {
        TreeMultiset<E> create = create();
        C17777bq.m59095a((Collection<T>) create, iterable);
        return create;
    }

    static int distinctElements(C17674b<?> bVar) {
        if (bVar == null) {
            return 0;
        }
        return bVar.f48871c;
    }

    public final /* bridge */ /* synthetic */ boolean contains(Object obj) {
        return super.contains(obj);
    }

    public final C17883a<E> wrapEntry(final C17674b<E> bVar) {
        return new C17886a<E>() {
            /* renamed from: b */
            public final E mo45308b() {
                return bVar.f48869a;
            }

            /* renamed from: a */
            public final int mo45307a() {
                int i = bVar.f48870b;
                if (i == 0) {
                    return TreeMultiset.this.count(mo45308b());
                }
                return i;
            }
        };
    }

    public static <E> TreeMultiset<E> create(Comparator<? super E> comparator) {
        if (comparator == null) {
            return new TreeMultiset<>(C17896ch.m59497b());
        }
        return new TreeMultiset<>(comparator);
    }

    private void writeObject(ObjectOutputStream objectOutputStream) throws IOException {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(elementSet().comparator());
        C17928cz.m59558a((C17882cb<E>) this, objectOutputStream);
    }

    public final int count(Object obj) {
        try {
            C17674b bVar = (C17674b) this.rootReference.f48878a;
            if (this.range.mo45961c(obj)) {
                if (bVar != null) {
                    return bVar.mo45750a(comparator(), obj);
                }
            }
            return 0;
        } catch (ClassCastException | NullPointerException unused) {
            return 0;
        }
    }

    TreeMultiset(Comparator<? super E> comparator) {
        super(comparator);
        this.range = C17759be.m59056a(comparator);
        this.header = new C17674b<>(null, 1);
        successor(this.header, this.header);
        this.rootReference = new C17675c<>();
    }

    private long aggregateForEntries(C17671a aVar) {
        C17674b bVar = (C17674b) this.rootReference.f48878a;
        long b = aVar.mo45749b(bVar);
        if (this.range.f48986b) {
            b -= aggregateBelowRange(aVar, bVar);
        }
        if (this.range.f48989e) {
            return b - aggregateAboveRange(aVar, bVar);
        }
        return b;
    }

    private void readObject(ObjectInputStream objectInputStream) throws IOException, ClassNotFoundException {
        objectInputStream.defaultReadObject();
        Comparator comparator = (Comparator) objectInputStream.readObject();
        C17928cz.m59552a(C18042o.class, "comparator").mo46285a(this, (Object) comparator);
        C17928cz.m59552a(TreeMultiset.class, "range").mo46285a(this, (Object) C17759be.m59056a(comparator));
        C17928cz.m59552a(TreeMultiset.class, "rootReference").mo46285a(this, (Object) new C17675c());
        C17674b bVar = new C17674b(null, 1);
        C17928cz.m59552a(TreeMultiset.class, "header").mo46285a(this, (Object) bVar);
        successor(bVar, bVar);
        C17928cz.m59556a((C17882cb<E>) this, objectInputStream);
    }

    public static <T> void successor(C17674b<T> bVar, C17674b<T> bVar2) {
        bVar.f48876h = bVar2;
        bVar2.f48875g = bVar;
    }

    public final C17954dh<E> headMultiset(E e, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.mo45958a(C17759be.m59058b(comparator(), e, boundType)), this.header);
    }

    public final C17954dh<E> tailMultiset(E e, BoundType boundType) {
        return new TreeMultiset(this.rootReference, this.range.mo45958a(C17759be.m59057a(comparator(), e, boundType)), this.header);
    }

    public final int remove(Object obj, int i) {
        C18053v.m59700a(i, "occurrences");
        if (i == 0) {
            return count(obj);
        }
        C17674b bVar = (C17674b) this.rootReference.f48878a;
        int[] iArr = new int[1];
        try {
            if (this.range.mo45961c(obj)) {
                if (bVar != null) {
                    this.rootReference.mo45759a(bVar, bVar.mo45754b(comparator(), obj, i, iArr));
                    return iArr[0];
                }
            }
            return 0;
        } catch (ClassCastException | NullPointerException unused) {
            return 0;
        }
    }

    public final int setCount(E e, int i) {
        C18053v.m59700a(i, "count");
        boolean z = true;
        if (!this.range.mo45961c(e)) {
            if (i != 0) {
                z = false;
            }
            C17439m.m57968a(z);
            return 0;
        }
        C17674b bVar = (C17674b) this.rootReference.f48878a;
        if (bVar == null) {
            if (i > 0) {
                add(e, i);
            }
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.mo45759a(bVar, bVar.mo45756c(comparator(), e, i, iArr));
        return iArr[0];
    }

    private long aggregateAboveRange(C17671a aVar, C17674b<E> bVar) {
        while (bVar != null) {
            int compare = comparator().compare(this.range.f48990f, bVar.f48869a);
            if (compare > 0) {
                bVar = bVar.f48874f;
            } else if (compare != 0) {
                return aVar.mo45749b(bVar.f48874f) + ((long) aVar.mo45748a(bVar)) + aggregateAboveRange(aVar, bVar.f48873e);
            } else {
                switch (this.range.f48991g) {
                    case OPEN:
                        return ((long) aVar.mo45748a(bVar)) + aVar.mo45749b(bVar.f48874f);
                    case CLOSED:
                        return aVar.mo45749b(bVar.f48874f);
                    default:
                        throw new AssertionError();
                }
            }
        }
        return 0;
    }

    private long aggregateBelowRange(C17671a aVar, C17674b<E> bVar) {
        while (bVar != null) {
            int compare = comparator().compare(this.range.f48987c, bVar.f48869a);
            if (compare < 0) {
                bVar = bVar.f48873e;
            } else if (compare != 0) {
                return aVar.mo45749b(bVar.f48873e) + ((long) aVar.mo45748a(bVar)) + aggregateBelowRange(aVar, bVar.f48874f);
            } else {
                switch (this.range.f48988d) {
                    case OPEN:
                        return ((long) aVar.mo45748a(bVar)) + aVar.mo45749b(bVar.f48873e);
                    case CLOSED:
                        return aVar.mo45749b(bVar.f48873e);
                    default:
                        throw new AssertionError();
                }
            }
        }
        return 0;
    }

    public final int add(E e, int i) {
        C18053v.m59700a(i, "occurrences");
        if (i == 0) {
            return count(e);
        }
        C17439m.m57968a(this.range.mo45961c(e));
        C17674b bVar = (C17674b) this.rootReference.f48878a;
        if (bVar == null) {
            comparator().compare(e, e);
            C17674b bVar2 = new C17674b(e, i);
            successor(this.header, bVar2, this.header);
            this.rootReference.mo45759a(bVar, bVar2);
            return 0;
        }
        int[] iArr = new int[1];
        this.rootReference.mo45759a(bVar, bVar.mo45752a(comparator(), e, i, iArr));
        return iArr[0];
    }

    TreeMultiset(C17675c<C17674b<E>> cVar, C17759be<E> beVar, C17674b<E> bVar) {
        super(beVar.f48985a);
        this.rootReference = cVar;
        this.range = beVar;
        this.header = bVar;
    }

    public static <T> void successor(C17674b<T> bVar, C17674b<T> bVar2, C17674b<T> bVar3) {
        successor(bVar, bVar2);
        successor(bVar2, bVar3);
    }

    public final boolean setCount(E e, int i, int i2) {
        C18053v.m59700a(i2, "newCount");
        C18053v.m59700a(i, "oldCount");
        C17439m.m57968a(this.range.mo45961c(e));
        C17674b bVar = (C17674b) this.rootReference.f48878a;
        if (bVar != null) {
            int[] iArr = new int[1];
            this.rootReference.mo45759a(bVar, bVar.mo45751a(comparator(), e, i, i2, iArr));
            if (iArr[0] == i) {
                return true;
            }
            return false;
        } else if (i != 0) {
            return false;
        } else {
            if (i2 > 0) {
                add(e, i2);
            }
            return true;
        }
    }

    public final /* bridge */ /* synthetic */ C17954dh subMultiset(Object obj, BoundType boundType, Object obj2, BoundType boundType2) {
        return super.subMultiset(obj, boundType, obj2, boundType2);
    }
}
