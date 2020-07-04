package com.squareup.wire.internal;

import com.squareup.wire.ProtoAdapter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public final class Internal {
    private Internal() {
    }

    public static int countNonNull(Object obj, Object obj2) {
        int i = 0;
        int i2 = obj != null ? 1 : 0;
        if (obj2 != null) {
            i = 1;
        }
        return i2 + i;
    }

    public static int countNonNull(Object obj, Object obj2, Object obj3) {
        int i = 0;
        int i2 = (obj != null ? 1 : 0) + (obj2 != null ? 1 : 0);
        if (obj3 != null) {
            i = 1;
        }
        return i2 + i;
    }

    public static <K, V> Map<K, V> newMutableMap() {
        return new LinkedHashMap();
    }

    public static <T> List<T> newMutableList() {
        return new MutableOnWriteList(Collections.emptyList());
    }

    public static void checkElementsNotNull(List<?> list) {
        if (list != null) {
            int i = 0;
            int size = list.size();
            while (i < size) {
                if (list.get(i) != null) {
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder("Element at index ");
                    sb.append(i);
                    sb.append(" is null");
                    throw new NullPointerException(sb.toString());
                }
            }
            return;
        }
        throw new NullPointerException("list == null");
    }

    public static void checkElementsNotNull(Map<?, ?> map) {
        if (map != null) {
            for (Entry entry : map.entrySet()) {
                if (entry.getKey() == null) {
                    throw new NullPointerException("map.containsKey(null)");
                } else if (entry.getValue() == null) {
                    StringBuilder sb = new StringBuilder("Value for key ");
                    sb.append(entry.getKey());
                    sb.append(" is null");
                    throw new NullPointerException(sb.toString());
                }
            }
            return;
        }
        throw new NullPointerException("map == null");
    }

    public static IllegalStateException missingRequiredFields(Object... objArr) {
        StringBuilder sb = new StringBuilder();
        String str = "";
        int length = objArr.length;
        for (int i = 0; i < length; i += 2) {
            if (objArr[i] == null) {
                if (sb.length() > 0) {
                    str = "s";
                }
                sb.append("\n  ");
                sb.append(objArr[i + 1]);
            }
        }
        StringBuilder sb2 = new StringBuilder("Required field");
        sb2.append(str);
        sb2.append(" not set:");
        sb2.append(sb);
        throw new IllegalStateException(sb2.toString());
    }

    public static boolean equals(Object obj, Object obj2) {
        if (obj == obj2 || (obj != null && obj.equals(obj2))) {
            return true;
        }
        return false;
    }

    public static <K, V> Map<K, V> copyOf(String str, Map<K, V> map) {
        if (map != null) {
            return new LinkedHashMap(map);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" == null");
        throw new NullPointerException(sb.toString());
    }

    public static <T> void redactElements(List<T> list, ProtoAdapter<T> protoAdapter) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            list.set(i, protoAdapter.redact(list.get(i)));
        }
    }

    public static <T> List<T> copyOf(String str, List<T> list) {
        if (list == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" == null");
            throw new NullPointerException(sb.toString());
        } else if (list == Collections.emptyList() || (list instanceof ImmutableList)) {
            return new MutableOnWriteList(list);
        } else {
            return new ArrayList(list);
        }
    }

    public static <T> void redactElements(Map<?, T> map, ProtoAdapter<T> protoAdapter) {
        for (Entry entry : map.entrySet()) {
            entry.setValue(protoAdapter.redact(entry.getValue()));
        }
    }

    public static <T> List<T> immutableCopyOf(String str, List<T> list) {
        if (list != null) {
            if (list instanceof MutableOnWriteList) {
                list = ((MutableOnWriteList) list).mutableList;
            }
            if (list == Collections.emptyList() || (list instanceof ImmutableList)) {
                return list;
            }
            ImmutableList immutableList = new ImmutableList(list);
            if (!immutableList.contains(null)) {
                return immutableList;
            }
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(".contains(null)");
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(" == null");
        throw new NullPointerException(sb2.toString());
    }

    public static <K, V> Map<K, V> immutableCopyOf(String str, Map<K, V> map) {
        if (map == null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" == null");
            throw new NullPointerException(sb.toString());
        } else if (map.isEmpty()) {
            return Collections.emptyMap();
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap(map);
            if (linkedHashMap.containsKey(null)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(".containsKey(null)");
                throw new IllegalArgumentException(sb2.toString());
            } else if (!linkedHashMap.containsValue(null)) {
                return Collections.unmodifiableMap(linkedHashMap);
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(".containsValue(null)");
                throw new IllegalArgumentException(sb3.toString());
            }
        }
    }

    public static int countNonNull(Object obj, Object obj2, Object obj3, Object obj4, Object... objArr) {
        int i;
        if (obj != null) {
            i = 1;
        } else {
            i = 0;
        }
        if (obj2 != null) {
            i++;
        }
        if (obj3 != null) {
            i++;
        }
        if (obj4 != null) {
            i++;
        }
        for (Object obj5 : objArr) {
            if (obj5 != null) {
                i++;
            }
        }
        return i;
    }
}
