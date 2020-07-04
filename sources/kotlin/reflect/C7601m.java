package kotlin.reflect;

import kotlin.jvm.p357a.C7563m;
import kotlin.reflect.C7595j.C7596a;

/* renamed from: kotlin.reflect.m */
public interface C7601m<D, E, R> extends C7563m<D, E, R>, C7595j<R> {

    /* renamed from: kotlin.reflect.m$a */
    public interface C7602a<D, E, R> extends C7563m<D, E, R>, C7596a<R> {
    }

    R get(D d, E e);

    Object getDelegate(D d, E e);

    C7602a<D, E, R> getGetter();
}
