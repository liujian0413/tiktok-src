package com.google.common.collect;

import com.google.common.base.C17427g;
import com.google.common.base.C17434j;
import com.google.common.collect.C17986do.C17987a;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.common.collect.dp */
public final class C17988dp {

    /* renamed from: a */
    private static final C17427g<? extends Map<?, ?>, ? extends Map<?, ?>> f49289a = new C17427g<Map<Object, Object>, Map<Object, Object>>() {
        /* renamed from: a */
        private static Map<Object, Object> m59631a(Map<Object, Object> map) {
            return Collections.unmodifiableMap(map);
        }

        /* renamed from: b */
        public final /* synthetic */ Object mo44914b(Object obj) {
            return m59631a((Map) obj);
        }
    };

    /* renamed from: com.google.common.collect.dp$a */
    static abstract class C17990a<R, C, V> implements C17987a<R, C, V> {
        C17990a() {
        }

        public int hashCode() {
            return C17434j.m57954a(mo45207a(), mo45208b(), mo45209c());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("(");
            sb.append(mo45207a());
            sb.append(",");
            sb.append(mo45208b());
            sb.append(")=");
            sb.append(mo45209c());
            return sb.toString();
        }

        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C17987a)) {
                return false;
            }
            C17987a aVar = (C17987a) obj;
            if (!C17434j.m57955a(mo45207a(), aVar.mo45207a()) || !C17434j.m57955a(mo45208b(), aVar.mo45208b()) || !C17434j.m57955a(mo45209c(), aVar.mo45209c())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: com.google.common.collect.dp$b */
    static final class C17991b<R, C, V> extends C17990a<R, C, V> implements Serializable {
        private static final long serialVersionUID = 0;

        /* renamed from: a */
        private final R f49290a;

        /* renamed from: b */
        private final C f49291b;

        /* renamed from: c */
        private final V f49292c;

        /* renamed from: a */
        public final R mo45207a() {
            return this.f49290a;
        }

        /* renamed from: b */
        public final C mo45208b() {
            return this.f49291b;
        }

        /* renamed from: c */
        public final V mo45209c() {
            return this.f49292c;
        }

        C17991b(R r, C c, V v) {
            this.f49290a = r;
            this.f49291b = c;
            this.f49292c = v;
        }
    }

    /* renamed from: a */
    static boolean m59630a(C17986do<?, ?, ?> doVar, Object obj) {
        if (obj == doVar) {
            return true;
        }
        if (!(obj instanceof C17986do)) {
            return false;
        }
        return doVar.cellSet().equals(((C17986do) obj).cellSet());
    }

    /* renamed from: a */
    public static <R, C, V> C17987a<R, C, V> m59629a(R r, C c, V v) {
        return new C17991b(r, c, v);
    }
}
