package com.google.common.graph;

import com.google.common.base.C17430i;
import com.google.common.base.C17430i.C17432a;
import com.google.common.base.C17434j;
import java.util.Comparator;

public final class ElementOrder<T> {

    /* renamed from: a */
    public final Type f49398a;

    /* renamed from: b */
    private final Comparator<T> f49399b;

    public enum Type {
        UNORDERED,
        INSERTION,
        SORTED
    }

    public final int hashCode() {
        return C17434j.m57954a(this.f49398a, this.f49399b);
    }

    public final String toString() {
        C17432a a = C17430i.m57944a(this).mo44923a("type", (Object) this.f49398a);
        if (this.f49399b != null) {
            a.mo44923a("comparator", (Object) this.f49399b);
        }
        return a.toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ElementOrder)) {
            return false;
        }
        ElementOrder elementOrder = (ElementOrder) obj;
        if (this.f49398a != elementOrder.f49398a || !C17434j.m57955a(this.f49399b, elementOrder.f49399b)) {
            return false;
        }
        return true;
    }
}
