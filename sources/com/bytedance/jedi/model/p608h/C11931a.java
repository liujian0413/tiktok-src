package com.bytedance.jedi.model.p608h;

import java.util.Comparator;

/* renamed from: com.bytedance.jedi.model.h.a */
final class C11931a {

    /* renamed from: a */
    public static final Comparator<C11931a> f31809a = new Comparator<C11931a>() {
        /* renamed from: a */
        private static int m34976a(C11931a aVar, C11931a aVar2) {
            return (int) Math.abs(aVar.f31813e - aVar2.f31813e);
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m34976a((C11931a) obj, (C11931a) obj2);
        }
    };

    /* renamed from: b */
    public static final Comparator<C11931a> f31810b = new Comparator<C11931a>() {
        /* renamed from: a */
        private static int m34977a(C11931a aVar, C11931a aVar2) {
            return (int) Math.abs(aVar.f31814f - aVar2.f31814f);
        }

        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m34977a((C11931a) obj, (C11931a) obj2);
        }
    };

    /* renamed from: c */
    public static final Comparator<C11931a> f31811c = new Comparator<C11931a>() {
        public final /* synthetic */ int compare(Object obj, Object obj2) {
            return m34978a((C11931a) obj, (C11931a) obj2);
        }

        /* renamed from: a */
        private static int m34978a(C11931a aVar, C11931a aVar2) {
            return aVar.f31812d.getCanonicalName().compareTo(aVar2.f31812d.getCanonicalName());
        }
    };

    /* renamed from: d */
    public final Class<?> f31812d;

    /* renamed from: e */
    public long f31813e;

    /* renamed from: f */
    public long f31814f;

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClassHistogramElement[class=");
        sb.append(this.f31812d.getCanonicalName());
        sb.append(", instances=");
        sb.append(this.f31813e);
        sb.append(", bytes=");
        sb.append(this.f31814f);
        sb.append("]");
        return sb.toString();
    }

    public C11931a(Class<?> cls) {
        this.f31812d = cls;
    }

    /* renamed from: a */
    public final void mo29543a(long j) {
        this.f31813e++;
        this.f31814f += j;
    }
}
