package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.collect.C17882cb.C17883a;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NavigableSet;

/* renamed from: com.google.common.collect.o */
abstract class C18042o<E> extends C18032i<E> implements C17954dh<E> {
    final Comparator<? super E> comparator;
    private transient C17954dh<E> descendingMultiset;

    /* renamed from: com.google.common.collect.o$a */
    class C18043a extends C17717ah<E> {
        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17954dh<E> mo45842a() {
            return C18042o.this;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Iterator<C17883a<E>> mo45843b() {
            return C18042o.this.descendingEntryIterator();
        }

        public final Iterator<E> iterator() {
            return C18042o.this.descendingIterator();
        }

        C18043a() {
        }
    }

    public Comparator<? super E> comparator() {
        return this.comparator;
    }

    /* access modifiers changed from: 0000 */
    public abstract Iterator<C17883a<E>> descendingEntryIterator();

    C18042o() {
        this(C17896ch.m59497b());
    }

    /* access modifiers changed from: 0000 */
    public C17954dh<E> createDescendingMultiset() {
        return new C18043a();
    }

    /* access modifiers changed from: 0000 */
    public NavigableSet<E> createElementSet() {
        return new C17958b(this);
    }

    public NavigableSet<E> elementSet() {
        return (NavigableSet) super.elementSet();
    }

    /* access modifiers changed from: 0000 */
    public Iterator<E> descendingIterator() {
        return C17884cc.m59425a((C17882cb<E>) descendingMultiset());
    }

    public C17954dh<E> descendingMultiset() {
        C17954dh<E> dhVar = this.descendingMultiset;
        if (dhVar != null) {
            return dhVar;
        }
        C17954dh<E> createDescendingMultiset = createDescendingMultiset();
        this.descendingMultiset = createDescendingMultiset;
        return createDescendingMultiset;
    }

    public C17883a<E> firstEntry() {
        Iterator entryIterator = entryIterator();
        if (entryIterator.hasNext()) {
            return (C17883a) entryIterator.next();
        }
        return null;
    }

    public C17883a<E> lastEntry() {
        Iterator descendingEntryIterator = descendingEntryIterator();
        if (descendingEntryIterator.hasNext()) {
            return (C17883a) descendingEntryIterator.next();
        }
        return null;
    }

    public C17883a<E> pollFirstEntry() {
        Iterator entryIterator = entryIterator();
        if (!entryIterator.hasNext()) {
            return null;
        }
        C17883a aVar = (C17883a) entryIterator.next();
        C17883a<E> a = C17884cc.m59424a(aVar.mo45308b(), aVar.mo45307a());
        entryIterator.remove();
        return a;
    }

    public C17883a<E> pollLastEntry() {
        Iterator descendingEntryIterator = descendingEntryIterator();
        if (!descendingEntryIterator.hasNext()) {
            return null;
        }
        C17883a aVar = (C17883a) descendingEntryIterator.next();
        C17883a<E> a = C17884cc.m59424a(aVar.mo45308b(), aVar.mo45307a());
        descendingEntryIterator.remove();
        return a;
    }

    C18042o(Comparator<? super E> comparator2) {
        this.comparator = (Comparator) C17439m.m57962a(comparator2);
    }

    public C17954dh<E> subMultiset(E e, BoundType boundType, E e2, BoundType boundType2) {
        C17439m.m57962a(boundType);
        C17439m.m57962a(boundType2);
        return tailMultiset(e, boundType).headMultiset(e2, boundType2);
    }
}
