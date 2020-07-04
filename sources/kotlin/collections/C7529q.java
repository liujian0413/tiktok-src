package kotlin.collections;

import java.util.Enumeration;
import java.util.Iterator;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.p358a.C7565a;

/* renamed from: kotlin.collections.q */
public class C7529q extends C7528p {

    /* renamed from: kotlin.collections.q$a */
    public static final class C7530a implements Iterator<T>, C7565a {

        /* renamed from: a */
        final /* synthetic */ Enumeration f20868a;

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasNext() {
            return this.f20868a.hasMoreElements();
        }

        public final T next() {
            return this.f20868a.nextElement();
        }

        C7530a(Enumeration<T> enumeration) {
            this.f20868a = enumeration;
        }
    }

    /* renamed from: a */
    public static final <T> Iterator<T> m23473a(Enumeration<T> enumeration) {
        C7573i.m23587b(enumeration, "$this$iterator");
        return new C7530a<>(enumeration);
    }
}
