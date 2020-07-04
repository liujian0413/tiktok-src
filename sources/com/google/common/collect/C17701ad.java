package com.google.common.collect;

import com.google.common.base.C17439m;
import com.google.common.primitives.C18140a;
import java.io.Serializable;
import java.lang.Comparable;
import java.util.NoSuchElementException;

/* renamed from: com.google.common.collect.ad */
abstract class C17701ad<C extends Comparable> implements Serializable, Comparable<C17701ad<C>> {
    private static final long serialVersionUID = 0;

    /* renamed from: a */
    final C f48929a;

    /* renamed from: com.google.common.collect.ad$a */
    static final class C17703a extends C17701ad<Comparable<?>> {

        /* renamed from: b */
        public static final C17703a f48931b = new C17703a();
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            return f48931b;
        }

        /* renamed from: a */
        public final int compareTo(C17701ad<Comparable<?>> adVar) {
            return adVar == this ? 0 : 1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo45821a(Comparable<?> comparable) {
            return false;
        }

        public final String toString() {
            return "+∞";
        }

        private C17703a() {
            super(null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final BoundType mo45822b() {
            throw new IllegalStateException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final Comparable<?> mo45827c() {
            throw new IllegalStateException("range unbounded on this side");
        }

        public final int hashCode() {
            return System.identityHashCode(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final BoundType mo45817a() {
            throw new AssertionError("this statement should be unreachable");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Comparable<?> mo45824b(C17719ai<Comparable<?>> aiVar) {
            return aiVar.mo45852d();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Comparable<?> mo45819a(C17719ai<Comparable<?>> aiVar) {
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo45825b(StringBuilder sb) {
            sb.append("+∞)");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo45820a(StringBuilder sb) {
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C17701ad<Comparable<?>> mo45823b(BoundType boundType, C17719ai<Comparable<?>> aiVar) {
            throw new IllegalStateException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17701ad<Comparable<?>> mo45818a(BoundType boundType, C17719ai<Comparable<?>> aiVar) {
            throw new AssertionError("this statement should be unreachable");
        }
    }

    /* renamed from: com.google.common.collect.ad$b */
    static final class C17704b<C extends Comparable> extends C17701ad<C> {
        private static final long serialVersionUID = 0;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final BoundType mo45817a() {
            return BoundType.OPEN;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final BoundType mo45822b() {
            return BoundType.CLOSED;
        }

        public final int hashCode() {
            return this.f48929a.hashCode() ^ -1;
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("/");
            sb.append(this.f48929a);
            sb.append("\\");
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C mo45819a(C17719ai<C> aiVar) {
            return aiVar.mo45848a(this.f48929a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C mo45824b(C17719ai<C> aiVar) {
            return this.f48929a;
        }

        public final /* synthetic */ int compareTo(Object obj) {
            return C17701ad.super.compareTo((C17701ad) obj);
        }

        C17704b(C c) {
            super((Comparable) C17439m.m57962a(c));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo45820a(StringBuilder sb) {
            sb.append('(');
            sb.append(this.f48929a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo45825b(StringBuilder sb) {
            sb.append(this.f48929a);
            sb.append(']');
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final C17701ad<C> mo45826c(C17719ai<C> aiVar) {
            Comparable a = mo45819a(aiVar);
            if (a != null) {
                return m58895b(a);
            }
            return C17701ad.m58898e();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo45821a(C c) {
            if (Range.compareOrThrow(this.f48929a, c) < 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17701ad<C> mo45818a(BoundType boundType, C17719ai<C> aiVar) {
            switch (boundType) {
                case CLOSED:
                    Comparable a = aiVar.mo45848a(this.f48929a);
                    if (a == null) {
                        return C17701ad.m58897d();
                    }
                    return m58895b(a);
                case OPEN:
                    return this;
                default:
                    throw new AssertionError();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C17701ad<C> mo45823b(BoundType boundType, C17719ai<C> aiVar) {
            switch (boundType) {
                case CLOSED:
                    return this;
                case OPEN:
                    Comparable a = aiVar.mo45848a(this.f48929a);
                    if (a == null) {
                        return C17701ad.m58898e();
                    }
                    return m58895b(a);
                default:
                    throw new AssertionError();
            }
        }
    }

    /* renamed from: com.google.common.collect.ad$c */
    static final class C17705c extends C17701ad<Comparable<?>> {

        /* renamed from: b */
        public static final C17705c f48932b = new C17705c();
        private static final long serialVersionUID = 0;

        private Object readResolve() {
            return f48932b;
        }

        /* renamed from: a */
        public final int compareTo(C17701ad<Comparable<?>> adVar) {
            return adVar == this ? 0 : -1;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo45821a(Comparable<?> comparable) {
            return true;
        }

        public final String toString() {
            return "-∞";
        }

        private C17705c() {
            super(null);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final BoundType mo45822b() {
            throw new AssertionError("this statement should be unreachable");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final Comparable<?> mo45827c() {
            throw new IllegalStateException("range unbounded on this side");
        }

        public final int hashCode() {
            return System.identityHashCode(this);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final BoundType mo45817a() {
            throw new IllegalStateException();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: c */
        public final C17701ad<Comparable<?>> mo45826c(C17719ai<Comparable<?>> aiVar) {
            try {
                return C17701ad.m58895b(aiVar.mo45851c());
            } catch (NoSuchElementException unused) {
                return this;
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final Comparable<?> mo45824b(C17719ai<Comparable<?>> aiVar) {
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final Comparable<?> mo45819a(C17719ai<Comparable<?>> aiVar) {
            return aiVar.mo45851c();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo45825b(StringBuilder sb) {
            throw new AssertionError();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo45820a(StringBuilder sb) {
            sb.append("(-∞");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C17701ad<Comparable<?>> mo45823b(BoundType boundType, C17719ai<Comparable<?>> aiVar) {
            throw new AssertionError("this statement should be unreachable");
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17701ad<Comparable<?>> mo45818a(BoundType boundType, C17719ai<Comparable<?>> aiVar) {
            throw new IllegalStateException();
        }
    }

    /* renamed from: com.google.common.collect.ad$d */
    static final class C17706d<C extends Comparable> extends C17701ad<C> {
        private static final long serialVersionUID = 0;

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final BoundType mo45817a() {
            return BoundType.CLOSED;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final BoundType mo45822b() {
            return BoundType.OPEN;
        }

        public final int hashCode() {
            return this.f48929a.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("\\");
            sb.append(this.f48929a);
            sb.append("/");
            return sb.toString();
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C mo45819a(C17719ai<C> aiVar) {
            return this.f48929a;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C mo45824b(C17719ai<C> aiVar) {
            return aiVar.mo45850b(this.f48929a);
        }

        public final /* synthetic */ int compareTo(Object obj) {
            return C17701ad.super.compareTo((C17701ad) obj);
        }

        C17706d(C c) {
            super((Comparable) C17439m.m57962a(c));
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final void mo45820a(StringBuilder sb) {
            sb.append('[');
            sb.append(this.f48929a);
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final void mo45825b(StringBuilder sb) {
            sb.append(this.f48929a);
            sb.append(')');
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final boolean mo45821a(C c) {
            if (Range.compareOrThrow(this.f48929a, c) <= 0) {
                return true;
            }
            return false;
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: a */
        public final C17701ad<C> mo45818a(BoundType boundType, C17719ai<C> aiVar) {
            switch (boundType) {
                case CLOSED:
                    return this;
                case OPEN:
                    Comparable b = aiVar.mo45850b(this.f48929a);
                    if (b == null) {
                        return C17701ad.m58897d();
                    }
                    return new C17704b(b);
                default:
                    throw new AssertionError();
            }
        }

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final C17701ad<C> mo45823b(BoundType boundType, C17719ai<C> aiVar) {
            switch (boundType) {
                case CLOSED:
                    Comparable b = aiVar.mo45850b(this.f48929a);
                    if (b == null) {
                        return C17701ad.m58898e();
                    }
                    return new C17704b(b);
                case OPEN:
                    return this;
                default:
                    throw new AssertionError();
            }
        }
    }

    /* renamed from: d */
    static <C extends Comparable> C17701ad<C> m58897d() {
        return C17705c.f48932b;
    }

    /* renamed from: e */
    static <C extends Comparable> C17701ad<C> m58898e() {
        return C17703a.f48931b;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract BoundType mo45817a();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C17701ad<C> mo45818a(BoundType boundType, C17719ai<C> aiVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract C mo45819a(C17719ai<C> aiVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract void mo45820a(StringBuilder sb);

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract boolean mo45821a(C c);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract BoundType mo45822b();

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract C17701ad<C> mo45823b(BoundType boundType, C17719ai<C> aiVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract C mo45824b(C17719ai<C> aiVar);

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public abstract void mo45825b(StringBuilder sb);

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C17701ad<C> mo45826c(C17719ai<C> aiVar) {
        return this;
    }

    public abstract int hashCode();

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public C mo45827c() {
        return this.f48929a;
    }

    C17701ad(C c) {
        this.f48929a = c;
    }

    /* renamed from: b */
    static <C extends Comparable> C17701ad<C> m58895b(C c) {
        return new C17706d(c);
    }

    /* renamed from: c */
    static <C extends Comparable> C17701ad<C> m58896c(C c) {
        return new C17704b(c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C17701ad) {
            try {
                if (compareTo((C17701ad) obj) == 0) {
                    return true;
                }
                return false;
            } catch (ClassCastException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public int compareTo(C17701ad<C> adVar) {
        if (adVar == m58897d()) {
            return 1;
        }
        if (adVar == m58898e()) {
            return -1;
        }
        int compareOrThrow = Range.compareOrThrow(this.f48929a, adVar.f48929a);
        if (compareOrThrow != 0) {
            return compareOrThrow;
        }
        return C18140a.m59955a(this instanceof C17704b, adVar instanceof C17704b);
    }
}
