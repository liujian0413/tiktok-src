package com.ttnet.org.chromium.base1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public final class CollectionUtil {
    private CollectionUtil() {
    }

    @SafeVarargs
    public static <E> ArrayList<E> newArrayList(E... eArr) {
        ArrayList<E> arrayList = new ArrayList<>(eArr.length);
        Collections.addAll(arrayList, eArr);
        return arrayList;
    }

    @SafeVarargs
    public static <E> HashSet<E> newHashSet(E... eArr) {
        HashSet<E> hashSet = new HashSet<>(eArr.length);
        Collections.addAll(hashSet, eArr);
        return hashSet;
    }

    public static <E> ArrayList<E> newArrayList(Iterable<E> iterable) {
        ArrayList<E> arrayList = new ArrayList<>();
        for (E add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }
}
