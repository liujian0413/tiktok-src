package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

public final class ayj extends awf<String> implements ayk, RandomAccess {

    /* renamed from: a */
    private static final ayj f41228a;

    /* renamed from: b */
    private static final ayk f41229b = f41228a;

    /* renamed from: c */
    private final List<Object> f41230c;

    public ayj() {
        this(10);
    }

    public ayj(int i) {
        this(new ArrayList<>(i));
    }

    private ayj(ArrayList<Object> arrayList) {
        this.f41230c = arrayList;
    }

    public final int size() {
        return this.f41230c.size();
    }

    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    public final boolean addAll(int i, Collection<? extends String> collection) {
        mo40096c();
        if (collection instanceof ayk) {
            collection = ((ayk) collection).mo40319d();
        }
        boolean addAll = this.f41230c.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    public final void clear() {
        mo40096c();
        this.f41230c.clear();
        this.modCount++;
    }

    /* renamed from: a */
    public final void mo40317a(zzcce zzcce) {
        mo40096c();
        this.f41230c.add(zzcce);
        this.modCount++;
    }

    /* renamed from: b */
    public final Object mo40318b(int i) {
        return this.f41230c.get(i);
    }

    /* renamed from: a */
    private static String m47764a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzcce) {
            return ((zzcce) obj).zzare();
        }
        return axw.m47747b((byte[]) obj);
    }

    /* renamed from: d */
    public final List<?> mo40319d() {
        return Collections.unmodifiableList(this.f41230c);
    }

    /* renamed from: e */
    public final ayk mo40320e() {
        return mo40090a() ? new ban(this) : this;
    }

    public final /* synthetic */ Object set(int i, Object obj) {
        String str = (String) obj;
        mo40096c();
        return m47764a(this.f41230c.set(i, str));
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
        mo40096c();
        Object remove = this.f41230c.remove(i);
        this.modCount++;
        return m47764a(remove);
    }

    /* renamed from: a */
    public final /* bridge */ /* synthetic */ boolean mo40090a() {
        return super.mo40090a();
    }

    public final /* synthetic */ void add(int i, Object obj) {
        String str = (String) obj;
        mo40096c();
        this.f41230c.add(i, str);
        this.modCount++;
    }

    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    /* renamed from: a */
    public final /* synthetic */ ayc mo40105a(int i) {
        if (i >= size()) {
            ArrayList arrayList = new ArrayList(i);
            arrayList.addAll(this.f41230c);
            return new ayj(arrayList);
        }
        throw new IllegalArgumentException();
    }

    public final /* synthetic */ Object get(int i) {
        Object obj = this.f41230c.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof zzcce) {
            zzcce zzcce = (zzcce) obj;
            String zzare = zzcce.zzare();
            if (zzcce.zzarf()) {
                this.f41230c.set(i, zzare);
            }
            return zzare;
        }
        byte[] bArr = (byte[]) obj;
        String b = axw.m47747b(bArr);
        if (axw.m47746a(bArr)) {
            this.f41230c.set(i, b);
        }
        return b;
    }

    static {
        ayj ayj = new ayj();
        f41228a = ayj;
        ayj.mo40095b();
    }
}
