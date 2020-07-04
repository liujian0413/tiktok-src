package com.bytedance.frameworks.baselib.network.dispatcher;

import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.frameworks.baselib.network.dispatcher.b */
public abstract class C10095b implements IRequest, Comparable<IRequest>, Runnable {

    /* renamed from: c */
    protected final AtomicBoolean f27461c = new AtomicBoolean(false);

    /* renamed from: d */
    protected final AtomicBoolean f27462d = new AtomicBoolean(false);

    /* renamed from: e */
    public int f27463e = 0;

    /* renamed from: f */
    protected int f27464f;

    /* renamed from: c */
    public final boolean mo24749c() {
        return this.f27462d.get();
    }

    /* renamed from: a */
    public C10095b mo24746a(int i) {
        this.f27464f = i;
        return this;
    }
}
