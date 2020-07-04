package com.google.common.base;

import java.io.IOException;
import java.util.Arrays;
import java.util.Iterator;

/* renamed from: com.google.common.base.h */
public class C17428h {

    /* renamed from: a */
    public final String f48388a;

    private C17428h(C17428h hVar) {
        this.f48388a = hVar.f48388a;
    }

    /* renamed from: a */
    public static C17428h m57933a(char c) {
        return new C17428h("&");
    }

    private C17428h(String str) {
        this.f48388a = (String) C17439m.m57962a(str);
    }

    /* renamed from: a */
    public static C17428h m57934a(String str) {
        return new C17428h(str);
    }

    /* renamed from: b */
    public C17428h mo44918b(final String str) {
        C17439m.m57962a(str);
        return new C17428h(this) {
            /* renamed from: b */
            public final C17428h mo44918b(String str) {
                throw new UnsupportedOperationException("already specified useForNull");
            }

            /* access modifiers changed from: 0000 */
            /* renamed from: a */
            public final CharSequence mo44915a(Object obj) {
                if (obj == null) {
                    return str;
                }
                return C17428h.this.mo44915a(obj);
            }
        };
    }

    /* renamed from: a */
    private String m57936a(Iterator<?> it) {
        return m57937a(new StringBuilder(), it).toString();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public CharSequence mo44915a(Object obj) {
        C17439m.m57962a(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    /* renamed from: a */
    public final String mo44916a(Iterable<?> iterable) {
        return m57936a(iterable.iterator());
    }

    /* renamed from: a */
    public final String mo44917a(Object[] objArr) {
        return mo44916a((Iterable<?>) Arrays.asList(objArr));
    }

    /* renamed from: a */
    private <A extends Appendable> A m57935a(A a, Iterator<?> it) throws IOException {
        C17439m.m57962a(a);
        if (it.hasNext()) {
            a.append(mo44915a(it.next()));
            while (it.hasNext()) {
                a.append(this.f48388a);
                a.append(mo44915a(it.next()));
            }
        }
        return a;
    }

    /* renamed from: a */
    private StringBuilder m57937a(StringBuilder sb, Iterator<?> it) {
        try {
            m57935a((A) sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
