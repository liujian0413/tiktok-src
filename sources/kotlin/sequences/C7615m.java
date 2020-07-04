package kotlin.sequences;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.collections.C7513am;
import kotlin.collections.C7525m;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.p358a.C7565a;
import kotlin.jvm.p357a.C7562b;
import kotlin.text.C7634n;

/* renamed from: kotlin.sequences.m */
public class C7615m extends C7614l {

    /* renamed from: kotlin.sequences.m$a */
    public static final class C7616a implements Iterable<T>, C7565a {

        /* renamed from: a */
        final /* synthetic */ C7604g f20904a;

        public final Iterator<T> iterator() {
            return this.f20904a.mo19416a();
        }

        public C7616a(C7604g gVar) {
            this.f20904a = gVar;
        }
    }

    /* renamed from: kotlin.sequences.m$b */
    static final class C7617b extends Lambda implements C7562b<T, Boolean> {

        /* renamed from: a */
        public static final C7617b f20905a = new C7617b();

        C7617b() {
            super(1);
        }

        /* renamed from: a */
        private static boolean m23669a(T t) {
            return t == null;
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return Boolean.valueOf(m23669a(obj));
        }
    }

    /* renamed from: kotlin.sequences.m$c */
    static final class C7618c extends Lambda implements C7562b<C7604g<? extends R>, Iterator<? extends R>> {

        /* renamed from: a */
        public static final C7618c f20906a = new C7618c();

        C7618c() {
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            return m23670a((C7604g) obj);
        }

        /* renamed from: a */
        private static Iterator<R> m23670a(C7604g<? extends R> gVar) {
            C7573i.m23587b(gVar, "it");
            return gVar.mo19416a();
        }
    }

    /* renamed from: kotlin.sequences.m$d */
    public static final class C7619d implements C7604g<T> {

        /* renamed from: a */
        final /* synthetic */ C7604g f20907a;

        /* renamed from: b */
        final /* synthetic */ Comparator f20908b;

        /* renamed from: a */
        public final Iterator<T> mo19416a() {
            List i = C7605h.m23665i(this.f20907a);
            C7525m.m23474a(i, this.f20908b);
            return i.iterator();
        }

        C7619d(C7604g<? extends T> gVar, Comparator comparator) {
            this.f20907a = gVar;
            this.f20908b = comparator;
        }
    }

    /* renamed from: a */
    public static final <T> C7604g<T> m23653a(C7604g<? extends T> gVar, C7562b<? super T, Boolean> bVar) {
        C7573i.m23587b(gVar, "$this$filter");
        C7573i.m23587b(bVar, "predicate");
        return new C48024d<>(gVar, true, bVar);
    }

    /* renamed from: a */
    public static final <T> C7604g<T> m23654a(C7604g<? extends T> gVar, C7604g<? extends T> gVar2) {
        C7573i.m23587b(gVar, "$this$plus");
        C7573i.m23587b(gVar2, "elements");
        return C7605h.m23640a(C7605h.m23642a((T[]) new C7604g[]{gVar, gVar2}));
    }

    /* renamed from: f */
    public static final <T> C7604g<T> m23662f(C7604g<? extends T> gVar) {
        C7573i.m23587b(gVar, "$this$filterNotNull");
        return C7605h.m23655b(gVar, C7617b.f20905a);
    }

    /* renamed from: h */
    public static final <T> List<T> m23664h(C7604g<? extends T> gVar) {
        C7573i.m23587b(gVar, "$this$toList");
        return C7525m.m23463b(C7605h.m23665i(gVar));
    }

    /* renamed from: k */
    public static final <T> boolean m23667k(C7604g<? extends T> gVar) {
        C7573i.m23587b(gVar, "$this$any");
        return gVar.mo19416a().hasNext();
    }

    /* renamed from: l */
    public static final <T> Iterable<T> m23668l(C7604g<? extends T> gVar) {
        C7573i.m23587b(gVar, "$this$asIterable");
        return new C7616a<>(gVar);
    }

    /* renamed from: c */
    public static final <T> T m23656c(C7604g<? extends T> gVar) {
        C7573i.m23587b(gVar, "$this$first");
        Iterator a = gVar.mo19416a();
        if (a.hasNext()) {
            return a.next();
        }
        throw new NoSuchElementException("Sequence is empty.");
    }

    /* renamed from: d */
    public static final <T> T m23658d(C7604g<? extends T> gVar) {
        C7573i.m23587b(gVar, "$this$firstOrNull");
        Iterator a = gVar.mo19416a();
        if (!a.hasNext()) {
            return null;
        }
        return a.next();
    }

    /* renamed from: e */
    public static final <T> T m23660e(C7604g<? extends T> gVar) {
        T next;
        C7573i.m23587b(gVar, "$this$lastOrNull");
        Iterator a = gVar.mo19416a();
        if (!a.hasNext()) {
            return null;
        }
        do {
            next = a.next();
        } while (a.hasNext());
        return next;
    }

