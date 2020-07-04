package com.google.android.gms.internal.measurement;

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

/* renamed from: com.google.android.gms.internal.measurement.jd */
class C16636jd<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: a */
    public boolean f46498a;

    /* renamed from: b */
    private final int f46499b;
    /* access modifiers changed from: private */

    /* renamed from: c */
    public List<C16643jk> f46500c;
    /* access modifiers changed from: private */

    /* renamed from: d */
    public Map<K, V> f46501d;

    /* renamed from: e */
    private volatile C16645jm f46502e;
    /* access modifiers changed from: private */

    /* renamed from: f */
    public Map<K, V> f46503f;

    /* renamed from: g */
    private volatile C16639jg f46504g;

    /* renamed from: a */
    static <FieldDescriptorType extends C16572gz<FieldDescriptorType>> C16636jd<FieldDescriptorType, Object> m54458a(int i) {
        return new C16637je(i);
    }

    private C16636jd(int i) {
        this.f46499b = i;
        this.f46500c = Collections.emptyList();
        this.f46501d = Collections.emptyMap();
        this.f46503f = Collections.emptyMap();
    }

    /* renamed from: a */
    public void mo43007a() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f46498a) {
            if (this.f46501d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f46501d);
            }
            this.f46501d = map;
            if (this.f46503f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f46503f);
            }
            this.f46503f = map2;
            this.f46498a = true;
        }
    }

    /* renamed from: b */
    public final int mo43008b() {
        return this.f46500c.size();
    }

    /* renamed from: b */
    public final Entry<K, V> mo43009b(int i) {
        return (Entry) this.f46500c.get(i);
    }

    /* renamed from: c */
    public final Iterable<Entry<K, V>> mo43010c() {
        if (this.f46501d.isEmpty()) {
            return C16640jh.m54475a();
        }
        return this.f46501d.entrySet();
    }

    public int size() {
        return this.f46500c.size() + this.f46501d.size();
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return m54457a((K) comparable) >= 0 || this.f46501d.containsKey(comparable);
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = m54457a((K) comparable);
        if (a >= 0) {
            return ((C16643jk) this.f46500c.get(a)).getValue();
        }
        return this.f46501d.get(comparable);
    }

    /* renamed from: a */
    public final V put(K k, V v) {
        m54465e();
        int a = m54457a(k);
        if (a >= 0) {
            return ((C16643jk) this.f46500c.get(a)).setValue(v);
        }
        m54465e();
        if (this.f46500c.isEmpty() && !(this.f46500c instanceof ArrayList)) {
            this.f46500c = new ArrayList(this.f46499b);
        }
        int i = -(a + 1);
        if (i >= this.f46499b) {
            return m54466f().put(k, v);
        }
        if (this.f46500c.size() == this.f46499b) {
            C16643jk jkVar = (C16643jk) this.f46500c.remove(this.f46499b - 1);
            m54466f().put((Comparable) jkVar.getKey(), jkVar.getValue());
        }
        this.f46500c.add(i, new C16643jk(this, k, v));
        return null;
    }

    public void clear() {
        m54465e();
        if (!this.f46500c.isEmpty()) {
            this.f46500c.clear();
        }
        if (!this.f46501d.isEmpty()) {
            this.f46501d.clear();
        }
    }

    public V remove(Object obj) {
        m54465e();
        Comparable comparable = (Comparable) obj;
        int a = m54457a((K) comparable);
        if (a >= 0) {
            return m54462c(a);
        }
        if (this.f46501d.isEmpty()) {
            return null;
        }
        return this.f46501d.remove(comparable);
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public final V m54462c(int i) {
        m54465e();
        V value = ((C16643jk) this.f46500c.remove(i)).getValue();
        if (!this.f46501d.isEmpty()) {
            Iterator it = m54466f().entrySet().iterator();
            this.f46500c.add(new C16643jk(this, (Entry) it.next()));
            it.remove();
        }
        return value;
    }

    /* renamed from: a */
    private final int m54457a(K k) {
        int size = this.f46500c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo((Comparable) ((C16643jk) this.f46500c.get(size)).getKey());
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
            int compareTo2 = k.compareTo((Comparable) ((C16643jk) this.f46500c.get(i2)).getKey());
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
        if (this.f46502e == null) {
            this.f46502e = new C16645jm(this, null);
        }
        return this.f46502e;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final Set<Entry<K, V>> mo43013d() {
        if (this.f46504g == null) {
            this.f46504g = new C16639jg(this, null);
        }
        return this.f46504g;
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public final void m54465e() {
        if (this.f46498a) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: f */
    private final SortedMap<K, V> m54466f() {
        m54465e();
        if (this.f46501d.isEmpty() && !(this.f46501d instanceof TreeMap)) {
            this.f46501d = new TreeMap();
            this.f46503f = ((TreeMap) this.f46501d).descendingMap();
        }
        return (SortedMap) this.f46501d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C16636jd)) {
            return super.equals(obj);
        }
        C16636jd jdVar = (C16636jd) obj;
        int size = size();
        if (size != jdVar.size()) {
            return false;
        }
        int b = mo43008b();
        if (b != jdVar.mo43008b()) {
            return entrySet().equals(jdVar.entrySet());
        }
        for (int i = 0; i < b; i++) {
            if (!mo43009b(i).equals(jdVar.mo43009b(i))) {
                return false;
            }
        }
        if (b != size) {
            return this.f46501d.equals(jdVar.f46501d);
        }
        return true;
    }

    public int hashCode() {
        int i = 0;
        for (int i2 = 0; i2 < mo43008b(); i2++) {
            i += ((C16643jk) this.f46500c.get(i2)).hashCode();
        }
        return this.f46501d.size() > 0 ? i + this.f46501d.hashCode() : i;
    }

    /* synthetic */ C16636jd(int i, C16637je jeVar) {
        this(i);
    }
}
