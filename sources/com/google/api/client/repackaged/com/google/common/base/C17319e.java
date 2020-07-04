package com.google.api.client.repackaged.com.google.common.base;

import java.io.IOException;
import java.util.Iterator;

/* renamed from: com.google.api.client.repackaged.com.google.common.base.e */
public final class C17319e {

    /* renamed from: a */
    public final String f48202a;

    private C17319e(String str) {
        this.f48202a = (String) C17321g.m57682a(str);
    }

    /* renamed from: a */
    public static C17319e m57673a(char c) {
        return new C17319e(String.valueOf(c));
    }

    /* renamed from: a */
    private static CharSequence m57675a(Object obj) {
        C17321g.m57682a(obj);
        if (obj instanceof CharSequence) {
            return (CharSequence) obj;
        }
        return obj.toString();
    }

    /* renamed from: a */
    private String m57676a(Iterator<?> it) {
        return m57677a(new StringBuilder(), it).toString();
    }

    /* renamed from: a */
    public final String mo44754a(Iterable<?> iterable) {
        return m57676a(iterable.iterator());
    }

    /* renamed from: a */
    private <A extends Appendable> A m57674a(A a, Iterator<?> it) throws IOException {
        C17321g.m57682a(a);
        if (it.hasNext()) {
            a.append(m57675a(it.next()));
            while (it.hasNext()) {
                a.append(this.f48202a);
                a.append(m57675a(it.next()));
            }
        }
        return a;
    }

    /* renamed from: a */
    private StringBuilder m57677a(StringBuilder sb, Iterator<?> it) {
        try {
            m57674a((A) sb, it);
            return sb;
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }
}
