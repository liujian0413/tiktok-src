package kotlin.collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.C48016b;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.p357a.C7562b;
import kotlin.p356e.C7549c;
import kotlin.p356e.C7551d;
import kotlin.sequences.C7604g;
import kotlin.sequences.C7605h;
import kotlin.text.C7634n;

/* renamed from: kotlin.collections.k */
public class C7523k extends C7522j {

    /* renamed from: kotlin.collections.k$a */
    public static final class C7524a implements C7604g<T> {

        /* renamed from: a */
        final /* synthetic */ Object[] f20867a;

        /* renamed from: a */
        public final Iterator<T> mo19416a() {
            return C48016b.m148956a(this.f20867a);
        }

        public C7524a(Object[] objArr) {
            this.f20867a = objArr;
        }
    }

    /* renamed from: a */
    public static final boolean m23431a(long[] jArr, long j) {
        C7573i.m23587b(jArr, "$this$contains");
        return C7519g.m23435b(jArr, 6737595547571456005L) >= 0;
    }

    /* renamed from: a */
    public static final int[] m23432a(Integer[] numArr) {
        C7573i.m23587b(numArr, "$this$toIntArray");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    /* renamed from: a */
    public static final long[] m23433a(Long[] lArr) {
        C7573i.m23587b(lArr, "$this$toLongArray");
        int length = lArr.length;
        long[] jArr = new long[length];
        for (int i = 0; i < length; i++) {
            jArr[i] = lArr[i].longValue();
        }
        return jArr;
    }

    /* renamed from: b */
    public static final <T> T m23436b(T[] tArr) {
        C7573i.m23587b(tArr, "$this$singleOrNull");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: c */
    public static final int m23442c(int[] iArr) {
        C7573i.m23587b(iArr, "$this$lastIndex");
        return iArr.length - 1;
    }

    /* renamed from: g */
    public static final <T> List<T> m23453g(T[] tArr) {
        C7573i.m23587b(tArr, "$this$distinct");
        return C7525m.m23516h((Iterable<? extends T>) C7519g.m23454h(tArr));
    }

    /* renamed from: a */
    public static final int m23424a(int[] iArr) {
        boolean z;
        C7573i.m23587b(iArr, "$this$last");
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return iArr[C7519g.m23442c(iArr)];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: c */
    public static final <T> List<T> m23444c(T[] tArr) {
        C7573i.m23587b(tArr, "$this$filterNotNull");
        return (List) C7519g.m23428a(tArr, (C) new ArrayList());
    }

    /* renamed from: e */
    public static final List<Integer> m23448e(int[] iArr) {
        C7573i.m23587b(iArr, "$this$toMutableList");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int valueOf : iArr) {
            arrayList.add(Integer.valueOf(valueOf));
        }
        return arrayList;
    }

    /* renamed from: h */
    public static final <T> Set<T> m23454h(T[] tArr) {
        C7573i.m23587b(tArr, "$this$toMutableSet");
        LinkedHashSet linkedHashSet = new LinkedHashSet(C7507ae.m23386a(tArr.length));
        for (T add : tArr) {
            linkedHashSet.add(add);
        }
        return linkedHashSet;
    }

    /* renamed from: i */
    public static final <T> C7604g<T> m23455i(T[] tArr) {
        boolean z;
        C7573i.m23587b(tArr, "$this$asSequence");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return C7605h.m23635a();
        }
        return new C7524a<>(tArr);
    }

    /* renamed from: a */
    public static final char m23423a(char[] cArr) {
        C7573i.m23587b(cArr, "$this$single");
        switch (cArr.length) {
            case 0:
                throw new NoSuchElementException("Array is empty.");
            case 1:
                return cArr[0];
            default:
                throw new IllegalArgumentException("Array has more than one element.");
        }
    }

    /* renamed from: d */
    public static final List<Integer> m23446d(int[] iArr) {
        C7573i.m23587b(iArr, "$this$toList");
        switch (iArr.length) {
            case 0:
                return C7525m.m23461a();
            case 1:
                return C7525m.m23457a(Integer.valueOf(iArr[0]));
            default:
                return C7519g.m23448e(iArr);
        }
    }

    /* renamed from: e */
    public static final <T> List<T> m23449e(T[] tArr) {
        C7573i.m23587b(tArr, "$this$toMutableList");
        return new ArrayList<>(C7525m.m23460a((Object[]) tArr));
    }

    /* renamed from: f */
    public static final Integer m23450f(int[] iArr) {
        boolean z;
        C7573i.m23587b(iArr, "$this$max");
        int i = 1;
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        int i2 = iArr[0];
        int c = C7519g.m23442c(iArr);
        if (c > 0) {
            while (true) {
                int i3 = iArr[i];
                if (i2 < i3) {
                    i2 = i3;
                }
                if (i == c) {
                    break;
                }
                i++;
            }
        }
        return Integer.valueOf(i2);
    }

    /* renamed from: g */
    public static final Integer m23452g(int[] iArr) {
        boolean z;
        C7573i.m23587b(iArr, "$this$min");
        int i = 1;
        if (iArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        int i2 = iArr[0];
        int c = C7519g.m23442c(iArr);
        if (c > 0) {
            while (true) {
                int i3 = iArr[i];
                if (i2 > i3) {
                    i2 = i3;
                }
                if (i == c) {
                    break;
                }
                i++;
            }
        }
        return Integer.valueOf(i2);
    }

    /* renamed from: d */
    public static final <T> List<T> m23447d(T[] tArr) {
        C7573i.m23587b(tArr, "$this$toList");
        switch (tArr.length) {
            case 0:
                return C7525m.m23461a();
            case 1:
                return C7525m.m23457a(tArr[0]);
            default:
                return C7519g.m23449e(tArr);
        }
    }

    /* renamed from: f */
    public static final <T> Set<T> m23451f(T[] tArr) {
        C7573i.m23587b(tArr, "$this$toSet");
        switch (tArr.length) {
            case 0:
                return C7513am.m23408a();
            case 1:
                return C7513am.m23407a(tArr[0]);
            default:
                return (Set) C7519g.m23437b(tArr, (C) new LinkedHashSet(C7507ae.m23386a(tArr.length)));
        }
    }

    /* renamed from: b */
    public static final C7549c m23439b(int[] iArr) {
        C7573i.m23587b(iArr, "$this$indices");
        return new C7549c(0, C7519g.m23442c(iArr));
    }

    /* renamed from: a */
    public static final boolean m23430a(int[] iArr, int i) {
        C7573i.m23587b(iArr, "$this$contains");
        if (C7519g.m23434b(iArr, -1) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static final int m23434b(int[] iArr, int i) {
        C7573i.m23587b(iArr, "$this$indexOf");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static final int m23435b(long[] jArr, long j) {
        C7573i.m23587b(jArr, "$this$indexOf");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: c */
    public static final <T> int m23443c(T[] tArr, T t) {
        C7573i.m23587b(tArr, "$this$indexOf");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
        } else {
            int length2 = tArr.length;
            while (i < length2) {
                if (C7573i.m23585a((Object) t, (Object) tArr[i])) {
                    return i;
                }
                i++;
            }
        }
        return -1;
    }

    /* renamed from: b */
    public static final <T, C extends Collection<? super T>> C m23437b(T[] tArr, C c) {
        C7573i.m23587b(tArr, "$this$toCollection");
        C7573i.m23587b(c, "destination");
        for (T add : tArr) {
            c.add(add);
        }
        return c;
    }

    /* renamed from: c */
    public static final <T> List<T> m23445c(T[] tArr, Comparator<? super T> comparator) {
        C7573i.m23587b(tArr, "$this$sortedWith");
        C7573i.m23587b(comparator, "comparator");
        return C7519g.m23418a(C7519g.m23441b(tArr, comparator));
    }

    /* renamed from: b */
    public static final <T> List<T> m23438b(T[] tArr, int i) {
        boolean z;
        C7573i.m23587b(tArr, "$this$takeLast");
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
            int length = tArr.length;
            if (i >= length) {
                return C7519g.m23447d(tArr);
            }
            if (i == 1) {
                return C7525m.m23457a(tArr[length - 1]);
            }
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = length - i; i2 < length; i2++) {
                arrayList.add(tArr[i2]);
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public static final <C extends Collection<? super T>, T> C m23428a(T[] tArr, C c) {
        C7573i.m23587b(tArr, "$this$filterNotNullTo");
        C7573i.m23587b(c, "destination");
        for (T t : tArr) {
            if (t != null) {
                c.add(t);
            }
        }
        return c;
    }

    /* renamed from: b */
    public static final <T> boolean m23440b(T[] tArr, T t) {
        C7573i.m23587b(tArr, "$this$contains");
        if (C7519g.m23443c(tArr, t) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static final <T> List<T> m23429a(T[] tArr, int i) {
        C7573i.m23587b(tArr, "$this$drop");
        return C7519g.m23438b(tArr, C7551d.m23566c(tArr.length - 1, 0));
    }

    /* renamed from: b */
    public static final <T> T[] m23441b(T[] tArr, Comparator<? super T> comparator) {
        boolean z;
        C7573i.m23587b(tArr, "$this$sortedArrayWith");
        C7573i.m23587b(comparator, "comparator");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return tArr;
        }
        T[] copyOf = Arrays.copyOf(tArr, tArr.length);
        C7573i.m23582a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
        C7519g.m23419a(copyOf, comparator);
        return copyOf;
    }

    /* renamed from: a */
    public static final <T> String m23426a(T[] tArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C7562b<? super T, ? extends CharSequence> bVar) {
        C7573i.m23587b(tArr, "$this$joinToString");
        C7573i.m23587b(charSequence, "separator");
        C7573i.m23587b(charSequence2, "prefix");
        C7573i.m23587b(charSequence3, "postfix");
        C7573i.m23587b(charSequence4, "truncated");
        String sb = ((StringBuilder) C7519g.m23425a(tArr, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, bVar)).toString();
        C7573i.m23582a((Object) sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: a */
    public static final <T, A extends Appendable> A m23425a(T[] tArr, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C7562b<? super T, ? extends CharSequence> bVar) {
        C7573i.m23587b(tArr, "$this$joinTo");
        C7573i.m23587b(a, "buffer");
        C7573i.m23587b(charSequence, "separator");
        C7573i.m23587b(charSequence2, "prefix");
        C7573i.m23587b(charSequence3, "postfix");
        C7573i.m23587b(charSequence4, "truncated");
        a.append(charSequence2);
        int i2 = 0;
        for (T t : tArr) {
            i2++;
            if (i2 > 1) {
                a.append(charSequence);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C7634n.m23701a(a, t, bVar);
        }
        if (i >= 0 && i2 > i) {
            a.append(charSequence4);
        }
        a.append(charSequence3);
        return a;
    }
}
