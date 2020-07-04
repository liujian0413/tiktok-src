package com.bytedance.p255e;

import java.util.ArrayList;

/* renamed from: com.bytedance.e.f */
final class C6347f extends UnsatisfiedLinkError {

    /* renamed from: a */
    private static final ArrayList<C6347f> f18615a = new ArrayList<>();

    /* renamed from: a */
    static UnsatisfiedLinkError[] m19681a() {
        UnsatisfiedLinkError[] unsatisfiedLinkErrorArr;
        synchronized (f18615a) {
            unsatisfiedLinkErrorArr = (UnsatisfiedLinkError[]) f18615a.toArray(new UnsatisfiedLinkError[0]);
        }
        return unsatisfiedLinkErrorArr;
    }

    C6347f(String str) {
        super(str);
        synchronized (f18615a) {
            f18615a.add(this);
        }
    }

    C6347f(String str, Throwable th) {
        super(str);
        initCause(th);
        synchronized (f18615a) {
            f18615a.add(this);
        }
    }
}
