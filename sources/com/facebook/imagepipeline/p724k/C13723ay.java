package com.facebook.imagepipeline.p724k;

import com.facebook.common.internal.C13307g;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.k.ay */
public final class C13723ay {

    /* renamed from: a */
    private boolean f36436a;

    /* renamed from: b */
    private final Deque<Runnable> f36437b = new ArrayDeque();

    /* renamed from: c */
    private final Executor f36438c;

    /* renamed from: c */
    public final synchronized boolean mo33349c() {
        return this.f36436a;
    }

    /* renamed from: a */
    public final synchronized void mo33345a() {
        this.f36436a = true;
    }

    /* renamed from: b */
    public final synchronized void mo33347b() {
        this.f36436a = false;
        m40478d();
    }

    /* renamed from: d */
    private void m40478d() {
        while (!this.f36437b.isEmpty()) {
            this.f36438c.execute((Runnable) this.f36437b.pop());
        }
        this.f36437b.clear();
    }

    public C13723ay(Executor executor) {
        this.f36438c = (Executor) C13307g.m38940a(executor);
    }

    /* renamed from: a */
    public final synchronized void mo33346a(Runnable runnable) {
        if (this.f36436a) {
            this.f36437b.add(runnable);
        } else {
            this.f36438c.execute(runnable);
        }
    }

    /* renamed from: b */
    public final synchronized void mo33348b(Runnable runnable) {
        this.f36437b.remove(runnable);
    }
}
