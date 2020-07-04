package kotlin.collections;

import java.util.Collections;
import java.util.Set;
import kotlin.jvm.internal.C7573i;

/* renamed from: kotlin.collections.an */
public class C7514an {
    /* renamed from: a */
    public static final <T> Set<T> m23407a(T t) {
        Set<T> singleton = Collections.singleton(t);
        C7573i.m23582a((Object) singleton, "java.util.Collections.singleton(element)");
        return singleton;
    }
}
