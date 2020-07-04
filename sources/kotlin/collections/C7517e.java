package kotlin.collections;

import java.util.AbstractList;
import java.util.List;
import kotlin.jvm.internal.p358a.C7568d;

/* renamed from: kotlin.collections.e */
public abstract class C7517e<E> extends AbstractList<E> implements List<E>, C7568d {
    protected C7517e() {
    }

    /* renamed from: a */
    public abstract int mo19395a();

    /* renamed from: a */
    public abstract E mo19396a(int i);

    public final int size() {
        return mo19395a();
    }

    public final E remove(int i) {
        return mo19396a(i);
    }
}
