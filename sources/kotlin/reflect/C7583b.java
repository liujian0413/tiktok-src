package kotlin.reflect;

import java.util.List;
import java.util.Map;

/* renamed from: kotlin.reflect.b */
public interface C7583b<R> extends C7582a {
    R call(Object... objArr);

    R callBy(Map<KParameter, ? extends Object> map);

    List<KParameter> getParameters();

    C7603n getReturnType();

    List<Object> getTypeParameters();

    KVisibility getVisibility();

    boolean isAbstract();

    boolean isFinal();

    boolean isOpen();

    boolean isSuspend();
}
