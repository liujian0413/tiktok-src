package kotlin.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7561a;
import kotlin.jvm.p357a.C7562b;
import kotlin.sequences.C7604g;
import kotlin.text.C7634n;

/* renamed from: kotlin.collections.w */
public class C7536w extends C7535v {

    /* renamed from: kotlin.collections.w$a */
    public static final class C7537a implements C7604g<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f20869a;

        /* renamed from: a */
        public final Iterator<T> mo19416a() {
            return this.f20869a.iterator();
        }

        public C7537a(Iterable iterable) {
            this.f20869a = iterable;
        }
    }

    /* renamed from: kotlin.collections.w$b */
    static final class C7538b extends Lambda implements C7562b {

        /* renamed from: a */
        final /* synthetic */ int f20870a;

        C7538b(int i) {
            this.f20870a = i;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m23530a(((Number) obj).intValue());
        }

        /* renamed from: a */
        private Void m23530a(int i) {
            StringBuilder sb = new StringBuilder("Collection doesn't contain element at index ");
            sb.append(this.f20870a);
            sb.append('.');
            throw new IndexOutOfBoundsException(sb.toString());
        }
    }

    /* renamed from: kotlin.collections.w$c */
    static final class C7539c extends Lambda implements C7561a<Iterator<? extends T>> {

        /* renamed from: a */
        final /* synthetic */ Iterable f20871a;

        C7539c(Iterable iterable) {
            this.f20871a = iterable;
            super(0);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Iterator<T> invoke() {
            return this.f20871a.iterator();
        }
    }

    /* renamed from: a */
    public static final <T> boolean m23496a(Iterable<? extends T> iterable, T t) {
        C7573i.m23587b(iterable, "$this$contains");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        return C7525m.m23497b(iterable, t) >= 0;
    }

    /* renamed from: a */
    public static final <T> List<T> m23495a(Collection<? extends T> collection, T t) {
        C7573i.m23587b(collection, "$this$plus");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: d */
    public static final <T> List<T> m23509d(Collection<? extends T> collection) {
        C7573i.m23587b(collection, "$this$toMutableList");
        return new ArrayList<>(collection);
    }

    /* renamed from: l */
    public static final <T> List<T> m23522l(Iterable<? extends T> iterable) {
        C7573i.m23587b(iterable, "$this$distinct");
        return C7525m.m23516h((Iterable<? extends T>) C7525m.m23523m(iterable));
    }

    /* renamed from: p */
    public static final <T> C7604g<T> m23526p(Iterable<? extends T> iterable) {
        C7573i.m23587b(iterable, "$this$asSequence");
        return new C7537a<>(iterable);
    }

    /* renamed from: e */
    public static final <T> List<T> m23510e(Iterable<? extends T> iterable) {
        C7573i.m23587b(iterable, "$this$filterNotNull");
        return (List) C7525m.m23493a(iterable, (C) new ArrayList());
    }

    /* renamed from: f */
    public static final <T> T m23511f(List<? extends T> list) {
        C7573i.m23587b(list, "$this$first");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: g */
    public static final <T> T m23513g(List<? extends T> list) {
        C7573i.m23587b(list, "$this$firstOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: h */
    public static final <T> T m23515h(List<? extends T> list) {
        C7573i.m23587b(list, "$this$last");
        if (!list.isEmpty()) {
            return list.get(C7525m.m23459a(list));
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: i */
    public static final <T> T m23517i(List<? extends T> list) {
        C7573i.m23587b(list, "$this$lastOrNull");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: k */
    public static final <T> Iterable<C47913z<T>> m23521k(Iterable<? extends T> iterable) {
        C7573i.m23587b(iterable, "$this$withIndex");
        return new C7505aa<>(new C7539c(iterable));
    }

    /* renamed from: q */
    public static final int m23527q(Iterable<Integer> iterable) {
        C7573i.m23587b(iterable, "$this$sum");
        int i = 0;
        for (Number intValue : iterable) {
            i += intValue.intValue();
        }
        return i;
    }

    /* renamed from: r */
    public static final long m23528r(Iterable<Long> iterable) {
        C7573i.m23587b(iterable, "$this$sum");
        long j = 0;
        for (Number longValue : iterable) {
            j += longValue.longValue();
        }
        return j;
    }

    /* renamed from: c */
    public static final <T> T m23503c(Iterable<? extends T> iterable) {
        T next;
        C7573i.m23587b(iterable, "$this$last");
        if (iterable instanceof List) {
            return C7525m.m23515h((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            do {
                next = it.next();
            } while (it.hasNext());
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: d */
    public static final <T> T m23508d(Iterable<? extends T> iterable) {
        C7573i.m23587b(iterable, "$this$single");
        if (iterable instanceof List) {
            return C7525m.m23519j((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: f */
    public static final <T> List<T> m23512f(Iterable<? extends T> iterable) {
        C7573i.m23587b(iterable, "$this$reversed");
        if ((iterable instanceof Collection) && ((Collection) iterable).size() <= 1) {
            return C7525m.m23516h(iterable);
        }
        List<T> i = C7525m.m23518i(iterable);
        C7525m.m23486e(i);
        return i;
    }

    /* renamed from: g */
    public static final <T> HashSet<T> m23514g(Iterable<? extends T> iterable) {
        C7573i.m23587b(iterable, "$this$toHashSet");
        return (HashSet) C7525m.m23500b(iterable, (C) new HashSet(C7507ae.m23386a(C7525m.m23469a(iterable, 12))));
    }

    /* renamed from: i */
    public static final <T> List<T> m23518i(Iterable<? extends T> iterable) {
        C7573i.m23587b(iterable, "$this$toMutableList");
        if (iterable instanceof Collection) {
            return C7525m.m23509d((Collection) iterable);
        }
        return (List) C7525m.m23500b(iterable, (C) new ArrayList());
    }

    /* renamed from: j */
    public static final <T> T m23519j(List<? extends T> list) {
        C7573i.m23587b(list, "$this$single");
        switch (list.size()) {
            case 0:
                throw new NoSuchElementException("List is empty.");
            case 1:
                return list.get(0);
            default:
                throw new IllegalArgumentException("List has more than one element.");
        }
    }

    /* renamed from: m */
    public static final <T> Set<T> m23523m(Iterable<? extends T> iterable) {
        C7573i.m23587b(iterable, "$this$toMutableSet");
        if (iterable instanceof Collection) {
            return new LinkedHashSet<>((Collection) iterable);
        }
        return (Set) C7525m.m23500b(iterable, (C) new LinkedHashSet());
    }

    /* renamed from: n */
    public static final <T extends Comparable<? super T>> T m23524n(Iterable<? extends T> iterable) {
        C7573i.m23587b(iterable, "$this$max");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) < 0) {
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: o */
    public static final <T extends Comparable<? super T>> T m23525o(Iterable<? extends T> iterable) {
        C7573i.m23587b(iterable, "$this$min");
        Iterator it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T t = (Comparable) it.next();
        while (it.hasNext()) {
            T t2 = (Comparable) it.next();
            if (t.compareTo(t2) > 0) {
                t = t2;
            }
        }
        return t;
    }

    /* renamed from: b */
    public static final <T> T m23498b(Iterable<? extends T> iterable) {
        C7573i.m23587b(iterable, "$this$first");
        if (iterable instanceof List) {
            return C7525m.m23511f((List) iterable);
        }
        Iterator it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: h */
    public static final <T> List<T> m23516h(Iterable<? extends T> iterable) {
        Object obj;
        C7573i.m23587b(iterable, "$this$toList");
        if (!(iterable instanceof Collection)) {
            return C7525m.m23463b(C7525m.m23518i(iterable));
        }
        Collection collection = (Collection) iterable;
        switch (collection.size()) {
            case 0:
                return C7525m.m23461a();
            case 1:
                if (iterable instanceof List) {
                    obj = ((List) iterable).get(0);
                } else {
                    obj = iterable.iterator().next();
                }
                return C7525m.m23457a(obj);
            default:
                return C7525m.m23509d(collection);
        }
    }

    /* renamed from: j */
    public static final <T> Set<T> m23520j(Iterable<? extends T> iterable) {
        Object obj;
        C7573i.m23587b(iterable, "$this$toSet");
        if (!(iterable instanceof Collection)) {
            return C7513am.m23409a((Set) C7525m.m23500b(iterable, (C) new LinkedHashSet()));
        }
        Collection collection = (Collection) iterable;
        switch (collection.size()) {
            case 0:
                return C7513am.m23408a();
            case 1:
                if (iterable instanceof List) {
                    obj = ((List) iterable).get(0);
                } else {
                    obj = iterable.iterator().next();
                }
                return C7513am.m23407a(obj);
            default:
                return (Set) C7525m.m23500b(iterable, (C) new LinkedHashSet(C7507ae.m23386a(collection.size())));
        }
    }

    /* renamed from: c */
    public static final int[] m23507c(Collection<Integer> collection) {
        C7573i.m23587b(collection, "$this$toIntArray");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Number intValue : collection) {
            int i2 = i + 1;
            iArr[i] = intValue.intValue();
            i = i2;
        }
        return iArr;
    }

    /* renamed from: b */
    public static final double[] m23502b(Collection<Double> collection) {
        C7573i.m23587b(collection, "$this$toDoubleArray");
        double[] dArr = new double[collection.size()];
        int i = 0;
        for (Number doubleValue : collection) {
            int i2 = i + 1;
            dArr[i] = doubleValue.doubleValue();
            i = i2;
        }
        return dArr;
    }

    /* renamed from: a */
    public static final <T> int m23487a(List<? extends T> list, T t) {
        C7573i.m23587b(list, "$this$indexOf");
        return list.indexOf(t);
    }

    /* renamed from: b */
    public static final <T> T m23499b(Iterable<? extends T> iterable, int i) {
        C7573i.m23587b(iterable, "$this$elementAt");
        if (iterable instanceof List) {
            return ((List) iterable).get(i);
        }
        return C7525m.m23490a(iterable, i, new C7538b(i));
    }

    /* renamed from: c */
    public static final <T> T m23504c(List<? extends T> list, int i) {
        C7573i.m23587b(list, "$this$getOrNull");
        if (i < 0 || i > C7525m.m23459a(list)) {
            return null;
        }
        return list.get(i);
    }

    /* renamed from: b */
    public static final <T> int m23497b(Iterable<? extends T> iterable, T t) {
        C7573i.m23587b(iterable, "$this$indexOf");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (Object next : iterable) {
            if (i < 0) {
                C7525m.m23465b();
            }
            if (C7573i.m23585a((Object) t, next)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: c */
    public static final <T> List<T> m23505c(Iterable<? extends T> iterable, int i) {
        boolean z;
        C7573i.m23587b(iterable, "$this$take");
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            StringBuilder sb = new StringBuilder("Requested element count ");
            sb.append(i);
            sb.append(" is less than zero.");
            throw new IllegalArgumentException(sb.toString().toString());
        } else if (i == 0) {
            return C7525m.m23461a();
        } else {
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    return C7525m.m23516h(iterable);
                }
                if (i == 1) {
                    return C7525m.m23457a(C7525m.m23498b(iterable));
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (Object add : iterable) {
                arrayList.add(add);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            return C7525m.m23463b((List<? extends T>) arrayList);
        }
    }

    /* renamed from: b */
    public static final <T, C extends Collection<? super T>> C m23500b(Iterable<? extends T> iterable, C c) {
        C7573i.m23587b(iterable, "$this$toCollection");
        C7573i.m23587b(c, "destination");
        for (Object add : iterable) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: c */
    public static final <T> List<T> m23506c(Collection<? extends T> collection, Iterable<? extends T> iterable) {
        C7573i.m23587b(collection, "$this$plus");
        C7573i.m23587b(iterable, "elements");
        if (iterable instanceof Collection) {
            Collection collection2 = (Collection) iterable;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C7525m.m23478a((Collection<? super T>) arrayList2, iterable);
        return arrayList2;
    }

    /* renamed from: b */
    public static final <T> Set<T> m23501b(Iterable<? extends T> iterable, Iterable<? extends T> iterable2) {
        C7573i.m23587b(iterable, "$this$subtract");
        C7573i.m23587b(iterable2, "other");
        Set<T> m = C7525m.m23523m(iterable);
        C7525m.m23482b(m, iterable2);
        return m;
    }

    /* renamed from: a */
    public static final <C extends Collection<? super T>, T> C m23493a(Iterable<? extends T> iterable, C c) {
        C7573i.m23587b(iterable, "$this$filterNotNullTo");
        C7573i.m23587b(c, "destination");
        for (Object next : iterable) {
            if (next != null) {
                c.add(next);
            }
        }
        return c;
    }

    /* renamed from: a */
    public static final <T> List<T> m23494a(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        C7573i.m23587b(iterable, "$this$sortedWith");
        C7573i.m23587b(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                return C7525m.m23516h(iterable);
            }
            Object[] array = collection.toArray(new Object[0]);
            if (array == null) {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            } else if (array != null) {
                C7519g.m23419a((T[]) array, comparator);
                return C7519g.m23418a(array);
            } else {
                throw new TypeCastException("null cannot be cast to non-null type kotlin.Array<T>");
            }
        } else {
            List<T> i = C7525m.m23518i(iterable);
            C7525m.m23474a(i, comparator);
            return i;
        }
    }

    /* renamed from: a */
    public static final <T> T m23490a(Iterable<? extends T> iterable, int i, C7562b<? super Integer, ? extends T> bVar) {
        C7573i.m23587b(iterable, "$this$elementAtOrElse");
        C7573i.m23587b(bVar, "defaultValue");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (i < 0 || i > C7525m.m23459a(list)) {
                return bVar.invoke(Integer.valueOf(i));
            }
            return list.get(i);
        } else if (i < 0) {
            return bVar.invoke(Integer.valueOf(i));
        } else {
            int i2 = 0;
            for (T next : iterable) {
                int i3 = i2 + 1;
                if (i == i2) {
                    return next;
                }
                i2 = i3;
            }
            return bVar.invoke(Integer.valueOf(i));
        }
    }

    /* renamed from: a */
    public static final <T> String m23491a(Iterable<? extends T> iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C7562b<? super T, ? extends CharSequence> bVar) {
        C7573i.m23587b(iterable, "$this$joinToString");
        C7573i.m23587b(charSequence, "separator");
        C7573i.m23587b(charSequence2, "prefix");
        C7573i.m23587b(charSequence3, "postfix");
        C7573i.m23587b(charSequence4, "truncated");
        String sb = ((StringBuilder) C7525m.m23488a(iterable, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, bVar)).toString();
        C7573i.m23582a((Object) sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: a */
    public static final <T, A extends Appendable> A m23488a(Iterable<? extends T> iterable, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C7562b<? super T, ? extends CharSequence> bVar) {
        C7573i.m23587b(iterable, "$this$joinTo");
        C7573i.m23587b(a, "buffer");
        C7573i.m23587b(charSequence, "separator");
        C7573i.m23587b(charSequence2, "prefix");
        C7573i.m23587b(charSequence3, "postfix");
        C7573i.m23587b(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (Object next : iterable) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C7634n.m23701a(a, next, bVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }

    /* renamed from: a */
    public static /* synthetic */ String m23492a(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C7562b bVar, int i2, Object obj) {
        int i3;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i2 & 2) != 0) {
            charSequence2 = "";
        }
        CharSequence charSequence5 = charSequence2;
        if ((i2 & 4) != 0) {
            charSequence3 = "";
        }
        CharSequence charSequence6 = charSequence3;
        if ((i2 & 8) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            bVar = null;
        }
        return C7525m.m23491a(iterable, charSequence, charSequence5, charSequence6, i3, charSequence7, bVar);
    }
}
