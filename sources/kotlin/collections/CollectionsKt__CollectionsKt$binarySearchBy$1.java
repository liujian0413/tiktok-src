package kotlin.collections;

import kotlin.jvm.internal.Lambda;
import kotlin.jvm.p357a.C7562b;
import kotlin.p1877a.C47886a;

public final class CollectionsKt__CollectionsKt$binarySearchBy$1 extends Lambda implements C7562b<T, Integer> {
    final /* synthetic */ Comparable $key;
    final /* synthetic */ C7562b $selector;

    public CollectionsKt__CollectionsKt$binarySearchBy$1(C7562b bVar, Comparable comparable) {
        this.$selector = bVar;
        this.$key = comparable;
        super(1);
    }

    public final int invoke(T t) {
        return C47886a.m148819a((Comparable) this.$selector.invoke(t), this.$key);
    }
}
