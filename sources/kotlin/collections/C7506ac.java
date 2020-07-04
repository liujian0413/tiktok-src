package kotlin.collections;

import java.util.Iterator;
import kotlin.jvm.internal.p358a.C7565a;

/* renamed from: kotlin.collections.ac */
public abstract class C7506ac implements Iterator<Integer>, C7565a {
    /* renamed from: a */
    public abstract int mo19392a();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* access modifiers changed from: private */
    /* renamed from: b */
    public Integer next() {
        return Integer.valueOf(mo19392a());
    }
}
