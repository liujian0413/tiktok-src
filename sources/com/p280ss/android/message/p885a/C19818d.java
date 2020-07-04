package com.p280ss.android.message.p885a;

import java.util.LinkedList;

/* renamed from: com.ss.android.message.a.d */
public final class C19818d<E> {

    /* renamed from: a */
    public int f53774a = 5;

    /* renamed from: b */
    private LinkedList<E> f53775b = new LinkedList<>();

    /* renamed from: a */
    public final int mo53164a() {
        return this.f53775b.size();
    }

    public C19818d(int i) {
    }

    /* renamed from: a */
    public final E mo53165a(int i) {
        return this.f53775b.get(i);
    }

    /* renamed from: a */
    public final void mo53166a(E e) {
        if (this.f53775b.size() >= this.f53774a) {
            this.f53775b.poll();
        }
        this.f53775b.offer(e);
    }
}