    /* renamed from: g */
    public static final <T> HashSet<T> m23663g(C7604g<? extends T> gVar) {
        C7573i.m23587b(gVar, "$this$toHashSet");
        return (HashSet) C7605h.m23649a(gVar, (C) new HashSet());
    }

    /* renamed from: i */
    public static final <T> List<T> m23665i(C7604g<? extends T> gVar) {
        C7573i.m23587b(gVar, "$this$toMutableList");
        return (List) C7605h.m23649a(gVar, (C) new ArrayList());
    }

    /* renamed from: j */
    public static final <T> Set<T> m23666j(C7604g<? extends T> gVar) {
        C7573i.m23587b(gVar, "$this$toSet");
        return C7513am.m23409a((Set) C7605h.m23649a(gVar, (C) new LinkedHashSet()));
    }

    /* renamed from: b */
    public static final <T> C7604g<T> m23655b(C7604g<? extends T> gVar, C7562b<? super T, Boolean> bVar) {
        C7573i.m23587b(gVar, "$this$filterNot");
        C7573i.m23587b(bVar, "predicate");
        return new C48024d<>(gVar, false, bVar);
    }

    /* renamed from: c */
    public static final <T, R> C7604g<R> m23657c(C7604g<? extends T> gVar, C7562b<? super T, ? extends C7604g<? extends R>> bVar) {
        C7573i.m23587b(gVar, "$this$flatMap");
        C7573i.m23587b(bVar, "transform");
        return new C48026e<>(gVar, bVar, C7618c.f20906a);
    }

    /* renamed from: d */
    public static final <T, R> C7604g<R> m23659d(C7604g<? extends T> gVar, C7562b<? super T, ? extends R> bVar) {
        C7573i.m23587b(gVar, "$this$map");
        C7573i.m23587b(bVar, "transform");
        return new C48032o<>(gVar, bVar);
    }

    /* renamed from: e */
    public static final <T, R> C7604g<R> m23661e(C7604g<? extends T> gVar, C7562b<? super T, ? extends R> bVar) {
        C7573i.m23587b(gVar, "$this$mapNotNull");
        C7573i.m23587b(bVar, "transform");
        return C7605h.m23662f(new C48032o(gVar, bVar));
    }

    /* renamed from: a */
    public static final <T, C extends Collection<? super T>> C m23649a(C7604g<? extends T> gVar, C c) {
        C7573i.m23587b(gVar, "$this$toCollection");
        C7573i.m23587b(c, "destination");
        Iterator a = gVar.mo19416a();
        while (a.hasNext()) {
            c.add(a.next());
        }
        return c;
    }

    /* renamed from: a */
    public static final <T> C7604g<T> m23650a(C7604g<? extends T> gVar, int i) {
        C7573i.m23587b(gVar, "$this$take");
        if (gVar instanceof C48022b) {
            return ((C48022b) gVar).mo120213a(5);
        }
        return new C48030n<>(gVar, 5);
    }

    /* renamed from: a */
    public static final <T> C7604g<T> m23651a(C7604g<? extends T> gVar, T t) {
        C7573i.m23587b(gVar, "$this$plus");
        return C7605h.m23640a(C7605h.m23642a((T[]) new C7604g[]{gVar, C7605h.m23642a((T[]) new Object[]{t})}));
    }

    /* renamed from: a */
    public static final <T> C7604g<T> m23652a(C7604g<? extends T> gVar, Comparator<? super T> comparator) {
        C7573i.m23587b(gVar, "$this$sortedWith");
        C7573i.m23587b(comparator, "comparator");
        return new C7619d<>(gVar, comparator);
    }

    /* renamed from: a */
    public static final <T> String m23647a(C7604g<? extends T> gVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C7562b<? super T, ? extends CharSequence> bVar) {
        C7573i.m23587b(gVar, "$this$joinToString");
        C7573i.m23587b(charSequence, "separator");
        C7573i.m23587b(charSequence2, "prefix");
        C7573i.m23587b(charSequence3, "postfix");
        C7573i.m23587b(charSequence4, "truncated");
        String sb = ((StringBuilder) C7605h.m23646a(gVar, new StringBuilder(), charSequence, charSequence2, charSequence3, i, charSequence4, bVar)).toString();
        C7573i.m23582a((Object) sb, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb;
    }

    /* renamed from: a */
    public static final <T, A extends Appendable> A m23646a(C7604g<? extends T> gVar, A a, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, C7562b<? super T, ? extends CharSequence> bVar) {
        C7573i.m23587b(gVar, "$this$joinTo");
        C7573i.m23587b(a, "buffer");
        C7573i.m23587b(charSequence, "separator");
        C7573i.m23587b(charSequence2, "prefix");
        C7573i.m23587b(charSequence3, "postfix");
        C7573i.m23587b(charSequence4, "truncated");
        a.append(charSequence2);
        Iterator a2 = gVar.mo19416a();
        int i2 = 0;
        while (a2.hasNext()) {
            Object next = a2.next();
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
}
