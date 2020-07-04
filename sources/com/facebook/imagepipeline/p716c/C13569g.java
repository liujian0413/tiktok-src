package com.facebook.imagepipeline.p716c;

import com.facebook.common.internal.C13308h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

/* renamed from: com.facebook.imagepipeline.c.g */
public final class C13569g<K, V> {

    /* renamed from: a */
    private final C13592v<V> f35963a;

    /* renamed from: b */
    private final LinkedHashMap<K, V> f35964b = new LinkedHashMap<>();

    /* renamed from: c */
    private int f35965c = 0;

    /* renamed from: b */
    public final synchronized int mo33121b() {
        return this.f35965c;
    }

    /* renamed from: a */
    public final synchronized int mo33117a() {
        return this.f35964b.size();
    }

    /* renamed from: c */
    public final synchronized K mo33124c() {
        if (this.f35964b.isEmpty()) {
            return null;
        }
        return this.f35964b.keySet().iterator().next();
    }

    /* renamed from: d */
    public final synchronized ArrayList<V> mo33126d() {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>(this.f35964b.values());
        this.f35964b.clear();
        this.f35965c = 0;
        return arrayList;
    }

    public C13569g(C13592v<V> vVar) {
        this.f35963a = vVar;
    }

    /* renamed from: d */
    private int m39916d(V v) {
        if (v == null) {
            return 0;
        }
        return this.f35963a.mo29877a(v);
    }

    /* renamed from: b */
    public final synchronized V mo33122b(K k) {
        return this.f35964b.get(k);
    }

    /* renamed from: a */
    public final synchronized boolean mo33120a(K k) {
        return this.f35964b.containsKey(k);
    }

    /* renamed from: c */
    public final synchronized V mo33125c(K k) {
        V remove;
        remove = this.f35964b.remove(k);
        this.f35965c -= m39916d(remove);
        return remove;
    }

    /* renamed from: a */
    public final synchronized ArrayList<Entry<K, V>> mo33119a(C13308h<K> hVar) {
        ArrayList<Entry<K, V>> arrayList;
        arrayList = new ArrayList<>(this.f35964b.entrySet().size());
        for (Entry entry : this.f35964b.entrySet()) {
            if (hVar == null || hVar.mo32572a(entry.getKey())) {
                arrayList.add(entry);
            }
        }
        return arrayList;
    }

    /* renamed from: b */
    public final synchronized ArrayList<V> mo33123b(C13308h<K> hVar) {
        ArrayList<V> arrayList;
        arrayList = new ArrayList<>();
        Iterator it = this.f35964b.entrySet().iterator();
        while (it.hasNext()) {
            Entry entry = (Entry) it.next();
            if (hVar == null || hVar.mo32572a(entry.getKey())) {
                arrayList.add(entry.getValue());
                this.f35965c -= m39916d(entry.getValue());
                it.remove();
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public final synchronized V mo33118a(K k, V v) {
        V remove;
        remove = this.f35964b.remove(k);
        this.f35965c -= m39916d(remove);
        this.f35964b.put(k, v);
        this.f35965c += m39916d(v);
        return remove;
    }
}
