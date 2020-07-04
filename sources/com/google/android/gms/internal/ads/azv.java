package com.google.android.gms.internal.ads;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

class azv<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    public boolean f41286a;

    /* renamed from: b */
    private final int f41287b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<bac> f41288c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map<K, V> f41289d;

    /* renamed from: e */
    private volatile baf f41290e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Map<K, V> f41291f;

    /* renamed from: g */
    private volatile azy f41292g;

    /* renamed from: a */
    static <FieldDescriptorType extends axo<FieldDescriptorType>> azv<FieldDescriptorType, Object> m48035a(int i) {
        return new azw(i);
    }

    private azv(int i) {
        this.f41287b = i;
        this.f41288c = Collections.emptyList();
        this.f41289d = Collections.emptyMap();
        this.f41291f = Collections.emptyMap();
    }

    /* renamed from: a */
    public void mo40361a() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f41286a) {
            if (this.f41289d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f41289d);
            }
            this.f41289d = map;
            if (this.f41291f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f41291f);
            }
            this.f41291f = map2;
            this.f41286a = true;
        }
    }

    /* renamed from: b */
    public final int mo40362b() {
        return this.f41288c.size();
    }

    /* renamed from: b */
    public final Entry<K, V> mo40363b(int i) {
        return (Entry) this.f41288c.get(i);
    }

    /* renamed from: c */
    public final Iterable<Entry<K, V>> mo40364c() {
        if (this.f41289d.isEmpty()) {
            return azz.m48052a();
        }
        return this.f41289d.entrySet();
    }

    public int size() {
        return this.f41288c.size() + this.f41289d.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m48034a((K) comparable) >= 0 || this.f41289d.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m48034a((K) comparable);
        if (a >= 0) {
            return ((bac) this.f41288c.get(a)).getValue();
        }
        return this.f41289d.get(comparable);
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        m48042e();
        int a = m48034a(k);
        if (a >= 0) {
            return ((bac) this.f41288c.get(a)).setValue(v);
        }
        m48042e();
        if (this.f41288c.isEmpty() && !(this.f41288c instanceof ArrayList)) {
            this.f41288c = new ArrayList(this.f41287b);
        }
        int i = -(a + 1);
        if (i >= this.f41287b) {
            return m48043f().put(k, v);
        }
        if (this.f41288c.size() == this.f41287b) {
            bac bac = (bac) this.f41288c.remove(this.f41287b - 1);
            m48043f().put((Comparable) bac.getKey(), bac.getValue());
        }
        this.f41288c.add(i, new bac(this, k, v));
        return null;
    }

    public void clear() {
        m48042e();
        if (!this.f41288c.isEmpty()) {
            this.f41288c.clear();
        }
        if (!this.f41289d.isEmpty()) {
            this.f41289d.clear();
        }
    }

    public V remove(Object obj) {
        m48042e();
        Comparable comparable = (Comparable) obj;
        int a = m48034a((K) comparable);
        if (a >= 0) {
            return m48039c(a);
        }
        if (this.f41289d.isEmpty()) {
            return null;
        }
        return this.f41289d.remove(comparable);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final V m48039c(int i) {
        m48042e();
        V value = ((bac) this.f41288c.remove(i)).getValue();
        if (!this.f41289d.isEmpty()) {
            Iterator it = m48043f().entrySet().iterator();
            this.f41288c.add(new bac(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: a */
    private final int m48034a(K k) {
        int size = this.f41288c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) ((bac) this.f41288c.get(size)).getKey());
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo((Comparable) ((bac) this.f41288c.get(i2)).getKey());
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    public Set<Entry<K, V>> entrySet() {
        if (this.f41290e == null) {
            this.f41290e = new baf(this, null);
        }
        return this.f41290e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Set<Entry<K, V>> mo40367d() {
        if (this.f41292g == null) {
            this.f41292g = new azy(this, null);
        }
        return this.f41292g;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m48042e() {
        if (this.f41286a) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: f */
    private final SortedMap<K, V> m48043f() {
        m48042e();
        if (this.f41289d.isEmpty() && !(this.f41289d instanceof TreeMap)) {
            this.f41289d = new TreeMap();
            this.f41291f = ((TreeMap) this.f41289d).descendingMap();
        }
        return (SortedMap) this.f41289d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof azv)) {
            return super.equals(obj);
        }
        azv azv = (azv) obj;
        int size = size();
        if (size != azv.size()) {
            return false;
        }
        int b = mo40362b();
        if (b != azv.mo40362b()) {
            return entrySet().equals(azv.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo40363b(i).equals(azv.mo40363b(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f41289d.equals(azv.f41289d);
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < mo40362b(); i2++) {
            i += ((bac) this.f41288c.get(i2)).hashCode();
        }
        return this.f41289d.size() > 0 ? i + this.f41289d.hashCode() : i;
    }

    /* synthetic */ azv(int i, azw azw) {
        this(i);
    }
}
