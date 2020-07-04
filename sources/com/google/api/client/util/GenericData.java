package com.google.api.client.util;

import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class GenericData extends AbstractMap<String, Object> implements Cloneable {

    /* renamed from: l */
    public Map<String, Object> f48236l;

    /* renamed from: m */
    public final C17362g f48237m;

    public enum Flags {
        IGNORE_CASE
    }

    /* renamed from: com.google.api.client.util.GenericData$a */
    final class C17334a implements Iterator<Entry<String, Object>> {

        /* renamed from: b */
        private boolean f48239b;

        /* renamed from: c */
        private final Iterator<Entry<String, Object>> f48240c;

        /* renamed from: d */
        private final Iterator<Entry<String, Object>> f48241d;

        public final void remove() {
            if (this.f48239b) {
                this.f48241d.remove();
            }
            this.f48240c.remove();
        }

        public final boolean hasNext() {
            if (this.f48240c.hasNext() || this.f48241d.hasNext()) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: private */
        /* renamed from: a */
        public Entry<String, Object> next() {
            if (!this.f48239b) {
                if (this.f48240c.hasNext()) {
                    return (Entry) this.f48240c.next();
                }
                this.f48239b = true;
            }
            return (Entry) this.f48241d.next();
        }

        C17334a(C17370c cVar) {
            this.f48240c = cVar.iterator();
            this.f48241d = GenericData.this.f48236l.entrySet().iterator();
        }
    }

    /* renamed from: com.google.api.client.util.GenericData$b */
    final class C17335b extends AbstractSet<Entry<String, Object>> {

        /* renamed from: b */
        private final C17370c f48243b;

        public final void clear() {
            GenericData.this.f48236l.clear();
            this.f48243b.clear();
        }

        public final Iterator<Entry<String, Object>> iterator() {
            return new C17334a(this.f48243b);
        }

        public final int size() {
            return GenericData.this.f48236l.size() + this.f48243b.size();
        }

        C17335b() {
            this.f48243b = new C17367j(GenericData.this, GenericData.this.f48237m.f48280b).entrySet();
        }
    }

    public Set<Entry<String, Object>> entrySet() {
        return new C17335b();
    }

    public GenericData() {
        this(EnumSet.noneOf(Flags.class));
    }

    /* renamed from: b */
    public GenericData clone() {
        try {
            GenericData genericData = (GenericData) super.clone();
            C17366i.m57810a((Object) this, (Object) genericData);
            genericData.f48236l = (Map) C17366i.m57816c(this.f48236l);
            return genericData;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public GenericData(EnumSet<Flags> enumSet) {
        this.f48236l = C17336a.m57738a();
        this.f48237m = C17362g.m57799a(getClass(), enumSet.contains(Flags.IGNORE_CASE));
    }

    public final Object get(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        C17371k a = this.f48237m.mo44831a(str);
        if (a != null) {
            return a.mo44855a((Object) this);
        }
        if (this.f48237m.f48280b) {
            str = str.toLowerCase();
        }
        return this.f48236l.get(str);
    }

    public final void putAll(Map<? extends String, ?> map) {
        for (Entry entry : map.entrySet()) {
            mo44448c((String) entry.getKey(), entry.getValue());
        }
    }

    public final Object remove(Object obj) {
        if (!(obj instanceof String)) {
            return null;
        }
        String str = (String) obj;
        if (this.f48237m.mo44831a(str) == null) {
            if (this.f48237m.f48280b) {
                str = str.toLowerCase();
            }
            return this.f48236l.remove(str);
        }
        throw new UnsupportedOperationException();
    }

    /* renamed from: c */
    public GenericData mo44448c(String str, Object obj) {
        C17371k a = this.f48237m.mo44831a(str);
        if (a != null) {
            a.mo44857a((Object) this, obj);
        } else {
            if (this.f48237m.f48280b) {
                str = str.toLowerCase();
            }
            this.f48236l.put(str, obj);
        }
        return this;
    }

    /* renamed from: d */
    public final Object put(String str, Object obj) {
        C17371k a = this.f48237m.mo44831a(str);
        if (a != null) {
            Object a2 = a.mo44855a((Object) this);
            a.mo44857a((Object) this, obj);
            return a2;
        }
        if (this.f48237m.f48280b) {
            str = str.toLowerCase();
        }
        return this.f48236l.put(str, obj);
    }
}
