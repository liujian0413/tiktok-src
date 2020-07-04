package com.google.common.collect;

import com.google.common.base.C17427g;
import com.google.common.base.C17439m;
import java.util.Comparator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.common.collect.dg */
final class C17942dg {

    /* renamed from: com.google.common.collect.dg$a */
    enum C17944a {
        NEXT_LOWER {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final int mo46310a(int i) {
                return i - 1;
            }
        },
        NEXT_HIGHER {
            /* renamed from: a */
            public final int mo46310a(int i) {
                return i;
            }
        },
        INVERTED_INSERTION_INDEX {
            /* renamed from: a */
            public final int mo46310a(int i) {
                return i ^ -1;
            }
        };

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract int mo46310a(int i);
    }

    /* renamed from: com.google.common.collect.dg$b */
    enum C17948b {
        ANY_PRESENT {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <E> int mo46311a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return i;
            }
        },
        LAST_PRESENT {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <E> int mo46311a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                int size = list.size() - 1;
                while (i < size) {
                    int i2 = ((i + size) + 1) >>> 1;
                    if (comparator.compare(list.get(i2), e) > 0) {
                        size = i2 - 1;
                    } else {
                        i = i2;
                    }
                }
                return i;
            }
        },
        FIRST_PRESENT {
            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final <E> int mo46311a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                int i2 = 0;
                while (i2 < i) {
                    int i3 = (i2 + i) >>> 1;
                    if (comparator.compare(list.get(i3), e) < 0) {
                        i2 = i3 + 1;
                    } else {
                        i = i3;
                    }
                }
                return i2;
            }
        },
        FIRST_AFTER {
            /* renamed from: a */
            public final <E> int mo46311a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return LAST_PRESENT.mo46311a(comparator, e, list, i) + 1;
            }
        },
        LAST_BEFORE {
            /* renamed from: a */
            public final <E> int mo46311a(Comparator<? super E> comparator, E e, List<? extends E> list, int i) {
                return FIRST_PRESENT.mo46311a(comparator, e, list, i) - 1;
            }
        };

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public abstract <E> int mo46311a(Comparator<? super E> comparator, E e, List<? extends E> list, int i);
    }

    /* renamed from: a */
    public static <E, K extends Comparable> int m59579a(List<E> list, C17427g<? super E, K> gVar, K k, C17948b bVar, C17944a aVar) {
        return m59580a(list, gVar, k, C17896ch.m59497b(), bVar, aVar);
    }

    /* renamed from: a */
    private static <E> int m59581a(List<? extends E> list, E e, Comparator<? super E> comparator, C17948b bVar, C17944a aVar) {
        C17439m.m57962a(comparator);
        C17439m.m57962a(list);
        C17439m.m57962a(bVar);
        C17439m.m57962a(aVar);
        if (!(list instanceof RandomAccess)) {
            list = C17795bu.m59144a((Iterable<? extends E>) list);
        }
        int i = 0;
        int size = list.size() - 1;
        while (i <= size) {
            int i2 = (i + size) >>> 1;
            int compare = comparator.compare(e, list.get(i2));
            if (compare < 0) {
                size = i2 - 1;
            } else if (compare <= 0) {
                return i + bVar.mo46311a(comparator, e, list.subList(i, size + 1), i2 - i);
            } else {
                i = i2 + 1;
            }
        }
        return aVar.mo46310a(i);
    }

    /* renamed from: a */
    public static <E, K> int m59580a(List<E> list, C17427g<? super E, K> gVar, K k, Comparator<? super K> comparator, C17948b bVar, C17944a aVar) {
        return m59581a(C17795bu.m59147a(list, gVar), (E) k, comparator, bVar, aVar);
    }
}
