package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class ban extends AbstractList<String> implements ayk, RandomAccess {
    /* access modifiers changed from: private */

    /* renamed from: a */
    public final ayk f41320a;

    public ban(ayk ayk) {
        this.f41320a = ayk;
    }

    /* renamed from: e */
    public final ayk mo40320e() {
        return this;
    }

    /* renamed from: b */
    public final Object mo40318b(int i) {
        return this.f41320a.mo40318b(i);
    }

    public final int size() {
        return this.f41320a.size();
    }

    /* renamed from: a */
    public final void mo40317a(zzcce zzcce) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<String> listIterator(int i) {
        return new bao(this, i);
    }

    public final Iterator<String> iterator() {
        return new bap(this);
    }

    /* renamed from: d */
    public final List<?> mo40319d() {
        return this.f41320a.mo40319d();
    }

    public final /* synthetic */ Object get(int i) {
        return (String) this.f41320a.get(i);
    }
}
