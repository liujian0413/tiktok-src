package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.C7573i;
import kotlin.jvm.internal.p358a.C7565a;
import kotlin.jvm.p357a.C7561a;

/* renamed from: kotlin.collections.aa */
public final class C7505aa<T> implements Iterable<C47913z<? extends T>>, C7565a {

    /* renamed from: a */
    private final C7561a<Iterator<T>> f20863a;

    public final Iterator<C47913z<T>> iterator() {
        return new C47898ab<>((Iterator) this.f20863a.invoke());
    }

    public C7505aa(C7561a<? extends Iterator<? extends T>> aVar) {
        C7573i.m23587b(aVar, "iteratorFactory");
        this.f20863a = aVar;
    }
}
