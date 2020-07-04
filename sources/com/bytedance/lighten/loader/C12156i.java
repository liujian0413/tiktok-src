package com.bytedance.lighten.loader;

import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.bytedance.lighten.loader.i */
final class C12156i<E> extends LinkedBlockingDeque<E> {

    /* renamed from: a */
    private int f32393a;

    public C12156i(int i) {
        this.f32393a = i;
    }

    public final boolean offer(E e) {
        synchronized (this) {
            if (size() == this.f32393a) {
                removeLast();
            }
        }
        return super.offerFirst(e);
    }
}
