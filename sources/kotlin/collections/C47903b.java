package kotlin.collections;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.p358a.C7565a;

/* renamed from: kotlin.collections.b */
public abstract class C47903b<T> implements Iterator<T>, C7565a {

    /* renamed from: a */
    private C47902aq f122758a = C47902aq.NotReady;

    /* renamed from: b */
    private T f122759b;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo120073a();

    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo120075b() {
        this.f122758a = C47902aq.Done;
    }

    /* renamed from: c */
    private final boolean m148841c() {
        this.f122758a = C47902aq.Failed;
        mo120073a();
        if (this.f122758a == C47902aq.Ready) {
            return true;
        }
        return false;
    }

    public T next() {
        if (hasNext()) {
            this.f122758a = C47902aq.NotReady;
            return this.f122759b;
        }
        throw new NoSuchElementException();
    }

    public boolean hasNext() {
        boolean z;
        if (this.f122758a != C47902aq.Failed) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            switch (C47904c.f122760a[this.f122758a.ordinal()]) {
                case 1:
                    return false;
                case 2:
                    return true;
                default:
                    return m148841c();
            }
        } else {
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo120074a(T t) {
        this.f122759b = t;
        this.f122758a = C47902aq.Ready;
    }
}
