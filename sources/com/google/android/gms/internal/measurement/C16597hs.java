package com.google.android.gms.internal.measurement;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.hs */
public final class C16597hs extends C16538ft<String> implements C16598ht, RandomAccess {

    /* renamed from: a */
    private static final C16597hs f46435a;

    /* renamed from: b */
    private static final C16598ht f46436b = f46435a;

    /* renamed from: c */
    private final List<Object> f46437c;

    public C16597hs() {
        this(10);
    }

    public C16597hs(int i) {
        this(new ArrayList<>(i));
    }

    private C16597hs(ArrayList<Object> arrayList) {
        this.f46437c = arrayList;
    }

    public final int size() {
        return this.f46437c.size();
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo42738c();
        if (collection instanceof C16598ht) {
            collection = ((C16598ht) collection).mo42965d();
        }
        boolean addAll = this.f46437c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        mo42738c();
        this.f46437c.clear();
        this.modCount++;
    }

    /* renamed from: a */
    public final void mo42963a(zzte zzte) {
        mo42738c();
        this.f46437c.add(zzte);
        this.modCount++;
    }

    /* renamed from: b */
    public final Object mo42964b(int i) {
        return this.f46437c.get(i);
    }

    /* renamed from: a */
    private static String m54203a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzte) {
            return ((zzte) obj).zzud();
        }
        return C16586hh.m54190b((byte[]) obj);
    }

    /* renamed from: d */
    public final List<?> mo42965d() {
        return Collections.unmodifiableList(this.f46437c);
    }

    /* renamed from: e */
    public final C16598ht mo42966e() {
        return mo42732a() ? new C16654jv(this) : this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        mo42738c();
        return m54203a(this.f46437c.set(i, str));
    }

    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    public final /* synthetic */ Object remove(int i) {
        mo42738c();
        Object remove = this.f46437c.remove(i);
        this.modCount++;
        return m54203a(remove);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo42732a() {
        return super.mo42732a();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        mo42738c();
        this.f46437c.add(i, str);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: a */
    public final /* synthetic */ C16590hl mo42747a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f46437c);
            return new C16597hs(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f46437c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzte) {
            zzte zzte = (zzte) obj;
            String zzud = zzte.zzud();
            if (zzte.zzue()) {
                this.f46437c.set(i, zzud);
            }
            return zzud;
        }
        byte[] bArr = (byte[]) obj;
        String b = C16586hh.m54190b(bArr);
        if (C16586hh.m54189a(bArr)) {
            this.f46437c.set(i, b);
        }
        return b;
    }

    static {
        C16597hs hsVar = new C16597hs();
        f46435a = hsVar;
        hsVar.mo42737b();
    }
}
