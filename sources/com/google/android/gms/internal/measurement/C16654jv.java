package com.google.android.gms.internal.measurement;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: com.google.android.gms.internal.measurement.jv */
public final class C16654jv extends AbstractList<String> implements C16598ht, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final C16598ht f46530a;

    public C16654jv(C16598ht htVar) {
        this.f46530a = htVar;
    }

    /* renamed from: e */
    public final C16598ht mo42966e() {
        return this;
    }

    /* renamed from: b */
    public final Object mo42964b(int i) {
        return this.f46530a.mo42964b(i);
    }

    public final int size() {
        return this.f46530a.size();
    }

    /* renamed from: a */
    public final void mo42963a(zzte zzte) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<String> listIterator(int i) {
        return new C16655jw(this, i);
    }

    public final Iterator<String> iterator() {
        return new C16656jx(this);
    }

    /* renamed from: d */
    public final List<?> mo42965d() {
        return this.f46530a.mo42965d();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f46530a.get(i);
    }
}
