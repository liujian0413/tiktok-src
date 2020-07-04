package com.ttnet.org.chromium.base;

import android.util.Pair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

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

    public static boolean[] booleanListToBooleanArray(List<Boolean> list) {
        boolean[] zArr = new boolean[list.size()];
        for (int i = 0; i < list.size(); i++) {
            zArr[i] = ((Boolean) list.get(i)).booleanValue();
        }
        return zArr;
    }

    public static int[] integerListToIntArray(List<Integer> list) {
        int[] iArr = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            iArr[i] = ((Integer) list.get(i)).intValue();
        }
        return iArr;
    }

    public static long[] longListToLongArray(List<Long> list) {
        long[] jArr = new long[list.size()];
        for (int i = 0; i < list.size(); i++) {
            jArr[i] = ((Long) list.get(i)).longValue();
        }
        return jArr;
    }

    public static <E> ArrayList<E> newArrayList(Iterable<E> iterable) {
        ArrayList<E> arrayList = new ArrayList<>();
        for (E add : iterable) {
            arrayList.add(add);
        }
        return arrayList;
    }

    @SafeVarargs
    public static <K, V> HashMap<K, V> newHashMap(Pair<? extends K, ? extends V>... pairArr) {
        HashMap<K, V> hashMap = new HashMap<>();
        for (Pair<? extends K, ? extends V> pair : pairArr) {
            hashMap.put(pair.first, pair.second);
        }
        return hashMap;
    }

    public static <T> void forEach(Collection<? extends T> collection, Callback<T> callback) {
        for (Object onResult : collection) {
            callback.onResult(onResult);
        }
    }

    public static <K, V> void forEach(Map<? extends K, ? extends V> map, Callback<Entry<K, V>> callback) {
        for (Entry onResult : map.entrySet()) {
            callback.onResult(onResult);
        }
    }
}
