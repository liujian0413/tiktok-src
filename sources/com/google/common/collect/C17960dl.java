package com.google.common.collect;

import com.google.common.collect.C17986do.C17987a;
import com.google.common.collect.ImmutableMap.C17591a;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.google.common.collect.dl */
final class C17960dl<R, C, V> extends C17921cv<R, C, V> {

    /* renamed from: a */
    static final ImmutableTable<Object, Object, Object> f49250a = new C17960dl(ImmutableList.m58536of(), ImmutableSet.m58649of(), ImmutableSet.m58649of());

    /* renamed from: b */
    private final ImmutableMap<R, ImmutableMap<C, V>> f49251b;

    /* renamed from: c */
    private final ImmutableMap<C, ImmutableMap<R, V>> f49252c;

    /* renamed from: d */
    private final int[] f49253d;

    /* renamed from: e */
    private final int[] f49254e;

    public final int size() {
        return this.f49253d.length;
    }

    public final ImmutableMap<C, Map<R, V>> columnMap() {
        return ImmutableMap.copyOf((Map<? extends K, ? extends V>) this.f49252c);
    }

    public final ImmutableMap<R, Map<C, V>> rowMap() {
        return ImmutableMap.copyOf((Map<? extends K, ? extends V>) this.f49251b);
    }

    /* access modifiers changed from: 0000 */
    public final C17639b createSerializedForm() {
        ImmutableMap a = C17839bx.m59328a((Collection<E>) columnKeySet());
        int[] iArr = new int[cellSet().size()];
        C17995dt it = cellSet().iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            iArr[i] = ((Integer) a.get(((C17987a) it.next()).mo45208b())).intValue();
            i = i2;
        }
        return C17639b.m58757a(this, this.f49253d, iArr);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C17987a<R, C, V> mo45835a(int i) {
        Entry entry = (Entry) this.f49251b.entrySet().asList().get(this.f49253d[i]);
        ImmutableMap immutableMap = (ImmutableMap) entry.getValue();
        Entry entry2 = (Entry) immutableMap.entrySet().asList().get(this.f49254e[i]);
        return cellOf(entry.getKey(), entry2.getKey(), entry2.getValue());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final V mo45836b(int i) {
        ImmutableMap immutableMap = (ImmutableMap) this.f49251b.values().asList().get(this.f49253d[i]);
        return immutableMap.values().asList().get(this.f49254e[i]);
    }

    C17960dl(ImmutableList<C17987a<R, C, V>> immutableList, ImmutableSet<R> immutableSet, ImmutableSet<C> immutableSet2) {
        ImmutableMap a = C17839bx.m59328a((Collection<E>) immutableSet);
        LinkedHashMap d = C17839bx.m59352d();
        C17995dt it = immutableSet.iterator();
        while (it.hasNext()) {
            d.put(it.next(), new LinkedHashMap());
        }
        LinkedHashMap d2 = C17839bx.m59352d();
        C17995dt it2 = immutableSet2.iterator();
        while (it2.hasNext()) {
            d2.put(it2.next(), new LinkedHashMap());
        }
        int[] iArr = new int[immutableList.size()];
        int[] iArr2 = new int[immutableList.size()];
        int i = 0;
        while (i < immutableList.size()) {
            C17987a aVar = (C17987a) immutableList.get(i);
            Object a2 = aVar.mo45207a();
            Object b = aVar.mo45208b();
            Object c = aVar.mo45209c();
            iArr[i] = ((Integer) a.get(a2)).intValue();
            Map map = (Map) d.get(a2);
            iArr2[i] = map.size();
            Object put = map.put(b, c);
            if (put == null) {
                ((Map) d2.get(b)).put(a2, c);
                i++;
            } else {
                StringBuilder sb = new StringBuilder("Duplicate value for row=");
                sb.append(a2);
                sb.append(", column=");
                sb.append(b);
                sb.append(": ");
                sb.append(c);
                sb.append(", ");
                sb.append(put);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.f49253d = iArr;
        this.f49254e = iArr2;
        C17591a aVar2 = new C17591a(d.size());
        for (Entry entry : d.entrySet()) {
            aVar2.mo45375a(entry.getKey(), ImmutableMap.copyOf((Map) entry.getValue()));
        }
        this.f49251b = aVar2.mo45379b();
        C17591a aVar3 = new C17591a(d2.size());
        for (Entry entry2 : d2.entrySet()) {
            aVar3.mo45375a(entry2.getKey(), ImmutableMap.copyOf((Map) entry2.getValue()));
        }
        this.f49252c = aVar3.mo45379b();
    }
}
