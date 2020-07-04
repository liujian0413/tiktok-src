package kotlin.reflect;

import kotlin.jvm.p357a.C7562b;
import kotlin.reflect.C7595j.C7596a;

/* renamed from: kotlin.reflect.l */
public interface C7599l<T, R> extends C7562b<T, R>, C7595j<R> {

    /* renamed from: kotlin.reflect.l$a */
    public interface C7600a<T, R> extends C7562b<T, R>, C7596a<R> {
    }

    R get(T t);

    Object getDelegate(T t);

    C7600a<T, R> getGetter();
}
