package com.google.common.util.concurrent;

import com.google.common.base.C17427g;
import com.google.common.base.C17439m;
import com.google.common.collect.C17839bx;
import java.io.Serializable;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicLong;

public final class AtomicLongMap<K> implements Serializable {
    private transient Map<K, Long> asMap;
    private final ConcurrentHashMap<K, AtomicLong> map;

    public final void clear() {
        this.map.clear();
    }

    public final boolean isEmpty() {
        return this.map.isEmpty();
    }

    public final int size() {
        return this.map.size();
    }

    public final String toString() {
        return this.map.toString();
    }

    public static <K> AtomicLongMap<K> create() {
        return new AtomicLongMap<>(new ConcurrentHashMap());
    }

    private Map<K, Long> createAsMap() {
        return Collections.unmodifiableMap(C17839bx.m59338a((Map<K, V1>) this.map, (C17427g<? super V1, V2>) new C17427g<AtomicLong, Long>() {
            /* renamed from: b */
            public final /* synthetic */ Object mo44914b(Object obj) {
                return m60140a((AtomicLong) obj);
            }

            /* renamed from: a */
            private static Long m60140a(AtomicLong atomicLong) {
                return Long.valueOf(atomicLong.get());
            }
        }));
    }

    public final Map<K, Long> asMap() {
        Map<K, Long> map2 = this.asMap;
        if (map2 != null) {
            return map2;
        }
        Map<K, Long> createAsMap = createAsMap();
        this.asMap = createAsMap;
        return createAsMap;
    }

    public final long sum() {
        long j = 0;
        for (AtomicLong atomicLong : this.map.values()) {
            j += atomicLong.get();
        }
        return j;
    }

    public final void removeAllZeros() {
        Iterator it = this.map.entrySet().iterator();
        while (it.hasNext()) {
            AtomicLong atomicLong = (AtomicLong) ((Entry) it.next()).getValue();
            if (atomicLong != null && atomicLong.get() == 0) {
                it.remove();
            }
        }
    }

    public static <K> AtomicLongMap<K> create(Map<? extends K, ? extends Long> map2) {
        AtomicLongMap<K> create = create();
        create.putAll(map2);
        return create;
    }

    public final boolean containsKey(Object obj) {
        return this.map.containsKey(obj);
    }

    public final long decrementAndGet(K k) {
        return addAndGet(k, -1);
    }

    public final long getAndDecrement(K k) {
        return getAndAdd(k, -1);
    }

    public final long getAndIncrement(K k) {
        return getAndAdd(k, 1);
    }

    public final long incrementAndGet(K k) {
        return addAndGet(k, 1);
    }

    public final boolean removeIfZero(K k) {
        return remove(k, 0);
    }

    private AtomicLongMap(ConcurrentHashMap<K, AtomicLong> concurrentHashMap) {
        this.map = (ConcurrentHashMap) C17439m.m57962a(concurrentHashMap);
    }

    public final long get(K k) {
        AtomicLong atomicLong = (AtomicLong) this.map.get(k);
        if (atomicLong == null) {
            return 0;
        }
        return atomicLong.get();
    }

    public final void putAll(Map<? extends K, ? extends Long> map2) {
        for (Entry entry : map2.entrySet()) {
            put(entry.getKey(), ((Long) entry.getValue()).longValue());
        }
    }

    public final long remove(K k) {
        long j;
        AtomicLong atomicLong = (AtomicLong) this.map.get(k);
        if (atomicLong == null) {
            return 0;
        }
        do {
            j = atomicLong.get();
            if (j == 0) {
                break;
            }
        } while (!atomicLong.compareAndSet(j, 0));
        this.map.remove(k, atomicLong);
        return j;
    }

    public final long addAndGet(K k, long j) {
        AtomicLong atomicLong;
        do {
            atomicLong = (AtomicLong) this.map.get(k);
            if (atomicLong == null) {
                atomicLong = (AtomicLong) this.map.putIfAbsent(k, new AtomicLong(j));
                if (atomicLong == null) {
                    return j;
                }
            }
            while (true) {
                long j2 = atomicLong.get();
                if (j2 != 0) {
                    long j3 = j2 + j;
                    if (atomicLong.compareAndSet(j2, j3)) {
                        return j3;
                    }
                }
            }
        } while (!this.map.replace(k, atomicLong, new AtomicLong(j)));
        return j;
    }

    public final long getAndAdd(K k, long j) {
        AtomicLong atomicLong;
        do {
            atomicLong = (AtomicLong) this.map.get(k);
            if (atomicLong == null) {
                atomicLong = (AtomicLong) this.map.putIfAbsent(k, new AtomicLong(j));
                if (atomicLong == null) {
                    return 0;
                }
            }
            while (true) {
                long j2 = atomicLong.get();
                if (j2 != 0) {
                    if (atomicLong.compareAndSet(j2, j2 + j)) {
                        return j2;
                    }
                }
            }
        } while (!this.map.replace(k, atomicLong, new AtomicLong(j)));
        return 0;
    }

    public final long put(K k, long j) {
        AtomicLong atomicLong;
        do {
            atomicLong = (AtomicLong) this.map.get(k);
            if (atomicLong == null) {
                atomicLong = (AtomicLong) this.map.putIfAbsent(k, new AtomicLong(j));
                if (atomicLong == null) {
                    return 0;
                }
            }
            while (true) {
                long j2 = atomicLong.get();
                if (j2 != 0) {
                    if (atomicLong.compareAndSet(j2, j)) {
                        return j2;
                    }
                }
            }
        } while (!this.map.replace(k, atomicLong, new AtomicLong(j)));
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final long putIfAbsent(K k, long j) {
        AtomicLong atomicLong;
        do {
            atomicLong = (AtomicLong) this.map.get(k);
            if (atomicLong == null) {
                atomicLong = (AtomicLong) this.map.putIfAbsent(k, new AtomicLong(j));
                if (atomicLong == null) {
                    return 0;
                }
            }
            long j2 = atomicLong.get();
            if (j2 != 0) {
                return j2;
            }
        } while (!this.map.replace(k, atomicLong, new AtomicLong(j)));
        return 0;
    }

    /* access modifiers changed from: 0000 */
    public final boolean remove(K k, long j) {
        AtomicLong atomicLong = (AtomicLong) this.map.get(k);
        if (atomicLong == null) {
            return false;
        }
        long j2 = atomicLong.get();
        if (j2 != j) {
            return false;
        }
        if (j2 != 0 && !atomicLong.compareAndSet(j2, 0)) {
            return false;
        }
        this.map.remove(k, atomicLong);
        return true;
    }

    /* access modifiers changed from: 0000 */
    public final boolean replace(K k, long j, long j2) {
        if (j != 0) {
            AtomicLong atomicLong = (AtomicLong) this.map.get(k);
            if (atomicLong == null) {
                return false;
            }
            return atomicLong.compareAndSet(j, j2);
        } else if (putIfAbsent(k, j2) == 0) {
            return true;
        } else {
            return false;
        }
    }
}
