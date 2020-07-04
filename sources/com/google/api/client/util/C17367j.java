package com.google.api.client.util;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.NoSuchElementException;

/* renamed from: com.google.api.client.util.j */
final class C17367j extends AbstractMap<String, Object> {

    /* renamed from: a */
    final Object f48298a;

    /* renamed from: b */
    final C17362g f48299b;

    /* renamed from: com.google.api.client.util.j$a */
    final class C17368a implements Entry<String, Object> {

        /* renamed from: b */
        private Object f48301b;

        /* renamed from: c */
        private final C17371k f48302c;

        public final Object getValue() {
            return this.f48301b;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public String getKey() {
            String str = this.f48302c.f48314c;
            if (C17367j.this.f48299b.f48280b) {
                return str.toLowerCase();
            }
            return str;
        }

        public final int hashCode() {
            return getKey().hashCode() ^ getValue().hashCode();
        }

        public final Object setValue(Object obj) {
            Object obj2 = this.f48301b;
            this.f48301b = C17384w.m57847a(obj);
            this.f48302c.mo44857a(C17367j.this.f48298a, obj);
            return obj2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            if (!getKey().equals(entry.getKey()) || !getValue().equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        C17368a(C17371k kVar, Object obj) {
            this.f48302c = kVar;
            this.f48301b = C17384w.m57847a(obj);
        }
    }

    /* renamed from: com.google.api.client.util.j$b */
    final class C17369b implements Iterator<Entry<String, Object>> {

        /* renamed from: b */
        private int f48304b = -1;

        /* renamed from: c */
        private C17371k f48305c;

        /* renamed from: d */
        private Object f48306d;

        /* renamed from: e */
        private boolean f48307e;

        /* renamed from: f */
        private boolean f48308f;

        /* renamed from: g */
        private C17371k f48309g;

        public final void remove() {
            boolean z;
            if (this.f48309g == null || this.f48307e) {
                z = false;
            } else {
                z = true;
            }
            C17384w.m57853b(z);
            this.f48307e = true;
            this.f48309g.mo44857a(C17367j.this.f48298a, (Object) null);
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Entry<String, Object> next() {
            if (hasNext()) {
                this.f48309g = this.f48305c;
                Object obj = this.f48306d;
                this.f48308f = false;
                this.f48307e = false;
                this.f48305c = null;
                this.f48306d = null;
                return new C17368a(this.f48309g, obj);
            }
            throw new NoSuchElementException();
        }

        public final boolean hasNext() {
            if (!this.f48308f) {
                this.f48308f = true;
                this.f48306d = null;
                while (this.f48306d == null) {
                    int i = this.f48304b + 1;
                    this.f48304b = i;
                    if (i >= C17367j.this.f48299b.f48281c.size()) {
                        break;
                    }
                    this.f48305c = C17367j.this.f48299b.mo44831a((String) C17367j.this.f48299b.f48281c.get(this.f48304b));
                    this.f48306d = this.f48305c.mo44855a(C17367j.this.f48298a);
                }
            }
            if (this.f48306d != null) {
                return true;
            }
            return false;
        }

        C17369b() {
        }
    }

    /* renamed from: com.google.api.client.util.j$c */
    final class C17370c extends AbstractSet<Entry<String, Object>> {
        /* renamed from: a */
        public final C17369b iterator() {
            return new C17369b();
        }

        public final void clear() {
            for (String a : C17367j.this.f48299b.f48281c) {
                C17367j.this.f48299b.mo44831a(a).mo44857a(C17367j.this.f48298a, (Object) null);
            }
        }

        public final boolean isEmpty() {
            for (String a : C17367j.this.f48299b.f48281c) {
                if (C17367j.this.f48299b.mo44831a(a).mo44855a(C17367j.this.f48298a) != null) {
                    return false;
                }
            }
            return true;
        }

        public final int size() {
            int i = 0;
            for (String a : C17367j.this.f48299b.f48281c) {
                if (C17367j.this.f48299b.mo44831a(a).mo44855a(C17367j.this.f48298a) != null) {
                    i++;
                }
            }
            return i;
        }

        C17370c() {
        }
    }

    /* renamed from: a */
    public final C17370c entrySet() {
        return new C17370c();
    }

    public final boolean containsKey(Object obj) {
        if (get(obj) != null) {
            return true;
        }
        return false;
    }

    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        C17371k a = this.f48299b.mo44831a((String) obj);
        if (a == null) {
            return null;
        }
        return a.mo44855a(this.f48298a);
    }

    C17367j(Object obj, boolean z) {
        this.f48298a = obj;
        this.f48299b = C17362g.m57799a(obj.getClass(), z);
        C17384w.m57850a(!this.f48299b.mo44832a());
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public Object put(String str, Object obj) {
        String str2;
        C17371k a = this.f48299b.mo44831a(str);
        String str3 = "no field of key ";
        String valueOf = String.valueOf(str);
        if (valueOf.length() != 0) {
            str2 = str3.concat(valueOf);
        } else {
            str2 = new String(str3);
        }
        C17384w.m57848a(a, (Object) str2);
        Object a2 = a.mo44855a(this.f48298a);
        a.mo44857a(this.f48298a, C17384w.m57847a(obj));
        return a2;
    }
}
